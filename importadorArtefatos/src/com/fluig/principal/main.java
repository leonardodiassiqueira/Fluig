package com.fluig.principal;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.totvs.technology.ecm.dataservice.ws.*;
import com.totvs.technology.ecm.dm.ws.*;
import com.totvs.technology.ecm.dm.ws.Exception_Exception;
import com.totvs.technology.ecm.workflow.ws.ECMWorkflowEngineServiceService;
import com.totvs.technology.ecm.workflow.ws.ProcessDefinitionDto;
import com.totvs.technology.ecm.workflow.ws.ProcessDefinitionDtoArray;
import com.totvs.technology.ecm.workflow.ws.WorkflowEngineService;

import net.java.dev.jaxb.array.*;

public class main {

	static ECMDatasetServiceService datasetServiceService;
	static DatasetService datasetService;
	
	static ECMCardIndexServiceService cardIndexServiceService; 
	static CardIndexService cardIndexService;
	
	static ECMWorkflowEngineServiceService workflowEngineServiceService;
	static WorkflowEngineService workflowEngineService;
	
	static String user = "USER";
	static String password = "PASSWORD";
	static int company = 1;
	static String adminUserCod = "ADMIN_USER";
	static String ambientURL = "URL_AMBIENTE"; //ex.: https://meufluig.com
	
	static String localGravacao;
	static String fluigProjectFolder;
		
	public static void main(String[] args) {
		
		localGravacao = "C:\\";
		fluigProjectFolder = "FluigProject";
		
		initializeService(ambientURL);
		
		createFolder(localGravacao, fluigProjectFolder);
		
		importDatasets();
		importFormFiles();
		
		importProcess();
	}

private static void createFolder(String local, String folderName) {
		// TODO Auto-generated method stub
	File file = new File(local + folderName);
    if (!file.exists()) {
        if (file.mkdir()) {
            System.out.println("Directory is created!");
        } else {
            System.out.println("Failed to create directory!");
        }
    }
}

private static void createFile(String name, String code, String local){
	File file = new File(local + name);
	FileWriter fw;
	try {
		fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(code);
		bw.close();
		
		file.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

private static void importDatasets(){
	try {
		createFolder(localGravacao + fluigProjectFolder + "\\", "Datasets");
		
		AnyTypeArray anyTypeArray = new AnyTypeArray();
		anyTypeArray = datasetService.getAvailableDatasets(company,user, password);
		
		System.out.println("TOTAL DATASETS: " + anyTypeArray.getItem().size());
		
		for (int i = 0; i < anyTypeArray.getItem().size(); i++) {
			
			System.out.println("DATASET " + i + 1 + " de " + anyTypeArray.getItem().size());
			
			String datasetName = anyTypeArray.getItem().get(i).toString();
			
			Dataset ds = new Dataset();
			ds = datasetService.loadDataset(company, user, password, datasetName);
			
			String dsType = ds.getType();
			String dsCode = ds.getDatasetImpl();
			
			if (dsType.equals("CUSTOM")){
				createFile(datasetName + ".js", dsCode, localGravacao + fluigProjectFolder + "\\Datasets\\");
			}
		}
		
	} catch (com.totvs.technology.ecm.dataservice.ws.Exception_Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}

private static void importFormFiles(){
	
		createFolder(localGravacao + fluigProjectFolder + "\\" , "forms");
		String formFolder = localGravacao + fluigProjectFolder + "\\forms\\";
		
		try {
			DocumentDtoArray formList = cardIndexService.getCardIndexesWithoutApprover(user, password, company, adminUserCod);

			if (formList.getItem().size() > 0) {
				for (DocumentDto docDto: formList.getItem()) {
					
					if (!docDto.getDocumentDescription().equals("FLUIGADHOC")){
						System.out.println("Formulário: " + docDto.getDocumentDescription());
						
						createFolder(localGravacao + fluigProjectFolder + "\\forms\\", docDto.getDocumentDescription().replace("/"," "));
						formFolder = localGravacao + fluigProjectFolder + "\\forms\\" + docDto.getDocumentDescription().replace("/"," ") + "\\";
						
						StringArray formFilesList = cardIndexService.getAttachmentsList(user, password, company, docDto.getDocumentId());
						
						if(!formFilesList.getItem().isEmpty()){
					    	for(int i=0; i<formFilesList.getItem().size(); i++){
					    		String formFileName = formFilesList.getItem().get(i).toString();
					    		
					    		FileOutputStream stream = new FileOutputStream(formFolder + formFileName);
								byte[] card = cardIndexService.getCardIndexContent(user, password, company, docDto.getDocumentId(), adminUserCod, docDto.getVersion(), formFileName);
							    stream.write(card);
							    stream.close();
					    	}
					    }
						
						importFormEvents(docDto);
					}
				}
			} else {
				System.out.println("Não foi encontrado nenhum documento!");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

private static void importFormEvents(DocumentDto docDto){
	
	createFolder(localGravacao + fluigProjectFolder + "\\forms\\" + docDto.getDocumentDescription() + "\\", "events");
	String formFolder = localGravacao + fluigProjectFolder + "\\forms\\" + docDto.getDocumentDescription() + "\\events\\";
	
	try {
		CardEventDtoArray cardEventDtoArray = cardIndexService.getCustomizationEvents(user, password, company, docDto.getDocumentId());
		
		if(!cardEventDtoArray.getItem().isEmpty()){
	    	for(int i=0; i<cardEventDtoArray.getItem().size(); i++){
	    		String eventName = cardEventDtoArray.getItem().get(i).getEventId().toString();
	    		String eventCode = cardEventDtoArray.getItem().get(i).getEventDescription().toString();
	    		
	    		System.out.println("Nome do Evento: " + cardEventDtoArray.getItem().get(i).getEventId());
	    		createFile(eventName + ".js", eventCode, formFolder);
	    	}
	    }
		
	} catch (Exception_Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

private static void importProcess(){
	try {
		createFolder(localGravacao + fluigProjectFolder + "\\", "Workflow");
		
		ProcessDefinitionDtoArray processList = workflowEngineService.getAllProcessAvailableToExport(user, password, company);
		
		if (processList.getItem().size() > 0) {
			for (ProcessDefinitionDto processDto: processList.getItem()) {
				
				String processId = processDto.getProcessId();
				
				createFolder(localGravacao + fluigProjectFolder + "\\Workflow\\", "diagrams");
				String processFolder = localGravacao + fluigProjectFolder + "\\Workflow\\diagrams\\";
						
				String xmlProcess = workflowEngineService.exportProcess(user, password, company, processId);
					
				createFile(processId + ".xml", xmlProcess, processFolder);
			}
		}
	} catch (com.totvs.technology.ecm.workflow.ws.Exception_Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

private static void initializeService(String ambientURL){
		
		try {
			URL datasetWSDL = new URL(ambientURL + "/webdesk/ECMDatasetService?wsdl");
			
    		datasetServiceService = new ECMDatasetServiceService(datasetWSDL);
    		datasetService = datasetServiceService.getDatasetServicePort();
        	
    		URL datasetWSDL2 = new URL(ambientURL + "/webdesk/ECMCardIndexService?wsdl");
			
    		cardIndexServiceService = new ECMCardIndexServiceService(datasetWSDL2);
    		cardIndexService = cardIndexServiceService.getCardIndexServicePort();
    		
			URL datasetWSDL3 = new URL(ambientURL + "/webdesk/ECMWorkflowEngineService?wsdl");
			
			workflowEngineServiceService = new ECMWorkflowEngineServiceService(datasetWSDL3);
			workflowEngineService = workflowEngineServiceService.getWorkflowEngineServicePort();
    		
    		
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ECMDatasetServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://corpflp001.cloudapp.net/webdesk/ECMDocumentService?wsdl");
        }
	}
	
}

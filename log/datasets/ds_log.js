function defineStructure() {

}
function onSync(lastSyncDate) {

}
function createDataset(fields, constraints, sortFields) {
	var dataset = DatasetBuilder.newDataset();
	
	dataset.addColumn("LOG");
	var arrayLog = [];
	
	try {
		var file = new java.io.File(java.lang.System.getProperty("jboss.server.log.dir") + "/server.log");

	    if(file.exists()){
	    	var br = new java.io.BufferedReader(new java.io.FileReader(java.lang.System.getProperty("jboss.server.log.dir") + "/server.log"));
	        while(br.ready()){
	           var linha = br.readLine();
	           arrayLog.push(linha);
	        }
	        br.close();
	        
	        var arrayLength = arrayLog.length > 10000 ? 10000 : arrayLog.length;
	        
	        for (var i = arrayLog.length - arrayLength; i < arrayLog.length; i++) {
	        	dataset.addRow(new Array(arrayLog[i]));
			}
	    }
	    else {
	    	dataset.addRow(new Array("Arquivo de Log Não encontrado"));
	    }
	} 
	catch (e) {
		dataset.addRow(new Array("Erro ao carregar arquivo de log"));
	}
	
	return dataset

}function onMobileSync(user) {

}
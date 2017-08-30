var wgtFluigLog = SuperWidget.extend({
    //variáveis da widget
    variavelNumerica: null,
    variavelCaracter: null,

    //método iniciado quando a widget é carregada
    init: function() {
    	this.loadLog();
    },
  
    //BIND de eventos
    bindings: {
        local: {
        	'atualiza-log': ['click_atualizaLog'],
        	'baixar-log-completo': ['click_baixarLog']
        },
        global: {}
    },
 
    loadLog: function(htmlElement, event) {
    	var qtdLinhas = $('#qtdLinhas').val();
    	
    	if (qtdLinhas == "") {
    		qtdLinhas = 1000;
    	}
    	else {
    		qtdLinhas = parseInt(qtdLinhas);
    	}
    	
    	var dataset = DatasetFactory.getDataset("ds_log", null, null, null);
    	var logStr = "";
    	
    	for (var i = dataset.values.length - qtdLinhas; i < dataset.values.length; i++) {
    		logStr += (dataset.values[i].LOG + "<br>");
		}
    	
    	$('#conteudoLog').html(logStr);
    },
    
    atualizaLog: function() {
    	this.loadLog();
    	
    	$(window).scrollTop($(document).height())
    },
    baixarLog: function() {
    	window.location=WCMAPI.getContextPath()+"/api/rest/wcm/service/userlog/downloadServerLog";
    }

});


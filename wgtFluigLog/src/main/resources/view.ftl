<script type="text/javascript" src="/webdesk/vcXMLRPC.js"></script>
<div id="wgtFluigLog_${instanceId}" class="super-widget wcm-widget-class fluig-style-guide" data-params="wgtFluigLog.instance()">
	<fieldset>
	<legend>Opções</legend>
		<div class="row">
			<div class="form-group col-xs-2">
				<label>Qtd de Linhas</label>
				<input type="number" id="qtdLinhas" class="form-control" name="qtdLinhas" value="1000"></input>
			</div>
			<div class="form-group col-xs-10">
				<button type="button" class="btn btn-primary" data-atualiza-log>Exibir Log</button>
				<button type="button" class="btn btn-primary" data-baixar-log-completo>Baixar Log Completo</button>
			</div>
		</div>
	</fieldset>
	<div id="conteudoLog"></div>
	<fieldset>
		<div class="row">
			<div class="form-group col-xs-10">
				<button type="button" class="btn btn-primary" data-atualiza-log>Atualizar Log</button>
			</div>
		</div>
	</fieldset>
	
</div>


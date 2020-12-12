package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import definition.Processo;

public class ProcessosSteps {

    @Dado("^que o usuário gostaria de salvar um processo$")
    public void queOUsuarioGostariaDeSalvarUmProcesso() {
        Processo.clearFields();
    }

    @E("^usuário informa vara com o valor igual a \"([^\"]*)\"$")
    public void usuarioInformaVaraComOValorIgualA(String valor){
        Processo.addFields("vara",valor);
    }

    @E("^usuário informa numero_processo com o valor igual a \"([^\"]*)\"$")
    public void usuarioInformaNumero_processoComOValorIgualA(String valor){
        Processo.addFields("numero_processo",valor);
    }

    @E("^usuário informa natureza  com o valor igual a \"([^\"]*)\"$")
    public void usuarioInformaNaturezaComOValorIgualA(String valor){
        Processo.addFields("natureza",valor);
    }

    @E("^usuário informa partes com o valor igual a \"([^\"]*)\"$")
    public void usuarioInformaPartesComOValorIgualA(String valor){
        Processo.addFields("partes",valor);
    }

    @E("^usuário informa urgente com o valor igual a \"([^\"]*)\"$")
    public void usuarioInformaUrgenteComOValorIgualA(String valor){
        Processo.addFields("urgente",valor);
    }

    @E("^usuário informa arbitramento com o valor igual a \"([^\"]*)\"$")
    public void usuarioInformaArbitramentoComOValorIgualA(String valor){
        Processo.addFields("arbitramento",valor);
    }

    @E("^usuário informa assistente_social com o valor igual a \"([^\"]*)\"$")
    public void usuarioInformaAssistenteSocialComOValorIgualA(String valor){
        Processo.addFields("assistente_socical",valor);
    }

    @E("^usuário informa data_entrada  com o valor igual a \"([^\"]*)\"$")
    public void usuarioInformaDataEntradaComOValorIgualA(String valor){
        Processo.addFields("data_entrada",valor);
    }

    @E("^usuário informa data_saida com o valor igual a \"([^\"]*)\"$")
    public void usuarioInformaDataSaidaComOValorIgualA(String valor){
        Processo.addFields("data_saida",valor);
    }

    @E("^usuário informa data_agendamento com o valor igual a \"([^\"]*)\"$")
    public void usuarioInformaDataAgendamentoComOValorIgualA(String valor){
        Processo.addFields("data_agendamento",valor);
    }

    @E("^usuário informa status com o valor igual a \"([^\"]*)\"$")
    public void usuarioInformaStatusComOValorIgualA(String valor){
        Processo.addFields("status",valor);
    }

    @E("^usuário informa observacao com o valor igual a \"([^\"]*)\"$")
    public void usuarioInformaObservacaoComOValorIgualA(String valor){
        Processo.addFields("observacao",valor);
    }

    @Quando("^usuário clicar no botão de salvar$")
    public void usuarioClicarNoBotaoDeSalvar() {
        Processo.save();
    }

    @Entao("^usuário deve ver a mensagem \"([^\"]*)\"$")
    public void usuarioDeveVerAMensagem(String mensagem){
        Processo.validarMensagem(mensagem);
    }
}

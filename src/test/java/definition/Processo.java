package definition;

import groovy.json.internal.LazyMap;
import org.junit.Assert;
import support.RESTSupport;

public class Processo {

    private static final String URL = "http://agapito-server.herokuapp.com/processos";
    private static LazyMap fieldsJson = new LazyMap();
    private static String lastProcesso;
    public static String id;

    public static void clearFields(){
        fieldsJson.clear();
    }

    private static String getEndPoint() {
        return URL;
    }

    public static void addFields(String campo,String valor){
        fieldsJson.put(campo,valor);
    }

    public static LazyMap getFields() {
        return fieldsJson;
    }

    public static void setLastProcesso(String lastProcesso) {
        Processo.lastProcesso = lastProcesso;
    }

    public static void save(){
        RESTSupport.executePost(Processo.getEndPoint(),Processo.getFields());
        Processo.id  = RESTSupport.key("id").toString();
        Processo.clearFields();
    }

    public static void validarMensagem(String type){
        LazyMap messageJson = new LazyMap();
        messageJson.put("salvo com sucesso", 201);
        messageJson.put("Usuário salvo com sucesso.", 201);
        messageJson.put("save with success", 201);
        messageJson.put("sucesso", 200);
        messageJson.put("success", 200);
        messageJson.put("no content", 204);
        messageJson.put("not found", 404);messageJson.put("unauthorized", 401);
        Integer status_code = RESTSupport.getResponseCode();
        Assert.assertEquals(messageJson.get(type),status_code);
    }

    public static void getById() {
        RESTSupport.executeGet(Processo.URL+"/"+Processo.id);
    }

}

package facade.pattern.facade.or.service;

import com.google.gson.Gson;
import facade.pattern.entity.Customer;
import netscape.javascript.JSObject;

public class GeneralService {

    public String toJson(Customer customer){
        Gson gson = new Gson();
        return gson.toJson(customer);
    }
}

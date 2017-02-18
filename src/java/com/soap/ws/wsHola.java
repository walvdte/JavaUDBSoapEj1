package com.soap.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "wsHola")
public class wsHola {

    @WebMethod(operationName = "hola")
    public String hola(@WebParam(name = "nombre") String txt) {
        return "Hello " + txt + " !";
    }
}

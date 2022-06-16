package co.com.poli.productservice.helpers;

import org.springframework.stereotype.Component;

import static org.springframework.http.HttpStatus.*;

@Component
public class ResponseBuild {

    public Response success(){
        Response response = new Response();
        response.setCode(OK.value());
        response.setData(OK);
        return response;
        /*
        return
                Response.builder()
                .code(OK.value())
                .data(OK)
                .build();*/
    }
    public Response success(Object data){
        Response response = new Response();
        response.setCode(OK.value());
        response.setData(data);
        return response;
        /*
        return Response.builder()
                .code(OK.value())
                .data(data)
                .build();
                */

    }

    public Response failed(Object data){

        Response response = new Response();
        response.setCode(INTERNAL_SERVER_ERROR.value());
        response.setData(data);
        return response;
        /*
        return Response.builder()
                .code(INTERNAL_SERVER_ERROR.ordinal())
                .data(data)
                .build();

         */
    }

}

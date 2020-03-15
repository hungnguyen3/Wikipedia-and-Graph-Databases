package cpen221.mp3.wikimediator;

import java.util.ArrayList;
import java.util.List;

public class WikiResponseList {
    //RI:
    //  1. status, on assign, must be either 'success' or 'failure'
    //  2. response must be the correct response generated by wikimediator
    //  3. id is the id of the corresponding user
    //AF:
    //  AF(id) = a response ready to be converted into json file and send back to user
    private String id;
    private String status;
    private List response;


    public WikiResponseList(String id){
        this.id = id;
        this.status = "";
        this.response = new ArrayList();
    }
    /**
     * set status to be equal to the parameter status
     * @param status is the status of the reponse to the client, either "success", or "failure"
     */
    public void setStatus(String status){
        this.status=status;
    }

    /**
     * set response to be equal to the parameter response
     * @param response is the response List of Strings sent to the client
     */
    public void setResponse(List response){
        this.response=response;
    }

}

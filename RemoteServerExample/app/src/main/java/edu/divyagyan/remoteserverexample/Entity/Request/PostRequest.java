package edu.divyagyan.remoteserverexample.Entity.Request;

import edu.divyagyan.remoteserverexample.Entity.Response.PostResponse;

public class PostRequest {

    private String title;
    private String body;


    public String getTitle(){
        return title;
    }

    public PostRequest setTitle(String title){
        this.title = title;
        return this;
    }

    public String getBody(){
        return body;
    }

    public PostRequest setBody(String body){
        this.body = body;
        return this;
    }


}

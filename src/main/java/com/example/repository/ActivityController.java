package com.example.repository;

import com.example.model.ActivityModel;
import com.example.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import java.util.List;

/**
 * Created by Makhobey Oleh on 9/3/15.
 * emai: tajcig@ya.ru
 */

@Path("activities")
public class ActivityController {
    ActivityResourceStub activityResource = new ActivityResourceStub();

    @GET
    @Produces({"application/json","application/xml"})
    public List<ActivityModel> getActivities(@PathParam("user") String user){
       if(user != null) {
           ActivityModel model = new ActivityModel();
           model.setDescription(user);
           model.setDuration(user.length());

           activityResource.addActivity(model);
       }
        return activityResource.getAllActivities();
    }


    @GET
    @Produces({"application/json","application/xml"})
    @Path("{id}")
    public ActivityModel getActivity(@PathParam("id") String id){
       for(ActivityModel model :activityResource.getAllActivities()){
           if(model.getDescription().equals(id)) return model;
       }
        return null;
    }

    @GET
    @Produces({"application/json","application/xml"})
    @Path("{id}/user")
    public User getActivityUser(@PathParam("id") String id){
       for(ActivityModel model :activityResource.getAllActivities()){
           if(model.getDescription().equals(id)) return model.getUser();
       }
        return null;
    }



    @POST
    @Path("activity")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces({"application/json","application/xml"})
    public ActivityModel createActivity(MultivaluedMap<String,String> formParams){

        System.out.println(formParams.toString());

        ActivityModel model = new ActivityModel();

        model.setDescription( formParams.getFirst("description"));
        model.setDuration(Integer.parseInt(formParams.getFirst("duration")));
        return model;

    }

    @POST
    @Path("activity")
    @Consumes("application/json")
    @Produces({"application/json","application/xml"})
    public ActivityModel createActivityWithObj(ActivityModel object){
        return object;
    }


}

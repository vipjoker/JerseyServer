package com.example.repository;

import com.example.interafaces.ActivityResource;
import com.example.model.ActivityModel;
import com.example.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Makhobey Oleh on 9/3/15.
 * emai: tajcig@ya.ru
 */
public class ActivityResourceStub implements ActivityResource {
    List<ActivityModel> mList = new ArrayList<>();

    @Override
    public List<ActivityModel> getAllActivities(){


        ActivityModel model = new ActivityModel();
        model.setDescription("Running");
        model.setDuration(333);
        User user = new User();
        user.setId("777");
        user.setName("Petro");
        model.setUser(user);


        mList.add(model);

        ActivityModel model1 = new ActivityModel();
        model1.setDescription("Tennis");
        model1.setDuration(777);
        User user1 = new User();
        user1.setName("Oleh");
        user1.setId("13");
        model1.setUser(user1);
        mList.add(model1);


        return mList;
    }





    public void addActivity(ActivityModel model){
        mList.add(model);
    }
}

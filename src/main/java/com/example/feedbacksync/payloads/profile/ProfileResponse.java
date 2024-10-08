package com.example.feedbacksync.payloads.profile;

import com.example.feedbacksync.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProfileResponse {

    private Long profileId;
    private String firstName;
    private String lastName;
    private String jobTitle;
    private String email;
    private String username;
    private Long managerId;
    private ProfileResponse manager;
    private List<ProfileResponse> employees;


    public  String getFullName(){
        if (!firstName.isEmpty() && !lastName.isEmpty()){
            return firstName+" "+lastName;
        }
        return "";
    }
}

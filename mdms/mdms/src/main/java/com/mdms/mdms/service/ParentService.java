package com.mdms.mdms.service;


import com.mdms.mdms.entites.Parents;

public interface ParentService {


    Parents parentByEmail(String email);

    String parentByUserName(String userName);
}

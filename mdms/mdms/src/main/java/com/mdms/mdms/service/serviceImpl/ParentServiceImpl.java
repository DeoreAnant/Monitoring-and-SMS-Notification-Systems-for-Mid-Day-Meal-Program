package com.mdms.mdms.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdms.mdms.entites.Parents;
import com.mdms.mdms.entites.Student;
import com.mdms.mdms.repositories.ParentRepository;
import com.mdms.mdms.repositories.StudentRepository;
import com.mdms.mdms.service.ParentService;


@Service
public class ParentServiceImpl implements ParentService {


    @Autowired
    private ParentRepository parentRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Parents parentByEmail(String email) {
        
        Parents parent = parentRepository.findByEmail(email);
        return parent;
    }

    @Override
    public String parentByUserName(String userName) {
        
        Student student=studentRepository.findByStudent_mdm_id(userName);
        return student.getStudent_mdm_id();
    }

}

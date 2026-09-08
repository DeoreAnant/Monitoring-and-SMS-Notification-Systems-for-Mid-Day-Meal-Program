package com.mdms.mdms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mdms.mdms.entites.Parents;




@Repository
public interface  ParentRepository extends JpaRepository<Parents, String>{

    Parents  findByEmail(String email);

    Parents  findByUserName(String userName);
}

package com.mdms.mdms.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Parents {

    @Id
    private String id;
    private String userName;
    private String email;

}

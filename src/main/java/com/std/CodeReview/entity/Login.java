package com.std.CodeReview.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Login {
    @Id
    private String email;
    private String passwort;
    private Boolean admin;
    private Integer personalnummer;

    void setPasswort( String passwort ){
        this.passwort = passwort;
    }

    String getPasswort(){
        return this.email;
    }

}

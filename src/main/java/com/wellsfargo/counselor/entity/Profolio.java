package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Profolio {
    
    @Id
    @GeneratedValue()
    private long porfolioId;

    @Id
    @GeneratedValue()
    private long clientId;

    @Column(nullable = false)
    private String creationDate;

    protected Profolio()
    {

    }

    public Profolio(String creationDate)
    {
        this.creationDate = creationDate;
    }

    public String getCreationDate()
    {
        return creationDate;
    }

    public void setCreationDate(String creationDate)
    {
        this.creationDate = creationDate;
    }
}

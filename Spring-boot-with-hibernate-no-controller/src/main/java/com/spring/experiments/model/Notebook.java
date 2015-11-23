package com.spring.experiments.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by shaiverm on 17-Nov-2015
 */
@Entity
@Table (name = "notebook")
public class Notebook {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name, description, tags, author;

    /*@Column(name = "created_on")
    private Date createdOn;*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    /*public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }*/

    @Override
    public String
    toString() {
        return "Notebook{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", tags='" + tags + '\'' +
                ", author='" + author + '\'' +
                //", createdOn=" + createdOn +
                '}';
    }
}
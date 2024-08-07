package com.ct.showcase.jdbc.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@ToString(exclude = {"birthday"})
public class User {
    private int id;
    private String name;
    private String email;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "UTC")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
}
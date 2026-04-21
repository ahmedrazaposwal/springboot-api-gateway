package com.arp.student_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class School {
    private int id;
    private String schoolName;
    private String location;
    private String principleName;
}

package com.arp.school_service.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "School")
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String schoolName;
    private String location;
    private String principleName;
}

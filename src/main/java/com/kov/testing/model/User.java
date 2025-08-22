package com.kov.testing.model;

import jakarta.persistence.*;
import lombok.*;
import org.apache.coyote.RequestGroupInfo;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true,  nullable = false)
    private String name;

    @Column(unique = true,  nullable = false)
    private String email;

}

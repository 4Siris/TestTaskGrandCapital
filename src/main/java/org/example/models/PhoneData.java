package org.example.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PhoneData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID",unique = true)
    private long id;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
    @Column(name = "PHONE",length = 13,unique = true)
    private String phone;
}

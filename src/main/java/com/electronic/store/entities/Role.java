package com.electronic.store.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "roles")
public class Role {
    @Id
    private String roleId;
    private String roleName;
    @ManyToMany(mappedBy = "roles",cascade = CascadeType.REMOVE)
    private Set<User> users=new HashSet<>();
}

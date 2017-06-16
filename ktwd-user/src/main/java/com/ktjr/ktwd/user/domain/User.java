package com.ktjr.ktwd.user.domain;

import com.ktjr.ktwd.common.UUIDEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * An entity User composed by three fields (id, email, name).
 * The Entity annotation indicates that this class is a JPA entity.
 * The Table annotation specifies the name for the table in the db.
 *
 * @author netgloo
 */
@Entity
@Table(name = "tb_user")
@Data
@NoArgsConstructor
public class User extends UUIDEntity {

    private String email;

    private String name;

    private int age;

    public User(String id) {
        super.setId(id);
    }

    public User(String email, String name, int age) {
        this.email = email;
        this.name = name;
        this.age = age;
    }
}

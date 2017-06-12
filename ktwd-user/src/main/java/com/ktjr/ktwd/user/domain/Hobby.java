package com.ktjr.ktwd.user.domain;

import com.ktjr.ktwd.common.UUIDEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author vincentchen
 * @date 17/5/29.
 */
@Entity
@Table(name = "tb_hobby")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hobby extends UUIDEntity {

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String name;

    private int cost;
}

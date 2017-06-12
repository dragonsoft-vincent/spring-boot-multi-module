package com.ktjr.ktwd.product.domain;

import com.ktjr.ktwd.common.UUIDEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author vincentchen
 * @date 17/6/12.
 */
@Entity
@Table(name = "tb_product")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product extends UUIDEntity {

    private String productCode;

    private String productName;
}

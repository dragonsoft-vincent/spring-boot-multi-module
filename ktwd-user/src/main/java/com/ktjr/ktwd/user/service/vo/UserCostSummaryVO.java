package com.ktjr.ktwd.user.service.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author vincentchen
 * @date 17/5/29.
 */
@Data
@AllArgsConstructor
public class UserCostSummaryVO {

    private String name;

    private Double averageCost;
}

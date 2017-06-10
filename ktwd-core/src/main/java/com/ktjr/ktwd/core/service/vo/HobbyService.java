package com.ktjr.ktwd.core.service.vo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author vincentchen
 * @date 17/6/1.
 */
public interface HobbyService {

    Page<UserCostSummaryVO> getAvgHobbyCostByAge(int age, Pageable pageable);
}

package com.ktjr.ktwd.user.repository;


import com.ktjr.ktwd.user.domain.Hobby;
import com.ktjr.ktwd.user.service.vo.UserCostSummaryVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author vincentchen
 * @date 17/5/29.
 */
public interface HobbyRepository extends JpaRepository<Hobby, String> {

    /**
     * Join Sample
     */
    @Query("select new com.ktjr.ktwd.user.service.vo.UserCostSummaryVO(u.name, avg(h.cost)) from Hobby h join h.user u where u.age=?1 group by u")
    Page<UserCostSummaryVO> getCostSummaryByAge(int age, Pageable pageable);
}

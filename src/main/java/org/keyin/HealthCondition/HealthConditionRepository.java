package org.keyin.HealthCondition;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthConditionRepository extends JpaRepository<HealthCondition, Long> {
}

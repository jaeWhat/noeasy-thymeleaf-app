package com.noeasy.jpa.repository.common;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.noeasy.jpa.entity.common.CommonCodeEntity;

@Repository
public interface CommonCodeRepository extends JpaRepository<CommonCodeEntity, UUID> {
	List<CommonCodeEntity> findByCommCodeGroupOrderBySortSeq(String codeCodeGroup);
	
	List<CommonCodeEntity> findAllByOrderByCommCodeGroupAscSortSeqAsc();

	boolean existsById(UUID id);

	Optional<CommonCodeEntity> findById(UUID id);
}
package com.poja.sary_std22090.repository;

import com.poja.sary_std22090.PojaGenerated;
import com.poja.sary_std22090.repository.model.DummyUuid;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@PojaGenerated
@Repository
public interface DummyUuidRepository extends JpaRepository<DummyUuid, String> {

  @Override
  Optional<DummyUuid> findById(String id);
}

package com.poja.sary_std22090.service.event;

import com.poja.sary_std22090.PojaGenerated;
import com.poja.sary_std22090.endpoint.event.gen.UuidCreated;
import com.poja.sary_std22090.repository.DummyUuidRepository;
import com.poja.sary_std22090.repository.model.DummyUuid;
import java.util.function.Consumer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@PojaGenerated
@Service
@AllArgsConstructor
@Slf4j
public class UuidCreatedService implements Consumer<UuidCreated> {

  private final DummyUuidRepository dummyUuidRepository;

  @Override
  public void accept(UuidCreated uuidCreated) {
    var dummyUuid = new DummyUuid();
    dummyUuid.setId(uuidCreated.getUuid());
    dummyUuidRepository.save(dummyUuid);
  }
}

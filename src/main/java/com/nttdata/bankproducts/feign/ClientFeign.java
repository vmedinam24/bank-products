package com.nttdata.bankproducts.feign;

import com.nttdata.bankproducts.document.Client;
import io.reactivex.rxjava3.core.Maybe;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "micro-client", url = "http://localhost:8082")
public interface ClientFeign {

  /**
   * Display a client with a string identifier.
   *
   * @param clientId  a string identifier.
   * @return  Maybe
   */
  @GetMapping("/get/{clientId}")
  Client read(@PathVariable String clientId);

}

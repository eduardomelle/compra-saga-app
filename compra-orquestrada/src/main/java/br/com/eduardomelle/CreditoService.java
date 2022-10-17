package br.com.eduardomelle;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CreditoService {

  private int creditoTotal;

  private Map<Long, Integer> pedido_valor = new HashMap<>();

  public CreditoService() {
    this.creditoTotal = 100;
  }

}

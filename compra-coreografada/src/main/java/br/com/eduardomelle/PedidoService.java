package br.com.eduardomelle;

import java.util.HashSet;
import java.util.Set;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class PedidoService {

  private Set<Long> pedidos = new HashSet<>();

  @Inject
  CreditoService creditoService;

  public void newPedido(Long id) {
    pedidos.add(id);
  }

  public void cancelPedido(Long id) {
    pedidos.remove(id);
  }

}

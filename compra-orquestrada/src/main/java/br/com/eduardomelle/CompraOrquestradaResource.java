package br.com.eduardomelle;

import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/compra-orquestrada")
public class CompraOrquestradaResource {

  @Inject
  CreditoService creditoService;

  @Inject
  PedidoService pedidoService;

  public Response saga() {
    return Response.ok().build();
  }

  private void comprar(Long id, int valor) {
    pedidoService.newPedido(id);
    try {
      creditoService.newPedidoValor(id, valor);
    } catch (IllegalStateException e) {
      pedidoService.cancelPedido(id);
    }

    System.out.println("Pedido " + id + " registrado no valor de " + valor);
  }

}

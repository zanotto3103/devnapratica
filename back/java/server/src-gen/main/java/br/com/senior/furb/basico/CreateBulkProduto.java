/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name = "createBulkProduto", kind = CommandKind.Create, requestPrimitive = "createBulkProduto", responsePrimitive="")
public interface CreateBulkProduto extends MessageHandler {
    public CreateBulkProdutoOutput createBulkProduto(CreateBulkProdutoInput toCreate);
}

/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ItemPedido;

/**
 * Response method for createMergeItemPedido
 */
@CommandDescription(name="createMergeItemPedidoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createMergeItemPedidoResponse")
public interface CreateMergeItemPedidoResponse extends MessageHandler {

	void createMergeItemPedidoResponse(ItemPedido response);
	
	void createMergeItemPedidoResponseError(ErrorPayload error);

}

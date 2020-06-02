package protocolsupport.protocol.packet.middleimpl.clientbound.play.noop;

import protocolsupport.protocol.ConnectionImpl;
import protocolsupport.protocol.packet.middle.clientbound.play.MiddleEntityLeash;

public class NoopEntityLeash extends MiddleEntityLeash {

	public NoopEntityLeash(ConnectionImpl connection) {
		super(connection);
	}

	@Override
	protected void writeToClient() {
	}

}

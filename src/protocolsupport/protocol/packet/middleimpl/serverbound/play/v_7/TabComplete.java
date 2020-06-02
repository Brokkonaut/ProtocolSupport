package protocolsupport.protocol.packet.middleimpl.serverbound.play.v_7;

import io.netty.buffer.ByteBuf;
import protocolsupport.protocol.ConnectionImpl;
import protocolsupport.protocol.packet.middle.serverbound.play.MiddleTabComplete;
import protocolsupport.protocol.serializer.StringSerializer;

public class TabComplete extends MiddleTabComplete {

	public TabComplete(ConnectionImpl connection) {
		super(connection);
	}

	@Override
	public void readClientData(ByteBuf clientdata) {
		id = 0;
		string = StringSerializer.readVarIntUTF8String(clientdata, 256);
		if (string.equals("/")) {
			string = "";
		}
	}

}

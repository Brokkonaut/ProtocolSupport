package protocolsupport.protocol.typeremapper.packet;

import protocolsupport.protocol.PacketDataCodecImpl.ServerBoundPacketDataProcessor;
import protocolsupport.protocol.packet.PacketData;
import protocolsupport.protocol.packet.PacketType;

public class AnimatePacketReorderer extends ServerBoundPacketDataProcessor {

	protected PacketData<?> animatePacket;

	@Override
	public void process(PacketData<?> packet) {
		PacketType packetType = packet.getPacketType();

		if (animatePacket != null) {
			if (packetType == PacketType.SERVERBOUND_PLAY_USE_ENTITY) {
				read(packet);
				read(animatePacket);
				animatePacket = null;
				return;
			} else {
				read(animatePacket);
				animatePacket = null;
			}
		}

		if (packetType == PacketType.SERVERBOUND_PLAY_ANIMATION) {
			animatePacket = packet;
		} else {
			read(packet);
		}
	}

	@Override
	public void release() {
		if (animatePacket != null) {
			animatePacket.release();
		}
	}

}

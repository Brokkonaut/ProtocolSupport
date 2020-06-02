package protocolsupport.protocol.packet.middleimpl.clientbound.play.v_8;

import protocolsupport.protocol.ConnectionImpl;
import protocolsupport.protocol.packet.PacketType;
import protocolsupport.protocol.packet.middle.clientbound.play.MiddleEntityRelMoveLook;
import protocolsupport.protocol.packet.middleimpl.ClientBoundPacketData;
import protocolsupport.protocol.serializer.VarNumberSerializer;
import protocolsupport.protocol.typeremapper.legacy.LegacyRelMoveConverter;
import protocolsupport.protocol.typeremapper.legacy.LegacyRelMoveConverter.RelMove;

public class EntityRelMoveLook extends MiddleEntityRelMoveLook {

	public EntityRelMoveLook(ConnectionImpl connection) {
		super(connection);
	}

	@Override
	protected void writeToClient() {
		int relMoveX = relX / 128;
		int relMoveY = relY / 128;
		int relMoveZ = relZ / 128;
		for (RelMove relMove : LegacyRelMoveConverter.getRelMoves(new RelMove(relMoveX, relMoveY, relMoveZ), 127)) {
			ClientBoundPacketData entityrelmovelook = ClientBoundPacketData.create(PacketType.CLIENTBOUND_PLAY_ENTITY_REL_MOVE_LOOK);
			VarNumberSerializer.writeVarInt(entityrelmovelook, entityId);
			entityrelmovelook.writeByte(relMove.getX());
			entityrelmovelook.writeByte(relMove.getY());
			entityrelmovelook.writeByte(relMove.getZ());
			entityrelmovelook.writeByte(yaw);
			entityrelmovelook.writeByte(pitch);
			entityrelmovelook.writeBoolean(onGround);
			codec.write(entityrelmovelook);
		}
	}

}

package protocolsupport.protocol.packet.middleimpl.clientbound.play.v_7;

import protocolsupport.protocol.ConnectionImpl;
import protocolsupport.protocol.packet.ClientBoundPacket;
import protocolsupport.protocol.packet.middleimpl.ClientBoundPacketData;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13.AbstractBlockChangeSingle;
import protocolsupport.protocol.serializer.PositionSerializer;
import protocolsupport.protocol.serializer.VarNumberSerializer;
import protocolsupport.protocol.typeremapper.block.BlockRemappingHelper;
import protocolsupport.protocol.typeremapper.block.LegacyBlockData;
import protocolsupport.protocol.typeremapper.block.PreFlatteningBlockIdData;
import protocolsupport.protocol.typeremapper.utils.RemappingTable.ArrayBasedIdRemappingTable;
import protocolsupport.utils.recyclable.RecyclableCollection;
import protocolsupport.utils.recyclable.RecyclableSingletonList;

public class BlockChangeSingle extends AbstractBlockChangeSingle {

	public BlockChangeSingle(ConnectionImpl connection) {
		super(connection);
	}

	protected final ArrayBasedIdRemappingTable blockDataRemappingTable = LegacyBlockData.REGISTRY.getTable(version);

	@Override
	public RecyclableCollection<ClientBoundPacketData> toData() {
		ClientBoundPacketData serializer = ClientBoundPacketData.create(ClientBoundPacket.PLAY_BLOCK_CHANGE_SINGLE_ID);
		PositionSerializer.writeLegacyPositionB(serializer, position);
		int lId = BlockRemappingHelper.remapBlockDataNormal(blockDataRemappingTable, id);
		VarNumberSerializer.writeVarInt(serializer, PreFlatteningBlockIdData.getIdFromCombinedId(lId));
		serializer.writeByte(PreFlatteningBlockIdData.getDataFromCombinedId(lId));
		return RecyclableSingletonList.create(serializer);
	}

}

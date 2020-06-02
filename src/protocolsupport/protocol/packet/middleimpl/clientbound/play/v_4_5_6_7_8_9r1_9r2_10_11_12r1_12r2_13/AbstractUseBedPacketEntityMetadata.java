package protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13;

import java.util.Optional;

import protocolsupport.protocol.ConnectionImpl;
import protocolsupport.protocol.packet.middle.clientbound.play.MiddleEntityMetadata;
import protocolsupport.protocol.packet.middleimpl.ClientBoundPacketData;
import protocolsupport.protocol.serializer.NetworkEntityMetadataSerializer.NetworkEntityMetadataList;
import protocolsupport.protocol.types.Position;
import protocolsupport.protocol.types.networkentity.NetworkEntityType;
import protocolsupport.protocol.types.networkentity.metadata.NetworkEntityMetadataObjectIndex;
import protocolsupport.protocol.types.networkentity.metadata.objects.NetworkEntityMetadataObjectOptionalPosition;

public abstract class AbstractUseBedPacketEntityMetadata extends MiddleEntityMetadata {

	public AbstractUseBedPacketEntityMetadata(ConnectionImpl connection) {
		super(connection);
	}

	@Override
	public void writeToClient0(NetworkEntityMetadataList remappedMetadata) {
		codec.write(createEntityMetadata(remappedMetadata));

		if (entity.getType() == NetworkEntityType.PLAYER) {
			Optional<NetworkEntityMetadataObjectOptionalPosition> bedpositionObject = NetworkEntityMetadataObjectIndex.EntityLiving.BED_LOCATION.getValue(metadata);
			if (bedpositionObject.isPresent()) {
				Position bedposition = bedpositionObject.get().getValue();
				if (bedposition != null) {
					codec.write(createUseBed(bedposition));
				}
			}
		}
	}

	protected abstract ClientBoundPacketData createEntityMetadata(NetworkEntityMetadataList remappedMetadata);

	protected abstract ClientBoundPacketData createUseBed(Position position);

}

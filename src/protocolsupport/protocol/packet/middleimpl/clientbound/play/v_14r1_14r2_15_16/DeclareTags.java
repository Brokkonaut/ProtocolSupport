package protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15_16;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import protocolsupport.api.ProtocolVersion;
import protocolsupport.protocol.ConnectionImpl;
import protocolsupport.protocol.packet.PacketType;
import protocolsupport.protocol.packet.middle.clientbound.play.MiddleDeclareTags;
import protocolsupport.protocol.packet.middleimpl.ClientBoundPacketData;
import protocolsupport.protocol.serializer.ArraySerializer;
import protocolsupport.protocol.serializer.StringSerializer;

public class DeclareTags extends MiddleDeclareTags {

	public DeclareTags(ConnectionImpl connection) {
		super(connection);
	}

	@Override
	protected void writeToClient() {
		ClientBoundPacketData declaretags = ClientBoundPacketData.create(PacketType.CLIENTBOUND_PLAY_DECLARE_TAGS);
		if(connection.getVersion().isBeforeOrEq(ProtocolVersion.MINECRAFT_1_15_2)) {
			ArrayList<Tag> tags = new ArrayList<>();
			tags.add(new Tag("minecraft:enderman_holdable", new int[] {123, 119, 11, 130, 30, 136, 190, 121, 8, 10, 236, 195, 120, 128, 124, 29, 185, 186, 28, 245, 129, 127, 9, 125, 126, 118, 131, 122, 191, 132}));
			tags.add(new Tag("minecraft:banners", new int[] {420, 436, 418, 425, 416, 417, 408, 437, 423, 411, 424, 412, 410, 413, 427, 419, 432, 426, 409, 439, 421, 433, 414, 415, 428, 429, 422, 434, 430, 431, 438, 435}));
			tags.add(new Tag("minecraft:flower_pots", new int[] {276, 290, 292, 275, 277, 278, 295, 297, 287, 282, 285, 289, 286, 279, 291, 615, 284, 293, 288, 274, 283, 296, 280, 281, 294, 273}));
			tags.add(new Tag("minecraft:wooden_fences", new int[] {475, 474, 476, 189, 472, 473}));
			tags.add(new Tag("minecraft:wooden_slabs", new int[] {447, 444, 449, 446, 445, 448}));
			tags.add(new Tag("minecraft:portals", new int[] {194, 491, 254}));
			tags.add(new Tag("minecraft:small_flowers", new int[] {120, 123, 119, 128, 124, 130, 129, 127, 125, 126, 118, 121, 122}));
			tags.add(new Tag("minecraft:bamboo_plantable_on", new int[] {245, 9, 613, 11, 29, 30, 8, 10, 28, 614}));
			tags.add(new Tag("minecraft:wooden_trapdoors", new int[] {215, 216, 219, 217, 220, 218}));
			tags.add(new Tag("minecraft:jungle_logs", new int[] {42, 55, 37, 49}));
			tags.add(new Tag("minecraft:wooden_stairs", new int[] {268, 368, 266, 267, 367, 144}));
			tags.add(new Tag("minecraft:spruce_logs", new int[] {47, 40, 53, 35}));
			tags.add(new Tag("minecraft:signs", new int[] {164, 165, 166, 168, 153, 167, 158, 163, 155, 154, 156, 157}));
			tags.add(new Tag("minecraft:carpets", new int[] {390, 394, 384, 398, 386, 388, 391, 387, 395, 397, 389, 385, 393, 392, 383, 396}));
			tags.add(new Tag("minecraft:wool", new int[] {102, 103, 111, 107, 114, 113, 104, 110, 115, 108, 112, 116, 106, 101, 109, 105}));
			tags.add(new Tag("minecraft:wooden_buttons", new int[] {300, 305, 304, 302, 301, 303}));
			tags.add(new Tag("minecraft:stairs", new int[] {249, 619, 375, 367, 377, 630, 376, 620, 244, 622, 267, 625, 260, 629, 332, 144, 268, 368, 624, 627, 487, 243, 621, 626, 266, 628, 632, 443, 623, 631, 162}));
			tags.add(new Tag("minecraft:logs", new int[] {46, 45, 41, 38, 37, 52, 51, 48, 57, 53, 42, 50, 43, 36, 56, 47, 40, 55, 34, 44, 54, 35, 39, 49}));
			tags.add(new Tag("minecraft:stone_bricks", new int[] {224, 222, 221, 223}));
			tags.add(new Tag("minecraft:beehives", new int[] {676, 677}));
			tags.add(new Tag("minecraft:ice", new int[] {494, 611, 401, 183}));
			tags.add(new Tag("minecraft:dragon_immune", new int[] {255, 674, 673, 254, 370, 234, 139, 491, 492, 25, 256, 493, 269, 117}));
			tags.add(new Tag("minecraft:crops", new int[] {489, 298, 240, 239, 150, 299}));
			tags.add(new Tag("minecraft:wall_signs", new int[] {164, 165, 166, 168, 167, 163}));
			tags.add(new Tag("minecraft:slabs", new int[] {643, 645, 634, 451, 458, 445, 448, 461, 640, 447, 637, 633, 450, 459, 462, 456, 454, 379, 378, 457, 638, 444, 449, 380, 455, 641, 636, 642, 460, 644, 446, 635, 452, 639, 453}));
			tags.add(new Tag("minecraft:valid_spawn", new int[] {11, 8}));
			tags.add(new Tag("minecraft:wooden_doors", new int[] {480, 481, 159, 479, 478, 477}));
			tags.add(new Tag("minecraft:standing_signs", new int[] {153, 158, 155, 154, 156, 157}));
			tags.add(new Tag("minecraft:trapdoors", new int[] {215, 216, 219, 217, 220, 371, 218}));
			tags.add(new Tag("minecraft:buttons", new int[] {300, 305, 181, 304, 302, 301, 303}));
			tags.add(new Tag("minecraft:flowers", new int[] {120, 123, 119, 128, 124, 403, 130, 404, 129, 127, 125, 126, 402, 118, 121, 122, 405}));
			tags.add(new Tag("minecraft:corals", new int[] {585, 596, 588, 586, 597, 599, 587, 589, 595, 598}));
			tags.add(new Tag("minecraft:planks", new int[] {17, 16, 15, 13, 14, 18}));
			tags.add(new Tag("minecraft:dark_oak_logs", new int[] {51, 44, 57, 39}));
			tags.add(new Tag("minecraft:rails", new int[] {333, 90, 91, 161}));
			tags.add(new Tag("minecraft:coral_plants", new int[] {585, 588, 586, 587, 589}));
			tags.add(new Tag("minecraft:leaves", new int[] {58, 59, 63, 61, 62, 60}));
			tags.add(new Tag("minecraft:walls", new int[] {649, 655, 271, 651, 654, 650, 646, 652, 647, 648, 653, 656, 272, 657}));
			tags.add(new Tag("minecraft:coral_blocks", new int[] {577, 576, 578, 579, 575}));
			tags.add(new Tag("minecraft:shulker_boxes", new int[] {501, 512, 502, 510, 506, 504, 511, 505, 517, 503, 516, 513, 507, 515, 509, 508, 514}));
			tags.add(new Tag("minecraft:bee_growables", new int[] {489, 672, 298, 240, 239, 150, 299}));
			tags.add(new Tag("minecraft:wooden_pressure_plates", new int[] {175, 174, 177, 176, 172, 173}));
			tags.add(new Tag("minecraft:wither_immune", new int[] {370, 255, 674, 491, 492, 25, 493, 673, 254, 269, 117}));
			tags.add(new Tag("minecraft:acacia_logs", new int[] {50, 43, 56, 38}));
			tags.add(new Tag("minecraft:anvil", new int[] {320, 318, 319}));
			tags.add(new Tag("minecraft:tall_flowers", new int[] {402, 403, 405, 404}));
			tags.add(new Tag("minecraft:birch_logs", new int[] {36, 41, 48, 54}));
			tags.add(new Tag("minecraft:wall_corals", new int[] {608, 606, 607, 609, 605}));
			tags.add(new Tag("minecraft:underwater_bonemeals", new int[] {585, 596, 588, 586, 599, 97, 608, 606, 597, 607, 609, 587, 589, 595, 598, 605}));
			tags.add(new Tag("minecraft:impermeable", new int[] {200, 210, 204, 202, 208, 201, 207, 206, 66, 199, 213, 212, 214, 203, 205, 211, 209}));
			tags.add(new Tag("minecraft:sand", new int[] {29, 28}));
			tags.add(new Tag("minecraft:fences", new int[] {475, 248, 474, 476, 189, 472, 473}));
			tags.add(new Tag("minecraft:saplings", new int[] {19, 21, 24, 20, 23, 22}));
			tags.add(new Tag("minecraft:beds", new int[] {89, 78, 84, 88, 75, 81, 79, 74, 76, 82, 80, 85, 83, 87, 86, 77}));
			tags.add(new Tag("minecraft:oak_logs", new int[] {46, 45, 34, 52}));
			tags.add(new Tag("minecraft:doors", new int[] {480, 481, 159, 479, 171, 478, 477}));
			writeTags(declaretags, tags.toArray(new Tag[tags.size()]));
		} else {
			writeTags(declaretags, blocks);
		}
		writeTags(declaretags, items);
		writeTags(declaretags, fluids);
		writeTags(declaretags, entities);
		codec.write(declaretags);
	}

	protected static void writeTags(ByteBuf to, Tag[] tags) {
		ArraySerializer.writeVarIntTArray(to, tags, (lTo, tag) -> {
			StringSerializer.writeVarIntUTF8String(lTo, tag.getTagId());
			ArraySerializer.writeVarIntVarIntArray(lTo, tag.getTaggedIds());
		});
	}

}

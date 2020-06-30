package protocolsupport.api.chat.modifiers;

import org.bukkit.ChatColor;

import protocolsupport.utils.Utils;

//TODO: support Font and RGB color
public class Modifier {

	private ChatColor color;
	private Boolean bold;
	private Boolean italic;
	private Boolean underlined;
	private Boolean strikethrough;
	private Boolean obfuscated;

	public boolean isEmpty() {
		return (color == null) && (bold == null) && (italic == null) && (underlined == null) && (strikethrough == null) && (obfuscated == null);
	}

	public void clear() {
		color = null;
		bold = null;
		italic = null;
		underlined = null;
		strikethrough = null;
		obfuscated = null;
	}

	public void set(ChatColor format) {
		if ((format == null) || (format == ChatColor.RESET)) {
			clear();
			return;
		}
		if (format.isColor()) {
			this.color = format;
		} else if (format.isFormat()) {
			switch (format) {
				case BOLD: {
					this.bold = true;
					break;
				}
				case ITALIC: {
					this.italic = true;
					break;
				}
				case STRIKETHROUGH: {
					this.strikethrough = true;
					break;
				}
				case UNDERLINE: {
					this.underlined = true;
					break;
				}
				case MAGIC: {
					this.obfuscated = true;
					break;
				}
				default: {
					break;
				}
			}
		}
	}

	public Modifier with(ChatColor format) {
		set(format);
		return this;
	}

	public boolean hasColor() {
		return color != null;
	}

	public ChatColor getColor() {
		return color;
	}

	public void setColor(ChatColor color) {
		if (color == null) {
			this.color = null;
			return;
		}
		if (color.isColor()) {
			this.color = color;
		}
	}

	public Modifier withColor(ChatColor color) {
		setColor(color);
		return this;
	}

	public Boolean isBold() {
		return bold;
	}

	public void setBold(Boolean bold) {
		this.bold = bold;
	}

	public Modifier withBold(Boolean bold) {
		setBold(bold);
		return this;
	}

	public Boolean isItalic() {
		return italic;
	}

	public void setItalic(Boolean italic) {
		this.italic = italic;
	}

	public Modifier withItalic(Boolean italic) {
		setItalic(italic);
		return this;
	}

	public Boolean isUnderlined() {
		return underlined;
	}

	public void setUnderlined(Boolean underlined) {
		this.underlined = underlined;
	}

	public Modifier withUnderlined(Boolean underlined) {
		setUnderlined(underlined);
		return this;
	}

	public Boolean isStrikethrough() {
		return strikethrough;
	}

	public void setStrikethrough(Boolean strikethrough) {
		this.strikethrough = strikethrough;
	}

	public Modifier withStrikethrough(Boolean strikethrough) {
		setStrikethrough(strikethrough);
		return this;
	}

	public Boolean isRandom() {
		return obfuscated;
	}

	public void setRandom(Boolean random) {
		this.obfuscated = random;
	}

	public Modifier withRandom(Boolean random) {
		setRandom(random);
		return this;
	}

	@Override
	public String toString() {
		return Utils.toStringAllFields(this);
	}

}

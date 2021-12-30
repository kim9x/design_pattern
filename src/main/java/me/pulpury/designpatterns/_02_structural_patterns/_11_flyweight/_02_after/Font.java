package me.pulpury.designpatterns._02_structural_patterns._11_flyweight._02_after;

// 클래스에서의 final 키워드는 상속을 막아준다.
public final class Font {
	
	final String family;
	
	final int size;

	public Font(String family, int size) {
		this.family = family;
		this.size = size;
	}

	public String getFamily() {
		return family;
	}

	public int getSize() {
		return size;
	}
}

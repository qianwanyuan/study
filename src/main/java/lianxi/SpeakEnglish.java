package lianxi;

public interface SpeakEnglish {
	public void speakEnglish();
	public default void study() {
		System.out.println("123");
	}

}

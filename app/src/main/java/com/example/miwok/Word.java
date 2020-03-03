package com.example.miwok;

public class Word {
    private String defaultTranslation;
    private String miwokTranslation;
    private int imageResId = NO_IMAGE_PROVIDED;
    private int audioResId;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int audioResId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.audioResId = audioResId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int audioResId, int imageResId) {
        this(defaultTranslation, miwokTranslation, audioResId);
        this.imageResId = imageResId;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public int getImageResId() {
        return imageResId;
    }

    public int getAudioResId() {
        return audioResId;
    }

    public boolean hasImage() {
        return this.imageResId != NO_IMAGE_PROVIDED;
    }
}

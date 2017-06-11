package com.goodjob.musicplayer.entity;

/**
 * Created by Godot on 2017/6/11.
 */

public class AudioItem {
    private Audio mAudio;

    private int mClassificationId;
    private String mClassificationName;

    public AudioItem(Audio audio) {
        mAudio = audio;
    }

    public Audio getAudio() {
        return mAudio;
    }

    public void setClassficationId(int classificationId) {
        mClassificationId = classificationId;
    }

    public int getClassficationId() {
        return mClassificationId;
    }

    public void setClassficationName(String classificationName) {
        mClassificationName = classificationName;
    }

    public String getClassificationName() {
        return mClassificationName;
    }
}

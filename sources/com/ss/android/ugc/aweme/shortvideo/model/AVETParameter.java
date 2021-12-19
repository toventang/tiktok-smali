package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;

public final class AVETParameter implements Serializable {
    private String contentSource = "shoot";
    private String contentType = "video";
    private String creationId = "";
    private int draftId;
    private String newDraftId = "";
    private int original = -1;
    private int shootMode;
    private String shootWay = "";
    private String storySceneId = "";
    private String storyShootEntrance = "";

    static {
        Covode.recordClassIndex(84398);
    }

    public final String getContentSource() {
        return this.contentSource;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final int getDraftId() {
        return this.draftId;
    }

    public final String getNewDraftId() {
        return this.newDraftId;
    }

    public final int getOriginal() {
        return this.original;
    }

    public final int getShootMode() {
        return this.shootMode;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final String getStorySceneId() {
        return this.storySceneId;
    }

    public final String getStoryShootEntrance() {
        return this.storyShootEntrance;
    }

    public final void setDraftId(int i2) {
        this.draftId = i2;
    }

    public final void setOriginal(int i2) {
        this.original = i2;
    }

    public final void setShootMode(int i2) {
        this.shootMode = i2;
    }

    public final void setContentSource(String str) {
        l.d(str, "");
        this.contentSource = str;
    }

    public final void setContentType(String str) {
        l.d(str, "");
        this.contentType = str;
    }

    public final void setCreationId(String str) {
        l.d(str, "");
        this.creationId = str;
    }

    public final void setNewDraftId(String str) {
        l.d(str, "");
        this.newDraftId = str;
    }

    public final void setShootWay(String str) {
        l.d(str, "");
        this.shootWay = str;
    }

    public final void setStorySceneId(String str) {
        l.d(str, "");
        this.storySceneId = str;
    }

    public final void setStoryShootEntrance(String str) {
        l.d(str, "");
        this.storyShootEntrance = str;
    }
}

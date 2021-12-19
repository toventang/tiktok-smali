package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

public final class MatchedSoundInfo implements Serializable {
    @c(a = "author")
    public String author;
    @c(a = "chorus_info")
    public MusicChorusInfo chorusInfo;
    @c(a = "cover_medium")
    public UrlModel coverMedium;
    @c(a = "h5_url")
    public String h5Url;
    @c(a = "id")
    public String id;
    @c(a = "performers")
    public List<MusicPerformer> performers;
    @c(a = "title")
    public String title;

    static {
        Covode.recordClassIndex(71662);
    }

    public final String getAuthor() {
        return this.author;
    }

    public final MusicChorusInfo getChorusInfo() {
        return this.chorusInfo;
    }

    public final UrlModel getCoverMedium() {
        return this.coverMedium;
    }

    public final String getH5Url() {
        return this.h5Url;
    }

    public final String getId() {
        return this.id;
    }

    public final List<MusicPerformer> getPerformers() {
        return this.performers;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setAuthor(String str) {
        this.author = str;
    }

    public final void setChorusInfo(MusicChorusInfo musicChorusInfo) {
        this.chorusInfo = musicChorusInfo;
    }

    public final void setCoverMedium(UrlModel urlModel) {
        this.coverMedium = urlModel;
    }

    public final void setH5Url(String str) {
        this.h5Url = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setPerformers(List<MusicPerformer> list) {
        this.performers = list;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}

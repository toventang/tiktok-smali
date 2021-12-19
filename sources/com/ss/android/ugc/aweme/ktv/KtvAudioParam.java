package com.ss.android.ugc.aweme.ktv;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;
import h.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class KtvAudioParam implements Serializable {
    @c(a = "audio_track_index")
    private int audioTrackIndex = -1;
    @c(a = "audio_uuid")
    private String audioTrackUuid = "";
    @c(a = "balance_filter_index")
    private int balanceFilter = -1;
    @c(a = "play_url_duration")
    private int duration;
    @c(a = "enable_audio_track")
    private boolean enableAudioTrack = true;
    @c(a = "volume_loudness")
    private double loudness;
    @c(a = "volume_peak")
    private double peak;
    @c(a = "play_url_start")
    private int playStart;
    @c(a = "play_url")
    private UrlModel playUrl;
    @c(a = "play_time_list")
    private List<AudioInterval> timeList = new ArrayList();
    @c(a = "volume")
    private float volume = 0.5f;
    @c(a = "volume_filter_index_list")
    private List<p<Integer, Boolean>> volumeFilters = new ArrayList();
    @c(a = "volume_filter_uuid_list")
    private List<p<String, Boolean>> volumeFiltersNLE = new ArrayList();

    static {
        Covode.recordClassIndex(68547);
    }

    public final int getAudioTrackIndex() {
        return this.audioTrackIndex;
    }

    public final String getAudioTrackUuid() {
        return this.audioTrackUuid;
    }

    public final int getBalanceFilter() {
        return this.balanceFilter;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final boolean getEnableAudioTrack() {
        return this.enableAudioTrack;
    }

    public final double getLoudness() {
        return this.loudness;
    }

    public final double getPeak() {
        return this.peak;
    }

    public final int getPlayStart() {
        return this.playStart;
    }

    public final UrlModel getPlayUrl() {
        return this.playUrl;
    }

    public final List<AudioInterval> getTimeList() {
        return this.timeList;
    }

    public final float getVolume() {
        return this.volume;
    }

    public final List<p<Integer, Boolean>> getVolumeFilters() {
        return this.volumeFilters;
    }

    public final List<p<String, Boolean>> getVolumeFiltersNLE() {
        return this.volumeFiltersNLE;
    }

    public final void setAudioTrackIndex(int i2) {
        this.audioTrackIndex = i2;
    }

    public final void setBalanceFilter(int i2) {
        this.balanceFilter = i2;
    }

    public final void setDuration(int i2) {
        this.duration = i2;
    }

    public final void setEnableAudioTrack(boolean z) {
        this.enableAudioTrack = z;
    }

    public final void setLoudness(double d2) {
        this.loudness = d2;
    }

    public final void setPeak(double d2) {
        this.peak = d2;
    }

    public final void setPlayStart(int i2) {
        this.playStart = i2;
    }

    public final void setPlayUrl(UrlModel urlModel) {
        this.playUrl = urlModel;
    }

    public final void setVolume(float f2) {
        this.volume = f2;
    }

    public final void setAudioTrackUuid(String str) {
        l.d(str, "");
        this.audioTrackUuid = str;
    }

    public final void setTimeList(List<AudioInterval> list) {
        l.d(list, "");
        this.timeList = list;
    }

    public final void setVolumeFilters(List<p<Integer, Boolean>> list) {
        l.d(list, "");
        this.volumeFilters = list;
    }

    public final void setVolumeFiltersNLE(List<p<String, Boolean>> list) {
        l.d(list, "");
        this.volumeFiltersNLE = list;
    }
}

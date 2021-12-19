package com.ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

public final class EpisodeData implements Serializable {
    @c(a = "album_id")
    private String albumId;
    @c(a = "definition")
    private String definition;
    @c(a = "duration")
    private double duration;
    @c(a = "episode_id")
    private String episodeId;
    @c(a = StringSet.name)
    private String name;
    @c(a = "online_time")
    private long onlineTime;
    @c(a = "opening")
    private double opening;
    @c(a = "payment_status")
    private int paymentStatus;
    @c(a = "lvideo_tag")
    private LongVideoTag paymentTag;
    @c(a = "lvideo_tag_light")
    private LongVideoTag paymentTagLight;
    @c(a = "schema_type")
    private int schemaType;
    @c(a = "schema")
    private String scheme;
    @c(a = "seq")
    private int seq;
    private String seqStr;
    @c(a = "sub_title")
    private String subTitle;
    @c(a = "title")
    private String title;
    @c(a = "url")
    private String url;
    @c(a = "vid")
    private String vid;

    static {
        Covode.recordClassIndex(50898);
    }

    public final String getAlbumId() {
        return this.albumId;
    }

    public final String getDefinition() {
        return this.definition;
    }

    public final double getDuration() {
        return this.duration;
    }

    public final String getEpisodeId() {
        return this.episodeId;
    }

    public final String getName() {
        return this.name;
    }

    public final long getOnlineTime() {
        return this.onlineTime;
    }

    public final double getOpening() {
        return this.opening;
    }

    public final int getPaymentStatus() {
        return this.paymentStatus;
    }

    public final LongVideoTag getPaymentTag() {
        return this.paymentTag;
    }

    public final LongVideoTag getPaymentTagLight() {
        return this.paymentTagLight;
    }

    public final int getSchemaType() {
        return this.schemaType;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final int getSeq() {
        return this.seq;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getVid() {
        return this.vid;
    }

    public final String getSeqStr() {
        if (TextUtils.isEmpty(this.seqStr)) {
            return String.valueOf(this.seq);
        }
        return this.seqStr;
    }

    public final void setAlbumId(String str) {
        this.albumId = str;
    }

    public final void setDefinition(String str) {
        this.definition = str;
    }

    public final void setDuration(double d2) {
        this.duration = d2;
    }

    public final void setEpisodeId(String str) {
        this.episodeId = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOnlineTime(long j2) {
        this.onlineTime = j2;
    }

    public final void setOpening(double d2) {
        this.opening = d2;
    }

    public final void setPaymentStatus(int i2) {
        this.paymentStatus = i2;
    }

    public final void setPaymentTag(LongVideoTag longVideoTag) {
        this.paymentTag = longVideoTag;
    }

    public final void setPaymentTagLight(LongVideoTag longVideoTag) {
        this.paymentTagLight = longVideoTag;
    }

    public final void setSchemaType(int i2) {
        this.schemaType = i2;
    }

    public final void setScheme(String str) {
        this.scheme = str;
    }

    public final void setSeq(int i2) {
        this.seq = i2;
    }

    public final void setSeqStr(String str) {
        this.seqStr = str;
    }

    public final void setSubTitle(String str) {
        this.subTitle = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setVid(String str) {
        this.vid = str;
    }
}

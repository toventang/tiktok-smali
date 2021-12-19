package com.ss.android.ugc.playerkit.simapicommon.a;

import com.bytedance.covode.number.Covode;
import java.util.List;

public final class d extends g {
    private Integer bitRate;
    private Long cdnUrlExpired;
    private long createTime;
    private String fileKey;
    private Integer infoId;
    private String lang;
    private Float loudness;
    private Float peak;
    private String voiceType;

    static {
        Covode.recordClassIndex(98030);
    }

    public final Integer getBitRate() {
        return this.bitRate;
    }

    public final Long getCdnUrlExpired() {
        return this.cdnUrlExpired;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getFileKey() {
        return this.fileKey;
    }

    public final Integer getInfoId() {
        return this.infoId;
    }

    public final String getLang() {
        return this.lang;
    }

    public final Float getLoudness() {
        return this.loudness;
    }

    public final Float getPeak() {
        return this.peak;
    }

    public final String getVoiceType() {
        return this.voiceType;
    }

    public final void setBitRate(Integer num) {
        this.bitRate = num;
    }

    public final void setCdnUrlExpired(Long l2) {
        this.cdnUrlExpired = l2;
    }

    public final void setCreateTime(long j2) {
        this.createTime = j2;
    }

    public final void setFileKey(String str) {
        this.fileKey = str;
    }

    public final void setInfoId(Integer num) {
        this.infoId = num;
    }

    public final void setLang(String str) {
        this.lang = str;
    }

    public final void setLoudness(Float f2) {
        this.loudness = f2;
    }

    public final void setPeak(Float f2) {
        this.peak = f2;
    }

    public final void setVoiceType(String str) {
        this.voiceType = str;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final d f148873a = new d();

        static {
            Covode.recordClassIndex(98031);
        }

        public final a a(String str) {
            this.f148873a.fileCheckSum = str;
            return this;
        }

        public final a a(List<String> list) {
            this.f148873a.urlList = list;
            return this;
        }
    }
}

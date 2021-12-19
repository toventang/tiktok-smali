package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class TtsInfos implements Serializable {
    @c(a = "lang")
    public String lang;
    @c(a = "language_id")
    public Long languageId;
    @c(a = "play_addr")
    public PlayAddress playAddress;
    @c(a = "voice_type")
    public String voiceType;
    @c(a = "volume_info")
    public String volumeInfo;

    static {
        Covode.recordClassIndex(59461);
    }

    public TtsInfos() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ TtsInfos copy$default(TtsInfos ttsInfos, String str, Long l2, String str2, PlayAddress playAddress2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = ttsInfos.lang;
        }
        if ((i2 & 2) != 0) {
            l2 = ttsInfos.languageId;
        }
        if ((i2 & 4) != 0) {
            str2 = ttsInfos.voiceType;
        }
        if ((i2 & 8) != 0) {
            playAddress2 = ttsInfos.playAddress;
        }
        if ((i2 & 16) != 0) {
            str3 = ttsInfos.volumeInfo;
        }
        return ttsInfos.copy(str, l2, str2, playAddress2, str3);
    }

    public final String component1() {
        return this.lang;
    }

    public final Long component2() {
        return this.languageId;
    }

    public final String component3() {
        return this.voiceType;
    }

    public final PlayAddress component4() {
        return this.playAddress;
    }

    public final String component5() {
        return this.volumeInfo;
    }

    public final TtsInfos copy(String str, Long l2, String str2, PlayAddress playAddress2, String str3) {
        return new TtsInfos(str, l2, str2, playAddress2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TtsInfos)) {
            return false;
        }
        TtsInfos ttsInfos = (TtsInfos) obj;
        return l.a(this.lang, ttsInfos.lang) && l.a(this.languageId, ttsInfos.languageId) && l.a(this.voiceType, ttsInfos.voiceType) && l.a(this.playAddress, ttsInfos.playAddress) && l.a(this.volumeInfo, ttsInfos.volumeInfo);
    }

    public final int hashCode() {
        String str = this.lang;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l2 = this.languageId;
        int hashCode2 = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str2 = this.voiceType;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        PlayAddress playAddress2 = this.playAddress;
        int hashCode4 = (hashCode3 + (playAddress2 != null ? playAddress2.hashCode() : 0)) * 31;
        String str3 = this.volumeInfo;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "TtsInfos(lang=" + this.lang + ", languageId=" + this.languageId + ", voiceType=" + this.voiceType + ", playAddress=" + this.playAddress + ", volumeInfo=" + this.volumeInfo + ")";
    }

    public final String getLang() {
        return this.lang;
    }

    public final Long getLanguageId() {
        return this.languageId;
    }

    public final PlayAddress getPlayAddress() {
        return this.playAddress;
    }

    public final String getVoiceType() {
        return this.voiceType;
    }

    public final String getVolumeInfo() {
        return this.volumeInfo;
    }

    public TtsInfos(String str, Long l2, String str2, PlayAddress playAddress2, String str3) {
        this.lang = str;
        this.languageId = l2;
        this.voiceType = str2;
        this.playAddress = playAddress2;
        this.volumeInfo = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TtsInfos(String str, Long l2, String str2, PlayAddress playAddress2, String str3, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : l2, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : playAddress2, (i2 & 16) == 0 ? str3 : null);
    }
}

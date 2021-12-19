package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.io.Serializable;

public final class MusicBeat implements Serializable {
    @c(a = "man_made_beats")
    private final String manMadeBeats;
    @c(a = "max_video_num")
    private final Integer maxVideoNum;
    @c(a = "min_video_num")
    private final Integer minVideoNum;
    @c(a = "onset_cnn")
    private final String onset_cnn;
    @c(a = StringSet.type)
    private final Integer type;

    static {
        Covode.recordClassIndex(71666);
    }

    public static /* synthetic */ MusicBeat copy$default(MusicBeat musicBeat, Integer num, Integer num2, String str, Integer num3, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = musicBeat.minVideoNum;
        }
        if ((i2 & 2) != 0) {
            num2 = musicBeat.maxVideoNum;
        }
        if ((i2 & 4) != 0) {
            str = musicBeat.manMadeBeats;
        }
        if ((i2 & 8) != 0) {
            num3 = musicBeat.type;
        }
        if ((i2 & 16) != 0) {
            str2 = musicBeat.onset_cnn;
        }
        return musicBeat.copy(num, num2, str, num3, str2);
    }

    public final Integer component1() {
        return this.minVideoNum;
    }

    public final Integer component2() {
        return this.maxVideoNum;
    }

    public final String component3() {
        return this.manMadeBeats;
    }

    public final Integer component4() {
        return this.type;
    }

    public final String component5() {
        return this.onset_cnn;
    }

    public final MusicBeat copy(Integer num, Integer num2, String str, Integer num3, String str2) {
        return new MusicBeat(num, num2, str, num3, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicBeat)) {
            return false;
        }
        MusicBeat musicBeat = (MusicBeat) obj;
        return l.a(this.minVideoNum, musicBeat.minVideoNum) && l.a(this.maxVideoNum, musicBeat.maxVideoNum) && l.a(this.manMadeBeats, musicBeat.manMadeBeats) && l.a(this.type, musicBeat.type) && l.a(this.onset_cnn, musicBeat.onset_cnn);
    }

    public final int hashCode() {
        Integer num = this.minVideoNum;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.maxVideoNum;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.manMadeBeats;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num3 = this.type;
        int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31;
        String str2 = this.onset_cnn;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "MusicBeat(minVideoNum=" + this.minVideoNum + ", maxVideoNum=" + this.maxVideoNum + ", manMadeBeats=" + this.manMadeBeats + ", type=" + this.type + ", onset_cnn=" + this.onset_cnn + ")";
    }

    public final String getManMadeBeats() {
        return this.manMadeBeats;
    }

    public final Integer getMaxVideoNum() {
        return this.maxVideoNum;
    }

    public final Integer getMinVideoNum() {
        return this.minVideoNum;
    }

    public final String getOnset_cnn() {
        return this.onset_cnn;
    }

    public final Integer getType() {
        return this.type;
    }

    public MusicBeat(Integer num, Integer num2, String str, Integer num3, String str2) {
        this.minVideoNum = num;
        this.maxVideoNum = num2;
        this.manMadeBeats = str;
        this.type = num3;
        this.onset_cnn = str2;
    }
}

package com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.music.model.Music;
import h.f.b.g;
import h.f.b.l;

public final class MusicInfoAndEffectUseCount {
    @c(a = "music_id")
    private final long musicId;
    @c(a = "music_info")
    private final Music musicInfo;
    @c(a = "effect_use_count")
    private final long useCount;

    static {
        Covode.recordClassIndex(97331);
    }

    public static int com_ss_android_ugc_gamora_recorder_choosemusic_recommend_model_MusicInfoAndEffectUseCount_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ MusicInfoAndEffectUseCount copy$default(MusicInfoAndEffectUseCount musicInfoAndEffectUseCount, long j2, long j3, Music music, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = musicInfoAndEffectUseCount.musicId;
        }
        if ((i2 & 2) != 0) {
            j3 = musicInfoAndEffectUseCount.useCount;
        }
        if ((i2 & 4) != 0) {
            music = musicInfoAndEffectUseCount.musicInfo;
        }
        return musicInfoAndEffectUseCount.copy(j2, j3, music);
    }

    public final long component1() {
        return this.musicId;
    }

    public final long component2() {
        return this.useCount;
    }

    public final Music component3() {
        return this.musicInfo;
    }

    public final MusicInfoAndEffectUseCount copy(long j2, long j3, Music music) {
        l.d(music, "");
        return new MusicInfoAndEffectUseCount(j2, j3, music);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicInfoAndEffectUseCount)) {
            return false;
        }
        MusicInfoAndEffectUseCount musicInfoAndEffectUseCount = (MusicInfoAndEffectUseCount) obj;
        return this.musicId == musicInfoAndEffectUseCount.musicId && this.useCount == musicInfoAndEffectUseCount.useCount && l.a(this.musicInfo, musicInfoAndEffectUseCount.musicInfo);
    }

    public final int hashCode() {
        int com_ss_android_ugc_gamora_recorder_choosemusic_recommend_model_MusicInfoAndEffectUseCount_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((com_ss_android_ugc_gamora_recorder_choosemusic_recommend_model_MusicInfoAndEffectUseCount_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.musicId) * 31) + com_ss_android_ugc_gamora_recorder_choosemusic_recommend_model_MusicInfoAndEffectUseCount_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.useCount)) * 31;
        Music music = this.musicInfo;
        return com_ss_android_ugc_gamora_recorder_choosemusic_recommend_model_MusicInfoAndEffectUseCount_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (music != null ? music.hashCode() : 0);
    }

    public final String toString() {
        return "MusicInfoAndEffectUseCount(musicId=" + this.musicId + ", useCount=" + this.useCount + ", musicInfo=" + this.musicInfo + ")";
    }

    public final long getMusicId() {
        return this.musicId;
    }

    public final Music getMusicInfo() {
        return this.musicInfo;
    }

    public final long getUseCount() {
        return this.useCount;
    }

    public MusicInfoAndEffectUseCount(long j2, long j3, Music music) {
        l.d(music, "");
        this.musicId = j2;
        this.useCount = j3;
        this.musicInfo = music;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MusicInfoAndEffectUseCount(long j2, long j3, Music music, int i2, g gVar) {
        this((i2 & 1) != 0 ? -1 : j2, (i2 & 2) != 0 ? 0 : j3, music);
    }
}

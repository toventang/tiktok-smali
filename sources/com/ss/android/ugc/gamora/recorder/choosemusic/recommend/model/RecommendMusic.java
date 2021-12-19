package com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.ugc.effectplatform.model.b;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class RecommendMusic extends b {
    public static final a Companion = new a((byte) 0);
    public static final RecommendMusic EMPTY = new RecommendMusic(z.INSTANCE);
    @c(a = "music_list")
    private List<MusicInfoAndEffectUseCount> musicList;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.RecommendMusic */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendMusic copy$default(RecommendMusic recommendMusic, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = recommendMusic.musicList;
        }
        return recommendMusic.copy(list);
    }

    public final List<MusicInfoAndEffectUseCount> component1() {
        return this.musicList;
    }

    public final RecommendMusic copy(List<MusicInfoAndEffectUseCount> list) {
        return new RecommendMusic(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof RecommendMusic) && l.a(this.musicList, ((RecommendMusic) obj).musicList);
        }
        return true;
    }

    public final int hashCode() {
        List<MusicInfoAndEffectUseCount> list = this.musicList;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.ss.ugc.effectplatform.model.b
    public final String toString() {
        return "RecommendMusic(musicList=" + this.musicList + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(97333);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final List<MusicInfoAndEffectUseCount> getMusicList() {
        return this.musicList;
    }

    static {
        Covode.recordClassIndex(97332);
    }

    public final void setMusicList(List<MusicInfoAndEffectUseCount> list) {
        this.musicList = list;
    }

    public RecommendMusic(List<MusicInfoAndEffectUseCount> list) {
        this.musicList = list;
    }
}

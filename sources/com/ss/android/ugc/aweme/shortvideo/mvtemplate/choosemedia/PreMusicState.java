package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.f.b.g;
import h.f.b.l;

public final class PreMusicState implements af {
    private final String preMusicFile;
    private final MusicModel preMusicModel;

    static {
        Covode.recordClassIndex(84577);
    }

    public PreMusicState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ PreMusicState copy$default(PreMusicState preMusicState, MusicModel musicModel, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            musicModel = preMusicState.preMusicModel;
        }
        if ((i2 & 2) != 0) {
            str = preMusicState.preMusicFile;
        }
        return preMusicState.copy(musicModel, str);
    }

    public final MusicModel component1() {
        return this.preMusicModel;
    }

    public final String component2() {
        return this.preMusicFile;
    }

    public final PreMusicState copy(MusicModel musicModel, String str) {
        return new PreMusicState(musicModel, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreMusicState)) {
            return false;
        }
        PreMusicState preMusicState = (PreMusicState) obj;
        return l.a(this.preMusicModel, preMusicState.preMusicModel) && l.a(this.preMusicFile, preMusicState.preMusicFile);
    }

    public final int hashCode() {
        MusicModel musicModel = this.preMusicModel;
        int i2 = 0;
        int hashCode = (musicModel != null ? musicModel.hashCode() : 0) * 31;
        String str = this.preMusicFile;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "PreMusicState(preMusicModel=" + this.preMusicModel + ", preMusicFile=" + this.preMusicFile + ")";
    }

    public final String getPreMusicFile() {
        return this.preMusicFile;
    }

    public final MusicModel getPreMusicModel() {
        return this.preMusicModel;
    }

    public PreMusicState(MusicModel musicModel, String str) {
        this.preMusicModel = musicModel;
        this.preMusicFile = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PreMusicState(MusicModel musicModel, String str, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : musicModel, (i2 & 2) != 0 ? null : str);
    }
}

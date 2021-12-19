package com.ss.android.ugc.aweme.choosemusic.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public MusicModel f70745a;

    /* renamed from: b  reason: collision with root package name */
    public int f70746b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f70747c;

    static {
        Covode.recordClassIndex(43611);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f70745a, fVar.f70745a) && this.f70746b == fVar.f70746b && this.f70747c == fVar.f70747c;
    }

    public final int hashCode() {
        MusicModel musicModel = this.f70745a;
        int hashCode = (((musicModel != null ? musicModel.hashCode() : 0) * 31) + this.f70746b) * 31;
        boolean z = this.f70747c;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "PlayMusicInfo(musicModel=" + this.f70745a + ", pageType=" + this.f70746b + ", isLoop=" + this.f70747c + ")";
    }

    public f(MusicModel musicModel, int i2, boolean z) {
        this.f70745a = musicModel;
        this.f70746b = i2;
        this.f70747c = z;
    }
}

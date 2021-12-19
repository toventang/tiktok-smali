package com.ss.android.ugc.aweme.kids.choosemusic.g;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public MusicModel f105658a;

    /* renamed from: b  reason: collision with root package name */
    public int f105659b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f105660c;

    static {
        Covode.recordClassIndex(67676);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f105658a, fVar.f105658a) && this.f105659b == fVar.f105659b && this.f105660c == fVar.f105660c;
    }

    public final int hashCode() {
        MusicModel musicModel = this.f105658a;
        int hashCode = (((musicModel != null ? musicModel.hashCode() : 0) * 31) + this.f105659b) * 31;
        boolean z = this.f105660c;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "PlayMusicInfo(musicModel=" + this.f105658a + ", pageType=" + this.f105659b + ", isLoop=" + this.f105660c + ")";
    }

    public f(MusicModel musicModel, int i2, boolean z) {
        this.f105658a = musicModel;
        this.f105659b = i2;
        this.f105660c = z;
    }
}

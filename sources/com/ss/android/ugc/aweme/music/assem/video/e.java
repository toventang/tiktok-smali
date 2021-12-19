package com.ss.android.ugc.aweme.music.assem.video;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.f.b.l;

public final class e implements j {

    /* renamed from: a  reason: collision with root package name */
    public final MusicModel f111292a;

    /* renamed from: b  reason: collision with root package name */
    public final f f111293b;

    static {
        Covode.recordClassIndex(71525);
    }

    public static e a(MusicModel musicModel, f fVar) {
        l.d(fVar, "");
        return new e(musicModel, fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f111292a, eVar.f111292a) && l.a(this.f111293b, eVar.f111293b);
    }

    public final int hashCode() {
        MusicModel musicModel = this.f111292a;
        int i2 = 0;
        int hashCode = (musicModel != null ? musicModel.hashCode() : 0) * 31;
        f fVar = this.f111293b;
        if (fVar != null) {
            i2 = fVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "MusicState(playingModel=" + this.f111292a + ", playingStatus=" + this.f111293b + ")";
    }

    public /* synthetic */ e() {
        this(null, f.Default);
    }

    private e(MusicModel musicModel, f fVar) {
        l.d(fVar, "");
        this.f111292a = musicModel;
        this.f111293b = fVar;
    }
}

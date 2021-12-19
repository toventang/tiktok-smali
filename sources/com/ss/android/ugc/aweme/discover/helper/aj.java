package com.ss.android.ugc.aweme.discover.helper;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.f.b.l;

public final class aj {

    /* renamed from: a  reason: collision with root package name */
    public final String f81076a = null;

    /* renamed from: b  reason: collision with root package name */
    public final MusicModel f81077b = null;

    static {
        Covode.recordClassIndex(50393);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj)) {
            return false;
        }
        aj ajVar = (aj) obj;
        return l.a(this.f81076a, ajVar.f81076a) && l.a(this.f81077b, ajVar.f81077b);
    }

    public final int hashCode() {
        String str = this.f81076a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        MusicModel musicModel = this.f81077b;
        if (musicModel != null) {
            i2 = musicModel.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ToVideoProgress(musicFilePath=" + this.f81076a + ", musicModel=" + this.f81077b + ")";
    }

    private aj() {
    }
}

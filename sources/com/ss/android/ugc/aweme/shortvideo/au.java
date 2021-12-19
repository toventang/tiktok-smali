package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.google.c.a.j;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import h.f.b.l;

public final class au {

    /* renamed from: a  reason: collision with root package name */
    public final j<d> f124968a;

    /* renamed from: b  reason: collision with root package name */
    public final j<MultiEditVideoStatusRecordData> f124969b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f124970c;

    static {
        Covode.recordClassIndex(82099);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au)) {
            return false;
        }
        au auVar = (au) obj;
        return l.a(this.f124968a, auVar.f124968a) && l.a(this.f124969b, auVar.f124969b) && l.a(this.f124970c, auVar.f124970c);
    }

    public final int hashCode() {
        j<d> jVar = this.f124968a;
        int i2 = 0;
        int hashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        j<MultiEditVideoStatusRecordData> jVar2 = this.f124969b;
        int hashCode2 = (hashCode + (jVar2 != null ? jVar2.hashCode() : 0)) * 31;
        Object obj = this.f124970c;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "GoNextData(avMusicWaveBean=" + this.f124968a + ", multiEditVideoStatusRecordData=" + this.f124969b + ", concatFinishedEvent=" + this.f124970c + ")";
    }

    public final d a() {
        if (this.f124968a.isPresent()) {
            return this.f124968a.get();
        }
        return null;
    }

    public final MultiEditVideoStatusRecordData b() {
        if (this.f124969b.isPresent()) {
            return this.f124969b.get();
        }
        return null;
    }

    public au(j<d> jVar, j<MultiEditVideoStatusRecordData> jVar2, Object obj) {
        l.d(jVar, "");
        l.d(jVar2, "");
        l.d(obj, "");
        this.f124968a = jVar;
        this.f124969b = jVar2;
        this.f124970c = obj;
    }
}

package com.ss.android.ugc.aweme.mediachoose.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import h.f.b.l;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final e f109351a;

    /* renamed from: b  reason: collision with root package name */
    public final List<MediaModel> f109352b;

    static {
        Covode.recordClassIndex(70040);
    }

    /* access modifiers changed from: private */
    public static d a(e eVar, List<MediaModel> list) {
        l.d(eVar, "");
        l.d(list, "");
        return new d(eVar, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f109351a, dVar.f109351a) && l.a(this.f109352b, dVar.f109352b);
    }

    public final int hashCode() {
        e eVar = this.f109351a;
        int i2 = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        List<MediaModel> list = this.f109352b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "MediaRequestData(param=" + this.f109351a + ", mediaModelList=" + this.f109352b + ")";
    }

    public d(e eVar, List<MediaModel> list) {
        l.d(eVar, "");
        l.d(list, "");
        this.f109351a = eVar;
        this.f109352b = list;
    }
}

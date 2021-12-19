package com.ss.android.ugc.aweme.c;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class c extends e {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f69586a;

    static {
        Covode.recordClassIndex(42925);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && l.a(this.f69586a, ((c) obj).f69586a);
        }
        return true;
    }

    public final int hashCode() {
        List<String> list = this.f69586a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "MVUploadFrameTaskParam(imageList=" + this.f69586a + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(List<String> list) {
        super((byte) 0);
        l.d(list, "");
        this.f69586a = list;
    }

    @Override // com.ss.android.ugc.aweme.c.e
    public final boolean a(e eVar) {
        l.d(eVar, "");
        if (l.a(eVar, this)) {
            return true;
        }
        if (!(eVar instanceof c)) {
            return false;
        }
        c cVar = (c) eVar;
        if (cVar.f69586a.size() != this.f69586a.size()) {
            return false;
        }
        return l.a(n.m(this.f69586a), n.m(cVar.f69586a));
    }
}

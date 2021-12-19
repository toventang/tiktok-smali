package com.ss.android.ugc.aweme.comment.page.tag;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import h.f.b.l;

public final class k implements a {

    /* renamed from: a  reason: collision with root package name */
    public final String f72267a;

    static {
        Covode.recordClassIndex(44549);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof k) && l.a(this.f72267a, ((k) obj).f72267a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f72267a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "TextItem(str=" + this.f72267a + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        return aVar.equals(this);
    }

    public k(String str) {
        l.d(str, "");
        this.f72267a = str;
    }
}

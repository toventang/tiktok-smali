package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import h.f.b.l;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public final String f102766a;

    static {
        Covode.recordClassIndex(65878);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e) && l.a(this.f102766a, ((e) obj).f102766a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f102766a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "TextItem(str=" + this.f102766a + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        return aVar.equals(this);
    }

    public e(String str) {
        l.d(str, "");
        this.f102766a = str;
    }
}

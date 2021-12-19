package com.ss.android.ugc.aweme.ax.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ax.a.s;
import h.f.a.q;
import h.f.b.l;
import h.k.c;
import java.util.Map;

public final class aa<T extends s> {

    /* renamed from: a  reason: collision with root package name */
    public final c<T> f67688a;

    /* renamed from: b  reason: collision with root package name */
    public final q<Uri, g, Map<String, String>, T> f67689b;

    static {
        Covode.recordClassIndex(41662);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        return l.a(this.f67688a, aaVar.f67688a) && l.a(this.f67689b, aaVar.f67689b);
    }

    public final int hashCode() {
        c<T> cVar = this.f67688a;
        int i2 = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        q<Uri, g, Map<String, String>, T> qVar = this.f67689b;
        if (qVar != null) {
            i2 = qVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SessionApi(iApi=" + this.f67688a + ", provider=" + this.f67689b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.q<? super android.net.Uri, ? super com.ss.android.ugc.aweme.ax.a.g, ? super java.util.Map<java.lang.String, java.lang.String>, ? extends T extends com.ss.android.ugc.aweme.ax.a.s> */
    /* JADX WARN: Multi-variable type inference failed */
    public aa(c<T> cVar, q<? super Uri, ? super g, ? super Map<String, String>, ? extends T> qVar) {
        l.d(cVar, "");
        l.d(qVar, "");
        this.f67688a = cVar;
        this.f67689b = qVar;
    }
}

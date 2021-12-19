package com.ss.android.ugc.aweme.compliance.business.banappeal.c;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import h.f.a.m;
import h.f.b.l;
import h.z;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f76780a;

    /* renamed from: b  reason: collision with root package name */
    public final m<DialogInterface, Integer, z> f76781b;

    static {
        Covode.recordClassIndex(47464);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f76780a, aVar.f76780a) && l.a(this.f76781b, aVar.f76781b);
    }

    public final int hashCode() {
        String str = this.f76780a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        m<DialogInterface, Integer, z> mVar = this.f76781b;
        if (mVar != null) {
            i2 = mVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "AppealDialogButtonState(title=" + this.f76780a + ", listener=" + this.f76781b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.m<? super android.content.DialogInterface, ? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(String str, m<? super DialogInterface, ? super Integer, z> mVar) {
        l.d(mVar, "");
        this.f76780a = str;
        this.f76781b = mVar;
    }
}

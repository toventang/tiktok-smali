package com.ss.android.ugc.aweme.specact.popup.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class f {
    @c(a = "calendar_info")

    /* renamed from: a  reason: collision with root package name */
    public c f134423a;
    @c(a = "subsequent_popup")

    /* renamed from: b  reason: collision with root package name */
    public i f134424b;

    static {
        Covode.recordClassIndex(87880);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f134423a, fVar.f134423a) && l.a(this.f134424b, fVar.f134424b);
    }

    public final int hashCode() {
        c cVar = this.f134423a;
        int i2 = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        i iVar = this.f134424b;
        if (iVar != null) {
            i2 = iVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "Others(calendarInfo=" + this.f134423a + ", subSequentPopup=" + this.f134424b + ")";
    }

    public /* synthetic */ f() {
        this(new c());
    }

    private f(c cVar) {
        l.d(cVar, "");
        this.f134423a = cVar;
        this.f134424b = null;
    }
}

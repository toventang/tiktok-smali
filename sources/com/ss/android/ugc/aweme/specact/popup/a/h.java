package com.ss.android.ugc.aweme.specact.popup.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class h {
    @c(a = "service_url")

    /* renamed from: a  reason: collision with root package name */
    public String f134428a;
    @c(a = "service_action")

    /* renamed from: b  reason: collision with root package name */
    public int f134429b;
    @c(a = "service_parameters")

    /* renamed from: c  reason: collision with root package name */
    public List<String> f134430c;

    static {
        Covode.recordClassIndex(87882);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f134428a, hVar.f134428a) && this.f134429b == hVar.f134429b && l.a(this.f134430c, hVar.f134430c);
    }

    public final int hashCode() {
        String str = this.f134428a;
        int i2 = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f134429b) * 31;
        List<String> list = this.f134430c;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ServiceCallActions(serviceUrl=" + this.f134428a + ", serviceAction=" + this.f134429b + ", serviceParameters=" + this.f134430c + ")";
    }

    private /* synthetic */ h() {
        this("", new ArrayList());
    }

    private h(String str, List<String> list) {
        l.d(str, "");
        l.d(list, "");
        this.f134428a = str;
        this.f134429b = 0;
        this.f134430c = list;
    }
}

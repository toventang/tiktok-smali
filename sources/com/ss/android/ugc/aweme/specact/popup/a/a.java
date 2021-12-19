package com.ss.android.ugc.aweme.specact.popup.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a {
    @c(a = "title")

    /* renamed from: a  reason: collision with root package name */
    public String f134405a;
    @c(a = "desc")

    /* renamed from: b  reason: collision with root package name */
    public String f134406b;
    @c(a = "task_infos")

    /* renamed from: c  reason: collision with root package name */
    public List<j> f134407c;

    static {
        Covode.recordClassIndex(87875);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f134405a, aVar.f134405a) && l.a(this.f134406b, aVar.f134406b) && l.a(this.f134407c, aVar.f134407c);
    }

    public final int hashCode() {
        String str = this.f134405a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f134406b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<j> list = this.f134407c;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "Body(title=" + this.f134405a + ", desc=" + this.f134406b + ", taskInfos=" + this.f134407c + ")";
    }

    private /* synthetic */ a() {
        this("", "", new ArrayList());
    }

    private a(String str, String str2, List<j> list) {
        l.d(str, "");
        l.d(str2, "");
        l.d(list, "");
        this.f134405a = str;
        this.f134406b = str2;
        this.f134407c = list;
    }
}

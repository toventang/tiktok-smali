package com.ss.android.ugc.aweme.specact.popup.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class b {
    @c(a = "button_text")

    /* renamed from: a  reason: collision with root package name */
    public String f134408a;
    @c(a = "button_link")

    /* renamed from: b  reason: collision with root package name */
    public String f134409b;
    @c(a = "button_image")

    /* renamed from: c  reason: collision with root package name */
    public String f134410c;
    @c(a = "parameters")

    /* renamed from: d  reason: collision with root package name */
    public List<String> f134411d;
    @c(a = "button_action")

    /* renamed from: e  reason: collision with root package name */
    public int f134412e;
    @c(a = "button_client_action")

    /* renamed from: f  reason: collision with root package name */
    public int f134413f;
    @c(a = "service_call_actions")

    /* renamed from: g  reason: collision with root package name */
    public List<h> f134414g;

    static {
        Covode.recordClassIndex(87876);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f134408a, bVar.f134408a) && l.a(this.f134409b, bVar.f134409b) && l.a(this.f134410c, bVar.f134410c) && l.a(this.f134411d, bVar.f134411d) && this.f134412e == bVar.f134412e && this.f134413f == bVar.f134413f && l.a(this.f134414g, bVar.f134414g);
    }

    public final int hashCode() {
        String str = this.f134408a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f134409b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f134410c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list = this.f134411d;
        int hashCode4 = (((((hashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.f134412e) * 31) + this.f134413f) * 31;
        List<h> list2 = this.f134414g;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "ButtonInfo(buttonText=" + this.f134408a + ", buttonLink=" + this.f134409b + ", buttonImage=" + this.f134410c + ", parameters=" + this.f134411d + ", buttonActionType=" + this.f134412e + ", buttonClientAction=" + this.f134413f + ", serviceCallActions=" + this.f134414g + ")";
    }

    private /* synthetic */ b() {
        this("", "", "", new ArrayList(), new ArrayList());
    }

    private b(String str, String str2, String str3, List<String> list, List<h> list2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(list, "");
        l.d(list2, "");
        this.f134408a = str;
        this.f134409b = str2;
        this.f134410c = str3;
        this.f134411d = list;
        this.f134412e = 0;
        this.f134413f = -1;
        this.f134414g = list2;
    }
}

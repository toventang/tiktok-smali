package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.util.m;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class o {
    @c(a = "payment_method_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f85334a;
    @c(a = "display_name")

    /* renamed from: b  reason: collision with root package name */
    public final String f85335b;
    @c(a = "payment_method_first_type")

    /* renamed from: c  reason: collision with root package name */
    public final String f85336c;
    @c(a = "payment_method_second_type")

    /* renamed from: d  reason: collision with root package name */
    public final String f85337d;
    @c(a = "icon_url")

    /* renamed from: e  reason: collision with root package name */
    public final String f85338e;
    @c(a = "elements")

    /* renamed from: f  reason: collision with root package name */
    public final List<e> f85339f;
    @c(a = "pci_sensitive")

    /* renamed from: g  reason: collision with root package name */
    public final Boolean f85340g;
    @c(a = "sub_payment_methods")

    /* renamed from: h  reason: collision with root package name */
    public final List<o> f85341h;
    @c(a = "is_deeplink")

    /* renamed from: i  reason: collision with root package name */
    public final Boolean f85342i;
    @c(a = "package_name")

    /* renamed from: j  reason: collision with root package name */
    public final String f85343j;
    @c(a = "is_need_install_app")

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f85344k;
    @c(a = "extra_info")

    /* renamed from: l  reason: collision with root package name */
    public final String f85345l;
    @c(a = "save_display_text")

    /* renamed from: m  reason: collision with root package name */
    public final String f85346m;
    @c(a = "masked_identity")
    public final String n;
    @c(a = "is_primary")
    public final Boolean o;
    @c(a = "payment_method_token")
    public final String p;
    @c(a = "save_notification_url")
    public final String q;
    @c(a = "needed_elements")
    public final List<e> r;
    @c(a = "balance")
    public final String s;
    @c(a = "availability")
    public final a t;
    @c(a = "bind_info")
    public final c u;

    static {
        Covode.recordClassIndex(53387);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return l.a(this.f85334a, oVar.f85334a) && l.a(this.f85335b, oVar.f85335b) && l.a(this.f85336c, oVar.f85336c) && l.a(this.f85337d, oVar.f85337d) && l.a(this.f85338e, oVar.f85338e) && l.a(this.f85339f, oVar.f85339f) && l.a(this.f85340g, oVar.f85340g) && l.a(this.f85341h, oVar.f85341h) && l.a(this.f85342i, oVar.f85342i) && l.a(this.f85343j, oVar.f85343j) && l.a(this.f85344k, oVar.f85344k) && l.a(this.f85345l, oVar.f85345l) && l.a(this.f85346m, oVar.f85346m) && l.a(this.n, oVar.n) && l.a(this.o, oVar.o) && l.a(this.p, oVar.p) && l.a(this.q, oVar.q) && l.a(this.r, oVar.r) && l.a(this.s, oVar.s) && l.a(this.t, oVar.t) && l.a(this.u, oVar.u);
    }

    public final int hashCode() {
        String str = this.f85334a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f85335b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f85336c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f85337d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f85338e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<e> list = this.f85339f;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        Boolean bool = this.f85340g;
        int hashCode7 = (hashCode6 + (bool != null ? bool.hashCode() : 0)) * 31;
        List<o> list2 = this.f85341h;
        int hashCode8 = (hashCode7 + (list2 != null ? list2.hashCode() : 0)) * 31;
        Boolean bool2 = this.f85342i;
        int hashCode9 = (hashCode8 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        String str6 = this.f85343j;
        int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Boolean bool3 = this.f85344k;
        int hashCode11 = (hashCode10 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        String str7 = this.f85345l;
        int hashCode12 = (hashCode11 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f85346m;
        int hashCode13 = (hashCode12 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.n;
        int hashCode14 = (hashCode13 + (str9 != null ? str9.hashCode() : 0)) * 31;
        Boolean bool4 = this.o;
        int hashCode15 = (hashCode14 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        String str10 = this.p;
        int hashCode16 = (hashCode15 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.q;
        int hashCode17 = (hashCode16 + (str11 != null ? str11.hashCode() : 0)) * 31;
        List<e> list3 = this.r;
        int hashCode18 = (hashCode17 + (list3 != null ? list3.hashCode() : 0)) * 31;
        String str12 = this.s;
        int hashCode19 = (hashCode18 + (str12 != null ? str12.hashCode() : 0)) * 31;
        a aVar = this.t;
        int hashCode20 = (hashCode19 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        c cVar = this.u;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return hashCode20 + i2;
    }

    public final String toString() {
        return "PaymentMethod(id=" + this.f85334a + ", displayName=" + this.f85335b + ", firstType=" + this.f85336c + ", secondType=" + this.f85337d + ", iconUrl=" + this.f85338e + ", elementDTOS=" + this.f85339f + ", pciSensitive=" + this.f85340g + ", subPaymentMethods=" + this.f85341h + ", isDeepLink=" + this.f85342i + ", packageName=" + this.f85343j + ", hideIfNotInstall=" + this.f85344k + ", extraInfo=" + this.f85345l + ", saveDisplayText=" + this.f85346m + ", maskedIdentity=" + this.n + ", isPrimary=" + this.o + ", token=" + this.p + ", saveNotificationUrl=" + this.q + ", neededElementDTOS=" + this.r + ", balance=" + this.s + ", availability=" + this.t + ", bindInfo=" + this.u + ")";
    }

    public final List<e> a() {
        List<e> list = this.f85339f;
        if (list == null) {
            return this.r;
        }
        return list;
    }

    public final boolean d() {
        if (!(!l.a((Object) this.f85344k, (Object) true))) {
            String str = this.f85343j;
            if (str == null) {
                str = "";
            }
            if (m.a(str)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final String c() {
        boolean z;
        String str = this.f85337d;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!(!z) || str == null) {
            str = this.f85336c;
        }
        if (str == null || str.length() == 0 || str == null) {
            return "unknown";
        }
        return str;
    }

    public final List<m> b() {
        ArrayList arrayList = new ArrayList();
        List<e> list = this.r;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List<e> a2 = it.next().a();
                ArrayList arrayList2 = new ArrayList(n.a((Iterable) a2, 10));
                for (T t2 : a2) {
                    arrayList2.add(new m(t2.f85288a, t2.f85293f, null, t2.f85298k, null, 16, null));
                }
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    public final boolean a(o oVar) {
        List<o> list;
        if (oVar != null && (list = this.f85341h) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (l.a(next, oVar)) {
                    if (next != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public o(String str, String str2, String str3, String str4, String str5, List<e> list, Boolean bool, List<o> list2, Boolean bool2, String str6, Boolean bool3, String str7, String str8, String str9, Boolean bool4, String str10, String str11, List<e> list3, String str12, a aVar, c cVar) {
        this.f85334a = str;
        this.f85335b = str2;
        this.f85336c = str3;
        this.f85337d = str4;
        this.f85338e = str5;
        this.f85339f = list;
        this.f85340g = bool;
        this.f85341h = list2;
        this.f85342i = bool2;
        this.f85343j = str6;
        this.f85344k = bool3;
        this.f85345l = str7;
        this.f85346m = str8;
        this.n = str9;
        this.o = bool4;
        this.p = str10;
        this.q = str11;
        this.r = list3;
        this.s = str12;
        this.t = aVar;
        this.u = cVar;
    }
}

package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.i;
import com.ss.android.ugc.aweme.ecommerce.api.model.Icon;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class e {
    public static final a o = new a((byte) 0);
    @c(a = "element")

    /* renamed from: a  reason: collision with root package name */
    public final String f85288a;
    @c(a = "icon")

    /* renamed from: b  reason: collision with root package name */
    public final Icon f85289b;
    @c(a = "inner_style_type")

    /* renamed from: c  reason: collision with root package name */
    public final Integer f85290c;
    @c(a = "frontend_rule_list")

    /* renamed from: d  reason: collision with root package name */
    public final i f85291d;
    @c(a = "display_tag")

    /* renamed from: e  reason: collision with root package name */
    public final String f85292e;
    @c(a = "param_name")

    /* renamed from: f  reason: collision with root package name */
    public final String f85293f;
    @c(a = "option_list")

    /* renamed from: g  reason: collision with root package name */
    public final List<g> f85294g;
    @c(a = "placeholder_display_name")

    /* renamed from: h  reason: collision with root package name */
    public final String f85295h;
    @c(a = "sub_element_list")

    /* renamed from: i  reason: collision with root package name */
    public final List<e> f85296i;
    @c(a = "display_name")

    /* renamed from: j  reason: collision with root package name */
    public final String f85297j;
    @c(a = "need_encryption")

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f85298k;
    @c(a = "notification_url")

    /* renamed from: l  reason: collision with root package name */
    public final String f85299l;
    @c(a = "inner_configuration")

    /* renamed from: m  reason: collision with root package name */
    public final d f85300m;
    @c(a = "description")
    public final String n;

    static {
        Covode.recordClassIndex(53376);
    }

    public e() {
        this(null, null, 16383);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f85288a, eVar.f85288a) && l.a(this.f85289b, eVar.f85289b) && l.a(this.f85290c, eVar.f85290c) && l.a(this.f85291d, eVar.f85291d) && l.a(this.f85292e, eVar.f85292e) && l.a(this.f85293f, eVar.f85293f) && l.a(this.f85294g, eVar.f85294g) && l.a(this.f85295h, eVar.f85295h) && l.a(this.f85296i, eVar.f85296i) && l.a(this.f85297j, eVar.f85297j) && l.a(this.f85298k, eVar.f85298k) && l.a(this.f85299l, eVar.f85299l) && l.a(this.f85300m, eVar.f85300m) && l.a(this.n, eVar.n);
    }

    public final int hashCode() {
        String str = this.f85288a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Icon icon = this.f85289b;
        int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 31;
        Integer num = this.f85290c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        i iVar = this.f85291d;
        int hashCode4 = (hashCode3 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        String str2 = this.f85292e;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f85293f;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<g> list = this.f85294g;
        int hashCode7 = (hashCode6 + (list != null ? list.hashCode() : 0)) * 31;
        String str4 = this.f85295h;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<e> list2 = this.f85296i;
        int hashCode9 = (hashCode8 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str5 = this.f85297j;
        int hashCode10 = (hashCode9 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Boolean bool = this.f85298k;
        int hashCode11 = (hashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str6 = this.f85299l;
        int hashCode12 = (hashCode11 + (str6 != null ? str6.hashCode() : 0)) * 31;
        d dVar = this.f85300m;
        int hashCode13 = (hashCode12 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        String str7 = this.n;
        if (str7 != null) {
            i2 = str7.hashCode();
        }
        return hashCode13 + i2;
    }

    public final String toString() {
        return "ElementDTO(id=" + this.f85288a + ", icon=" + this.f85289b + ", styleType=" + this.f85290c + ", frontendRuleList=" + this.f85291d + ", displayTag=" + this.f85292e + ", paramName=" + this.f85293f + ", optionList=" + this.f85294g + ", placeholderDisplayName=" + this.f85295h + ", subElementDTOList=" + this.f85296i + ", displayName=" + this.f85297j + ", needEncryption=" + this.f85298k + ", notificationUrl=" + this.f85299l + ", configuration=" + this.f85300m + ", description=" + this.n + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(53377);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final List<e> a() {
        List<e> list = this.f85296i;
        if (list == null || list.isEmpty()) {
            return n.a(this);
        }
        List<e> list2 = this.f85296i;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            n.a((Collection) arrayList, (Iterable) it.next().a());
        }
        return arrayList;
    }

    private e(String str, String str2) {
        this.f85288a = str;
        this.f85289b = null;
        this.f85290c = null;
        this.f85291d = null;
        this.f85292e = null;
        this.f85293f = null;
        this.f85294g = null;
        this.f85295h = null;
        this.f85296i = null;
        this.f85297j = str2;
        this.f85298k = null;
        this.f85299l = null;
        this.f85300m = null;
        this.n = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(String str, String str2, int i2) {
        this((i2 & 1) != 0 ? null : str, (i2 & 512) != 0 ? null : str2);
    }
}

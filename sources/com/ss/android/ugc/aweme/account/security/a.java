package com.ss.android.ugc.aweme.account.security;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class a {
    @c(a = "notice_id_str")

    /* renamed from: a  reason: collision with root package name */
    public final String f65301a;
    @c(a = "notice")

    /* renamed from: b  reason: collision with root package name */
    public final String f65302b;
    @c(a = "highlight")

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f65303c;
    @c(a = "has_notice")

    /* renamed from: d  reason: collision with root package name */
    public final boolean f65304d;
    @c(a = "notice_type")

    /* renamed from: e  reason: collision with root package name */
    public final String f65305e;
    @c(a = "notice_model")

    /* renamed from: f  reason: collision with root package name */
    public final String f65306f;
    @c(a = "scheme")

    /* renamed from: g  reason: collision with root package name */
    public final String f65307g;

    static {
        Covode.recordClassIndex(40155);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f65301a, aVar.f65301a) && l.a(this.f65302b, aVar.f65302b) && l.a(this.f65303c, aVar.f65303c) && this.f65304d == aVar.f65304d && l.a(this.f65305e, aVar.f65305e) && l.a(this.f65306f, aVar.f65306f) && l.a(this.f65307g, aVar.f65307g);
    }

    public final int hashCode() {
        String str = this.f65301a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f65302b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<b> list = this.f65303c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.f65304d;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode3 + i3) * 31;
        String str3 = this.f65305e;
        int hashCode4 = (i6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f65306f;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f65307g;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "SafeInfoNoticeMsg(noticeId=" + this.f65301a + ", notice=" + this.f65302b + ", highlight=" + this.f65303c + ", hasNotice=" + this.f65304d + ", noticeType=" + this.f65305e + ", noticeModel=" + this.f65306f + ", scheme=" + this.f65307g + ")";
    }

    private /* synthetic */ a() {
        this("", "", "", "", "");
    }

    private a(String str, String str2, String str3, String str4, String str5) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        this.f65301a = str;
        this.f65302b = str2;
        this.f65303c = null;
        this.f65304d = false;
        this.f65305e = str3;
        this.f65306f = str4;
        this.f65307g = str5;
    }
}

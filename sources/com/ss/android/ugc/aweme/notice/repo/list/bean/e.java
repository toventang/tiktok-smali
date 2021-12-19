package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;

public final class e {
    @c(a = "nid")

    /* renamed from: a  reason: collision with root package name */
    public final Long f112843a;
    @c(a = "notice")

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.notice.repo.list.a.c f112844b;
    @c(a = "create_time")

    /* renamed from: c  reason: collision with root package name */
    public final Long f112845c;
    @c(a = "user_id")

    /* renamed from: d  reason: collision with root package name */
    public final Long f112846d;
    @c(a = StringSet.type)

    /* renamed from: e  reason: collision with root package name */
    public final Integer f112847e;
    @c(a = "nid_str")

    /* renamed from: f  reason: collision with root package name */
    public final String f112848f;
    @c(a = "has_read")

    /* renamed from: g  reason: collision with root package name */
    public final boolean f112849g;
    @c(a = "schema_url")

    /* renamed from: h  reason: collision with root package name */
    public final String f112850h;
    @c(a = "message_extra")

    /* renamed from: i  reason: collision with root package name */
    public final String f112851i;
    @c(a = "should_keep")

    /* renamed from: j  reason: collision with root package name */
    public final boolean f112852j;
    @c(a = "actions")

    /* renamed from: k  reason: collision with root package name */
    public final a f112853k;
    @c(a = "action_meta")

    /* renamed from: l  reason: collision with root package name */
    public final String f112854l;

    /* renamed from: m  reason: collision with root package name */
    public int f112855m;
    public String n;

    static {
        Covode.recordClassIndex(72549);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f112843a, eVar.f112843a) && l.a(this.f112844b, eVar.f112844b) && l.a(this.f112845c, eVar.f112845c) && l.a(this.f112846d, eVar.f112846d) && l.a(this.f112847e, eVar.f112847e) && l.a(this.f112848f, eVar.f112848f) && this.f112849g == eVar.f112849g && l.a(this.f112850h, eVar.f112850h) && l.a(this.f112851i, eVar.f112851i) && this.f112852j == eVar.f112852j && l.a(this.f112853k, eVar.f112853k) && l.a(this.f112854l, eVar.f112854l) && this.f112855m == eVar.f112855m && l.a(this.n, eVar.n);
    }

    public final int hashCode() {
        Long l2 = this.f112843a;
        int i2 = 0;
        int hashCode = (l2 != null ? l2.hashCode() : 0) * 31;
        com.ss.android.ugc.aweme.notice.repo.list.a.c cVar = this.f112844b;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        Long l3 = this.f112845c;
        int hashCode3 = (hashCode2 + (l3 != null ? l3.hashCode() : 0)) * 31;
        Long l4 = this.f112846d;
        int hashCode4 = (hashCode3 + (l4 != null ? l4.hashCode() : 0)) * 31;
        Integer num = this.f112847e;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f112848f;
        int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f112849g;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode6 + i4) * 31;
        String str2 = this.f112850h;
        int hashCode7 = (i7 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f112851i;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 31;
        if (!this.f112852j) {
            i3 = 0;
        }
        int i8 = (hashCode8 + i3) * 31;
        a aVar = this.f112853k;
        int hashCode9 = (i8 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str4 = this.f112854l;
        int hashCode10 = (((hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f112855m) * 31;
        String str5 = this.n;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode10 + i2;
    }

    public final String toString() {
        return "GeneralTemplateNotice(nid=" + this.f112843a + ", uiTemplate=" + this.f112844b + ", createTime=" + this.f112845c + ", userId=" + this.f112846d + ", type=" + this.f112847e + ", nidStr=" + this.f112848f + ", hasRead=" + this.f112849g + ", schemaUrl=" + this.f112850h + ", messageExtra=" + this.f112851i + ", shouldKeep=" + this.f112852j + ", actions=" + this.f112853k + ", actionMeta=" + this.f112854l + ", groupType=" + this.f112855m + ", accountType=" + this.n + ")";
    }
}

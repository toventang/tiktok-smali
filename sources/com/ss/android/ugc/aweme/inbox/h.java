package com.ss.android.ugc.aweme.inbox;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class h {
    @c(a = "enter_inbox_meta")

    /* renamed from: a  reason: collision with root package name */
    public final g f104286a;
    @c(a = "expand_meta")

    /* renamed from: b  reason: collision with root package name */
    public final g f104287b;
    @c(a = "notice_display_count")

    /* renamed from: c  reason: collision with root package name */
    public final int f104288c;
    @c(a = "notice_display_recently")

    /* renamed from: d  reason: collision with root package name */
    public final int f104289d;
    @c(a = "dm_no_update_days")

    /* renamed from: e  reason: collision with root package name */
    public final int f104290e;
    @c(a = "dm_no_update_display_count")

    /* renamed from: f  reason: collision with root package name */
    public final int f104291f;

    static {
        Covode.recordClassIndex(66782);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f104286a, hVar.f104286a) && l.a(this.f104287b, hVar.f104287b) && this.f104288c == hVar.f104288c && this.f104289d == hVar.f104289d && this.f104290e == hVar.f104290e && this.f104291f == hVar.f104291f;
    }

    public final int hashCode() {
        g gVar = this.f104286a;
        int i2 = 0;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        g gVar2 = this.f104287b;
        if (gVar2 != null) {
            i2 = gVar2.hashCode();
        }
        return ((((((((hashCode + i2) * 31) + this.f104288c) * 31) + this.f104289d) * 31) + this.f104290e) * 31) + this.f104291f;
    }

    public final String toString() {
        return "InboxCollapseMetas(enterInboxMeta=" + this.f104286a + ", expandMeta=" + this.f104287b + ", noticeDisplayCount=" + this.f104288c + ", noticeDisplayRecently=" + this.f104289d + ", dmNoUpdateDays=" + this.f104290e + ", dmNoUpdateDisplayCount=" + this.f104291f + ")";
    }

    public /* synthetic */ h() {
        this(new g((byte) 0), new g((byte) 0));
    }

    private h(g gVar, g gVar2) {
        l.d(gVar, "");
        l.d(gVar2, "");
        this.f104286a = gVar;
        this.f104287b = gVar2;
        this.f104288c = 3;
        this.f104289d = 24;
        this.f104290e = 14;
        this.f104291f = 4;
    }
}

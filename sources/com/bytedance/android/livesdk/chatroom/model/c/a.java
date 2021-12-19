package com.bytedance.android.livesdk.chatroom.model.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class a {
    @c(a = "layout")

    /* renamed from: a  reason: collision with root package name */
    public int f15740a;
    @c(a = "fix_mic_num")

    /* renamed from: b  reason: collision with root package name */
    public int f15741b;
    @c(a = "allow_request_from_user")

    /* renamed from: c  reason: collision with root package name */
    public int f15742c;
    @c(a = "allow_request_from_follower_only")

    /* renamed from: d  reason: collision with root package name */
    public int f15743d;

    static {
        Covode.recordClassIndex(8691);
    }

    public a(byte b2) {
        this();
    }

    /* access modifiers changed from: private */
    public static a a(int i2, int i3, int i4, int i5) {
        return new a(i2, i3, i4, i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f15740a == aVar.f15740a && this.f15741b == aVar.f15741b && this.f15742c == aVar.f15742c && this.f15743d == aVar.f15743d;
    }

    public final int hashCode() {
        return (((((this.f15740a * 31) + this.f15741b) * 31) + this.f15742c) * 31) + this.f15743d;
    }

    public final String toString() {
        return "MultiLiveAnchorPanelSettings(layoutType=" + this.f15740a + ", fixMicNumAction=" + this.f15741b + ", allowViewerReq=" + this.f15742c + ", onlyAllowFollowerReq=" + this.f15743d + ")";
    }

    public /* synthetic */ a() {
        this(0, 0, 0, 0);
    }

    private a(int i2, int i3, int i4, int i5) {
        this.f15740a = i2;
        this.f15741b = i3;
        this.f15742c = i4;
        this.f15743d = i5;
    }
}

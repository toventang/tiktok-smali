package com.ss.android.ugc.aweme.publish.api;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {
    @com.google.gson.a.c(a = "video_id")

    /* renamed from: a  reason: collision with root package name */
    public final long f118616a;
    @com.google.gson.a.c(a = "author_id")

    /* renamed from: b  reason: collision with root package name */
    public final long f118617b;
    @com.google.gson.a.c(a = "author_nickname")

    /* renamed from: c  reason: collision with root package name */
    public final String f118618c;
    @com.google.gson.a.c(a = "sec_author_uid")

    /* renamed from: d  reason: collision with root package name */
    public final String f118619d;
    @com.google.gson.a.c(a = "video_status")

    /* renamed from: e  reason: collision with root package name */
    public final int f118620e;
    @com.google.gson.a.c(a = "is_author_private_account")

    /* renamed from: f  reason: collision with root package name */
    public final int f118621f;
    @com.google.gson.a.c(a = "author_unique_id")

    /* renamed from: g  reason: collision with root package name */
    public final String f118622g;

    static {
        Covode.recordClassIndex(77032);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f118616a == cVar.f118616a && this.f118617b == cVar.f118617b && l.a(this.f118618c, cVar.f118618c) && l.a(this.f118619d, cVar.f118619d) && this.f118620e == cVar.f118620e && this.f118621f == cVar.f118621f && l.a(this.f118622g, cVar.f118622g);
    }

    public final String toString() {
        return "VideoRelatedInfo(awemeId=" + this.f118616a + ", authorId=" + this.f118617b + ", authorNickName=" + this.f118618c + ", authorSecUid=" + this.f118619d + ", videoStatus=" + this.f118620e + ", isPrivateAccount=" + this.f118621f + ", uniqueId=" + this.f118622g + ")";
    }

    public final int hashCode() {
        int i2;
        int i3;
        long j2 = this.f118616a;
        long j3 = this.f118617b;
        int i4 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str = this.f118618c;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i4 + i2) * 31;
        String str2 = this.f118619d;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (((((i6 + i3) * 31) + this.f118620e) * 31) + this.f118621f) * 31;
        String str3 = this.f118622g;
        if (str3 != null) {
            i5 = str3.hashCode();
        }
        return i7 + i5;
    }
}

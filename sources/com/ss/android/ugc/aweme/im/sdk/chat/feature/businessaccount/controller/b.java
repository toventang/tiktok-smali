package com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final long f100384a;

    /* renamed from: b  reason: collision with root package name */
    public int f100385b;

    /* renamed from: c  reason: collision with root package name */
    public String f100386c;

    /* renamed from: d  reason: collision with root package name */
    public String f100387d;

    /* renamed from: e  reason: collision with root package name */
    public final String f100388e;

    static {
        Covode.recordClassIndex(64133);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f100384a == bVar.f100384a && this.f100385b == bVar.f100385b && l.a(this.f100386c, bVar.f100386c) && l.a(this.f100387d, bVar.f100387d) && l.a(this.f100388e, bVar.f100388e);
    }

    public final String toString() {
        return "KeywordMessage(messageId=" + this.f100384a + ", status=" + this.f100385b + ", keyword=" + this.f100386c + ", content=" + this.f100387d + ", message=" + this.f100388e + ")";
    }

    public final int hashCode() {
        int i2;
        int i3;
        long j2 = this.f100384a;
        int i4 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + this.f100385b) * 31;
        String str = this.f100386c;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i4 + i2) * 31;
        String str2 = this.f100387d;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        String str3 = this.f100388e;
        if (str3 != null) {
            i5 = str3.hashCode();
        }
        return i7 + i5;
    }

    public /* synthetic */ b(long j2, int i2, String str, String str2) {
        this(j2, i2, str, str2, null);
    }

    public b(long j2, int i2, String str, String str2, String str3) {
        this.f100384a = j2;
        this.f100385b = i2;
        this.f100386c = str;
        this.f100387d = str2;
        this.f100388e = str3;
    }
}

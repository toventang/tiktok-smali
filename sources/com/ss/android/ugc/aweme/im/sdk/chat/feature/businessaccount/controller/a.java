package com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Long f100380a;

    /* renamed from: b  reason: collision with root package name */
    public final int f100381b;

    /* renamed from: c  reason: collision with root package name */
    public final String f100382c;

    /* renamed from: d  reason: collision with root package name */
    public final String f100383d;

    static {
        Covode.recordClassIndex(64132);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f100380a, aVar.f100380a) && this.f100381b == aVar.f100381b && l.a(this.f100382c, aVar.f100382c) && l.a(this.f100383d, aVar.f100383d);
    }

    public final int hashCode() {
        Long l2 = this.f100380a;
        int i2 = 0;
        int hashCode = (((l2 != null ? l2.hashCode() : 0) * 31) + this.f100381b) * 31;
        String str = this.f100382c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f100383d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "AutoMessage(wslMsgId=" + this.f100380a + ", status=" + this.f100381b + ", content=" + this.f100382c + ", message=" + this.f100383d + ")";
    }

    public /* synthetic */ a(Long l2, int i2, String str) {
        this(l2, i2, str, null);
    }

    public static /* synthetic */ a a(a aVar, int i2, String str) {
        Long l2 = aVar.f100380a;
        String str2 = aVar.f100383d;
        l.d(str, "");
        return new a(l2, i2, str, str2);
    }

    public a(Long l2, int i2, String str, String str2) {
        l.d(str, "");
        this.f100380a = l2;
        this.f100381b = i2;
        this.f100382c = str;
        this.f100383d = str2;
    }
}

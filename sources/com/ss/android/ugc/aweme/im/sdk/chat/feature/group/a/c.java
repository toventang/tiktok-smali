package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f100523a;

    /* renamed from: b  reason: collision with root package name */
    public final String f100524b;

    /* renamed from: c  reason: collision with root package name */
    public final String f100525c;

    static {
        Covode.recordClassIndex(64269);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f100523a, cVar.f100523a) && l.a(this.f100524b, cVar.f100524b) && l.a(this.f100525c, cVar.f100525c);
    }

    public final int hashCode() {
        String str = this.f100523a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f100524b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f100525c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "MemberFetchParam(conversationId=" + this.f100523a + ", sender=" + this.f100524b + ", secSender=" + this.f100525c + ")";
    }

    public c(String str, String str2, String str3) {
        l.d(str2, "");
        this.f100523a = str;
        this.f100524b = str2;
        this.f100525c = str3;
    }
}

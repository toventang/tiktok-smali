package com.ss.android.ugc.aweme.im.sdk.chat.data.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.m.a;
import h.f.b.l;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f100244a;

    static {
        Covode.recordClassIndex(63902);
    }

    private /* synthetic */ d() {
        this("ChatRoomLogger");
    }

    public d(String str) {
        l.d(str, "");
        this.f100244a = str;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.c.c
    public final void a(String str) {
        l.d(str, "");
        a.b(this.f100244a, str);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.c.c
    public final void b(String str) {
        l.d(str, "");
        a.c(this.f100244a, str);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.c.c
    public final void c(String str) {
        l.d(str, "");
        a.e(this.f100244a, str);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.c.c
    public final void a(Throwable th) {
        l.d(th, "");
        a.a(this.f100244a, th);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.c.c
    public final void a(String str, Throwable th) {
        l.d(str, "");
        l.d(th, "");
        a.a(this.f100244a, str, th);
    }
}

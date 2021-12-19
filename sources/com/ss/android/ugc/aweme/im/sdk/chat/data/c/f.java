package com.ss.android.ugc.aweme.im.sdk.chat.data.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.im.core.d.h;
import com.ss.android.ugc.aweme.im.sdk.chat.data.d.ac;
import com.ss.android.ugc.aweme.im.sdk.chat.data.d.ad;
import f.a.ab;
import f.a.af;
import f.a.n;
import f.a.q;
import h.f.b.l;
import java.util.Map;
import java.util.concurrent.Callable;

public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final a f100245a;

    static {
        Covode.recordClassIndex(63904);
    }

    public /* synthetic */ f() {
        this(a.C0745a.a());
    }

    private f(a aVar) {
        l.d(aVar, "");
        this.f100245a = aVar;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.c.e
    public final b a(String str) {
        l.d(str, "");
        return b.a.a(str);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.c.e
    public final void e(String str) {
        l.d(str, "");
        this.f100245a.c(str);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.c.e
    public final boolean f(String str) {
        l.d(str, "");
        return this.f100245a.d(str);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.c.e
    public final n<h> b(String str) {
        l.d(str, "");
        a aVar = this.f100245a;
        l.d(aVar, "");
        l.d(str, "");
        n<h> a2 = n.a((Callable) new ac.b(aVar, str));
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.c.e
    public final n<h> c(String str) {
        l.d(str, "");
        a aVar = this.f100245a;
        l.d(aVar, "");
        l.d(str, "");
        n<h> a2 = n.a((Callable) new ac.a(aVar, str));
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.c.e
    public final ab<h> d(String str) {
        l.d(str, "");
        a aVar = this.f100245a;
        l.d(aVar, "");
        l.d(str, "");
        ab<h> a2 = ab.a((af) new ac.c(aVar, str));
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.c.e
    public final f.a.b a(String str, Map<String, String> map) {
        l.d(str, "");
        l.d(map, "");
        b a2 = a(str);
        l.d(a2, "");
        l.d(map, "");
        n a3 = n.a((q) new ad.a(a2, map));
        l.b(a3, "");
        f.a.b b2 = a3.b();
        l.b(b2, "");
        return b2;
    }
}

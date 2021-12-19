package com.ss.android.ugc.aweme.im.sdk.chat.data.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.im.sdk.chat.data.a.a;
import h.f.b.l;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public a f100243a;

    static {
        Covode.recordClassIndex(63900);
    }

    public b(a aVar) {
        l.d(aVar, "");
        this.f100243a = aVar;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.c.a
    public final ai a(String str, long j2) {
        l.d(str, "");
        return this.f100243a.a(str, j2);
    }
}

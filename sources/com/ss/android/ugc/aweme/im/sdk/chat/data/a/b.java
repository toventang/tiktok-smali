package com.ss.android.ugc.aweme.im.sdk.chat.data.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.f;
import com.bytedance.im.core.d.ai;
import h.f.b.l;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public f f100239a;

    static {
        Covode.recordClassIndex(63895);
    }

    public /* synthetic */ b() {
        this(f.a.a());
    }

    private b(f fVar) {
        l.d(fVar, "");
        this.f100239a = fVar;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.a.a
    public final ai a(String str, long j2) {
        l.d(str, "");
        return this.f100239a.a(str, j2);
    }
}

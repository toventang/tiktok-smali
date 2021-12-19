package com.bytedance.android.livesdk.rank.impl.f;

import com.bytedance.android.livesdk.rank.impl.f.c;
import com.bytedance.android.livesdkapi.depend.b.a;
import com.bytedance.covode.number.Covode;
import f.a.d.k;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements k {

    /* renamed from: a  reason: collision with root package name */
    private final c.a f20717a;

    static {
        Covode.recordClassIndex(12251);
    }

    i(c.a aVar) {
        this.f20717a = aVar;
    }

    @Override // f.a.d.k
    public final boolean a(Object obj) {
        return this.f20717a.c().f20593a.isFollowing() != ((a) obj).f22946a.b();
    }
}

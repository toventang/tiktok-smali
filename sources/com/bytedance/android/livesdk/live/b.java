package com.bytedance.android.livesdk.live;

import com.bytedance.android.livesdkapi.g.f;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements f.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f18653a;

    static {
        Covode.recordClassIndex(10449);
    }

    b(a aVar) {
        this.f18653a = aVar;
    }

    @Override // com.bytedance.android.livesdkapi.g.f.a
    public final void c() {
        this.f18653a.notifyDataSetChanged();
    }
}

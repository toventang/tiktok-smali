package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.c;
import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import f.a.d.g;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements g {

    /* renamed from: a  reason: collision with root package name */
    static final g f14933a = new e();

    static {
        Covode.recordClassIndex(8290);
    }

    private e() {
    }

    @Override // f.a.d.g
    public final Object apply(Object obj) {
        d dVar = (d) obj;
        c cVar = new c();
        cVar.f12144a = dVar.statusCode;
        cVar.f12146c = dVar.extra;
        cVar.f12147d = dVar.error;
        cVar.f12145b = ((com.bytedance.android.livesdk.chatroom.model.b.g) dVar.data).f15736a;
        return cVar;
    }
}

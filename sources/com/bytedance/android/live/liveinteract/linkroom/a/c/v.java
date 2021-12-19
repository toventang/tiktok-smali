package com.bytedance.android.live.liveinteract.linkroom.a.c;

import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class v implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f10530a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkApi.e f10531b;

    static {
        Covode.recordClassIndex(5612);
    }

    v(b bVar, LinkApi.e eVar) {
        this.f10530a = bVar;
        this.f10531b = eVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f10530a.a(this.f10531b, (Throwable) obj);
    }
}

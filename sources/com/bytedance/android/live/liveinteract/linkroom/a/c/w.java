package com.bytedance.android.live.liveinteract.linkroom.a.c;

import androidx.lifecycle.m;
import com.bytedance.android.live.liveinteract.linkroom.a.c.b;
import com.bytedance.android.live.liveinteract.multiguest.a.c.a;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.g;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class w implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f10532a;

    static {
        Covode.recordClassIndex(5613);
    }

    w(b bVar) {
        this.f10532a = bVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        b bVar = this.f10532a;
        a.a((g) ((d) obj).data, ((b.a) bVar.y).getContext(), (m) bVar.y);
    }
}

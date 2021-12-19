package com.bytedance.android.livesdk.chatroom.detail;

import com.bytedance.android.live.a.a.b.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f15233a;

    static {
        Covode.recordClassIndex(8436);
    }

    d(b bVar) {
        this.f15233a = bVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        b bVar = this.f15233a;
        Throwable th = (Throwable) obj;
        if (!bVar.f15229c) {
            return;
        }
        if (th instanceof a) {
            a aVar = (a) th;
            bVar.a(aVar.getErrorCode(), aVar.getErrorMsg());
            return;
        }
        bVar.a(0, th.toString());
    }
}

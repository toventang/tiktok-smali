package com.bytedance.android.livesdk.survey.ui.a;

import com.bytedance.android.livesdk.survey.ui.a;
import com.bytedance.android.livesdk.survey.ui.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class r extends c {

    /* renamed from: j  reason: collision with root package name */
    private boolean f21571j;

    static {
        Covode.recordClassIndex(12722);
    }

    @Override // com.bytedance.android.livesdk.survey.ui.a.c, com.bytedance.android.livesdk.survey.ui.a.a
    public final boolean f() {
        if (!l()) {
            return false;
        }
        if (!this.f21571j) {
            this.f21571j = true;
            this.f21537g = true;
            a(a.EnumC0473a.QUESTION);
            k();
            d();
            this.f21534d.a(this.f21531a);
            this.f21534d.a();
            return true;
        } else if (this.f21536f != a.EnumC0473a.DISMISSED) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.survey.ui.a.c
    public final g m() {
        g gVar = new g(this.f21538h, ((c) this).f21548i);
        gVar.a(new o());
        gVar.a(new i());
        gVar.a(new w());
        gVar.a(new n());
        gVar.a(new m());
        gVar.a(new d());
        gVar.a(new j());
        gVar.a(new u());
        gVar.a(new p());
        return gVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(DataChannel dataChannel, b<? super Boolean, z> bVar, h.f.a.a<z> aVar, h.f.a.a<z> aVar2, b<? super a.C0471a.EnumC0472a, z> bVar2) {
        super(dataChannel, bVar, aVar, aVar2, bVar2);
        l.d(dataChannel, "");
        l.d(bVar, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(bVar2, "");
    }
}

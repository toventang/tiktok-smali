package com.bytedance.android.livesdk.survey.ui.a;

import com.bytedance.android.livesdk.survey.ui.a;
import com.bytedance.android.livesdk.survey.ui.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public class c extends a {

    /* renamed from: i  reason: collision with root package name */
    public final b<Boolean, z> f21548i = new a(this);

    /* renamed from: j  reason: collision with root package name */
    private final g f21549j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f21550k;

    static {
        Covode.recordClassIndex(12689);
    }

    @Override // com.bytedance.android.livesdk.survey.ui.a.a
    public final void e() {
        a(a.C0471a.EnumC0472a.CANCEL);
    }

    @Override // com.bytedance.android.livesdk.survey.ui.a.a
    public final void g() {
        a(a.C0471a.EnumC0472a.CANCEL);
    }

    @Override // com.bytedance.android.livesdk.survey.ui.a.a
    public final void i() {
        a(a.C0471a.EnumC0472a.CANCEL);
    }

    @Override // com.bytedance.android.livesdk.survey.ui.a.a
    public final void j() {
        a(a.C0471a.EnumC0472a.NOT_LOG);
    }

    /* access modifiers changed from: protected */
    public final boolean l() {
        return this.f21549j.a();
    }

    @Override // com.bytedance.android.livesdk.survey.ui.a.a
    public final void h() {
        a(a.EnumC0473a.QUESTION);
        k();
        d();
        this.f21534d.a(this.f21531a);
        this.f21534d.a();
    }

    public final void k() {
        if (this.f21549j.a()) {
            super.a(true);
        } else {
            b();
        }
    }

    @Override // com.bytedance.android.livesdk.survey.ui.a.a
    public boolean f() {
        if (!this.f21549j.a() || this.f21550k) {
            return false;
        }
        this.f21550k = true;
        this.f21537g = true;
        a(a.EnumC0473a.QUESTION);
        k();
        d();
        this.f21534d.a(this.f21531a);
        this.f21534d.a();
        return true;
    }

    /* access modifiers changed from: protected */
    public g m() {
        g gVar = new g(this.f21538h, this.f21548i);
        gVar.a(new o());
        gVar.a(new i());
        gVar.a(new t());
        gVar.a(new w());
        gVar.a(new n());
        gVar.a(new m());
        gVar.a(new k());
        gVar.a(new e());
        gVar.a(new s());
        gVar.a(new h());
        gVar.a(new j());
        return gVar;
    }

    static final class a extends m implements b<Boolean, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(12690);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.this$0.a();
            } else if (this.this$0.f21536f == a.EnumC0473a.HOLD) {
                this.this$0.b();
            } else {
                this.this$0.a(a.C0471a.EnumC0472a.CANCEL);
            }
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(DataChannel dataChannel, b<? super Boolean, z> bVar, h.f.a.a<z> aVar, h.f.a.a<z> aVar2, b<? super a.C0471a.EnumC0472a, z> bVar2) {
        super(dataChannel, bVar, aVar, aVar2, bVar2);
        l.d(dataChannel, "");
        l.d(bVar, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(bVar2, "");
        g m2 = m();
        this.f21549j = m2;
        m2.b();
    }
}

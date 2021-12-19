package com.bytedance.android.livesdk.survey.ui.a;

import com.bytedance.android.livesdk.survey.ui.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;
import h.f.b.m;
import h.z;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final long f21531a = 10;

    /* renamed from: b  reason: collision with root package name */
    public long f21532b = -1;

    /* renamed from: c  reason: collision with root package name */
    public final com.bytedance.android.livesdk.survey.b.a f21533c = new com.bytedance.android.livesdk.survey.b.a(1, new c(this));

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.android.livesdk.survey.b.a f21534d = new com.bytedance.android.livesdk.survey.b.a(10, new d(this));

    /* renamed from: e  reason: collision with root package name */
    public final com.bytedance.android.livesdk.survey.b.a f21535e = new com.bytedance.android.livesdk.survey.b.a(1, new b(this));

    /* renamed from: f  reason: collision with root package name */
    public EnumC0473a f21536f = EnumC0473a.HOLD;

    /* renamed from: g  reason: collision with root package name */
    public boolean f21537g;

    /* renamed from: h  reason: collision with root package name */
    public final DataChannel f21538h;

    /* renamed from: i  reason: collision with root package name */
    private final long f21539i = 1;

    /* renamed from: j  reason: collision with root package name */
    private final h.f.a.b<Boolean, z> f21540j;

    /* renamed from: k  reason: collision with root package name */
    private final h.f.a.a<z> f21541k;

    /* renamed from: l  reason: collision with root package name */
    private final h.f.a.a<z> f21542l;

    /* renamed from: m  reason: collision with root package name */
    private final h.f.a.b<a.C0471a.EnumC0472a, z> f21543m;

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a.a$a  reason: collision with other inner class name */
    public enum EnumC0473a {
        HOLD,
        QUESTION,
        FEEDBACK,
        DISMISSED;

        static {
            Covode.recordClassIndex(12684);
        }
    }

    static {
        Covode.recordClassIndex(12683);
    }

    public abstract void e();

    public abstract boolean f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(12685);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.j();
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(12686);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.h();
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(12687);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.i();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    public final void d() {
        if (this.f21537g) {
            this.f21541k.invoke();
        }
    }

    public final void c() {
        a(EnumC0473a.FEEDBACK);
        this.f21534d.c();
        this.f21535e.a(this.f21539i);
        this.f21535e.a();
    }

    public final void b() {
        b(a.C0471a.EnumC0472a.NOT_LOG);
        this.f21537g = false;
        int i2 = b.f21547b[this.f21536f.ordinal()];
        if (i2 == 1) {
            this.f21533c.b();
        } else if (i2 == 2) {
            this.f21534d.b();
        } else if (i2 == 3) {
            this.f21535e.b();
        }
    }

    public final void a() {
        this.f21537g = true;
        int i2 = b.f21546a[this.f21536f.ordinal()];
        if (i2 == 1) {
            b(a.C0471a.EnumC0472a.NOT_LOG);
            if (this.f21532b >= 0) {
                this.f21533c.a();
            }
        } else if (i2 == 2) {
            this.f21534d.a();
            a(false);
            d();
        } else if (i2 != 3) {
            b(a.C0471a.EnumC0472a.NOT_LOG);
        } else {
            this.f21534d.c();
            this.f21535e.a();
            a(false);
            if (this.f21537g) {
                this.f21542l.invoke();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(EnumC0473a aVar) {
        l.d(aVar, "");
        this.f21536f = aVar;
    }

    private void b(a.C0471a.EnumC0472a aVar) {
        l.d(aVar, "");
        if (this.f21537g) {
            this.f21543m.invoke(aVar);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        if (this.f21537g) {
            this.f21540j.invoke(Boolean.valueOf(z));
        }
    }

    public final void a(a.C0471a.EnumC0472a aVar) {
        l.d(aVar, "");
        if (this.f21536f != EnumC0473a.DISMISSED) {
            this.f21533c.c();
            this.f21534d.c();
            this.f21535e.c();
            a(EnumC0473a.DISMISSED);
            b(aVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: h.f.a.b<? super com.bytedance.android.livesdk.survey.ui.a$a$a, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(DataChannel dataChannel, h.f.a.b<? super Boolean, z> bVar, h.f.a.a<z> aVar, h.f.a.a<z> aVar2, h.f.a.b<? super a.C0471a.EnumC0472a, z> bVar2) {
        l.d(dataChannel, "");
        l.d(bVar, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(bVar2, "");
        this.f21538h = dataChannel;
        this.f21540j = bVar;
        this.f21541k = aVar;
        this.f21542l = aVar2;
        this.f21543m = bVar2;
    }
}

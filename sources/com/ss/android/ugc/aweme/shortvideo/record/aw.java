package com.ss.android.ugc.aweme.shortvideo.record;

import android.content.Context;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.context.c;
import com.ss.android.ugc.asve.context.d;
import com.ss.android.ugc.asve.context.f;
import com.ss.android.ugc.asve.context.g;
import com.ss.android.ugc.asve.context.h;
import com.ss.android.ugc.asve.recorder.e;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import h.f.b.l;
import h.f.b.m;
import h.p;

public final class aw implements h {
    public final CameraComponentModel A;
    public final h.f.a.a<Workspace> B;
    private e C;
    private p<Integer, Integer> D;
    private h.f.a.a<Boolean> E;

    /* renamed from: a  reason: collision with root package name */
    public boolean f130071a;

    /* renamed from: b  reason: collision with root package name */
    public long f130072b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.asve.context.a f130073c = new com.ss.android.ugc.asve.context.a();

    /* renamed from: d  reason: collision with root package name */
    public boolean f130074d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f130075e;

    /* renamed from: f  reason: collision with root package name */
    public final au f130076f;

    /* renamed from: g  reason: collision with root package name */
    public final Void f130077g;

    /* renamed from: h  reason: collision with root package name */
    public final aq f130078h;

    /* renamed from: i  reason: collision with root package name */
    public final t f130079i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f130080j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f130081k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f130082l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f130083m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public final Context z;

    static {
        Covode.recordClassIndex(85348);
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw)) {
            return false;
        }
        aw awVar = (aw) obj;
        return l.a(this.z, awVar.z) && l.a(this.A, awVar.A) && l.a(this.B, awVar.B);
    }

    public final int hashCode() {
        Context context = this.z;
        int i2 = 0;
        int hashCode = (context != null ? context.hashCode() : 0) * 31;
        CameraComponentModel cameraComponentModel = this.A;
        int hashCode2 = (hashCode + (cameraComponentModel != null ? cameraComponentModel.hashCode() : 0)) * 31;
        h.f.a.a<Workspace> aVar = this.B;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode2 + i2;
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final boolean q() {
        return false;
    }

    public final String toString() {
        return "RecorderContext(context=" + this.z + ", cameraComponentModel=" + this.A + ", workspaceAllocator=" + this.B + ")";
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final boolean A() {
        return this.x;
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final boolean B() {
        return this.y;
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final boolean a() {
        return this.f130074d;
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final boolean b() {
        return this.f130075e;
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final e e() {
        return this.C;
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final p<Integer, Integer> f() {
        return this.D;
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final boolean g() {
        return this.f130081k;
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final boolean h() {
        return this.n;
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final boolean i() {
        return this.f130083m;
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final boolean j() {
        return this.f130080j;
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final h.f.a.a<Boolean> k() {
        return this.E;
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final /* bridge */ /* synthetic */ f l() {
        return this.f130078h;
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final /* bridge */ /* synthetic */ g m() {
        return this.f130076f;
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final /* bridge */ /* synthetic */ d n() {
        return this.f130079i;
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final /* bridge */ /* synthetic */ c o() {
        return this.f130073c;
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final boolean p() {
        return this.o;
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final boolean r() {
        return this.f130071a;
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final long s() {
        return this.f130072b;
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final boolean t() {
        return this.q;
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final int u() {
        return this.r;
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final boolean v() {
        return this.t;
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final boolean w() {
        return this.p;
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final boolean x() {
        return this.u;
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final boolean y() {
        return this.v;
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final boolean z() {
        return this.w;
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f130084a = new a();

        static {
            Covode.recordClassIndex(85349);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return false;
        }
    }

    @Override // com.ss.android.ugc.asve.context.h
    public final /* bridge */ /* synthetic */ SurfaceHolder d() {
        return (SurfaceHolder) this.f130077g;
    }

    public final void a(com.ss.android.ugc.asve.context.a aVar) {
        l.d(aVar, "");
        this.f130073c = aVar;
    }

    public final void a(h.f.a.a<Boolean> aVar) {
        l.d(aVar, "");
        this.E = aVar;
    }

    public aw(Context context, CameraComponentModel cameraComponentModel, h.f.a.a<Workspace> aVar) {
        l.d(context, "");
        l.d(cameraComponentModel, "");
        l.d(aVar, "");
        this.z = context;
        this.A = cameraComponentModel;
        this.B = aVar;
        Workspace workspace = cameraComponentModel.f124713h;
        this.C = new c(workspace == null ? aVar.invoke() : workspace);
        this.f130076f = new au(cameraComponentModel);
        this.f130078h = new aq(cameraComponentModel);
        this.f130079i = new t(cameraComponentModel);
        this.D = new p<>(Integer.valueOf(cameraComponentModel.f124708c), Integer.valueOf(cameraComponentModel.f124709d));
        this.f130080j = cameraComponentModel.a();
        this.f130082l = true;
        this.E = a.f130084a;
        this.q = cameraComponentModel.l();
        this.x = cameraComponentModel.F;
    }
}

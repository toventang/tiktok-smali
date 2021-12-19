package com.ss.android.ugc.asve.recorder.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.Surface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.recorder.ASMediaSegment;
import com.ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VESafeAreaParams;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.ax;
import com.ss.android.vesdk.be;
import com.ss.android.vesdk.bf;
import com.ss.android.vesdk.model.VEPrePlayParams;
import com.ss.android.vesdk.runtime.VEMapBufferInfo;
import h.a.n;
import h.c.b.a.k;
import h.f.b.l;
import h.f.b.m;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;
import org.libsdl.app.AudioRecorderInterface;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.asve.a.b f62151a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f62152b;

    /* renamed from: c  reason: collision with root package name */
    public final ax f62153c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.asve.context.h f62154d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f62155e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f62156f;

    /* renamed from: g  reason: collision with root package name */
    private final t<Boolean> f62157g = new t<>();

    /* renamed from: h  reason: collision with root package name */
    private final VECameraSettings f62158h;

    static {
        Covode.recordClassIndex(38202);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final int a(int i2, int i3, String str, int i4, int i5, String str2, int i6, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        return 0;
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final int a(Context context, AudioRecorderInterface audioRecorderInterface) {
        l.d(context, "");
        return 0;
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final int b(Context context, AudioRecorderInterface audioRecorderInterface) {
        l.d(context, "");
        return 0;
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final LiveData<Boolean> h() {
        return this.f62157g;
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final boolean a() {
        return this.f62152b;
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(String str, String str2, boolean z, String str3, String str4, h.f.a.b<? super RecorderConcatResult, z> bVar) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        if (z) {
            this.f62153c.a(new a(bVar));
        } else {
            this.f62153c.a(str3, str4, new C1358b(bVar));
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(List<ASMediaSegment> list, String str, String str2, int i2, VEListener.j jVar) {
        l.d(list, "");
        l.d(str, "");
        l.d(jVar, "");
        ax axVar = this.f62153c;
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        for (T t : list) {
            l.d(t, "");
            arrayList.add(new bf(t.f62103a, t.f62104b));
        }
        axVar.a(arrayList, str2, i2, jVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(String str, long j2, long j3, boolean z) {
        com.ss.android.ugc.asve.a.a().a().c("syz setRecordBGM");
        this.f62153c.a(str, (int) j2, z ? 1 : 2);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(boolean z, PrivacyCert privacyCert) {
        this.f62155e = z;
        this.f62153c.a(z, privacyCert);
        if (!z) {
            com.ss.android.ugc.asve.a.b bVar = this.f62151a;
            if (bVar != null) {
                bVar.m();
            }
            com.ss.android.ugc.asve.a.b bVar2 = this.f62151a;
            if (bVar2 != null) {
                bVar2.n();
            }
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(boolean z) {
        this.f62153c.c(z);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(String str, int i2, int i3, boolean z, Bitmap.CompressFormat compressFormat, h.f.a.b<? super Integer, z> bVar, boolean z2) {
        l.d(str, "");
        l.d(compressFormat, "");
        l.d(bVar, "");
        this.f62153c.a(new be.a().a(str).a(new VESize(i2, i3)).a(z).a(compressFormat).a(new d(bVar)).b(z2).f151083a);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(h.f.a.b<? super Integer, z> bVar) {
        this.f62153c.a(new h(bVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.ss.android.ugc.asve.recorder.c.c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.ss.android.ugc.asve.recorder.c.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r3, h.f.a.b<? super java.lang.Integer, h.z> r4) {
        /*
            r2 = this;
            com.ss.android.vesdk.ax r1 = r2.f62153c
            if (r4 == 0) goto L_0x000a
            com.ss.android.ugc.asve.recorder.c.c r0 = new com.ss.android.ugc.asve.recorder.c.c
            r0.<init>(r4)
            r4 = r0
        L_0x000a:
            com.ss.android.vesdk.VEListener$j r4 = (com.ss.android.vesdk.VEListener.j) r4
            r1.a(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.asve.recorder.c.b.a(boolean, h.f.a.b):void");
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(String str, double d2, h.f.a.b<? super Integer, z> bVar) {
        com.ss.android.ugc.asve.a.b bVar2;
        l.d(str, "");
        l.d(bVar, "");
        boolean z = this.f62155e && !this.f62156f;
        bz unused = i.a(bs.f159054a, kotlinx.coroutines.bf.f159041b, null, new f(this, str, d2, bVar, z, null), 2);
        if (z && (bVar2 = this.f62151a) != null) {
            bVar2.k();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.asve.recorder.c.c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.ss.android.ugc.asve.recorder.c.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(h.f.a.b<? super java.lang.Integer, h.z> r4, h.f.a.a<h.z> r5) {
        /*
            r3 = this;
            com.ss.android.vesdk.ax r0 = r3.f62153c
            int r1 = r0.e()
            r0 = 3
            if (r1 != r0) goto L_0x0011
            com.ss.android.ugc.asve.recorder.c.b$c r0 = new com.ss.android.ugc.asve.recorder.c.b$c
            r0.<init>(r5)
            r3.a(r0)
        L_0x0011:
            com.ss.android.ugc.asve.context.e r0 = com.ss.android.ugc.asve.a.a()
            com.ss.android.ugc.asve.d r2 = r0.a()
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.String r1 = android.util.Log.getStackTraceString(r0)
            java.lang.String r0 = ""
            h.f.b.l.b(r1, r0)
            r2.c(r1)
            com.ss.android.vesdk.ax r1 = r3.f62153c
            if (r4 == 0) goto L_0x0034
            com.ss.android.ugc.asve.recorder.c.c r0 = new com.ss.android.ugc.asve.recorder.c.c
            r0.<init>(r4)
            r4 = r0
        L_0x0034:
            com.ss.android.vesdk.VEListener$j r4 = (com.ss.android.vesdk.VEListener.j) r4
            r1.b(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.asve.recorder.c.b.a(h.f.a.b, h.f.a.a):void");
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final boolean a(boolean z, String str) {
        l.d(str, "");
        return this.f62153c.a(z, str) == 0;
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(ax.h hVar) {
        l.d(hVar, "");
        this.f62153c.b(hVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final int b() {
        return this.f62153c.i();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void c() {
        this.f62153c.l();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final long d() {
        return this.f62153c.j();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final long f() {
        return this.f62153c.h();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final int i() {
        return this.f62153c.s();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final int j() {
        return this.f62153c.t();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final int k() {
        return this.f62153c.u();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final float l() {
        return this.f62153c.v();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final int m() {
        return this.f62153c.y();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final int n() {
        return this.f62153c.z();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final int o() {
        return this.f62153c.A();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final float p() {
        return this.f62153c.B();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final float q() {
        return this.f62153c.x();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final int r() {
        return this.f62153c.w();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final String[] t() {
        return this.f62153c.f();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void u() {
        this.f62153c.J();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final VEMapBufferInfo v() {
        return this.f62153c.n();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final boolean e() {
        if (this.f62153c.e() == 3) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final float[] s() {
        float[] G = this.f62153c.G();
        l.b(G, "");
        return G;
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void g() {
        VEPrePlayParams vEPrePlayParams = new VEPrePlayParams();
        vEPrePlayParams.f151362b = true;
        com.ss.android.ugc.asve.a.a().a().c("syz music beat sticker startPrePlay oldPrePlayStatus:" + this.f62152b);
        this.f62152b = true;
        e(false);
        this.f62153c.a(vEPrePlayParams);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(com.ss.android.ugc.asve.a.b bVar) {
        this.f62151a = bVar;
    }

    @Override // com.ss.android.ugc.asve.recorder.a.b
    public final void d(PrivacyCert privacyCert) {
        a(privacyCert);
    }

    static final class c extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ h.f.a.a $stopRecordCallback;

        static {
            Covode.recordClassIndex(38205);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h.f.a.a aVar) {
            super(1);
            this.$stopRecordCallback = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            num.intValue();
            h.f.a.a aVar = this.$stopRecordCallback;
            if (aVar != null) {
                aVar.invoke();
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements VEListener.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f62161a;

        static {
            Covode.recordClassIndex(38206);
        }

        d(h.f.a.b bVar) {
            this.f62161a = bVar;
        }

        @Override // com.ss.android.vesdk.VEListener.j
        public final void a(int i2) {
            h.f.a.b bVar = this.f62161a;
            if (bVar != null) {
                bVar.invoke(Integer.valueOf(i2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements VEListener.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f62167a;

        static {
            Covode.recordClassIndex(38210);
        }

        h(h.f.a.b bVar) {
            this.f62167a = bVar;
        }

        @Override // com.ss.android.vesdk.VEListener.j
        public final void a(int i2) {
            h.f.a.b bVar = this.f62167a;
            if (bVar != null) {
                bVar.invoke(Integer.valueOf(i2));
            }
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void c(VEListener.j jVar) {
        l.d(jVar, "");
        this.f62153c.e(jVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void d(boolean z) {
        this.f62153c.b(z);
    }

    static final class e implements VEListener.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f62162a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f62163b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f62164c;

        static {
            Covode.recordClassIndex(38207);
        }

        e(b bVar, h.f.a.b bVar2, boolean z) {
            this.f62162a = bVar;
            this.f62163b = bVar2;
            this.f62164c = z;
        }

        @Override // com.ss.android.vesdk.VEListener.j
        public final void a(int i2) {
            com.ss.android.ugc.asve.a.b bVar;
            this.f62163b.invoke(Integer.valueOf(i2));
            if (this.f62164c && (bVar = this.f62162a.f62151a) != null) {
                bVar.l();
            }
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void c(boolean z) {
        this.f62153c.g(z);
    }

    static final class f extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ h.f.a.b $callback;
        final /* synthetic */ boolean $micOpenTriggerByThis;
        final /* synthetic */ String $mp4File;
        final /* synthetic */ double $speed;
        int label;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(38208);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, String str, double d2, h.f.a.b bVar2, boolean z, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
            this.$mp4File = str;
            this.$speed = d2;
            this.$callback = bVar2;
            this.$micOpenTriggerByThis = z;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new f(this.this$0, this.$mp4File, this.$speed, this.$callback, this.$micOpenTriggerByThis, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((f) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                int g2 = ax.g();
                this.$callback.invoke(h.c.b.a.b.a(g2));
                if (this.$micOpenTriggerByThis) {
                    if (g2 == 0) {
                        com.ss.android.ugc.asve.a.b bVar = this.this$0.f62151a;
                        if (bVar != null) {
                            bVar.l();
                        }
                    } else {
                        com.ss.android.ugc.asve.a.b bVar2 = this.this$0.f62151a;
                        if (bVar2 != null) {
                            bVar2.b(g2, "");
                        }
                    }
                }
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class g implements VEListener.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f62165a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VEListener.j f62166b;

        static {
            Covode.recordClassIndex(38209);
        }

        g(b bVar, VEListener.j jVar) {
            this.f62165a = bVar;
            this.f62166b = jVar;
        }

        @Override // com.ss.android.vesdk.VEListener.j
        public final void a(int i2) {
            com.ss.android.ugc.asve.a.a().a().c("syz music beat sticker stopPrePlay ret=".concat(String.valueOf(i2)));
            this.f62165a.f62152b = false;
            VEListener.j jVar = this.f62166b;
            if (jVar != null) {
                jVar.a(i2);
            }
            this.f62165a.e(true);
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void b(VEListener.j jVar) {
        com.ss.android.ugc.asve.a.a().a().c("syz music beat sticker stopPrePlay oldPrePlayStatus:" + this.f62152b);
        this.f62153c.d(new g(this, jVar));
    }

    @Override // com.ss.android.ugc.asve.recorder.a.b
    public final void c(PrivacyCert privacyCert) {
        this.f62153c.a(privacyCert);
        this.f62156f = true;
        com.ss.android.ugc.asve.a.b bVar = this.f62151a;
        if (bVar != null) {
            bVar.k();
        }
        com.ss.android.ugc.asve.a.b bVar2 = this.f62151a;
        if (bVar2 != null) {
            bVar2.l();
        }
        this.f62156f = true;
        com.ss.android.ugc.asve.a.b bVar3 = this.f62151a;
        if (bVar3 != null) {
            bVar3.k();
        }
        com.ss.android.ugc.asve.a.b bVar4 = this.f62151a;
        if (bVar4 != null) {
            bVar4.l();
        }
    }

    public final void e(boolean z) {
        if (!l.a(Looper.getMainLooper(), Looper.myLooper())) {
            this.f62157g.postValue(Boolean.valueOf(z));
        } else {
            this.f62157g.setValue(Boolean.valueOf(z));
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final boolean b(boolean z) {
        return this.f62153c.d(z);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(long j2) {
        this.f62153c.a(j2);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(Surface surface) {
        this.f62153c.a(surface);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(PrivacyCert privacyCert) {
        this.f62153c.b(privacyCert);
        this.f62156f = false;
        com.ss.android.ugc.asve.a.b bVar = this.f62151a;
        if (bVar != null) {
            bVar.m();
        }
        com.ss.android.ugc.asve.a.b bVar2 = this.f62151a;
        if (bVar2 != null) {
            bVar2.n();
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(VEListener.j jVar) {
        this.f62153c.c(jVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(int i2, VESafeAreaParams[] vESafeAreaParamsArr) {
        if (vESafeAreaParamsArr != null) {
            for (VESafeAreaParams vESafeAreaParams : vESafeAreaParamsArr) {
                com.ss.android.ugc.asve.a.a().a().d("VEMediaController: setSafeArea type " + i2 + " safeType " + vESafeAreaParams.safeType + " left " + vESafeAreaParams.left + ' ' + "top " + vESafeAreaParams.top + " right " + vESafeAreaParams.right + " bottom " + vESafeAreaParams.bottom);
            }
        }
        this.f62153c.a(i2, vESafeAreaParamsArr);
    }

    static final class a implements VEListener.o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f62159a;

        static {
            Covode.recordClassIndex(38203);
        }

        a(h.f.a.b bVar) {
            this.f62159a = bVar;
        }

        @Override // com.ss.android.vesdk.VEListener.o
        public final void a(int i2, String str, String str2) {
            h.f.a.b bVar = this.f62159a;
            if (bVar != null) {
                l.b(str, "");
                l.b(str2, "");
                bVar.invoke(new RecorderConcatResult(i2, str, str2));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.c.b$b  reason: collision with other inner class name */
    static final class C1358b implements VEListener.o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f62160a;

        static {
            Covode.recordClassIndex(38204);
        }

        C1358b(h.f.a.b bVar) {
            this.f62160a = bVar;
        }

        @Override // com.ss.android.vesdk.VEListener.o
        public final void a(int i2, String str, String str2) {
            h.f.a.b bVar = this.f62160a;
            if (bVar != null) {
                l.b(str, "");
                l.b(str2, "");
                bVar.invoke(new RecorderConcatResult(i2, str, str2));
            }
        }
    }

    public b(ax axVar, com.ss.android.ugc.asve.context.h hVar, VECameraSettings vECameraSettings) {
        l.d(axVar, "");
        l.d(hVar, "");
        l.d(vECameraSettings, "");
        this.f62153c = axVar;
        this.f62154d = hVar;
        this.f62158h = vECameraSettings;
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void b(Surface surface, String str, h.f.a.b<? super Integer, z> bVar) {
        l.d(surface, "");
        l.d(str, "");
        a(surface, str, bVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(Surface surface, String str, h.f.a.b<? super Integer, z> bVar) {
        l.d(surface, "");
        l.d(str, "");
        this.f62153c.a(this.f62158h);
        this.f62153c.a(surface, new d(bVar));
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final int a(String str, int i2, int i3, h.f.a.b<? super Integer, z> bVar) {
        l.d(str, "");
        l.d(bVar, "");
        this.f62153c.a(str, i2, i3, Bitmap.CompressFormat.PNG, new d(bVar));
        return 0;
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(double d2, boolean z, float f2, int i2, int i3, boolean z2, h.f.a.b<? super Integer, z> bVar) {
        boolean z3;
        com.ss.android.ugc.asve.a.b bVar2;
        l.d(bVar, "");
        if (!this.f62155e || this.f62156f) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f62153c.a((float) d2, new e(this, bVar, z3));
        if (z3 && (bVar2 = this.f62151a) != null) {
            bVar2.k();
        }
    }
}

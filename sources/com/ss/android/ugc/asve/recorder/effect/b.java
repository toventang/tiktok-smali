package com.ss.android.ugc.asve.recorder.effect;

import android.content.Context;
import android.graphics.Bitmap;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.medialib.RecordInvoker;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.ss.android.ugc.asve.wrap.ASSimpleFaceInfo;
import com.ss.android.vesdk.VEARCoreParam;
import com.ss.android.vesdk.VECherEffectParam;
import com.ss.android.vesdk.al;
import com.ss.android.vesdk.ax;
import com.ss.android.vesdk.bh;
import com.ss.android.vesdk.faceinfo.VESkeleton;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final List<com.ss.android.ugc.asve.wrap.c> f62266a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final List<MessageCenter.Listener> f62267b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ax f62268c;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f62269e;

    /* renamed from: f  reason: collision with root package name */
    private final C1361b f62270f = new C1361b(this);

    /* renamed from: g  reason: collision with root package name */
    private final ax.n f62271g = new a(this);

    /* renamed from: h  reason: collision with root package name */
    private final h f62272h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f62273i;

    static {
        Covode.recordClassIndex(38264);
    }

    private final com.ss.android.ugc.asve.recorder.effect.composer.d i() {
        return (com.ss.android.ugc.asve.recorder.effect.composer.d) this.f62272h.getValue();
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void d() {
        this.f62269e = false;
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(String str, float f2) {
        this.f62268c.a(str, f2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(String str, String str2, float f2, float f3, float f4) {
        this.f62268c.a(str, str2, f2, f3, f4);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(int i2, String str) {
        l.d(str, "");
        this.f62268c.a(i2, str);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(float f2, float f3) {
        this.f62268c.a(f2, f3);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(float f2) {
        this.f62268c.a(1, f2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(String str) {
        this.f62268c.a(str);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(Context context, String str, String str2, String str3) {
        this.f62268c.a(str, str2, str3);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(Context context, String str, String str2) {
        this.f62268c.a(str, str2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f62268c.a(z, z2, z3, z4);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(double[] dArr, double d2) {
        l.d(dArr, "");
        this.f62268c.a(dArr, d2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(int i2, float f2, float f3, int i3) {
        this.f62268c.a(i2, f2, f3, i3);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(float f2, float f3, float f4, float f5, float f6) {
        this.f62268c.a(f2, f3, f4, f5, f6);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(String str, int i2, int i3, String str2) {
        l.d(str2, "");
        this.f62268c.b(str, i2, i3, str2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(boolean z) {
        this.f62268c.j(z);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(RecordInvoker.OnARTextCountCallback onARTextCountCallback) {
        l.d(onARTextCountCallback, "");
        this.f62268c.a(new f(onARTextCountCallback));
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(RecordInvoker.OnARTextContentCallback onARTextContentCallback) {
        l.d(onARTextContentCallback, "");
        this.f62268c.b(new g(onARTextContentCallback));
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void b(boolean z) {
        this.f62268c.k(z);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(int i2) {
        this.f62268c.b(i2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(Context context) {
        l.d(context, "");
        this.f62268c.l(true);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(RecordInvoker.OnCherEffectParmaCallback onCherEffectParmaCallback) {
        l.d(onCherEffectParmaCallback, "");
        this.f62268c.a(new d(onCherEffectParmaCallback));
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(String[] strArr, double[] dArr, boolean[] zArr) {
        this.f62268c.a(new VECherEffectParam(strArr, dArr, zArr));
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(com.ss.android.ugc.asve.wrap.c cVar) {
        l.d(cVar, "");
        this.f62266a.add(cVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(com.ss.android.ugc.asve.wrap.b bVar) {
        l.d(bVar, "");
        this.f62268c.a(new e(bVar));
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(int i2, long j2, long j3, String str) {
        l.d(str, "");
        this.f62268c.a(i2, j2, j3, str);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(MessageCenter.Listener listener) {
        MethodCollector.i(9508);
        l.d(listener, "");
        synchronized (this.f62267b) {
            try {
                if (!this.f62267b.contains(listener)) {
                    this.f62267b.add(listener);
                }
                if (!this.f62269e && (!this.f62267b.isEmpty())) {
                    this.f62269e = true;
                    this.f62268c.a(this.f62270f);
                }
            } finally {
                MethodCollector.o(9508);
            }
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(al alVar) {
        l.d(alVar, "");
        this.f62268c.a(alVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final void a(List<ComposerInfo> list, int i2) {
        l.d(list, "");
        i().a(list, i2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final void a(List<ComposerInfo> list, List<ComposerInfo> list2, int i2) {
        l.d(list, "");
        l.d(list2, "");
        i().a(list, list2, i2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final void b(List<ComposerInfo> list, int i2) {
        l.d(list, "");
        i().b(list, i2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final void a(List<ComposerInfo> list) {
        l.d(list, "");
        i().a(list);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(ax.b bVar, int i2) {
        this.f62268c.a(bVar, i2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(int i2, int i3, ax.d dVar) {
        this.f62268c.a(i2, i3, dVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final boolean a(bh bhVar, int i2) {
        l.d(bhVar, "");
        return this.f62268c.a(bhVar, i2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(VEARCoreParam vEARCoreParam) {
        l.d(vEARCoreParam, "");
        com.ss.android.vesdk.c.a I = this.f62268c.I();
        if (I != null) {
            I.a(vEARCoreParam);
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void b() {
        this.f62268c.p();
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final com.ss.android.medialib.presenter.d c() {
        return this.f62268c.H();
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void e() {
        this.f62268c.a(this.f62271g);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final void h() {
        i().h();
    }

    static final class c extends m implements h.f.a.a<com.ss.android.ugc.asve.recorder.effect.composer.d> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(38267);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.asve.recorder.effect.composer.d invoke() {
            return new com.ss.android.ugc.asve.recorder.effect.composer.d(this.this$0.f62268c);
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void f() {
        this.f62266a.clear();
        this.f62268c.b(this.f62271g);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final com.ss.android.ugc.asve.recorder.effect.composer.c g() {
        return i().g();
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a() {
        this.f62268c.l(false);
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.b$b  reason: collision with other inner class name */
    public static final class C1361b implements MessageCenter.Listener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f62275a;

        static {
            Covode.recordClassIndex(38266);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C1361b(b bVar) {
            this.f62275a = bVar;
        }

        @Override // com.bef.effectsdk.message.MessageCenter.Listener
        public final void onMessageReceived(int i2, int i3, int i4, String str) {
            if (!this.f62275a.f62267b.isEmpty()) {
                for (MessageCenter.Listener listener : new ArrayList(this.f62275a.f62267b)) {
                    listener.onMessageReceived(i2, i3, i4, str);
                }
            }
        }
    }

    public static final class f implements ax.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecordInvoker.OnARTextCountCallback f62278a;

        static {
            Covode.recordClassIndex(38270);
        }

        @Override // com.ss.android.vesdk.ax.h
        public final void a(String[] strArr) {
        }

        f(RecordInvoker.OnARTextCountCallback onARTextCountCallback) {
            this.f62278a = onARTextCountCallback;
        }

        @Override // com.ss.android.vesdk.ax.h
        public final void a(int i2) {
            this.f62278a.onResult(i2);
        }
    }

    public static final class g implements ax.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecordInvoker.OnARTextContentCallback f62279a;

        static {
            Covode.recordClassIndex(38271);
        }

        @Override // com.ss.android.vesdk.ax.h
        public final void a(int i2) {
        }

        g(RecordInvoker.OnARTextContentCallback onARTextContentCallback) {
            this.f62279a = onARTextContentCallback;
        }

        @Override // com.ss.android.vesdk.ax.h
        public final void a(String[] strArr) {
            this.f62279a.onResult(strArr);
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void g(boolean z) {
        this.f62268c.m(z);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final void i(boolean z) {
        i().i(z);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final int a(Bitmap bitmap) {
        return this.f62268c.a(bitmap);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final float b(String str) {
        l.d(str, "");
        return this.f62268c.b(str);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void d(String str) {
        this.f62268c.d(str);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void h(boolean z) {
        this.f62268c.p(z);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final int a(VEEffectFilterParam vEEffectFilterParam) {
        l.d(vEEffectFilterParam, "");
        return this.f62268c.a(vEEffectFilterParam);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final VEFrame e(String str) {
        ax.c cVar = new ax.c();
        cVar.f151030b = str;
        cVar.f151029a = 1;
        return this.f62268c.a(cVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void f(boolean z) {
        this.f62268c.n(z);
    }

    static final class e implements ax.s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.asve.wrap.b f62277a;

        static {
            Covode.recordClassIndex(38269);
        }

        e(com.ss.android.ugc.asve.wrap.b bVar) {
            this.f62277a = bVar;
        }

        @Override // com.ss.android.vesdk.ax.s
        public final void a(com.ss.android.vesdk.faceinfo.e eVar) {
            VESkeleton[] vESkeletonArr;
            com.ss.android.ugc.asve.wrap.a[] aVarArr = null;
            if (!(eVar == null || (vESkeletonArr = eVar.f151308a) == null)) {
                if (vESkeletonArr.length != 0) {
                    int length = vESkeletonArr.length;
                    aVarArr = new com.ss.android.ugc.asve.wrap.a[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        VESkeleton vESkeleton = vESkeletonArr[i2];
                        l.b(vESkeleton, "");
                        aVarArr[i2] = new com.ss.android.ugc.asve.wrap.a(vESkeleton.getID());
                    }
                }
            }
            this.f62277a.a(aVarArr);
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void c(String str) {
        l.d(str, "");
        this.f62268c.c(str);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void d(boolean z) {
        this.f62268c.i(z);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void e(boolean z) {
        this.f62268c.e(z);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void c(boolean z) {
        this.f62268c.h(z);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void b(int i2) {
        this.f62268c.c(i2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void b(MessageCenter.Listener listener) {
        MethodCollector.i(9509);
        l.d(listener, "");
        synchronized (this.f62267b) {
            try {
                this.f62267b.remove(listener);
                if (this.f62269e && this.f62267b.isEmpty()) {
                    this.f62268c.a((MessageCenter.Listener) null);
                    this.f62269e = false;
                }
            } finally {
                MethodCollector.o(9509);
            }
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(double d2) {
        this.f62268c.a(d2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void b(al alVar) {
        l.d(alVar, "");
        this.f62268c.b(alVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final int a(int i2, float f2) {
        return this.f62268c.a(i2, f2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void d(float f2, float f3) {
        this.f62268c.d(f2, f3);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void f(float f2, float f3) {
        this.f62268c.f(f2, f3);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void e(float f2, float f3) {
        this.f62268c.e(f2, f3);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void c(float f2, float f3) {
        this.f62268c.b(f2, f3);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final void d(List<ComposerInfo> list, int i2) {
        l.d(list, "");
        i().d(list, i2);
    }

    public b(ax axVar, boolean z) {
        l.d(axVar, "");
        this.f62268c = axVar;
        this.f62273i = z;
        if (!z) {
            e();
        }
        this.f62272h = i.a((h.f.a.a) new c(this));
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final int b(String[] strArr, int i2) {
        l.d(strArr, "");
        return this.f62268c.b(strArr, i2);
    }

    static final class a implements ax.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f62274a;

        static {
            Covode.recordClassIndex(38265);
        }

        a(b bVar) {
            this.f62274a = bVar;
        }

        @Override // com.ss.android.vesdk.ax.n
        public final void a(com.ss.android.vesdk.faceinfo.b bVar, com.ss.android.vesdk.faceinfo.d dVar) {
            ASSimpleFaceInfo[] aSSimpleFaceInfoArr;
            for (com.ss.android.ugc.asve.wrap.c cVar : n.k(this.f62274a.f62266a)) {
                if (bVar != null) {
                    l.d(bVar, "");
                    ArrayList arrayList = new ArrayList();
                    com.ss.android.vesdk.faceinfo.a[] aVarArr = bVar.f151284a;
                    l.b(aVarArr, "");
                    for (com.ss.android.vesdk.faceinfo.a aVar : aVarArr) {
                        l.b(aVar, "");
                        l.d(aVar, "");
                        arrayList.add(new ASSimpleFaceInfo(aVar.f151272b));
                    }
                    Object[] array = arrayList.toArray(new ASSimpleFaceInfo[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                    aSSimpleFaceInfoArr = (ASSimpleFaceInfo[]) array;
                } else {
                    aSSimpleFaceInfoArr = null;
                }
                if (dVar != null) {
                    defpackage.a.a(dVar);
                }
                cVar.a(aSSimpleFaceInfoArr);
            }
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final int a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return this.f62268c.d(str, str2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final void c(List<ComposerInfo> list, int i2) {
        l.d(list, "");
        i().c(list, i2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void b(float f2, float f3) {
        this.f62268c.c(f2, f3);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final int a(String[] strArr, int i2) {
        l.d(strArr, "");
        return this.f62268c.a(strArr, i2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final int[] c(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        int[] c2 = this.f62268c.c(str, str2);
        l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void b(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f62268c.b(str, str2);
    }

    static final class d implements ax.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecordInvoker.OnCherEffectParmaCallback f62276a;

        static {
            Covode.recordClassIndex(38268);
        }

        d(RecordInvoker.OnCherEffectParmaCallback onCherEffectParmaCallback) {
            this.f62276a = onCherEffectParmaCallback;
        }

        @Override // com.ss.android.vesdk.ax.l
        public final void a(String[] strArr, double[] dArr, boolean[] zArr) {
            this.f62276a.onCherEffect(strArr, dArr, zArr);
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final int b(String str, float f2, float f3) {
        l.d(str, "");
        return this.f62268c.b(str, f2, f3);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final int a(String str, float f2, float f3) {
        l.d(str, "");
        return this.f62268c.a(str, f2, f3);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final int a(String str, String str2, float f2) {
        l.d(str, "");
        l.d(str2, "");
        return this.f62268c.a(str, str2, f2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void c(double d2, double d3, double d4, double d5) {
        this.f62268c.c(d2, d3, d4, d5);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void b(double d2, double d3, double d4, double d5) {
        this.f62268c.b(d2, d3, d4, d5);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(double d2, double d3, double d4, double d5) {
        this.f62268c.a(d2, d3, d4, d5);
    }
}

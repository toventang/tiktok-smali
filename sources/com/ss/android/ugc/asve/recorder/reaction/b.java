package com.ss.android.ugc.asve.recorder.reaction;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.medialib.h;
import com.ss.android.ugc.asve.context.g;
import com.ss.android.ugc.asve.recorder.reaction.a.c;
import com.ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo;
import com.ss.android.ugc.asve.recorder.reaction.model.d;
import com.ss.android.vesdk.av;
import com.ss.android.vesdk.ax;
import h.f.b.l;
import h.p;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    final String f62328a = "ReactionController";

    /* renamed from: b  reason: collision with root package name */
    int f62329b;

    /* renamed from: c  reason: collision with root package name */
    int f62330c;

    /* renamed from: d  reason: collision with root package name */
    float f62331d;

    /* renamed from: e  reason: collision with root package name */
    int f62332e;

    /* renamed from: f  reason: collision with root package name */
    int f62333f;

    /* renamed from: g  reason: collision with root package name */
    int f62334g;

    /* renamed from: h  reason: collision with root package name */
    int f62335h;

    /* renamed from: i  reason: collision with root package name */
    final ax f62336i;

    /* renamed from: j  reason: collision with root package name */
    final Context f62337j;

    /* renamed from: k  reason: collision with root package name */
    private final int f62338k = 360;

    /* renamed from: l  reason: collision with root package name */
    private c f62339l;

    /* renamed from: m  reason: collision with root package name */
    private d f62340m;
    private int n;
    private int o;
    private int p;
    private final a q;
    private final com.ss.android.ugc.asve.recorder.d r;
    private final p<Integer, Integer> s;
    private final g t;

    static {
        Covode.recordClassIndex(38296);
    }

    @Override // com.ss.android.ugc.asve.recorder.reaction.a
    public final g a() {
        return this.t;
    }

    @Override // com.ss.android.ugc.asve.recorder.reaction.a
    public final int[] c() {
        return this.f62336i.c();
    }

    @Override // com.ss.android.ugc.asve.recorder.reaction.a
    public final int[] b() {
        return this.f62336i.b();
    }

    @Override // com.ss.android.ugc.asve.recorder.reaction.a
    public final void d() {
        this.f62336i.a(new av(this.t.b(), this.t.a(), new float[]{0.096f, 0.1f, 0.09f, 0.09f}));
        this.f62336i.a();
        ax axVar = this.f62336i;
        int i2 = this.f62333f;
        int i3 = this.p;
        int i4 = this.f62332e;
        axVar.a(i2, i3, i4, i4);
        this.f62336i.a((int) (this.s.getFirst().floatValue() * 0.0053333333f));
        h.a().a(this.t.c());
    }

    @Override // com.ss.android.ugc.asve.recorder.reaction.a
    public final ReactionWindowInfo e() {
        float d2 = this.f62336i.d();
        this.f62331d = d2;
        double degrees = Math.toDegrees((double) d2);
        double d3 = (double) this.f62338k;
        Double.isNaN(d3);
        float f2 = (float) (degrees % d3);
        d dVar = this.f62340m;
        if (dVar == null) {
            l.a("curWindowShape");
        }
        int convertWidthToDp = dVar.convertWidthToDp(this.f62334g);
        d dVar2 = this.f62340m;
        if (dVar2 == null) {
            l.a("curWindowShape");
        }
        int convertHeightToDp = dVar2.convertHeightToDp(this.f62335h);
        d dVar3 = this.f62340m;
        if (dVar3 == null) {
            l.a("curWindowShape");
        }
        return new ReactionWindowInfo(convertWidthToDp, convertHeightToDp, f2, dVar3.getMIsCircle() ? 1 : 0);
    }

    public static final class a implements com.ss.android.medialib.listener.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f62341a;

        static {
            Covode.recordClassIndex(38297);
        }

        @Override // com.ss.android.medialib.listener.b
        public final void a(int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(b bVar) {
            this.f62341a = bVar;
        }

        @Override // com.ss.android.medialib.listener.b
        public final void a(int i2) {
            int[] a2;
            int i3;
            if (i2 < 0) {
                com.ss.android.ugc.asve.b.f61927a.b("onNativeInitCallBack error: ".concat(String.valueOf(i2)));
                return;
            }
            b bVar = this.f62341a;
            com.ss.android.ugc.asve.b.f61927a.c(bVar.f62328a + " onSurfaceViewInitDone");
            if (bVar.f62329b > 0 || bVar.f62330c > 0) {
                a2 = bVar.a(bVar.f62329b, bVar.f62330c, bVar.f62334g, bVar.f62335h, bVar.f62331d);
            } else if (com.ss.android.ugc.asve.f.d.a(bVar.f62337j)) {
                int[] b2 = bVar.f62336i.b();
                if (b2 == null) {
                    i3 = 0;
                } else {
                    i3 = b2[0];
                }
                a2 = bVar.a(com.ss.android.ugc.asve.f.d.b(bVar.f62337j) - i3, bVar.f62333f, bVar.f62334g, bVar.f62335h, bVar.f62331d);
            } else {
                a2 = bVar.a(bVar.f62332e, bVar.f62333f, bVar.f62334g, bVar.f62335h, bVar.f62331d);
            }
            if (a2 != null) {
                com.ss.android.ugc.asve.b.f61927a.c(bVar.f62328a + " => update pos: " + bVar.f62329b + ' ' + bVar.f62330c + " curWindowSurfaceWidth and curWindowSurfaceHeight :" + bVar.f62334g + ' ' + bVar.f62335h);
                bVar.f62329b = a2[0];
                bVar.f62330c = a2[1];
            }
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.reaction.a
    public final void a(float f2) {
        h.a().a(f2);
    }

    @Override // com.ss.android.ugc.asve.recorder.reaction.a
    public final boolean b(int i2, int i3) {
        return this.f62336i.a(i2, i3);
    }

    @Override // com.ss.android.ugc.asve.recorder.reaction.a
    public final void a(int i2, int i3) {
        int i4 = this.f62329b + i2;
        this.f62329b = i4;
        int i5 = this.f62330c + i3;
        this.f62330c = i5;
        int[] a2 = this.f62336i.a(i4, i5, -1, -1, 0.0f);
        if (a2 != null) {
            this.f62329b = a2[0];
            this.f62330c = a2[1];
            this.n = a2[2];
            this.o = a2[3];
        }
    }

    /* access modifiers changed from: package-private */
    public final int[] a(int i2, int i3, int i4, int i5, float f2) {
        return this.f62336i.a(i2, i3, i4, i5, f2);
    }

    public b(ax axVar, Context context, com.ss.android.ugc.asve.recorder.d dVar, p<Integer, Integer> pVar, g gVar) {
        l.d(axVar, "");
        l.d(context, "");
        l.d(dVar, "");
        l.d(pVar, "");
        l.d(gVar, "");
        this.f62336i = axVar;
        this.f62337j = context;
        this.r = dVar;
        this.s = pVar;
        this.t = gVar;
        a aVar = new a(this);
        this.q = aVar;
        int intValue = pVar.getFirst().intValue();
        int intValue2 = pVar.getSecond().intValue();
        boolean d2 = gVar.d();
        double d3 = (double) intValue;
        Double.isNaN(d3);
        this.f62332e = (int) (0.09d * d3);
        double d4 = (double) intValue2;
        Double.isNaN(d4);
        this.f62333f = (int) (0.096d * d4);
        Double.isNaN(d4);
        this.p = (int) (0.1d * d4);
        Double.isNaN(d3);
        int i2 = (int) (d3 * 0.82d);
        Double.isNaN(d4);
        int i3 = (int) (d4 * 0.804d);
        if (d2) {
            double d5 = (double) i2;
            Double.isNaN(d5);
            this.f62329b = (((int) (((h.i.c.Default.nextDouble() * 1.0d) / 4.0d) * d5)) * com.ss.android.ugc.asve.f.d.b(context)) / intValue;
            double d6 = (double) i3;
            Double.isNaN(d6);
            this.f62330c = (((int) (((h.i.c.Default.nextDouble() * 1.0d) / 4.0d) * d6)) * com.ss.android.ugc.asve.f.d.c(context)) / intValue2;
        }
        c cVar = new c(context, pVar.getFirst().intValue(), pVar.getSecond().intValue(), gVar.e(), gVar.f());
        this.f62339l = cVar;
        d dVar2 = cVar.f62323a.get(cVar.f62324b);
        l.b(dVar2, "");
        d dVar3 = dVar2;
        this.f62340m = dVar3;
        if (dVar3 == null) {
            l.a("curWindowShape");
        }
        this.f62334g = dVar3.getDefaultWidth();
        d dVar4 = this.f62340m;
        if (dVar4 == null) {
            l.a("curWindowShape");
        }
        this.f62335h = dVar4.getDefaultHeight();
        dVar.a(aVar);
    }
}

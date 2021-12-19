package com.ss.android.ugc.aweme.pendant;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.f;
import com.airbnb.lottie.h;
import com.airbnb.lottie.i;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import f.a.t;
import f.a.v;
import f.a.w;
import f.a.z;
import h.f.b.l;
import java.io.File;
import java.io.InputStream;
import java.util.List;

public final class g extends a implements d {
    private int A = Integer.MAX_VALUE;
    private int B;
    private int C;
    private int D;
    private int E = Integer.MAX_VALUE;
    private int F;
    private int G = Integer.MAX_VALUE;
    private int H;
    private int I = Integer.MAX_VALUE;
    private final String J;
    public boolean u;
    public final LottieAnimationView v;
    public final LottieAnimationView w;
    private int x;
    private int y;
    private int z;

    static {
        Covode.recordClassIndex(73789);
    }

    @Override // com.ss.android.ugc.aweme.pendant.a
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.pendant.d
    public final boolean getTimeLimitState() {
        return this.u;
    }

    @Override // com.ss.android.ugc.aweme.pendant.a
    public final void a() {
        super.a();
        if (this.f114589j) {
            if (this.v.getVisibility() == 0) {
                if (!this.f114588i) {
                    if (this.u) {
                        c(true);
                    } else {
                        b(true);
                    }
                }
                if (!this.v.f5109b.g()) {
                    this.v.a();
                }
            }
            if (this.w.getVisibility() == 0) {
                if (!this.f114588i) {
                    if (this.u) {
                        c(false);
                    } else {
                        b(false);
                    }
                }
                if (!this.w.f5109b.g()) {
                    this.w.a();
                }
            }
        }
    }

    public static final class d implements com.airbnb.lottie.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f114655a;

        static {
            Covode.recordClassIndex(73795);
        }

        d(String str) {
            this.f114655a = str;
        }

        @Override // com.airbnb.lottie.c
        public final Bitmap a(h hVar) {
            MethodCollector.i(5616);
            Bitmap bitmap = null;
            if (hVar != null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = n.d(com.bytedance.ies.ugc.appcontext.d.a());
                try {
                    bitmap = BitmapFactory.decodeFile(this.f114655a + File.separator + hVar.f5657d, options);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                MethodCollector.o(5616);
                return bitmap;
            }
            MethodCollector.o(5616);
            return null;
        }
    }

    public static final class b implements z<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f114644a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InputStream f114645b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ InputStream f114646c;

        static {
            Covode.recordClassIndex(73791);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
            try {
                this.f114645b.close();
                this.f114646c.close();
            } catch (Exception unused) {
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(String str) {
            l.d(str, "");
            if (this.f114644a.s.f114678i) {
                List<Integer> list = this.f114644a.s.f114675f;
                if (list != null && (!list.isEmpty())) {
                    if (this.f114644a.u) {
                        this.f114644a.c(true);
                    } else {
                        this.f114644a.b(true);
                    }
                }
                List<Integer> list2 = this.f114644a.s.f114676g;
                if (list2 != null && (!list2.isEmpty())) {
                    if (this.f114644a.u) {
                        this.f114644a.c(false);
                    } else {
                        this.f114644a.b(false);
                    }
                }
            }
            this.f114644a.v.a();
            this.f114644a.w.a();
            this.f114644a.f114589j = true;
            h.f.a.a<h.z> aVar = this.f114644a.s.f114674e;
            if (aVar != null) {
                aVar.invoke();
            }
            try {
                this.f114645b.close();
                this.f114646c.close();
            } catch (Exception unused) {
            }
        }

        b(g gVar, InputStream inputStream, InputStream inputStream2) {
            this.f114644a = gVar;
            this.f114645b = inputStream;
            this.f114646c = inputStream2;
        }
    }

    static final class c<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f114647a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f114648b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ InputStream f114649c;

        static {
            Covode.recordClassIndex(73792);
        }

        c(g gVar, d dVar, InputStream inputStream) {
            this.f114647a = gVar;
            this.f114648b = dVar;
            this.f114649c = inputStream;
        }

        static final class a<T> implements i {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ LottieAnimationView f114650a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f114651b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ v f114652c;

            static {
                Covode.recordClassIndex(73793);
            }

            a(LottieAnimationView lottieAnimationView, c cVar, v vVar) {
                this.f114650a = lottieAnimationView;
                this.f114651b = cVar;
                this.f114652c = vVar;
            }

            @Override // com.airbnb.lottie.i
            public final /* synthetic */ void a(Object obj) {
                this.f114650a.setComposition((com.airbnb.lottie.e) obj);
                v vVar = this.f114652c;
                l.b(vVar, "");
                if (!vVar.isDisposed()) {
                    this.f114652c.a((Object) "0");
                }
            }
        }

        static final class b<T> implements i {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f114653a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v f114654b;

            static {
                Covode.recordClassIndex(73794);
            }

            b(c cVar, v vVar) {
                this.f114653a = cVar;
                this.f114654b = vVar;
            }

            @Override // com.airbnb.lottie.i
            public final /* synthetic */ void a(Object obj) {
                Throwable th = (Throwable) obj;
                v vVar = this.f114654b;
                l.b(vVar, "");
                if (!vVar.isDisposed()) {
                    this.f114654b.a(th);
                }
            }
        }

        @Override // f.a.w
        public final void subscribe(v<String> vVar) {
            l.d(vVar, "");
            LottieAnimationView lottieAnimationView = this.f114647a.v;
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.setRepeatMode(1);
            lottieAnimationView.setImageAssetDelegate(this.f114648b);
            f.a(this.f114649c, "bigLottie").a((i<com.airbnb.lottie.e>) new a(lottieAnimationView, this, vVar)).c(new b(this, vVar));
        }
    }

    static final class e<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f114656a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f114657b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ InputStream f114658c;

        static {
            Covode.recordClassIndex(73796);
        }

        e(g gVar, d dVar, InputStream inputStream) {
            this.f114656a = gVar;
            this.f114657b = dVar;
            this.f114658c = inputStream;
        }

        static final class a<T> implements i {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ LottieAnimationView f114659a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f114660b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ v f114661c;

            static {
                Covode.recordClassIndex(73797);
            }

            a(LottieAnimationView lottieAnimationView, e eVar, v vVar) {
                this.f114659a = lottieAnimationView;
                this.f114660b = eVar;
                this.f114661c = vVar;
            }

            @Override // com.airbnb.lottie.i
            public final /* synthetic */ void a(Object obj) {
                this.f114659a.setComposition((com.airbnb.lottie.e) obj);
                v vVar = this.f114661c;
                l.b(vVar, "");
                if (!vVar.isDisposed()) {
                    this.f114661c.a((Object) "1");
                }
            }
        }

        static final class b<T> implements i {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f114662a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v f114663b;

            static {
                Covode.recordClassIndex(73798);
            }

            b(e eVar, v vVar) {
                this.f114662a = eVar;
                this.f114663b = vVar;
            }

            @Override // com.airbnb.lottie.i
            public final /* synthetic */ void a(Object obj) {
                Throwable th = (Throwable) obj;
                v vVar = this.f114663b;
                l.b(vVar, "");
                if (!vVar.isDisposed()) {
                    this.f114663b.a(th);
                }
            }
        }

        @Override // f.a.w
        public final void subscribe(v<String> vVar) {
            l.d(vVar, "");
            LottieAnimationView lottieAnimationView = this.f114656a.w;
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.setRepeatMode(1);
            lottieAnimationView.setImageAssetDelegate(this.f114657b);
            f.a(this.f114658c, "smallLottie").a((i<com.airbnb.lottie.e>) new a(lottieAnimationView, this, vVar)).c(new b(this, vVar));
        }
    }

    public final void b(boolean z2) {
        LottieAnimationView lottieAnimationView;
        int i2;
        int i3;
        if (z2) {
            lottieAnimationView = this.v;
            i2 = this.z;
            i3 = this.A;
        } else {
            lottieAnimationView = this.w;
            i2 = this.D;
            i3 = this.E;
        }
        lottieAnimationView.a(i2, i3);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.setRepeatMode(1);
    }

    public final void c(boolean z2) {
        LottieAnimationView lottieAnimationView;
        int i2;
        int i3;
        if (z2) {
            lottieAnimationView = this.v;
            i2 = this.F;
            i3 = this.G;
        } else {
            lottieAnimationView = this.w;
            i2 = this.H;
            i3 = this.I;
        }
        lottieAnimationView.a(i2, i3);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.setRepeatMode(1);
    }

    @Override // com.ss.android.ugc.aweme.pendant.d
    public final void setTimeLimitState(boolean z2) {
        if (this.u != z2) {
            this.u = z2;
            if (this.s.f114678i) {
                if (this.u) {
                    c(!this.f114587h);
                    c(this.f114587h);
                } else {
                    b(!this.f114587h);
                    b(this.f114587h);
                }
                if (this.v.getVisibility() == 0) {
                    this.v.a();
                }
                if (this.w.getVisibility() == 0) {
                    this.w.a();
                }
            }
            if (this.f114587h && z2) {
                a((h.f.a.a<h.z>) null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.pendant.n
    public final void a(k kVar) {
        l.d(kVar, "");
        InputStream inputStream = kVar.f114705a;
        InputStream inputStream2 = kVar.f114706b;
        String str = kVar.f114707c;
        if (inputStream != null && inputStream2 != null && str != null && !TextUtils.isEmpty(str)) {
            d dVar = new d(str);
            t a2 = t.a(new c(this, dVar, inputStream));
            l.b(a2, "");
            t a3 = t.a(new e(this, dVar, inputStream2));
            l.b(a3, "");
            t.a(a2, a3, a.f114643a).b((z) new b(this, inputStream2, inputStream));
        }
    }

    static final class a<T1, T2, R> implements f.a.d.c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f114643a = new a();

        static {
            Covode.recordClassIndex(73790);
        }

        a() {
        }

        @Override // f.a.d.c
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            l.d(str, "");
            l.d(str2, "");
            return str + str2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Context context, View view, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, View view2, RelativeLayout relativeLayout, i iVar) {
        super(context, view, lottieAnimationView, lottieAnimationView2, view2, relativeLayout, iVar);
        l.d(context, "");
        l.d(view, "");
        l.d(lottieAnimationView, "");
        l.d(lottieAnimationView2, "");
        l.d(view2, "");
        l.d(relativeLayout, "");
        l.d(iVar, "");
        this.v = lottieAnimationView;
        this.w = lottieAnimationView2;
        if (iVar.f114678i) {
            if (iVar.f114675f != null && iVar.f114675f.size() == 4) {
                List<Integer> list = iVar.f114675f;
                this.z = list.get(0).intValue();
                this.A = list.get(1).intValue() - 1;
                this.x = list.get(1).intValue();
                this.y = list.get(2).intValue() - 1;
                this.F = list.get(2).intValue();
                this.G = list.get(3).intValue() - 1;
            }
            if (iVar.f114676g != null && iVar.f114676g.size() == 3) {
                List<Integer> list2 = iVar.f114676g;
                this.D = list2.get(0).intValue();
                int intValue = list2.get(1).intValue() - 1;
                this.E = intValue;
                this.B = this.D;
                this.C = intValue;
                this.H = list2.get(1).intValue();
                this.I = list2.get(2).intValue() - 1;
            }
        }
        this.J = "newpendant";
    }
}

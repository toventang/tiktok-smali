package com.ss.android.ugc.aweme.pendant;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class p extends FrameLayout implements d, n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f114743a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final View f114744b;

    /* renamed from: c  reason: collision with root package name */
    private final FrameLayout f114745c;

    /* renamed from: d  reason: collision with root package name */
    private final SmartImageView f114746d;

    /* renamed from: e  reason: collision with root package name */
    private final SmartImageView f114747e;

    /* renamed from: f  reason: collision with root package name */
    private final OptimizedLottieAnimationView f114748f;

    /* renamed from: g  reason: collision with root package name */
    private final OptimizedLottieAnimationView f114749g;

    /* renamed from: h  reason: collision with root package name */
    private final ImageView f114750h;

    /* renamed from: i  reason: collision with root package name */
    private final RelativeLayout f114751i;

    /* renamed from: j  reason: collision with root package name */
    private a f114752j;

    /* renamed from: k  reason: collision with root package name */
    private final h.f.a.a<z> f114753k;

    static {
        Covode.recordClassIndex(73830);
    }

    private final void setPendantType(int i2) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73831);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f114754a = new b();

        static {
            Covode.recordClassIndex(73832);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    public final FrameLayout getContent() {
        return this.f114745c;
    }

    public final void a() {
        a aVar = this.f114752j;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void b() {
        a aVar = this.f114752j;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void c() {
        a aVar = this.f114752j;
        if (aVar != null) {
            aVar.d();
        }
    }

    private final boolean getCollapsing() {
        a aVar = this.f114752j;
        if (aVar != null) {
            return aVar.f114590k;
        }
        return false;
    }

    public final boolean getClosed() {
        a aVar = this.f114752j;
        if (aVar != null) {
            return aVar.f114586g;
        }
        return false;
    }

    public final boolean getCollapsed() {
        a aVar = this.f114752j;
        if (aVar != null) {
            return aVar.f114587h;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.pendant.d
    public final boolean getTimeLimitState() {
        a aVar = this.f114752j;
        if (!(aVar instanceof d)) {
            aVar = null;
        }
        d dVar = (d) aVar;
        if (dVar != null) {
            return dVar.getTimeLimitState();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.pendant.n
    public final void a(k kVar) {
        l.d(kVar, "");
        a aVar = this.f114752j;
        if (aVar != null) {
            aVar.a(kVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.pendant.d
    public final void setTimeLimitState(boolean z) {
        a aVar = this.f114752j;
        if (!(aVar instanceof d)) {
            aVar = null;
        }
        d dVar = (d) aVar;
        if (dVar != null) {
            dVar.setTimeLimitState(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.pendant.n
    public final void a(h.f.a.a<z> aVar) {
        a aVar2 = this.f114752j;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private p(int i2, i iVar, Context context) {
        super(context, null, 0);
        l.d(iVar, "");
        l.d(context, "");
        a aVar = null;
        MethodCollector.i(4948);
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.mo, this, true);
        this.f114744b = a2;
        FrameLayout frameLayout = (FrameLayout) a2.findViewById(R.id.d32);
        this.f114745c = frameLayout;
        SmartImageView smartImageView = (SmartImageView) frameLayout.findViewById(R.id.t6);
        this.f114746d = smartImageView;
        SmartImageView smartImageView2 = (SmartImageView) frameLayout.findViewById(R.id.e6_);
        this.f114747e = smartImageView2;
        OptimizedLottieAnimationView optimizedLottieAnimationView = (OptimizedLottieAnimationView) frameLayout.findViewById(R.id.t7);
        this.f114748f = optimizedLottieAnimationView;
        OptimizedLottieAnimationView optimizedLottieAnimationView2 = (OptimizedLottieAnimationView) frameLayout.findViewById(R.id.e6c);
        this.f114749g = optimizedLottieAnimationView2;
        ImageView imageView = (ImageView) frameLayout.findViewById(R.id.a7q);
        this.f114750h = imageView;
        RelativeLayout relativeLayout = (RelativeLayout) frameLayout.findViewById(R.id.a2_);
        this.f114751i = relativeLayout;
        b bVar = b.f114754a;
        this.f114753k = bVar;
        setPendantType(i2);
        iVar.f114677h = bVar;
        if (i2 == 0) {
            l.b(frameLayout, "");
            l.b(smartImageView, "");
            l.b(smartImageView2, "");
            l.b(imageView, "");
            l.b(relativeLayout, "");
            aVar = new m(context, frameLayout, smartImageView, smartImageView2, imageView, relativeLayout, iVar);
        } else if (i2 == 1) {
            l.b(frameLayout, "");
            l.b(smartImageView, "");
            l.b(smartImageView2, "");
            l.b(imageView, "");
            l.b(relativeLayout, "");
            aVar = new q(context, frameLayout, smartImageView, smartImageView2, imageView, relativeLayout, iVar);
        } else if (i2 == 2) {
            l.b(frameLayout, "");
            l.b(optimizedLottieAnimationView, "");
            l.b(optimizedLottieAnimationView2, "");
            l.b(imageView, "");
            l.b(relativeLayout, "");
            aVar = new g(context, frameLayout, optimizedLottieAnimationView, optimizedLottieAnimationView2, imageView, relativeLayout, iVar);
        }
        this.f114752j = aVar;
        MethodCollector.o(4948);
    }

    public /* synthetic */ p(int i2, i iVar, Context context, byte b2) {
        this(i2, iVar, context);
    }
}

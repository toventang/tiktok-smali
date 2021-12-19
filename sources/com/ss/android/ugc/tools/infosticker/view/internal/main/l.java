package com.ss.android.ugc.tools.infosticker.view.internal.main;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.tools.infosticker.view.internal.b;
import com.ss.android.ugc.tools.infosticker.view.internal.base.b;
import com.ss.android.ugc.tools.infosticker.view.internal.f;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class l implements com.ss.android.ugc.tools.infosticker.view.a.f {
    public final f.a.b.a A;
    ViewGroup B;
    public final ViewGroup C;
    final androidx.lifecycle.m D;
    public final com.ss.android.ugc.tools.infosticker.view.internal.l E;

    /* renamed from: a  reason: collision with root package name */
    private com.ss.android.ugc.tools.view.base.c f149733a;

    /* renamed from: b  reason: collision with root package name */
    private View f149734b;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f149735c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f149736d;

    /* renamed from: e  reason: collision with root package name */
    private final f.a.l.g<h.p<Boolean, String>> f149737e;

    /* renamed from: f  reason: collision with root package name */
    private final f.a.l.g<com.ss.android.ugc.tools.view.widget.b.a> f149738f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f149739g;

    /* renamed from: h  reason: collision with root package name */
    public final c f149740h;

    /* renamed from: i  reason: collision with root package name */
    com.ss.android.ugc.tools.view.base.d f149741i;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.tools.infosticker.view.internal.f f149742j;

    /* renamed from: k  reason: collision with root package name */
    public com.ss.android.ugc.tools.infosticker.view.internal.g f149743k;

    /* renamed from: l  reason: collision with root package name */
    public com.ss.android.ugc.tools.infosticker.view.internal.j f149744l;

    /* renamed from: m  reason: collision with root package name */
    com.ss.android.ugc.tools.infosticker.view.internal.b f149745m;
    final h.h n;
    final h.h o;
    final h.h p;
    final h.h q;
    final h.h r;
    boolean s;
    final f.a.l.g<Boolean> t;
    final f.a.l.g<h.p<f.a, Integer>> u;
    final f.a.l.g<h.p<Boolean, String>> v;
    public final f.a.l.g<h.p<Effect, Boolean>> w;
    public final f.a.l.g<h.p<ProviderEffect, Boolean>> x;
    public final f.a.l.g<h.p<InfoStickerEffect, Boolean>> y;
    public final f.a.l.g<com.ss.android.ugc.tools.infosticker.view.a.g> z;

    static final class e implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static final e f149794a = new e();

        static {
            Covode.recordClassIndex(98619);
        }

        e() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final f f149795a = new f();

        static {
            Covode.recordClassIndex(98620);
        }

        f() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static final class y<T> implements f.a.d.f<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149814a;

        static {
            Covode.recordClassIndex(98639);
        }

        y(l lVar) {
            this.f149814a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Integer num) {
        }
    }

    static {
        Covode.recordClassIndex(98583);
    }

    public final com.ss.android.ugc.tools.infosticker.view.a.c<ProviderEffect> i() {
        return (com.ss.android.ugc.tools.infosticker.view.a.c) this.f149735c.getValue();
    }

    public static final class an extends com.ss.android.ugc.tools.infosticker.view.internal.provider.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149760a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f149761b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f149762c;

        static {
            Covode.recordClassIndex(98598);
        }

        static final class a extends h.f.b.m implements h.f.a.a<h.z> {
            final /* synthetic */ an this$0;

            static {
                Covode.recordClassIndex(98599);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(an anVar) {
                super(0);
                this.this$0 = anVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ h.z invoke() {
                this.this$0.u();
                return h.z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
        public final RecyclerView.ViewHolder b(ViewGroup viewGroup) {
            RecyclerView.ViewHolder viewHolder;
            h.f.b.l.d(viewGroup, "");
            h.f.a.m<? super ViewGroup, ? super h.f.a.a<h.z>, ? extends RecyclerView.ViewHolder> mVar = this.f149760a.f149740h.f149791l.f149747b;
            if (mVar == null || (viewHolder = (RecyclerView.ViewHolder) mVar.invoke(viewGroup, new a(this))) == null) {
                return super.b(viewGroup);
            }
            return viewHolder;
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
        public final void a(RecyclerView.ViewHolder viewHolder, com.ss.android.ugc.tools.view.widget.b.a aVar) {
            h.f.b.l.d(viewHolder, "");
            h.f.b.l.d(aVar, "");
            h.f.a.m<? super RecyclerView.ViewHolder, ? super com.ss.android.ugc.tools.view.widget.b.a, h.z> mVar = this.f149760a.f149740h.f149791l.f149748c;
            if (mVar == null || mVar.invoke(viewHolder, aVar) == null) {
                super.a(viewHolder, aVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        an(l lVar, ViewGroup viewGroup, int i2, Context context, androidx.lifecycle.m mVar, com.ss.android.ugc.tools.infosticker.view.internal.h hVar, com.ss.android.ugc.tools.infosticker.view.internal.k kVar, ViewGroup viewGroup2, int i3, boolean z, h.f.a.b bVar) {
            super(context, mVar, hVar, kVar, viewGroup2, i3, z, bVar);
            this.f149760a = lVar;
            this.f149761b = viewGroup;
            this.f149762c = i2;
        }
    }

    public static final class ao extends com.ss.android.ugc.tools.infosticker.view.internal.search.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149763a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f149764b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f149765c;

        static {
            Covode.recordClassIndex(98600);
        }

        static final class a extends h.f.b.m implements h.f.a.a<h.z> {
            final /* synthetic */ ao this$0;

            static {
                Covode.recordClassIndex(98601);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(ao aoVar) {
                super(0);
                this.this$0 = aoVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ h.z invoke() {
                this.this$0.u();
                return h.z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
        public final RecyclerView.ViewHolder b(ViewGroup viewGroup) {
            RecyclerView.ViewHolder viewHolder;
            h.f.b.l.d(viewGroup, "");
            h.f.a.m<? super ViewGroup, ? super h.f.a.a<h.z>, ? extends RecyclerView.ViewHolder> mVar = this.f149763a.f149740h.f149792m.f149747b;
            if (mVar == null || (viewHolder = (RecyclerView.ViewHolder) mVar.invoke(viewGroup, new a(this))) == null) {
                return super.b(viewGroup);
            }
            return viewHolder;
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
        public final void a(RecyclerView.ViewHolder viewHolder, com.ss.android.ugc.tools.view.widget.b.a aVar) {
            h.f.b.l.d(viewHolder, "");
            h.f.b.l.d(aVar, "");
            h.f.a.m<? super RecyclerView.ViewHolder, ? super com.ss.android.ugc.tools.view.widget.b.a, h.z> mVar = this.f149763a.f149740h.f149792m.f149748c;
            if (mVar == null || mVar.invoke(viewHolder, aVar) == null) {
                super.a(viewHolder, aVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ao(l lVar, ViewGroup viewGroup, int i2, Context context, androidx.lifecycle.m mVar, com.ss.android.ugc.tools.infosticker.view.internal.i iVar, com.ss.android.ugc.tools.infosticker.view.internal.k kVar, ViewGroup viewGroup2, int i3, h.f.a.b bVar, String str) {
            super(context, mVar, iVar, kVar, viewGroup2, i3, str, bVar);
            this.f149763a = lVar;
            this.f149764b = viewGroup;
            this.f149765c = i2;
        }
    }

    static final class am extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.tools.infosticker.view.a.c<ProviderEffect>> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(98597);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        am(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.tools.infosticker.view.a.c<ProviderEffect> invoke() {
            return this.this$0.i();
        }
    }

    static final class aw extends h.f.b.m implements h.f.a.a<ViewGroup> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(98613);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aw(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ViewGroup invoke() {
            return this.this$0.j();
        }
    }

    static final class ak extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(98595);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ak(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return (ViewGroup) this.this$0.n.getValue();
        }
    }

    static final class al extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(98596);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        al(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return ((com.ss.android.ugc.tools.infosticker.view.a.b) this.this$0.o.getValue()).l();
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.f
    public final f.a.t<Boolean> c() {
        f.a.t<Boolean> c2 = this.t.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.f
    public final f.a.t<h.p<f.a, Integer>> d() {
        f.a.t<h.p<f.a, Integer>> c2 = this.u.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.f
    public final f.a.t<h.p<Effect, Boolean>> e() {
        f.a.t<h.p<Effect, Boolean>> c2 = this.w.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.f
    public final f.a.t<h.p<ProviderEffect, Boolean>> f() {
        f.a.t<h.p<ProviderEffect, Boolean>> c2 = this.x.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.f
    public final f.a.t<h.p<Boolean, String>> g() {
        f.a.t<h.p<Boolean, String>> c2 = this.v.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.f
    public final f.a.t<com.ss.android.ugc.tools.infosticker.view.a.g> h() {
        f.a.t<com.ss.android.ugc.tools.infosticker.view.a.g> c2 = this.z.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    static final class av extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a>> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(98611);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        av(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        static final class a extends h.f.b.m implements h.f.a.a<h.z> {
            final /* synthetic */ av this$0;

            static {
                Covode.recordClassIndex(98612);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(av avVar) {
                super(0);
                this.this$0 = avVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ h.z invoke() {
                com.ss.android.ugc.tools.infosticker.view.internal.d a2;
                com.ss.android.ugc.tools.infosticker.view.internal.l lVar = this.this$0.this$0.E;
                if (!(lVar == null || (a2 = lVar.a()) == null)) {
                    a2.c();
                }
                return h.z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a> invoke() {
            MethodCollector.i(7227);
            l lVar = this.this$0;
            ViewGroup viewGroup = lVar.B;
            if (viewGroup == null) {
                h.f.b.l.a("content");
            }
            View findViewById = viewGroup.findViewById(R.id.bot);
            h.f.b.l.b(findViewById, "");
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            h.f.b.l.d(viewGroup2, "");
            Map a2 = h.a.ag.a(h.v.a(com.ss.android.ugc.tools.view.widget.b.a.LOADING, ap.f149766a), h.v.a(com.ss.android.ugc.tools.view.widget.b.a.EMPTY, aq.f149767a), h.v.a(com.ss.android.ugc.tools.view.widget.b.a.ERROR, new ar(lVar)));
            Context context = viewGroup2.getContext();
            h.f.b.l.b(context, "");
            com.ss.android.ugc.tools.view.widget.b.d dVar = new com.ss.android.ugc.tools.view.widget.b.d(context, a2, com.ss.android.ugc.tools.view.widget.b.a.NONE, (byte) 0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            dVar.setLayoutParams(layoutParams);
            viewGroup2.addView(dVar);
            h.f.a.m<? super com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a>, ? super h.f.a.a<h.z>, h.z> mVar = this.this$0.f149740h.n;
            if (mVar != null) {
                mVar.invoke(dVar, new a(this));
            }
            MethodCollector.o(7227);
            return dVar;
        }
    }

    static final class ax extends h.f.b.m implements h.f.a.a<Vibrator> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(98614);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ax(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Vibrator invoke() {
            Object a2 = a(this.this$0.C.getContext(), "vibrator");
            Objects.requireNonNull(a2, "null cannot be cast to non-null type android.os.Vibrator");
            return a2;
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(7237);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                    try {
                        new com.bytedance.platform.godzilla.b.b.b().a();
                        com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                        obj = context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = context.getSystemService(str);
            } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = context.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                            } catch (Exception e2) {
                                com.bytedance.crash.c.a(e2, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                    } finally {
                        MethodCollector.o(7237);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f149771a;

        /* renamed from: b  reason: collision with root package name */
        public float f149772b;

        /* renamed from: c  reason: collision with root package name */
        public int f149773c;

        /* renamed from: d  reason: collision with root package name */
        public int f149774d;

        /* renamed from: e  reason: collision with root package name */
        public int f149775e;

        /* renamed from: f  reason: collision with root package name */
        public int f149776f;

        /* renamed from: g  reason: collision with root package name */
        public int f149777g;

        /* renamed from: h  reason: collision with root package name */
        public h.f.a.b<? super ViewPager, h.z> f149778h;

        /* renamed from: i  reason: collision with root package name */
        public h.f.a.b<? super TabLayout, h.z> f149779i;

        static {
            Covode.recordClassIndex(98615);
        }

        private b() {
            this.f149771a = -1;
            this.f149772b = 74.0f;
            this.f149773c = 0;
            this.f149774d = 0;
            this.f149775e = 0;
            this.f149776f = 0;
            this.f149777g = 0;
            this.f149778h = null;
            this.f149779i = null;
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.f
    public final void b() {
        if (this.f149740h.f149782c) {
            com.ss.android.ugc.tools.view.base.d dVar = this.f149741i;
            if (dVar == null) {
                h.f.b.l.a("transitionView");
            }
            dVar.c();
            return;
        }
        com.ss.android.ugc.tools.view.base.d dVar2 = this.f149741i;
        if (dVar2 == null) {
            h.f.b.l.a("transitionView");
        }
        dVar2.f();
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f149780a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f149781b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f149782c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f149783d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f149784e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f149785f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f149786g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f149787h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f149788i;

        /* renamed from: j  reason: collision with root package name */
        public h.f.a.b<? super String, h.z> f149789j;

        /* renamed from: k  reason: collision with root package name */
        public a f149790k;

        /* renamed from: l  reason: collision with root package name */
        public a f149791l;

        /* renamed from: m  reason: collision with root package name */
        public a f149792m;
        public h.f.a.m<? super com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a>, ? super h.f.a.a<h.z>, h.z> n;
        public String o;
        public String p;
        public boolean q;
        public b r;

        static {
            Covode.recordClassIndex(98616);
        }

        public /* synthetic */ c() {
            this(AnonymousClass1.f149793a, new a(0, null, 15), new a(0, null, 14), new a(0, null, 14), "", new b((byte) 0));
        }

        private c(h.f.a.b<? super String, h.z> bVar, a aVar, a aVar2, a aVar3, String str, b bVar2) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(aVar, "");
            h.f.b.l.d(aVar2, "");
            h.f.b.l.d(aVar3, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(bVar2, "");
            this.f149780a = false;
            this.f149781b = true;
            this.f149782c = true;
            this.f149783d = true;
            this.f149784e = true;
            this.f149785f = true;
            this.f149786g = false;
            this.f149787h = true;
            this.f149788i = false;
            this.f149789j = bVar;
            this.f149790k = aVar;
            this.f149791l = aVar2;
            this.f149792m = aVar3;
            this.n = null;
            this.o = null;
            this.p = str;
            this.q = true;
            this.r = bVar2;
        }
    }

    static final class at extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.tools.infosticker.view.a.c<ProviderEffect>> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(98609);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        at(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.tools.infosticker.view.a.c<ProviderEffect> invoke() {
            com.ss.android.ugc.tools.infosticker.view.internal.h<ProviderEffect> hVar;
            l lVar = this.this$0;
            ViewGroup viewGroup = lVar.B;
            if (viewGroup == null) {
                h.f.b.l.a("content");
            }
            h.f.b.l.d(viewGroup, "");
            int i2 = lVar.f149740h.f149791l.f149746a;
            if (i2 == 0) {
                if (lVar.f149740h.f149781b) {
                    i2 = 4;
                } else {
                    i2 = 3;
                }
            }
            Context context = viewGroup.getContext();
            h.f.b.l.b(context, "");
            androidx.lifecycle.m mVar = lVar.D;
            com.ss.android.ugc.tools.infosticker.view.internal.l lVar2 = lVar.E;
            com.ss.android.ugc.tools.infosticker.view.internal.k<ProviderEffect> kVar = null;
            if (lVar2 != null) {
                hVar = lVar2.f();
            } else {
                hVar = null;
            }
            com.ss.android.ugc.tools.infosticker.view.internal.l lVar3 = lVar.E;
            if (lVar3 != null) {
                kVar = lVar3.g();
            }
            an anVar = new an(lVar, viewGroup, i2, context, mVar, hVar, kVar, (ViewGroup) viewGroup.findViewById(R.id.bov), i2, lVar.f149740h.f149781b, lVar.f149740h.f149791l.f149749d);
            anVar.s();
            lVar.A.a(anVar.k().a(new p(lVar), com.ss.android.ugc.tools.utils.p.f150012a));
            lVar.A.a(anVar.f().a(new q(lVar), com.ss.android.ugc.tools.utils.p.f150012a));
            lVar.A.a(anVar.g().a(new r(lVar), com.ss.android.ugc.tools.utils.p.f150012a));
            lVar.A.a(anVar.h().a(new s(lVar), com.ss.android.ugc.tools.utils.p.f150012a));
            lVar.A.a(anVar.j().a(new t(lVar), com.ss.android.ugc.tools.utils.p.f150012a));
            return anVar;
        }
    }

    static final class au extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.tools.infosticker.view.a.d<InfoStickerEffect>> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(98610);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        au(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.tools.infosticker.view.a.d<InfoStickerEffect> invoke() {
            com.ss.android.ugc.tools.infosticker.view.internal.i<InfoStickerEffect> iVar;
            l lVar = this.this$0;
            ViewGroup viewGroup = lVar.B;
            if (viewGroup == null) {
                h.f.b.l.a("content");
            }
            h.f.b.l.d(viewGroup, "");
            int i2 = lVar.f149740h.f149792m.f149746a;
            if (i2 == 0) {
                if (lVar.f149740h.f149781b) {
                    i2 = 4;
                } else {
                    i2 = 3;
                }
            }
            Context context = viewGroup.getContext();
            h.f.b.l.b(context, "");
            androidx.lifecycle.m mVar = lVar.D;
            com.ss.android.ugc.tools.infosticker.view.internal.l lVar2 = lVar.E;
            com.ss.android.ugc.tools.infosticker.view.internal.k<InfoStickerEffect> kVar = null;
            if (lVar2 != null) {
                iVar = lVar2.h();
            } else {
                iVar = null;
            }
            com.ss.android.ugc.tools.infosticker.view.internal.l lVar3 = lVar.E;
            if (lVar3 != null) {
                kVar = lVar3.i();
            }
            ao aoVar = new ao(lVar, viewGroup, i2, context, mVar, iVar, kVar, (ViewGroup) viewGroup.findViewById(R.id.bov), i2, lVar.f149740h.f149792m.f149749d, lVar.f149740h.p);
            aoVar.s();
            lVar.A.a(aoVar.k().a(new u(lVar), com.ss.android.ugc.tools.utils.p.f150012a));
            lVar.A.a(aoVar.f().a(new v(lVar), com.ss.android.ugc.tools.utils.p.f150012a));
            lVar.A.a(aoVar.g().a(new w(lVar), com.ss.android.ugc.tools.utils.p.f150012a));
            lVar.A.a(aoVar.h().a(new x(lVar), com.ss.android.ugc.tools.utils.p.f150012a));
            lVar.A.a(aoVar.j().a(new y(lVar), com.ss.android.ugc.tools.utils.p.f150012a));
            return aoVar;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.tools.infosticker.view.a.b<Effect>> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(98618);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.tools.infosticker.view.a.b<Effect> invoke() {
            com.ss.android.ugc.tools.infosticker.view.internal.e<Effect> eVar;
            l lVar = this.this$0;
            ViewGroup viewGroup = lVar.B;
            if (viewGroup == null) {
                h.f.b.l.a("content");
            }
            h.f.b.l.d(viewGroup, "");
            Context context = viewGroup.getContext();
            h.f.b.l.b(context, "");
            androidx.lifecycle.m mVar = lVar.D;
            com.ss.android.ugc.tools.infosticker.view.internal.l lVar2 = lVar.E;
            com.ss.android.ugc.tools.infosticker.view.internal.k<Effect> kVar = null;
            if (lVar2 != null) {
                eVar = lVar2.d();
            } else {
                eVar = null;
            }
            com.ss.android.ugc.tools.infosticker.view.internal.l lVar3 = lVar.E;
            if (lVar3 != null) {
                kVar = lVar3.e();
            }
            d dVar = new d(context, mVar, eVar, kVar, lVar.f149740h.f149788i, lVar.f149740h.f149790k.f149749d, (byte) 0);
            if (lVar.f149740h.f149788i) {
                dVar.a();
            } else {
                dVar.s();
            }
            dVar.cD_();
            dVar.l().setTag(R.id.bor, dVar);
            lVar.A.a(dVar.k().a(new h(lVar), com.ss.android.ugc.tools.utils.p.f150012a));
            lVar.A.a(dVar.m().a(new i(lVar), com.ss.android.ugc.tools.utils.p.f150012a));
            lVar.A.a(dVar.f().a(new j(lVar), com.ss.android.ugc.tools.utils.p.f150012a));
            lVar.A.a(dVar.g().a(new k(lVar), com.ss.android.ugc.tools.utils.p.f150012a));
            lVar.A.a(dVar.h().a(new C4041l(lVar), com.ss.android.ugc.tools.utils.p.f150012a));
            return dVar;
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.f
    public final void a() {
        com.ss.android.ugc.tools.infosticker.view.internal.d a2;
        if (!this.f149736d) {
            ViewGroup viewGroup = this.B;
            if (viewGroup == null) {
                h.f.b.l.a("content");
            }
            h.f.b.l.d(viewGroup, "");
            View findViewById = viewGroup.findViewById(R.id.bp1);
            h.f.b.l.b(findViewById, "");
            ViewPager viewPager = (ViewPager) findViewById;
            View findViewById2 = viewGroup.findViewById(R.id.ebm);
            h.f.b.l.b(findViewById2, "");
            TabLayout tabLayout = (TabLayout) findViewById2;
            View findViewById3 = viewGroup.findViewById(R.id.bok);
            h.f.b.l.b(findViewById3, "");
            tabLayout.setTabMargin(0);
            b bVar = this.f149740h.r;
            Drawable a3 = a(bVar.f149777g);
            if (a3 != null) {
                viewPager.setBackground(a3);
            }
            Drawable a4 = a(bVar.f149776f);
            if (a4 != null) {
                View findViewById4 = viewGroup.findViewById(R.id.ebn);
                h.f.b.l.b(findViewById4, "");
                findViewById4.setBackground(a4);
            }
            h.f.a.b<? super ViewPager, h.z> bVar2 = bVar.f149778h;
            if (bVar2 != null) {
                bVar2.invoke(viewPager);
            }
            h.f.a.b<? super TabLayout, h.z> bVar3 = bVar.f149779i;
            if (bVar3 != null) {
                bVar3.invoke(tabLayout);
            }
            f fVar = new f(viewPager, tabLayout, findViewById3, this.f149740h);
            this.A.a(fVar.c().a(new m(this), com.ss.android.ugc.tools.utils.p.f150012a));
            fVar.a(true);
            fVar.b();
            this.f149742j = fVar;
            ViewGroup viewGroup2 = this.B;
            if (viewGroup2 == null) {
                h.f.b.l.a("content");
            }
            h.f.b.l.d(viewGroup2, "");
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.bos);
            View findViewById5 = viewGroup2.findViewById(R.id.bov);
            Drawable a5 = a(this.f149740h.r.f149774d);
            if (a5 != null) {
                h.f.b.l.b(viewGroup3, "");
                viewGroup3.setBackground(a5);
            }
            Drawable a6 = a(this.f149740h.r.f149775e);
            if (a6 != null) {
                h.f.b.l.b(findViewById5, "");
                findViewById5.setBackground(a6);
            }
            h.f.b.l.b(viewGroup3, "");
            am amVar = new am(this);
            h.f.b.l.b(findViewById5, "");
            Context context = viewGroup2.getContext();
            if (!(context instanceof Activity)) {
                context = null;
            }
            g gVar = new g(viewGroup3, amVar, findViewById5, (Activity) context, this.f149740h.o, this.f149740h.q);
            this.f149743k = gVar;
            gVar.a(this.f149740h.f149780a);
            if (this.f149740h.f149780a) {
                f.a.b.a aVar = this.A;
                com.ss.android.ugc.tools.infosticker.view.internal.g gVar2 = this.f149743k;
                if (gVar2 == null) {
                    h.f.b.l.b();
                }
                aVar.a(gVar2.b().a(new o(this), com.ss.android.ugc.tools.utils.p.f150012a));
            }
            boolean z2 = this.f149740h.f149783d;
            ViewGroup viewGroup4 = this.B;
            if (viewGroup4 == null) {
                h.f.b.l.a("content");
            }
            com.ss.android.ugc.tools.infosticker.view.internal.f fVar2 = this.f149742j;
            if (fVar2 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.d(viewGroup4, "");
            h.f.b.l.d(fVar2, "");
            View findViewById6 = viewGroup4.findViewById(R.id.eae);
            h.f.b.l.b(findViewById6, "");
            b bVar4 = new b(findViewById6, fVar2.a(), z2);
            this.f149745m = bVar4;
            if (z2) {
                bVar4.a(false);
                f.a.b.a aVar2 = this.A;
                com.ss.android.ugc.tools.infosticker.view.internal.b bVar5 = this.f149745m;
                if (bVar5 == null) {
                    h.f.b.l.b();
                }
                aVar2.a(bVar5.a().a(new g(this), com.ss.android.ugc.tools.utils.p.f150012a));
            }
            ViewGroup viewGroup5 = this.B;
            if (viewGroup5 == null) {
                h.f.b.l.a("content");
            }
            h.f.b.l.d(viewGroup5, "");
            this.f149733a = new aj(viewGroup5);
            if (this.f149740h.f149784e) {
                com.ss.android.ugc.tools.view.base.c cVar = this.f149733a;
                if (cVar == null) {
                    h.f.b.l.b();
                }
                cVar.a(new n(this));
            }
            com.ss.android.ugc.tools.infosticker.view.internal.l lVar = this.E;
            if (!(lVar == null || (a2 = lVar.a()) == null)) {
                a2.b().observe(this.D, new ah(this));
                a2.a().observe(this.D, new ai(this));
            }
            this.f149736d = true;
        }
        if (this.f149740h.f149782c) {
            com.ss.android.ugc.tools.view.base.d dVar = this.f149741i;
            if (dVar == null) {
                h.f.b.l.a("transitionView");
            }
            dVar.a();
            return;
        }
        com.ss.android.ugc.tools.view.base.d dVar2 = this.f149741i;
        if (dVar2 == null) {
            h.f.b.l.a("transitionView");
        }
        dVar2.b();
    }

    public final ViewGroup j() {
        com.ss.android.ugc.tools.infosticker.view.internal.a<EffectCategoryResponse, Effect> aVar;
        int i2;
        ViewGroup viewGroup = this.B;
        if (viewGroup == null) {
            h.f.b.l.a("content");
        }
        h.f.b.l.d(viewGroup, "");
        com.ss.android.ugc.tools.infosticker.view.internal.k<Effect> kVar = null;
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b4l, null, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) a2;
        View findViewById = viewGroup2.findViewById(R.id.eb_);
        Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup3 = (ViewGroup) findViewById;
        h.f.b.l.d(viewGroup3, "");
        Context context = viewGroup3.getContext();
        h.f.b.l.b(context, "");
        androidx.lifecycle.m mVar = this.D;
        com.ss.android.ugc.tools.infosticker.view.internal.l lVar = this.E;
        if (lVar != null) {
            aVar = lVar.b();
        } else {
            aVar = null;
        }
        com.ss.android.ugc.tools.infosticker.view.internal.l lVar2 = this.E;
        if (lVar2 != null) {
            kVar = lVar2.c();
        }
        if (this.f149740h.f149781b) {
            i2 = 4;
        } else {
            i2 = 3;
        }
        a aVar2 = new a(context, mVar, aVar, kVar, viewGroup3, i2, this.f149740h.f149781b, this.f149740h.f149788i, this.f149740h.f149790k.f149749d);
        if (this.f149740h.f149788i) {
            aVar2.y();
        } else {
            aVar2.s();
        }
        viewGroup2.setTag(R.id.bor, aVar2);
        this.A.a(aVar2.k().a(new z(this), com.ss.android.ugc.tools.utils.p.f150012a));
        this.A.a(aVar2.m().a(new aa(this), com.ss.android.ugc.tools.utils.p.f150012a));
        this.A.a(aVar2.f().a(new ab(this), com.ss.android.ugc.tools.utils.p.f150012a));
        this.A.a(aVar2.g().a(new ac(this), com.ss.android.ugc.tools.utils.p.f150012a));
        this.A.a(aVar2.h().a(new ad(this), com.ss.android.ugc.tools.utils.p.f150012a));
        this.A.a(aVar2.n().a(new ae(this), com.ss.android.ugc.tools.utils.p.f150012a));
        View findViewById2 = viewGroup2.findViewById(R.id.vd);
        Objects.requireNonNull(findViewById2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout");
        com.ss.android.ugc.tools.infosticker.view.a.e<EffectCategoryResponse, Effect> a3 = a((TabLayout) findViewById2);
        a3.a(aVar2);
        this.A.a(a3.a().a(new af(this), com.ss.android.ugc.tools.utils.p.f150012a));
        aVar2.cD_();
        return viewGroup2;
    }

    public static final class aj implements com.ss.android.ugc.tools.view.base.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f149759a;

        static {
            Covode.recordClassIndex(98594);
        }

        aj(ViewGroup viewGroup) {
            this.f149759a = viewGroup;
        }

        @Override // com.ss.android.ugc.tools.view.base.c
        public final void a(View.OnClickListener onClickListener) {
            h.f.b.l.d(onClickListener, "");
            View findViewById = this.f149759a.findViewById(R.id.ebu);
            if (findViewById != null) {
                findViewById.setOnClickListener(onClickListener);
            }
        }
    }

    static final class ap extends h.f.b.m implements h.f.a.b<ViewGroup, View> {

        /* renamed from: a  reason: collision with root package name */
        public static final ap f149766a = new ap();

        static {
            Covode.recordClassIndex(98602);
        }

        ap() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return com.ss.android.ugc.tools.view.widget.b.e.a(viewGroup2);
        }
    }

    static final class aq extends h.f.b.m implements h.f.a.b<ViewGroup, View> {

        /* renamed from: a  reason: collision with root package name */
        public static final aq f149767a = new aq();

        static {
            Covode.recordClassIndex(98603);
        }

        aq() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return com.ss.android.ugc.tools.view.widget.b.e.a(viewGroup2, AnonymousClass1.f149768a);
        }
    }

    static final class as extends h.f.b.m implements h.f.a.b<View, com.ss.android.ugc.aweme.da.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final as f149770a = new as();

        static {
            Covode.recordClassIndex(98608);
        }

        as() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.da.d invoke(View view) {
            View view2 = view;
            h.f.b.l.d(view2, "");
            return new com.ss.android.ugc.tools.view.base.f(view2);
        }
    }

    /* access modifiers changed from: protected */
    public com.ss.android.ugc.tools.infosticker.view.a.e<EffectCategoryResponse, Effect> a(TabLayout tabLayout) {
        h.f.b.l.d(tabLayout, "");
        return new k(tabLayout);
    }

    /* access modifiers changed from: package-private */
    public static final class ac<T> implements f.a.d.f<Effect> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149752a;

        static {
            Covode.recordClassIndex(98587);
        }

        ac(l lVar) {
            this.f149752a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Effect effect) {
            this.f149752a.w.onNext(h.v.a(effect, true));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ad<T> implements f.a.d.f<Effect> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149753a;

        static {
            Covode.recordClassIndex(98588);
        }

        ad(l lVar) {
            this.f149753a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Effect effect) {
            this.f149753a.w.onNext(h.v.a(effect, false));
        }
    }

    static final class ah<T> implements androidx.lifecycle.u<com.ss.android.ugc.tools.view.widget.b.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149757a;

        static {
            Covode.recordClassIndex(98592);
        }

        ah(l lVar) {
            this.f149757a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.ss.android.ugc.tools.view.widget.b.a aVar) {
            com.ss.android.ugc.tools.view.widget.b.a aVar2 = aVar;
            if (aVar2 != null) {
                ((com.ss.android.ugc.tools.view.widget.b.b) this.f149757a.q.getValue()).setState(aVar2);
            }
        }
    }

    static final class ar extends h.f.b.m implements h.f.a.b<ViewGroup, View> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(98605);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ar(l lVar) {
            super(1);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return com.ss.android.ugc.tools.view.widget.b.e.a(viewGroup2, new h.f.a.q<TextView, TextView, TextView, h.z>(this) {
                /* class com.ss.android.ugc.tools.infosticker.view.internal.main.l.ar.AnonymousClass1 */
                final /* synthetic */ ar this$0;

                static {
                    Covode.recordClassIndex(98606);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // h.f.a.q
                public final /* synthetic */ h.z invoke(TextView textView, TextView textView2, TextView textView3) {
                    TextView textView4 = textView;
                    TextView textView5 = textView2;
                    TextView textView6 = textView3;
                    h.f.b.l.d(textView4, "");
                    h.f.b.l.d(textView5, "");
                    h.f.b.l.d(textView6, "");
                    textView4.setText(R.string.h2z);
                    textView5.setText(R.string.h2y);
                    textView6.setText(R.string.h35);
                    textView6.setOnClickListener(new View.OnClickListener(this) {
                        /* class com.ss.android.ugc.tools.infosticker.view.internal.main.l.ar.AnonymousClass1.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f149769a;

                        static {
                            Covode.recordClassIndex(98607);
                        }

                        {
                            this.f149769a = r1;
                        }

                        public final void onClick(View view) {
                            com.ss.android.ugc.tools.infosticker.view.internal.d a2;
                            ClickAgent.onClick(view);
                            com.ss.android.ugc.tools.infosticker.view.internal.l lVar = this.f149769a.this$0.this$0.E;
                            if (lVar != null && (a2 = lVar.a()) != null) {
                                a2.c();
                            }
                        }
                    });
                    return h.z.f158842a;
                }
            });
        }
    }

    static final class k<T> implements f.a.d.f<Effect> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149800a;

        static {
            Covode.recordClassIndex(98625);
        }

        k(l lVar) {
            this.f149800a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Effect effect) {
            this.f149800a.w.onNext(h.v.a(effect, true));
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.l$l  reason: collision with other inner class name */
    static final class C4041l<T> implements f.a.d.f<Effect> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149801a;

        static {
            Covode.recordClassIndex(98626);
        }

        C4041l(l lVar) {
            this.f149801a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Effect effect) {
            this.f149801a.w.onNext(h.v.a(effect, false));
        }
    }

    static final class m<T> implements f.a.d.f<h.p<? extends f.a, ? extends Integer>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149802a;

        static {
            Covode.recordClassIndex(98627);
        }

        m(l lVar) {
            this.f149802a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(h.p<? extends f.a, ? extends Integer> pVar) {
            h.p<? extends f.a, ? extends Integer> pVar2 = pVar;
            this.f149802a.u.onNext(h.v.a(pVar2.component1(), Integer.valueOf(((Number) pVar2.component2()).intValue())));
        }
    }

    static final class r<T> implements f.a.d.f<ProviderEffect> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149807a;

        static {
            Covode.recordClassIndex(98632);
        }

        r(l lVar) {
            this.f149807a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(ProviderEffect providerEffect) {
            this.f149807a.x.onNext(h.v.a(providerEffect, true));
        }
    }

    static final class s<T> implements f.a.d.f<ProviderEffect> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149808a;

        static {
            Covode.recordClassIndex(98633);
        }

        s(l lVar) {
            this.f149808a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(ProviderEffect providerEffect) {
            this.f149808a.x.onNext(h.v.a(providerEffect, false));
        }
    }

    static final class t<T> implements f.a.d.f<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149809a;

        static {
            Covode.recordClassIndex(98634);
        }

        t(l lVar) {
            this.f149809a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Integer num) {
            com.ss.android.ugc.tools.infosticker.view.internal.g gVar;
            if ((this.f149809a.f149740h.f149780a || this.f149809a.f149740h.f149786g) && (gVar = this.f149809a.f149743k) != null) {
                gVar.a();
            }
        }
    }

    static final class w<T> implements f.a.d.f<InfoStickerEffect> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149812a;

        static {
            Covode.recordClassIndex(98637);
        }

        w(l lVar) {
            this.f149812a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(InfoStickerEffect infoStickerEffect) {
            this.f149812a.y.onNext(h.v.a(infoStickerEffect, true));
        }
    }

    static final class x<T> implements f.a.d.f<InfoStickerEffect> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149813a;

        static {
            Covode.recordClassIndex(98638);
        }

        x(l lVar) {
            this.f149813a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(InfoStickerEffect infoStickerEffect) {
            this.f149813a.y.onNext(h.v.a(infoStickerEffect, false));
        }
    }

    private final Drawable a(int i2) {
        if (i2 == 0) {
            return null;
        }
        Context context = this.C.getContext();
        h.f.b.l.b(context, "");
        return context.getResources().getDrawable(i2);
    }

    /* access modifiers changed from: package-private */
    public static final class aa<T> implements f.a.d.f<List<? extends h.p<? extends Effect, ? extends Integer>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149750a;

        static {
            Covode.recordClassIndex(98585);
        }

        aa(l lVar) {
            this.f149750a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(List<? extends h.p<? extends Effect, ? extends Integer>> list) {
            this.f149750a.z.onNext(new com.ss.android.ugc.tools.infosticker.view.a.g(com.ss.android.ugc.tools.infosticker.view.a.h.BIND_DATA, com.ss.android.ugc.tools.infosticker.view.a.j.MAIN, null, null, null, 0, null, null, null, null, list, null, 12284));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ab<T> implements f.a.d.f<com.bytedance.jedi.arch.am<Effect, Integer, com.ss.android.ugc.tools.h.a.c>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149751a;

        static {
            Covode.recordClassIndex(98586);
        }

        ab(l lVar) {
            this.f149751a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.bytedance.jedi.arch.am<Effect, Integer, com.ss.android.ugc.tools.h.a.c> amVar) {
            com.bytedance.jedi.arch.am<Effect, Integer, com.ss.android.ugc.tools.h.a.c> amVar2 = amVar;
            this.f149751a.z.onNext(new com.ss.android.ugc.tools.infosticker.view.a.g(com.ss.android.ugc.tools.infosticker.view.a.h.STICKER_CLICK, com.ss.android.ugc.tools.infosticker.view.a.j.MAIN, h.a.n.a((Object) amVar2.f39387a), null, null, 0, null, amVar2.f39388b, amVar2.f39389c, null, null, null, 15992));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class af<T> implements f.a.d.f<EffectCategoryResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149755a;

        static {
            Covode.recordClassIndex(98590);
        }

        af(l lVar) {
            this.f149755a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(EffectCategoryResponse effectCategoryResponse) {
            EffectCategoryResponse effectCategoryResponse2 = effectCategoryResponse;
            if (this.f149755a.f149740h.f149785f) {
                ((Vibrator) this.f149755a.r.getValue()).vibrate(6);
            }
            this.f149755a.z.onNext(new com.ss.android.ugc.tools.infosticker.view.a.g(com.ss.android.ugc.tools.infosticker.view.a.h.CATEGORY_CLICK, com.ss.android.ugc.tools.infosticker.view.a.j.MAIN, null, null, null, 0, effectCategoryResponse2, null, null, null, null, null, 16316));
        }
    }

    static final class ag<T> implements f.a.d.f<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149756a;

        static {
            Covode.recordClassIndex(98591);
        }

        ag(l lVar) {
            this.f149756a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Boolean bool) {
            com.ss.android.ugc.tools.infosticker.view.internal.b bVar;
            com.ss.android.ugc.tools.infosticker.view.internal.g gVar;
            Boolean bool2 = bool;
            l lVar = this.f149756a;
            h.f.b.l.b(bool2, "");
            boolean booleanValue = bool2.booleanValue();
            com.ss.android.ugc.tools.infosticker.view.internal.l lVar2 = lVar.E;
            if (lVar2 != null) {
                lVar2.a(booleanValue);
            }
            if (!booleanValue && lVar.f149740h.f149780a && (gVar = lVar.f149743k) != null) {
                gVar.a();
            }
            if (lVar.f149740h.f149783d && (bVar = lVar.f149745m) != null) {
                bVar.a(booleanValue);
            }
            lVar.t.onNext(Boolean.valueOf(booleanValue));
        }
    }

    static final class g<T> implements f.a.d.f<b.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149796a;

        static {
            Covode.recordClassIndex(98621);
        }

        g(l lVar) {
            this.f149796a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(b.a aVar) {
            com.ss.android.ugc.tools.infosticker.view.internal.g gVar;
            l lVar = this.f149796a;
            h.f.b.l.b(aVar, "");
            if (aVar == b.a.DRAGGING) {
                if (lVar.f149740h.f149780a && (gVar = lVar.f149743k) != null) {
                    gVar.a();
                }
                if (lVar.f149740h.f149786g && lVar.f149744l != null) {
                }
            } else if (aVar == b.a.CLOSE) {
                com.ss.android.ugc.tools.view.base.d dVar = lVar.f149741i;
                if (dVar == null) {
                    h.f.b.l.a("transitionView");
                }
                dVar.f();
            }
        }
    }

    static final class h<T> implements f.a.d.f<h.p<? extends List<? extends Effect>, ? extends Integer>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149797a;

        static {
            Covode.recordClassIndex(98622);
        }

        h(l lVar) {
            this.f149797a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(h.p<? extends List<? extends Effect>, ? extends Integer> pVar) {
            h.p<? extends List<? extends Effect>, ? extends Integer> pVar2 = pVar;
            this.f149797a.z.onNext(new com.ss.android.ugc.tools.infosticker.view.a.g(com.ss.android.ugc.tools.infosticker.view.a.h.DATA_VISIBLE, com.ss.android.ugc.tools.infosticker.view.a.j.EMOJI, (List) pVar2.getFirst(), null, null, ((Number) pVar2.getSecond()).intValue(), null, null, null, null, null, null, 16344));
        }
    }

    static final class i<T> implements f.a.d.f<List<? extends h.p<? extends Effect, ? extends Integer>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149798a;

        static {
            Covode.recordClassIndex(98623);
        }

        i(l lVar) {
            this.f149798a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(List<? extends h.p<? extends Effect, ? extends Integer>> list) {
            this.f149798a.z.onNext(new com.ss.android.ugc.tools.infosticker.view.a.g(com.ss.android.ugc.tools.infosticker.view.a.h.BIND_DATA, com.ss.android.ugc.tools.infosticker.view.a.j.EMOJI, null, null, null, 0, null, null, null, null, list, null, 12284));
        }
    }

    static final class j<T> implements f.a.d.f<com.bytedance.jedi.arch.am<Effect, Integer, com.ss.android.ugc.tools.h.a.c>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149799a;

        static {
            Covode.recordClassIndex(98624);
        }

        j(l lVar) {
            this.f149799a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.bytedance.jedi.arch.am<Effect, Integer, com.ss.android.ugc.tools.h.a.c> amVar) {
            com.bytedance.jedi.arch.am<Effect, Integer, com.ss.android.ugc.tools.h.a.c> amVar2 = amVar;
            this.f149799a.z.onNext(new com.ss.android.ugc.tools.infosticker.view.a.g(com.ss.android.ugc.tools.infosticker.view.a.h.STICKER_CLICK, com.ss.android.ugc.tools.infosticker.view.a.j.EMOJI, h.a.n.a((Object) amVar2.f39387a), null, null, 0, null, amVar2.f39388b, amVar2.f39389c, null, null, null, 15992));
        }
    }

    static final class n implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149803a;

        static {
            Covode.recordClassIndex(98628);
        }

        n(l lVar) {
            this.f149803a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            l lVar = this.f149803a;
            lVar.b();
            lVar.z.onNext(new com.ss.android.ugc.tools.infosticker.view.a.g(com.ss.android.ugc.tools.infosticker.view.a.h.STICKER_LOAD, com.ss.android.ugc.tools.infosticker.view.a.j.MAIN, null, null, null, 0, null, null, null, null, null, com.ss.android.ugc.tools.infosticker.view.a.i.CANCEL, 8188));
        }
    }

    static final class o<T> implements f.a.d.f<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149804a;

        static {
            Covode.recordClassIndex(98629);
        }

        o(l lVar) {
            this.f149804a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Boolean bool) {
            Boolean bool2 = bool;
            l lVar = this.f149804a;
            h.f.b.l.b(bool2, "");
            boolean booleanValue = bool2.booleanValue();
            com.ss.android.ugc.tools.infosticker.view.internal.f fVar = lVar.f149742j;
            if (fVar != null) {
                fVar.a(!booleanValue);
            }
            lVar.v.onNext(h.v.a(Boolean.valueOf(booleanValue), lVar.i().a()));
        }
    }

    static final class p<T> implements f.a.d.f<h.p<? extends List<? extends ProviderEffect>, ? extends Integer>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149805a;

        static {
            Covode.recordClassIndex(98630);
        }

        p(l lVar) {
            this.f149805a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(h.p<? extends List<? extends ProviderEffect>, ? extends Integer> pVar) {
            h.p<? extends List<? extends ProviderEffect>, ? extends Integer> pVar2 = pVar;
            this.f149805a.z.onNext(new com.ss.android.ugc.tools.infosticker.view.a.g(com.ss.android.ugc.tools.infosticker.view.a.h.DATA_VISIBLE, com.ss.android.ugc.tools.infosticker.view.a.j.PROVIDER, null, (List) pVar2.getFirst(), null, ((Number) pVar2.getSecond()).intValue(), null, null, null, null, null, null, 16340));
        }
    }

    static final class q<T> implements f.a.d.f<com.bytedance.jedi.arch.am<ProviderEffect, Integer, com.ss.android.ugc.tools.h.a.c>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149806a;

        static {
            Covode.recordClassIndex(98631);
        }

        q(l lVar) {
            this.f149806a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.bytedance.jedi.arch.am<ProviderEffect, Integer, com.ss.android.ugc.tools.h.a.c> amVar) {
            com.bytedance.jedi.arch.am<ProviderEffect, Integer, com.ss.android.ugc.tools.h.a.c> amVar2 = amVar;
            this.f149806a.z.onNext(new com.ss.android.ugc.tools.infosticker.view.a.g(com.ss.android.ugc.tools.infosticker.view.a.h.STICKER_CLICK, com.ss.android.ugc.tools.infosticker.view.a.j.PROVIDER, null, h.a.n.a((Object) amVar2.f39387a), null, 0, null, amVar2.f39388b, amVar2.f39389c, this.f149806a.i().a(), null, null, 15476));
        }
    }

    static final class u<T> implements f.a.d.f<h.p<? extends List<? extends InfoStickerEffect>, ? extends Integer>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149810a;

        static {
            Covode.recordClassIndex(98635);
        }

        u(l lVar) {
            this.f149810a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(h.p<? extends List<? extends InfoStickerEffect>, ? extends Integer> pVar) {
            h.p<? extends List<? extends InfoStickerEffect>, ? extends Integer> pVar2 = pVar;
            this.f149810a.z.onNext(new com.ss.android.ugc.tools.infosticker.view.a.g(com.ss.android.ugc.tools.infosticker.view.a.h.DATA_VISIBLE, com.ss.android.ugc.tools.infosticker.view.a.j.SEARCH, null, null, (List) pVar2.getFirst(), ((Number) pVar2.getSecond()).intValue(), null, null, null, null, null, null, 16332));
        }
    }

    static final class v<T> implements f.a.d.f<com.bytedance.jedi.arch.am<InfoStickerEffect, Integer, com.ss.android.ugc.tools.h.a.c>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149811a;

        static {
            Covode.recordClassIndex(98636);
        }

        v(l lVar) {
            this.f149811a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.bytedance.jedi.arch.am<InfoStickerEffect, Integer, com.ss.android.ugc.tools.h.a.c> amVar) {
            com.bytedance.jedi.arch.am<InfoStickerEffect, Integer, com.ss.android.ugc.tools.h.a.c> amVar2 = amVar;
            this.f149811a.z.onNext(new com.ss.android.ugc.tools.infosticker.view.a.g(com.ss.android.ugc.tools.infosticker.view.a.h.STICKER_CLICK, com.ss.android.ugc.tools.infosticker.view.a.j.SEARCH, null, null, h.a.n.a((Object) amVar2.f39387a), 0, null, amVar2.f39388b, amVar2.f39389c, ((com.ss.android.ugc.tools.infosticker.view.a.d) this.f149811a.p.getValue()).a(), null, null, 15468));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ae<T> implements f.a.d.f<com.ss.android.ugc.tools.h.a.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149754a;

        static {
            Covode.recordClassIndex(98589);
        }

        ae(l lVar) {
            this.f149754a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.ss.android.ugc.tools.h.a.c cVar) {
            com.ss.android.ugc.tools.h.a.c cVar2 = cVar;
            if (cVar2 != null) {
                int i2 = m.f149816a[cVar2.ordinal()];
                if (i2 == 1) {
                    this.f149754a.z.onNext(new com.ss.android.ugc.tools.infosticker.view.a.g(com.ss.android.ugc.tools.infosticker.view.a.h.STICKER_LOAD, com.ss.android.ugc.tools.infosticker.view.a.j.MAIN, null, null, null, 0, null, null, null, null, null, com.ss.android.ugc.tools.infosticker.view.a.i.LOAD_SUCCESS, 8188));
                } else if (i2 == 2) {
                    this.f149754a.z.onNext(new com.ss.android.ugc.tools.infosticker.view.a.g(com.ss.android.ugc.tools.infosticker.view.a.h.STICKER_LOAD, com.ss.android.ugc.tools.infosticker.view.a.j.MAIN, null, null, null, 0, null, null, null, null, null, com.ss.android.ugc.tools.infosticker.view.a.i.LOAD_FAIL, 8188));
                }
            }
        }
    }

    static final class ai<T> implements androidx.lifecycle.u<List<? extends com.ss.android.ugc.tools.h.a.m>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149758a;

        static {
            Covode.recordClassIndex(98593);
        }

        ai(l lVar) {
            this.f149758a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(List<? extends com.ss.android.ugc.tools.h.a.m> list) {
            com.ss.android.ugc.tools.infosticker.view.internal.f fVar;
            h.p a2;
            List<? extends com.ss.android.ugc.tools.h.a.m> list2 = list;
            if (!(list2 == null || (fVar = this.f149758a.f149742j) == null)) {
                l lVar = this.f149758a;
                h.f.b.l.d(list2, "");
                ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list2, 10));
                for (T t : list2) {
                    if (t instanceof com.ss.android.ugc.tools.h.a.n) {
                        a2 = h.v.a(new f.a(t), new ak(lVar));
                    } else if (t instanceof com.ss.android.ugc.tools.h.a.b) {
                        a2 = h.v.a(new f.a(t), new al(lVar));
                    } else {
                        throw new h.n();
                    }
                    arrayList.add(a2);
                }
                fVar.a(arrayList);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class z<T> implements f.a.d.f<h.p<? extends List<? extends Effect>, ? extends Integer>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149815a;

        static {
            Covode.recordClassIndex(98640);
        }

        z(l lVar) {
            this.f149815a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(h.p<? extends List<? extends Effect>, ? extends Integer> pVar) {
            h.p<? extends List<? extends Effect>, ? extends Integer> pVar2 = pVar;
            this.f149815a.z.onNext(new com.ss.android.ugc.tools.infosticker.view.a.g(com.ss.android.ugc.tools.infosticker.view.a.h.DATA_VISIBLE, com.ss.android.ugc.tools.infosticker.view.a.j.MAIN, (List) pVar2.getFirst(), null, null, ((Number) pVar2.getSecond()).intValue(), null, null, null, null, null, null, 16344));
            l lVar = this.f149815a;
            List<? extends Effect> list = (List) pVar2.getFirst();
            if (!lVar.s && list != null && !list.isEmpty()) {
                com.ss.android.ugc.tools.infosticker.view.internal.l lVar2 = lVar.E;
                if (lVar2 != null) {
                    lVar2.a(list);
                }
                lVar.s = true;
            }
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f149746a;

        /* renamed from: b  reason: collision with root package name */
        public h.f.a.m<? super ViewGroup, ? super h.f.a.a<h.z>, ? extends RecyclerView.ViewHolder> f149747b;

        /* renamed from: c  reason: collision with root package name */
        public h.f.a.m<? super RecyclerView.ViewHolder, ? super com.ss.android.ugc.tools.view.widget.b.a, h.z> f149748c;

        /* renamed from: d  reason: collision with root package name */
        public h.f.a.b<? super b.c, h.z> f149749d;

        static {
            Covode.recordClassIndex(98584);
        }

        public a() {
            this(0, null, 15);
        }

        private a(int i2, h.f.a.b<? super b.c, h.z> bVar) {
            this.f149746a = i2;
            this.f149747b = null;
            this.f149748c = null;
            this.f149749d = bVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(int i2, h.f.a.b bVar, int i3) {
            this((i3 & 1) != 0 ? 4 : i2, (i3 & 8) != 0 ? null : bVar);
        }
    }

    private l(ViewGroup viewGroup, androidx.lifecycle.m mVar, com.ss.android.ugc.tools.infosticker.view.internal.l lVar, h.f.a.b<? super c, h.z> bVar) {
        float f2;
        com.ss.android.ugc.tools.infosticker.view.internal.d a2;
        h.f.b.l.d(viewGroup, "");
        h.f.b.l.d(mVar, "");
        MethodCollector.i(6593);
        this.C = viewGroup;
        this.D = mVar;
        this.E = lVar;
        this.f149739g = true;
        c cVar = new c();
        this.f149740h = cVar;
        this.n = h.i.a(h.m.NONE, new aw(this));
        this.o = h.i.a(h.m.NONE, new d(this));
        this.f149735c = h.i.a(h.m.NONE, new at(this));
        this.p = h.i.a(h.m.NONE, new au(this));
        this.q = h.i.a(h.m.NONE, new av(this));
        this.r = h.i.a(h.m.NONE, new ax(this));
        f.a.l.c cVar2 = new f.a.l.c();
        h.f.b.l.b(cVar2, "");
        this.t = cVar2;
        f.a.l.c cVar3 = new f.a.l.c();
        h.f.b.l.b(cVar3, "");
        this.u = cVar3;
        f.a.l.c cVar4 = new f.a.l.c();
        h.f.b.l.b(cVar4, "");
        this.v = cVar4;
        f.a.l.c cVar5 = new f.a.l.c();
        h.f.b.l.b(cVar5, "");
        this.f149737e = cVar5;
        f.a.l.c cVar6 = new f.a.l.c();
        h.f.b.l.b(cVar6, "");
        this.w = cVar6;
        f.a.l.c cVar7 = new f.a.l.c();
        h.f.b.l.b(cVar7, "");
        this.x = cVar7;
        f.a.l.c cVar8 = new f.a.l.c();
        h.f.b.l.b(cVar8, "");
        this.y = cVar8;
        f.a.l.c cVar9 = new f.a.l.c();
        h.f.b.l.b(cVar9, "");
        this.f149738f = cVar9;
        f.a.l.c cVar10 = new f.a.l.c();
        h.f.b.l.b(cVar10, "");
        this.z = cVar10;
        f.a.b.a aVar = new f.a.b.a();
        this.A = aVar;
        if (bVar != null) {
            bVar.invoke(cVar);
        }
        h.f.b.l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b4m, viewGroup, false);
        if (a3 != null) {
            ViewGroup viewGroup2 = (ViewGroup) a3;
            this.B = viewGroup2;
            if (viewGroup2 == null) {
                h.f.b.l.a("content");
            }
            View findViewById = viewGroup2.findViewById(R.id.boe);
            findViewById.setOnClickListener(f.f149795a);
            Drawable a4 = a(cVar.r.f149773c);
            if (a4 != null) {
                h.f.b.l.b(findViewById, "");
                findViewById.setBackground(a4);
            }
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            Integer num = null;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (!(layoutParams instanceof ViewGroup.MarginLayoutParams) ? null : layoutParams);
            if (marginLayoutParams != null) {
                Context context = findViewById.getContext();
                h.f.b.l.b(context, "");
                boolean z2 = cVar.f149780a;
                int i2 = cVar.r.f149771a;
                if (!(i2 == -2 || i2 == -1)) {
                    if (z2) {
                        f2 = 500.0f;
                    } else {
                        f2 = 300.0f;
                    }
                    num = Integer.valueOf(Math.max((int) com.ss.android.ugc.tools.utils.r.a(context, f2), i2));
                }
                Context context2 = findViewById.getContext();
                h.f.b.l.b(context2, "");
                int a5 = (int) com.ss.android.ugc.tools.utils.r.a(context2, cVar.r.f149772b);
                marginLayoutParams.topMargin = num != null ? Math.max(com.ss.android.ugc.tools.utils.r.b(context2) - num.intValue(), a5) : a5;
            }
            ViewGroup viewGroup3 = this.B;
            if (viewGroup3 == null) {
                h.f.b.l.a("content");
            }
            viewGroup.addView(viewGroup3);
            ViewGroup viewGroup4 = this.B;
            if (viewGroup4 == null) {
                h.f.b.l.a("content");
            }
            View findViewById2 = viewGroup4.findViewById(R.id.tv);
            this.f149734b = findViewById2;
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
                findViewById2.setOnTouchListener(e.f149794a);
            }
            ViewGroup viewGroup5 = this.B;
            if (viewGroup5 == null) {
                h.f.b.l.a("content");
            }
            h.f.b.l.d(viewGroup5, "");
            com.ss.android.ugc.tools.view.base.a aVar2 = new com.ss.android.ugc.tools.view.base.a(viewGroup5, this.f149734b, viewGroup5.findViewById(R.id.eae), as.f149770a);
            this.f149741i = aVar2;
            aVar.a(aVar2.d().a(new ag(this), com.ss.android.ugc.tools.utils.p.f150012a));
            com.ss.android.ugc.tools.view.base.d dVar = this.f149741i;
            if (dVar == null) {
                h.f.b.l.a("transitionView");
            }
            dVar.f();
            if (!(lVar == null || (a2 = lVar.a()) == null)) {
                a2.c();
            }
            mVar.getLifecycle().a(new InfoStickerView$1(this));
            MethodCollector.o(6593);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.o(6593);
        throw nullPointerException;
    }

    public /* synthetic */ l(ViewGroup viewGroup, androidx.lifecycle.m mVar, com.ss.android.ugc.tools.infosticker.view.internal.l lVar, h.f.a.b bVar, byte b2) {
        this(viewGroup, mVar, lVar, bVar);
    }
}

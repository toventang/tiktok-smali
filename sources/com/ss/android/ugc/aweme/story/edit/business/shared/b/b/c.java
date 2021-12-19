package com.ss.android.ugc.aweme.story.edit.business.shared.b.b;

import android.app.Activity;
import android.content.ClipboardManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import h.h;
import h.k.i;
import h.m;
import java.lang.reflect.Field;
import java.util.Objects;

public final class c extends j implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f137202a = {new y(c.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0)};

    /* renamed from: f  reason: collision with root package name */
    public static final C3595c f137203f = new C3595c((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public boolean f137204b = true;

    /* renamed from: c  reason: collision with root package name */
    public View f137205c;

    /* renamed from: d  reason: collision with root package name */
    final h f137206d = h.i.a(m.NONE, new b(this));

    /* renamed from: e  reason: collision with root package name */
    final h f137207e = h.i.a((h.f.a.a) new g(this));

    /* renamed from: g  reason: collision with root package name */
    private final h f137208g = h.i.a(m.NONE, new a(this));

    /* renamed from: h  reason: collision with root package name */
    private final h.h.d f137209h = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.f.a.a.j.class);

    /* renamed from: i  reason: collision with root package name */
    private final com.bytedance.o.f f137210i;

    static {
        Covode.recordClassIndex(89720);
    }

    public final com.ss.android.ugc.aweme.story.edit.b.e a() {
        return (com.ss.android.ugc.aweme.story.edit.b.e) this.f137208g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.b.b.c$c  reason: collision with other inner class name */
    public static final class C3595c {
        static {
            Covode.recordClassIndex(89723);
        }

        private C3595c() {
        }

        public /* synthetic */ C3595c(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f137210i;
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.story.edit.b.e> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(89721);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.b.e] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.story.edit.b.e invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.b.e> r1 = com.ss.android.ugc.aweme.story.edit.b.e.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.b.b.c.a.invoke():com.bytedance.als.b");
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(89722);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d> r1 = com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.b.b.c.b.invoke():com.bytedance.als.b");
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<Vibrator> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(89727);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Vibrator invoke() {
            Object a2 = a(this.this$0.t(), "vibrator");
            Objects.requireNonNull(a2, "null cannot be cast to non-null type android.os.Vibrator");
            return a2;
        }

        private static Object a(Activity activity, String str) {
            Object obj;
            MethodCollector.i(2328);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                    try {
                        new com.bytedance.platform.godzilla.b.b.b().a();
                        com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                        obj = activity.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = activity.getSystemService(str);
            } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = activity.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                            } catch (Exception e2) {
                                com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                    } finally {
                        MethodCollector.o(2328);
                    }
                }
            } else {
                obj = activity.getSystemService(str);
            }
            return obj;
        }
    }

    public static final class f extends com.bytedance.f.a.a.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f137213a;

        static {
            Covode.recordClassIndex(89726);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(c cVar) {
            this.f137213a = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cb, code lost:
            if (new android.graphics.RectF(r5, r3, r2, (float) (r1 + r0.getHeight())).contains(r11.floatValue(), r10.floatValue()) == false) goto L_0x00cd;
         */
        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean c(android.view.MotionEvent r14) {
            /*
            // Method dump skipped, instructions count: 206
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.b.b.c.f.c(android.view.MotionEvent):boolean");
        }
    }

    public static final /* synthetic */ View a(c cVar) {
        View view = cVar.f137205c;
        if (view == null) {
            l.a("detectContainer");
        }
        return view;
    }

    static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f137211a;

        static {
            Covode.recordClassIndex(89724);
        }

        d(c cVar) {
            this.f137211a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            ViewGroup.LayoutParams layoutParams = c.a(this.f137211a).getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                l.b(num, "");
                marginLayoutParams.topMargin = num.intValue();
                c.a(this.f137211a).setLayoutParams(marginLayoutParams);
            }
        }
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f137212a;

        static {
            Covode.recordClassIndex(89725);
        }

        e(c cVar) {
            this.f137212a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            ViewGroup.LayoutParams layoutParams = c.a(this.f137212a).getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                int a2 = en.a(16.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);
                l.b(num, "");
                marginLayoutParams.bottomMargin = a2 + num.intValue();
                c.a(this.f137212a).setLayoutParams(marginLayoutParams);
            }
        }
    }

    public c(com.bytedance.o.f fVar) {
        l.d(fVar, "");
        this.f137210i = fVar;
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        a().Q().observe(this, new d(this));
        a().R().observe(this, new e(this));
        ((com.bytedance.f.a.a.j) this.f137209h.a(this, f137202a[0])).a(new com.bytedance.f.a.a.f(0, new f(this)));
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.b2l, viewGroup, false);
        View findViewById = a2.findViewById(R.id.al7);
        l.b(findViewById, "");
        this.f137205c = findViewById;
        l.b(a2, "");
        return a2;
    }
}

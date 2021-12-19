package com.bytedance.ies.bullet.service.popup;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.c.d;
import com.bytedance.ies.bullet.kit.lynx.a;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.ab;
import com.bytedance.ies.bullet.service.base.b.e;
import com.bytedance.ies.bullet.service.popup.a;
import com.bytedance.ies.bullet.service.popup.b.a;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.bytedance.ies.bullet.ui.common.h;
import com.ss.android.ugc.aweme.lancet.i;
import h.z;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class e extends androidx.appcompat.app.i implements com.bytedance.ies.bullet.service.base.a.d, com.bytedance.ies.bullet.service.base.a.j, ab {
    public static final List<e> u = new ArrayList();
    public static final List<e> v = new ArrayList();
    public static final a w = new a((byte) 0);
    private final h.h A = h.i.a((h.f.a.a) new p(this));
    private final h.h B = h.i.a((h.f.a.a) new c(this));
    private HashMap C;

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.ies.bullet.c.e.a.b f32952a;

    /* renamed from: b  reason: collision with root package name */
    public BulletContainerView f32953b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.ies.bullet.service.popup.a.g f32954c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.ies.bullet.c.c.i f32955d;

    /* renamed from: e  reason: collision with root package name */
    com.bytedance.ies.bullet.service.popup.a.i f32956e;

    /* renamed from: f  reason: collision with root package name */
    public h.f.a.a<z> f32957f;

    /* renamed from: g  reason: collision with root package name */
    View f32958g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f32959h = true;

    /* renamed from: i  reason: collision with root package name */
    public boolean f32960i;

    /* renamed from: j  reason: collision with root package name */
    public String f32961j;

    /* renamed from: k  reason: collision with root package name */
    public Boolean f32962k;

    /* renamed from: l  reason: collision with root package name */
    public Boolean f32963l;

    /* renamed from: m  reason: collision with root package name */
    public b f32964m = b.UNKNOWN;
    public Activity n;
    public d.b o;
    public c p;
    public com.bytedance.ies.bullet.service.base.a.e q;
    String r = "default_bid";
    public com.bytedance.ies.bullet.service.popup.anim.b s = com.bytedance.ies.bullet.service.popup.anim.b.NONE;
    public Throwable t;
    private final h.h x = h.i.a((h.f.a.a) new q(this));
    private com.bytedance.ies.bullet.service.popup.anim.c y = com.bytedance.ies.bullet.service.popup.anim.c.NONE;
    private final h.h z = h.i.a((h.f.a.a) new r(this));

    public enum b {
        UNKNOWN,
        TAP_MASK,
        GESTURE,
        JSB;

        static {
            Covode.recordClassIndex(19663);
        }
    }

    public static final class s extends d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f32982a;

        static {
            Covode.recordClassIndex(19683);
        }

        public static final class b implements com.bytedance.ies.bullet.c.c.a.p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ s f32983a;

            /* renamed from: b  reason: collision with root package name */
            private final String f32984b = "bulletOnBackPressAction";

            /* renamed from: c  reason: collision with root package name */
            private final Object f32985c;

            static {
                Covode.recordClassIndex(19685);
            }

            @Override // com.bytedance.ies.bullet.c.c.a.p
            public final String a() {
                return this.f32984b;
            }

            @Override // com.bytedance.ies.bullet.c.c.a.p
            public final Object b() {
                return this.f32985c;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            b(s sVar) {
                this.f32983a = sVar;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("containerID", sVar.f32982a.k());
                this.f32985c = jSONObject;
            }
        }

        static final class a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ s this$0;

            static {
                Covode.recordClassIndex(19684);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(s sVar) {
                super(0);
                this.this$0 = sVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                s.super.dismiss();
                return z.f158842a;
            }
        }

        public final void dismiss() {
            this.f32982a.a(new a(this));
        }

        public final void onBackPressed() {
            if (!this.f32982a.f32959h) {
                return;
            }
            if (!this.f32982a.i().o) {
                this.f32982a.f32964m = b.GESTURE;
                super.onBackPressed();
                return;
            }
            com.bytedance.ies.bullet.c.c.i iVar = this.f32982a.f32955d;
            if (iVar != null) {
                iVar.onEvent(new b(this));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(e eVar, Context context) {
            super(context, (byte) 0);
            this.f32982a = eVar;
        }
    }

    public final FrameLayout g() {
        return (FrameLayout) this.x.getValue();
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final com.bytedance.ies.bullet.service.base.a.q getLoggerWrapper() {
        return (com.bytedance.ies.bullet.service.base.a.q) this.A.getValue();
    }

    public final com.bytedance.ies.bullet.service.popup.anim.d h() {
        return (com.bytedance.ies.bullet.service.popup.anim.d) this.z.getValue();
    }

    /* access modifiers changed from: package-private */
    public final a.b j() {
        return (a.b) this.B.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(19662);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static e a(String str) {
            T t;
            h.f.b.l.c(str, "");
            Iterator<T> it = e.u.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (h.f.b.l.a((Object) t.k(), (Object) str)) {
                    break;
                }
            }
            return t;
        }
    }

    public static final class t implements com.bytedance.ies.bullet.c.c.a.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f32986a;

        /* renamed from: b  reason: collision with root package name */
        private final String f32987b = "notification";

        /* renamed from: c  reason: collision with root package name */
        private final Object f32988c;

        static {
            Covode.recordClassIndex(19686);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final String a() {
            return this.f32987b;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final Object b() {
            return this.f32988c;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        t(e eVar) {
            this.f32986a = eVar;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("containerID", eVar.k());
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "onClosePanel");
            this.f32988c = jSONObject;
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.ab
    public final void d() {
        dismissAllowingStateLoss();
    }

    static final class c extends h.f.b.m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(19664);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new a.b(this) {
                /* class com.bytedance.ies.bullet.service.popup.e.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f32966a;

                static {
                    Covode.recordClassIndex(19665);
                }

                @Override // com.bytedance.ies.bullet.service.popup.a.b
                public final boolean a() {
                    if (!this.f32966a.this$0.i().f32949k || !this.f32966a.this$0.i().y) {
                        return this.f32966a.this$0.i().f32949k;
                    }
                    return this.f32966a.this$0.f32960i;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f32966a = r1;
                }
            };
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ int $worldHeight$inlined;
        final /* synthetic */ int $worldWidth$inlined;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(19671);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(e eVar, int i2, int i3) {
            super(0);
            this.this$0 = eVar;
            this.$worldWidth$inlined = i2;
            this.$worldHeight$inlined = i3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class x extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ com.bytedance.ies.bullet.service.base.u $this_apply$inlined;
        final /* synthetic */ BulletContainerView $view$inlined;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(19690);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(com.bytedance.ies.bullet.service.base.u uVar, e eVar, BulletContainerView bulletContainerView) {
            super(0);
            this.$this_apply$inlined = uVar;
            this.this$0 = eVar;
            this.$view$inlined = bulletContainerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class y extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ com.bytedance.ies.bullet.service.base.u $this_apply$inlined;
        final /* synthetic */ BulletContainerView $view$inlined;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(19691);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(com.bytedance.ies.bullet.service.base.u uVar, e eVar, BulletContainerView bulletContainerView) {
            super(0);
            this.$this_apply$inlined = uVar;
            this.this$0 = eVar;
            this.$view$inlined = bulletContainerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$view$inlined.b();
            return z.f158842a;
        }
    }

    private final void m() {
        com.bytedance.ies.bullet.service.popup.a.i iVar = this.f32956e;
        if (iVar != null) {
            iVar.c();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.ab
    public final String a() {
        return this.r;
    }

    @Override // com.bytedance.ies.bullet.service.base.ab
    public final String e() {
        return k();
    }

    static final class j extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ int $worldHeight$inlined;
        final /* synthetic */ int $worldWidth$inlined;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(19673);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(e eVar, int i2, int i3) {
            super(0);
            this.this$0 = eVar;
            this.$worldWidth$inlined = i2;
            this.$worldHeight$inlined = i3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.bytedance.ies.bullet.service.popup.anim.d h2 = this.this$0.h();
            if (h2 != null) {
                h2.b();
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ h.f.a.a $animEnd;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(19679);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(e eVar, h.f.a.a aVar) {
            super(0);
            this.this$0 = eVar;
            this.$animEnd = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            this.this$0.s = com.bytedance.ies.bullet.service.popup.anim.b.DONE;
            this.$animEnd.invoke();
            return z.f158842a;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.a<com.bytedance.ies.bullet.service.popup.anim.e> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(19682);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.bullet.service.popup.anim.e invoke() {
            return new com.bytedance.ies.bullet.service.popup.anim.e(this.this$0.g());
        }
    }

    @Override // androidx.fragment.app.d
    public final void dismiss() {
        a(new n(this));
    }

    @Override // com.bytedance.ies.bullet.service.base.ab
    public final Uri f() {
        c cVar = this.p;
        if (cVar == null) {
            h.f.b.l.a("config");
        }
        return cVar.f32943e;
    }

    public final c i() {
        c cVar = this.p;
        if (cVar == null) {
            h.f.b.l.a("config");
        }
        return cVar;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.C;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f32989a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.bullet.c.c.i f32990b;

        static {
            Covode.recordClassIndex(19687);
        }

        u(e eVar, com.bytedance.ies.bullet.c.c.i iVar) {
            this.f32989a = eVar;
            this.f32990b = iVar;
        }

        public final void run() {
            com.bytedance.ies.bullet.c.c.i iVar;
            if (h.f.b.l.a((Object) this.f32989a.f32963l, (Object) true) && (iVar = this.f32990b) != null) {
                iVar.j();
            }
            this.f32989a.f32962k = true;
        }
    }

    static final class w implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f32993a;

        static {
            Covode.recordClassIndex(19689);
        }

        w(e eVar) {
            this.f32993a = eVar;
        }

        public final void run() {
            BulletContainerView bulletContainerView = this.f32993a.f32953b;
            if (bulletContainerView != null) {
                bulletContainerView.a();
            }
            e eVar = this.f32993a;
            h.f.b.l.c(eVar, "");
            e.v.remove(eVar);
        }
    }

    static {
        Covode.recordClassIndex(19661);
    }

    @Override // com.bytedance.ies.bullet.service.base.ab
    public final String b() {
        String string;
        com.bytedance.ies.bullet.service.base.a.l a2 = e.a.a();
        c cVar = this.p;
        if (cVar == null) {
            h.f.b.l.a("config");
        }
        com.bytedance.ies.bullet.service.a.e<String, Object> a3 = a2.a(cVar.f32939a);
        if (a3 == null || (string = a3.getString("__x_param_channel")) == null) {
            return "";
        }
        return string;
    }

    @Override // com.bytedance.ies.bullet.service.base.ab
    public final String c() {
        String string;
        com.bytedance.ies.bullet.service.base.a.l a2 = e.a.a();
        c cVar = this.p;
        if (cVar == null) {
            h.f.b.l.a("config");
        }
        com.bytedance.ies.bullet.service.a.e<String, Object> a3 = a2.a(cVar.f32939a);
        if (a3 == null || (string = a3.getString("__x_param_bundle")) == null) {
            return "";
        }
        return string;
    }

    @Override // androidx.fragment.app.d
    public final void dismissAllowingStateLoss() {
        b bVar = b.UNKNOWN;
        h.f.b.l.c(bVar, "");
        if (bVar == b.JSB) {
            this.f32964m = bVar;
        }
        super.dismissAllowingStateLoss();
    }

    public final String k() {
        com.bytedance.ies.bullet.c.c.z a2;
        String str;
        com.bytedance.ies.bullet.c.c.i iVar = this.f32955d;
        if (iVar == null || (a2 = iVar.a()) == null || (str = a2.f32074a) == null) {
            return "";
        }
        return str;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        com.bytedance.ies.bullet.c.c.i iVar;
        super.onPause();
        this.f32963l = false;
        if (h.f.b.l.a((Object) this.f32962k, (Object) true) && (iVar = this.f32955d) != null) {
            iVar.k();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        com.bytedance.ies.bullet.c.c.i iVar;
        super.onResume();
        this.f32963l = true;
        if (h.f.b.l.a((Object) this.f32962k, (Object) true) && (iVar = this.f32955d) != null) {
            iVar.j();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        try {
            getDialog().show();
            h.q.m223constructorimpl(z.f158842a);
        } catch (Throwable th) {
            h.q.m223constructorimpl(h.r.a(th));
        }
    }

    public static final class m implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f32979a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f32980b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f32981c;

        static {
            Covode.recordClassIndex(19677);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        private final void a() {
            if (!this.f32981c) {
                try {
                    this.f32980b.invoke();
                } catch (Exception e2) {
                    this.f32979a.t = e2;
                    j.b.a(this.f32979a, "dismiss failed on onAnimationEnd with: " + e2.getMessage(), null, "popup", 2);
                }
                this.f32981c = true;
            }
        }

        public final void onAnimationCancel(Animator animator) {
            a();
        }

        public final void onAnimationEnd(Animator animator) {
            a();
        }

        m(e eVar, h.f.a.a aVar) {
            this.f32979a = eVar;
            this.f32980b = aVar;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<com.bytedance.ies.bullet.service.base.a.q> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(19680);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.bullet.service.base.a.q invoke() {
            d.b bVar = this.this$0.o;
            if (bVar == null) {
                h.f.b.l.a("coreProvider");
            }
            return new com.bytedance.ies.bullet.service.base.a.q((com.bytedance.ies.bullet.service.base.m) bVar.a().b().c(com.bytedance.ies.bullet.service.base.m.class), "PopUp");
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<FrameLayout> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(19681);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FrameLayout invoke() {
            MethodCollector.i(12099);
            Context context = this.this$0.getContext();
            if (context == null) {
                h.f.b.l.a();
            }
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            MethodCollector.o(12099);
            return frameLayout;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(19678);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            Window window;
            Object a2;
            MethodCollector.i(12258);
            Dialog dialog = this.this$0.getDialog();
            if (!(dialog == null || (window = dialog.getWindow()) == null)) {
                e eVar = this.this$0;
                h.f.b.l.a((Object) window, "");
                View currentFocus = window.getCurrentFocus();
                if (currentFocus == null) {
                    View decorView = window.getDecorView();
                    h.f.b.l.a((Object) decorView, "");
                    currentFocus = decorView.findViewWithTag("keyboardTagView");
                    if (currentFocus == null) {
                        currentFocus = new EditText(window.getContext());
                        currentFocus.setTag("keyboardTagView");
                        ((ViewGroup) decorView).addView(currentFocus, 0, 0);
                    }
                    currentFocus.requestFocus();
                }
                Context context = eVar.getContext();
                if (context == null || (a2 = e.a(context, "input_method")) == null) {
                    h.w wVar = new h.w("null cannot be cast to non-null type");
                    MethodCollector.o(12258);
                    throw wVar;
                }
                ((InputMethodManager) a2).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
            e.super.dismiss();
            z zVar = z.f158842a;
            MethodCollector.o(12258);
            return zVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.n != null && this.p != null) {
            com.bytedance.ies.bullet.c.c.i iVar = this.f32955d;
            if (iVar != null) {
                iVar.onEvent(new t(this));
            }
            com.bytedance.ies.bullet.service.base.a.e eVar = this.q;
            if (eVar != null) {
                eVar.b(this);
            }
            new Handler().postDelayed(new w(this), 100);
            h.f.b.l.c(this, "");
            List<e> list = u;
            list.remove(this);
            e eVar2 = (e) h.a.n.j((List) list);
            if (eVar2 != null) {
                c cVar = eVar2.p;
                if (cVar == null) {
                    h.f.b.l.a("config");
                }
                if (cVar.f32942d == 3) {
                    eVar2.m();
                }
            }
            v.add(this);
            c cVar2 = this.p;
            if (cVar2 == null) {
                h.f.b.l.a("config");
            }
            if (cVar2.f32942d == 1) {
                c cVar3 = this.p;
                if (cVar3 == null) {
                    h.f.b.l.a("config");
                }
                e a2 = a.a(cVar3.q);
                if (a2 != null) {
                    a2.m();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final BulletContainerView l() {
        Activity activity = this.n;
        if (activity == null) {
            h.f.b.l.a("act");
        }
        BulletContainerView bulletContainerView = new BulletContainerView(activity, null, 6, (byte) 0);
        this.f32952a = bulletContainerView.getProviderFactory();
        d.b bVar = this.o;
        if (bVar == null) {
            h.f.b.l.a("coreProvider");
        }
        bulletContainerView.b(bVar);
        c cVar = this.p;
        if (cVar == null) {
            h.f.b.l.a("config");
        }
        Bundle bundle = cVar.f32944f;
        if (bundle == null) {
            bundle = new Bundle();
        }
        c cVar2 = this.p;
        if (cVar2 == null) {
            h.f.b.l.a("config");
        }
        Uri uri = cVar2.f32943e;
        Context context = bulletContainerView.getContext();
        h.f.b.l.a((Object) context, "");
        com.bytedance.ies.bullet.ui.common.d.d.a(context);
        com.bytedance.ies.bullet.service.base.u uVar = (com.bytedance.ies.bullet.service.base.u) e.a.a().a(this.r, com.bytedance.ies.bullet.service.base.u.class);
        if (uVar != null) {
            Activity activity2 = this.n;
            if (activity2 == null) {
                h.f.b.l.a("act");
            }
            com.bytedance.ies.bullet.service.base.k a2 = uVar.a(activity2);
            if (a2 != null) {
                View view = a2.getView();
                FrameLayout.LayoutParams d2 = uVar.d();
                if (d2 != null) {
                    bulletContainerView.a(view, d2);
                } else {
                    bulletContainerView.a(view, 17, 0, 0, 0, 0);
                }
            }
            Activity activity3 = this.n;
            if (activity3 == null) {
                h.f.b.l.a("act");
            }
            com.bytedance.ies.bullet.service.base.h b2 = uVar.b(activity3);
            if (b2 != null) {
                new x(uVar, this, bulletContainerView);
                new y(uVar, this, bulletContainerView);
                View a3 = b2.a();
                FrameLayout.LayoutParams e2 = uVar.e();
                if (e2 != null) {
                    bulletContainerView.b(a3, e2);
                } else {
                    bulletContainerView.b((BulletContainerView) a3, (View) new FrameLayout.LayoutParams(-1, -1));
                }
            }
        }
        c cVar3 = this.p;
        if (cVar3 == null) {
            h.f.b.l.a("config");
        }
        h.f.b.l.c(cVar3, "");
        if (cVar3.f32945g <= 0 && cVar3.f32946h <= 0) {
            c cVar4 = this.p;
            if (cVar4 == null) {
                h.f.b.l.a("config");
            }
            Integer num = cVar4.s;
            if (num != null) {
                bundle.putInt("lynxview_width", num.intValue());
            }
            c cVar5 = this.p;
            if (cVar5 == null) {
                h.f.b.l.a("config");
            }
            Integer num2 = cVar5.t;
            if (num2 != null) {
                bundle.putInt("lynxview_height", num2.intValue());
            }
        }
        try {
            c cVar6 = this.p;
            if (cVar6 == null) {
                h.f.b.l.a("config");
            }
            Bundle bundle2 = cVar6.r;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        C0718e eVar = new C0718e(this);
        com.bytedance.ies.bullet.c.e.a.b bVar2 = new com.bytedance.ies.bullet.c.e.a.b();
        bVar2.a(com.bytedance.ies.bullet.kit.lynx.a.class, new f(this));
        bVar2.a(com.bytedance.ies.bullet.kit.web.a.e.class, new g(this));
        bulletContainerView.a(uri, bundle, bVar2, eVar);
        return bulletContainerView;
    }

    static final class v implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f32991a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f32992b;

        static {
            Covode.recordClassIndex(19688);
        }

        v(e eVar, View view) {
            this.f32991a = eVar;
            this.f32992b = view;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
            if (r5 != 3) goto L_0x0032;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 651
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.popup.e.v.run():void");
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.e$e  reason: collision with other inner class name */
    public static final class C0718e implements h.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f32973a;

        static {
            Covode.recordClassIndex(19668);
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(Uri uri) {
            h.f.b.l.c(uri, "");
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends View>> list, Uri uri, com.bytedance.ies.bullet.c.c.i iVar, boolean z) {
            h.f.b.l.c(list, "");
            h.f.b.l.c(uri, "");
            h.f.b.l.c(iVar, "");
        }

        C0718e(e eVar) {
            this.f32973a = eVar;
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(Uri uri, Throwable th) {
            h.f.b.l.c(uri, "");
            h.f.b.l.c(th, "");
            com.bytedance.ies.bullet.service.base.a.e eVar = this.f32973a.q;
            if (eVar != null) {
                eVar.a(this.f32973a, th);
            }
            this.f32973a.f32960i = true;
            if (!this.f32973a.i().w) {
                this.f32973a.dismiss();
            }
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(com.bytedance.ies.bullet.c.c.i iVar, Uri uri, com.bytedance.ies.bullet.service.f.a.b.q qVar) {
            h.f.b.l.c(iVar, "");
            h.f.b.l.c(uri, "");
            h.f.b.l.c(qVar, "");
            if (qVar instanceof com.bytedance.ies.bullet.service.f.a.d) {
                this.f32973a.f32961j = ((com.bytedance.ies.bullet.service.f.a.d) qVar).Q.b();
            }
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(View view, Uri uri, com.bytedance.ies.bullet.c.c.i iVar) {
            h.f.b.l.c(view, "");
            h.f.b.l.c(uri, "");
            h.f.b.l.c(iVar, "");
            this.f32973a.f32955d = iVar;
            this.f32973a.f32960i = true;
            e eVar = this.f32973a;
            h.f.b.l.c(eVar, "");
            e.u.add(eVar);
            com.bytedance.ies.bullet.service.base.a.e eVar2 = this.f32973a.q;
            if (eVar2 != null) {
                eVar2.c(this.f32973a);
            }
        }
    }

    public static final class f extends a.AbstractC0689a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f32974a;

        static {
            Covode.recordClassIndex(19669);
        }

        f(e eVar) {
            this.f32974a = eVar;
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.a, com.bytedance.ies.bullet.kit.lynx.a.AbstractC0689a
        public final void f(com.bytedance.ies.bullet.kit.lynx.b bVar) {
            h.f.b.l.c(bVar, "");
            e eVar = this.f32974a;
            eVar.a(eVar.g(), bVar);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.a, com.bytedance.ies.bullet.kit.lynx.a.AbstractC0689a
        public final void a(com.bytedance.ies.bullet.kit.lynx.b bVar, com.bytedance.ies.bullet.kit.lynx.b.b bVar2) {
            h.f.b.l.c(bVar, "");
            super.a(bVar, bVar2);
        }
    }

    public static final class g extends com.bytedance.ies.bullet.kit.web.a.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f32975a;

        static {
            Covode.recordClassIndex(19670);
        }

        g(e eVar) {
            this.f32975a = eVar;
        }

        public final void onPageFinished(WebView webView, String str) {
            e eVar = this.f32975a;
            eVar.a(eVar.g(), this.f32407e);
        }
    }

    private final Animator.AnimatorListener b(h.f.a.a<z> aVar) {
        return new m(this, aVar);
    }

    @Override // androidx.fragment.app.d
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f32964m == b.UNKNOWN) {
            this.f32964m = b.TAP_MASK;
        }
        super.onDismiss(dialogInterface);
    }

    static final class i extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ int $worldHeight$inlined;
        final /* synthetic */ int $worldWidth$inlined;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(19672);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(e eVar, int i2, int i3) {
            super(1);
            this.this$0 = eVar;
            this.$worldWidth$inlined = i2;
            this.$worldHeight$inlined = i3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.this$0.dismiss();
            } else {
                h.f.a.a<z> aVar = this.this$0.f32957f;
                if (aVar != null) {
                    aVar.invoke();
                }
                this.this$0.f32957f = null;
            }
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<String, z> {
        final /* synthetic */ int $worldHeight$inlined;
        final /* synthetic */ int $worldWidth$inlined;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(19674);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(e eVar, int i2, int i3) {
            super(1);
            this.this$0 = eVar;
            this.$worldWidth$inlined = i2;
            this.$worldHeight$inlined = i3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            String str2 = str;
            com.bytedance.ies.bullet.c.c.i iVar = this.this$0.f32955d;
            if (iVar != null) {
                iVar.onEvent(new com.bytedance.ies.bullet.c.c.a.p(str2) {
                    /* class com.bytedance.ies.bullet.service.popup.e.k.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ String f32976a;

                    /* renamed from: b  reason: collision with root package name */
                    private final String f32977b = "popupStatusChange";

                    /* renamed from: c  reason: collision with root package name */
                    private final Object f32978c;

                    static {
                        Covode.recordClassIndex(19675);
                    }

                    @Override // com.bytedance.ies.bullet.c.c.a.p
                    public final String a() {
                        return this.f32977b;
                    }

                    @Override // com.bytedance.ies.bullet.c.c.a.p
                    public final Object b() {
                        return this.f32978c;
                    }

                    {
                        this.f32976a = r3;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", r3);
                        this.f32978c = jSONObject;
                    }
                });
            }
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ int $worldHeight$inlined;
        final /* synthetic */ int $worldWidth$inlined;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(19676);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(e eVar, int i2, int i3) {
            super(1);
            this.this$0 = eVar;
            this.$worldWidth$inlined = i2;
            this.$worldHeight$inlined = i3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.this$0.dismiss();
            } else {
                h.f.a.a<z> aVar = this.this$0.f32957f;
                if (aVar != null) {
                    aVar.invoke();
                }
                this.this$0.f32957f = null;
            }
            return z.f158842a;
        }
    }

    public final void a(com.bytedance.ies.bullet.service.popup.anim.c cVar) {
        h.f.b.l.c(cVar, "");
        this.y = cVar;
    }

    @Override // androidx.fragment.app.d, androidx.appcompat.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        if (context == null) {
            h.f.b.l.a();
        }
        h.f.b.l.a((Object) context, "");
        s sVar = new s(this, context);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            sVar.setOwnerActivity(activity);
        }
        return sVar;
    }

    public static final class d implements a.AbstractC0717a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Window f32967a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f32968b;

        static {
            Covode.recordClassIndex(19666);
        }

        @Override // com.bytedance.ies.bullet.service.popup.b.a.AbstractC0717a
        public final void a(int i2) {
            boolean z;
            com.bytedance.ies.bullet.service.popup.a.g gVar = this.f32968b.f32954c;
            if (gVar != null) {
                if (i2 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                Window window = this.f32967a;
                h.f.b.l.a((Object) window, "");
                View decorView = window.getDecorView();
                h.f.b.l.a((Object) decorView, "");
                Rect rect = new Rect();
                decorView.getWindowVisibleDisplayFrame(rect);
                gVar.a(z, i2, Integer.valueOf(rect.bottom));
            }
            com.bytedance.ies.bullet.c.c.i iVar = this.f32968b.f32955d;
            if (iVar != null) {
                iVar.onEvent(new com.bytedance.ies.bullet.c.c.a.p(this, i2) {
                    /* class com.bytedance.ies.bullet.service.popup.e.d.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ d f32969a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ int f32970b;

                    /* renamed from: c  reason: collision with root package name */
                    private final String f32971c = "bulletOnSoftInputChangedAction";

                    /* renamed from: d  reason: collision with root package name */
                    private final Object f32972d;

                    static {
                        Covode.recordClassIndex(19667);
                    }

                    @Override // com.bytedance.ies.bullet.c.c.a.p
                    public final String a() {
                        return this.f32971c;
                    }

                    @Override // com.bytedance.ies.bullet.c.c.a.p
                    public final Object b() {
                        return this.f32972d;
                    }

                    {
                        boolean z;
                        this.f32969a = r4;
                        this.f32970b = r5;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("containerID", r4.f32968b.k());
                        if (r5 > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        jSONObject.put("keyboardShow", z);
                        this.f32972d = jSONObject;
                    }
                });
            }
        }

        d(Window window, e eVar) {
            this.f32967a = window;
            this.f32968b = eVar;
        }
    }

    public final void a(h.f.a.a<z> aVar) {
        Animator animator;
        String str;
        try {
            if (this.f32958g == null || this.y == com.bytedance.ies.bullet.service.popup.anim.c.NONE || this.s == com.bytedance.ies.bullet.service.popup.anim.b.DONE) {
                aVar.invoke();
            } else if (this.t != null) {
                StringBuilder sb = new StringBuilder("reAnimEnd with msg:");
                Throwable th = this.t;
                if (th != null) {
                    str = th.getMessage();
                } else {
                    str = null;
                }
                j.b.a(this, sb.append(str).toString(), null, "popup", 2);
                aVar.invoke();
            } else if (this.s != com.bytedance.ies.bullet.service.popup.anim.b.DOING) {
                this.s = com.bytedance.ies.bullet.service.popup.anim.b.DOING;
                o oVar = new o(this, aVar);
                int i2 = f.f32994a[this.y.ordinal()];
                if (i2 == 1) {
                    View view = this.f32958g;
                    if (view == null) {
                        h.f.b.l.a();
                    }
                    view.animate().translationX((float) g().getWidth()).setDuration(300).setListener(b(oVar)).start();
                } else if (i2 == 2) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.addListener(b(oVar));
                    animatorSet.setDuration(300L);
                    animatorSet.setInterpolator(new com.bytedance.ies.bullet.service.popup.anim.a((byte) 0));
                    Animator[] animatorArr = new Animator[1];
                    View view2 = this.f32958g;
                    float[] fArr = new float[2];
                    if (view2 == null) {
                        h.f.b.l.a();
                    }
                    fArr[0] = view2.getTranslationY();
                    fArr[1] = (float) g().getHeight();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "translationY", fArr);
                    h.f.b.l.a((Object) ofFloat, "");
                    animatorArr[0] = ofFloat;
                    List c2 = h.a.n.c(animatorArr);
                    if (h() != null) {
                        com.bytedance.ies.bullet.service.popup.anim.d h2 = h();
                        if (h2 == null) {
                            h.f.b.l.a();
                        }
                        c2.add(h2.c());
                    }
                    animatorSet.playTogether(c2);
                    animatorSet.start();
                } else if (i2 != 3) {
                    oVar.invoke();
                } else {
                    com.bytedance.ies.bullet.service.popup.anim.d h3 = h();
                    if (h3 != null) {
                        animator = h3.c();
                    } else {
                        animator = null;
                    }
                    if (h() == null || animator == null) {
                        oVar.invoke();
                        return;
                    }
                    animator.setDuration(300);
                    animator.addListener(b(oVar));
                    animator.start();
                }
            }
        } catch (Exception e2) {
            j.b.a(this, "dismiss failed with: " + e2.getMessage(), null, "popup", 2);
        }
    }

    public final void a(View view, com.bytedance.ies.bullet.c.c.i iVar) {
        if (view != null) {
            view.post(new u(this, iVar));
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final void printReject(Throwable th, String str) {
        h.f.b.l.c(th, "");
        h.f.b.l.c(str, "");
        j.b.a(this, th, str);
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(11986);
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
                    MethodCollector.o(11986);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.bytedance.ies.bullet.service.popup.a.i iVar;
        Dialog dialog;
        Window window;
        h.f.b.l.c(view, "");
        super.onViewCreated(view, bundle);
        if (this.n == null || this.p == null) {
            j.b.a(this, "act and config is not init, dismiss dialog fragment", null, "popup", 2);
            dismissAllowingStateLoss();
            return;
        }
        c cVar = this.p;
        if (cVar == null) {
            h.f.b.l.a("config");
        }
        this.f32959h = cVar.z;
        view.post(new v(this, view));
        c cVar2 = this.p;
        if (cVar2 == null) {
            h.f.b.l.a("config");
        }
        view.setBackgroundColor(Color.parseColor(cVar2.f32948j));
        com.bytedance.ies.bullet.service.popup.anim.d h2 = h();
        if (h2 != null) {
            h2.a();
        }
        c cVar3 = this.p;
        if (cVar3 == null) {
            h.f.b.l.a("config");
        }
        if (!(!cVar3.p || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null)) {
            h.f.b.l.a((Object) window, "");
            Context context = window.getContext();
            h.f.b.l.a((Object) context, "");
            com.bytedance.ies.bullet.service.popup.b.a.a(window, context, new d(window, this));
        }
        c cVar4 = this.p;
        if (cVar4 == null) {
            h.f.b.l.a("config");
        }
        int i2 = cVar4.f32942d;
        if (i2 == 0) {
            c cVar5 = this.p;
            if (cVar5 == null) {
                h.f.b.l.a("config");
            }
            e a2 = a.a(cVar5.q);
            if (a2 != null && (iVar = a2.f32956e) != null) {
                iVar.d();
            }
        } else if (i2 == 3) {
            c cVar6 = this.p;
            if (cVar6 == null) {
                h.f.b.l.a("config");
            }
            e a3 = a.a(cVar6.q);
            if (a3 != null) {
                a3.f32957f = null;
                com.bytedance.ies.bullet.service.popup.a.i iVar2 = a3.f32956e;
                if (iVar2 != null) {
                    iVar2.e();
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.c(layoutInflater, "");
        return g();
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final void printLog(String str, com.bytedance.ies.bullet.service.base.a.p pVar, String str2) {
        h.f.b.l.c(str, "");
        h.f.b.l.c(pVar, "");
        h.f.b.l.c(str2, "");
        j.b.a(this, str, pVar, str2);
    }
}

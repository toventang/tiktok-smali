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
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.ab;
import com.bytedance.ies.bullet.service.popup.a.g;
import com.bytedance.ies.bullet.service.popup.a.i;
import com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior;
import com.bytedance.ies.bullet.service.popup.b.a;
import com.ss.android.ugc.aweme.lancet.i;
import h.q;
import h.r;
import h.w;
import h.z;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public abstract class a extends androidx.appcompat.app.i implements com.bytedance.ies.bullet.service.base.a.d, com.bytedance.ies.bullet.service.base.a.j, ab {

    /* renamed from: m  reason: collision with root package name */
    public static final List<a> f32786m = new ArrayList();
    public static final List<a> n = new ArrayList();
    public static final C0712a o = new C0712a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public g f32787a;

    /* renamed from: b  reason: collision with root package name */
    public g f32788b;

    /* renamed from: c  reason: collision with root package name */
    public i f32789c;

    /* renamed from: d  reason: collision with root package name */
    public h.f.a.a<z> f32790d;

    /* renamed from: e  reason: collision with root package name */
    public View f32791e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f32792f;

    /* renamed from: g  reason: collision with root package name */
    public c f32793g;

    /* renamed from: h  reason: collision with root package name */
    public Activity f32794h;

    /* renamed from: i  reason: collision with root package name */
    public c f32795i;

    /* renamed from: j  reason: collision with root package name */
    BottomSheetBehavior.a f32796j;

    /* renamed from: k  reason: collision with root package name */
    public com.bytedance.ies.bullet.service.popup.anim.b f32797k;

    /* renamed from: l  reason: collision with root package name */
    public Throwable f32798l;
    private final h.h p;
    private com.bytedance.ies.bullet.service.popup.anim.c q;
    private final h.h r;
    private com.bytedance.ies.bullet.service.base.a.e s;
    private Boolean t;
    private Boolean u;
    private final h.h v;
    private HashMap w;

    public interface b {
        static {
            Covode.recordClassIndex(19595);
        }

        boolean a();
    }

    public enum c {
        UNKNOWN,
        TAP_MASK,
        GESTURE,
        JSB;

        static {
            Covode.recordClassIndex(19596);
        }
    }

    public final FrameLayout g() {
        return (FrameLayout) this.p.getValue();
    }

    public final com.bytedance.ies.bullet.service.popup.anim.d h() {
        return (com.bytedance.ies.bullet.service.popup.anim.d) this.r.getValue();
    }

    public final b i() {
        return (b) this.v.getValue();
    }

    public abstract String j();

    public abstract View k();

    /* renamed from: com.bytedance.ies.bullet.service.popup.a$a  reason: collision with other inner class name */
    public static final class C0712a {
        static {
            Covode.recordClassIndex(19594);
        }

        private C0712a() {
        }

        public /* synthetic */ C0712a(byte b2) {
            this();
        }

        public static a a(String str) {
            T t;
            h.f.b.l.c(str, "");
            Iterator<T> it = a.f32786m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (h.f.b.l.a((Object) t.j(), (Object) str)) {
                    break;
                }
            }
            return t;
        }
    }

    public static final class h extends d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f32867a;

        static {
            Covode.recordClassIndex(19601);
        }

        /* renamed from: com.bytedance.ies.bullet.service.popup.a$h$a  reason: collision with other inner class name */
        static final class C0716a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ h this$0;

            static {
                Covode.recordClassIndex(19602);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0716a(h hVar) {
                super(0);
                this.this$0 = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                h.super.dismiss();
                return z.f158842a;
            }
        }

        public final void dismiss() {
            this.f32867a.a(new C0716a(this));
        }

        public final void onBackPressed() {
            if (this.f32867a.f32792f) {
                c cVar = this.f32867a.f32795i;
                if (cVar == null) {
                    h.f.b.l.a("config");
                }
                if (!cVar.o) {
                    a aVar = this.f32867a;
                    c cVar2 = c.GESTURE;
                    h.f.b.l.c(cVar2, "");
                    aVar.f32793g = cVar2;
                    super.onBackPressed();
                    return;
                }
                new JSONObject().put("containerID", this.f32867a.j());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar, Context context) {
            super(context, (byte) 0);
            this.f32867a = aVar;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ View $view$inlined;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(19605);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a aVar, View view) {
            super(0);
            this.this$0 = aVar;
            this.$view$inlined = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    private final void l() {
        i iVar = this.f32789c;
        if (iVar != null) {
            iVar.c();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ h.f.a.a $animEnd;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(19600);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar, h.f.a.a aVar2) {
            super(0);
            this.this$0 = aVar;
            this.$animEnd = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            this.this$0.f32797k = com.bytedance.ies.bullet.service.popup.anim.b.DONE;
            this.$animEnd.invoke();
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ View $view$inlined;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(19608);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(a aVar, View view) {
            super(0);
            this.this$0 = aVar;
            this.$view$inlined = view;
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

    @Override // androidx.fragment.app.d
    public void dismiss() {
        a(new f(this));
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.w;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.u = true;
        h.f.b.l.a((Object) this.t, (Object) true);
    }

    static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f32870a;

        static {
            Covode.recordClassIndex(19603);
        }

        i(a aVar) {
            this.f32870a = aVar;
        }

        public final void run() {
            g gVar = this.f32870a.f32787a;
            if (gVar != null) {
                gVar.a();
            }
            g gVar2 = this.f32870a.f32787a;
            if (gVar2 != null) {
                gVar2.a();
            }
            a aVar = this.f32870a;
            h.f.b.l.c(aVar, "");
            a.n.remove(aVar);
        }
    }

    static {
        Covode.recordClassIndex(19593);
    }

    @Override // androidx.fragment.app.d
    public final void dismissAllowingStateLoss() {
        c cVar = c.UNKNOWN;
        h.f.b.l.c(cVar, "");
        if (cVar == c.JSB) {
            this.f32793g = cVar;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.u = false;
        h.f.b.l.a((Object) this.t, (Object) true);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        try {
            getDialog().show();
            q.m223constructorimpl(z.f158842a);
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
    }

    public static final class e implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f32852a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f32853b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f32854c;

        static {
            Covode.recordClassIndex(19598);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        private final void a() {
            if (!this.f32854c) {
                try {
                    this.f32853b.invoke();
                } catch (Exception e2) {
                    this.f32852a.f32798l = e2;
                    j.b.a(this.f32852a, "dismiss failed on onAnimationEnd with: " + e2.getMessage(), null, "popup", 2);
                }
                this.f32854c = true;
            }
        }

        public final void onAnimationCancel(Animator animator) {
            a();
        }

        public final void onAnimationEnd(Animator animator) {
            a();
        }

        e(a aVar, h.f.a.a aVar2) {
            this.f32852a = aVar;
            this.f32853b = aVar2;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(19599);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            Window window;
            Object a2;
            MethodCollector.i(9292);
            Dialog dialog = this.this$0.getDialog();
            if (!(dialog == null || (window = dialog.getWindow()) == null)) {
                a aVar = this.this$0;
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
                Context context = aVar.getContext();
                if (context == null || (a2 = a.a(context, "input_method")) == null) {
                    w wVar = new w("null cannot be cast to non-null type");
                    MethodCollector.o(9292);
                    throw wVar;
                }
                ((InputMethodManager) a2).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
            a.super.dismiss();
            z zVar = z.f158842a;
            MethodCollector.o(9292);
            return zVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.f32794h != null && this.f32795i != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("containerID", j());
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "onClosePanel");
            new Handler().postDelayed(new i(this), 100);
            h.f.b.l.c(this, "");
            List<a> list = f32786m;
            list.remove(this);
            a aVar = (a) h.a.n.j((List) list);
            if (aVar != null) {
                c cVar = aVar.f32795i;
                if (cVar == null) {
                    h.f.b.l.a("config");
                }
                if (cVar.f32942d == 3) {
                    aVar.l();
                }
            }
            n.add(this);
            c cVar2 = this.f32795i;
            if (cVar2 == null) {
                h.f.b.l.a("config");
            }
            if (cVar2.f32942d == 1) {
                c cVar3 = this.f32795i;
                if (cVar3 == null) {
                    h.f.b.l.a("config");
                }
                a a2 = C0712a.a(cVar3.q);
                if (a2 != null) {
                    a2.l();
                }
            }
        }
    }

    static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f32871a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f32872b;

        static {
            Covode.recordClassIndex(19604);
        }

        j(a aVar, View view) {
            this.f32871a = aVar;
            this.f32872b = view;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
            if (r6 != 3) goto L_0x0044;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 774
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.popup.a.j.run():void");
        }
    }

    private final Animator.AnimatorListener b(h.f.a.a<z> aVar) {
        return new e(this, aVar);
    }

    public final void a(com.bytedance.ies.bullet.service.popup.anim.c cVar) {
        h.f.b.l.c(cVar, "");
        this.q = cVar;
    }

    static final class m extends h.f.b.m implements h.f.a.b<String, z> {
        final /* synthetic */ View $view$inlined;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(19607);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(a aVar, View view) {
            super(1);
            this.this$0 = aVar;
            this.$view$inlined = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            new JSONObject().put("status", str);
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ View $view$inlined;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(19606);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(a aVar, View view) {
            super(1);
            this.this$0 = aVar;
            this.$view$inlined = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.this$0.dismiss();
            } else {
                h.f.a.a<z> aVar = this.this$0.f32790d;
                if (aVar != null) {
                    aVar.invoke();
                }
                this.this$0.f32790d = null;
            }
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ View $view$inlined;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(19609);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(a aVar, View view) {
            super(1);
            this.this$0 = aVar;
            this.$view$inlined = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.this$0.dismiss();
            } else {
                h.f.a.a<z> aVar = this.this$0.f32790d;
                if (aVar != null) {
                    aVar.invoke();
                }
                this.this$0.f32790d = null;
            }
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.d, androidx.appcompat.app.i
    public Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        if (context == null) {
            h.f.b.l.a();
        }
        h.f.b.l.a((Object) context, "");
        h hVar = new h(this, context);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            hVar.setOwnerActivity(activity);
        }
        return hVar;
    }

    @Override // androidx.fragment.app.d
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f32793g == c.UNKNOWN) {
            this.f32793g = c.TAP_MASK;
        }
        com.bytedance.ies.bullet.service.base.a.e eVar = this.s;
        if (eVar != null) {
            eVar.b(this);
        }
        super.onDismiss(dialogInterface);
    }

    public static final class d implements a.AbstractC0717a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Window f32837a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f32838b;

        static {
            Covode.recordClassIndex(19597);
        }

        @Override // com.bytedance.ies.bullet.service.popup.b.a.AbstractC0717a
        public final void a(int i2) {
            boolean z;
            g gVar = this.f32838b.f32788b;
            boolean z2 = true;
            if (gVar != null) {
                if (i2 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                Window window = this.f32837a;
                h.f.b.l.a((Object) window, "");
                View decorView = window.getDecorView();
                h.f.b.l.a((Object) decorView, "");
                Rect rect = new Rect();
                decorView.getWindowVisibleDisplayFrame(rect);
                gVar.a(z, i2, Integer.valueOf(rect.bottom));
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("containerID", this.f32838b.j());
            if (i2 <= 0) {
                z2 = false;
            }
            jSONObject.put("keyboardShow", z2);
        }

        d(Window window, a aVar) {
            this.f32837a = window;
            this.f32838b = aVar;
        }
    }

    public final void a(h.f.a.a<z> aVar) {
        Animator animator;
        String str;
        try {
            if (this.f32791e == null || this.q == com.bytedance.ies.bullet.service.popup.anim.c.NONE || this.f32797k == com.bytedance.ies.bullet.service.popup.anim.b.DONE) {
                aVar.invoke();
            } else if (this.f32798l != null) {
                StringBuilder sb = new StringBuilder("reAnimEnd with msg:");
                Throwable th = this.f32798l;
                if (th != null) {
                    str = th.getMessage();
                } else {
                    str = null;
                }
                j.b.a(this, sb.append(str).toString(), null, "popup", 2);
                aVar.invoke();
            } else if (this.f32797k != com.bytedance.ies.bullet.service.popup.anim.b.DOING) {
                this.f32797k = com.bytedance.ies.bullet.service.popup.anim.b.DOING;
                g gVar = new g(this, aVar);
                int i2 = b.f32904a[this.q.ordinal()];
                if (i2 == 1) {
                    View view = this.f32791e;
                    if (view == null) {
                        h.f.b.l.a();
                    }
                    view.animate().translationX((float) g().getWidth()).setDuration(300).setListener(b(gVar)).start();
                } else if (i2 == 2) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.addListener(b(gVar));
                    animatorSet.setDuration(300L);
                    animatorSet.setInterpolator(new com.bytedance.ies.bullet.service.popup.anim.a((byte) 0));
                    Animator[] animatorArr = new Animator[1];
                    View view2 = this.f32791e;
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
                    gVar.invoke();
                } else {
                    com.bytedance.ies.bullet.service.popup.anim.d h3 = h();
                    if (h3 != null) {
                        animator = h3.c();
                    } else {
                        animator = null;
                    }
                    if (h() == null || animator == null) {
                        gVar.invoke();
                        return;
                    }
                    animator.setDuration(300);
                    animator.addListener(b(gVar));
                    animator.start();
                }
            }
        } catch (Exception e2) {
            j.b.a(this, "dismiss failed with: " + e2.getMessage(), null, "popup", 2);
        }
    }

    public static Object a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!com.ss.android.ugc.aweme.lancet.i.f107219a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        com.bytedance.crash.c.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                com.ss.android.ugc.aweme.lancet.i.f107219a = false;
            }
            return systemService;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        com.bytedance.ies.bullet.service.popup.a.i iVar;
        Dialog dialog;
        Window window;
        h.f.b.l.c(view, "");
        super.onViewCreated(view, bundle);
        if (this.f32794h == null || this.f32795i == null) {
            j.b.a(this, "act and config is not init, dismiss dialog fragment", null, "popup", 2);
            dismissAllowingStateLoss();
            return;
        }
        c cVar = this.f32795i;
        if (cVar == null) {
            h.f.b.l.a("config");
        }
        this.f32792f = cVar.z;
        view.post(new j(this, view));
        c cVar2 = this.f32795i;
        if (cVar2 == null) {
            h.f.b.l.a("config");
        }
        view.setBackgroundColor(Color.parseColor(cVar2.f32948j));
        com.bytedance.ies.bullet.service.popup.anim.d h2 = h();
        if (h2 != null) {
            h2.a();
        }
        c cVar3 = this.f32795i;
        if (cVar3 == null) {
            h.f.b.l.a("config");
        }
        if (!(!cVar3.p || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null)) {
            h.f.b.l.a((Object) window, "");
            Context context = window.getContext();
            h.f.b.l.a((Object) context, "");
            com.bytedance.ies.bullet.service.popup.b.a.a(window, context, new d(window, this));
        }
        c cVar4 = this.f32795i;
        if (cVar4 == null) {
            h.f.b.l.a("config");
        }
        int i2 = cVar4.f32942d;
        if (i2 == 0) {
            c cVar5 = this.f32795i;
            if (cVar5 == null) {
                h.f.b.l.a("config");
            }
            a a2 = C0712a.a(cVar5.q);
            if (!(a2 == null || (iVar = a2.f32789c) == null)) {
                iVar.d();
            }
        } else if (i2 == 3) {
            c cVar6 = this.f32795i;
            if (cVar6 == null) {
                h.f.b.l.a("config");
            }
            a a3 = C0712a.a(cVar6.q);
            if (a3 != null) {
                a3.f32790d = null;
                com.bytedance.ies.bullet.service.popup.a.i iVar2 = a3.f32789c;
                if (iVar2 != null) {
                    iVar2.e();
                }
            }
        }
        com.bytedance.ies.bullet.service.base.a.e eVar = this.s;
        if (eVar != null) {
            eVar.a(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.c(layoutInflater, "");
        return g();
    }
}

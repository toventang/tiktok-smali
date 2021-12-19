package com.bytedance.android.live.liveinteract.cohost.ui.b;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlImageView;
import com.bytedance.android.live.liveinteract.cohost.a.a.d;
import com.bytedance.android.live.liveinteract.cohost.a.a.e;
import com.bytedance.android.live.liveinteract.cohost.a.d.w;
import com.bytedance.android.livesdk.utils.ak;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.r;
import h.z;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Objects;

public final class c extends v implements d.AbstractC0159d, d.e, e.c {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f10254a = {new r(c.class, "mDialogParams", "getMDialogParams()Lcom/bytedance/android/live/liveinteract/cohost/business/contract/LinkDialogContract$LinkDialogParams;", 0)};

    /* renamed from: d  reason: collision with root package name */
    public static final b f10255d = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public View f10256b;

    /* renamed from: c  reason: collision with root package name */
    final h.h.e f10257c;

    /* renamed from: e  reason: collision with root package name */
    private final ak.a f10258e = ak.a.PANEL_LINK;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f10259f = h.i.a((h.f.a.a) new C0170c(this));

    /* renamed from: g  reason: collision with root package name */
    private w.a f10260g;

    /* renamed from: h  reason: collision with root package name */
    private d.c f10261h;

    /* renamed from: i  reason: collision with root package name */
    private final m f10262i;

    /* renamed from: j  reason: collision with root package name */
    private HashMap f10263j;

    static {
        Covode.recordClassIndex(5399);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f10263j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f10263j == null) {
            this.f10263j = new HashMap();
        }
        View view = (View) this.f10263j.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f10263j.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final e.b g() {
        return (e.b) this.f10259f.getValue();
    }

    public final e.a h() {
        return (e.a) this.f10257c.a(this, f10254a[0]);
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(5401);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final ak.a c_() {
        return this.f10258e;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.d.e
    public final m e() {
        return this.f10262i;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.e.c
    public final DataChannel f() {
        return this.p;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.c$c  reason: collision with other inner class name */
    static final class C0170c extends h.f.b.m implements h.f.a.a<w> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(5402);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0170c(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ w invoke() {
            return new w(this.this$0);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.d.AbstractC0159d
    public final w.a d() {
        w.a aVar = this.f10260g;
        if (aVar == null) {
            l.a("mInitFragmentType");
        }
        return aVar;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, com.bytedance.android.live.liveinteract.cohost.a.a.d.AbstractC0159d, com.bytedance.android.live.liveinteract.cohost.a.a.d.e
    public final void dismiss() {
        DataChannel dataChannel = this.p;
        if (dataChannel != null) {
            dataChannel.c(com.bytedance.android.live.liveinteract.platform.common.c.d.class);
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        g().c();
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b99);
        bVar.f22375b = R.style.a36;
        bVar.f22382i = -1;
        return bVar;
    }

    static final class d implements i.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f10266a;

        static {
            Covode.recordClassIndex(5403);
        }

        d(c cVar) {
            this.f10266a = cVar;
        }

        @Override // androidx.fragment.app.i.c
        public final void a() {
            d.b<?> b2 = this.f10266a.g().b();
            if (b2 != null && b2.isViewValid() && this.f10266a.getDialog() != null) {
                c cVar = this.f10266a;
                e.a d2 = b2.d();
                l.b(d2, "");
                cVar.f10257c.a(c.f10254a[0], d2);
            }
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(5408);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* renamed from: a */
        public final View invoke() {
            LiveAutoRtlImageView liveAutoRtlImageView = new LiveAutoRtlImageView(this.this$0.getContext());
            liveAutoRtlImageView.setLayoutParams(new ViewGroup.LayoutParams(y.a(10.0f), y.a(18.0f)));
            liveAutoRtlImageView.setImageDrawable(y.c(2131234693));
            liveAutoRtlImageView.setOnClickListener(new a(this));
            return liveAutoRtlImageView;
        }

        /* access modifiers changed from: package-private */
        public static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f10270a;

            static {
                Covode.recordClassIndex(5409);
            }

            a(h hVar) {
                this.f10270a = hVar;
            }

            public final void onClick(View view) {
                if (this.f10270a.this$0.g().a()) {
                    this.f10270a.this$0.getChildFragmentManager().c();
                }
            }
        }
    }

    private final void j() {
        k();
        d.b<?> b2 = g().b();
        if (b2 != null) {
            n a2 = getChildFragmentManager().a();
            a2.a(R.anim.ed, R.anim.ee, R.anim.ed, R.anim.ee);
            a2.a((String) null);
            a2.a(R.id.b94, b2);
            a2.b();
        }
    }

    private final void k() {
        Context context;
        View currentFocus;
        if (this.o && (context = getContext()) != null) {
            l.b(context, "");
            Dialog dialog = getDialog();
            if (dialog != null && (currentFocus = dialog.getCurrentFocus()) != null) {
                l.b(currentFocus, "");
                Object a2 = a(context, "input_method");
                Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                InputMethodManager inputMethodManager = (InputMethodManager) a2;
                if (inputMethodManager.isActive()) {
                    inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final boolean i() {
        if (h().f10039c) {
            if (g().a()) {
                getChildFragmentManager().c();
            }
            return true;
        } else if (!h().f10042f) {
            return true;
        } else {
            h.f.a.a<z> aVar = h().f10043g;
            if (aVar == null) {
                return false;
            }
            aVar.invoke();
            return false;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<View, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(5407);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            a(view);
            return z.f158842a;
        }

        public final void a(View view) {
            ViewGroup viewGroup;
            MethodCollector.i(8725);
            View view2 = this.this$0.f10256b;
            if (view2 == null || (viewGroup = (ViewGroup) view2.findViewById(R.id.c6_)) == null) {
                MethodCollector.o(8725);
                return;
            }
            viewGroup.removeAllViews();
            if (view != null) {
                viewGroup.addView(view);
            }
            MethodCollector.o(8725);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<View, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(5410);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            a(view);
            return z.f158842a;
        }

        public final void a(View view) {
            ViewGroup viewGroup;
            MethodCollector.i(8720);
            View view2 = this.this$0.f10256b;
            if (view2 == null || (viewGroup = (ViewGroup) view2.findViewById(R.id.c7m)) == null) {
                MethodCollector.o(8720);
                return;
            }
            viewGroup.removeAllViews();
            if (view != null) {
                viewGroup.addView(view);
            }
            MethodCollector.o(8720);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<String, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(5412);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            a(str);
            return z.f158842a;
        }

        public final void a(String str) {
            LiveTextView liveTextView;
            l.d(str, "");
            View view = this.this$0.f10256b;
            if (view != null && (liveTextView = (LiveTextView) view.findViewById(R.id.f9l)) != null) {
                liveTextView.setText(str);
            }
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f10267a;

        static {
            Covode.recordClassIndex(5404);
        }

        e(c cVar) {
            this.f10267a = cVar;
        }

        public final void onClick(View view) {
            if (this.f10267a.h().f10042f) {
                this.f10267a.dismiss();
            }
        }
    }

    static final class f extends h.f.b.m implements h.f.a.m<Integer, Integer, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(5405);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* access modifiers changed from: package-private */
        public static final class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ViewGroup.LayoutParams f10268a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ViewGroup f10269b;

            static {
                Covode.recordClassIndex(5406);
            }

            a(ViewGroup.LayoutParams layoutParams, ViewGroup viewGroup) {
                this.f10268a = layoutParams;
                this.f10269b = viewGroup;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2;
                ViewGroup.LayoutParams layoutParams = this.f10268a;
                if (layoutParams != null) {
                    l.b(valueAnimator, "");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (!(animatedValue instanceof Integer)) {
                        animatedValue = null;
                    }
                    Integer num = (Integer) animatedValue;
                    if (num != null) {
                        i2 = num.intValue();
                    } else {
                        i2 = 0;
                    }
                    layoutParams.height = i2;
                }
                ViewGroup viewGroup = this.f10269b;
                if (viewGroup != null) {
                    viewGroup.setLayoutParams(this.f10268a);
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Integer num, Integer num2) {
            a(num.intValue(), num2.intValue());
            return z.f158842a;
        }

        public final void a(int i2, int i3) {
            ViewGroup viewGroup;
            if (i3 > 0) {
                View view = this.this$0.f10256b;
                ViewGroup.LayoutParams layoutParams = null;
                if (view != null) {
                    viewGroup = (ViewGroup) view.findViewById(R.id.b94);
                    if (viewGroup != null) {
                        layoutParams = viewGroup.getLayoutParams();
                    }
                } else {
                    viewGroup = null;
                }
                if (i2 != 0) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(y.a((float) i2), y.a((float) i3));
                    ofInt.addUpdateListener(new a(layoutParams, viewGroup));
                    ofInt.setDuration(300L);
                    ofInt.start();
                    return;
                }
                if (layoutParams != null) {
                    layoutParams.height = y.a((float) i3);
                }
                if (viewGroup != null) {
                    viewGroup.setLayoutParams(layoutParams);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("error!!! Please manually set the height of the fragment inside the linkDialog");
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(5411);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            View findViewById;
            int i2;
            boolean booleanValue = bool.booleanValue();
            View view = this.this$0.f10256b;
            if (!(view == null || (findViewById = view.findViewById(R.id.fjm)) == null)) {
                if (booleanValue) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                findViewById.setVisibility(i2);
            }
            return z.f158842a;
        }
    }

    public c(m mVar) {
        l.d(mVar, "");
        this.f10262i = mVar;
        e.a aVar = new e.a();
        this.f10257c = new a(aVar, aVar, this);
    }

    public final d.AbstractC0159d b(w.a aVar, d.c cVar) {
        l.d(aVar, "");
        this.f10260g = aVar;
        this.f10261h = cVar;
        return this;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.d.e
    public final void a(w.a aVar, d.c cVar) {
        l.d(aVar, "");
        if (g().a(aVar, cVar)) {
            j();
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        this.f10256b = view;
        getChildFragmentManager().a(new d(this));
        view.findViewById(R.id.d10).setOnClickListener(new e(this));
        e.b g2 = g();
        w.a aVar = this.f10260g;
        if (aVar == null) {
            l.a("mInitFragmentType");
        }
        g2.a(aVar, this.f10261h);
        j();
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(8144);
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
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(8144);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static final class a extends h.h.c<e.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f10264a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f10265b;

        static {
            Covode.recordClassIndex(5400);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Object obj, Object obj2, c cVar) {
            super(obj2);
            this.f10264a = obj;
            this.f10265b = cVar;
        }

        @Override // h.h.c
        public final void a(h.k.i<?> iVar, e.a aVar, e.a aVar2) {
            l.d(iVar, "");
            e.a aVar3 = aVar2;
            e.a aVar4 = aVar;
            c cVar = this.f10265b;
            if (cVar.o) {
                f fVar = new f(cVar);
                g gVar = new g(cVar);
                h hVar = new h(cVar);
                i iVar2 = new i(cVar);
                new j(cVar);
                k kVar = new k(cVar);
                if (!l.a((Object) aVar4.f10037a, (Object) aVar3.f10037a)) {
                    kVar.a(aVar3.f10037a);
                }
                if (aVar4.f10038b != aVar3.f10038b) {
                    fVar.a(aVar4.f10038b, aVar3.f10038b);
                }
                if ((!l.a(aVar4.f10040d, aVar3.f10040d)) || aVar4.f10039c != aVar3.f10039c) {
                    if (aVar3.f10039c) {
                        gVar.a(hVar.invoke());
                    } else {
                        gVar.a(aVar3.f10040d);
                    }
                }
                if (!l.a(aVar4.f10041e, aVar3.f10041e)) {
                    iVar2.a(aVar3.f10041e);
                }
            }
        }
    }
}

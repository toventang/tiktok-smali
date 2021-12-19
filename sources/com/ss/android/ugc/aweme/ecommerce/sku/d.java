package com.ss.android.ugc.aweme.ecommerce.sku;

import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.ar;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.v;
import com.ss.android.ugc.aweme.base.arch.i;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.router.StrategyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.util.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.utils.dg;
import com.zhiliaoapp.musically.R;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.h;
import h.k.k;
import h.z;
import java.lang.reflect.Field;
import java.util.Objects;

public final class d extends com.ss.android.ugc.aweme.ecommerce.common.a.a implements ar<i>, q {

    /* renamed from: c  reason: collision with root package name */
    public static final a f87396c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final i f87397a = new i();

    /* renamed from: b  reason: collision with root package name */
    public KeyBoardVisibilityUtil f87398b;

    /* renamed from: d  reason: collision with root package name */
    private final h f87399d = h.i.a((h.f.a.a) new C2111d(this));

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f87400e;

    static {
        Covode.recordClassIndex(54885);
    }

    private final com.ss.android.ugc.aweme.ecommerce.sku.b.a b() {
        return (com.ss.android.ugc.aweme.ecommerce.sku.b.a) this.f87399d.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.a.e, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final View a(int i2) {
        if (this.f87400e == null) {
            this.f87400e = new SparseArray();
        }
        View view = (View) this.f87400e.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f87400e.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.a.e, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final void a() {
        SparseArray sparseArray = this.f87400e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54886);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* bridge */ /* synthetic */ i d() {
        return this.f87397a;
    }

    @Override // com.bytedance.jedi.arch.v
    public final m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.a.e
    public final com.ss.android.ugc.aweme.ecommerce.router.m e() {
        return b();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        b().d();
    }

    public d() {
        super((byte) 0);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.ecommerce.common.a.e, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final void onDestroyView() {
        super.onDestroyView();
        b().c();
        int i2 = Build.VERSION.SDK_INT;
        KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.f87398b;
        if (keyBoardVisibilityUtil != null) {
            keyBoardVisibilityUtil.a();
        }
        this.f87398b = null;
        a();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.d$d  reason: collision with other inner class name */
    static final class C2111d extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.ecommerce.sku.b.a> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(54889);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2111d(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.sku.b.a invoke() {
            Uri uri;
            com.ss.android.ugc.aweme.ecommerce.router.h b2 = StrategyService.b().a().a(new h.f.a.a<com.ss.android.ugc.aweme.ecommerce.router.m>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.sku.d.C2111d.AnonymousClass1 */
                final /* synthetic */ C2111d this$0;

                static {
                    Covode.recordClassIndex(54890);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.router.m invoke() {
                    return new com.ss.android.ugc.aweme.ecommerce.sku.b.c(this.this$0.this$0);
                }
            }).b(new h.f.a.a<com.ss.android.ugc.aweme.ecommerce.router.m>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.sku.d.C2111d.AnonymousClass2 */
                final /* synthetic */ C2111d this$0;

                static {
                    Covode.recordClassIndex(54891);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.router.m invoke() {
                    return new com.ss.android.ugc.aweme.ecommerce.sku.b.b(this.this$0.this$0);
                }
            });
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                uri = (Uri) arguments.getParcelable("uri");
            } else {
                uri = null;
            }
            return com.ss.android.ugc.aweme.ecommerce.router.i.a(b2, uri);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b().a();
    }

    @Override // androidx.fragment.app.d, androidx.appcompat.app.i, com.google.android.material.bottomsheet.b, com.ss.android.ugc.aweme.ecommerce.common.a.e
    public final Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        if (context == null) {
            l.b();
        }
        l.b(context, "");
        a aVar = new a(context, getTheme());
        aVar.a(b());
        return aVar;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        l.d(bundle, "");
        super.onSaveInstanceState(bundle);
        e activity = getActivity();
        if (activity != null) {
            com.ss.android.ugc.aweme.ecommerce.sku.b.a b2 = b();
            l.b(activity, "");
            b2.b(activity, bundle);
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f87402a;

        static {
            Covode.recordClassIndex(54888);
        }

        c(d dVar) {
            this.f87402a = dVar;
        }

        public final void onClick(View view) {
            Object obj;
            ClickAgent.onClick(view);
            KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.f87402a.f87398b;
            if (keyBoardVisibilityUtil == null) {
                return;
            }
            if (keyBoardVisibilityUtil.f87543a) {
                Context context = this.f87402a.getContext();
                IBinder iBinder = null;
                if (context != null) {
                    obj = a(context, "input_method");
                } else {
                    obj = null;
                }
                Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                InputMethodManager inputMethodManager = (InputMethodManager) obj;
                View view2 = this.f87402a.getView();
                if (view2 != null) {
                    iBinder = view2.getWindowToken();
                }
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                IEventCenter a2 = EventCenter.a();
                String b2 = dg.a().b(new SkuPanelStarter.SkuKeyboardVisibilityParams(false));
                l.b(b2, "");
                a2.a("ec_sku_panel_keyboard_show", b2);
                return;
            }
            this.f87402a.dismiss();
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(4135);
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
                        MethodCollector.o(4135);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final void onActivityCreated(Bundle bundle) {
        ViewParent viewParent;
        View findViewById;
        ViewParent parent;
        super.onActivityCreated(bundle);
        b().b();
        e activity = getActivity();
        if (activity != null) {
            com.ss.android.ugc.aweme.ecommerce.sku.b.a b2 = b();
            l.b(activity, "");
            b2.a(activity, bundle);
        }
        Context context = getContext();
        View view = null;
        if (!(context instanceof androidx.core.app.d)) {
            context = null;
        }
        androidx.core.app.d dVar = (androidx.core.app.d) context;
        if (dVar != null) {
            this.f87398b = new KeyBoardVisibilityUtil(dVar, b.f87401a);
        }
        View view2 = getView();
        if (view2 == null || (parent = view2.getParent()) == null) {
            viewParent = null;
        } else {
            viewParent = parent.getParent();
        }
        if (viewParent instanceof View) {
            view = viewParent;
        }
        View view3 = view;
        if (view3 != null && (findViewById = view3.findViewById(R.id.epv)) != null) {
            findViewById.setOnClickListener(new c(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        b().a(view);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class b extends h.f.b.m implements h.f.a.m<Boolean, Integer, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f87401a = new b();

        static {
            Covode.recordClassIndex(54887);
        }

        b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Boolean bool, Integer num) {
            boolean booleanValue = bool.booleanValue();
            num.intValue();
            IEventCenter a2 = EventCenter.a();
            String b2 = dg.a().b(new SkuPanelStarter.SkuKeyboardVisibilityParams(booleanValue));
            l.b(b2, "");
            a2.a("ec_sku_panel_keyboard_show", b2);
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return b().a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(ahVar, "");
        l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}

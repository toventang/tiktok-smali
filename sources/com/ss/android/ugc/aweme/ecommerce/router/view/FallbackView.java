package com.ss.android.ugc.aweme.ecommerce.router.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.webkit.WebView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.bytedance.ies.bullet.ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.bytedance.ies.bullet.ui.common.h;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.z;
import h.z;
import java.util.List;

public final class FallbackView extends a implements au {

    /* renamed from: i  reason: collision with root package name */
    public static final a f87198i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Activity f87199a;

    /* renamed from: b  reason: collision with root package name */
    public BulletActivityWrapper f87200b;

    /* renamed from: c  reason: collision with root package name */
    public BulletContainerView f87201c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.ies.bullet.c.c.i f87202d;

    /* renamed from: e  reason: collision with root package name */
    public SSWebView f87203e;

    /* renamed from: f  reason: collision with root package name */
    com.google.android.material.bottomsheet.b f87204f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f87205g;

    /* renamed from: h  reason: collision with root package name */
    public int f87206h;

    /* renamed from: j  reason: collision with root package name */
    private final int f87207j;

    /* renamed from: k  reason: collision with root package name */
    private int f87208k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f87209l;

    static {
        Covode.recordClassIndex(54720);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestory();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54721);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean getDraggable() {
        return this.f87209l;
    }

    public final Activity getActivity() {
        Activity activity = this.f87199a;
        if (activity == null) {
            l.a("activity");
        }
        return activity;
    }

    public final BulletActivityWrapper getActivityWrapper() {
        BulletActivityWrapper bulletActivityWrapper = this.f87200b;
        if (bulletActivityWrapper == null) {
            l.a("activityWrapper");
        }
        return bulletActivityWrapper;
    }

    public final BulletContainerView getBulletContainerView() {
        BulletContainerView bulletContainerView = this.f87201c;
        if (bulletContainerView == null) {
            l.a("bulletContainerView");
        }
        return bulletContainerView;
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ FallbackView this$0;

        static {
            Covode.recordClassIndex(54725);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(FallbackView fallbackView) {
            super(0);
            this.this$0 = fallbackView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (!this.this$0.f87205g) {
                this.this$0.getBulletContainerView().b();
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ FallbackView this$0;

        static {
            Covode.recordClassIndex(54726);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(FallbackView fallbackView) {
            super(0);
            this.this$0 = fallbackView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (!this.this$0.f87205g) {
                this.this$0.getBulletContainerView().b();
            }
            return z.f158842a;
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestory() {
        BulletContainerView bulletContainerView = this.f87201c;
        if (bulletContainerView == null) {
            l.a("bulletContainerView");
        }
        bulletContainerView.a();
        BulletContainerView bulletContainerView2 = this.f87201c;
        if (bulletContainerView2 == null) {
            l.a("bulletContainerView");
        }
        bulletContainerView2.getProviderFactory().a();
    }

    static final class k implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FallbackView f87235a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FallbackView f87236b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f87237c;

        static {
            Covode.recordClassIndex(54732);
        }

        k(FallbackView fallbackView, FallbackView fallbackView2, boolean z) {
            this.f87235a = fallbackView;
            this.f87236b = fallbackView2;
            this.f87237c = z;
        }

        public final void onGlobalLayout() {
            int i2;
            Rect rect = new Rect();
            this.f87236b.getWindowVisibleDisplayFrame(rect);
            if (this.f87237c) {
                i2 = 0;
            } else {
                i2 = this.f87235a.f87206h;
            }
            int i3 = (rect.bottom - rect.top) + i2;
            if (this.f87236b.getLayoutParams().height != i3) {
                this.f87236b.getLayoutParams().height = i3;
                this.f87236b.requestLayout();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.router.view.a
    public final boolean a() {
        BulletActivityWrapper bulletActivityWrapper = this.f87200b;
        if (bulletActivityWrapper == null) {
            l.a("activityWrapper");
        }
        Activity activity = this.f87199a;
        if (activity == null) {
            l.a("activity");
        }
        return bulletActivityWrapper.a(activity);
    }

    /* access modifiers changed from: package-private */
    public static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FallbackView f87223a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f87224b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Uri f87225c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ DmtStatusView f87226d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f87227e;

        static {
            Covode.recordClassIndex(54728);
        }

        h(FallbackView fallbackView, androidx.fragment.app.e eVar, Uri uri, DmtStatusView dmtStatusView, boolean z) {
            this.f87223a = fallbackView;
            this.f87224b = eVar;
            this.f87225c = uri;
            this.f87226d = dmtStatusView;
            this.f87227e = z;
        }

        public final void run() {
            String queryParameter;
            Dialog dialog;
            Window window;
            this.f87223a.getBulletContainerView().a(BulletService.f().a());
            this.f87223a.getBulletContainerView().setActivityWrapper(this.f87223a.getActivityWrapper());
            this.f87223a.getBulletContainerView().a(BulletService.f().a(this.f87224b), 17, 0, 0, 0, 0);
            h.a.a(this.f87223a.getBulletContainerView(), this.f87225c, null, new h.b(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.router.view.FallbackView.h.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h f87228a;

                static {
                    Covode.recordClassIndex(54729);
                }

                @Override // com.bytedance.ies.bullet.ui.common.h.b
                public final void a(com.bytedance.ies.bullet.c.c.i iVar, Uri uri, q qVar) {
                    l.d(iVar, "");
                    l.d(uri, "");
                    l.d(qVar, "");
                }

                private static boolean a() {
                    try {
                        return f.a.f68431a.c();
                    } catch (Exception unused) {
                        return false;
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f87228a = r1;
                }

                @Override // com.bytedance.ies.bullet.ui.common.h.b
                public final void a(Uri uri) {
                    l.d(uri, "");
                    this.f87228a.f87223a.f87205g = true;
                }

                @Override // com.bytedance.ies.bullet.ui.common.h.b
                public final void a(Uri uri, Throwable th) {
                    l.d(uri, "");
                    l.d(th, "");
                    this.f87228a.f87223a.f87205g = false;
                    if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                        com.ss.android.ugc.aweme.lancet.j.f107226e = a();
                    }
                    if (com.ss.android.ugc.aweme.lancet.j.f107226e) {
                        this.f87228a.f87226d.i();
                        new com.bytedance.tux.g.b(this.f87228a.f87224b).e(R.string.fwt).b();
                        return;
                    }
                    this.f87228a.f87226d.h();
                }

                @Override // com.bytedance.ies.bullet.ui.common.h.b
                public final void a(View view, Uri uri, com.bytedance.ies.bullet.c.c.i iVar) {
                    l.d(view, "");
                    l.d(uri, "");
                    l.d(iVar, "");
                    this.f87228a.f87223a.f87205g = false;
                    this.f87228a.f87226d.g();
                }

                @Override // com.bytedance.ies.bullet.ui.common.h.b
                public final void a(List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends View>> list, Uri uri, com.bytedance.ies.bullet.c.c.i iVar, boolean z) {
                    ViewParent viewParent;
                    l.d(list, "");
                    l.d(uri, "");
                    l.d(iVar, "");
                    this.f87228a.f87223a.f87202d = iVar;
                    FallbackView fallbackView = this.f87228a.f87223a;
                    com.google.android.material.bottomsheet.b bVar = fallbackView.f87204f;
                    if (bVar != null) {
                        View view = bVar.getView();
                        View view2 = null;
                        if (view != null) {
                            viewParent = view.getParent();
                        } else {
                            viewParent = null;
                        }
                        if (viewParent instanceof View) {
                            view2 = viewParent;
                        }
                        View view3 = view2;
                        z.c cVar = new z.c();
                        cVar.element = 0;
                        d dVar = new d(cVar);
                        com.bytedance.ies.bullet.c.c.i iVar2 = fallbackView.f87202d;
                        if (iVar2 instanceof com.bytedance.ies.bullet.kit.web.c) {
                            WebView n = ((com.bytedance.ies.bullet.kit.web.c) iVar2).n();
                            if (n instanceof SSWebView) {
                                SSWebView sSWebView = (SSWebView) n;
                                fallbackView.f87203e = sSWebView;
                                sSWebView.setWebScrollListener(new i(dVar));
                                BottomSheetBehavior a2 = BottomSheetBehavior.a(view3);
                                a2.o = new c(a2, fallbackView, cVar, bVar);
                            }
                        }
                    }
                }
            }, 2);
            FallbackView fallbackView = this.f87223a;
            Uri uri = this.f87225c;
            boolean z = this.f87227e;
            String queryParameter2 = uri.getQueryParameter("url");
            if (queryParameter2 != null && (queryParameter = Uri.parse(queryParameter2).getQueryParameter("soft_input_adjust")) != null && queryParameter.length() != 0) {
                if (fallbackView.f87204f != null) {
                    com.google.android.material.bottomsheet.b bVar = fallbackView.f87204f;
                    if (bVar != null && (dialog = bVar.getDialog()) != null && (window = dialog.getWindow()) != null) {
                        l.b(window, "");
                        BulletContainerView bulletContainerView = fallbackView.f87201c;
                        if (bulletContainerView == null) {
                            l.a("bulletContainerView");
                        }
                        View findViewById = bulletContainerView.getRootView().findViewById(R.id.ad7);
                        BulletContainerView bulletContainerView2 = fallbackView.f87201c;
                        if (bulletContainerView2 == null) {
                            l.a("bulletContainerView");
                        }
                        View findViewById2 = bulletContainerView2.getRootView().findViewById(R.id.af4);
                        if (findViewById != null && findViewById2 != null) {
                            window.setSoftInputMode(36);
                            View rootView = fallbackView.getRootView();
                            l.b(rootView, "");
                            rootView.getViewTreeObserver().addOnGlobalLayoutListener(new j(fallbackView, findViewById, fallbackView));
                            return;
                        }
                        return;
                    }
                    return;
                }
                Activity activity = fallbackView.f87199a;
                if (activity == null) {
                    l.a("activity");
                }
                activity.getWindow().setSoftInputMode(36);
                View rootView2 = fallbackView.getRootView();
                l.b(rootView2, "");
                rootView2.getViewTreeObserver().addOnGlobalLayoutListener(new k(fallbackView, fallbackView, z));
            }
        }
    }

    public static final class j implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f87230a;

        /* renamed from: b  reason: collision with root package name */
        public int f87231b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FallbackView f87232c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ View f87233d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ FallbackView f87234e;

        static {
            Covode.recordClassIndex(54731);
        }

        public final void onGlobalLayout() {
            Rect rect = new Rect();
            this.f87233d.getWindowVisibleDisplayFrame(rect);
            int height = this.f87233d.getHeight() - rect.bottom;
            int i2 = 0;
            if (height > 0) {
                if (!this.f87230a) {
                    this.f87231b = this.f87234e.getHeight();
                    this.f87230a = true;
                }
                int height2 = this.f87233d.getHeight() - height;
                int i3 = this.f87231b;
                if (height2 <= i3) {
                    int height3 = this.f87233d.getHeight() - height;
                    Context context = this.f87232c.getContext();
                    l.b(context, "");
                    int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
                    if (identifier > 0) {
                        i2 = context.getResources().getDimensionPixelSize(identifier);
                    }
                    i3 = height3 - i2;
                }
                if (this.f87234e.getLayoutParams().height != i3) {
                    this.f87234e.getLayoutParams().height = i3;
                    this.f87234e.requestLayout();
                }
            } else if (this.f87230a) {
                this.f87230a = false;
                if (this.f87234e.getLayoutParams().height != this.f87231b) {
                    this.f87234e.getLayoutParams().height = this.f87231b;
                    this.f87234e.requestLayout();
                }
            }
        }

        j(FallbackView fallbackView, View view, FallbackView fallbackView2) {
            this.f87232c = fallbackView;
            this.f87233d = view;
            this.f87234e = fallbackView2;
        }
    }

    public final void setDraggable(boolean z) {
        this.f87209l = z;
    }

    public static final class b extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f87210a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f87211b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f87212c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f87213d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f87214e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f87215f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f87216g;

        static {
            Covode.recordClassIndex(54722);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                this.f87216g.invoke();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(int i2, Context context, int i3, int i4, h.f.a.a aVar) {
            super(700);
            this.f87211b = i2;
            this.f87212c = context;
            this.f87213d = i3;
            this.f87214e = i4;
            this.f87215f = R.string.bgc;
            this.f87216g = aVar;
        }
    }

    public static final class d implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.c f87221a;

        static {
            Covode.recordClassIndex(54724);
        }

        d(z.c cVar) {
            this.f87221a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.router.view.b
        public final void a(int i2) {
            this.f87221a.element = i2;
        }
    }

    public static final class i implements SSWebView.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f87229a;

        static {
            Covode.recordClassIndex(54730);
        }

        i(b bVar) {
            this.f87229a = bVar;
        }

        @Override // com.bytedance.ies.bullet.kit.web.SSWebView.b
        public final void onScrollChanged(int i2, int i3, int i4, int i5) {
            this.f87229a.a(i3);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.router.view.a
    public final void a(com.google.android.material.bottomsheet.b bVar) {
        l.d(bVar, "");
        this.f87204f = bVar;
    }

    public final void setActivity(Activity activity) {
        l.d(activity, "");
        this.f87199a = activity;
    }

    public final void setActivityWrapper(BulletActivityWrapper bulletActivityWrapper) {
        l.d(bulletActivityWrapper, "");
        this.f87200b = bulletActivityWrapper;
    }

    public final void setBulletContainerView(BulletContainerView bulletContainerView) {
        l.d(bulletContainerView, "");
        this.f87201c = bulletContainerView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FallbackView(Context context) {
        super(context);
        int i2;
        l.d(context, "");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i2 = context.getResources().getDimensionPixelSize(identifier);
        } else {
            i2 = 0;
        }
        this.f87206h = i2;
        this.f87207j = (int) n.b(context, 72.0f);
        this.f87208k = (int) n.b(context, 52.0f);
        this.f87209l = true;
    }

    public static final class g extends BulletActivityWrapper {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f87222a;

        static {
            Covode.recordClassIndex(54727);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(androidx.fragment.app.e eVar, Activity activity) {
            super(activity);
            this.f87222a = eVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.router.view.a
    public final void a(Activity activity, Bundle bundle) {
        l.d(activity, "");
        BulletActivityWrapper bulletActivityWrapper = this.f87200b;
        if (bulletActivityWrapper == null) {
            l.a("activityWrapper");
        }
        bulletActivityWrapper.c(activity, bundle);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.router.view.a
    public final void b(Activity activity, Bundle bundle) {
        l.d(activity, "");
        BulletActivityWrapper bulletActivityWrapper = this.f87200b;
        if (bulletActivityWrapper == null) {
            l.a("activityWrapper");
        }
        bulletActivityWrapper.b(activity, bundle);
    }

    public static final class c extends BottomSheetBehavior.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BottomSheetBehavior f87217a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FallbackView f87218b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.c f87219c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.google.android.material.bottomsheet.b f87220d;

        static {
            Covode.recordClassIndex(54723);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
        public final void a(View view, float f2) {
            l.d(view, "");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
        public final void a(View view, int i2) {
            l.d(view, "");
            if (i2 == 1) {
                if (!this.f87218b.getDraggable() || this.f87219c.element > 0) {
                    BottomSheetBehavior bottomSheetBehavior = this.f87217a;
                    l.b(bottomSheetBehavior, "");
                    bottomSheetBehavior.c(3);
                    return;
                }
                SSWebView sSWebView = this.f87218b.f87203e;
                if (sSWebView != null) {
                    sSWebView.scrollBy(0, 1);
                }
            } else if (i2 == 5) {
                this.f87220d.dismiss();
            }
        }

        c(BottomSheetBehavior bottomSheetBehavior, FallbackView fallbackView, z.c cVar, com.google.android.material.bottomsheet.b bVar) {
            this.f87217a = bottomSheetBehavior;
            this.f87218b = fallbackView;
            this.f87219c = cVar;
            this.f87220d = bVar;
        }
    }

    public final void a(androidx.fragment.app.e eVar, Uri uri, boolean z) {
        l.d(eVar, "");
        l.d(uri, "");
        this.f87199a = eVar;
        eVar.getLifecycle().a(this);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        if (z) {
            marginLayoutParams.topMargin = this.f87206h;
        }
        setLayoutParams(marginLayoutParams);
        com.a.a(eVar.getLayoutInflater(), R.layout.on, this, true);
        View findViewById = findViewById(R.id.a0n);
        l.b(findViewById, "");
        this.f87201c = (BulletContainerView) findViewById;
        DmtStatusView dmtStatusView = (DmtStatusView) findViewById(R.id.axu);
        DmtStatusView.a a2 = DmtStatusView.a.a(eVar);
        Context context = getContext();
        l.b(context, "");
        DmtStatusView.a c2 = a2.c(a(context, R.string.de8, R.string.bgd, R.drawable.yu, new e(this)));
        Context context2 = getContext();
        l.b(context2, "");
        dmtStatusView.setBuilder(c2.d(a(context2, R.string.bgb, R.string.bga, R.drawable.zd, new f(this))));
        g gVar = new g(eVar, eVar);
        gVar.a((m) eVar);
        this.f87200b = gVar;
        BulletContainerView bulletContainerView = this.f87201c;
        if (bulletContainerView == null) {
            l.a("bulletContainerView");
        }
        bulletContainerView.post(new h(this, eVar, uri, dmtStatusView, z));
    }

    private static View a(Context context, int i2, int i3, int i4, h.f.a.a<h.z> aVar) {
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.pk, null, false);
        ((AppCompatImageView) a2.findViewById(R.id.bm4)).setImageResource(i4);
        TuxTextView tuxTextView = (TuxTextView) a2.findViewById(R.id.text);
        l.b(tuxTextView, "");
        tuxTextView.setText(context.getText(i2));
        TuxTextView tuxTextView2 = (TuxTextView) a2.findViewById(R.id.ej0);
        l.b(tuxTextView2, "");
        tuxTextView2.setText(context.getText(i3));
        TuxButton tuxButton = (TuxButton) a2.findViewById(R.id.dmf);
        l.b(tuxButton, "");
        tuxButton.setText(context.getText(R.string.bgc));
        TuxButton tuxButton2 = (TuxButton) a2.findViewById(R.id.dmf);
        l.b(tuxButton2, "");
        tuxButton2.setOnClickListener(new b(i4, context, i2, i3, aVar));
        l.b(a2, "");
        return a2;
    }
}

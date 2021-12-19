package com.bytedance.ies.bullet.ui.common;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.c.c.a.p;
import com.bytedance.ies.bullet.c.d;
import com.bytedance.ies.bullet.c.g;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.a.q;
import com.bytedance.ies.bullet.ui.common.b.c;
import com.bytedance.ies.bullet.ui.common.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.i;
import java.util.HashMap;
import java.util.List;

public final class d extends com.bytedance.ies.uikit.a.b implements j, h, h.b {

    /* renamed from: a  reason: collision with root package name */
    g f33081a;

    /* renamed from: b  reason: collision with root package name */
    c f33082b;

    /* renamed from: c  reason: collision with root package name */
    public d.b f33083c;

    /* renamed from: d  reason: collision with root package name */
    String f33084d;

    /* renamed from: e  reason: collision with root package name */
    public BulletContainerView f33085e;

    /* renamed from: j  reason: collision with root package name */
    private Uri f33086j;

    /* renamed from: k  reason: collision with root package name */
    private Bundle f33087k;

    /* renamed from: l  reason: collision with root package name */
    private View f33088l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f33089m = i.a((h.f.a.a) new b(this));
    private HashMap n;

    static {
        Covode.recordClassIndex(19757);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final q getLoggerWrapper() {
        return (q) this.f33089m.getValue();
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(com.bytedance.ies.bullet.c.c.i iVar, Uri uri, com.bytedance.ies.bullet.service.f.a.b.q qVar) {
        l.c(iVar, "");
        l.c(uri, "");
        l.c(qVar, "");
        j.b.a(this, "fragment onLoadParamsSuccess", null, null, 6);
        c cVar = this.f33082b;
        if (cVar != null) {
            cVar.a(iVar, uri, qVar);
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends View>> list, Uri uri, com.bytedance.ies.bullet.c.c.i iVar, boolean z) {
        l.c(list, "");
        l.c(uri, "");
        l.c(iVar, "");
        j.b.a(this, "fragment onLoadKitInstanceSuccess", null, null, 6);
        c cVar = this.f33082b;
        if (cVar != null) {
            cVar.a(list, uri, iVar, z);
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(View view, Uri uri, com.bytedance.ies.bullet.c.c.i iVar) {
        l.c(view, "");
        l.c(uri, "");
        l.c(iVar, "");
        j.b.a(this, "fragment onLoadUriSuccess", null, null, 6);
        c cVar = this.f33082b;
        if (cVar != null) {
            cVar.a(view, uri, iVar);
        }
    }

    public final c b() {
        if (this.f33082b == null) {
            j.b.a(this, "fragment init rootContainer failed!!!", null, null, 6);
        }
        return this.f33082b;
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    private final void c() {
        View view = this.f33088l;
        if (view != null) {
            BulletContainerView bulletContainerView = this.f33085e;
            if (bulletContainerView == null) {
                l.a("bulletContainerView");
            }
            bulletContainerView.setLoadingViewInternal$bullet_ui_common_release(view);
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        g gVar;
        super.onDestroy();
        e activity = getActivity();
        if (!(activity == null || (gVar = this.f33081a) == null)) {
            l.a((Object) activity, "");
            gVar.d(activity);
        }
        a();
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onPause() {
        g gVar;
        super.onPause();
        e activity = getActivity();
        if (activity != null && (gVar = this.f33081a) != null) {
            l.a((Object) activity, "");
            gVar.c(activity);
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        g gVar;
        super.onResume();
        e activity = getActivity();
        if (activity != null && (gVar = this.f33081a) != null) {
            l.a((Object) activity, "");
            gVar.b(activity);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        g gVar;
        super.onStart();
        e activity = getActivity();
        if (activity != null && (gVar = this.f33081a) != null) {
            l.a((Object) activity, "");
            gVar.e(activity);
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onStop() {
        g gVar;
        super.onStop();
        e activity = getActivity();
        if (activity != null && (gVar = this.f33081a) != null) {
            l.a((Object) activity, "");
            gVar.f(activity);
        }
    }

    static final class b extends m implements h.f.a.a<q> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(19759);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ q invoke() {
            com.bytedance.ies.bullet.service.base.m mVar;
            com.bytedance.ies.bullet.c.d a2;
            com.bytedance.ies.bullet.c.e.a.b b2;
            d.b bVar = this.this$0.f33083c;
            if (bVar == null || (a2 = bVar.a()) == null || (b2 = a2.b()) == null) {
                mVar = null;
            } else {
                mVar = (com.bytedance.ies.bullet.service.base.m) b2.c(com.bytedance.ies.bullet.service.base.m.class);
            }
            return new q(mVar, "Fragment");
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final d f33090a;

        /* renamed from: b  reason: collision with root package name */
        private d.b f33091b;

        /* renamed from: c  reason: collision with root package name */
        private g f33092c;

        /* renamed from: d  reason: collision with root package name */
        private String f33093d;

        static {
            Covode.recordClassIndex(19758);
        }

        public final void a() {
            com.bytedance.ies.bullet.c.d dVar;
            com.bytedance.ies.bullet.c.e.a.b c2;
            com.bytedance.ies.bullet.ui.common.b.d dVar2;
            if (this.f33091b != null && this.f33092c != null && !TextUtils.isEmpty(this.f33093d)) {
                d dVar3 = this.f33090a;
                String str = this.f33093d;
                if (str == null) {
                    l.a();
                }
                d.b bVar = dVar3.f33083c;
                c cVar = null;
                if (bVar != null) {
                    dVar = bVar.a();
                } else {
                    dVar = null;
                }
                if (!(dVar instanceof com.bytedance.ies.bullet.c.a)) {
                    dVar = null;
                }
                com.bytedance.ies.bullet.c.a aVar = (com.bytedance.ies.bullet.c.a) dVar;
                if (aVar != null) {
                    g gVar = aVar.f31961i.get(str);
                    if (!(gVar == null || (c2 = gVar.c()) == null || (dVar2 = (com.bytedance.ies.bullet.ui.common.b.d) c2.c(com.bytedance.ies.bullet.ui.common.b.d.class)) == null)) {
                        cVar = dVar2.a().invoke(aVar.f31955c);
                    }
                    dVar3.f33082b = cVar;
                }
            }
        }

        public a(d dVar) {
            l.c(dVar, "");
            this.f33090a = dVar;
        }

        public final a a(d.b bVar) {
            l.c(bVar, "");
            this.f33091b = bVar;
            this.f33090a.a(bVar);
            return this;
        }

        public final a a(g gVar) {
            l.c(gVar, "");
            this.f33092c = gVar;
            d dVar = this.f33090a;
            l.c(gVar, "");
            dVar.f33081a = gVar;
            return this;
        }

        public final a a(String str) {
            l.c(str, "");
            this.f33093d = str;
            d dVar = this.f33090a;
            l.c(str, "");
            dVar.f33084d = str;
            return this;
        }
    }

    @Override // com.bytedance.ies.bullet.c.e.a
    public final void a() {
        if (this.f33085e != null) {
            BulletContainerView bulletContainerView = this.f33085e;
            if (bulletContainerView == null) {
                l.a("bulletContainerView");
            }
            bulletContainerView.a();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.ies.bullet.c.d.a
    public final void a(d.b bVar) {
        l.c(bVar, "");
        this.f33083c = bVar;
    }

    @Override // com.bytedance.ies.bullet.c.c.k
    public final <T extends com.bytedance.ies.bullet.c.c.d<?, ?, ?, ?>> com.bytedance.ies.bullet.c.c.i a(Class<? extends T> cls) {
        l.c(cls, "");
        BulletContainerView bulletContainerView = this.f33085e;
        if (bulletContainerView == null) {
            l.a("bulletContainerView");
        }
        return bulletContainerView.a(cls);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        g gVar;
        super.onActivityCreated(bundle);
        Uri uri = this.f33086j;
        if (uri != null) {
            a(uri, this.f33087k, this);
        }
        e activity = getActivity();
        if (activity != null && (gVar = this.f33081a) != null) {
            l.a((Object) activity, "");
            gVar.a(activity, bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onConfigurationChanged(Configuration configuration) {
        g gVar;
        super.onConfigurationChanged(configuration);
        e activity = getActivity();
        if (activity != null && (gVar = this.f33081a) != null) {
            l.a((Object) activity, "");
            gVar.a(activity, configuration);
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.h
    public final void onEvent(p pVar) {
        l.c(pVar, "");
        BulletContainerView bulletContainerView = this.f33085e;
        if (bulletContainerView == null) {
            l.a("bulletContainerView");
        }
        bulletContainerView.onEvent(pVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.k
    public final com.bytedance.ies.bullet.c.c.i a(String str) {
        l.c(str, "");
        BulletContainerView bulletContainerView = this.f33085e;
        if (bulletContainerView == null) {
            l.a("bulletContainerView");
        }
        return bulletContainerView.a(str);
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(Uri uri) {
        l.c(uri, "");
        j.b.a(this, "fragment onLoadStart", null, null, 6);
        c cVar = this.f33082b;
        if (cVar != null) {
            cVar.a(uri);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final void printReject(Throwable th, String str) {
        l.c(th, "");
        l.c(str, "");
        j.b.a(this, th, str);
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(Uri uri, Throwable th) {
        l.c(uri, "");
        l.c(th, "");
        j.b.a(this, "fragment onLoadFail", null, null, 6);
        c cVar = this.f33082b;
        if (cVar != null) {
            cVar.a(uri, th);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final void printLog(String str, com.bytedance.ies.bullet.service.base.a.p pVar, String str2) {
        l.c(str, "");
        l.c(pVar, "");
        l.c(str2, "");
        j.b.a(this, str, pVar, str2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        g gVar;
        e activity = getActivity();
        if (activity != null && (gVar = this.f33081a) != null) {
            l.a((Object) activity, "");
            gVar.a(activity, i2, i3, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        g gVar;
        l.c(strArr, "");
        l.c(iArr, "");
        super.onRequestPermissionsResult(i2, strArr, iArr);
        e activity = getActivity();
        if (activity != null && (gVar = this.f33081a) != null) {
            l.a((Object) activity, "");
            gVar.a(activity, i2, strArr, iArr);
        }
    }

    public final <T extends com.bytedance.ies.bullet.service.f.a.b.q> T a(Uri uri, Bundle bundle, T t) {
        Uri uri2;
        Uri uri3;
        l.c(t, "");
        l.c(t, "");
        if (uri != null) {
            com.bytedance.ies.bullet.service.f.a.a aVar = new com.bytedance.ies.bullet.service.f.a.a();
            aVar.a(Uri.class, uri, null);
            uri2 = aVar.f32682b.b();
            if (uri2 != null) {
                com.bytedance.ies.bullet.service.f.a.c cVar = new com.bytedance.ies.bullet.service.f.a.c();
                cVar.a(Uri.class, uri2, null);
                uri3 = cVar.P.b();
            } else {
                uri3 = null;
            }
        } else {
            uri2 = null;
            uri3 = null;
        }
        if (bundle != null) {
            t.a(Bundle.class, bundle, null);
        }
        if (uri2 != null) {
            t.a(Uri.class, uri2, null);
        }
        if (uri3 != null) {
            t.a(Uri.class, uri3, null);
        }
        c cVar2 = this.f33082b;
        if (cVar2 != null) {
            cVar2.a(t);
        }
        return t;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.i(12772);
        l.c(layoutInflater, "");
        e activity = getActivity();
        if (activity != null) {
            if (this.f33081a == null) {
                l.a((Object) activity, "");
                this.f33081a = new BulletActivityWrapper(activity);
            }
            c cVar = this.f33082b;
            if (cVar != null) {
                l.a((Object) activity, "");
                ViewGroup a2 = cVar.a(activity);
                l.a((Object) activity, "");
                this.f33085e = new BulletContainerView(activity, null, 6, (byte) 0);
                ViewGroup a3 = cVar.a();
                BulletContainerView bulletContainerView = this.f33085e;
                if (bulletContainerView == null) {
                    l.a("bulletContainerView");
                }
                a3.addView(bulletContainerView);
                g gVar = this.f33081a;
                if (gVar != null) {
                    gVar.a(cVar.b());
                }
                c();
                MethodCollector.o(12772);
                return a2;
            }
        }
        View a4 = com.a.a(layoutInflater, R.layout.m7, viewGroup, false);
        BulletContainerView bulletContainerView2 = (BulletContainerView) a4.findViewById(R.id.a0i);
        l.a((Object) bulletContainerView2, "");
        this.f33085e = bulletContainerView2;
        c();
        MethodCollector.o(12772);
        return a4;
    }

    @Override // com.bytedance.ies.bullet.ui.common.h
    public final void a(Uri uri, Bundle bundle, h.b bVar) {
        g gVar;
        l.c(uri, "");
        d.b bVar2 = this.f33083c;
        if (bVar2 != null && (gVar = this.f33081a) != null) {
            BulletContainerView bulletContainerView = this.f33085e;
            if (bulletContainerView == null) {
                l.a("bulletContainerView");
            }
            c cVar = this.f33082b;
            if (cVar != null) {
                bulletContainerView.getProviderFactory().a(c.class, cVar);
            }
            bulletContainerView.a(bVar2);
            bulletContainerView.setActivityWrapper(gVar);
            c cVar2 = this.f33082b;
            if (cVar2 != null) {
                Context context = bulletContainerView.getContext();
                l.a((Object) context, "");
                cVar2.b(context);
            }
            bulletContainerView.a(uri, bundle, (com.bytedance.ies.bullet.c.e.a.b) null, bVar);
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.h
    public final void a(View view, int i2, int i3, int i4, int i5, int i6) {
        l.c(view, "");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = i3;
        layoutParams.rightMargin = i5;
        layoutParams.topMargin = i4;
        layoutParams.bottomMargin = i6;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
        this.f33088l = view;
    }
}

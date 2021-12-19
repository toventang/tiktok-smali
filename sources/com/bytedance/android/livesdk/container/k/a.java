package com.bytedance.android.livesdk.container.k;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.bg;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.bh;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.bn;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.bo;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.br;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.n;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.t;
import com.bytedance.android.livesdk.container.config.base.HybridConfig;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.x;
import com.bytedance.ies.web.jsbridge2.y;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

public final class a extends com.bytedance.android.livesdk.ui.a implements bg.a, com.bytedance.android.livesdk.container.g.b, com.bytedance.android.livesdk.container.h.a {

    /* renamed from: f  reason: collision with root package name */
    public static final C0341a f16815f = new C0341a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.livesdk.container.c.a f16816a;

    /* renamed from: b  reason: collision with root package name */
    public LiveLoadingView f16817b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.livesdk.container.h.a f16818c;

    /* renamed from: d  reason: collision with root package name */
    public String f16819d = "";

    /* renamed from: e  reason: collision with root package name */
    public List<com.bytedance.android.livesdk.browser.jsbridge.c.a> f16820e = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final h.h f16821g = com.bytedance.android.livesdkapi.m.d.a(new b(this));

    /* renamed from: h  reason: collision with root package name */
    private FrameLayout f16822h;

    /* renamed from: i  reason: collision with root package name */
    private com.bytedance.android.livesdk.browser.i.b f16823i;

    /* renamed from: j  reason: collision with root package name */
    private HashMap f16824j;

    public final /* synthetic */ class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f16833a;

        static {
            Covode.recordClassIndex(9343);
        }

        public k(h.f.a.b bVar) {
            this.f16833a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            l.b(this.f16833a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(9332);
    }

    private final HybridConfig a() {
        return (HybridConfig) this.f16821g.getValue();
    }

    @Override // com.bytedance.android.livesdk.container.g.b
    public final boolean a(KeyEvent keyEvent) {
        l.d(keyEvent, "");
        return false;
    }

    /* renamed from: com.bytedance.android.livesdk.container.k.a$a  reason: collision with other inner class name */
    public static final class C0341a {
        static {
            Covode.recordClassIndex(9333);
        }

        private C0341a() {
        }

        public /* synthetic */ C0341a(byte b2) {
            this();
        }

        public static a a(HybridConfig hybridConfig) {
            l.d(hybridConfig, "");
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putSerializable("argument_key_config", hybridConfig);
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.newmethods.bg.a
    public final com.bytedance.android.livesdk.browser.i.b c() {
        return this.f16823i;
    }

    static final class c implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f16825a;

        static {
            Covode.recordClassIndex(9335);
        }

        c(a aVar) {
            this.f16825a = aVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.e.b
        public final com.bytedance.ies.web.jsbridge2.e<Object, Object> a() {
            return new bh(this.f16825a);
        }
    }

    static final class d implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f16826a;

        static {
            Covode.recordClassIndex(9336);
        }

        d(a aVar) {
            this.f16826a = aVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.e.b
        public final com.bytedance.ies.web.jsbridge2.e<Object, Object> a() {
            return new bg(this.f16826a);
        }
    }

    static final class e implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f16827a;

        static {
            Covode.recordClassIndex(9337);
        }

        e(a aVar) {
            this.f16827a = aVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.e.b
        public final com.bytedance.ies.web.jsbridge2.e<Object, Object> a() {
            return new bh(this.f16827a);
        }
    }

    static final class f implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f16828a;

        static {
            Covode.recordClassIndex(9338);
        }

        f(a aVar) {
            this.f16828a = aVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.e.b
        public final com.bytedance.ies.web.jsbridge2.e<Object, Object> a() {
            bn bnVar = new bn(this.f16828a);
            this.f16828a.f16820e.add(bnVar);
            return bnVar;
        }
    }

    static final class g implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f16829a;

        static {
            Covode.recordClassIndex(9339);
        }

        g(a aVar) {
            this.f16829a = aVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.e.b
        public final com.bytedance.ies.web.jsbridge2.e<Object, Object> a() {
            bo boVar = new bo(this.f16829a);
            this.f16829a.f16820e.add(boVar);
            return boVar;
        }
    }

    static final class h implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f16830a;

        static {
            Covode.recordClassIndex(9340);
        }

        h(a aVar) {
            this.f16830a = aVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.e.b
        public final com.bytedance.ies.web.jsbridge2.e<Object, Object> a() {
            br brVar = new br(this.f16830a);
            this.f16830a.f16820e.add(brVar);
            return brVar;
        }
    }

    static final class i implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f16831a;

        static {
            Covode.recordClassIndex(9341);
        }

        i(a aVar) {
            this.f16831a = aVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.e.b
        public final com.bytedance.ies.web.jsbridge2.e<Object, Object> a() {
            t tVar = new t(this.f16831a);
            this.f16831a.f16820e.add(tVar);
            return tVar;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        com.bytedance.android.livesdk.container.c.a aVar = this.f16816a;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f16824j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static final class b extends m implements h.f.a.a<HybridConfig> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(9334);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HybridConfig invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null) {
                l.b();
            }
            Serializable serializable = arguments.getSerializable("argument_key_config");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.bytedance.android.livesdk.container.config.base.HybridConfig");
            return serializable;
        }
    }

    @Override // com.bytedance.android.livesdk.container.h.a
    public final void d() {
        LiveLoadingView liveLoadingView = this.f16817b;
        if (liveLoadingView != null) {
            liveLoadingView.setVisibility(8);
        }
        com.bytedance.android.livesdk.container.h.a aVar = this.f16818c;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            com.bytedance.android.livesdk.container.c.a aVar = this.f16816a;
            if (aVar != null) {
                aVar.a("container_disappear", new JSONObject());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        try {
            com.bytedance.android.livesdk.container.c.a aVar = this.f16816a;
            if (aVar != null) {
                aVar.a("container_appear", new JSONObject());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.bytedance.android.livesdk.container.h.a
    public final void e() {
        View f2;
        FrameLayout frameLayout;
        MethodCollector.i(8222);
        LiveLoadingView liveLoadingView = this.f16817b;
        if (liveLoadingView != null) {
            liveLoadingView.setVisibility(8);
        }
        com.bytedance.android.livesdk.container.h.a aVar = this.f16818c;
        if (aVar != null) {
            aVar.e();
        }
        if (a().getEngineType() == com.bytedance.android.livesdk.container.d.a.LYNX && a().getFallbackUrl().length() > 0) {
            a().setEngineType(com.bytedance.android.livesdk.container.d.a.WEB_VIEW);
            com.bytedance.android.livesdk.container.c.a aVar2 = this.f16816a;
            if (!(aVar2 == null || (f2 = aVar2.f()) == null || (frameLayout = this.f16822h) == null)) {
                frameLayout.removeView(f2);
            }
            com.bytedance.android.livesdk.container.c.a aVar3 = this.f16816a;
            if (aVar3 != null) {
                aVar3.e();
            }
            androidx.fragment.app.e activity = getActivity();
            if (activity == null) {
                l.b();
            }
            l.b(activity, "");
            com.bytedance.android.livesdk.container.c.c cVar = new com.bytedance.android.livesdk.container.c.c(activity, a(), this.f16819d, this);
            this.f16816a = cVar;
            cVar.a();
            WebView webView = cVar.f16767f;
            if (webView != null) {
                FrameLayout frameLayout2 = this.f16822h;
                if (frameLayout2 != null) {
                    frameLayout2.addView(webView, 0);
                }
                cVar.a(a().getFallbackUrl());
            }
        }
        MethodCollector.o(8222);
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.newmethods.bg.a
    public final void a(com.bytedance.android.livesdk.browser.i.b bVar) {
        this.f16823i = bVar;
    }

    static final class j extends m implements h.f.a.b<View, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f16832a = new j();

        static {
            Covode.recordClassIndex(9342);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            l.d(view, "");
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.livesdk.container.h.a
    public final void a(String str) {
        com.bytedance.android.livesdk.container.h.a aVar = this.f16818c;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    public final void b(String str) {
        l.d(str, "");
        this.f16819d = str;
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        com.bytedance.android.livesdk.container.c.a cVar;
        com.bytedance.android.livesdk.browser.jsbridge.c cVar2;
        x xVar;
        com.bytedance.android.livesdk.browser.jsbridge.c cVar3;
        y yVar;
        super.onCreate(bundle);
        if (a().getEngineType() == com.bytedance.android.livesdk.container.d.a.LYNX) {
            androidx.fragment.app.e activity = getActivity();
            if (activity == null) {
                l.b();
            }
            l.b(activity, "");
            cVar = new com.bytedance.android.livesdk.container.c.b(activity, a(), this.f16819d, this);
        } else {
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 == null) {
                l.b();
            }
            l.b(activity2, "");
            cVar = new com.bytedance.android.livesdk.container.c.c(activity2, a(), this.f16819d, this);
        }
        this.f16816a = cVar;
        cVar.a();
        com.bytedance.android.livesdk.container.c.a aVar = this.f16816a;
        if (aVar != null && (cVar2 = aVar.f16750a) != null && (xVar = cVar2.f14451b) != null) {
            Fragment parentFragment = getParentFragment();
            if (!(parentFragment instanceof androidx.fragment.app.d)) {
                parentFragment = null;
            }
            androidx.fragment.app.d dVar = (androidx.fragment.app.d) parentFragment;
            if (dVar != null) {
                xVar.a("close", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new n(dVar));
                xVar.a("sharePanel", (e.b) new c(this));
                xVar.a("shareInfo", (e.b) new d(this));
                xVar.a("sharePanel", (e.b) new e(this));
                xVar.a("uploadPhoto", (e.b) new f(this));
                xVar.a("uploadPicture", (e.b) new g(this));
                xVar.a("uploadVideo", (e.b) new h(this));
                xVar.a("upload", (e.b) new i(this));
                com.bytedance.android.livesdk.container.c.a aVar2 = this.f16816a;
                if (aVar2 != null && (cVar3 = aVar2.f16750a) != null && (yVar = cVar3.f14452c) != null) {
                    yVar.a("share", new com.bytedance.android.livesdk.browser.jsbridge.d.h(new WeakReference(getContext()), this));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [com.bytedance.android.livesdk.container.k.a$k] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
        // Method dump skipped, instructions count: 310
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.container.k.a.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(getLayoutInflater(), R.layout.b_6, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        l.d(intent, "");
        super.onActivityResult(i2, i3, intent);
        com.bytedance.android.livesdk.container.c.a aVar = this.f16816a;
        if (aVar != null) {
            aVar.a(i2, i3, intent);
        }
        Iterator<T> it = this.f16820e.iterator();
        while (it.hasNext()) {
            it.next().a(i2, i3, intent);
        }
    }
}

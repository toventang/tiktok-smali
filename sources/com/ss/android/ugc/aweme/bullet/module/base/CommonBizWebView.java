package com.ss.android.ugc.aweme.bullet.module.base;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.p;
import com.bytedance.ies.bullet.c.d;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.kit.web.a.e;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.bytedance.ies.bullet.ui.common.h;
import com.ss.android.ugc.aweme.ad.b.b;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class CommonBizWebView extends BulletContainerView implements i, j {

    /* renamed from: m  reason: collision with root package name */
    public static final a f69388m = new a((byte) 0);

    /* renamed from: l  reason: collision with root package name */
    public SSWebView f69389l;
    private com.ss.android.ugc.aweme.bullet.module.base.a.a n;
    private b o;
    private b p;
    private Activity q;
    private d.b r;
    private m s;
    private Map<String, String> t;
    private View u;
    private String v;
    private HashMap w;

    public interface b {
        static {
            Covode.recordClassIndex(42783);
        }

        void a(int i2, int i3);
    }

    static {
        Covode.recordClassIndex(42781);
    }

    public CommonBizWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // com.bytedance.ies.bullet.ui.common.BulletContainerView
    public final View f() {
        if (this.w == null) {
            this.w = new HashMap();
        }
        View view = (View) this.w.get(Integer.valueOf((int) R.id.a0g));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.a0g);
        this.w.put(Integer.valueOf((int) R.id.a0g), findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(42, new g(CommonBizWebView.class, "onJsBroadcast", com.ss.android.ugc.aweme.ad.c.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42782);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f69390a;

        /* renamed from: b  reason: collision with root package name */
        private final String f69391b = "notification";

        /* renamed from: c  reason: collision with root package name */
        private final Object f69392c;

        static {
            Covode.recordClassIndex(42784);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final String a() {
            return this.f69391b;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final Object b() {
            return this.f69392c;
        }

        c(JSONObject jSONObject) {
            this.f69390a = jSONObject;
            this.f69392c = jSONObject;
        }
    }

    public final Activity getActivity() {
        return this.q;
    }

    public final b getRootContainer() {
        return this.p;
    }

    public final b getScrollListener() {
        return this.o;
    }

    public final SSWebView getWebView() {
        return this.f69389l;
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b, com.bytedance.ies.bullet.ui.common.BulletContainerView
    public final void a(List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends View>> list, Uri uri, com.bytedance.ies.bullet.c.c.i iVar, boolean z) {
        l.d(list, "");
        l.d(uri, "");
        l.d(iVar, "");
        super.a(list, uri, iVar, z);
        if (iVar instanceof com.bytedance.ies.bullet.kit.web.c) {
            com.bytedance.ies.bullet.kit.web.c cVar = (com.bytedance.ies.bullet.kit.web.c) iVar;
            cVar.a(this.t);
            WebView n2 = cVar.n();
            SSWebView sSWebView = null;
            if (!(n2 instanceof SSWebView)) {
                n2 = null;
            }
            SSWebView sSWebView2 = (SSWebView) n2;
            if (sSWebView2 != null) {
                sSWebView2.setWebScrollListener(new d(this));
                com.ss.android.ugc.aweme.bullet.module.base.a.a aVar = new com.ss.android.ugc.aweme.bullet.module.base.a.a(sSWebView2, (byte) 0);
                this.n = aVar;
                sSWebView2.setWebViewEventDelegate(aVar);
                l.b(b.a.f65586a, "");
                com.ss.android.ugc.aweme.ad.b.c a2 = com.ss.android.ugc.aweme.ad.b.b.a();
                if (a2 != null) {
                    a2.c(this.p, sSWebView2);
                }
                sSWebView = sSWebView2;
            }
            this.f69389l = sSWebView;
        }
    }

    public final void g() {
        SSWebView sSWebView = this.f69389l;
        if (sSWebView != null && sSWebView.b()) {
            sSWebView.goBack();
        }
    }

    public final boolean h() {
        SSWebView sSWebView = this.f69389l;
        if (sSWebView != null) {
            return sSWebView.b();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        EventBus.a(EventBus.a(), this);
    }

    @Override // com.bytedance.ies.bullet.ui.common.BulletContainerView
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventBus.a().b(this);
    }

    @Override // com.bytedance.ies.bullet.c.e.a, com.bytedance.ies.bullet.ui.common.BulletContainerView
    public final void a() {
        com.bytedance.ies.bullet.ui.common.b.a aVar;
        super.a();
        m mVar = this.s;
        if (mVar != null) {
            b bVar = this.p;
            if (bVar != null) {
                aVar = bVar.b();
            } else {
                aVar = null;
            }
            if (!(aVar instanceof CommonBizActivityDelegate)) {
                aVar = null;
            }
            CommonBizActivityDelegate commonBizActivityDelegate = (CommonBizActivityDelegate) aVar;
            if (commonBizActivityDelegate != null) {
                mVar.getLifecycle().b(commonBizActivityDelegate);
                commonBizActivityDelegate.f69387b = null;
            }
        }
    }

    public final void setActivity(Activity activity) {
        this.q = activity;
    }

    public final void setIsAutoReleasableWhenDetached(boolean z) {
        setAutoReleasableWhenDetached(z);
    }

    public final void setRootContainer(b bVar) {
        this.p = bVar;
    }

    public final void setScrollListener(b bVar) {
        this.o = bVar;
    }

    public final void setWebView(SSWebView sSWebView) {
        this.f69389l = sSWebView;
    }

    public static final class d implements SSWebView.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommonBizWebView f69393a;

        static {
            Covode.recordClassIndex(42785);
        }

        d(CommonBizWebView commonBizWebView) {
            this.f69393a = commonBizWebView;
        }

        @Override // com.bytedance.ies.bullet.kit.web.SSWebView.b
        public final void onScrollChanged(int i2, int i3, int i4, int i5) {
            b scrollListener = this.f69393a.getScrollListener();
            if (scrollListener != null) {
                scrollListener.a(i3, i5);
            }
        }
    }

    public final void setCanScrollVertically(boolean z) {
        com.ss.android.ugc.aweme.bullet.module.base.a.a aVar = this.n;
        if (aVar != null) {
            aVar.f69408b = z;
        }
    }

    public final void setEnableScrollControl(boolean z) {
        com.ss.android.ugc.aweme.bullet.module.base.a.a aVar = this.n;
        if (aVar != null) {
            aVar.f69409c = z;
        }
    }

    public final void setOutTouchDelegate(View.OnTouchListener onTouchListener) {
        com.ss.android.ugc.aweme.bullet.module.base.a.a aVar = this.n;
        if (aVar != null) {
            aVar.f69410d = onTouchListener;
        }
    }

    @r
    public final void onJsBroadcast(com.ss.android.ugc.aweme.ad.c.a aVar) {
        l.d(aVar, "");
        com.ss.android.ugc.aweme.bullet.module.base.a.a aVar2 = this.n;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
    }

    @Override // com.bytedance.ies.bullet.c.d.a, com.bytedance.ies.bullet.ui.common.BulletContainerView
    public final void a(d.b bVar) {
        l.d(bVar, "");
        super.a(bVar);
        this.r = bVar;
    }

    public static /* synthetic */ void a(CommonBizWebView commonBizWebView, Uri uri) {
        l.d(uri, "");
        if (!l.a((Object) commonBizWebView.v, (Object) uri.toString())) {
            commonBizWebView.v = uri.toString();
            commonBizWebView.a(uri, (Bundle) null, (h.b) null);
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        l.d(str, "");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("eventName", str);
        if (getReactId().length() > 0) {
            jSONObject2.put("reactId", getReactId());
        }
        jSONObject2.put("data", jSONObject);
        onEvent(new c(jSONObject2));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommonBizWebView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        setAutoReleasableWhenDetached(true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommonBizWebView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    @Override // com.bytedance.ies.bullet.ui.common.BulletContainerView, com.bytedance.ies.bullet.ui.common.h
    public final void a(Uri uri, Bundle bundle, h.b bVar) {
        l.d(uri, "");
        if (this.u == null) {
            IBulletService f2 = BulletService.f();
            Context context = getContext();
            l.b(context, "");
            View a2 = f2.a(context);
            a(a2, 17, 0, 0, 0, 0);
            this.u = a2;
        }
        super.a(uri, bundle, bVar);
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b, com.bytedance.ies.bullet.ui.common.BulletContainerView
    public final void a(com.bytedance.ies.bullet.c.c.i iVar, Uri uri, q qVar) {
        l.d(iVar, "");
        l.d(uri, "");
        l.d(qVar, "");
        super.a(iVar, uri, qVar);
        b bVar = this.p;
        if (bVar != null) {
            bVar.a(iVar, uri, qVar);
        }
    }

    public static /* synthetic */ void a(CommonBizWebView commonBizWebView, Uri uri, Map map, Bundle bundle) {
        l.d(uri, "");
        commonBizWebView.t = map;
        commonBizWebView.a(uri, bundle, (h.b) null);
    }

    public final void a(d.b bVar, e eVar, com.bytedance.ies.bullet.ui.common.g gVar, m mVar, String str) {
        com.bytedance.ies.bullet.ui.common.b.c cVar;
        com.bytedance.ies.bullet.c.e.a.b c2;
        com.bytedance.ies.bullet.ui.common.b.d dVar;
        l.d(bVar, "");
        a(bVar);
        com.bytedance.ies.bullet.c.d a2 = bVar.a();
        CommonBizActivityDelegate commonBizActivityDelegate = null;
        if (!(a2 instanceof com.bytedance.ies.bullet.c.a)) {
            a2 = null;
        }
        com.bytedance.ies.bullet.c.a aVar = (com.bytedance.ies.bullet.c.a) a2;
        if (aVar != null) {
            com.bytedance.ies.bullet.c.g gVar2 = aVar.f31961i.get(str);
            if (gVar2 == null || (c2 = gVar2.c()) == null || (dVar = (com.bytedance.ies.bullet.ui.common.b.d) c2.c(com.bytedance.ies.bullet.ui.common.b.d.class)) == null) {
                cVar = null;
            } else {
                cVar = dVar.a().invoke(aVar.f31955c);
            }
            if (!(cVar instanceof b)) {
                cVar = null;
            }
            b bVar2 = (b) cVar;
            this.p = bVar2;
            if (bVar2 != null) {
                bVar2.x = eVar;
            }
        }
        this.s = mVar;
        setActivityWrapper(gVar);
        Activity a3 = gVar.a();
        if (a3 != null) {
            if ((a3 instanceof m) && this.s == null) {
                this.s = (m) a3;
            }
            b bVar3 = this.p;
            if (bVar3 != null) {
                l.d(a3, "");
                bVar3.r = a3;
                bVar3.z.a(a3);
            }
        } else {
            a3 = null;
        }
        this.q = a3;
        b bVar4 = this.p;
        if (bVar4 != null) {
            getProviderFactory().a(com.bytedance.ies.bullet.ui.common.b.c.class, bVar4);
        }
        b bVar5 = this.p;
        if (bVar5 != null) {
            com.bytedance.ies.bullet.ui.common.b.a b2 = bVar5.b();
            m mVar2 = this.s;
            if (mVar2 != null) {
                if (b2 instanceof CommonBizActivityDelegate) {
                    commonBizActivityDelegate = b2;
                }
                CommonBizActivityDelegate commonBizActivityDelegate2 = commonBizActivityDelegate;
                if (commonBizActivityDelegate2 != null) {
                    commonBizActivityDelegate2.f69387b = this.q;
                    mVar2.getLifecycle().a((androidx.lifecycle.l) b2);
                }
            }
            gVar.a(b2);
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.BulletContainerView, com.bytedance.ies.bullet.ui.common.h
    public final void a(View view, int i2, int i3, int i4, int i5, int i6) {
        l.d(view, "");
        this.u = view;
        super.a(view, i2, i3, i4, i5, i6);
    }
}

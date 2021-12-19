package com.ss.android.ugc.aweme.discover.lynx.delegate;

import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.page.c;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.kakao.usermgmt.StringSet;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.discover.lynx.spark.d;
import com.ss.android.ugc.aweme.search.l.j;
import h.f.b.l;
import org.json.JSONObject;

public final class LifecycleDelegate extends b implements View.OnAttachStateChangeListener, au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f81473a = new a((byte) 0);

    static {
        Covode.recordClassIndex(50629);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50630);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        a("viewDisappear", new JSONObject());
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LifecycleDelegate f81474a;

        static {
            Covode.recordClassIndex(50631);
        }

        b(LifecycleDelegate lifecycleDelegate) {
            this.f81474a = lifecycleDelegate;
        }

        public final void run() {
            LifecycleDelegate lifecycleDelegate = this.f81474a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.type, "show");
            lifecycleDelegate.a("pageScroll", jSONObject);
            LynxView lynxView = this.f81474a.f81477b.f81413d;
            if (lynxView != null) {
                lynxView.onEnterForeground();
            }
        }
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        if (this.f81477b.f81412c != null) {
            a("viewAppear", new JSONObject());
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        View hybirdContainerView = this.f81477b.r.getHybirdContainerView();
        if (hybirdContainerView instanceof BulletContainerView) {
            ((BulletContainerView) hybirdContainerView).a();
        } else if (hybirdContainerView instanceof c) {
            ((c) hybirdContainerView).e();
        }
        d dVar = this.f81477b.q;
        if (dVar != null) {
            dVar.b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LifecycleDelegate(com.ss.android.ugc.aweme.discover.lynx.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
        e eVar = bVar.f81410a;
        if (eVar != null) {
            eVar.getLifecycle().a(this);
        }
        bVar.r.addOnAttachStateChangeListener(this);
    }

    public final void onViewAttachedToWindow(View view) {
        l.d(view, "");
        if (this.f81477b.f81414e) {
            j.a(view, new b(this));
        }
        this.f81477b.f81414e = false;
    }

    public final void onViewDetachedFromWindow(View view) {
        if (!this.f81477b.f81414e) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.type, "hide");
            a("pageScroll", jSONObject);
            LynxView lynxView = this.f81477b.f81413d;
            if (lynxView != null) {
                lynxView.onEnterBackground();
            }
        }
        this.f81477b.f81414e = true;
    }

    public final void a(String str, JSONObject jSONObject) {
        l.d(str, "");
        l.d(jSONObject, "");
        this.f81477b.a(str, jSONObject);
    }
}

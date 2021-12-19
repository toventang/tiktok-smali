package com.ss.android.ugc.aweme.commerce.challenge;

import android.graphics.Rect;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.bytedance.ies.bullet.ui.common.g;
import com.google.gson.o;
import com.google.gson.q;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView;
import com.ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView;
import com.ss.android.ugc.aweme.commercialize.profile.k;
import com.ss.android.ugc.aweme.detail.h;
import com.ss.android.ugc.aweme.music.k.h;
import com.ss.android.ugc.aweme.profile.ui.ar;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class a extends com.ss.android.ugc.aweme.base.f.a implements h, ar, i, j {

    /* renamed from: a  reason: collision with root package name */
    public String f73404a;

    /* renamed from: b  reason: collision with root package name */
    public String f73405b;

    /* renamed from: c  reason: collision with root package name */
    public String f73406c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f73407d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    private boolean f73408e = true;

    /* renamed from: j  reason: collision with root package name */
    private k f73409j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f73410k = h.i.a(m.NONE, new b(this));

    /* renamed from: l  reason: collision with root package name */
    private SparseArray f73411l;

    static {
        Covode.recordClassIndex(45189);
    }

    private final g e() {
        return (g) this.f73410k.getValue();
    }

    private View g() {
        if (this.f73411l == null) {
            this.f73411l = new SparseArray();
        }
        View view = (View) this.f73411l.get(R.id.djs);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(R.id.djs);
        this.f73411l.put(R.id.djs, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.detail.h
    public final void a(boolean z, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.detail.h
    public final void b(boolean z) {
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(349, new org.greenrobot.eventbus.g(a.class, "onJsBroadcast", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
        hashMap.put(80, new org.greenrobot.eventbus.g(a.class, "top", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.detail.h
    public final void k() {
    }

    @Override // com.ss.android.ugc.aweme.detail.h
    public final boolean d() {
        return this.f73408e;
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.challenge.a$a  reason: collision with other inner class name */
    public static final class RunnableC1637a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f73412a;

        static {
            Covode.recordClassIndex(45190);
        }

        public RunnableC1637a(a aVar) {
            this.f73412a = aVar;
        }

        public final void run() {
            this.f73412a.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ar
    public final String c() {
        String str = this.f73405b;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final CommonBizWebView a() {
        k kVar = this.f73409j;
        if (kVar != null) {
            return kVar.f75215a;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.detail.h, com.ss.android.ugc.aweme.common.widget.scrollablelayout.a.AbstractC1744a
    public final View m() {
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) g();
        l.b(enterpriseRecyclerView, "");
        return enterpriseRecyclerView;
    }

    static final class b extends h.f.b.m implements h.f.a.a<BulletActivityWrapper> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(45191);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BulletActivityWrapper invoke() {
            e activity = this.this$0.getActivity();
            if (activity == null) {
                l.b();
            }
            l.b(activity, "");
            return new BulletActivityWrapper(activity);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.h
    public final void n() {
        RecyclerView.i layoutManager;
        RecyclerView recyclerView = (RecyclerView) g();
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            layoutManager.e(0);
        }
    }

    public final void b() {
        CommonBizWebView a2;
        CommonBizWebView a3 = a();
        if (a3 != null && a3.getGlobalVisibleRect(this.f73407d) && (a2 = a()) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("height", n.b((double) this.f73407d.height()));
            a2.a("brand_room_show", jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.h
    public final void j() {
        this.f73408e = false;
        String str = this.f73406c;
        if (str != null) {
            h.a a2 = com.ss.android.ugc.aweme.music.k.h.a(str);
            String str2 = this.f73404a;
            if (str2 == null) {
                str2 = "";
            }
            String uri = a2.a("challenge_id", str2).a().toString();
            l.b(uri, "");
            k kVar = this.f73409j;
            if (kVar != null) {
                l.d(uri, "");
                kVar.f75216b = uri;
            }
            k kVar2 = this.f73409j;
            if (kVar2 != null) {
                kVar2.notifyDataSetChanged();
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onPause() {
        RecyclerView.i layoutManager;
        super.onPause();
        RecyclerView recyclerView = (RecyclerView) g();
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && layoutManager.c(0) != null) {
            g e2 = e();
            e activity = getActivity();
            if (activity == null) {
                l.b();
            }
            l.b(activity, "");
            e2.c(activity);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        RecyclerView.i layoutManager;
        super.onResume();
        RecyclerView recyclerView = (RecyclerView) g();
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && layoutManager.c(0) != null) {
            g e2 = e();
            e activity = getActivity();
            if (activity == null) {
                l.b();
            }
            l.b(activity, "");
            e2.b(activity);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        RecyclerView.i layoutManager;
        View c2;
        super.onDestroyView();
        RecyclerView recyclerView = (RecyclerView) g();
        if (!(recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (c2 = layoutManager.c(0)) == null)) {
            g e2 = e();
            e activity = getActivity();
            if (activity == null) {
                l.b();
            }
            l.b(activity, "");
            e2.d(activity);
            Objects.requireNonNull(c2, "null cannot be cast to non-null type com.bytedance.ies.bullet.ui.common.BulletContainerView");
            ((BulletContainerView) c2).a();
        }
        EventBus.a().b(this);
        SparseArray sparseArray = this.f73411l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.h
    public final void a(String str) {
        this.f73404a = str;
    }

    @r(a = ThreadMode.MAIN)
    public final void onJsBroadcast(com.ss.android.ugc.aweme.fe.method.j jVar) {
        CommonBizWebView a2;
        CommonBizWebView a3;
        l.d(jVar, "");
        String string = jVar.f91311b.getString("eventName");
        if (string != null) {
            String str = null;
            if (l.a((Object) string, (Object) "brand_room_loaded")) {
                CommonBizWebView a4 = a();
                if (a4 != null) {
                    str = a4.getReactId();
                }
                if (l.a((Object) str, (Object) jVar.f91311b.getString("reactId")) && (a2 = a()) != null && a2.getGlobalVisibleRect(this.f73407d) && (a3 = a()) != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("height", n.b((double) this.f73407d.height()));
                    a3.a("brand_room_show", jSONObject);
                }
            }
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void top(com.ss.android.ugc.aweme.fe.method.j jVar) {
        boolean z;
        String c2;
        com.google.gson.l c3;
        l.d(jVar, "");
        com.google.gson.l a2 = q.a(jVar.f91311b.toString());
        l.b(a2, "");
        o j2 = a2.j();
        com.google.gson.l c4 = j2.c("data");
        String str = null;
        if (c4 == null || (c4 instanceof com.google.gson.n) || (c3 = c4.j().c("reactId")) == null || (c3 instanceof com.google.gson.n)) {
            z = false;
        } else {
            String c5 = c3.c();
            CommonBizWebView a3 = a();
            if (a3 != null) {
                str = a3.getReactId();
            }
            z = l.a((Object) c5, (Object) str);
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (valueOf.booleanValue()) {
            valueOf.booleanValue();
            com.google.gson.l c6 = j2.c("eventName");
            if (c6 != null && (c2 = c6.c()) != null) {
                if (l.a((Object) c2, (Object) "mp_tab_top_arrived") || l.a((Object) c2, (Object) "mp_tab_top_left")) {
                    int hashCode = c2.hashCode();
                    if (hashCode != -917484739) {
                        if (hashCode == -853202121 && c2.equals("mp_tab_top_left")) {
                            ((EnterpriseRecyclerView) g()).getEnterTabManager().f75228a = false;
                        }
                    } else if (c2.equals("mp_tab_top_arrived")) {
                        ((EnterpriseRecyclerView) g()).getEnterTabManager().f75228a = true;
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) g();
        l.b(recyclerView, "");
        getActivity();
        recyclerView.setLayoutManager(new CommerceChallengeFragment$onViewCreated$1(this));
        this.f73409j = new k(this, e());
        RecyclerView recyclerView2 = (RecyclerView) g();
        l.b(recyclerView2, "");
        recyclerView2.setAdapter(this.f73409j);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.i(3678);
        l.d(layoutInflater, "");
        EventBus.a(EventBus.a(), this);
        e activity = getActivity();
        if (activity == null) {
            l.b();
        }
        View inflate = LayoutInflater.from(activity).inflate(R.layout.a0y, (ViewGroup) null);
        MethodCollector.o(3678);
        return inflate;
    }
}

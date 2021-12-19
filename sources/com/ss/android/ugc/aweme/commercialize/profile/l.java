package com.ss.android.ugc.aweme.commercialize.profile;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.q;
import com.ss.android.ugc.aweme.ad.feed.d.a;
import com.ss.android.ugc.aweme.ad.feed.f;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.music.k.h;
import com.ss.android.ugc.aweme.profile.ui.cs;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class l extends cs implements i, j {

    /* renamed from: a  reason: collision with root package name */
    public boolean f75222a;

    /* renamed from: b  reason: collision with root package name */
    private j f75223b;

    /* renamed from: c  reason: collision with root package name */
    private String f75224c;

    /* renamed from: d  reason: collision with root package name */
    private String f75225d;

    /* renamed from: e  reason: collision with root package name */
    private Aweme f75226e;

    /* renamed from: j  reason: collision with root package name */
    private SparseArray f75227j;

    static {
        Covode.recordClassIndex(46409);
    }

    private View c() {
        if (this.f75227j == null) {
            this.f75227j = new SparseArray();
        }
        View view = (View) this.f75227j.get(R.id.djs);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(R.id.djs);
        this.f75227j.put(R.id.djs, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.profile.c.a
    public final boolean cb_() {
        return true;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(80, new g(l.class, "top", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.a.AbstractC1744a
    public final View m() {
        return c();
    }

    @Override // com.ss.android.ugc.aweme.profile.c.a
    public final void bM_() {
        String c2 = SharePrefCache.inst().getMpTab().c();
        h.f.b.l.b(c2, "");
        String uri = h.a(c2).a().toString();
        h.f.b.l.b(uri, "");
        j jVar = this.f75223b;
        if (jVar != null) {
            h.f.b.l.d(uri, "");
            jVar.f75209b = uri;
        }
        j jVar2 = this.f75223b;
        if (jVar2 != null) {
            jVar2.notifyDataSetChanged();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cs
    public final void g() {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        if (getUserVisibleHint() && getActivity() != null && b.X(this.f75226e) && (aweme = this.f75226e) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            e activity = getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.aweme.commercialize.log.j.a(activity, "homepage_ad", "businesstab_show", com.ss.android.ugc.aweme.commercialize.log.j.a((Context) getActivity(), this.f75226e, false, (Map<String, String>) null), awemeRawAd);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        RecyclerView.i layoutManager;
        View c2;
        super.onDestroyView();
        RecyclerView recyclerView = (RecyclerView) c();
        if (!(recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (c2 = layoutManager.c(0)) == null)) {
            Objects.requireNonNull(c2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView");
            CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) c2;
            e activity = getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            crossPlatformWebView.d(activity);
        }
        EventBus.a().b(this);
        SparseArray sparseArray = this.f75227j;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        f fVar = f.f65854a;
        h.f.b.l.b(fVar, "");
        a aVar = fVar.f65855b;
        long j2 = 0;
        if (aVar != null) {
            Long l2 = aVar.f65815a;
            if (l2 != null) {
                j2 = l2.longValue();
            }
            bundle.putLong("ad_id", j2);
            bundle.putString("bundle_download_app_log_extra", aVar.f65816b);
            return bundle;
        }
        Aweme aweme = this.f75226e;
        if (aweme == null || !aweme.isAd()) {
            return bundle;
        }
        Aweme aweme2 = this.f75226e;
        if (aweme2 == null) {
            h.f.b.l.b();
        }
        AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
        if (awemeRawAd == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(awemeRawAd, "");
        Long creativeId = awemeRawAd.getCreativeId();
        if (creativeId == null || creativeId.longValue() != 0) {
            Long creativeId2 = awemeRawAd.getCreativeId();
            h.f.b.l.b(creativeId2, "");
            bundle.putLong("ad_id", creativeId2.longValue());
            bundle.putString("ad_type", awemeRawAd.getType());
            bundle.putInt("ad_system_origin", awemeRawAd.getSystemOrigin());
            bundle.putString("aweme_creative_id", String.valueOf(awemeRawAd.getCreativeId().longValue()));
            bundle.putString("bundle_download_app_log_extra", awemeRawAd.getLogExtra());
        }
        if (!TextUtils.isEmpty(awemeRawAd.getDownloadUrl())) {
            bundle.putString("bundle_download_url", awemeRawAd.getDownloadUrl());
        }
        return bundle;
    }

    @r(a = ThreadMode.MAIN)
    public final void top(com.ss.android.ugc.aweme.fe.method.j jVar) {
        boolean z;
        String c2;
        com.google.gson.l c3;
        CrossPlatformWebView crossPlatformWebView;
        h.f.b.l.d(jVar, "");
        com.google.gson.l a2 = q.a(jVar.f91311b.toString());
        h.f.b.l.b(a2, "");
        o j2 = a2.j();
        com.google.gson.l c4 = j2.c("data");
        String str = null;
        if (c4 == null || (c4 instanceof n) || (c3 = c4.j().c("reactId")) == null || (c3 instanceof n)) {
            z = false;
        } else {
            String c5 = c3.c();
            j jVar2 = this.f75223b;
            if (!(jVar2 == null || (crossPlatformWebView = jVar2.f75208a) == null)) {
                str = crossPlatformWebView.getReactId();
            }
            z = h.f.b.l.a((Object) c5, (Object) str);
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (valueOf.booleanValue()) {
            valueOf.booleanValue();
            com.google.gson.l c6 = j2.c("eventName");
            if (c6 != null && (c2 = c6.c()) != null) {
                if (h.f.b.l.a((Object) c2, (Object) "mp_tab_top_arrived") || h.f.b.l.a((Object) c2, (Object) "mp_tab_top_left")) {
                    int hashCode = c2.hashCode();
                    if (hashCode != -917484739) {
                        if (hashCode == -853202121 && c2.equals("mp_tab_top_left")) {
                            ((EnterpriseRecyclerView) c()).getEnterTabManager().f75228a = false;
                        }
                    } else if (c2.equals("mp_tab_top_arrived")) {
                        ((EnterpriseRecyclerView) c()).getEnterTabManager().f75228a = true;
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cs
    public final void a(String str, String str2) {
        super.a(str, str2);
        this.f75225d = str2;
        this.f75224c = str;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) c();
        h.f.b.l.b(recyclerView, "");
        getActivity();
        recyclerView.setLayoutManager(new EnterpriseTabFragment$onViewCreated$1(this));
        this.f75223b = new j(this, this.f75222a);
        RecyclerView recyclerView2 = (RecyclerView) c();
        h.f.b.l.b(recyclerView2, "");
        recyclerView2.setAdapter(this.f75223b);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.i(4935);
        h.f.b.l.d(layoutInflater, "");
        EventBus.a(EventBus.a(), this);
        e activity = getActivity();
        if (activity == null) {
            h.f.b.l.b();
        }
        View inflate = LayoutInflater.from(activity).inflate(R.layout.a0y, (ViewGroup) null);
        MethodCollector.o(4935);
        return inflate;
    }
}

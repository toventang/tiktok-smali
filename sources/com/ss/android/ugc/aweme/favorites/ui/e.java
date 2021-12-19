package com.ss.android.ugc.aweme.favorites.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.c;
import com.bytedance.hybrid.spark.page.c;
import com.bytedance.lynx.hybrid.a.h;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.experiment.cc;
import com.ss.android.ugc.aweme.experiment.hd;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class e extends com.bytedance.ies.foundation.fragment.a implements j, i, j {

    /* renamed from: j  reason: collision with root package name */
    public static final a f90863j = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public c f90864e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f90865f;

    /* renamed from: g  reason: collision with root package name */
    public h f90866g;

    /* renamed from: h  reason: collision with root package name */
    public long f90867h;

    /* renamed from: i  reason: collision with root package name */
    public int f90868i;

    /* renamed from: k  reason: collision with root package name */
    private ViewGroup f90869k;

    /* renamed from: l  reason: collision with root package name */
    private SparseArray f90870l;

    static {
        Covode.recordClassIndex(57116);
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final View a(int i2) {
        if (this.f90870l == null) {
            this.f90870l = new SparseArray();
        }
        View view = (View) this.f90870l.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f90870l.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final void br_() {
        SparseArray sparseArray = this.f90870l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(149, new g(e.class, "onChallengeCollectEvent", com.ss.android.ugc.aweme.challenge.d.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(34, new g(e.class, "onAntiCrawlerEvent", com.ss.android.ugc.aweme.base.d.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57117);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        c cVar = this.f90864e;
        if (cVar != null) {
            cVar.e();
        }
        EventBus a2 = EventBus.a();
        if (a2 != null && a2.a(this)) {
            a2.b(this);
        }
        br_();
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.favorites.ui.j
    public final void c() {
        Context context;
        MethodCollector.i(9452);
        if (this.f90864e != null || !this.f33898a || (context = getContext()) == null) {
            MethodCollector.o(9452);
            return;
        }
        l.b(context, "");
        SparkContext sparkContext = new SparkContext();
        String str = "aweme://lynxview/?hide_nav_bar=1&channel=discovery_hashtag_collect&bundle=demo%2Ftemplate%2Ftemplate.js&dynamic=1&group=discovery_hashtag_collect";
        if (!TextUtils.isEmpty(cc.a())) {
            str = str + "&surl=" + cc.a();
        }
        sparkContext.a(str);
        com.ss.android.ugc.aweme.hybridkit.b.a aVar = new com.ss.android.ugc.aweme.hybridkit.b.a();
        l.c(aVar, "");
        sparkContext.a(com.bytedance.hybrid.spark.a.h.class, aVar);
        sparkContext.a(new b(this));
        c b2 = c.a.a(context, sparkContext).b();
        SparkContext sparkContext2 = b2.getSparkContext();
        if (sparkContext2 != null) {
            b2.a(sparkContext2);
        }
        com.bytedance.ies.watcher.c.a("discovery_collect_hashtag_load_lynx");
        this.f90867h = System.currentTimeMillis();
        b2.c();
        ViewGroup viewGroup = this.f90869k;
        if (viewGroup == null) {
            l.a("challengeContainer");
        }
        viewGroup.addView(b2, new ViewGroup.LayoutParams(-1, -1));
        this.f90864e = b2;
        MethodCollector.o(9452);
    }

    public static final class b extends com.bytedance.hybrid.spark.a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f90871a;

        static {
            Covode.recordClassIndex(57118);
        }

        b(e eVar) {
            this.f90871a = eVar;
        }

        @Override // com.bytedance.lynx.hybrid.a.f
        public final void a(h hVar) {
            l.d(hVar, "");
            super.a(hVar);
            com.bytedance.ies.watcher.c.a("discovery_collect_hashtag_lynx_load_result", System.currentTimeMillis() - this.f90871a.f90867h);
            com.bytedance.ies.watcher.c.b("discovery_collect_hashtag_load_lynx");
            System.currentTimeMillis();
            this.f90871a.f90866g = hVar;
            this.f90871a.f90865f = true;
            if (hd.f90206c) {
                com.bytedance.ies.watcher.c.a("discovery_collect_hashtag_lynx_load_result_retry", (long) this.f90871a.f90868i);
            }
        }

        @Override // com.bytedance.lynx.hybrid.a.f
        public final void b(h hVar, String str) {
            l.d(hVar, "");
            l.d(str, "");
            super.b(hVar, str);
            com.bytedance.ies.watcher.c.a("discovery_collect_hashtag_lynx_load_result", -1);
            if (!hd.f90206c) {
                return;
            }
            if (this.f90871a.f90868i < 3) {
                this.f90871a.f90868i++;
                com.bytedance.hybrid.spark.page.c cVar = this.f90871a.f90864e;
                if (cVar != null) {
                    cVar.c();
                    return;
                }
                return;
            }
            com.bytedance.ies.watcher.c.a("discovery_collect_hashtag_lynx_load_result_retry", -1);
        }
    }

    @r
    public final void onAntiCrawlerEvent(com.ss.android.ugc.aweme.base.d.a aVar) {
        String str;
        h kitView;
        if (aVar != null && (str = aVar.f68097a) != null && p.a((CharSequence) str, (CharSequence) "/aweme/v1/challenge/listcollection/?", false)) {
            EventBus.a().d(aVar);
            com.bytedance.hybrid.spark.page.c cVar = this.f90864e;
            if (cVar != null && (kitView = cVar.getKitView()) != null) {
                kitView.a("AntiCrawlerEvent", null);
            }
        }
    }

    @r
    public final void onChallengeCollectEvent(com.ss.android.ugc.aweme.challenge.d.a aVar) {
        com.bytedance.hybrid.spark.page.c cVar;
        h kitView;
        h kitView2;
        l.d(aVar, "");
        if (this.f33898a) {
            Challenge challenge = aVar.f69918a;
            if (challenge.getCollectStatus() == 0) {
                com.bytedance.hybrid.spark.page.c cVar2 = this.f90864e;
                if (cVar2 != null && (kitView2 = cVar2.getKitView()) != null) {
                    ArrayList arrayList = new ArrayList();
                    String cid = challenge.getCid();
                    l.b(cid, "");
                    arrayList.add(cid);
                    kitView2.a("UnChallengeCollect", arrayList);
                }
            } else if (challenge.getCollectStatus() == 1 && (cVar = this.f90864e) != null && (kitView = cVar.getKitView()) != null) {
                ArrayList arrayList2 = new ArrayList();
                String cid2 = challenge.getCid();
                l.b(cid2, "");
                arrayList2.add(cid2);
                kitView.a("onChallengeCollect", arrayList2);
            }
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        EventBus a2 = EventBus.a();
        if (a2 != null && !a2.a(this)) {
            EventBus.a(a2, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.zs, viewGroup, false);
        View findViewById = a2.findViewById(R.id.a43);
        l.b(findViewById, "");
        this.f90869k = (ViewGroup) findViewById;
        return a2;
    }
}

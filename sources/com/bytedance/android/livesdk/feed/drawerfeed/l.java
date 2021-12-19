package com.bytedance.android.livesdk.feed.drawerfeed;

import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.a.b;
import com.bytedance.android.live.core.e.b;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.performance.b;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.d;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout;
import com.bytedance.android.livesdk.feed.LiveDrawerSettings;
import com.bytedance.android.livesdk.feed.a.d;
import com.bytedance.android.livesdk.feed.f.a;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.livesetting.other.LiveFeedPreloadSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.p;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.android.livesdkapi.g.c;
import com.bytedance.android.livesdkapi.view.TextureViewWrapper;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;

public class l extends a {
    private static final String u = l.class.getCanonicalName();
    private boolean A = false;

    /* renamed from: a  reason: collision with root package name */
    protected View f17406a;

    /* renamed from: b  reason: collision with root package name */
    protected TextureViewWrapper f17407b;

    /* renamed from: c  reason: collision with root package name */
    a f17408c;

    /* renamed from: d  reason: collision with root package name */
    g f17409d;

    /* renamed from: e  reason: collision with root package name */
    b<FeedDataKey, FeedItem> f17410e;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.android.livesdkapi.g.b f17411f;
    private GridLayoutManager v;
    private final Map<Long, FeedDataKey> w = new HashMap();
    private String x = "";
    private final String y = "";
    private final boolean z = true;

    @Override // com.bytedance.android.livesdk.feed.f.a
    public final com.bytedance.android.livesdk.feed.a.a g() {
        return this.f17408c;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void k() {
        p();
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.bytedance.android.livesdk.ui.a, com.bytedance.android.livesdk.feed.f.a, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // com.bytedance.android.livesdk.ui.a, com.bytedance.android.livesdk.feed.f.a, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    static {
        Covode.recordClassIndex(9649);
    }

    private static boolean q() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.livesdk.feed.f.a, com.bytedance.android.livesdk.feed.i
    public final String a() {
        if (!m.a(this.x)) {
            return this.x;
        }
        return super.a();
    }

    @Override // com.bytedance.android.livesdk.feed.f.a, com.bytedance.android.livesdk.feed.i
    public final String b() {
        if (!m.a("")) {
            return "";
        }
        return super.b();
    }

    @Override // com.bytedance.android.livesdk.feed.f.a
    public final int e() {
        if (f()) {
            return 2;
        }
        return 1;
    }

    @Override // com.bytedance.android.livesdk.feed.f.a
    public final long h() {
        if (t != null) {
            return t.getId();
        }
        return 1;
    }

    public static boolean f() {
        if (t == null || t.getStyle() == 2 || t.getStyle() == 3) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.feed.f.a, com.bytedance.android.livesdk.feed.i
    public final int c() {
        int i2;
        p value = LiveFeedPreloadSetting.INSTANCE.getValue();
        if (value != null) {
            if (f()) {
                i2 = (value.f19738b - 1) * 2;
            } else {
                i2 = value.f19737a;
            }
            if (i2 > 1) {
                return i2;
            }
        }
        return super.c();
    }

    @Override // com.bytedance.android.livesdk.feed.f.a
    public final RecyclerView.i i() {
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        gridLayoutManager.a(new GridLayoutManager.c() {
            /* class com.bytedance.android.livesdk.feed.drawerfeed.l.AnonymousClass1 */

            static {
                Covode.recordClassIndex(9650);
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public final int a(int i2) {
                if (l.this.f17408c.getItemViewType(i2) == R.layout.b_k) {
                    return 1;
                }
                return 2;
            }
        });
        return gridLayoutManager;
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        for (FeedDataKey feedDataKey : this.w.values()) {
            b<FeedDataKey, FeedItem> bVar = this.f17410e;
            if (bVar != null) {
                bVar.d(feedDataKey);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.feed.f.a
    public final void j() {
        super.j();
        if (this.v != null && this.f17438k != null) {
            this.f17438k.x = this.v.l();
            View c2 = this.v.c(this.f17438k.x);
            if (c2 != null) {
                this.f17438k.y = c2.getTop();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.feed.f.a
    public final TabFeedViewModel d() {
        String str;
        String str2;
        e activity = getActivity();
        com.bytedance.android.livesdk.feed.e eVar = this.f17434g;
        eVar.f17422a = h();
        eVar.f17423b = this;
        this.f17438k = (TabFeedViewModel) ae.a(activity, eVar).a(TabFeedViewModel.class);
        this.f17438k.h();
        TabFeedViewModel tabFeedViewModel = this.f17438k;
        if (tabFeedViewModel.z == null) {
            tabFeedViewModel.z = new com.bytedance.android.livesdk.feed.viewmodel.l(tabFeedViewModel);
            tabFeedViewModel.A = new com.bytedance.android.livesdk.feed.viewmodel.m(tabFeedViewModel);
            tabFeedViewModel.f17697a.d().a(tabFeedViewModel.z);
            tabFeedViewModel.f17697a.d().a(tabFeedViewModel.A);
        }
        this.f17438k.C = this.x;
        String str3 = "";
        if (m.a("homepage_hot", d.a().e())) {
            str = "enter_auto_foru_feed_from_room";
            str2 = "foru_";
        } else {
            str = "enter_auto_from_room";
            str2 = str3;
        }
        if (m.a("referral_task", d.a().e())) {
            str = "enter_auto_referrals_from_room";
            str2 = str3;
        }
        if (d.a() != null) {
            d.a().b();
            d.a().c();
        }
        if (LiveDrawerSettings.INSTANCE.getValue().getEnableFullEntrance()) {
            str = "drawer_enter_from_room";
            str2 = str3;
        }
        TabFeedViewModel tabFeedViewModel2 = this.f17438k;
        tabFeedViewModel2.B = !m.a(str);
        tabFeedViewModel2.f17697a.b(str);
        this.f17438k.f9212c.observe(this, new q(this));
        String d2 = d.a().d();
        if (!TextUtils.isEmpty(d2)) {
            str3 = d2 + "_";
        }
        String str4 = str3 + str2 + "feed_refresh";
        if (m.a("referral_task", d.a().e())) {
            str4 = "referrals_refresh";
        }
        if (LiveDrawerSettings.INSTANCE.getValue().getEnableFullEntrance()) {
            str4 = "drawer_refresh";
        }
        this.f17437j.setOnRefreshListener(new r(this, str4));
        return this.f17438k;
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f17408c.notifyDataSetChanged();
    }

    @Override // com.bytedance.android.livesdk.feed.f.a, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z2) {
        super.setUserVisibleHint(z2);
        if (!z2) {
            j();
        } else {
            m();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Integer num) {
        if (num != null) {
            RecyclerView.ViewHolder f2 = this.f17435h.f(num.intValue());
            if (f2 instanceof com.bytedance.android.livesdk.feed.i.a) {
                this.f17435h.postDelayed(new s(this, f2), 500);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f17409d = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayController();
    }

    @Override // com.bytedance.android.livesdk.feed.f.a
    public final d.a a(d.a aVar) {
        d.a aVar2 = new d.a();
        aVar2.f17250g = getActivity();
        aVar2.f17246c = this.f17438k;
        aVar2.f17245b = this.f17435h;
        aVar2.f17253j = new n(this);
        aVar2.f17244a = this.f17408c;
        aVar2.f17247d = i();
        aVar2.f17249f = n();
        aVar2.f17251h = false;
        aVar2.f17248e = e();
        aVar2.f17252i = this;
        return aVar2;
    }

    @Override // com.bytedance.android.livesdk.feed.f.a
    public final void a(View view) {
        super.a(view);
        this.f17406a = view.findViewById(R.id.efc);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f17406a.setBackgroundResource(R.drawable.bxx);
        }
        this.f17407b = (TextureViewWrapper) view.findViewById(R.id.efa);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(com.bytedance.android.live.core.e.b bVar) {
        boolean z2;
        com.bytedance.android.livesdkapi.g.b bVar2;
        BannerSwipeRefreshLayout bannerSwipeRefreshLayout = this.f17437j;
        if (bVar == null || !bVar.a() || !this.A) {
            z2 = false;
        } else {
            z2 = true;
        }
        bannerSwipeRefreshLayout.setRefreshing(z2);
        this.A = true;
        if (bVar.f9012a != b.a.RUNNING && (bVar2 = this.f17411f) != null) {
            bVar2.c();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, com.bytedance.android.livesdk.feed.f.a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        com.bytedance.android.live.core.performance.b.b(b.a.LiveFeedInit);
        com.bytedance.android.livesdk.chatroom.d a2 = com.bytedance.android.livesdk.chatroom.d.a();
        String str = null;
        if (a2.f15171a && a2.f15172b != null) {
            d.a aVar = a2.f15172b;
            if (aVar.f15178d != null) {
                str = aVar.f15178d.f18679b;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            this.x = str;
        }
        super.onCreate(bundle);
        e eVar = new e(this);
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf((int) R.layout.b_k), new f(eVar.f17392f, eVar.f17388b, eVar.f17389c, eVar.f17390d));
        hashMap.put(Integer.valueOf((int) R.layout.bem), new h(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0051: INVOKE  
              (r6v0 'hashMap' java.util.HashMap)
              (wrap: java.lang.Integer : 0x0043: INVOKE  (r2v3 java.lang.Integer) = (wrap: int : ?: CAST (int) (wrap: ?? : ?: SGET   com.zhiliaoapp.musically.R.layout.bem int)) type: STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer)
              (wrap: com.bytedance.android.livesdk.feed.drawerfeed.h : 0x004e: CONSTRUCTOR  (r0v6 com.bytedance.android.livesdk.feed.drawerfeed.h) = 
              (wrap: com.bytedance.android.livesdk.feed.drawerfeed.e$1 : 0x0049: CONSTRUCTOR  (r1v2 com.bytedance.android.livesdk.feed.drawerfeed.e$1) = (r8v0 'eVar' com.bytedance.android.livesdk.feed.drawerfeed.e) call: com.bytedance.android.livesdk.feed.drawerfeed.e.1.<init>(com.bytedance.android.livesdk.feed.drawerfeed.e):void type: CONSTRUCTOR)
             call: com.bytedance.android.livesdk.feed.drawerfeed.h.<init>(com.bytedance.android.livesdk.feed.p):void type: CONSTRUCTOR)
             type: INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object in method: com.bytedance.android.livesdk.feed.drawerfeed.l.onCreate(android.os.Bundle):void, file: classes6.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004e: CONSTRUCTOR  (r0v6 com.bytedance.android.livesdk.feed.drawerfeed.h) = 
              (wrap: com.bytedance.android.livesdk.feed.drawerfeed.e$1 : 0x0049: CONSTRUCTOR  (r1v2 com.bytedance.android.livesdk.feed.drawerfeed.e$1) = (r8v0 'eVar' com.bytedance.android.livesdk.feed.drawerfeed.e) call: com.bytedance.android.livesdk.feed.drawerfeed.e.1.<init>(com.bytedance.android.livesdk.feed.drawerfeed.e):void type: CONSTRUCTOR)
             call: com.bytedance.android.livesdk.feed.drawerfeed.h.<init>(com.bytedance.android.livesdk.feed.p):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.feed.drawerfeed.l.onCreate(android.os.Bundle):void, file: classes6.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0049: CONSTRUCTOR  (r1v2 com.bytedance.android.livesdk.feed.drawerfeed.e$1) = (r8v0 'eVar' com.bytedance.android.livesdk.feed.drawerfeed.e) call: com.bytedance.android.livesdk.feed.drawerfeed.e.1.<init>(com.bytedance.android.livesdk.feed.drawerfeed.e):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.feed.drawerfeed.l.onCreate(android.os.Bundle):void, file: classes6.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:663)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.feed.drawerfeed.e, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 26 more
            */
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.drawerfeed.l.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(BaseFeedRepository.a aVar) {
        if (aVar == BaseFeedRepository.a.SUCCESS) {
            if (this.f17438k != null && this.f17438k.x > 0 && this.f17408c.getItemCount() > this.f17438k.x) {
                int i2 = this.f17438k.y;
                if (i2 > y.a(3.0f)) {
                    i2 -= y.a(3.0f);
                }
                this.v.a(this.f17438k.x, i2);
            }
            this.f17438k.y = 0;
            this.f17438k.x = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str) {
        b.a.a("livesdk_explore_refresh").a("has_banner", com.bytedance.android.b.a.a.f6785g.c()).a(this.s).b();
        this.f17438k.a(str);
        getContext();
        if (!j.f107226e || !j.b() || j.c()) {
            j.f107226e = q();
        }
        if (!j.f107226e) {
            ao.a(getContext(), (int) R.string.go2);
        }
        com.bytedance.android.live.core.f.a.g.a().f9045a.clear();
    }

    @Override // com.bytedance.android.livesdk.ui.a, com.bytedance.android.livesdk.feed.f.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f17436i.f17232c.f17698i.observe(this, new o(this));
        this.v = (GridLayoutManager) this.f17435h.getLayoutManager();
        getString(R.string.gnw);
        if (getActivity() != null && (getActivity() instanceof c)) {
            getActivity();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "tab_click");
        b.a.a("live_enter").a((Map<String, String>) hashMap).b();
        this.f17438k.n.observe(this, new p(this));
    }

    @Override // com.bytedance.android.livesdk.feed.f.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.n = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f17435h.setBackgroundColor(getContext().getResources().getColor(R.color.x_));
        return this.n;
    }
}

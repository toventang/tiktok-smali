package com.ss.android.ugc.aweme.challenge.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.detail.DetailViewModel;
import com.ss.android.ugc.aweme.detail.k;
import com.ss.android.ugc.aweme.detail.l;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.experiment.q;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.n.o;
import com.ss.android.ugc.aweme.feed.x.ae;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.metrics.al;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.utils.da;
import com.ss.android.ugc.aweme.utils.gc;
import com.ss.android.ugc.aweme.views.FpsRecyclerView;
import com.ss.android.ugc.aweme.views.SpannedGridLayoutManager;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.aweme.views.m;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
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

public class s extends a implements com.ss.android.ugc.aweme.challenge.d, h.a, com.ss.android.ugc.aweme.common.e.d, com.ss.android.ugc.aweme.detail.h, o, o, i, j {
    public boolean A;
    public SparseArray<com.ss.android.ugc.aweme.challenge.a.b> B = new SparseArray<>();
    public SparseBooleanArray C = new SparseBooleanArray();
    public SparseBooleanArray D = new SparseBooleanArray();
    public SparseArray<DmtStatusView> E = new SparseArray<>();
    public w F;
    public b G;
    public SpannedGridLayoutManager.b H;
    private String I;
    private String J;
    private String K;
    private r L;
    private DetailViewModel M;
    private com.ss.android.ugc.aweme.common.d.a N;
    private String O;
    private SparseArray<com.ss.android.ugc.aweme.common.e.b> P = new SparseArray<>();

    /* renamed from: a  reason: collision with root package name */
    public int f70202a;

    /* renamed from: b  reason: collision with root package name */
    public String f70203b;

    /* renamed from: c  reason: collision with root package name */
    public String f70204c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.common.e.b f70205d;

    /* renamed from: e  reason: collision with root package name */
    protected String f70206e;

    /* renamed from: j  reason: collision with root package name */
    protected String f70207j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f70208k;

    /* renamed from: l  reason: collision with root package name */
    public String f70209l;

    /* renamed from: m  reason: collision with root package name */
    public float f70210m;
    public RecyclerView n;
    protected DmtStatusView o;
    FrameLayout p;
    public DmtStatusView q;
    protected com.ss.android.ugc.aweme.challenge.a.b r;
    public a s;
    public int t;
    public k u;
    public l v;
    public boolean w;
    Challenge y;
    public boolean z;

    public interface a {
        static {
            Covode.recordClassIndex(43308);
        }

        boolean b(int i2);
    }

    public interface b extends Serializable {
        static {
            Covode.recordClassIndex(43309);
        }

        c getJumpToVideoParam(c cVar, Aweme aweme);

        com.ss.android.ugc.aweme.common.e.b getPresenter(int i2, e eVar);

        com.ss.android.ugc.aweme.challenge.a.c onCreateDetailAwemeViewHolder(View view, String str, com.ss.android.ugc.aweme.challenge.d dVar);

        void onJumpToDetail(String str);

        boolean sendCustomRequest(com.ss.android.ugc.aweme.common.e.b bVar, int i2);
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public String f70216a = "";

        /* renamed from: b  reason: collision with root package name */
        public String f70217b = "";

        /* renamed from: c  reason: collision with root package name */
        public String f70218c = "";

        /* renamed from: d  reason: collision with root package name */
        public String f70219d = "";

        /* renamed from: e  reason: collision with root package name */
        public String f70220e = "";

        /* renamed from: f  reason: collision with root package name */
        public int f70221f;

        static {
            Covode.recordClassIndex(43310);
        }
    }

    public static abstract class d implements b {
        static {
            Covode.recordClassIndex(43311);
        }

        public int getDetailAwemeViewType(int i2, Aweme aweme) {
            return 0;
        }

        public abstract com.ss.android.ugc.aweme.challenge.a.a onCreateDetailAwemeViewHolder(ViewGroup viewGroup, int i2, String str, com.ss.android.ugc.aweme.challenge.d dVar);

        @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
        public com.ss.android.ugc.aweme.challenge.a.c onCreateDetailAwemeViewHolder(View view, String str, com.ss.android.ugc.aweme.challenge.d dVar) {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
        public void onJumpToDetail(String str) {
        }
    }

    static {
        Covode.recordClassIndex(43304);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.e.d
    public final void a(List list, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.d
    public final boolean a(com.ss.android.ugc.aweme.common.e.i iVar) {
        return false;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(33, new g(s.class, "onDynamicEvent", com.ss.android.ugc.aweme.challenge.d.b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(2, new g(s.class, "onVideoEvent", ag.class, ThreadMode.POSTING, 0, false));
        hashMap.put(34, new g(s.class, "onAntiCrawlerEvent", com.ss.android.ugc.aweme.base.d.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(35, new g(s.class, "onBlockUserEvent", com.ss.android.ugc.aweme.profile.b.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(36, new g(s.class, "onFollowStatusUpdate", FollowStatusEvent.class, ThreadMode.POSTING, 0, false));
        hashMap.put(37, new g(s.class, "onReceiveVideoEvent", ag.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final void aS_() {
        l();
    }

    @Override // com.ss.android.ugc.aweme.detail.h, com.ss.android.ugc.aweme.common.widget.scrollablelayout.a.AbstractC1744a
    public final View m() {
        return this.n;
    }

    @Override // com.ss.android.ugc.aweme.detail.h
    public final void a(boolean z2, boolean z3) {
        if (ab_()) {
            l lVar = this.v;
            boolean z4 = true;
            if (lVar != null) {
                lVar.a(true);
            }
            if (this.o.getVisibility() != 0 && !d()) {
                z4 = false;
            }
            a(z2, z4, z3);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final void a(boolean z2) {
        com.ss.android.ugc.aweme.challenge.a.b bVar = this.r;
        if (!z2) {
            bVar.a((h.a) null);
            bVar.d(false);
        }
    }

    public void a(com.ss.android.ugc.aweme.common.a.e eVar) {
        com.ss.android.ugc.aweme.challenge.a.b bVar;
        int indexOf;
        String o2 = o();
        com.ss.android.ugc.aweme.common.a.a aVar = (com.ss.android.ugc.aweme.common.a.a) eVar;
        if (aVar != null && aVar.f76353m != null && TextUtils.equals("challenge", o2) && aVar.f76353m != null && (bVar = this.r) != null && ((com.ss.android.ugc.aweme.common.a.d) bVar).f76354l != null && (indexOf = ((com.ss.android.ugc.aweme.common.a.d) this.r).f76354l.indexOf(aVar.f76353m)) >= 0) {
            if (!q.a()) {
                al alVar = new al();
                if (o2 == null) {
                    o2 = "";
                }
                al a2 = alVar.a(o2);
                a2.f109496d = String.valueOf(indexOf);
                a2.f109495c = this.f70206e;
                a2.f109497e = this.f70204c;
                a2.p = this.L.parentTagId;
                a2.c((Aweme) aVar.f76353m, this.f70202a).f();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", "challenge");
            hashMap.put("tag_id", this.f70204c);
            hashMap.put("process_id", this.f70206e);
            hashMap.put("order", String.valueOf(indexOf));
            hashMap.put("group_id", ((Aweme) aVar.f76353m).getAid());
            hashMap.put("parent_tag_id", this.L.parentTagId);
            com.ss.android.ugc.aweme.common.q.a("tag_show_video", hashMap);
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.d
    public final void a(View view, Aweme aweme, String str) {
        int indexOf;
        com.ss.android.ugc.aweme.challenge.a.b bVar;
        if (!(com.ss.android.ugc.aweme.l.a.a.a(view, 1200) || aweme == null || getActivity() == null)) {
            c cVar = new c();
            if ("share_from_resso".equals(this.I)) {
                cVar.f70218c = "share_from_resso";
            } else {
                cVar.f70218c = str;
            }
            if (!(!TextUtils.equals("challenge", o()) || (bVar = this.r) == null || ((com.ss.android.ugc.aweme.common.a.d) bVar).f76354l == null)) {
                int indexOf2 = ((com.ss.android.ugc.aweme.common.a.d) this.r).f76354l.indexOf(aweme);
                if (indexOf2 >= 0) {
                    cVar.f70221f = indexOf2;
                }
                cVar.f70220e = this.f70206e;
                cVar.f70219d = this.f70204c;
            }
            if (TextUtils.equals("single_song", o())) {
                cVar.f70220e = this.f70206e;
                com.ss.android.ugc.aweme.challenge.a.b bVar2 = this.r;
                if (!(bVar2 == null || ((com.ss.android.ugc.aweme.common.a.d) bVar2).f76354l == null || (indexOf = ((com.ss.android.ugc.aweme.common.a.d) this.r).f76354l.indexOf(aweme)) < 0)) {
                    cVar.f70221f = indexOf + 1;
                }
            }
            c jumpToVideoParam = this.G.getJumpToVideoParam(cVar, aweme);
            if (this.f70205d.f76396h != null) {
                List<Aweme> items = ((com.ss.android.ugc.aweme.common.e.a) this.f70205d.f76396h).getItems();
                if (items != null) {
                    for (Aweme aweme2 : items) {
                        if (aweme2 != null) {
                            aweme2.setFromRawChallenge(this.y);
                        }
                    }
                    ((com.ss.android.ugc.aweme.common.e.a) this.f70205d.f76396h).setItems(items);
                }
                ae.f95296a = (com.ss.android.ugc.aweme.common.e.a) this.f70205d.f76396h;
            }
            SmartRoute a2 = a(aweme, jumpToVideoParam);
            boolean a3 = com.bytedance.ies.abmock.b.a().a(true, "enable_reuse_external_image", false);
            if (view != null && a3) {
                a2.withBundleAnimation(androidx.core.app.b.b(view, view.getWidth(), view.getHeight()).a());
                a2.withParam("activity_has_activity_options", true);
            }
            this.G.onJumpToDetail(aweme.getAid());
            if (MSAdaptionService.c().c(getContext())) {
                a2.open();
            } else {
                a2.open(10086);
            }
            com.ss.android.ugc.aweme.feed.d.b.a(aweme);
        }
    }

    private void t() {
        com.ss.android.ugc.aweme.common.d.a aVar = this.N;
        if (aVar != null) {
            aVar.a();
        }
    }

    private void u() {
        this.t = this.f70202a;
    }

    @Override // com.ss.android.ugc.aweme.detail.h
    public void j() {
        a(false, false);
    }

    private static boolean r() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final boolean bi_() {
        return this.D.get(this.f70202a, true);
    }

    @Override // com.ss.android.ugc.aweme.detail.h
    public final boolean d() {
        return this.C.get(this.f70202a, true);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getUserVisibleHint()) {
            b(false, true);
        }
    }

    public final List<Aweme> p() {
        com.ss.android.ugc.aweme.challenge.a.b bVar = this.r;
        if (bVar != null) {
            return ((com.ss.android.ugc.aweme.common.a.d) bVar).f76354l;
        }
        return null;
    }

    private static boolean s() {
        if (com.ss.android.ugc.aweme.lancet.j.f107229h && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107229h;
        }
        boolean r2 = r();
        com.ss.android.ugc.aweme.lancet.j.f107229h = r2;
        return r2;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.a
    public final String b() {
        try {
            T t2 = this.f70205d.f76396h;
            if (t2 instanceof com.ss.android.ugc.aweme.app.api.d) {
                return ((com.ss.android.ugc.aweme.app.api.d) t2).getRequestId();
            }
            return "";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public final void e() {
        DmtStatusView dmtStatusView = this.q;
        if (dmtStatusView != null && dmtStatusView.j()) {
            this.q.d();
        }
        w wVar = this.F;
        if (wVar != null) {
            wVar.bU_();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.h
    public final void n() {
        if (ab_() && this.n.getChildCount() > 0) {
            this.n.d(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        com.ss.android.ugc.aweme.common.e.b bVar = this.f70205d;
        if (bVar != null) {
            bVar.cd_();
        }
        if (this.q != null) {
            this.q = null;
        }
        t();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (getUserVisibleHint()) {
            t();
        }
        try {
            q();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onStop() {
        try {
            q();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
        }
        super.onStop();
        if (getUserVisibleHint()) {
            t();
        }
    }

    private void q() {
        RecyclerView.ViewHolder a2;
        if (this.n != null && ab_()) {
            int childCount = this.n.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.n.getChildAt(i2);
                if (!(childAt == null || (a2 = this.n.a(childAt)) == null || a2.getItemViewType() != 0)) {
                    ((com.ss.android.ugc.aweme.common.a.g) a2).al_();
                }
            }
        }
    }

    public void g() {
        TuxTextView a2 = a(R.string.cyv);
        a2.setOnClickListener(new u(this));
        this.o.setBuilder(DmtStatusView.a.a(getContext()).b(a(R.string.bnt)).c(a2));
    }

    @Override // com.ss.android.ugc.aweme.detail.h
    public final void k() {
        if (ab_()) {
            if (getUserVisibleHint()) {
                getContext();
                if (com.ss.android.ugc.aweme.setting.o.a()) {
                    getActivity();
                    if (s()) {
                        b(false, false);
                        return;
                    }
                }
            }
            t();
        }
    }

    public final String o() {
        int i2 = this.f70202a;
        if (i2 == 0 || i2 == 1) {
            return "single_song";
        }
        if (i2 == 2 || i2 == 3) {
            return "challenge";
        }
        if (i2 == 15) {
            return "prop_page";
        }
        if (i2 == 20) {
            return "mv_page";
        }
        switch (i2) {
            case 28:
            case 29:
            case 30:
            case 31:
                return "question";
            default:
                return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.a
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        String str = "";
        try {
            T t2 = this.f70205d.f76396h;
            if (t2 instanceof com.ss.android.ugc.aweme.app.api.d) {
                str = ((com.ss.android.ugc.aweme.app.api.d) t2).getRequestId();
            }
            jSONObject.put("request_id", str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    public final void l() {
        u();
        if (this.f70205d != null && !TextUtils.isEmpty(this.f70204c)) {
            b bVar = this.G;
            if (bVar != null && bVar.sendCustomRequest(this.f70205d, 4)) {
                return;
            }
            if (!this.f70208k || TextUtils.isEmpty(this.O)) {
                this.f70205d.a(4, this.f70204c, Integer.valueOf(this.t), false);
            } else {
                this.f70205d.a(4, this.O, Integer.valueOf(this.t), true);
            }
        }
        l lVar = this.v;
        if (lVar != null) {
            lVar.a(false);
        }
    }

    @r
    public void onBlockUserEvent(com.ss.android.ugc.aweme.profile.b.a aVar) {
        j();
    }

    @Override // com.ss.android.ugc.aweme.detail.h
    public final void b(boolean z2) {
        this.C.put(this.f70202a, z2);
    }

    @Override // com.ss.android.ugc.aweme.detail.h
    public final void a(String str) {
        this.f70204c = str;
        this.f70208k = false;
    }

    @r
    public void onDynamicEvent(com.ss.android.ugc.aweme.challenge.d.b bVar) {
        if (bVar.f69919a == 0) {
            b(true, false);
        } else {
            t();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            bundle.putSerializable("provider", this.G);
        }
    }

    /* access modifiers changed from: protected */
    public final TuxTextView a(int i2) {
        TuxTextView tuxTextView = new TuxTextView(getContext());
        tuxTextView.setTuxFont(51);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColorRes(R.attr.bj);
        tuxTextView.setText(i2);
        return tuxTextView;
    }

    @r
    public void onAntiCrawlerEvent(com.ss.android.ugc.aweme.base.d.a aVar) {
        String str = aVar.f68097a;
        if (str == null) {
            return;
        }
        if (str.contains("/aweme/v1/challenge/aweme/?") || str.contains("/aweme/v1/music/fresh/aweme/?")) {
            EventBus.a().d(aVar);
            j();
        }
    }

    @r
    public void onFollowStatusUpdate(FollowStatusEvent followStatusEvent) {
        com.ss.android.ugc.aweme.challenge.a.b bVar;
        FollowStatus followStatus = followStatusEvent.status;
        if (ab_() && (bVar = this.r) != null) {
            bVar.a(followStatus);
        }
    }

    @r
    public void onVideoEvent(ag agVar) {
        if (agVar.f93450a == 2) {
            this.f70205d.a(AwemeService.b().b((String) agVar.f93451b));
        }
    }

    public static List<Aweme> a(List<Aweme> list) {
        ArrayList arrayList = new ArrayList();
        if (com.bytedance.common.utility.collection.b.a((Collection) list)) {
            return arrayList;
        }
        for (Aweme aweme : list) {
            if (aweme != null && !aweme.isAd()) {
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.common.e.d
    public final void b(int i2) {
        if (ab_()) {
            this.r.notifyItemRemoved(i2);
            if (this.r.c() == 0) {
                this.o.setVisibility(0);
                this.o.g();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z2) {
        super.setUserVisibleHint(z2);
        if (z2) {
            com.ss.android.ugc.aweme.challenge.a.b bVar = this.r;
            if (!(!ab_() || this.n == null || this.r == null || bVar.f69871d)) {
                bVar.f69871d = true;
                int childCount = this.n.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    RecyclerView.ViewHolder f2 = this.n.f(i2);
                    if (f2 instanceof com.ss.android.ugc.aweme.challenge.a.a) {
                        com.ss.android.ugc.aweme.challenge.a.a aVar = (com.ss.android.ugc.aweme.challenge.a.a) f2;
                        aVar.a();
                        a((com.ss.android.ugc.aweme.common.a.e) aVar);
                    }
                }
            }
        }
    }

    @r
    public void onReceiveVideoEvent(ag agVar) {
        int indexOf;
        if (com.ss.android.ugc.aweme.detail.e.a() && agVar.f93450a == 21) {
            Object obj = agVar.f93451b;
            if ((obj instanceof Aweme) && (indexOf = ((com.ss.android.ugc.aweme.common.a.d) this.r).f76354l.indexOf(obj)) >= 0) {
                View c2 = this.n.getLayoutManager().c(indexOf);
                if (c2 != null) {
                    int[] iArr = new int[2];
                    c2.getLocationOnScreen(iArr);
                    int b2 = n.b(com.bytedance.ies.ugc.appcontext.d.a()) - iArr[1];
                    if (c2.getHeight() > 0 && (((float) b2) * 1.0f) / ((float) c2.getHeight()) > 0.4f) {
                        return;
                    }
                }
                this.M.f79590b.setValue(true);
                ((m) this.n.getLayoutManager()).a(indexOf, 0);
            }
        }
    }

    public void a(Bundle bundle) {
        if (bundle != null) {
            this.f70202a = bundle.getInt("detail_aweme_list_type", 0);
            this.f70203b = bundle.getString("event_label", "");
            this.f70204c = bundle.getString("detail_id", "");
            r rVar = (r) bundle.getSerializable("detail_config");
            this.L = rVar;
            if (rVar == null) {
                this.L = new r(null);
            }
            this.I = bundle.getString("detail_aweme_from", "");
            this.J = bundle.getString("detail_aweme_from_aid", "");
            this.K = bundle.getString("detail_aweme_previous_page_position", "");
            this.f70206e = bundle.getString("process_id", "");
            this.f70207j = bundle.getString("group_id", "");
            this.f70208k = bundle.getBoolean("extra_challenge_is_hashtag", false);
            this.O = bundle.getString("extra_challenge_hashtag_name", "");
            this.f70209l = bundle.getString("top_aweme_ids", "");
        }
    }

    public final void b(boolean z2, boolean z3) {
        com.ss.android.ugc.aweme.common.d.a aVar = this.N;
        if (aVar != null) {
            aVar.a(z2, z3);
        }
    }

    public SmartRoute a(Aweme aweme, c cVar) {
        String str;
        if (MSAdaptionService.c().c(getContext())) {
            str = "//duo";
        } else {
            str = "aweme://aweme/detail/";
        }
        String str2 = "";
        SmartRoute withParam = SmartRouter.buildRoute(getActivity(), str).withParam("id", aweme.getAid()).withParam("refer", cVar.f70218c).withParam("previous_page", this.I).withParam("extra_previous_page_position", this.K).withParam("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", str2).withParam("video_from", cVar.f70216a);
        int i2 = this.f70202a;
        if (i2 == 3 || i2 == 2) {
            str2 = this.I;
        }
        return withParam.withParam("video_challenge_profile_from", str2).withParam("video_type", this.f70202a).withParam("profile_enterprise_type", aweme.getEnterpriseType()).withParam("process_id", this.f70206e).withParam("duo_type", "duo_detail").withParam("extra_parent_tag_id", this.L.parentTagId).withParam(cVar.f70217b, this.f70204c).withParam("from_group_id", this.J);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        RecyclerView.i spannedGridLayoutManager;
        boolean z2;
        MethodCollector.i(11039);
        this.n = (RecyclerView) view.findViewById(R.id.b1g);
        this.o = (DmtStatusView) view.findViewById(R.id.e_o);
        this.p = (FrameLayout) view.findViewById(R.id.e_r);
        super.onViewCreated(view, bundle);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.o.getLayoutParams();
        layoutParams.topMargin = com.ss.android.ugc.aweme.framework.d.b.a(getContext(), 80.0f);
        this.o.setLayoutParams(layoutParams);
        if (this.G == null && bundle != null) {
            Serializable serializable = bundle.getSerializable("provider");
            if (serializable instanceof b) {
                this.G = (b) serializable;
            }
        }
        z zVar = null;
        if (com.ss.android.ugc.aweme.detail.e.a()) {
            this.n.setItemAnimator(null);
        }
        g();
        if (this.H == null) {
            getActivity();
            spannedGridLayoutManager = new WrapGridLayoutManager(3, 1);
        } else {
            spannedGridLayoutManager = new SpannedGridLayoutManager(this.H);
        }
        this.n.setLayoutManager(spannedGridLayoutManager);
        this.n.setOverScrollMode(2);
        this.n.a(new v((int) n.b(getContext(), 1.0f), (byte) 0));
        this.n.a(new RecyclerView.m() {
            /* class com.ss.android.ugc.aweme.challenge.ui.s.AnonymousClass1 */

            static {
                Covode.recordClassIndex(43305);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.m
            public final void a(boolean z) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.m
            public final void b(RecyclerView recyclerView, MotionEvent motionEvent) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.m
            public final boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
                String str;
                String str2;
                int action = motionEvent.getAction();
                if (action == 0) {
                    s.this.f70210m = motionEvent.getY();
                    return false;
                } else if (action != 1) {
                    return false;
                } else {
                    s.this.f70210m = motionEvent.getY() - s.this.f70210m;
                    if (!TextUtils.equals("challenge", s.this.o()) && !TextUtils.equals("single_song", s.this.o())) {
                        return false;
                    }
                    String str3 = "";
                    if (TextUtils.equals("single_song", s.this.o())) {
                        str3 = "music_id";
                        str = "music_detail_slide_up";
                        str2 = "music_detail_slide_down";
                    } else {
                        str = str3;
                        str2 = str;
                    }
                    if (TextUtils.equals("challenge", s.this.o())) {
                        str3 = "tag_id";
                        str = "tag_detail_slide_up";
                        str2 = "tag_detail_slide_down";
                    }
                    if (TextUtils.isEmpty(str3)) {
                        return false;
                    }
                    if (s.this.f70210m > 10.0f) {
                        com.ss.android.ugc.aweme.common.r.a(str2, new com.ss.android.ugc.aweme.app.f.d().a("process_id", s.this.f70206e).a(str3, s.this.f70204c).f66730a);
                        return false;
                    } else if (s.this.f70210m >= -10.0f) {
                        return false;
                    } else {
                        com.ss.android.ugc.aweme.common.r.a(str, new com.ss.android.ugc.aweme.app.f.d().a("process_id", s.this.f70206e).a(str3, s.this.f70204c).f66730a);
                        return false;
                    }
                }
            }
        });
        if (!com.ss.android.ugc.aweme.performance.i.a()) {
            zVar = new z();
            this.n.a(zVar);
        }
        this.N = new com.ss.android.ugc.aweme.common.d.a(this.n, zVar);
        this.n = gc.a(this.n, this, 2);
        if (this.L.isInLiveDialog) {
            int a2 = com.ss.android.ugc.aweme.base.utils.n.a(16.0d);
            RecyclerView recyclerView = this.n;
            recyclerView.setPadding(a2, recyclerView.getPaddingTop(), a2, this.n.getPaddingBottom());
        }
        RecyclerView recyclerView2 = this.n;
        if (recyclerView2 instanceof FpsRecyclerView) {
            ((FpsRecyclerView) recyclerView2).setLabel("detail_list");
        }
        da.a.a(this.f70203b).a(this.n);
        com.ss.android.ugc.aweme.common.e.b bVar = this.P.get(this.f70202a);
        this.f70205d = bVar;
        if (bVar == null) {
            com.ss.android.ugc.aweme.common.e.b presenter = this.G.getPresenter(this.f70202a, getActivity());
            this.f70205d = presenter;
            if (presenter != null) {
                presenter.a_(new com.ss.android.ugc.aweme.common.e.c<Aweme>() {
                    /* class com.ss.android.ugc.aweme.challenge.ui.s.AnonymousClass3 */

                    /* renamed from: a  reason: collision with root package name */
                    final int f70214a;

                    static {
                        Covode.recordClassIndex(43307);
                    }

                    @Override // com.ss.android.ugc.aweme.common.e.c
                    public final void a(Exception exc) {
                    }

                    @Override // com.ss.android.ugc.aweme.common.e.c
                    public final void bh_() {
                    }

                    @Override // com.ss.android.ugc.aweme.common.e.c
                    public final void c(List<Aweme> list, boolean z) {
                    }

                    @Override // com.ss.android.ugc.aweme.common.e.c
                    public final void aO_() {
                        com.ss.android.ugc.aweme.challenge.a.b bVar = s.this.B.get(this.f70214a);
                        if (bVar != null) {
                            bVar.ag_();
                        }
                    }

                    private DmtStatusView a() {
                        if (!s.this.ab_()) {
                            return null;
                        }
                        if (s.this.p == null) {
                            return s.this.o;
                        }
                        return s.this.E.get(this.f70214a);
                    }

                    @Override // com.ss.android.ugc.aweme.common.e.c
                    public final void b() {
                        DmtStatusView a2 = a();
                        if (a2 != null && a2.getVisibility() == 0 && !TextUtils.equals("challenge", s.this.o()) && !TextUtils.equals("single_song", s.this.o()) && !TextUtils.equals("question", s.this.o())) {
                            a2.f();
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.common.e.c
                    public final void f() {
                        if (s.this.ab_()) {
                            s.this.e();
                            DmtStatusView a2 = a();
                            if (s.this.s != null) {
                                s.this.s.b(s.this.f70202a);
                            } else if (a2 != null) {
                                a2.g();
                            }
                            if (s.this.u != null && s.this.f70202a == this.f70214a) {
                                s.this.u.a(s.this.d());
                            }
                            if (s.this.v != null) {
                                s.this.v.b();
                            }
                            s.this.C.put(this.f70214a, false);
                        }
                    }

                    {
                        this.f70214a = s.this.f70202a;
                    }

                    @Override // com.ss.android.ugc.aweme.common.e.c
                    public final void c(Exception exc) {
                        com.ss.android.ugc.aweme.challenge.a.b bVar = s.this.B.get(this.f70214a);
                        if (bVar != null) {
                            bVar.i();
                        }
                        if (s.this.v != null && exc != null) {
                            s.this.v.a(exc);
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.common.e.c
                    public final void b(Exception exc) {
                        if (s.this.ab_()) {
                            s.this.e();
                            DmtStatusView a2 = a();
                            if (a2 != null) {
                                T t = s.this.f70205d.f76396h;
                                if (!(t instanceof com.ss.android.ugc.aweme.common.e.a) || com.bytedance.common.utility.collection.b.a((Collection) ((com.ss.android.ugc.aweme.common.e.a) t).getItems())) {
                                    a2.h();
                                }
                            }
                            if (s.this.u != null && s.this.f70202a == this.f70214a) {
                                s.this.u.a(s.this.d());
                            }
                            if (!(s.this.v == null || exc == null)) {
                                s.this.v.a(exc);
                            }
                            s.this.C.put(this.f70214a, false);
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.common.e.c
                    public final void b(List<Aweme> list, boolean z) {
                        if (s.this.ab_()) {
                            if (s.this.v != null) {
                                s.this.v.a();
                            }
                            if (list == null) {
                                list = new ArrayList<>();
                            }
                            com.ss.android.ugc.aweme.challenge.a.b bVar = s.this.B.get(this.f70214a);
                            DmtStatusView a2 = a();
                            if (bVar != null && a2 != null) {
                                bVar.ai_();
                                if (!com.bytedance.common.utility.collection.b.a((Collection) list) || !z) {
                                    List list2 = ((com.ss.android.ugc.aweme.common.a.d) bVar).f76354l;
                                    if (list2 == null || list2.size() != list.size() || !list2.containsAll(list)) {
                                        bVar.b(s.a(list));
                                    }
                                    a2.setVisibility(4);
                                    s.this.D.put(this.f70214a, z);
                                    s.this.a(z);
                                } else if (s.this.f70202a == this.f70214a) {
                                    s.this.l();
                                }
                            }
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.common.e.c
                    public final void a(List<Aweme> list, boolean z) {
                        if (s.this.ab_()) {
                            s.this.e();
                            com.ss.android.ugc.aweme.challenge.a.b bVar = s.this.B.get(this.f70214a);
                            DmtStatusView a2 = a();
                            if (!(bVar == null || a2 == null)) {
                                if (s.this.H != null && !list.isEmpty()) {
                                    list.get(0).setHighlighted(true);
                                }
                                bVar.ai_();
                                bVar.b_(s.a(list));
                                a2.setVisibility(8);
                                if (!z) {
                                    bVar.d(false);
                                    bVar.a((h.a) null);
                                }
                                if ("single_song".equals(s.this.f70203b)) {
                                    com.bytedance.ies.watcher.c.c("md_start_activity_to_show_list_duration");
                                    if (!s.this.w && list != null) {
                                        s.this.w = true;
                                        com.bytedance.ies.watcher.c.a("music_detail_list", s.this.f70204c, list);
                                    }
                                } else if ("challenge".equals(s.this.f70203b)) {
                                    com.bytedance.ies.watcher.c.c("cd_start_activity_to_show_list_duration");
                                    if (!s.this.w && list != null) {
                                        s.this.w = true;
                                        com.bytedance.ies.watcher.c.a("challenge_detail_list", s.this.f70204c, list);
                                    }
                                } else if ("sticker_prop_detail".equals(s.this.f70203b)) {
                                    com.bytedance.ies.watcher.c.c("sd_start_activity_to_show_list_duration");
                                }
                            }
                            s.this.D.put(this.f70214a, z);
                            if (s.this.u != null && s.this.f70202a == this.f70214a) {
                                s.this.u.a(s.this.d());
                            }
                            if (s.this.v != null) {
                                s.this.v.a();
                            }
                            s.this.C.put(this.f70214a, false);
                            if (s.this.getUserVisibleHint() && s.this.f70202a == this.f70214a) {
                                s.this.b(false, false);
                            }
                        }
                    }
                });
                this.f70205d.a((com.ss.android.ugc.aweme.common.e.d) this);
                this.P.put(this.f70202a, this.f70205d);
            }
            z2 = true;
        } else {
            z2 = false;
        }
        com.ss.android.ugc.aweme.challenge.a.b bVar2 = this.B.get(this.f70202a);
        this.r = bVar2;
        if (bVar2 == null) {
            com.ss.android.ugc.aweme.challenge.a.b bVar3 = new com.ss.android.ugc.aweme.challenge.a.b(this.f70203b, this, this, this.G);
            this.r = bVar3;
            bVar3.a((h.a) this);
            this.r.p = "detail_list";
            this.r.f69871d = this.z;
            this.B.put(this.f70202a, this.r);
            z2 = true;
        }
        this.n.setAdapter(this.r);
        this.r.f69871d = this.z;
        getActivity();
        if (!s()) {
            new com.bytedance.tux.g.b(getActivity()).e(R.string.de8).b();
        } else if (!this.A && z2) {
            a(true, false);
        } else if (getUserVisibleHint() && d()) {
            a(true, false);
        } else if (getUserVisibleHint()) {
            b(false, false);
        }
        if (this.p != null) {
            if (this.E.size() == 0) {
                this.E.put(this.f70202a, this.o);
                MethodCollector.o(11039);
                return;
            }
            DmtStatusView dmtStatusView = this.o;
            if (dmtStatusView != null) {
                dmtStatusView.setAlpha(0.0f);
            }
            DmtStatusView dmtStatusView2 = this.E.get(this.f70202a);
            this.o = dmtStatusView2;
            if (dmtStatusView2 == null) {
                this.o = new DmtStatusView(this.p.getContext());
                g();
                this.p.addView(this.o, new FrameLayout.LayoutParams(-1, -1));
                this.E.put(this.f70202a, this.o);
                MethodCollector.o(11039);
                return;
            }
            dmtStatusView2.setAlpha(1.0f);
        }
        MethodCollector.o(11039);
    }

    public final void a(View view, View view2) {
        view2.setOnClickListener(new t(this));
        this.o.setBuilder(DmtStatusView.a.a(getContext()).b(view).c(view2));
        this.o.g();
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = com.a.a(layoutInflater, R.layout.w4, viewGroup, false);
        a(getArguments());
        this.M = (DetailViewModel) androidx.lifecycle.ae.a(getActivity(), (ad.b) null).a(DetailViewModel.class);
        return a2;
    }

    private void a(boolean z2, boolean z3, boolean z4) {
        if (ab_()) {
            if (!z2) {
                b(false);
            }
            u();
            if (this.f70205d != null && !TextUtils.isEmpty(this.f70204c)) {
                b bVar = this.G;
                if (bVar == null || !bVar.sendCustomRequest(this.f70205d, 1)) {
                    this.f70205d.a(1, this.f70204c, Integer.valueOf(this.t), Boolean.valueOf(this.f70208k), this.f70209l, Boolean.valueOf(z4));
                }
                if (z3 && !TextUtils.equals("challenge", o()) && !TextUtils.equals("single_song", o()) && !TextUtils.equals("question", o())) {
                    this.o.f();
                }
            }
        }
    }
}

package com.bytedance.android.livesdk.rank.impl.ranks.a;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.view.a;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlImageView;
import com.bytedance.android.live.uikit.rtl.RtlViewPager;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.rank.api.j;
import com.bytedance.android.livesdk.rank.impl.api.model.RankPage;
import com.bytedance.android.livesdk.rank.impl.api.model.RankResponse;
import com.bytedance.android.livesdk.rank.impl.ranks.a.c;
import com.bytedance.android.livesdk.rank.impl.ui.tablayout.LiveTabLayout;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.a.ac;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class b extends com.bytedance.android.livesdk.ui.a implements c.b {

    /* renamed from: h  reason: collision with root package name */
    public static final a f20786h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public h.f.a.a<z> f20787a;

    /* renamed from: b  reason: collision with root package name */
    public RankPage f20788b;

    /* renamed from: c  reason: collision with root package name */
    boolean f20789c;

    /* renamed from: d  reason: collision with root package name */
    public c.a f20790d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f20791e;

    /* renamed from: f  reason: collision with root package name */
    public DataChannel f20792f;

    /* renamed from: g  reason: collision with root package name */
    View f20793g;

    /* renamed from: i  reason: collision with root package name */
    private long f20794i;

    /* renamed from: j  reason: collision with root package name */
    private long f20795j;

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<Integer> f20796k;

    /* renamed from: l  reason: collision with root package name */
    private int f20797l = j.HOURLY_RANK.getType();

    /* renamed from: m  reason: collision with root package name */
    private int f20798m = com.bytedance.android.livesdk.rank.impl.api.model.d.UNKNOWN.getValue();
    private HashMap n;

    static {
        Covode.recordClassIndex(12311);
    }

    private View a(int i2) {
        if (this.n == null) {
            this.n = new HashMap();
        }
        View view = (View) this.n.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.n.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(12312);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static b a(long j2, long j3, ArrayList<Integer> arrayList, int i2, int i3, h.f.a.a<z> aVar) {
            l.d(arrayList, "");
            l.d(aVar, "");
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putLong("arg_anchor_id", j2);
            bundle.putLong("arg_room_id", j3);
            bundle.putInt("first_show_rank_type", i2);
            bundle.putIntegerArrayList("rank_types", arrayList);
            bundle.putInt("target_region_type", i3);
            bVar.setArguments(bundle);
            bVar.f20787a = aVar;
            return bVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.a.b$b  reason: collision with other inner class name */
    public final class C0432b extends androidx.fragment.app.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20799a;

        /* renamed from: b  reason: collision with root package name */
        private final List<RankPage> f20800b;

        static {
            Covode.recordClassIndex(12313);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return this.f20800b.size();
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.a.b$b$a */
        static final /* synthetic */ class a extends h.f.b.j implements h.f.a.a<z> {
            static {
                Covode.recordClassIndex(12314);
            }

            a(b bVar) {
                super(0, bVar, b.class, "dismiss", "dismiss()V", 0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                ((b) this.receiver).e();
                return z.f158842a;
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.a.b$b$b  reason: collision with other inner class name */
        static final /* synthetic */ class C0433b extends h.f.b.j implements h.f.a.a<z> {
            static {
                Covode.recordClassIndex(12315);
            }

            C0433b(b bVar) {
                super(0, bVar, b.class, "dismiss", "dismiss()V", 0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                ((b) this.receiver).e();
                return z.f158842a;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final CharSequence getPageTitle(int i2) {
            return this.f20800b.get(i2).getTitle();
        }

        @Override // androidx.fragment.app.l
        public final Fragment a(int i2) {
            if (this.f20800b.get(i2).getRankType() == j.WEEKLY_RANK.getType()) {
                boolean z = this.f20799a.f20791e;
                c.a a2 = b.a(this.f20799a);
                a aVar = new a(this.f20799a);
                l.d(a2, "");
                l.d(aVar, "");
                com.bytedance.android.livesdk.rank.impl.ranks.b.b.b bVar = new com.bytedance.android.livesdk.rank.impl.ranks.b.b.b();
                Bundle bundle = new Bundle();
                bundle.putInt("page_position", i2);
                bundle.putBoolean("is_anchor", z);
                bVar.setArguments(bundle);
                bVar.a(a2);
                bVar.a(aVar);
                return bVar;
            }
            boolean z2 = this.f20799a.f20791e;
            c.a a3 = b.a(this.f20799a);
            C0433b bVar2 = new C0433b(this.f20799a);
            l.d(a3, "");
            l.d(bVar2, "");
            com.bytedance.android.livesdk.rank.impl.ranks.b.a.b bVar3 = new com.bytedance.android.livesdk.rank.impl.ranks.b.a.b();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("page_position", i2);
            bundle2.putBoolean("is_anchor", z2);
            bVar3.setArguments(bundle2);
            bVar3.a(a3);
            bVar3.a(bVar2);
            return bVar3;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0432b(b bVar, i iVar, List<RankPage> list) {
            super(iVar);
            l.d(iVar, "");
            l.d(list, "");
            this.f20799a = bVar;
            this.f20800b = list;
        }
    }

    public final void e() {
        h.f.a.a<z> aVar = this.f20787a;
        if (aVar == null) {
            l.a("actionDismiss");
        }
        aVar.invoke();
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        c.a aVar = this.f20790d;
        if (aVar == null) {
            l.a("mPresenter");
        }
        aVar.a();
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.a.c.b
    public final void a() {
        LiveLoadingView liveLoadingView = (LiveLoadingView) a(R.id.chg);
        l.b(liveLoadingView, "");
        liveLoadingView.setVisibility(0);
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.a.c.b
    public final void b() {
        LiveLoadingView liveLoadingView = (LiveLoadingView) a(R.id.chg);
        l.b(liveLoadingView, "");
        liveLoadingView.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        DataChannel dataChannel = this.f20792f;
        if (dataChannel != null) {
            dataChannel.b(com.bytedance.android.livesdk.rank.api.b.class, (Object) true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        DataChannel dataChannel = this.f20792f;
        if (dataChannel != null) {
            dataChannel.b(com.bytedance.android.livesdk.rank.api.b.class, (Object) false);
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.a.c.b
    public final void c() {
        RelativeLayout relativeLayout;
        MethodCollector.i(1709);
        ViewStub viewStub = (ViewStub) getView().findViewById(R.id.cvw);
        if (viewStub == null || viewStub.getVisibility() != 8) {
            View view = getView();
            if (view == null || (relativeLayout = (RelativeLayout) view.findViewById(R.id.edf)) == null) {
                MethodCollector.o(1709);
                return;
            }
            relativeLayout.setVisibility(0);
            MethodCollector.o(1709);
            return;
        }
        ((ViewStub) getView().findViewById(R.id.cvw)).inflate();
        ((LiveButton) a(R.id.cvx)).setOnClickListener(new f(this));
        MethodCollector.o(1709);
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.a.c.b
    public final void d() {
        RelativeLayout relativeLayout;
        MethodCollector.i(1716);
        ViewStub viewStub = (ViewStub) getView().findViewById(R.id.dz1);
        if (viewStub == null || viewStub.getVisibility() != 8) {
            b();
            View view = getView();
            if (view == null || (relativeLayout = (RelativeLayout) view.findViewById(R.id.edh)) == null) {
                MethodCollector.o(1716);
                return;
            }
            relativeLayout.setVisibility(0);
            MethodCollector.o(1716);
            return;
        }
        ((ViewStub) getView().findViewById(R.id.dz1)).inflate();
        ((LiveButton) a(R.id.dz2)).setOnClickListener(new e(this));
        MethodCollector.o(1716);
    }

    public static final class d extends ViewPager.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20802a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f20803b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f20804c;

        static {
            Covode.recordClassIndex(12317);
        }

        @Override // androidx.viewpager.widget.ViewPager.h, androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            this.f20802a.f20788b = (RankPage) this.f20803b.get(i2);
        }

        d(b bVar, List list, int i2) {
            this.f20802a = bVar;
            this.f20803b = list;
            this.f20804c = i2;
        }
    }

    public static final /* synthetic */ c.a a(b bVar) {
        c.a aVar = bVar.f20790d;
        if (aVar == null) {
            l.a("mPresenter");
        }
        return aVar;
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20805a;

        static {
            Covode.recordClassIndex(12318);
        }

        e(b bVar) {
            this.f20805a = bVar;
        }

        public final void onClick(View view) {
            RelativeLayout relativeLayout;
            View view2 = this.f20805a.getView();
            if (!(view2 == null || (relativeLayout = (RelativeLayout) view2.findViewById(R.id.edh)) == null)) {
                relativeLayout.setVisibility(8);
            }
            b.a(this.f20805a).b();
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20806a;

        static {
            Covode.recordClassIndex(12319);
        }

        f(b bVar) {
            this.f20806a = bVar;
        }

        public final void onClick(View view) {
            RelativeLayout relativeLayout;
            View view2 = this.f20806a.getView();
            if (!(view2 == null || (relativeLayout = (RelativeLayout) view2.findViewById(R.id.edf)) == null)) {
                relativeLayout.setVisibility(8);
            }
            b.a(this.f20806a).b();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20801a;

        static {
            Covode.recordClassIndex(12316);
        }

        c(b bVar) {
            this.f20801a = bVar;
        }

        public final void onClick(View view) {
            b bVar = this.f20801a;
            RankPage rankPage = bVar.f20788b;
            if (rankPage == null) {
                l.a("mCurrentRankPage");
            }
            if (!TextUtils.isEmpty(rankPage.getRuleUrl())) {
                RankPage rankPage2 = bVar.f20788b;
                if (rankPage2 == null) {
                    l.a("mCurrentRankPage");
                }
                Uri parse = Uri.parse(rankPage2.getRuleUrl());
                String queryParameter = parse.getQueryParameter("url");
                if (queryParameter != null) {
                    l.b(queryParameter, "");
                    l.b(parse, "");
                    Uri a2 = p.a(parse, "url", queryParameter + "?landscape=" + (!bVar.f20789c ? 1 : 0));
                    IActionHandlerService iActionHandlerService = (IActionHandlerService) com.bytedance.android.live.t.a.a(IActionHandlerService.class);
                    Context context = bVar.getContext();
                    Uri.Builder buildUpon = a2.buildUpon();
                    View view2 = bVar.f20793g;
                    if (view2 == null) {
                        l.a("rootView");
                    }
                    Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("width", String.valueOf((int) y.e(view2.getWidth())));
                    if (!bVar.f20789c || TextUtils.isEmpty(a2.getQueryParameter("height"))) {
                        View view3 = bVar.f20793g;
                        if (view3 == null) {
                            l.a("rootView");
                        }
                        appendQueryParameter.appendQueryParameter("height", String.valueOf((int) y.e(view3.getHeight())));
                    }
                    iActionHandlerService.handle(context, appendQueryParameter.build());
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Boolean bool;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f20794i = arguments.getLong("arg_anchor_id");
            this.f20795j = arguments.getLong("arg_room_id");
            this.f20797l = arguments.getInt("first_show_rank_type");
            ArrayList<Integer> integerArrayList = arguments.getIntegerArrayList("rank_types");
            if (integerArrayList == null) {
                integerArrayList = (ArrayList) n.c(Integer.valueOf(j.HOURLY_RANK.getType()));
            }
            this.f20796k = integerArrayList;
            this.f20798m = arguments.getInt("target_region_type", com.bytedance.android.livesdk.rank.impl.api.model.d.UNKNOWN.getValue());
        }
        this.f20792f = com.bytedance.ies.sdk.datachannel.f.a(this);
        long j2 = this.f20794i;
        long j3 = this.f20795j;
        DataChannel dataChannel = this.f20792f;
        ArrayList<Integer> arrayList = this.f20796k;
        if (arrayList == null) {
            l.a("mRankTypes");
        }
        this.f20790d = new d(j2, j3, dataChannel, arrayList, this.f20798m);
        DataChannel dataChannel2 = this.f20792f;
        Boolean bool2 = null;
        if (dataChannel2 != null) {
            bool = (Boolean) dataChannel2.b(cp.class);
        } else {
            bool = null;
        }
        this.f20789c = p.d(bool);
        DataChannel dataChannel3 = this.f20792f;
        if (dataChannel3 != null) {
            bool2 = (Boolean) dataChannel3.b(ee.class);
        }
        this.f20791e = p.a(bool2);
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.a.c.b
    public final void a(RankResponse rankResponse) {
        int i2;
        com.bytedance.ies.f.b a2;
        l.d(rankResponse, "");
        View a3 = a(R.id.an6);
        l.b(a3, "");
        a3.setVisibility(0);
        LiveAutoRtlImageView liveAutoRtlImageView = (LiveAutoRtlImageView) a(R.id.dgy);
        l.b(liveAutoRtlImageView, "");
        liveAutoRtlImageView.setVisibility(0);
        ((LiveAutoRtlImageView) a(R.id.dgy)).setOnClickListener(new c(this));
        if (!(getContext() == null || (a2 = com.bytedance.ies.f.b.a(getContext(), com.bytedance.ies.f.b.f33816b)) == null || a2.a("live.mt.hourly_rank.help_tooltip", false))) {
            a2.b("live.mt.hourly_rank.help_tooltip", true);
            com.bytedance.android.live.design.view.j.a(((a.C0140a) new a.C0140a(a(R.id.dgy)).a(R.string.eb2).b(y.a(266.0f)).c()).b());
        }
        DataChannel dataChannel = this.f20792f;
        if (dataChannel != null) {
            dataChannel.a(com.bytedance.android.livesdk.rank.impl.c.class, rankResponse);
        }
        int showIndex = rankResponse.getShowIndex();
        for (ac acVar : n.n(rankResponse.getPages())) {
            if (acVar.f158623b.getRankType() == this.f20797l) {
                showIndex = acVar.f158622a;
            }
        }
        this.f20788b = rankResponse.getPages().get(showIndex);
        List<RankPage> pages = rankResponse.getPages();
        RtlViewPager rtlViewPager = (RtlViewPager) a(R.id.fj_);
        i childFragmentManager = getChildFragmentManager();
        l.b(childFragmentManager, "");
        rtlViewPager.setAdapter(new C0432b(this, childFragmentManager, pages));
        rtlViewPager.setCurrentItem(showIndex, true);
        rtlViewPager.setVisibility(0);
        rtlViewPager.addOnPageChangeListener(new d(this, pages, showIndex));
        if (pages.size() != 1 || !this.f20789c) {
            LiveTabLayout liveTabLayout = (LiveTabLayout) a(R.id.ehe);
            liveTabLayout.setVisibility(0);
            if (this.f20789c) {
                i2 = R.layout.bc0;
            } else {
                i2 = R.layout.bc1;
            }
            liveTabLayout.setCustomTabViewResId(i2);
            liveTabLayout.f20953b.setPadding(y.a(16.0f), 0, y.a(16.0f), 0);
            liveTabLayout.setTabMode(0);
            liveTabLayout.setAutoFillWhenScrollable(true);
            liveTabLayout.setupWithViewPager((ViewPager) a(R.id.fj_));
            return;
        }
        LiveTextView liveTextView = (LiveTextView) a(R.id.e4n);
        liveTextView.setVisibility(0);
        liveTextView.setText(pages.get(0).getTitle());
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        c.a aVar = this.f20790d;
        if (aVar == null) {
            l.a("mPresenter");
        }
        aVar.a(this);
        c.a aVar2 = this.f20790d;
        if (aVar2 == null) {
            l.a("mPresenter");
        }
        aVar2.b();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        l.d(layoutInflater, "");
        if (this.f20789c) {
            i2 = R.layout.b70;
        } else {
            i2 = R.layout.b71;
        }
        View a2 = com.a.a(layoutInflater, i2, viewGroup, false);
        l.b(a2, "");
        this.f20793g = a2;
        if (a2 == null) {
            l.a("rootView");
        }
        return a2;
    }
}

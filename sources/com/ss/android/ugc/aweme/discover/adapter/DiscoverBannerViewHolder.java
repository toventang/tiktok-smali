package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.h.v;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.vm.ScopeViewModel;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.commercialize.g;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.helper.ak;
import com.ss.android.ugc.aweme.discover.helper.al;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabState;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel;
import com.ss.android.ugc.aweme.discover.widget.IndicatorView;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.shortvideo.ui.q;
import com.ss.android.ugc.aweme.utils.at;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.h;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class DiscoverBannerViewHolder extends JediSimpleViewHolder<DiscoverSectionItem> implements ViewPager.e, j, com.ss.android.ugc.aweme.discover.tooltip.a, com.ss.android.ugc.aweme.discover.tooltip.a {

    /* renamed from: j  reason: collision with root package name */
    public static final List<Banner> f80272j = n.c(new Banner());

    /* renamed from: k  reason: collision with root package name */
    public static final b f80273k = new b((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    public final ViewPager f80274f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f80275g;

    /* renamed from: l  reason: collision with root package name */
    private final TextView f80276l;

    /* renamed from: m  reason: collision with root package name */
    private final IndicatorView f80277m;
    private final View n;
    private d o;
    private final ak p;
    private List<? extends Banner> q = z.INSTANCE;
    private final Context r;
    private final h s;
    private final com.ss.android.ugc.aweme.discover.tooltip.a t;

    private final TrendsTabViewModel m() {
        return (TrendsTabViewModel) this.s.getValue();
    }

    @Override // androidx.viewpager.widget.ViewPager.e
    public final void onPageScrollStateChanged(int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.e
    public final void onPageScrolled(int i2, float f2, int i3) {
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(49964);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.tooltip.a
    public final void aV_() {
        this.t.aV_();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void h() {
        super.h();
        a(false);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void g() {
        super.g();
        withState(m(), new f(this));
    }

    static {
        Covode.recordClassIndex(49962);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<TrendsTabViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(49963);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jediViewHolder;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.adapter.DiscoverBannerViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_discover_adapter_DiscoverBannerViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f80278a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Banner f80279b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f80280c;

        static {
            Covode.recordClassIndex(49966);
        }

        d(int i2, Banner banner, String str) {
            this.f80278a = i2;
            this.f80279b = banner;
            this.f80280c = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            r.onEvent(MobClick.obtain().setEventName("banner_show").setLabelName("discovery").setExtValueLong((long) this.f80278a).setValue(String.valueOf(this.f80279b.getCreativeId())));
            r.a("banner_show", new com.ss.android.ugc.aweme.discover.mob.b().setBannerId(this.f80279b.getBid()).setTagId(this.f80280c).setClientOrder(this.f80278a).buildParams());
            return h.z.f158842a;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<TrendsTabState, h.z> {
        final /* synthetic */ DiscoverBannerViewHolder this$0;

        static {
            Covode.recordClassIndex(49965);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(DiscoverBannerViewHolder discoverBannerViewHolder) {
            super(1);
            this.this$0 = discoverBannerViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(TrendsTabState trendsTabState) {
            TrendsTabState trendsTabState2 = trendsTabState;
            l.d(trendsTabState2, "");
            if (!trendsTabState2.isTabHidden()) {
                this.this$0.a(true);
            }
            return h.z.f158842a;
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.p.a();
            return;
        }
        this.p.b();
        this.f80274f.setOnTouchListener(null);
    }

    @Override // androidx.viewpager.widget.ViewPager.e
    public final void onPageSelected(int i2) {
        a(this.f80274f.getCurrentItem(), 4);
        withState(m(), new e(this, i2));
    }

    static final class e extends h.f.b.m implements h.f.a.b<TrendsTabState, h.z> {
        final /* synthetic */ int $position;
        final /* synthetic */ DiscoverBannerViewHolder this$0;

        static {
            Covode.recordClassIndex(49967);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(DiscoverBannerViewHolder discoverBannerViewHolder, int i2) {
            super(1);
            this.this$0 = discoverBannerViewHolder;
            this.$position = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(TrendsTabState trendsTabState) {
            TrendsTabState trendsTabState2 = trendsTabState;
            l.d(trendsTabState2, "");
            if (!trendsTabState2.isTabHidden() && this.this$0.f80275g) {
                this.this$0.a(this.$position);
                DiscoverBannerViewHolder discoverBannerViewHolder = this.this$0;
                discoverBannerViewHolder.a(discoverBannerViewHolder.f80274f.getCurrentItem(), 3);
            }
            return h.z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<TrendsTabState, h.z> {
        final /* synthetic */ DiscoverBannerViewHolder this$0;

        static {
            Covode.recordClassIndex(49968);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(DiscoverBannerViewHolder discoverBannerViewHolder) {
            super(1);
            this.this$0 = discoverBannerViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(TrendsTabState trendsTabState) {
            TrendsTabState trendsTabState2 = trendsTabState;
            l.d(trendsTabState2, "");
            if (!trendsTabState2.isTabHidden() && this.this$0.f80275g) {
                DiscoverBannerViewHolder discoverBannerViewHolder = this.this$0;
                discoverBannerViewHolder.a(discoverBannerViewHolder.f80274f.getCurrentItem());
                this.this$0.a(true);
            }
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.j
    public final void b(boolean z) {
        this.f80275g = z;
        if (z && getLifecycle().a().compareTo((Enum) i.b.STARTED) >= 0) {
            a(this.f80274f.getCurrentItem());
            a(true);
        }
    }

    public final void a(int i2) {
        if (!this.q.isEmpty()) {
            List<? extends Banner> list = this.q;
            Banner banner = (Banner) list.get(i2 % list.size());
            List<? extends Banner> list2 = this.q;
            b.i.b(new d((i2 % this.q.size()) + 1, banner, at.a(((Banner) list2.get(i2 % list2.size())).getSchema())), r.a());
            if (banner.isAd()) {
                g.a().a(this.r, banner, (i2 % this.q.size()) + 1);
                if (in.d()) {
                    com.ss.android.ugc.aweme.app.n.a("ftc_show_banner_ad", "", (JSONObject) null);
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(DiscoverSectionItem discoverSectionItem) {
        int i2;
        List<Banner> list;
        DiscoverSectionItem discoverSectionItem2 = discoverSectionItem;
        l.d(discoverSectionItem2, "");
        List<Banner> list2 = ((DiscoverSectionItem.BannerSection) discoverSectionItem2).bannerList;
        if (!l.a(list2, f80272j)) {
            View view = this.itemView;
            l.b(view, "");
            Context context = view.getContext();
            if (this.o == null) {
                this.o = new d(this, context, LayoutInflater.from(context));
                this.f80274f.setAdapter(new q(this.o));
            }
            boolean a2 = gb.a(context);
            this.p.f81079b = list2.size();
            d dVar = this.o;
            if (dVar == null) {
                l.b();
            }
            l.d(list2, "");
            if (dVar.f80538d != list2) {
                dVar.f80538d = list2;
                dVar.notifyDataSetChanged();
            }
            this.f80277m.setUpViewPager(this.f80274f);
            IndicatorView indicatorView = this.f80277m;
            if (list2.size() < 2) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            indicatorView.setVisibility(i2);
            if (a2) {
                list = n.h((Iterable) list2);
            } else {
                list = list2;
            }
            this.q = list;
            if (a2) {
                this.f80274f.setCurrentItem((list2.size() * 10000) - 1);
            } else {
                this.f80274f.setCurrentItem(list2.size() * 10000);
            }
            withState(m(), new c(this));
        }
    }

    public final void a(int i2, int i3) {
        if (!this.q.isEmpty()) {
            r.a("ads_banner_show_test", new com.ss.android.ugc.aweme.app.f.d().a("position", (i2 % this.q.size()) + 1).a(StringSet.type, i3).f66730a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiscoverBannerViewHolder(com.ss.android.ugc.aweme.discover.tooltip.a aVar, View view) {
        super(view);
        l.d(aVar, "");
        l.d(view, "");
        View findViewById = view.findViewById(R.id.eyp);
        l.b(findViewById, "");
        TextView textView = (TextView) findViewById;
        this.f80276l = textView;
        View findViewById2 = view.findViewById(R.id.fk_);
        l.b(findViewById2, "");
        ViewPager viewPager = (ViewPager) findViewById2;
        this.f80274f = viewPager;
        View findViewById3 = view.findViewById(R.id.aop);
        l.b(findViewById3, "");
        IndicatorView indicatorView = (IndicatorView) findViewById3;
        this.f80277m = indicatorView;
        View findViewById4 = view.findViewById(R.id.e_f);
        l.b(findViewById4, "");
        this.n = findViewById4;
        Context context = view.getContext();
        this.r = context;
        this.f80275g = true;
        h.k.c a2 = h.f.b.ab.a(TrendsTabViewModel.class);
        this.s = h.i.a((h.f.a.a) new a(this, a2, a2));
        this.t = aVar;
        if (com.ss.android.ugc.aweme.search.h.f121133a.q()) {
            al.a(view);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            RecyclerView.j jVar = (RecyclerView.j) (!(layoutParams instanceof RecyclerView.j) ? null : layoutParams);
            if (jVar != null) {
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                jVar.leftMargin = h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
                Resources system2 = Resources.getSystem();
                l.a((Object) system2, "");
                jVar.rightMargin = h.g.a.a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics()));
            }
        }
        l.d(textView, "");
        l.d(viewPager, "");
        int a3 = com.bytedance.common.utility.n.a(context);
        if (com.ss.android.ugc.aweme.search.h.f121133a.q()) {
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            a3 -= h.g.a.a(TypedValue.applyDimension(1, 32.0f, system3.getDisplayMetrics()));
        }
        a3 = MSAdaptionService.c().b(context) ? (a3 >> 1) - 42 : a3;
        textView.setVisibility(8);
        ViewGroup.LayoutParams layoutParams2 = viewPager.getLayoutParams();
        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.a aVar2 = (ConstraintLayout.a) layoutParams2;
        aVar2.height = (int) (((float) a3) * 0.48104957f);
        viewPager.setLayoutParams(aVar2);
        this.p = new ak(viewPager);
        int i2 = Build.VERSION.SDK_INT;
        findViewById4.getLayoutParams().height = com.bytedance.common.utility.n.e(view.getContext());
        viewPager.addOnPageChangeListener(this);
        v.b((View) indicatorView, 0);
    }
}

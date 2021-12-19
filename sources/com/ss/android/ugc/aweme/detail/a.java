package com.ss.android.ugc.aweme.detail;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.l;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.aweme.g.a.g;
import com.zhiliaoapp.musically.R;
import java.util.List;

public abstract class a extends com.ss.android.ugc.aweme.base.f.a implements ViewPager.e, ScrollableLayout.b {
    public static final String v = new StringBuilder("android:switcher:2131370423:").toString();
    protected View A;
    protected ViewPager B;
    protected DmtTabLayout C;
    ImageView D;
    protected ImageView E;
    public l F;
    protected int G;
    protected boolean H = true;
    protected List<h> I;
    protected List<com.ss.android.ugc.aweme.base.f.a> J;
    public String K;
    public g L;
    protected long M = -1;

    /* renamed from: a  reason: collision with root package name */
    private int f79591a;

    /* renamed from: b  reason: collision with root package name */
    private final u<Boolean> f79592b = new b(this);
    protected DetailViewModel w;
    public ScrollableLayout y;
    protected TextView z;

    @Override // com.ss.android.ugc.aweme.base.f.a
    public boolean H() {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract String a(int i2);

    public void a(int i2, int i3) {
    }

    public void a(int i2, boolean z2) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(Bundle bundle);

    public void a(View view) {
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b
    public final boolean an_() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract int h();

    /* access modifiers changed from: protected */
    public abstract String i();

    /* access modifiers changed from: protected */
    public abstract l l();

    /* access modifiers changed from: protected */
    public boolean n() {
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager.e
    public void onPageScrollStateChanged(int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.e
    public void onPageScrolled(int i2, float f2, int i3) {
    }

    static {
        Covode.recordClassIndex(49443);
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onDestroyView() {
        super.onDestroyView();
        if (e.a()) {
            this.w.f79590b.removeObserver(this.f79592b);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (n()) {
            o();
        }
        g gVar = this.L;
        if (gVar != null) {
            gVar.b();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.M = System.currentTimeMillis();
        if (this.L != null) {
            new Handler().postDelayed(new c(this), 500);
        }
    }

    /* access modifiers changed from: protected */
    public final void o() {
        if (this.M != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.M;
            getContext();
            r.a("stay_time", a(this.G), String.valueOf(currentTimeMillis), i());
            this.M = -1;
        }
    }

    public void k() {
        ScrollableLayout scrollableLayout = this.y;
        if (scrollableLayout != null) {
            scrollableLayout.setOnScrollListener(this);
        }
        l l2 = l();
        this.F = l2;
        this.B.setAdapter(l2);
        DmtTabLayout dmtTabLayout = this.C;
        if (dmtTabLayout != null) {
            dmtTabLayout.setVisibility(0);
            this.C.setCustomTabViewResId(R.layout.w6);
            this.C.setBackgroundColor(b.c(getContext(), R.color.au));
            this.C.a(n.a(16.0d), n.a(16.0d));
            DmtTabLayout dmtTabLayout2 = this.C;
            LinearLayout linearLayout = (LinearLayout) dmtTabLayout2.getChildAt(0);
            linearLayout.setShowDividers(2);
            linearLayout.setDividerDrawable(b.a(dmtTabLayout2.getContext(), (int) R.drawable.a4k));
            linearLayout.setDividerPadding(n.a(16.0d));
            this.C.setupWithViewPager(this.B);
            this.C.setOnTabClickListener(new d(this));
            this.C.setVisibility(8);
        }
        this.B.addOnPageChangeListener(this);
        this.B.setCurrentItem(this.G);
        onPageSelected(this.G);
    }

    /* access modifiers changed from: protected */
    public final void p() {
        List<h> list;
        int i2;
        RecyclerView recyclerView;
        if (ab_() && (list = this.I) != null && list.size() > (i2 = this.G) && this.I.get(i2) != null && (recyclerView = (RecyclerView) this.I.get(this.G).m()) != null) {
            int childCount = recyclerView.getChildCount();
            ScrollableLayout scrollableLayout = this.y;
            if (scrollableLayout != null) {
                if (childCount == 0) {
                    scrollableLayout.a();
                    List<h> list2 = this.I;
                    list2.get((this.G + 1) % list2.size()).n();
                    this.y.setMaxScrollHeight(0);
                    return;
                }
                View g2 = recyclerView.getLayoutManager().g(childCount - 1);
                int childCount2 = this.y.getChildCount();
                if (childCount2 >= 2 && g2 != null) {
                    int bottom = (g2.getBottom() + this.y.getChildAt(childCount2 - 1).getTop()) - this.y.getCurScrollY();
                    this.y.setMaxScrollHeight(((bottom + this.y.getCurScrollY()) + com.bytedance.common.utility.n.e(getContext())) - com.bytedance.common.utility.n.b(getContext()));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public g a(ViewGroup viewGroup) {
        return new com.ss.android.ugc.aweme.detail.a.b(getContext(), viewGroup);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("cur_pos", this.G);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.viewpager.widget.ViewPager.e
    public void onPageSelected(int i2) {
        boolean z2;
        ViewPager viewPager;
        if (i2 < 0 || !((viewPager = this.B) == null || viewPager.getAdapter() == null || i2 < this.B.getAdapter().getCount())) {
            i2 = 0;
        }
        if (!(this.M == -1 || this.G == i2)) {
            long currentTimeMillis = System.currentTimeMillis() - this.M;
            getContext();
            r.a("stay_time", a(this.G), String.valueOf(currentTimeMillis), i());
            this.M = System.currentTimeMillis();
        }
        if (i2 != this.f79591a) {
            z2 = true;
        } else {
            z2 = false;
        }
        a(i2, z2);
        this.f79591a = i2;
        this.G = i2;
        int currentItem = this.B.getCurrentItem();
        int i3 = this.G;
        if (currentItem != i3) {
            this.B.setCurrentItem(i3);
        }
        ScrollableLayout scrollableLayout = this.y;
        if (!(scrollableLayout == null || scrollableLayout.getHelper() == null || this.I == null)) {
            this.y.getHelper().f76605b = this.I.get(this.G);
        }
        g gVar = this.L;
        if (gVar != null) {
            gVar.f();
        }
        l lVar = this.F;
        if (!(lVar == null || this.B == null)) {
            int count = lVar.getCount();
            for (int i4 = 0; i4 < count; i4++) {
                Fragment a2 = this.F.a(i4);
                if (!(a2 == null || a2.getFragmentManager() == null)) {
                    if (i4 == i2) {
                        a2.setUserVisibleHint(true);
                        a(i2, a2.hashCode());
                    } else {
                        a2.setUserVisibleHint(false);
                    }
                    ((h) a2).k();
                }
            }
        }
        p();
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b
    public void b(int i2, int i3) {
        this.w.f79589a.setValue(true);
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b
    public void a(float f2, float f3) {
        g gVar;
        p();
        if (Math.abs(f2) >= Math.abs(f3) || !this.H) {
            return;
        }
        if (f3 > 30.0f) {
            g gVar2 = this.L;
            if (gVar2 != null) {
                gVar2.e();
            }
        } else if (f3 < -30.0f && (gVar = this.L) != null) {
            gVar.d();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.y = (ScrollableLayout) view.findViewById(R.id.dtd);
        this.z = (TextView) view.findViewById(R.id.title);
        this.A = view.findViewById(R.id.emi);
        this.B = (ViewPager) view.findViewById(R.id.fk_);
        this.C = (DmtTabLayout) view.findViewById(R.id.ehe);
        this.D = (ImageView) view.findViewById(R.id.e0k);
        this.E = (ImageView) view.findViewById(R.id.qb);
        if (this.L == null) {
            this.L = a((ViewGroup) view);
        }
        if (bundle != null) {
            this.G = bundle.getInt("cur_pos", 0);
        }
        this.w = (DetailViewModel) ae.a(getActivity(), (ad.b) null).a(DetailViewModel.class);
        if (e.a()) {
            this.w.f79590b.observeForever(this.f79592b);
        }
        k();
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a(getArguments());
        View a2 = com.a.a(layoutInflater, h(), viewGroup, false);
        a(a2);
        return a2;
    }
}

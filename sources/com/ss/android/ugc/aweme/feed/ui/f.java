package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.e.b;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.adapter.al;
import com.ss.android.ugc.aweme.feed.i.y;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.n.c;
import com.ss.android.ugc.aweme.feed.n.d;
import com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.main.aw;
import com.ss.android.ugc.aweme.s.e;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class f<T extends b> extends z implements al, c, d, at, LoadMoreFrameLayout.b {

    /* renamed from: a  reason: collision with root package name */
    protected LoadMoreFrameLayout f94755a;

    /* renamed from: b  reason: collision with root package name */
    protected View f94756b;

    /* renamed from: c  reason: collision with root package name */
    protected FeedSwipeRefreshLayout f94757c;

    /* renamed from: d  reason: collision with root package name */
    protected SwipeRefreshLayout.c f94758d;

    /* renamed from: e  reason: collision with root package name */
    DmtStatusView f94759e;

    /* renamed from: j  reason: collision with root package name */
    protected T f94760j;

    /* renamed from: k  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.b f94761k;

    /* renamed from: l  reason: collision with root package name */
    protected VerticalViewPager f94762l;

    /* renamed from: m  reason: collision with root package name */
    private AtomicBoolean f94763m = new AtomicBoolean(false);
    private List<ViewPager.e> n = new ArrayList();

    static {
        Covode.recordClassIndex(60122);
    }

    /* access modifiers changed from: protected */
    public abstract DmtStatusView a(Context context);

    /* access modifiers changed from: protected */
    public abstract T j();

    /* access modifiers changed from: protected */
    public abstract boolean l();

    public void p() {
    }

    private static boolean b() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.c
    public boolean k() {
        if (!n()) {
            return false;
        }
        return l();
    }

    /* access modifiers changed from: protected */
    public boolean n() {
        if (!this.f94760j.j()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void m() {
        FeedSwipeRefreshLayout feedSwipeRefreshLayout = this.f94757c;
        if (feedSwipeRefreshLayout != null) {
            feedSwipeRefreshLayout.a((int) n.b(getActivity(), 49.0f), (int) n.b(getActivity(), 113.0f));
            this.f94761k = new aw(this.f94757c);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.feed.ui.z
    public void onDestroyView() {
        super.onDestroyView();
        T t = this.f94760j;
        if (t != null) {
            t.cd_();
        }
        for (ViewPager.e eVar : this.n) {
            VerticalViewPager verticalViewPager = this.f94762l;
            if (verticalViewPager.f76531e != null) {
                verticalViewPager.f76531e.remove(eVar);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.d
    public final boolean a(Aweme aweme) {
        return this.f94760j.a(aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.n.d
    public final boolean a(String str) {
        boolean a2 = this.f94760j.a(AwemeService.b().b(str));
        a.b(4, "BaseFeedListFragment", str + " deleteItem :" + a2);
        return a2;
    }

    public final DmtStatusView b(boolean z) {
        if (this.f94759e == null && z && this.f94763m.get() && getContext() != null) {
            DmtStatusView a2 = a(getContext());
            this.f94759e = a2;
            a2.setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.c0));
            this.f94755a.addView(this.f94759e, new FrameLayout.LayoutParams(-1, -1));
        }
        return this.f94759e;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.z
    public boolean a(boolean z) {
        if (!ab_()) {
            return false;
        }
        getActivity();
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = b();
        }
        if (!j.f107229h) {
            new com.ss.android.ugc.aweme.tux.a.i.a(getActivity()).a(R.string.de8).a();
            this.f94761k.setRefreshing(false);
            com.ss.android.ugc.d.a.c.a(new y());
            return false;
        } else if (!this.f94760j.j()) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.feed.ui.z
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LoadMoreFrameLayout loadMoreFrameLayout = (LoadMoreFrameLayout) view.findViewById(R.id.cic);
        this.f94755a = loadMoreFrameLayout;
        loadMoreFrameLayout.setOnLoadMoreUiListener(this);
        this.f94756b = view.findViewById(R.id.b1x);
        FeedSwipeRefreshLayout feedSwipeRefreshLayout = (FeedSwipeRefreshLayout) view.findViewById(R.id.dk8);
        this.f94757c = feedSwipeRefreshLayout;
        SwipeRefreshLayout.c cVar = this.f94758d;
        if (cVar != null) {
            feedSwipeRefreshLayout.setOnSwipeChangeListener(cVar);
        }
        m();
        this.f94757c.setOnRefreshListener(new SwipeRefreshLayout.b() {
            /* class com.ss.android.ugc.aweme.feed.ui.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(60123);
            }

            @Override // com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout.b
            public final void a() {
                f.this.a(false);
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ug.guide.c(0));
            }
        });
        this.f94760j = j();
        this.f94762l = (VerticalViewPager) this.f94756b.findViewById(R.id.fk_);
        this.f94763m.compareAndSet(false, true);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (e.d()) {
            return com.a.b.c.a((Activity) getActivity(), (int) R.layout.s7);
        }
        return com.a.b.c.a((Activity) getActivity(), (int) R.layout.s2);
    }
}

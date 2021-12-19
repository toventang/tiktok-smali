package com.ss.android.ugc.aweme.search.q;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.search.ecom.ProductListView;
import com.ss.android.ugc.aweme.search.ecom.e;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.views.RtlViewPager;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class b extends PagerAdapter {

    /* renamed from: g  reason: collision with root package name */
    public static final a f121565g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public c f121566a;

    /* renamed from: b  reason: collision with root package name */
    public ProductListView f121567b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.search.ecom.a f121568c;

    /* renamed from: d  reason: collision with root package name */
    public e f121569d;

    /* renamed from: e  reason: collision with root package name */
    public h.f.a.a<z> f121570e;

    /* renamed from: f  reason: collision with root package name */
    public int f121571f = -1;

    /* renamed from: h  reason: collision with root package name */
    private SearchUser f121572h;

    /* renamed from: i  reason: collision with root package name */
    private com.ss.android.ugc.aweme.discover.mixfeed.b.a f121573i;

    /* renamed from: j  reason: collision with root package name */
    private r f121574j;

    /* renamed from: k  reason: collision with root package name */
    private final Context f121575k;

    static {
        Covode.recordClassIndex(79181);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return 2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        l.d(view, "");
        l.d(obj, "");
        return view == obj;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(79182);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.q.b$b  reason: collision with other inner class name */
    static final class RunnableC3142b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f121576a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RtlViewPager f121577b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f121578c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f121579d;

        static {
            Covode.recordClassIndex(79183);
        }

        RunnableC3142b(b bVar, RtlViewPager rtlViewPager, View view, int i2) {
            this.f121576a = bVar;
            this.f121577b = rtlViewPager;
            this.f121578c = view;
            this.f121579d = i2;
        }

        public final void run() {
            RtlViewPager rtlViewPager = this.f121577b;
            View view = this.f121578c;
            if (rtlViewPager.f144523c) {
                rtlViewPager.f144524d = view;
                rtlViewPager.requestLayout();
            }
            if (this.f121579d == 1) {
                ProductListView productListView = this.f121576a.f121567b;
                if (productListView == null) {
                    l.a("productListView");
                }
                RecyclerView.a adapter = productListView.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
            }
        }
    }

    public b(Context context) {
        l.d(context, "");
        this.f121575k = context;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i2) {
        if (i2 == 0) {
            return this.f121575k.getString(R.string.fhm);
        }
        if (i2 != 1) {
            return null;
        }
        return this.f121575k.getString(R.string.a52);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i2) {
        View view;
        MethodCollector.i(2356);
        l.d(viewGroup, "");
        boolean z = false;
        if (i2 == 0) {
            if (this.f121566a != null) {
                z = true;
            }
            if (!z) {
                c cVar = new c(null, viewGroup, 1);
                this.f121566a = cVar;
                SearchUser searchUser = this.f121572h;
                if (searchUser == null) {
                    l.a("user");
                }
                cVar.b(searchUser);
                c cVar2 = this.f121566a;
                if (cVar2 == null) {
                    l.a("videoAndPlaylistController");
                }
                cVar2.b();
                c cVar3 = this.f121566a;
                if (cVar3 == null) {
                    l.a("videoAndPlaylistController");
                }
                com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar = this.f121573i;
                if (aVar == null) {
                    l.a("aladinMobParam");
                }
                r rVar = this.f121574j;
                if (rVar == null) {
                    l.a("itemMobParam");
                }
                cVar3.a(aVar, rVar);
                c cVar4 = this.f121566a;
                if (cVar4 == null) {
                    l.a("videoAndPlaylistController");
                }
                SearchUser searchUser2 = this.f121572h;
                if (searchUser2 == null) {
                    l.a("user");
                }
                cVar4.a(searchUser2);
            }
            c cVar5 = this.f121566a;
            if (cVar5 == null) {
                l.a("videoAndPlaylistController");
            }
            view = cVar5.f121580a;
            if (view == null) {
                l.a("rootView");
            }
        } else if (i2 == 1) {
            if (this.f121567b == null) {
                View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.axe, viewGroup, false);
                if (a2 != null) {
                    ProductListView productListView = (ProductListView) a2;
                    productListView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    productListView.a(this.f121569d, this.f121568c, this.f121570e);
                    SearchUser searchUser3 = this.f121572h;
                    if (searchUser3 == null) {
                        l.a("user");
                    }
                    com.ss.android.ugc.aweme.search.ecom.a.b bVar = searchUser3.productGroup;
                    l.b(bVar, "");
                    productListView.setData(bVar);
                    productListView.P = false;
                    this.f121567b = productListView;
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ecom.ProductListView");
                    MethodCollector.o(2356);
                    throw nullPointerException;
                }
            }
            view = this.f121567b;
            if (view == null) {
                l.a("productListView");
            }
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("UserItemPagerAdapter only supports 2 items, but item pos #" + i2 + " found instead.");
            MethodCollector.o(2356);
            throw illegalStateException;
        }
        viewGroup.addView(view);
        MethodCollector.o(2356);
        return view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        MethodCollector.i(2358);
        l.d(viewGroup, "");
        l.d(obj, "");
        if (!(obj instanceof View)) {
            obj = null;
        }
        View view = (View) obj;
        if (view != null) {
            viewGroup.removeView(view);
            MethodCollector.o(2358);
            return;
        }
        MethodCollector.o(2358);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        l.d(viewGroup, "");
        l.d(obj, "");
        super.setPrimaryItem(viewGroup, i2, obj);
        if (!(viewGroup instanceof RtlViewPager)) {
            viewGroup = null;
        }
        RtlViewPager rtlViewPager = (RtlViewPager) viewGroup;
        if (rtlViewPager != null) {
            if (!(obj instanceof View)) {
                obj = null;
            }
            View view = (View) obj;
            if (view != null && this.f121571f != i2) {
                this.f121571f = i2;
                view.post(new RunnableC3142b(this, rtlViewPager, view, i2));
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f);
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
        }
    }

    public final void a(SearchUser searchUser, com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar, r rVar, boolean z) {
        l.d(searchUser, "");
        l.d(aVar, "");
        l.d(rVar, "");
        this.f121572h = searchUser;
        this.f121573i = aVar;
        this.f121574j = rVar;
        if (this.f121566a != null && (z || this.f121571f == 0)) {
            c cVar = this.f121566a;
            if (cVar == null) {
                l.a("videoAndPlaylistController");
            }
            cVar.a(aVar, rVar);
            c cVar2 = this.f121566a;
            if (cVar2 == null) {
                l.a("videoAndPlaylistController");
            }
            cVar2.a(searchUser);
        }
        if (this.f121567b != null && this.f121571f == 1) {
            ProductListView productListView = this.f121567b;
            if (productListView == null) {
                l.a("productListView");
            }
            com.ss.android.ugc.aweme.search.ecom.a.b bVar = searchUser.productGroup;
            l.b(bVar, "");
            productListView.setData(bVar);
        }
    }
}

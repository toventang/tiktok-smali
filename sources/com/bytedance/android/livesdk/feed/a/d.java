package com.bytedance.android.livesdk.feed.a;

import android.os.Bundle;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.k;
import com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel;
import com.bytedance.android.livesdk.livesetting.feed.I18nZhibozhongAnimationTagSetting;
import com.bytedance.android.livesdk.util.rxutils.i;
import com.bytedance.covode.number.Covode;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public a f17230a;

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f17231b;

    /* renamed from: c  reason: collision with root package name */
    public BaseFeedDataViewModel f17232c;

    /* renamed from: d  reason: collision with root package name */
    public RecyclerView.i f17233d;

    /* renamed from: e  reason: collision with root package name */
    public RecyclerView.h f17234e;

    /* renamed from: f  reason: collision with root package name */
    public k f17235f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f17236g;

    /* renamed from: h  reason: collision with root package name */
    public b f17237h;

    /* renamed from: i  reason: collision with root package name */
    public BannerSwipeRefreshLayout.a f17238i;

    /* renamed from: j  reason: collision with root package name */
    public Bundle f17239j;

    /* renamed from: k  reason: collision with root package name */
    boolean f17240k;

    /* renamed from: l  reason: collision with root package name */
    private m f17241l;

    public interface b {
        static {
            Covode.recordClassIndex(9572);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(9568);
    }

    private d() {
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public a f17244a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f17245b;

        /* renamed from: c  reason: collision with root package name */
        public BaseFeedDataViewModel f17246c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView.i f17247d;

        /* renamed from: e  reason: collision with root package name */
        public int f17248e = 2;

        /* renamed from: f  reason: collision with root package name */
        public RecyclerView.h f17249f;

        /* renamed from: g  reason: collision with root package name */
        public m f17250g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f17251h;

        /* renamed from: i  reason: collision with root package name */
        public k f17252i;

        /* renamed from: j  reason: collision with root package name */
        public b f17253j;

        /* renamed from: k  reason: collision with root package name */
        public BannerSwipeRefreshLayout.a f17254k;

        /* renamed from: l  reason: collision with root package name */
        public Bundle f17255l;

        static {
            Covode.recordClassIndex(9571);
        }

        public a() {
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(this.f17248e, 1);
            staggeredGridLayoutManager.i();
            this.f17247d = staggeredGridLayoutManager;
        }
    }

    public final void a() {
        a aVar = this.f17230a;
        AnonymousClass1 r1 = new o() {
            /* class com.bytedance.android.livesdk.feed.a.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(9569);
            }

            @Override // com.bytedance.android.livesdk.feed.a.o
            public final BannerSwipeRefreshLayout.a b() {
                return d.this.f17238i;
            }

            @Override // com.bytedance.android.livesdk.feed.a.o
            public final FeedDataKey a() {
                return d.this.f17232c.e();
            }
        };
        aVar.f17225k = r1.a();
        aVar.w = new Object[]{r1, aVar.p, aVar.q, aVar.r, aVar.s, aVar.t};
        this.f17231b.setAdapter(this.f17230a);
        this.f17231b.setLayoutManager(this.f17233d);
        this.f17231b.a(new RecyclerView.n() {
            /* class com.bytedance.android.livesdk.feed.a.d.AnonymousClass2 */

            static {
                Covode.recordClassIndex(9570);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2) {
                super.a(recyclerView, i2);
                if (i2 == 0) {
                    a aVar = d.this.f17230a;
                    aVar.a(aVar.f17227m, true);
                    if (I18nZhibozhongAnimationTagSetting.INSTANCE.getValue()) {
                        aVar.t.onNext(i.f22198c);
                        return;
                    }
                    return;
                }
                d.this.f17230a.b();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2, int i3) {
                super.a(recyclerView, i2, i3);
                if (i2 > 0 || i3 > 0) {
                    d.this.f17230a.b();
                }
            }
        });
        RecyclerView.h hVar = this.f17234e;
        if (hVar != null) {
            this.f17231b.a(hVar);
        }
        this.f17230a.a((PagingViewModel) this.f17232c);
        this.f17230a.o.a(e.f17256a).a(new f(this), g.f17258a);
        this.f17230a.p.a(new h(this), i.f17260a);
        this.f17230a.q.a(new j(this), k.f17262a);
        this.f17232c.c();
        this.f17232c.f17697a.a(this.f17241l);
        this.f17232c.f17698i.observeForever(new l(this));
        this.f17232c.v.observe(this.f17241l, new m(this));
        this.f17232c.n.observe(this.f17241l, new n(this));
    }

    private d(m mVar, a aVar, RecyclerView recyclerView, BaseFeedDataViewModel baseFeedDataViewModel) {
        this.f17241l = mVar;
        this.f17230a = aVar;
        this.f17231b = recyclerView;
        this.f17232c = baseFeedDataViewModel;
    }

    public /* synthetic */ d(m mVar, a aVar, RecyclerView recyclerView, BaseFeedDataViewModel baseFeedDataViewModel, byte b2) {
        this(mVar, aVar, recyclerView, baseFeedDataViewModel);
    }
}

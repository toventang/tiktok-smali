package com.bytedance.android.livesdk.feed.drawerfeed.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.feed.banner.RoundIndicatorView;
import com.bytedance.android.livesdk.feed.banner.b;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.n;
import com.bytedance.android.livesdk.ui.b;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.l.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a extends b<FeedItem> {

    /* renamed from: a  reason: collision with root package name */
    ViewPager f17353a;

    /* renamed from: b  reason: collision with root package name */
    RoundIndicatorView f17354b;

    /* renamed from: c  reason: collision with root package name */
    b.RunnableC0363b f17355c;

    /* renamed from: d  reason: collision with root package name */
    c<Object> f17356d;

    /* renamed from: e  reason: collision with root package name */
    c<Object> f17357e;

    /* renamed from: f  reason: collision with root package name */
    c<Boolean> f17358f;

    /* renamed from: g  reason: collision with root package name */
    private com.bytedance.android.livesdk.feed.banner.a.c f17359g;

    /* renamed from: h  reason: collision with root package name */
    private b.a f17360h = new b.a(this.f17353a, this.f17355c, this.f17363k);

    /* renamed from: i  reason: collision with root package name */
    private List<n> f17361i;

    /* renamed from: j  reason: collision with root package name */
    private Context f17362j;

    /* renamed from: k  reason: collision with root package name */
    private String f17363k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f17364l;

    /* renamed from: m  reason: collision with root package name */
    private p f17365m;
    private ViewGroup n;

    static {
        Covode.recordClassIndex(9628);
    }

    @Override // com.bytedance.android.livesdk.ui.b
    public final boolean c() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.b
    public final void b() {
        super.b();
        this.f17364l = false;
        b.a aVar = this.f17360h;
        if (aVar != null) {
            aVar.f17313c = false;
        }
        d();
    }

    @Override // com.bytedance.android.livesdk.ui.b
    public final void a() {
        super.a();
        boolean z = true;
        this.f17364l = true;
        b.a aVar = this.f17360h;
        if (aVar != null) {
            aVar.f17313c = true;
        }
        List<n> list = this.f17361i;
        if (list == null || list.size() > 1) {
            z = false;
        }
        a(z);
    }

    public final void d() {
        this.f17353a.removeCallbacks(this.f17355c);
        this.f17353a.clearOnPageChangeListeners();
        b.a aVar = this.f17360h;
        if (aVar != null) {
            aVar.f17311a = false;
        }
    }

    private void a(List<n> list) {
        int i2;
        b.a aVar = this.f17360h;
        if (aVar != null) {
            i2 = aVar.f17312b;
        } else {
            i2 = 0;
        }
        if (list != null && !list.isEmpty() && this.f17364l) {
            int size = i2 % list.size();
            HashMap hashMap = new HashMap();
            hashMap.put("show_source", this.f17363k);
            hashMap.put("banner_id", String.valueOf(list.get(size).getId()));
            hashMap.put("banner_position", String.valueOf(size + 1));
            b.a.a("banner_show").a((Map<String, String>) hashMap).a().b();
        }
    }

    public final void a(boolean z) {
        if (this.f17364l && this.itemView != null && this.itemView.getVisibility() == 0) {
            if (z) {
                a(this.f17361i);
            }
            List<n> list = this.f17361i;
            if (list != null && list.size() > 1 && this.f17353a != null && this.f17354b != null) {
                b.a aVar = this.f17360h;
                if (aVar != null) {
                    aVar.f17311a = true;
                }
                this.f17353a.clearOnPageChangeListeners();
                this.f17353a.addOnPageChangeListener(this.f17360h);
                this.f17354b.setViewPager(this.f17353a);
                a(this.f17353a, this.f17355c);
            }
        }
    }

    private static void a(ViewPager viewPager, Runnable runnable) {
        viewPager.removeCallbacks(runnable);
        viewPager.postDelayed(runnable, 5000);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.bytedance.android.livesdk.ui.b
    public final /* synthetic */ void a(FeedItem feedItem, int i2) {
        List<n> list;
        List<n> list2;
        int i3;
        FeedItem feedItem2 = feedItem;
        if (!(feedItem2 == null || feedItem2.banners == null || (list2 = this.f17361i) == (list = feedItem2.banners))) {
            if (list2 == null ? list == null : list != null) {
                if (list2.size() == list.size()) {
                    for (int i4 = 0; i4 < list2.size(); i4++) {
                        n nVar = list2.get(i4);
                        n nVar2 = list.get(i4);
                        if ((nVar == null || nVar.a(nVar2)) && (nVar2 == null || nVar2.a(nVar))) {
                        }
                    }
                    return;
                }
            }
            a(list);
            this.f17353a.removeCallbacks(this.f17355c);
            this.f17361i = list;
            this.f17353a.setAdapter(null);
            if (list == null || list.isEmpty()) {
                ViewGroup.LayoutParams layoutParams = this.f17353a.getLayoutParams();
                layoutParams.height = 0;
                this.f17353a.setLayoutParams(layoutParams);
                this.f17359g = null;
                this.f17354b.setVisibility(8);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = this.f17353a.getLayoutParams();
            Iterator<n> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i3 = 0;
                    break;
                }
                n next = it.next();
                if (!(next == null || next.f19725f == 0)) {
                    i3 = (this.n.getMeasuredWidth() * next.f19724e) / next.f19725f;
                    break;
                }
            }
            if (i3 != layoutParams2.height) {
                layoutParams2.height = i3;
                this.f17353a.setLayoutParams(layoutParams2);
            }
            if (this.f17359g == null) {
                this.f17359g = new com.bytedance.android.livesdk.feed.banner.a.c(this.itemView.getContext(), LayoutInflater.from(this.itemView.getContext()), this.f17363k, this.f17365m);
            }
            this.f17359g.a(this.f17361i);
            this.f17353a.setAdapter(this.f17359g);
            if (this.f17361i.size() > 1) {
                a(this.f17353a, this.f17355c);
                this.f17353a.clearOnPageChangeListeners();
                this.f17353a.addOnPageChangeListener(this.f17360h);
                b.a aVar = this.f17360h;
                if (aVar != null) {
                    aVar.f17311a = true;
                }
                this.f17354b.setViewPager(this.f17353a);
                this.f17354b.setVisibility(0);
                this.f17354b.setCount(list.size());
                this.f17353a.setCurrentItem(this.f17361i.size() * (Integer.MAX_VALUE / (this.f17361i.size() * 2)));
                return;
            }
            this.f17354b.setVisibility(8);
        }
    }

    public a(View view, FeedDataKey feedDataKey, c<Object> cVar, c<Object> cVar2, c<Boolean> cVar3, p pVar, ViewGroup viewGroup) {
        super(view);
        this.n = viewGroup;
        this.f17353a = (ViewPager) view.findViewById(R.id.fk_);
        this.f17354b = (RoundIndicatorView) view.findViewById(R.id.bo0);
        this.f17362j = view.getContext();
        this.f17363k = feedDataKey.f17458b;
        this.f17365m = pVar;
        this.f17356d = cVar;
        this.f17357e = cVar2;
        this.f17358f = cVar3;
        b.RunnableC0363b bVar = new b.RunnableC0363b(this.f17353a);
        this.f17355c = bVar;
        this.f17353a.removeCallbacks(bVar);
        this.f17353a.setOnTouchListener(new b(this));
        this.f17354b.setViewPager(this.f17353a);
        RoundIndicatorView roundIndicatorView = this.f17354b;
        b.a aVar = this.f17360h;
        if (roundIndicatorView.f17269b != null) {
            roundIndicatorView.f17269b.addOnPageChangeListener(aVar);
        }
        this.f17358f.a(new c(this), d.f17378a);
        this.f17356d.a(new e(this), f.f17380a);
        this.f17357e.a(new g(this), h.f17382a);
    }
}

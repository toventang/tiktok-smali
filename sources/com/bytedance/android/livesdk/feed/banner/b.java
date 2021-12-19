package com.bytedance.android.livesdk.feed.banner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.feed.banner.a.c;
import com.bytedance.android.livesdk.feed.p;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.n;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class b extends com.bytedance.android.livesdk.ui.b<FeedItem> {

    /* renamed from: a  reason: collision with root package name */
    ViewPager f17301a;

    /* renamed from: b  reason: collision with root package name */
    RoundIndicatorView f17302b;

    /* renamed from: c  reason: collision with root package name */
    private c f17303c;

    /* renamed from: d  reason: collision with root package name */
    private RunnableC0363b f17304d;

    /* renamed from: e  reason: collision with root package name */
    private a f17305e;

    /* renamed from: f  reason: collision with root package name */
    private List<n> f17306f;

    /* renamed from: g  reason: collision with root package name */
    private Context f17307g;

    /* renamed from: h  reason: collision with root package name */
    private String f17308h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f17309i;

    /* renamed from: j  reason: collision with root package name */
    private p f17310j;

    static {
        Covode.recordClassIndex(9596);
    }

    @Override // com.bytedance.android.livesdk.ui.b
    public final boolean c() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.b
    public final void b() {
        super.b();
        this.f17309i = false;
        a aVar = this.f17305e;
        if (aVar != null) {
            aVar.f17313c = false;
        }
        this.f17301a.removeCallbacks(this.f17304d);
        this.f17301a.clearOnPageChangeListeners();
        a aVar2 = this.f17305e;
        if (aVar2 != null) {
            aVar2.f17311a = false;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.banner.b$b  reason: collision with other inner class name */
    public static class RunnableC0363b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        ViewPager f17318a;

        static {
            Covode.recordClassIndex(9598);
        }

        public final void run() {
            if (com.bytedance.android.live.uikit.c.a.a(y.e())) {
                ViewPager viewPager = this.f17318a;
                viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                return;
            }
            try {
                Field declaredField = ViewPager.class.getDeclaredField("mFirstLayout");
                declaredField.setAccessible(true);
                declaredField.set(this.f17318a, false);
                declaredField.setAccessible(false);
                Method declaredMethod = ViewPager.class.getDeclaredMethod("setCurrentItemInternal", Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE);
                declaredMethod.setAccessible(true);
                ViewPager viewPager2 = this.f17318a;
                declaredMethod.invoke(viewPager2, Integer.valueOf(viewPager2.getCurrentItem() + 1), true, true, 1);
                declaredMethod.setAccessible(false);
            } catch (Exception unused) {
                ViewPager viewPager3 = this.f17318a;
                viewPager3.setCurrentItem(viewPager3.getCurrentItem() + 1);
            }
        }

        public RunnableC0363b(ViewPager viewPager) {
            this.f17318a = viewPager;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.b
    public final void a() {
        super.a();
        this.f17309i = true;
        a aVar = this.f17305e;
        if (aVar != null) {
            aVar.f17313c = true;
        }
        if (this.f17309i && this.itemView != null && this.itemView.getVisibility() == 0) {
            a(this.f17306f);
            List<n> list = this.f17306f;
            if (list != null && list.size() > 1 && this.f17301a != null && this.f17302b != null) {
                a aVar2 = this.f17305e;
                if (aVar2 != null) {
                    aVar2.f17311a = true;
                }
                this.f17301a.clearOnPageChangeListeners();
                this.f17301a.addOnPageChangeListener(this.f17305e);
                this.f17302b.setViewPager(this.f17301a);
                a(this.f17301a, this.f17304d);
            }
        }
    }

    private void a(List<n> list) {
        int i2;
        a aVar = this.f17305e;
        if (aVar != null) {
            i2 = aVar.f17312b;
        } else {
            i2 = 0;
        }
        if (list != null && !list.isEmpty() && this.f17309i) {
            HashMap hashMap = new HashMap();
            hashMap.put("show_source", this.f17308h);
            hashMap.put("banner_id", String.valueOf(list.get(i2 % list.size()).getId()));
            b.a.a("banner_show").a((Map<String, String>) hashMap).b();
        }
    }

    public static class a implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        public boolean f17311a;

        /* renamed from: b  reason: collision with root package name */
        public int f17312b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f17313c = true;

        /* renamed from: d  reason: collision with root package name */
        public boolean f17314d = true;

        /* renamed from: e  reason: collision with root package name */
        private ViewPager f17315e;

        /* renamed from: f  reason: collision with root package name */
        private RunnableC0363b f17316f;

        /* renamed from: g  reason: collision with root package name */
        private String f17317g;

        static {
            Covode.recordClassIndex(9597);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            c cVar;
            n nVar;
            this.f17312b = i2;
            if (this.f17311a) {
                b.a(this.f17315e, this.f17316f);
                if (this.f17313c && (cVar = (c) this.f17315e.getAdapter()) != null) {
                    c cVar2 = (c) this.f17315e.getAdapter();
                    if (cVar2.f17298a != null && !cVar2.f17298a.isEmpty() && i2 >= 0 && (nVar = cVar2.f17298a.get(i2 % cVar2.f17298a.size())) != null) {
                        this.f17314d = false;
                        HashMap hashMap = new HashMap();
                        hashMap.put("show_source", this.f17317g);
                        hashMap.put("banner_id", String.valueOf(nVar.getId()));
                        hashMap.put("banner_position", String.valueOf((i2 % cVar.f17298a.size()) + 1));
                        b.a.a("banner_show").a((Map<String, String>) hashMap).a().b();
                        ViewPager viewPager = this.f17315e;
                        if (viewPager instanceof c) {
                            c cVar3 = (c) viewPager;
                            if (cVar3.f17319a == null || cVar3.f17319a.getAction() == 3 || cVar3.f17319a.getAction() == 1) {
                                cVar3.post(new d(cVar3));
                            }
                            com.bytedance.android.live.core.c.a.a(3, "BannerViewPager", "onPageSelected ");
                        }
                    }
                }
            }
        }

        public a(ViewPager viewPager, RunnableC0363b bVar, String str) {
            this.f17315e = viewPager;
            this.f17316f = bVar;
            this.f17317g = str;
        }
    }

    public static void a(ViewPager viewPager, Runnable runnable) {
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
        if (!(feedItem2 == null || feedItem2.banners == null || (list2 = this.f17306f) == (list = feedItem2.banners))) {
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
            this.f17301a.removeCallbacks(this.f17304d);
            this.f17306f = list;
            this.f17301a.setAdapter(null);
            if (list == null || list.isEmpty()) {
                ViewGroup.LayoutParams layoutParams = this.f17301a.getLayoutParams();
                layoutParams.height = 0;
                this.f17301a.setLayoutParams(layoutParams);
                this.f17303c = null;
                this.f17302b.setVisibility(8);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = this.f17301a.getLayoutParams();
            Iterator<n> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i3 = 0;
                    break;
                }
                n next = it.next();
                if (!(next == null || next.f19725f == 0)) {
                    i3 = (com.bytedance.common.utility.n.a(this.f17307g) * next.f19724e) / next.f19725f;
                    break;
                }
            }
            if (i3 != layoutParams2.height) {
                layoutParams2.height = i3;
                this.f17301a.setLayoutParams(layoutParams2);
            }
            if (this.f17303c == null) {
                this.f17303c = new c(this.itemView.getContext(), LayoutInflater.from(this.itemView.getContext()), this.f17308h, this.f17310j);
            }
            this.f17303c.a(this.f17306f);
            this.f17301a.setAdapter(this.f17303c);
            if (this.f17306f.size() > 1) {
                a(this.f17301a, this.f17304d);
                this.f17301a.clearOnPageChangeListeners();
                this.f17301a.addOnPageChangeListener(this.f17305e);
                a aVar = this.f17305e;
                if (aVar != null) {
                    aVar.f17311a = true;
                }
                this.f17302b.setViewPager(this.f17301a);
                this.f17302b.setVisibility(0);
                this.f17302b.setCount(list.size());
                this.f17301a.setCurrentItem(this.f17306f.size() * (Integer.MAX_VALUE / (this.f17306f.size() * 2)));
                return;
            }
            this.f17302b.setVisibility(8);
        }
    }
}

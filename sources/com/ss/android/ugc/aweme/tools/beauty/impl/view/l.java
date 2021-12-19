package com.ss.android.ugc.aweme.tools.beauty.impl.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.tools.beauty.b.a.g;
import com.ss.android.ugc.aweme.tools.beauty.b.c.b;
import com.ss.android.ugc.aweme.tools.beauty.b.c.c;
import com.ss.android.ugc.aweme.tools.beauty.b.c.d;
import com.ss.android.ugc.aweme.tools.beauty.b.c.e;
import com.ss.android.ugc.aweme.tools.beauty.g.m;
import com.ss.android.ugc.aweme.tools.beauty.h;
import com.ss.android.ugc.aweme.tools.beauty.impl.view.e;
import com.ss.android.ugc.aweme.tools.beauty.service.f;
import com.ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;
import h.a.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class l implements e {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<BeautySeekBar, ComposerBeautyExtraBeautify.ItemsBean> f139119a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final Context f139120b;

    /* renamed from: c  reason: collision with root package name */
    public final View f139121c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.tools.beauty.b.a.e f139122d;

    /* renamed from: e  reason: collision with root package name */
    public final e f139123e;

    /* renamed from: f  reason: collision with root package name */
    private final LinearLayout f139124f;

    /* renamed from: g  reason: collision with root package name */
    private final BeautySeekBar f139125g;

    /* renamed from: h  reason: collision with root package name */
    private final BeautySeekBar f139126h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f139127i;

    /* renamed from: j  reason: collision with root package name */
    private final TextView f139128j;

    static {
        Covode.recordClassIndex(90989);
    }

    public final boolean b() {
        if (!this.f139123e.a() || !this.f139122d.f138900j) {
            return false;
        }
        return true;
    }

    public static final class a implements BeautySeekBar.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f139129a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BeautySeekBar f139130b;

        static {
            Covode.recordClassIndex(90990);
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar.c
        public final void a() {
            String str;
            l lVar = this.f139129a;
            BeautySeekBar beautySeekBar = this.f139130b;
            e eVar = lVar.f139123e;
            boolean b2 = lVar.b();
            ComposerBeautyExtraBeautify.ItemsBean itemsBean = lVar.f139119a.get(beautySeekBar);
            if (itemsBean == null || (str = itemsBean.getTag()) == null) {
                str = "";
            }
            List<String> a2 = n.a(str);
            h.f.b.l.d(a2, "");
            ComposerBeauty d2 = eVar.d();
            if (d2 != null) {
                if (b2) {
                    f.b bVar = eVar.f139066c;
                    if (bVar != null) {
                        bVar.a(d2, a2);
                    }
                } else {
                    f.b bVar2 = eVar.f139066c;
                    if (bVar2 != null) {
                        bVar2.a(d2, e.a(d2));
                    }
                }
            }
            l lVar2 = this.f139129a;
            ComposerBeauty d3 = lVar2.f139123e.d();
            if (d3 != null) {
                lVar2.a(d3, true, false);
            }
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar.c
        public final void a(int i2) {
            String str;
            Boolean bool;
            f.b bVar;
            BeautySeekBar beautySeekBar = this.f139130b;
            g gVar = this.f139129a.f139122d.f138860d;
            int percent = beautySeekBar.getPercent();
            if (gVar.f138869a) {
                int suggestPercent = beautySeekBar.getSuggestPercent();
                int i3 = suggestPercent - gVar.f138870b;
                if (i3 < beautySeekBar.getMinPercent()) {
                    i3 = beautySeekBar.getMinPercent();
                }
                int i4 = gVar.f138870b + suggestPercent;
                if (i4 > beautySeekBar.getMaxPercent()) {
                    i4 = beautySeekBar.getMaxPercent();
                }
                if (i3 <= percent && i4 >= percent) {
                    beautySeekBar.setPercent(suggestPercent);
                    percent = suggestPercent;
                }
            }
            l lVar = this.f139129a;
            BeautySeekBar beautySeekBar2 = this.f139130b;
            e eVar = lVar.f139123e;
            ComposerBeautyExtraBeautify.ItemsBean itemsBean = lVar.f139119a.get(beautySeekBar2);
            if (itemsBean == null || (str = itemsBean.getTag()) == null) {
                str = "";
            }
            List<String> a2 = n.a(str);
            h.f.b.l.d(a2, "");
            ComposerBeauty d2 = eVar.d();
            if (!(d2 == null || (bVar = eVar.f139066c) == null)) {
                bVar.b(d2, a2);
            }
            e eVar2 = this.f139129a.f139123e;
            int maxPercent = this.f139130b.getMaxPercent();
            c cVar = (c) eVar2.f139067d.a(c.class);
            e.c cVar2 = new e.c(eVar2, percent, maxPercent);
            T t = null;
            if (cVar != null) {
                bool = Boolean.valueOf(cVar.a());
            } else {
                bool = null;
            }
            if (h.f.b.l.a((Object) bool, (Object) true)) {
                Iterator<T> it = cVar.e().f138761a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (h.f.b.l.a((Object) next, (Object) cVar.c())) {
                        t = next;
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    cVar2.a(t2);
                }
            } else if (h.f.b.l.a((Object) bool, (Object) false)) {
                Iterator<T> it2 = cVar.d().f138761a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next2 = it2.next();
                    if (h.f.b.l.a((Object) next2, (Object) cVar.b())) {
                        t = next2;
                        break;
                    }
                }
                T t3 = t;
                if (t3 != null) {
                    cVar2.a(t3);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar.c
        public final void b(int i2) {
            String str;
            Boolean bool;
            com.ss.android.ugc.aweme.tools.beauty.a.a d2;
            l lVar = this.f139129a;
            BeautySeekBar beautySeekBar = this.f139130b;
            e eVar = lVar.f139123e;
            boolean b2 = lVar.b();
            ComposerBeautyExtraBeautify.ItemsBean itemsBean = lVar.f139119a.get(beautySeekBar);
            if (itemsBean == null || (str = itemsBean.getTag()) == null) {
                str = "";
            }
            List<String> a2 = n.a(str);
            h.f.b.l.d(a2, "");
            ComposerBeauty d3 = eVar.d();
            if (d3 != null) {
                if (b2) {
                    f.b bVar = eVar.f139066c;
                    if (bVar != null) {
                        bVar.a(d3, i2, a2);
                    }
                } else {
                    f.b bVar2 = eVar.f139066c;
                    if (bVar2 != null) {
                        bVar2.a(d3, i2, e.a(d3));
                    }
                }
            }
            e eVar2 = this.f139129a.f139123e;
            BeautySeekBar beautySeekBar2 = this.f139130b;
            boolean b3 = this.f139129a.b();
            HashMap<BeautySeekBar, ComposerBeautyExtraBeautify.ItemsBean> hashMap = this.f139129a.f139119a;
            h.f.b.l.d(beautySeekBar2, "");
            h.f.b.l.d(hashMap, "");
            c cVar = (c) eVar2.f139067d.a(c.class);
            T t = null;
            if (cVar != null) {
                bool = Boolean.valueOf(cVar.a());
            } else {
                bool = null;
            }
            if (h.f.b.l.a((Object) bool, (Object) true)) {
                Iterator<T> it = cVar.e().f138761a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (h.f.b.l.a((Object) next, (Object) cVar.c())) {
                        t = next;
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    eVar2.a(i2, beautySeekBar2, b3, hashMap, t2);
                    eVar2.f139064a.c(t2);
                }
            } else if (h.f.b.l.a((Object) bool, (Object) false)) {
                Iterator<T> it2 = cVar.d().f138761a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next2 = it2.next();
                    if (h.f.b.l.a((Object) next2, (Object) cVar.b())) {
                        t = next2;
                        break;
                    }
                }
                T t3 = t;
                if (t3 != null) {
                    eVar2.a(i2, beautySeekBar2, b3, hashMap, t3);
                    eVar2.f139064a.c(t3);
                    int indexOf = cVar.d().f138761a.indexOf(t3);
                    if (indexOf >= 0 && indexOf < cVar.d().f138761a.size()) {
                        cVar.d().a(t3);
                    }
                }
            }
            b bVar3 = (b) eVar2.f139067d.a(b.class);
            if (bVar3 != null) {
                bVar3.e();
            }
            d dVar = (d) eVar2.f139067d.a(d.class);
            if (dVar != null) {
                dVar.b();
            }
            if (cVar != null && (d2 = cVar.d()) != null) {
                d2.b(false);
                d2.notifyDataSetChanged();
            }
        }

        a(l lVar, BeautySeekBar beautySeekBar) {
            this.f139129a = lVar;
            this.f139130b = beautySeekBar;
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.e
    public final void a() {
        BeautySeekBar beautySeekBar = this.f139125g;
        h.f.b.l.b(beautySeekBar, "");
        a(beautySeekBar);
        BeautySeekBar beautySeekBar2 = this.f139126h;
        h.f.b.l.b(beautySeekBar2, "");
        a(beautySeekBar2);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.e
    public final void a(int i2) {
        this.f139125g.setPercent(i2);
    }

    private final void a(BeautySeekBar beautySeekBar) {
        a(beautySeekBar, this.f139122d.f138860d);
        beautySeekBar.setOnLevelChangeListener(new a(this, beautySeekBar));
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.e
    public final void a(boolean z) {
        if (z) {
            this.f139124f.setVisibility(0);
            if (b()) {
                BeautySeekBar beautySeekBar = this.f139126h;
                h.f.b.l.b(beautySeekBar, "");
                beautySeekBar.setVisibility(0);
                return;
            }
            BeautySeekBar beautySeekBar2 = this.f139126h;
            h.f.b.l.b(beautySeekBar2, "");
            beautySeekBar2.setVisibility(8);
            return;
        }
        this.f139124f.setVisibility(8);
    }

    private static float a(Context context, float f2) {
        Resources resources = context.getResources();
        h.f.b.l.b(resources, "");
        return TypedValue.applyDimension(2, f2, resources.getDisplayMetrics());
    }

    private static void a(ComposerBeautyExtraBeautify.ItemsBean itemsBean, BeautySeekBar beautySeekBar) {
        h.a b2 = h.b(new h.a(itemsBean.getDoubleDirection(), 100, 0, itemsBean.getMax(), itemsBean.getMin(), (float) itemsBean.getValue(), 0, 396));
        a(itemsBean.getDoubleDirection(), b2.f139011h, beautySeekBar);
        beautySeekBar.setSuggestPercent(b2.f139011h);
    }

    private final void a(BeautySeekBar beautySeekBar, g gVar) {
        beautySeekBar.a(androidx.core.content.a.f.b(this.f139121c.getResources(), gVar.f138871c, this.f139120b.getTheme()), androidx.core.content.a.f.b(this.f139121c.getResources(), gVar.f138872d, this.f139120b.getTheme()), androidx.core.content.a.f.b(this.f139121c.getResources(), gVar.f138873e, this.f139120b.getTheme()));
        beautySeekBar.setDefaultCircleConfig(gVar.f138874f);
        beautySeekBar.setSuggestCircleColor(gVar.f138875g);
        Context context = beautySeekBar.getContext();
        h.f.b.l.b(context, "");
        beautySeekBar.setBarHeight(r.a(context, gVar.f138876h));
        Context context2 = beautySeekBar.getContext();
        h.f.b.l.b(context2, "");
        beautySeekBar.setTextSize(a(context2, gVar.f138877i));
        Context context3 = beautySeekBar.getContext();
        h.f.b.l.b(context3, "");
        beautySeekBar.setBarPadding(r.a(context3, gVar.f138878j));
    }

    private static void a(boolean z, int i2, BeautySeekBar beautySeekBar) {
        if (z || i2 != 0) {
            beautySeekBar.setNeedShowSuggestCircle(true);
        } else {
            beautySeekBar.setNeedShowSuggestCircle(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.e
    public final void a(ComposerBeauty composerBeauty, boolean z, boolean z2) {
        List<ComposerBeautyExtraBeautify.ItemsBean> items;
        ComposerBeautyExtraBeautify.ItemsBean itemsBean;
        h.f.b.l.d(composerBeauty, "");
        if (z) {
            if (composerBeauty.isBeautyMode()) {
                e eVar = this.f139123e;
                h.f.b.l.d(composerBeauty, "");
                m mVar = eVar.f139064a;
                new e.b(eVar);
                mVar.a(composerBeauty);
            } else {
                e eVar2 = this.f139123e;
                h.f.b.l.d(composerBeauty, "");
                eVar2.f139064a.a(composerBeauty, new e.a(eVar2));
            }
        }
        if (z2) {
            List<ComposerBeautyExtraBeautify.ItemsBean> items2 = composerBeauty.getBeautifyExtra().getItems();
            if (items2 != null && (!items2.isEmpty())) {
                h.a b2 = h.b(new h.a(items2.get(0).getDoubleDirection(), 100, 0, items2.get(0).getMax(), items2.get(0).getMin(), this.f139123e.a(composerBeauty, items2.get(0).getTag(), (float) items2.get(0).getValue()), 0, 396));
                if (items2.get(0).getDoubleDirection()) {
                    this.f139125g.a(50, -50, false);
                } else {
                    this.f139125g.a(100, 0, true);
                }
                this.f139125g.setPercent(b2.f139011h);
                if (!this.f139122d.f138900j || items2.get(0).getName().length() <= 0) {
                    this.f139127i.setVisibility(8);
                } else {
                    this.f139127i.setVisibility(0);
                    this.f139127i.setText(items2.get(0).getName());
                }
                this.f139128j.setVisibility(8);
                List<ComposerBeautyExtraBeautify.ItemsBean> items3 = composerBeauty.getBeautifyExtra().getItems();
                if (!(items3 == null || (itemsBean = (ComposerBeautyExtraBeautify.ItemsBean) n.g((List) items3)) == null)) {
                    BeautySeekBar beautySeekBar = this.f139125g;
                    h.f.b.l.b(beautySeekBar, "");
                    a(itemsBean, beautySeekBar);
                }
            }
            if (b() && (items = composerBeauty.getBeautifyExtra().getItems()) != null && items.size() >= 2) {
                h.a b3 = h.b(new h.a(items.get(1).getDoubleDirection(), 100, 0, items.get(1).getMax(), items.get(1).getMin(), this.f139123e.a(composerBeauty, items.get(1).getTag(), (float) items.get(1).getValue()), 0, 396));
                if (items.get(1).getDoubleDirection()) {
                    this.f139126h.a(50, -50, false);
                } else {
                    this.f139126h.a(100, 0, true);
                }
                this.f139126h.setPercent(b3.f139011h);
                if (!this.f139122d.f138900j || items.get(1).getName().length() <= 0) {
                    this.f139128j.setVisibility(8);
                } else {
                    this.f139128j.setVisibility(0);
                    this.f139128j.setText(items.get(1).getName());
                }
                BeautySeekBar beautySeekBar2 = this.f139126h;
                h.f.b.l.b(beautySeekBar2, "");
                a(items.get(1), beautySeekBar2);
                HashMap<BeautySeekBar, ComposerBeautyExtraBeautify.ItemsBean> hashMap = this.f139119a;
                BeautySeekBar beautySeekBar3 = this.f139125g;
                h.f.b.l.b(beautySeekBar3, "");
                hashMap.put(beautySeekBar3, items.get(0));
                HashMap<BeautySeekBar, ComposerBeautyExtraBeautify.ItemsBean> hashMap2 = this.f139119a;
                BeautySeekBar beautySeekBar4 = this.f139126h;
                h.f.b.l.b(beautySeekBar4, "");
                hashMap2.put(beautySeekBar4, items.get(1));
            }
        }
    }

    public l(Context context, View view, com.ss.android.ugc.aweme.tools.beauty.b.a.e eVar, e eVar2) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(view, "");
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(eVar2, "");
        this.f139120b = context;
        this.f139121c = view;
        this.f139122d = eVar;
        this.f139123e = eVar2;
        View findViewById = view.findViewById(R.id.do5);
        h.f.b.l.b(findViewById, "");
        this.f139124f = (LinearLayout) findViewById;
        this.f139125g = (BeautySeekBar) view.findViewById(R.id.d2q);
        this.f139126h = (BeautySeekBar) view.findViewById(R.id.d2r);
        View findViewById2 = view.findViewById(R.id.f6w);
        h.f.b.l.b(findViewById2, "");
        this.f139127i = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.f6x);
        h.f.b.l.b(findViewById3, "");
        this.f139128j = (TextView) findViewById3;
    }
}

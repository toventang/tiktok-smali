package com.ss.android.ugc.aweme.emoji.emojichoose;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.emoji.b.a;
import com.ss.android.ugc.aweme.emoji.b.f;
import com.ss.android.ugc.aweme.emoji.b.g;
import com.ss.android.ugc.aweme.emoji.d.b;
import com.ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.List;

public final class h extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.emoji.b.h f89244a;

    /* renamed from: b  reason: collision with root package name */
    public g f89245b;

    /* renamed from: c  reason: collision with root package name */
    private i f89246c = new i(1);

    /* renamed from: d  reason: collision with root package name */
    private SwipeControlledViewPager f89247d;

    static {
        Covode.recordClassIndex(56097);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        int i2 = 0;
        for (f fVar : this.f89245b.a().f89278b) {
            i2 += fVar.g();
        }
        return i2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final /* synthetic */ Object instantiateItem(final ViewGroup viewGroup, int i2) {
        MethodCollector.i(657);
        i iVar = this.f89246c;
        SwipeControlledViewPager swipeControlledViewPager = this.f89247d;
        g gVar = this.f89245b;
        AnonymousClass1 r12 = new p() {
            /* class com.ss.android.ugc.aweme.emoji.emojichoose.h.AnonymousClass1 */

            static {
                Covode.recordClassIndex(56098);
            }

            @Override // com.ss.android.ugc.aweme.emoji.emojichoose.p
            public final void a() {
                h.this.f89244a.a();
            }

            @Override // com.ss.android.ugc.aweme.emoji.emojichoose.p
            public final void c() {
                h.this.f89244a.b();
            }

            @Override // com.ss.android.ugc.aweme.emoji.emojichoose.p
            public final void b() {
                Context context = viewGroup.getContext();
                if (context != null) {
                    SmartRouter.buildRoute(context, "//emoji_manager").open();
                }
            }

            @Override // com.ss.android.ugc.aweme.emoji.emojichoose.p
            public final void a(String str) {
                h.this.f89244a.a(str, 1);
            }

            @Override // com.ss.android.ugc.aweme.emoji.emojichoose.p
            public final void a(View view, a aVar, int i2) {
                if (i2 == 4) {
                    h.this.f89244a.a(aVar, i2, ((b) h.this.f89245b.a().f89277a).f89120b.indexOf(aVar.f89106d));
                    return;
                }
                h.this.f89244a.a(aVar, i2, -1);
            }
        };
        m a2 = gVar.a();
        f b2 = a2.b(i2);
        if (b2 == null || !b2.i()) {
            View a3 = i.a(viewGroup, new g());
            MethodCollector.o(657);
            return a3;
        }
        if (b2.j() == 3) {
            if (com.ss.android.ugc.aweme.emoji.h.a.f89327b == 0) {
                View a4 = i.a(viewGroup, new g());
                MethodCollector.o(657);
                return a4;
            } else if (b2.k() == 0) {
                if (iVar.f89251b == 1) {
                    View a5 = i.a(viewGroup, new e(viewGroup.getContext().getString(R.string.bmx)));
                    MethodCollector.o(657);
                    return a5;
                } else if (iVar.f89251b == 0) {
                    View a6 = i.a(viewGroup, new a());
                    MethodCollector.o(657);
                    return a6;
                }
            }
        }
        List<a> c2 = a2.c(i2);
        int d2 = a2.d(i2);
        if (b2.j() == 4) {
            if (com.ss.android.ugc.aweme.emoji.d.a.f89115a == 0) {
                View a7 = i.a(viewGroup, new g());
                MethodCollector.o(657);
                return a7;
            } else if (d2 <= 0 && (com.bytedance.common.utility.collection.b.a((Collection) c2) || !c2.get(0).a())) {
                View a8 = i.a(viewGroup, new e(viewGroup.getContext().getString(R.string.bmz)));
                MethodCollector.o(657);
                return a8;
            }
        }
        String a9 = com.a.a(iVar.f89250a, new Object[]{b2.l(), String.valueOf(d2)});
        f fVar = (f) iVar.f89252c.remove(a9);
        if (fVar != null) {
            iVar.f89252c.put(a9, fVar);
            View view = fVar.f89232a;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            if (viewGroup.indexOfChild(view) < 0) {
                viewGroup.addView(view);
            }
            iVar.a(fVar, c2, b2, r12, swipeControlledViewPager, a2, i2);
            MethodCollector.o(657);
            return view;
        }
        f fVar2 = new f(viewGroup, b2.j());
        iVar.f89252c.put(a9, fVar2);
        View view2 = fVar2.f89232a;
        if (viewGroup.indexOfChild(view2) < 0) {
            viewGroup.addView(view2);
        }
        iVar.a(fVar2, c2, b2, r12, swipeControlledViewPager, a2, i2);
        MethodCollector.o(657);
        return view2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        MethodCollector.i(653);
        viewGroup.removeView((View) obj);
        MethodCollector.o(653);
    }

    public h(com.ss.android.ugc.aweme.emoji.b.h hVar, g gVar, SwipeControlledViewPager swipeControlledViewPager) {
        this.f89244a = hVar;
        this.f89245b = gVar;
        this.f89247d = swipeControlledViewPager;
    }
}

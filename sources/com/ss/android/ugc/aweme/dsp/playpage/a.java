package com.ss.android.ugc.aweme.dsp.playpage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.dsp.playerservice.b.c;
import com.ss.android.ugc.aweme.dsp.playpage.base.b;
import h.f.b.l;
import java.util.ArrayList;

public final class a extends PagerAdapter {

    /* renamed from: c  reason: collision with root package name */
    public static final C1989a f83672c = new C1989a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<com.ss.android.ugc.aweme.dsp.playpage.playview.a> f83673a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final Context f83674b;

    static {
        Covode.recordClassIndex(52206);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return 3;
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playpage.a$a  reason: collision with other inner class name */
    public static final class C1989a {
        static {
            Covode.recordClassIndex(52207);
        }

        private C1989a() {
        }

        public /* synthetic */ C1989a(byte b2) {
            this();
        }
    }

    public final com.ss.android.ugc.aweme.dsp.playpage.playview.a b() {
        com.ss.android.ugc.aweme.dsp.playpage.playview.a aVar = this.f83673a.get(2);
        l.b(aVar, "");
        return aVar;
    }

    public final com.ss.android.ugc.aweme.dsp.playpage.playview.a a() {
        com.ss.android.ugc.aweme.dsp.playpage.playview.a aVar = this.f83673a.get(1);
        l.b(aVar, "");
        return aVar;
    }

    public static void a(View view, c cVar) {
        l.d(view, "");
        if (view instanceof com.ss.android.ugc.aweme.dsp.playpage.playview.a) {
            ((com.ss.android.ugc.aweme.dsp.playpage.playview.a) view).setData(cVar);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        l.d(view, "");
        l.d(obj, "");
        return l.a(view, obj);
    }

    public a(Context context, b bVar) {
        l.d(bVar, "");
        this.f83674b = context;
        int i2 = 0;
        do {
            Context context2 = this.f83674b;
            if (context2 == null) {
                l.b();
            }
            com.ss.android.ugc.aweme.dsp.playpage.playview.a aVar = new com.ss.android.ugc.aweme.dsp.playpage.playview.a(context2, (byte) 0);
            aVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            aVar.setPlayPage(bVar);
            aVar.setPageIndex(i2);
            this.f83673a.add(aVar);
            i2++;
        } while (i2 < 3);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i2) {
        MethodCollector.i(1770);
        l.d(viewGroup, "");
        com.ss.android.ugc.aweme.dsp.playpage.playview.a aVar = this.f83673a.get(i2);
        l.b(aVar, "");
        com.ss.android.ugc.aweme.dsp.playpage.playview.a aVar2 = aVar;
        if (aVar2.getParent() != null) {
            ViewParent parent = aVar2.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(aVar2);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                MethodCollector.o(1770);
                throw nullPointerException;
            }
        }
        viewGroup.addView(aVar2);
        MethodCollector.o(1770);
        return aVar2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        MethodCollector.i(1776);
        l.d(viewGroup, "");
        l.d(obj, "");
        viewGroup.removeView((View) obj);
        MethodCollector.o(1776);
    }
}

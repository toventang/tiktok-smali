package com.ss.android.ad.splash.core.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ad.splash.core.e.b;
import com.ss.android.ad.splash.core.e.p;
import com.ss.android.ad.splash.core.video2.BDASplashVideoView;
import com.ss.android.ad.splash.core.video2.c;
import com.ss.android.ad.splash.core.video2.d;
import com.ss.android.ad.splash.core.video2.f;
import com.ss.android.ad.splash.core.video2.g;
import com.ss.android.ad.splash.core.video2.h;
import com.ss.android.ad.splash.f.j;
import com.ss.android.ad.splash.f.l;
import java.util.ArrayList;
import java.util.List;

public final class a extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public d f58424a = new d();

    /* renamed from: b  reason: collision with root package name */
    public List<h> f58425b = new ArrayList(2);

    /* renamed from: c  reason: collision with root package name */
    private b f58426c;

    /* renamed from: d  reason: collision with root package name */
    private Context f58427d;

    /* renamed from: e  reason: collision with root package name */
    private d f58428e = new d();

    /* renamed from: f  reason: collision with root package name */
    private boolean f58429f;

    static {
        Covode.recordClassIndex(36275);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return 2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public final void a() {
        d dVar = this.f58428e;
        if (dVar != null) {
            dVar.j();
            this.f58428e = null;
        }
        d dVar2 = this.f58424a;
        if (dVar2 != null) {
            dVar2.j();
            this.f58424a = null;
        }
    }

    public final g a(int i2) {
        if (i2 == 1) {
            return this.f58428e;
        }
        return this.f58424a;
    }

    public a(Context context, b bVar) {
        this.f58427d = context;
        this.f58426c = bVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i2) {
        d dVar;
        p pVar;
        MethodCollector.i(4491);
        BDASplashVideoView bDASplashVideoView = new BDASplashVideoView(this.f58427d);
        bDASplashVideoView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewGroup.addView(bDASplashVideoView);
        this.f58425b.add(bDASplashVideoView);
        if (i2 == 1) {
            this.f58428e.a(bDASplashVideoView);
            dVar = this.f58428e;
            pVar = this.f58426c.r;
        } else {
            this.f58424a.a(bDASplashVideoView);
            dVar = this.f58424a;
            pVar = this.f58426c.s;
            this.f58424a.f58868e = new c() {
                /* class com.ss.android.ad.splash.core.d.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(36276);
                }

                @Override // com.ss.android.ad.splash.core.video2.b, com.ss.android.ad.splash.core.video2.c
                public final void b(int i2) {
                    a.this.f58424a.h();
                }
            };
        }
        String b2 = j.b(pVar);
        if (l.a(b2)) {
            MethodCollector.o(4491);
            return bDASplashVideoView;
        }
        if (dVar.a(b2, pVar.f58530i)) {
            if (!this.f58429f) {
                f.a().a(this.f58426c, com.ss.android.ad.splash.core.h.r);
                this.f58429f = true;
            }
            if (i2 == 0) {
                this.f58424a.a(true);
            }
        }
        f.a().a(dVar, this.f58426c.O, this.f58426c.c());
        MethodCollector.o(4491);
        return bDASplashVideoView;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        MethodCollector.i(4541);
        if (obj instanceof View) {
            viewGroup.removeView((View) obj);
        }
        if (obj instanceof h) {
            this.f58425b.remove(obj);
        }
        if (i2 == 1) {
            d dVar = this.f58428e;
            if (dVar != null) {
                dVar.j();
                this.f58428e = null;
                MethodCollector.o(4541);
                return;
            }
        } else {
            d dVar2 = this.f58424a;
            if (dVar2 != null) {
                dVar2.j();
                this.f58424a = null;
            }
        }
        MethodCollector.o(4541);
    }
}

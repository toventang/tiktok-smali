package com.ss.android.ugc.aweme.ecommerce.pdp.a;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.c.k;
import com.bytedance.lighten.a.e;
import com.bytedance.lighten.a.o;
import com.bytedance.lighten.a.q;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.a.w;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.ab.PDPHeaderImageExperiment;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.gallery.transfer.d;
import com.ss.android.ugc.aweme.ecommerce.preloader.e;
import com.ss.android.ugc.aweme.ecommerce.util.g;
import com.ss.android.ugc.aweme.ecommerce.util.h;
import com.zhiliaoapp.musically.R;
import dmt.viewpager.DmtViewPager;
import h.a.n;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class a extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f86326a = true;

    /* renamed from: b  reason: collision with root package name */
    public h.f.a.b<? super Image, z> f86327b;

    /* renamed from: c  reason: collision with root package name */
    public h.f.a.b<? super Boolean, z> f86328c;

    /* renamed from: d  reason: collision with root package name */
    public m<? super Boolean, ? super Integer, z> f86329d;

    /* renamed from: e  reason: collision with root package name */
    public final List<Image> f86330e;

    /* renamed from: f  reason: collision with root package name */
    public final DmtViewPager f86331f;

    /* renamed from: g  reason: collision with root package name */
    private final String f86332g;

    static {
        Covode.recordClassIndex(54051);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f86330e.size();
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f86341a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f86342b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewGroup f86343c;

        static {
            Covode.recordClassIndex(54054);
        }

        c(a aVar, int i2, ViewGroup viewGroup) {
            this.f86341a = aVar;
            this.f86342b = i2;
            this.f86343c = viewGroup;
        }

        static final class b implements d.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f86346a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f86347b;

            static {
                Covode.recordClassIndex(54056);
            }

            b(c cVar, List list) {
                this.f86346a = cVar;
                this.f86347b = list;
            }

            @Override // com.ss.android.ugc.aweme.ecommerce.gallery.transfer.d.b
            public final void a() {
                m<? super Boolean, ? super Integer, z> mVar = this.f86346a.f86341a.f86329d;
                if (mVar != null) {
                    mVar.invoke(false, Integer.valueOf(this.f86346a.f86342b));
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.a$c$a  reason: collision with other inner class name */
        static final class C2081a implements d.c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f86344a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f86345b;

            static {
                Covode.recordClassIndex(54055);
            }

            C2081a(c cVar, List list) {
                this.f86344a = cVar;
                this.f86345b = list;
            }

            @Override // com.ss.android.ugc.aweme.ecommerce.gallery.transfer.d.c
            public final void a(int i2) {
                this.f86344a.f86341a.f86331f.setCurrentItem(i2);
            }
        }

        public final void onClick(View view) {
            Object obj;
            ClickAgent.onClick(view);
            if (this.f86341a.f86326a) {
                h.f.a.b<? super Image, z> bVar = this.f86341a.f86327b;
                if (bVar != null) {
                    bVar.invoke(this.f86341a.f86330e.get(this.f86342b));
                }
                List<Image> list = this.f86341a.f86330e;
                ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    List<String> list2 = it.next().toImageUrlModel().f39811a;
                    if (list2 == null || (obj = n.b((List) list2, 0)) == null) {
                        obj = "";
                    }
                    arrayList.add(obj);
                }
                ArrayList arrayList2 = arrayList;
                Context context = this.f86343c.getContext();
                if (context != null) {
                    m<? super Boolean, ? super Integer, z> mVar = this.f86341a.f86329d;
                    if (mVar != null) {
                        mVar.invoke(true, Integer.valueOf(this.f86342b));
                    }
                    com.ss.android.ugc.aweme.ecommerce.gallery.a.a(context, this.f86342b, arrayList2.size(), arrayList2, null, null, null, new b(this, arrayList2), new C2081a(this, arrayList2), null, 12784);
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        l.d(view, "");
        l.d(obj, "");
        return l.a(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i2) {
        String uri;
        List<String> urls;
        MethodCollector.i(7645);
        l.d(viewGroup, "");
        View a2 = com.ss.android.ugc.aweme.ecommerce.pdp.c.a.a(viewGroup.getContext(), R.layout.pr, viewGroup, false);
        if (a2 != null) {
            SmartImageView smartImageView = (SmartImageView) a2;
            smartImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            viewGroup.addView(smartImageView);
            com.ss.android.ugc.aweme.ecommerce.preloader.c cVar = new com.ss.android.ugc.aweme.ecommerce.preloader.c();
            cVar.a(this.f86332g);
            cVar.a(i2);
            cVar.a(this.f86330e.get(i2));
            v a3 = g.a((Object) this.f86330e.get(i2)).a("CommerceHeadVH");
            a3.v = w.CENTER_CROP;
            e.a aVar = new e.a();
            float f2 = h.f87570d;
            aVar.f39833g = new e.b(f2, f2);
            e a4 = aVar.a();
            l.b(a4, "");
            a3.w = a4;
            a3.E = smartImageView;
            if (i2 == 0) {
                Image image = this.f86330e.get(i2);
                l.d(smartImageView, "");
                l.d(image, "");
                if (!(!PDPHeaderImageExperiment.INSTANCE.isProgressiveSwitch() || (uri = image.getUri()) == null || uri.length() == 0 || (urls = image.getUrls()) == null || urls.isEmpty())) {
                    bz unused = i.a(bs.f159054a, bf.f159041b, null, new e.a(smartImageView, image, null), 2);
                }
                a3.A = q.HIGH;
                a3.a(new C2080a(this, i2, smartImageView, cVar));
            } else {
                a3.a(new b(this, i2, smartImageView, cVar));
            }
            smartImageView.setOnClickListener(new c(this, i2, viewGroup));
            MethodCollector.o(7645);
            return smartImageView;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.lighten.loader.SmartImageView");
        MethodCollector.o(7645);
        throw nullPointerException;
    }

    public static final class b implements k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f86337a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f86338b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SmartImageView f86339c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.preloader.c f86340d;

        static {
            Covode.recordClassIndex(54053);
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri) {
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view) {
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, o oVar) {
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, Throwable th) {
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view, Throwable th) {
            this.f86340d.a(th);
        }

        b(a aVar, int i2, SmartImageView smartImageView, com.ss.android.ugc.aweme.ecommerce.preloader.c cVar) {
            this.f86337a = aVar;
            this.f86338b = i2;
            this.f86339c = smartImageView;
            this.f86340d = cVar;
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view, o oVar, Animatable animatable) {
            this.f86340d.a(oVar);
        }
    }

    public a(List<Image> list, DmtViewPager dmtViewPager, String str) {
        l.d(list, "");
        l.d(dmtViewPager, "");
        l.d(str, "");
        this.f86330e = list;
        this.f86331f = dmtViewPager;
        this.f86332g = str;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        MethodCollector.i(7721);
        l.d(viewGroup, "");
        l.d(obj, "");
        if (!(obj instanceof View)) {
            obj = null;
        }
        viewGroup.removeView((View) obj);
        MethodCollector.o(7721);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.a$a  reason: collision with other inner class name */
    public static final class C2080a implements k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f86333a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f86334b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SmartImageView f86335c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.preloader.c f86336d;

        static {
            Covode.recordClassIndex(54052);
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri) {
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view) {
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, o oVar) {
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, Throwable th) {
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view, Throwable th) {
            h.f.a.b<? super Boolean, z> bVar = this.f86333a.f86328c;
            if (bVar != null) {
                bVar.invoke(false);
            }
            this.f86336d.a(th);
        }

        C2080a(a aVar, int i2, SmartImageView smartImageView, com.ss.android.ugc.aweme.ecommerce.preloader.c cVar) {
            this.f86333a = aVar;
            this.f86334b = i2;
            this.f86335c = smartImageView;
            this.f86336d = cVar;
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view, o oVar, Animatable animatable) {
            h.f.a.b<? super Boolean, z> bVar = this.f86333a.f86328c;
            if (bVar != null) {
                bVar.invoke(true);
            }
            this.f86336d.a(oVar);
        }
    }
}

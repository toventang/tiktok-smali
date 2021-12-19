package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.m;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.emoji.b.f;
import com.ss.android.ugc.aweme.emoji.emojiPageV2.SwipeControlledRecycleView;
import com.ss.android.ugc.aweme.emoji.emojiPageV2.c;
import com.ss.android.ugc.aweme.emoji.emojiPageV2.d;
import com.ss.android.ugc.aweme.emoji.emojichoose.g;
import com.ss.android.ugc.aweme.emoji.emojichoose.n;
import com.ss.android.ugc.aweme.emoji.emojichoose.o;
import com.ss.android.ugc.aweme.emoji.emojichoose.p;
import com.ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputViewDelegate;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public final class a extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final InputViewDelegate f100623a;

    /* renamed from: b  reason: collision with root package name */
    public final b f100624b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<Integer, c> f100625c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private final SwipeControlledViewPager f100626d;

    /* renamed from: e  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a f100627e;

    static {
        Covode.recordClassIndex(64371);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        l.d(obj, "");
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        l.d(view, "");
        l.d(obj, "");
        return view == obj;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.a.a$a  reason: collision with other inner class name */
    public static final class C2483a implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f100628a;

        static {
            Covode.recordClassIndex(64372);
        }

        @Override // com.ss.android.ugc.aweme.emoji.emojichoose.p
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.emoji.emojichoose.p
        public final void c() {
        }

        @Override // com.ss.android.ugc.aweme.emoji.emojichoose.p
        public final void a() {
            this.f100628a.f100624b.l();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C2483a(a aVar) {
            this.f100628a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.emoji.emojichoose.p
        public final void a(String str) {
            l.d(str, "");
            this.f100628a.f100624b.a(str);
        }

        @Override // com.ss.android.ugc.aweme.emoji.emojichoose.p
        public final void a(View view, com.ss.android.ugc.aweme.emoji.b.a aVar, int i2) {
            l.d(view, "");
            l.d(aVar, "");
            com.ss.android.ugc.aweme.emoji.g.a aVar2 = aVar.f89106d;
            l.b(aVar2, "");
            com.ss.android.ugc.aweme.emoji.d.a.b.a(aVar2);
            this.f100628a.f100623a.a(aVar);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        n nVar = this.f100627e.f100642e;
        if (nVar.f89284b == null) {
            return 0;
        }
        return nVar.f89284b.size();
    }

    private static <T extends o> View a(ViewGroup viewGroup, T t) {
        MethodCollector.i(5464);
        View a2 = t.a(viewGroup);
        l.b(a2, "");
        if (viewGroup.indexOfChild(a2) < 0) {
            viewGroup.addView(a2);
        }
        MethodCollector.o(5464);
        return a2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final /* synthetic */ Object instantiateItem(ViewGroup viewGroup, int i2) {
        f fVar;
        View a2;
        MethodCollector.i(5461);
        l.d(viewGroup, "");
        n nVar = this.f100627e.f100642e;
        if (i2 >= 0 && nVar.f89284b != null && i2 < nVar.f89284b.size() && (fVar = nVar.f89284b.get(i2)) != null && fVar.i()) {
            f b2 = nVar.b(i2);
            l.b(b2, "");
            if (!com.bytedance.common.utility.collection.b.a((Collection) b2.m())) {
                if (fVar.j() == 3) {
                    if (com.ss.android.ugc.aweme.emoji.h.a.f89327b == 0) {
                        View a3 = a(viewGroup, new g());
                        MethodCollector.o(5461);
                        return a3;
                    } else if (fVar.k() == 0) {
                        View a4 = a(viewGroup, new com.ss.android.ugc.aweme.emoji.emojichoose.a());
                        MethodCollector.o(5461);
                        return a4;
                    }
                }
                if (fVar.j() == 4 && com.ss.android.ugc.aweme.emoji.d.a.f89115a == 0) {
                    View a5 = a(viewGroup, new g());
                    MethodCollector.o(5461);
                    return a5;
                }
                C2483a aVar = new C2483a(this);
                c cVar = this.f100625c.get(Integer.valueOf(i2));
                if (cVar != null) {
                    a2 = cVar.a();
                } else {
                    Context context = viewGroup.getContext();
                    l.b(context, "");
                    while (true) {
                        if (context != null) {
                            if (!(context instanceof Activity)) {
                                if (!(context instanceof ContextWrapper)) {
                                    break;
                                }
                                context = ((ContextWrapper) context).getBaseContext();
                            } else {
                                Activity activity = (Activity) context;
                                if (activity != null) {
                                    c cVar2 = new c((m) activity, viewGroup, this.f100626d, fVar.j(), aVar);
                                    f b3 = nVar.b(i2);
                                    l.b(b3, "");
                                    List<com.ss.android.ugc.aweme.emoji.b.a> m2 = b3.m();
                                    if (!(cVar2.c() == null || m2 == null || !(!m2.isEmpty()))) {
                                        com.ss.android.ugc.aweme.emoji.emojiPageV2.a<com.ss.android.ugc.aweme.emoji.b.a> c2 = cVar2.c();
                                        if (c2 == null) {
                                            l.b();
                                        }
                                        c2.b_(m2);
                                    }
                                    if (cVar2.f89148f == 2 || cVar2.f89148f == 4 || cVar2.f89148f == 3) {
                                        d dVar = cVar2.f89144b;
                                        SwipeControlledRecycleView b4 = cVar2.b();
                                        l.b(b4, "");
                                        SwipeControlledViewPager swipeControlledViewPager = cVar2.f89147e;
                                        if (m2 == null) {
                                            l.b();
                                        }
                                        l.d(b4, "");
                                        l.d(swipeControlledViewPager, "");
                                        l.d(m2, "");
                                        b4.setOnTouchListener(new d.a(dVar, new ArrayList(), b4, m2, swipeControlledViewPager));
                                    }
                                    com.ss.android.ugc.aweme.emoji.emojiPageV2.a<com.ss.android.ugc.aweme.emoji.b.a> c3 = cVar2.c();
                                    if (c3 != null) {
                                        p pVar = cVar2.f89149g;
                                        l.d(pVar, "");
                                        c3.f89131e = pVar;
                                        SwipeControlledRecycleView b5 = cVar2.b();
                                        l.b(b5, "");
                                        b5.setAdapter(c3);
                                        SwipeControlledRecycleView b6 = cVar2.b();
                                        l.b(b6, "");
                                        c3.a(b6);
                                        if (cVar2.f89148f == 1 || cVar2.f89148f == 5) {
                                            cVar2.f89143a.setVisibility(0);
                                            cVar2.f89143a.setOnClickListener(new c.b(cVar2));
                                            int i3 = Build.VERSION.SDK_INT;
                                            Drawable drawable = cVar2.f89143a.getDrawable();
                                            if (drawable != null) {
                                                drawable.setAutoMirrored(true);
                                            }
                                        }
                                    }
                                    a2 = cVar2.a();
                                    this.f100625c.put(Integer.valueOf(i2), cVar2);
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                    MethodCollector.o(5461);
                    throw nullPointerException;
                }
                if (viewGroup.indexOfChild(a2) < 0) {
                    viewGroup.addView(a2);
                }
                MethodCollector.o(5461);
                return a2;
            }
        }
        View a6 = a(viewGroup, new g());
        MethodCollector.o(5461);
        return a6;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        MethodCollector.i(5465);
        l.d(viewGroup, "");
        l.d(obj, "");
        viewGroup.removeView((View) obj);
        MethodCollector.o(5465);
    }

    public a(b bVar, SwipeControlledViewPager swipeControlledViewPager, com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a aVar) {
        l.d(bVar, "");
        l.d(swipeControlledViewPager, "");
        l.d(aVar, "");
        this.f100624b = bVar;
        this.f100626d = swipeControlledViewPager;
        this.f100627e = aVar;
        swipeControlledViewPager.getContext();
        this.f100623a = new InputViewDelegate(bVar);
    }
}

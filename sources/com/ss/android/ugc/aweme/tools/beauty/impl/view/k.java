package com.ss.android.ugc.aweme.tools.beauty.impl.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.b.a.e;
import com.ss.android.ugc.aweme.tools.beauty.b.c.d;
import com.ss.android.ugc.aweme.tools.beauty.e.b.a;
import com.ss.android.ugc.aweme.tools.beauty.g.n;
import com.ss.android.ugc.aweme.tools.beauty.impl.view.d;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.style.StyleTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class k implements d {

    /* renamed from: a  reason: collision with root package name */
    public final RelativeLayout f139109a;

    /* renamed from: b  reason: collision with root package name */
    public final StyleTextView f139110b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f139111c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f139112d;

    /* renamed from: e  reason: collision with root package name */
    public final View f139113e;

    /* renamed from: f  reason: collision with root package name */
    public final e f139114f;

    /* renamed from: g  reason: collision with root package name */
    public final d f139115g;

    static {
        Covode.recordClassIndex(90985);
    }

    public static final class b implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f139117a;

        static {
            Covode.recordClassIndex(90987);
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.e.b.a.b
        public final void b() {
            this.f139117a.f139115g.c();
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.e.b.a.b
        public final void a() {
            this.f139117a.f139115g.b();
            this.f139117a.c();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(k kVar) {
            this.f139117a = kVar;
        }
    }

    public static final class c implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f139118a;

        static {
            Covode.recordClassIndex(90988);
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.e.b.a.b
        public final void b() {
            this.f139118a.f139115g.c();
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.e.b.a.b
        public final void a() {
            this.f139118a.f139115g.b();
            this.f139118a.c();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(k kVar) {
            this.f139118a = kVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.d
    public final void b() {
        if (this.f139115g.f()) {
            RelativeLayout relativeLayout = this.f139109a;
            l.b(relativeLayout, "");
            relativeLayout.setAlpha(0.5f);
            RelativeLayout relativeLayout2 = this.f139109a;
            l.b(relativeLayout2, "");
            relativeLayout2.setClickable(false);
            return;
        }
        RelativeLayout relativeLayout3 = this.f139109a;
        l.b(relativeLayout3, "");
        relativeLayout3.setAlpha(1.0f);
        RelativeLayout relativeLayout4 = this.f139109a;
        l.b(relativeLayout4, "");
        relativeLayout4.setClickable(true);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.d
    public final void a() {
        RelativeLayout relativeLayout = this.f139109a;
        l.b(relativeLayout, "");
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (com.ss.android.ugc.aweme.tools.beauty.e.a.n) {
            StyleTextView styleTextView = this.f139110b;
            l.b(styleTextView, "");
            styleTextView.setVisibility(0);
            layoutParams.width = (int) r.a(this.f139112d, 76.0f);
        } else {
            StyleTextView styleTextView2 = this.f139110b;
            l.b(styleTextView2, "");
            styleTextView2.setVisibility(8);
            layoutParams.width = (int) r.a(this.f139112d, 52.0f);
        }
        this.f139110b.setTextSize(2, this.f139114f.f138862f.f138865b);
        this.f139111c.setImageResource(this.f139114f.f138862f.f138866c);
        if (this.f139114f.f138902l) {
            RelativeLayout relativeLayout2 = this.f139109a;
            l.b(relativeLayout2, "");
            relativeLayout2.setVisibility(0);
        } else {
            RelativeLayout relativeLayout3 = this.f139109a;
            l.b(relativeLayout3, "");
            relativeLayout3.setVisibility(4);
        }
        RelativeLayout relativeLayout4 = this.f139109a;
        l.b(relativeLayout4, "");
        relativeLayout4.setLayoutParams(layoutParams);
        this.f139109a.setOnClickListener(new a(this));
        b();
    }

    /* access modifiers changed from: protected */
    public final void c() {
        T t;
        T t2;
        T t3;
        d dVar = this.f139115g;
        d.n nVar = new d.n(dVar);
        Iterator<T> it = dVar.f139055a.a().iterator();
        while (it.hasNext()) {
            for (T t4 : it.next().getBeautyList()) {
                d.m mVar = new d.m(t4, nVar);
                if (t4.isBeautyMode()) {
                    List<ComposerBeauty> childList = t4.getChildList();
                    if (childList != null) {
                        Iterator<T> it2 = childList.iterator();
                        while (it2.hasNext()) {
                            it2.next();
                            mVar.invoke();
                        }
                    }
                } else {
                    mVar.invoke();
                }
            }
        }
        d dVar2 = this.f139115g;
        n<BeautyComposerInfo> nVar2 = new n();
        for (BeautyComposerInfo beautyComposerInfo : dVar2.f139055a.d()) {
            nVar2.add(beautyComposerInfo);
        }
        for (BeautyComposerInfo beautyComposerInfo2 : nVar2) {
            String str = beautyComposerInfo2.f79586c;
            for (T t5 : dVar2.f139055a.a()) {
                l.d(t5, "");
                ComposerBeauty composerBeauty = (ComposerBeauty) h.a.n.h((List) t5.getBeautyList());
                if (composerBeauty == null || !composerBeauty.isBeautyMode()) {
                    Iterator<T> it3 = t5.getBeautyList().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            t2 = null;
                            break;
                        }
                        t2 = it3.next();
                        if (l.a((Object) t2.getEffect().getEffectId(), (Object) str)) {
                            break;
                        }
                    }
                    T t6 = t2;
                    if (t6 != null) {
                        dVar2.a(t6, null);
                    }
                } else {
                    Iterator<T> it4 = t5.getBeautyList().iterator();
                    while (it4.hasNext()) {
                        List<ComposerBeauty> childList2 = it4.next().getChildList();
                        if (childList2 != null) {
                            Iterator<T> it5 = childList2.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    t3 = null;
                                    break;
                                }
                                t3 = it5.next();
                                if (l.a((Object) t3.getEffect().getEffectId(), (Object) str)) {
                                    break;
                                }
                            }
                            T t7 = t3;
                            if (t7 != null) {
                                dVar2.a(t7, null);
                            }
                        }
                    }
                }
            }
        }
        List<BeautyCategory> a2 = dVar2.f139055a.a();
        ArrayList<BeautyCategory> arrayList = new ArrayList();
        for (T t8 : a2) {
            if (t8.getBeautyCategoryExtra().getExclusive()) {
                arrayList.add(t8);
            }
        }
        for (BeautyCategory beautyCategory : arrayList) {
            Iterator<T> it6 = beautyCategory.getBeautyList().iterator();
            while (true) {
                if (!it6.hasNext()) {
                    t = null;
                    break;
                }
                t = it6.next();
                T t9 = t;
                if (t9.getExtra().getDefault() && t9.getEnable()) {
                    break;
                }
            }
            T t10 = t;
            if (t10 != null) {
                d.a(dVar2, t10, beautyCategory.getBeautyList());
                dVar2.b(t10);
            } else {
                List<ComposerBeauty> beautyList = beautyCategory.getBeautyList();
                if (!(beautyList == null || beautyList.isEmpty() || beautyList == null)) {
                    d.a(dVar2, beautyList.get(0), beautyCategory.getBeautyList());
                    dVar2.b(beautyList.get(0));
                }
            }
        }
        dVar2.d();
        this.f139115g.a();
        this.f139115g.e();
        b();
        com.ss.android.ugc.aweme.tools.beauty.b.c.b bVar = (com.ss.android.ugc.aweme.tools.beauty.b.c.b) this.f139115g.f139059e.a(com.ss.android.ugc.aweme.tools.beauty.b.c.b.class);
        if (bVar != null) {
            bVar.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.d
    public final void a(Map<ComposerBeauty, Float> map) {
        l.d(map, "");
        d dVar = this.f139115g;
        l.d(map, "");
        for (Map.Entry<ComposerBeauty, Float> entry : map.entrySet()) {
            d.l.a(entry.getKey(), new d.k(entry, dVar));
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f139116a;

        static {
            Covode.recordClassIndex(90986);
        }

        a(k kVar) {
            this.f139116a = kVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            k kVar = this.f139116a;
            Context context = kVar.f139112d;
            com.ss.android.ugc.aweme.tools.beauty.e.b.a aVar = kVar.f139114f.f138901k;
            if (aVar != null) {
                a.C3665a a2 = new a.C3665a().a(context);
                String string = context.getString(R.string.a45);
                l.b(string, "");
                a.C3665a a3 = a2.a(string);
                String string2 = context.getString(R.string.a42);
                l.b(string2, "");
                a.C3665a b2 = a3.b(string2);
                String string3 = context.getString(R.string.a43);
                l.b(string3, "");
                a.C3665a c2 = b2.c(string3);
                String string4 = context.getString(R.string.a44);
                l.b(string4, "");
                a.C3665a d2 = c2.d(string4);
                d2.f138930f = new b(kVar);
                aVar.a(d2);
            } else {
                l.d(context, "");
                a.C3665a a4 = new a.C3665a().a(context);
                String string5 = context.getString(R.string.a45);
                l.b(string5, "");
                a.C3665a a5 = a4.a(string5);
                String string6 = context.getString(R.string.a42);
                l.b(string6, "");
                a.C3665a b3 = a5.b(string6);
                String string7 = context.getString(R.string.a43);
                l.b(string7, "");
                a.C3665a c3 = b3.c(string7);
                String string8 = context.getString(R.string.a44);
                l.b(string8, "");
                a.C3665a d3 = c3.d(string8);
                d3.f138930f = new c(kVar);
                com.ss.android.ugc.aweme.tools.beauty.views.a.a(d3);
            }
            com.ss.android.ugc.aweme.tools.beauty.service.b bVar = kVar.f139115g.f139058d.f139043a;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.d
    public final void a(List<ComposerBeauty> list) {
        l.d(list, "");
        d dVar = this.f139115g;
        l.d(list, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            d.j.a(it.next(), new d.g(dVar));
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            d.j.a(it2.next(), new d.h(dVar));
        }
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            d.j.a(it3.next(), new d.i(dVar));
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.d
    public final void a(boolean z) {
        T t;
        d dVar = this.f139115g;
        Iterator<T> it = dVar.f139055a.a().iterator();
        while (it.hasNext()) {
            for (T t2 : it.next().getBeautyList()) {
                boolean isCollectionType = t2.isCollectionType();
                if (isCollectionType) {
                    List<ComposerBeauty> childList = t2.getChildList();
                    if (childList != null) {
                        Iterator<T> it2 = childList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it2.next();
                            if (t.getSelected()) {
                                break;
                            }
                        }
                        T t3 = t;
                        if (t3 != null) {
                            dVar.f139055a.a((ComposerBeauty) t3, z);
                        }
                    }
                } else if (!isCollectionType) {
                    dVar.f139055a.a((ComposerBeauty) t2, z);
                    dVar.g();
                }
            }
        }
    }

    public k(Context context, View view, e eVar, d dVar) {
        l.d(context, "");
        l.d(view, "");
        l.d(eVar, "");
        l.d(dVar, "");
        this.f139112d = context;
        this.f139113e = view;
        this.f139114f = eVar;
        this.f139115g = dVar;
        this.f139109a = (RelativeLayout) view.findViewById(R.id.do3);
        this.f139110b = (StyleTextView) view.findViewById(R.id.ex7);
        this.f139111c = (ImageView) view.findViewById(R.id.bvl);
    }
}

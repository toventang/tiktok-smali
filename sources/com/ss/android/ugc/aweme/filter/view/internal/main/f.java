package com.ss.android.ugc.aweme.filter.view.internal.main;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.views.CircleDraweeView;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.style.StyleRecyclerView;
import com.ss.android.ugc.tools.view.widget.c.a;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.a.ag;
import h.a.n;
import h.f.a.q;
import h.p;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class f implements com.ss.android.ugc.aweme.filter.view.a.h {

    /* renamed from: k  reason: collision with root package name */
    public static final q<com.ss.android.ugc.aweme.filter.view.a.h, FilterBean, com.ss.android.ugc.aweme.filter.repository.a.g, z> f95860k = b.f95873a;

    /* renamed from: l  reason: collision with root package name */
    public static final a f95861l = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.tools.view.widget.a.b<p<FilterBean, com.ss.android.ugc.aweme.filter.repository.a.g>> f95862a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.tools.view.widget.a.c<z> f95863b;

    /* renamed from: c  reason: collision with root package name */
    public Map<FilterBean, ? extends com.ss.android.ugc.aweme.filter.repository.a.g> f95864c = ag.a();

    /* renamed from: d  reason: collision with root package name */
    public FilterBean f95865d;

    /* renamed from: e  reason: collision with root package name */
    final f.a.l.g<FilterBean> f95866e;

    /* renamed from: f  reason: collision with root package name */
    public final f.a.l.g<FilterBean> f95867f;

    /* renamed from: g  reason: collision with root package name */
    public final h.f.a.m<FilterBean, com.ss.android.ugc.aweme.filter.repository.a.g, z> f95868g;

    /* renamed from: h  reason: collision with root package name */
    public final RecyclerView f95869h;

    /* renamed from: i  reason: collision with root package name */
    final q<com.ss.android.ugc.aweme.filter.view.a.h, FilterBean, com.ss.android.ugc.aweme.filter.repository.a.g, z> f95870i;

    /* renamed from: j  reason: collision with root package name */
    public g f95871j;

    /* renamed from: m  reason: collision with root package name */
    private final f.a.l.g<com.bytedance.jedi.a.c.f<FilterBean>> f95872m;
    private final androidx.lifecycle.m n;
    private final r o;
    private final s p;

    public static final class a {
        static {
            Covode.recordClassIndex(60737);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.h
    public final FilterBean a() {
        return this.f95865d;
    }

    /* access modifiers changed from: package-private */
    public static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f95879a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f95880b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f95881c;

        static {
            Covode.recordClassIndex(60746);
        }

        j(f fVar, int i2, int i3) {
            this.f95879a = fVar;
            this.f95880b = i2;
            this.f95881c = i3;
        }

        public final void run() {
            this.f95879a.a(this.f95880b, this.f95881c + 1);
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.h
    public final t<FilterBean> b() {
        t<FilterBean> c2 = this.f95866e.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.h
    public final t<com.bytedance.jedi.a.c.f<FilterBean>> c() {
        t<com.bytedance.jedi.a.c.f<FilterBean>> c2 = this.f95872m.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.h
    public final t<FilterBean> d() {
        t<FilterBean> c2 = this.f95867f.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    static {
        Covode.recordClassIndex(60736);
    }

    final class d extends com.ss.android.ugc.tools.view.widget.a.b<p<? extends FilterBean, ? extends com.ss.android.ugc.aweme.filter.repository.a.g>> {
        static {
            Covode.recordClassIndex(60740);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return a(this, viewGroup, i2);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
            boolean z;
            h.f.b.l.d(viewHolder, "");
            p pVar = (p) a(i2);
            f fVar = f.this;
            FilterBean filterBean = (FilterBean) pVar.getFirst();
            com.ss.android.ugc.aweme.filter.repository.a.g gVar = (com.ss.android.ugc.aweme.filter.repository.a.g) pVar.getSecond();
            h.f.b.l.d(viewHolder, "");
            h.f.b.l.d(filterBean, "");
            h.f.b.l.d(gVar, "");
            String str = null;
            if (!(viewHolder instanceof o)) {
                viewHolder = null;
            }
            o oVar = (o) viewHolder;
            if (oVar != null) {
                FilterBean filterBean2 = fVar.f95865d;
                if (filterBean2 == null || filterBean2.getId() != filterBean.getId()) {
                    z = false;
                } else {
                    z = true;
                }
                h.f.b.l.d(filterBean, "");
                h.f.b.l.d(gVar, "");
                CircleDraweeView imageView = oVar.f95978b.getImageView();
                Uri thumbnailFileUri = filterBean.getThumbnailFileUri();
                if (thumbnailFileUri != null) {
                    str = thumbnailFileUri.toString();
                }
                com.ss.android.ugc.tools.c.a.a(imageView, str);
                oVar.f95978b.setText(filterBean.getName());
                oVar.f95978b.setCustomSelected(z);
                if (oVar.f95981e != gVar) {
                    int i3 = p.f95984a[gVar.ordinal()];
                    if (i3 == 1 || i3 == 2) {
                        oVar.a();
                        ImageView imageView2 = oVar.f95977a;
                        h.f.b.l.b(imageView2, "");
                        imageView2.setVisibility(0);
                    } else if (i3 == 3 || i3 == 4) {
                        oVar.a();
                        ImageView imageView3 = oVar.f95977a;
                        h.f.b.l.b(imageView3, "");
                        imageView3.setVisibility(8);
                    } else if (i3 == 5) {
                        ImageView imageView4 = oVar.f95977a;
                        h.f.b.l.b(imageView4, "");
                        imageView4.setVisibility(0);
                        oVar.f95977a.setImageResource(2131230948);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(oVar.f95977a, "rotation", 0.0f, 360.0f);
                        h.f.b.l.b(ofFloat, "");
                        ofFloat.setDuration(800L);
                        ofFloat.setRepeatMode(1);
                        ofFloat.setRepeatCount(-1);
                        ofFloat.start();
                        oVar.f95979c = ofFloat;
                    }
                }
                oVar.f95980d = filterBean;
                oVar.f95981e = gVar;
            }
        }

        private static RecyclerView.ViewHolder a(d dVar, ViewGroup viewGroup, int i2) {
            boolean a2;
            MethodCollector.i(9747);
            h.f.b.l.d(viewGroup, "");
            f fVar = f.this;
            h.f.a.m<FilterBean, com.ss.android.ugc.aweme.filter.repository.a.g, z> mVar = fVar.f95868g;
            h.f.b.l.d(viewGroup, "");
            h.f.b.l.d(mVar, "");
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.dg, viewGroup, false);
            h.f.b.l.b(a3, "");
            Context context = a3.getContext();
            h.f.b.l.b(context, "");
            e eVar = new e(fVar, a3);
            h.f.b.l.d(context, "");
            h.f.b.l.d(eVar, "");
            a.C4052a aVar = new a.C4052a(context);
            eVar.invoke(aVar);
            com.ss.android.ugc.tools.view.widget.c.a b2 = aVar.b();
            if (com.ss.android.ugc.tools.a.f149054l.f149061f) {
                TextView textView = b2.getTextView();
                if (textView != null) {
                    textView.setTextSize(12.0f);
                }
                TextView textView2 = b2.getTextView();
                if (textView2 != null) {
                    com.ss.android.ugc.tools.view.style.g.a(textView2);
                }
            } else {
                TextView textView3 = b2.getTextView();
                if (textView3 != null) {
                    textView3.setTextSize(11.0f);
                }
                TextView textView4 = b2.getTextView();
                if (textView4 != null) {
                    textView4.setTypeface(Typeface.defaultFromStyle(0));
                }
            }
            b2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            b2.setId(R.id.bsb);
            ((FrameLayout) a3.findViewById(R.id.bs1)).addView(b2, 0);
            o oVar = new o(a3, mVar);
            try {
                if (oVar.itemView.getParent() != null) {
                    try {
                        a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a2) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(oVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                        com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) oVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(oVar.itemView);
                        }
                    }
                }
            } catch (Exception e2) {
                ai.a(e2);
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            gg.f143005a = oVar.getClass().getName();
            MethodCollector.o(9747);
            return oVar;
        }
    }

    static final class h<T> implements u<FilterBean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f95877a;

        static {
            Covode.recordClassIndex(60744);
        }

        h(f fVar) {
            this.f95877a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(FilterBean filterBean) {
            this.f95877a.c(filterBean);
        }
    }

    public static final class i extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f95878a;

        static {
            Covode.recordClassIndex(60745);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(f fVar) {
            this.f95878a = fVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: f.a.l.g<com.ss.android.ugc.aweme.filter.FilterBean> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            h.f.b.l.d(recyclerView, "");
            if (i2 == 0) {
                RecyclerView.i layoutManager = recyclerView.getLayoutManager();
                if (!(layoutManager instanceof LinearLayoutManager)) {
                    layoutManager = null;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (linearLayoutManager != null) {
                    p pVar = (p) n.b((List) this.f95878a.f95862a.a(), this.f95878a.f95863b.a(linearLayoutManager.k()));
                    if (pVar != null) {
                        this.f95878a.f95867f.onNext(pVar.getFirst());
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.b<Integer, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(60747);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            this.this$0.a((f) num.intValue(), 0);
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<Integer, z> {
        final /* synthetic */ int $offset;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(60748);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(f fVar, int i2) {
            super(1);
            this.this$0 = fVar;
            this.$offset = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            this.this$0.b(num.intValue(), this.$offset);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.h
    public final void a(FilterBean filterBean) {
        b(filterBean);
        r rVar = this.o;
        if (rVar != null) {
            rVar.a(filterBean);
        } else {
            c(filterBean);
        }
    }

    final class c extends com.ss.android.ugc.tools.view.widget.a.c<z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f95874a;

        static {
            Covode.recordClassIndex(60739);
        }

        @Override // com.ss.android.ugc.tools.view.widget.a.c
        public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
            h.f.b.l.d(viewGroup, "");
            h.f.b.l.d(viewGroup, "");
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.de, viewGroup, false);
            h.f.b.l.b(a2, "");
            return new com.ss.android.ugc.tools.view.widget.a.h(a2);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(f fVar, RecyclerView.a<RecyclerView.ViewHolder> aVar) {
            super(aVar);
            h.f.b.l.d(aVar, "");
            this.f95874a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
        @Override // com.ss.android.ugc.tools.view.widget.a.c
        public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder, z zVar) {
            h.f.b.l.d(viewHolder, "");
            h.f.b.l.d(zVar, "");
        }
    }

    static final class g<T> implements u<Map<FilterBean, ? extends com.ss.android.ugc.aweme.filter.repository.a.g>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f95876a;

        static {
            Covode.recordClassIndex(60743);
        }

        g(f fVar) {
            this.f95876a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Map<FilterBean, ? extends com.ss.android.ugc.aweme.filter.repository.a.g> map) {
            Map<FilterBean, ? extends com.ss.android.ugc.aweme.filter.repository.a.g> map2 = map;
            if (map2 != null) {
                f fVar = this.f95876a;
                fVar.f95864c = map2;
                int i2 = 0;
                for (T t : fVar.f95862a.a()) {
                    Object second = t.getSecond();
                    com.ss.android.ugc.aweme.filter.repository.a.g a2 = f.a(map2, (FilterBean) t.getFirst());
                    if (second != a2) {
                        fVar.f95862a.a(v.a(t.getFirst(), a2), i2);
                    }
                    i2++;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m extends h.f.b.m implements h.f.a.b<FilterBean, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(60749);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(FilterBean filterBean) {
            FilterBean filterBean2 = filterBean;
            if (filterBean2 != null) {
                Iterator<p<FilterBean, com.ss.android.ugc.aweme.filter.repository.a.g>> it = this.this$0.f95862a.a().iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next().getFirst().getId() != filterBean2.getId()) {
                        i2++;
                    } else if (i2 >= 0) {
                        this.this$0.f95862a.notifyItemChanged(i2);
                    }
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.h
    public final void b(FilterBean filterBean) {
        a(filterBean, new k(this));
    }

    public final void c(FilterBean filterBean) {
        FilterBean filterBean2 = this.f95865d;
        if (filterBean2 != null || filterBean != null) {
            this.f95865d = filterBean;
            m mVar = new m(this);
            if (!h.f.b.l.a(filterBean2, filterBean)) {
                mVar.invoke(filterBean2);
                mVar.invoke(filterBean);
            }
            this.f95872m.onNext(com.bytedance.jedi.a.c.g.a(filterBean));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.b<a.C4052a, z> {
        final /* synthetic */ View $itemView;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(60741);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar, View view) {
            super(1);
            this.this$0 = fVar;
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(a.C4052a aVar) {
            a.C4052a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f150394d = true;
            View view = this.$itemView;
            h.f.b.l.b(view, "");
            Context context = view.getContext();
            h.f.b.l.b(context, "");
            aVar2.f150398h = (int) r.a(context, 52.0f);
            View view2 = this.$itemView;
            h.f.b.l.b(view2, "");
            Context context2 = view2.getContext();
            h.f.b.l.b(context2, "");
            aVar2.f150397g = (int) r.a(context2, 52.0f);
            aVar2.f150399i = 2131230950;
            aVar2.o = true;
            aVar2.f150400j = true;
            h.f.a.b<? super a.C4052a, z> bVar = this.this$0.f95871j.f95884c;
            if (bVar != null) {
                bVar.invoke(aVar2);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.g
    public final void a(Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map) {
        h.f.b.l.d(map, "");
        ArrayList<FilterBean> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        for (T t : map.entrySet()) {
            arrayList.addAll((Collection) t.getValue());
            if (i2 < map.size() - 1 && (!((Collection) t.getValue()).isEmpty())) {
                arrayList2.add(v.a(Integer.valueOf(arrayList.size() - 1), z.f158842a));
            }
            i2++;
        }
        com.ss.android.ugc.tools.view.widget.a.b<p<FilterBean, com.ss.android.ugc.aweme.filter.repository.a.g>> bVar = this.f95862a;
        ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList, 10));
        for (FilterBean filterBean : arrayList) {
            arrayList3.add(v.a(filterBean, a(this.f95864c, filterBean)));
        }
        bVar.b(arrayList3);
        this.f95863b.a(arrayList2);
        s sVar = this.p;
        if (sVar != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Map.Entry<EffectCategoryResponse, ? extends List<? extends FilterBean>> entry : map.entrySet()) {
                n.a((Collection) arrayList4, (Iterable) ((List) entry.getValue()));
            }
            sVar.a(arrayList4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.f$f  reason: collision with other inner class name */
    static final class C2315f extends h.f.b.m implements h.f.a.m<FilterBean, com.ss.android.ugc.aweme.filter.repository.a.g, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(60742);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2315f(f fVar) {
            super(2);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(FilterBean filterBean, com.ss.android.ugc.aweme.filter.repository.a.g gVar) {
            h.f.b.l.d(filterBean, "");
            h.f.b.l.d(gVar, "");
            f fVar = this.this$0;
            fVar.f95866e.onNext(filterBean);
            q<com.ss.android.ugc.aweme.filter.view.a.h, FilterBean, com.ss.android.ugc.aweme.filter.repository.a.g, z> qVar = fVar.f95870i;
            if (qVar != null) {
                qVar.invoke(fVar, filterBean, gVar);
            }
            return z.f158842a;
        }
    }

    static com.ss.android.ugc.aweme.filter.repository.a.g a(Map<FilterBean, ? extends com.ss.android.ugc.aweme.filter.repository.a.g> map, FilterBean filterBean) {
        h.f.b.l.d(map, "");
        h.f.b.l.d(filterBean, "");
        com.ss.android.ugc.aweme.filter.repository.a.g gVar = (com.ss.android.ugc.aweme.filter.repository.a.g) map.get(filterBean);
        if (gVar == null) {
            return com.ss.android.ugc.aweme.filter.repository.a.g.FILTER_STATE_UNKNOWN;
        }
        return gVar;
    }

    /* access modifiers changed from: protected */
    public void b(int i2, int i3) {
        RecyclerView.i layoutManager = this.f95869h.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager != null) {
            linearLayoutManager.a(i2, i3);
        }
    }

    private final void a(FilterBean filterBean, h.f.a.b<? super Integer, z> bVar) {
        if (filterBean != null) {
            int i2 = 0;
            for (p<FilterBean, com.ss.android.ugc.aweme.filter.repository.a.g> pVar : this.f95862a.a()) {
                if (pVar.getFirst().getId() != filterBean.getId()) {
                    i2++;
                } else if (i2 >= 0) {
                    bVar.invoke(Integer.valueOf(this.f95863b.b(i2)));
                    return;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, int i3) {
        if (this.f95869h.getWidth() != 0 || i3 >= 3) {
            this.f95869h.b(i2);
        } else {
            this.f95869h.post(new j(this, i2, i3));
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.h
    public final void a(FilterBean filterBean, int i2) {
        a(filterBean, new l(this, i2));
    }

    static final class b extends h.f.b.m implements q<com.ss.android.ugc.aweme.filter.view.a.h, FilterBean, com.ss.android.ugc.aweme.filter.repository.a.g, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f95873a = new b();

        static {
            Covode.recordClassIndex(60738);
        }

        b() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.filter.view.a.h hVar, FilterBean filterBean, com.ss.android.ugc.aweme.filter.repository.a.g gVar) {
            com.ss.android.ugc.aweme.filter.view.a.h hVar2 = hVar;
            FilterBean filterBean2 = filterBean;
            h.f.b.l.d(hVar2, "");
            h.f.b.l.d(filterBean2, "");
            h.f.b.l.d(gVar, "");
            hVar2.a(filterBean2);
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: h.f.a.q<? super com.ss.android.ugc.aweme.filter.view.a.h, ? super com.ss.android.ugc.aweme.filter.FilterBean, ? super com.ss.android.ugc.aweme.filter.repository.a.g, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public f(RecyclerView recyclerView, androidx.lifecycle.m mVar, r rVar, s sVar, q<? super com.ss.android.ugc.aweme.filter.view.a.h, ? super FilterBean, ? super com.ss.android.ugc.aweme.filter.repository.a.g, z> qVar, g gVar) {
        RecyclerView recyclerView2;
        LiveData<FilterBean> a2;
        LiveData<Map<FilterBean, com.ss.android.ugc.aweme.filter.repository.a.g>> a3;
        h.f.b.l.d(recyclerView, "");
        h.f.b.l.d(mVar, "");
        h.f.b.l.d(gVar, "");
        this.f95869h = recyclerView;
        this.n = mVar;
        this.o = rVar;
        this.p = sVar;
        this.f95870i = qVar;
        this.f95871j = gVar;
        d dVar = new d();
        this.f95862a = dVar;
        c cVar = new c(this, dVar);
        this.f95863b = cVar;
        f.a.l.c cVar2 = new f.a.l.c();
        h.f.b.l.b(cVar2, "");
        this.f95866e = cVar2;
        f.a.l.c cVar3 = new f.a.l.c();
        h.f.b.l.b(cVar3, "");
        this.f95872m = cVar3;
        f.a.l.c cVar4 = new f.a.l.c();
        h.f.b.l.b(cVar4, "");
        this.f95867f = cVar4;
        this.f95868g = new C2315f(this);
        RecyclerView recyclerView3 = null;
        if (!(recyclerView instanceof StyleRecyclerView)) {
            recyclerView2 = null;
        } else {
            recyclerView2 = recyclerView;
        }
        StyleRecyclerView styleRecyclerView = (StyleRecyclerView) recyclerView2;
        if (styleRecyclerView != null) {
            styleRecyclerView.setItemShowBorder(this.f95871j.f95883b);
        }
        Context context = recyclerView.getContext();
        if (context != null) {
            StyleRecyclerView styleRecyclerView2 = (StyleRecyclerView) (recyclerView instanceof StyleRecyclerView ? recyclerView : recyclerView3);
            if (styleRecyclerView2 != null) {
                styleRecyclerView2.setItemMargin((int) r.a(context, (float) this.f95871j.f95882a));
            }
        }
        recyclerView.setAdapter(cVar);
        if (!(sVar == null || (a3 = sVar.a()) == null)) {
            a3.observe(mVar, new g(this));
        }
        if (!(rVar == null || (a2 = rVar.a()) == null)) {
            a2.observe(mVar, new h(this));
        }
        recyclerView.a(new i(this));
    }
}

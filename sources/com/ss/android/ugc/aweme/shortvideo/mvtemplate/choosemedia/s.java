package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.h.i;
import com.facebook.drawee.e.q;
import com.ss.android.ugc.aweme.views.CircleDraweeView;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.tools.infosticker.view.internal.base.b;
import com.ss.android.ugc.tools.infosticker.view.internal.base.f;
import com.ss.android.ugc.tools.infosticker.view.internal.h;
import com.ss.android.ugc.tools.infosticker.view.internal.k;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.widget.c.b;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class s extends com.ss.android.ugc.tools.infosticker.view.internal.base.b<ProviderEffect> implements com.ss.android.ugc.tools.infosticker.view.a.c<ProviderEffect> {

    /* renamed from: a  reason: collision with root package name */
    public String f129180a;

    /* renamed from: b  reason: collision with root package name */
    public int f129181b;

    /* renamed from: c  reason: collision with root package name */
    public final h<ProviderEffect> f129182c;
    private final m v;
    private final int w = 2;

    static {
        Covode.recordClassIndex(84796);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.c
    public final String a() {
        return this.f129180a;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final m c() {
        return this.v;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final int d() {
        return this.w;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.b, com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final void b() {
        LiveData<String> a2;
        super.b();
        h<ProviderEffect> hVar = this.f129182c;
        if (hVar != null && (a2 = hVar.a()) != null) {
            a2.removeObservers(this.v);
        }
    }

    static final class a<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f129183a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f129184b;

        static {
            Covode.recordClassIndex(84797);
        }

        a(s sVar, m mVar) {
            this.f129183a = sVar;
            this.f129184b = mVar;
        }

        @Override // androidx.lifecycle.u
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            this.f129183a.f129180a = (String) obj;
        }
    }

    public static final class b extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f129185a;

        static {
            Covode.recordClassIndex(84798);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(s sVar) {
            this.f129185a = sVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
            if (this.f129185a.f129181b != i2) {
                this.f129185a.f129181b = i2;
                s sVar = this.f129185a;
                sVar.a(sVar.f129181b);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            l.d(recyclerView, "");
            s sVar = this.f129185a;
            sVar.a(sVar.f129181b);
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.c
    public final void a(String str) {
        h<ProviderEffect> hVar = this.f129182c;
        if (hVar != null) {
            hVar.a(str);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<ViewGroup, View> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f129187a = new e();

        static {
            Covode.recordClassIndex(84804);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            return com.ss.android.ugc.tools.view.widget.b.e.a(viewGroup2);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<ViewGroup, View> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(84799);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(s sVar) {
            super(1);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            return com.ss.android.ugc.tools.view.widget.b.e.a(viewGroup2, new h.f.a.m<TextView, TextView, z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.s.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(84800);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ z invoke(TextView textView, TextView textView2) {
                    TextView textView3 = textView;
                    TextView textView4 = textView2;
                    l.d(textView3, "");
                    l.d(textView4, "");
                    textView3.setText(R.string.h36);
                    textView3.setTextColor(androidx.core.content.b.c(this.this$0.this$0.s, R.color.bx));
                    textView4.setText(R.string.h37);
                    textView4.setTextColor(androidx.core.content.b.c(this.this$0.this$0.s, R.color.bx));
                    return z.f158842a;
                }
            });
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<ViewGroup, View> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(84801);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(s sVar) {
            super(1);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            return com.ss.android.ugc.tools.view.widget.b.e.a(viewGroup2, new q<TextView, TextView, TextView, z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.s.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(84802);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // h.f.a.q
                public final /* synthetic */ z invoke(TextView textView, TextView textView2, TextView textView3) {
                    TextView textView4 = textView;
                    TextView textView5 = textView2;
                    TextView textView6 = textView3;
                    l.d(textView4, "");
                    l.d(textView5, "");
                    l.d(textView6, "");
                    textView4.setText(R.string.h2z);
                    textView4.setTextColor(androidx.core.content.b.c(this.this$0.this$0.s, R.color.bx));
                    textView5.setText(R.string.h2y);
                    textView5.setTextColor(androidx.core.content.b.c(this.this$0.this$0.s, R.color.bx));
                    textView6.setText(R.string.h35);
                    textView6.setTextColor(androidx.core.content.b.c(this.this$0.this$0.s, R.color.bx));
                    textView6.setOnClickListener(new View.OnClickListener(this) {
                        /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.s.d.AnonymousClass1.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f129186a;

                        static {
                            Covode.recordClassIndex(84803);
                        }

                        {
                            this.f129186a = r1;
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            h<ProviderEffect> hVar = this.f129186a.this$0.this$0.f129182c;
                            if (hVar != null) {
                                hVar.f();
                            }
                        }
                    });
                    return z.f158842a;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final RecyclerView a(View view) {
        l.d(view, "");
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.eb9);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(this.w, 1);
        recyclerView.setItemViewCacheSize(this.w);
        l.b(recyclerView, "");
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        return recyclerView;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a> b(View view) {
        l.d(view, "");
        com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a> b2 = super.b(view);
        if (b2 instanceof com.ss.android.ugc.tools.view.widget.b.d) {
            com.ss.android.ugc.tools.view.widget.b.d dVar = (com.ss.android.ugc.tools.view.widget.b.d) b2;
            dVar.a(com.ss.android.ugc.tools.view.widget.b.a.LOADING, e.f129187a);
            dVar.a(com.ss.android.ugc.tools.view.widget.b.a.EMPTY, new c(this));
            dVar.a(com.ss.android.ugc.tools.view.widget.b.a.ERROR, new d(this));
        }
        return b2;
    }

    public final void a(int i2) {
        int k2;
        int m2;
        boolean z;
        RecyclerView.i layoutManager = p().getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager != null && (k2 = linearLayoutManager.k()) <= (m2 = linearLayoutManager.m())) {
            while (true) {
                RecyclerView.ViewHolder f2 = p().f(k2);
                if (!(f2 instanceof t)) {
                    f2 = null;
                }
                f fVar = (f) f2;
                if (fVar != null) {
                    CircleDraweeView imageView = fVar.f149601g.getImageView();
                    if ((imageView instanceof com.ss.android.ugc.aweme.views.a) && imageView != null) {
                        if (i2 == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        imageView.a(z);
                    }
                }
                if (k2 != m2) {
                    k2++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final void a(m mVar) {
        l.d(mVar, "");
        super.a(mVar);
        h<ProviderEffect> hVar = this.f129182c;
        if (hVar != null) {
            hVar.a().observe(mVar, new a(this, mVar));
        }
        p().a(new b(this));
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, q<? super ProviderEffect, ? super Integer, ? super com.ss.android.ugc.tools.h.a.c, z> qVar) {
        MethodCollector.i(10817);
        l.d(viewGroup, "");
        l.d(qVar, "");
        b.a aVar = new b.a(this.s);
        aVar.f150397g = (int) r.a(this.s, 80.0f);
        aVar.f150398h = (int) r.a(this.s, 80.0f);
        aVar.f150400j = false;
        aVar.f150414a = 2131230946;
        aVar.f150415b = 2131230948;
        aVar.u = true;
        com.ss.android.ugc.tools.view.widget.c.b a2 = aVar.b();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        a2.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(this.s);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        frameLayout.addView(a2);
        t tVar = new t(frameLayout, a2, qVar);
        MethodCollector.o(10817);
        return tVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int, java.lang.Object, com.ss.android.ugc.tools.h.a.c, java.lang.Integer] */
    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder, int i2, ProviderEffect providerEffect, com.ss.android.ugc.tools.h.a.c cVar, Integer num) {
        boolean z;
        String width;
        Float valueOf;
        String height;
        Integer valueOf2;
        ProviderEffect providerEffect2 = providerEffect;
        l.d(viewHolder, "");
        l.d(providerEffect2, "");
        l.d(cVar, "");
        if (!(viewHolder instanceof t)) {
            viewHolder = null;
        }
        t tVar = (t) viewHolder;
        if (tVar != null) {
            int i3 = this.f129181b;
            l.d(providerEffect2, "");
            l.d(cVar, "");
            ProviderEffect.StickerBean sticker_info = providerEffect2.getSticker_info();
            if (!(sticker_info == null || (width = sticker_info.getWidth()) == null || (valueOf = Float.valueOf((((float) tVar.f129190b) + 0.0f) / Float.parseFloat(width))) == null)) {
                float floatValue = valueOf.floatValue();
                ProviderEffect.StickerBean sticker_info2 = providerEffect2.getSticker_info();
                if (!(sticker_info2 == null || (height = sticker_info2.getHeight()) == null || (valueOf2 = Integer.valueOf((int) (((float) Integer.parseInt(height)) * floatValue))) == null)) {
                    tVar.f149601g.getImageView().setLayoutParams(new FrameLayout.LayoutParams(tVar.f129190b, valueOf2.intValue()));
                }
            }
            tVar.a(providerEffect2, i2, cVar, num);
            CircleDraweeView imageView = tVar.f149601g.getImageView();
            View view = tVar.itemView;
            l.b(view, "");
            imageView.setBackgroundColor(androidx.core.content.b.c(view.getContext(), R.color.f159926j));
            com.facebook.drawee.f.a aVar = (com.facebook.drawee.f.a) imageView.getHierarchy();
            l.b(aVar, "");
            aVar.a(q.b.f47438d);
            i.b(imageView, Integer.valueOf(tVar.f129189a), Integer.valueOf(tVar.f129189a), Integer.valueOf(tVar.f129189a), Integer.valueOf(tVar.f129189a), false);
            Objects.requireNonNull(imageView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.views.AnimateDraweeView");
            if (i3 == 0) {
                z = true;
            } else {
                z = false;
            }
            imageView.a(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(Context context, m mVar, h<com.ss.android.ugc.effectmanager.effect.model.ProviderEffect> hVar, k<com.ss.android.ugc.effectmanager.effect.model.ProviderEffect> kVar, ViewGroup viewGroup, h.f.a.b<? super b.c, z> bVar) {
        super(context, mVar, hVar, kVar, viewGroup, bVar);
        l.d(context, "");
        l.d(mVar, "");
        this.v = mVar;
        this.f129182c = hVar;
    }
}

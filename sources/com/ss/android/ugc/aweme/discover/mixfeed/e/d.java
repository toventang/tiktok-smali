package com.ss.android.ugc.aweme.discover.mixfeed.e;

import android.graphics.Outline;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import b.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.discover.model.SearchOperation;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.k.aq;
import com.ss.android.ugc.aweme.search.k.ar;
import com.ss.android.ugc.aweme.search.k.at;
import com.ss.android.ugc.aweme.search.l.j;
import com.ss.android.ugc.aweme.search.l.m;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.concurrent.Callable;

public final class d extends com.ss.android.ugc.aweme.discover.adapter.b {

    /* renamed from: f  reason: collision with root package name */
    public static final a f81757f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public AnimatedImageView f81758a;

    /* renamed from: b  reason: collision with root package name */
    public TuxTextView f81759b;

    /* renamed from: c  reason: collision with root package name */
    public AutoRTLImageView f81760c;

    /* renamed from: d  reason: collision with root package name */
    public String f81761d = "";

    /* renamed from: e  reason: collision with root package name */
    public View f81762e;

    static {
        Covode.recordClassIndex(50791);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50793);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static d a(ViewGroup viewGroup) {
            l.d(viewGroup, "");
            return new d(m.a(viewGroup, R.layout.avx), viewGroup);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.b
    public final View I() {
        View view = this.itemView;
        l.b(view, "");
        return view;
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f81763a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f81764b = 2;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SearchOperation f81765c;

        static {
            Covode.recordClassIndex(50795);
        }

        c(d dVar, SearchOperation searchOperation) {
            this.f81763a = dVar;
            this.f81765c = searchOperation;
        }

        public final void run() {
            i.b(new e(this.f81763a, this.f81765c), i.f4824a);
        }
    }

    static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f81768a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchOperation f81769b;

        static {
            Covode.recordClassIndex(50797);
        }

        e(d dVar, SearchOperation searchOperation) {
            this.f81768a = dVar;
            this.f81769b = searchOperation;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.ss.android.ugc.aweme.search.k.c c2 = new ar().c(this.f81768a.F().f121275j);
            c2.c(ar.f121195b, this.f81769b.getCardId());
            ((com.ss.android.ugc.aweme.search.k.c) c2.o(this.f81768a.F().f121272g)).b(this.f81768a.F().f121271f).f();
            return z.f158842a;
        }
    }

    private void a(boolean z) {
        this.f81758a.setAttached(z);
        this.f81758a.setUserVisibleHint(z);
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.b
    public final void onViewAttachedToWindow(View view) {
        l.d(view, "");
        super.onViewAttachedToWindow(view);
        a(true);
        b("search_result_show");
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.b
    public final void onViewDetachedFromWindow(View view) {
        l.d(view, "");
        super.onViewDetachedFromWindow(view);
        a(false);
        this.f81758a.c();
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.f.b.m implements h.f.a.b<Aweme, String> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(50794);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Aweme aweme) {
            String str = this.this$0.f81761d;
            if (TextUtils.isEmpty(str)) {
                return this.this$0.F().f121275j + '_' + this.this$0.F().f121278m;
            }
            return str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.d$d  reason: collision with other inner class name */
    public static final class View$OnClickListenerC1914d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f81766a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchOperation f81767b;

        static {
            Covode.recordClassIndex(50796);
        }

        View$OnClickListenerC1914d(d dVar, SearchOperation searchOperation) {
            this.f81766a = dVar;
            this.f81767b = searchOperation;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            MainServiceImpl.createIMainServicebyMonsterPlugin(false).startAdsAppActivity(this.f81766a.G(), this.f81767b.getLink(), null);
            com.ss.android.ugc.aweme.search.k.c c2 = new aq().c(this.f81766a.F().f121275j);
            c2.c(aq.f121193b, this.f81767b.getCardId());
            ((com.ss.android.ugc.aweme.search.k.c) c2.o(this.f81766a.F().f121272g)).b(this.f81766a.F().f121271f).f();
            this.f81766a.b("search_result_click");
        }
    }

    public final void b(String str) {
        l.d(str, "");
        if (TextUtils.equals("search_result_click", str)) {
            ((at) ((com.ss.android.ugc.aweme.search.k.d) com.ss.android.ugc.aweme.discover.mixfeed.b.b.b(F()).x("activity")).w("1").g(this.f81761d)).B("click_photo").f();
        } else if (TextUtils.equals("search_result_show", str)) {
            ((com.ss.android.ugc.aweme.search.k.d) com.ss.android.ugc.aweme.discover.mixfeed.b.b.a(F()).x("activity")).w("1").g(this.f81761d).f();
        }
    }

    public final void a(SearchOperation searchOperation) {
        l.d(searchOperation, "");
        String docId = searchOperation.getDocId();
        if (docId == null) {
            docId = "";
        }
        this.f81761d = docId;
        F().a(new b(this));
        if (!searchOperation.getRecorded()) {
            j.a(this.itemView, new c(this, searchOperation));
            searchOperation.setRecorded(true);
        }
        this.f81758a.a(searchOperation.getBanner());
        AnimatedImageView animatedImageView = this.f81758a;
        UrlModel banner = searchOperation.getBanner();
        AnimatedImageView animatedImageView2 = this.f81758a;
        l.b(animatedImageView2, "");
        com.ss.android.ugc.aweme.base.e.a(animatedImageView, banner, animatedImageView2.getControllerListener());
        TuxTextView tuxTextView = this.f81759b;
        l.b(tuxTextView, "");
        tuxTextView.setText(searchOperation.getDesc());
        this.f81759b.setTuxFont(52);
        TuxTextView tuxTextView2 = this.f81759b;
        l.b(tuxTextView2, "");
        tuxTextView2.setMaxLines(2);
        TuxTextView tuxTextView3 = this.f81759b;
        l.b(tuxTextView3, "");
        if (TextUtils.isEmpty(tuxTextView3.getText())) {
            AutoRTLImageView autoRTLImageView = this.f81760c;
            l.b(autoRTLImageView, "");
            autoRTLImageView.setVisibility(4);
        }
        this.itemView.setOnClickListener(new View$OnClickListenerC1914d(this, searchOperation));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view, View view2) {
        super(view);
        l.d(view, "");
        l.d(view2, "");
        this.f81762e = view2;
        this.f81758a = (AnimatedImageView) view.findViewById(R.id.czo);
        this.f81759b = (TuxTextView) view.findViewById(R.id.czn);
        this.f81760c = (AutoRTLImageView) view.findViewById(R.id.cnk);
        if (Build.VERSION.SDK_INT >= 21) {
            AnimatedImageView animatedImageView = this.f81758a;
            l.b(animatedImageView, "");
            animatedImageView.setOutlineProvider(new ViewOutlineProvider() {
                /* class com.ss.android.ugc.aweme.discover.mixfeed.e.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(50792);
                }

                public final void getOutline(View view, Outline outline) {
                    l.d(view, "");
                    l.d(outline, "");
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + 8, 8.0f);
                }
            });
            AnimatedImageView animatedImageView2 = this.f81758a;
            l.b(animatedImageView2, "");
            animatedImageView2.setClipToOutline(true);
        }
    }
}

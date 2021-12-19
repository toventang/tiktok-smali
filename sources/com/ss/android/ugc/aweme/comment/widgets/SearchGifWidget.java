package com.ss.android.ugc.aweme.comment.widgets;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.ar;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.ext.widget.WidgetLifecycleAwareLazy;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.widget.Widget;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.comment.adapter.ab;
import com.ss.android.ugc.aweme.comment.adapter.ae;
import com.ss.android.ugc.aweme.comment.model.GifEmoji;
import com.ss.android.ugc.aweme.comment.ui.bw;
import com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListState;
import com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel;
import com.ss.android.ugc.aweme.comment.widgets.BaseCommentJediWidget;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import h.f.b.y;
import h.z;
import java.util.List;

public final class SearchGifWidget extends BaseSearchGifWidget implements TextWatcher, View.OnClickListener, TextView.OnEditorActionListener, ar<a>, au {

    /* renamed from: g  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f73064g = {new y(SearchGifWidget.class, "mResultLayout", "getMResultLayout()Landroid/view/View;", 0), new y(SearchGifWidget.class, "mRecyclerView", "getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new y(SearchGifWidget.class, "mStatusView", "getMStatusView()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", 0), new y(SearchGifWidget.class, "mEditText", "getMEditText()Landroid/widget/EditText;", 0), new y(SearchGifWidget.class, "mClear", "getMClear()Landroid/view/View;", 0)};
    private static final d u = new d((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    public boolean f73065h;

    /* renamed from: i  reason: collision with root package name */
    public final ae f73066i;

    /* renamed from: j  reason: collision with root package name */
    private final BaseCommentJediWidget.a f73067j = a((int) R.id.c7i);

    /* renamed from: k  reason: collision with root package name */
    private final BaseCommentJediWidget.a f73068k = a((int) R.id.djl);

    /* renamed from: l  reason: collision with root package name */
    private final BaseCommentJediWidget.a f73069l = a((int) R.id.e_o);

    /* renamed from: m  reason: collision with root package name */
    private final h.h f73070m = h.i.a(h.m.NONE, new o(this));
    private final BaseCommentJediWidget.a n = a((int) R.id.duv);
    private final BaseCommentJediWidget.a o = a((int) R.id.duu);
    private final WidgetLifecycleAwareLazy p;
    private final int q;
    private final h.f.a.a<z> r;
    private final h.f.a.a<z> s;
    private final String t;

    public static final class b extends h.f.b.m implements h.f.a.b<GifEmojiListState, GifEmojiListState> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(45004);
        }

        public b() {
            super(1);
        }

        public final GifEmojiListState invoke(GifEmojiListState gifEmojiListState) {
            h.f.b.l.c(gifEmojiListState, "");
            return gifEmojiListState;
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends GifEmoji>, z> {
        public static final g INSTANCE = new g();

        static {
            Covode.recordClassIndex(45009);
        }

        public g() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* bridge */ /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, List<? extends GifEmoji> list) {
            invoke(iVar, list);
            return z.f158842a;
        }

        public final void invoke(com.bytedance.jedi.arch.i iVar, List<? extends GifEmoji> list) {
            h.f.b.l.c(list, "");
        }
    }

    static {
        Covode.recordClassIndex(45002);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentJediWidget, com.ss.android.ugc.aweme.comment.widgets.BaseSearchGifWidget, com.bytedance.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public final View q() {
        return this.f73067j.a(this, f73064g[0]);
    }

    public final DmtStatusView r() {
        return (DmtStatusView) this.f73069l.a(this, f73064g[2]);
    }

    public final ab s() {
        return (ab) this.f73070m.getValue();
    }

    public final EditText t() {
        return (EditText) this.n.a(this, f73064g[3]);
    }

    public final GifEmojiListViewModel u() {
        return (GifEmojiListViewModel) this.p.getValue();
    }

    static final class d {
        static {
            Covode.recordClassIndex(45006);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    public static final class f implements com.bytedance.jedi.arch.ext.list.c<GifEmoji, com.bytedance.jedi.arch.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f73072a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f73073b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f73074c;

        /* renamed from: d  reason: collision with root package name */
        private final h.f.a.b<com.bytedance.jedi.arch.i, z> f73075d;

        /* renamed from: e  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> f73076e;

        /* renamed from: f  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends GifEmoji>, z> f73077f;

        static {
            Covode.recordClassIndex(45008);
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.b<com.bytedance.jedi.arch.i, z> a() {
            return this.f73075d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> b() {
            return this.f73076e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends GifEmoji>, z> c() {
            return this.f73077f;
        }

        public f(h.f.a.b bVar, h.f.a.m mVar, h.f.a.m mVar2) {
            this.f73072a = bVar;
            this.f73073b = mVar;
            this.f73074c = mVar2;
            this.f73075d = bVar;
            this.f73076e = mVar;
            this.f73077f = mVar2;
        }
    }

    public static final class h implements com.bytedance.jedi.arch.ext.list.c<GifEmoji, com.bytedance.jedi.arch.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f73078a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f73079b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f73080c;

        /* renamed from: d  reason: collision with root package name */
        private final h.f.a.b<com.bytedance.jedi.arch.i, z> f73081d;

        /* renamed from: e  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> f73082e;

        /* renamed from: f  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends GifEmoji>, z> f73083f;

        static {
            Covode.recordClassIndex(45010);
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.b<com.bytedance.jedi.arch.i, z> a() {
            return this.f73081d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> b() {
            return this.f73082e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends GifEmoji>, z> c() {
            return this.f73083f;
        }

        public h(h.f.a.b bVar, h.f.a.m mVar, h.f.a.m mVar2) {
            this.f73078a = bVar;
            this.f73079b = mVar;
            this.f73080c = mVar2;
            this.f73081d = bVar;
            this.f73082e = mVar;
            this.f73083f = mVar2;
        }
    }

    @Override // com.bytedance.widget.Widget
    public final int b() {
        return this.q;
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseSearchGifWidget
    public final boolean p() {
        return this.f73065h;
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* synthetic */ a d() {
        return new a();
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseSearchGifWidget
    public final void n() {
        KeyboardUtils.c(t());
    }

    static final class o extends h.f.b.m implements h.f.a.a<ab> {
        final /* synthetic */ SearchGifWidget this$0;

        public final /* synthetic */ class b implements h.a {

            /* renamed from: a  reason: collision with root package name */
            private final /* synthetic */ h.f.a.a f73085a;

            static {
                Covode.recordClassIndex(45022);
            }

            public b(h.f.a.a aVar) {
                this.f73085a = aVar;
            }

            @Override // com.ss.android.ugc.aweme.common.a.h.a
            public final /* synthetic */ void l() {
                h.f.b.l.b(this.f73085a.invoke(), "");
            }
        }

        static {
            Covode.recordClassIndex(45020);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(SearchGifWidget searchGifWidget) {
            super(0);
            this.this$0 = searchGifWidget;
        }

        static final /* synthetic */ class a extends h.f.b.j implements h.f.a.a<z> {
            static {
                Covode.recordClassIndex(45021);
            }

            a(SearchGifWidget searchGifWidget) {
                super(0, searchGifWidget, SearchGifWidget.class, "loadMore", "loadMore()V", 0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                ((SearchGifWidget) this.receiver).v();
                return z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ab invoke() {
            SearchGifWidget searchGifWidget = this.this$0;
            ab abVar = new ab(searchGifWidget, searchGifWidget.f73066i, (byte) 0);
            abVar.a(new b(new a(this.this$0)));
            return abVar;
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchGifWidget f73071a;

        static {
            Covode.recordClassIndex(45007);
        }

        e(SearchGifWidget searchGifWidget) {
            this.f73071a = searchGifWidget;
        }

        public final void run() {
            KeyboardUtils.b(this.f73071a.t());
            this.f73071a.f73065h = true;
        }
    }

    private static boolean x() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseSearchGifWidget
    public final CharSequence o() {
        return t().getText();
    }

    public final void v() {
        u().f72915d.loadMore();
    }

    public final void w() {
        r().g();
        u().a();
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseSearchGifWidget
    public final void l() {
        t().requestFocus();
        t().postDelayed(new e(this), 300);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ Widget $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(45003);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Widget widget, h.k.c cVar) {
            super(0);
            this.$this_viewModel = widget;
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return this.$this_viewModel.getClass().getName() + '_' + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseSearchGifWidget
    public final void m() {
        Editable text = t().getText();
        if (text != null) {
            text.clear();
        }
        a(q());
        t().clearFocus();
        this.f73065h = false;
        n();
    }

    public static final class c extends h.f.b.m implements h.f.a.a<GifEmojiListViewModel> {
        final /* synthetic */ h.f.a.b $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Widget $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(45005);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Widget widget, h.f.a.a aVar, h.k.c cVar, h.f.a.b bVar) {
            super(0);
            this.$this_viewModel = widget;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = bVar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.widget.Widget r0 = r3.$this_viewModel
                com.bytedance.widget.b r0 = r0.j()
                java.lang.Object r1 = r0.b()
                boolean r0 = r1 instanceof androidx.fragment.app.Fragment
                if (r0 == 0) goto L_0x0048
                androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
                com.bytedance.widget.Widget r0 = r3.$this_viewModel
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.ar) r0
                androidx.lifecycle.ad$b r0 = r0.d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
            L_0x001c:
                h.f.a.a r0 = r3.$keyFactory
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_comment_widgets_SearchGifWidget$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel> r0 = com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0042
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0042:
                h.f.a.b r0 = r3.$argumentsAcceptor
                r2.a_(r0)
                return r2
            L_0x0048:
                boolean r0 = r1 instanceof androidx.fragment.app.e
                if (r0 == 0) goto L_0x005b
                androidx.fragment.app.e r1 = (androidx.fragment.app.e) r1
                com.bytedance.widget.Widget r0 = r3.$this_viewModel
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.ar) r0
                androidx.lifecycle.ad$b r0 = r0.d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                goto L_0x001c
            L_0x005b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget.c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_comment_widgets_SearchGifWidget$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    @Override // com.bytedance.widget.Widget
    public final void c() {
        super.c();
        t().addTextChangedListener(this);
        t().setOnEditorActionListener(this);
        BaseCommentJediWidget.a aVar = this.o;
        h.k.i<?>[] iVarArr = f73064g;
        aVar.a(this, iVarArr[4]).setOnClickListener(this);
        RecyclerView recyclerView = (RecyclerView) this.f73068k.a(this, iVarArr[1]);
        recyclerView.a(new bw());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager(0));
        recyclerView.setAdapter(s());
        TuxTextView a2 = com.ss.android.ugc.aweme.comment.util.m.a(k());
        a2.setTextColorRes(R.attr.bg);
        a2.setText(R.string.bn4);
        TuxTextView a3 = com.ss.android.ugc.aweme.comment.util.m.a(k());
        a3.setTextColorRes(R.attr.bg);
        a3.setText(R.string.bn8);
        r().setBuilder(DmtStatusView.a.a(k()).b(a3).c(a2));
        GifEmojiListViewModel u2 = u();
        String str = this.t;
        h.f.b.l.d(str, "");
        u2.c(new GifEmojiListViewModel.f(str));
        ListMiddleware.a(u().f72915d, this, s(), false, new f(new i(this), new k(this), new j(this)), new h(new l(this), new m(this), g.INSTANCE), new n(this), null, 908);
    }

    public final void afterTextChanged(Editable editable) {
        a(editable);
    }

    static final class l extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.i, z> {
        final /* synthetic */ SearchGifWidget this$0;

        static {
            Covode.recordClassIndex(45015);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(SearchGifWidget searchGifWidget) {
            super(1);
            this.this$0 = searchGifWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar) {
            h.f.b.l.d(iVar, "");
            this.this$0.s().ag_();
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.i, z> {
        final /* synthetic */ SearchGifWidget this$0;

        static {
            Covode.recordClassIndex(45011);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(SearchGifWidget searchGifWidget) {
            super(1);
            this.this$0 = searchGifWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar) {
            h.f.b.l.d(iVar, "");
            this.this$0.r().f();
            if (this.this$0.q().getVisibility() != 0) {
                this.this$0.q().setVisibility(0);
            }
            return z.f158842a;
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        Editable editableText = t().getEditableText();
        if (editableText != null) {
            editableText.clear();
        }
        a(q());
        this.r.invoke();
    }

    private final void a(Editable editable) {
        k();
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107229h = x();
        }
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
            u().a();
            r().h();
        } else if (editable == null || editable.length() == 0) {
            w();
            a(q());
        } else if (editable.length() > 8) {
            w();
        } else {
            r().f();
            GifEmojiListViewModel u2 = u();
            u2.b_(new GifEmojiListViewModel.g(u2, editable));
        }
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends GifEmoji>, z> {
        final /* synthetic */ SearchGifWidget this$0;

        static {
            Covode.recordClassIndex(45012);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(SearchGifWidget searchGifWidget) {
            super(2);
            this.this$0 = searchGifWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, List<? extends GifEmoji> list) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            final List<? extends GifEmoji> list2 = list;
            h.f.b.l.d(iVar2, "");
            h.f.b.l.d(list2, "");
            iVar2.withState(this.this$0.u(), new h.f.a.b<GifEmojiListState, z>(this) {
                /* class com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget.j.AnonymousClass1 */
                final /* synthetic */ j this$0;

                static {
                    Covode.recordClassIndex(45013);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(GifEmojiListState gifEmojiListState) {
                    h.f.b.l.d(gifEmojiListState, "");
                    if (list2.isEmpty()) {
                        this.this$0.this$0.w();
                    } else {
                        this.this$0.this$0.r().d();
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> {
        final /* synthetic */ SearchGifWidget this$0;

        static {
            Covode.recordClassIndex(45014);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(SearchGifWidget searchGifWidget) {
            super(2);
            this.this$0 = searchGifWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(th, "");
            this.this$0.u().a();
            this.this$0.r().h();
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> {
        final /* synthetic */ SearchGifWidget this$0;

        static {
            Covode.recordClassIndex(45016);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(SearchGifWidget searchGifWidget) {
            super(2);
            this.this$0 = searchGifWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(th, "");
            this.this$0.s().j();
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ SearchGifWidget this$0;

        final /* synthetic */ class a implements h.a {

            /* renamed from: a  reason: collision with root package name */
            private final /* synthetic */ h.f.a.a f73084a;

            static {
                Covode.recordClassIndex(45019);
            }

            a(h.f.a.a aVar) {
                this.f73084a = aVar;
            }

            @Override // com.ss.android.ugc.aweme.common.a.h.a
            public final /* synthetic */ void l() {
                h.f.b.l.b(this.f73084a.invoke(), "");
            }
        }

        static {
            Covode.recordClassIndex(45017);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(SearchGifWidget searchGifWidget) {
            super(2);
            this.this$0 = searchGifWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                this.this$0.s().ai_();
                this.this$0.s().a(new a(new h.f.a.a<z>(this.this$0) {
                    /* class com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget.n.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(45018);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        ((SearchGifWidget) this.receiver).v();
                        return z.f158842a;
                    }
                }));
            } else {
                this.this$0.s().ah_();
                this.this$0.s().a((h.a) null);
            }
            return z.f158842a;
        }
    }

    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        Editable editable;
        if (i2 != 3) {
            return false;
        }
        if (!r().l() && !r().m() && !r().n()) {
            return false;
        }
        if (textView != null) {
            editable = textView.getEditableText();
        } else {
            editable = null;
        }
        a(editable);
        return true;
    }

    public SearchGifWidget(h.f.a.a<z> aVar, ae aeVar, h.f.a.a<z> aVar2, String str) {
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(aeVar, "");
        h.f.b.l.d(aVar2, "");
        h.f.b.l.d(str, "");
        this.r = aVar;
        this.f73066i = aeVar;
        this.s = aVar2;
        this.t = str;
        h.k.c a2 = h.f.b.ab.a(GifEmojiListViewModel.class);
        a aVar3 = new a(this, a2);
        this.p = new WidgetLifecycleAwareLazy(this, aVar3, new c(this, aVar3, a2, b.INSTANCE));
        this.q = R.layout.ja;
    }
}

package com.ss.android.ugc.aweme.discover.ui.b;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.GuideSearchWord;
import com.ss.android.ugc.aweme.discover.ui.view.ScrollToEndRecyclerView;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.search.k.ad;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.k.bi;
import com.ss.android.ugc.aweme.search.k.bj;
import com.ss.android.ugc.aweme.search.k.bk;
import com.ss.android.ugc.aweme.search.k.bl;
import com.ss.android.ugc.aweme.search.k.q;
import com.ss.android.ugc.aweme.search.n.d;
import com.ss.android.ugc.aweme.utils.ec;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public class b extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    SparseArray f82377a;

    /* renamed from: b  reason: collision with root package name */
    private final h.h f82378b;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f82379c;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f82380d;

    /* renamed from: e  reason: collision with root package name */
    private final h.h f82381e;

    /* renamed from: f  reason: collision with root package name */
    private String f82382f;

    /* renamed from: g  reason: collision with root package name */
    private String f82383g;

    /* renamed from: h  reason: collision with root package name */
    private String f82384h;

    /* renamed from: i  reason: collision with root package name */
    private c f82385i;

    static {
        Covode.recordClassIndex(51275);
    }

    private final a getAdapter() {
        return (a) this.f82379c.getValue();
    }

    private final LinearLayoutManager getLayoutManager() {
        return (LinearLayoutManager) this.f82380d.getValue();
    }

    public final HashSet<GuideSearchWord> getAlreadyMobWords() {
        return (HashSet) this.f82381e.getValue();
    }

    public int getJsFilterId() {
        return R.layout.axl;
    }

    public final ScrollToEndRecyclerView getListView() {
        return (ScrollToEndRecyclerView) this.f82378b.getValue();
    }

    public final c getItemClickListener() {
        return this.f82385i;
    }

    /* access modifiers changed from: protected */
    public final String getOriginalKeyword() {
        return this.f82383g;
    }

    /* access modifiers changed from: protected */
    public final String getOriginalSearchId() {
        return this.f82384h;
    }

    /* access modifiers changed from: protected */
    public final String getSearchLabel() {
        return this.f82382f;
    }

    static final class d extends m implements h.f.a.a<a> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(51284);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a();
        }
    }

    static final class e extends m implements h.f.a.a<HashSet<GuideSearchWord>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f82398a = new e();

        static {
            Covode.recordClassIndex(51285);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashSet<GuideSearchWord> invoke() {
            return new HashSet();
        }
    }

    static final class f extends m implements h.f.a.a<LinearLayoutManager> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(51286);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayoutManager invoke() {
            return new LinearLayoutManager(0, false);
        }
    }

    public final class a extends RecyclerView.a<RecyclerView.ViewHolder> {

        /* renamed from: a  reason: collision with root package name */
        public List<GuideSearchWord> f82386a;

        static {
            Covode.recordClassIndex(51276);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return a(viewGroup, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final int getItemCount() {
            List<GuideSearchWord> list = this.f82386a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        public final void a(List<GuideSearchWord> list) {
            this.f82386a = list;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            List<GuideSearchWord> list;
            l.d(viewHolder, "");
            GuideSearchWord guideSearchWord = ((C1934b) viewHolder).f82391a;
            if (guideSearchWord != null && (list = this.f82386a) != null) {
                int indexOf = list.indexOf(guideSearchWord);
                if (!b.this.getAlreadyMobWords().contains(guideSearchWord)) {
                    b.this.getAlreadyMobWords().add(guideSearchWord);
                    b.i.b(new j(b.this, guideSearchWord, indexOf), b.i.f4824a);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.b.b$a$a  reason: collision with other inner class name */
        static final class View$OnClickListenerC1933a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f82388a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f82389b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ RecyclerView.ViewHolder f82390c;

            static {
                Covode.recordClassIndex(51277);
            }

            View$OnClickListenerC1933a(a aVar, int i2, RecyclerView.ViewHolder viewHolder) {
                this.f82388a = aVar;
                this.f82389b = i2;
                this.f82390c = viewHolder;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                List<GuideSearchWord> list = this.f82388a.f82386a;
                if (list == null) {
                    l.b();
                }
                int i2 = 0;
                for (T t : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        n.a();
                    }
                    T t2 = t;
                    if (t2.getSelected() && i2 != this.f82389b) {
                        t2.setSelected(false);
                        this.f82388a.notifyItemChanged(i2);
                    }
                    i2 = i3;
                }
                a aVar = this.f82388a;
                String str = "";
                l.b(view, str);
                ScrollToEndRecyclerView listView = b.this.getListView();
                l.b(listView, str);
                b.this.getListView().a((int) ((view.getX() + (((float) view.getWidth()) * 0.5f)) - (((float) listView.getWidth()) * 0.5f)), 0);
                List<GuideSearchWord> list2 = this.f82388a.f82386a;
                if (list2 == null) {
                    l.b();
                }
                GuideSearchWord guideSearchWord = list2.get(this.f82389b);
                boolean selected = guideSearchWord.getSelected();
                if (selected) {
                    b bVar = b.this;
                    String originalKeyword = b.this.getOriginalKeyword();
                    if (originalKeyword == null) {
                        originalKeyword = str;
                    }
                    String originalKeyword2 = b.this.getOriginalKeyword();
                    if (originalKeyword2 != null) {
                        str = originalKeyword2;
                    }
                    bVar.a(originalKeyword, str, true);
                    b bVar2 = b.this;
                    List<GuideSearchWord> list3 = this.f82388a.f82386a;
                    if (list3 == null) {
                        l.b();
                    }
                    bVar2.a(list3.get(this.f82389b), this.f82389b, "cancel");
                } else {
                    b bVar3 = b.this;
                    String originalKeyword3 = b.this.getOriginalKeyword();
                    if (originalKeyword3 == null) {
                        originalKeyword3 = str;
                    }
                    String displayQuery = guideSearchWord.getDisplayQuery();
                    if (displayQuery != null) {
                        str = displayQuery;
                    }
                    bVar3.a(originalKeyword3, str, false);
                    b bVar4 = b.this;
                    List<GuideSearchWord> list4 = this.f82388a.f82386a;
                    if (list4 == null) {
                        l.b();
                    }
                    bVar4.a(list4.get(this.f82389b), this.f82389b, "enter");
                }
                guideSearchWord.setSelected(!selected);
                RecyclerView.ViewHolder viewHolder = this.f82390c;
                Objects.requireNonNull(viewHolder, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.guide.GuideSearchHeadView.GuideSearchViewHolder");
                C1934b bVar5 = (C1934b) viewHolder;
                List<GuideSearchWord> list5 = this.f82388a.f82386a;
                if (list5 == null) {
                    l.b();
                }
                bVar5.a(list5.get(this.f82389b));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
            l.d(viewHolder, "");
            C1934b bVar = (C1934b) viewHolder;
            List<GuideSearchWord> list = this.f82386a;
            if (list == null) {
                l.b();
            }
            bVar.a(list.get(i2));
            viewHolder.itemView.setOnClickListener(new View$OnClickListenerC1933a(this, i2, viewHolder));
        }

        private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
            boolean a2;
            MethodCollector.i(920);
            l.d(viewGroup, "");
            C1934b bVar = new C1934b(com.ss.android.ugc.aweme.search.l.m.a(viewGroup, R.layout.avj));
            try {
                if (bVar.itemView.getParent() != null) {
                    try {
                        a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a2) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                        com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(bVar.itemView);
                        }
                    }
                }
            } catch (Exception e2) {
                ai.a(e2);
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            gg.f143005a = bVar.getClass().getName();
            MethodCollector.o(920);
            return bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.b.b$b  reason: collision with other inner class name */
    public static final class C1934b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public GuideSearchWord f82391a;

        /* renamed from: b  reason: collision with root package name */
        private final h.h f82392b;

        /* renamed from: c  reason: collision with root package name */
        private final h.h f82393c;

        /* renamed from: d  reason: collision with root package name */
        private final h.h f82394d;

        /* renamed from: e  reason: collision with root package name */
        private final h.h f82395e;

        static {
            Covode.recordClassIndex(51278);
        }

        private final int a() {
            return ((Number) this.f82392b.getValue()).intValue();
        }

        private final int b() {
            return ((Number) this.f82393c.getValue()).intValue();
        }

        private final Drawable c() {
            return (Drawable) this.f82394d.getValue();
        }

        private final Drawable d() {
            return (Drawable) this.f82395e.getValue();
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.b.b$b$a */
        static final class a extends m implements h.f.a.a<Drawable> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(51279);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Drawable invoke() {
                Context context = this.$itemView.getContext();
                l.b(context, "");
                return context.getResources().getDrawable(R.drawable.bbt);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.b.b$b$b  reason: collision with other inner class name */
        static final class C1935b extends m implements h.f.a.a<Integer> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(51280);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1935b(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Integer invoke() {
                Context context = this.$itemView.getContext();
                l.b(context, "");
                return Integer.valueOf(context.getResources().getColor(R.color.bh));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.b.b$b$c */
        static final class c extends m implements h.f.a.a<Drawable> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(51281);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Drawable invoke() {
                Context context = this.$itemView.getContext();
                l.b(context, "");
                return context.getResources().getDrawable(R.drawable.bbu);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.b.b$b$d */
        static final class d extends m implements h.f.a.a<Integer> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(51282);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Integer invoke() {
                Context context = this.$itemView.getContext();
                l.b(context, "");
                return Integer.valueOf(context.getResources().getColor(R.color.c4));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1934b(View view) {
            super(view);
            l.d(view, "");
            this.f82392b = ec.a(new C1935b(view));
            this.f82393c = ec.a(new d(view));
            this.f82394d = ec.a(new c(view));
            this.f82395e = ec.a(new a(view));
        }

        public final void a(GuideSearchWord guideSearchWord) {
            l.d(guideSearchWord, "");
            this.f82391a = guideSearchWord;
            View view = this.itemView;
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
            ((TuxTextView) view).setText(guideSearchWord.getGsQuery());
            if (guideSearchWord.getSelected()) {
                ((TuxTextView) this.itemView).setTextColor(a());
                this.itemView.setBackground(d());
                return;
            }
            ((TuxTextView) this.itemView).setTextColor(b());
            this.itemView.setBackground(c());
        }
    }

    static final class g extends m implements h.f.a.a<ScrollToEndRecyclerView> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(51287);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ScrollToEndRecyclerView invoke() {
            b bVar = this.this$0;
            if (bVar.f82377a == null) {
                bVar.f82377a = new SparseArray();
            }
            View view = (View) bVar.f82377a.get(R.id.djs);
            if (view != null) {
                return view;
            }
            View findViewById = bVar.findViewById(R.id.djs);
            bVar.f82377a.put(R.id.djs, findViewById);
            return findViewById;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f82399a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GuideSearchWord f82400b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f82401c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f82402d;

        static {
            Covode.recordClassIndex(51288);
        }

        h(b bVar, GuideSearchWord guideSearchWord, int i2, String str) {
            this.f82399a = bVar;
            this.f82400b = guideSearchWord;
            this.f82401c = i2;
            this.f82402d = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            String searchId;
            ad c2;
            q a2 = am.a();
            String str2 = "";
            if (a2 == null || (c2 = a2.c()) == null || (str = c2.f121172a) == null) {
                str = str2;
            }
            com.ss.android.ugc.aweme.search.k.c a3 = ((bk) ((bk) new bj().i(this.f82400b.getId())).z(this.f82400b.getQueryId()).v("guide_search").d(Integer.valueOf(this.f82401c)).w(this.f82400b.getDisplayQuery()).D(this.f82400b.getGsQuery()).C(this.f82400b.getDisplayQuery()).x(this.f82399a.getOriginalKeyword()).a(str).d(str).c(ac.a.f91473a.b(str))).y(this.f82399a.getSearchLabel()).a((Integer) -1);
            a3.c(bj.f121222b, this.f82402d);
            com.ss.android.ugc.aweme.search.k.b c3 = a3.c("search_id_a", str);
            com.ss.android.ugc.aweme.search.n.h b2 = d.a.b();
            if (!(b2 == null || (searchId = b2.getSearchId()) == null)) {
                str2 = searchId;
            }
            c3.c("search_id_a_x", str2).f();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f82403a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f82404b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f82405c;

        static {
            Covode.recordClassIndex(51289);
        }

        i(b bVar, List list, Context context) {
            this.f82403a = bVar;
            this.f82404b = list;
            this.f82405c = context;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            bk c2 = new bi().v("guide_search").c(Integer.valueOf(this.f82404b.size()));
            GuideSearchWord guideSearchWord = (GuideSearchWord) n.h(this.f82404b);
            if (guideSearchWord != null) {
                str = guideSearchWord.getQueryId();
            } else {
                str = null;
            }
            bk y = ((bk) c2.z(str).x(this.f82403a.getOriginalKeyword()).a(this.f82403a.getOriginalSearchId()).d(this.f82403a.getOriginalSearchId()).c(ac.a.f91473a.b(this.f82403a.getOriginalSearchId()))).y(this.f82403a.getSearchLabel());
            Context context = this.f82405c;
            if (context instanceof androidx.fragment.app.e) {
                y.a(SearchEnterViewModel.a.a((androidx.fragment.app.e) context).b().obtainLogData("tab_name"));
            }
            y.a((Integer) -1).f();
            return z.f158842a;
        }
    }

    static final class j<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f82406a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GuideSearchWord f82407b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f82408c;

        static {
            Covode.recordClassIndex(51290);
        }

        j(b bVar, GuideSearchWord guideSearchWord, int i2) {
            this.f82406a = bVar;
            this.f82407b = guideSearchWord;
            this.f82408c = i2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            ((bk) ((bk) new bl().i(this.f82407b.getId())).z(this.f82407b.getQueryId()).v("guide_search").d(Integer.valueOf(this.f82408c)).w(this.f82407b.getDisplayQuery()).D(this.f82407b.getGsQuery()).C(this.f82407b.getDisplayQuery()).x(this.f82406a.getOriginalKeyword()).a(this.f82406a.getOriginalSearchId()).d(this.f82406a.getOriginalSearchId()).c(ac.a.f91473a.b(this.f82406a.getOriginalSearchId()))).y(this.f82406a.getSearchLabel()).a((Integer) -1).f();
            return z.f158842a;
        }
    }

    public final void setItemClickListener(c cVar) {
        this.f82385i = cVar;
    }

    /* access modifiers changed from: protected */
    public final void setOriginalKeyword(String str) {
        this.f82383g = str;
    }

    /* access modifiers changed from: protected */
    public final void setOriginalSearchId(String str) {
        this.f82384h = str;
    }

    /* access modifiers changed from: protected */
    public final void setSearchLabel(String str) {
        this.f82382f = str;
    }

    private final void a(List<GuideSearchWord> list) {
        b.i.b(new i(this, list, getContext()), b.i.f4824a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(1023);
        this.f82378b = ec.a(new g(this));
        this.f82379c = ec.a(new d(this));
        this.f82380d = ec.a(new f(context));
        this.f82381e = ec.a(e.f82398a);
        com.a.a(LayoutInflater.from(context), getJsFilterId(), this, true);
        ScrollToEndRecyclerView listView = getListView();
        l.b(listView, "");
        listView.setLayoutManager(getLayoutManager());
        ScrollToEndRecyclerView listView2 = getListView();
        l.b(listView2, "");
        listView2.setAdapter(getAdapter());
        getListView().b(new c((int) com.bytedance.common.utility.n.b(getContext(), 8.0f), (int) com.bytedance.common.utility.n.b(getContext(), 16.0f)));
        MethodCollector.o(1023);
    }

    public /* synthetic */ b(Context context, byte b2) {
        this(context);
    }

    public static final class c extends RecyclerView.h {

        /* renamed from: a  reason: collision with root package name */
        private final int f82396a;

        /* renamed from: b  reason: collision with root package name */
        private final int f82397b;

        static {
            Covode.recordClassIndex(51283);
        }

        public c(int i2, int i3) {
            this.f82396a = i2;
            this.f82397b = i3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
            l.d(rect, "");
            l.d(view, "");
            l.d(recyclerView, "");
            l.d(sVar, "");
            int d2 = RecyclerView.d(view);
            if (gb.a()) {
                if (d2 == 0) {
                    rect.right = this.f82397b;
                }
                rect.left = this.f82396a;
                return;
            }
            if (d2 == 0) {
                rect.left = this.f82397b;
            }
            rect.right = this.f82396a;
        }
    }

    public final void a(GuideSearchWord guideSearchWord, int i2, String str) {
        b.i.b(new h(this, guideSearchWord, i2, str), b.i.f4824a);
    }

    public final void a(String str, String str2, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        c cVar = this.f82385i;
        if (cVar != null) {
            cVar.a(str, str2, z);
        }
    }

    public final void a(List<GuideSearchWord> list, String str, String str2, String str3) {
        l.d(list, "");
        l.d(str, "");
        l.d(str3, "");
        setVisibility(0);
        getAdapter().a(list);
        getListView().b(0);
        getAlreadyMobWords().clear();
        this.f82383g = str;
        this.f82384h = str3;
        this.f82382f = str2;
        if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
            a(list);
        }
    }
}

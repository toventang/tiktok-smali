package com.ss.android.ugc.aweme.discover.helper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.discover.helper.l;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.widget.b;
import com.ss.android.ugc.aweme.search.k.bj;
import com.ss.android.ugc.aweme.search.k.bk;
import com.ss.android.ugc.aweme.search.k.bl;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.List;

public final class e extends l.b implements b.AbstractC1947b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f81106e = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final h f81107a = i.a((h.f.a.a) new f(this));

    /* renamed from: b  reason: collision with root package name */
    final h f81108b = i.a((h.f.a.a) new C1892e(this));

    /* renamed from: c  reason: collision with root package name */
    public TypeWords f81109c;

    /* renamed from: d  reason: collision with root package name */
    public final SearchIntermediateViewModel f81110d;

    /* renamed from: j  reason: collision with root package name */
    private final h f81111j;

    /* renamed from: k  reason: collision with root package name */
    private final h f81112k = i.a((h.f.a.a) new c(this));

    /* renamed from: l  reason: collision with root package name */
    private boolean f81113l;

    static {
        Covode.recordClassIndex(50409);
    }

    private com.ss.android.ugc.aweme.discover.widget.b i() {
        return (com.ss.android.ugc.aweme.discover.widget.b) this.f81112k.getValue();
    }

    public final LinearLayout a() {
        return (LinearLayout) this.f81111j.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(50411);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    private final void k() {
        com.ss.android.ugc.aweme.discover.widget.b i2;
        if (this.f81139f && (i2 = i()) != null) {
            i2.a((com.ss.android.ugc.aweme.discover.widget.b) i2.f82830c);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.l.b
    public final void b() {
        super.b();
        com.ss.android.ugc.aweme.discover.widget.b i2 = i();
        if (i2 != null) {
            i2.b();
        }
        this.f81113l = true;
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.l.b
    public final void d() {
        super.d();
        com.ss.android.ugc.aweme.discover.widget.b i2 = i();
        if (i2 != null) {
            i2.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.l.b
    public final void f() {
        super.f();
        com.ss.android.ugc.aweme.discover.widget.b i2 = i();
        if (i2 != null) {
            i2.b();
        }
    }

    static final class c extends m implements h.f.a.a<com.ss.android.ugc.aweme.discover.widget.b> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(50412);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.discover.widget.b invoke() {
            TextSwitcher textSwitcher = (TextSwitcher) this.this$0.f81108b.getValue();
            if (textSwitcher != null) {
                return new com.ss.android.ugc.aweme.discover.widget.b((TextView) this.this$0.f81107a.getValue(), textSwitcher);
            }
            return null;
        }
    }

    static final class f extends m implements h.f.a.a<TextView> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(50416);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            View view;
            LinearLayout a2 = this.this$0.a();
            if (a2 != null) {
                view = a2.findViewById(R.id.f7t);
            } else {
                view = null;
            }
            if (!(view instanceof TextView)) {
                return null;
            }
            return view;
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.l.b
    public final void c() {
        com.ss.android.ugc.aweme.discover.widget.b i2;
        super.c();
        LinearLayout a2 = a();
        if (a2 != null && a2.getVisibility() == 0 && (i2 = i()) != null) {
            i2.a((com.ss.android.ugc.aweme.discover.widget.b) i2.f82830c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.e$e  reason: collision with other inner class name */
    static final class C1892e extends m implements h.f.a.a<TextSwitcher> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(50414);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1892e(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.helper.e$e$a */
        static final class a implements ViewSwitcher.ViewFactory {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ TextSwitcher f81115a;

            static {
                Covode.recordClassIndex(50415);
            }

            a(TextSwitcher textSwitcher) {
                this.f81115a = textSwitcher;
            }

            public final View makeView() {
                View view;
                View a2 = com.a.a(LayoutInflater.from(this.f81115a.getContext()), R.layout.auw, this.f81115a, false);
                if (com.ss.android.ugc.aweme.search.h.f121133a.s()) {
                    if (!(a2 instanceof TextView)) {
                        view = null;
                    } else {
                        view = a2;
                    }
                    TextView textView = (TextView) view;
                    if (textView != null) {
                        textView.setTextColor(androidx.core.content.b.c(this.f81115a.getContext(), R.color.bx));
                    }
                }
                return a2;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextSwitcher invoke() {
            View view;
            LinearLayout a2 = this.this$0.a();
            if (a2 != null) {
                view = a2.findViewById(R.id.eri);
            } else {
                view = null;
            }
            if (!(view instanceof TextSwitcher)) {
                view = null;
            }
            TextSwitcher textSwitcher = (TextSwitcher) view;
            if (textSwitcher == null) {
                return null;
            }
            textSwitcher.setFactory(new a(textSwitcher));
            return textSwitcher;
        }
    }

    static final class d extends m implements h.f.a.a<LinearLayout> {
        final /* synthetic */ l.e $param;

        static {
            Covode.recordClassIndex(50413);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(l.e eVar) {
            super(0);
            this.$param = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayout invoke() {
            View view;
            MethodCollector.i(6189);
            View findViewById = this.$param.f81146a.findViewById(R.id.fl3);
            View view2 = null;
            if (!(findViewById instanceof ViewStub)) {
                findViewById = null;
            }
            ViewStub viewStub = (ViewStub) findViewById;
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            if (view instanceof LinearLayout) {
                view2 = view;
            }
            MethodCollector.o(6189);
            return view2;
        }
    }

    private final boolean j() {
        com.ss.android.ugc.aweme.arch.widgets.base.c<Integer> intermediateState;
        com.ss.android.ugc.aweme.arch.widgets.base.c<Integer> intermediateState2;
        Integer value;
        SearchIntermediateViewModel searchIntermediateViewModel = this.f81110d;
        if (searchIntermediateViewModel == null || (intermediateState = searchIntermediateViewModel.getIntermediateState()) == null || intermediateState.getValue() == null) {
            return false;
        }
        SearchIntermediateViewModel searchIntermediateViewModel2 = this.f81110d;
        if (searchIntermediateViewModel2 == null || (intermediateState2 = searchIntermediateViewModel2.getIntermediateState()) == null || (value = intermediateState2.getValue()) == null || value.intValue() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.l.b
    public final void e() {
        LinearLayout a2;
        super.e();
        if (this.f81113l || (a2 = a()) == null || a2.getVisibility() != 0) {
            this.f81113l = false;
            return;
        }
        com.ss.android.ugc.aweme.discover.widget.b i2 = i();
        if (i2 != null) {
            i2.a((com.ss.android.ugc.aweme.discover.widget.b) i2.f82830c);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.l.b
    public final Word g() {
        List<Word> list;
        Word word;
        String word2;
        com.ss.android.ugc.aweme.discover.widget.b i2 = i();
        if (i2 == null) {
            return null;
        }
        int i3 = i2.f82833f;
        TypeWords typeWords = this.f81109c;
        if (typeWords == null || (list = typeWords.words) == null || list.isEmpty()) {
            return null;
        }
        int size = list.size();
        if (i3 < 0 || size <= i3 || (word = list.get(i3)) == null || (word2 = word.getWord()) == null || word2.length() == 0) {
            return null;
        }
        return word;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l.e f81114a;

        static {
            Covode.recordClassIndex(50410);
        }

        a(l.e eVar) {
            this.f81114a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            l.a aVar = this.f81114a.f81147b;
            h.f.b.l.b(view, "");
            aVar.a(view);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.l.b
    public final void b(boolean z) {
        super.b(z);
        com.ss.android.ugc.aweme.discover.widget.b i2 = i();
        if (i2 != null) {
            i2.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.l.b
    public final void a(boolean z) {
        LinearLayout a2;
        super.a(z);
        if (!z || (a2 = a()) == null || a2.getVisibility() != 0) {
            com.ss.android.ugc.aweme.discover.widget.b i2 = i();
            if (i2 != null) {
                i2.b();
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.discover.widget.b i3 = i();
        if (i3 != null) {
            i3.a((com.ss.android.ugc.aweme.discover.widget.b) i3.f82830c);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.l.b
    public final void c(boolean z) {
        List<String> list;
        com.ss.android.ugc.aweme.discover.widget.b i2;
        super.c(z);
        if (z) {
            com.ss.android.ugc.aweme.discover.widget.b i3 = i();
            if (i3 != null) {
                if (i3.f82829b == null) {
                    i3.a(0, false);
                }
                String str = i3.f82829b;
                i3.f82832e = str;
                TextView textView = i3.f82836i;
                if (textView != null) {
                    textView.setText(str);
                }
            }
            if (!this.f81140g && (i2 = i()) != null) {
                i2.a((com.ss.android.ugc.aweme.discover.widget.b) i2.f82830c);
            }
            LinearLayout a2 = a();
            if (a2 != null) {
                a2.setVisibility(0);
            }
            com.ss.android.ugc.aweme.discover.widget.b i4 = i();
            if (i4 != null && (list = i4.f82831d) != null && list.size() > 0) {
                this.f81142i.f81147b.a(4);
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.discover.widget.b i5 = i();
        if (i5 != null) {
            i5.b();
        }
        LinearLayout a3 = a();
        if (a3 != null) {
            a3.setVisibility(8);
        }
        this.f81142i.f81147b.a(0);
    }

    @Override // com.ss.android.ugc.aweme.discover.widget.b.AbstractC1947b
    public final void a(int i2) {
        List<Word> list;
        String str;
        TypeWords typeWords = this.f81109c;
        if (typeWords != null && (list = typeWords.words) != null && !list.isEmpty()) {
            String str2 = null;
            if (!false) {
                int size = list.size();
                if (i2 < 0 || i2 >= size) {
                    i2 = 0;
                }
                l.a aVar = this.f81142i.f81147b;
                String id = list.get(i2).getId();
                com.ss.android.ugc.aweme.discover.widget.b i3 = i();
                if (i3 != null) {
                    str = i3.f82829b;
                    if (str == null) {
                        str = "";
                    }
                } else {
                    str = null;
                }
                aVar.a(new Word(id, str));
                h();
                com.ss.android.ugc.aweme.search.k.c cVar = (com.ss.android.ugc.aweme.search.k.c) new bl().d(Integer.valueOf(i2)).w(list.get(i2).getWord()).i(list.get(i2).getId());
                TypeWords typeWords2 = this.f81109c;
                if (typeWords2 != null) {
                    str2 = typeWords2.logId;
                }
                bk bkVar = (bk) cVar.d(str2);
                h.f.b.l.d(bkVar, "");
                bkVar.v("search_bar_outer").y("discovery").f();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.l.b
    public final void a(com.ss.android.ugc.aweme.discover.api.a.a<TypeWords> aVar) {
        T t;
        List<Word> list = (aVar == null || (t = aVar.f80830b) == null) ? null : t.words;
        if (list == null || list.isEmpty()) {
            this.f81141h = false;
            k();
            return;
        }
        TypeWords typeWords = this.f81109c;
        if (h.f.b.l.a(list, typeWords != null ? typeWords.words : null)) {
            this.f81141h = false;
            this.f81109c = aVar.f80830b;
            k();
            return;
        }
        this.f81141h = true;
        this.f81109c = aVar.f80830b;
        ArrayList arrayList = new ArrayList();
        for (T t2 : list) {
            T t3 = aVar.f80830b;
            t2.setImplId(t3 != null ? t3.logId : null);
            arrayList.add(t2.getShowWord());
        }
        com.ss.android.ugc.aweme.discover.widget.b i2 = i();
        if (i2 != null) {
            i2.f82831d = arrayList;
            i2.f82833f = -1;
            if (!j()) {
                if (this.f81141h && !j()) {
                    this.f81142i.f81147b.a(8);
                    LinearLayout a2 = a();
                    if (a2 != null) {
                        a2.setVisibility(0);
                    }
                }
                if (this.f81139f) {
                    com.ss.android.ugc.aweme.discover.widget.b i3 = i();
                    if (i3 != null) {
                        i3.a(0, false);
                        i3.a((com.ss.android.ugc.aweme.discover.widget.b) i3.f82830c);
                        return;
                    }
                    return;
                }
                com.ss.android.ugc.aweme.discover.widget.b i4 = i();
                if (i4 != null && i4.f82829b == null) {
                    i4.a(0, false);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.l.b
    public final boolean a(String str) {
        List<Word> list;
        Word word;
        String word2;
        h.f.b.l.d(str, "");
        com.ss.android.ugc.aweme.discover.widget.b i2 = i();
        if (i2 != null) {
            int i3 = i2.f82833f;
            TypeWords typeWords = this.f81109c;
            if (!(typeWords == null || (list = typeWords.words) == null || list.isEmpty())) {
                int size = list.size();
                if (i3 >= 0 && size > i3) {
                    String str2 = null;
                    if (!(1 == 0 || (word = list.get(i3)) == null || (word2 = word.getWord()) == null || word2.length() == 0)) {
                        l.a aVar = this.f81142i.f81147b;
                        String showWord = word.getShowWord();
                        if (showWord == null) {
                            showWord = "";
                        }
                        String word3 = word.getWord();
                        if (word3 == null) {
                            word3 = "";
                        }
                        aVar.a(showWord, word3);
                        h();
                        bj bjVar = new bj();
                        bjVar.d(Integer.valueOf(i3));
                        bjVar.w(word.getWord());
                        bjVar.i(word.getId());
                        TypeWords typeWords2 = this.f81109c;
                        if (typeWords2 != null) {
                            str2 = typeWords2.logId;
                        }
                        bjVar.d(str2);
                        h.f.b.l.d(bjVar, "");
                        bjVar.v("search_bar_outer").y("discovery").f();
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(l.e eVar, SearchIntermediateViewModel searchIntermediateViewModel) {
        super(eVar);
        h.f.b.l.d(eVar, "");
        this.f81110d = searchIntermediateViewModel;
        this.f81111j = i.a((h.f.a.a) new d(eVar));
        LinearLayout a2 = a();
        if (a2 != null) {
            a2.setOnClickListener(new a(eVar));
        }
        com.ss.android.ugc.aweme.discover.widget.b i2 = i();
        if (i2 != null) {
            i2.f82830c = 3000;
            h.f.b.l.d(this, "");
            i2.f82835h.add(this);
        }
    }
}

package com.ss.android.ugc.aweme.sticker.view.internal.search;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.sticker.view.a.l;
import com.ss.android.ugc.aweme.sticker.view.internal.search.e;
import com.ss.android.ugc.aweme.sticker.view.internal.search.f;
import com.ss.android.ugc.aweme.sticker.view.internal.search.m;
import com.ss.android.ugc.aweme.story.h.c.a.b;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class SearchStickerViewContainer implements TextView.OnEditorActionListener, au, c {
    public static final a z = new a((byte) 0);
    private RelativeLayout A;
    private RelativeLayout B;
    private TextView C;
    private LinearLayout D;
    private RecyclerView E;
    private TextView F;
    private LinearLayout G;
    private final com.ss.android.ugc.aweme.sticker.presenter.o H;
    private final f.a.l.c<e> I;
    private final int J;
    private boolean K;
    private f.a.l.b<String> L;
    private long M;
    private final f.a.b.a N;
    private final v O;
    private final u P;
    private final int Q;
    private final com.ss.android.ugc.aweme.sticker.panel.j R;
    private final h.f.a.a<z> S;

    /* renamed from: a  reason: collision with root package name */
    public View f136473a;

    /* renamed from: b  reason: collision with root package name */
    View f136474b;

    /* renamed from: c  reason: collision with root package name */
    public EditText f136475c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f136476d;

    /* renamed from: e  reason: collision with root package name */
    public RecyclerView f136477e;

    /* renamed from: f  reason: collision with root package name */
    public LinearLayout f136478f;

    /* renamed from: g  reason: collision with root package name */
    public h f136479g;

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a> f136480h;

    /* renamed from: i  reason: collision with root package name */
    h f136481i;

    /* renamed from: j  reason: collision with root package name */
    public final f.a.l.c<g> f136482j;

    /* renamed from: k  reason: collision with root package name */
    public final androidx.lifecycle.t<f> f136483k;

    /* renamed from: l  reason: collision with root package name */
    public androidx.lifecycle.t<Boolean> f136484l;

    /* renamed from: m  reason: collision with root package name */
    public long f136485m;
    public final h.f.a.a<Boolean> n;
    public k o;
    public d p;
    public int q;
    boolean r;
    LinearLayoutManager s;
    public String t;
    public final androidx.fragment.app.e u;
    public final View v;
    public final l.b w;
    public final a x;
    public final int y;

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final b f136486a = new b();

        static {
            Covode.recordClassIndex(89137);
        }

        b() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(89135);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_STOP) {
            onStop();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestory();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89136);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.c
    public final LiveData<f> f() {
        return this.f136483k;
    }

    private final boolean o() {
        if (this.Q == 1) {
            return true;
        }
        return false;
    }

    @androidx.lifecycle.v(a = i.a.ON_DESTROY)
    private final void onDestory() {
        this.N.a();
    }

    static final class p extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ SearchStickerViewContainer this$0;

        static {
            Covode.recordClassIndex(89154);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(SearchStickerViewContainer searchStickerViewContainer) {
            super(0);
            this.this$0 = searchStickerViewContainer;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            if (this.this$0.m()) {
                return "1";
            }
            return "0";
        }
    }

    static final class r extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ SearchStickerViewContainer this$0;

        static {
            Covode.recordClassIndex(89156);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(SearchStickerViewContainer searchStickerViewContainer) {
            super(0);
            this.this$0 = searchStickerViewContainer;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            if (this.this$0.m()) {
                return "1";
            }
            return "0";
        }
    }

    static final class w extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ SearchStickerViewContainer this$0;

        static {
            Covode.recordClassIndex(89161);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(SearchStickerViewContainer searchStickerViewContainer) {
            super(0);
            this.this$0 = searchStickerViewContainer;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(!this.this$0.m());
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.c
    public final f.a.t<e> e() {
        f.a.t<e> c2 = this.I.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.c
    public final void g() {
        EditText editText = this.f136475c;
        if (editText == null) {
            h.f.b.l.a("etSearchInput");
        }
        editText.requestFocus();
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.c
    public final void i() {
        h hVar = this.f136479g;
        if (hVar == null) {
            h.f.b.l.a("stickerAdapter");
        }
        hVar.f136547b = false;
    }

    public final String l() {
        if (m()) {
            return "1";
        }
        return "0";
    }

    @androidx.lifecycle.v(a = i.a.ON_PAUSE)
    private final void onPause() {
        if (m()) {
            this.K = true;
            EditText editText = this.f136475c;
            if (editText == null) {
                h.f.b.l.a("etSearchInput");
            }
            KeyboardUtils.c(editText, this.u);
        }
    }

    @androidx.lifecycle.v(a = i.a.ON_STOP)
    private final void onStop() {
        EditText editText = this.f136475c;
        if (editText == null) {
            h.f.b.l.a("etSearchInput");
        }
        editText.setText((CharSequence) null);
        a(false);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.c
    public final void c() {
        EditText editText = this.f136475c;
        if (editText == null) {
            h.f.b.l.a("etSearchInput");
        }
        KeyboardUtils.c(editText, this.u);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.c
    public final f.a.t<g> d() {
        f.a.t<g> c2 = this.f136482j.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.c
    public final boolean h() {
        h hVar = this.f136479g;
        if (hVar == null) {
            h.f.b.l.a("stickerAdapter");
        }
        if (hVar.f136547b) {
            return true;
        }
        h hVar2 = this.f136481i;
        if (hVar2 == null) {
            h.f.b.l.a("recommendAdapter");
        }
        if (hVar2.f136547b) {
            return true;
        }
        return false;
    }

    public final int j() {
        int a2;
        int i2;
        if (this.R.f135220h == 2) {
            a2 = (int) com.ss.android.ugc.tools.utils.r.a(this.u, 300.0f);
            i2 = this.q;
        } else {
            a2 = (int) com.ss.android.ugc.tools.utils.r.a(this.u, 172.0f);
            i2 = this.q;
        }
        return a2 + i2;
    }

    public final void k() {
        if (!m()) {
            if (o()) {
                h.f.a.a<z> aVar = this.S;
                if (aVar != null) {
                    aVar.invoke();
                    return;
                }
                return;
            }
            b();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean m() {
        Boolean value = this.f136484l.getValue();
        if (value != null) {
            return value.booleanValue();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class s implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchStickerViewContainer f136502a;

        static {
            Covode.recordClassIndex(89157);
        }

        s(SearchStickerViewContainer searchStickerViewContainer) {
            this.f136502a = searchStickerViewContainer;
        }

        public final void run() {
            SearchStickerViewContainer.a(this.f136502a).requestFocus();
            SearchStickerViewContainer.a(this.f136502a).onWindowFocusChanged(true);
            SearchStickerViewContainer.a(this.f136502a).setImeOptions(3);
            KeyboardUtils.a(SearchStickerViewContainer.a(this.f136502a), this.f136502a.u);
        }
    }

    public static final class u implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchStickerViewContainer f136503a;

        static {
            Covode.recordClassIndex(89159);
        }

        public final void run() {
            if (this.f136503a.q > 0) {
                this.f136503a.f136482j.onNext(new g(true, true, false, this.f136503a.j()));
                return;
            }
            View view = this.f136503a.f136473a;
            if (view == null) {
                h.f.b.l.a("rootViewInternal");
            }
            view.postDelayed(this, 100);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        u(SearchStickerViewContainer searchStickerViewContainer) {
            this.f136503a = searchStickerViewContainer;
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.c
    public final View a() {
        View view = this.f136473a;
        if (view == null) {
            h.f.b.l.a("rootViewInternal");
        }
        return view;
    }

    public final void n() {
        RecyclerView recyclerView = this.f136477e;
        if (recyclerView == null) {
            h.f.b.l.a("rvStickerContent");
        }
        if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
            RecyclerView recyclerView2 = this.f136477e;
            if (recyclerView2 == null) {
                h.f.b.l.a("rvStickerContent");
            }
            RecyclerView.i layoutManager = recyclerView2.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            ((GridLayoutManager) layoutManager).a(this.O);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.c
    public final void b() {
        EditText editText = this.f136475c;
        if (editText == null) {
            h.f.b.l.a("etSearchInput");
        }
        editText.postDelayed(new s(this), 100);
        com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a> bVar = this.f136480h;
        if (bVar == null) {
            h.f.b.l.a("statusView");
        }
        bVar.setState(com.ss.android.ugc.tools.view.widget.b.a.NONE);
        LinearLayout linearLayout = this.f136478f;
        if (linearLayout == null) {
            h.f.b.l.a("llStickerContainer");
        }
        linearLayout.setVisibility(0);
        if (h.f.b.l.a(this.x.c(), m.c.f136590a)) {
            a(this, false, 2);
        }
        if (this.y == 2) {
            RecyclerView recyclerView = this.f136477e;
            if (recyclerView == null) {
                h.f.b.l.a("rvStickerContent");
            }
            recyclerView.b(0);
        }
        if (this.q <= 0) {
            View view = this.f136473a;
            if (view == null) {
                h.f.b.l.a("rootViewInternal");
            }
            view.postDelayed(this.P, 100);
            return;
        }
        this.f136482j.onNext(new g(true, true, false, j()));
    }

    public static final class d implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchStickerViewContainer f136488a;

        static {
            Covode.recordClassIndex(89139);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(SearchStickerViewContainer searchStickerViewContainer) {
            this.f136488a = searchStickerViewContainer;
        }

        public final void afterTextChanged(Editable editable) {
            int i2;
            String str;
            SearchStickerViewContainer searchStickerViewContainer = this.f136488a;
            View view = searchStickerViewContainer.f136474b;
            if (view == null) {
                h.f.b.l.a("btnClearSearchText");
            }
            if (TextUtils.isEmpty(String.valueOf(editable))) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            view.setVisibility(i2);
            if (editable == null || (str = editable.toString()) == null) {
                str = "";
            }
            searchStickerViewContainer.t = str;
            if (str.length() == 0) {
                com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a> bVar = searchStickerViewContainer.f136480h;
                if (bVar == null) {
                    h.f.b.l.a("statusView");
                }
                if (bVar.getState() != com.ss.android.ugc.tools.view.widget.b.a.NONE) {
                    com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a> bVar2 = searchStickerViewContainer.f136480h;
                    if (bVar2 == null) {
                        h.f.b.l.a("statusView");
                    }
                    bVar2.setState(com.ss.android.ugc.tools.view.widget.b.a.NONE);
                    LinearLayout linearLayout = searchStickerViewContainer.f136478f;
                    if (linearLayout == null) {
                        h.f.b.l.a("llStickerContainer");
                    }
                    linearLayout.setVisibility(0);
                }
                SearchStickerViewContainer.a(searchStickerViewContainer, false, 3);
            } else if (!h.f.b.l.a((Object) str, (Object) searchStickerViewContainer.x.d().getValue())) {
                searchStickerViewContainer.b(searchStickerViewContainer.r);
            }
        }
    }

    public static final class g implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchStickerViewContainer f136491a;

        static {
            Covode.recordClassIndex(89142);
        }

        @Override // com.ss.android.ugc.aweme.story.h.c.a.b.a
        public final void c(int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(SearchStickerViewContainer searchStickerViewContainer) {
            this.f136491a = searchStickerViewContainer;
        }

        @Override // com.ss.android.ugc.aweme.story.h.c.a.b.a
        public final void a(int i2) {
            if (!this.f136491a.m()) {
                this.f136491a.q = i2;
                this.f136491a.f136484l.setValue(true);
            }
        }

        @Override // com.ss.android.ugc.aweme.story.h.c.a.b.a
        public final void b(int i2) {
            if (this.f136491a.m()) {
                this.f136491a.f136484l.setValue(false);
                if (SearchStickerViewContainer.b(this.f136491a).getVisibility() != 0) {
                    this.f136491a.a(false);
                }
            }
        }
    }

    public static final class q extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchStickerViewContainer f136501a;

        static {
            Covode.recordClassIndex(89155);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        q(SearchStickerViewContainer searchStickerViewContainer) {
            this.f136501a = searchStickerViewContainer;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2);
            if (this.f136501a.m() && i2 == 1) {
                this.f136501a.c();
            }
        }
    }

    public static final class v extends GridLayoutManager.c {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchStickerViewContainer f136504e;

        static {
            Covode.recordClassIndex(89160);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        v(SearchStickerViewContainer searchStickerViewContainer) {
            this.f136504e = searchStickerViewContainer;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int a(int i2) {
            if (i2 == 0) {
                return 5;
            }
            h hVar = this.f136504e.f136479g;
            if (hVar == null) {
                h.f.b.l.a("stickerAdapter");
            }
            if (i2 == hVar.getItemCount() - 1) {
                return 5;
            }
            return 1;
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchStickerViewContainer f136489a;

        static {
            Covode.recordClassIndex(89140);
        }

        e(SearchStickerViewContainer searchStickerViewContainer) {
            this.f136489a = searchStickerViewContainer;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f136489a.k();
        }
    }

    static final class m<T> implements androidx.lifecycle.u<f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchStickerViewContainer f136498a;

        static {
            Covode.recordClassIndex(89151);
        }

        m(SearchStickerViewContainer searchStickerViewContainer) {
            this.f136498a = searchStickerViewContainer;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(f fVar) {
            f fVar2 = fVar;
            SearchStickerViewContainer searchStickerViewContainer = this.f136498a;
            h.f.b.l.b(fVar2, "");
            searchStickerViewContainer.a(fVar2);
        }
    }

    public static final /* synthetic */ EditText a(SearchStickerViewContainer searchStickerViewContainer) {
        EditText editText = searchStickerViewContainer.f136475c;
        if (editText == null) {
            h.f.b.l.a("etSearchInput");
        }
        return editText;
    }

    public static final /* synthetic */ RecyclerView b(SearchStickerViewContainer searchStickerViewContainer) {
        RecyclerView recyclerView = searchStickerViewContainer.f136477e;
        if (recyclerView == null) {
            h.f.b.l.a("rvStickerContent");
        }
        return recyclerView;
    }

    public static final /* synthetic */ com.ss.android.ugc.tools.view.widget.b.b c(SearchStickerViewContainer searchStickerViewContainer) {
        com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a> bVar = searchStickerViewContainer.f136480h;
        if (bVar == null) {
            h.f.b.l.a("statusView");
        }
        return bVar;
    }

    public static final /* synthetic */ LinearLayout d(SearchStickerViewContainer searchStickerViewContainer) {
        LinearLayout linearLayout = searchStickerViewContainer.f136478f;
        if (linearLayout == null) {
            h.f.b.l.a("llStickerContainer");
        }
        return linearLayout;
    }

    static final class h<T> implements androidx.lifecycle.u<com.ss.android.ugc.aweme.sticker.presenter.n> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchStickerViewContainer f136493a;

        static {
            Covode.recordClassIndex(89145);
        }

        h(SearchStickerViewContainer searchStickerViewContainer) {
            this.f136493a = searchStickerViewContainer;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.sticker.presenter.n nVar) {
            Effect effect = nVar.f135423b;
            if (effect != null && this.f136493a.a(effect)) {
                this.f136493a.a(false);
            }
        }
    }

    static final class k<T> implements androidx.lifecycle.u<k> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchStickerViewContainer f136496a;

        static {
            Covode.recordClassIndex(89149);
        }

        k(SearchStickerViewContainer searchStickerViewContainer) {
            this.f136496a = searchStickerViewContainer;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(k kVar) {
            k kVar2 = kVar;
            List<Effect> list = kVar2.f136582b;
            if (list != null && !list.isEmpty()) {
                this.f136496a.o = kVar2;
                SearchStickerViewContainer searchStickerViewContainer = this.f136496a;
                h.f.b.l.b(kVar2, "");
                searchStickerViewContainer.a(kVar2);
            }
        }
    }

    static final class t extends h.f.b.m implements h.f.a.b<ViewGroup, View> {
        final /* synthetic */ SearchStickerViewContainer this$0;

        static {
            Covode.recordClassIndex(89158);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(SearchStickerViewContainer searchStickerViewContainer) {
            super(1);
            this.this$0 = searchStickerViewContainer;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            Object invoke;
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            h.f.a.b<? super ViewGroup, ? extends View> bVar = this.this$0.w.f136210f.f135203c;
            if (bVar == null || (invoke = bVar.invoke(viewGroup2)) == null) {
                return com.ss.android.ugc.tools.view.widget.b.e.a(viewGroup2);
            }
            return invoke;
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchStickerViewContainer f136487a;

        static {
            Covode.recordClassIndex(89138);
        }

        c(SearchStickerViewContainer searchStickerViewContainer) {
            this.f136487a = searchStickerViewContainer;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f136487a.f136483k.setValue(new f.d(this.f136487a.l()));
            SearchStickerViewContainer.a(this.f136487a).setText((CharSequence) null);
            this.f136487a.a(true);
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchStickerViewContainer f136490a;

        static {
            Covode.recordClassIndex(89141);
        }

        f(SearchStickerViewContainer searchStickerViewContainer) {
            this.f136490a = searchStickerViewContainer;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f136490a.f136483k.setValue(new f.a(this.f136490a.l()));
            this.f136490a.x.a();
            this.f136490a.k();
        }
    }

    static final class i<T> implements f.a.d.f<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchStickerViewContainer f136494a;

        static {
            Covode.recordClassIndex(89146);
        }

        i(SearchStickerViewContainer searchStickerViewContainer) {
            this.f136494a = searchStickerViewContainer;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(String str) {
            String str2 = str;
            if (h.f.b.l.a((Object) str2, (Object) this.f136494a.t)) {
                this.f136494a.x.a(new com.ss.android.ugc.aweme.sticker.repository.c.c(null, str2, 50, null, this.f136494a.x.b(), 25));
            }
        }
    }

    static final class j<T> implements androidx.lifecycle.u<d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchStickerViewContainer f136495a;

        static {
            Covode.recordClassIndex(89148);
        }

        j(SearchStickerViewContainer searchStickerViewContainer) {
            this.f136495a = searchStickerViewContainer;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(d dVar) {
            d dVar2 = dVar;
            List<Effect> list = dVar2.f136524a;
            if (list != null && !list.isEmpty()) {
                this.f136495a.p = dVar2;
                SearchStickerViewContainer searchStickerViewContainer = this.f136495a;
                h.f.b.l.b(dVar2, "");
                h hVar = searchStickerViewContainer.f136481i;
                if (hVar == null) {
                    h.f.b.l.a("recommendAdapter");
                }
                hVar.a((List) dVar2.f136524a.subList(0, 5));
            }
        }
    }

    static final class n<T> implements androidx.lifecycle.u<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchStickerViewContainer f136499a;

        static {
            Covode.recordClassIndex(89152);
        }

        n(SearchStickerViewContainer searchStickerViewContainer) {
            this.f136499a = searchStickerViewContainer;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(String str) {
            String str2 = str;
            if (!h.f.b.l.a((Object) str2, (Object) SearchStickerViewContainer.a(this.f136499a).getText().toString())) {
                SearchStickerViewContainer.a(this.f136499a).setText(str2);
            }
        }
    }

    static final class o<T> implements androidx.lifecycle.u<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchStickerViewContainer f136500a;

        static {
            Covode.recordClassIndex(89153);
        }

        o(SearchStickerViewContainer searchStickerViewContainer) {
            this.f136500a = searchStickerViewContainer;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Boolean bool) {
            int i2;
            Boolean bool2 = bool;
            if (this.f136500a.y == 2) {
                RecyclerView b2 = SearchStickerViewContainer.b(this.f136500a);
                h.f.b.l.b(bool2, "");
                int i3 = 8;
                if (bool2.booleanValue()) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                b2.setVisibility(i2);
                TextView textView = this.f136500a.f136476d;
                if (textView == null) {
                    h.f.b.l.a("tvSearchNullResult");
                }
                if (!bool2.booleanValue()) {
                    i3 = 0;
                }
                textView.setVisibility(i3);
            }
        }
    }

    public final void a(f fVar) {
        h.f.b.l.d(fVar, "");
        this.f136483k.setValue(fVar);
    }

    static final class l<T> implements androidx.lifecycle.u<com.ss.android.ugc.tools.view.widget.b.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchStickerViewContainer f136497a;

        static {
            Covode.recordClassIndex(89150);
        }

        l(SearchStickerViewContainer searchStickerViewContainer) {
            this.f136497a = searchStickerViewContainer;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.ss.android.ugc.tools.view.widget.b.a aVar) {
            com.ss.android.ugc.tools.view.widget.b.a aVar2 = aVar;
            if (aVar2 != null) {
                int i2 = n.f136591a[aVar2.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        SearchStickerViewContainer.c(this.f136497a).setState(com.ss.android.ugc.tools.view.widget.b.a.NONE);
                        SearchStickerViewContainer.d(this.f136497a).setVisibility(0);
                    } else if (i2 == 3) {
                        SearchStickerViewContainer.c(this.f136497a).setState(com.ss.android.ugc.tools.view.widget.b.a.NONE);
                        SearchStickerViewContainer.d(this.f136497a).setVisibility(0);
                        this.f136497a.a(false, true);
                    } else if (i2 == 4) {
                        SearchStickerViewContainer.c(this.f136497a).setState(com.ss.android.ugc.tools.view.widget.b.a.NONE);
                        SearchStickerViewContainer.d(this.f136497a).setVisibility(0);
                        this.f136497a.a(false, true);
                    }
                } else if (System.currentTimeMillis() - this.f136497a.f136485m > 500) {
                    SearchStickerViewContainer.c(this.f136497a).setState(com.ss.android.ugc.tools.view.widget.b.a.LOADING);
                    SearchStickerViewContainer.d(this.f136497a).setVisibility(8);
                    this.f136497a.f136485m = System.currentTimeMillis();
                }
            }
        }
    }

    public final void a(k kVar) {
        EditText editText = this.f136475c;
        if (editText == null) {
            h.f.b.l.a("etSearchInput");
        }
        if (TextUtils.isEmpty(editText.getText())) {
            a(this, false, 3);
            return;
        }
        n();
        if (this.y == 1) {
            LinearLayout linearLayout = this.G;
            if (linearLayout == null) {
                h.f.b.l.a("recommendViewContainer");
            }
            linearLayout.setVisibility(8);
            if (o()) {
                RecyclerView recyclerView = this.f136477e;
                if (recyclerView == null) {
                    h.f.b.l.a("rvStickerContent");
                }
                recyclerView.setVisibility(0);
                if (kVar.f136581a) {
                    TextView textView = this.f136476d;
                    if (textView == null) {
                        h.f.b.l.a("tvSearchNullResult");
                    }
                    textView.setVisibility(0);
                } else {
                    TextView textView2 = this.f136476d;
                    if (textView2 == null) {
                        h.f.b.l.a("tvSearchNullResult");
                    }
                    textView2.setVisibility(8);
                }
                h hVar = this.f136479g;
                if (hVar == null) {
                    h.f.b.l.a("stickerAdapter");
                }
                hVar.a(kVar);
            } else if (kVar.f136581a) {
                RecyclerView recyclerView2 = this.f136477e;
                if (recyclerView2 == null) {
                    h.f.b.l.a("rvStickerContent");
                }
                recyclerView2.setVisibility(8);
                TextView textView3 = this.f136476d;
                if (textView3 == null) {
                    h.f.b.l.a("tvSearchNullResult");
                }
                textView3.setVisibility(8);
            } else {
                RecyclerView recyclerView3 = this.f136477e;
                if (recyclerView3 == null) {
                    h.f.b.l.a("rvStickerContent");
                }
                recyclerView3.setVisibility(0);
                TextView textView4 = this.f136476d;
                if (textView4 == null) {
                    h.f.b.l.a("tvSearchNullResult");
                }
                textView4.setVisibility(8);
                h hVar2 = this.f136479g;
                if (hVar2 == null) {
                    h.f.b.l.a("stickerAdapter");
                }
                hVar2.a(kVar);
            }
        } else {
            RecyclerView recyclerView4 = this.f136477e;
            if (recyclerView4 == null) {
                h.f.b.l.a("rvStickerContent");
            }
            recyclerView4.setVisibility(0);
            h hVar3 = this.f136479g;
            if (hVar3 == null) {
                h.f.b.l.a("stickerAdapter");
            }
            hVar3.a(kVar);
            if (kVar.f136581a) {
                TextView textView5 = this.f136476d;
                if (textView5 == null) {
                    h.f.b.l.a("tvSearchNullResult");
                }
                textView5.setVisibility(0);
            } else {
                TextView textView6 = this.f136476d;
                if (textView6 == null) {
                    h.f.b.l.a("tvSearchNullResult");
                }
                textView6.setVisibility(8);
            }
            LinearLayout linearLayout2 = this.G;
            if (linearLayout2 == null) {
                h.f.b.l.a("recommendViewContainer");
            }
            linearLayout2.setVisibility(8);
            if (kVar.f136581a && m()) {
                RecyclerView recyclerView5 = this.f136477e;
                if (recyclerView5 == null) {
                    h.f.b.l.a("rvStickerContent");
                }
                recyclerView5.setVisibility(8);
                TextView textView7 = this.f136476d;
                if (textView7 == null) {
                    h.f.b.l.a("tvSearchNullResult");
                }
                textView7.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z2) {
        EditText editText = this.f136475c;
        if (editText == null) {
            h.f.b.l.a("etSearchInput");
        }
        String obj = editText.getText().toString();
        if (!TextUtils.isEmpty(obj)) {
            if (z2) {
                RecyclerView recyclerView = this.f136477e;
                if (recyclerView == null) {
                    h.f.b.l.a("rvStickerContent");
                }
                if (recyclerView.getVisibility() == 0) {
                    EditText editText2 = this.f136475c;
                    if (editText2 == null) {
                        h.f.b.l.a("etSearchInput");
                    }
                    KeyboardUtils.c(editText2, this.u);
                }
            }
            this.M = System.currentTimeMillis();
            this.L.onNext(obj);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.c
    public final void a(boolean z2) {
        EditText editText = this.f136475c;
        if (editText == null) {
            h.f.b.l.a("etSearchInput");
        }
        KeyboardUtils.c(editText, this.u);
        this.f136482j.onNext(new g(false, a((Effect) null), z2, j()));
        if (z2) {
            this.I.onNext(e.a.f136525a);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.c
    public final boolean a(Effect effect) {
        if (effect == null) {
            effect = this.H.f();
        }
        if (effect != null) {
            h hVar = this.f136479g;
            if (hVar == null) {
                h.f.b.l.a("stickerAdapter");
            }
            for (T t2 : hVar.f136367h) {
                if (h.f.b.l.a((Object) t2.getId(), (Object) effect.getId())) {
                    RecyclerView recyclerView = this.f136477e;
                    if (recyclerView == null) {
                        h.f.b.l.a("rvStickerContent");
                    }
                    if (recyclerView.getVisibility() == 0) {
                        return true;
                    }
                    return false;
                }
            }
            h hVar2 = this.f136481i;
            if (hVar2 == null) {
                h.f.b.l.a("recommendAdapter");
            }
            Iterator<T> it = hVar2.f136367h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (h.f.b.l.a((Object) it.next().getId(), (Object) effect.getId())) {
                    RecyclerView recyclerView2 = this.E;
                    if (recyclerView2 == null) {
                        h.f.b.l.a("recommendContent");
                    }
                    if (recyclerView2.getVisibility() == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r4, boolean r5) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0007
            com.ss.android.ugc.aweme.sticker.view.internal.search.a r0 = r3.x
            r0.a()
        L_0x0007:
            java.lang.String r2 = "recommendText"
            if (r5 == 0) goto L_0x004e
            android.widget.EditText r1 = r3.f136475c
            if (r1 != 0) goto L_0x0014
            java.lang.String r0 = "etSearchInput"
            h.f.b.l.a(r0)
        L_0x0014:
            android.text.Editable r0 = r1.getText()
            if (r0 == 0) goto L_0x004e
            android.widget.TextView r1 = r3.F
            if (r1 != 0) goto L_0x0021
            h.f.b.l.a(r2)
        L_0x0021:
            int r0 = com.ss.android.ugc.aweme.shortvideo.m.b.f128754h
            r1.setText(r0)
        L_0x0026:
            android.widget.LinearLayout r1 = r3.G
            if (r1 != 0) goto L_0x002f
            java.lang.String r0 = "recommendViewContainer"
            h.f.b.l.a(r0)
        L_0x002f:
            r0 = 0
            r1.setVisibility(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r3.f136477e
            if (r1 != 0) goto L_0x003c
            java.lang.String r0 = "rvStickerContent"
            h.f.b.l.a(r0)
        L_0x003c:
            r2 = 8
            r1.setVisibility(r2)
            android.widget.TextView r1 = r3.f136476d
            if (r1 != 0) goto L_0x004a
            java.lang.String r0 = "tvSearchNullResult"
            h.f.b.l.a(r0)
        L_0x004a:
            r1.setVisibility(r2)
            return
        L_0x004e:
            android.widget.TextView r1 = r3.F
            if (r1 != 0) goto L_0x0055
            h.f.b.l.a(r2)
        L_0x0055:
            int r0 = com.ss.android.ugc.aweme.shortvideo.m.b.f128756j
            r1.setText(r0)
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer.a(boolean, boolean):void");
    }

    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        b(true);
        return true;
    }

    static /* synthetic */ void a(SearchStickerViewContainer searchStickerViewContainer, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        searchStickerViewContainer.a(z2, false);
    }

    public /* synthetic */ SearchStickerViewContainer(androidx.fragment.app.e eVar, View view, l.b bVar, a aVar, int i2, com.ss.android.ugc.aweme.sticker.panel.j jVar) {
        this(eVar, view, bVar, aVar, 2, i2, jVar, null);
    }

    public SearchStickerViewContainer(androidx.fragment.app.e eVar, View view, l.b bVar, a aVar, int i2, int i3, com.ss.android.ugc.aweme.sticker.panel.j jVar, h.f.a.a<z> aVar2) {
        LinearLayoutManager searchStickerViewContainer$getLayoutManager$stickerLayoutManager$2;
        View view2 = view;
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(view2, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(jVar, "");
        MethodCollector.i(11411);
        this.u = eVar;
        this.v = view2;
        this.w = bVar;
        this.x = aVar;
        this.Q = i2;
        this.y = i3;
        this.R = jVar;
        this.S = aVar2;
        com.ss.android.ugc.aweme.sticker.presenter.o oVar = bVar.f136205a;
        this.H = oVar;
        f.a.l.c<g> cVar = new f.a.l.c<>();
        h.f.b.l.b(cVar, "");
        this.f136482j = cVar;
        f.a.l.c<e> cVar2 = new f.a.l.c<>();
        h.f.b.l.b(cVar2, "");
        this.I = cVar2;
        androidx.lifecycle.t<f> tVar = new androidx.lifecycle.t<>();
        this.f136483k = tVar;
        this.f136484l = new androidx.lifecycle.t<>();
        this.n = new w(this);
        f.a.l.b<String> bVar2 = new f.a.l.b<>();
        h.f.b.l.b(bVar2, "");
        this.L = bVar2;
        this.t = "";
        f.a.b.a aVar3 = new f.a.b.a();
        this.N = aVar3;
        this.O = new v(this);
        this.P = new u(this);
        this.J = (int) com.ss.android.ugc.tools.utils.r.a(eVar, 12.0f);
        if (!o()) {
            View findViewById = view2.findViewById(R.id.ed_);
            if (findViewById != null) {
                view2 = ((ViewStub) findViewById).inflate();
                h.f.b.l.b(view2, "");
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewStub");
                MethodCollector.o(11411);
                throw nullPointerException;
            }
        }
        this.f136473a = view2;
        View findViewById2 = a().findViewById(R.id.dp3);
        h.f.b.l.b(findViewById2, "");
        this.A = (RelativeLayout) findViewById2;
        View findViewById3 = a().findViewById(R.id.duk);
        h.f.b.l.b(findViewById3, "");
        this.B = (RelativeLayout) findViewById3;
        View findViewById4 = a().findViewById(R.id.y2);
        h.f.b.l.b(findViewById4, "");
        this.f136474b = findViewById4;
        View findViewById5 = a().findViewById(R.id.ay5);
        h.f.b.l.b(findViewById5, "");
        this.f136475c = (EditText) findViewById5;
        View findViewById6 = a().findViewById(R.id.f6k);
        h.f.b.l.b(findViewById6, "");
        this.C = (TextView) findViewById6;
        View findViewById7 = a().findViewById(R.id.f6m);
        h.f.b.l.b(findViewById7, "");
        this.f136476d = (TextView) findViewById7;
        View findViewById8 = a().findViewById(R.id.eb9);
        h.f.b.l.b(findViewById8, "");
        this.f136477e = (RecyclerView) findViewById8;
        View findViewById9 = a().findViewById(R.id.dv3);
        h.f.b.l.b(findViewById9, "");
        this.f136478f = (LinearLayout) findViewById9;
        View findViewById10 = a().findViewById(R.id.eba);
        h.f.b.l.b(findViewById10, "");
        this.D = (LinearLayout) findViewById10;
        View findViewById11 = a().findViewById(R.id.duz);
        h.f.b.l.b(findViewById11, "");
        this.G = (LinearLayout) findViewById11;
        View findViewById12 = a().findViewById(R.id.drf);
        h.f.b.l.b(findViewById12, "");
        this.E = (RecyclerView) findViewById12;
        View findViewById13 = a().findViewById(R.id.f6l);
        h.f.b.l.b(findViewById13, "");
        this.F = (TextView) findViewById13;
        View findViewById14 = a().findViewById(R.id.dv2);
        h.f.b.l.b(findViewById14, "");
        ViewGroup viewGroup = (ViewGroup) findViewById14;
        Map a2 = ag.a(h.v.a(com.ss.android.ugc.tools.view.widget.b.a.LOADING, new t(this)));
        Context context = viewGroup.getContext();
        h.f.b.l.b(context, "");
        com.ss.android.ugc.tools.view.widget.b.d dVar = new com.ss.android.ugc.tools.view.widget.b.d(context, a2, com.ss.android.ugc.tools.view.widget.b.a.NONE, (byte) 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.ss.android.ugc.tools.utils.r.a(eVar, 100.0f));
        layoutParams.gravity = 48;
        dVar.setLayoutParams(layoutParams);
        viewGroup.addView(dVar);
        this.f136480h = dVar;
        EditText editText = this.f136475c;
        if (editText == null) {
            h.f.b.l.a("etSearchInput");
        }
        editText.setHint(com.ss.android.ugc.aweme.shortvideo.m.b.f128753g);
        TextView textView = this.C;
        if (textView == null) {
            h.f.b.l.a("tvSearchCancel");
        }
        textView.setText(com.ss.android.ugc.aweme.shortvideo.m.b.f128752f);
        TextView textView2 = this.f136476d;
        if (textView2 == null) {
            h.f.b.l.a("tvSearchNullResult");
        }
        textView2.setText(com.ss.android.ugc.aweme.shortvideo.m.b.f128756j);
        TextView textView3 = this.F;
        if (textView3 == null) {
            h.f.b.l.a("recommendText");
        }
        textView3.setText(com.ss.android.ugc.aweme.shortvideo.m.b.f128756j);
        if (jVar.f135220h == 2) {
            searchStickerViewContainer$getLayoutManager$stickerLayoutManager$2 = new SearchStickerViewContainer$getLayoutManager$stickerLayoutManager$1(this);
        } else {
            searchStickerViewContainer$getLayoutManager$stickerLayoutManager$2 = new SearchStickerViewContainer$getLayoutManager$stickerLayoutManager$2(this);
        }
        RecyclerView recyclerView = this.f136477e;
        if (recyclerView == null) {
            h.f.b.l.a("rvStickerContent");
        }
        recyclerView.setLayoutManager(searchStickerViewContainer$getLayoutManager$stickerLayoutManager$2);
        RecyclerView recyclerView2 = this.f136477e;
        if (recyclerView2 == null) {
            h.f.b.l.a("rvStickerContent");
        }
        recyclerView2.setItemViewCacheSize(5);
        com.ss.android.ugc.aweme.sticker.view.internal.g gVar = bVar.f136209e;
        com.ss.android.ugc.aweme.sticker.panel.h hVar = bVar.f136210f;
        RecyclerView recyclerView3 = this.f136477e;
        if (recyclerView3 == null) {
            h.f.b.l.a("rvStickerContent");
        }
        this.f136479g = new h(eVar, oVar, gVar, aVar, hVar, tVar, recyclerView3.getLayoutManager(), jVar.f135220h, new p(this), (byte) 0);
        RecyclerView recyclerView4 = this.f136477e;
        if (recyclerView4 == null) {
            h.f.b.l.a("rvStickerContent");
        }
        h hVar2 = this.f136479g;
        if (hVar2 == null) {
            h.f.b.l.a("stickerAdapter");
        }
        recyclerView4.setAdapter(hVar2);
        this.s = searchStickerViewContainer$getLayoutManager$stickerLayoutManager$2;
        RecyclerView recyclerView5 = this.f136477e;
        if (recyclerView5 == null) {
            h.f.b.l.a("rvStickerContent");
        }
        recyclerView5.a(new q(this));
        SearchStickerViewContainer$initRecyclerView$recommendLayoutManager$1 searchStickerViewContainer$initRecyclerView$recommendLayoutManager$1 = new SearchStickerViewContainer$initRecyclerView$recommendLayoutManager$1(this);
        RecyclerView recyclerView6 = this.E;
        if (recyclerView6 == null) {
            h.f.b.l.a("recommendContent");
        }
        recyclerView6.setLayoutManager(searchStickerViewContainer$initRecyclerView$recommendLayoutManager$1);
        RecyclerView recyclerView7 = this.E;
        if (recyclerView7 == null) {
            h.f.b.l.a("recommendContent");
        }
        recyclerView7.setItemViewCacheSize(5);
        this.f136481i = new h(eVar, oVar, bVar.f136209e, aVar, bVar.f136210f, tVar, this.s, 3, new r(this), (byte) 0);
        RecyclerView recyclerView8 = this.E;
        if (recyclerView8 == null) {
            h.f.b.l.a("recommendContent");
        }
        h hVar3 = this.f136481i;
        if (hVar3 == null) {
            h.f.b.l.a("recommendAdapter");
        }
        recyclerView8.setAdapter(hVar3);
        a().setOnClickListener(b.f136486a);
        TextView textView4 = this.C;
        if (textView4 == null) {
            h.f.b.l.a("tvSearchCancel");
        }
        textView4.setOnClickListener(new c(this));
        EditText editText2 = this.f136475c;
        if (editText2 == null) {
            h.f.b.l.a("etSearchInput");
        }
        editText2.setOnEditorActionListener(this);
        EditText editText3 = this.f136475c;
        if (editText3 == null) {
            h.f.b.l.a("etSearchInput");
        }
        editText3.addTextChangedListener(new d(this));
        EditText editText4 = this.f136475c;
        if (editText4 == null) {
            h.f.b.l.a("etSearchInput");
        }
        editText4.setOnClickListener(new e(this));
        View view3 = this.f136474b;
        if (view3 == null) {
            h.f.b.l.a("btnClearSearchText");
        }
        view3.setOnClickListener(new f(this));
        if (!o()) {
            new com.ss.android.ugc.aweme.story.h.c.a.b(eVar, null).a(new g(this));
        }
        oVar.n().d().observe(eVar, new h(this));
        LinearLayout linearLayout = this.G;
        if (linearLayout == null) {
            h.f.b.l.a("recommendViewContainer");
        }
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = this.G;
        if (linearLayout2 == null) {
            h.f.b.l.a("recommendViewContainer");
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = 0;
        layoutParams2.rightMargin = 0;
        linearLayout2.setLayoutParams(layoutParams2);
        TextView textView5 = this.F;
        if (textView5 == null) {
            h.f.b.l.a("recommendText");
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        textView5.setLayoutParams(layoutParams3);
        TextView textView6 = this.F;
        if (textView6 == null) {
            h.f.b.l.a("recommendText");
        }
        textView6.setTextSize(14.0f);
        TextView textView7 = this.F;
        if (textView7 == null) {
            h.f.b.l.a("recommendText");
        }
        Context context2 = a().getContext();
        h.f.b.l.b(context2, "");
        textView7.setTextColor(context2.getResources().getColor(R.color.f_));
        RecyclerView recyclerView9 = this.E;
        if (recyclerView9 == null) {
            h.f.b.l.a("recommendContent");
        }
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        Context context3 = a().getContext();
        h.f.b.l.b(context3, "");
        layoutParams4.topMargin = (int) com.ss.android.ugc.tools.utils.r.a(context3, 8.0f);
        recyclerView9.setLayoutParams(layoutParams4);
        aVar.g().observe(eVar, new j(this));
        aVar.e().observe(eVar, new k(this));
        aVar.m().observe(eVar, new l(this));
        if (!o()) {
            aVar.f().observe(eVar, new m(this));
        }
        aVar.d().observe(eVar, new n(this));
        this.f136484l.observe(eVar, new o(this));
        eVar.getLifecycle().a(this);
        aVar3.a(this.L.e(500, TimeUnit.MILLISECONDS).a(f.a.a.b.a.a()).d(new i(this)));
        if (o()) {
            a().setBackground(null);
            a().setVisibility(0);
            TextView textView8 = this.C;
            if (textView8 == null) {
                h.f.b.l.a("tvSearchCancel");
            }
            textView8.setVisibility(8);
            RelativeLayout relativeLayout = this.A;
            if (relativeLayout == null) {
                h.f.b.l.a("rlSearchContainer");
            }
            ViewGroup.LayoutParams layoutParams5 = relativeLayout.getLayoutParams();
            if (layoutParams5 != null) {
                LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                layoutParams6.leftMargin = (int) com.ss.android.ugc.tools.utils.r.a(eVar, 8.5f);
                relativeLayout.setLayoutParams(layoutParams6);
                RecyclerView recyclerView10 = this.f136477e;
                if (recyclerView10 == null) {
                    h.f.b.l.a("rvStickerContent");
                }
                ViewGroup.LayoutParams layoutParams7 = recyclerView10.getLayoutParams();
                if (layoutParams7 != null) {
                    LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
                    layoutParams8.leftMargin = 0;
                    layoutParams8.rightMargin = 0;
                    recyclerView10.setLayoutParams(layoutParams8);
                    EditText editText5 = this.f136475c;
                    if (editText5 == null) {
                        h.f.b.l.a("etSearchInput");
                    }
                    editText5.setFocusableInTouchMode(false);
                } else {
                    NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    MethodCollector.o(11411);
                    throw nullPointerException2;
                }
            } else {
                NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                MethodCollector.o(11411);
                throw nullPointerException3;
            }
        } else {
            a().setVisibility(8);
            TextView textView9 = this.C;
            if (textView9 == null) {
                h.f.b.l.a("tvSearchCancel");
            }
            textView9.setVisibility(0);
            EditText editText6 = this.f136475c;
            if (editText6 == null) {
                h.f.b.l.a("etSearchInput");
            }
            editText6.setFocusableInTouchMode(true);
        }
        if (jVar.f135217e > 0) {
            Context context4 = a().getContext();
            h.f.b.l.b(context4, "");
            int a3 = (int) com.ss.android.ugc.tools.utils.r.a(context4, (float) jVar.f135217e);
            LinearLayout linearLayout3 = this.D;
            if (linearLayout3 == null) {
                h.f.b.l.a("stickerContentRoot");
            }
            ViewGroup.LayoutParams layoutParams9 = linearLayout3.getLayoutParams();
            if (i3 == 2) {
                Context context5 = a().getContext();
                h.f.b.l.b(context5, "");
                layoutParams9.height = a3 - ((int) com.ss.android.ugc.tools.utils.r.a(context5, 24.0f));
            } else {
                Context context6 = a().getContext();
                h.f.b.l.b(context6, "");
                layoutParams9.height = a3 - ((int) com.ss.android.ugc.tools.utils.r.a(context6, 68.0f));
            }
            layoutParams9.height = -1;
            LinearLayout linearLayout4 = this.D;
            if (linearLayout4 == null) {
                h.f.b.l.a("stickerContentRoot");
            }
            linearLayout4.setLayoutParams(layoutParams9);
        }
        MethodCollector.o(11411);
    }
}

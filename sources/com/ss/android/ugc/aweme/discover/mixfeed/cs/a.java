package com.ss.android.ugc.aweme.discover.mixfeed.cs;

import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.discover.mixfeed.cs.ClickSearchView;
import com.ss.android.ugc.aweme.discover.model.suggest.ClickSearchResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.ClickSearchWord;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.k.r;
import com.zhiliaoapp.musically.R;
import h.a.i;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.lang.ref.WeakReference;
import java.util.List;

public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final C1912a f81694f = new C1912a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public r f81695a;

    /* renamed from: b  reason: collision with root package name */
    public ClickSearchView f81696b;

    /* renamed from: c  reason: collision with root package name */
    public ClickSearchView f81697c;

    /* renamed from: d  reason: collision with root package name */
    public final ClickSearchViewModel f81698d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.search.j.a f81699e;

    /* renamed from: g  reason: collision with root package name */
    private List<? extends View> f81700g;

    /* renamed from: h  reason: collision with root package name */
    private final ViewStub f81701h;

    static {
        Covode.recordClassIndex(50752);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.cs.a$a  reason: collision with other inner class name */
    static final class C1912a {
        static {
            Covode.recordClassIndex(50755);
        }

        private C1912a() {
        }

        public /* synthetic */ C1912a(byte b2) {
            this();
        }
    }

    public final void c() {
        ClickSearchViewModel clickSearchViewModel = this.f81698d;
        b bVar = new b(this);
        l.d(bVar, "");
        bVar.invoke(clickSearchViewModel.a().getValue());
    }

    public final ClickSearchView a() {
        MethodCollector.i(251);
        if (this.f81697c == null && this.f81701h.getParent() != null) {
            this.f81701h.setLayoutResource(R.layout.auv);
            View inflate = this.f81701h.inflate();
            if (!(inflate instanceof ClickSearchView)) {
                inflate = null;
            }
            ClickSearchView clickSearchView = (ClickSearchView) inflate;
            if (clickSearchView == null) {
                MethodCollector.o(251);
                return null;
            }
            this.f81697c = clickSearchView;
            this.f81696b = clickSearchView;
            clickSearchView.setVisibility(4);
            clickSearchView.setAlwaysShowingViews(this.f81700g);
            clickSearchView.setOnCloseClickListener(new c(this));
            clickSearchView.setOnClickListener(new d(this));
        }
        ClickSearchView clickSearchView2 = this.f81697c;
        MethodCollector.o(251);
        return clickSearchView2;
    }

    public final void b() {
        com.ss.android.ugc.aweme.search.model.d g2;
        Aweme u = this.f81699e.u();
        if (u != null && !u.isAd() && (g2 = this.f81699e.g()) != null && c.a()) {
            ClickSearchView a2 = a();
            if (a2 == null || !a2.b()) {
                this.f81698d.a(this.f81699e.l());
                ClickSearchViewModel clickSearchViewModel = this.f81698d;
                String keyword = g2.getKeyword();
                l.b(keyword, "");
                clickSearchViewModel.a(u, keyword, this.f81699e.l());
                return;
            }
            ClickSearchView a3 = a();
            if (a3 != null) {
                a3.a();
            }
            this.f81698d.a((Integer) null);
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f81704a;

        static {
            Covode.recordClassIndex(50758);
        }

        d(a aVar) {
            this.f81704a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f81704a.f81699e.s();
        }
    }

    public final void a(View... viewArr) {
        l.d(viewArr, "");
        this.f81700g = i.h(viewArr);
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<View, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(50757);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            l.d(view, "");
            this.this$0.f81699e.t();
            this.this$0.f81698d.d();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<b, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(50756);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(b bVar) {
            b bVar2 = bVar;
            if (bVar2 != null) {
                Integer.valueOf(bVar2.f81705a);
            }
            this.this$0.f81699e.l();
            if (bVar2 == null || bVar2.f81705a != this.this$0.f81699e.l()) {
                if (this.this$0.f81696b != null) {
                    ClickSearchView a2 = this.this$0.a();
                    if (a2 != null) {
                        a2.c();
                    }
                    this.this$0.f81698d.a((Integer) null);
                }
            } else if (bVar2.f81705a == this.this$0.f81699e.l()) {
                this.this$0.b();
            }
            return z.f158842a;
        }
    }

    public a(ClickSearchViewModel clickSearchViewModel, com.ss.android.ugc.aweme.search.j.a aVar, ViewStub viewStub) {
        Fragment fragment;
        Fragment fragment2;
        l.d(clickSearchViewModel, "");
        l.d(aVar, "");
        l.d(viewStub, "");
        this.f81698d = clickSearchViewModel;
        this.f81699e = aVar;
        this.f81701h = viewStub;
        AnonymousClass1 r2 = new u(this) {
            /* class com.ss.android.ugc.aweme.discover.mixfeed.cs.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f81702a;

            static {
                Covode.recordClassIndex(50753);
            }

            {
                this.f81702a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                com.ss.android.ugc.aweme.discover.api.a.a<ClickSearchResponse> aVar;
                T t;
                List<ClickSearchWord> list;
                String str;
                int i2;
                LogPbBean logPbBean;
                b bVar = (b) obj;
                if (bVar != null && (aVar = bVar.f81708d) != null && (t = aVar.f80830b) != null && (list = t.wordsList) != null) {
                    T t2 = bVar.f81708d.f80830b;
                    if (t2 == null || (logPbBean = t2.logPbBean) == null || (str = logPbBean.getImprId()) == null) {
                        str = "";
                    }
                    r rVar = this.f81702a.f81695a;
                    if (rVar != null) {
                        rVar.h(str);
                    }
                    if (list.size() < 3) {
                        list.size();
                    } else if ((this.f81702a.f81699e.f() || this.f81702a.f81699e.e()) && bVar.f81705a == this.f81702a.f81699e.l()) {
                        ClickSearchView a2 = this.f81702a.a();
                        if (a2 != null) {
                            r rVar2 = this.f81702a.f81695a;
                            if (rVar2 == null) {
                                l.b();
                            }
                            boolean z = bVar.f81709e;
                            l.d(list, "");
                            l.d(bVar, "");
                            l.d(rVar2, "");
                            list.size();
                            a2.getVisibility();
                            a2.getHeight();
                            a2.getMeasuredHeight();
                            a2.getWidth();
                            a2.getMeasuredWidth();
                            if (list.isEmpty() || a2.getHeight() <= 0) {
                                a2.c();
                            } else {
                                View view = a2.f81654c;
                                if (view != null) {
                                    i2 = view.getHeight();
                                } else {
                                    i2 = 0;
                                }
                                a2.post(new ClickSearchView.b(a2, bVar, rVar2, list, ((int) (((float) a2.getHeight()) * 0.6f)) - i2, z));
                            }
                        }
                        this.f81702a.f81698d.a(Integer.valueOf(this.f81702a.f81699e.l()));
                    } else if (this.f81702a.f81699e.l() != bVar.f81705a) {
                        ClickSearchView a3 = this.f81702a.a();
                        if (a3 != null) {
                            a3.c();
                        }
                        this.f81702a.f81698d.a((Integer) null);
                    }
                }
            }
        };
        l.d(r2, "");
        WeakReference<Fragment> weakReference = clickSearchViewModel.f81683a;
        if (!(weakReference == null || (fragment2 = weakReference.get()) == null)) {
            clickSearchViewModel.a().observe(fragment2, r2);
        }
        AnonymousClass2 r22 = new u(this) {
            /* class com.ss.android.ugc.aweme.discover.mixfeed.cs.a.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f81703a;

            static {
                Covode.recordClassIndex(50754);
            }

            {
                this.f81703a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                e eVar = (e) obj;
                if (eVar != null && eVar.f81714a != this.f81703a.f81699e.l() && eVar.f81715b == d.ENTER_DETAIL) {
                    this.f81703a.f81698d.a(this.f81703a.f81699e.l());
                    if (this.f81703a.f81696b != null) {
                        ClickSearchView a2 = this.f81703a.a();
                        if (a2 != null) {
                            a2.c();
                        }
                        this.f81703a.f81698d.a((Integer) null);
                    }
                }
            }
        };
        l.d(r22, "");
        WeakReference<Fragment> weakReference2 = clickSearchViewModel.f81683a;
        if (weakReference2 != null && (fragment = weakReference2.get()) != null) {
            clickSearchViewModel.b().observe(fragment, r22);
        }
    }
}

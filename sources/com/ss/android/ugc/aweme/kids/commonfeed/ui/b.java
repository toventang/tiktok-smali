package com.ss.android.ugc.aweme.kids.commonfeed.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.kids.commonfeed.ui.KidsFeedViewModel;
import com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.FeedSwipeRefreshLayout;
import com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LoadMoreFrameLayout;
import com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.aweme.utils.fe;
import com.ss.android.ugc.aweme.utils.hk;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.r;

public final class b extends com.ss.android.ugc.aweme.base.f.a implements org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: m  reason: collision with root package name */
    public static final a f106235m = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.kids.commonfeed.e.a f106236a = new com.ss.android.ugc.aweme.kids.commonfeed.e.a();

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.commonfeed.c.a f106237b;

    /* renamed from: c  reason: collision with root package name */
    public String f106238c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f106239d;

    /* renamed from: e  reason: collision with root package name */
    FeedSwipeRefreshLayout f106240e;

    /* renamed from: j  reason: collision with root package name */
    public LoadMoreFrameLayout f106241j;

    /* renamed from: k  reason: collision with root package name */
    View f106242k;

    /* renamed from: l  reason: collision with root package name */
    public KidsFeedViewModel f106243l;
    private final h.h n = h.i.a((h.f.a.a) new c(this));
    private final h.h o = h.i.a((h.f.a.a) new C2711b(this));
    private final h.h p = h.i.a((h.f.a.a) new n(this));
    private boolean q;
    private TuxStatusView r;
    private View s;
    private TuxTextView t;
    private View u;
    private HashMap v;

    static {
        Covode.recordClassIndex(67922);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(90, new org.greenrobot.eventbus.g(b.class, "onReportEvent", com.ss.android.ugc.aweme.kids.common.b.b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(91, new org.greenrobot.eventbus.g(b.class, "onChangeDiggEvent", com.ss.android.ugc.aweme.kids.common.b.a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67923);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(67926);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            b.a(this.this$0);
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(67928);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            b.a(this.this$0);
            return z.f158842a;
        }
    }

    static final class h implements com.ss.android.ugc.aweme.kids.commonfeed.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f106245a;

        static {
            Covode.recordClassIndex(67930);
        }

        h(b bVar) {
            this.f106245a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.a
        public final void a() {
            this.f106245a.b();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        cg.b(this);
    }

    static final class e extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(67927);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            this.this$0.b();
            return true;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a
    public final SparseArray<com.ss.android.ugc.b.a.a.c> G() {
        SparseArray<com.ss.android.ugc.b.a.a.c> G = super.G();
        h.f.b.l.b(G, "");
        G.append(0, this.f106236a);
        return G;
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.v;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.b$b  reason: collision with other inner class name */
    static final class C2711b extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(67924);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2711b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                return arguments.getString("current_id");
            }
            return null;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(67925);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null || (string = arguments.getString("enter_from")) == null) {
                return "";
            }
            return string;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(67936);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null || (string = arguments.getString("title")) == null) {
                return "";
            }
            return string;
        }
    }

    private final void c() {
        TuxStatusView tuxStatusView = this.r;
        if (tuxStatusView == null) {
            h.f.b.l.a("statusView");
        }
        tuxStatusView.setVisibility(0);
        View view = this.s;
        if (view == null) {
            h.f.b.l.a("statusBackgroundView");
        }
        view.setVisibility(0);
    }

    private final void d() {
        TuxStatusView tuxStatusView = this.r;
        if (tuxStatusView == null) {
            h.f.b.l.a("statusView");
        }
        tuxStatusView.setVisibility(8);
        View view = this.s;
        if (view == null) {
            h.f.b.l.a("statusBackgroundView");
        }
        view.setVisibility(8);
    }

    public final void a() {
        if (this.f106239d) {
            this.f106239d = false;
            this.f106236a.g();
            return;
        }
        this.f106236a.e();
    }

    public final void b() {
        f.a.b.b bVar;
        com.ss.android.ugc.aweme.kids.commonfeed.c.a aVar = this.f106237b;
        if (aVar != null && aVar.c()) {
            Context context = getContext();
            if (context != null) {
                h.f.b.l.b(context, "");
                if (!fe.a(context)) {
                    new com.bytedance.tux.g.b(this).e(R.string.de8).b();
                    return;
                }
            }
            KidsFeedViewModel kidsFeedViewModel = this.f106243l;
            if (kidsFeedViewModel == null) {
                h.f.b.l.a("feedViewModel");
            }
            if (kidsFeedViewModel.f106219h != null) {
                f.a.b.b bVar2 = kidsFeedViewModel.f106218g;
                if (!(bVar2 == null || bVar2.isDisposed() || (bVar = kidsFeedViewModel.f106218g) == null)) {
                    bVar.dispose();
                }
                kidsFeedViewModel.f106218g = kidsFeedViewModel.f106219h.f().d(new KidsFeedViewModel.d(kidsFeedViewModel)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new KidsFeedViewModel.e(kidsFeedViewModel), new KidsFeedViewModel.f(kidsFeedViewModel));
            }
        }
    }

    static final class g implements SwipeRefreshLayout.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f106244a;

        static {
            Covode.recordClassIndex(67929);
        }

        g(b bVar) {
            this.f106244a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout.b
        public final void a() {
            f.a.b.b bVar;
            b bVar2 = this.f106244a;
            com.ss.android.ugc.aweme.kids.commonfeed.c.a aVar = bVar2.f106237b;
            if (aVar == null || !aVar.b()) {
                FeedSwipeRefreshLayout feedSwipeRefreshLayout = bVar2.f106240e;
                if (feedSwipeRefreshLayout == null) {
                    h.f.b.l.a("refreshLayout");
                }
                feedSwipeRefreshLayout.setRefreshing(false);
                return;
            }
            Context context = bVar2.getContext();
            if (context != null) {
                h.f.b.l.b(context, "");
                if (!fe.a(context)) {
                    new com.bytedance.tux.g.b(bVar2).e(R.string.de8).b();
                    FeedSwipeRefreshLayout feedSwipeRefreshLayout2 = bVar2.f106240e;
                    if (feedSwipeRefreshLayout2 == null) {
                        h.f.b.l.a("refreshLayout");
                    }
                    if (feedSwipeRefreshLayout2.f68188b) {
                        FeedSwipeRefreshLayout feedSwipeRefreshLayout3 = bVar2.f106240e;
                        if (feedSwipeRefreshLayout3 == null) {
                            h.f.b.l.a("refreshLayout");
                        }
                        feedSwipeRefreshLayout3.setRefreshing(false);
                        return;
                    }
                    return;
                }
            }
            KidsFeedViewModel kidsFeedViewModel = bVar2.f106243l;
            if (kidsFeedViewModel == null) {
                h.f.b.l.a("feedViewModel");
            }
            if (kidsFeedViewModel.f106219h != null) {
                f.a.b.b bVar3 = kidsFeedViewModel.f106217f;
                if (!(bVar3 == null || bVar3.isDisposed() || (bVar = kidsFeedViewModel.f106217f) == null)) {
                    bVar.dispose();
                }
                kidsFeedViewModel.f106217f = kidsFeedViewModel.f106219h.e().d(new KidsFeedViewModel.g(kidsFeedViewModel)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new KidsFeedViewModel.h(kidsFeedViewModel), new KidsFeedViewModel.i(kidsFeedViewModel));
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cg.a(this);
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f106246a;

        static {
            Covode.recordClassIndex(67931);
        }

        i(b bVar) {
            this.f106246a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            androidx.fragment.app.e activity = this.f106246a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    public static final /* synthetic */ KidsFeedViewModel a(b bVar) {
        KidsFeedViewModel kidsFeedViewModel = bVar.f106243l;
        if (kidsFeedViewModel == null) {
            h.f.b.l.a("feedViewModel");
        }
        return kidsFeedViewModel;
    }

    public static final /* synthetic */ LoadMoreFrameLayout b(b bVar) {
        LoadMoreFrameLayout loadMoreFrameLayout = bVar.f106241j;
        if (loadMoreFrameLayout == null) {
            h.f.b.l.a("loadMoreLayout");
        }
        return loadMoreFrameLayout;
    }

    static final class l<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f106249a;

        static {
            Covode.recordClassIndex(67934);
        }

        l(b bVar) {
            this.f106249a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            b bVar = this.f106249a;
            h.f.b.l.b(num, "");
            bVar.a(num.intValue());
        }
    }

    static final class m<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f106250a;

        static {
            Covode.recordClassIndex(67935);
        }

        m(b bVar) {
            this.f106250a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            b bVar = this.f106250a;
            h.f.b.l.b(num, "");
            bVar.a(num.intValue());
        }
    }

    static final class k<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f106248a;

        static {
            Covode.recordClassIndex(67933);
        }

        k(b bVar) {
            this.f106248a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                b.b(this.f106248a).a();
                return;
            }
            LoadMoreFrameLayout b2 = b.b(this.f106248a);
            DmtStatusView a2 = b2.a(true);
            if (a2 != null) {
                a2.g();
            }
            b2.f106286d = 1;
            if (b2.f106283a != null) {
                b2.b();
            }
            if (b2.f106288f != -1 && !TextUtils.isEmpty(b2.f106289g)) {
                b2.f106288f = -1;
            }
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onChangeDiggEvent(com.ss.android.ugc.aweme.kids.common.b.a aVar) {
        h.f.b.l.d(aVar, "");
        KidsFeedViewModel kidsFeedViewModel = this.f106243l;
        if (kidsFeedViewModel == null) {
            h.f.b.l.a("feedViewModel");
        }
        h.f.b.l.d(aVar, "");
        List<Aweme> value = kidsFeedViewModel.f106212a.getValue();
        if (value == null) {
            value = h.a.z.INSTANCE;
        }
        for (Aweme aweme : value) {
            if (aweme.getAid().equals(aVar.f105881a)) {
                aweme.setUserDigg(aVar.f105882b ? 1 : 0);
                AwemeStatistics statistics = aweme.getStatistics();
                h.f.b.l.b(statistics, "");
                statistics.setDiggCount(statistics.getDiggCount() - 1);
                return;
            }
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onReportEvent(com.ss.android.ugc.aweme.kids.common.b.b bVar) {
        h.f.b.l.d(bVar, "");
        this.f106239d = true;
        KidsFeedViewModel kidsFeedViewModel = this.f106243l;
        if (kidsFeedViewModel == null) {
            h.f.b.l.a("feedViewModel");
        }
        h.f.b.l.d(bVar, "");
        List<Aweme> value = kidsFeedViewModel.f106212a.getValue();
        if (value == null) {
            value = new ArrayList<>();
        }
        Iterator<Aweme> it = value.iterator();
        while (it.hasNext()) {
            if (it.next().getAid().equals(bVar.f105883a)) {
                it.remove();
            }
        }
        kidsFeedViewModel.f106212a.postValue(value);
    }

    static final class j<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f106247a;

        static {
            Covode.recordClassIndex(67932);
        }

        j(b bVar) {
            this.f106247a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            com.ss.android.ugc.aweme.kids.commonfeed.e.a aVar = this.f106247a.f106236a;
            h.f.b.l.b(list, "");
            List<Aweme> g2 = h.a.n.g((Collection) list);
            h.f.b.l.d(g2, "");
            aVar.f106031l = g2;
            if (aVar.f106029j == 0) {
                aVar.f106026g = true;
                aVar.f106028i = true;
            }
            com.ss.android.ugc.aweme.kids.commonfeed.b.a aVar2 = aVar.f106024e;
            if (aVar2 == null) {
                h.f.b.l.a("feedAdapter");
            }
            aVar2.a(aVar.f106031l);
            if (list.isEmpty()) {
                this.f106247a.f106236a.f();
            } else if (this.f106247a.f106239d && this.f106247a.f35364f) {
                this.f106247a.f106239d = false;
                this.f106247a.f106236a.g();
            } else if (hk.a(this.f106247a.f106238c)) {
                KidsFeedViewModel a2 = b.a(this.f106247a);
                String str = this.f106247a.f106238c;
                if (str == null) {
                    str = "";
                }
                h.f.b.l.d(str, "");
                List<Aweme> value = a2.f106212a.getValue();
                if (value == null) {
                    value = h.a.z.INSTANCE;
                }
                Iterator<T> it = value.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = 0;
                        break;
                    } else if (TextUtils.equals(it.next().getAid(), str)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 < list.size()) {
                    VerticalViewPager verticalViewPager = this.f106247a.f106236a.f106020a;
                    if (verticalViewPager == null) {
                        h.f.b.l.a("viewPager");
                    }
                    verticalViewPager.a(i2, false);
                }
                this.f106247a.f106238c = null;
            }
        }
    }

    public final void a(int i2) {
        if (i2 == -2) {
            new com.bytedance.tux.g.b(this).e(R.string.de8).b();
            if (this.q) {
                d();
            } else {
                TuxStatusView tuxStatusView = this.r;
                if (tuxStatusView == null) {
                    h.f.b.l.a("statusView");
                }
                tuxStatusView.setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new d(this)));
                c();
            }
            this.f106236a.f();
        } else if (i2 == -1) {
            c();
            TuxStatusView tuxStatusView2 = this.r;
            if (tuxStatusView2 == null) {
                h.f.b.l.a("statusView");
            }
            TuxStatusView.c cVar = new TuxStatusView.c();
            String string = getString(R.string.cwz);
            h.f.b.l.b(string, "");
            tuxStatusView2.setStatus(cVar.a((CharSequence) string));
            this.f106236a.f();
        } else if (i2 == 0) {
            this.q = true;
            d();
        }
        FeedSwipeRefreshLayout feedSwipeRefreshLayout = this.f106240e;
        if (feedSwipeRefreshLayout == null) {
            h.f.b.l.a("refreshLayout");
        }
        if (feedSwipeRefreshLayout.f68188b) {
            FeedSwipeRefreshLayout feedSwipeRefreshLayout2 = this.f106240e;
            if (feedSwipeRefreshLayout2 == null) {
                h.f.b.l.a("refreshLayout");
            }
            feedSwipeRefreshLayout2.setRefreshing(false);
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        f.a.b.b bVar;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        com.ss.android.ugc.aweme.kids.commonfeed.e.a aVar = this.f106236a;
        String str = (String) this.n.getValue();
        h.f.b.l.b(str, "");
        h.f.b.l.d(str, "");
        aVar.f106032m = str;
        this.f106236a.n = (String) this.o.getValue();
        this.f106236a.a(view, bundle);
        View findViewById = view.findViewById(R.id.b10);
        h.f.b.l.b(findViewById, "");
        this.f106240e = (FeedSwipeRefreshLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.b0z);
        h.f.b.l.b(findViewById2, "");
        this.f106241j = (LoadMoreFrameLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.b11);
        h.f.b.l.b(findViewById3, "");
        this.r = (TuxStatusView) findViewById3;
        View findViewById4 = view.findViewById(R.id.e_e);
        h.f.b.l.b(findViewById4, "");
        this.s = findViewById4;
        View findViewById5 = view.findViewById(R.id.b16);
        h.f.b.l.b(findViewById5, "");
        this.t = (TuxTextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.b0w);
        h.f.b.l.b(findViewById6, "");
        this.f106242k = findViewById6;
        this.f106236a.f106030k = new e(this);
        Context context = view.getContext();
        h.f.b.l.b(context, "");
        if (!fe.a(context)) {
            TuxStatusView tuxStatusView = this.r;
            if (tuxStatusView == null) {
                h.f.b.l.a("statusView");
            }
            tuxStatusView.setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new f(this)));
        } else {
            TuxStatusView tuxStatusView2 = this.r;
            if (tuxStatusView2 == null) {
                h.f.b.l.a("statusView");
            }
            tuxStatusView2.a();
        }
        FeedSwipeRefreshLayout feedSwipeRefreshLayout = this.f106240e;
        if (feedSwipeRefreshLayout == null) {
            h.f.b.l.a("refreshLayout");
        }
        com.ss.android.ugc.aweme.kids.commonfeed.c.a aVar2 = this.f106237b;
        if (aVar2 == null || !aVar2.b()) {
            z = false;
        } else {
            z = true;
        }
        feedSwipeRefreshLayout.setCanTouch(z);
        FeedSwipeRefreshLayout feedSwipeRefreshLayout2 = this.f106240e;
        if (feedSwipeRefreshLayout2 == null) {
            h.f.b.l.a("refreshLayout");
        }
        feedSwipeRefreshLayout2.setOnRefreshListener(new g(this));
        LoadMoreFrameLayout loadMoreFrameLayout = this.f106241j;
        if (loadMoreFrameLayout == null) {
            h.f.b.l.a("loadMoreLayout");
        }
        loadMoreFrameLayout.setLoadMoreListener(new h(this));
        View findViewById7 = view.findViewById(R.id.b15);
        h.f.b.l.b(findViewById7, "");
        this.u = findViewById7;
        com.ss.android.ugc.aweme.kids.commonfeed.c.a aVar3 = this.f106237b;
        if (aVar3 == null || !aVar3.a()) {
            View view2 = this.u;
            if (view2 == null) {
                h.f.b.l.a("backButton");
            }
            view2.setVisibility(8);
        } else {
            View view3 = this.u;
            if (view3 == null) {
                h.f.b.l.a("backButton");
            }
            view3.setVisibility(0);
            View view4 = this.u;
            if (view4 == null) {
                h.f.b.l.a("backButton");
            }
            view4.setOnClickListener(new i(this));
        }
        TuxTextView tuxTextView = this.t;
        if (tuxTextView == null) {
            h.f.b.l.a("detailTextView");
        }
        tuxTextView.setText((String) this.p.getValue());
        KidsFeedViewModel kidsFeedViewModel = new KidsFeedViewModel(this.f106237b);
        this.f106243l = kidsFeedViewModel;
        kidsFeedViewModel.f106212a.observe(this, new j(this));
        KidsFeedViewModel kidsFeedViewModel2 = this.f106243l;
        if (kidsFeedViewModel2 == null) {
            h.f.b.l.a("feedViewModel");
        }
        kidsFeedViewModel2.f106215d.observe(this, new k(this));
        KidsFeedViewModel kidsFeedViewModel3 = this.f106243l;
        if (kidsFeedViewModel3 == null) {
            h.f.b.l.a("feedViewModel");
        }
        kidsFeedViewModel3.f106214c.observe(this, new l(this));
        KidsFeedViewModel kidsFeedViewModel4 = this.f106243l;
        if (kidsFeedViewModel4 == null) {
            h.f.b.l.a("feedViewModel");
        }
        kidsFeedViewModel4.f106213b.observe(this, new m(this));
        c();
        KidsFeedViewModel kidsFeedViewModel5 = this.f106243l;
        if (kidsFeedViewModel5 == null) {
            h.f.b.l.a("feedViewModel");
        }
        if (kidsFeedViewModel5.f106219h != null) {
            f.a.b.b bVar2 = kidsFeedViewModel5.f106216e;
            if (!(bVar2 == null || bVar2.isDisposed() || (bVar = kidsFeedViewModel5.f106216e) == null)) {
                bVar.dispose();
            }
            kidsFeedViewModel5.f106216e = kidsFeedViewModel5.f106219h.d().d(new KidsFeedViewModel.a(kidsFeedViewModel5)).a(new KidsFeedViewModel.b(kidsFeedViewModel5), new KidsFeedViewModel.c(kidsFeedViewModel5));
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.acv, viewGroup, false);
    }
}

package com.ss.android.ugc.aweme.kids.common.ui.awemegrid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.n.o;
import com.ss.android.ugc.aweme.feed.n.p;
import com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridViewModel;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public abstract class c extends com.ss.android.ugc.aweme.base.f.a implements h.a, o, com.ss.android.ugc.aweme.kids.common.ui.a.d, i, j {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f105945a;

    /* renamed from: b  reason: collision with root package name */
    public a f105946b;

    /* renamed from: c  reason: collision with root package name */
    public KidsAwemeGridViewModel f105947c;

    /* renamed from: d  reason: collision with root package name */
    public b f105948d;

    /* renamed from: e  reason: collision with root package name */
    public TuxStatusView f105949e;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f105950j = h.i.a((h.f.a.a) new e(this));

    /* renamed from: k  reason: collision with root package name */
    private boolean f105951k;

    /* renamed from: l  reason: collision with root package name */
    private HashMap f105952l;

    static {
        Covode.recordClassIndex(67796);
    }

    public abstract void a();

    public abstract void a(View view, Aweme aweme);

    public abstract boolean b();

    public abstract String c();

    public abstract View d();

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(90, new g(c.class, "onReportEvent", com.ss.android.ugc.aweme.kids.common.b.b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(91, new g(c.class, "onChangeDiggEvent", com.ss.android.ugc.aweme.kids.common.b.a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public void m() {
        HashMap hashMap = this.f105952l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m();
    }

    public static final class a extends GridLayoutManager.c {
        static {
            Covode.recordClassIndex(67797);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int a(int i2) {
            return 1;
        }

        a() {
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final void aS_() {
        l();
    }

    public void g() {
        k();
    }

    public void j() {
        k();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        cg.b(this);
    }

    static final class e extends m implements h.f.a.a<WrapGridLayoutManager> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(67801);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ WrapGridLayoutManager invoke() {
            this.this$0.getContext();
            return new WrapGridLayoutManager(3, 1);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final boolean bi_() {
        a aVar = this.f105946b;
        if (aVar == null || !aVar.a()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void e() {
        n();
        KidsAwemeGridViewModel kidsAwemeGridViewModel = this.f105947c;
        if (kidsAwemeGridViewModel != null) {
            kidsAwemeGridViewModel.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void k() {
        TuxStatusView tuxStatusView = this.f105949e;
        if (tuxStatusView != null) {
            tuxStatusView.setVisibility(8);
        }
        this.f105951k = false;
    }

    private final void n() {
        TuxStatusView tuxStatusView = this.f105949e;
        if (tuxStatusView != null) {
            tuxStatusView.setVisibility(0);
        }
        TuxStatusView tuxStatusView2 = this.f105949e;
        if (tuxStatusView2 != null) {
            tuxStatusView2.a();
        }
        this.f105951k = true;
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    public final void l() {
        f.a.b.b bVar;
        View view;
        b bVar2 = this.f105948d;
        if (bVar2 != null) {
            bVar2.ag_();
        }
        b bVar3 = this.f105948d;
        if (bVar3 != null) {
            bVar3.d(true);
        }
        b bVar4 = this.f105948d;
        if (!(bVar4 == null || (view = ((com.ss.android.ugc.aweme.base.widget.g) bVar4).f68517c) == null)) {
            view.setVisibility(0);
        }
        KidsAwemeGridViewModel kidsAwemeGridViewModel = this.f105947c;
        if (kidsAwemeGridViewModel != null && kidsAwemeGridViewModel.f105930e != null) {
            f.a.b.b bVar5 = kidsAwemeGridViewModel.f105929d;
            if (!(bVar5 == null || bVar5.isDisposed() || (bVar = kidsAwemeGridViewModel.f105929d) == null)) {
                bVar.dispose();
            }
            kidsAwemeGridViewModel.f105929d = kidsAwemeGridViewModel.f105930e.c().d(new KidsAwemeGridViewModel.a(kidsAwemeGridViewModel)).a(new KidsAwemeGridViewModel.b(kidsAwemeGridViewModel), new KidsAwemeGridViewModel.c(kidsAwemeGridViewModel));
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cg.a(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final void a(boolean z) {
        if (!z) {
            b bVar = this.f105948d;
            if (bVar != null) {
                bVar.a((h.a) null);
            }
            b bVar2 = this.f105948d;
            if (bVar2 != null) {
                bVar2.ah_();
            }
        }
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f105953a;

        static {
            Covode.recordClassIndex(67798);
        }

        b(c cVar) {
            this.f105953a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            RecyclerView.a aVar;
            List<T> list = (List) obj;
            RecyclerView recyclerView = this.f105953a.f105945a;
            if (recyclerView != null) {
                aVar = recyclerView.getAdapter();
            } else {
                aVar = null;
            }
            Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridAdapter");
            f fVar = (f) aVar;
            if (fVar != null) {
                fVar.b_(list);
            }
            if (list.isEmpty()) {
                this.f105953a.g();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c$c  reason: collision with other inner class name */
    static final class C2698c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f105954a;

        static {
            Covode.recordClassIndex(67799);
        }

        C2698c(c cVar) {
            this.f105954a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                if (num.intValue() == 0) {
                    this.f105954a.k();
                    return;
                } else if (num.intValue() == -2) {
                    this.f105954a.j();
                    return;
                }
            }
            this.f105954a.g();
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f105955a;

        static {
            Covode.recordClassIndex(67800);
        }

        d(c cVar) {
            this.f105955a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                if (num.intValue() == 0) {
                    b bVar = this.f105955a.f105948d;
                    if (bVar != null) {
                        bVar.ai_();
                        return;
                    }
                    return;
                } else if (num.intValue() == -2) {
                    c cVar = this.f105955a;
                    b bVar2 = cVar.f105948d;
                    if (bVar2 != null) {
                        bVar2.a(cVar.f105945a, false);
                        return;
                    }
                    return;
                }
            }
            c cVar2 = this.f105955a;
            b bVar3 = cVar2.f105948d;
            if (bVar3 != null) {
                bVar3.ah_();
            }
            cVar2.a();
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onChangeDiggEvent(com.ss.android.ugc.aweme.kids.common.b.a aVar) {
        l.d(aVar, "");
        KidsAwemeGridViewModel kidsAwemeGridViewModel = this.f105947c;
        if (kidsAwemeGridViewModel != null) {
            l.d(aVar, "");
            List<Aweme> value = kidsAwemeGridViewModel.f105926a.getValue();
            if (value == null) {
                value = z.INSTANCE;
            }
            for (Aweme aweme : value) {
                if (aweme.getAid().equals(aVar.f105881a)) {
                    if (aVar.f105882b) {
                        aweme.setUserDigg(1);
                        AwemeStatistics statistics = aweme.getStatistics();
                        l.b(statistics, "");
                        statistics.setDiggCount(statistics.getDiggCount() + 1);
                        return;
                    }
                    aweme.setUserDigg(0);
                    AwemeStatistics statistics2 = aweme.getStatistics();
                    l.b(statistics2, "");
                    statistics2.setDiggCount(statistics2.getDiggCount() - 1);
                    return;
                }
            }
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onReportEvent(com.ss.android.ugc.aweme.kids.common.b.b bVar) {
        l.d(bVar, "");
        KidsAwemeGridViewModel kidsAwemeGridViewModel = this.f105947c;
        if (kidsAwemeGridViewModel != null) {
            l.d(bVar, "");
            List<Aweme> value = kidsAwemeGridViewModel.f105926a.getValue();
            if (value == null) {
                value = new ArrayList<>();
            }
            Iterator<Aweme> it = value.iterator();
            while (it.hasNext()) {
                if (it.next().getAid().equals(bVar.f105883a)) {
                    it.remove();
                }
            }
            kidsAwemeGridViewModel.f105926a.postValue(value);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        this.f105945a = (RecyclerView) view.findViewById(R.id.c3j);
        this.f105949e = (TuxStatusView) view.findViewById(R.id.c3k);
        RecyclerView recyclerView = this.f105945a;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
        }
        RecyclerView recyclerView2 = this.f105945a;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager((WrapGridLayoutManager) this.f105950j.getValue());
        }
        if (getContext() != null) {
            b bVar = new b(c(), this, b());
            this.f105948d = bVar;
            bVar.f105939d = d();
            b bVar2 = this.f105948d;
            if (bVar2 != null) {
                bVar2.a((h.a) this);
            }
            b bVar3 = this.f105948d;
            if (bVar3 != null) {
                bVar3.s = new a();
            }
        }
        a aVar = this.f105946b;
        if (aVar != null) {
            KidsAwemeGridViewModel kidsAwemeGridViewModel = new KidsAwemeGridViewModel(aVar);
            kidsAwemeGridViewModel.f105926a.observe(this, new b(this));
            kidsAwemeGridViewModel.f105927b.observe(this, new C2698c(this));
            kidsAwemeGridViewModel.f105928c.observe(this, new d(this));
            this.f105947c = kidsAwemeGridViewModel;
        }
        RecyclerView recyclerView3 = this.f105945a;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.f105948d);
        }
        RecyclerView recyclerView4 = this.f105945a;
        if (recyclerView4 != null) {
            recyclerView4.setOnFlingListener(new p(this.f105945a, this));
        }
        e();
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.a.d
    public final void a(View view, Aweme aweme, String str) {
        a(view, aweme);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.aby, viewGroup, false);
    }
}

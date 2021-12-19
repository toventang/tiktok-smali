package com.ss.android.ugc.aweme.inbox;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.common.f;
import com.ss.android.ugc.aweme.inbox.RecommendUserVM;
import com.ss.android.ugc.aweme.inbox.ab;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import h.f.b.l;
import h.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class RecommendUserAdapterWidget extends InboxAdapterWidget implements au, i, j {

    /* renamed from: a  reason: collision with root package name */
    public ad.b f103984a;

    /* renamed from: b  reason: collision with root package name */
    private final h f103985b;

    /* renamed from: c  reason: collision with root package name */
    private final h f103986c;

    static {
        Covode.recordClassIndex(66601);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final int a(int i2) {
        return -1;
    }

    public final RecommendUserVM b() {
        return (RecommendUserVM) this.f103985b.getValue();
    }

    public final ab c() {
        return (ab) this.f103986c.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(148, new g(RecommendUserAdapterWidget.class, "onSwitchInbox", com.ss.android.ugc.aweme.notice.api.b.d.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == i.a.ON_CREATE) {
            onCreate();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    static final class a extends h.f.b.m implements h.f.a.a<ab> {
        final /* synthetic */ Fragment $fragment;

        static {
            Covode.recordClassIndex(66602);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Fragment fragment) {
            super(0);
            this.$fragment = fragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ab invoke() {
            return new ab(this.$fragment);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final t<Boolean> bq_() {
        return b().f103995f;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final LiveData<Boolean> e() {
        return b().f103991b;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final LiveData<InboxAdapterWidget.b> f() {
        return b().f103992c;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final RecyclerView.a<?> g() {
        return c();
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        EventBus.a().b(this);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final void h() {
        com.ss.android.ugc.aweme.inbox.d.g.b();
        b().e();
    }

    static final class d extends h.f.b.m implements h.f.a.a<RecommendUserVM> {
        final /* synthetic */ Fragment $fragment;
        final /* synthetic */ RecommendUserAdapterWidget this$0;

        static {
            Covode.recordClassIndex(66605);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(RecommendUserAdapterWidget recommendUserAdapterWidget, Fragment fragment) {
            super(0);
            this.this$0 = recommendUserAdapterWidget;
            this.$fragment = fragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RecommendUserVM invoke() {
            ad.b bVar = this.this$0.f103984a;
            if (bVar != null) {
                Fragment fragment = this.$fragment;
                l.d(fragment, "");
                l.d(bVar, "");
                ac a2 = ae.a(fragment, bVar).a(RecommendUserVM.class);
                l.b(a2, "");
                if (a2 != null) {
                    return a2;
                }
            }
            return RecommendUserVM.a.a(this.$fragment);
        }
    }

    @v(a = i.a.ON_CREATE)
    public final void onCreate() {
        b().f103994e.observe(this, new b(this));
        b().f103995f.observe(this, new c(this));
        h();
        EventBus.a(EventBus.a(), this);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final void a(ad.b bVar) {
        l.d(bVar, "");
        this.f103984a = bVar;
    }

    @r(a = ThreadMode.MAIN)
    public final void onSwitchInbox(com.ss.android.ugc.aweme.notice.api.b.d dVar) {
        l.d(dVar, "");
        RecommendUserVM b2 = b();
        b2.b().clear();
        b2.f103998i = false;
        h();
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendUserAdapterWidget f103987a;

        static {
            Covode.recordClassIndex(66603);
        }

        b(RecommendUserAdapterWidget recommendUserAdapterWidget) {
            this.f103987a = recommendUserAdapterWidget;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool;
            List<? extends ad> list = (List) obj;
            if (list != null) {
                Map<String, String> map = this.f103987a.f104369d;
                if (map != null && !map.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().f104040d.putAll(this.f103987a.f104369d);
                    }
                }
                ab c2 = this.f103987a.c();
                l.d(list, "");
                RecyclerView recyclerView = c2.f104030a;
                if (recyclerView == null) {
                    return;
                }
                if (recyclerView.l()) {
                    StringBuilder sb = new StringBuilder("setData, rv isComputing: ");
                    RecyclerView recyclerView2 = c2.f104030a;
                    if (recyclerView2 != null) {
                        bool = Boolean.valueOf(recyclerView2.l());
                    } else {
                        bool = null;
                    }
                    f.b("RecommendUserVM", sb.append(bool).append(", data size: ").append(list.size()).toString());
                    recyclerView.post(new ab.b(c2, list));
                    return;
                }
                c2.a(list);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendUserAdapterWidget f103988a;

        static {
            Covode.recordClassIndex(66604);
        }

        c(RecommendUserAdapterWidget recommendUserAdapterWidget) {
            this.f103988a = recommendUserAdapterWidget;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            List<ad> value;
            Boolean bool = (Boolean) obj;
            RecommendUserAdapterWidget recommendUserAdapterWidget = this.f103988a;
            if (recommendUserAdapterWidget.b().f103992c.getValue() == InboxAdapterWidget.b.SUCCESS && (value = recommendUserAdapterWidget.b().f103994e.getValue()) != null && !value.isEmpty()) {
                l.b(bool, "");
                if (bool.booleanValue()) {
                    this.f103988a.b().g();
                } else {
                    this.f103988a.b().f();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final void a(int i2, com.ss.android.ugc.aweme.inbox.widget.b bVar) {
        l.d(bVar, "");
        ab c2 = c();
        l.d(bVar, "");
        c2.f104031b.put(i2, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecommendUserAdapterWidget(Fragment fragment, LiveData<InboxAdapterWidget.b> liveData) {
        super(fragment, liveData);
        l.d(fragment, "");
        l.d(liveData, "");
        this.f103985b = h.i.a((h.f.a.a) new d(this, fragment));
        this.f103986c = h.i.a((h.f.a.a) new a(fragment));
    }
}

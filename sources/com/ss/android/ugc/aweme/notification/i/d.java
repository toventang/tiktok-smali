package com.ss.android.ugc.aweme.notification.i;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.notice.api.a;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.i.i;
import com.ss.android.ugc.aweme.notification.vm.NotificationVM;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.q;
import h.r;
import h.z;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public final class d extends i.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f113757a = true;

    /* renamed from: b  reason: collision with root package name */
    private final h f113758b = com.ss.android.ugc.aweme.notification.b.a.a(new f(this));

    /* renamed from: d  reason: collision with root package name */
    private final h f113759d = com.ss.android.ugc.aweme.notification.b.a.a(new C2913d(this));

    /* renamed from: e  reason: collision with root package name */
    private final h f113760e = com.ss.android.ugc.aweme.notification.b.a.a(new a(this));

    /* renamed from: f  reason: collision with root package name */
    private final h f113761f = com.ss.android.ugc.aweme.notification.b.a.a(new b(this));

    /* renamed from: g  reason: collision with root package name */
    private final h f113762g = h.i.a((h.f.a.a) e.f113764a);

    static {
        Covode.recordClassIndex(73131);
    }

    private final NotificationVM i() {
        return (NotificationVM) this.f113758b.getValue();
    }

    private final com.ss.android.ugc.aweme.notification.adapter.e m() {
        return (com.ss.android.ugc.aweme.notification.adapter.e) this.f113760e.getValue();
    }

    private final LinearLayoutManager n() {
        return (LinearLayoutManager) this.f113761f.getValue();
    }

    public final RecyclerView b() {
        return (RecyclerView) this.f113759d.getValue();
    }

    static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.notification.adapter.e> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(73132);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.notification.adapter.e invoke() {
            RecyclerView.a adapter = this.this$0.b().getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.adapter.NotificationAdapter");
            return adapter;
        }
    }

    static final class b extends m implements h.f.a.a<LinearLayoutManager> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(73133);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayoutManager invoke() {
            RecyclerView.i layoutManager = this.this$0.b().getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            return layoutManager;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.d$d  reason: collision with other inner class name */
    static final class C2913d extends m implements h.f.a.a<RecyclerView> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(73135);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2913d(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RecyclerView invoke() {
            return this.this$0.c(R.id.drj);
        }
    }

    static final class f extends m implements h.f.a.a<NotificationVM> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(73137);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ NotificationVM invoke() {
            return NotificationVM.a.a(this.this$0.j());
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i.a
    public final void a() {
        com.ss.android.ugc.aweme.notification.vm.c j2 = i().j();
        if ((j2 instanceof com.ss.android.ugc.aweme.notification.vm.d) && ((Boolean) this.f113762g.getValue()).booleanValue()) {
            ((com.ss.android.ugc.aweme.notification.vm.d) j2).l();
        }
    }

    static final class e extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f113764a = new e();

        static {
            Covode.recordClassIndex(73136);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            Boolean bool;
            ILiveOuterService s = LiveOuterService.s();
            l.b(s, "");
            com.ss.android.ugc.aweme.live.c d2 = s.d();
            boolean z = false;
            if (!(d2 == null || (bool = (Boolean) d2.a("live_square_inbox_refresh", (Object) false)) == null)) {
                z = bool.booleanValue();
            }
            return Boolean.valueOf(z);
        }
    }

    public final Object h() {
        try {
            if (this.f113757a && !m().b().isEmpty()) {
                int k2 = n().k();
                int m2 = n().m();
                if (m2 > 0) {
                    if (k2 <= m2) {
                        this.f113757a = false;
                        if (k2 <= m2) {
                            while (true) {
                                b(k2);
                                if (k2 == m2) {
                                    break;
                                }
                                k2++;
                            }
                        }
                    }
                }
            }
            return q.m223constructorimpl(z.f158842a);
        } catch (Throwable th) {
            return q.m223constructorimpl(r.a(th));
        }
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f113763a;

        static {
            Covode.recordClassIndex(73134);
        }

        c(d dVar) {
            this.f113763a = dVar;
        }

        @Override // androidx.lifecycle.u
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            if (obj == com.ss.android.ugc.aweme.notification.bean.i.LOADING) {
                this.f113763a.f113757a = true;
            }
        }
    }

    public final Object b(int i2) {
        try {
            List<MusNotice> b2 = m().b();
            int size = b2.size();
            if (i2 >= 0) {
                if (size > i2) {
                    MusNotice musNotice = b2.get(i2);
                    if (!(musNotice instanceof com.ss.android.ugc.aweme.notification.bean.f)) {
                        musNotice = null;
                    }
                    com.ss.android.ugc.aweme.notification.bean.f fVar = (com.ss.android.ugc.aweme.notification.bean.f) musNotice;
                    if (fVar != null) {
                        List<MusNotice> d2 = n.d((Iterable) b2, i2);
                        int i3 = 0;
                        if (!(d2 instanceof Collection) || !d2.isEmpty()) {
                            for (MusNotice musNotice2 : d2) {
                                if ((musNotice2 instanceof com.ss.android.ugc.aweme.notice.repo.list.bean.i) && (i3 = i3 + 1) < 0) {
                                    n.b();
                                }
                            }
                        }
                        com.ss.android.ugc.aweme.notification.utils.e.a(fVar, i2 - i3);
                    }
                }
            }
            return q.m223constructorimpl(z.f158842a);
        } catch (Throwable th) {
            return q.m223constructorimpl(r.a(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i.a
    public final void a(View view, Bundle bundle) {
        l.d(view, "");
        super.a(view, bundle);
        com.ss.android.ugc.aweme.notification.vm.c b2 = i().b(a.b.a());
        Objects.requireNonNull(b2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vm.NotificationTLModel");
        b2.b().observe(j(), new c(this));
    }
}

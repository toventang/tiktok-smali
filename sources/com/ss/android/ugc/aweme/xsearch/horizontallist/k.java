package com.ss.android.ugc.aweme.xsearch.horizontallist;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.h.v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.autoplay.d.h;
import com.ss.android.ugc.aweme.discover.alading.d;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.flowfeed.utils.g;
import com.ss.android.ugc.aweme.search.k.r;
import h.f.b.l;
import h.f.b.m;
import h.i;
import java.util.List;
import java.util.Objects;

public final class k extends h implements com.ss.android.ugc.aweme.discover.alading.a.c {

    /* renamed from: k  reason: collision with root package name */
    public static final a f145227k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public f f145228a;

    /* renamed from: b  reason: collision with root package name */
    public final j f145229b;

    /* renamed from: c  reason: collision with root package name */
    public final g f145230c = c().a();

    /* renamed from: l  reason: collision with root package name */
    private final h.h f145231l;

    /* renamed from: m  reason: collision with root package name */
    private e f145232m;
    private final h.h n;

    static {
        Covode.recordClassIndex(94957);
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.h
    public final RecyclerView a() {
        return (RecyclerView) this.f145231l.getValue();
    }

    @Override // com.ss.android.ugc.aweme.discover.alading.a.c
    public final void a(int i2, View view, Aweme aweme, List<? extends Aweme> list) {
        l.d(view, "");
        l.d(aweme, "");
        l.d(list, "");
    }

    @Override // com.ss.android.ugc.aweme.discover.alading.a.c
    public final void b(int i2, View view, Aweme aweme, List<? extends Aweme> list) {
        l.d(view, "");
        l.d(aweme, "");
        l.d(list, "");
    }

    /* renamed from: f */
    public final l c() {
        return (l) this.n.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94958);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<RecyclerView> {
        final /* synthetic */ d $viewHolder;

        static {
            Covode.recordClassIndex(94959);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(0);
            this.$viewHolder = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ RecyclerView invoke() {
            return this.$viewHolder.f80749a;
        }
    }

    static final class c extends m implements h.f.a.a<l> {
        final /* synthetic */ com.ss.android.ugc.aweme.flowfeed.a.a $containerStatusProvider;
        final /* synthetic */ com.ss.android.ugc.aweme.flowfeed.a.b $mPlayVideoObserver;
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(94960);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(k kVar, com.ss.android.ugc.aweme.flowfeed.a.b bVar, com.ss.android.ugc.aweme.flowfeed.a.a aVar) {
            super(0);
            this.this$0 = kVar;
            this.$mPlayVideoObserver = bVar;
            this.$containerStatusProvider = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ l invoke() {
            return new l(this.this$0.a(), this.this$0.d(), this.$mPlayVideoObserver, this.$containerStatusProvider, (byte) 0);
        }
    }

    private final void g() {
        com.ss.android.ugc.aweme.xsearch.b bVar;
        e eVar = this.f145232m;
        if (eVar != null) {
            a().b(eVar);
        }
        f fVar = this.f145228a;
        if (fVar != null && (bVar = fVar.f145176b) != null) {
            e eVar2 = new e(bVar);
            this.f145232m = eVar2;
            a().a(eVar2);
        }
    }

    private final int a(String str) {
        f fVar;
        com.ss.android.ugc.aweme.xsearch.c cVar;
        com.ss.android.ugc.aweme.discover.mixfeed.d dVar;
        List<Aweme> awemeList;
        if (!(str == null || (fVar = this.f145228a) == null || (cVar = fVar.f145177c) == null || (dVar = cVar.f145149j) == null || (awemeList = dVar.getAwemeList()) == null)) {
            int size = awemeList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Aweme aweme = awemeList.get(i2);
                l.b(aweme, "");
                if (l.a((Object) aweme.getAid(), (Object) str)) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final void a(f fVar) {
        this.f145228a = fVar;
        this.f145229b.f145219g = fVar;
        c().a(fVar);
        g();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.h
    public final void onVideoEvent(ag agVar) {
        l.d(agVar, "");
        if (v.y(this.f80747j.itemView)) {
            int i2 = agVar.f93450a;
            if (i2 == 13) {
                Object obj = agVar.f93451b;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    for (T t : this.f145229b.f()) {
                        if (l.a((Object) t.getAid(), (Object) str)) {
                            Bundle bundle = agVar.f93452c;
                            if (bundle != null) {
                                int i3 = bundle.getInt("user_digged");
                                t.setUserDigg(i3);
                                if (t.getStatistics() != null) {
                                    AwemeStatistics statistics = t.getStatistics();
                                    if (statistics == null) {
                                        l.b();
                                    }
                                    long diggCount = statistics.getDiggCount();
                                    if (i3 == 1) {
                                        AwemeStatistics statistics2 = t.getStatistics();
                                        l.b(statistics2, "");
                                        statistics2.setDiggCount(diggCount + 1);
                                    } else {
                                        AwemeStatistics statistics3 = t.getStatistics();
                                        l.b(statistics3, "");
                                        statistics3.setDiggCount(diggCount - 1);
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                }
            } else if (i2 == 21) {
                Aweme aweme = null;
                if (d() != null) {
                    com.ss.android.ugc.aweme.search.r.b.a(null);
                }
                Object obj2 = agVar.f93451b;
                if (obj2 instanceof Aweme) {
                    aweme = obj2;
                }
                Aweme aweme2 = aweme;
                if (aweme2 != null) {
                    int a2 = a(aweme2.getAid());
                    if (a2 >= 0 || (a2 = a(this.f67406e)) >= 0) {
                        b().a(a2, 0);
                    }
                }
            }
        }
    }

    public final void a(List<d> list, r rVar) {
        l.d(list, "");
        l.d(rVar, "");
        this.f80747j.a(this.f145229b);
        this.f145229b.f145213a = rVar;
        this.f145229b.b(list);
        a(rVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(d dVar, com.ss.android.ugc.aweme.flowfeed.a.a aVar, com.ss.android.ugc.aweme.flowfeed.a.b bVar) {
        super(dVar, aVar, bVar);
        l.d(dVar, "");
        this.f145231l = i.a((h.f.a.a) new b(dVar));
        this.n = i.a((h.f.a.a) new c(this, bVar, aVar));
        View view = dVar.itemView;
        l.b(view, "");
        Context context = view.getContext();
        l.b(context, "");
        j jVar = new j(context, this, c().b(), c().a(), a(), this.f145228a);
        this.f145229b = jVar;
        a(jVar);
    }
}

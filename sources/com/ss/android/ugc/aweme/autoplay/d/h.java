package com.ss.android.ugc.aweme.autoplay.d;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.core.h.v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import h.f.b.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public abstract class h extends com.ss.android.ugc.aweme.discover.alading.b implements d, i, j {

    /* renamed from: h  reason: collision with root package name */
    public static final a f67401h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private final h.h f67402a;

    /* renamed from: b  reason: collision with root package name */
    private final h.h f67403b;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f67404c;

    /* renamed from: d  reason: collision with root package name */
    public Aweme f67405d;

    /* renamed from: e  reason: collision with root package name */
    public String f67406e;

    /* renamed from: f  reason: collision with root package name */
    public List<? extends Aweme> f67407f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.aweme.flowfeed.a.b f67408g;

    static {
        Covode.recordClassIndex(41506);
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void B() {
    }

    public RecyclerView a() {
        return (RecyclerView) this.f67402a.getValue();
    }

    public final LinearLayoutManager b() {
        return (LinearLayoutManager) this.f67403b.getValue();
    }

    public m c() {
        return (m) this.f67404c.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new g(h.class, "onVideoEvent", ag.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41508);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void A() {
        c().A();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final View w() {
        return c().f67444e;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void x() {
        c().x();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void y() {
        c().y();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void z() {
        c().z();
    }

    static final class b extends m implements h.f.a.a<LinearLayoutManager> {
        final /* synthetic */ com.ss.android.ugc.aweme.discover.alading.d $viewHolder;

        static {
            Covode.recordClassIndex(41509);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.ss.android.ugc.aweme.discover.alading.d dVar) {
            super(0);
            this.$viewHolder = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayoutManager invoke() {
            RecyclerView.i layoutManager = this.$viewHolder.f80749a.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            return layoutManager;
        }
    }

    public final View d() {
        View view = this.f80747j.itemView;
        l.b(view, "");
        return view;
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.g.a
    public final boolean e() {
        return c().e();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final boolean m() {
        return c().m();
    }

    static final class d extends m implements h.f.a.a<m> {
        final /* synthetic */ com.ss.android.ugc.aweme.flowfeed.a.a $containerStatusProvider;
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(41511);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h hVar, com.ss.android.ugc.aweme.flowfeed.a.a aVar) {
            super(0);
            this.this$0 = hVar;
            this.$containerStatusProvider = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ m invoke() {
            return new m(this.this$0.a(), this.this$0.d(), this.this$0.f67408g, this.$containerStatusProvider);
        }
    }

    static final class c extends m implements h.f.a.a<RecyclerView> {
        final /* synthetic */ com.ss.android.ugc.aweme.discover.alading.d $viewHolder;

        static {
            Covode.recordClassIndex(41510);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(com.ss.android.ugc.aweme.discover.alading.d dVar) {
            super(0);
            this.$viewHolder = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RecyclerView invoke() {
            Context context = GlobalContext.getContext();
            l.b(context, "");
            new f(com.bytedance.tux.h.i.a(context), com.ss.android.ugc.aweme.base.utils.i.b(GlobalContext.getContext())).a(this.$viewHolder.f80749a);
            return this.$viewHolder.f80749a;
        }
    }

    public final void a(a aVar) {
        c().f67441b = aVar;
    }

    public final void a(b bVar) {
        c().f67443d = bVar;
    }

    public final void a(List<? extends Aweme> list) {
        if (list != null && (!list.isEmpty())) {
            c().f67442c = (Aweme) list.get(0);
        }
        this.f67407f = list;
    }

    @r
    public void onVideoEvent(ag agVar) {
        b bVar;
        int i2;
        l.d(agVar, "");
        if (v.y(this.f80747j.itemView) && (bVar = c().f67443d) != null && bVar.C() && agVar.f93450a == 21) {
            Aweme aweme = null;
            if (d() != null) {
                com.ss.android.ugc.aweme.search.r.b.a(null);
            }
            Object obj = agVar.f93451b;
            if (obj instanceof Aweme) {
                aweme = obj;
            }
            Aweme aweme2 = aweme;
            if (aweme2 != null && !TextUtils.equals(com.ss.android.ugc.aweme.discover.alading.a.a.f80707f, aweme2.getAid())) {
                List<? extends Aweme> list = this.f67407f;
                if (list == null) {
                    l.b();
                }
                Iterator<? extends Aweme> it = list.iterator();
                int i3 = 0;
                while (true) {
                    i2 = -1;
                    if (!it.hasNext()) {
                        break;
                    } else if (!a((Aweme) it.next(), aweme2)) {
                        i3++;
                    } else if (i3 != -1) {
                        b().a(i3, 0);
                        return;
                    }
                }
                if (this.f67405d != null) {
                    List<? extends Aweme> list2 = this.f67407f;
                    if (list2 != null) {
                        Iterator<? extends Aweme> it2 = list2.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Aweme aweme3 = (Aweme) it2.next();
                            Aweme aweme4 = this.f67405d;
                            if (aweme4 == null) {
                                l.b();
                            }
                            if (a(aweme3, aweme4)) {
                                i2 = i4;
                                break;
                            }
                            i4++;
                        }
                    } else {
                        i2 = 0;
                    }
                    b().a(i2, 0);
                }
            }
        }
    }

    private static boolean a(Aweme aweme, Aweme aweme2) {
        l.d(aweme, "");
        l.d(aweme2, "");
        return TextUtils.equals(aweme.getAid(), aweme2.getAid());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(com.ss.android.ugc.aweme.discover.alading.d dVar, com.ss.android.ugc.aweme.flowfeed.a.a aVar, com.ss.android.ugc.aweme.flowfeed.a.b bVar) {
        super(dVar);
        l.d(dVar, "");
        this.f67408g = bVar;
        this.f67402a = h.i.a((h.f.a.a) new c(dVar));
        this.f67403b = h.i.a((h.f.a.a) new b(dVar));
        this.f67404c = h.i.a((h.f.a.a) new d(this, aVar));
        dVar.itemView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.ss.android.ugc.aweme.autoplay.d.h.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f67409a;

            static {
                Covode.recordClassIndex(41507);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f67409a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                EventBus.a(EventBus.a(), this.f67409a);
            }

            public final void onViewDetachedFromWindow(View view) {
                EventBus.a().b(this.f67409a);
            }
        });
    }
}

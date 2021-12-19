package com.ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.model.an;
import com.ss.android.ugc.aweme.discover.alading.d;
import com.ss.android.ugc.aweme.discover.alading.e;
import com.ss.android.ugc.aweme.discover.helper.f;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.search.k.at;
import com.ss.android.ugc.aweme.search.k.r;
import com.zhiliaoapp.musically.R;
import java.util.UUID;

public final class v extends b {

    /* renamed from: a  reason: collision with root package name */
    TextView f80592a;

    /* renamed from: b  reason: collision with root package name */
    TextView f80593b;

    /* renamed from: c  reason: collision with root package name */
    ViewStub f80594c;

    /* renamed from: d  reason: collision with root package name */
    d f80595d;

    /* renamed from: e  reason: collision with root package name */
    ViewGroup f80596e;

    /* renamed from: f  reason: collision with root package name */
    e f80597f;

    /* renamed from: g  reason: collision with root package name */
    Challenge f80598g;

    /* renamed from: h  reason: collision with root package name */
    boolean f80599h;

    /* renamed from: i  reason: collision with root package name */
    String f80600i;

    /* renamed from: m  reason: collision with root package name */
    public String f80601m;
    a n;
    public Boolean o = false;
    public String p = "";
    public int q = -1;
    f r = null;
    private String s;

    public interface a {
        static {
            Covode.recordClassIndex(50140);
        }
    }

    static {
        Covode.recordClassIndex(50136);
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.b
    public final View I() {
        return this.itemView;
    }

    protected static class b implements View.OnAttachStateChangeListener, Runnable {

        /* renamed from: a  reason: collision with root package name */
        an f80605a;

        /* renamed from: b  reason: collision with root package name */
        boolean f80606b;

        /* renamed from: c  reason: collision with root package name */
        private final View f80607c;

        /* renamed from: d  reason: collision with root package name */
        private final String f80608d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f80609e;

        static {
            Covode.recordClassIndex(50141);
        }

        public final void run() {
            if (this.f80609e) {
                if (this.f80605a != null) {
                    if (!o.b(this.f80607c)) {
                        this.f80606b = false;
                    } else if (!this.f80606b) {
                        this.f80606b = true;
                    }
                }
                this.f80607c.postDelayed(this, 500);
            }
        }

        public final void onViewAttachedToWindow(View view) {
            this.f80609e = true;
            this.f80606b = false;
            run();
        }

        public final void onViewDetachedFromWindow(View view) {
            this.f80609e = false;
            this.f80606b = false;
            this.f80607c.removeCallbacks(this);
        }

        b(View view, String str) {
            this.f80607c = view;
            this.f80608d = str;
        }
    }

    public final void b(String str) {
        int adapterPosition = getAdapterPosition();
        Challenge challenge = this.f80598g;
        if (challenge != null && this.n == null) {
            r F = F();
            if (F.f121266a) {
                View view = this.itemView;
                String str2 = F.f121271f;
                String cid = challenge.getCid();
                String a2 = com.ss.android.ugc.aweme.discover.mob.o.a(this.f80600i);
                int i2 = this.q;
                com.ss.android.ugc.aweme.discover.mob.d.a(view, cid, adapterPosition);
                String a3 = com.ss.android.ugc.aweme.discover.mob.d.a();
                com.ss.android.ugc.aweme.metrics.r rVar = (com.ss.android.ugc.aweme.metrics.r) new com.ss.android.ugc.aweme.metrics.r().b();
                rVar.q = cid;
                rVar.r = str;
                com.ss.android.ugc.aweme.discover.mob.o.a(adapterPosition, str2, a3, ((com.ss.android.ugc.aweme.metrics.r) rVar.o(com.ss.android.ugc.aweme.discover.mob.o.a(3)).b(String.valueOf(i2)).c()).p(a3), 3, a2);
                com.ss.android.ugc.aweme.discover.mob.o.b(3, cid, str2);
                return;
            }
            View view2 = this.itemView;
            String str3 = F.f121271f;
            String requestId = challenge.getRequestId();
            String cid2 = challenge.getCid();
            String a4 = com.ss.android.ugc.aweme.discover.mob.o.a(this.f80600i);
            String a5 = com.ss.android.ugc.aweme.discover.mob.d.a();
            String cid3 = challenge.getCid();
            com.ss.android.ugc.aweme.discover.mob.d.a(view2, cid2, adapterPosition);
            com.ss.android.ugc.aweme.metrics.r rVar2 = (com.ss.android.ugc.aweme.metrics.r) new com.ss.android.ugc.aweme.metrics.r().b();
            rVar2.q = cid2;
            rVar2.r = str;
            com.ss.android.ugc.aweme.discover.mob.o.a(adapterPosition, str3, requestId, ((com.ss.android.ugc.aweme.metrics.r) rVar2.o(com.ss.android.ugc.aweme.discover.mob.o.a(2)).b(String.valueOf(adapterPosition)).c()).p(requestId).l(a5).f(cid3), 2, a4);
            com.ss.android.ugc.aweme.discover.mob.o.b(2, cid2, str3);
        }
    }

    public v(final View view, String str) {
        super(view);
        this.f80592a = (TextView) view.findViewById(R.id.ewo);
        this.f80593b = (TextView) view.findViewById(R.id.f43);
        this.f80594c = (ViewStub) view.findViewById(R.id.dug);
        this.n = null;
        this.s = str;
        view.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.discover.adapter.v.AnonymousClass1 */

            static {
                Covode.recordClassIndex(50137);
            }

            public final void onClick(View view) {
                String str;
                ClickAgent.onClick(view);
                if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                    CommerceChallengeServiceImpl.e().a(v.this.f80598g);
                    String uuid = UUID.randomUUID().toString();
                    v.this.b(uuid);
                    SmartRoute withParam = SmartRouter.buildRoute(view.getContext(), "//challenge/detail").withParam("id", v.this.f80598g.getCid()).withParam("enter_from", v.this.f80601m).withParam("process_id", uuid);
                    if (CommerceChallengeServiceImpl.e().b(v.this.f80598g)) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    withParam.withParam("is_commerce", str).withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", v.this.f80598g.getSubType()).open();
                    if (v.this.f80599h) {
                        ((at) ((com.ss.android.ugc.aweme.search.k.d) com.ss.android.ugc.aweme.discover.mixfeed.b.b.b(v.this.F()).x("hot_challenge")).w("1").g(v.this.f80598g.getCid())).B("click_info").a("hashtags_name", v.this.f80598g.getSearchChaName()).f();
                    } else {
                        ((at) ((com.ss.android.ugc.aweme.search.k.d) com.ss.android.ugc.aweme.discover.mixfeed.b.b.b(v.this.F()).x("tag")).w("0").g(v.this.f80598g.getCid())).A("click_info").a("hashtags_name", v.this.f80598g.getSearchChaName()).f();
                    }
                    if (v.this.o.booleanValue()) {
                        CommerceChallengeServiceImpl.e().b(v.this.p, v.this.f80598g.getSearchChaName());
                    }
                }
            }
        });
    }
}

package com.ss.android.ugc.aweme.discover.alading.a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.h.v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.discover.alading.a.a;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.ae;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.k.at;
import com.ss.android.ugc.aweme.search.k.au;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.search.n.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;

public class e extends com.ss.android.ugc.aweme.discover.alading.b implements c, i, j {

    /* renamed from: a  reason: collision with root package name */
    private final h f80735a;

    /* renamed from: d  reason: collision with root package name */
    public List<? extends Aweme> f80736d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.discover.c.a f80737e;

    static {
        Covode.recordClassIndex(50206);
    }

    private a f() {
        return (a) this.f80735a.getValue();
    }

    public void a() {
    }

    public String b() {
        return "";
    }

    public int c() {
        return -1;
    }

    public String d() {
        return "";
    }

    public String e() {
        return "";
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new g(e.class, "onVideoEvent", ag.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public final void a(List<? extends Aweme> list) {
        l.d(list, "");
        super.a(list, this.f80737e);
        this.f80736d = list;
        a f2 = f();
        l.d(list, "");
        f2.f80711a = list;
        f2.notifyDataSetChanged();
        f2.f80712b.a(list, new a.b());
        com.ss.android.ugc.aweme.discover.c.e.a(true, list, 0);
        View view = this.f80747j.itemView;
        l.b(view, "");
        r a2 = j.a.a(view).a(new b(this));
        String d2 = d();
        l.d(d2, "");
        a2.z = d2;
        c cVar = c.f80740a;
        l.d(cVar, "");
        a2.E = cVar;
        r b2 = a2.b(d.f80741a);
        a f3 = f();
        l.d(b2, "");
        f3.f80715e = b2;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.a.e$e  reason: collision with other inner class name */
    static final class CallableC1884e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f80742a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f80743b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f80744c;

        static {
            Covode.recordClassIndex(50213);
        }

        CallableC1884e(e eVar, Aweme aweme, int i2) {
            this.f80742a = eVar;
            this.f80743b = aweme;
            this.f80744c = i2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f80742a.a(this.f80743b, Integer.valueOf(this.f80744c)).f();
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.a<a> {
        final /* synthetic */ com.ss.android.ugc.aweme.discover.alading.d $viewHolder;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(50209);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, com.ss.android.ugc.aweme.discover.alading.d dVar) {
            super(0);
            this.this$0 = eVar;
            this.$viewHolder = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            View view = this.$viewHolder.itemView;
            l.b(view, "");
            Context context = view.getContext();
            l.b(context, "");
            e eVar = this.this$0;
            View view2 = this.$viewHolder.itemView;
            l.b(view2, "");
            return new a(context, eVar, j.a.a(view2));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<Aweme, String> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(50210);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Aweme aweme) {
            return this.this$0.e();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<Aweme, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f80740a = new c();

        static {
            Covode.recordClassIndex(50211);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Aweme aweme) {
            String aid;
            Aweme aweme2 = aweme;
            if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                return "";
            }
            return aid;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<Aweme, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f80741a = new d();

        static {
            Covode.recordClassIndex(50212);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Aweme aweme) {
            String aid;
            Aweme aweme2 = aweme;
            if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                return "";
            }
            return aid;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(com.ss.android.ugc.aweme.discover.alading.d dVar) {
        super(dVar);
        l.d(dVar, "");
        this.f80735a = h.i.a((h.f.a.a) new a(this, dVar));
        a f2 = f();
        Objects.requireNonNull(f2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder>");
        this.f80737e = new com.ss.android.ugc.aweme.discover.c.a(f2);
        View a2 = com.ss.android.ugc.aweme.search.l.m.a(dVar.f80749a, R.layout.aw5);
        com.ss.android.ugc.aweme.discover.c.a aVar = this.f80737e;
        int size = aVar.f80891b.size();
        if (size >= 0 && size <= aVar.f80891b.size() && a2 != null) {
            int a3 = aVar.f80893d.a();
            com.ss.android.ugc.aweme.discover.c.g gVar = new com.ss.android.ugc.aweme.discover.c.g(a3, a2);
            aVar.f80891b.add(gVar);
            aVar.f80892c.b(a3, gVar);
            aVar.notifyItemInserted((aVar.getItemCount() - aVar.f80891b.size()) + size);
        }
        a2.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.discover.alading.a.e.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f80738a;

            static {
                Covode.recordClassIndex(50207);
            }

            {
                this.f80738a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                    this.f80738a.a();
                }
            }
        });
        dVar.itemView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.ss.android.ugc.aweme.discover.alading.a.e.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f80739a;

            static {
                Covode.recordClassIndex(50208);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f80739a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                EventBus.a(EventBus.a(), this.f80739a);
            }

            public final void onViewDetachedFromWindow(View view) {
                EventBus.a().b(this.f80739a);
            }
        });
    }

    @org.greenrobot.eventbus.r
    public final void onVideoEvent(ag agVar) {
        String str;
        l.d(agVar, "");
        if (v.y(this.f80747j.itemView) && agVar.f93450a == 21 && agVar.f93458i != 65280) {
            String str2 = this.f80746i.f121269d;
            Bundle bundle = agVar.f93452c;
            if (bundle != null) {
                str = bundle.getString("key_search_type");
            } else {
                str = null;
            }
            if (TextUtils.equals(str2, str)) {
                Object obj = agVar.f93451b;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
                Aweme aweme = (Aweme) obj;
                if (aweme != null && !TextUtils.equals(a.f80707f, aweme.getAid())) {
                    a(agVar, aweme);
                }
            }
        }
    }

    public com.ss.android.ugc.aweme.search.k.l a(Aweme aweme, View view) {
        l.d(aweme, "");
        l.d(view, "");
        r a2 = j.a.a(view);
        String str = "general_search";
        if (!TextUtils.equals(a2.f121272g, str)) {
            str = "search_result";
        }
        return (com.ss.android.ugc.aweme.search.k.l) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.c) ((com.ss.android.ugc.aweme.search.k.c) new com.ss.android.ugc.aweme.search.k.l(a2).f(aweme).o(str)).b(a2.f121271f).p("aladdin_card").c("video_tag", com.ss.android.ugc.aweme.discover.mixfeed.a.d.a(aweme))).a(ac.b(aweme)).c(a2.f121277l).g(aweme.getAuthorUid())).v(aweme.getAid()).f(a2.f121269d);
    }

    public Bundle b(Aweme aweme, View view) {
        l.d(aweme, "");
        l.d(view, "");
        r a2 = j.a.a(view);
        String str = "general_search";
        if (!TextUtils.equals(a2.f121272g, str)) {
            str = "search_result";
        }
        Bundle bundle = new Bundle();
        bundle.putString("id", aweme.getAid());
        bundle.putString("video_from", "from_no_request");
        bundle.putString("enter_from", str);
        bundle.putString("search_keyword", a2.f121271f);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", c());
        bundle.putString("search_id", a2.f121274i);
        bundle.putString("list_item_id", aweme.getAid());
        bundle.putString("search_result_id", aweme.getAuthorUid());
        bundle.putString("playlist_search_id", a2.f121274i);
        bundle.putString("key_search_type", a2.f121269d);
        bundle.putInt("is_from_video", 2);
        return bundle;
    }

    public au a(Aweme aweme, Integer num) {
        String str;
        String str2;
        User author;
        View view = this.f80747j.itemView;
        l.b(view, "");
        com.ss.android.ugc.aweme.search.k.d dVar = (com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) com.ss.android.ugc.aweme.discover.mixfeed.b.b.a(j.a.a(view)).x(b())).r(d()).g(e());
        Long l2 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        com.ss.android.ugc.aweme.search.k.d dVar2 = (com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) dVar.v(str)).d(num);
        if (aweme != null) {
            str2 = aweme.getDesc();
        } else {
            str2 = null;
        }
        au auVar = (au) ((com.ss.android.ugc.aweme.search.k.d) dVar2.s(str2)).w("1");
        if (aweme != null && aweme.isLive()) {
            if (!(aweme == null || (author = aweme.getAuthor()) == null)) {
                l2 = Long.valueOf(author.roomId);
            }
            auVar.v(String.valueOf(l2));
            auVar.r("live");
        }
        auVar.a("video_tag", com.ss.android.ugc.aweme.discover.mixfeed.a.d.a(aweme));
        return auVar;
    }

    public void a(ag agVar, Aweme aweme) {
        l.d(agVar, "");
        l.d(aweme, "");
        List<? extends Aweme> list = this.f80736d;
        if (list == null) {
            l.b();
        }
        int i2 = 0;
        for (Aweme aweme2 : list) {
            if (!TextUtils.equals(aweme2.getAid(), aweme.getAid())) {
                i2++;
            } else if (i2 != -1) {
                RecyclerView.i layoutManager = this.f80747j.f80749a.getLayoutManager();
                Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                ((LinearLayoutManager) layoutManager).a(i2, 0);
                return;
            } else {
                return;
            }
        }
    }

    public at a(Aweme aweme, Integer num, String str) {
        String str2;
        String str3;
        User author;
        l.d(str, "");
        View view = this.f80747j.itemView;
        l.b(view, "");
        com.ss.android.ugc.aweme.search.k.d dVar = (com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) com.ss.android.ugc.aweme.discover.mixfeed.b.b.b(j.a.a(view)).x(b())).r(d()).g(e())).t(this.f80746i.r).l(this.f80746i.q);
        Long l2 = null;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        com.ss.android.ugc.aweme.search.k.d dVar2 = (com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) dVar.v(str2)).d(num);
        if (aweme != null) {
            str3 = aweme.getDesc();
        } else {
            str3 = null;
        }
        at B = ((at) ((com.ss.android.ugc.aweme.search.k.d) dVar2.s(str3)).w("1")).B(str);
        if (aweme != null && aweme.isLive()) {
            if (!(aweme == null || (author = aweme.getAuthor()) == null)) {
                l2 = Long.valueOf(author.roomId);
            }
            B.v(String.valueOf(l2));
            B.r("live");
        }
        B.a("video_tag", com.ss.android.ugc.aweme.discover.mixfeed.a.d.a(aweme));
        return B;
    }

    public void a(Aweme aweme, View view, List<? extends Aweme> list) {
        l.d(aweme, "");
        l.d(view, "");
        l.d(list, "");
        com.ss.android.ugc.aweme.discover.j.d dVar = new com.ss.android.ugc.aweme.discover.j.d();
        dVar.a_(list);
        ae.f95296a = dVar;
        Bundle b2 = b(aweme, view);
        androidx.core.app.b b3 = androidx.core.app.b.b(view, view.getWidth(), view.getHeight());
        l.b(b3, "");
        SmartRouter.buildRoute(view.getContext(), "//aweme/detail").withParam(b2).withBundleAnimation(b3.a()).withParam("activity_has_activity_options", true).withParam("playlist_search_id", j.a.a(view).f121274i).withParam("key_search_type", j.a.a(view).f121269d).withParam("is_from_video", 2).open();
        com.ss.android.ugc.aweme.feed.d.b.a(aweme);
    }

    @Override // com.ss.android.ugc.aweme.discover.alading.a.c
    public final void b(int i2, View view, Aweme aweme, List<? extends Aweme> list) {
        l.d(view, "");
        l.d(aweme, "");
        l.d(list, "");
        b.i.b(new CallableC1884e(this, aweme, i2), b.i.f4824a);
    }

    @Override // com.ss.android.ugc.aweme.discover.alading.a.c
    public final void a(int i2, View view, Aweme aweme, List<? extends Aweme> list) {
        String str;
        l.d(view, "");
        l.d(aweme, "");
        l.d(list, "");
        if (!aweme.isLive()) {
            View view2 = this.f80747j.itemView;
            l.b(view2, "");
            com.ss.android.ugc.aweme.search.r.b.a(j.a.a(view2));
            a(aweme, view, list);
            com.ss.android.ugc.aweme.feed.d.b.a(aweme);
            a(aweme, view).f();
        }
        com.ss.android.ugc.aweme.discover.mob.d.a(view, e(), i2, null);
        Integer valueOf = Integer.valueOf(i2);
        if (aweme.isLive()) {
            str = "click_live";
        } else {
            str = "click_video";
        }
        a(aweme, valueOf, str).f();
        e.a.a(h.a.ag.a(h.v.a("search_result_id", e()), h.v.a("list_item_id", aweme.getAid()), h.v.a("is_from_video", "2")));
    }
}

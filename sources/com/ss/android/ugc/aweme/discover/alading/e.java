package com.ss.android.ugc.aweme.discover.alading;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.discover.api.SearchContinuousLoadingApi;
import com.ss.android.ugc.aweme.discover.helper.x;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.k.at;
import com.ss.android.ugc.aweme.search.k.au;
import com.ss.android.ugc.aweme.search.k.d;
import com.ss.android.ugc.aweme.search.k.r;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public final class e extends com.ss.android.ugc.aweme.discover.alading.a.e {

    /* renamed from: a  reason: collision with root package name */
    public SearchChallenge f80751a;

    /* renamed from: b  reason: collision with root package name */
    public h.f.a.a<z> f80752b;

    /* renamed from: c  reason: collision with root package name */
    public h.f.a.a<Integer> f80753c;

    /* renamed from: f  reason: collision with root package name */
    private final h f80754f = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(50217);
    }

    private final x f() {
        return (x) this.f80754f.getValue();
    }

    @Override // com.ss.android.ugc.aweme.discover.alading.a.e
    public final String b() {
        return "hot_challenge";
    }

    @Override // com.ss.android.ugc.aweme.discover.alading.a.e
    public final int c() {
        return 65456;
    }

    @Override // com.ss.android.ugc.aweme.discover.alading.a.e
    public final String d() {
        return "video";
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.a<x> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(50218);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ x invoke() {
            return x.a.a(new x.b(this) {
                /* class com.ss.android.ugc.aweme.discover.alading.e.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f80755a;

                static {
                    Covode.recordClassIndex(50219);
                }

                @Override // com.ss.android.ugc.aweme.discover.helper.x.b
                public final int aM_() {
                    return 10;
                }

                @Override // com.ss.android.ugc.aweme.discover.helper.x.b
                public final Object aJ_() {
                    return this.f80755a.this$0.f80751a;
                }

                @Override // com.ss.android.ugc.aweme.discover.helper.x.b
                public final List<Aweme> aK_() {
                    List<Aweme> awemes;
                    SearchChallenge searchChallenge = this.f80755a.this$0.f80751a;
                    if (!(searchChallenge == null || (awemes = searchChallenge.getAwemes()) == null)) {
                        ArrayList arrayList = new ArrayList();
                        for (T t : awemes) {
                            T t2 = t;
                            l.b(t2, "");
                            if (!t2.isLive()) {
                                arrayList.add(t);
                            }
                        }
                        ArrayList arrayList2 = arrayList;
                        if (arrayList2 != null) {
                            return n.g((Collection) arrayList2);
                        }
                    }
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.discover.helper.x.b
                public final List<Aweme> aL_() {
                    List<Aweme> awemes;
                    SearchChallenge searchChallenge = this.f80755a.this$0.f80751a;
                    if (!(searchChallenge == null || (awemes = searchChallenge.getAwemes()) == null)) {
                        ArrayList arrayList = new ArrayList();
                        for (T t : awemes) {
                            T t2 = t;
                            l.b(t2, "");
                            if (t2.isLive()) {
                                arrayList.add(t);
                            }
                        }
                        ArrayList arrayList2 = arrayList;
                        if (arrayList2 != null) {
                            return n.g((Collection) arrayList2);
                        }
                    }
                    return null;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f80755a = r1;
                }

                @Override // com.ss.android.ugc.aweme.discover.helper.x.b
                public final boolean a(Aweme aweme) {
                    l.d(aweme, "");
                    List<Aweme> aK_ = aK_();
                    if (aK_ == null) {
                        return false;
                    }
                    Iterator<T> it = aK_.iterator();
                    while (it.hasNext()) {
                        if (TextUtils.equals(it.next().getAid(), aweme.getAid())) {
                            return true;
                        }
                    }
                    return false;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.alading.a.e
    public final String e() {
        String str;
        Challenge challenge;
        SearchChallenge searchChallenge = this.f80751a;
        if (searchChallenge == null || (challenge = searchChallenge.getChallenge()) == null) {
            str = null;
        } else {
            str = challenge.getCid();
        }
        return String.valueOf(str);
    }

    @Override // com.ss.android.ugc.aweme.discover.alading.a.e
    public final void a() {
        String str;
        int i2;
        Integer invoke;
        String uuid = UUID.randomUUID().toString();
        l.b(uuid, "");
        t a2 = t.a();
        StringBuilder sb = new StringBuilder("aweme://challenge/detail/");
        SearchChallenge searchChallenge = this.f80751a;
        if (searchChallenge == null) {
            l.b();
        }
        u a3 = u.a(sb.append(searchChallenge.getChallenge().getCid()).toString()).a("enter_from", this.f80746i.f121272g).a("process_id", uuid);
        ICommerceChallengeService e2 = CommerceChallengeServiceImpl.e();
        SearchChallenge searchChallenge2 = this.f80751a;
        if (searchChallenge2 == null) {
            l.b();
        }
        if (e2.b(searchChallenge2.getChallenge())) {
            str = "1";
        } else {
            str = "0";
        }
        u a4 = a3.a("is_commerce", str);
        SearchChallenge searchChallenge3 = this.f80751a;
        if (searchChallenge3 == null) {
            l.b();
        }
        t.a(a2, a4.a("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", searchChallenge3.getChallenge().getSubType()).a());
        View view = this.f80747j.itemView;
        l.b(view, "");
        at B = ((at) ((d) com.ss.android.ugc.aweme.discover.mixfeed.b.b.b(j.a.a(view)).x("hot_challenge").g(e())).w("1")).B("click_see_all");
        h.f.a.a<Integer> aVar = this.f80753c;
        if (aVar == null || (invoke = aVar.invoke()) == null) {
            i2 = 0;
        } else {
            i2 = invoke.intValue();
        }
        B.a(Integer.valueOf(i2)).f();
        h.f.a.a<z> aVar2 = this.f80752b;
        if (aVar2 != null) {
            aVar2.invoke();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(d dVar) {
        super(dVar);
        l.d(dVar, "");
    }

    @Override // com.ss.android.ugc.aweme.discover.alading.a.e
    public final com.ss.android.ugc.aweme.search.k.l a(Aweme aweme, View view) {
        String str;
        Challenge challenge;
        l.d(aweme, "");
        l.d(view, "");
        com.ss.android.ugc.aweme.search.k.l a2 = super.a(aweme, view);
        SearchChallenge searchChallenge = this.f80751a;
        if (searchChallenge == null || (challenge = searchChallenge.getChallenge()) == null) {
            str = null;
        } else {
            str = challenge.getCid();
        }
        a2.g(str);
        return a2;
    }

    static final class b extends m implements h.f.a.m<Aweme, List<Aweme>, z> {
        final /* synthetic */ ag $event;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(50220);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, ag agVar) {
            super(2);
            this.this$0 = eVar;
            this.$event = agVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Aweme aweme, List<Aweme> list) {
            Aweme aweme2 = aweme;
            List<Aweme> list2 = list;
            l.d(aweme2, "");
            SearchChallenge searchChallenge = this.this$0.f80751a;
            if (searchChallenge != null) {
                if (list2 != null) {
                    searchChallenge.setAwemes(list2);
                    this.this$0.a(list2);
                }
                e.super.a((e) this.$event, (ag) aweme2);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.alading.a.e
    public final Bundle b(Aweme aweme, View view) {
        String str;
        Challenge challenge;
        l.d(aweme, "");
        l.d(view, "");
        Bundle b2 = super.b(aweme, view);
        SearchChallenge searchChallenge = this.f80751a;
        if (searchChallenge == null || (challenge = searchChallenge.getChallenge()) == null) {
            str = null;
        } else {
            str = challenge.getCid();
        }
        b2.putString("search_result_id", str);
        return b2;
    }

    @Override // com.ss.android.ugc.aweme.discover.alading.a.e
    public final au a(Aweme aweme, Integer num) {
        String str;
        Challenge challenge;
        au a2 = super.a(aweme, num);
        SearchChallenge searchChallenge = this.f80751a;
        if (searchChallenge == null || (challenge = searchChallenge.getChallenge()) == null) {
            str = null;
        } else {
            str = challenge.getChallengeName();
        }
        return (au) a2.c("hashtags_name", String.valueOf(str));
    }

    @Override // com.ss.android.ugc.aweme.discover.alading.a.e
    public final void a(ag agVar, Aweme aweme) {
        l.d(agVar, "");
        l.d(aweme, "");
        x f2 = f();
        if (f2 != null) {
            f2.a(agVar, aweme, new b(this, agVar));
        } else {
            super.a(agVar, aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.alading.a.e
    public final at a(Aweme aweme, Integer num, String str) {
        String str2;
        Challenge challenge;
        l.d(str, "");
        at a2 = super.a(aweme, num, str);
        SearchChallenge searchChallenge = this.f80751a;
        if (searchChallenge == null || (challenge = searchChallenge.getChallenge()) == null) {
            str2 = null;
        } else {
            str2 = challenge.getChallengeName();
        }
        return (at) a2.c("hashtags_name", String.valueOf(str2));
    }

    @Override // com.ss.android.ugc.aweme.discover.alading.a.e
    public final void a(Aweme aweme, View view, List<? extends Aweme> list) {
        String str;
        Challenge challenge;
        l.d(aweme, "");
        l.d(view, "");
        l.d(list, "");
        r a2 = j.a.a(view);
        x f2 = f();
        if (f2 != null) {
            Context context = view.getContext();
            l.b(context, "");
            Bundle b2 = b(aweme, view);
            SearchContinuousLoadingApi.b bVar = new SearchContinuousLoadingApi.b();
            bVar.f80793a = a2.f121271f;
            SearchChallenge searchChallenge = this.f80751a;
            if (searchChallenge == null || (challenge = searchChallenge.getChallenge()) == null) {
                str = null;
            } else {
                str = challenge.getCid();
            }
            bVar.f80795c = str;
            bVar.f80794b = 2;
            f2.a(context, b2, bVar);
            return;
        }
        super.a(aweme, view, list);
    }
}

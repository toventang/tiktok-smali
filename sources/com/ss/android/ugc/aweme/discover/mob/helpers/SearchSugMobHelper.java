package com.ss.android.ugc.aweme.discover.mob.helpers;

import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.mob.m;
import com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.j;
import com.ss.android.ugc.aweme.search.k.az;
import com.ss.android.ugc.aweme.search.k.bk;
import com.ss.android.ugc.aweme.search.k.c;
import com.ss.android.ugc.aweme.search.model.e;
import h.f.b.l;

public final class SearchSugMobHelper extends ac {

    /* renamed from: f  reason: collision with root package name */
    public static final a f81918f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public LogPbBean f81919a;

    /* renamed from: b  reason: collision with root package name */
    public String f81920b;

    /* renamed from: c  reason: collision with root package name */
    public String f81921c;

    /* renamed from: d  reason: collision with root package name */
    public RecommendWordMob f81922d;

    /* renamed from: e  reason: collision with root package name */
    public h.f.a.a<Integer> f81923e;

    static {
        Covode.recordClassIndex(50851);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50852);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a(String str, Integer num, String str2, e eVar) {
        int i2;
        Integer invoke;
        l.d(eVar, "");
        c cVar = (c) new az().o(this.f81921c).p("sug");
        h.f.a.a<Integer> aVar = this.f81923e;
        if (aVar == null || (invoke = aVar.invoke()) == null) {
            i2 = j.f121154b;
        } else {
            i2 = invoke.intValue();
        }
        ((c) ((bk) ((bk) cVar.f(m.b(i2))).A(str).q(str2)).B(this.f81920b).b(eVar.f121519b).i(eVar.f121523f.getId())).b(num).f();
    }
}

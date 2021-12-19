package com.ss.android.ugc.aweme.search.s;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.a.q;
import com.ss.android.ugc.aweme.discover.j.l;
import com.ss.android.ugc.aweme.discover.mixfeed.n;
import com.ss.android.ugc.aweme.discover.mixfeed.p;
import com.ss.android.ugc.aweme.discover.ui.am;
import com.ss.android.ugc.aweme.search.l.k;
import com.ss.android.ugc.aweme.search.l.m;
import com.ss.android.ugc.aweme.search.model.d;
import com.ss.android.ugc.aweme.utils.in;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f121603a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(79203);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f121604a;

        static {
            Covode.recordClassIndex(79204);
        }

        a(d dVar) {
            this.f121604a = dVar;
        }

        public final void run() {
            String str;
            Object a2;
            if (l.f81274c <= 0 || l.f81275d != l.f81274c) {
                d dVar = this.f121604a;
                h.f.b.l.d(dVar, "");
                h.f.b.l.d(dVar, "");
                n.a a3 = new n.a().a(dVar);
                String keyword = dVar.getKeyword();
                h.f.b.l.b(keyword, "");
                n.a d2 = a3.a(keyword).a(0).b(p.f81853c).c(1).d(!h.f.b.l.a("correct_word", dVar.getSearchFrom()) ? 1 : 0);
                String enterMethod = dVar.getEnterMethod();
                if (enterMethod == null || enterMethod.length() == 0) {
                    str = dVar.getSearchFrom();
                } else {
                    str = dVar.getEnterMethod();
                }
                h.f.b.l.b(str, "");
                n.a f2 = d2.d(str).e(am.H).g(dVar.getIsRichSug()).h(dVar.getSugUserId()).f(com.ss.android.ugc.aweme.discover.api.a.a());
                f2.f81848a.v = dVar.getWordType();
                n a4 = f2.a();
                h.f.b.l.d(a4, "");
                if (!in.d()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    l.f81273b = currentTimeMillis;
                    if (currentTimeMillis - l.f81273b >= 1000) {
                        if (m.a()) {
                            a2 = a4.b();
                        } else {
                            a2 = a4.a();
                        }
                        l.f81272a.put(a4, new h.p<>(a4, a2));
                    }
                }
            }
        }
    }

    public static void a(d dVar) {
        h.f.b.l.d(dVar, "");
        dVar.getKeyword();
        Thread currentThread = Thread.currentThread();
        h.f.b.l.b(currentThread, "");
        currentThread.getName();
        k.INSTANCE.async(new a(dVar));
        if (q.a()) {
            com.ss.android.ugc.aweme.search.k.q a2 = com.ss.android.ugc.aweme.search.k.am.a();
            if (a2 == null || a2.a() == 0) {
                String keyword = dVar.getKeyword();
                h.f.b.l.b(keyword, "");
                com.ss.android.ugc.aweme.discover.mixfeed.lynx.d.a(keyword);
            }
        }
    }
}

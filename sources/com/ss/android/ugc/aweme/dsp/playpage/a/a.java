package com.ss.android.ugc.aweme.dsp.playpage.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.playerservice.b.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import h.f.b.l;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f83675a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(52208);
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playpage.a.a$a  reason: collision with other inner class name */
    public static final class RunnableC1990a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f83676a;

        static {
            Covode.recordClassIndex(52209);
        }

        public RunnableC1990a(String str) {
            this.f83676a = str;
        }

        public final void run() {
            CopyOnWriteArrayList<c> copyOnWriteArrayList;
            CopyOnWriteArrayList<c> copyOnWriteArrayList2;
            for (Map.Entry<String, com.ss.android.ugc.aweme.dsp.common.arch.a.a> entry : com.ss.android.ugc.aweme.dsp.common.arch.a.a.f83288d.entrySet()) {
                com.ss.android.ugc.aweme.dsp.playerservice.a aVar = entry.getValue().f83291b;
                boolean z = false;
                com.ss.android.ugc.aweme.dsp.playerservice.e.b w = aVar.f83361a.m();
                if (!(w == null || (copyOnWriteArrayList2 = w.f83535c) == null)) {
                    Iterator<T> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        Aweme aweme = it.next().c().getAweme();
                        if (l.a((Object) aweme.getAid(), (Object) this.f83676a)) {
                            AwemeStatistics statistics = aweme.getStatistics();
                            l.b(statistics, "");
                            statistics.setCommentCount(statistics.getCommentCount() + 1);
                            z = true;
                        }
                    }
                }
                com.ss.android.ugc.aweme.dsp.playerservice.e.b w2 = aVar.f83362b.m();
                if (!(w2 == null || (copyOnWriteArrayList = w2.f83535c) == null)) {
                    Iterator<T> it2 = copyOnWriteArrayList.iterator();
                    while (it2.hasNext()) {
                        Aweme aweme2 = it2.next().c().getAweme();
                        if (l.a((Object) aweme2.getAid(), (Object) this.f83676a)) {
                            AwemeStatistics statistics2 = aweme2.getStatistics();
                            l.b(statistics2, "");
                            statistics2.setCommentCount(statistics2.getCommentCount() + 1);
                            z = true;
                        }
                    }
                }
                if (z) {
                    com.ss.android.ugc.d.a.c.a(new b());
                }
            }
        }
    }

    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f83677a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f83678b;

        static {
            Covode.recordClassIndex(52210);
        }

        public b(String str, long j2) {
            this.f83677a = str;
            this.f83678b = j2;
        }

        public final void run() {
            CopyOnWriteArrayList<c> copyOnWriteArrayList;
            CopyOnWriteArrayList<c> copyOnWriteArrayList2;
            for (Map.Entry<String, com.ss.android.ugc.aweme.dsp.common.arch.a.a> entry : com.ss.android.ugc.aweme.dsp.common.arch.a.a.f83288d.entrySet()) {
                com.ss.android.ugc.aweme.dsp.playerservice.a aVar = entry.getValue().f83291b;
                boolean z = false;
                com.ss.android.ugc.aweme.dsp.playerservice.e.b w = aVar.f83361a.m();
                if (!(w == null || (copyOnWriteArrayList2 = w.f83535c) == null)) {
                    Iterator<T> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        Aweme aweme = it.next().c().getAweme();
                        if (l.a((Object) aweme.getAid(), (Object) this.f83677a)) {
                            AwemeStatistics statistics = aweme.getStatistics();
                            l.b(statistics, "");
                            statistics.setCommentCount(this.f83678b);
                            z = true;
                        }
                    }
                }
                com.ss.android.ugc.aweme.dsp.playerservice.e.b w2 = aVar.f83362b.m();
                if (!(w2 == null || (copyOnWriteArrayList = w2.f83535c) == null)) {
                    Iterator<T> it2 = copyOnWriteArrayList.iterator();
                    while (it2.hasNext()) {
                        Aweme aweme2 = it2.next().c().getAweme();
                        if (l.a((Object) aweme2.getAid(), (Object) this.f83677a)) {
                            AwemeStatistics statistics2 = aweme2.getStatistics();
                            l.b(statistics2, "");
                            statistics2.setCommentCount(this.f83678b);
                            z = true;
                        }
                    }
                }
                if (z) {
                    com.ss.android.ugc.d.a.c.a(new b());
                }
            }
        }
    }
}

package com.ss.ugc.aweme.performance.mainlooper.monitor.work;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.aweme.performance.core.monitor.a;
import com.ss.ugc.aweme.performance.core.monitor.b.c;
import com.ss.ugc.aweme.performance.core.monitor.d.a;
import com.ss.ugc.aweme.performance.core.monitor.d.b;
import com.ss.ugc.aweme.performance.mainlooper.monitor.work.a;
import h.f.b.l;

public final class SampleJankListener implements b {
    private long threshold = 100;

    static {
        Covode.recordClassIndex(101828);
    }

    public final long getThreshold() {
        return this.threshold;
    }

    public final void stop() {
        a.C4081a.a().f153392i.removeCallbacksAndMessages(null);
    }

    public SampleJankListener() {
        a a2 = a.C4081a.a();
        long threshold2 = getThreshold();
        a2.f153391h = threshold2;
        double d2 = (double) threshold2;
        double d3 = a.f153390m;
        Double.isNaN(d2);
        a2.f153393j = (long) (d2 * d3);
    }

    @Override // com.ss.ugc.aweme.performance.core.monitor.d.b
    public final void setThreshold(long j2) {
        this.threshold = j2;
    }

    @Override // com.ss.ugc.aweme.performance.core.monitor.d.b
    public final void flush(c cVar) {
        com.ss.ugc.aweme.performance.core.monitor.e.b.f153380a.a(new a.c(a.C4081a.a(), cVar));
    }

    @Override // com.ss.ugc.aweme.performance.core.monitor.d.b
    public final void onMessageLeave(String str, long j2) {
        l.c(str, "");
        a a2 = a.C4081a.a();
        l.c(str, "");
        if (j2 - a2.f153394k.f153398b < a2.f153393j) {
            a2.f153392i.removeCallbacks(a2.f153394k);
        }
    }

    @Override // com.ss.ugc.aweme.performance.core.monitor.d.b
    public final void onMessageArrive(String str, long j2) {
        l.c(str, "");
        a a2 = a.C4081a.a();
        l.c(str, "");
        a.c cVar = a2.f153394k;
        l.c(str, "");
        cVar.f153397a = str;
        a2.f153394k.f153398b = j2;
        a2.f153392i.postDelayed(a2.f153394k, a2.f153393j);
    }

    @Override // com.ss.ugc.aweme.performance.core.monitor.d.b
    public final void onJankHappened(String str, long j2, long j3, long j4) {
        l.c(str, "");
        a a2 = a.C4081a.a();
        l.c(str, "");
        com.ss.ugc.aweme.performance.core.monitor.b.b bVar = a2.f153371a.get(str);
        com.ss.ugc.aweme.performance.core.monitor.a.a aVar = a.C4078a.a().f153329b;
        if (aVar == null || !aVar.e()) {
            if (bVar == null) {
                return;
            }
        } else if (bVar != null) {
            bVar.f153359k = com.bytedance.t.a.a.a.a();
        } else {
            return;
        }
        bVar.f153354f = j3;
        if (a2.f153373c) {
            com.ss.ugc.aweme.performance.core.monitor.e.b.f153380a.a(new a.d(a2, bVar));
        }
        if (a2.f153371a.size() > a.n && com.ss.ugc.aweme.performance.core.monitor.b.f153334a.size() == 0) {
            a2.f153371a.size();
            a2.f153371a.clear();
        }
    }
}

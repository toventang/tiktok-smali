package com.ss.android.ugc.aweme.bs;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.s;
import h.f.b.l;
import java.util.HashMap;

public final class b extends s {
    public final HashMap<String, Long> Q = new HashMap<>();
    public final HashMap<String, Long> R = new HashMap<>();
    public final HashMap<String, Long> S = new HashMap<>();
    public long T;
    public long U;
    public long V;
    public long W;
    public long X;
    public String Y = "";
    public long Z;

    static {
        Covode.recordClassIndex(42374);
    }

    public final void a(String str) {
        l.d(str, "");
        this.Y = str;
    }

    public final void b(String str, long j2) {
        l.d(str, "");
        this.R.put(str, Long.valueOf(j2));
    }

    public final void c(String str, long j2) {
        l.d(str, "");
        this.S.put(str, Long.valueOf(j2));
    }

    public b(long j2, long j3) {
        super(j2, j3);
    }

    public final void a(String str, long j2) {
        l.d(str, "");
        Long l2 = this.Q.get(str);
        if (l2 == null) {
            l2 = 0L;
        }
        l.b(l2, "");
        this.Q.put(str, Long.valueOf(j2 + l2.longValue()));
    }
}

package com.ss.ttvideoengine;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ttvideoengine.s.j;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public final class be {

    /* renamed from: a  reason: collision with root package name */
    static final be f152335a = new be();

    /* renamed from: b  reason: collision with root package name */
    private HashMap<Long, aj> f152336b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private long f152337c;

    /* renamed from: d  reason: collision with root package name */
    private long f152338d;

    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        long f152339a;

        static {
            Covode.recordClassIndex(101515);
        }

        public final void run() {
            be beVar = be.f152335a;
            if (beVar != null) {
                beVar.b(this.f152339a);
            }
        }

        public a(long j2) {
            this.f152339a = j2;
        }
    }

    /* access modifiers changed from: package-private */
    public static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        long f152342a;

        static {
            Covode.recordClassIndex(101517);
        }

        public final void run() {
            be beVar = be.f152335a;
            if (beVar != null) {
                beVar.a(this.f152342a);
            }
        }

        public c(long j2) {
            this.f152342a = j2;
        }
    }

    static {
        Covode.recordClassIndex(101514);
    }

    private be() {
    }

    /* access modifiers changed from: package-private */
    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        long f152340a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<aj> f152341b;

        static {
            Covode.recordClassIndex(101516);
        }

        public final void run() {
            be beVar;
            aj ajVar = this.f152341b.get();
            if (ajVar != null && (beVar = be.f152335a) != null) {
                beVar.a(this.f152340a, ajVar);
            }
        }

        public b(aj ajVar, long j2) {
            this.f152341b = new WeakReference<>(ajVar);
            this.f152340a = j2;
        }
    }

    public final synchronized long b() {
        long j2;
        MethodCollector.i(12005);
        j2 = this.f152338d;
        this.f152338d = 0;
        MethodCollector.o(12005);
        return j2;
    }

    public final synchronized long a() {
        long j2;
        MethodCollector.i(12004);
        j2 = this.f152337c;
        this.f152337c = 0;
        try {
            for (aj ajVar : this.f152336b.values()) {
                long m2 = ajVar.m(81);
                if (m2 > 0) {
                    j2 += m2;
                }
            }
            j.b("VideoInfoCollecor", "get play waste data size: ".concat(String.valueOf(j2)));
            MethodCollector.o(12004);
        } catch (Exception unused) {
            MethodCollector.o(12004);
            return j2;
        }
        return j2;
    }

    public final synchronized void b(long j2) {
        MethodCollector.i(12151);
        if (j2 > 0) {
            this.f152338d += j2;
        }
        MethodCollector.o(12151);
    }

    public final synchronized void a(long j2) {
        MethodCollector.i(11844);
        try {
            if (this.f152336b.containsKey(Long.valueOf(j2))) {
                long m2 = this.f152336b.get(Long.valueOf(j2)).m(81);
                if (m2 > 0) {
                    this.f152337c += m2;
                }
                this.f152336b.remove(Long.valueOf(j2));
                j.b("VideoInfoCollecor", "delete engine: " + j2 + ", waste data: " + m2);
            }
            MethodCollector.o(11844);
        } catch (Exception unused) {
            MethodCollector.o(11844);
        }
    }

    public final synchronized void a(long j2, aj ajVar) {
        MethodCollector.i(11684);
        if (this.f152336b.containsKey(Long.valueOf(j2))) {
            MethodCollector.o(11684);
            return;
        }
        this.f152336b.put(Long.valueOf(j2), ajVar);
        j.b("VideoInfoCollecor", "new engine: ".concat(String.valueOf(j2)));
        MethodCollector.o(11684);
    }
}

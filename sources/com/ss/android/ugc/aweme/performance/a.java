package com.ss.android.ugc.aweme.performance;

import android.os.SystemClock;
import com.bytedance.apm.block.a.f;
import com.bytedance.apm.p.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.common.applog.t;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.services.performance.LagDataCallback;
import h.f.b.l;
import java.util.LinkedList;
import org.json.JSONObject;

public final class a {

    /* renamed from: h  reason: collision with root package name */
    public static final b f114757h = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    C2938a f114758a = new C2938a(-1, null);

    /* renamed from: b  reason: collision with root package name */
    C2938a f114759b;

    /* renamed from: c  reason: collision with root package name */
    LinkedList<C2938a> f114760c = new LinkedList<>();

    /* renamed from: d  reason: collision with root package name */
    boolean f114761d;

    /* renamed from: e  reason: collision with root package name */
    public LagDataCallback f114762e;

    /* renamed from: f  reason: collision with root package name */
    public int f114763f = 1000;

    /* renamed from: g  reason: collision with root package name */
    public final String f114764g;

    /* renamed from: i  reason: collision with root package name */
    private final Runnable f114765i = new d(this);

    /* renamed from: j  reason: collision with root package name */
    private boolean f114766j;

    /* renamed from: k  reason: collision with root package name */
    private long f114767k;

    static {
        Covode.recordClassIndex(73839);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(73841);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f114781a;

        static {
            Covode.recordClassIndex(73844);
        }

        d(a aVar) {
            this.f114781a = aVar;
        }

        public final void run() {
            this.f114781a.b();
        }
    }

    public final void a() {
        if (!this.f114761d) {
            this.f114761d = true;
            this.f114767k = SystemClock.uptimeMillis();
            this.f114760c.clear();
            b a2 = b.a();
            a2.f114783b.add(this);
            if (!a2.f114784c && !a2.f114784c) {
                f.r.a(a2);
                a2.f114784c = true;
            }
        }
    }

    public final void b() {
        if (this.f114761d) {
            this.f114761d = false;
            if (this.f114766j) {
                m.a().removeCallbacks(this.f114765i);
            }
            this.f114766j = false;
            b a2 = b.a();
            a2.f114783b.remove(this);
            if (a2.f114783b.isEmpty() && a2.f114784c) {
                f.r.b(a2);
                a2.f114784c = false;
            }
            LinkedList<C2938a> linkedList = this.f114760c;
            this.f114760c = new LinkedList<>();
            b.a.f25210a.a(new c(this, linkedList, SystemClock.uptimeMillis() - this.f114767k));
            this.f114767k = 0;
            this.f114758a.a(-1, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f114777a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LinkedList f114778b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f114779c;

        static {
            Covode.recordClassIndex(73842);
        }

        c(a aVar, LinkedList linkedList, long j2) {
            this.f114777a = aVar;
            this.f114778b = linkedList;
            this.f114779c = j2;
        }

        public final void run() {
            MethodCollector.i(8914);
            int i2 = 0;
            long j2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (C2938a aVar : this.f114778b) {
                j2 += aVar.f114771a - aVar.f114775e;
                if (aVar.f114774d) {
                    i2++;
                }
                if (aVar.f114773c) {
                    i3++;
                }
                if (aVar.f114772b) {
                    i4++;
                }
            }
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene", this.f114777a.f114764g);
            jSONObject.put("duration", this.f114779c);
            jSONObject.put("block_count", this.f114778b.size());
            jSONObject.put("block_duration", j2);
            jSONObject.put("block_count_on_frame", i2);
            jSONObject.put("delay_doFrame_count", i3);
            jSONObject.put("delay_input_count", i4);
            synchronized (this.f114777a) {
                try {
                    LagDataCallback lagDataCallback = this.f114777a.f114762e;
                    if (lagDataCallback != null) {
                        lagDataCallback.onDataAvailable(jSONObject);
                        return;
                    }
                    t.a().b(new Runnable() {
                        /* class com.ss.android.ugc.aweme.performance.a.c.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(73843);
                        }

                        public final void run() {
                            r.a("tool_performance_fps_info", jSONObject);
                        }
                    });
                    MethodCollector.o(8914);
                } finally {
                    MethodCollector.o(8914);
                }
            }
        }
    }

    public final void a(long j2) {
        if (!this.f114761d) {
            a();
            this.f114766j = true;
            m.a().postDelayed(this.f114765i, j2);
        }
    }

    public a(String str) {
        l.d(str, "");
        this.f114764g = str;
    }

    public final void a(LagDataCallback lagDataCallback) {
        MethodCollector.i(9120);
        synchronized (this) {
            try {
                this.f114762e = lagDataCallback;
            } finally {
                MethodCollector.o(9120);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.performance.a$a  reason: collision with other inner class name */
    public static final class C2938a {

        /* renamed from: a  reason: collision with root package name */
        public long f114771a = -1;

        /* renamed from: b  reason: collision with root package name */
        public boolean f114772b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f114773c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f114774d;

        /* renamed from: e  reason: collision with root package name */
        public long f114775e;

        /* renamed from: f  reason: collision with root package name */
        public String f114776f;

        static {
            Covode.recordClassIndex(73840);
        }

        public C2938a(long j2, String str) {
            this.f114775e = j2;
            this.f114776f = str;
        }

        public final void a(long j2, String str) {
            this.f114775e = j2;
            this.f114776f = str;
            this.f114771a = -1;
            this.f114772b = false;
            this.f114773c = false;
            this.f114774d = false;
        }
    }
}

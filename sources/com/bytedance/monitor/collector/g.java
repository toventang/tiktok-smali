package com.bytedance.monitor.collector;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.apm.p.b;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class g extends b {
    public static int p = 2;
    public static boolean q;

    /* renamed from: f  reason: collision with root package name */
    c f41463f;

    /* renamed from: g  reason: collision with root package name */
    public int f41464g;

    /* renamed from: h  reason: collision with root package name */
    public volatile int f41465h;

    /* renamed from: i  reason: collision with root package name */
    public f f41466i;

    /* renamed from: j  reason: collision with root package name */
    public b f41467j;

    /* renamed from: k  reason: collision with root package name */
    public String f41468k;

    /* renamed from: l  reason: collision with root package name */
    public String f41469l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f41470m;
    public final com.bytedance.apm.p.d n;
    public volatile boolean o;
    public Runnable r = new Runnable() {
        /* class com.bytedance.monitor.collector.g.AnonymousClass2 */

        /* renamed from: b  reason: collision with root package name */
        private long f41473b;

        /* renamed from: c  reason: collision with root package name */
        private long f41474c;

        /* renamed from: d  reason: collision with root package name */
        private int f41475d = -1;

        /* renamed from: e  reason: collision with root package name */
        private int f41476e;

        /* renamed from: f  reason: collision with root package name */
        private int f41477f;

        static {
            Covode.recordClassIndex(25405);
        }

        public final void run() {
            a aVar;
            long uptimeMillis = SystemClock.uptimeMillis();
            b bVar = g.this.f41467j;
            if (bVar.f41492c != null) {
                aVar = bVar.f41492c;
                bVar.f41492c = null;
            } else {
                aVar = new a((byte) 0);
            }
            if (this.f41475d == g.this.f41465h) {
                this.f41476e++;
            } else {
                this.f41476e = 0;
                this.f41477f = 0;
                this.f41474c = uptimeMillis;
            }
            this.f41475d = g.this.f41465h;
            int i2 = this.f41476e;
            if (i2 > 0 && i2 - this.f41477f >= g.p && this.f41473b != 0 && uptimeMillis - this.f41474c > 700 && g.this.o) {
                aVar.f41489f = Looper.getMainLooper().getThread().getStackTrace();
                this.f41477f = this.f41476e;
            }
            aVar.f41487d = g.this.o;
            aVar.f41486c = (uptimeMillis - this.f41473b) - 300;
            aVar.f41484a = uptimeMillis;
            long uptimeMillis2 = SystemClock.uptimeMillis();
            this.f41473b = uptimeMillis2;
            aVar.f41485b = uptimeMillis2 - uptimeMillis;
            aVar.f41488e = g.this.f41465h;
            g.this.n.a(g.this.r, 300);
            b bVar2 = g.this.f41467j;
            if (bVar2.f41493d.size() < bVar2.f41490a) {
                bVar2.f41493d.add(aVar);
                bVar2.f41491b = bVar2.f41493d.size();
                return;
            }
            bVar2.f41491b %= bVar2.f41490a;
            a aVar2 = bVar2.f41493d.set(bVar2.f41491b, aVar);
            aVar2.f41484a = -1;
            aVar2.f41485b = -1;
            aVar2.f41486c = -1;
            aVar2.f41488e = -1;
            aVar2.f41489f = null;
            bVar2.f41492c = aVar2;
            bVar2.f41491b++;
        }
    };
    private int s = 100;
    private int t = 200;
    private long u = -1;
    private long v = -1;
    private int w = -1;
    private long x = -1;
    private a y;
    private volatile boolean z;

    public interface c {
        static {
            Covode.recordClassIndex(25410);
        }

        void a(long[] jArr);
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        long f41494a;

        /* renamed from: b  reason: collision with root package name */
        long f41495b;

        /* renamed from: c  reason: collision with root package name */
        long f41496c;

        /* renamed from: d  reason: collision with root package name */
        long f41497d;

        /* renamed from: e  reason: collision with root package name */
        long f41498e;

        static {
            Covode.recordClassIndex(25411);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.monitor.collector.b
    public final void b(int i2) {
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f41484a;

        /* renamed from: b  reason: collision with root package name */
        long f41485b;

        /* renamed from: c  reason: collision with root package name */
        long f41486c;

        /* renamed from: d  reason: collision with root package name */
        boolean f41487d;

        /* renamed from: e  reason: collision with root package name */
        int f41488e;

        /* renamed from: f  reason: collision with root package name */
        StackTraceElement[] f41489f;

        static {
            Covode.recordClassIndex(25408);
        }

        private a() {
        }

        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("startTime", this.f41484a);
                jSONObject.put("cost", this.f41485b);
                jSONObject.put("delay", this.f41486c);
                jSONObject.put("isMessage", String.valueOf(this.f41487d));
                jSONObject.put("seqNum", this.f41488e);
                jSONObject.put("stack", o.a(this.f41489f));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return jSONObject;
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(25403);
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.monitor.collector.b
    public final Pair<String, ?> c() {
        return new Pair<>(this.f41450a, e());
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public long f41499a;

        /* renamed from: b  reason: collision with root package name */
        long f41500b;

        /* renamed from: c  reason: collision with root package name */
        long f41501c;

        /* renamed from: d  reason: collision with root package name */
        int f41502d;

        /* renamed from: e  reason: collision with root package name */
        int f41503e;

        /* renamed from: f  reason: collision with root package name */
        long f41504f;

        /* renamed from: g  reason: collision with root package name */
        long f41505g;

        /* renamed from: h  reason: collision with root package name */
        com.bytedance.monitor.collector.a.c f41506h;

        /* renamed from: i  reason: collision with root package name */
        String f41507i;

        /* renamed from: j  reason: collision with root package name */
        public String f41508j;

        /* renamed from: k  reason: collision with root package name */
        StackTraceElement[] f41509k;

        /* renamed from: l  reason: collision with root package name */
        StackTraceElement[] f41510l;

        /* renamed from: m  reason: collision with root package name */
        String f41511m;
        String n;
        d o;

        static {
            Covode.recordClassIndex(25412);
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            this.f41502d = -1;
            this.f41503e = -1;
            this.f41504f = -1;
            this.f41507i = null;
            this.f41509k = null;
            this.f41510l = null;
            this.f41511m = null;
            this.n = null;
            this.o = null;
            this.f41506h = null;
            this.f41508j = null;
        }

        public final String b() {
            StringBuilder sb = new StringBuilder();
            sb.append("msg:").append(o.a(this.f41507i)).append(",cpuDuration:").append(this.f41505g).append(",duration:").append(this.f41504f).append(",type:").append(this.f41502d).append(",messageCount:").append(this.f41503e).append(",lastDuration:").append(this.f41500b - this.f41501c).append(",start:").append(this.f41499a).append(",end:").append(this.f41500b);
            return sb.toString();
        }

        public final JSONObject a() {
            boolean z;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("msg", o.a(this.f41507i));
                jSONObject.put("cpuDuration", this.f41505g);
                jSONObject.put("duration", this.f41504f);
                jSONObject.put(StringSet.type, this.f41502d);
                jSONObject.put("messageCount", this.f41503e);
                jSONObject.put("lastDuration", this.f41500b - this.f41501c);
                jSONObject.put("start", this.f41499a);
                jSONObject.put("end", this.f41500b);
                StackTraceElement[] stackTraceElementArr = this.f41509k;
                if (stackTraceElementArr != null) {
                    jSONObject.put("block_stack", o.a(stackTraceElementArr));
                }
                jSONObject.put("block_uuid", this.n);
                StackTraceElement[] stackTraceElementArr2 = this.f41510l;
                if (stackTraceElementArr2 != null) {
                    jSONObject.put("sblock_stack", o.a(stackTraceElementArr2));
                }
                jSONObject.put("sblock_uuid", this.n);
                if (TextUtils.isEmpty(this.f41511m)) {
                    jSONObject.put("evil_msg", this.f41511m);
                }
                if (this.o != null) {
                    z = true;
                } else {
                    z = false;
                }
                jSONObject.put("belong_frame", z);
                d dVar = this.o;
                if (dVar != null) {
                    jSONObject.put("vsyncDelayTime", this.f41501c - (dVar.f41494a / 1000000));
                    jSONObject.put("doFrameTime", (this.o.f41495b / 1000000) - this.f41501c);
                    jSONObject.put("inputHandlingTime", (this.o.f41496c / 1000000) - (this.o.f41495b / 1000000));
                    jSONObject.put("animationsTime", (this.o.f41497d / 1000000) - (this.o.f41496c / 1000000));
                    jSONObject.put("performTraversalsTime", (this.o.f41498e / 1000000) - (this.o.f41497d / 1000000));
                    jSONObject.put("drawTime", this.f41500b - (this.o.f41498e / 1000000));
                }
                com.bytedance.monitor.collector.a.c cVar = this.f41506h;
                if (cVar != null) {
                    jSONObject.put("service_name", cVar.f41441a);
                    jSONObject.put("service_what", this.f41506h.f41442b);
                    jSONObject.put("service_time", this.f41506h.f41443c);
                    jSONObject.put("service_thread", this.f41506h.f41445e);
                    jSONObject.put("service_token", this.f41506h.f41444d);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return jSONObject;
        }

        public final void a(String str, StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2, String str2) {
            if (!TextUtils.isEmpty(str)) {
                this.n = str;
            }
            if (stackTraceElementArr != null) {
                this.f41509k = stackTraceElementArr;
            }
            if (stackTraceElementArr2 != null) {
                this.f41510l = stackTraceElementArr2;
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f41511m = str2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        int f41512a;

        /* renamed from: b  reason: collision with root package name */
        int f41513b;

        /* renamed from: c  reason: collision with root package name */
        e f41514c;

        /* renamed from: d  reason: collision with root package name */
        List<e> f41515d = new ArrayList();

        static {
            Covode.recordClassIndex(25413);
        }

        /* access modifiers changed from: package-private */
        public final e a() {
            int i2 = this.f41513b;
            if (i2 <= 0) {
                return null;
            }
            return this.f41515d.get(i2 - 1);
        }

        /* access modifiers changed from: package-private */
        public final List<e> b() {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            if (this.f41515d.size() == this.f41512a) {
                for (int i3 = this.f41513b; i3 < this.f41515d.size(); i3++) {
                    arrayList.add(this.f41515d.get(i3));
                }
                while (i2 < this.f41513b - 1) {
                    arrayList.add(this.f41515d.get(i2));
                    i2++;
                }
            } else {
                while (i2 < this.f41515d.size()) {
                    arrayList.add(this.f41515d.get(i2));
                    i2++;
                }
            }
            return arrayList;
        }

        f(int i2) {
            this.f41512a = i2;
        }

        /* access modifiers changed from: package-private */
        public final e a(int i2) {
            e eVar = this.f41514c;
            if (eVar != null) {
                eVar.f41502d = i2;
                e eVar2 = this.f41514c;
                this.f41514c = null;
                return eVar2;
            }
            e eVar3 = new e();
            eVar3.f41502d = i2;
            return eVar3;
        }

        /* access modifiers changed from: package-private */
        public final void a(e eVar) {
            int size = this.f41515d.size();
            int i2 = this.f41512a;
            if (size < i2) {
                this.f41515d.add(eVar);
                this.f41513b = this.f41515d.size();
            } else {
                int i3 = this.f41513b % i2;
                this.f41513b = i3;
                e eVar2 = this.f41515d.set(i3, eVar);
                eVar2.c();
                this.f41514c = eVar2;
                this.f41513b++;
            }
            if (com.bytedance.apm.h.a.f24995b) {
                final String b2 = eVar.b();
                b.a.f25210a.a(new Runnable() {
                    /* class com.bytedance.monitor.collector.g.f.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(25414);
                    }

                    public final void run() {
                    }
                });
            }
        }
    }

    public final e d() {
        f fVar = this.f41466i;
        if (fVar != null && this.f41470m && fVar.a().f41502d == 8) {
            return this.f41466i.a();
        }
        return null;
    }

    private JSONObject e() {
        JSONArray jSONArray;
        long uptimeMillis = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        JSONArray f2 = f();
        JSONObject a2 = a(uptimeMillis);
        JSONArray b2 = b(uptimeMillis);
        try {
            jSONObject.put("history_message", f2);
            jSONObject.put("current_message", a2);
            jSONObject.put("pending_messages", b2);
            b bVar = this.f41467j;
            if (bVar != null) {
                jSONArray = bVar.a();
            } else {
                jSONArray = null;
            }
            jSONObject.put("check_time_info", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private JSONArray f() {
        JSONArray jSONArray = new JSONArray();
        try {
            int i2 = 0;
            for (e eVar : this.f41466i.b()) {
                if (eVar != null) {
                    i2++;
                    jSONArray.put(eVar.a().put("id", i2));
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final int f41490a = 300;

        /* renamed from: b  reason: collision with root package name */
        int f41491b;

        /* renamed from: c  reason: collision with root package name */
        a f41492c;

        /* renamed from: d  reason: collision with root package name */
        final List<a> f41493d = new ArrayList(300);

        static {
            Covode.recordClassIndex(25409);
        }

        /* access modifiers changed from: package-private */
        public final JSONArray a() {
            JSONArray jSONArray = new JSONArray();
            int i2 = 0;
            if (this.f41493d.size() == this.f41490a) {
                for (int i3 = this.f41491b - 1; i3 < this.f41493d.size(); i3++) {
                    jSONArray.put(this.f41493d.get(i3).a());
                }
                while (i2 < this.f41491b - 1) {
                    jSONArray.put(this.f41493d.get(i2).a());
                    i2++;
                }
            } else {
                while (i2 < this.f41493d.size()) {
                    jSONArray.put(this.f41493d.get(i2).a());
                    i2++;
                }
            }
            return jSONArray;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.monitor.collector.b
    public final void a() {
        super.a();
        if (!this.z) {
            this.z = true;
            int i2 = this.f41452c;
            if (i2 == 0 || i2 == 1) {
                this.s = 100;
                this.t = 300;
            } else if (i2 == 2 || i2 == 3) {
                this.s = 300;
                this.t = 200;
            }
            this.f41466i = new f(this.s);
            AnonymousClass3 r0 = new a() {
                /* class com.bytedance.monitor.collector.g.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(25406);
                }

                @Override // com.bytedance.monitor.collector.a
                public final boolean a() {
                    return true;
                }

                @Override // com.bytedance.monitor.collector.a
                public final void a(String str) {
                    g.this.o = true;
                    g.this.f41469l = str;
                    super.a(str);
                    g.this.a(true, a.f41431b);
                }

                @Override // com.bytedance.monitor.collector.a
                public final void b(String str) {
                    super.b(str);
                    g.this.f41464g++;
                    g.this.a(false, a.f41431b);
                    g gVar = g.this;
                    gVar.f41468k = gVar.f41469l;
                    g.this.f41469l = "no message running";
                    g.this.o = false;
                }
            };
            this.y = r0;
            h.a(r0);
            i.a(i.a());
        }
    }

    private JSONObject a(long j2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("message", this.f41469l);
            jSONObject.put("currentMessageCost", j2 - this.v);
            jSONObject.put("currentMessageCpu", l.c(this.w) - this.x);
            jSONObject.put("messageCount", this.f41464g);
            jSONObject.put("start", this.v);
            jSONObject.put("end", j2);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private static JSONArray b(long j2) {
        MessageQueue a2 = i.a();
        JSONArray jSONArray = new JSONArray();
        if (a2 == null) {
            return jSONArray;
        }
        try {
            synchronized (a2) {
                Message a3 = i.a(a2);
                if (a3 == null) {
                    return jSONArray;
                }
                int i2 = 0;
                int i3 = 0;
                while (a3 != null && i2 < 100) {
                    i2++;
                    i3++;
                    JSONObject a4 = a(a3, j2);
                    try {
                        a4.put("id", i3);
                    } catch (JSONException unused) {
                    }
                    jSONArray.put(a4);
                    a3 = i.a(a3);
                }
                return jSONArray;
            }
        } catch (Throwable unused2) {
            return jSONArray;
        }
    }

    public g(int i2) {
        super(i2, "block_looper_info");
        com.bytedance.monitor.collector.a.d dVar = com.bytedance.monitor.collector.a.d.f41446a;
        try {
            Handler handler = (Handler) com.bytedance.monitor.a.a.a();
            Field a2 = com.bytedance.monitor.collector.a.a.a((Class<?>) Handler.class, "mCallback");
            dVar.f41449c = (Handler.Callback) a2.get(handler);
            a2.set(handler, dVar);
        } catch (Throwable unused) {
        }
        this.f41463f = new c() {
            /* class com.bytedance.monitor.collector.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(25404);
            }

            @Override // com.bytedance.monitor.collector.g.c
            public final void a(long[] jArr) {
                e a2;
                if (g.this.f41470m && g.this.f41466i != null && (a2 = g.this.f41466i.a()) != null && a2.f41502d == 8) {
                    d dVar = new d();
                    if (jArr != null) {
                        dVar.f41494a = jArr[1];
                        dVar.f41495b = jArr[5];
                        dVar.f41496c = jArr[6];
                        dVar.f41497d = jArr[7];
                        dVar.f41498e = jArr[8];
                    }
                    a2.o = dVar;
                }
            }
        };
        if (q) {
            com.bytedance.apm.p.d dVar2 = new com.bytedance.apm.p.d("looper_monitor");
            this.n = dVar2;
            dVar2.f25216a.start();
            this.f41467j = new b();
            dVar2.a(this.r, 300);
            return;
        }
        this.n = null;
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.monitor.collector.b
    public final Pair<String, ?> a(long j2, long j3) {
        return new Pair<>(this.f41450a, e());
    }

    private static JSONObject a(Message message, long j2) {
        JSONObject jSONObject = new JSONObject();
        if (message == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("when", message.getWhen() - j2);
            if (message.getCallback() != null) {
                jSONObject.put("callback", String.valueOf(message.getCallback()));
            }
            jSONObject.put("what", message.what);
            if (message.getTarget() != null) {
                jSONObject.put("target", String.valueOf(message.getTarget()));
            } else {
                jSONObject.put("barrier", message.arg1);
            }
            jSONObject.put("arg1", message.arg1);
            jSONObject.put("arg2", message.arg2);
            if (message.obj != null) {
                jSONObject.put("obj", message.obj);
            }
            jSONObject.put("start", message.getWhen());
            jSONObject.put("end", -1);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public final void a(final boolean z2, final long j2) {
        int i2 = this.f41465h + 1;
        this.f41465h = i2;
        this.f41465h = i2 & 65535;
        this.f41470m = false;
        if (this.u < 0) {
            this.u = j2;
        }
        if (this.v < 0) {
            this.v = j2;
        }
        if (this.w < 0) {
            this.w = Process.myTid();
            this.x = SystemClock.currentThreadTimeMillis();
        }
        com.bytedance.monitor.collector.a.c cVar = com.bytedance.monitor.collector.a.d.f41447b;
        com.bytedance.monitor.collector.a.d.f41447b = null;
        int i3 = this.t;
        if (j2 - this.u > ((long) i3) || cVar != null) {
            long j3 = this.v;
            if (j2 - j3 <= ((long) i3) && cVar == null) {
                a(9, j2, this.f41469l);
            } else if (z2) {
                if (this.f41464g == 0) {
                    a(1, j2, "no message running");
                } else {
                    a(9, j3, this.f41468k);
                    a(1, j2, "no message running", false, null);
                }
            } else if (this.f41464g == 0) {
                a(8, j2, this.f41469l, true, cVar);
            } else {
                a(9, j3, this.f41468k, false, null);
                a(8, j2, this.f41469l, true, cVar);
            }
        }
        this.v = j2;
        final String str = this.f41469l;
        if (this.f41453d) {
            final long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            k.a().p.a(new Runnable() {
                /* class com.bytedance.monitor.collector.g.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(25407);
                }

                public final void run() {
                    if (k.a().b() != null && z2) {
                        o.a(str);
                    }
                }
            });
        }
    }

    private void a(int i2, long j2, String str) {
        a(i2, j2, str, true, null);
    }

    private void a(int i2, long j2, String str, boolean z2, com.bytedance.monitor.collector.a.c cVar) {
        this.f41470m = true;
        e a2 = this.f41466i.a(i2);
        a2.f41504f = j2 - this.u;
        if (z2) {
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            a2.f41505g = currentThreadTimeMillis - this.x;
            this.x = currentThreadTimeMillis;
        } else {
            a2.f41505g = -1;
        }
        a2.f41503e = this.f41464g;
        a2.f41507i = str;
        a2.f41508j = this.f41468k;
        a2.f41499a = this.u;
        a2.f41500b = j2;
        a2.f41501c = this.v;
        if (cVar != null) {
            a2.f41506h = cVar;
        }
        this.f41466i.a(a2);
        this.f41464g = 0;
        this.u = j2;
    }
}

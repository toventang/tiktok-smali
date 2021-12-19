package com.ss.ttvideoengine.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ttvideoengine.s.j;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    final int f152350a;

    /* renamed from: b  reason: collision with root package name */
    final int f152351b;

    /* renamed from: c  reason: collision with root package name */
    final int f152352c;

    /* renamed from: d  reason: collision with root package name */
    final int f152353d;

    /* renamed from: e  reason: collision with root package name */
    final int f152354e;

    /* renamed from: f  reason: collision with root package name */
    final int f152355f;

    /* renamed from: g  reason: collision with root package name */
    final int f152356g;

    /* renamed from: h  reason: collision with root package name */
    final int f152357h;

    /* renamed from: i  reason: collision with root package name */
    public int f152358i;

    /* renamed from: j  reason: collision with root package name */
    public int f152359j;

    /* renamed from: k  reason: collision with root package name */
    public int f152360k;

    /* renamed from: l  reason: collision with root package name */
    public int f152361l;

    /* renamed from: m  reason: collision with root package name */
    public int f152362m;
    public int n;
    public int o;
    public int p;
    private int[] q;
    private long r;
    private long s;
    private long t;
    private a u;
    private long v;
    private int w;
    private int x;

    static {
        Covode.recordClassIndex(101523);
    }

    public static b a() {
        return a.f152363a;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static b f152363a = new b((byte) 0);

        static {
            Covode.recordClassIndex(101524);
        }
    }

    public final synchronized int[] d() {
        MethodCollector.i(12804);
        if (this.f152362m == 0) {
            MethodCollector.o(12804);
            return null;
        }
        int[] iArr = {this.f152358i, (int) this.v, this.f152361l, this.x};
        MethodCollector.o(12804);
        return iArr;
    }

    private b() {
        this.f152350a = 10;
        this.f152351b = 1;
        this.f152352c = 2;
        this.f152353d = 3;
        this.f152354e = 4;
        this.f152355f = 5;
        this.f152356g = 6;
        this.f152357h = 7;
        this.f152358i = 5;
        this.f152359j = 600;
        this.f152360k = 500;
        this.f152361l = Integer.MAX_VALUE;
        this.n = 120;
        this.o = Integer.MIN_VALUE;
        this.p = Integer.MIN_VALUE;
        this.x = Integer.MIN_VALUE;
        this.q = new int[10];
        int i2 = 0;
        do {
            this.q[i2] = 0;
            i2++;
        } while (i2 < 10);
    }

    public final synchronized void b() {
        int i2;
        a aVar;
        MethodCollector.i(12303);
        long j2 = this.v + 1;
        this.v = j2;
        Object[] objArr = new Object[4];
        objArr[0] = Long.valueOf(j2);
        objArr[1] = Integer.valueOf(this.q[1]);
        if (this.u != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = Integer.valueOf(this.x);
        j.b("P2PStragetyManager", com.a.a("playnum:%d speedflag:%d listener:%d mProbeSpeed:%d", objArr));
        if (this.v > ((long) this.f152358i) && this.q[1] == 1 && (aVar = this.u) != null && this.x == Integer.MIN_VALUE) {
            int a2 = aVar.a(0);
            this.x = a2;
            j.b("P2PStragetyManager", com.a.a("get probe speed:%d", new Object[]{Integer.valueOf(a2)}));
        }
        MethodCollector.o(12303);
    }

    public final synchronized void c() {
        int i2;
        MethodCollector.i(12803);
        int i3 = 0;
        while (true) {
            int[] iArr = this.q;
            if (((double) (this.f152362m & (1 << i3))) == Math.pow(2.0d, (double) i3)) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            iArr[i3] = i2;
            j.b("P2PStragetyManager", com.a.a("control flag init, index:%d value:%d", new Object[]{Integer.valueOf(i3), Integer.valueOf(this.q[i3])}));
            i3++;
            if (i3 >= 10) {
                MethodCollector.o(12803);
            }
        }
    }

    public final synchronized int e() {
        int i2;
        MethodCollector.i(12810);
        if (this.f152362m == 0) {
            j.b("P2PStragetyManager", com.a.a("control not open, enable p2p", new Object[0]));
            MethodCollector.o(12810);
            return 1;
        }
        if (this.q[0] == 1 && (i2 = this.f152358i) > 0) {
            long j2 = this.v;
            if (j2 < ((long) i2)) {
                j.b("P2PStragetyManager", com.a.a("curplaynum:%d minnum:%d, not allow p2p", new Object[]{Long.valueOf(j2), Integer.valueOf(this.f152358i)}));
                MethodCollector.o(12810);
                return 0;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        int[] iArr = this.q;
        if (iArr[2] == 1) {
            long j3 = this.r;
            if (j3 > 0 && currentTimeMillis - j3 < ((long) this.n)) {
                j.b("P2PStragetyManager", com.a.a("curT:%d lastLeaveT:%d,internal:%d not reach expiredT:%d, not allow p2p", new Object[]{Long.valueOf(currentTimeMillis), Long.valueOf(this.r), Long.valueOf(currentTimeMillis - this.r), Integer.valueOf(this.n)}));
                MethodCollector.o(12810);
                return 0;
            }
        }
        if (iArr[3] == 1) {
            long j4 = this.t;
            if (j4 > 0 && currentTimeMillis - j4 < ((long) this.n)) {
                j.b("P2PStragetyManager", com.a.a("curT:%d lastbufferT:%d,internal:%d not reach expiredT:%d, not allow p2p", new Object[]{Long.valueOf(currentTimeMillis), Long.valueOf(this.t), Long.valueOf(currentTimeMillis - this.t), Integer.valueOf(this.n)}));
                MethodCollector.o(12810);
                return 0;
            }
        }
        if (iArr[5] == 1) {
            long j5 = this.s;
            if (j5 > 0 && currentTimeMillis - j5 < ((long) this.n)) {
                j.b("P2PStragetyManager", com.a.a("curT:%d lastErrorT:%d,internal:%d not reach expiredT:%d, not allow p2p", new Object[]{Long.valueOf(currentTimeMillis), Long.valueOf(this.s), Long.valueOf(currentTimeMillis - this.s), Integer.valueOf(this.n)}));
                MethodCollector.o(12810);
                return 0;
            }
        }
        if (iArr[6] == 1) {
            int i3 = Integer.MIN_VALUE;
            a aVar = this.u;
            if (aVar != null) {
                i3 = aVar.a(1);
            }
            j.b("P2PStragetyManager", com.a.a("minnetworklevel:%d probelevel:%d", new Object[]{Integer.valueOf(this.p), Integer.valueOf(i3)}));
            if (i3 <= this.p) {
                j.b("P2PStragetyManager", com.a.a("network level not allow p2p", new Object[0]));
                MethodCollector.o(12810);
                return 0;
            }
        }
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.w = 0;
        if (this.q[1] == 1) {
            j.b("P2PStragetyManager", com.a.a("minspeed:%d probespeed:%d", new Object[]{Integer.valueOf(this.f152361l), Integer.valueOf(this.x)}));
            int i4 = this.f152361l;
            if (i4 > 0 && this.x < i4) {
                j.b("P2PStragetyManager", "not allow p2p");
                MethodCollector.o(12810);
                return 0;
            }
        }
        if (this.q[7] == 1) {
            j.b("P2PStragetyManager", com.a.a("enable min preload play internal,min value:%d", new Object[]{Integer.valueOf(this.o)}));
            a aVar2 = this.u;
            if (aVar2 != null) {
                int a2 = aVar2.a(2);
                j.b("P2PStragetyManager", com.a.a("enable min preload play internal,min value:%d curinternal:%d", new Object[]{Integer.valueOf(this.o), Integer.valueOf(a2)}));
                if (a2 >= 0 && a2 < this.o) {
                    j.b("P2PStragetyManager", com.a.a("cur internal not allow p2p", new Object[0]));
                    MethodCollector.o(12810);
                    return 0;
                }
            }
        }
        j.b("P2PStragetyManager", com.a.a("allow p2p", new Object[0]));
        MethodCollector.o(12810);
        return 1;
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public final synchronized void a(int i2) {
        MethodCollector.i(13011);
        if (this.f152362m == 0 || this.q[5] == 0) {
            MethodCollector.o(13011);
            return;
        }
        j.b("P2PStragetyManager", com.a.a("occur error code:%d, play after this not allow p2p!", new Object[]{Integer.valueOf(i2)}));
        this.s = System.currentTimeMillis();
        this.w = 1;
        MethodCollector.o(13011);
    }

    public final synchronized void a(long j2) {
        MethodCollector.i(12918);
        if (this.f152362m == 0 || this.q[2] == 0) {
            MethodCollector.o(12918);
            return;
        }
        j.b("P2PStragetyManager", com.a.a("leave wait time:%d ", new Object[]{Long.valueOf(j2)}));
        int i2 = this.f152359j;
        if (i2 > 0 && j2 > ((long) i2)) {
            j.b("P2PStragetyManager", com.a.a("leave wait time:%d allow max:%d, play after this not allow p2p!", new Object[]{Long.valueOf(j2), Integer.valueOf(this.f152359j)}));
            this.r = System.currentTimeMillis();
            this.w = 1;
        }
        MethodCollector.o(12918);
    }

    public final synchronized void b(long j2) {
        MethodCollector.i(13012);
        if (this.f152362m == 0 || this.q[3] == 0) {
            MethodCollector.o(13012);
            return;
        }
        j.b("P2PStragetyManager", com.a.a("set buffering time:%d ", new Object[]{Long.valueOf(j2)}));
        int i2 = this.f152360k;
        if (j2 > ((long) i2)) {
            j.b("P2PStragetyManager", com.a.a("reach max buffering time:%d not allow p2p", new Object[]{Integer.valueOf(i2)}));
            this.t = System.currentTimeMillis();
            this.w = 1;
        }
        MethodCollector.o(13012);
    }

    public final synchronized void a(a aVar) {
        MethodCollector.i(12442);
        if (this.u == null) {
            this.u = aVar;
        }
        int i2 = 1;
        Object[] objArr = new Object[1];
        if (this.u == null) {
            i2 = 0;
        }
        objArr[0] = Integer.valueOf(i2);
        j.b("P2PStragetyManager", com.a.a("set listener:%d", objArr));
        MethodCollector.o(12442);
    }

    public final synchronized void a(int i2, int i3) {
        MethodCollector.i(12681);
        j.b("P2PStragetyManager", com.a.a("received network change, from:%d to:%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}));
        if (this.q[4] == 1) {
            j.b("P2PStragetyManager", com.a.a("reset playnum:%d and speed:%d", new Object[]{Long.valueOf(this.v), Integer.valueOf(this.x)}));
            this.v = 0;
            this.x = Integer.MIN_VALUE;
        }
        MethodCollector.o(12681);
    }
}

package com.bytedance.frameworks.baselib.network.b;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ThreadPoolExecutor;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public ThreadPoolExecutor f28871a;

    /* renamed from: b  reason: collision with root package name */
    public ThreadPoolExecutor f28872b;

    /* renamed from: c  reason: collision with root package name */
    public int f28873c;

    /* renamed from: d  reason: collision with root package name */
    public int f28874d;

    /* renamed from: e  reason: collision with root package name */
    public int f28875e;

    /* renamed from: f  reason: collision with root package name */
    public int f28876f;

    /* renamed from: g  reason: collision with root package name */
    public long f28877g;

    /* renamed from: h  reason: collision with root package name */
    public long f28878h;

    /* renamed from: i  reason: collision with root package name */
    public long f28879i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f28880j;

    static {
        Covode.recordClassIndex(16967);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public ThreadPoolExecutor f28881a;

        /* renamed from: b  reason: collision with root package name */
        public ThreadPoolExecutor f28882b;

        /* renamed from: c  reason: collision with root package name */
        public int f28883c;

        /* renamed from: d  reason: collision with root package name */
        public int f28884d;

        /* renamed from: e  reason: collision with root package name */
        public int f28885e;

        /* renamed from: f  reason: collision with root package name */
        public int f28886f;

        /* renamed from: g  reason: collision with root package name */
        public long f28887g;

        /* renamed from: h  reason: collision with root package name */
        public long f28888h;

        /* renamed from: i  reason: collision with root package name */
        public long f28889i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f28890j = true;

        static {
            Covode.recordClassIndex(16968);
        }

        public final a a() {
            this.f28883c = 8;
            this.f28885e = 8;
            return this;
        }

        public final a b() {
            this.f28884d = 8;
            this.f28886f = 8;
            return this;
        }

        public final a c() {
            this.f28887g = 30;
            return this;
        }

        public final a d() {
            this.f28888h = 10;
            return this;
        }

        public final a e() {
            this.f28889i = 10;
            return this;
        }

        public final g f() {
            return new g(this, (byte) 0);
        }
    }

    private g(a aVar) {
        this.f28873c = 8;
        this.f28874d = 8;
        this.f28875e = 8;
        this.f28876f = 8;
        this.f28877g = 30;
        this.f28878h = 10;
        this.f28879i = 10;
        this.f28880j = true;
        if (aVar.f28882b != null) {
            this.f28871a = aVar.f28882b;
        }
        if (aVar.f28881a != null) {
            this.f28872b = aVar.f28881a;
        }
        if (aVar.f28883c > 0) {
            this.f28873c = aVar.f28883c;
        }
        if (aVar.f28884d > 0) {
            this.f28874d = aVar.f28884d;
        }
        if (aVar.f28885e > 0) {
            this.f28875e = aVar.f28885e;
        }
        if (aVar.f28886f > 0) {
            this.f28876f = aVar.f28886f;
        }
        if (aVar.f28887g > 0) {
            this.f28877g = aVar.f28887g;
        }
        if (aVar.f28888h > 0) {
            this.f28878h = aVar.f28888h;
        }
        if (aVar.f28889i > 0) {
            this.f28879i = aVar.f28889i;
        }
        this.f28880j = aVar.f28890j;
    }

    /* synthetic */ g(a aVar, byte b2) {
        this(aVar);
    }
}

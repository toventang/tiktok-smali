package com.ss.android.ugc.aweme.cw;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public o f79165a;

    /* renamed from: b  reason: collision with root package name */
    public String f79166b;

    /* renamed from: c  reason: collision with root package name */
    public int f79167c;

    /* renamed from: d  reason: collision with root package name */
    public BlockingQueue<Runnable> f79168d;

    /* renamed from: e  reason: collision with root package name */
    public RejectedExecutionHandler f79169e;

    /* renamed from: f  reason: collision with root package name */
    public long f79170f;

    /* renamed from: g  reason: collision with root package name */
    public ThreadFactory f79171g;

    static {
        Covode.recordClassIndex(49131);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public o f79172a;

        /* renamed from: b  reason: collision with root package name */
        public String f79173b;

        /* renamed from: c  reason: collision with root package name */
        public int f79174c;

        /* renamed from: d  reason: collision with root package name */
        public BlockingQueue<Runnable> f79175d;

        /* renamed from: e  reason: collision with root package name */
        public RejectedExecutionHandler f79176e;

        /* renamed from: f  reason: collision with root package name */
        public long f79177f;

        /* renamed from: g  reason: collision with root package name */
        public ThreadFactory f79178g;

        static {
            Covode.recordClassIndex(49132);
        }

        public final l a() {
            return new l(this, (byte) 0);
        }

        public final a a(int i2) {
            this.f79174c = i2;
            return this;
        }

        public final a a(String str) {
            this.f79173b = str;
            return this;
        }

        public final a a(ThreadFactory threadFactory) {
            this.f79178g = threadFactory;
            return this;
        }

        private a(o oVar) {
            this.f79174c = 1;
            this.f79175d = new LinkedBlockingQueue();
            this.f79176e = new ThreadPoolExecutor.AbortPolicy();
            this.f79177f = -1;
            this.f79172a = oVar;
        }

        /* synthetic */ a(o oVar, byte b2) {
            this(oVar);
        }
    }

    public static a a(o oVar) {
        return new a(oVar, (byte) 0);
    }

    private l(a aVar) {
        this.f79165a = aVar.f79172a;
        this.f79166b = aVar.f79173b;
        this.f79167c = aVar.f79174c;
        this.f79168d = aVar.f79175d;
        this.f79169e = aVar.f79176e;
        this.f79170f = aVar.f79177f;
        this.f79171g = aVar.f79178g;
    }

    /* synthetic */ l(a aVar, byte b2) {
        this(aVar);
    }
}

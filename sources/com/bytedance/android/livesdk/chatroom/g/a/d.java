package com.bytedance.android.livesdk.chatroom.g.a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Comparator;
import java.util.PriorityQueue;

public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static d f15507b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f15508c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f15509a;

    /* renamed from: d  reason: collision with root package name */
    private PriorityQueue<b> f15510d;

    /* renamed from: e  reason: collision with root package name */
    private Handler f15511e;

    /* renamed from: f  reason: collision with root package name */
    private b f15512f;

    /* renamed from: g  reason: collision with root package name */
    private Runnable f15513g;

    static {
        Covode.recordClassIndex(8571);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(8572);
        }

        private a() {
        }

        public static d a() {
            if (d.f15507b == null) {
                d.f15507b = new d((byte) 0);
            }
            return d.f15507b;
        }

        public static d b() {
            d a2 = a();
            if (a2 == null) {
                l.b();
            }
            return a2;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f15515a;

        static {
            Covode.recordClassIndex(8574);
        }

        c(b bVar) {
            this.f15515a = bVar;
        }

        public final void run() {
            this.f15515a.a();
        }
    }

    public final void a() {
        this.f15509a = false;
        this.f15513g = null;
        this.f15512f = null;
        c();
    }

    private d() {
        this.f15510d = new PriorityQueue<>(20, b.f15514a);
        this.f15511e = new Handler(Looper.getMainLooper());
    }

    public final void b() {
        this.f15510d.clear();
        this.f15511e.removeCallbacksAndMessages(null);
        this.f15513g = null;
        this.f15512f = null;
    }

    private final void c() {
        if (!this.f15509a && !this.f15510d.isEmpty()) {
            b poll = this.f15510d.poll();
            this.f15512f = poll;
            this.f15509a = true;
            l.b(poll, "");
            b(poll);
        }
    }

    public /* synthetic */ d(byte b2) {
        this();
    }

    private final void b(b bVar) {
        c cVar = new c(bVar);
        this.f15511e.postDelayed(cVar, 1000);
        this.f15513g = cVar;
    }

    public final void a(b bVar) {
        l.d(bVar, "");
        if (!this.f15510d.contains(bVar) && !l.a(this.f15512f, bVar)) {
            this.f15510d.offer(bVar);
            c();
        }
    }

    static final class b<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public static final b f15514a = new b();

        static {
            Covode.recordClassIndex(8573);
        }

        b() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return l.a(((b) obj).b(), ((b) obj2).b());
        }
    }
}

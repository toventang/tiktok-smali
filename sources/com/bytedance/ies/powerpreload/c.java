package com.bytedance.ies.powerpreload;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.d.a;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static c f34504a;

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentLinkedQueue<b> f34505b = new ConcurrentLinkedQueue<>();

    /* renamed from: c  reason: collision with root package name */
    public static final a f34506c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private final h f34507d;

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.ies.powerpreload.a.b f34508e;

    /* renamed from: f  reason: collision with root package name */
    private final b f34509f;

    public interface b {
        static {
            Covode.recordClassIndex(20641);
        }

        void a(com.bytedance.ies.powerpreload.d.a aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20638);
        }

        private a() {
        }

        public static boolean a() {
            if (c.f34504a != null) {
                return true;
            }
            return false;
        }

        public static final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static final b f34513a = new b();

            static {
                Covode.recordClassIndex(20640);
            }

            b() {
            }

            public final void run() {
                Iterator<T> it = c.f34505b.iterator();
                while (it.hasNext()) {
                    it.next().a(a.C0777a.a());
                }
                c.f34505b.clear();
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* renamed from: com.bytedance.ies.powerpreload.c$a$a  reason: collision with other inner class name */
        public static final class C0773a extends m implements h.f.a.b<com.bytedance.ies.powerpreload.a.b, c> {
            final /* synthetic */ com.bytedance.ies.powerpreload.a.b $config;

            static {
                Covode.recordClassIndex(20639);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0773a(com.bytedance.ies.powerpreload.a.b bVar) {
                super(1);
                this.$config = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ c invoke(com.bytedance.ies.powerpreload.a.b bVar) {
                l.c(bVar, "");
                return new c(this.$config, new b(this.$config), (byte) 0);
            }
        }
    }

    /* renamed from: com.bytedance.ies.powerpreload.c$c  reason: collision with other inner class name */
    static final class C0776c extends m implements h.f.a.a<com.bytedance.ies.powerpreload.d.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0776c f34515a = new C0776c();

        static {
            Covode.recordClassIndex(20642);
        }

        C0776c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.powerpreload.d.a invoke() {
            return a.C0777a.a();
        }
    }

    static {
        Covode.recordClassIndex(20637);
    }

    public static final void a(b bVar) {
        if (a.a()) {
            bVar.a(a.C0777a.a());
            return;
        }
        ConcurrentLinkedQueue<b> concurrentLinkedQueue = f34505b;
        if (concurrentLinkedQueue.size() >= 5) {
            concurrentLinkedQueue.poll();
            concurrentLinkedQueue.offer(bVar);
            return;
        }
        concurrentLinkedQueue.offer(bVar);
    }

    private c(com.bytedance.ies.powerpreload.a.b bVar, b bVar2) {
        this.f34508e = bVar;
        this.f34509f = bVar2;
        this.f34507d = i.a((h.f.a.a) C0776c.f34515a);
    }

    public /* synthetic */ c(com.bytedance.ies.powerpreload.a.b bVar, b bVar2, byte b2) {
        this(bVar, bVar2);
    }
}

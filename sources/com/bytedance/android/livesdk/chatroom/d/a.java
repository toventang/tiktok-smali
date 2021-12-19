package com.bytedance.android.livesdk.chatroom.d;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.android.livesdkapi.depend.c.a;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class a {

    /* renamed from: h  reason: collision with root package name */
    private static a f15183h;

    /* renamed from: a  reason: collision with root package name */
    public final List<com.bytedance.android.livesdk.callback.b> f15184a = new CopyOnWriteArrayList();

    /* renamed from: b  reason: collision with root package name */
    public boolean f15185b = false;

    /* renamed from: c  reason: collision with root package name */
    public long f15186c = -1;

    /* renamed from: d  reason: collision with root package name */
    public long f15187d;

    /* renamed from: e  reason: collision with root package name */
    public EnterRoomConfig f15188e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, Object> f15189f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final com.bytedance.android.livesdkapi.depend.c.a f15190g;

    /* renamed from: i  reason: collision with root package name */
    private final a.AbstractC0502a f15191i;

    static {
        Covode.recordClassIndex(8413);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static int f15196a = 100;

        static {
            Covode.recordClassIndex(8416);
        }
    }

    public final long b() {
        long j2 = this.f15187d;
        long j3 = 0;
        if (this.f15186c > 0) {
            j3 = SystemClock.elapsedRealtime() - this.f15186c;
        }
        return j2 + j3;
    }

    public final void c() {
        this.f15190g.removeMessages(b.f15196a);
        for (com.bytedance.android.livesdk.callback.b bVar : this.f15184a) {
            a(bVar);
        }
    }

    public a() {
        AnonymousClass1 r2 = new a.AbstractC0502a() {
            /* class com.bytedance.android.livesdk.chatroom.d.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(8414);
            }

            @Override // com.bytedance.android.livesdkapi.depend.c.a.AbstractC0502a
            public final void handleMsg(Message message) {
                if (message.obj instanceof C0325a) {
                    C0325a aVar = (C0325a) message.obj;
                    if (aVar.f15195c == b.f15196a) {
                        a.this.f15184a.remove(aVar.f15193a);
                    }
                    if (aVar.f15193a != null) {
                        aVar.f15193a.a(aVar.f15194b);
                    }
                }
            }
        };
        this.f15191i = r2;
        this.f15190g = new com.bytedance.android.livesdkapi.depend.c.a(Looper.getMainLooper(), r2);
    }

    public static a a() {
        MethodCollector.i(2899);
        if (f15183h == null) {
            synchronized (a.class) {
                try {
                    if (f15183h == null) {
                        f15183h = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2899);
                    throw th;
                }
            }
        }
        a aVar = f15183h;
        MethodCollector.o(2899);
        return aVar;
    }

    public final void a(com.bytedance.android.livesdk.callback.b bVar) {
        if (bVar != null) {
            Message obtain = Message.obtain();
            obtain.what = b.f15196a;
            obtain.obj = new C0325a(b.f15196a, bVar, this.f15189f);
            this.f15190g.sendMessageDelayed(obtain, bVar.f14867a - b());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.d.a$a  reason: collision with other inner class name */
    public static class C0325a {

        /* renamed from: a  reason: collision with root package name */
        public com.bytedance.android.livesdk.callback.b f15193a;

        /* renamed from: b  reason: collision with root package name */
        public Map<String, Object> f15194b;

        /* renamed from: c  reason: collision with root package name */
        public int f15195c;

        static {
            Covode.recordClassIndex(8415);
        }

        public C0325a(int i2, com.bytedance.android.livesdk.callback.b bVar, Map<String, Object> map) {
            this.f15195c = i2;
            this.f15193a = bVar;
            this.f15194b = map;
        }
    }
}

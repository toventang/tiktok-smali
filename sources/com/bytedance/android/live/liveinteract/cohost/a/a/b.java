package com.bytedance.android.live.liveinteract.cohost.a.a;

import com.bytedance.android.live.liveinteract.api.m;
import com.bytedance.android.live.liveinteract.cohost.a.a.d;
import com.bytedance.android.livesdk.chatroom.interact.model.i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.b$b  reason: collision with other inner class name */
    public static abstract class AbstractC0158b extends d.b<a> {
        static {
            Covode.recordClassIndex(5221);
        }

        public abstract void a(int i2);

        public abstract void a(i.a aVar);

        public abstract void a(Throwable th);

        public abstract void a(boolean z);

        public abstract void b();

        public abstract void b(Throwable th);

        public abstract void g_();
    }

    static {
        Covode.recordClassIndex(5219);
    }

    public static class c extends d.c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f10028a;

        static {
            Covode.recordClassIndex(5222);
        }

        public static c a(boolean z) {
            c cVar = new c();
            cVar.f10028a = z;
            return cVar;
        }
    }

    public static abstract class a extends d.a<AbstractC0158b> {

        /* renamed from: a  reason: collision with root package name */
        public boolean f10022a = true;

        /* renamed from: b  reason: collision with root package name */
        public int f10023b;

        /* renamed from: c  reason: collision with root package name */
        public int f10024c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f10025d = -1;

        /* renamed from: e  reason: collision with root package name */
        public j.a.a.d f10026e = new j.a.a.d();

        /* renamed from: f  reason: collision with root package name */
        public int f10027f = 0;

        static {
            Covode.recordClassIndex(5220);
        }

        public abstract void a();

        public abstract void a(Room room, m mVar);

        public abstract void b();

        public abstract void c();

        public abstract void d();

        public abstract void e();

        public a(AbstractC0158b bVar) {
            super(bVar);
        }
    }
}

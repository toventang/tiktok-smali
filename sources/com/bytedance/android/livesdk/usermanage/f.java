package com.bytedance.android.livesdk.usermanage;

import com.bytedance.android.live.broadcast.api.c.b;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f22010a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(12966);
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f22013a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f22014b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f22015c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f22016d;

        static {
            Covode.recordClassIndex(12969);
        }

        c(WeakReference weakReference, boolean z, long j2, long j3) {
            this.f22013a = weakReference;
            this.f22014b = z;
            this.f22015c = j2;
            this.f22016d = j3;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.s.b bVar = (com.bytedance.android.live.s.b) this.f22013a.get();
            if (bVar != null) {
                bVar.b(this.f22014b);
            }
            f.a(this.f22014b, this.f22015c, this.f22016d);
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f22021a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f22022b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f22023c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f22024d;

        static {
            Covode.recordClassIndex(12971);
        }

        e(WeakReference weakReference, boolean z, long j2, long j3) {
            this.f22021a = weakReference;
            this.f22022b = z;
            this.f22023c = j2;
            this.f22024d = j3;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.s.b bVar = (com.bytedance.android.live.s.b) this.f22021a.get();
            if (bVar != null) {
                bVar.b(this.f22022b);
            }
            f.a(this.f22022b, this.f22023c, this.f22024d);
        }
    }

    static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f22011a;

        static {
            Covode.recordClassIndex(12967);
        }

        a(WeakReference weakReference) {
            this.f22011a = weakReference;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            int i2;
            com.bytedance.android.live.s.a.c cVar = (com.bytedance.android.live.s.a.c) obj;
            com.bytedance.android.live.s.b bVar = (com.bytedance.android.live.s.b) this.f22011a.get();
            if (bVar != null) {
                bVar.d();
            }
            com.bytedance.android.live.s.b bVar2 = (com.bytedance.android.live.s.b) this.f22011a.get();
            if (bVar2 != null) {
                bVar2.b(cVar, null);
            }
            if (cVar != null) {
                com.bytedance.android.livesdk.ab.a b2 = c.a.b("ttlive_fetch_ban");
                if (cVar.f12145b != null) {
                    i2 = cVar.f12145b.size();
                } else {
                    i2 = 0;
                }
                b2.a("list_size", Integer.valueOf(i2)).a();
            }
        }
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f22012a;

        static {
            Covode.recordClassIndex(12968);
        }

        b(WeakReference weakReference) {
            this.f22012a = weakReference;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th;
            Throwable th2 = (Throwable) obj;
            com.bytedance.android.live.s.b bVar = (com.bytedance.android.live.s.b) this.f22012a.get();
            if (bVar != null) {
                bVar.d();
            }
            com.bytedance.android.live.s.b bVar2 = (com.bytedance.android.live.s.b) this.f22012a.get();
            if (bVar2 != null) {
                if (!(th2 instanceof Exception)) {
                    th = null;
                } else {
                    th = th2;
                }
                bVar2.b(null, (Exception) th);
            }
            l.b(th2, "");
            b.a.a("ttlive_fetch_ban", th2).a();
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f22017a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f22018b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f22019c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f22020d;

        static {
            Covode.recordClassIndex(12970);
        }

        d(WeakReference weakReference, boolean z, long j2, long j3) {
            this.f22017a = weakReference;
            this.f22018b = z;
            this.f22019c = j2;
            this.f22020d = j3;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th;
            Throwable th2 = (Throwable) obj;
            com.bytedance.android.live.s.b bVar = (com.bytedance.android.live.s.b) this.f22017a.get();
            if (bVar != null) {
                boolean z = this.f22018b;
                if (!(th2 instanceof Exception)) {
                    th = null;
                } else {
                    th = th2;
                }
                bVar.a(z, (Exception) th);
            }
            boolean z2 = this.f22018b;
            long j2 = this.f22019c;
            long j3 = this.f22020d;
            l.b(th2, "");
            f.a(z2, j2, j3, th2);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.usermanage.f$f  reason: collision with other inner class name */
    static final class C0483f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f22025a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f22026b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f22027c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f22028d;

        static {
            Covode.recordClassIndex(12972);
        }

        C0483f(WeakReference weakReference, boolean z, long j2, long j3) {
            this.f22025a = weakReference;
            this.f22026b = z;
            this.f22027c = j2;
            this.f22028d = j3;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th;
            Throwable th2 = (Throwable) obj;
            com.bytedance.android.live.s.b bVar = (com.bytedance.android.live.s.b) this.f22025a.get();
            if (bVar != null) {
                boolean z = this.f22026b;
                if (!(th2 instanceof Exception)) {
                    th = null;
                } else {
                    th = th2;
                }
                bVar.a(z, (Exception) th);
            }
            boolean z2 = this.f22026b;
            long j2 = this.f22027c;
            long j3 = this.f22028d;
            l.b(th2, "");
            f.a(z2, j2, j3, th2);
        }
    }

    public static void a(boolean z, long j2, long j3) {
        com.bytedance.android.livesdk.ab.a b2;
        if (z) {
            b2 = c.a.b("ttlive_add_ban");
        } else {
            b2 = c.a.b("ttlive_delete_ban");
        }
        b2.a("room_id", Long.valueOf(j2)).a("user_id", Long.valueOf(j3)).a();
    }

    public static void a(boolean z, long j2, long j3, Throwable th) {
        com.bytedance.android.livesdk.ab.a a2;
        if (z) {
            a2 = b.a.a("ttlive_add_ban", th);
        } else {
            a2 = b.a.a("ttlive_delete_ban", th);
        }
        a2.a("room_id", Long.valueOf(j2)).a("user_id", Long.valueOf(j3)).a();
    }
}

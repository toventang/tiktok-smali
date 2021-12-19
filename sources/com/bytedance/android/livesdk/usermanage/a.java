package com.bytedance.android.livesdk.usermanage;

import com.bytedance.android.live.broadcast.api.c.b;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21993a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(12955);
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f21996a;

        static {
            Covode.recordClassIndex(12957);
        }

        b(WeakReference weakReference) {
            this.f21996a = weakReference;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th;
            Throwable th2 = (Throwable) obj;
            com.bytedance.android.live.s.a aVar = (com.bytedance.android.live.s.a) this.f21996a.get();
            if (aVar != null) {
                if (!(th2 instanceof Exception)) {
                    th = null;
                } else {
                    th = th2;
                }
                aVar.a((com.bytedance.android.live.s.a.b) null, (Exception) th);
            }
            if (th2 == null) {
                l.b();
            }
            b.a.a("ttlive_fetch_admin", th2).a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f22005a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f22006b;

        static {
            Covode.recordClassIndex(12959);
        }

        d(WeakReference weakReference, boolean z) {
            this.f22005a = weakReference;
            this.f22006b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            com.bytedance.android.livesdk.utils.f.a(y.e(), th, (int) R.string.gss);
            com.bytedance.android.live.s.a aVar = (com.bytedance.android.live.s.a) this.f22005a.get();
            if (aVar != null) {
                aVar.b((Exception) th);
            }
            if (this.f22006b) {
                if (th == null) {
                    l.b();
                }
                b.a.a("ttlive_add_admin", th).a();
                return;
            }
            if (th == null) {
                l.b();
            }
            b.a.a("ttlive_delete_admin", th).a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.usermanage.a$a  reason: collision with other inner class name */
    static final class C0482a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f21995a;

        static {
            Covode.recordClassIndex(12956);
        }

        C0482a(WeakReference weakReference) {
            this.f21995a = weakReference;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0085  */
        @Override // f.a.d.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r6) {
            /*
            // Method dump skipped, instructions count: 138
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.usermanage.a.C0482a.accept(java.lang.Object):void");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f21999a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f22000b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.live.s.a.a f22001c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f22002d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f22003e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f22004f;

        static {
            Covode.recordClassIndex(12958);
        }

        c(WeakReference weakReference, boolean z, com.bytedance.android.live.s.a.a aVar, long j2, long j3, String str) {
            this.f21999a = weakReference;
            this.f22000b = z;
            this.f22001c = aVar;
            this.f22002d = j2;
            this.f22003e = j3;
            this.f22004f = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            String str2;
            String str3;
            com.bytedance.android.livesdk.ab.a b2;
            com.bytedance.android.live.s.a aVar = (com.bytedance.android.live.s.a) this.f21999a.get();
            if (aVar != null) {
                aVar.a(this.f22000b, this.f22001c.f12593a);
            }
            boolean z = this.f22000b;
            long j2 = this.f22001c.f12593a;
            long j3 = this.f22002d;
            long j4 = this.f22003e;
            String str4 = this.f22004f;
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_admin_click").a("anchor_id", j3).a("room_id", j4).a("user_id", j2);
            if (z) {
                str = "set";
            } else {
                str = "cancel";
            }
            com.bytedance.android.livesdk.ab.b a3 = a2.a("action_type", str);
            if (j2 == j3) {
                str2 = "anchor";
            } else {
                str2 = "admin";
            }
            com.bytedance.android.livesdk.ab.b a4 = a3.a("admin_type", str2).a("action_page", "moderator_panel").a("timestamp", System.currentTimeMillis()).a("action_page", str4);
            if (p.c()) {
                str3 = "live_take_page";
            } else {
                str3 = "live_take_detail";
            }
            a4.d(str3).b();
            if (z) {
                b2 = c.a.b("ttlive_add_admin");
            } else {
                b2 = c.a.b("ttlive_delete_admin");
            }
            b2.a("user_id", Long.valueOf(j2)).a("anchor_id", Long.valueOf(j3)).a();
        }
    }

    public static void a(com.bytedance.android.live.s.a aVar, boolean z, com.bytedance.android.live.s.a.a aVar2, long j2, long j3, String str) {
        int i2;
        l.d(aVar, "");
        if (aVar2 != null) {
            WeakReference weakReference = new WeakReference(aVar);
            AdminApi adminApi = (AdminApi) e.a().a(AdminApi.class);
            if (z) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            adminApi.updateAdmin(i2, aVar2.f12593a, j2, j3).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new c(weakReference, z, aVar2, j2, j3, str), new d(weakReference, z));
        }
    }
}

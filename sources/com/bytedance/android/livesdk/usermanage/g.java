package com.bytedance.android.livesdk.usermanage;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.c.b;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.live.broadcast.model.j;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.j.ci;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMuteCommentsDefaultSetting;
import com.bytedance.android.livesdk.model.ba;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    static final Map<Long, j> f22029a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final g f22030b = new g();

    private g() {
    }

    static final class f implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f22040a;

        static {
            Covode.recordClassIndex(12979);
        }

        f(j jVar) {
            this.f22040a = jVar;
        }

        @Override // f.a.d.a
        public final void a() {
            com.bytedance.android.livesdk.ap.c.a(g.a(), Long.valueOf(this.f22040a.f7925a));
        }
    }

    static {
        Covode.recordClassIndex(12973);
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f22033a;

        static {
            Covode.recordClassIndex(12976);
        }

        c(long j2) {
            this.f22033a = j2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.bytedance.android.livesdk.ap.b<Long> a2 = g.a();
            if (a2.a() == null) {
                com.bytedance.android.livesdk.ap.c.a(a2, Long.valueOf(LiveMuteCommentsDefaultSetting.INSTANCE.getValue()));
            }
            Long a3 = a2.a();
            l.b(a3, "");
            j jVar = new j(a3.longValue());
            g.f22029a.put(Long.valueOf(this.f22033a), jVar);
            DataChannelGlobal.f34575d.c(ci.class, jVar);
            return jVar;
        }
    }

    public static com.bytedance.android.livesdk.ap.b<Long> a() {
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        l.b(b2, "");
        return new com.bytedance.android.livesdk.ap.b<>("tmp_mute_duration_" + MD5Utils.getMD5String(String.valueOf(b2.c())), Long.TYPE);
    }

    static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f22031a;

        static {
            Covode.recordClassIndex(12974);
        }

        a(WeakReference weakReference) {
            this.f22031a = weakReference;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            int i2;
            com.bytedance.android.live.s.a.c cVar = (com.bytedance.android.live.s.a.c) obj;
            com.bytedance.android.live.s.c cVar2 = (com.bytedance.android.live.s.c) this.f22031a.get();
            if (cVar2 != null) {
                cVar2.k_();
            }
            com.bytedance.android.live.s.c cVar3 = (com.bytedance.android.live.s.c) this.f22031a.get();
            if (cVar3 != null) {
                cVar3.a(cVar, null);
            }
            if (cVar != null) {
                com.bytedance.android.livesdk.ab.a b2 = c.a.b("ttlive_fetch_mute");
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
        final /* synthetic */ WeakReference f22032a;

        static {
            Covode.recordClassIndex(12975);
        }

        b(WeakReference weakReference) {
            this.f22032a = weakReference;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th;
            Throwable th2 = (Throwable) obj;
            com.bytedance.android.live.s.c cVar = (com.bytedance.android.live.s.c) this.f22032a.get();
            if (cVar != null) {
                cVar.k_();
            }
            com.bytedance.android.live.s.c cVar2 = (com.bytedance.android.live.s.c) this.f22032a.get();
            if (cVar2 != null) {
                if (!(th2 instanceof Exception)) {
                    th = null;
                } else {
                    th = th2;
                }
                cVar2.a(null, (Exception) th);
            }
            l.b(th2, "");
            b.a.a("ttlive_fetch_mute", th2).a();
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ User f22034a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WeakReference f22035b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f22036c;

        static {
            Covode.recordClassIndex(12977);
        }

        d(User user, WeakReference weakReference, long j2) {
            this.f22034a = user;
            this.f22035b = weakReference;
            this.f22036c = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            g.a(this.f22034a, true);
            com.bytedance.android.live.s.g gVar = (com.bytedance.android.live.s.g) this.f22035b.get();
            if (gVar != null) {
                gVar.a(true);
            }
            long j2 = this.f22036c;
            long id = this.f22034a.getId();
            String secUid = this.f22034a.getSecUid();
            l.b(secUid, "");
            g.a(true, j2, id, secUid);
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f22037a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f22038b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ User f22039c;

        static {
            Covode.recordClassIndex(12978);
        }

        e(WeakReference weakReference, long j2, User user) {
            this.f22037a = weakReference;
            this.f22038b = j2;
            this.f22039c = user;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th;
            Throwable th2 = (Throwable) obj;
            com.bytedance.android.livesdk.utils.f.a(y.e(), th2, (int) R.string.gss);
            com.bytedance.android.live.s.g gVar = (com.bytedance.android.live.s.g) this.f22037a.get();
            if (gVar != null) {
                if (!(th2 instanceof Exception)) {
                    th = null;
                } else {
                    th = th2;
                }
                gVar.a((Exception) th);
            }
            long j2 = this.f22038b;
            long id = this.f22039c.getId();
            String secUid = this.f22039c.getSecUid();
            l.b(secUid, "");
            g.a(true, th2, j2, id, secUid);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.usermanage.g$g  reason: collision with other inner class name */
    static final class C0484g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ User f22041a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WeakReference f22042b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f22043c;

        static {
            Covode.recordClassIndex(12980);
        }

        C0484g(User user, WeakReference weakReference, long j2) {
            this.f22041a = user;
            this.f22042b = weakReference;
            this.f22043c = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            g.a(this.f22041a, false);
            com.bytedance.android.live.s.g gVar = (com.bytedance.android.live.s.g) this.f22042b.get();
            if (gVar != null) {
                gVar.a(false);
            }
            long j2 = this.f22043c;
            long id = this.f22041a.getId();
            String secUid = this.f22041a.getSecUid();
            l.b(secUid, "");
            g.a(false, j2, id, secUid);
        }
    }

    static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f22044a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f22045b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ User f22046c;

        static {
            Covode.recordClassIndex(12981);
        }

        h(WeakReference weakReference, long j2, User user) {
            this.f22044a = weakReference;
            this.f22045b = j2;
            this.f22046c = user;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th;
            Throwable th2 = (Throwable) obj;
            com.bytedance.android.livesdk.utils.f.a(y.e(), th2, (int) R.string.gss);
            com.bytedance.android.live.s.g gVar = (com.bytedance.android.live.s.g) this.f22044a.get();
            if (gVar != null) {
                if (!(th2 instanceof Exception)) {
                    th = null;
                } else {
                    th = th2;
                }
                gVar.a((Exception) th);
            }
            long j2 = this.f22045b;
            long id = this.f22046c.getId();
            String secUid = this.f22046c.getSecUid();
            l.b(secUid, "");
            g.a(false, th2, j2, id, secUid);
        }
    }

    public static void a(User user, boolean z) {
        if (user.getUserAttr() == null) {
            user.setUserAttr(new ba());
        }
        ba userAttr = user.getUserAttr();
        l.b(userAttr, "");
        userAttr.f19029a = z;
    }

    public static void a(boolean z, long j2, long j3, String str) {
        com.bytedance.android.livesdk.ab.a b2;
        if (z) {
            b2 = c.a.b("ttlive_add_mute");
        } else {
            b2 = c.a.b("ttlive_delete_mute");
        }
        b2.a("user_id", Long.valueOf(j3)).a("sec_user_id", str).a("room_id", Long.valueOf(j2)).a();
    }

    public static void a(boolean z, Throwable th, long j2, long j3, String str) {
        com.bytedance.android.livesdk.ab.a a2;
        if (z) {
            if (th == null) {
                l.b();
            }
            a2 = b.a.a("ttlive_add_mute", th);
        } else {
            if (th == null) {
                l.b();
            }
            a2 = b.a.a("ttlive_delete_mute", th);
        }
        a2.a("user_id", Long.valueOf(j3)).a("sec_user_id", str).a("room_id", Long.valueOf(j2)).a();
    }
}

package com.bytedance.android.live.effect;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.c;
import com.bytedance.android.live.effect.api.d;
import com.bytedance.android.live.effect.b.e;
import com.bytedance.android.live.effect.c.j;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.am;
import com.bytedance.android.livesdk.j.cv;
import com.bytedance.android.livesdk.j.n;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;
import h.u;
import java.util.Iterator;
import java.util.List;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final b f9657a = new b();

    /* renamed from: c  reason: collision with root package name */
    private static a f9658c;

    /* renamed from: d  reason: collision with root package name */
    private static RunnableC0143b f9659d;

    private b() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (r4 != null) goto L_0x005c;
     */
    @Override // com.bytedance.android.live.effect.api.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r11, float r12, int r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 308
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.b.a(java.lang.String, float, int, boolean):void");
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        DataChannel f9660a;

        /* renamed from: b  reason: collision with root package name */
        boolean f9661b;

        static {
            Covode.recordClassIndex(4923);
        }

        public final void run() {
            b.a(this.f9660a, this.f9661b, "livesdk_live_take_beauty_effective_use", false);
        }
    }

    static {
        Covode.recordClassIndex(4922);
    }

    /* renamed from: com.bytedance.android.live.effect.b$b  reason: collision with other inner class name */
    static final class RunnableC0143b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        DataChannel f9663a;

        /* renamed from: b  reason: collision with root package name */
        boolean f9664b;

        /* renamed from: c  reason: collision with root package name */
        String f9665c = "";

        /* renamed from: d  reason: collision with root package name */
        boolean f9666d;

        /* renamed from: e  reason: collision with root package name */
        int f9667e;

        static {
            Covode.recordClassIndex(4924);
        }

        public final void run() {
            b.a("live_take_filter_effective_use", this.f9663a, this.f9664b, this.f9665c, this.f9666d, this.f9667e);
            DataChannel dataChannel = this.f9663a;
            if (dataChannel != null) {
                dataChannel.a(com.bytedance.android.live.effect.api.b.class, (Object) true);
            }
            DataChannelGlobal.f34575d.a(n.class, true);
        }
    }

    @Override // com.bytedance.android.live.effect.api.d
    public final void a(Handler handler) {
        l.d(handler, "");
        a aVar = f9658c;
        if (aVar != null) {
            handler.removeCallbacks(aVar);
        }
        RunnableC0143b bVar = f9659d;
        if (bVar != null) {
            handler.removeCallbacks(bVar);
        }
        f9658c = null;
        f9659d = null;
    }

    public static boolean a(String str) {
        String str2 = "";
        l.d(str, str2);
        float a2 = j.b.f9740a.a(str);
        u uVar = (u) DataChannelGlobal.f34575d.b(cv.class);
        if (uVar == null) {
            uVar = new u(str2, Float.valueOf(-1.0f), 0);
        }
        if (!l.a(uVar.getFirst(), (Object) str) || ((Number) uVar.getSecond()).floatValue() != a2) {
            return true;
        }
        String str3 = (String) DataChannelGlobal.f34575d.b(am.class);
        if (str3 != null) {
            str2 = str3;
        }
        if (!p.d() || TextUtils.isEmpty(str2) || !(!l.a((Object) str2, (Object) "0"))) {
            return false;
        }
        DataChannelGlobal.f34575d.c(am.class);
        return true;
    }

    public static void b(String str) {
        long j2;
        Long l2;
        Long l3;
        i streamType;
        Long l4;
        String str2;
        String str3 = "";
        l.d(str, str3);
        if (!p.c() && a(str) && DataChannelGlobal.f34575d.b(cv.class) != null) {
            u uVar = (u) DataChannelGlobal.f34575d.b(cv.class);
            if (!(uVar == null || (str2 = (String) uVar.getFirst()) == null)) {
                str3 = str2;
            }
            if (!TextUtils.isEmpty(str3) && !l.a((Object) str3, (Object) "0")) {
                long currentTimeMillis = System.currentTimeMillis();
                if (uVar == null || (l4 = (Long) uVar.getThird()) == null) {
                    j2 = 0;
                } else {
                    j2 = l4.longValue();
                }
                Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
                com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_live_filter_use_time").a("event_page", "live_take_detail");
                String str4 = null;
                if (room != null) {
                    l2 = Long.valueOf(room.getOwnerUserId());
                } else {
                    l2 = null;
                }
                com.bytedance.android.livesdk.ab.b a3 = a2.a("anchor_id", (Number) l2);
                if (room != null) {
                    l3 = Long.valueOf(room.getId());
                } else {
                    l3 = null;
                }
                com.bytedance.android.livesdk.ab.b a4 = a3.a("room_id", (Number) l3).a("filter_id", str3).a("use_time", currentTimeMillis - j2);
                if (!(room == null || (streamType = room.getStreamType()) == null)) {
                    str4 = com.bytedance.android.livesdkapi.depend.model.live.j.a(streamType);
                }
                a4.a("live_type", str4).b();
            }
        }
    }

    @Override // com.bytedance.android.live.effect.api.d
    public final void a(DataChannel dataChannel, boolean z) {
        a(dataChannel, z, "livesdk_live_take_beauty_select", true);
    }

    @Override // com.bytedance.android.live.effect.api.d
    public final void a(Handler handler, DataChannel dataChannel, boolean z) {
        l.d(handler, "");
        if (p.d()) {
            if (f9658c == null) {
                f9658c = new a();
            }
            a aVar = f9658c;
            if (aVar != null) {
                handler.removeCallbacks(aVar);
                aVar.f9660a = dataChannel;
                aVar.f9661b = z;
                handler.postDelayed(aVar, 30000);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r0.intValue() >= 0) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.bytedance.android.livesdkapi.depend.model.live.Room r7, com.bytedance.android.livesdkapi.depend.model.a r8, long r9, com.bytedance.android.livesdk.ab.c.d r11) {
        /*
        // Method dump skipped, instructions count: 315
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.b.a(com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.android.livesdkapi.depend.model.a, long, com.bytedance.android.livesdk.ab.c.d):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x020c, code lost:
        if (r23 == false) goto L_0x00de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.bytedance.ies.sdk.datachannel.DataChannel r22, boolean r23, java.lang.String r24, boolean r25) {
        /*
        // Method dump skipped, instructions count: 715
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.b.a(com.bytedance.ies.sdk.datachannel.DataChannel, boolean, java.lang.String, boolean):void");
    }

    @Override // com.bytedance.android.live.effect.api.d
    public final void b(DataChannel dataChannel, boolean z, String str, boolean z2, int i2) {
        l.d(str, "");
        if (str.length() == 0 || l.a((Object) str, (Object) "0")) {
            RunnableC0143b bVar = f9659d;
            Handler a2 = com.bytedance.android.live.core.f.j.a();
            if (bVar != null) {
                a2.removeCallbacks(bVar);
            }
        } else if (a(str) && p.d()) {
            if (f9659d == null) {
                f9659d = new RunnableC0143b();
            }
            Boolean bool = (Boolean) DataChannelGlobal.f34575d.b(c.class);
            Handler a3 = com.bytedance.android.live.core.f.j.a();
            RunnableC0143b bVar2 = f9659d;
            if (bVar2 != null) {
                a3.removeCallbacks(bVar2);
                if (bool != null) {
                    z2 = bool.booleanValue();
                }
                l.d(str, "");
                bVar2.f9663a = dataChannel;
                bVar2.f9664b = z;
                bVar2.f9665c = str;
                bVar2.f9666d = z2;
                bVar2.f9667e = i2;
                a3.postDelayed(bVar2, 30000);
                DataChannelGlobal.f34575d.a(c.class, null);
            }
        }
    }

    @Override // com.bytedance.android.live.effect.api.d
    public final void a(DataChannel dataChannel, boolean z, String str, boolean z2, int i2) {
        l.d(str, "");
        if (str.length() != 0 && !l.a((Object) str, (Object) "0") && a(str)) {
            a("live_take_filter_select", dataChannel, z, str, z2, i2);
        }
    }

    public static void a(String str, DataChannel dataChannel, boolean z, String str2, boolean z2, int i2) {
        String str3;
        String str4;
        T t;
        int i3;
        User owner;
        com.bytedance.android.livesdk.ab.b b2 = b.a.a(str).b("live_take");
        if (z2) {
            str3 = "click";
        } else {
            str3 = "draw";
        }
        com.bytedance.android.livesdk.ab.b a2 = b2.f(str3).a("filter_id", str2);
        if (dataChannel != null) {
            a2.a(dataChannel);
        } else {
            a2.a();
        }
        List<FilterModel> list = j.b.f9740a.f9728a;
        l.b(list, "");
        Iterator<T> it = list.iterator();
        while (true) {
            str4 = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            T t2 = t;
            l.b(t2, "");
            if (l.a((Object) t2.getFilterId(), (Object) str2)) {
                break;
            }
        }
        T t3 = t;
        if (t3 != null) {
            float d2 = j.b.f9740a.d(t3);
            int a3 = e.a(t3.filterConfig.f9871a, t3.filterConfig.f9872b, d2);
            if (d2 != 0.0f) {
                Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
                com.bytedance.android.livesdk.ab.b a4 = a2.a("is_live_take_default", z ? 1 : 0).a("impr_position", i2);
                if (!(room == null || (owner = room.getOwner()) == null)) {
                    str4 = owner.getIdStr();
                }
                com.bytedance.android.livesdk.ab.b a5 = a4.g(str4).a("filter_value", Float.valueOf(d2));
                if (a3 == t3.filterConfig.f9873c) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                a5.a("is_default_value", i3).b();
            }
        }
    }
}

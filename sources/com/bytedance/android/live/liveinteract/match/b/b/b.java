package com.bytedance.android.live.liveinteract.match.b.b;

import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.model.message.b.a;
import com.bytedance.android.livesdk.model.message.b.h;
import com.bytedance.android.livesdk.model.message.b.j;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.a.d;
import com.bytedance.android.livesdkapi.depend.model.live.a.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public j f10677a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10678b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10679c;

    /* renamed from: d  reason: collision with root package name */
    public h f10680d;

    /* renamed from: e  reason: collision with root package name */
    public h f10681e;

    /* renamed from: f  reason: collision with root package name */
    public d f10682f;

    /* renamed from: g  reason: collision with root package name */
    public d f10683g;

    /* renamed from: h  reason: collision with root package name */
    public long f10684h;

    /* renamed from: i  reason: collision with root package name */
    public long f10685i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f10686j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f10687k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f10688l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f10689m;
    public long n;
    public long o;
    public long p;
    public long q;
    public a r;
    public boolean s;
    public Map<Long, Long> t = new HashMap();
    public i u;
    public i v;
    public final String w;
    private long x;

    static {
        Covode.recordClassIndex(5701);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.w, ((b) obj).w);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.w;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "BattleDataModel(stateKey=" + this.w + ")";
    }

    public final long b() {
        j jVar = this.f10677a;
        if (jVar != null) {
            return jVar.f19272b;
        }
        return this.x;
    }

    public final long c() {
        j jVar = this.f10677a;
        if (jVar != null) {
            return jVar.f19271a;
        }
        return b.a.a().f9940e;
    }

    public final boolean d() {
        if (b() > 0 || a().compareTo((Enum) c.NORMAL) > 0) {
            return true;
        }
        return false;
    }

    public final c a() {
        c cVar;
        c cVar2;
        com.bytedance.android.live.liveinteract.api.a.b a2 = b.a.a();
        if (l.a((Object) "data_battle_state", (Object) this.w)) {
            DataChannel dataChannel = a2.an;
            if (dataChannel == null || (cVar2 = (c) dataChannel.b(com.bytedance.android.live.liveinteract.match.b.c.l.class)) == null) {
                return c.NORMAL;
            }
            return cVar2;
        }
        DataChannel dataChannel2 = a2.an;
        if (dataChannel2 == null || (cVar = (c) dataChannel2.b(com.bytedance.android.live.liveinteract.match.b.c.i.class)) == null) {
            return c.NORMAL;
        }
        return cVar;
    }

    public final void a(long j2) {
        b.a.a().ai = j2;
        this.x = j2;
    }

    public b(String str) {
        l.d(str, "");
        this.w = str;
    }

    public final boolean a(c cVar) {
        l.d(cVar, "");
        if (a().compareTo((Enum) cVar) >= 0) {
            return true;
        }
        return false;
    }

    public final void b(boolean z, String str) {
        l.d(str, "");
        com.bytedance.android.live.core.c.a.a(4, "BattleDataModelReset", "key = " + this.w + "  source = " + str);
        a(z, str);
        a(c.NORMAL, true);
    }

    public final void a(boolean z, String str) {
        long j2;
        boolean z2;
        l.d(str, "");
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            long ownerUserId = room.getOwnerUserId();
            f b2 = u.a().b();
            if (b2 != null) {
                j2 = b2.c();
            } else {
                j2 = 0;
            }
            if (ownerUserId == j2) {
                z2 = true;
            } else {
                z2 = false;
            }
            com.bytedance.android.live.liveinteract.match.c.a aVar = com.bytedance.android.live.liveinteract.match.c.a.f10803g;
            l.d(str, "");
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "source", str);
            if (z2) {
                com.bytedance.android.live.liveinteract.match.c.a.a(aVar, "data_reset", jSONObject, z, 8);
            } else {
                aVar.a("data_reset", jSONObject, 0);
            }
        }
        this.x = 0;
        this.f10678b = false;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.f10684h = 0;
        this.f10685i = 0;
        this.n = 0;
        this.f10679c = false;
        this.f10677a = null;
        this.f10680d = null;
        this.f10681e = null;
        this.f10686j = false;
        this.f10687k = false;
        this.f10688l = false;
        this.f10689m = false;
        this.u = null;
        this.v = null;
        this.r = null;
        this.s = false;
        this.f10682f = null;
        this.f10683g = null;
    }

    public final boolean a(c cVar, boolean z) {
        l.d(cVar, "");
        c a2 = a();
        com.bytedance.android.live.core.c.a.a(4, "BattleDataTag", "updateState, old State = " + a2 + "; targetState = " + cVar);
        if (!z && cVar.compareTo((Enum) a2) <= 0) {
            return false;
        }
        com.bytedance.android.live.core.c.a.a(4, "BattleDataTag", "updateState, success targetState = ".concat(String.valueOf(cVar)));
        com.bytedance.android.live.liveinteract.api.a.b a3 = b.a.a();
        if (l.a((Object) "data_battle_state", (Object) this.w)) {
            DataChannel dataChannel = a3.an;
            if (dataChannel == null) {
                return true;
            }
            dataChannel.b(com.bytedance.android.live.liveinteract.match.b.c.l.class, cVar);
            return true;
        }
        DataChannel dataChannel2 = a3.an;
        if (dataChannel2 == null) {
            return true;
        }
        dataChannel2.b(com.bytedance.android.live.liveinteract.match.b.c.i.class, cVar);
        return true;
    }
}

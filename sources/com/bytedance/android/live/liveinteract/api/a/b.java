package com.bytedance.android.live.liveinteract.api.a;

import android.text.TextUtils;
import android.view.SurfaceView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.liveinteract.api.ap;
import com.bytedance.android.live.liveinteract.api.c.f;
import com.bytedance.android.live.liveinteract.api.k;
import com.bytedance.android.live.liveinteract.api.m;
import com.bytedance.android.livesdk.chatroom.interact.model.h;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.aw;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableLinkLoadWidgetOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.ShowLinkCrossRoomResetStacktraceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostNeedWaitRtcJoinChannelSucceed;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LinkServerAutoJoinChannel;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ttnet.TTNetInit;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

@f(a = "LINK_CROSS_DATA_HOLDER")
public final class b extends a {
    public static b ao;
    public static final Map<String, Object> ap = new ConcurrentHashMap();
    public static final a aq = new a((byte) 0);
    public boolean A;
    public boolean B;
    public long C;
    public int D;
    public long E;
    public boolean F;
    public boolean G;
    public long H;
    public long I;
    public boolean J;
    public long K;
    public String L;
    public String M;
    public int N = -1;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public long S;
    public User T;
    public boolean U;
    public String V;
    public long W;
    public int X = 1;
    public int Y;
    public boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f9936a;
    public long aa;
    public String ab;
    public long ac;
    public Map<Long, SurfaceView> ad = new HashMap();
    public boolean ae;
    public boolean af;
    public boolean ag = true;
    public boolean ah;
    public long ai;
    public String aj;
    public boolean ak = true;
    public boolean al;
    public long am;
    public DataChannel an;
    private final int ar = 1;
    private long as;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9937b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9938c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f9939d;

    /* renamed from: e  reason: collision with root package name */
    public long f9940e;

    /* renamed from: f  reason: collision with root package name */
    public long f9941f;

    /* renamed from: g  reason: collision with root package name */
    public String f9942g;

    /* renamed from: h  reason: collision with root package name */
    public long f9943h;

    /* renamed from: i  reason: collision with root package name */
    public long f9944i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f9945j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f9946k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f9947l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f9948m;
    public boolean n;
    public boolean o = true;
    public m p = m.NONE;
    public boolean q;
    public int r;
    public String s = "";
    public String t;
    public int u;
    public String v;
    public boolean w;
    public String x;
    public Room y;
    public h z;

    public static final class a {
        static {
            Covode.recordClassIndex(5138);
        }

        private a() {
        }

        public static b a() {
            long j2;
            if (b.ao == null) {
                Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
                if (room != null) {
                    j2 = room.getId();
                } else {
                    j2 = 0;
                }
                b.ao = new b(j2, null);
            }
            b bVar = b.ao;
            if (bVar == null) {
                l.b();
            }
            return bVar;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(String str) {
            l.d(str, "");
            b bVar = b.ao;
            if (bVar != null) {
                bVar.e(str);
            }
            b bVar2 = b.ao;
            if (bVar2 != null) {
                bVar2.an = null;
            }
            b.ao = null;
        }

        public static b a(long j2, DataChannel dataChannel, String str) {
            l.d(str, "");
            a("source");
            b bVar = new b(j2, dataChannel);
            b.ao = bVar;
            return bVar;
        }
    }

    public final Config.Vendor d() {
        Config.Vendor fromValue = Config.Vendor.fromValue(this.u);
        l.b(fromValue, "");
        return fromValue;
    }

    static {
        Covode.recordClassIndex(5137);
    }

    public static boolean c() {
        if (EnableLinkLoadWidgetOptSetting.INSTANCE.getValue() == 1) {
            return true;
        }
        return false;
    }

    public final int a() {
        Integer num;
        DataChannel dataChannel = this.an;
        if (dataChannel == null || (num = (Integer) dataChannel.b(aw.class)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final k b() {
        k kVar;
        DataChannel dataChannel = this.an;
        if (dataChannel == null || (kVar = (k) dataChannel.b(ap.class)) == null) {
            return k.DISABLED;
        }
        return kVar;
    }

    public final com.bytedance.android.livesdk.ab.c.f e() {
        String str;
        String str2;
        if (this.r > 0) {
            if (this.D == 0) {
                str = "manual_pk";
            } else {
                str = "";
            }
        } else if (this.F) {
            str = "audience";
        } else {
            str = "anchor";
        }
        com.bytedance.android.livesdk.ab.c.f fVar = new com.bytedance.android.livesdk.ab.c.f();
        fVar.f13506a = this.f9940e;
        fVar.f13507b = this.f9941f;
        fVar.f13508c = this.r;
        fVar.f13509d = str;
        fVar.f13512g = this.s;
        if (Boolean.valueOf(this.G).booleanValue()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        fVar.f13514i = str2;
        l.b(fVar, "");
        return fVar;
    }

    @Override // com.bytedance.android.live.liveinteract.api.a.a
    public final void a(long j2) {
        this.as = j2;
    }

    public final void d(String str) {
        this.L = str;
        this.t = str;
    }

    public static <C> C c(String str) {
        C c2 = (C) ap.get(str);
        if (c2 != null) {
            return c2;
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.api.a.a
    public final void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.ab = str;
        }
    }

    private static int f(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("live_rtc_engine_config")) {
                return 0;
            }
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("live_rtc_engine_config");
                if (optJSONObject.has("rtc_vendor")) {
                    return optJSONObject.optInt("rtc_vendor");
                }
                return 0;
            } catch (Exception e2) {
                e2.printStackTrace();
                return 0;
            }
        } catch (Exception e3) {
            e3.printStackTrace();
            return 0;
        }
    }

    public final b a(p pVar) {
        if (pVar != null && pVar.f23165a > 0) {
            this.f9940e = pVar.f23165a;
            this.f9936a = true;
        }
        return this;
    }

    public final void a(int i2) {
        DataChannel dataChannel = this.an;
        if (dataChannel != null) {
            dataChannel.b(aw.class, Integer.valueOf(i2));
        }
    }

    public final boolean b(k kVar) {
        DataChannel dataChannel;
        l.d(kVar, "");
        if (kVar == k.CONNECTION_SUCCEED) {
            LivePerformanceManager.getInstance().monitorPerformance("live_pk");
        }
        k b2 = b();
        if (b2 == null) {
            b2 = k.DISABLED;
        }
        if (kVar.ordinal() - b2.ordinal() > 1) {
            if (b2.compareTo((Enum) k.CONNECTION_START) < 0 && kVar == k.CONNECTION_SUCCEED) {
                DataChannel dataChannel2 = this.an;
                if (dataChannel2 != null) {
                    dataChannel2.b(ap.class, k.CONNECTION_START);
                }
            } else if (b2.compareTo((Enum) k.CONNECTION_FINISH) < 0 && kVar.equals(k.CONNECTION_FINISH_SUCCEED) && (dataChannel = this.an) != null) {
                dataChannel.b(ap.class, k.CONNECTION_FINISH);
            }
        }
        if (kVar.compareTo((Enum) b2) <= 0) {
            return false;
        }
        DataChannel dataChannel3 = this.an;
        if (dataChannel3 != null) {
            dataChannel3.b(ap.class, kVar);
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.api.a.a
    public final void a(String str) {
        this.v = str;
        int f2 = f(str);
        if (f2 > 0) {
            this.u = f2;
        }
    }

    public final boolean a(k kVar) {
        l.d(kVar, "");
        k b2 = b();
        if (b2 == null) {
            l.b();
        }
        if (b2.compareTo((Enum) kVar) >= 0) {
            return true;
        }
        return false;
    }

    public final void e(String str) {
        DataChannel dataChannel;
        String str2;
        long j2;
        long j3;
        String str3;
        String str4;
        l.d(str, "");
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            JSONObject jSONObject = new JSONObject();
            a(jSONObject, "event_id", "data_reset");
            a(jSONObject, "reset_source", str);
            a(jSONObject, "channel_id", Long.valueOf(this.f9940e));
            String str5 = "0";
            if (Room.isValid(room)) {
                str2 = room.getIdStr();
            } else {
                str2 = str5;
            }
            l.b(str2, "");
            a(jSONObject, "room_id", str2);
            long ownerUserId = room.getOwnerUserId();
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            if (b2 != null) {
                j2 = b2.c();
            } else {
                j2 = 0;
            }
            a(jSONObject, "anchor_id", Long.valueOf(ownerUserId));
            a(jSONObject, "guest_anchor_id", Long.valueOf(this.f9941f));
            a(jSONObject, "current_user_id", Long.valueOf(j2));
            String str6 = this.L;
            if (str6 == null) {
                str6 = "";
            }
            a(jSONObject, "link_mic_id", str6);
            if (this.w) {
                j3 = 1;
            } else {
                j3 = 0;
            }
            a(jSONObject, "rtc_join_channel_advance", Long.valueOf(j3));
            a(jSONObject, "server_auto_joinchannel", Boolean.valueOf(LinkServerAutoJoinChannel.INSTANCE.getValue()));
            k b3 = b();
            if (b3 == null || (str3 = b3.name()) == null) {
                str3 = "";
            }
            a(jSONObject, "link_state", str3);
            a(jSONObject, "device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
            a(jSONObject, "network_type", Long.valueOf((long) TTNetInit.getEffectiveConnectionType()));
            a(jSONObject, "invite_type", this.p);
            if (CoHostNeedWaitRtcJoinChannelSucceed.INSTANCE.getValue()) {
                str5 = "1";
            }
            a(jSONObject, "need_wait_rtc_joinchannel_succeed", str5);
            if (ownerUserId == j2) {
                str4 = "ttlive_client_anchor_link_mic_monitor";
            } else {
                str4 = "ttlive_client_audience_link_mic_monitor";
            }
            c.a(str4, 1, jSONObject);
        }
        this.K = 0;
        this.I = 0;
        this.J = false;
        this.H = 0;
        this.F = false;
        this.G = false;
        this.f9940e = 0;
        this.f9941f = 0;
        this.f9942g = null;
        this.f9943h = 0;
        this.f9944i = 0;
        this.f9945j = false;
        this.q = false;
        this.f9936a = false;
        this.f9937b = false;
        this.O = false;
        this.P = false;
        this.U = false;
        this.r = 0;
        this.s = "";
        this.L = null;
        this.M = null;
        a("");
        this.u = 0;
        this.w = false;
        this.Z = false;
        this.B = false;
        this.A = false;
        this.C = 0;
        this.D = 0;
        this.aa = 0;
        this.W = 0;
        this.ai = 0;
        this.aj = null;
        this.x = null;
        this.f9938c = false;
        this.X = 1;
        this.R = false;
        this.Q = false;
        this.T = null;
        this.p = m.NONE;
        this.ae = false;
        this.S = 0;
        this.Y = 0;
        this.ad.clear();
        b((String) null);
        this.ac = 0;
        this.f9939d = false;
        this.ag = true;
        this.o = true;
        this.n = false;
        this.ah = false;
        this.af = false;
        this.y = null;
        this.z = null;
        if (ShowLinkCrossRoomResetStacktraceSetting.INSTANCE.getValue()) {
            com.bytedance.android.live.core.c.a.a("ttlive_pk", "LinkCrossRoomDataHolder.reset", new IllegalStateException());
        }
        if (!(b() == k.DISABLED || (dataChannel = this.an) == null)) {
            dataChannel.b(ap.class, k.DISABLED);
        }
        this.al = false;
    }

    public b(long j2, DataChannel dataChannel) {
        this.am = j2;
        this.an = dataChannel;
    }

    private static void a(JSONObject jSONObject, String str, Object obj) {
        l.d(jSONObject, "");
        l.d(str, "");
        l.d(obj, "");
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
        }
    }
}

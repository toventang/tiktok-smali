package com.bytedance.android.livesdk.chatroom.detail;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.publicscreen.a.e;
import com.bytedance.android.live.slot.ac;
import com.bytedance.android.live.u.h;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.b.g;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.android.livesdk.ab.k;
import com.bytedance.android.livesdk.chatroom.d;
import com.bytedance.android.livesdk.chatroom.d.a;
import com.bytedance.android.livesdk.chatroom.ui.br;
import com.bytedance.android.livesdk.j.db;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.p;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import f.a.b.b;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class j {
    private static boolean G;
    public long A;
    public DataChannel B;
    public String C;
    public String D = "";
    public String E;
    public long F;
    private HandlerThread H;
    private volatile boolean I;
    private volatile boolean J;
    private final WeakReference<Context> K;
    private boolean L = false;
    private boolean M = false;
    private boolean N;
    private p O;
    private b P;
    private long Q = -1;
    private boolean R = false;
    private boolean S = false;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f15270a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f15271b = true;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f15272c = new Runnable() {
        /* class com.bytedance.android.livesdk.chatroom.detail.j.AnonymousClass1 */

        static {
            Covode.recordClassIndex(8449);
        }

        public final void run() {
            long j2;
            if (j.this.f15270a) {
                j2 = 60000 - (((SystemClock.elapsedRealtime() - j.this.n) - j.this.s) % 60000);
                j.this.f15270a = false;
            } else {
                j2 = 60000;
            }
            j.this.f15273d.postDelayed(this, j2);
            if (j.this.f15271b || j2 != 60000) {
                j.this.f15271b = false;
            } else {
                j.this.a("watch_onemin");
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    public final Handler f15273d;

    /* renamed from: e  reason: collision with root package name */
    public final String f15274e;

    /* renamed from: f  reason: collision with root package name */
    public final String f15275f;

    /* renamed from: g  reason: collision with root package name */
    public final long f15276g;

    /* renamed from: h  reason: collision with root package name */
    public final String f15277h;

    /* renamed from: i  reason: collision with root package name */
    public final EnterRoomConfig f15278i;

    /* renamed from: j  reason: collision with root package name */
    long f15279j = 0;

    /* renamed from: k  reason: collision with root package name */
    public boolean f15280k = false;

    /* renamed from: l  reason: collision with root package name */
    public volatile boolean f15281l = false;

    /* renamed from: m  reason: collision with root package name */
    boolean f15282m = false;
    public long n = -1;
    public long o = -1;
    public boolean p = false;
    public long q = -1;
    public long r = -1;
    public long s = 0;
    public String t = "click";
    public String u;
    public String v;
    public String w;
    public String x;
    long y;
    public String z;

    static {
        Covode.recordClassIndex(8448);
    }

    public final long c() {
        return (SystemClock.elapsedRealtime() - this.n) - this.s;
    }

    public final void d() {
        Context context;
        WeakReference<Context> weakReference = this.K;
        if (weakReference == null || weakReference.get() == null) {
            context = null;
        } else {
            context = this.K.get();
        }
        k.a(context);
        String str = this.f15275f;
        a("request_id", this.f15274e, "log_pb", str, "log_pb", str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        if (!this.f15281l) {
            long c2 = c();
            if (c2 / 1000 >= 30 && !this.J) {
                a("livesdk_watch_thirtysec");
                this.J = true;
            } else if (c2 < 30000) {
                this.f15273d.postDelayed(new n(this), 30000 - c2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f() {
        if (!this.f15281l) {
            long c2 = c();
            if (c2 / 1000 >= 10 && !this.I) {
                a("livesdk_watch_tensec");
                this.I = true;
            } else if (c2 < 10000) {
                this.f15273d.postDelayed(new m(this), 10000 - c2);
            }
        }
    }

    public final void b() {
        a a2 = a.a();
        EnterRoomConfig enterRoomConfig = this.f15278i;
        long j2 = this.f15279j;
        a2.f15185b = true;
        a2.f15188e = enterRoomConfig;
        a2.f15189f.put("audience_live_play_enter_room_config", enterRoomConfig);
        a2.f15189f.put("audience_live_play_room_id", String.valueOf(j2));
        a2.f15186c = SystemClock.elapsedRealtime();
        a2.c();
        com.bytedance.android.live.core.c.a.a(4, "AudienceLivePlayTaskManager", "startRoomDuration");
        this.n = SystemClock.elapsedRealtime();
        this.Q = SystemClock.elapsedRealtime();
        if (this.f15281l) {
            this.r = this.n;
        }
        this.f15271b = true;
        this.f15273d.post(this.f15272c);
        this.f15273d.postDelayed(new k(this), 10000);
        this.f15273d.postDelayed(new l(this), 30000);
        this.A = SystemClock.elapsedRealtime();
    }

    public final void a() {
        this.f15278i.f23298b.w = 0;
        this.f15280k = false;
        this.f15281l = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.n = -1;
        this.o = -1;
        this.p = false;
        this.q = -1;
        this.r = -1;
        this.s = 0;
        this.t = null;
        this.u = null;
        this.x = null;
        this.O = null;
        this.S = false;
        this.R = false;
        this.f15282m = false;
        this.B = null;
        this.I = false;
        this.J = false;
        this.f15273d.removeCallbacksAndMessages(null);
        HandlerThread handlerThread = this.H;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.H = null;
        }
    }

    private static JSONObject a(Object... objArr) {
        JSONObject jSONObject = new JSONObject();
        for (int i2 = 0; i2 < 6; i2 += 2) {
            try {
                if (objArr[i2] instanceof String) {
                    int i3 = i2 + 1;
                    if (i3 < 6) {
                        jSONObject.put((String) objArr[i2], objArr[i3]);
                    } else if (G) {
                        throw new IllegalArgumentException(com.a.a(Locale.ENGLISH, "no value found for key at %d", new Object[]{Integer.valueOf(i2)}));
                    }
                } else if (G) {
                    throw new IllegalArgumentException(com.a.a(Locale.ENGLISH, "key at %d is not a string", new Object[]{Integer.valueOf(i2)}));
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return jSONObject;
    }

    public final void a(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        String str3 = "1";
        hashMap.put("growth_deepevent", str3);
        hashMap.put("request_page", d.a().e());
        if (!m.a(d.a().e())) {
            hashMap.put("enter_live_method", d.a().e());
        }
        String str4 = this.f15278i.f23298b.r;
        if (TextUtils.isEmpty(str4) || !"click_push_live_cd_user".equals(str4)) {
            hashMap.put("is_subscribe", "0");
        } else {
            hashMap.put("is_subscribe", str3);
        }
        if (y.f()) {
            str2 = "portrait";
        } else {
            str2 = "landscape";
        }
        hashMap.put("room_orientation", str2);
        if (!this.f15278i.f23299c.aw) {
            str3 = "0";
        }
        hashMap.put("is_return", str3);
        b.a.a(str).a((Map<String, String>) hashMap).a(this.B).b("live_view").d("live_detail").f(this.t).b();
    }

    public final void a(Room room) {
        String str;
        String str2;
        String str3;
        a a2 = a.a();
        com.bytedance.android.live.core.c.a.a(4, "AudienceLivePlayTaskManager", "stopRoomDuration duration: " + a2.b());
        a2.f15185b = false;
        a2.f15187d = 0;
        a2.f15186c = -1;
        a2.f15188e = null;
        a2.f15189f.clear();
        a2.f15184a.clear();
        a2.f15190g.removeCallbacksAndMessages(null);
        if (!(this.n == -1 || this.N || room == null)) {
            if (this.o != -1) {
                b.a.a("live_stream_duration").a().a("duration", String.valueOf((SystemClock.elapsedRealtime() - this.o) - this.s)).b("live_view").d("live_detail").b();
            }
            long elapsedRealtime = (SystemClock.elapsedRealtime() - this.n) - this.s;
            if (ac.b()) {
                Long l2 = 0L;
                for (Long l3 : br.aq) {
                    l2 = Long.valueOf(l2.longValue() + l3.longValue());
                }
                elapsedRealtime += l2.longValue();
            }
            HashMap hashMap = new HashMap();
            if (((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).isRoomInBattle()) {
                hashMap.put("connection_type", "manual_pk");
                hashMap.put("pk_id", String.valueOf(((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).getBattleId()));
            }
            hashMap.put("request_page", d.a().e());
            if (!m.a(d.a().e())) {
                hashMap.put("enter_live_method", d.a().e());
            }
            String str4 = this.f15278i.f23298b.r;
            String str5 = "1";
            if (TextUtils.isEmpty(str4) || !"click_push_live_cd_user".equals(str4)) {
                hashMap.put("is_subscribe", "0");
            } else {
                hashMap.put("is_subscribe", str5);
            }
            long hotDuration = ((e) com.bytedance.android.live.t.a.a(e.class)).getHotDuration(this.f15279j);
            ((e) com.bytedance.android.live.t.a.a(e.class)).resetDuration(this.f15279j);
            if (this.f15278i.f23299c.aw) {
                str = str5;
            } else {
                str = "0";
            }
            hashMap.put("is_return", str);
            if (!TextUtils.isEmpty(this.f15278i.f23298b.f23314f)) {
                hashMap.put("live_reason", this.f15278i.f23298b.f23314f);
            }
            if (room.getOwner() == null || room.getOwner().getAuthenticationInfo() == null) {
                str2 = "0";
            } else {
                str2 = str5;
            }
            hashMap.put("is_anchor_official", str2);
            g.a((Map<String, String>) hashMap, room);
            b.a.a("live_duration").a((Map<String, String>) hashMap).a().a("duration", String.valueOf(elapsedRealtime)).a("hot_duration", hotDuration).b("live_view").d("live_detail").b();
            String str6 = "open";
            if (!(com.bytedance.android.live.t.a.a(IWalletService.class) == null || ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().e() == null || !((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().e().getValidUser())) {
                if (((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().g()) {
                    str3 = str6;
                } else {
                    str3 = "close";
                }
                b.a.a("livesdk_auto_balance_exchange_status").a().a("status", str3).b();
            }
            this.N = true;
            if (com.bytedance.android.livesdk.utils.a.a(this.B)) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("duration", String.valueOf(elapsedRealtime));
                HashMap hashMap3 = new HashMap();
                hashMap3.put("room_id", String.valueOf(this.f15279j));
                hashMap3.put("anchor_id", String.valueOf(this.y));
                hashMap3.put("duration", String.valueOf(elapsedRealtime));
                com.bytedance.android.livesdk.utils.a.a("live_ad", "live_duration", hashMap2, hashMap3);
            }
            if (this.Q != -1) {
                DataChannel dataChannel = this.B;
                HashMap hashMap4 = new HashMap();
                hashMap4.put("video_id", com.bytedance.android.livesdk.ab.e.f());
                if (dataChannel != null) {
                    hashMap4.put("is_live_recall", "0");
                    Room room2 = (Room) dataChannel.b(df.class);
                    if (room2 != null) {
                        if (!room2.hasCommerceGoods) {
                            str5 = "0";
                        }
                        hashMap4.put("is_sale", str5);
                        hashMap4.put("orientation", String.valueOf(room2.getOrientation()));
                    }
                }
                f.a.b.b bVar = this.P;
                if (bVar != null && !bVar.isDisposed()) {
                    try {
                        this.P.dispose();
                    } catch (Exception e2) {
                        i.b();
                        com.bytedance.android.live.core.c.a.a(6, "ttlive_exception", e2.getStackTrace());
                    }
                }
                hashMap4.put("duration", String.valueOf(SystemClock.elapsedRealtime() - this.Q));
                hashMap4.put("trigger", "close");
                b.a.a("livesdk_video_over").a((Map<String, String>) hashMap4).a(this.B).f(this.t).b();
                this.Q = -1;
            }
            com.bytedance.android.livesdk.ab.b a3 = b.a.a("livesdk_user_left_rankings_status").a();
            if (((Long) DataChannelGlobal.f34575d.b(db.class)).longValue() == com.bytedance.android.livesdk.rank.api.i.RANKINGS_SWITCH_STATUS_OFF.getValue()) {
                str6 = "close";
            }
            a3.a("ranking_status", str6).b();
        }
    }

    public final void a(long j2, boolean z2, long j3, p pVar) {
        String str;
        this.f15279j = j2;
        if (z2) {
            str = "audio_live";
        } else {
            str = "video_live";
        }
        this.x = str;
        this.y = j3;
        this.O = pVar;
    }

    public final void a(boolean z2, boolean z3, String str, Room room) {
        if (z2) {
            this.R = z2;
        }
        if (z3) {
            this.S = z3;
        }
        if (this.S && this.R) {
            q qVar = new q(this, str, room);
            l.d(qVar, "");
            h.a(qVar, 3);
        }
    }

    public j(Context context, String str, String str2, long j2, String str3, String str4, EnterRoomConfig enterRoomConfig, String str5, String str6) {
        G = TextUtils.equals(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).getChannel(), "local_test");
        HandlerThread handlerThread = new HandlerThread("watch_live_timer");
        this.H = handlerThread;
        handlerThread.start();
        this.f15273d = new Handler(this.H.getLooper());
        this.K = new WeakReference<>(context);
        this.f15274e = str;
        this.f15275f = str2;
        this.f15276g = j2;
        this.f15277h = str3;
        this.u = str4;
        this.f15278i = enterRoomConfig;
        this.v = str5;
        this.w = str6;
    }
}

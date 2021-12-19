package com.bytedance.android.livesdk.rank.impl.ranks;

import android.graphics.Color;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.e.r;
import com.bytedance.android.livesdk.chatroom.viewmodule.bq;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.da;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.livesetting.rank.LiveHourlyRankQueryEntranceDelaySetting;
import com.bytedance.android.livesdk.model.message.ad;
import com.bytedance.android.livesdk.model.message.ae;
import com.bytedance.android.livesdk.model.message.ay;
import com.bytedance.android.livesdk.model.message.bp;
import com.bytedance.android.livesdk.model.message.bs;
import com.bytedance.android.livesdk.model.message.bu;
import com.bytedance.android.livesdk.model.message.cb;
import com.bytedance.android.livesdk.model.message.cj;
import com.bytedance.android.livesdk.rank.api.d;
import com.bytedance.android.livesdk.rank.api.j;
import com.bytedance.android.livesdk.rank.impl.api.RankApi;
import com.bytedance.android.livesdk.rank.impl.ranks.a;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.android.livesdkapi.depend.c.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class g extends r<a.AbstractC0430a> implements com.bytedance.android.livesdk.rank.api.b.a, a.AbstractC0502a, OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    List<bp> f20913a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    boolean f20914b;

    /* renamed from: c  reason: collision with root package name */
    boolean f20915c;

    /* renamed from: d  reason: collision with root package name */
    private c f20916d;

    /* renamed from: e  reason: collision with root package name */
    private bp f20917e;

    /* renamed from: f  reason: collision with root package name */
    private final com.bytedance.android.livesdkapi.depend.c.a f20918f = new com.bytedance.android.livesdkapi.depend.c.a(this);

    /* renamed from: g  reason: collision with root package name */
    private boolean f20919g;

    /* renamed from: h  reason: collision with root package name */
    private final String f20920h = "#33000000";

    /* renamed from: i  reason: collision with root package name */
    private final int f20921i = Color.parseColor("#33000000");

    /* renamed from: j  reason: collision with root package name */
    private Room f20922j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f20923k;

    /* renamed from: l  reason: collision with root package name */
    private d f20924l = null;

    static {
        Covode.recordClassIndex(12383);
    }

    public final void a(a.AbstractC0430a aVar) {
        Room room;
        super.a((bq) aVar);
        if (this.w != null) {
            this.f20922j = (Room) this.w.b(df.class);
            this.f20915c = ((Boolean) this.w.b(ee.class)).booleanValue();
        }
        if (((com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class)).isMicRoomForCurrentRoom()) {
            a(false);
        } else {
            a(true);
        }
        d dVar = (d) com.bytedance.android.live.t.a.a(d.class);
        this.f20924l = dVar;
        Room room2 = this.f20922j;
        if (room2 != null) {
            dVar.registerRankController(room2.getId(), this);
        }
        b(true);
        d dVar2 = this.f20924l;
        if (dVar2 != null) {
            if (!(dVar2 instanceof com.bytedance.android.livesdk.rank.impl.d) || (((com.bytedance.android.livesdk.rank.impl.d) dVar2).matchAgeGate() && ((com.bytedance.android.livesdk.rank.impl.d) this.f20924l).isRankAreaSupported())) {
                int value = LiveHourlyRankQueryEntranceDelaySetting.INSTANCE.getValue();
                if (value <= 0 || !this.f20915c) {
                    d();
                } else {
                    this.f20918f.sendEmptyMessageDelayed(3, (long) value);
                }
                if (!(this.w == null || (room = (Room) this.w.b(df.class)) == null)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(com.bytedance.android.livesdk.rank.impl.api.model.g.HOURLY_RANK_ENTRANCE.getValue()).append(",").append(com.bytedance.android.livesdk.rank.impl.api.model.g.HOURLY_RANK_LIST.getValue()).append(",").append(com.bytedance.android.livesdk.rank.impl.api.model.g.HOURLY_RANK_BOTTOM.getValue());
                    ((z) ((RankApi) e.a().a(RankApi.class)).getScoreDisplayConfig(room.getId(), sb.toString()).a(new f()).a(u())).a(new j(this), new k(this));
                }
                Room room3 = this.f20922j;
                long j2 = 0;
                long id = room3 != null ? room3.getId() : 0;
                long c2 = u.a().b().c();
                Room room4 = this.f20922j;
                if (room4 != null) {
                    j2 = room4.getOwnerUserId();
                }
                Room room5 = this.f20922j;
                com.bytedance.android.livesdk.rank.impl.d.a.a(id, c2, j2, (room5 == null || room5.getRoomAuthStatus() == null) ? 0 : this.f20922j.getRoomAuthStatus().getRankState());
                this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.ROOM_VERIFY.getIntType(), this);
                return;
            }
            a(-1, (String) null, (String) null, ((com.bytedance.android.livesdk.rank.impl.d) this.f20924l).getRankDisabledReason());
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(List<bp> list, boolean z) {
        if (this.f20916d == null || z) {
            this.f20918f.removeCallbacksAndMessages(null);
            if (this.f20916d != null) {
                this.f20917e = null;
                f();
                ((a.AbstractC0430a) this.y).a(Collections.singletonList(this.f20916d));
                this.f20918f.sendEmptyMessageDelayed(5, this.f20916d.f20909d);
                return;
            }
            Iterator<bp> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    b(true);
                    this.f20917e = null;
                    break;
                } else if (it.next().f19344a) {
                    f();
                    bp bpVar = list.get(0);
                    this.f20917e = bpVar;
                    bs bsVar = bpVar.f19347d;
                    if (bsVar != null) {
                        if (this.f20917e.f19345b - bsVar.f19357a >= 0) {
                            Message obtain = Message.obtain();
                            obtain.what = 1;
                            obtain.obj = Long.valueOf(TimeUnit.SECONDS.toMillis(bsVar.f19358b));
                            this.f20918f.sendMessageDelayed(obtain, TimeUnit.SECONDS.toMillis(this.f20917e.f19345b - bsVar.f19357a));
                        } else if (bsVar.f19357a - this.f20917e.f19345b < bsVar.f19358b) {
                            Message obtain2 = Message.obtain();
                            obtain2.what = 1;
                            obtain2.obj = Long.valueOf(TimeUnit.SECONDS.toMillis(bsVar.f19358b - (bsVar.f19357a - this.f20917e.f19345b)));
                            this.f20918f.sendMessage(obtain2);
                        } else {
                            a(list, bsVar.f19360d);
                        }
                    }
                    a(list, (String) null);
                }
            }
            if (this.f20917e != null) {
                this.f20918f.sendEmptyMessageDelayed(4, TimeUnit.SECONDS.toMillis(this.f20917e.f19345b));
            }
        }
    }

    @Override // com.bytedance.android.livesdk.rank.api.b.a
    public final void a(boolean z) {
        this.f20923k = z;
        if (z) {
            f();
            return;
        }
        b(false);
        a(-1, (String) null, (String) null, "hide_by_other_business");
    }

    @Override // com.bytedance.android.livesdk.rank.api.b.a
    public final boolean a() {
        return !this.f20913a.isEmpty() && this.f20923k && g();
    }

    private boolean g() {
        Room room = this.f20922j;
        if (room == null) {
            return false;
        }
        if (room.getRoomAuthStatus() == null || this.f20922j.getRoomAuthStatus().getRankState() != 2) {
            return true;
        }
        return false;
    }

    private boolean e() {
        for (bp bpVar : this.f20913a) {
            if (bpVar.f19348e == j.WEEKLY_RANK.getType() && bpVar.f19344a) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.HOURLY_RANK_MESSAGE.getIntType(), this);
        this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.HOURLY_RANK_REWARD_MESSAGE.getIntType(), this);
        this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.MARQUEE_ANNOUNCEMENT_MESSAGE.getIntType(), this);
        this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.WEEKLY_RANK_REWARD_MESSAGE.getIntType(), this);
        this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.RANK_PROMPT_MESSAGE.getIntType(), this);
    }

    private void d() {
        Room room;
        if (this.w != null && !this.f20914b && (room = (Room) this.w.b(df.class)) != null && room.getOwner() != null) {
            ((z) ((RankApi) e.a().a(RankApi.class)).queryRankEntrances(room.getOwner().getId(), room.getId()).a(new f()).a(u())).a(new h(this), new i(this, room));
        }
    }

    @Override // com.bytedance.ies.a.b, com.bytedance.android.livesdk.chatroom.e.r
    public final void b() {
        b(true);
        this.x.removeMessageListener(com.bytedance.android.livesdk.model.message.a.a.HOURLY_RANK_MESSAGE.getIntType(), this);
        this.x.removeMessageListener(com.bytedance.android.livesdk.model.message.a.a.HOURLY_RANK_REWARD_MESSAGE.getIntType(), this);
        this.x.removeMessageListener(com.bytedance.android.livesdk.model.message.a.a.MARQUEE_ANNOUNCEMENT_MESSAGE.getIntType(), this);
        this.x.removeMessageListener(com.bytedance.android.livesdk.model.message.a.a.WEEKLY_RANK_REWARD_MESSAGE.getIntType(), this);
        this.x.removeMessageListener(com.bytedance.android.livesdk.model.message.a.a.ROOM_VERIFY.getIntType(), this);
        this.x.removeMessageListener(com.bytedance.android.livesdk.model.message.a.a.RANK_PROMPT_MESSAGE.getIntType(), this);
        this.f20918f.removeCallbacksAndMessages(null);
        super.b();
        if (this.f20922j != null) {
            ((d) com.bytedance.android.live.t.a.a(d.class)).unregisterRankController(this.f20922j.getId(), this);
        }
        this.f20922j = null;
        this.f20915c = false;
        this.f20913a.clear();
        this.f20917e = null;
        this.f20916d = null;
    }

    private void f() {
        String str;
        String str2;
        if (!this.f20919g && a()) {
            this.f20919g = true;
            ((a.AbstractC0430a) this.y).a();
            b a2 = b.a.a("livesdk_rank_entrance_show").a(this.w);
            if (((Boolean) this.w.b(cp.class)).booleanValue()) {
                str = "portrait";
            } else {
                str = "landscape";
            }
            b a3 = a2.a("room_orientation", str);
            if (this.f20915c) {
                str2 = "anchor";
            } else {
                str2 = "user";
            }
            a3.a("user_type", str2).b();
            if (this.w != null) {
                Room room = (Room) this.w.b(df.class);
                if (room != null) {
                    JSONObject jSONObject = new JSONObject();
                    com.bytedance.android.live.core.d.a.a(jSONObject, "room_id", room.getId());
                    com.bytedance.android.live.core.d.a.a(jSONObject, "user_id", u.a().b().c());
                    c.a("ttlive_hourly_rank_entrance", 0, jSONObject);
                }
                this.w.c(da.class, true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z) {
        if (this.f20919g) {
            this.f20919g = false;
            ((a.AbstractC0430a) this.y).a(z);
            if (this.w != null) {
                this.w.c(da.class, false);
            }
        }
    }

    static List<bp> a(List<bp> list) {
        ((d) com.bytedance.android.live.t.a.a(d.class)).setRankEntranceList(list);
        ArrayList arrayList = new ArrayList();
        bp bpVar = null;
        for (bp bpVar2 : list) {
            if (bpVar == null) {
                bpVar = bpVar2;
            }
            if (bpVar2.f19349f) {
                arrayList.add(bpVar2);
                if (bpVar2.f19348e == j.HOURLY_RANK.getType() && bpVar2.f19347d != null) {
                    com.bytedance.android.livesdk.rank.impl.c.a.a(j.HOURLY_RANK.getType(), bpVar2.f19347d.f19362f);
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(bpVar);
        }
        return arrayList;
    }

    @Override // com.bytedance.android.livesdkapi.depend.c.a.AbstractC0502a
    public final void handleMsg(Message message) {
        bp bpVar;
        List<c> singletonList;
        if (message.what == 1) {
            bp bpVar2 = this.f20917e;
            if (bpVar2 != null && bpVar2.f19347d != null) {
                bs bsVar = this.f20917e.f19347d;
                if (this.f20917e.f19348e == j.HOURLY_RANK.getType()) {
                    singletonList = Collections.singletonList(a(this.f20917e.f19348e, bsVar.f19359c, bsVar.f19360d, bsVar.f19358b, bsVar));
                } else {
                    singletonList = Collections.singletonList(a(this.f20917e.f19348e, bsVar.f19359c, bsVar.f19360d, bsVar.f19358b));
                }
                f();
                ((a.AbstractC0430a) this.y).a(singletonList);
                this.f20918f.sendEmptyMessageDelayed(2, ((Long) message.obj).longValue());
            }
        } else if (message.what == 2) {
            if (!this.f20913a.isEmpty() && (bpVar = this.f20917e) != null && bpVar.f19347d != null) {
                a(Collections.singletonList(this.f20917e), this.f20917e.f19347d.f19360d);
            }
        } else if (message.what == 3) {
            d();
        } else if (message.what == 4) {
            bp bpVar3 = this.f20917e;
            if (bpVar3 == null || bpVar3.f19346c == null) {
                b(true);
                return;
            }
            List<c> singletonList2 = Collections.singletonList(new c(this.f20917e.f19348e, com.bytedance.android.livesdk.chatroom.f.c.a(this.f20917e.f19346c, ""), this.f20921i, Long.MAX_VALUE));
            f();
            ((a.AbstractC0430a) this.y).a(singletonList2);
        } else if (message.what == 5) {
            this.f20916d = null;
            a(a(this.f20913a), false);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long j2;
        int i2;
        long j3;
        int i3;
        List<ad> list;
        bs bsVar;
        CharSequence a2;
        String str;
        long j4 = 0;
        if (iMessage instanceof bu) {
            bu buVar = (bu) iMessage;
            bp bpVar = buVar.f19366a;
            if (bpVar != null) {
                for (bp bpVar2 : this.f20913a) {
                    if (bpVar2.f19348e == bpVar.f19348e) {
                        int indexOf = this.f20913a.indexOf(bpVar2);
                        if (indexOf != -1) {
                            this.f20913a.remove(indexOf);
                            this.f20913a.add(indexOf, bpVar);
                            Iterator<bp> it = a(this.f20913a).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (it.next().f19344a) {
                                        break;
                                    }
                                } else {
                                    if (this.f20919g) {
                                        str = "displaying";
                                    } else {
                                        str = "hidden";
                                    }
                                    if (buVar.O != null) {
                                        j4 = buVar.O.f23212d;
                                    }
                                    a(-1, str, String.valueOf(j4), "receive message," + ((com.bytedance.android.livesdk.rank.impl.d) this.f20924l).getRankDisabledReason());
                                }
                            }
                            a(a(this.f20913a), false);
                            return;
                        }
                        return;
                    }
                }
            }
        } else if (iMessage instanceof com.bytedance.android.livesdk.model.message.bq) {
            com.bytedance.android.livesdk.model.message.bq bqVar = (com.bytedance.android.livesdk.model.message.bq) iMessage;
            List<bp> a3 = a(this.f20913a);
            if (!(!a(bqVar, a3) || (bsVar = bqVar.f19352g) == null || (a2 = b.a(bsVar.f19359c)) == "")) {
                this.f20916d = a(bqVar.f19350a, a2, bsVar.f19360d, bsVar.f19358b);
                a(a3, true);
            }
        } else if (iMessage instanceof ae) {
            if (!(this.f20922j == null || this.f20913a.isEmpty())) {
                ae aeVar = (ae) iMessage;
                ad adVar = null;
                ArrayList<ad> arrayList = new ArrayList();
                if (aeVar.f19127a == null || aeVar.f19127a.isEmpty()) {
                    list = Collections.emptyList();
                } else {
                    list = Collections.unmodifiableList(aeVar.f19127a);
                }
                for (ad adVar2 : list) {
                    if (adVar2.f19123a == this.f20922j.getOwnerUserId()) {
                        adVar = adVar2;
                    } else {
                        arrayList.add(adVar2);
                    }
                }
                if (adVar != null) {
                    arrayList.add(0, adVar);
                    ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).playGiftVideo(adVar.f19124b, new l(this, arrayList));
                    if (adVar.f19126d != null) {
                        Room room = this.f20922j;
                        if (room != null) {
                            room.getOwner().setBorder(adVar.f19126d);
                        }
                        if (this.w != null) {
                            this.w.b(com.bytedance.android.livesdk.rank.api.a.class, adVar.f19126d);
                            return;
                        }
                        return;
                    }
                    return;
                }
                for (ad adVar3 : arrayList) {
                    this.x.insertMessage(adVar3.f19125c, true);
                }
            }
        } else if (iMessage instanceof ay) {
            if (e() && !((com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class)).isMicRoomForCurrentRoom()) {
                ay ayVar = (ay) iMessage;
                if (!(ayVar.f19231f == null || ayVar.f19231f.isEmpty())) {
                    for (ay.a aVar : ayVar.f19231f) {
                        this.x.insertMessage(aVar.f19232a, true);
                    }
                }
            }
        } else if (iMessage instanceof cj) {
            if (e()) {
                cj cjVar = (cj) iMessage;
                if (!(this.f20922j == null || cjVar.f19495a != this.f20922j.getOwner().getId() || cjVar.f19496f == null)) {
                    this.f20922j.getOwner().setBorder(cjVar.f19496f);
                    if (this.w != null) {
                        this.w.b(com.bytedance.android.livesdk.rank.api.a.class, cjVar.f19496f);
                    }
                }
            }
        } else if (iMessage instanceof cb) {
            cb cbVar = (cb) iMessage;
            if (cbVar.f19460a == 30) {
                Room room2 = this.f20922j;
                if (!(room2 == null || room2.getRoomAuthStatus() == null)) {
                    this.f20922j.getRoomAuthStatus().setRankState(1);
                    if (!this.f20913a.isEmpty()) {
                        a(a(this.f20913a), false);
                    }
                    d();
                }
                Room room3 = this.f20922j;
                if (room3 != null) {
                    j3 = room3.getId();
                } else {
                    j3 = 0;
                }
                long c2 = u.a().b().c();
                Room room4 = this.f20922j;
                if (room4 != null) {
                    j4 = room4.getOwnerUserId();
                }
                Room room5 = this.f20922j;
                if (room5 == null || room5.getRoomAuthStatus() == null) {
                    i3 = 0;
                } else {
                    i3 = this.f20922j.getRoomAuthStatus().getRankState();
                }
                com.bytedance.android.livesdk.rank.impl.d.a.a(j3, c2, j4, i3);
            } else if (cbVar.f19460a == 31) {
                Room room6 = this.f20922j;
                if (!(room6 == null || room6.getRoomAuthStatus() == null)) {
                    this.f20922j.getRoomAuthStatus().setRankState(2);
                    b(true);
                }
                Room room7 = this.f20922j;
                if (room7 != null) {
                    j2 = room7.getId();
                } else {
                    j2 = 0;
                }
                long c3 = u.a().b().c();
                Room room8 = this.f20922j;
                if (room8 != null) {
                    j4 = room8.getOwnerUserId();
                }
                Room room9 = this.f20922j;
                if (room9 == null || room9.getRoomAuthStatus() == null) {
                    i2 = 0;
                } else {
                    i2 = this.f20922j.getRoomAuthStatus().getRankState();
                }
                com.bytedance.android.livesdk.rank.impl.d.a.a(j2, c3, j4, i2);
            }
        }
    }

    private void a(List<bp> list, String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        for (bp bpVar : list) {
            if (bpVar.f19346c != null) {
                int i2 = bpVar.f19348e;
                com.bytedance.android.livesdk.model.message.c.b bVar = bpVar.f19346c;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                } else {
                    str2 = "#33000000";
                }
                arrayList.add(a(i2, bVar, str2, 5));
            }
        }
        ((a.AbstractC0430a) this.y).a((List<c>) arrayList);
        f();
    }

    private boolean a(com.bytedance.android.livesdk.model.message.bq bqVar, List<bp> list) {
        if (bqVar.f19352g != null && ((!this.f20915c || bqVar.f19351f == 2) && (this.f20915c || bqVar.f19351f == 1))) {
            for (bp bpVar : list) {
                if ((bqVar.f19350a == com.bytedance.android.livesdk.rank.api.g.HOURLY_RANK_PROMPT.getType() && bpVar.f19348e == j.HOURLY_RANK.getType()) || (bqVar.f19350a == com.bytedance.android.livesdk.rank.api.g.WEEKLY_RANK_PROMPT.getType() && bpVar.f19348e == j.WEEKLY_RANK.getType())) {
                    return true;
                }
            }
        }
        return false;
    }

    private c a(int i2, com.bytedance.android.livesdk.model.message.c.b bVar, String str, long j2) {
        return a(i2, com.bytedance.android.livesdk.chatroom.f.c.a(bVar, ""), str, j2);
    }

    private c a(int i2, CharSequence charSequence, String str, long j2) {
        int i3;
        long millis;
        if (TextUtils.isEmpty(str)) {
            i3 = this.f20921i;
        } else {
            try {
                i3 = Color.parseColor(str);
            } catch (Exception unused) {
                i3 = this.f20921i;
            }
        }
        if (j2 == Long.MAX_VALUE) {
            millis = Long.MAX_VALUE;
        } else {
            millis = TimeUnit.SECONDS.toMillis(j2);
        }
        return new c(i2, charSequence, i3, millis);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, String str, String str2, String str3) {
        long j2;
        Room room = this.f20922j;
        long j3 = 0;
        if (room != null) {
            j2 = room.getId();
        } else {
            j2 = 0;
        }
        long c2 = u.a().b().c();
        Room room2 = this.f20922j;
        if (room2 != null) {
            j3 = room2.getOwnerUserId();
        }
        com.bytedance.android.livesdk.rank.impl.d.a.a(i2, j2, c2, j3, str, str2, str3);
    }

    private c a(int i2, com.bytedance.android.livesdk.model.message.c.b bVar, String str, long j2, bs bsVar) {
        int i3;
        long millis;
        if (TextUtils.isEmpty(str)) {
            i3 = this.f20921i;
        } else {
            try {
                i3 = Color.parseColor(str);
            } catch (Exception unused) {
                i3 = this.f20921i;
            }
        }
        com.bytedance.android.livesdk.rank.impl.d.b a2 = com.bytedance.android.livesdk.rank.impl.d.b.a();
        long ownerUserId = this.f20922j.getOwnerUserId();
        long j3 = (long) bsVar.f19361e;
        int i4 = bsVar.f19362f;
        CharSequence a3 = com.bytedance.android.livesdk.chatroom.f.c.a(bVar, "");
        if (a2.f20661a != null && a2.f20661a.f20644b != null && j3 >= ((long) a2.f20661a.f20644b.f20648a) && (a2.f20661a.f20645c == null || ((!a2.f20661a.f20645c.f20637a || !(ownerUserId == 0 || ownerUserId == u.a().b().c())) && !a2.a(a2.f20661a.f20645c.f20639c)))) {
            a3 = new SpannableString(com.bytedance.android.livesdk.rank.impl.d.b.a(i4, a2.f20661a.f20644b.f20649b));
        }
        if (j2 == Long.MAX_VALUE) {
            millis = Long.MAX_VALUE;
        } else {
            millis = TimeUnit.SECONDS.toMillis(j2);
        }
        return new c(i2, a3, i3, millis);
    }
}

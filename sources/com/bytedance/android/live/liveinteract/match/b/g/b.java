package com.bytedance.android.live.liveinteract.match.b.g;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.live.adminsetting.RoomSwitchApi;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.e;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.live.liveinteract.platform.common.g.b;
import com.bytedance.android.livesdk.chatroom.viewmodule.bq;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableBattleUiNewStyleSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleOpenTimeoutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattlePunishDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveTimeIncrementForBattleSetting;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.model.message.am;
import com.bytedance.android.livesdk.model.message.an;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class b extends com.bytedance.android.livesdk.chatroom.e.r<AbstractC0200b> implements OnMessageListener {
    public static final a o = new a((byte) 0);

    /* renamed from: a */
    public final com.bytedance.android.live.liveinteract.api.a.b f10710a;

    /* renamed from: b */
    public Room f10711b;

    /* renamed from: c */
    public boolean f10712c;

    /* renamed from: d */
    f.a.b.b f10713d;

    /* renamed from: e */
    f.a.b.b f10714e;

    /* renamed from: f */
    public final Handler f10715f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    public boolean f10716g;

    /* renamed from: h */
    public boolean f10717h;

    /* renamed from: i */
    public boolean f10718i;

    /* renamed from: j */
    public boolean f10719j;

    /* renamed from: k */
    public boolean f10720k;

    /* renamed from: l */
    public String f10721l;

    /* renamed from: m */
    public final boolean f10722m;
    public am n;

    public static final class ag<T> implements f.a.d.f {

        /* renamed from: a */
        public static final ag f10734a = new ag();

        static {
            Covode.recordClassIndex(5734);
        }

        ag() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$b */
    public interface AbstractC0200b extends bq {
        static {
            Covode.recordClassIndex(5736);
        }

        void a(an anVar);

        void a(com.bytedance.android.livesdk.model.message.b.h hVar, h.f.a.a<h.z> aVar);

        void a(com.bytedance.android.livesdkapi.depend.model.live.a.h hVar);

        void a(String str);

        void b(Throwable th);
    }

    static {
        Covode.recordClassIndex(5726);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(5727);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r0 == null) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r0 == null) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.android.live.liveinteract.match.b.g.b.AbstractC0200b r13) {
        /*
        // Method dump skipped, instructions count: 530
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.match.b.g.b.a(com.bytedance.android.live.liveinteract.match.b.g.b$b):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z2, b.EnumC0251b bVar) {
        com.bytedance.android.live.liveinteract.match.b.b.b bVar2;
        if (this.y != null) {
            com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "invite");
            long j2 = this.f10710a.f9944i;
            long c2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.c();
            long j3 = this.f10710a.f9941f;
            if (z2 != 0) {
                if (com.bytedance.android.live.liveinteract.match.b.b.a.f10675b.a() == com.bytedance.android.live.liveinteract.match.b.b.c.NORMAL) {
                    bVar2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10675b;
                } else {
                    return;
                }
            } else if (com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a() == com.bytedance.android.live.liveinteract.match.b.b.c.NORMAL) {
                bVar2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a;
            } else {
                return;
            }
            bVar2.a(com.bytedance.android.live.liveinteract.match.b.b.c.INVITED, false);
            bVar2.f10679c = true;
            bVar2.f10678b = z2;
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "invite_type", String.valueOf(z2 ? 1 : 0));
            com.bytedance.android.live.liveinteract.match.c.a.a(com.bytedance.android.live.liveinteract.match.c.a.f10803g, "invite_request", jSONObject, z2, 8);
            com.bytedance.android.live.liveinteract.match.c.a.f10798b = System.currentTimeMillis();
            ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) ((LinkBattleApi) com.bytedance.android.live.network.e.a().a(LinkBattleApi.class)).invite(j2, c2, j3, z2).a(v())).a(new n(this, z2, bVar, bVar2), new o(this, z2, bVar, bVar2));
        }
    }

    public final void a(h.f.a.a<h.z> aVar) {
        if (this.y != null) {
            com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "cancel");
            com.bytedance.android.live.liveinteract.match.c.a.a(com.bytedance.android.live.liveinteract.match.c.a.f10803g, "cancel_request", new JSONObject(), false, 12);
            com.bytedance.android.live.liveinteract.match.c.a.f10799c = System.currentTimeMillis();
            ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) ((LinkBattleApi) com.bytedance.android.live.network.e.a().a(LinkBattleApi.class)).cancel(this.f10710a.f9944i, com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.c(), com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.b()).a(v())).a(new g(aVar), new h(this, aVar));
        }
    }

    public final void a(Map<Long, com.bytedance.android.livesdk.model.message.b.h> map, Map<Long, com.bytedance.android.livesdkapi.depend.model.live.a.d> map2) {
        b(map2);
        this.f10720k = true;
        if (this.f10718i) {
            com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "dealResult, Battle state is End");
        } else if (com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a(com.bytedance.android.live.liveinteract.match.b.b.c.PUNISH)) {
            com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "dealResult, Battle state is " + com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a() + ", return");
        } else if (this.f10719j) {
            com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "dealResult, current is showing result animation");
        } else {
            this.f10719j = true;
            Room room = this.f10711b;
            if (room == null) {
                h.f.b.l.a("mRoom");
            }
            com.bytedance.android.livesdk.model.message.b.h hVar = map.get(Long.valueOf(room.getOwnerUserId()));
            com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10680d = hVar;
            com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10681e = map.get(Long.valueOf(this.f10710a.f9941f));
            AbstractC0200b bVar = (AbstractC0200b) this.y;
            if (bVar != null) {
                bVar.a(hVar, new k(this, hVar));
            }
        }
    }

    public final void a(String str) {
        f.a.b.b bVar;
        if (!this.f10718i) {
            this.f10718i = true;
            if (com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a(com.bytedance.android.live.liveinteract.match.b.b.c.END, false)) {
                if (!this.f10712c) {
                    com.bytedance.android.live.liveinteract.platform.common.g.b.a(str);
                }
                com.bytedance.android.livesdk.performance.g.f();
                com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.p = 0;
                DataChannel dataChannel = this.w;
                if (dataChannel != null) {
                    dataChannel.c(com.bytedance.android.live.liveinteract.cohost.a.b.b.class);
                }
                f.a.b.b bVar2 = this.f10713d;
                if (!(bVar2 == null || bVar2.isDisposed() || (bVar = this.f10713d) == null)) {
                    bVar.dispose();
                }
                this.f10715f.removeCallbacksAndMessages(null);
                com.bytedance.android.live.liveinteract.match.b.b.a.a("battle_end", 0);
            }
        }
    }

    public final void a(Map<Long, com.bytedance.android.livesdk.model.message.b.n> map) {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        com.bytedance.android.livesdk.model.message.b.a aVar;
        com.bytedance.android.livesdk.model.message.b.q qVar;
        com.bytedance.android.livesdk.model.message.b.o oVar;
        com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.t.clear();
        for (Map.Entry<Long, com.bytedance.android.livesdk.model.message.b.n> entry : map.entrySet()) {
            com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.t.put(entry.getKey(), Long.valueOf((long) entry.getValue().f19284a));
        }
        Room room = this.f10711b;
        if (room == null) {
            h.f.b.l.a("mRoom");
        }
        com.bytedance.android.livesdk.model.message.b.n nVar = map.get(Long.valueOf(room.getOwnerUserId()));
        if (nVar != null) {
            List<com.bytedance.android.livesdk.model.message.b.o> list = nVar.f19285b;
            if (!(list == null || list.isEmpty() || (aVar = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.r) == null || (qVar = aVar.f19255d) == null || qVar.f19296b <= 0)) {
                int i2 = qVar.f19296b;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (!(i3 >= (list != null ? Integer.valueOf(list.size()) : null).intValue() || list == null || (oVar = list.get(i3)) == null)) {
                        long j2 = oVar.f19289a;
                        com.bytedance.android.livesdk.at.f b2 = com.bytedance.android.livesdk.userservice.u.a().b();
                        h.f.b.l.b(b2, "");
                        if (j2 == b2.c()) {
                            com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.s = true;
                        }
                    }
                }
            }
            if (!(nVar == null || (dataChannel2 = this.w) == null)) {
                dataChannel2.b(com.bytedance.android.live.liveinteract.match.b.c.d.class, Integer.valueOf(nVar.f19284a)).b(com.bytedance.android.live.liveinteract.match.b.c.f.class, nVar.f19285b);
            }
        }
        com.bytedance.android.livesdk.model.message.b.n nVar2 = map.get(Long.valueOf(this.f10710a.f9941f));
        if (!(nVar2 == null || (dataChannel = this.w) == null)) {
            dataChannel.b(com.bytedance.android.live.liveinteract.match.b.c.j.class, Integer.valueOf(nVar2.f19284a)).b(com.bytedance.android.live.liveinteract.match.b.c.g.class, nVar2.f19285b);
        }
    }

    public static final class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ b f10736a;

        static {
            Covode.recordClassIndex(5738);
        }

        d(b bVar) {
            this.f10736a = bVar;
        }

        public final void run() {
            if (this.f10736a.y != null) {
                this.f10736a.a();
            }
        }
    }

    @Override // com.bytedance.ies.a.b, com.bytedance.android.livesdk.chatroom.e.r
    public final void b() {
        super.b();
        f.a.b.b bVar = this.f10713d;
        if (bVar != null) {
            bVar.dispose();
        }
        f.a.b.b bVar2 = this.f10714e;
        if (bVar2 != null) {
            bVar2.dispose();
        }
        this.f10715f.removeCallbacksAndMessages(null);
    }

    public final void c() {
        this.f10715f.postDelayed(new d(this), 1000);
    }

    public final void e() {
        if (com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a(com.bytedance.android.live.liveinteract.match.b.b.c.FINISH, false)) {
            if (this.f10712c) {
                a(106, false, false, null);
            } else {
                a();
            }
        }
    }

    static final class ad implements f.a.d.a {

        /* renamed from: a */
        final /* synthetic */ b f10726a;

        static {
            Covode.recordClassIndex(5731);
        }

        ad(b bVar) {
            this.f10726a = bVar;
        }

        @Override // f.a.d.a
        public final void a() {
            com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "startPunishCountDown, finish");
            DataChannel dataChannel = this.f10726a.w;
            if (dataChannel != null) {
                dataChannel.b(com.bytedance.android.live.liveinteract.match.b.c.h.class, (Object) 0L);
            }
            if (this.f10726a.f10712c) {
                com.bytedance.android.live.liveinteract.platform.common.g.b.b(b.a.TIME_OUT);
                this.f10726a.a((b) 102, false, (boolean) null);
                return;
            }
            this.f10726a.a("punish_count_down");
        }
    }

    static final class z implements f.a.d.a {

        /* renamed from: a */
        final /* synthetic */ b f10777a;

        /* renamed from: b */
        final /* synthetic */ boolean f10778b;

        static {
            Covode.recordClassIndex(5763);
        }

        z(b bVar, boolean z) {
            this.f10777a = bVar;
            this.f10778b = z;
        }

        @Override // f.a.d.a
        public final void a() {
            boolean z = this.f10778b;
            com.bytedance.android.live.liveinteract.match.c.a.a(com.bytedance.android.live.liveinteract.match.c.a.f10803g, "open_message_timer_complete", new JSONObject(), z, 8);
            com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "startBattleOpenTimeOutCountDown, finish");
            this.f10777a.a(107, true, false, null);
        }
    }

    public b() {
        boolean z2;
        if (EnableBattleUiNewStyleSetting.INSTANCE.getValue() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f10722m = z2;
        this.f10710a = b.a.a();
    }

    public final void f() {
        String a2;
        if (!this.f10718i) {
            b.a.a();
            User user = (User) com.bytedance.android.live.liveinteract.api.a.b.c("data_guest_user");
            if (user != null) {
                if (com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10686j) {
                    a2 = com.bytedance.android.live.core.f.y.a((int) R.string.e_w, user.displayId);
                } else {
                    a2 = com.bytedance.android.live.core.f.y.a((int) R.string.e_x, user.displayId);
                }
                ao.a(com.bytedance.android.live.core.f.y.e(), a2, 0);
            }
        }
    }

    public static final class p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ b f10761a;

        static {
            Covode.recordClassIndex(5751);
        }

        p(b bVar) {
            this.f10761a = bVar;
        }

        public final void run() {
            if (!com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a(com.bytedance.android.live.liveinteract.match.b.b.c.FINISH) && !this.f10761a.f10712c) {
                com.bytedance.android.livesdk.model.message.b.b bVar = new com.bytedance.android.livesdk.model.message.b.b();
                com.bytedance.android.livesdk.model.message.b.f fVar = new com.bytedance.android.livesdk.model.message.b.f();
                fVar.f19264a = com.bytedance.android.live.core.f.y.a((int) R.string.e9v);
                bVar.f19256a = fVar;
                com.bytedance.android.livesdk.model.message.ao aoVar = new com.bytedance.android.livesdk.model.message.ao();
                com.bytedance.android.livesdkapi.h.b bVar2 = new com.bytedance.android.livesdkapi.h.b();
                bVar2.f23211c = b.b(this.f10761a).getId();
                bVar2.f23215g = true;
                aoVar.O = bVar2;
                aoVar.f19174a = 3;
                aoVar.f19178i = bVar;
                aoVar.f19180k = true;
                this.f10761a.x.insertMessage(aoVar);
            }
        }
    }

    public static final class v implements f.a.d.a {

        /* renamed from: a */
        final /* synthetic */ b f10771a;

        static {
            Covode.recordClassIndex(5757);
        }

        v(b bVar) {
            this.f10771a = bVar;
        }

        @Override // f.a.d.a
        public final void a() {
            com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "BattleCountDown, finish");
            if (this.f10771a.f10722m) {
                ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) f.a.t.b(LiveTimeIncrementForBattleSetting.INSTANCE.getValue(), TimeUnit.SECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(this.f10771a.t())).a(new f.a.d.f(this) {
                    /* class com.bytedance.android.live.liveinteract.match.b.g.b.v.AnonymousClass1 */

                    /* renamed from: a */
                    final /* synthetic */ v f10772a;

                    static {
                        Covode.recordClassIndex(5758);
                    }

                    {
                        this.f10772a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f10772a.f10771a.e();
                    }
                }, new f.a.d.f(this) {
                    /* class com.bytedance.android.live.liveinteract.match.b.g.b.v.AnonymousClass2 */

                    /* renamed from: a */
                    final /* synthetic */ v f10773a;

                    static {
                        Covode.recordClassIndex(5759);
                    }

                    {
                        this.f10773a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f10773a.f10771a.e();
                    }
                });
            } else {
                this.f10771a.e();
            }
        }
    }

    public final void d() {
        com.bytedance.android.live.liveinteract.match.b.b.c a2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a();
        if (a2.compareTo((Enum) com.bytedance.android.live.liveinteract.match.b.b.c.START) >= 0 && a2.compareTo((Enum) com.bytedance.android.live.liveinteract.match.b.b.c.END) < 0) {
            RoomSwitchApi roomSwitchApi = (RoomSwitchApi) com.bytedance.android.live.network.e.a().a(RoomSwitchApi.class);
            Room room = this.f10711b;
            if (room == null) {
                h.f.b.l.a("mRoom");
            }
            ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) roomSwitchApi.updateSwitch(room.getId(), 6, true).a(u())).a(ag.f10734a, ah.f10735a);
        }
    }

    public final void g() {
        com.bytedance.android.livesdk.ap.b<Boolean> bVar;
        AbstractC0200b bVar2;
        if (this.f10712c) {
            bVar = com.bytedance.android.livesdk.ap.a.bW;
        } else {
            bVar = com.bytedance.android.livesdk.ap.a.bX;
        }
        h.f.b.l.b(bVar, "");
        Boolean a2 = bVar.a();
        h.f.b.l.b(a2, "");
        if (!a2.booleanValue() && EnableBattleUiNewStyleSetting.INSTANCE.getValue() != 2 && !TextUtils.isEmpty(this.f10721l) && com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a() == com.bytedance.android.live.liveinteract.match.b.b.c.START && (bVar2 = (AbstractC0200b) this.y) != null) {
            String str = this.f10721l;
            if (str == null) {
                h.f.b.l.b();
            }
            bVar2.a(str);
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) true);
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ com.bytedance.android.livesdk.model.message.b.h $currentAnchorResult;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(5745);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(b bVar, com.bytedance.android.livesdk.model.message.b.h hVar) {
            super(0);
            this.this$0 = bVar;
            this.$currentAnchorResult = hVar;
        }

        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            long value;
            f.a.b.b bVar;
            boolean z;
            this.this$0.f10719j = false;
            if (this.this$0.f10712c) {
                com.bytedance.android.live.liveinteract.platform.common.g.b.a(b.a.TIME_OUT);
            }
            com.bytedance.android.livesdk.model.message.b.h hVar = this.$currentAnchorResult;
            if (hVar == null || hVar.f19268b != 2) {
                DataChannel dataChannel = this.this$0.w;
                if (dataChannel != null) {
                    com.bytedance.android.livesdk.model.message.b.h hVar2 = this.$currentAnchorResult;
                    if (hVar2 == null || hVar2.f19268b != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    dataChannel.b(com.bytedance.android.live.liveinteract.match.b.c.c.class, Boolean.valueOf(z));
                }
                b bVar2 = this.this$0;
                if (com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a(com.bytedance.android.live.liveinteract.match.b.b.c.PUNISH, false)) {
                    com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.p = System.currentTimeMillis();
                    if (com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.q > 0) {
                        value = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.q;
                    } else {
                        value = LiveInteractBattlePunishDurationSetting.INSTANCE.getValue();
                    }
                    com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10685i = value;
                    boolean z2 = bVar2.f10712c;
                    JSONObject jSONObject = new JSONObject();
                    com.bytedance.android.live.core.d.a.a(jSONObject, "count", value);
                    if (z2) {
                        com.bytedance.android.live.liveinteract.match.c.a.a(com.bytedance.android.live.liveinteract.match.c.a.f10803g, "punish_start", jSONObject, false, 12);
                    } else {
                        com.bytedance.android.live.liveinteract.match.c.a.f10803g.a("punish_start", jSONObject, 0);
                    }
                    com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "startPunishCountDown, timeSecond = ".concat(String.valueOf(value)));
                    if (value > 0) {
                        DataChannel dataChannel2 = bVar2.w;
                        if (dataChannel2 != null) {
                            dataChannel2.b(com.bytedance.android.live.liveinteract.match.b.c.h.class, Long.valueOf(value));
                        }
                        f.a.b.b bVar3 = bVar2.f10713d;
                        if (!(bVar3 == null || bVar3.isDisposed() || (bVar = bVar2.f10713d) == null)) {
                            bVar.dispose();
                        }
                        bVar2.f10713d = ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) com.bytedance.android.livesdk.utils.b.b.a(1, TimeUnit.SECONDS).b(value).d(new aa(value)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(bVar2.t())).a(new ab(bVar2), new ac(bVar2), new ad(bVar2));
                    }
                }
            } else {
                this.this$0.a("finish_draw");
            }
            return h.z.f158842a;
        }
    }

    public final void a() {
        if (this.y != null && !this.f10717h) {
            this.f10717h = true;
            long c2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.c();
            long b2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.b();
            com.bytedance.android.live.liveinteract.match.c.a.a("audience_result");
            LinkBattleApi linkBattleApi = (LinkBattleApi) com.bytedance.android.live.network.e.a().a(LinkBattleApi.class);
            Room room = this.f10711b;
            if (room == null) {
                h.f.b.l.a("mRoom");
            }
            long id = room.getId();
            Room room2 = this.f10711b;
            if (room2 == null) {
                h.f.b.l.a("mRoom");
            }
            ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) linkBattleApi.getInfo(id, c2, b2, room2.getOwnerUserId()).a(v())).a(new e(this), new f(this));
        }
    }

    static final class aa<T, R> implements f.a.d.g {

        /* renamed from: a */
        final /* synthetic */ long f10723a;

        static {
            Covode.recordClassIndex(5728);
        }

        aa(long j2) {
            this.f10723a = j2;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            return Long.valueOf(this.f10723a - ((Number) obj).longValue());
        }
    }

    public static final class ah<T> implements f.a.d.f {

        /* renamed from: a */
        public static final ah f10735a = new ah();

        static {
            Covode.recordClassIndex(5735);
        }

        ah() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.e8a);
        }
    }

    public static final class s<T, R> implements f.a.d.g {

        /* renamed from: a */
        final /* synthetic */ long f10768a;

        static {
            Covode.recordClassIndex(5754);
        }

        s(long j2) {
            this.f10768a = j2;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            return Long.valueOf(this.f10768a - ((Number) obj).longValue());
        }
    }

    static final class w<T, R> implements f.a.d.g {

        /* renamed from: a */
        final /* synthetic */ long f10774a;

        static {
            Covode.recordClassIndex(5760);
        }

        w(long j2) {
            this.f10774a = j2;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            return Long.valueOf(this.f10774a - ((Number) obj).longValue());
        }
    }

    public static final /* synthetic */ Room b(b bVar) {
        Room room = bVar.f10711b;
        if (room == null) {
            h.f.b.l.a("mRoom");
        }
        return room;
    }

    private static /* synthetic */ long c(b bVar) {
        return bVar.a(System.currentTimeMillis());
    }

    static final class ac<T> implements f.a.d.f {

        /* renamed from: a */
        final /* synthetic */ b f10725a;

        static {
            Covode.recordClassIndex(5730);
        }

        ac(b bVar) {
            this.f10725a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "startPunishCountDown, throwable = ".concat(String.valueOf(th)));
            b bVar = this.f10725a;
            if (th == null) {
                h.f.b.l.b();
            }
            bVar.a(th);
        }
    }

    static final class ae<T> implements f.a.d.f {

        /* renamed from: a */
        final /* synthetic */ boolean f10727a;

        /* renamed from: b */
        final /* synthetic */ HashMap f10728b;

        /* renamed from: c */
        final /* synthetic */ int f10729c;

        static {
            Covode.recordClassIndex(5732);
        }

        ae(boolean z, HashMap hashMap, int i2) {
            this.f10727a = z;
            this.f10728b = hashMap;
            this.f10729c = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.liveinteract.match.c.a.b(this.f10727a, "other", this.f10728b);
            com.bytedance.android.live.liveinteract.match.b.b.a.a("reject", this.f10729c);
        }
    }

    static final class af<T> implements f.a.d.f {

        /* renamed from: a */
        final /* synthetic */ b f10730a;

        /* renamed from: b */
        final /* synthetic */ boolean f10731b;

        /* renamed from: c */
        final /* synthetic */ HashMap f10732c;

        /* renamed from: d */
        final /* synthetic */ int f10733d;

        static {
            Covode.recordClassIndex(5733);
        }

        af(b bVar, boolean z, HashMap hashMap, int i2) {
            this.f10730a = bVar;
            this.f10731b = z;
            this.f10732c = hashMap;
            this.f10733d = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            b bVar = this.f10730a;
            if (th == null) {
                h.f.b.l.b();
            }
            bVar.a(th);
            com.bytedance.android.live.liveinteract.match.c.a.a(this.f10731b, "other", th, this.f10732c);
            com.bytedance.android.live.liveinteract.match.b.b.a.a("reject", this.f10733d);
        }
    }

    public static final class j<T> implements f.a.d.f {

        /* renamed from: a */
        final /* synthetic */ b f10743a;

        static {
            Covode.recordClassIndex(5744);
        }

        j(b bVar) {
            this.f10743a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "checkBattleInfo, failed");
            com.bytedance.android.live.liveinteract.match.c.a.a("audience_start", th);
            b bVar = this.f10743a;
            if (th == null) {
                h.f.b.l.b();
            }
            bVar.a(th);
        }
    }

    public static final class u<T> implements f.a.d.f {

        /* renamed from: a */
        final /* synthetic */ b f10770a;

        static {
            Covode.recordClassIndex(5756);
        }

        u(b bVar) {
            this.f10770a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "BattleCountDown, throwable = ".concat(String.valueOf(th)));
            b bVar = this.f10770a;
            if (th == null) {
                h.f.b.l.b();
            }
            bVar.a(th);
        }
    }

    static final class x<T> implements f.a.d.f {

        /* renamed from: a */
        public static final x f10775a = new x();

        static {
            Covode.recordClassIndex(5761);
        }

        x() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "startBattleOpenTimeOutCountDown, countdownTime = ".concat(String.valueOf(((Number) obj).longValue())));
        }
    }

    static final class y<T> implements f.a.d.f {

        /* renamed from: a */
        final /* synthetic */ b f10776a;

        static {
            Covode.recordClassIndex(5762);
        }

        y(b bVar) {
            this.f10776a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "startBattleOpenTimeOutCountDown, throwable = ".concat(String.valueOf(th)));
            b bVar = this.f10776a;
            if (th == null) {
                h.f.b.l.b();
            }
            bVar.a(th);
        }
    }

    static final class ab<T> implements f.a.d.f {

        /* renamed from: a */
        final /* synthetic */ b f10724a;

        static {
            Covode.recordClassIndex(5729);
        }

        ab(b bVar) {
            this.f10724a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            long longValue = ((Number) obj).longValue() - 1;
            com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "startPunishCountDown, countdownTime = ".concat(String.valueOf(longValue)));
            DataChannel dataChannel = this.f10724a.w;
            if (dataChannel != null) {
                dataChannel.b(com.bytedance.android.live.liveinteract.match.b.c.h.class, Long.valueOf(longValue));
            }
        }
    }

    public static final class f<T> implements f.a.d.f {

        /* renamed from: a */
        final /* synthetic */ b f10738a;

        static {
            Covode.recordClassIndex(5740);
        }

        f(b bVar) {
            this.f10738a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f10738a.f10717h = false;
            if (this.f10738a.y != null) {
                com.bytedance.android.live.liveinteract.match.c.a.a("audience_result", th);
                com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "audienceSyncBattleInfo, failed");
                b bVar = this.f10738a;
                if (th == null) {
                    h.f.b.l.b();
                }
                bVar.a(th);
                this.f10738a.c();
            }
        }
    }

    public static final class g<T> implements f.a.d.f {

        /* renamed from: a */
        final /* synthetic */ h.f.a.a f10739a;

        static {
            Covode.recordClassIndex(5741);
        }

        g(h.f.a.a aVar) {
            this.f10739a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            h.f.a.a aVar = this.f10739a;
            if (aVar != null) {
                aVar.invoke();
            }
            com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "cancel, success");
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - com.bytedance.android.live.liveinteract.match.c.a.f10799c);
            com.bytedance.android.live.liveinteract.match.c.a.a(com.bytedance.android.live.liveinteract.match.c.a.f10803g, "cancel_succeed", jSONObject, false, 12);
            com.bytedance.android.live.liveinteract.match.b.b.a.a("cancel_success", 0);
        }
    }

    public static final class h<T> implements f.a.d.f {

        /* renamed from: a */
        final /* synthetic */ b f10740a;

        /* renamed from: b */
        final /* synthetic */ h.f.a.a f10741b;

        static {
            Covode.recordClassIndex(5742);
        }

        h(b bVar, h.f.a.a aVar) {
            this.f10740a = bVar;
            this.f10741b = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.liveinteract.match.c.a.a(jSONObject, th);
            com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - com.bytedance.android.live.liveinteract.match.c.a.f10799c);
            com.bytedance.android.live.liveinteract.match.c.a.a("cancel_failed", jSONObject, false, 1);
            h.f.a.a aVar = this.f10741b;
            if (aVar != null) {
                aVar.invoke();
            }
            com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "cancel, failed");
            AbstractC0200b bVar = (AbstractC0200b) this.f10740a.y;
            if (bVar != null) {
                bVar.b(th);
            }
            if (th != null) {
                this.f10740a.a(th);
            }
        }
    }

    public static final class t<T> implements f.a.d.f {

        /* renamed from: a */
        final /* synthetic */ b f10769a;

        static {
            Covode.recordClassIndex(5755);
        }

        t(b bVar) {
            this.f10769a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            long longValue = ((Number) obj).longValue() - 1;
            com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "BattleCountDown, countdownTime = ".concat(String.valueOf(longValue)));
            DataChannel dataChannel = this.f10769a.w;
            if (dataChannel != null) {
                dataChannel.b(com.bytedance.android.live.liveinteract.match.b.c.m.class, Long.valueOf(longValue));
            }
        }
    }

    private final void b(an anVar) {
        List<com.bytedance.android.livesdk.model.message.b.s> list = anVar.f19171k;
        if (list != null) {
            HashMap hashMap = new HashMap();
            for (T t2 : list) {
                if (!(t2.f19299a == null || t2.f19300b == null)) {
                    Long l2 = t2.f19299a;
                    if (l2 == null) {
                        h.f.b.l.b();
                    }
                    com.bytedance.android.livesdk.model.message.b.n nVar = t2.f19300b;
                    if (nVar == null) {
                        h.f.b.l.b();
                    }
                    hashMap.put(l2, nVar);
                }
            }
            a(hashMap);
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.b<Boolean, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(5737);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            b bVar = this.this$0;
            long value = LiveInteractBattleOpenTimeoutSetting.INSTANCE.getValue();
            f.a.b.b bVar2 = bVar.f10714e;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "count", String.valueOf((int) value));
            com.bytedance.android.live.liveinteract.match.c.a.a(com.bytedance.android.live.liveinteract.match.c.a.f10803g, "open_message_timer_start", jSONObject, booleanValue, 8);
            bVar.f10714e = ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) com.bytedance.android.livesdk.utils.b.b.a(1, TimeUnit.SECONDS).b(value).d(new w(value)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(bVar.t())).a(x.f10775a, new y(bVar), new z(bVar, booleanValue));
            return h.z.f158842a;
        }
    }

    public static final class e<T> implements f.a.d.f {

        /* renamed from: a */
        final /* synthetic */ b f10737a;

        static {
            Covode.recordClassIndex(5739);
        }

        e(b bVar) {
            this.f10737a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            this.f10737a.f10717h = false;
            if (this.f10737a.y != null) {
                com.bytedance.android.livesdkapi.depend.model.live.a.e eVar = (com.bytedance.android.livesdkapi.depend.model.live.a.e) dVar.data;
                String b2 = e.a.f9629c.b(eVar);
                h.f.b.l.b(b2, "");
                com.bytedance.android.live.liveinteract.match.c.a.a("audience_result", b2);
                com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "audienceSyncBattleInfo, info = ".concat(String.valueOf(eVar)));
                com.bytedance.android.livesdk.model.message.b.j jVar = eVar.f23074c;
                if (jVar == null) {
                    return;
                }
                if (jVar.f19275e > 1) {
                    Map<Long, com.bytedance.android.livesdk.model.message.b.h> map = eVar.f23076e;
                    if (map != null) {
                        if (this.f10737a.f10720k && this.f10737a.n != null) {
                            am amVar = this.f10737a.n;
                            if (amVar == null) {
                                h.f.b.l.b();
                            }
                            com.bytedance.android.live.liveinteract.match.c.a.a(map, amVar, this.f10737a.f10712c);
                        }
                        this.f10737a.a(map, eVar.f23081j);
                        return;
                    }
                    return;
                }
                this.f10737a.c();
            }
        }
    }

    public static final class m<T> implements f.a.d.f {

        /* renamed from: a */
        final /* synthetic */ b f10748a;

        /* renamed from: b */
        final /* synthetic */ h.f.a.a f10749b;

        /* renamed from: c */
        final /* synthetic */ boolean f10750c;

        /* renamed from: d */
        final /* synthetic */ boolean f10751d;

        static {
            Covode.recordClassIndex(5747);
        }

        m(b bVar, h.f.a.a aVar, boolean z, boolean z2) {
            this.f10748a = bVar;
            this.f10749b = aVar;
            this.f10750c = z;
            this.f10751d = z2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            h.f.a.a aVar = this.f10749b;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f10748a.f10716g = false;
            if (this.f10748a.y != null) {
                boolean z = this.f10750c;
                boolean z2 = this.f10751d;
                JSONObject jSONObject = new JSONObject();
                com.bytedance.android.live.liveinteract.match.c.a.a(jSONObject, th);
                com.bytedance.android.live.core.d.a.a(jSONObject, "cut_short", String.valueOf(z ? 1 : 0));
                com.bytedance.android.live.core.d.a.a(jSONObject, "other_left", String.valueOf(z2 ? 1 : 0));
                com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - com.bytedance.android.live.liveinteract.match.c.a.f10801e);
                com.bytedance.android.live.liveinteract.match.c.a.a("battle_finish_failed", jSONObject, false, 1);
                com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "finish, failed");
                if (!this.f10750c) {
                    this.f10748a.f10715f.postDelayed(new Runnable(this) {
                        /* class com.bytedance.android.live.liveinteract.match.b.g.b.m.AnonymousClass1 */

                        /* renamed from: a */
                        final /* synthetic */ m f10752a;

                        static {
                            Covode.recordClassIndex(5748);
                        }

                        {
                            this.f10752a = r1;
                        }

                        public final void run() {
                            this.f10752a.f10748a.a(105, false, false, null);
                        }
                    }, 1000);
                }
                b bVar = this.f10748a;
                if (th == null) {
                    h.f.b.l.b();
                }
                bVar.a(th);
            }
        }
    }

    public static final class q<T> implements f.a.d.f {

        /* renamed from: a */
        final /* synthetic */ b f10762a;

        /* renamed from: b */
        final /* synthetic */ boolean f10763b;

        /* renamed from: c */
        final /* synthetic */ h.f.a.a f10764c;

        static {
            Covode.recordClassIndex(5752);
        }

        q(b bVar, boolean z, h.f.a.a aVar) {
            this.f10762a = bVar;
            this.f10763b = z;
            this.f10764c = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "punish, success");
            if (this.f10763b) {
                this.f10762a.a("punish_cut_short_request");
            }
            boolean z = this.f10763b;
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "cut_short", String.valueOf(z ? 1 : 0));
            com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - com.bytedance.android.live.liveinteract.match.c.a.f10802f);
            com.bytedance.android.live.liveinteract.match.c.a.a(com.bytedance.android.live.liveinteract.match.c.a.f10803g, "punish_finish_succeed", jSONObject, false, 12);
            h.f.a.a aVar = this.f10764c;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public static final class r<T> implements f.a.d.f {

        /* renamed from: a */
        final /* synthetic */ b f10765a;

        /* renamed from: b */
        final /* synthetic */ boolean f10766b;

        /* renamed from: c */
        final /* synthetic */ h.f.a.a f10767c;

        static {
            Covode.recordClassIndex(5753);
        }

        r(b bVar, boolean z, h.f.a.a aVar) {
            this.f10765a = bVar;
            this.f10766b = z;
            this.f10767c = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "punish, failed");
            boolean z = this.f10766b;
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.liveinteract.match.c.a.a(jSONObject, th);
            com.bytedance.android.live.core.d.a.a(jSONObject, "cut_short", String.valueOf(z ? 1 : 0));
            com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - com.bytedance.android.live.liveinteract.match.c.a.f10802f);
            com.bytedance.android.live.liveinteract.match.c.a.a("punish_finish_failed", jSONObject, false, 1);
            h.f.a.a aVar = this.f10767c;
            if (aVar != null) {
                aVar.invoke();
            }
            b bVar = this.f10765a;
            if (th == null) {
                h.f.b.l.b();
            }
            bVar.a(th);
        }
    }

    private final void b(long j2) {
        f.a.b.b bVar;
        com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "BattleCountDown, timeSecond = ".concat(String.valueOf(j2)));
        if (j2 > 0) {
            DataChannel dataChannel = this.w;
            if (dataChannel != null) {
                dataChannel.b(com.bytedance.android.live.liveinteract.match.b.c.m.class, Long.valueOf(j2));
            }
            f.a.b.b bVar2 = this.f10713d;
            if (!(bVar2 == null || bVar2.isDisposed() || (bVar = this.f10713d) == null)) {
                bVar.dispose();
            }
            this.f10713d = ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) com.bytedance.android.livesdk.utils.b.b.a(1, TimeUnit.SECONDS).b(j2).d(new s(j2)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(t())).a(new t(this), new u(this), new v(this));
        }
    }

    public final long a(long j2) {
        long value;
        com.bytedance.android.livesdk.model.message.b.j jVar = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10677a;
        if (this.f10712c || jVar == null) {
            value = LiveInteractBattleDurationSetting.INSTANCE.getValue();
        } else {
            com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "getBattleRemainSecond, currentTime  = " + j2 + ", localTime = " + System.currentTimeMillis());
            if (j2 <= 0) {
                j2 = System.currentTimeMillis();
            }
            value = ((long) jVar.f19274d) - (Math.max(0L, j2 - jVar.f19273c) / 1000);
        }
        com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "getBattleRemainSecond, remainSecond  = ".concat(String.valueOf(value)));
        return value;
    }

    public static final class l<T> implements f.a.d.f {

        /* renamed from: a */
        final /* synthetic */ b f10744a;

        /* renamed from: b */
        final /* synthetic */ boolean f10745b;

        /* renamed from: c */
        final /* synthetic */ boolean f10746c;

        /* renamed from: d */
        final /* synthetic */ h.f.a.a f10747d;

        static {
            Covode.recordClassIndex(5746);
        }

        l(b bVar, boolean z, boolean z2, h.f.a.a aVar) {
            this.f10744a = bVar;
            this.f10745b = z;
            this.f10746c = z2;
            this.f10747d = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            this.f10744a.f10716g = false;
            Map<Long, com.bytedance.android.livesdk.model.message.b.h> map = ((com.bytedance.android.live.liveinteract.match.d.a) dVar.data).f10807a;
            if (this.f10744a.f10720k && this.f10744a.n != null) {
                am amVar = this.f10744a.n;
                if (amVar == null) {
                    h.f.b.l.b();
                }
                com.bytedance.android.live.liveinteract.match.c.a.a(map, amVar, this.f10744a.f10712c);
            }
            boolean z = this.f10745b;
            boolean z2 = this.f10746c;
            String b2 = e.a.f9629c.b(map);
            h.f.b.l.b(b2, "");
            h.f.b.l.d(b2, "");
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "cut_short", String.valueOf(z ? 1 : 0));
            com.bytedance.android.live.core.d.a.a(jSONObject, "other_left", String.valueOf(z2 ? 1 : 0));
            com.bytedance.android.live.core.d.a.a(jSONObject, "response", b2);
            com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - com.bytedance.android.live.liveinteract.match.c.a.f10801e);
            com.bytedance.android.live.liveinteract.match.c.a.a(com.bytedance.android.live.liveinteract.match.c.a.f10803g, "battle_finish_succeed", jSONObject, false, 12);
            com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "finish, battleResult = ".concat(String.valueOf(map)));
            if (this.f10744a.f10718i) {
                com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "dealResult, Battle state is End, return");
                h.f.a.a aVar = this.f10747d;
                if (aVar != null) {
                    aVar.invoke();
                }
            } else if (com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a(com.bytedance.android.live.liveinteract.match.b.b.c.PUNISH)) {
                com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "dealResult, Battle state is punish, return");
                h.f.a.a aVar2 = this.f10747d;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            } else {
                com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10686j = this.f10745b;
                com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10687k = this.f10745b;
                if (this.f10745b) {
                    this.f10744a.f();
                    this.f10744a.a("cut_short_request");
                } else {
                    Map<Long, com.bytedance.android.livesdk.model.message.b.n> map2 = ((com.bytedance.android.live.liveinteract.match.d.a) dVar.data).f10809c;
                    if (map2 != null) {
                        this.f10744a.a(map2);
                    }
                    this.f10744a.a(map, ((com.bytedance.android.live.liveinteract.match.d.a) dVar.data).f10808b);
                }
                com.bytedance.android.live.core.c.a.a(3, "LinkPKPresenterTag", "finish, success, callback");
                h.f.a.a aVar3 = this.f10747d;
                if (aVar3 != null) {
                    aVar3.invoke();
                }
            }
        }
    }

    public static final class n<T> implements f.a.d.f {

        /* renamed from: a */
        final /* synthetic */ b f10753a;

        /* renamed from: b */
        final /* synthetic */ boolean f10754b;

        /* renamed from: c */
        final /* synthetic */ b.EnumC0251b f10755c;

        /* renamed from: d */
        final /* synthetic */ com.bytedance.android.live.liveinteract.match.b.b.b f10756d;

        static {
            Covode.recordClassIndex(5749);
        }

        n(b bVar, boolean z, b.EnumC0251b bVar2, com.bytedance.android.live.liveinteract.match.b.b.b bVar3) {
            this.f10753a = bVar;
            this.f10754b = z;
            this.f10755c = bVar2;
            this.f10756d = bVar3;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            h.f.b.l.d(dVar, "");
            if (this.f10753a.y != null) {
                com.bytedance.android.live.liveinteract.match.d.b bVar = (com.bytedance.android.live.liveinteract.match.d.b) dVar.data;
                com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "invite, result = ".concat(String.valueOf(bVar)));
                int i2 = bVar.f10812b;
                this.f10753a.w.a(com.bytedance.android.live.liveinteract.api.ag.class, Integer.valueOf(i2));
                if (i2 <= 1) {
                    com.bytedance.android.live.liveinteract.platform.common.g.b.a(this.f10754b, 1, this.f10755c);
                    return;
                }
                this.f10756d.a(bVar.f10811a);
                boolean z = this.f10754b;
                String b2 = e.a.f9629c.b(bVar);
                h.f.b.l.b(b2, "");
                h.f.b.l.d(b2, "");
                JSONObject jSONObject = new JSONObject();
                com.bytedance.android.live.core.d.a.a(jSONObject, "invite_type", String.valueOf(z ? 1 : 0));
                com.bytedance.android.live.core.d.a.a(jSONObject, "response", b2);
                com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - com.bytedance.android.live.liveinteract.match.c.a.f10798b);
                com.bytedance.android.live.liveinteract.match.c.a.a(com.bytedance.android.live.liveinteract.match.c.a.f10803g, "invite_succeed", jSONObject, z, 8);
                com.bytedance.android.live.liveinteract.platform.common.g.b.a(this.f10754b, 0, this.f10755c);
            }
        }
    }

    public static final class o<T> implements f.a.d.f {

        /* renamed from: a */
        final /* synthetic */ b f10757a;

        /* renamed from: b */
        final /* synthetic */ boolean f10758b;

        /* renamed from: c */
        final /* synthetic */ b.EnumC0251b f10759c;

        /* renamed from: d */
        final /* synthetic */ com.bytedance.android.live.liveinteract.match.b.b.b f10760d;

        static {
            Covode.recordClassIndex(5750);
        }

        o(b bVar, boolean z, b.EnumC0251b bVar2, com.bytedance.android.live.liveinteract.match.b.b.b bVar3) {
            this.f10757a = bVar;
            this.f10758b = z;
            this.f10759c = bVar2;
            this.f10760d = bVar3;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (this.f10757a.y != null && th != null) {
                com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "invite, failed");
                boolean z = this.f10758b;
                JSONObject jSONObject = new JSONObject();
                com.bytedance.android.live.core.d.a.a(jSONObject, "invite_type", String.valueOf(z ? 1 : 0));
                com.bytedance.android.live.liveinteract.match.c.a.a(jSONObject, th);
                com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - com.bytedance.android.live.liveinteract.match.c.a.f10798b);
                com.bytedance.android.live.liveinteract.match.c.a.a("invite_failed", jSONObject, z, 1);
                this.f10757a.a(th);
                if (th instanceof com.bytedance.android.live.a.a.b.a) {
                    com.bytedance.android.live.liveinteract.platform.common.g.b.a(this.f10758b, 1, this.f10759c);
                    com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) th;
                    if (!TextUtils.isEmpty(aVar.getPrompt())) {
                        ao.a(com.bytedance.android.live.core.f.y.e(), aVar.getPrompt(), 0);
                    } else {
                        ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.ed8);
                    }
                    this.f10760d.b(this.f10758b, "invite_failed");
                    return;
                }
                com.bytedance.android.live.liveinteract.platform.common.g.b.a(this.f10758b, 2, this.f10759c);
                this.f10760d.b(this.f10758b, "invite_failed");
                ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.go2);
            }
        }
    }

    private final void a(an anVar) {
        Integer valueOf;
        com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "checkBattleInfo, info = " + anVar.getMessageId());
        com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10677a = anVar.f19167g;
        com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.r = anVar.f19169i;
        Map<Long, com.bytedance.android.livesdk.model.message.b.h> map = anVar.f19168h;
        long c2 = c(this);
        com.bytedance.android.livesdk.model.message.b.j jVar = anVar.f19167g;
        if (!(jVar == null || (valueOf = Integer.valueOf(jVar.f19275e)) == null)) {
            if (valueOf.intValue() == 1) {
                if (c2 > 0) {
                    com.bytedance.android.live.liveinteract.platform.common.g.b.b();
                    List<com.bytedance.android.livesdk.model.message.b.p> list = anVar.f19172l;
                    if (list != null) {
                        for (T t2 : list) {
                            Long l2 = t2.f19293a;
                            Room room = this.f10711b;
                            if (room == null) {
                                h.f.b.l.a("mRoom");
                            }
                            long ownerUserId = room.getOwnerUserId();
                            if (l2 != null && l2.longValue() == ownerUserId) {
                                com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.u = t2.f19294b;
                            } else {
                                long j2 = this.f10710a.f9941f;
                                Long l3 = t2.f19293a;
                                if (l3 != null && j2 == l3.longValue()) {
                                    com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.v = t2.f19294b;
                                } else {
                                    com.bytedance.android.live.core.c.a.a(6, "LinkPKPresenterTag", "handleBattleInfo error, anchorInfo unknown user id");
                                }
                            }
                        }
                    }
                    com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10689m = true;
                    a(c2, anVar.f19170j);
                    b(anVar);
                    this.f10721l = com.bytedance.android.livesdk.i18n.b.a().a("pm_mt_live_rulesofmatch");
                    g();
                    return;
                }
                return;
            } else if (valueOf.intValue() == 3) {
                long value = c2 + LiveInteractBattlePunishDurationSetting.INSTANCE.getValue();
                if (value > 0) {
                    com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.q = value;
                    b(anVar);
                    if (map != null) {
                        a(map, anVar.f19170j);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        com.bytedance.android.live.liveinteract.match.b.b.a.a("check_info", 0);
    }

    private final void b(Map<Long, com.bytedance.android.livesdkapi.depend.model.live.a.d> map) {
        if (map != null) {
            com.bytedance.android.live.liveinteract.match.b.b.b bVar = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a;
            Room room = this.f10711b;
            if (room == null) {
                h.f.b.l.a("mRoom");
            }
            bVar.f10682f = map.get(Long.valueOf(room.getOwnerUserId()));
            com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10683g = map.get(Long.valueOf(this.f10710a.f9941f));
        }
    }

    public static final class i<T> implements f.a.d.f {

        /* renamed from: a */
        final /* synthetic */ b f10742a;

        static {
            Covode.recordClassIndex(5743);
        }

        i(b bVar) {
            this.f10742a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            long j2;
            Integer num;
            com.bytedance.android.livesdkapi.depend.model.live.a.i iVar;
            com.bytedance.android.livesdkapi.depend.model.live.a.i iVar2;
            AbstractC0200b bVar;
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            if (this.f10742a.y != null) {
                com.bytedance.android.livesdkapi.depend.model.live.a.e eVar = (com.bytedance.android.livesdkapi.depend.model.live.a.e) dVar.data;
                String b2 = e.a.f9629c.b(eVar);
                h.f.b.l.b(b2, "");
                com.bytedance.android.live.liveinteract.match.c.a.a("audience_start", b2);
                com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "checkBattleInfo, info = ".concat(String.valueOf(eVar)));
                com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10677a = eVar.f23074c;
                com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.r = eVar.f23080i;
                Map<Long, com.bytedance.android.livesdk.model.message.b.h> map = eVar.f23076e;
                b bVar2 = this.f10742a;
                Extra extra = dVar.extra;
                if (extra != null) {
                    j2 = extra.now;
                } else {
                    j2 = 0;
                }
                long a2 = bVar2.a(j2);
                com.bytedance.android.livesdk.model.message.b.j jVar = eVar.f23074c;
                Boolean bool = null;
                if (jVar != null) {
                    num = Integer.valueOf(jVar.f19275e);
                } else {
                    num = null;
                }
                boolean z = false;
                if (num != null) {
                    if (num.intValue() == 1) {
                        if (a2 > 0) {
                            com.bytedance.android.live.liveinteract.platform.common.g.b.b();
                            Map<Long, com.bytedance.android.livesdkapi.depend.model.live.a.i> map2 = eVar.f23077f;
                            com.bytedance.android.live.liveinteract.match.b.b.b bVar3 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a;
                            if (map2 != null) {
                                iVar = map2.get(Long.valueOf(b.b(this.f10742a).getOwnerUserId()));
                            } else {
                                iVar = null;
                            }
                            bVar3.u = iVar;
                            com.bytedance.android.live.liveinteract.match.b.b.b bVar4 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a;
                            if (map2 != null) {
                                iVar2 = map2.get(Long.valueOf(this.f10742a.f10710a.f9941f));
                            } else {
                                iVar2 = null;
                            }
                            bVar4.v = iVar2;
                            Map<Long, Boolean> map3 = eVar.f23079h;
                            if (map3 != null) {
                                bool = map3.get(1L);
                            }
                            com.bytedance.android.live.liveinteract.match.b.b.b bVar5 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a;
                            if (bool != null) {
                                z = bool.booleanValue();
                            }
                            bVar5.f10689m = z;
                            com.bytedance.android.livesdkapi.depend.model.live.a.h hVar = eVar.f23082k;
                            if (!(hVar == null || (bVar = (AbstractC0200b) this.f10742a.y) == null)) {
                                bVar.a(hVar);
                            }
                            this.f10742a.a(a2, eVar.f23081j);
                            Map<Long, com.bytedance.android.livesdk.model.message.b.n> map4 = eVar.f23075d;
                            if (map4 != null) {
                                this.f10742a.a(map4);
                            }
                            this.f10742a.f10721l = eVar.f23078g;
                            this.f10742a.g();
                            return;
                        }
                        return;
                    } else if (num.intValue() == 3) {
                        long value = a2 + LiveInteractBattlePunishDurationSetting.INSTANCE.getValue();
                        if (value > 0) {
                            com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.q = value;
                            Map<Long, com.bytedance.android.livesdk.model.message.b.n> map5 = eVar.f23075d;
                            if (map5 != null) {
                                this.f10742a.a(map5);
                            }
                            if (map != null) {
                                this.f10742a.a(map, eVar.f23081j);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                com.bytedance.android.live.liveinteract.match.b.b.a.a("check_info", 0);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0534, code lost:
        if (r8 < r0) goto L_0x0536;
     */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r19) {
        /*
        // Method dump skipped, instructions count: 1644
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.match.b.g.b.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    private static boolean a(long j2, boolean z2) {
        com.bytedance.android.live.liveinteract.match.b.b.b bVar;
        if (z2) {
            bVar = com.bytedance.android.live.liveinteract.match.b.b.a.f10675b;
        } else {
            bVar = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a;
        }
        if (j2 == bVar.b()) {
            return true;
        }
        return false;
    }

    public final void a(long j2, Map<Long, com.bytedance.android.livesdkapi.depend.model.live.a.d> map) {
        com.bytedance.android.livesdk.performance.g.e();
        this.f10718i = false;
        this.f10720k = false;
        b(map);
        com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a(com.bytedance.android.live.liveinteract.match.b.b.c.START, true);
        com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.o = System.currentTimeMillis();
        com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10684h = j2;
        com.bytedance.android.live.liveinteract.match.c.a.a(this.f10712c, j2);
        b(j2);
        this.f10715f.removeCallbacksAndMessages(null);
        if (j2 > 1) {
            this.f10715f.postDelayed(new p(this), 1000);
        }
    }

    public final void a(int i2, boolean z2, h.f.a.a<h.z> aVar) {
        if (this.y != null) {
            com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "punish, cutShort = ".concat(String.valueOf(z2)));
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "source", String.valueOf(i2));
            com.bytedance.android.live.core.d.a.a(jSONObject, "cut_short", String.valueOf(z2 ? 1 : 0));
            com.bytedance.android.live.liveinteract.match.c.a.a(com.bytedance.android.live.liveinteract.match.c.a.f10803g, "punish_finish_request", jSONObject, false, 12);
            com.bytedance.android.live.liveinteract.match.c.a.f10802f = System.currentTimeMillis();
            com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10688l = z2;
            long c2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.c();
            LinkBattleApi linkBattleApi = (LinkBattleApi) com.bytedance.android.live.network.e.a().a(LinkBattleApi.class);
            Room room = this.f10711b;
            if (room == null) {
                h.f.b.l.a("mRoom");
            }
            ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) linkBattleApi.punish(room.getId(), c2, z2).a(v())).a(new q(this, z2, aVar), new r(this, z2, aVar));
            if (!z2) {
                a("punish_request");
            }
        }
    }

    public final void a(int i2, boolean z2, boolean z3, h.f.a.a<h.z> aVar) {
        com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "finish, cutShort = " + z2 + "  isFinishing = " + this.f10716g);
        if (this.y == null) {
            if (aVar != null) {
                aVar.invoke();
            }
            com.bytedance.android.live.core.c.a.a(4, "LinkPKPresenterTag", "finish, viewInterface == null");
        } else if (!this.f10716g) {
            this.f10716g = true;
            long c2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.c();
            long b2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.b();
            long j2 = b.a.a().f9941f;
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "source", String.valueOf(i2));
            com.bytedance.android.live.core.d.a.a(jSONObject, "cut_short", String.valueOf(z2 ? 1 : 0));
            com.bytedance.android.live.core.d.a.a(jSONObject, "other_left", String.valueOf(z3 ? 1 : 0));
            com.bytedance.android.live.liveinteract.match.c.a.a(com.bytedance.android.live.liveinteract.match.c.a.f10803g, "battle_finish_request", jSONObject, false, 12);
            com.bytedance.android.live.liveinteract.match.c.a.f10801e = System.currentTimeMillis();
            ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) ((LinkBattleApi) com.bytedance.android.live.network.e.a().a(LinkBattleApi.class)).finish(c2, b2, z2, z3, j2).a(v())).a(new l(this, z2, z3, aVar), new m(this, aVar, z2, z3));
        } else if (aVar != null) {
            aVar.invoke();
        }
    }
}

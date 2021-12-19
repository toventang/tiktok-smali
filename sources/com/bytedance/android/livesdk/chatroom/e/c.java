package com.bytedance.android.livesdk.chatroom.e;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.h;
import com.bytedance.android.live.network.e;
import com.bytedance.android.live.p.l;
import com.bytedance.android.livesdk.chatroom.CommentApi;
import com.bytedance.android.livesdk.chatroom.c.ae;
import com.bytedance.android.livesdk.chatroom.c.af;
import com.bytedance.android.livesdk.chatroom.c.ah;
import com.bytedance.android.livesdk.chatroom.c.m;
import com.bytedance.android.livesdk.chatroom.g.f;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.chatroom.model.d;
import com.bytedance.android.livesdk.chatroom.viewmodule.bq;
import com.bytedance.android.livesdk.chatroom.viewmodule.bt;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreloadFirstScreenFrameSetting;
import com.bytedance.android.livesdk.model.message.cb;
import com.bytedance.android.livesdk.model.message.i;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import f.a.t;
import java.util.HashMap;

public final class c extends r<a> implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    boolean f15339a = true;

    /* renamed from: b  reason: collision with root package name */
    public Room f15340b;

    /* renamed from: c  reason: collision with root package name */
    public f.a.b.a f15341c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f15342d = true;

    public interface a extends bq {
        static {
            Covode.recordClassIndex(8482);
        }

        void a();

        void a(ah ahVar, Exception exc);

        void a(Barrage barrage);

        void a(d dVar);

        void a(i iVar);

        void a(i iVar, m.a aVar);

        void a(Exception exc);

        void a(boolean z);

        void b(Exception exc);

        void b(boolean z);
    }

    static {
        Covode.recordClassIndex(8480);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.e.c$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15343a;

        static {
            Covode.recordClassIndex(8481);
            int[] iArr = new int[com.bytedance.android.livesdk.model.message.a.a.values().length];
            f15343a = iArr;
            try {
                iArr[com.bytedance.android.livesdk.model.message.a.a.ROOM_VERIFY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @Override // com.bytedance.ies.a.b, com.bytedance.android.livesdk.chatroom.e.r
    public final void b() {
        super.b();
        f.a.b.a aVar = this.f15341c;
        if (aVar != null) {
            aVar.dispose();
        }
        this.f15341c = null;
        f.f15527b = null;
        f.f15526a.f14192a = 0;
    }

    private void a(boolean z) {
        String str;
        if (z) {
            l.GIFT.show(this.w);
            this.w.c(h.class);
        } else {
            l.GIFT.hide(this.w);
        }
        com.bytedance.android.livesdk.ab.i.b();
        com.bytedance.android.livesdk.ab.i.b("ttlive_gift", "Gift icon status changed, visiable:" + z + ", reason:CommentPresenter sendGiftVisibilityCommand");
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "TOOLBAR_GIFT_ON_COMMAND");
        if (z) {
            str = "VISIBLE";
        } else {
            str = "GONE";
        }
        hashMap.put("view_status", str);
        com.bytedance.android.livesdk.ab.i.b().b("ttlive_gift", hashMap);
    }

    public final void a(ae aeVar) {
        if (this.f15341c == null || TextUtils.isEmpty(aeVar.f15078a) || !this.f15339a) {
            com.bytedance.android.livesdk.an.a.a().a(new af(aeVar, false));
            return;
        }
        String str = null;
        if (aeVar.f15079b.get("live.intent.extra.ENTER_LIVE_SOURCE") instanceof String) {
            str = (String) aeVar.f15079b.get("live.intent.extra.ENTER_LIVE_SOURCE");
        }
        this.f15339a = false;
        f.a.b.a aVar = this.f15341c;
        String str2 = aeVar.f15078a;
        long id = this.f15340b.getId();
        String requestId = this.f15340b.getRequestId();
        String labels = this.f15340b.getLabels();
        h.f.b.l.d(str2, "");
        t<R> a2 = ((CommentApi) e.a().a(CommentApi.class)).sendBarrage(bt.a(str2, id, requestId, labels, str, 0, false)).a(new com.bytedance.android.livesdk.util.rxutils.f());
        h.f.b.l.b(a2, "");
        aVar.a(a2.a(new g(this, aeVar), new h(this, aeVar)));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (this.y != null && iMessage != null && (iMessage instanceof com.bytedance.android.livesdk.ac.b.a) && AnonymousClass1.f15343a[((com.bytedance.android.livesdkapi.h.a) iMessage).L.ordinal()] == 1 && (iMessage instanceof cb)) {
            int i2 = ((cb) iMessage).f19460a;
            if (i2 == 12) {
                Room room = this.f15340b;
                if (room != null && room.mRoomAuthStatus != null) {
                    this.f15340b.mRoomAuthStatus.enableDigg = false;
                }
            } else if (i2 != 13) {
                switch (i2) {
                    case 3:
                        Room room2 = this.f15340b;
                        if (!(room2 == null || room2.mRoomAuthStatus == null)) {
                            this.f15340b.mRoomAuthStatus.setEnableChat(false);
                        }
                        f.a();
                        ((a) this.y).b(false);
                        return;
                    case 4:
                        Room room3 = this.f15340b;
                        if (!(room3 == null || room3.mRoomAuthStatus == null)) {
                            this.f15340b.mRoomAuthStatus.setEnableChat(true);
                        }
                        f.a();
                        ((a) this.y).b(true);
                        return;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        this.f15342d = false;
                        Room room4 = this.f15340b;
                        if (!(room4 == null || room4.mRoomAuthStatus == null)) {
                            this.f15340b.mRoomAuthStatus.enableDanmaku = false;
                        }
                        ((a) this.y).a(this.f15342d);
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        this.f15342d = true;
                        Room room5 = this.f15340b;
                        if (!(room5 == null || room5.mRoomAuthStatus == null)) {
                            this.f15340b.mRoomAuthStatus.enableDanmaku = true;
                        }
                        ((a) this.y).a(this.f15342d);
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        Room room6 = this.f15340b;
                        if (!(room6 == null || room6.mRoomAuthStatus == null)) {
                            this.f15340b.mRoomAuthStatus.enableGift = false;
                        }
                        a(false);
                        return;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        Room room7 = this.f15340b;
                        if (!(room7 == null || room7.mRoomAuthStatus == null)) {
                            this.f15340b.mRoomAuthStatus.enableGift = true;
                        }
                        a(true);
                        return;
                    default:
                        return;
                }
            } else {
                Room room8 = this.f15340b;
                if (room8 != null && room8.mRoomAuthStatus != null) {
                    this.f15340b.mRoomAuthStatus.enableDigg = true;
                }
            }
        }
    }

    public final void a(ah ahVar) {
        if (this.f15341c == null || TextUtils.isEmpty(ahVar.b())) {
            com.bytedance.android.livesdk.an.a.a().a(new af(ahVar, false));
            return;
        }
        String str = null;
        if (ahVar.f().get("live.intent.extra.ENTER_LIVE_SOURCE") instanceof String) {
            str = (String) ahVar.f().get("live.intent.extra.ENTER_LIVE_SOURCE");
        }
        i mockChatMessage = ((com.bytedance.android.live.publicscreen.a.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.publicscreen.a.e.class)).mockChatMessage(this.f15340b.getId(), ahVar.b(), (User) u.a().b().a());
        ((a) this.y).a(mockChatMessage);
        long uptimeMillis = SystemClock.uptimeMillis();
        f.a.b.a aVar = this.f15341c;
        String b2 = ahVar.b();
        long id = this.f15340b.getId();
        String requestId = this.f15340b.getRequestId();
        String labels = this.f15340b.getLabels();
        boolean c2 = ahVar.c();
        int d2 = ahVar.d();
        h.f.b.l.d(b2, "");
        t<R> a2 = ((CommentApi) e.a().a(CommentApi.class)).sendTextMessage(bt.a(b2, id, requestId, labels, str, d2, c2)).a(new com.bytedance.android.livesdk.util.rxutils.f());
        h.f.b.l.b(a2, "");
        aVar.a(a2.a(new e(this, ahVar, mockChatMessage, uptimeMillis), new f(this, ahVar, mockChatMessage, uptimeMillis)));
    }

    public final void a(a aVar) {
        super.a((bq) aVar);
        this.f15340b = (Room) this.w.b(df.class);
        this.f15339a = true;
        if (this.x != null) {
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.ROOM_VERIFY.getIntType(), this);
        }
        f.a.b.a aVar2 = this.f15341c;
        if (aVar2 != null) {
            aVar2.dispose();
        }
        f.a.b.a aVar3 = new f.a.b.a();
        this.f15341c = aVar3;
        aVar3.a(com.bytedance.android.livesdk.an.a.a().a(m.class).d(new d(this)));
        if ((this.w != null && ((Boolean) this.w.b(ee.class)).booleanValue()) || EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() != 1) {
            f.f15527b = this.f15340b;
            f.a();
        }
    }
}

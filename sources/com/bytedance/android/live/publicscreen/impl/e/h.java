package com.bytedance.android.live.publicscreen.impl.e;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.e;
import com.bytedance.android.live.publicscreen.a.d;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.live.publicscreen.a.e.b;
import com.bytedance.android.live.publicscreen.a.e.c;
import com.bytedance.android.live.publicscreen.impl.d.a.e;
import com.bytedance.android.live.publicscreen.impl.model.f;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.e.r;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.chatroom.model.i;
import com.bytedance.android.livesdk.chatroom.model.l;
import com.bytedance.android.livesdk.chatroom.viewmodule.bq;
import com.bytedance.android.livesdk.j.ak;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.dn;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageListPreloadSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayEnabledSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCommentTranslationConfigSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveMtIgnoreRoomCheckSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenConfigSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableCommentAreaSetting;
import com.bytedance.android.livesdk.model.ba;
import com.bytedance.android.livesdk.model.message.af;
import com.bytedance.android.livesdk.model.message.au;
import com.bytedance.android.livesdk.model.message.az;
import com.bytedance.android.livesdk.model.message.bk;
import com.bytedance.android.livesdk.model.message.bl;
import com.bytedance.android.livesdk.model.message.bx;
import com.bytedance.android.livesdk.model.message.cb;
import com.bytedance.android.livesdk.model.message.g;
import com.bytedance.android.livesdk.model.message.n;
import com.bytedance.android.livesdk.model.message.tracking.IdMessage;
import com.bytedance.android.livesdk.model.message.y;
import com.bytedance.android.livesdk.p;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import f.a.t;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class h extends r<a> implements d, b, c, OnMessageListener {
    private boolean A;
    private i B;
    private boolean C;
    private int D;
    private int E;
    private final Map<Class<? extends com.bytedance.android.livesdk.ac.b.a>, com.bytedance.android.live.publicscreen.a.c<? extends com.bytedance.android.livesdk.ac.b.a>> F;
    private com.bytedance.android.live.publicscreen.impl.d.a G;
    private boolean H;
    private long I;
    private int J;
    private int K;
    private com.bytedance.android.livesdk.watch.a L;

    /* renamed from: a  reason: collision with root package name */
    public long f12336a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f12337b = "";

    /* renamed from: c  reason: collision with root package name */
    public g f12338c;

    /* renamed from: d  reason: collision with root package name */
    public l f12339d;

    /* renamed from: e  reason: collision with root package name */
    public int f12340e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12341f;

    /* renamed from: g  reason: collision with root package name */
    public final Queue<com.bytedance.android.live.publicscreen.a.d.h> f12342g;

    /* renamed from: h  reason: collision with root package name */
    public final Queue<com.bytedance.android.live.publicscreen.a.d.h> f12343h;

    /* renamed from: i  reason: collision with root package name */
    public final Queue<com.bytedance.android.live.publicscreen.a.d.h> f12344i;

    /* renamed from: j  reason: collision with root package name */
    public final List<com.bytedance.android.live.publicscreen.a.d.h> f12345j;

    /* renamed from: k  reason: collision with root package name */
    public f.a.l.g<List<k<? extends com.bytedance.android.livesdk.ac.b.a>>> f12346k;

    /* renamed from: l  reason: collision with root package name */
    public final e f12347l;

    /* renamed from: m  reason: collision with root package name */
    public com.bytedance.android.live.publicscreen.a.g f12348m;
    public final Handler n;
    public boolean o;
    public final Runnable p;
    public final d q;
    public Runnable r;
    private final int s;
    private final boolean t;
    private final Comparator<com.bytedance.android.live.publicscreen.a.d.h> u;
    private final int v;
    private boolean z;

    public interface a extends com.bytedance.android.live.publicscreen.a.a, bq {
        static {
            Covode.recordClassIndex(6787);
        }

        void a();

        void a(int i2);

        void a(com.bytedance.android.live.publicscreen.a.d.h hVar);

        void b();

        void b(int i2);

        void c();

        void c(int i2);

        void d();

        void d(int i2);

        boolean e();

        void f();

        void h();
    }

    static {
        Covode.recordClassIndex(6784);
    }

    @Override // com.bytedance.android.live.publicscreen.a.d
    public final int d() {
        return this.s;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d
    public final boolean e() {
        return this.t;
    }

    @Override // com.bytedance.android.live.publicscreen.a.e.c
    public final <MESSAGE extends com.bytedance.android.livesdk.ac.b.a> void a(Class<MESSAGE> cls, com.bytedance.android.live.publicscreen.a.c<MESSAGE> cVar) {
        this.F.put(cls, cVar);
    }

    public final void a(a aVar) {
        boolean z2;
        super.a((bq) aVar);
        boolean booleanValue = ((Boolean) this.w.b(ee.class)).booleanValue();
        Room room = (Room) this.w.b(df.class);
        l value = LivePublicScreenConfigSetting.getValue();
        this.f12339d = value;
        this.f12340e = value.f15788a;
        i value2 = LiveCommentTranslationConfigSetting.INSTANCE.getValue();
        this.B = value2;
        this.A = value2.f15780a;
        EnterRoomExtra enterRoomExtra = (EnterRoomExtra) this.w.b(ak.class);
        boolean z3 = true;
        if (!this.A || booleanValue || room == null || ((room.mRoomAuthStatus != null && !room.mRoomAuthStatus.enableChat) || enterRoomExtra == null || enterRoomExtra.isSameAppLanguage)) {
            this.C = false;
        } else {
            int a2 = com.bytedance.ies.f.b.a(((a) this.y).getContext(), com.bytedance.ies.f.b.f33816b).a("live.mt.text_message.guidance_total_display_count", 0);
            this.D = a2;
            if (a2 < this.B.f15782c) {
                this.E = com.bytedance.ies.f.b.a(((a) this.y).getContext(), com.bytedance.ies.f.b.f33816b).a("live.mt.text_message.guidance_daily_display_count", 0);
                int a3 = com.bytedance.ies.f.b.a(((a) this.y).getContext(), com.bytedance.ies.f.b.f33816b).a("live.mt.text_message.guidance_last_display_year", 0);
                int a4 = com.bytedance.ies.f.b.a(((a) this.y).getContext(), com.bytedance.ies.f.b.f33816b).a("live.mt.text_message.guidance_last_display_day", 0);
                Calendar instance = Calendar.getInstance();
                if (!(a3 == instance.get(1) && a4 == instance.get(6))) {
                    this.E = 0;
                }
                if (this.E < this.B.f15781b) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.C = z2;
            } else {
                this.C = false;
            }
        }
        this.f12348m = new com.bytedance.android.live.publicscreen.a.g(aVar.getContext(), aVar, com.bytedance.android.live.uikit.c.a.a(aVar.getContext()), aVar.e(), this.A, booleanValue, room, room.getOwner(), this.w, aVar, this);
        for (com.bytedance.android.live.publicscreen.a.d.h hVar : this.f12345j) {
            if (hVar instanceof com.bytedance.android.live.publicscreen.a.d.g) {
                ((com.bytedance.android.live.publicscreen.a.d.g) hVar).a(this.f12348m);
            }
        }
        com.bytedance.android.live.publicscreen.impl.d.a aVar2 = new com.bytedance.android.live.publicscreen.impl.d.a();
        this.G = aVar2;
        aVar2.f12302a.put(com.bytedance.android.livesdk.model.message.a.class, new com.bytedance.android.live.publicscreen.impl.d.a.a());
        aVar2.f12302a.put(n.class, new com.bytedance.android.live.publicscreen.impl.d.a.b());
        aVar2.f12302a.put(az.class, new e());
        aVar2.f12302a.put(y.class, new com.bytedance.android.live.publicscreen.impl.d.a.c());
        aVar2.f12302a.put(au.class, new com.bytedance.android.live.publicscreen.impl.d.a.d());
        List<com.bytedance.android.live.publicscreen.a.e.e> onRegistryReadyListeners = ((com.bytedance.android.live.publicscreen.a.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.publicscreen.a.e.class)).getOnRegistryReadyListeners();
        if (!onRegistryReadyListeners.isEmpty()) {
            for (com.bytedance.android.live.publicscreen.a.e.e eVar : onRegistryReadyListeners) {
                eVar.a(this.G);
            }
        }
        List<com.bytedance.android.live.publicscreen.a.e.e> onRegistryReadyListeners2 = ((com.bytedance.android.live.publicscreen.a.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.publicscreen.a.e.class)).getOnRegistryReadyListeners();
        if (!onRegistryReadyListeners2.isEmpty()) {
            for (com.bytedance.android.live.publicscreen.a.e.e eVar2 : onRegistryReadyListeners2) {
                eVar2.a((c) this);
            }
        }
        this.w.b((m) this.y, com.bytedance.android.live.n.b.class, (h.f.a.b) new j(this)).b((m) this.y, com.bytedance.android.live.n.a.class, (h.f.a.b) new k(this));
        ((z) com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.chatroom.c.b.class).a(t())).a(new l(this));
        if (this.f12348m.f12205i && this.f12348m.f12206j != null && this.f12348m.f12206j.getStreamType() == com.bytedance.android.livesdkapi.depend.model.live.i.SCREEN_RECORD) {
            this.z = true;
        }
        if (this.x != null) {
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.CHAT.getIntType(), this);
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.EMOTE_CHAT.getIntType(), this);
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.GIFT.getIntType(), this);
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.MEMBER.getIntType(), this);
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.DIGG.getIntType(), this);
            com.bytedance.android.livesdk.like.b likeHelper = ((p) com.bytedance.android.live.t.a.a(p.class)).getLikeHelper(this.f12348m.f12197a);
            if (likeHelper != null && likeHelper.n()) {
                this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.LIKE.getIntType(), this);
            }
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.ROOM.getIntType(), this);
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.SOCIAL.getIntType(), this);
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.CONTROL.getIntType(), this);
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.SCREEN.getIntType(), this);
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.ROOM_RICH_CHAT_MESSAGE.getIntType(), this);
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.COMMENT_IMAGE.getIntType(), this);
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.GOODS_ORDER.getIntType(), this);
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.ASSET_MESSAGE.getIntType(), this);
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.PORTAL_MESSAGE.getIntType(), this);
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.LIVE_INTRO_MESSAGE.getIntType(), this);
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.ROOM_VERIFY.getIntType(), this);
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.BOTTOM_MESSAGE.getIntType(), this);
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.IM_DELETE.getIntType(), this);
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.QUESTION_DELETE_MESSAGE.getIntType(), this);
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.RED_ENVELOPE_MESSAGE.getIntType(), this);
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.WISH_LIST_UPDATE_MESSAGE.getIntType(), this);
        }
        List<com.bytedance.android.live.publicscreen.a.e.e> onRegistryReadyListeners3 = ((com.bytedance.android.live.publicscreen.a.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.publicscreen.a.e.class)).getOnRegistryReadyListeners();
        if (!onRegistryReadyListeners3.isEmpty()) {
            for (com.bytedance.android.live.publicscreen.a.e.e eVar3 : onRegistryReadyListeners3) {
                eVar3.a((b) this);
            }
        }
        this.n.postDelayed(this.p, (long) this.f12341f);
        this.o = false;
        a((this.f12348m.f12205i && com.bytedance.android.livesdk.ap.a.bR.a().booleanValue()) || (!this.f12348m.f12205i && this.f12348m.f12206j != null && (this.f12348m.f12206j.mRoomAuthStatus == null || this.f12348m.f12206j.mRoomAuthStatus.enableChat)));
        this.I = SystemClock.uptimeMillis();
        this.J = 0;
        this.K = 0;
        if (!this.f12345j.isEmpty() || LiveMessageListPreloadSetting.INSTANCE.getValue() != 1) {
            z3 = false;
        }
        this.H = z3;
        d dVar = this.q;
        com.bytedance.android.live.publicscreen.a.g gVar = this.f12348m;
        h.f.b.l.d(gVar, "");
        Iterator<b> it = dVar.f12305b.iterator();
        while (it.hasNext()) {
            it.next().a(gVar);
        }
        Iterator<b> it2 = this.q.f12305b.iterator();
        while (it2.hasNext()) {
            it2.next().b();
        }
        com.bytedance.android.live.publicscreen.impl.a aVar3 = (com.bytedance.android.live.publicscreen.impl.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.publicscreen.a.e.class);
        aVar3.registerPresenter(this.f12348m.f12197a, this);
        g pendingBottomMessage = aVar3.getPendingBottomMessage(this.f12348m.f12197a);
        if (pendingBottomMessage != null) {
            a(pendingBottomMessage);
        } else if (this.f12336a > 0) {
            h();
            aVar.b();
        }
        com.bytedance.android.livesdk.watch.a createShareGuideEvasionStrategy = ((com.bytedance.android.livesdk.watch.d) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.watch.d.class)).createShareGuideEvasionStrategy(this.w);
        this.L = createShareGuideEvasionStrategy;
        createShareGuideEvasionStrategy.a();
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2) {
        if (this.y != null) {
            if (!z2 || !i()) {
                ((a) this.y).d();
            } else {
                ((a) this.y).c();
            }
        }
    }

    public final void a(int i2, com.bytedance.android.live.publicscreen.a.d.h hVar) {
        if (i2 >= 0 && i2 < this.f12345j.size() && hVar != null && this.y != null && this.f12348m != null) {
            if (!this.f12345j.contains(hVar) && (hVar instanceof com.bytedance.android.live.publicscreen.a.d.g)) {
                ((com.bytedance.android.live.publicscreen.a.d.g) hVar).a(this.f12348m);
            }
            this.f12345j.get(i2).r();
            this.f12345j.set(i2, hVar);
            ((a) this.y).a(i2);
        }
    }

    public final long a(com.bytedance.android.livesdk.ac.b.a aVar, boolean z2) {
        com.bytedance.android.livesdk.watch.a aVar2;
        this.q.a(aVar);
        if (TestDisableCommentAreaSetting.INSTANCE.getValue()) {
            return 0;
        }
        if (this.y == null) {
            com.bytedance.android.live.publicscreen.impl.f.b.a(aVar, "Message discarded because of null view interface.");
            return 0;
        } else if (!aVar.a(this.f12348m.f12197a) && !LiveMtIgnoreRoomCheckSetting.INSTANCE.getValue()) {
            if (((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).isLocalTest()) {
                ao.a(com.bytedance.android.live.core.f.y.e(), "The message's room id differs from the current room. So it's discarded.", 0);
            }
            com.bytedance.android.live.publicscreen.impl.f.b.a(aVar, "Message discarded because it doesn't belong to this room.");
            return 0;
        } else if (aVar instanceof g) {
            a((g) aVar);
            return 0;
        } else {
            if (aVar instanceof cb) {
                if (this.f12348m.f12205i) {
                    return 0;
                }
                if (!(this.f12348m.f12206j == null || this.f12348m.f12206j.mRoomAuthStatus == null)) {
                    cb cbVar = (cb) aVar;
                    if (cbVar.f19460a == 3) {
                        this.f12348m.f12206j.mRoomAuthStatus.setEnableChat(false);
                        a(false);
                    } else if (cbVar.f19460a == 4) {
                        this.f12348m.f12206j.mRoomAuthStatus.setEnableChat(true);
                        a(true);
                    }
                    return 0;
                }
            }
            if (aVar instanceof af) {
                a((af) aVar);
                return 0;
            } else if (aVar instanceof bk) {
                a((bk) aVar);
                return 0;
            } else {
                if (aVar instanceof az) {
                    a((az) aVar);
                }
                if (this.f12348m.f12206j != null && this.f12348m.f12206j.mRoomAuthStatus != null && (((this.f12348m.f12205i && !com.bytedance.android.livesdk.ap.a.bR.a().booleanValue()) || (!this.f12348m.f12205i && !this.f12348m.f12206j.mRoomAuthStatus.enableChat)) && !(aVar instanceof bx))) {
                    return 0;
                }
                com.bytedance.android.live.publicscreen.a.b<? extends IMessage> bVar = this.G.f12302a.get(aVar.getClass());
                if (bVar == null || !bVar.a(aVar, this.f12348m)) {
                    com.bytedance.android.live.publicscreen.a.d.h a2 = a(aVar);
                    if (a2 == null) {
                        return 0;
                    }
                    if (!(a2 instanceof com.bytedance.android.live.publicscreen.impl.model.p) || (aVar2 = this.L) == null || aVar2.c()) {
                        if (a2 instanceof com.bytedance.android.live.publicscreen.a.d.g) {
                            ((com.bytedance.android.live.publicscreen.a.d.g) a2).a(this.f12348m);
                        }
                        if (!aVar.b()) {
                            com.bytedance.android.live.publicscreen.impl.f.b.a(aVar, "Message discarded because it cannot be displayed as a text message.");
                            return 0;
                        }
                        this.q.a(a2);
                        if (a2.o() || z2) {
                            d(a2);
                        } else if (!this.H || SystemClock.uptimeMillis() - this.I > ((long) this.f12341f)) {
                            f(a2);
                        } else if (a2.j()) {
                            if (this.K <= 0) {
                                d(a2);
                                this.K++;
                            } else {
                                f(a2);
                            }
                        } else if (this.J <= j()) {
                            d(a2);
                            this.J++;
                        } else {
                            f(a2);
                        }
                        k(a2);
                        return a2.q();
                    }
                    this.L.a(new m(this, aVar));
                    return 0;
                }
                this.q.a(bVar, aVar);
                return 0;
            }
        }
    }

    public final int a(long j2) {
        if (j2 == 0) {
            return -1;
        }
        for (int i2 = 0; i2 < this.f12345j.size(); i2++) {
            if (this.f12345j.get(i2).q() == j2) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d
    public final void a(com.bytedance.android.live.publicscreen.a.d.h hVar) {
        d dVar = this.q;
        h.f.b.l.d(hVar, "");
        Iterator<b> it = dVar.f12305b.iterator();
        while (it.hasNext()) {
            it.next().a(hVar);
        }
    }

    public final void a(g gVar) {
        if (gVar != null && gVar.O != null && gVar.O.f23218j != null) {
            if (m() && (gVar.f19625i == 1 || gVar.f19625i == 2)) {
                return;
            }
            if (!m() || gVar.f19625i != 5 || this.f12338c.f19625i == 1 || this.f12338c.f19625i == 2) {
                if (gVar.f19625i == 5) {
                    b.a.a("livesdk_tns_ags_popup_message_warning").a(this.w).a("user_id", u.a().b().c()).b();
                }
                long j2 = gVar.f19624h >= 0 ? gVar.f19624h : Long.MAX_VALUE;
                this.f12336a = j2;
                gVar.f19624h = j2;
                this.f12337b = com.bytedance.android.livesdk.chatroom.f.c.a(gVar.O.f23218j, "");
                this.f12338c = gVar;
                ((a) this.y).b();
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.a.d
    public final t<List<k<? extends com.bytedance.android.livesdk.ac.b.a>>> a() {
        if (!this.z) {
            return null;
        }
        f.a.l.g<List<k<? extends com.bytedance.android.livesdk.ac.b.a>>> gVar = this.f12346k;
        if (gVar != null) {
            gVar.onComplete();
        } else {
            this.n.postDelayed(this.r, 1000);
        }
        f.a.l.c cVar = new f.a.l.c();
        this.f12346k = cVar;
        return cVar;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d
    public final void a(k<? extends com.bytedance.android.livesdk.ac.b.a> kVar, String str) {
        com.bytedance.android.live.publicscreen.a.g gVar;
        String str2;
        if (kVar != null && kVar.b() != null && this.y != null && (gVar = this.f12348m) != null && gVar.f12206j != null && this.f12348m.f12203g && this.f12348m.f12208l != null) {
            if (kVar instanceof f) {
                f fVar = (f) kVar;
                if (!this.f12348m.f12204h) {
                    str2 = "";
                } else if (fVar.s()) {
                    str2 = com.bytedance.android.live.core.f.y.a((int) R.string.eov);
                } else {
                    str2 = com.bytedance.android.live.core.f.y.a((int) R.string.eot);
                }
                Context context = this.f12348m.f12200d;
                User b2 = kVar.b();
                Room room = this.f12348m.f12206j;
                boolean z2 = this.f12348m.f12205i;
                MESSAGE message = kVar.f12190d;
                com.bytedance.android.live.base.model.user.b bVar = (com.bytedance.android.live.base.model.user.b) this.w.b(dn.class);
                boolean z3 = this.f12348m.f12204h;
                if (str2 == null) {
                    str2 = "";
                }
                new com.bytedance.android.live.publicscreen.impl.b.a(context, b2, room, z2, message, bVar, str, z3, str2, new n(this, fVar, kVar)).show();
            } else {
                new com.bytedance.android.live.publicscreen.impl.b.a(this.f12348m.f12200d, kVar.b(), this.f12348m.f12206j, this.f12348m.f12205i, kVar.f12190d, (com.bytedance.android.live.base.model.user.b) this.w.b(dn.class), str, false, "", null).show();
            }
            b.a.a("livesdk_long_press_comment").a(this.f12348m.f12208l).a("user_type", kVar.C() ? "anchor" : "user").a("to_user_id", kVar.E()).b();
            MESSAGE message2 = kVar.f12190d;
            if (message2 != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("longClickedMessage", e.a.f9628b.b(IdMessage.from(message2)));
                com.bytedance.android.livesdk.ab.i.b().b("ttlive_text_message_long_clicked", hashMap);
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.a.d
    public final int f() {
        return this.f12342g.size();
    }

    @Override // com.bytedance.android.live.publicscreen.a.d
    public final int g() {
        return this.f12344i.size();
    }

    public final void h() {
        this.f12336a--;
    }

    private int j() {
        i iVar = this.B;
        if (iVar == null) {
            return Integer.MAX_VALUE;
        }
        return iVar.f15783d;
    }

    private int k() {
        if (this.t) {
            return this.v;
        }
        return 100;
    }

    private boolean m() {
        if (this.f12336a > 0) {
            return true;
        }
        return false;
    }

    private void l() {
        b.a.a("livesdk_anchor_host_notice").a(this.w).a("event_type", "show").b();
    }

    private boolean i() {
        if (this.f12348m.f12206j == null) {
            return false;
        }
        if (this.f12348m.f12206j.getRoomAuthStatus() == null || this.f12348m.f12206j.getRoomAuthStatus().isMessageEnable()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d
    public final boolean c() {
        if (!this.o) {
            boolean z2 = false;
            int size = this.f12343h.size() + 0;
            Iterator<com.bytedance.android.live.publicscreen.a.d.h> it = this.f12342g.iterator();
            while (it.hasNext() && it.next().p() <= SystemClock.uptimeMillis()) {
                size++;
            }
            if (size >= j()) {
                z2 = true;
            }
            this.o = z2;
        }
        return this.o;
    }

    public h() {
        int i2 = LivePublicScreenConfigSetting.getValue().f15789b;
        this.f12341f = i2;
        int value = LiveChatShowDelayForHotLiveSetting.INSTANCE.getValue();
        this.s = value;
        this.t = LiveChatShowDelayEnabledSetting.INSTANCE.getValue();
        Comparator<com.bytedance.android.live.publicscreen.a.d.h> comparator = i.f12351a;
        this.u = comparator;
        this.v = (int) ((((float) (value + i2)) / ((float) i2)) * 100.0f);
        this.f12342g = new PriorityQueue(k(), comparator);
        this.f12343h = new ArrayDeque(100);
        this.f12344i = new ArrayDeque(8);
        this.f12345j = new ArrayList(200);
        this.z = false;
        this.f12347l = new e();
        this.F = new HashMap();
        this.n = new Handler();
        this.o = false;
        this.p = new Runnable() {
            /* class com.bytedance.android.live.publicscreen.impl.e.h.AnonymousClass1 */

            static {
                Covode.recordClassIndex(6785);
            }

            public final void run() {
                int i2;
                if (h.this.y != null && h.this.f12348m != null) {
                    h hVar = h.this;
                    if (hVar.y != null) {
                        ((a) hVar.y).f();
                    }
                    Iterator<b> it = hVar.q.f12305b.iterator();
                    while (it.hasNext()) {
                        it.next().d();
                    }
                    if (h.this.f12344i.size() > 0) {
                        h hVar2 = h.this;
                        hVar2.d(hVar2.f12344i.poll());
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    boolean z = false;
                    while (i2 < h.this.f12340e && (h.this.f12343h.size() != 0 || (h.this.f12342g.size() != 0 && !z))) {
                        if (h.this.f12343h.size() > 0) {
                            h hVar3 = h.this;
                            hVar3.d(hVar3.f12343h.poll());
                        } else {
                            com.bytedance.android.live.publicscreen.a.d.h peek = h.this.f12342g.peek();
                            if (peek != null) {
                                if (peek.p() == 0) {
                                    h.this.d(peek);
                                    h.this.f12342g.poll();
                                } else if (peek.p() <= SystemClock.uptimeMillis()) {
                                    h.this.d(peek);
                                    h.this.f12342g.poll();
                                }
                            }
                            z = true;
                        }
                        i2++;
                    }
                    h.this.o = false;
                    h.this.n.postDelayed(h.this.p, (long) h.this.f12341f);
                    Iterator<b> it2 = h.this.q.f12305b.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                }
            }
        };
        d dVar = new d();
        this.q = dVar;
        this.r = new Runnable() {
            /* class com.bytedance.android.live.publicscreen.impl.e.h.AnonymousClass2 */

            static {
                Covode.recordClassIndex(6786);
            }

            public final void run() {
                if (h.this.f12346k != null) {
                    e eVar = h.this.f12347l;
                    ArrayDeque<k<?>> arrayDeque = eVar.f12309a;
                    if (arrayDeque == null) {
                        h.f.b.l.a("messageQueue");
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int c2 = h.j.h.c(100, arrayDeque.size()); c2 > 0; c2--) {
                        ArrayDeque<k<?>> arrayDeque2 = eVar.f12309a;
                        if (arrayDeque2 == null) {
                            h.f.b.l.a("messageQueue");
                        }
                        k<?> pollFirst = arrayDeque2.pollFirst();
                        if (pollFirst == null) {
                            break;
                        }
                        if (!eVar.b(pollFirst)) {
                            arrayList.add(pollFirst);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        h.this.f12346k.onNext(arrayList);
                    }
                    h.this.n.postDelayed(h.this.r, 1000);
                }
            }
        };
        dVar.a(new a());
        dVar.a(new q());
    }

    @Override // com.bytedance.ies.a.b, com.bytedance.android.livesdk.chatroom.e.r
    public final void b() {
        super.b();
        this.n.removeCallbacksAndMessages(null);
        int size = this.f12343h.size();
        com.bytedance.android.live.publicscreen.a.d.h peek = this.f12343h.isEmpty() ? null : this.f12343h.peek();
        int size2 = this.f12344i.size();
        com.bytedance.android.live.publicscreen.a.d.h peek2 = this.f12344i.isEmpty() ? null : this.f12344i.peek();
        int size3 = this.f12342g.size();
        com.bytedance.android.live.publicscreen.a.d.h peek3 = this.f12342g.isEmpty() ? null : this.f12342g.peek();
        HashMap hashMap = new HashMap();
        hashMap.put("stillInBufferSelfMessageCount", Integer.valueOf(size));
        if (!(peek instanceof k)) {
            peek = null;
        }
        k kVar = (k) peek;
        if (kVar != null) {
            hashMap.put("firstSelfMessage", e.a.f9628b.b(IdMessage.from(kVar.f12190d)));
        }
        hashMap.put("stillInBufferFoldedMessageCount", Integer.valueOf(size2));
        if (!(peek2 instanceof k)) {
            peek2 = null;
        }
        k kVar2 = (k) peek2;
        if (kVar2 != null) {
            hashMap.put("firstFoldedMessage", e.a.f9628b.b(IdMessage.from(kVar2.f12190d)));
        }
        hashMap.put("stillInBufferMessageCount", Integer.valueOf(size3));
        if (!(peek3 instanceof k)) {
            peek3 = null;
        }
        k kVar3 = (k) peek3;
        if (kVar3 != null) {
            hashMap.put("firstMessage", e.a.f9628b.b(IdMessage.from(kVar3.f12190d)));
        }
        com.bytedance.android.livesdk.ab.i.b().b("ttlive_widget_destroyed", hashMap);
        for (com.bytedance.android.live.publicscreen.a.d.h hVar : this.f12345j) {
            hVar.r();
        }
        this.G.f12302a.clear();
        this.F.clear();
        ((com.bytedance.android.live.publicscreen.impl.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.publicscreen.a.e.class)).unregisterPresenter(this.f12348m.f12197a);
        this.q.a();
        this.L.b();
        this.L = null;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public void onMessage(IMessage iMessage) {
        a((com.bytedance.android.livesdk.ac.b.a) iMessage, false);
    }

    @Override // com.bytedance.android.live.publicscreen.a.e.b
    public final void a(int i2) {
        if (this.x != null) {
            this.x.addMessageListener(i2, this);
        }
    }

    private void k(com.bytedance.android.live.publicscreen.a.d.h hVar) {
        if (this.z && (hVar instanceof k)) {
            this.f12347l.a((k) hVar);
        }
    }

    public final com.bytedance.android.live.publicscreen.a.d.h a(com.bytedance.android.livesdk.ac.b.a aVar) {
        com.bytedance.android.live.publicscreen.a.c<? extends com.bytedance.android.livesdk.ac.b.a> cVar;
        com.bytedance.android.live.publicscreen.a.d.h a2 = com.bytedance.android.live.publicscreen.impl.model.k.a(aVar);
        if (a2 == null && ((cVar = this.F.get(aVar.getClass())) == null || (a2 = cVar.a(aVar)) == null)) {
            com.bytedance.android.live.publicscreen.impl.f.b.a(aVar, "Message discarded because of no definition of PublicScreenModel.");
        }
        return a2;
    }

    public final void b(int i2) {
        this.f12345j.get(i2).r();
        this.f12345j.remove(i2);
        ((a) this.y).c(i2);
    }

    public final void c(com.bytedance.android.live.publicscreen.a.d.h hVar) {
        int indexOf;
        if (hVar != null && this.y != null && this.f12348m != null && (indexOf = this.f12345j.indexOf(hVar)) != -1) {
            this.f12345j.set(indexOf, hVar);
            ((a) this.y).a(indexOf);
        }
    }

    public final void d(com.bytedance.android.live.publicscreen.a.d.h hVar) {
        j(hVar);
        e(hVar);
        hVar.h().f12184c = SystemClock.uptimeMillis();
        this.q.j(hVar);
    }

    private void a(k<? extends com.bytedance.android.livesdk.ac.b.a> kVar) {
        if (kVar.f12190d.L == com.bytedance.android.livesdk.model.message.a.a.DIGG || kVar.f12190d.L == com.bytedance.android.livesdk.model.message.a.a.ROOM || (kVar.f12190d.L == com.bytedance.android.livesdk.model.message.a.a.MEMBER && ((az) kVar.f12190d).f19236h == 1)) {
            b(kVar);
        } else if (kVar.f12190d.L == com.bytedance.android.livesdk.model.message.a.a.LINK_CO_HOST_GUIDE) {
            l();
        }
    }

    private boolean g(com.bytedance.android.live.publicscreen.a.d.h hVar) {
        if (this.f12343h.size() < 100) {
            this.f12343h.add(hVar);
            hVar.h().f12182a = true;
            hVar.h().f12183b = SystemClock.uptimeMillis();
            this.q.b(hVar);
            this.q.c(hVar);
            return true;
        }
        hVar.r();
        this.q.f(hVar);
        this.q.g(hVar);
        return false;
    }

    private boolean h(com.bytedance.android.live.publicscreen.a.d.h hVar) {
        if (this.f12344i.size() < 8) {
            this.f12344i.add(hVar);
            hVar.l().f12185a = true;
            hVar.h().f12182a = true;
            hVar.h().f12183b = SystemClock.uptimeMillis();
            this.q.b(hVar);
            this.q.e(hVar);
            return true;
        }
        hVar.r();
        this.q.f(hVar);
        this.q.i(hVar);
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d
    public final void b(com.bytedance.android.live.publicscreen.a.d.h hVar) {
        d dVar = this.q;
        h.f.b.l.d(hVar, "");
        Iterator<b> it = dVar.f12305b.iterator();
        while (it.hasNext()) {
            it.next().a(hVar, dVar.f12304a);
        }
        dVar.f12304a++;
    }

    private void a(af afVar) {
        if (this.y != null) {
            for (int size = this.f12345j.size() - 1; size >= 0; size--) {
                com.bytedance.android.live.publicscreen.a.d.h hVar = this.f12345j.get(size);
                if (hVar.n() && (hVar instanceof k)) {
                    k kVar = (k) hVar;
                    if ((afVar.f19129f != null && afVar.f19129f.contains(Long.valueOf(kVar.E()))) || (afVar.f19128a != null && afVar.f19128a.contains(Long.valueOf(kVar.f12190d.getMessageId())))) {
                        this.f12345j.remove(size);
                        ((a) this.y).c(size);
                        ((a) this.y).d(this.f12345j.size() - 1);
                    }
                }
            }
            a(this.f12342g, afVar);
            a(this.f12343h, afVar);
            this.o = false;
        }
    }

    private void f(com.bytedance.android.live.publicscreen.a.d.h hVar) {
        if (!hVar.i() || !hVar.m()) {
            if (hVar.j()) {
                if (!h(hVar) && (hVar instanceof k)) {
                    com.bytedance.android.live.publicscreen.impl.f.b.b(((k) hVar).f12190d, "Message discarded because it exceeds fold message buffer size.");
                }
            } else if (!i(hVar) && (hVar instanceof k)) {
                com.bytedance.android.live.publicscreen.impl.f.b.b(((k) hVar).f12190d, "Message discarded because it exceeds other message buffer size.");
            }
        } else if (!g(hVar) && (hVar instanceof k)) {
            com.bytedance.android.live.publicscreen.impl.f.b.b(((k) hVar).f12190d, "Message discarded because it exceeds self message buffer size.");
        }
    }

    private boolean i(com.bytedance.android.live.publicscreen.a.d.h hVar) {
        if (this.f12342g.size() < k()) {
            this.f12342g.add(hVar);
            hVar.h().f12182a = true;
            hVar.h().f12183b = SystemClock.uptimeMillis();
            this.q.b(hVar);
            this.q.d(hVar);
            return true;
        }
        hVar.r();
        this.q.f(hVar);
        this.q.h(hVar);
        return false;
    }

    private void a(az azVar) {
        User b2;
        if (!(azVar.f19234f == null || azVar.f19234f.getId() == 0)) {
            ArrayList arrayList = new ArrayList(this.f12345j);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                com.bytedance.android.live.publicscreen.a.d.h hVar = (com.bytedance.android.live.publicscreen.a.d.h) arrayList.get(i2);
                if (hVar instanceof k) {
                    k kVar = (k) hVar;
                    if (kVar.E() == azVar.f19234f.getId() && (b2 = kVar.b()) != null) {
                        if (b2.getUserAttr() == null) {
                            b2.setUserAttr(new ba());
                        }
                        ba userAttr = b2.getUserAttr();
                        int i3 = azVar.f19236h;
                        if (i3 != 3) {
                            if (i3 != 4) {
                                if (i3 == 5) {
                                    userAttr.f19030b = true;
                                    ((a) this.y).a(i2);
                                } else if (i3 == 6) {
                                    userAttr.f19030b = false;
                                    ((a) this.y).a(i2);
                                } else if (i3 != 9) {
                                    if (i3 != 10) {
                                    }
                                }
                            }
                            userAttr.f19029a = false;
                        }
                        userAttr.f19029a = true;
                    }
                }
            }
        }
    }

    private void b(k<? extends com.bytedance.android.livesdk.ac.b.a> kVar) {
        String str;
        String str2 = "";
        if (kVar.f12190d.L == com.bytedance.android.livesdk.model.message.a.a.MEMBER) {
            az azVar = (az) kVar.f12190d;
            if (azVar.s != null) {
                str = azVar.s.f19421a;
            } else {
                return;
            }
        } else if (kVar.f12190d.L != com.bytedance.android.livesdk.model.message.a.a.ROOM || kVar.f12190d.O.f23218j == null) {
            str = str2;
        } else {
            str = kVar.f12190d.O.f23218j.f19421a;
        }
        if (str.equals("pm_mt_guidance_coming_viewers") || str.equals("pm_mt_guidance_coming_viewers_second")) {
            if ("pm_mt_guidance_coming_viewers_second".equals(str)) {
                str2 = "live_null_viewer";
            }
            if ("pm_mt_guidance_coming_viewers".equals(str)) {
                str2 = "live_started";
            }
            b.a.a("livesdk_anchor_notify_notice").a(this.w).a("event_type", "show").a("msg_type", str2).b();
        } else if (str.equals("pm_mt_guidance_interaction") || str.equals("pm_mt_guidance_interaction_first") || str.equals("pm_mt_guidance_interaction_second")) {
            if ("pm_mt_guidance_interaction".equals(str)) {
                str2 = "origin_words";
            }
            if ("pm_mt_guidance_interaction_first".equals(str)) {
                str2 = "after_joined_msg";
            }
            if ("pm_mt_guidance_interaction_second".equals(str)) {
                str2 = "system_msg";
            }
            b.a.a("livesdk_anchor_interact_notice").a(this.w).a("event_type", "show").a("msg_type", str2).b();
        }
    }

    private void e(com.bytedance.android.live.publicscreen.a.d.h hVar) {
        String str;
        if (this.C) {
            this.C = false;
            if (!c() && (hVar instanceof com.bytedance.android.live.publicscreen.impl.model.m) && !((bx) ((k) hVar).f12190d).f13611c) {
                j(com.bytedance.android.live.publicscreen.impl.model.k.a(com.bytedance.android.livesdk.chatroom.b.b.a(this.f12348m.f12197a, com.bytedance.android.live.core.f.y.a((int) R.string.eou))));
                Calendar instance = Calendar.getInstance();
                com.bytedance.ies.f.b.a(((a) this.y).getContext(), com.bytedance.ies.f.b.f33816b).a("live.mt.text_message.guidance_total_display_count", Integer.valueOf(this.D + 1)).a("live.mt.text_message.guidance_last_display_year", Integer.valueOf(instance.get(1))).a("live.mt.text_message.guidance_last_display_day", Integer.valueOf(instance.get(6))).a("live.mt.text_message.guidance_daily_display_count", Integer.valueOf(this.E + 1)).a();
                com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_translate_guide").a(this.w);
                if (this.f12348m.f12205i) {
                    str = "anchor";
                } else {
                    str = "user";
                }
                a2.a("user_type", str).b();
            }
        }
    }

    private void j(com.bytedance.android.live.publicscreen.a.d.h hVar) {
        if (hVar != null) {
            if (this.f12345j.size() >= 200) {
                List<com.bytedance.android.live.publicscreen.a.d.h> subList = this.f12345j.subList(0, 70);
                for (com.bytedance.android.live.publicscreen.a.d.h hVar2 : subList) {
                    hVar2.r();
                }
                subList.clear();
                ((a) this.y).a();
            }
            if (LivePublicScreenConfigSetting.getValue().f15790c == 0) {
                if (!this.f12345j.isEmpty()) {
                    List<com.bytedance.android.live.publicscreen.a.d.h> list = this.f12345j;
                    com.bytedance.android.live.publicscreen.a.d.h hVar3 = list.get(list.size() - 1);
                    if (hVar3 != null && hVar3.j()) {
                        if (hVar.j()) {
                            List<com.bytedance.android.live.publicscreen.a.d.h> list2 = this.f12345j;
                            list2.set(list2.size() - 1, hVar);
                            ((a) this.y).a(this.f12345j.size() - 1);
                        } else {
                            List<com.bytedance.android.live.publicscreen.a.d.h> list3 = this.f12345j;
                            list3.add(list3.size() - 1, hVar);
                            ((a) this.y).b(this.f12345j.size() - 2);
                        }
                    }
                }
                this.f12345j.add(hVar);
                ((a) this.y).b(this.f12345j.size() - 1);
            } else if (hVar.j()) {
                ((a) this.y).a(hVar);
            } else {
                this.f12345j.add(hVar);
                ((a) this.y).b(this.f12345j.size() - 1);
            }
            if (hVar instanceof k) {
                a((k) hVar);
            }
        }
    }

    private void a(bk bkVar) {
        for (int i2 = 0; i2 < this.f12345j.size(); i2++) {
            com.bytedance.android.live.publicscreen.a.d.h hVar = this.f12345j.get(i2);
            if (hVar instanceof k) {
                k kVar = (k) hVar;
                if (kVar.f12190d instanceof bl) {
                    bl blVar = (bl) kVar.f12190d;
                    if (blVar.f19340a != null && blVar.f19340a.f19332a == bkVar.f19337a) {
                        hVar.r();
                        this.f12345j.remove(i2);
                        ((a) this.y).c(i2);
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    private static void a(Collection<com.bytedance.android.live.publicscreen.a.d.h> collection, af afVar) {
        if (collection != null && !collection.isEmpty() && afVar != null) {
            Iterator<com.bytedance.android.live.publicscreen.a.d.h> it = collection.iterator();
            while (it.hasNext()) {
                com.bytedance.android.live.publicscreen.a.d.h next = it.next();
                if (next.n() && (next instanceof k)) {
                    k kVar = (k) next;
                    if ((afVar.f19129f != null && afVar.f19129f.contains(Long.valueOf(kVar.E()))) || (afVar.f19128a != null && afVar.f19128a.contains(Long.valueOf(kVar.f12190d.getMessageId())))) {
                        next.r();
                        it.remove();
                    }
                }
            }
        }
    }

    public static boolean a(long j2, Queue<com.bytedance.android.live.publicscreen.a.d.h> queue) {
        Iterator<com.bytedance.android.live.publicscreen.a.d.h> it = queue.iterator();
        while (it.hasNext()) {
            com.bytedance.android.live.publicscreen.a.d.h next = it.next();
            if (next.q() == j2) {
                next.r();
                it.remove();
                return true;
            }
        }
        return false;
    }
}

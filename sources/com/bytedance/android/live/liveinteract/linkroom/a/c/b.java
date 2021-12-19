package com.bytedance.android.live.liveinteract.linkroom.a.c;

import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.api.c.d;
import com.bytedance.android.live.liveinteract.api.c.e;
import com.bytedance.android.live.liveinteract.api.k;
import com.bytedance.android.live.liveinteract.api.m;
import com.bytedance.android.live.liveinteract.cohost.a.b.j;
import com.bytedance.android.live.liveinteract.cohost.a.c.a;
import com.bytedance.android.live.liveinteract.cohost.b.a;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.multiguest.b.a;
import com.bytedance.android.live.liveinteract.platform.a.a.a;
import com.bytedance.android.live.liveinteract.platform.a.b.g;
import com.bytedance.android.live.liveinteract.platform.a.c;
import com.bytedance.android.live.liveinteract.platform.common.g.b;
import com.bytedance.android.live.liveinteract.platform.common.g.h;
import com.bytedance.android.live.liveinteract.platform.common.g.z;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.b.a.g;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.api.LinkReviewApi;
import com.bytedance.android.livesdk.chatroom.e.r;
import com.bytedance.android.livesdk.chatroom.viewmodule.bq;
import com.bytedance.android.livesdk.j.co;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostReceiveInviteMessageTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveLinkmicModeSwitchOpenSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveLinkmicMsgOptimizationAtLeastAvailableTimeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveLinkmicMsgOptimizationSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LinkServerAutoJoinChannel;
import com.bytedance.android.livesdk.model.message.aj;
import com.bytedance.android.livesdk.model.message.d.a.a;
import com.bytedance.android.livesdk.util.rxutils.autodispose.ac;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.c.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import f.a.ab;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public final class b extends r<a> implements a.AbstractC0502a {

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.api.a.b f10496a = b.a.a();

    /* renamed from: b  reason: collision with root package name */
    f.a.b.b f10497b;

    /* renamed from: c  reason: collision with root package name */
    public Room f10498c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10499d;

    /* renamed from: e  reason: collision with root package name */
    boolean f10500e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10501f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10502g;
    @d(a = "LINKER_MANAGER")

    /* renamed from: h  reason: collision with root package name */
    public c f10503h;

    /* renamed from: i  reason: collision with root package name */
    private com.bytedance.android.livesdkapi.depend.c.a f10504i;

    /* renamed from: j  reason: collision with root package name */
    private i f10505j;
    @d(a = "LINK_MESSAGE_CENTER")

    /* renamed from: k  reason: collision with root package name */
    private g f10506k;

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.android.live.liveinteract.platform.a.b.a f10507l = new com.bytedance.android.live.liveinteract.platform.a.b.a() {
        /* class com.bytedance.android.live.liveinteract.linkroom.a.c.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(5591);
        }

        @Override // com.bytedance.android.live.liveinteract.platform.a.b.a, com.bytedance.android.live.liveinteract.platform.a.b.c
        public final void a(aj ajVar) {
            if (b.this.y != null) {
                ((a) b.this.y).a(ajVar);
            }
        }

        @Override // com.bytedance.android.live.liveinteract.platform.a.b.a, com.bytedance.android.live.liveinteract.platform.a.b.c
        public final void d(aj ajVar) {
            a.EnumC0402a aVar;
            if (b.this.f10499d && ajVar.f19144j != null) {
                a.EnumC0402a aVar2 = a.EnumC0402a.INVITE_CANCEL;
                int i2 = ajVar.f19144j.f19506c;
                if (i2 == 0) {
                    aVar = a.EnumC0402a.INVITE_CANCEL;
                } else if (i2 != 1) {
                    aVar = a.EnumC0402a.TYPE_UNKNOWN;
                } else {
                    aVar = a.EnumC0402a.APPLY_CANCEL;
                }
                if (aVar2 == aVar) {
                    com.bytedance.android.live.liveinteract.cohost.c.b.b(ajVar);
                    if (b.this.f10496a.f9940e > 0 && b.this.f10496a.f9940e == ajVar.f19140f) {
                        if (!TextUtils.isEmpty(ajVar.v)) {
                            b.this.f10496a.b(ajVar.v);
                        }
                        ((a) b.this.y).e();
                        ((a) b.this.y).d();
                    }
                }
            }
        }

        @Override // com.bytedance.android.live.liveinteract.platform.a.b.a, com.bytedance.android.live.liveinteract.platform.a.b.f
        public final void g(aj ajVar) {
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar;
            if (b.this.f10502g) {
                super.g(ajVar);
                com.bytedance.android.livesdk.model.a.a aVar2 = ajVar.r;
                if (!(e.f10014a.a("MULTI_GUEST_DATA_HOLDER") == null || (aVar = (com.bytedance.android.live.liveinteract.multiguest.opt.a.a) e.f10014a.a("MULTI_GUEST_DATA_HOLDER")) == null)) {
                    aVar.f11299i = aVar2.f18937a;
                }
                com.bytedance.android.livesdk.b.a.d.a().w = aVar2.f18937a;
                if (com.bytedance.android.live.liveinteract.multilive.a.a(aVar2.f18937a)) {
                    if (!com.bytedance.android.live.liveinteract.multilive.a.b(aVar2.f18937a)) {
                        ((a) b.this.y).j();
                    } else if (com.bytedance.android.live.liveinteract.multilive.a.a(b.this.w)) {
                        ((a) b.this.y).i();
                    } else {
                        ((a) b.this.y).j();
                    }
                } else if (com.bytedance.android.live.liveinteract.multilive.a.b()) {
                    ((a) b.this.y).k();
                }
            }
        }

        @Override // com.bytedance.android.live.liveinteract.platform.a.b.a, com.bytedance.android.live.liveinteract.platform.a.b.c
        public final void h(aj ajVar) {
            if (com.bytedance.android.live.liveinteract.multilive.a.c()) {
                super.h(ajVar);
                com.bytedance.android.livesdk.chatroom.model.c.a a2 = com.bytedance.android.live.liveinteract.multilive.a.a();
                if (!com.bytedance.android.live.liveinteract.multilive.a.a(a2)) {
                    ((a) b.this.y).k();
                } else if (!com.bytedance.android.live.liveinteract.multilive.a.b(a2)) {
                    ((a) b.this.y).j();
                } else if (!com.bytedance.android.live.liveinteract.multilive.a.a((Room) b.this.w.b(df.class))) {
                    ((a) b.this.y).i();
                }
            }
        }

        @Override // com.bytedance.android.live.liveinteract.platform.a.b.a, com.bytedance.android.live.liveinteract.platform.a.b.f
        public final void e(aj ajVar) {
            List<com.bytedance.android.livesdk.model.message.d.f.b> list;
            if (b.this.y != null && !b.this.f10499d) {
                boolean z = false;
                boolean z2 = true;
                if (ajVar.c() == aj.a.ANCHOR_LINKMIC) {
                    if (!(ajVar.f19146l == null || (list = ajVar.f19146l.f19508a) == null || list.size() < 2)) {
                        for (com.bytedance.android.livesdk.model.message.d.f.b bVar : list) {
                            if (bVar.f19549a.getId() == b.this.f10498c.getOwnerUserId()) {
                                z = true;
                            } else {
                                b.this.f10496a.f9941f = bVar.f19549a.getId();
                            }
                        }
                        if (z) {
                            if (!(b.this.f10503h.a() instanceof com.bytedance.android.live.liveinteract.cohost.b.a)) {
                                b.this.a();
                            }
                            b.a.a().f9936a = true;
                            ((a) b.this.y).b();
                        }
                    }
                } else if (ajVar.c() == aj.a.AUDIENCE_LINKMIC && ajVar.f19146l != null) {
                    List<com.bytedance.android.livesdk.model.message.d.f.b> list2 = ajVar.f19146l.f19508a;
                    if (list2.size() == 1 && list2.get(0).f19549a.getId() == b.this.f10498c.getOwnerUserId()) {
                        long j2 = ajVar.f19146l.f19509b;
                        b bVar2 = b.this;
                        if (j2 != 1) {
                            z2 = false;
                        }
                        bVar2.f10502g = z2;
                        com.bytedance.android.livesdk.b.a.d.a().f14184e = list2.get(0).f19551c;
                        z.f12041b = "others";
                        ((a) b.this.y).a(LinkApi.e.AUDIENCE_OPEN);
                    }
                }
            }
        }

        @Override // com.bytedance.android.live.liveinteract.platform.a.b.a, com.bytedance.android.live.liveinteract.platform.a.b.f
        public final void f(aj ajVar) {
            List<com.bytedance.android.livesdk.model.message.d.f.b> list;
            if (!(b.this.y == null || b.this.f10499d || ajVar.c() != aj.a.ANCHOR_LINKMIC || ajVar.f19145k == null || (list = ajVar.f19145k.f19548a) == null || list.size() < 2)) {
                boolean z = false;
                long j2 = 0;
                for (com.bytedance.android.livesdk.model.message.d.f.b bVar : list) {
                    if (bVar.f19549a.getId() == b.this.f10498c.getOwnerUserId()) {
                        z = true;
                    } else {
                        j2 = bVar.f19549a.getId();
                    }
                }
                if (z) {
                    if (!(b.this.f10503h.a() instanceof com.bytedance.android.live.liveinteract.cohost.b.a)) {
                        b.this.a();
                    }
                    b.a.a().f9936a = true;
                    b.a.a().f9941f = j2;
                    ((a) b.this.y).b();
                }
            }
        }

        @Override // com.bytedance.android.live.liveinteract.platform.a.b.a, com.bytedance.android.live.liveinteract.platform.a.b.c
        public final void c(aj ajVar) {
            String str;
            String str2;
            DataChannel dataChannel;
            if (b.this.f10499d && ajVar.c() == aj.a.ANCHOR_LINKMIC && ajVar.f19143i != null) {
                com.bytedance.android.live.core.c.a.a(3, "LinkControlPresenter", "receive reply  message");
                com.bytedance.android.live.liveinteract.cohost.c.b.a(ajVar);
                b.this.d();
                com.bytedance.android.livesdk.model.message.d.k.a aVar = ajVar.f19143i;
                if (aVar.f19579i == 2 || aVar.f19579i == 5) {
                    ((a) b.this.y).b(aVar.f19579i);
                }
                if (b.this.f10496a.f9940e != ajVar.f19140f || b.this.f10496a.f9941f == 0) {
                    return;
                }
                if (b.this.f10496a.a(k.CONNECTION_FINISH)) {
                    ao.a(y.e(), ((a) b.this.y).a(aVar.f19579i));
                    return;
                }
                try {
                    com.bytedance.android.live.liveinteract.cohost.b.a aVar2 = (com.bytedance.android.live.liveinteract.cohost.b.a) b.this.f10503h.b(a.EnumC0247a.COHOST);
                    l.d(ajVar, "");
                    com.bytedance.android.livesdk.model.message.d.k.a aVar3 = ajVar.f19143i;
                    aVar2.a().b(ajVar.v);
                    boolean z = true;
                    if (aVar3.f19579i == 1) {
                        aVar2.f11863f = aVar3.f19574d.f19597h;
                        aVar2.a().d(aVar3.f19574d.f19597h);
                        aVar2.a().M = aVar3.f19577g.f19597h;
                        g.a.f14199a.a(aVar3.f19575e, aVar3.f19577g.f19597h);
                        aVar2.a().C = System.currentTimeMillis();
                        if (!TextUtils.isEmpty(aVar3.f19574d.f19594e)) {
                            aVar2.a().a(aVar3.f19574d.f19594e);
                        }
                        if (!LinkServerAutoJoinChannel.INSTANCE.getValue() && (dataChannel = aVar2.n) != null) {
                            dataChannel.c(com.bytedance.android.live.liveinteract.cohost.a.b.e.class);
                        }
                    }
                    ((a) b.this.y).a(aVar.f19579i, PrivacyCert.Builder.with("bpea-503").usage("").tag("link mic start to push stream").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                    if (aVar.f19579i != 1) {
                        z = false;
                    }
                    com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_connection_response_receive").a().a("connection_type", "anchor").a("invitee_id", b.a.a().f9941f);
                    if (b.a.a().p == m.FOLLOW_INVITE) {
                        str = "mutual_follow";
                    } else {
                        str = "recommend";
                    }
                    com.bytedance.android.livesdk.ab.b a3 = a2.a("invitee_list", str);
                    if (z) {
                        str2 = "accept";
                    } else {
                        str2 = "reject";
                    }
                    a3.a("selection", str2).a("response_duration", System.currentTimeMillis() - b.a.a().ac).b();
                } catch (NullPointerException unused) {
                }
            }
        }

        @Override // com.bytedance.android.live.liveinteract.platform.a.b.a, com.bytedance.android.live.liveinteract.platform.a.b.c
        public final void b(aj ajVar) {
            Boolean bool;
            ab<R> a2;
            Room room;
            if (b.this.y != null && b.this.f10499d && ajVar.c() == aj.a.ANCHOR_LINKMIC) {
                com.bytedance.android.livesdk.model.message.d.c.d a3 = com.bytedance.android.live.liveinteract.platform.common.h.b.a(ajVar);
                com.bytedance.android.live.liveinteract.cohost.c.b.a(ajVar, a3);
                if (a3 != null && ajVar.f19142h != null && a3.f19542h != null) {
                    b.this.a();
                    if (b.this.f10503h.a() instanceof com.bytedance.android.live.liveinteract.cohost.b.a) {
                        b.this.f10503h.a().f11865h = false;
                        com.bytedance.android.live.liveinteract.cohost.b.a aVar = (com.bytedance.android.live.liveinteract.cohost.b.a) b.this.f10503h.a();
                        boolean z = b.this.f10501f;
                        y yVar = new y(this, a3);
                        l.d(ajVar, "");
                        l.d(yVar, "");
                        com.bytedance.android.livesdk.model.message.d.c.d a4 = com.bytedance.android.live.liveinteract.platform.common.h.b.a(ajVar);
                        if (a4 != null && ajVar.f19142h != null && a4.f19542h != null) {
                            l.d(ajVar, "");
                            com.bytedance.android.livesdk.model.message.d.c.d a5 = com.bytedance.android.live.liveinteract.platform.common.h.b.a(ajVar);
                            DataChannel dataChannel = aVar.n;
                            int i2 = 12;
                            if (dataChannel == null || (room = (Room) dataChannel.b(df.class)) == null || room.getMosaicStatus() != 1) {
                                com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cj;
                                l.b(bVar, "");
                                Boolean a6 = bVar.a();
                                l.b(a6, "");
                                if (a6.booleanValue()) {
                                    i2 = 2;
                                } else {
                                    if (a5 == null) {
                                        l.b();
                                    }
                                    if (a5.f19535a == 2) {
                                        if (aVar.a().f9941f <= 0) {
                                            if (((long) a5.f19537c) != aVar.a().E) {
                                                i2 = 8;
                                            }
                                            i2 = 0;
                                        }
                                    } else if (z) {
                                        i2 = 9;
                                    } else if (!LiveAppBundleUtils.isPluginAvailable(com.bytedance.android.livesdk.utils.b.LINK_MIC)) {
                                        LiveAppBundleUtils.ensurePluginAvailable(y.e(), com.bytedance.android.livesdk.utils.b.LINK_MIC);
                                        i2 = 10;
                                    } else {
                                        com.bytedance.android.livesdk.b.a.d a7 = com.bytedance.android.livesdk.b.a.d.a();
                                        l.b(a7, "");
                                        if (a7.f14182c || (com.bytedance.android.live.liveinteract.api.aj.a(aVar.a().a(), 2) && !TTliveLinkmicModeSwitchOpenSetting.INSTANCE.getValue())) {
                                            i2 = 11;
                                        } else {
                                            DataChannel dataChannel2 = aVar.n;
                                            if (dataChannel2 != null) {
                                                bool = (Boolean) dataChannel2.b(co.class);
                                            } else {
                                                bool = null;
                                            }
                                            if (!p.a(bool)) {
                                                if (b.a.a().al) {
                                                    i2 = 13;
                                                } else if (TextUtils.isEmpty(aVar.a().M) && aVar.a().f9941f <= 0) {
                                                    if (a5.f19540f != 4 || (ajVar.f19142h.f19527e & 12) <= 0) {
                                                        i2 = 3;
                                                    } else {
                                                        if (Build.VERSION.SDK_INT < 21) {
                                                            i2 = 7;
                                                        }
                                                        i2 = 0;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i2 = 4;
                                }
                            } else {
                                i2 = 6;
                            }
                            com.bytedance.android.live.core.c.a.a(4, "CoHostLinker", "tryRefuseInvite, refuseReason = $refuseReason");
                            if (i2 > 0) {
                                long j2 = ajVar.f19142h.f19523a;
                                long j3 = ajVar.f19140f;
                                int i3 = ajVar.f19142h.f19527e;
                                String str = ajVar.v;
                                HashMap hashMap = new HashMap();
                                hashMap.put("channel_id", Long.valueOf(j3));
                                hashMap.put("room_id", Long.valueOf(aVar.f11862e));
                                hashMap.put("vendor", Integer.valueOf(i3));
                                hashMap.put("rtc_join_channel_advance", Boolean.valueOf(ajVar.f19142h.f19526d));
                                hashMap.put("guest_user_id", Long.valueOf(j2));
                                hashMap.put("reply_status", Integer.valueOf(i2));
                                l.b(str, "");
                                hashMap.put("transparent_extra", str);
                                ab<com.bytedance.android.live.liveinteract.platform.a.c.a> b2 = aVar.b(hashMap);
                                if (b2 != null && (a2 = b2.a(new f())) != null) {
                                    a2.a(a.l.f10198a, new a.m(aVar));
                                    return;
                                }
                                return;
                            }
                            if (TTliveLinkmicMsgOptimizationSwitchSetting.INSTANCE.getValue() != 1 || !ajVar.e()) {
                                long d2 = ajVar.d();
                                long value = (long) (MtCoHostReceiveInviteMessageTimeOutSetting.INSTANCE.getValue() * 1000);
                                if (d2 >= value) {
                                    com.bytedance.android.live.liveinteract.cohost.c.b.a(ajVar, 0, value, a4);
                                    return;
                                }
                            } else {
                                long f2 = ajVar.f();
                                long value2 = (long) (TTliveLinkmicMsgOptimizationAtLeastAvailableTimeSetting.INSTANCE.getValue() * 1000);
                                if (f2 < value2) {
                                    com.bytedance.android.live.liveinteract.cohost.c.b.a(ajVar, value2, 0, a4);
                                    return;
                                }
                                aVar.a().Y = (int) (ajVar.f() / 1000);
                            }
                            com.bytedance.android.livesdk.model.message.d.c.c cVar = ajVar.f19142h;
                            aVar.a().b(ajVar.v);
                            aVar.a().f9940e = ajVar.f19140f;
                            aVar.f11866i = ajVar.f19140f;
                            aVar.a().f9937b = true;
                            aVar.a().d(cVar.f19529g);
                            aVar.a().M = cVar.f19530h;
                            aVar.f11863f = cVar.f19529g;
                            aVar.a().f9941f = cVar.f19523a;
                            aVar.a().r = a4.f19539e;
                            aVar.a().D = a4.f19535a;
                            if (a4.f19538d != null) {
                                com.bytedance.android.live.liveinteract.api.a.b a8 = aVar.a();
                                String str2 = a4.f19538d;
                                l.b(str2, "");
                                a8.s = str2;
                            }
                            aVar.a().f9943h = cVar.f19524b;
                            aVar.a().f9944i = aVar.f11862e;
                            int i4 = a4.f19536b;
                            if (i4 == 1) {
                                aVar.a().p = m.FOLLOW_INVITE;
                            } else if (i4 == 2) {
                                aVar.a().p = m.RECOMMEND_INVITE;
                            } else if (i4 == 5) {
                                aVar.a().p = m.RANDOM_LINK_MIC_INVITE;
                            } else if (i4 == 20) {
                                aVar.a().p = m.WEEKLY_RANK_INVITE;
                            } else if (i4 == 21) {
                                aVar.a().p = m.HOURLY_RANK_INVITE;
                            } else if (i4 == m.NONE.getType()) {
                                aVar.a().p = m.NONE;
                            } else {
                                aVar.a().p = m.ACTIVITY;
                                aVar.a().p.setType(a4.f19536b);
                            }
                            aVar.a().E = (long) a4.f19537c;
                            aVar.a().f9942g = cVar.f19528f;
                            if (cVar.f19526d && !TextUtils.isEmpty(cVar.f19525c)) {
                                aVar.a().a(cVar.f19525c);
                            }
                            aVar.a().w = cVar.f19526d;
                            aVar.a().f9948m = true;
                            com.bytedance.android.live.liveinteract.platform.common.g.b.a(b.c.ANCHOR, false);
                            yVar.invoke();
                        }
                    }
                }
            }
        }
    };

    public interface a extends bq {
        static {
            Covode.recordClassIndex(5592);
        }

        int a(int i2);

        void a();

        void a(int i2, PrivacyCert privacyCert);

        void a(LinkApi.e eVar);

        void a(LinkApi.e eVar, Throwable th);

        void a(aj ajVar);

        void a(com.bytedance.android.livesdk.model.message.d.c.d dVar);

        void a(boolean z);

        void b();

        void b(int i2);

        void b(boolean z);

        void c();

        void d();

        void e();

        void f();

        void h();

        void i();

        void j();

        void k();
    }

    static {
        Covode.recordClassIndex(5590);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(LinkApi.e eVar, Throwable th) {
        this.f10500e = false;
        a(th);
        if (!(th instanceof com.bytedance.android.live.a.a.b.a) || ((com.bytedance.android.live.a.a.a) th).getErrorCode() != 31011) {
            ((a) this.y).a(eVar, th);
        } else {
            ((ac) ((LinkReviewApi) com.bytedance.android.live.network.e.a().a(LinkReviewApi.class)).bannedInfo(13).a(u())).a(new w(this), new x(this));
        }
    }

    public final void d() {
        f.a.b.b bVar = this.f10497b;
        if (bVar != null) {
            bVar.dispose();
            this.f10497b = null;
        }
        f();
    }

    public static boolean c() {
        if (!com.bytedance.android.live.liveinteract.api.aj.a(b.a.a().a(), 2) || TTliveLinkmicModeSwitchOpenSetting.INSTANCE.getValue()) {
            return false;
        }
        return true;
    }

    private void f() {
        b.a.a().N = -1;
        if (this.w != null) {
            this.w.b(j.class, (Object) -1);
        }
    }

    private static com.bytedance.android.livesdk.chatroom.model.c.a e() {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar;
        com.bytedance.android.livesdk.chatroom.model.c.a aVar2;
        if (e.f10014a.a("MULTI_GUEST_DATA_HOLDER") != null && (aVar = (com.bytedance.android.live.liveinteract.multiguest.opt.a.a) e.f10014a.a("MULTI_GUEST_DATA_HOLDER")) != null && (aVar2 = aVar.f11299i) != null) {
            return aVar2;
        }
        com.bytedance.android.livesdk.chatroom.model.c.a aVar3 = com.bytedance.android.livesdk.b.a.d.a().w;
        if (aVar3 == null) {
            return new com.bytedance.android.livesdk.chatroom.model.c.a((byte) 0);
        }
        return aVar3;
    }

    public final void a() {
        e.f10014a.a(new com.bytedance.android.live.liveinteract.cohost.c.a(), null);
        com.bytedance.android.live.liveinteract.platform.a.a.b bVar = new com.bytedance.android.live.liveinteract.platform.a.a.b();
        bVar.f11858b = this.f10499d;
        this.f10503h.a(this.f10498c.getOwnerUserId(), a.EnumC0247a.COHOST, this.w, bVar);
    }

    @Override // com.bytedance.ies.a.b, com.bytedance.android.livesdk.chatroom.e.r
    public final void b() {
        this.f10496a.e("LinkControlPresenter_OnDestroy");
        this.f10506k.b(this.f10507l);
        this.f10504i.removeCallbacksAndMessages(null);
        d();
        Object a2 = e.f10014a.a("MULTI_GUEST_DATA_HOLDER");
        if (a2 instanceof com.bytedance.android.live.liveinteract.multiguest.opt.a.a) {
            h.a(((com.bytedance.android.live.liveinteract.multiguest.opt.a.a) a2).q);
        } else {
            h.a((n) null);
        }
        if (com.bytedance.android.live.liveinteract.cohost.a.c.a.a()) {
            com.bytedance.android.live.liveinteract.cohost.a.c.a.a(a.b.EXIT);
        }
        super.b();
    }

    public final void onEvent(com.bytedance.android.live.liveinteract.api.b.f fVar) {
        if (this.y != null) {
            ((a) this.y).f();
        }
    }

    public final void onEvent(com.bytedance.android.live.liveinteract.api.b.d dVar) {
        if (this.y != null) {
            int i2 = dVar.f9976a;
            if (i2 == 1) {
                ((a) this.y).a();
            } else if (i2 == 2) {
                ((a) this.y).c();
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.c.a.AbstractC0502a
    public final void handleMsg(Message message) {
        if (this.y == null || message.what != 2) {
            return;
        }
        if (!(message.obj instanceof Room) || !Room.isValid((Room) message.obj)) {
            a(this.f10498c);
        } else {
            a((Room) message.obj);
        }
    }

    private void a(Room room) {
        boolean z;
        this.f10498c = room;
        com.bytedance.android.live.liveinteract.platform.common.g.a.a("SyncRoomStats", room);
        if (this.f10498c.isWithLinkMic()) {
            if (this.f10498c.getLinkMicInfo() == null || this.f10498c.getLinkMicInfo().f23170f != 1) {
                z = false;
            } else {
                z = true;
            }
            this.f10502g = z;
            z.f12041b = "live_play";
            com.bytedance.android.live.liveinteract.multilive.a.c(room);
            ((a) this.y).a(LinkApi.e.AUDIENCE_OPEN);
        }
        if (this.f10502g) {
            b(this.f10498c);
        }
        com.bytedance.android.livesdkapi.depend.model.live.p linkMicInfo = this.f10498c.getLinkMicInfo();
        if (linkMicInfo != null) {
            com.bytedance.android.live.liveinteract.api.a.b a2 = b.a.a();
            a2.f9941f = linkMicInfo.f23166b;
            a2.a(linkMicInfo);
            if (a2.f9940e > 0) {
                ((a) this.y).b();
            }
        }
    }

    private void b(Room room) {
        com.bytedance.android.livesdk.model.a.b bVar;
        if (this.f10502g && room.multiLiveUserSettings != null && room.multiLiveUserSettings.f18940a != null && (bVar = room.multiLiveUserSettings.f18940a.f18939a) != null) {
            com.bytedance.android.livesdk.chatroom.model.c.a e2 = e();
            int i2 = bVar.f18938a;
            if (i2 == 1) {
                e2.f15742c = 3;
                e2.f15743d = 4;
                com.bytedance.android.livesdk.b.a.d.a().w = e2;
                ((a) this.y).j();
            } else if (i2 == 2) {
                e2.f15742c = 3;
                e2.f15743d = 3;
                com.bytedance.android.livesdk.b.a.d.a().w = e2;
                if (com.bytedance.android.live.liveinteract.multilive.a.a(this.w)) {
                    ((a) this.y).i();
                } else {
                    ((a) this.y).j();
                }
            } else if (i2 == 3) {
                e2.f15742c = 4;
                e2.f15743d = 4;
                com.bytedance.android.livesdk.b.a.d.a().w = e2;
                if (com.bytedance.android.live.liveinteract.multilive.a.b()) {
                    ((a) this.y).k();
                }
            }
        }
    }

    public final void a(int i2) {
        com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCross_Reply_RtcJoinChannelFailed", true);
        HashMap<String, Object> d2 = com.bytedance.android.live.liveinteract.cohost.c.b.d();
        d2.put("reply_status", Integer.valueOf(i2));
        if (this.f10503h.a() instanceof com.bytedance.android.live.liveinteract.cohost.b.a) {
            if (this.f10503h.a().b(d2) != null) {
                ((ac) this.f10503h.a().b(d2).a(u())).a(p.f10523a, new q(this));
            }
            ((com.bytedance.android.live.liveinteract.cohost.b.a) this.f10503h.a()).c();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(int i2) {
        com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCross_Invite_TimeOut");
        com.bytedance.android.live.core.d.a.a(new JSONObject(), "time_out", (long) i2);
        com.bytedance.android.live.liveinteract.cohost.c.b bVar = com.bytedance.android.live.liveinteract.cohost.c.b.f10210e;
        com.bytedance.android.live.liveinteract.cohost.c.b.a((com.bytedance.android.live.liveinteract.cohost.c.b) "invite_timeout", (String) new JSONObject(), (JSONObject) 0);
        a(LinkApi.a.COUNTDOWN_CANCEL);
        ao.a(y.e(), (int) R.string.dy0);
    }

    public final void a(a aVar) {
        super.a((bq) aVar);
        this.f10504i = new com.bytedance.android.livesdkapi.depend.c.a(this);
        ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.live.liveinteract.api.b.d.class).a(t())).a(new c(this));
        ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.live.liveinteract.api.b.f.class).a(t())).a(new d(this));
        ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.live.liveinteract.api.b.g.class).a(t())).a(new o(this));
        ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.live.liveinteract.api.b.a.class).a(t())).a(new r(this));
        this.f10506k.a(this.f10507l);
        if (this.f10499d) {
            Room room = (Room) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.j.ac.class);
            if (room != null) {
                ((LinkApi) com.bytedance.android.live.network.e.a().a(LinkApi.class)).getAnchorLinkMicUserSetting(room.getId(), room.getOwner().getSecUid()).a(new f()).a(com.bytedance.android.live.liveinteract.platform.common.api.b.f11899a, com.bytedance.android.live.liveinteract.platform.common.api.c.f11900a);
            }
        } else if (com.bytedance.android.live.liveinteract.api.a.b.c()) {
            a(this.f10498c);
        } else {
            com.bytedance.android.livesdk.chatroom.b.f.f14958a.a(this.f10504i, this.f10499d, this.f10498c.getId(), 2);
        }
        if (this.f10499d && this.f10505j == i.VIDEO) {
            ((ac) ((CoHostApi) com.bytedance.android.live.network.e.a().a(CoHostApi.class)).checkPermissionV3(this.f10498c.getId()).a(u())).a(new e(this), new f(this));
            ((ac) ((LinkApi) com.bytedance.android.live.network.e.a().a(LinkApi.class)).checkPermissionV1(this.f10498c.getId(), this.f10498c.getOwnerUserId(), 1).a(u())).a(new g(this), new h(this));
        }
        if (this.w != null) {
            this.w.a(com.bytedance.android.live.liveinteract.cohost.a.b.i.class, (h.f.a.b) new s(this)).a(com.bytedance.android.live.liveinteract.cohost.a.b.h.class, (h.f.a.b) new t(this));
        }
    }

    public final void a(LinkApi.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("cancel_reason", aVar);
        if (!(this.f10503h.a() == null || this.f10503h.a().e(hashMap) == null)) {
            ((ac) this.f10503h.a().e(hashMap).a(u())).a(i.f10515a, new j(this));
        }
        if (this.f10503h.a() instanceof com.bytedance.android.live.liveinteract.cohost.b.a) {
            ((com.bytedance.android.live.liveinteract.cohost.b.a) this.f10503h.a()).c();
        }
        f();
        this.f10497b = null;
    }

    public final void a(LinkApi.e eVar) {
        int i2;
        com.bytedance.android.live.core.c.a.a(4, "LinkControlPresenter", "initAndTurnOnMultiGuest, mTurningOnAudienceInteract = " + this.f10500e + "  mIsMicRoom = " + this.f10501f);
        if (!this.f10500e && !this.f10501f) {
            this.f10500e = true;
            e.f10014a.a(new com.bytedance.android.live.liveinteract.multiguest.c.a(), null);
            com.bytedance.android.live.liveinteract.platform.a.a.b bVar = new com.bytedance.android.live.liveinteract.platform.a.a.b();
            bVar.f11858b = this.f10499d;
            this.f10503h.a(this.f10498c.getOwnerUserId(), a.EnumC0247a.MULTIGUEST, this.w, bVar);
            if (this.f10498c.isLiveTypeAudio()) {
                i2 = 8;
            } else {
                i2 = 1;
            }
            if (this.w != null) {
                this.w.a(com.bytedance.android.live.liveinteract.platform.common.c.c.class, (Object) null);
            }
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) com.bytedance.android.livesdk.ap.a.ck, (Object) true);
            if (this.f10503h.a() instanceof com.bytedance.android.live.liveinteract.multiguest.b.a) {
                com.bytedance.android.live.liveinteract.multiguest.b.a aVar = (com.bytedance.android.live.liveinteract.multiguest.b.a) this.f10503h.a();
                long id = this.f10498c.getId();
                l.d(eVar, "");
                HashMap hashMap = new HashMap();
                hashMap.put("source", eVar);
                aVar.f11862e = id;
                com.bytedance.android.live.liveinteract.platform.b.a aVar2 = aVar.f11162c;
                if (aVar2 == null) {
                    l.a("mLinkLogger");
                }
                aVar2.b().i(hashMap);
                ab<R> a2 = ((LinkApi) com.bytedance.android.live.network.e.a().a(LinkApi.class)).init(id, 12, i2).a(new f()).a(new a.C0213a(aVar, hashMap, id, eVar));
                l.b(a2, "");
                ((ac) a2.a(u())).a(new u(this, eVar), new v(this, eVar));
            }
        }
    }

    public b(Room room, boolean z, i iVar) {
        this.f10498c = room;
        this.f10499d = z;
        this.f10505j = iVar;
        e.f10014a.a(this);
    }
}

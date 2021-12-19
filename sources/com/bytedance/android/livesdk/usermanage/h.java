package com.bytedance.android.livesdk.usermanage;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.n.y;
import com.bytedance.android.live.u.g;
import com.bytedance.android.livesdk.chatroom.c.r;
import com.bytedance.android.livesdk.chatroom.c.t;
import com.bytedance.android.livesdk.j.ce;
import com.bytedance.android.livesdk.j.cf;
import com.bytedance.android.livesdk.j.cy;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.dn;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.j.m;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.model.ba;
import com.bytedance.android.livesdk.model.message.az;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import f.a.ae;
import f.a.d.f;
import h.a.ag;
import h.f.b.l;
import h.p;
import h.v;
import org.json.JSONObject;

public final class h implements com.bytedance.android.live.s.d {

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.android.livesdk.ui.a f22047a;

    /* renamed from: b  reason: collision with root package name */
    public final DataChannel f22048b;

    /* renamed from: c  reason: collision with root package name */
    public final f.a.b.a f22049c;

    /* renamed from: d  reason: collision with root package name */
    private final e f22050d = new e(this);

    final /* synthetic */ class b implements f {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f22052a;

        static {
            Covode.recordClassIndex(12989);
        }

        b(h.f.a.b bVar) {
            this.f22052a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            l.b(this.f22052a.invoke(obj), "");
        }
    }

    static {
        Covode.recordClassIndex(12982);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f22051a;

        static {
            Covode.recordClassIndex(12988);
        }

        a(h hVar) {
            this.f22051a = hVar;
        }

        public final void run() {
            this.f22051a.c();
        }
    }

    private User d() {
        return (User) this.f22048b.b(dn.class);
    }

    @Override // com.bytedance.android.live.s.d
    public final void a() {
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        l.b(b2, "");
        if (b2.e()) {
            g.a(new a(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        Object b2 = this.f22048b.b(ee.class);
        if (b2 == null) {
            l.b();
        }
        return ((Boolean) b2).booleanValue();
    }

    public final void c() {
        String str;
        Room room = (Room) this.f22048b.b(df.class);
        if (room != null) {
            p[] pVarArr = new p[7];
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            l.b(b2, "");
            pVarArr[0] = v.a("target_uid", String.valueOf(b2.c()));
            com.bytedance.android.livesdk.at.f b3 = u.a().b();
            l.b(b3, "");
            com.bytedance.android.live.base.model.user.b a2 = b3.a();
            l.b(a2, "");
            pVarArr[1] = v.a("sec_target_uid", a2.getSecUid());
            pVarArr[2] = v.a("packed_level", "2");
            pVarArr[3] = v.a("request_from", "admin");
            pVarArr[4] = v.a("current_room_id", String.valueOf(room.getId()));
            User owner = room.getOwner();
            if (owner == null || (str = String.valueOf(owner.getId())) == null) {
                str = "";
            }
            pVarArr[5] = v.a("anchor_id", str);
            com.bytedance.android.livesdk.at.f b4 = u.a().b();
            User owner2 = room.getOwner();
            l.b(owner2, "");
            pVarArr[6] = v.a("sec_anchor_id", b4.a(owner2.getId()));
            u.a().b().a(ag.c(pVarArr)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a_(this.f22050d);
        }
    }

    public static final class e implements ae<com.bytedance.android.live.base.model.user.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f22055a;

        static {
            Covode.recordClassIndex(12992);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(h hVar) {
            this.f22055a = hVar;
        }

        @Override // f.a.ae
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
            this.f22055a.f22049c.a(bVar);
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            l.d(th, "");
            if (!(th instanceof com.bytedance.android.live.a.a.b.a)) {
                th = null;
            }
            com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) th;
            if (aVar != null) {
                this.f22055a.a(aVar);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.ae
        public final /* synthetic */ void onSuccess(com.bytedance.android.live.base.model.user.b bVar) {
            boolean z;
            com.bytedance.android.live.base.model.user.b bVar2 = bVar;
            l.d(bVar2, "");
            if (this.f22055a.f22047a.isViewValid()) {
                User user = (User) bVar2;
                this.f22055a.a(user);
                com.bytedance.android.livesdk.ap.b<Boolean> bVar3 = com.bytedance.android.livesdk.ap.a.ab;
                l.b(bVar3, "");
                boolean z2 = false;
                com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar3, (Object) false);
                ba userAttr = user.getUserAttr();
                if (userAttr != null) {
                    DataChannel dataChannel = this.f22055a.f22048b;
                    boolean z3 = userAttr.f19029a;
                    if (userAttr.f19032d == -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    dataChannel.c(m.class, new com.bytedance.android.livesdk.event.b(z3, z));
                }
                com.bytedance.android.live.b.f fVar = (com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class);
                if (userAttr != null && userAttr.f19029a) {
                    z2 = true;
                }
                fVar.setUserSilent(z2);
            }
        }
    }

    public final void onEvent(t tVar) {
        this.f22048b.b(ce.class, tVar);
    }

    /* access modifiers changed from: package-private */
    public static final class d implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        public static final d f22054a = new d();

        static {
            Covode.recordClassIndex(12991);
        }

        d() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            com.bytedance.android.livesdk.an.a.a().a(new r(8));
        }
    }

    public final void a(User user) {
        com.bytedance.android.livesdk.at.f b2;
        com.bytedance.android.live.base.model.user.b a2;
        DataChannel dataChannel = this.f22048b;
        if (user != null) {
            dataChannel.b(dn.class, user);
            if (user.getUserAttr() != null && (b2 = u.a().b()) != null && (a2 = b2.a()) != null) {
                a2.setUserAttr(user.getUserAttr());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        com.bytedance.android.live.p.l.SHARE.setRedDotVisible(this.f22048b, z);
        u.a().b().a(z ? 1 : 0);
        User d2 = d();
        if (d2 != null) {
            if (d2.getUserAttr() == null) {
                d2.setUserAttr(new ba());
            }
            ba userAttr = d2.getUserAttr();
            l.b(userAttr, "");
            userAttr.f19030b = z;
            return;
        }
        c();
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z) {
        ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).setUserSilent(z);
        User d2 = d();
        if (d2 != null) {
            if (d2.getUserAttr() == null) {
                d2.setUserAttr(new ba());
            }
            ba userAttr = d2.getUserAttr();
            l.b(userAttr, "");
            userAttr.f19029a = z;
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "error_code", 0L);
            com.bytedance.android.live.core.d.a.a(jSONObject, "error_msg", "is ban: ".concat(String.valueOf(z)));
            com.bytedance.android.live.core.d.c.a("ttlive_audience_ban_talk", 0, jSONObject);
            return;
        }
        c();
    }

    public final void a(com.bytedance.android.live.a.a.b.a aVar) {
        int errorCode = aVar.getErrorCode();
        if (errorCode == 30003) {
            com.bytedance.android.livesdk.an.a.a().a(new r(10011, (byte) 0));
        } else if (errorCode != 30005) {
            if (errorCode != 30006) {
                switch (errorCode) {
                    case 50001:
                        this.f22048b.c(m.class, new com.bytedance.android.livesdk.event.b(true));
                        return;
                    case 50002:
                        com.bytedance.android.livesdk.an.a.a().a(new r(10));
                        return;
                    default:
                        return;
                }
            } else if (!b()) {
                com.bytedance.android.livesdk.an.a.a().a(new r(20));
            }
        } else if (this.f22047a.isViewValid()) {
            b.a a2 = new b.a(this.f22047a.getActivity()).a(R.string.gv2).b(R.string.gpc).a(R.string.gr8, (DialogInterface.OnClickListener) c.f22053a, false);
            a2.f18289f = d.f22054a;
            a2.a().show();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final c f22053a = new c();

        static {
            Covode.recordClassIndex(12990);
        }

        c() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    public h(com.bytedance.android.livesdk.ui.a aVar, DataChannel dataChannel, f.a.b.a aVar2) {
        l.d(aVar, "");
        l.d(dataChannel, "");
        l.d(aVar2, "");
        this.f22047a = aVar;
        this.f22048b = dataChannel;
        this.f22049c = aVar2;
        ((z) com.bytedance.android.livesdk.an.a.a().a(t.class).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(com.bytedance.android.livesdk.util.rxutils.autodispose.e.a((Fragment) aVar))).a(new b(new h.f.a.b<t, h.z>(this) {
            /* class com.bytedance.android.livesdk.usermanage.h.AnonymousClass1 */

            static {
                Covode.recordClassIndex(12983);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(t tVar) {
                t tVar2 = tVar;
                l.d(tVar2, "");
                ((h) this.receiver).onEvent(tVar2);
                return h.z.f158842a;
            }
        }));
        dataChannel.a((androidx.lifecycle.m) aVar, cy.class, (h.f.a.b) new h.f.a.b<com.bytedance.android.live.a.a.b.a, h.z>(this) {
            /* class com.bytedance.android.livesdk.usermanage.h.AnonymousClass2 */

            static {
                Covode.recordClassIndex(12984);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(com.bytedance.android.live.a.a.b.a aVar) {
                com.bytedance.android.live.a.a.b.a aVar2 = aVar;
                l.d(aVar2, "");
                ((h) this.receiver).a(aVar2);
                return h.z.f158842a;
            }
        }).a((Object) aVar, cf.class, (h.f.a.b) new h.f.a.b<az, h.z>(this) {
            /* class com.bytedance.android.livesdk.usermanage.h.AnonymousClass3 */

            static {
                Covode.recordClassIndex(12985);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(az azVar) {
                az azVar2 = azVar;
                l.d(azVar2, "");
                h hVar = (h) this.receiver;
                User user = azVar2.f19234f;
                if (user != null) {
                    long id = user.getId();
                    com.bytedance.android.livesdk.at.f b2 = u.a().b();
                    l.b(b2, "");
                    if (id == b2.c()) {
                        boolean z = false;
                        switch (azVar2.f19236h) {
                            case 3:
                            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                                DataChannel dataChannel = hVar.f22048b;
                                Long l2 = azVar2.w;
                                if (l2 != null && l2.longValue() == -1) {
                                    z = true;
                                }
                                dataChannel.c(m.class, new com.bytedance.android.livesdk.event.b(true, z));
                                hVar.b(true);
                                break;
                            case 4:
                            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                                hVar.f22048b.c(m.class, new com.bytedance.android.livesdk.event.b(false));
                                hVar.b(false);
                                break;
                            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                                hVar.a(true);
                                break;
                            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                                hVar.a(false);
                                break;
                            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                                com.bytedance.android.livesdk.an.a.a().a(new r(11));
                                break;
                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                                if (!hVar.b()) {
                                    com.bytedance.android.livesdk.an.a.a().a(new r(20));
                                    break;
                                }
                                break;
                        }
                    }
                }
                return h.z.f158842a;
            }
        }).a((androidx.lifecycle.m) aVar, y.class, (h.f.a.b) new h.f.a.b<h.z, h.z>(this) {
            /* class com.bytedance.android.livesdk.usermanage.h.AnonymousClass4 */
            final /* synthetic */ h this$0;

            static {
                Covode.recordClassIndex(12986);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(h.z zVar) {
                l.d(zVar, "");
                this.this$0.a();
                return h.z.f158842a;
            }
        }).a((Object) aVar, ce.class, (h.f.a.b) new h.f.a.b<t, h.z>(this) {
            /* class com.bytedance.android.livesdk.usermanage.h.AnonymousClass5 */
            final /* synthetic */ h this$0;

            static {
                Covode.recordClassIndex(12987);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(t tVar) {
                t tVar2 = tVar;
                l.d(tVar2, "");
                if (tVar2.f15148a) {
                    this.this$0.c();
                }
                return h.z.f158842a;
            }
        });
    }
}

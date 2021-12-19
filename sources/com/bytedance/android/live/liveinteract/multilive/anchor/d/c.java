package com.bytedance.android.live.liveinteract.multilive.anchor.d;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.anchor.d.b;
import com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.g;
import com.bytedance.android.live.liveinteract.multilive.api.MultiLiveApi;
import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.chatroom.g.n;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.cd;
import com.bytedance.android.livesdk.j.dn;
import com.bytedance.android.livesdk.model.ba;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.model.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;

public final class c extends b.a implements g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11620a = true;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.b f11621b;

    /* renamed from: c  reason: collision with root package name */
    private final DataChannel f11622c;

    /* renamed from: d  reason: collision with root package name */
    private f.a.b.b f11623d;

    /* renamed from: e  reason: collision with root package name */
    private Room f11624e;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.android.livesdk.l.b f11625f;

    static {
        Covode.recordClassIndex(6317);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.d.c$c  reason: collision with other inner class name */
    public static final class C0237c implements com.bytedance.android.livesdkapi.depend.e.b {
        static {
            Covode.recordClassIndex(6320);
        }

        @Override // com.bytedance.android.livesdkapi.depend.e.b
        public final void a(String str, String str2, Bundle bundle) {
            l.d(str, "");
            l.d(str2, "");
        }

        @Override // com.bytedance.android.livesdkapi.depend.e.b
        public final void a(Throwable th) {
            l.d(th, "");
        }

        C0237c() {
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.a.a
    public final void g() {
        f.a.b.b bVar = this.f11623d;
        if (bVar != null) {
            bVar.dispose();
        }
        com.bytedance.android.livesdk.l.b bVar2 = this.f11625f;
        if (bVar2 != null) {
            bVar2.dismiss();
        }
    }

    public final void a() {
        long j2;
        long j3;
        boolean z;
        try {
            Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
            if (room != null) {
                j3 = room.getId();
                j2 = room.getOwnerUserId();
            } else {
                j2 = 0;
                j3 = 0;
            }
            if (j3 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (j2 != 0) {
                this.f11623d = ((MultiLiveApi) e.a().a(MultiLiveApi.class)).getListByType(j3, j2, j3, 0).a(new f()).a(new a(this), new b(this));
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.g
    public final void b() {
        String str;
        User user;
        String str2;
        String str3;
        this.f11621b.dismiss();
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            DataChannel dataChannel = this.f11622c;
            Activity activity = null;
            if (dataChannel != null) {
                str = (String) dataChannel.b(cd.class);
            } else {
                str = null;
            }
            c.a a2 = com.bytedance.android.livesdkapi.depend.e.c.a(room);
            if (room.getOwner() != null) {
                com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(IHostApp.class);
                l.b(a3, "");
                if (((IHostApp) a3).isInMusicallyRegion()) {
                    str2 = "h5_m";
                } else {
                    str2 = "h5_t";
                }
                StringBuilder sb = new StringBuilder("www.tiktok.com/@");
                User owner = room.getOwner();
                if (owner != null) {
                    str3 = owner.displayId;
                } else {
                    str3 = null;
                }
                a2.f22989l = sb.append(str3).append("/live?source=").append(str2).append("&_r=1").toString();
            }
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            l.b(b2, "");
            a2.f22981d = b2.c();
            a2.v = room.getId();
            a2.w = room.getOwnerUserId();
            l.b(a2, "");
            a2.t = com.bytedance.android.livesdk.ab.e.k();
            String a4 = com.bytedance.android.livesdk.ab.e.a();
            String d2 = com.bytedance.android.livesdk.ab.e.d();
            if (room.getOwner() != null) {
                User owner2 = room.getOwner();
                l.b(owner2, "");
                if (owner2.getSecret() == 1) {
                    Context context = this.f11621b.getContext();
                    long id = room.getId();
                    long ownerUserId = room.getOwnerUserId();
                    long ownerUserId2 = room.getOwnerUserId();
                    User owner3 = room.getOwner();
                    l.b(owner3, "");
                    ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).report(context, new d(id, ownerUserId, ownerUserId2, owner3.getSecUid(), "anchor_profile", a4, d2, str, "report_anchor", room.getRequestId()));
                    return;
                }
            }
            boolean z = false;
            DataChannel dataChannel2 = this.f11622c;
            if (!(dataChannel2 == null || (user = (User) dataChannel2.b(dn.class)) == null || user.getUserAttr() == null)) {
                ba userAttr = user.getUserAttr();
                l.b(userAttr, "");
                if (userAttr.f19030b) {
                    z = true;
                }
            }
            com.bytedance.android.live.share.a share = ((com.bytedance.android.live.share.c) com.bytedance.android.live.t.a.a(com.bytedance.android.live.share.c.class)).share();
            Context context2 = this.f11621b.getContext();
            l.b(context2, "");
            while (true) {
                if (context2 != null) {
                    if (!(context2 instanceof Activity)) {
                        if (!(context2 instanceof ContextWrapper)) {
                            break;
                        }
                        context2 = ((ContextWrapper) context2).getBaseContext();
                    } else {
                        activity = (Activity) context2;
                        break;
                    }
                } else {
                    break;
                }
            }
            a2.n = room.getAnchorShareText();
            a2.q = true;
            a2.r = z;
            a2.s = com.bytedance.android.live.p.l.SHARE.isRedDotShowing(this.f11622c);
            a2.u = str;
            share.a(activity, a2.a(), new C0237c());
            n.a(this.f11621b.getContext()).a(room.getIdStr(), room.getId());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11627a;

        static {
            Covode.recordClassIndex(6319);
        }

        b(c cVar) {
            this.f11627a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            b.AbstractC0236b bVar = (b.AbstractC0236b) this.f11627a.f11898g;
            if (bVar != null) {
                bVar.d();
            }
        }
    }

    public final void a(b.AbstractC0236b bVar) {
        super.a((com.bytedance.android.live.liveinteract.platform.common.a.b) bVar);
        this.f11624e = (Room) DataChannelGlobal.f34575d.b(ac.class);
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11626a;

        static {
            Covode.recordClassIndex(6318);
        }

        a(c cVar) {
            this.f11626a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.liveinteract.multilive.c.g gVar;
            b.AbstractC0236b bVar;
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            if (dVar != null && (gVar = (com.bytedance.android.live.liveinteract.multilive.c.g) dVar.data) != null && (bVar = (b.AbstractC0236b) this.f11626a.f11898g) != null) {
                bVar.a(gVar.f11760a, gVar.f11761b, gVar.f11762c);
            }
        }
    }

    public c(com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.b bVar) {
        l.d(bVar, "");
        this.f11621b = bVar;
        this.f11622c = bVar.f11719a;
    }
}

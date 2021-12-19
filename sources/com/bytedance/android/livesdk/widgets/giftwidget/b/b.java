package com.bytedance.android.livesdk.widgets.giftwidget.b;

import android.view.View;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.android.live.gift.l;
import com.bytedance.android.live.gift.n;
import com.bytedance.android.live.gift.o;
import com.bytedance.android.live.gift.r;
import com.bytedance.android.live.n.aa;
import com.bytedance.android.live.n.q;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.chatroom.c.e;
import com.bytedance.android.livesdk.chatroom.c.i;
import com.bytedance.android.livesdk.firstrecharge.f;
import com.bytedance.android.livesdk.gift.b.a;
import com.bytedance.android.livesdk.gift.b.b;
import com.bytedance.android.livesdk.gift.d.h;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.j.ba;
import com.bytedance.android.livesdk.j.cq;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.e.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    final DataChannel f22767a;

    /* renamed from: b  reason: collision with root package name */
    public a f22768b;

    /* renamed from: c  reason: collision with root package name */
    public View f22769c;

    /* renamed from: d  reason: collision with root package name */
    public final t<Boolean> f22770d;

    /* renamed from: e  reason: collision with root package name */
    boolean f22771e = false;

    /* renamed from: f  reason: collision with root package name */
    boolean f22772f = false;

    /* renamed from: g  reason: collision with root package name */
    boolean f22773g = false;

    /* renamed from: h  reason: collision with root package name */
    public final f.a.b.a f22774h;

    /* renamed from: i  reason: collision with root package name */
    public com.bytedance.android.livesdk.gift.e.b f22775i;

    /* renamed from: j  reason: collision with root package name */
    public final u<Boolean> f22776j;

    /* renamed from: k  reason: collision with root package name */
    private final m f22777k;

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.android.livesdk.util.rxutils.a<Object> f22778l;

    public interface a {
        static {
            Covode.recordClassIndex(13421);
        }

        void a(int i2);

        void a(View view);

        void a(i iVar);

        void a(h hVar);

        void a(String str);

        void a(boolean z);

        void b(boolean z);

        void c();

        void d();

        void e();

        void f();

        void g();

        void h();

        void i();
    }

    static {
        Covode.recordClassIndex(13419);
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        DataChannel dataChannel;
        boolean z;
        boolean z2;
        Room room = (Room) this.f22767a.b(df.class);
        if (room == null || (dataChannel = this.f22767a) == null || dataChannel.b(ee.class) == null) {
            return false;
        }
        boolean booleanValue = ((Boolean) this.f22767a.b(ee.class)).booleanValue();
        if (room.getRoomAuthStatus() == null || !room.getRoomAuthStatus().isEnableGift()) {
            z = false;
        } else {
            z = true;
        }
        if (((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().b() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        a.EnumC0371a a2 = com.bytedance.android.livesdk.gift.b.a.a(booleanValue, z2, z);
        if (a2 == a.EnumC0371a.SHOW) {
            return true;
        }
        if (a2 == a.EnumC0371a.GREY) {
            if (com.bytedance.android.livesdk.gift.b.b.a(booleanValue, z2, z) != b.a.TOAST) {
                a aVar = this.f22768b;
                if (aVar != null) {
                    aVar.f();
                }
            } else if (!(room.getRoomAuthStatus() == null || room.getRoomAuthStatus().getRoomAuthOffReasons() == null || room.getRoomAuthStatus().getRoomAuthOffReasons().getGift() == null)) {
                ao.a(room.getRoomAuthStatus().getRoomAuthOffReasons().getGift());
                DataChannel dataChannel2 = this.f22767a;
                if (dataChannel2 != null) {
                    dataChannel2.c(l.class, true);
                }
            }
        }
        return false;
    }

    public b(DataChannel dataChannel, com.bytedance.android.livesdk.util.rxutils.a<Object> aVar, m mVar) {
        t<Boolean> tVar = new t<>();
        this.f22770d = tVar;
        f.a.b.a aVar2 = new f.a.b.a();
        this.f22774h = aVar2;
        this.f22775i = new com.bytedance.android.livesdk.gift.e.b() {
            /* class com.bytedance.android.livesdk.widgets.giftwidget.b.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(13420);
            }

            @Override // com.bytedance.android.livesdk.gift.e.b
            public final void a(List<com.bytedance.android.livesdk.model.u> list) {
            }

            @Override // com.bytedance.android.livesdk.gift.e.b
            public final void b(List<GiftPage> list) {
                if (b.this.f22768b != null) {
                    b.this.f22768b.h();
                }
            }
        };
        c cVar = new c(this);
        this.f22776j = cVar;
        this.f22767a = dataChannel;
        this.f22778l = aVar;
        this.f22777k = mVar;
        tVar.observeForever(cVar);
        dataChannel.a(mVar, n.class, (h.f.a.b) new d(this)).a(mVar, d.class, (h.f.a.b) new n(this)).a(mVar, com.bytedance.android.live.gift.t.class, (h.f.a.b) new o(this)).a(mVar, ba.class, (h.f.a.b) new p(this)).a(mVar, com.bytedance.android.live.gift.m.class, (h.f.a.b) new q(this)).a(mVar, cq.class, (h.f.a.b) new r(this)).a(mVar, com.bytedance.android.live.gift.b.class, (h.f.a.b) new s(this)).b(mVar, o.class, (h.f.a.b) new t(this)).a(mVar, q.class, (h.f.a.b) new u(this)).a(mVar, com.bytedance.android.live.gift.a.class, (h.f.a.b) new e(this)).a(mVar, r.class, (h.f.a.b) new f(this));
        aVar2.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.chatroom.c.ao.class).a(aVar).d(new g(this)));
        aVar2.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.gift.d.d.class).d(new h(this)));
        aVar2.a(com.bytedance.android.livesdk.an.a.a().a(f.class).d(new i(this)));
        aVar2.a(com.bytedance.android.livesdk.an.a.a().a(e.class).d(new j(this)));
        aVar2.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.gift.d.i.class).d(new k(this)));
        DataChannelGlobal.f34575d.a(mVar, mVar, aa.class, new l(this));
        aVar2.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.i.class).d(new m(this)));
    }
}

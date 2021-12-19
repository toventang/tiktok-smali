package com.bytedance.android.live.liveinteract.multiguest.a.c;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.platform.common.g.h;
import com.bytedance.android.live.liveinteract.platform.common.g.i;
import com.bytedance.android.livesdk.b.a.g;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.model.message.az;
import com.bytedance.android.livesdk.utils.an;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class c implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static final f.a.b.a f11060a = new f.a.b.a();

    /* renamed from: b  reason: collision with root package name */
    public static final Map<Long, String> f11061b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static IMessageManager f11062c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f11063d;

    /* renamed from: e  reason: collision with root package name */
    public static Set<Long> f11064e = new CopyOnWriteArraySet();

    /* renamed from: f  reason: collision with root package name */
    public static final c f11065f = new c();

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.c$c  reason: collision with other inner class name */
    public static final class C0209c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final C0209c f11069a = new C0209c();

        static {
            Covode.recordClassIndex(5950);
        }

        C0209c() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f11070a = new d();

        static {
            Covode.recordClassIndex(5951);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f11072a = new f();

        static {
            Covode.recordClassIndex(5953);
        }

        f() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    private c() {
    }

    static {
        Covode.recordClassIndex(5947);
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f11071a;

        static {
            Covode.recordClassIndex(5952);
        }

        e(long j2) {
            this.f11071a = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            c.a(this.f11071a, true);
        }
    }

    public static final String a(long j2) {
        String str = f11061b.get(Long.valueOf(j2));
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long j2;
        l.d(iMessage, "");
        if (iMessage instanceof az) {
            User user = ((az) iMessage).f19234f;
            if (user != null) {
                j2 = user.getId();
            } else {
                j2 = 0;
            }
            a(j2, true);
        }
    }

    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f11067a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f11068b;

        static {
            Covode.recordClassIndex(5949);
        }

        public b(long j2, User user) {
            this.f11067a = j2;
            this.f11068b = user;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            long j2 = this.f11067a;
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "guest_user_id", j2);
            com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - i.f11977g);
            i.a(jSONObject, th);
            i.a(true, "invite_failed", jSONObject, 1);
            c.a(this.f11067a, false);
            if (th instanceof com.bytedance.android.live.a.a.b.a) {
                com.bytedance.android.livesdk.utils.f.a(y.e(), th);
                return;
            }
            ao.a(y.e(), y.a((int) R.string.e9r, this.f11068b.displayId), 0);
        }
    }

    public static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f11066a;

        static {
            Covode.recordClassIndex(5948);
        }

        public a(long j2) {
            this.f11066a = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            com.bytedance.android.livesdk.chatroom.interact.model.d dVar;
            com.bytedance.android.live.network.response.d dVar2 = (com.bytedance.android.live.network.response.d) obj;
            long j2 = this.f11066a;
            if (dVar2 == null || (dVar = (com.bytedance.android.livesdk.chatroom.interact.model.d) dVar2.data) == null || (str = dVar.f15588e) == null) {
                str = "";
            }
            l.d(str, "");
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "guest_user_id", j2);
            long currentTimeMillis = System.currentTimeMillis() - i.f11977g;
            com.bytedance.android.live.core.d.a.a(jSONObject, "cost", currentTimeMillis);
            com.bytedance.android.live.core.d.a.a(jSONObject, "guest_linkmic_id", str);
            i.a(jSONObject, Long.valueOf(j2), str);
            com.bytedance.android.live.core.d.a.a(jSONObject, "invite_service_timestamp", (System.currentTimeMillis() + an.f22242a) - currentTimeMillis);
            i.a(i.f11979j, true, "invite_succeed", jSONObject);
            c.f11060a.a(t.b(2, TimeUnit.MINUTES).a(new e(this.f11066a), f.f11072a));
            ao.a(y.e(), (int) R.string.e_h);
            Object a2 = com.bytedance.android.live.liveinteract.api.c.e.f10014a.a("MULTI_GUEST_DATA_HOLDER");
            if (a2 instanceof com.bytedance.android.live.liveinteract.multiguest.opt.a.a) {
                h.a(this.f11066a, ((com.bytedance.android.live.liveinteract.multiguest.opt.a.a) a2).q);
            } else {
                h.a(this.f11066a, (n) null);
            }
        }
    }

    public static final void a(long j2, boolean z) {
        if (f11064e.contains(Long.valueOf(j2))) {
            Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
            if (room != null) {
                long id = room.getId();
                if (id != 0 && z) {
                    String a2 = g.a.f14199a.a(j2);
                    if (a2 == null) {
                        a2 = "";
                    }
                    i.a(j2, a2);
                    f.a.b.a aVar = f11060a;
                    int i2 = LinkApi.b.Invite.val;
                    com.bytedance.android.livesdk.b.a.d a3 = com.bytedance.android.livesdk.b.a.d.a();
                    l.b(a3, "");
                    aVar.a(((LinkApi) com.bytedance.android.live.network.e.a().a(LinkApi.class)).anchorCancelInviteGuest(id, id, j2, i2, a3.v).a(C0209c.f11069a, d.f11070a));
                }
            }
            f11064e.remove(Long.valueOf(j2));
            f11061b.remove(Long.valueOf(j2));
        }
    }
}

package com.bytedance.android.live.liveinteract.multiguest.a.c;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.e;
import com.bytedance.android.live.liveinteract.multilive.api.MultiLiveApi;
import com.bytedance.android.live.liveinteract.platform.common.g.z;
import com.bytedance.android.livesdk.b.a.g;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveLinkListOptiEnableSetting;
import com.bytedance.android.livesdk.model.message.aj;
import com.bytedance.android.livesdk.model.message.ar;
import com.bytedance.android.livesdk.model.message.as;
import com.bytedance.android.livesdk.model.message.at;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.playerkit.model.v;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import f.a.ab;
import h.a.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

@com.bytedance.android.live.liveinteract.api.c.f(a = "LINK_USER_INFO_CENTER")
public final class d implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11073a;

    /* renamed from: b  reason: collision with root package name */
    public final List<com.bytedance.android.livesdk.chatroom.model.b.e> f11074b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final List<com.bytedance.android.livesdk.chatroom.model.b.e> f11075c = new ArrayList();
    @com.bytedance.android.live.liveinteract.api.c.d(a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.opt.a.a f11076d;

    /* renamed from: e  reason: collision with root package name */
    public final DataChannel f11077e;

    /* renamed from: f  reason: collision with root package name */
    private f.a.b.b f11078f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11079g;

    /* renamed from: h  reason: collision with root package name */
    private final List<a> f11080h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private int f11081i;

    public static abstract class a {
        static {
            Covode.recordClassIndex(5955);
        }

        public void a() {
        }

        public void a(long j2, long j3) {
        }

        public void a(long j2, String str) {
            h.f.b.l.d(str, "");
        }

        public void a(String str) {
            h.f.b.l.d(str, "");
        }
    }

    public enum c {
        FOREGROUND,
        BACKGROUND;

        static {
            Covode.recordClassIndex(5957);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final j f11101a = new j();

        static {
            Covode.recordClassIndex(5964);
        }

        j() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final k f11102a = new k();

        static {
            Covode.recordClassIndex(5965);
        }

        k() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(5954);
    }

    public enum b {
        NONE(""),
        LINKED_LIST_CHANGE("message_linked_list_change"),
        WAITING_LIST_CHANGE("message_waiting_list_change"),
        GUEST_LEAVE("message_leave"),
        ENTER_ROOM("enter_room"),
        PERMIT_FAILED("permit_failed");
        
        private final String content;

        public final String getContent() {
            return this.content;
        }

        static {
            Covode.recordClassIndex(5956);
        }

        private b(String str) {
            this.content = str;
        }
    }

    public final void a() {
        IMessageManager iMessageManager = (IMessageManager) this.f11077e.b(cg.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.LINK_MIC_SIGNAL.getIntType(), this);
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.LINK_MIC.getIntType(), this);
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.LINK_MESSAGE.getIntType(), this);
        }
        this.f11079g = true;
        a(true, b.ENTER_ROOM);
    }

    public final void a(boolean z) {
        int g2 = g();
        int i2 = this.f11081i;
        if (i2 > 0) {
            if (g2 == 0) {
                com.bytedance.android.livesdk.performance.g.d();
                z.b("connection_over");
                if (!p.f()) {
                    z.d(null);
                }
            }
        } else if (i2 == 0 && g2 > 0) {
            com.bytedance.android.livesdk.performance.g.c();
            if (!z && !p.f()) {
                z.c("connection_start");
            }
        }
        this.f11081i = g2;
    }

    public final void a(boolean z, b bVar) {
        Boolean bool = (Boolean) this.f11077e.b(ee.class);
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        try {
            if (!this.f11079g) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!this.f11073a) {
                Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
                if (room != null) {
                    long id = room.getId();
                    long ownerUserId = room.getOwnerUserId();
                    if (id != 0) {
                        if (ownerUserId != 0) {
                            this.f11073a = true;
                            if (booleanValue) {
                                com.bytedance.android.live.liveinteract.platform.common.g.i.a();
                            }
                            if (LiveLinkListOptiEnableSetting.INSTANCE.getValue()) {
                                b(id, ownerUserId, booleanValue, z, bVar);
                                return;
                            } else {
                                a(id, ownerUserId, booleanValue, z, bVar);
                                return;
                            }
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                }
                throw new IllegalStateException("Check failed.".toString());
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        } catch (IllegalStateException unused) {
        }
    }

    public final boolean a(a aVar) {
        h.f.b.l.d(aVar, "");
        return this.f11080h.add(aVar);
    }

    public final void a(com.bytedance.android.livesdk.chatroom.model.b.e eVar) {
        h.f.b.l.d(eVar, "");
        com.bytedance.android.livesdk.b.a.g gVar = g.a.f14199a;
        User user = eVar.f15722c;
        h.f.b.l.b(user, "");
        gVar.a(user.getId(), eVar.a());
        if (eVar.f15724e == 2 || (eVar.f15724e == 1 && eVar.f15726g == 2)) {
            Set<Long> set = com.bytedance.android.livesdk.b.a.d.a().t;
            User user2 = eVar.f15722c;
            h.f.b.l.b(user2, "");
            set.add(Long.valueOf(user2.getId()));
        }
        if (eVar.f15726g == 1) {
            com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
            h.f.b.l.b(a2, "");
            a2.f14184e = eVar.f15729j;
        } else if (eVar.f15724e == 2) {
            com.bytedance.android.livesdk.b.a.d.a().u++;
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11076d;
            if (aVar == null) {
                h.f.b.l.a("mDataHolder");
            }
            aVar.f11302l++;
        }
    }

    public final void c() {
        boolean z;
        int i2 = com.bytedance.android.livesdk.b.a.d.a().u;
        DataChannel dataChannel = this.f11077e;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        dataChannel.c(com.bytedance.android.live.liveinteract.api.z.class, new com.bytedance.android.livesdk.chatroom.c.l(z, i2));
    }

    public final void e() {
        Iterator<T> it = this.f11080h.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public final void k() {
        this.f11079g = false;
        IMessageManager iMessageManager = (IMessageManager) this.f11077e.b(cg.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        f.a.b.b bVar = this.f11078f;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.d$d  reason: collision with other inner class name */
    public static final class C0210d {

        /* renamed from: a  reason: collision with root package name */
        public final long f11084a;

        /* renamed from: b  reason: collision with root package name */
        public final String f11085b;

        /* renamed from: c  reason: collision with root package name */
        public final int f11086c;

        static {
            Covode.recordClassIndex(5958);
        }

        public final String toString() {
            return "userId=" + this.f11084a + ", linkmicId='" + this.f11085b + "', status=" + this.f11086c;
        }

        public C0210d(long j2, String str, int i2) {
            h.f.b.l.d(str, "");
            this.f11084a = j2;
            this.f11085b = str;
            this.f11086c = i2;
        }
    }

    public final void b() {
        com.bytedance.android.livesdk.b.a.d.a().u = 0;
        com.bytedance.android.livesdk.b.a.d.a().t.clear();
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11076d;
        if (aVar == null) {
            h.f.b.l.a("mDataHolder");
        }
        aVar.f11302l = 0;
    }

    public final int f() {
        List<com.bytedance.android.livesdk.chatroom.model.b.e> list = this.f11074b;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if (t2.f15724e == 1 && t2.f15726g == 2) {
                arrayList.add(t);
            }
        }
        return arrayList.size();
    }

    public final int g() {
        List<com.bytedance.android.livesdk.chatroom.model.b.e> list = this.f11074b;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t.f15724e == 2) {
                arrayList.add(t);
            }
        }
        return arrayList.size() - 1;
    }

    public final int h() {
        List<com.bytedance.android.livesdk.chatroom.model.b.e> list = this.f11074b;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if (t2.f15726g != 1 && t2.f15724e == 2) {
                arrayList.add(t);
            }
        }
        return arrayList.size();
    }

    public final List<com.bytedance.android.livesdk.chatroom.model.b.e> i() {
        List<com.bytedance.android.livesdk.chatroom.model.b.e> list = this.f11074b;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if (t2.f15724e == 1 && t2.f15726g == 2) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public final List<com.bytedance.android.livesdk.chatroom.model.b.e> j() {
        List<com.bytedance.android.livesdk.chatroom.model.b.e> list = this.f11074b;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t.f15724e == 2) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public final void d() {
        boolean z;
        Room room;
        try {
            Boolean bool = (Boolean) this.f11077e.b(ee.class);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            if (!z) {
                com.bytedance.android.livesdk.at.f b2 = u.a().b();
                h.f.b.l.b(b2, "");
                com.bytedance.android.livesdk.chatroom.model.b.e a2 = a(this, null, b2.c(), 1);
                if (a2 != null && (room = (Room) DataChannelGlobal.f34575d.b(ac.class)) != null) {
                    long id = room.getId();
                    com.bytedance.android.livesdk.b.a.d a3 = com.bytedance.android.livesdk.b.a.d.a();
                    h.f.b.l.b(a3, "");
                    ((LinkApi) com.bytedance.android.live.network.e.a().a(LinkApi.class)).leave(id, a3.v).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new i(a2, this), j.f11101a);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        } catch (IllegalStateException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f11091a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f11092b;

        static {
            Covode.recordClassIndex(5960);
        }

        f(d dVar, boolean z) {
            this.f11091a = dVar;
            this.f11092b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f11091a.f11073a = false;
            if (this.f11092b) {
                com.bytedance.android.live.liveinteract.platform.common.g.i.a(th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.chatroom.model.b.e f11099a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f11100b;

        static {
            Covode.recordClassIndex(5963);
        }

        i(com.bytedance.android.livesdk.chatroom.model.b.e eVar, d dVar) {
            this.f11099a = eVar;
            this.f11100b = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f11100b.f11074b.remove(this.f11099a);
        }
    }

    public final boolean b(a aVar) {
        h.f.b.l.d(aVar, "");
        return this.f11080h.remove(aVar);
    }

    /* access modifiers changed from: package-private */
    public static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f11097a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f11098b;

        static {
            Covode.recordClassIndex(5962);
        }

        h(d dVar, boolean z) {
            this.f11097a = dVar;
            this.f11098b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f11097a.f11073a = false;
            if (this.f11098b) {
                com.bytedance.android.live.liveinteract.platform.common.g.i.a(th);
            }
            this.f11097a.f11077e.c(com.bytedance.android.live.liveinteract.multilive.c.a.class);
        }
    }

    static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final l f11103a = new l();

        static {
            Covode.recordClassIndex(5966);
        }

        l() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            h.f.b.l.b(th, "");
            com.bytedance.android.live.core.c.a.a(6, "LinkUserInfoCenter", th.getStackTrace());
        }
    }

    public final long b(String str) {
        User user;
        h.f.b.l.d(str, "");
        com.bytedance.android.livesdk.chatroom.model.b.e a2 = a(this, str, 0, 2);
        if (a2 == null || (user = a2.f15722c) == null) {
            return 0;
        }
        return user.getId();
    }

    public d(DataChannel dataChannel) {
        h.f.b.l.d(dataChannel, "");
        this.f11077e = dataChannel;
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
    }

    public static void a(c cVar) {
        long j2;
        int i2;
        String str;
        h.f.b.l.d(cVar, "");
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            j2 = room.getId();
        } else {
            j2 = 0;
        }
        as asVar = new as();
        if (cVar == c.BACKGROUND) {
            i2 = 100101;
        } else {
            i2 = 100102;
        }
        asVar.f19205g = i2;
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        if (b2 == null || (str = String.valueOf(b2.c())) == null) {
            str = "";
        }
        asVar.f19202d = str;
        com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
        h.f.b.l.b(a2, "");
        asVar.f19203e = a2.f14185f;
        asVar.f19200b = "0";
        asVar.f19201c = "0";
        ((LinkApi) com.bytedance.android.live.network.e.a().a(LinkApi.class)).sendSignalV1(j2, e.a.f9628b.b(asVar), null).b(f.a.h.a.b(f.a.k.a.f158006c)).a(k.f11102a, l.f11103a);
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f11087a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f11088b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f11089c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f11090d;

        static {
            Covode.recordClassIndex(5959);
        }

        e(d dVar, b bVar, boolean z, boolean z2) {
            this.f11087a = dVar;
            this.f11088b = bVar;
            this.f11089c = z;
            this.f11090d = z2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.network.response.c cVar = (com.bytedance.android.live.network.response.c) obj;
            this.f11087a.f11073a = false;
            if (cVar != null) {
                try {
                    if (cVar.f12145b != null) {
                        this.f11087a.b();
                        ArrayList arrayList = new ArrayList();
                        List<com.bytedance.android.livesdk.chatroom.model.b.e> list = this.f11087a.f11074b;
                        list.clear();
                        List list2 = cVar.f12145b;
                        h.f.b.l.b(list2, "");
                        list.addAll(n.g((Iterable) list2));
                        for (T t : list) {
                            this.f11087a.a((com.bytedance.android.livesdk.chatroom.model.b.e) t);
                            User user = t.f15722c;
                            h.f.b.l.b(user, "");
                            long id = user.getId();
                            String a2 = t.a();
                            h.f.b.l.b(a2, "");
                            arrayList.add(new C0210d(id, a2, t.f15724e));
                        }
                        if (this.f11088b == b.LINKED_LIST_CHANGE || this.f11088b == b.GUEST_LEAVE) {
                            this.f11087a.c();
                        }
                        if (this.f11089c) {
                            this.f11087a.d();
                            if (com.bytedance.android.livesdk.b.a.d.a().u > 0) {
                                z.c("live_play");
                            }
                        }
                        this.f11087a.e();
                        com.bytedance.android.live.liveinteract.platform.common.g.i.a(arrayList, this.f11088b, this.f11090d);
                        this.f11087a.a(this.f11089c);
                        if (this.f11090d) {
                            List list3 = cVar.f12145b;
                            h.f.b.l.b(list3, "");
                            com.bytedance.android.live.liveinteract.platform.common.g.i.a(list3);
                            return;
                        }
                        return;
                    }
                } catch (IllegalStateException unused) {
                    return;
                }
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f11093a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f11094b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f11095c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f11096d;

        static {
            Covode.recordClassIndex(5961);
        }

        g(d dVar, boolean z, b bVar, boolean z2) {
            this.f11093a = dVar;
            this.f11094b = z;
            this.f11095c = bVar;
            this.f11096d = z2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.liveinteract.multilive.c.g gVar;
            ArrayList<com.bytedance.android.livesdk.chatroom.model.b.c> arrayList;
            com.bytedance.android.live.liveinteract.multilive.c.g gVar2;
            ArrayList<com.bytedance.android.livesdk.chatroom.model.b.c> arrayList2;
            com.bytedance.android.live.liveinteract.multilive.c.g gVar3;
            ArrayList<com.bytedance.android.livesdk.chatroom.model.b.c> arrayList3;
            com.bytedance.android.live.liveinteract.multilive.c.g gVar4;
            com.bytedance.android.live.liveinteract.multilive.c.g gVar5;
            ArrayList<com.bytedance.android.livesdk.chatroom.model.b.c> arrayList4;
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            this.f11093a.f11073a = false;
            ArrayList<com.bytedance.android.livesdk.chatroom.model.b.c> arrayList5 = null;
            if (dVar != null) {
                try {
                    if (dVar.data != null) {
                        this.f11093a.b();
                        ArrayList arrayList6 = new ArrayList();
                        List<com.bytedance.android.livesdk.chatroom.model.b.e> list = this.f11093a.f11074b;
                        list.clear();
                        if (!(dVar == null || (gVar5 = (com.bytedance.android.live.liveinteract.multilive.c.g) dVar.data) == null || (arrayList4 = gVar5.f11760a) == null)) {
                            for (T t : arrayList4) {
                                h.f.b.l.b(t, "");
                                com.bytedance.android.livesdk.chatroom.model.b.e a2 = e.a((com.bytedance.android.livesdk.chatroom.model.b.c) t, 2);
                                if (this.f11093a.f11075c.contains(a2)) {
                                    this.f11093a.f11075c.remove(a2);
                                }
                                this.f11093a.f11074b.add(a2);
                            }
                        }
                        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11093a.f11076d;
                        if (aVar == null) {
                            h.f.b.l.a("mDataHolder");
                        }
                        if (!(dVar == null || (gVar4 = (com.bytedance.android.live.liveinteract.multilive.c.g) dVar.data) == null)) {
                            arrayList5 = gVar4.f11760a;
                        }
                        aVar.n = arrayList5;
                        if (!(dVar == null || (gVar3 = (com.bytedance.android.live.liveinteract.multilive.c.g) dVar.data) == null || (arrayList3 = gVar3.f11761b) == null)) {
                            for (T t2 : arrayList3) {
                                h.f.b.l.b(t2, "");
                                com.bytedance.android.livesdk.chatroom.model.b.e a3 = e.a((com.bytedance.android.livesdk.chatroom.model.b.c) t2, 1);
                                if (this.f11093a.f11075c.contains(a3)) {
                                    this.f11093a.f11075c.remove(a3);
                                }
                                this.f11093a.f11074b.add(a3);
                            }
                        }
                        if (!(!this.f11094b || dVar == null || (gVar2 = (com.bytedance.android.live.liveinteract.multilive.c.g) dVar.data) == null || (arrayList2 = gVar2.f11762c) == null)) {
                            for (T t3 : arrayList2) {
                                List<com.bytedance.android.livesdk.chatroom.model.b.e> list2 = this.f11093a.f11074b;
                                h.f.b.l.b(t3, "");
                                list2.add(e.a((com.bytedance.android.livesdk.chatroom.model.b.c) t3, 0));
                            }
                        }
                        for (T t4 : list) {
                            this.f11093a.a((com.bytedance.android.livesdk.chatroom.model.b.e) t4);
                            User user = t4.f15722c;
                            h.f.b.l.b(user, "");
                            long id = user.getId();
                            String a4 = t4.a();
                            h.f.b.l.b(a4, "");
                            arrayList6.add(new C0210d(id, a4, t4.f15724e));
                        }
                        this.f11093a.f11075c.clear();
                        if (!(dVar == null || (gVar = (com.bytedance.android.live.liveinteract.multilive.c.g) dVar.data) == null || (arrayList = gVar.f11762c) == null)) {
                            for (T t5 : arrayList) {
                                List<com.bytedance.android.livesdk.chatroom.model.b.e> list3 = this.f11093a.f11075c;
                                h.f.b.l.b(t5, "");
                                list3.add(e.a((com.bytedance.android.livesdk.chatroom.model.b.c) t5, 0));
                            }
                        }
                        if (this.f11095c == b.LINKED_LIST_CHANGE || this.f11095c == b.GUEST_LEAVE) {
                            this.f11093a.c();
                        }
                        if (this.f11096d) {
                            this.f11093a.d();
                            if (com.bytedance.android.livesdk.b.a.d.a().u > 0) {
                                z.c("live_play");
                            }
                        }
                        this.f11093a.e();
                        com.bytedance.android.live.liveinteract.platform.common.g.i.a(arrayList6, this.f11095c, this.f11094b);
                        this.f11093a.a(this.f11096d);
                        if (this.f11094b) {
                            com.bytedance.android.live.liveinteract.platform.common.g.i.a(this.f11093a.f11074b);
                            return;
                        }
                        return;
                    }
                } catch (IllegalStateException unused) {
                    return;
                }
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public final int a(String str) {
        h.f.b.l.d(str, "");
        com.bytedance.android.livesdk.chatroom.model.b.e a2 = a(this, str, 0, 2);
        if (a2 != null) {
            return a2.f15725f;
        }
        return 1;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long j2;
        String str;
        b bVar;
        String str2;
        Integer num;
        String str3;
        try {
            if (!this.f11079g) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (iMessage != null) {
                Long l2 = null;
                if (iMessage instanceof ar) {
                    ar arVar = (ar) iMessage;
                    if (arVar.f19190a == 8) {
                        com.bytedance.android.livesdk.chatroom.model.b.e a2 = a(this, null, arVar.f19196k, 1);
                        if (a2 != null) {
                            a2.f15720a = arVar.f19197l;
                        }
                        Iterator<T> it = this.f11080h.iterator();
                        while (it.hasNext()) {
                            it.next().a(arVar.f19196k, arVar.f19197l);
                        }
                    }
                } else if (iMessage instanceof at) {
                    at atVar = (at) iMessage;
                    as c2 = atVar.c();
                    if (c2 != null) {
                        str2 = c2.f19203e;
                    } else {
                        str2 = null;
                    }
                    as c3 = atVar.c();
                    if (c3 != null) {
                        num = Integer.valueOf(c3.f19205g);
                    } else {
                        num = null;
                    }
                    try {
                        as c4 = ((at) iMessage).c();
                        if (!(c4 == null || (str3 = c4.f19202d) == null)) {
                            l2 = Long.valueOf(Long.parseLong(str3));
                        }
                        if (str2 == null) {
                            throw new IllegalStateException("Required value was null.".toString());
                        } else if (num == null) {
                            throw new IllegalStateException("Required value was null.".toString());
                        } else if (l2 != null) {
                            Iterator<T> it2 = this.f11080h.iterator();
                            while (it2.hasNext()) {
                                l2.longValue();
                                it2.next().a(str2);
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                    } catch (Exception unused) {
                    }
                } else if (iMessage instanceof aj) {
                    try {
                        boolean z = false;
                        if (((aj) iMessage).c() == aj.a.AUDIENCE_LINKMIC) {
                            aj ajVar = (aj) iMessage;
                            int i2 = ajVar.f19139a;
                            String str4 = "";
                            if (i2 == 7) {
                                com.bytedance.android.livesdk.b.a.d a3 = com.bytedance.android.livesdk.b.a.d.a();
                                h.f.b.l.b(a3, str4);
                                a3.b(ajVar.v);
                                com.bytedance.android.livesdk.b.a.d.a().t.remove(Long.valueOf(ajVar.n.f19546a));
                                if (!LiveLinkListOptiEnableSetting.INSTANCE.getValue()) {
                                    a(this, b.GUEST_LEAVE, 1);
                                }
                                Iterator<T> it3 = this.f11080h.iterator();
                                while (it3.hasNext()) {
                                    long j3 = ajVar.n.f19546a;
                                    String str5 = ajVar.n.f19547b;
                                    h.f.b.l.b(str5, str4);
                                    it3.next().a(j3, str5);
                                }
                                if (h.f.b.l.a(this.f11077e.b(ee.class), (Object) true)) {
                                    h.f.b.l.d(ajVar, str4);
                                    JSONObject jSONObject = new JSONObject();
                                    com.bytedance.android.livesdk.model.message.d.e.a aVar = ajVar.n;
                                    if (aVar != null) {
                                        j2 = aVar.f19546a;
                                    } else {
                                        j2 = 0;
                                    }
                                    com.bytedance.android.livesdk.model.message.d.e.a aVar2 = ajVar.n;
                                    if (!(aVar2 == null || (str = aVar2.f19547b) == null)) {
                                        str4 = str;
                                    }
                                    com.bytedance.android.live.core.d.a.a(jSONObject, "guest_user_id", j2);
                                    com.bytedance.android.live.core.d.a.a(jSONObject, "guest_linkmic_id", str4);
                                    com.bytedance.android.live.liveinteract.platform.common.g.i.a(jSONObject, ajVar);
                                    com.bytedance.android.live.liveinteract.platform.common.g.i.a(jSONObject, Long.valueOf(j2), str4);
                                    com.bytedance.android.live.liveinteract.platform.common.g.i.a(com.bytedance.android.live.liveinteract.platform.common.g.i.f11979j, true, "leave_message", jSONObject);
                                }
                            } else if (i2 == 10 || i2 == 11) {
                                int i3 = ajVar.f19139a;
                                if (i3 == 10) {
                                    bVar = b.WAITING_LIST_CHANGE;
                                } else if (i3 != 11) {
                                    bVar = b.NONE;
                                } else {
                                    bVar = b.LINKED_LIST_CHANGE;
                                }
                                com.bytedance.android.livesdk.b.a.d a4 = com.bytedance.android.livesdk.b.a.d.a();
                                h.f.b.l.b(a4, str4);
                                a4.b(ajVar.v);
                                if (!LiveLinkListOptiEnableSetting.INSTANCE.getValue()) {
                                    a(this, bVar, 1);
                                }
                            } else {
                                switch (i2) {
                                    case 19:
                                    case v.U /*{ENCODED_INT: 20}*/:
                                    case 21:
                                        if (LiveLinkListOptiEnableSetting.INSTANCE.getValue()) {
                                            Boolean bool = (Boolean) this.f11077e.b(ee.class);
                                            if (bool != null) {
                                                z = bool.booleanValue();
                                            }
                                            if (!z) {
                                                com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar3 = this.f11076d;
                                                if (aVar3 == null) {
                                                    h.f.b.l.a("mDataHolder");
                                                }
                                                if (!aVar3.s) {
                                                    com.bytedance.android.live.liveinteract.api.a.c a5 = com.bytedance.android.live.liveinteract.api.a.c.a();
                                                    h.f.b.l.b(a5, str4);
                                                    T t = a5.n;
                                                    if (t == null || t.intValue() != 1) {
                                                        com.bytedance.android.live.liveinteract.api.a.c a6 = com.bytedance.android.live.liveinteract.api.a.c.a();
                                                        h.f.b.l.b(a6, str4);
                                                        T t2 = a6.n;
                                                        if (t2 == null || t2.intValue() != 2) {
                                                            if (ajVar.s != null) {
                                                                int i4 = ajVar.f19139a;
                                                                com.bytedance.android.livesdk.model.message.d.g.a aVar4 = ajVar.s;
                                                                h.f.b.l.b(aVar4, str4);
                                                                a(i4, aVar4);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                            a(this, null, 2);
                                            return;
                                        }
                                        return;
                                    default:
                                        return;
                                }
                            }
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } catch (IllegalStateException unused2) {
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        } catch (IllegalStateException unused3) {
        }
    }

    public final String a(long j2) {
        String a2;
        com.bytedance.android.livesdk.chatroom.model.b.e a3 = a(this, null, j2, 1);
        if (a3 == null || (a2 = a3.a()) == null) {
            return "";
        }
        return a2;
    }

    private final void a(int i2, com.bytedance.android.livesdk.model.message.d.g.a aVar) {
        b();
        List<com.bytedance.android.livesdk.chatroom.model.b.e> list = this.f11074b;
        list.clear();
        Iterator<T> it = aVar.f19559a.iterator();
        while (it.hasNext()) {
            com.bytedance.android.livesdk.chatroom.model.b.e a2 = e.a((com.bytedance.android.livesdk.chatroom.model.b.c) it.next(), 2);
            list.add(a2);
            if (this.f11075c.contains(a2)) {
                this.f11075c.remove(a2);
            }
        }
        Iterator<T> it2 = aVar.f19560b.iterator();
        while (it2.hasNext()) {
            com.bytedance.android.livesdk.chatroom.model.b.e a3 = e.a((com.bytedance.android.livesdk.chatroom.model.b.c) it2.next(), 1);
            list.add(a3);
            if (this.f11075c.contains(a3)) {
                this.f11075c.remove(a3);
            }
        }
        list.addAll(this.f11075c);
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            a((com.bytedance.android.livesdk.chatroom.model.b.e) it3.next());
        }
        if (i2 == 19 || i2 == 21) {
            c();
        }
        e();
        a(false);
        com.bytedance.android.livesdk.ab.i.b();
        com.bytedance.android.livesdk.ab.i.b("list_opti_enable", "guest and audience handleListChangeMessage");
    }

    public final com.bytedance.android.livesdk.chatroom.model.b.e a(String str, long j2) {
        T t;
        h.f.b.l.d(str, "");
        Iterator<T> it = this.f11074b.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            T t2 = t;
            if (h.f.b.l.a((Object) t2.a(), (Object) str)) {
                break;
            }
            User user = t2.f15722c;
            h.f.b.l.b(user, "");
            if (user.getId() == j2) {
                break;
            }
        }
        return t;
    }

    public static /* synthetic */ void a(d dVar, b bVar, int i2) {
        if ((i2 & 2) != 0) {
            bVar = b.NONE;
        }
        dVar.a(false, bVar);
    }

    public static /* synthetic */ com.bytedance.android.livesdk.chatroom.model.b.e a(d dVar, String str, long j2, int i2) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        return dVar.a(str, j2);
    }

    private final void a(long j2, long j3, boolean z, boolean z2, b bVar) {
        this.f11078f = com.bytedance.android.livesdk.chatroom.api.d.a(j2, j3).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new e(this, bVar, z2, z), new f(this, z));
    }

    private final void b(long j2, long j3, boolean z, boolean z2, b bVar) {
        ab<com.bytedance.android.live.network.response.d<com.bytedance.android.live.liveinteract.multilive.c.g>> listByType;
        if (z) {
            listByType = ((MultiLiveApi) com.bytedance.android.live.network.e.a().a(MultiLiveApi.class)).getListByType(j2, j3, j2, 0);
        } else {
            listByType = ((MultiLiveApi) com.bytedance.android.live.network.e.a().a(MultiLiveApi.class)).getListByType(j2, j3, j2, 3);
        }
        this.f11078f = listByType.a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new g(this, z, bVar, z2), new h(this, z));
    }
}

package com.bytedance.android.live.liveinteract.cohost.a.d;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.cohost.a.a.b;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.cohost.ui.e.a;
import com.bytedance.android.live.liveinteract.platform.a.a.a;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListExtra;
import com.bytedance.android.livesdk.chatroom.interact.model.i;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostInviteePanelDismissSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import f.a.ab;
import f.a.t;
import h.a.ag;
import h.a.n;
import h.a.z;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;

public final class b extends b.a {
    public static final a t = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public List<? extends Room> f10101j = z.INSTANCE;

    /* renamed from: k  reason: collision with root package name */
    public List<? extends Room> f10102k = z.INSTANCE;

    /* renamed from: l  reason: collision with root package name */
    public Map<Long, ? extends com.bytedance.android.livesdk.chatroom.interact.model.h> f10103l = ag.a();

    /* renamed from: m  reason: collision with root package name */
    public boolean f10104m;
    public int n;
    public String o = "";
    public i.a p;
    public boolean q;
    @com.bytedance.android.live.liveinteract.api.c.d(a = "LINKER_MANAGER")
    public com.bytedance.android.live.liveinteract.platform.a.c r;
    public final DataChannel s;
    private HashSet<Long> u = new HashSet<>();
    private final f.a.b.a v = new f.a.b.a();

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.b$b  reason: collision with other inner class name */
    public enum EnumC0162b {
        TYPE_FRIEND_TITLE,
        TYPE_RECOMMEND_TITLE;

        static {
            Covode.recordClassIndex(5294);
        }
    }

    public enum c {
        TYPE_FRIEND_USER,
        TYPE_RECOMMEND_USER;

        static {
            Covode.recordClassIndex(5295);
        }
    }

    static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final l f10112a = new l();

        static {
            Covode.recordClassIndex(5304);
        }

        l() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(5291);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(5293);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(5301);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        public final int a() {
            return this.this$0.f10101j.size();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(a());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ h $isRoomOwnerCanLinkMic$1;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(5302);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar, h hVar) {
            super(0);
            this.this$0 = bVar;
            this.$isRoomOwnerCanLinkMic$1 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(a());
        }

        public final int a() {
            Iterator<T> it = this.this$0.f10101j.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (this.$isRoomOwnerCanLinkMic$1.a(it.next())) {
                    i2++;
                }
            }
            return i2;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.b.a
    public final void d() {
        this.f10024c--;
        this.f10025d--;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.d.a
    public final void g() {
        this.v.a();
        this.s.b(this);
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.b.a
    public final void c() {
        int i2 = this.f10024c - 1;
        int i3 = this.f10023b;
        int i4 = 0;
        while (i4 < i3) {
            this.f10026e.remove(i2);
            i4++;
            i2--;
        }
        this.f10024c = i2 + 1;
        this.f10022a = true;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.b.a
    public final void e() {
        t<com.bytedance.android.live.network.response.d<Void>> a2 = com.bytedance.android.live.liveinteract.platform.common.api.a.a(2, true);
        if (a2 != null) {
            ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) a2.a(f())).a(k.f10111a, l.f10112a);
        }
    }

    private static com.bytedance.android.live.liveinteract.cohost.ui.d.b k() {
        Room room = b.a.a().y;
        if (room == null) {
            h.f.b.l.b();
        }
        return new com.bytedance.android.live.liveinteract.cohost.ui.d.b(room, b.a.a().p, b.a.a().z, b.a.a().x);
    }

    private static boolean l() {
        com.bytedance.android.live.liveinteract.api.k b2 = b.a.a().b();
        if (LiveCoHostInviteePanelDismissSetting.INSTANCE.getValue() != 2 || b2 != com.bytedance.android.live.liveinteract.api.k.INVITING || b.a.a().N < 0 || b.a.a().y == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.b.a
    public final void b() {
        m mVar = new m(this);
        int i2 = this.f10024c - 1;
        int size = this.f10101j.size();
        for (int i3 = this.n; i3 < size; i3++) {
            com.bytedance.android.live.liveinteract.cohost.ui.d.b a2 = mVar.a(i3);
            if (a2 != null) {
                i2++;
                this.f10026e.add(i2, a2);
            }
        }
        this.f10024c = i2 + 1;
        this.f10022a = false;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.b.a
    public final void a() {
        long j2;
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        CoHostApi coHostApi = (CoHostApi) com.bytedance.android.live.network.e.a().a(CoHostApi.class);
        if (room != null) {
            j2 = room.getId();
        } else {
            j2 = 0;
        }
        Calendar instance = Calendar.getInstance();
        h.f.b.l.b(instance, "");
        TimeZone timeZone = instance.getTimeZone();
        h.f.b.l.b(timeZone, "");
        String id = timeZone.getID();
        Calendar instance2 = Calendar.getInstance();
        h.f.b.l.b(instance2, "");
        ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) coHostApi.rivalsList(1, j2, id, instance2.getTimeZone().getOffset(System.currentTimeMillis()) / 1000).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(f())).a(new d(this), new e(this));
    }

    public final void i() {
        b.AbstractC0158b bVar;
        j.a.a.d dVar = this.f10026e;
        h.f.b.l.b(dVar, "");
        int i2 = 0;
        for (Object obj : dVar) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            if ((obj instanceof com.bytedance.android.live.liveinteract.cohost.ui.d.b) && ((this.f10032i.f9944i == 0 || ((com.bytedance.android.live.liveinteract.cohost.ui.d.b) obj).f10331a.getId() == this.f10032i.f9944i) && (bVar = (b.AbstractC0158b) this.f10031h) != null)) {
                bVar.a(i2);
            }
            i2 = i3;
        }
    }

    public final Pair<Boolean, Integer> j() {
        h hVar = new h(this);
        i iVar = new i(this);
        j jVar = new j(this, hVar);
        int a2 = iVar.a();
        int a3 = jVar.a();
        if (a3 <= 3 && a2 <= 3) {
            return new Pair<>(false, Integer.valueOf(a2));
        }
        if (a3 <= 3) {
            return new Pair<>(true, 3);
        }
        if (a3 < a2) {
            return new Pair<>(true, Integer.valueOf(a3));
        }
        return new Pair<>(false, Integer.valueOf(a3));
    }

    public final j.a.a.d h() {
        this.u.clear();
        this.f10026e = new j.a.a.d();
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.bS;
        h.f.b.l.b(bVar, "");
        Boolean a2 = bVar.a();
        com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.bT;
        h.f.b.l.b(bVar2, "");
        Boolean a3 = bVar2.a();
        com.bytedance.android.livesdk.ap.b<Boolean> bVar3 = com.bytedance.android.livesdk.ap.a.ci;
        h.f.b.l.b(bVar3, "");
        Boolean a4 = bVar3.a();
        h.f.b.l.b(a2, "");
        if (a2.booleanValue() && !a3.booleanValue() && !a4.booleanValue()) {
            com.bytedance.android.livesdk.ap.b<Boolean> bVar4 = com.bytedance.android.livesdk.ap.a.ci;
            h.f.b.l.b(bVar4, "");
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar4, (Object) true);
            j.a.a.d dVar = this.f10026e;
            h.f.b.l.b(dVar, "");
            dVar.add(new com.bytedance.android.live.liveinteract.cohost.ui.d.e());
        }
        if (this.q) {
            j.a.a.d dVar2 = this.f10026e;
            i.a aVar = this.p;
            if (aVar == null) {
                h.f.b.l.b();
            }
            dVar2.add(new com.bytedance.android.live.liveinteract.cohost.ui.d.d(aVar));
            this.f10025d = this.f10026e.size() - 1;
            if (!this.f10101j.isEmpty()) {
                a(EnumC0162b.TYPE_FRIEND_TITLE);
                a(c.TYPE_FRIEND_USER);
            }
        } else {
            a(EnumC0162b.TYPE_FRIEND_TITLE);
            if (!this.f10101j.isEmpty()) {
                a(c.TYPE_FRIEND_USER);
            } else {
                this.f10026e.add(new com.bytedance.android.live.liveinteract.cohost.ui.d.c());
            }
        }
        if (this.f10104m) {
            this.f10026e.add(new com.bytedance.android.live.liveinteract.cohost.ui.d.a());
            this.f10024c = this.f10026e.size() - 1;
        }
        a(EnumC0162b.TYPE_RECOMMEND_TITLE);
        a(c.TYPE_RECOMMEND_USER);
        j.a.a.d dVar3 = this.f10026e;
        h.f.b.l.b(dVar3, "");
        return dVar3;
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f10108a;

        static {
            Covode.recordClassIndex(5297);
        }

        e(b bVar) {
            this.f10108a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            b.AbstractC0158b bVar = (b.AbstractC0158b) this.f10108a.f10031h;
            if (bVar != null) {
                bVar.a(th);
            }
        }
    }

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f10110a;

        static {
            Covode.recordClassIndex(5299);
        }

        g(b bVar) {
            this.f10110a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            b.AbstractC0158b bVar = (b.AbstractC0158b) this.f10110a.f10031h;
            if (bVar != null) {
                bVar.b(th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.b<Room, Boolean> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(5300);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Room room) {
            return Boolean.valueOf(a(room));
        }

        public final boolean a(Room room) {
            h.f.b.l.d(room, "");
            com.bytedance.android.livesdk.chatroom.interact.model.h hVar = (com.bytedance.android.livesdk.chatroom.interact.model.h) this.this$0.f10103l.get(Long.valueOf(room.getId()));
            if (hVar == null || hVar.f15621f == 0) {
                return true;
            }
            return false;
        }
    }

    static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final k f10111a = new k();

        static {
            Covode.recordClassIndex(5303);
        }

        k() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.bT;
            h.f.b.l.b(bVar, "");
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) true);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<Integer, com.bytedance.android.live.liveinteract.cohost.ui.d.b> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(5305);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.android.live.liveinteract.cohost.ui.d.b invoke(Integer num) {
            return a(num.intValue());
        }

        public final com.bytedance.android.live.liveinteract.cohost.ui.d.b a(int i2) {
            if (i2 >= this.this$0.f10101j.size()) {
                return null;
            }
            Room room = (Room) this.this$0.f10101j.get(i2);
            com.bytedance.android.livesdk.chatroom.interact.model.h hVar = (com.bytedance.android.livesdk.chatroom.interact.model.h) this.this$0.f10103l.get(Long.valueOf(room.getId()));
            if (hVar == null) {
                return null;
            }
            return new com.bytedance.android.live.liveinteract.cohost.ui.d.b(room, com.bytedance.android.live.liveinteract.api.m.FOLLOW_INVITE, hVar, this.this$0.o);
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f10109a;

        static {
            Covode.recordClassIndex(5298);
        }

        f(b bVar) {
            this.f10109a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            b.AbstractC0158b bVar;
            com.bytedance.android.live.liveinteract.platform.a.c.a aVar = (com.bytedance.android.live.liveinteract.platform.a.c.a) obj;
            if (aVar.f11883a instanceof com.bytedance.android.live.network.response.d) {
                Object obj2 = aVar.f11883a;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.bytedance.android.live.network.response.Response<com.bytedance.android.livesdk.chatroom.interact.model.LinkInviteResult>");
                com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj2;
                if (dVar != null && dVar.data != null && (bVar = (b.AbstractC0158b) this.f10109a.f10031h) != null) {
                    bVar.b();
                }
            }
        }
    }

    private final void a(EnumC0162b bVar) {
        com.bytedance.android.live.liveinteract.cohost.ui.d.f fVar;
        j.a.a.d dVar = this.f10026e;
        if (bVar == EnumC0162b.TYPE_FRIEND_TITLE) {
            String a2 = y.a((int) R.string.dyu);
            h.f.b.l.b(a2, "");
            fVar = new com.bytedance.android.live.liveinteract.cohost.ui.d.f(a2);
        } else {
            String a3 = y.a((int) R.string.e6f);
            h.f.b.l.b(a3, "");
            fVar = new com.bytedance.android.live.liveinteract.cohost.ui.d.f(a3);
        }
        dVar.add(fVar);
    }

    private final void a(c cVar) {
        List<? extends Room> list;
        com.bytedance.android.live.liveinteract.api.m mVar;
        if (cVar == c.TYPE_FRIEND_USER) {
            if (this.n < this.f10101j.size()) {
                this.f10022a = true;
                this.f10023b = this.f10101j.size() - this.n;
            }
            list = n.d((Iterable) this.f10101j, this.n);
        } else {
            list = this.f10102k;
        }
        if (l()) {
            Room room = this.f10032i.y;
            if (room != null) {
                long ownerUserId = room.getOwnerUserId();
                if (this.f10032i.p == com.bytedance.android.live.liveinteract.api.m.FOLLOW_INVITE && cVar == c.TYPE_FRIEND_USER && !this.u.contains(Long.valueOf(ownerUserId))) {
                    this.f10026e.add(k());
                    this.u.add(Long.valueOf(ownerUserId));
                } else if (this.f10032i.p == com.bytedance.android.live.liveinteract.api.m.RECOMMEND_INVITE && cVar == c.TYPE_RECOMMEND_USER && !this.u.contains(Long.valueOf(ownerUserId))) {
                    this.f10026e.add(k());
                    this.u.add(Long.valueOf(ownerUserId));
                }
            } else {
                return;
            }
        }
        j.a.a.d dVar = this.f10026e;
        for (T t2 : list) {
            com.bytedance.android.livesdk.chatroom.interact.model.h hVar = (com.bytedance.android.livesdk.chatroom.interact.model.h) this.f10103l.get(Long.valueOf(t2.getId()));
            if (hVar != null) {
                if (cVar == c.TYPE_FRIEND_USER) {
                    mVar = com.bytedance.android.live.liveinteract.api.m.FOLLOW_INVITE;
                } else {
                    mVar = com.bytedance.android.live.liveinteract.api.m.RECOMMEND_INVITE;
                }
                if (!this.u.contains(Long.valueOf(t2.getOwnerUserId()))) {
                    dVar.add(new com.bytedance.android.live.liveinteract.cohost.ui.d.b(t2, mVar, hVar, this.o));
                    this.u.add(Long.valueOf(t2.getOwnerUserId()));
                }
            }
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f10107a;

        static {
            Covode.recordClassIndex(5296);
        }

        d(b bVar) {
            this.f10107a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            List<? extends Room> list;
            List<? extends Room> list2;
            Map<Long, ? extends com.bytedance.android.livesdk.chatroom.interact.model.h> map;
            i.a aVar;
            boolean z;
            List<Room> list3;
            Map<Long, com.bytedance.android.livesdk.chatroom.interact.model.h> map2;
            b.AbstractC0158b bVar;
            Map<Long, com.bytedance.android.livesdk.chatroom.interact.model.h> map3;
            List<Room> list4;
            List<Room> list5;
            com.bytedance.android.live.network.response.b bVar2 = (com.bytedance.android.live.network.response.b) obj;
            this.f10107a.f10024c = -1;
            a.c cVar = a.c.SHRINK;
            h.f.b.l.d(cVar, "");
            com.bytedance.android.live.liveinteract.cohost.ui.e.a.f10340b = cVar;
            b bVar3 = this.f10107a;
            RivalsListExtra rivalsListExtra = (RivalsListExtra) bVar2.extra;
            if (rivalsListExtra == null || (str = rivalsListExtra.getRequestId()) == null) {
                str = "";
            }
            bVar3.o = str;
            b bVar4 = this.f10107a;
            T t = bVar2.data;
            if (t == null || (list5 = t.f15622a) == null || (list = n.g((Iterable) list5)) == null) {
                list = z.INSTANCE;
            }
            bVar4.f10101j = list;
            b bVar5 = this.f10107a;
            T t2 = bVar2.data;
            if (t2 == null || (list4 = t2.f15623b) == null || (list2 = n.g((Iterable) list4)) == null) {
                list2 = z.INSTANCE;
            }
            bVar5.f10102k = list2;
            b bVar6 = this.f10107a;
            T t3 = bVar2.data;
            boolean z2 = false;
            if (t3 == null || (map3 = t3.f15624c) == null) {
                map = ag.a();
            } else {
                map = new LinkedHashMap<>();
                for (Map.Entry<Long, com.bytedance.android.livesdk.chatroom.interact.model.h> entry : map3.entrySet()) {
                    if (entry.getKey() != null || entry.getValue() != null) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            bVar6.f10103l = map;
            Pair<Boolean, Integer> j2 = this.f10107a.j();
            b bVar7 = this.f10107a;
            Object obj2 = j2.first;
            h.f.b.l.b(obj2, "");
            bVar7.f10104m = ((Boolean) obj2).booleanValue();
            b bVar8 = this.f10107a;
            Object obj3 = j2.second;
            h.f.b.l.b(obj3, "");
            bVar8.n = ((Number) obj3).intValue();
            b bVar9 = this.f10107a;
            T t4 = bVar2.data;
            if (t4 != null) {
                aVar = t4.f15625d;
            } else {
                aVar = null;
            }
            bVar9.p = aVar;
            b bVar10 = this.f10107a;
            i.a aVar2 = bVar10.p;
            if (aVar2 == null || TextUtils.isEmpty(aVar2.f15626a) || TextUtils.isEmpty(aVar2.f15627b) || TextUtils.isEmpty(aVar2.f15628c)) {
                z = false;
            } else {
                z = true;
            }
            bVar10.q = z;
            b bVar11 = this.f10107a;
            bVar11.f10026e = bVar11.h();
            b.AbstractC0158b bVar12 = (b.AbstractC0158b) this.f10107a.f10031h;
            if (bVar12 != null) {
                b bVar13 = this.f10107a;
                if (!com.bytedance.common.utility.h.a(bVar13.f10101j) || !com.bytedance.common.utility.h.a(bVar13.f10102k)) {
                    z2 = true;
                }
                bVar12.a(z2);
            }
            if (this.f10107a.q) {
                b.AbstractC0158b bVar14 = (b.AbstractC0158b) this.f10107a.f10031h;
                if (bVar14 != null) {
                    bVar14.a(this.f10107a.p);
                }
                if (com.bytedance.android.live.liveinteract.cohost.a.e.d.b() && (bVar = (b.AbstractC0158b) this.f10107a.f10031h) != null) {
                    bVar.g_();
                }
            }
            this.f10107a.i();
            T t5 = bVar2.data;
            if (!(t5 == null || (list3 = t5.f15622a) == null)) {
                for (T t6 : list3) {
                    T t7 = bVar2.data;
                    if (!(t7 == null || (map2 = t7.f15624c) == null)) {
                        h.f.b.l.b(t6, "");
                        if (map2.containsKey(Long.valueOf(t6.getId()))) {
                            this.f10107a.f10027f++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(b.AbstractC0158b bVar, DataChannel dataChannel) {
        super(bVar);
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(dataChannel, "");
        this.s = dataChannel;
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
        dataChannel.a(com.bytedance.android.live.liveinteract.cohost.a.b.j.class, (h.f.a.b) new h.f.a.b<Integer, h.z>(this) {
            /* class com.bytedance.android.live.liveinteract.cohost.a.d.b.AnonymousClass1 */
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(5292);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(Integer num) {
                num.intValue();
                this.this$0.i();
                return h.z.f158842a;
            }
        });
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.b.a
    public final void a(Room room, com.bytedance.android.live.liveinteract.api.m mVar) {
        Room room2;
        ab<com.bytedance.android.live.liveinteract.platform.a.c.a> a2;
        com.bytedance.android.livesdk.util.rxutils.autodispose.ac acVar;
        h.f.b.l.d(room, "");
        h.f.b.l.d(mVar, "");
        if (this.f10032i.f9940e <= 0 && !b.a.a().af && (room2 = (Room) DataChannelGlobal.f34575d.b(ac.class)) != null) {
            long id = room2.getId();
            long id2 = room.getId();
            com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(new com.bytedance.android.live.liveinteract.cohost.c.a(), null);
            com.bytedance.android.live.liveinteract.platform.a.a.b bVar = new com.bytedance.android.live.liveinteract.platform.a.a.b();
            bVar.f11858b = true;
            bVar.f11859c = true;
            com.bytedance.android.live.liveinteract.platform.a.c cVar = this.r;
            if (cVar == null) {
                h.f.b.l.a("mLinkerManager");
            }
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            h.f.b.l.b(b2, "");
            cVar.a(b2.c(), a.EnumC0247a.COHOST, this.s, bVar);
            com.bytedance.android.live.liveinteract.api.a.b bVar2 = this.f10032i;
            bVar2.af = true;
            bVar2.q = true;
            bVar2.f9937b = true;
            bVar2.f9941f = room.getOwnerUserId();
            User owner = room.getOwner();
            h.f.b.l.b(owner, "");
            bVar2.f9942g = owner.getSecUid();
            bVar2.T = room.getOwner();
            bVar2.f9944i = id2;
            bVar2.f9943h = id;
            this.f10032i.b(com.bytedance.android.live.liveinteract.api.k.INVITING);
            this.s.c(com.bytedance.android.live.liveinteract.cohost.a.b.i.class);
            HashMap hashMap = new HashMap();
            com.bytedance.android.live.liveinteract.platform.common.g.h.a(room, mVar, b.a.a().x);
            b.a.a().S = System.currentTimeMillis();
            com.bytedance.android.live.liveinteract.platform.a.c cVar2 = this.r;
            if (cVar2 == null) {
                h.f.b.l.a("mLinkerManager");
            }
            com.bytedance.android.live.liveinteract.platform.a.b a3 = cVar2.a();
            if (a3 != null && (a2 = a3.a(hashMap)) != null && (acVar = (com.bytedance.android.livesdk.util.rxutils.autodispose.ac) a2.a(f())) != null) {
                acVar.a(new f(this), new g(this));
            }
        }
    }
}

package com.bytedance.android.b.a;

import android.os.SystemClock;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.feed.LiveDrawerSettings;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.n;
import com.bytedance.android.livesdk.model.o;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f6785g = b.f6795a;

    /* renamed from: h  reason: collision with root package name */
    public static final C0091a f6786h = new C0091a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f6787a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.live.base.model.c.a f6788b;

    /* renamed from: c  reason: collision with root package name */
    public String f6789c;

    /* renamed from: d  reason: collision with root package name */
    public String f6790d;

    /* renamed from: e  reason: collision with root package name */
    public long f6791e;

    /* renamed from: f  reason: collision with root package name */
    public long f6792f;

    /* renamed from: i  reason: collision with root package name */
    private final h f6793i;

    /* renamed from: j  reason: collision with root package name */
    private final h f6794j;

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f6800a = new f();

        static {
            Covode.recordClassIndex(3266);
        }

        f() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public final Stack<Long> a() {
        return (Stack) this.f6793i.getValue();
    }

    public final HashSet<FeedItem> b() {
        return (HashSet) this.f6794j.getValue();
    }

    /* renamed from: com.bytedance.android.b.a.a$a  reason: collision with other inner class name */
    public static final class C0091a {
        static {
            Covode.recordClassIndex(3261);
        }

        private C0091a() {
        }

        public /* synthetic */ C0091a(byte b2) {
            this();
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final a f6795a = new a((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final b f6796b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(3262);
        }
    }

    static final class c extends m implements h.f.a.a<HashSet<FeedItem>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f6797a = new c();

        static {
            Covode.recordClassIndex(3263);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashSet<FeedItem> invoke() {
            return new HashSet();
        }
    }

    static final class d extends m implements h.f.a.a<Stack<Long>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f6798a = new d();

        static {
            Covode.recordClassIndex(3264);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Stack<Long> invoke() {
            return new Stack();
        }
    }

    static {
        Covode.recordClassIndex(3260);
    }

    private a() {
        this.f6789c = "scroll";
        this.f6790d = "drawer";
        this.f6793i = i.a((h.f.a.a) d.f6798a);
        this.f6794j = i.a((h.f.a.a) c.f6797a);
    }

    public final int c() {
        o oVar;
        com.bytedance.android.live.base.model.c.a aVar = this.f6788b;
        if (aVar == null) {
            return 0;
        }
        List<n> list = null;
        if (aVar.f7384g == null) {
            return 0;
        }
        com.bytedance.android.live.base.model.c.a aVar2 = this.f6788b;
        if (!(aVar2 == null || (oVar = aVar2.f7384g) == null)) {
            list = oVar.f19731a;
        }
        if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
            return 1;
        }
        return 0;
    }

    public final void d() {
        Room room;
        String str = "";
        for (T t : b()) {
            if (!(t == null || (room = t.getRoom()) == null)) {
                str = str + room.getId() + ",";
            }
        }
        if (p.c(str, ",", false)) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            str = str.substring(0, str.length() - 1);
            l.b(str, "");
        }
        if (LiveDrawerSettings.INSTANCE.getValue().getEnableFullEntrance() && !com.bytedance.common.utility.m.a(str)) {
            com.bytedance.android.live.base.model.c.a aVar = this.f6788b;
            String str2 = null;
            if (!com.bytedance.common.utility.m.a(aVar != null ? aVar.f7379b : null)) {
                RoomRetrofitApi roomRetrofitApi = (RoomRetrofitApi) com.bytedance.android.live.network.e.a().a(RoomRetrofitApi.class);
                com.bytedance.android.live.base.model.c.a aVar2 = this.f6788b;
                if (aVar2 != null) {
                    str2 = aVar2.f7379b;
                }
                roomRetrofitApi.collectUnreadRequest(str2, str).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new e(this), f.f6800a);
                b().clear();
            }
        }
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    public final void a(FeedItem feedItem) {
        l.d(feedItem, "");
        b().remove(feedItem);
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f6799a;

        static {
            Covode.recordClassIndex(3265);
        }

        e(a aVar) {
            this.f6799a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.core.c.a.a(3, "FeedDataManager", "Collecting unread room result, extra:" + this.f6799a.f6788b + ", statusCode: " + ((com.bytedance.android.live.network.response.d) obj).statusCode + '.');
        }
    }

    public final void a(boolean z, DataChannel dataChannel) {
        if (this.f6791e == 0) {
            return;
        }
        if (a().size() == 0 || z) {
            b.a.a("livesdk_explore_total_duration").a(dataChannel).a("has_banner", c()).a("duration", SystemClock.elapsedRealtime() - this.f6791e).a("total_explore_level", this.f6787a).b();
            this.f6791e = 0;
            this.f6787a = 0;
        }
    }
}

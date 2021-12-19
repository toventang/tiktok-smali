package com.bytedance.android.livesdk.wishlist.d;

import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.gift.model.x;
import com.bytedance.android.livesdk.gift.model.y;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.service.network.GiftRetrofitApi;
import com.bytedance.android.livesdk.wishlist.a.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.xbridge.n;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class a implements a.AbstractC0495a, OnMessageListener {

    /* renamed from: h  reason: collision with root package name */
    public static final C0497a f22831h = new C0497a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public a.b f22832a;

    /* renamed from: b  reason: collision with root package name */
    public List<? extends x.a> f22833b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<? extends x.b> f22834c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public String f22835d = "";

    /* renamed from: e  reason: collision with root package name */
    public int f22836e;

    /* renamed from: f  reason: collision with root package name */
    final f.a.b.a f22837f = new f.a.b.a();

    /* renamed from: g  reason: collision with root package name */
    public boolean f22838g;

    /* renamed from: i  reason: collision with root package name */
    private b f22839i = b.WISH_STATE_NOT_SET;

    /* renamed from: j  reason: collision with root package name */
    private DataChannel f22840j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f22841k;

    /* renamed from: l  reason: collision with root package name */
    private final h f22842l = new h(this);

    public enum b {
        WISH_STATE_NOT_SET,
        WISH_STATE_ON_GOING,
        WISH_STATE_FINISHED;

        static {
            Covode.recordClassIndex(13482);
        }
    }

    static {
        Covode.recordClassIndex(13480);
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.d.a$a  reason: collision with other inner class name */
    public static final class C0497a {
        static {
            Covode.recordClassIndex(13481);
        }

        private C0497a() {
        }

        public /* synthetic */ C0497a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.wishlist.a.a.AbstractC0495a
    public final b b() {
        return this.f22839i;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.bytedance.android.livesdk.gift.model.x$a>, java.util.List<com.bytedance.android.livesdk.gift.model.x$a> */
    @Override // com.bytedance.android.livesdk.wishlist.a.a.AbstractC0495a
    public final List<x.a> c() {
        return this.f22833b;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.bytedance.android.livesdk.gift.model.x$b>, java.util.List<com.bytedance.android.livesdk.gift.model.x$b> */
    @Override // com.bytedance.android.livesdk.wishlist.a.a.AbstractC0495a
    public final List<x.b> d() {
        return this.f22834c;
    }

    @Override // com.bytedance.android.livesdk.wishlist.a.a.AbstractC0495a
    public final void a(boolean z, h.f.a.a<z> aVar) {
        Room room;
        DataChannel dataChannel = this.f22840j;
        if (dataChannel != null && (room = (Room) dataChannel.b(df.class)) != null && room.getOwnerUserId() > 0 && room.getId() > 0 && !this.f22838g) {
            a(z, room, aVar);
        }
    }

    static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(13485);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a aVar = this.this$0;
            aVar.f22837f.a(com.bytedance.android.livesdk.utils.b.b.a(3, TimeUnit.SECONDS).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new i(aVar), new j(aVar)));
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.livesdk.wishlist.a.a.AbstractC0495a
    public final void a() {
        int i2;
        if (this.f22841k) {
            List<? extends x.a> list = this.f22833b;
            l.d(list, "");
            for (x.a aVar : list) {
                com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_wishlist_finished_status").a();
                if (aVar.f17965c >= aVar.f17966d) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                a2.a("is_finished", i2).a("wish_cnts", aVar.f17966d).a("finished_cnts", aVar.f17965c).a("unfinished_cnts", Math.max(aVar.f17966d - aVar.f17965c, 0)).a("gift_id", aVar.f17963a).a("show_reason", "live_end").b();
            }
        }
        DataChannel dataChannel = this.f22840j;
        if (dataChannel != null) {
            dataChannel.b(this);
            IMessageManager iMessageManager = (IMessageManager) dataChannel.b(cg.class);
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(this);
            }
        }
        this.f22839i = b.WISH_STATE_NOT_SET;
        this.f22836e = 0;
        this.f22837f.a();
        this.f22840j = null;
        com.bytedance.ies.xbridge.e.b.b("live-wish-list-commit-success", this.f22842l);
    }

    public static final class h implements com.bytedance.ies.xbridge.e.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f22852a;

        static {
            Covode.recordClassIndex(13488);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(a aVar) {
            this.f22852a = aVar;
        }

        @Override // com.bytedance.ies.xbridge.e.d
        public final void a(com.bytedance.ies.xbridge.e.c cVar) {
            n nVar;
            Map<String, Object> b2;
            l.d(cVar, "");
            a aVar = this.f22852a;
            l.d(cVar, "");
            String str = cVar.f35926a;
            if (str.hashCode() == -1300753897 && str.equals("live-wish-list-commit-success") && (nVar = cVar.f35927b) != null && (b2 = nVar.b()) != null) {
                com.google.gson.f fVar = e.a.f9628b;
                x xVar = (x) fVar.a(fVar.b(b2), x.class);
                if (xVar != null && xVar.f17962a != null) {
                    x.c cVar2 = xVar.f17962a;
                    if (cVar2 == null) {
                        l.b();
                    }
                    l.b(cVar2, "");
                    aVar.a(cVar2);
                    x.c cVar3 = xVar.f17962a;
                    if (cVar3 == null) {
                        l.b();
                    }
                    aVar.a(cVar3.f17973a);
                }
            }
        }
    }

    static final class d extends m implements h.f.a.b<z, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(13484);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            l.d(zVar, "");
            this.this$0.a(true, (h.f.a.a<z>) null);
            return z.f158842a;
        }
    }

    static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f22853a;

        static {
            Covode.recordClassIndex(13489);
        }

        i(a aVar) {
            this.f22853a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            a.a(this.f22853a).a();
        }
    }

    static final class j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f22854a;

        static {
            Covode.recordClassIndex(13490);
        }

        j(a aVar) {
            this.f22854a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            a.a(this.f22854a).a();
        }
    }

    public static final /* synthetic */ a.b a(a aVar) {
        a.b bVar = aVar.f22832a;
        if (bVar == null) {
            l.a("mView");
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f22851a;

        static {
            Covode.recordClassIndex(13487);
        }

        g(a aVar) {
            this.f22851a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.core.c.a.a(3, "wishList", ((Throwable) obj).toString());
            a.a(this.f22851a).a(false, null);
            this.f22851a.f22838g = false;
        }
    }

    private static boolean a(x.b bVar) {
        if (bVar == null || bVar.f17972a == null) {
            return false;
        }
        return true;
    }

    private static boolean a(x.a aVar) {
        x.a.C0373a aVar2;
        x.a.C0373a aVar3;
        if (aVar == null || aVar.f17964b != 1 || aVar.f17966d <= 0 || aVar.f17963a <= 0 || aVar.f17967e == null || (aVar2 = aVar.f17967e) == null || aVar2.f17968a == null || (aVar3 = aVar.f17967e) == null || aVar3.f17969b == null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        x.c cVar;
        if (iMessage instanceof y) {
            y yVar = (y) iMessage;
            if (yVar.f17978a != null && (cVar = yVar.f17978a) != null && cVar.f17973a > 0) {
                x.c cVar2 = yVar.f17978a;
                if (cVar2 == null) {
                    l.b();
                }
                a(cVar2);
                a(cVar2.f17973a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f22848a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f22849b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f22850c;

        static {
            Covode.recordClassIndex(13486);
        }

        f(a aVar, boolean z, h.f.a.a aVar2) {
            this.f22848a = aVar;
            this.f22849b = z;
            this.f22850c = aVar2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            x xVar;
            x.c cVar;
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            if (dVar != null && (xVar = (x) dVar.data) != null && (cVar = xVar.f17962a) != null && cVar.f17973a > 0) {
                x.c cVar2 = ((x) dVar.data).f17962a;
                if (cVar2 == null) {
                    l.b();
                }
                this.f22848a.a(cVar2);
                this.f22848a.a(cVar2.f17973a);
                if (this.f22849b) {
                    a.a(this.f22848a).a(true, new c(this.f22848a.f22833b, this.f22848a.f22834c, this.f22848a.f22835d, this.f22848a.f22836e));
                }
                h.f.a.a aVar = this.f22850c;
                if (aVar != null) {
                    aVar.invoke();
                }
                this.f22848a.f22838g = false;
            }
        }
    }

    public final void a(int i2) {
        b bVar = this.f22839i;
        if (i2 != 1) {
            if (i2 == 2) {
                List<? extends x.a> list = this.f22833b;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (next.f17965c < next.f17966d) {
                            this.f22839i = b.WISH_STATE_ON_GOING;
                            break;
                        }
                    }
                }
            } else if (i2 == 3) {
                List<? extends x.a> list2 = this.f22833b;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        T next2 = it2.next();
                        if (next2.f17965c < next2.f17966d) {
                            break;
                        }
                    }
                }
                this.f22839i = b.WISH_STATE_FINISHED;
            }
        } else if (this.f22833b.isEmpty()) {
            this.f22839i = b.WISH_STATE_NOT_SET;
        }
        if (bVar == b.WISH_STATE_NOT_SET && this.f22839i.compareTo((Enum) b.WISH_STATE_NOT_SET) > 0 && !this.f22841k) {
            com.bytedance.android.livesdk.wishlist.c.b.a();
        }
        if (bVar == b.WISH_STATE_ON_GOING && this.f22839i == b.WISH_STATE_FINISHED && this.f22841k) {
            com.bytedance.android.livesdk.wishlist.c.b.a(this.f22836e);
        }
    }

    public final void a(x.c cVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List g2;
        List g3;
        List<x.a> list = cVar.f17974b;
        if (list == null || (g3 = h.a.n.g((Iterable) list)) == null) {
            arrayList = new ArrayList();
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : g3) {
                if (a((x.a) obj)) {
                    arrayList3.add(obj);
                }
            }
            arrayList = arrayList3;
        }
        List<? extends x.a> g4 = h.a.n.g((Collection) arrayList);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.f34575d;
        ArrayList arrayList4 = new ArrayList(h.a.n.a((Iterable) g4, 10));
        Iterator<T> it = g4.iterator();
        while (it.hasNext()) {
            arrayList4.add(Long.valueOf(it.next().f17963a));
        }
        dataChannelGlobal.a(com.bytedance.android.livesdk.wishlist.d.class, arrayList4);
        this.f22833b = g4;
        List<x.b> list2 = cVar.f17975c;
        if (list2 == null || (g2 = h.a.n.g((Iterable) list2)) == null) {
            arrayList2 = new ArrayList();
        } else {
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : g2) {
                if (a((x.b) obj2)) {
                    arrayList5.add(obj2);
                }
            }
            arrayList2 = arrayList5;
        }
        this.f22834c = arrayList2;
        if (cVar.f17977e != null) {
            String str = cVar.f17977e;
            if (str == null) {
                l.b();
            }
            this.f22835d = str;
        }
        this.f22836e = cVar.f17976d;
    }

    @Override // com.bytedance.android.livesdk.wishlist.a.a.AbstractC0495a
    public final void a(DataChannel dataChannel, a.b bVar) {
        boolean z;
        l.d(dataChannel, "");
        l.d(bVar, "");
        this.f22840j = dataChannel;
        this.f22832a = bVar;
        if (dataChannel != null) {
            IMessageManager iMessageManager = (IMessageManager) dataChannel.b(cg.class);
            if (iMessageManager != null) {
                iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.WISH_LIST_UPDATE_MESSAGE.getIntType(), this);
            }
            dataChannel.a(this, com.bytedance.android.livesdk.wishlist.a.class, new d(this));
            Boolean bool = (Boolean) dataChannel.b(ee.class);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            this.f22841k = z;
        }
        com.bytedance.ies.xbridge.e.b.a("live-wish-list-commit-success", this.f22842l);
        a(false, (h.f.a.a<z>) new e(this));
    }

    private final void a(boolean z, Room room, h.f.a.a<z> aVar) {
        this.f22838g = true;
        this.f22837f.a(((GiftRetrofitApi) com.bytedance.android.live.network.e.a().a(GiftRetrofitApi.class)).getWishList(room.getOwnerUserId(), room.getId()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f(this, z, aVar), new g(this)));
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final List<x.a> f22844a;

        /* renamed from: b  reason: collision with root package name */
        public final List<x.b> f22845b;

        /* renamed from: c  reason: collision with root package name */
        public final String f22846c;

        /* renamed from: d  reason: collision with root package name */
        public final int f22847d;

        static {
            Covode.recordClassIndex(13483);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return l.a(this.f22844a, cVar.f22844a) && l.a(this.f22845b, cVar.f22845b) && l.a(this.f22846c, cVar.f22846c) && this.f22847d == cVar.f22847d;
        }

        public final int hashCode() {
            List<x.a> list = this.f22844a;
            int i2 = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            List<x.b> list2 = this.f22845b;
            int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
            String str = this.f22846c;
            if (str != null) {
                i2 = str.hashCode();
            }
            return ((hashCode2 + i2) * 31) + this.f22847d;
        }

        public final String toString() {
            return "WishListValidData(wishes=" + this.f22844a + ", contributors=" + this.f22845b + ", anchorWishDescriptionString=" + this.f22846c + ", contributorsLength=" + this.f22847d + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.bytedance.android.livesdk.gift.model.x$a> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.bytedance.android.livesdk.gift.model.x$b> */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends x.a> list, List<? extends x.b> list2, String str, int i2) {
            l.d(list, "");
            l.d(list2, "");
            l.d(str, "");
            this.f22844a = list;
            this.f22845b = list2;
            this.f22846c = str;
            this.f22847d = i2;
        }
    }
}

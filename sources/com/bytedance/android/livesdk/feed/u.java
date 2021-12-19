package com.bytedance.android.livesdk.feed;

import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.feed.c;
import com.bytedance.android.livesdk.livesetting.feed.InboxTopLivesCacheExpiredTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InboxTopLivesCollectUnreadSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.ad;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import h.m.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class u {

    /* renamed from: e  reason: collision with root package name */
    public static final h f17688e = i.a(m.SYNCHRONIZED, b.f17694a);

    /* renamed from: f  reason: collision with root package name */
    public static final a f17689f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.livesdk.feed.l.a f17690a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17691b;

    /* renamed from: c  reason: collision with root package name */
    public long f17692c;

    /* renamed from: d  reason: collision with root package name */
    public long f17693d;

    public static final class a {
        static {
            Covode.recordClassIndex(9815);
        }

        public static u a() {
            return (u) u.f17688e.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private u() {
    }

    static final class b extends h.f.b.m implements h.f.a.a<u> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f17694a = new b();

        static {
            Covode.recordClassIndex(9816);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ u invoke() {
            return new u((byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(9814);
    }

    public final com.bytedance.android.livesdk.feed.l.a a() {
        List<FeedItem> list;
        com.bytedance.android.livesdk.feed.l.a aVar;
        List<FeedItem> list2;
        FeedItem remove;
        List<FeedItem> list3;
        com.bytedance.android.live.base.model.c.a aVar2 = null;
        if (System.currentTimeMillis() - this.f17693d > ((long) (InboxTopLivesCacheExpiredTimeSetting.INSTANCE.getValue() * 1000))) {
            com.bytedance.android.livesdk.feed.l.a aVar3 = this.f17690a;
            if (!(aVar3 == null || (list3 = aVar3.f17588a) == null)) {
                list3.clear();
            }
            return null;
        } else if (this.f17691b) {
            return null;
        } else {
            com.bytedance.android.livesdk.feed.l.a aVar4 = this.f17690a;
            int i2 = 0;
            if (aVar4 == null || (list = aVar4.f17588a) == null || list.size() <= 0 || (aVar = this.f17690a) == null || (list2 = aVar.f17588a) == null || (remove = list2.remove(0)) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(1);
            do {
                arrayList.add(remove);
                i2++;
            } while (i2 <= 0);
            com.bytedance.android.livesdk.feed.l.a aVar5 = this.f17690a;
            if (aVar5 != null) {
                aVar2 = aVar5.f17589b;
            }
            return new com.bytedance.android.livesdk.feed.l.a(arrayList, aVar2);
        }
    }

    public final String b() {
        String str;
        List<FeedItem> list;
        com.bytedance.android.livesdk.feed.l.a aVar = this.f17690a;
        if (aVar == null || (list = aVar.f17588a) == null) {
            str = "";
        } else {
            Iterator<T> it = list.iterator();
            str = "";
            while (it.hasNext()) {
                StringBuilder append = new StringBuilder().append(str);
                Room room = it.next().getRoom();
                l.b(room, "");
                str = append.append(room.getId()).append(",").toString();
            }
        }
        if (!p.c(str, ",", false)) {
            return str;
        }
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(0, str.length() - 1);
        l.b(substring, "");
        return substring;
    }

    public static final class c implements com.bytedance.android.livesdk.feed.b.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17695a;

        static {
            Covode.recordClassIndex(9817);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public c(u uVar) {
            this.f17695a = uVar;
        }

        @Override // com.bytedance.android.livesdk.feed.b.b
        public final void a(List<? extends com.bytedance.android.livesdk.live.model.c> list) {
            List<FeedItem> list2;
            ArrayList arrayList;
            List<FeedItem> list3;
            com.bytedance.android.livesdk.feed.l.a aVar = this.f17695a.f17690a;
            int i2 = 0;
            if (aVar != null) {
                com.bytedance.android.livesdk.feed.l.a aVar2 = this.f17695a.f17690a;
                if (aVar2 == null || (list3 = aVar2.f17588a) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (T t : list3) {
                        T t2 = t;
                        if (list != null) {
                            ArrayList arrayList2 = new ArrayList(n.a((Iterable) list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(Long.valueOf(it.next().f18686a));
                            }
                            Room room = t2.getRoom();
                            l.b(room, "");
                            if (arrayList2.contains(Long.valueOf(room.getId()))) {
                                arrayList.add(t);
                            }
                        }
                    }
                }
                aVar.f17588a = ad.d(arrayList);
            }
            com.bytedance.android.livesdk.feed.l.a aVar3 = this.f17695a.f17690a;
            if (!(aVar3 == null || (list2 = aVar3.f17588a) == null)) {
                i2 = list2.size();
            }
            this.f17695a.a(i2);
        }
    }

    public static final class d implements com.bytedance.android.livesdk.feed.b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17696a;

        static {
            Covode.recordClassIndex(9818);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public d(u uVar) {
            this.f17696a = uVar;
        }

        @Override // com.bytedance.android.livesdk.feed.b.c
        public final void a(com.bytedance.android.livesdk.feed.l.a aVar) {
            if (aVar != null) {
                this.f17696a.f17690a = aVar;
                this.f17696a.f17691b = false;
            }
        }

        @Override // com.bytedance.android.livesdk.feed.b.c
        public final void a(Throwable th) {
            String str;
            if (th != null) {
                str = th.getMessage();
            } else {
                str = null;
            }
            com.bytedance.android.live.core.c.a.a(str);
        }
    }

    public /* synthetic */ u(byte b2) {
        this();
    }

    public final void a(int i2) {
        String str;
        com.bytedance.android.live.base.model.c.a aVar;
        if (InboxTopLivesCollectUnreadSetting.INSTANCE.getValue()) {
            if (i2 > 0 || !this.f17691b) {
                com.bytedance.android.livesdk.feed.l.a aVar2 = this.f17690a;
                if (aVar2 == null || (aVar = aVar2.f17589b) == null || (str = aVar.f7379b) == null) {
                    str = "";
                }
                String b2 = b();
                l.d(str, "");
                l.d(b2, "");
                ((RoomRetrofitApi) e.a().a(RoomRetrofitApi.class)).collectUnreadRequest(str, b2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c.k(str), c.l.f17339a);
            }
        }
    }
}

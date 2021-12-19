package com.bytedance.android.livesdk.live.b;

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.feed.LiveDrawerSettings;
import com.bytedance.android.livesdk.live.data.DrawRoomListModel;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;
import com.bytedance.android.livesdk.livesetting.watchlive.FollowFeedDrawLoopSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.ag;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.g.h;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import f.a.t;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class a extends h {

    /* renamed from: k  reason: collision with root package name */
    public static final b f18654k = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<Room> f18655a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<EnterRoomConfig> f18656b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<FeedItem> f18657c;

    /* renamed from: d  reason: collision with root package name */
    final HashMap<Long, String> f18658d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    final HashMap<String, HashSet<Long>> f18659e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.android.live.base.model.c.a f18660f;

    /* renamed from: g  reason: collision with root package name */
    long f18661g;

    /* renamed from: h  reason: collision with root package name */
    public String f18662h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f18663i;

    /* renamed from: j  reason: collision with root package name */
    int f18664j;

    /* renamed from: l  reason: collision with root package name */
    private DrawRoomListModel f18665l;

    /* renamed from: m  reason: collision with root package name */
    private final HashSet<Long> f18666m = new HashSet<>();
    private long n;
    private String o;
    private String p;
    private final f.a.b.a q;
    private boolean r;
    private String s;
    private String t;
    private String u;
    private String v;
    private boolean w;
    private int x;
    private final boolean y;

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f18670a = new e();

        static {
            Covode.recordClassIndex(10455);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(10450);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(10452);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdkapi.g.h
    public final List<Room> b() {
        return this.f18655a;
    }

    @Override // com.bytedance.android.livesdkapi.g.h
    public final void c() {
        this.f18666m.clear();
        this.f18659e.clear();
        this.f18656b.clear();
        this.f18655a.clear();
        this.q.a();
        this.f18663i = false;
    }

    @Override // com.bytedance.android.livesdkapi.g.f
    public final int a() {
        com.bytedance.android.live.base.model.c.a aVar = this.f18660f;
        if (aVar == null || aVar.hasMore || this.f18655a.size() <= 0 || !p.a(Boolean.valueOf(FollowFeedDrawLoopSetting.INSTANCE.getValue().isEnable())) || this.f18655a.size() < FollowFeedDrawLoopSetting.INSTANCE.getValue().getThreshold() || !LiveFeedDraw.a.c(this.u, this.v)) {
            return this.f18656b.size();
        }
        return Integer.MAX_VALUE;
    }

    public final void e() {
        String str;
        t<com.bytedance.android.live.network.response.d<Object>> collectUnreadRequest;
        HashMap<String, HashSet<Long>> hashMap = this.f18659e;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, HashSet<Long>> entry : hashMap.entrySet()) {
            entry.getValue().removeAll(this.f18666m);
            if (entry.getValue().size() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            try {
                String str2 = (String) entry2.getKey();
                int a2 = h.m.p.a((CharSequence) entry2.getKey(), "_");
                if (str2 != null) {
                    str = str2.substring(0, a2);
                    l.b(str, "");
                    if (this.f18665l == null) {
                        this.f18665l = new DrawRoomListModel();
                    }
                    DrawRoomListModel drawRoomListModel = this.f18665l;
                    if (!(drawRoomListModel == null || (collectUnreadRequest = drawRoomListModel.collectUnreadRequest(this.f18661g, this.n, str, new ArrayList((Collection) entry2.getValue()))) == null)) {
                        collectUnreadRequest.b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new C0390a(str), e.f18670a);
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } catch (Exception unused) {
                str = (String) entry2.getKey();
            }
        }
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f18669a;

        static {
            Covode.recordClassIndex(10454);
        }

        d(a aVar) {
            this.f18669a = aVar;
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            this.f18669a.f18663i = false;
        }
    }

    @Override // com.bytedance.android.livesdkapi.g.h
    public final String b(long j2) {
        String str = this.f18658d.get(Long.valueOf(j2));
        if (str == null) {
            return "";
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.live.b.a$a  reason: collision with other inner class name */
    public static final class C0390a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f18667a;

        static {
            Covode.recordClassIndex(10451);
        }

        C0390a(String str) {
            this.f18667a = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.core.c.a.a(3, "DrawRoomListProvider", "Collecting unread room result, extra: " + this.f18667a + ", statusCode: " + ((com.bytedance.android.live.network.response.d) obj).statusCode + '.');
        }
    }

    @Override // com.bytedance.android.livesdkapi.g.f
    public final int a(EnterRoomConfig enterRoomConfig) {
        long j2;
        EnterRoomConfig.RoomsData roomsData;
        if (enterRoomConfig == null || (roomsData = enterRoomConfig.f23299c) == null) {
            j2 = -1;
        } else {
            j2 = roomsData.R;
        }
        int size = this.f18656b.size();
        for (int i2 = 0; i2 < size; i2++) {
            EnterRoomConfig enterRoomConfig2 = this.f18656b.get(i2);
            if (enterRoomConfig2.f23299c.R == j2 && enterRoomConfig2 != null) {
                return i2;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final void b(EnterRoomConfig enterRoomConfig) {
        if (this.r && enterRoomConfig != null) {
            enterRoomConfig.f23299c.O = this.r;
            enterRoomConfig.f23299c.P = this.s;
            enterRoomConfig.f23299c.Q = this.t;
            enterRoomConfig.f23299c.az = this.w;
            enterRoomConfig.f23299c.aB = this.x;
            enterRoomConfig.f23299c.A = this.o;
            if (this.w) {
                enterRoomConfig.f23299c.W = "small_picture";
            } else {
                enterRoomConfig.f23299c.W = "full_screen";
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.g.h, com.bytedance.android.livesdkapi.g.f
    public final Room c(int i2) {
        int size;
        if (this.f18655a.size() > 0 && (size = i2 % this.f18655a.size()) >= 0 && size < this.f18655a.size()) {
            return this.f18655a.get(size);
        }
        return null;
    }

    private final void c(EnterRoomConfig enterRoomConfig) {
        HashMap<Long, String> hashMap;
        if (l.a((Object) com.bytedance.android.livesdkapi.depend.model.live.f.f23137c, (Object) true) && (hashMap = enterRoomConfig.f23299c.aC) != null) {
            for (Map.Entry<Long, String> entry : hashMap.entrySet()) {
                if (!(entry == null || entry.getKey() == null || entry.getValue() == null)) {
                    HashMap<Long, String> hashMap2 = this.f18658d;
                    Long key = entry.getKey();
                    l.b(key, "");
                    String value = entry.getValue();
                    l.b(value, "");
                    hashMap2.put(key, value);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.g.f
    public final EnterRoomConfig a(int i2) {
        int size;
        if (this.f18656b.size() <= 0 || (size = i2 % this.f18656b.size()) < 0 || size >= this.f18656b.size()) {
            return new EnterRoomConfig();
        }
        EnterRoomConfig enterRoomConfig = this.f18656b.get(size);
        l.b(enterRoomConfig, "");
        return enterRoomConfig;
    }

    public final void c(long j2) {
        this.f18666m.add(Long.valueOf(j2));
        com.bytedance.android.live.core.c.a.a(3, "DrawRoomListProvider", "Room " + j2 + " is showing.");
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f18668a;

        static {
            Covode.recordClassIndex(10453);
        }

        c(a aVar) {
            this.f18668a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            Pair pair = (Pair) obj;
            if (pair == null) {
                this.f18668a.f18663i = false;
                return;
            }
            this.f18668a.f18660f = (com.bytedance.android.live.base.model.c.a) pair.second;
            a aVar = this.f18668a;
            List list = (List) pair.first;
            com.bytedance.android.live.base.model.c.a aVar2 = (com.bytedance.android.live.base.model.c.a) pair.second;
            if (list != null && !list.isEmpty()) {
                HashSet<Long> hashSet = new HashSet<>();
                Iterator<T> it = list.iterator();
                while (true) {
                    Room room = null;
                    if (it.hasNext()) {
                        T next = it.next();
                        if (next.item == null) {
                            try {
                                next.item = next.getRoom();
                                if ((next.type == 1 || next.type == 2) && (next.item instanceof Room)) {
                                    ag agVar = next.item;
                                    if (agVar != null) {
                                        Room room2 = (Room) agVar;
                                        room2.setLog_pb(next.logPb);
                                        User owner = room2.getOwner();
                                        if (owner != null) {
                                            owner.setLogPb(next.logPb);
                                        }
                                        room2.setRequestId(next.resId);
                                        room2.isFromRecommendCard = next.isRecommendCard;
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
                                    }
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                        ag agVar2 = next.item;
                        if (agVar2 instanceof Room) {
                            room = agVar2;
                        }
                        Room room3 = room;
                        if (room3 != null) {
                            long j2 = aVar.f18661g;
                            User owner2 = room3.getOwner();
                            if (owner2 == null || j2 != owner2.getLiveRoomId()) {
                                room3.isFromRecommendCard = next.isRecommendCard;
                                aVar.f18655a.add(room3);
                                EnterRoomConfig a2 = com.bytedance.android.livesdkapi.g.a.a(room3, true);
                                if (m.a(a2.f23297a.f23340d) && m.a(a2.f23297a.f23338b)) {
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    linkedHashMap.put("roomid", Long.valueOf(a2.f23299c.R));
                                    com.bytedance.android.live.core.d.c.a("ttlive_webcast_feed_empty_stream", 0, linkedHashMap);
                                }
                                l.b(a2, "");
                                aVar.b(a2);
                                aVar.f18656b.add(a2);
                                aVar.f18657c.add(next);
                                hashSet.add(Long.valueOf(room3.getId()));
                                if (l.a((Object) com.bytedance.android.livesdkapi.depend.model.live.f.f23137c, (Object) true) && !TextUtils.isEmpty(next.debugInfo)) {
                                    HashMap<Long, String> hashMap = aVar.f18658d;
                                    Room room4 = next.getRoom();
                                    l.b(room4, "");
                                    Long valueOf = Long.valueOf(room4.getId());
                                    String str2 = next.debugInfo;
                                    l.b(str2, "");
                                    hashMap.put(valueOf, str2);
                                }
                            } else {
                                com.bytedance.android.live.core.c.a.a(3, "DrawRoomListProvider", "Remove duplicate room " + aVar.f18661g);
                            }
                        }
                    } else if (!(aVar2 == null || (str = aVar2.f7379b) == null || str.length() == 0 || str == null)) {
                        aVar.f18659e.put(str + '_' + aVar.f18664j, hashSet);
                        aVar.f18664j++;
                    }
                }
            }
            this.f18668a.f();
            this.f18668a.f18663i = false;
        }
    }

    private final void d(EnterRoomConfig enterRoomConfig) {
        com.bytedance.android.live.base.model.c.a aVar;
        String str;
        long j2;
        Long g2;
        HashSet<Long> hashSet = new HashSet<>();
        this.r = enterRoomConfig.f23299c.O;
        this.s = enterRoomConfig.f23299c.P;
        this.t = enterRoomConfig.f23299c.Q;
        this.w = enterRoomConfig.f23299c.az;
        this.x = enterRoomConfig.f23299c.aB;
        SparseArray<EnterRoomConfig> sparseArray = enterRoomConfig.f23299c.B;
        if (sparseArray != null) {
            int size = sparseArray.size() + 1;
            for (int i2 = 0; i2 < size; i2++) {
                EnterRoomConfig enterRoomConfig2 = sparseArray.get(i2);
                if (enterRoomConfig2 != null) {
                    b(enterRoomConfig2);
                    this.f18656b.add(enterRoomConfig2);
                    ArrayList<Room> arrayList = this.f18655a;
                    Room room = new Room();
                    room.setId(enterRoomConfig2.f23299c.R);
                    room.setIdStr(String.valueOf(room.getId()));
                    room.isFromRecommendCard = !TextUtils.isEmpty(enterRoomConfig2.f23299c.Z);
                    User user = new User();
                    String str2 = enterRoomConfig2.f23298b.f23310b;
                    if (str2 == null || (g2 = h.m.p.g(str2)) == null) {
                        j2 = 0;
                    } else {
                        j2 = g2.longValue();
                    }
                    user.setId(j2);
                    user.setIdStr(String.valueOf(user.getId()));
                    room.setOwner(user);
                    arrayList.add(room);
                    this.f18657c.add(new FeedItem());
                    hashSet.add(Long.valueOf(enterRoomConfig2.f23299c.R));
                }
            }
            if (!(enterRoomConfig.f23299c.x == null || enterRoomConfig.f23299c.w == -1)) {
                com.bytedance.android.live.base.model.c.a aVar2 = new com.bytedance.android.live.base.model.c.a();
                Boolean bool = enterRoomConfig.f23299c.x;
                if (bool == null) {
                    l.b();
                }
                aVar2.hasMore = bool.booleanValue();
                aVar2.f7381d = enterRoomConfig.f23299c.w;
                this.f18660f = aVar2;
            }
            if (!m.a(enterRoomConfig.f23299c.v)) {
                com.bytedance.android.live.base.model.c.a aVar3 = this.f18660f;
                if (aVar3 != null) {
                    aVar3.f7379b = enterRoomConfig.f23299c.v;
                }
                com.bytedance.android.live.base.model.c.a aVar4 = this.f18660f;
                String str3 = null;
                if (aVar4 != null) {
                    str3 = aVar4.f7379b;
                }
                if (!(m.a(str3) || (aVar = this.f18660f) == null || (str = aVar.f7379b) == null || str.length() == 0 || str == null)) {
                    this.f18659e.put(str + '_' + this.f18664j, hashSet);
                    this.f18664j++;
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.g.h
    public final void a(long j2) {
        if (!(com.bytedance.common.utility.collection.b.a((Collection) this.f18655a) || com.bytedance.common.utility.collection.b.a((Collection) this.f18656b) || com.bytedance.common.utility.collection.b.a((Collection) this.f18657c))) {
            int size = this.f18655a.size();
            for (int i2 = 0; i2 < size; i2++) {
                Room room = this.f18655a.get(i2);
                l.b(room, "");
                if (room.getId() == j2) {
                    if (this.f18656b.size() > i2) {
                        this.f18656b.remove(i2);
                    }
                    if (this.f18655a.size() > i2) {
                        this.f18655a.remove(i2);
                    }
                    if (this.f18657c.size() > i2) {
                        this.f18657c.remove(i2);
                    }
                    this.f18658d.remove(Long.valueOf(j2));
                    f();
                    return;
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.g.h
    public final void b(int i2) {
        long j2;
        String str;
        String sb;
        String str2;
        if (this.f18661g > 0) {
            com.bytedance.android.live.base.model.c.a aVar = this.f18660f;
            if (aVar == null || aVar.hasMore) {
                if (this.f18665l == null) {
                    this.f18665l = new DrawRoomListModel();
                }
                if (!this.f18663i) {
                    String str3 = this.o;
                    if (!TextUtils.isEmpty(str3) && h.m.p.a((CharSequence) str3, (CharSequence) "/webcast/feed/", false)) {
                        if (com.bytedance.android.livesdkapi.depend.model.live.f.f23137c == null) {
                            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IHostContext.class);
                            l.b(a2, "");
                            com.bytedance.android.livesdkapi.depend.model.live.f.f23137c = Boolean.valueOf(((IHostContext) a2).isOffline());
                        }
                        if (l.a((Object) com.bytedance.android.livesdkapi.depend.model.live.f.f23137c, (Object) true) && !h.m.p.a((CharSequence) str3, (CharSequence) "&debug=true", false)) {
                            str3 = str3 + "&debug=true";
                        }
                    }
                    this.o = str3;
                    DrawRoomListModel drawRoomListModel = this.f18665l;
                    if (drawRoomListModel != null) {
                        com.bytedance.android.live.base.model.c.a aVar2 = this.f18660f;
                        if (aVar2 != null) {
                            j2 = aVar2.f7381d;
                        } else {
                            j2 = 0;
                        }
                        if (this.y) {
                            StringBuilder append = new StringBuilder().append(this.f18662h);
                            com.bytedance.android.live.base.model.c.a aVar3 = this.f18660f;
                            if (aVar3 == null || aVar3.f7381d == 0) {
                                str2 = "_draw_refresh";
                            } else {
                                str2 = "_draw_loadmore";
                            }
                            sb = append.append(str2).toString();
                        } else {
                            StringBuilder append2 = new StringBuilder().append(this.f18662h);
                            com.bytedance.android.live.base.model.c.a aVar4 = this.f18660f;
                            if (aVar4 == null || aVar4.f7381d == 0) {
                                str = "_refresh";
                            } else {
                                str = "_loadmore";
                            }
                            sb = append2.append(str).toString();
                        }
                        t<Pair<List<FeedItem>, com.bytedance.android.live.base.model.c.a>> roomList = drawRoomListModel.getRoomList(j2, sb, this.p, this.f18661g, this.n, this.o);
                        if (roomList != null) {
                            this.f18663i = true;
                            this.q.a(roomList.b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(this), new d(this)));
                        }
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.g.h, com.bytedance.android.livesdkapi.g.f
    public final void a(Room room) {
        if (room != null) {
            int size = this.f18655a.size();
            for (int i2 = 0; i2 < size; i2++) {
                Room room2 = this.f18655a.get(i2);
                l.b(room2, "");
                if (room2.getId() == room.getId()) {
                    this.f18655a.set(i2, room);
                    return;
                }
            }
        }
    }

    public a(EnterRoomConfig enterRoomConfig, String str, String str2, String str3) {
        long j2;
        String str4;
        String str5;
        Long g2;
        String str6 = "";
        l.d(enterRoomConfig, str6);
        l.d(str, str6);
        l.d(str2, str6);
        l.d(str3, str6);
        ArrayList<Room> arrayList = new ArrayList<>();
        this.f18655a = arrayList;
        ArrayList<EnterRoomConfig> arrayList2 = new ArrayList<>();
        this.f18656b = arrayList2;
        ArrayList<FeedItem> arrayList3 = new ArrayList<>();
        this.f18657c = arrayList3;
        this.o = str6;
        this.f18662h = str6;
        this.p = str6;
        this.q = new f.a.b.a();
        this.s = str6;
        this.t = str6;
        this.u = str6;
        this.v = str6;
        this.o = str;
        this.f18661g = enterRoomConfig.f23299c.R;
        String str7 = enterRoomConfig.f23299c.D;
        if ((str7 == null && (str7 = enterRoomConfig.f23298b.f23310b) == null) || (g2 = h.m.p.g(str7)) == null) {
            j2 = 0;
        } else {
            j2 = g2.longValue();
        }
        this.n = j2;
        this.u = enterRoomConfig.f23299c.J;
        this.v = enterRoomConfig.f23299c.L;
        if (str2.length() == 0) {
            com.bytedance.android.livesdkapi.session.f fVar = f.a.f23366a;
            l.b(fVar, str6);
            EnterRoomLinkSession a2 = fVar.a();
            l.b(a2, str6);
            EnterRoomConfig enterRoomConfig2 = a2.f23354b;
            this.f18662h = LiveFeedDraw.a.e(enterRoomConfig2.f23299c.J, enterRoomConfig2.f23299c.L);
            if (TextUtils.isEmpty(enterRoomConfig2.f23299c.P)) {
                str4 = str6;
            } else {
                str4 = enterRoomConfig2.f23299c.P;
            }
            TextUtils.isEmpty(str4);
            if (TextUtils.equals(str4, "homepage_hot")) {
                str5 = "foru_";
            } else {
                str5 = str6;
            }
            String str8 = enterRoomConfig2.f23299c.J;
            str8 = str8 == null ? str6 : str8;
            String str9 = enterRoomConfig2.f23299c.L;
            this.f18662h = LiveFeedDraw.a.a(str8, str9 != null ? str9 : str6);
            this.f18662h = str5 + this.f18662h;
            if (enterRoomConfig2.f23299c.az && LiveDrawerSettings.INSTANCE.getValue().getEnableFullEntrance()) {
                this.f18662h = "drawer_draw";
            }
        } else {
            this.f18662h = str2;
        }
        if (str3.length() == 0) {
            this.p = LiveFeedDraw.a.b(enterRoomConfig.f23299c.J, enterRoomConfig.f23299c.L);
        } else {
            this.p = str3;
        }
        if (enterRoomConfig.f23299c.az && LiveDrawerSettings.INSTANCE.getValue().getEnableFullEntrance()) {
            this.p = "97";
        }
        if (m.a(enterRoomConfig.f23298b.f23310b)) {
            enterRoomConfig.f23298b.f23310b = String.valueOf(this.n);
        }
        if (m.a(enterRoomConfig.f23298b.f23309a)) {
            enterRoomConfig.f23298b.f23309a = enterRoomConfig.f23298b.f23309a;
        }
        if (m.a(enterRoomConfig.f23298b.f23315g)) {
            enterRoomConfig.f23298b.f23315g = enterRoomConfig.f23298b.f23315g;
        }
        arrayList2.add(enterRoomConfig);
        Room room = new Room();
        room.setId(this.f18661g);
        room.setIdStr(String.valueOf(this.f18661g));
        User user = new User();
        user.setId(this.n);
        user.setIdStr(String.valueOf(this.n));
        room.setOwner(user);
        arrayList.add(room);
        this.y = !TextUtils.isEmpty(enterRoomConfig.f23299c.at);
        arrayList3.add(new FeedItem());
        d(enterRoomConfig);
        c(enterRoomConfig);
        com.bytedance.android.live.core.c.a.a(3, "DrawRoomListProvider", "Enter room id: " + this.f18661g + ", anchor id: " + this.n + ", request from: " + this.f18662h + ", channel id: " + this.p);
    }
}

package com.ss.android.ugc.aweme.notification.vm.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.f;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notice.repo.list.bean.e;
import com.ss.android.ugc.aweme.notice.repo.list.bean.i;
import com.ss.android.ugc.aweme.notification.bean.q;
import com.ss.android.ugc.aweme.utils.ib;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f114121a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final Comparator<MusNotice> f114122b = c.f114138a;

    private d() {
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public long f114136a;

        /* renamed from: b  reason: collision with root package name */
        public long f114137b;

        static {
            Covode.recordClassIndex(73380);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f114136a == bVar.f114136a && this.f114137b == bVar.f114137b;
        }

        public final String toString() {
            return "TimeRange(maxTime=" + this.f114136a + ", minTime=" + this.f114137b + ")";
        }

        public /* synthetic */ b() {
            this(0, 0);
        }

        public final int hashCode() {
            long j2 = this.f114136a;
            long j3 = this.f114137b;
            return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
        }

        public final b a(long j2) {
            long max;
            if (j2 > 0) {
                long j3 = this.f114136a;
                if (j3 <= 0) {
                    max = j2;
                } else {
                    max = Math.max(j3, j2);
                }
                this.f114136a = max;
                long j4 = this.f114137b;
                if (j4 > 0) {
                    j2 = Math.min(j4, j2);
                }
                this.f114137b = j2;
            }
            return this;
        }

        public b(long j2, long j3) {
            this.f114136a = j2;
            this.f114137b = j3;
        }
    }

    static {
        Covode.recordClassIndex(73378);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<MusNotice> f114123a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<Integer, NoticeItems> f114124b;

        /* renamed from: c  reason: collision with root package name */
        public final List<MusNotice> f114125c;

        /* renamed from: d  reason: collision with root package name */
        public final LogPbBean f114126d;

        /* renamed from: e  reason: collision with root package name */
        public final long f114127e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f114128f;

        /* renamed from: g  reason: collision with root package name */
        public final int f114129g;

        /* renamed from: h  reason: collision with root package name */
        public final b f114130h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f114131i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f114132j;

        /* renamed from: k  reason: collision with root package name */
        public final Set<String> f114133k;

        /* renamed from: l  reason: collision with root package name */
        public final Set<Integer> f114134l;

        /* renamed from: m  reason: collision with root package name */
        public final List<Integer> f114135m;
        public final b n;
        public final List<MusNotice> o;
        public final List<MusNotice> p;
        public final List<MusNotice> q;

        static {
            Covode.recordClassIndex(73379);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f114123a, aVar.f114123a) && l.a(this.f114124b, aVar.f114124b) && l.a(this.f114125c, aVar.f114125c) && l.a(this.f114126d, aVar.f114126d) && this.f114127e == aVar.f114127e && this.f114128f == aVar.f114128f && this.f114129g == aVar.f114129g && l.a(this.f114130h, aVar.f114130h) && this.f114131i == aVar.f114131i && this.f114132j == aVar.f114132j && l.a(this.f114133k, aVar.f114133k) && l.a(this.f114134l, aVar.f114134l) && l.a(this.f114135m, aVar.f114135m) && l.a(this.n, aVar.n) && l.a(this.o, aVar.o) && l.a(this.p, aVar.p) && l.a(this.q, aVar.q);
        }

        public final String toString() {
            return "ProcessInfo(extraLiveData=" + this.f114123a + ", extraDataMap=" + this.f114124b + ", newData=" + this.f114125c + ", logPb=" + this.f114126d + ", lastReadTime=" + this.f114127e + ", isRefresh=" + this.f114128f + ", total=" + this.f114129g + ", nextTimeRange=" + this.f114130h + ", hasMore=" + this.f114131i + ", shouldCollapse=" + this.f114132j + ", nidSet=" + this.f114133k + ", typeSet=" + this.f114134l + ", timelineSet=" + this.f114135m + ", timeRange=" + this.n + ", nextData=" + this.o + ", data=" + this.p + ", collapsedData=" + this.q + ")";
        }

        public final int hashCode() {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            List<MusNotice> list = this.f114123a;
            int i13 = 0;
            if (list != null) {
                i2 = list.hashCode();
            } else {
                i2 = 0;
            }
            int i14 = i2 * 31;
            Map<Integer, NoticeItems> map = this.f114124b;
            if (map != null) {
                i3 = map.hashCode();
            } else {
                i3 = 0;
            }
            int i15 = (i14 + i3) * 31;
            List<MusNotice> list2 = this.f114125c;
            if (list2 != null) {
                i4 = list2.hashCode();
            } else {
                i4 = 0;
            }
            int i16 = (i15 + i4) * 31;
            LogPbBean logPbBean = this.f114126d;
            if (logPbBean != null) {
                i5 = logPbBean.hashCode();
            } else {
                i5 = 0;
            }
            long j2 = this.f114127e;
            int i17 = (((i16 + i5) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            boolean z = this.f114128f;
            int i18 = 1;
            if (z) {
                z = true;
            }
            int i19 = z ? 1 : 0;
            int i20 = z ? 1 : 0;
            int i21 = z ? 1 : 0;
            int i22 = (((i17 + i19) * 31) + this.f114129g) * 31;
            b bVar = this.f114130h;
            if (bVar != null) {
                i6 = bVar.hashCode();
            } else {
                i6 = 0;
            }
            int i23 = (i22 + i6) * 31;
            boolean z2 = this.f114131i;
            if (z2) {
                z2 = true;
            }
            int i24 = z2 ? 1 : 0;
            int i25 = z2 ? 1 : 0;
            int i26 = z2 ? 1 : 0;
            int i27 = (i23 + i24) * 31;
            if (!this.f114132j) {
                i18 = 0;
            }
            int i28 = (i27 + i18) * 31;
            Set<String> set = this.f114133k;
            if (set != null) {
                i7 = set.hashCode();
            } else {
                i7 = 0;
            }
            int i29 = (i28 + i7) * 31;
            Set<Integer> set2 = this.f114134l;
            if (set2 != null) {
                i8 = set2.hashCode();
            } else {
                i8 = 0;
            }
            int i30 = (i29 + i8) * 31;
            List<Integer> list3 = this.f114135m;
            if (list3 != null) {
                i9 = list3.hashCode();
            } else {
                i9 = 0;
            }
            int i31 = (i30 + i9) * 31;
            b bVar2 = this.n;
            if (bVar2 != null) {
                i10 = bVar2.hashCode();
            } else {
                i10 = 0;
            }
            int i32 = (i31 + i10) * 31;
            List<MusNotice> list4 = this.o;
            if (list4 != null) {
                i11 = list4.hashCode();
            } else {
                i11 = 0;
            }
            int i33 = (i32 + i11) * 31;
            List<MusNotice> list5 = this.p;
            if (list5 != null) {
                i12 = list5.hashCode();
            } else {
                i12 = 0;
            }
            int i34 = (i33 + i12) * 31;
            List<MusNotice> list6 = this.q;
            if (list6 != null) {
                i13 = list6.hashCode();
            }
            return i34 + i13;
        }

        public final void a(MusNotice musNotice) {
            l.d(musNotice, "");
            a(musNotice, this.p);
        }

        public final void b(MusNotice musNotice) {
            l.d(musNotice, "");
            a(musNotice, this.o);
        }

        public final boolean c(MusNotice musNotice) {
            l.d(musNotice, "");
            if (this.f114133k.contains(musNotice.nid) || ((musNotice.type == 1 || musNotice.type == 2) && this.f114134l.contains(Integer.valueOf(musNotice.type)))) {
                return true;
            }
            return false;
        }

        private final void a(MusNotice musNotice, List<MusNotice> list) {
            if (!musNotice.hasRead) {
                if (musNotice.noticeListType == 2) {
                    musNotice.priority = 3;
                } else {
                    musNotice.priority = 1;
                }
                musNotice.timeLineType = 0;
            } else {
                musNotice.timeLineType = ib.a(musNotice.createTime * 1000);
            }
            musNotice.lastReadTime = this.f114127e;
            if (musNotice.logPbBean == null) {
                musNotice.logPbBean = this.f114126d;
            }
            list.add(musNotice);
            Set<String> set = this.f114133k;
            String str = musNotice.nid;
            l.b(str, "");
            set.add(str);
            this.f114134l.add(Integer.valueOf(musNotice.type));
            if (!this.f114135m.contains(Integer.valueOf(musNotice.timeLineType))) {
                this.f114135m.add(Integer.valueOf(musNotice.timeLineType));
            }
            this.n.a(musNotice.createTime);
        }

        public /* synthetic */ a(List list, Map map, List list2, LogPbBean logPbBean, long j2, boolean z, int i2, b bVar, boolean z2, boolean z3) {
            this(list, map, list2, logPbBean, j2, z, i2, bVar, z2, z3, new LinkedHashSet(), new LinkedHashSet(), new ArrayList(), new b(), new ArrayList(), new ArrayList(), new ArrayList());
        }

        /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> */
        /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> */
        /* JADX WARN: Multi-variable type inference failed */
        private a(List<? extends MusNotice> list, Map<Integer, NoticeItems> map, List<? extends MusNotice> list2, LogPbBean logPbBean, long j2, boolean z, int i2, b bVar, boolean z2, boolean z3, Set<String> set, Set<Integer> set2, List<Integer> list3, b bVar2, List<MusNotice> list4, List<MusNotice> list5, List<MusNotice> list6) {
            l.d(list, "");
            l.d(map, "");
            l.d(list2, "");
            l.d(bVar, "");
            l.d(set, "");
            l.d(set2, "");
            l.d(list3, "");
            l.d(bVar2, "");
            l.d(list4, "");
            l.d(list5, "");
            l.d(list6, "");
            this.f114123a = list;
            this.f114124b = map;
            this.f114125c = list2;
            this.f114126d = logPbBean;
            this.f114127e = j2;
            this.f114128f = z;
            this.f114129g = i2;
            this.f114130h = bVar;
            this.f114131i = z2;
            this.f114132j = z3;
            this.f114133k = set;
            this.f114134l = set2;
            this.f114135m = list3;
            this.n = bVar2;
            this.o = list4;
            this.p = list5;
            this.q = list6;
        }
    }

    private static boolean a(MusNotice musNotice) {
        String str;
        if (musNotice.createTime <= 0 || (str = musNotice.nid) == null || str.length() == 0 || l.a((Object) "0", (Object) musNotice.nid)) {
            return true;
        }
        return false;
    }

    private static void c(a aVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = aVar.p.size();
        int i2 = -1;
        for (int i3 = 0; i3 < size; i3++) {
            MusNotice musNotice = aVar.p.get(i3);
            if (musNotice.timeLineType > i2) {
                linkedHashMap.put(Integer.valueOf(linkedHashMap.size() + i3), Integer.valueOf(musNotice.timeLineType));
                i2 = musNotice.timeLineType;
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            aVar.p.add(((Number) entry.getKey()).intValue(), new i(((Number) entry.getValue()).intValue()));
        }
    }

    public static void a(a aVar) {
        String str;
        l.d(aVar, "");
        for (T t : aVar.f114125c) {
            if (a((MusNotice) t)) {
                StringBuilder append = new StringBuilder("insertNewData but notice invalid:").append(((MusNotice) t).nid).append(", ").append(((MusNotice) t).type).append(", ");
                LogPbBean logPbBean = aVar.f114126d;
                if (logPbBean != null) {
                    str = logPbBean.getImprId();
                } else {
                    str = null;
                }
                f.c("MiddleDataSource", append.append(str).toString());
            }
            if (!aVar.c(t)) {
                aVar.b(t);
            }
        }
        b(aVar);
        n.a((List) aVar.o, (Comparator) f114122b);
        aVar.p.addAll(aVar.o);
        c(aVar);
        d(aVar);
        a(aVar.f114123a, aVar.p);
        if (!aVar.q.isEmpty()) {
            a(aVar.f114123a, aVar.q);
        }
    }

    private static void b(a aVar) {
        MusNotice musNotice;
        b bVar = aVar.n;
        b bVar2 = new b(bVar.f114136a, bVar.f114137b);
        if (bVar2.f114136a == 0 || aVar.f114128f) {
            bVar2.f114136a = Long.MAX_VALUE;
        }
        if (!aVar.f114131i) {
            bVar2.f114137b = 0;
        }
        for (NoticeItems noticeItems : aVar.f114124b.values()) {
            List<MusNotice> items = noticeItems.getItems();
            if (!(items == null || (musNotice = (MusNotice) n.h((List) items)) == null)) {
                if (a(musNotice)) {
                    f.c("MiddleDataSource", "insertExtra but notice invalid:" + noticeItems.getGroup() + ", " + musNotice.nid + ", " + musNotice.type);
                    String str = musNotice.nid;
                    if (str == null || str.length() == 0) {
                        musNotice.nid = String.valueOf(musNotice.hashCode());
                    }
                }
                long j2 = musNotice.createTime;
                long j3 = bVar2.f114137b;
                long j4 = bVar2.f114136a;
                if (((j3 <= j2 && j4 >= j2) || (noticeItems.getListType() == 2 && !musNotice.hasRead)) && !aVar.c(musNotice)) {
                    musNotice.noticeListType = noticeItems.getListType();
                    e eVar = musNotice.templateNotice;
                    if (eVar != null) {
                        eVar.f112855m = noticeItems.getGroup();
                    }
                    aVar.b(musNotice);
                }
            }
        }
    }

    private static void d(a aVar) {
        if (aVar.f114132j) {
            int size = aVar.p.size();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                MusNotice musNotice = aVar.p.get(i5);
                if (musNotice.type == 999) {
                    i4++;
                } else if (i3 <= 0) {
                    long j2 = musNotice.createTime * 1000;
                    int b2 = com.ss.android.ugc.aweme.notification.ab.c.b();
                    if (b2 > 0) {
                        Calendar instance = Calendar.getInstance();
                        l.b(instance, "");
                        if (instance.getTimeInMillis() - j2 >= ((long) b2) * 86400000) {
                            i2 = i5 - i4;
                            i3 = i5;
                        }
                    }
                }
            }
            if (aVar.f114129g - i2 > com.ss.android.ugc.aweme.notification.ab.c.c()) {
                if (i2 < 10) {
                    i3 += 10 - i2;
                }
                if (i3 >= aVar.p.size()) {
                    f.c("MiddleDataSource", "collapseData but meet unexpected state");
                    return;
                }
                aVar.q.addAll(aVar.p.subList(0, i3));
                aVar.q.add(new q(2002, null, null, 0, 14));
            }
        }
    }

    static final class c<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public static final c f114138a = new c();

        static {
            Covode.recordClassIndex(73381);
        }

        c() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x0022 A[RETURN] */
        @Override // java.util.Comparator
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* bridge */ /* synthetic */ int compare(java.lang.Object r8, java.lang.Object r9) {
            /*
                r7 = this;
                com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r8 = (com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r8
                com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r9 = (com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r9
                int r2 = r9.priority
                int r0 = r8.priority
                int r2 = r2 - r0
                int r1 = r8.priority
                int r0 = r9.priority
                r6 = -1
                r5 = 1
                if (r1 != r0) goto L_0x001d
                long r3 = r9.createTime
                long r0 = r8.createTime
                long r3 = r3 - r0
                r1 = 0
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x0022
            L_0x001c:
                return r5
            L_0x001d:
                if (r2 <= 0) goto L_0x0020
                goto L_0x001c
            L_0x0020:
                if (r2 >= 0) goto L_0x0023
            L_0x0022:
                return r6
            L_0x0023:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.vm.a.d.c.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    public static void a(List<? extends MusNotice> list, List<MusNotice> list2) {
        l.d(list, "");
        l.d(list2, "");
        if (!list.isEmpty()) {
            ListIterator<MusNotice> listIterator = list2.listIterator();
            while (listIterator.hasNext()) {
                MusNotice next = listIterator.next();
                if (next.type == 1001 || (next.type == 999 && next.timeLineType == 0)) {
                    listIterator.remove();
                }
            }
            list2.addAll(0, list);
            list2.add(0, new i(0));
        }
    }
}

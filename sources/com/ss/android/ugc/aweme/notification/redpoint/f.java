package com.ss.android.ugc.aweme.notification.redpoint;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeCount;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.api.bean.j;
import com.ss.android.ugc.aweme.notice.api.bean.k;
import com.ss.android.ugc.aweme.notice.api.bean.o;
import com.ss.android.ugc.aweme.utils.dg;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    static Map<Integer, j> f113801a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    static List<k> f113802b = z.INSTANCE;

    /* renamed from: c  reason: collision with root package name */
    static final Keva f113803c = Keva.getRepo("keva_notice_count");

    /* renamed from: d  reason: collision with root package name */
    public static final f f113804d = new f();

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final c f113807a = new c();

        static {
            Covode.recordClassIndex(73187);
        }

        c() {
        }

        public static final class a extends com.google.gson.b.a<Map<Integer, ? extends j>> {
            static {
                Covode.recordClassIndex(73188);
            }

            a() {
            }
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                f.f113803c.storeString("keva_name_notice_attr", dg.a().b(f.f113801a, new a().type));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return h.z.f158842a;
        }
    }

    static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f113808a;

        static {
            Covode.recordClassIndex(73189);
        }

        d(List list) {
            this.f113808a = list;
        }

        public static final class a extends com.google.gson.b.a<List<? extends k>> {
            static {
                Covode.recordClassIndex(73190);
            }

            a() {
            }
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                f.f113803c.storeString("keva_name_group_filter", dg.a().b(this.f113808a, new a().type));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return h.z.f158842a;
        }
    }

    private f() {
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f113806a;

        static {
            Covode.recordClassIndex(73186);
        }

        b(boolean z) {
            this.f113806a = z;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.ss.android.ugc.aweme.framework.a.a.a("NoticeCountHelper " + this.f113806a + " log, noticeGroupAttrsHashMap: " + f.f113801a.size() + ", noticeFilterGroups: " + f.f113802b.size());
            return null;
        }
    }

    static {
        Covode.recordClassIndex(73182);
        i.b(a.f113805a, i.f4824a);
    }

    public static List<Integer> a() {
        Map<Integer, j> map = f113801a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, j> entry : map.entrySet()) {
            if (entry.getValue().f112692b == o.ShowDot) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return n.k(linkedHashMap.keySet());
    }

    public static List<Integer> b() {
        Map<Integer, j> map = f113801a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, j> entry : map.entrySet()) {
            if (entry.getValue().f112692b == o.ShowNum) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return n.k(linkedHashMap.keySet());
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f113805a = new a();

        static {
            Covode.recordClassIndex(73183);
        }

        a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String string = f.f113803c.getString("keva_name_notice_attr", "");
            String string2 = f.f113803c.getString("keva_name_group_filter", "");
            try {
                if (f.f113801a.isEmpty()) {
                    Object a2 = dg.a().a(string, new com.google.gson.b.a<Map<Integer, ? extends j>>() {
                        /* class com.ss.android.ugc.aweme.notification.redpoint.f.a.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(73184);
                        }
                    }.type);
                    l.b(a2, "");
                    f.f113801a = (Map) a2;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            try {
                if (f.f113802b.isEmpty()) {
                    Object a3 = dg.a().a(string2, new com.google.gson.b.a<List<? extends k>>() {
                        /* class com.ss.android.ugc.aweme.notification.redpoint.f.a.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(73185);
                        }
                    }.type);
                    l.b(a3, "");
                    f.f113802b = (List) a3;
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            f.a(true);
            return h.z.f158842a;
        }
    }

    public static void a(boolean z) {
        i.b(new b(z), i.f4824a);
    }

    public static j e(int i2) {
        return f113801a.get(Integer.valueOf(i2));
    }

    public static boolean a(int i2) {
        o oVar;
        j jVar = f113801a.get(Integer.valueOf(i2));
        if (jVar != null) {
            oVar = jVar.f112692b;
        } else {
            oVar = null;
        }
        if (oVar == o.ShowDot) {
            return true;
        }
        return false;
    }

    public static boolean b(int i2) {
        o oVar;
        j jVar = f113801a.get(Integer.valueOf(i2));
        if (jVar != null) {
            oVar = jVar.f112692b;
        } else {
            oVar = null;
        }
        if (oVar == o.ShowNum) {
            return true;
        }
        return false;
    }

    public static List<Integer> c(int i2) {
        List<Integer> a2 = a(i2, null);
        if (a2 == null || a2.isEmpty()) {
            return z.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : a2) {
            j jVar = f113801a.get(Integer.valueOf(t.intValue()));
            if ((jVar != null ? jVar.f112692b : null) == o.ShowNum) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static List<Integer> d(int i2) {
        List<Integer> a2 = a(i2, null);
        if (a2 == null || a2.isEmpty()) {
            return z.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : a2) {
            j jVar = f113801a.get(Integer.valueOf(t.intValue()));
            if ((jVar != null ? jVar.f112692b : null) == o.ShowDot) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static void a(NoticeList noticeList) {
        int ordinal;
        int ordinal2;
        l.d(noticeList, "");
        List<NoticeCount> items = noticeList.getItems();
        if (items != null) {
            for (T t : items) {
                com.ss.android.ugc.aweme.notice.api.bean.c[] values = com.ss.android.ugc.aweme.notice.api.bean.c.values();
                Integer clearOccasion = t.getClearOccasion();
                if (clearOccasion != null) {
                    ordinal = clearOccasion.intValue();
                } else {
                    ordinal = com.ss.android.ugc.aweme.notice.api.bean.c.Normal.ordinal();
                }
                com.ss.android.ugc.aweme.notice.api.bean.c cVar = values[ordinal];
                o[] values2 = o.values();
                Integer showType = t.getShowType();
                if (showType != null) {
                    ordinal2 = showType.intValue();
                } else {
                    ordinal2 = o.ShowDefault.ordinal();
                }
                f113801a.put(Integer.valueOf(t.getGroup()), new j(cVar, values2[ordinal2]));
            }
            i.b(c.f113807a, i.f4824a);
        }
        a(false);
    }

    public static void a(List<k> list) {
        int i2;
        l.d(list, "");
        for (T t : list) {
            int i3 = t.f112694b;
            if (i3 == com.ss.android.ugc.aweme.notice.api.bean.l.FilterTimelineAll.ordinal()) {
                i2 = 36;
            } else if (i3 == com.ss.android.ugc.aweme.notice.api.bean.l.FilterLike.ordinal()) {
                i2 = 3;
            } else if (i3 == com.ss.android.ugc.aweme.notice.api.bean.l.FilterComment.ordinal()) {
                i2 = 44;
            } else if (i3 == com.ss.android.ugc.aweme.notice.api.bean.l.FilterMention.ordinal()) {
                i2 = 26;
            } else if (i3 == com.ss.android.ugc.aweme.notice.api.bean.l.FilterFollow.ordinal()) {
                i2 = 7;
            } else if (i3 == com.ss.android.ugc.aweme.notice.api.bean.l.FilterFromTiktok.ordinal()) {
                i2 = 37;
            } else if (i3 == com.ss.android.ugc.aweme.notice.api.bean.l.FilterTypeQA.ordinal()) {
                i2 = 84;
            } else if (i3 == com.ss.android.ugc.aweme.notice.api.bean.l.FilterTypeShop.ordinal()) {
                i2 = 599;
            } else if (i3 == com.ss.android.ugc.aweme.notice.api.bean.l.FilterTypeAllExceptFollow.ordinal()) {
                i2 = 600;
            } else if (i3 == com.ss.android.ugc.aweme.notice.api.bean.l.FilterTypeFollowAndFollowRequest.ordinal()) {
                i2 = 534;
            } else {
                i2 = 0;
            }
            t.f112695c = i2;
        }
        f113802b = list;
        i.b(new d(list), i.f4824a);
    }

    public static List<Integer> a(int i2, com.ss.android.ugc.aweme.notice.api.bean.c cVar) {
        T t;
        List<Integer> list;
        Iterator<T> it = f113802b.iterator();
        do {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            t = it.next();
        } while (t.f112695c != i2);
        T t2 = t;
        if (!(t2 == null || (list = t2.f112693a) == null)) {
            if (cVar == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            for (T t3 : list) {
                j jVar = f113801a.get(Integer.valueOf(t3.intValue()));
                if (jVar != null && jVar.f112691a == cVar) {
                    arrayList.add(t3);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2 != null) {
                return arrayList2;
            }
        }
        return z.INSTANCE;
    }
}

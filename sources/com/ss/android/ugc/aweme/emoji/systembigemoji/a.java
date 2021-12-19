package com.ss.android.ugc.aweme.emoji.systembigemoji;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.systembigemoji.g;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.m.p;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.ci;
import kotlinx.coroutines.i;
import kotlinx.coroutines.internal.o;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static LinkedHashMap<com.ss.android.ugc.aweme.emoji.emojichoose.model.b, List<com.ss.android.ugc.aweme.emoji.g.a>> f89422a;

    /* renamed from: b  reason: collision with root package name */
    public static final List<d> f89423b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public static final a f89424c;

    /* renamed from: d  reason: collision with root package name */
    private static Map<String, String> f89425d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private static Map<String, String> f89426e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    private static final am f89427f = an.a(bf.f159040a);

    private a() {
    }

    public static boolean b() {
        LinkedHashMap<com.ss.android.ugc.aweme.emoji.emojichoose.model.b, List<com.ss.android.ugc.aweme.emoji.g.a>> linkedHashMap = f89422a;
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(56185);
        a aVar = new a();
        f89424c = aVar;
        l.d(aVar, "");
        if (!b.f89428a.contains(aVar)) {
            b.f89428a.add(aVar);
        }
    }

    public static void a() {
        int i2;
        Collection<List<com.ss.android.ugc.aweme.emoji.g.a>> values;
        Collection<List<com.ss.android.ugc.aweme.emoji.g.a>> values2;
        f89425d.clear();
        f89426e.clear();
        LinkedHashMap<com.ss.android.ugc.aweme.emoji.emojichoose.model.b, List<com.ss.android.ugc.aweme.emoji.g.a>> linkedHashMap = f89422a;
        if (linkedHashMap == null || (values2 = linkedHashMap.values()) == null) {
            i2 = 0;
        } else {
            Iterator<T> it = values2.iterator();
            i2 = 0;
            while (it.hasNext()) {
                i2 += it.next().size();
            }
        }
        int i3 = Build.VERSION.SDK_INT;
        f89425d = new ConcurrentHashMap(i2);
        f89426e = new ConcurrentHashMap(i2);
        LinkedHashMap<com.ss.android.ugc.aweme.emoji.emojichoose.model.b, List<com.ss.android.ugc.aweme.emoji.g.a>> linkedHashMap2 = f89422a;
        if (!(linkedHashMap2 == null || (values = linkedHashMap2.values()) == null)) {
            int i4 = 0;
            for (T<com.ss.android.ugc.aweme.emoji.g.a> t : values) {
                l.b(t, "");
                for (com.ss.android.ugc.aweme.emoji.g.a aVar : t) {
                    String a2 = com.ss.android.ugc.aweme.emoji.d.a.a.a(aVar);
                    if (a2 == null) {
                        a2 = aVar.getDisplayName();
                    }
                    if (a2 == null || a2.length() == 0) {
                        a2 = aVar.getDisplayName();
                    }
                    String str = f89425d.get(a2);
                    if (TextUtils.isEmpty(str)) {
                        Map<String, String> map = f89425d;
                        l.b(a2, "");
                        map.put(a2, String.valueOf(i4));
                    } else {
                        Map<String, String> map2 = f89425d;
                        l.b(a2, "");
                        map2.put(a2, str + "," + i4);
                    }
                    String displayName = aVar.getDisplayName();
                    String str2 = f89426e.get(displayName);
                    if (TextUtils.isEmpty(str2)) {
                        Map<String, String> map3 = f89426e;
                        l.b(displayName, "");
                        map3.put(displayName, String.valueOf(i4));
                    } else {
                        Map<String, String> map4 = f89426e;
                        l.b(displayName, "");
                        map4.put(displayName, str2 + "," + i4);
                    }
                    i4++;
                }
            }
        }
    }

    public static void a(d dVar) {
        l.d(dVar, "");
        f89423b.remove(dVar);
    }

    public static List<com.ss.android.ugc.aweme.emoji.g.a> a(String str) {
        if (f89425d.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        List<com.ss.android.ugc.aweme.emoji.g.a> a2 = a(f89426e, str);
        if (a2 == null) {
            return a(f89425d, str);
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.emoji.systembigemoji.a$a  reason: collision with other inner class name */
    public static final class C2163a extends k implements m<am, d<? super z>, Object> {
        final /* synthetic */ List $list;
        final /* synthetic */ com.ss.android.ugc.aweme.emoji.emojichoose.model.b $resource;
        int label;

        static {
            Covode.recordClassIndex(56186);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2163a(com.ss.android.ugc.aweme.emoji.emojichoose.model.b bVar, List list, d dVar) {
            super(2, dVar);
            this.$resource = bVar;
            this.$list = list;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new C2163a(this.$resource, this.$list, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((C2163a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                a.a();
                ci ciVar = o.f159148a;
                AnonymousClass1 r1 = new m<am, d<? super z>, Object>(this, null) {
                    /* class com.ss.android.ugc.aweme.emoji.systembigemoji.a.C2163a.AnonymousClass1 */
                    int label;
                    final /* synthetic */ C2163a this$0;

                    static {
                        Covode.recordClassIndex(56187);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.c.b.a.a
                    public final d<z> create(Object obj, d<?> dVar) {
                        l.d(dVar, "");
                        return 

                        static final class b extends k implements m<am, d<? super z>, Object> {
                            int label;

                            static {
                                Covode.recordClassIndex(56188);
                            }

                            b(d dVar) {
                                super(2, dVar);
                            }

                            @Override // h.c.b.a.a
                            public final d<z> create(Object obj, d<?> dVar) {
                                l.d(dVar, "");
                                return new b(dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // h.f.a.m
                            public final Object invoke(am amVar, d<? super z> dVar) {
                                return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
                            }

                            @Override // h.c.b.a.a
                            public final Object invokeSuspend(Object obj) {
                                h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                                int i2 = this.label;
                                if (i2 == 0) {
                                    r.a(obj);
                                    a.a();
                                    ci ciVar = o.f159148a;
                                    AnonymousClass1 r1 = new m<am, d<? super z>, Object>(null) {
                                        /* class com.ss.android.ugc.aweme.emoji.systembigemoji.a.b.AnonymousClass1 */
                                        int label;

                                        static {
                                            Covode.recordClassIndex(56189);
                                        }

                                        @Override // h.c.b.a.a
                                        public final d<z> create(Object obj, d<?> dVar) {
                                            l.d(dVar, "");
                                            return 

                                            private static com.ss.android.ugc.aweme.emoji.g.a a(int i2) {
                                                Collection<List<com.ss.android.ugc.aweme.emoji.g.a>> values;
                                                LinkedHashMap<com.ss.android.ugc.aweme.emoji.emojichoose.model.b, List<com.ss.android.ugc.aweme.emoji.g.a>> linkedHashMap = f89422a;
                                                if (!(linkedHashMap == null || (values = linkedHashMap.values()) == null)) {
                                                    int i3 = 0;
                                                    for (List<com.ss.android.ugc.aweme.emoji.g.a> list : values) {
                                                        if (list.size() + i3 > i2) {
                                                            return list.get(i2 - i3);
                                                        }
                                                        i3 += list.size();
                                                    }
                                                }
                                                return null;
                                            }

                                            public static void a(boolean z) {
                                                b bVar = b.f89429b;
                                                l.d("STICKER", "");
                                                bz unused = i.a(bVar.f89436c, null, null, new g.d(bVar, "STICKER", z, null), 3);
                                            }

                                            public static boolean a(com.ss.android.ugc.aweme.emoji.emojichoose.model.b bVar) {
                                                l.d(bVar, "");
                                                return b.f89429b.b(bVar);
                                            }

                                            @Override // com.ss.android.ugc.aweme.emoji.systembigemoji.d
                                            public final void a(LinkedHashMap<com.ss.android.ugc.aweme.emoji.emojichoose.model.b, List<com.ss.android.ugc.aweme.emoji.g.a>> linkedHashMap) {
                                                if (linkedHashMap != null) {
                                                    f89422a = linkedHashMap;
                                                }
                                                bz unused = i.a(f89427f, null, null, new b(null), 3);
                                            }

                                            private static List<com.ss.android.ugc.aweme.emoji.g.a> a(Map<String, String> map, String str) {
                                                String str2 = map.get(str);
                                                if (str2 == null || TextUtils.isEmpty(str2)) {
                                                    return null;
                                                }
                                                Object[] array = p.b(str2, new String[]{","}).toArray(new String[0]);
                                                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                                                ArrayList arrayList = new ArrayList();
                                                for (String str3 : (String[]) array) {
                                                    com.ss.android.ugc.aweme.emoji.g.a a2 = a(Integer.parseInt(str3));
                                                    if (a2 != null) {
                                                        arrayList.add(a2);
                                                    }
                                                }
                                                return arrayList;
                                            }

                                            @Override // com.ss.android.ugc.aweme.emoji.systembigemoji.d
                                            public final void a(com.ss.android.ugc.aweme.emoji.emojichoose.model.b bVar, List<? extends com.ss.android.ugc.aweme.emoji.g.a> list) {
                                                l.d(bVar, "");
                                                if (list == null || !(!list.isEmpty())) {
                                                    for (d dVar : f89423b) {
                                                        dVar.a(bVar, list);
                                                    }
                                                    return;
                                                }
                                                LinkedHashMap<com.ss.android.ugc.aweme.emoji.emojichoose.model.b, List<com.ss.android.ugc.aweme.emoji.g.a>> linkedHashMap = f89422a;
                                                if (linkedHashMap == null) {
                                                    l.b();
                                                }
                                                linkedHashMap.put(bVar, list);
                                                bz unused = i.a(f89427f, null, null, new C2163a(bVar, list, null), 3);
                                            }
                                        }

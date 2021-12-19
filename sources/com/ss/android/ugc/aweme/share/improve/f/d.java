package com.ss.android.ugc.aweme.share.improve.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.share.ag;
import com.ss.android.ugc.trill.share.data.ShareDatabase;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class d implements Comparator<com.ss.android.ugc.aweme.sharer.b> {

    /* renamed from: d  reason: collision with root package name */
    public static final Keva f123918d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f123919e = true;

    /* renamed from: f  reason: collision with root package name */
    public static final a f123920f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final h f123921a = i.a((h.f.a.a) c.f123926a);

    /* renamed from: b  reason: collision with root package name */
    public int f123922b = -1;

    /* renamed from: c  reason: collision with root package name */
    public final int f123923c = 0;

    /* renamed from: g  reason: collision with root package name */
    private final h f123924g = i.a((h.f.a.a) new C3221d(this));

    /* renamed from: h  reason: collision with root package name */
    private final h f123925h = i.a((h.f.a.a) new b(this));

    private final Map<String, Integer> b() {
        return (Map) this.f123925h.getValue();
    }

    public final List<ag> a() {
        return (List) this.f123924g.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81361);
        }

        private a() {
        }

        public static void a() {
            boolean z = d.f123918d.getBoolean("isFirstLocatedFront", true);
            d.f123919e = z;
            if (z && com.ss.android.ugc.aweme.share.f.b.e()) {
                d.f123918d.storeBoolean("isFirstLocatedFront", false);
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<ShareDatabase> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f123926a = new c();

        static {
            Covode.recordClassIndex(81363);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ShareDatabase invoke() {
            return ShareDatabase.a(com.bytedance.ies.ugc.appcontext.d.a());
        }
    }

    static {
        Covode.recordClassIndex(81360);
        Keva repo = Keva.getRepo("locate_whatsapp_front");
        l.b(repo, "");
        f123918d = repo;
    }

    static final class b extends m implements h.f.a.a<Map<String, ? extends Integer>> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(81362);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Map<String, Integer> invoke() {
            int i2;
            try {
                HashMap hashMap = new HashMap();
                for (ag agVar : this.this$0.a()) {
                    String str = agVar.f123339a;
                    l.b(str, "");
                    hashMap.put(str, 0);
                }
                ShareDatabase shareDatabase = (ShareDatabase) this.this$0.f123921a.getValue();
                if (shareDatabase == null) {
                    l.b();
                }
                List<com.ss.android.ugc.trill.share.data.a> a2 = shareDatabase.i().a(Integer.valueOf(this.this$0.f123923c));
                if (a2.size() >= 10) {
                    this.this$0.f123922b = a2.get(a2.size() - 1).f150666a;
                }
                for (com.ss.android.ugc.trill.share.data.a aVar : a2) {
                    l.b(aVar, "");
                    Integer num = (Integer) hashMap.get(aVar.f150668c);
                    String str2 = aVar.f150668c;
                    l.b(str2, "");
                    if (num == null) {
                        i2 = 1;
                    } else {
                        i2 = num.intValue() + 1;
                    }
                    hashMap.put(str2, Integer.valueOf(i2));
                }
                return hashMap;
            } catch (Exception unused) {
                return h.a.ag.a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.f.d$d  reason: collision with other inner class name */
    static final class C3221d extends m implements h.f.a.a<List<ag>> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(81364);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3221d(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.util.List<com.ss.android.ugc.aweme.share.ag> invoke() {
            /*
            // Method dump skipped, instructions count: 165
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.f.d.C3221d.invoke():java.lang.Object");
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.f.d$d$a */
        public static final class a<T> implements Comparator {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3221d f123927a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f123928b;

            static {
                Covode.recordClassIndex(81365);
            }

            public a(C3221d dVar, List list) {
                this.f123927a = dVar;
                this.f123928b = list;
            }

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                String str = t.f123339a;
                l.b(str, "");
                Integer valueOf = Integer.valueOf(d.a(str, this.f123928b));
                String str2 = t2.f123339a;
                l.b(str2, "");
                return h.b.a.a(valueOf, Integer.valueOf(d.a(str2, this.f123928b)));
            }
        }
    }

    private final int a(com.ss.android.ugc.aweme.sharer.b bVar) {
        for (ag agVar : a()) {
            if (l.a((Object) agVar.f123339a, (Object) bVar.a())) {
                return a().indexOf(agVar);
            }
        }
        return Integer.MAX_VALUE;
    }

    public static int a(String str, List<String> list) {
        for (String str2 : list) {
            if (l.a((Object) str2, (Object) str)) {
                return list.indexOf(str2);
            }
        }
        return Integer.MAX_VALUE;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(com.ss.android.ugc.aweme.sharer.b bVar, com.ss.android.ugc.aweme.sharer.b bVar2) {
        boolean z;
        int i2;
        com.ss.android.ugc.aweme.sharer.b bVar3 = bVar;
        com.ss.android.ugc.aweme.sharer.b bVar4 = bVar2;
        l.d(bVar3, "");
        l.d(bVar4, "");
        int i3 = 0;
        if (!com.ss.android.ugc.aweme.share.f.b.e()) {
            z = false;
        } else {
            z = f123919e;
        }
        if (z) {
            if (l.a((Object) bVar3.a(), (Object) "whatsapp")) {
                return -1;
            }
            if (l.a((Object) bVar4.a(), (Object) "whatsapp")) {
                return 1;
            }
            if (l.a((Object) bVar3.a(), (Object) "whatsapp_status")) {
                return -1;
            }
            if (l.a((Object) bVar4.a(), (Object) "whatsapp_status")) {
                return 1;
            }
        }
        if (bVar3.a().equals("more")) {
            return 1;
        }
        if (bVar4.a().equals("more") || (bVar3 instanceof com.ss.android.ugc.aweme.share.improve.b.c) || (bVar3 instanceof com.ss.android.ugc.aweme.share.qrcode.a.a)) {
            return -1;
        }
        if ((bVar4 instanceof com.ss.android.ugc.aweme.share.improve.b.c) || (bVar4 instanceof com.ss.android.ugc.aweme.share.qrcode.a.a)) {
            return 1;
        }
        Integer num = b().get(bVar3.a());
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        Integer num2 = b().get(bVar4.a());
        if (num2 != null) {
            i3 = num2.intValue();
        }
        int i4 = i2 - i3;
        if (i4 != 0) {
            return -i4;
        }
        return a(bVar3) - a(bVar4);
    }
}

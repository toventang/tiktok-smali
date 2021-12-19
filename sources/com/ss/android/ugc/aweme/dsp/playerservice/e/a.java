package com.ss.android.ugc.aweme.dsp.playerservice.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.common.api.MusicDspApi;
import com.ss.android.ugc.aweme.dsp.common.model.DspStruct;
import com.ss.android.ugc.aweme.dsp.library.net.DSPCollectMusicResponse;
import com.ss.android.ugc.aweme.dsp.playerservice.b.c;
import com.ss.android.ugc.aweme.dsp.playerservice.b.i;
import com.ss.android.ugc.aweme.dsp.playerservice.c.e;
import com.ss.android.ugc.aweme.music.model.Dsp;
import f.a.t;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class a extends b {

    /* renamed from: b  reason: collision with root package name */
    public static final b f83517b = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.dsp.playerservice.e.a.a f83518a = new C1975a();

    /* renamed from: f  reason: collision with root package name */
    private i f83519f;

    /* renamed from: g  reason: collision with root package name */
    private e f83520g = e.f83416d;

    /* renamed from: h  reason: collision with root package name */
    private final String f83521h;

    static {
        Covode.recordClassIndex(52124);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(52134);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.b.d
    public final i a() {
        return this.f83519f;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.e.b
    public final com.ss.android.ugc.aweme.dsp.playerservice.e.a.a e() {
        return this.f83518a;
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.e.a$a  reason: collision with other inner class name */
    public final class C1975a extends com.ss.android.ugc.aweme.dsp.playerservice.e.a.a {
        static {
            Covode.recordClassIndex(52125);
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.e.a.a
        public final boolean a() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.e.a.a
        public final t<List<com.ss.android.ugc.aweme.dsp.playerservice.b.c>> b() {
            t<List<com.ss.android.ugc.aweme.dsp.playerservice.b.c>> b2 = t.b((Object) a.this.f83535c);
            l.b(b2, "");
            return b2;
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.e.a.a
        public final t<List<com.ss.android.ugc.aweme.dsp.playerservice.b.c>> c() {
            long j2;
            Long g2 = p.g(this.f83523c.f83534a);
            if (g2 != null) {
                j2 = g2.longValue();
            } else {
                j2 = 0;
            }
            t<R> d2 = MusicDspApi.a.a(j2, z.INSTANCE, z.INSTANCE).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new C1976a(this));
            l.b(d2, "");
            return d2;
        }

        /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.e.a$a$c */
        public static final class c<T, R> implements f.a.d.g {

            /* renamed from: a  reason: collision with root package name */
            public static final c f83528a = new c();

            static {
                Covode.recordClassIndex(52128);
            }

            c() {
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                l.d(obj, "");
                return z.INSTANCE;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.e.a$a$e */
        public static final class e<T, R> implements f.a.d.g {

            /* renamed from: a  reason: collision with root package name */
            public static final e f83530a = new e();

            static {
                Covode.recordClassIndex(52130);
            }

            e() {
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                l.d(obj, "");
                return z.INSTANCE;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.e.a$a$g */
        public static final class g<T, R> implements f.a.d.g {

            /* renamed from: a  reason: collision with root package name */
            public static final g f83533a = new g();

            static {
                Covode.recordClassIndex(52133);
            }

            g() {
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                l.d(obj, "");
                return z.INSTANCE;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C1975a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.e.a$a$a  reason: collision with other inner class name */
        static final class C1976a<T, R> implements f.a.d.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1975a f83525a;

            static {
                Covode.recordClassIndex(52126);
            }

            C1976a(C1975a aVar) {
                this.f83525a = aVar;
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                boolean z;
                DSPCollectMusicResponse dSPCollectMusicResponse = (DSPCollectMusicResponse) obj;
                l.d(dSPCollectMusicResponse, "");
                if (dSPCollectMusicResponse.status_code != 0) {
                    return z.INSTANCE;
                }
                com.ss.android.ugc.aweme.dsp.playerservice.e.a.b bVar = this.f83525a.f83523c;
                String valueOf = String.valueOf(dSPCollectMusicResponse.getCursor());
                l.d(valueOf, "");
                bVar.f83534a = valueOf;
                a aVar = a.this;
                if (dSPCollectMusicResponse.getHasMore() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.f83536d = z;
                a.this.f83537e = dSPCollectMusicResponse.getCount();
                CopyOnWriteArrayList<com.ss.android.ugc.aweme.dsp.playerservice.b.c> copyOnWriteArrayList = a.this.f83535c;
                ArrayList arrayList = new ArrayList(n.a((Iterable) copyOnWriteArrayList, 10));
                Iterator<T> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().a());
                }
                ArrayList arrayList2 = arrayList;
                List<com.ss.android.ugc.aweme.dsp.playerservice.b.c> a2 = a.this.a(dSPCollectMusicResponse);
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                for (T t : a2) {
                    if (hashSet.add(t.a())) {
                        arrayList3.add(t);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (T t2 : arrayList3) {
                    if (!arrayList2.contains(t2.a())) {
                        arrayList4.add(t2);
                    }
                }
                ArrayList arrayList5 = arrayList4;
                a.this.f83535c.addAll(arrayList5);
                return arrayList5;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.e.a$a$d */
        public static final class d<T, R> implements f.a.d.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1975a f83529a;

            static {
                Covode.recordClassIndex(52129);
            }

            public d(C1975a aVar) {
                this.f83529a = aVar;
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                DSPCollectMusicResponse dSPCollectMusicResponse = (DSPCollectMusicResponse) obj;
                l.d(dSPCollectMusicResponse, "");
                if (dSPCollectMusicResponse.status_code != 0) {
                    return z.INSTANCE;
                }
                CopyOnWriteArrayList<com.ss.android.ugc.aweme.dsp.playerservice.b.c> copyOnWriteArrayList = a.this.f83535c;
                ArrayList arrayList = new ArrayList(n.a((Iterable) copyOnWriteArrayList, 10));
                Iterator<T> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().a());
                }
                ArrayList arrayList2 = arrayList;
                List<com.ss.android.ugc.aweme.dsp.playerservice.b.c> a2 = a.this.a(dSPCollectMusicResponse);
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                for (T t : a2) {
                    if (hashSet.add(t.a())) {
                        arrayList3.add(t);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (T t2 : arrayList3) {
                    if (!arrayList2.contains(t2.a())) {
                        arrayList4.add(t2);
                    }
                }
                ArrayList arrayList5 = arrayList4;
                a.this.f83537e += arrayList5.size();
                a.this.f83535c.addAll(0, arrayList5);
                return arrayList5;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.e.a$a$f */
        public static final class f<T, R> implements f.a.d.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1975a f83531a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f83532b;

            static {
                Covode.recordClassIndex(52131);
            }

            public f(C1975a aVar, List list) {
                this.f83531a = aVar;
                this.f83532b = list;
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                Integer collectStatus;
                DSPCollectMusicResponse dSPCollectMusicResponse = (DSPCollectMusicResponse) obj;
                l.d(dSPCollectMusicResponse, "");
                List<DspStruct> dspList = dSPCollectMusicResponse.getDspList();
                ArrayList arrayList = new ArrayList();
                for (T t : dspList) {
                    Dsp dsp = t.getAweme().getDsp();
                    if (dsp == null || (collectStatus = dsp.getCollectStatus()) == null || collectStatus.intValue() != 0) {
                        arrayList.add(t);
                    }
                }
                ArrayList<T> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList2, 10));
                for (T t2 : arrayList2) {
                    a aVar = a.this;
                    String str = dSPCollectMusicResponse.extra.logid;
                    l.b(str, "");
                    arrayList3.add(aVar.a(t2, str));
                }
                ArrayList<T> arrayList4 = arrayList3;
                ArrayList arrayList5 = new ArrayList(n.a((Iterable) arrayList4, 10));
                for (T t3 : arrayList4) {
                    arrayList5.add(t3.f83719a);
                }
                ArrayList arrayList6 = arrayList5;
                List list = this.f83532b;
                ArrayList arrayList7 = new ArrayList();
                for (T t4 : list) {
                    if (!arrayList6.contains(t4)) {
                        arrayList7.add(t4);
                    }
                }
                final ArrayList arrayList8 = arrayList7;
                n.a((List) a.this.f83535c, (h.f.a.b) new h.f.a.b<com.ss.android.ugc.aweme.dsp.playerservice.b.c, Boolean>() {
                    /* class com.ss.android.ugc.aweme.dsp.playerservice.e.a.C1975a.f.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(52132);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
                        com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar2 = cVar;
                        boolean z = false;
                        if (arrayList8.contains(cVar2.a())) {
                            cVar2.a(0);
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                });
                a.this.f83537e -= arrayList8.size();
                return arrayList8;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.e.a$a$b */
        public static final class b<T, R> implements f.a.d.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1975a f83527a;

            static {
                Covode.recordClassIndex(52127);
            }

            public b(C1975a aVar) {
                this.f83527a = aVar;
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                Integer collectStatus;
                DSPCollectMusicResponse dSPCollectMusicResponse = (DSPCollectMusicResponse) obj;
                l.d(dSPCollectMusicResponse, "");
                if (dSPCollectMusicResponse.status_code != 0) {
                    return z.INSTANCE;
                }
                List<DspStruct> dspList = dSPCollectMusicResponse.getDspList();
                ArrayList<T> arrayList = new ArrayList();
                for (T t : dspList) {
                    Dsp dsp = t.getAweme().getDsp();
                    if (dsp == null || (collectStatus = dsp.getCollectStatus()) == null || collectStatus.intValue() != 0) {
                        arrayList.add(t);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (T t2 : arrayList) {
                    a aVar = a.this;
                    String str = dSPCollectMusicResponse.extra.logid;
                    l.b(str, "");
                    arrayList2.add(aVar.a(t2, str));
                }
                CopyOnWriteArrayList<com.ss.android.ugc.aweme.dsp.playerservice.b.c> copyOnWriteArrayList = a.this.f83535c;
                ArrayList arrayList3 = new ArrayList(n.a((Iterable) copyOnWriteArrayList, 10));
                Iterator<T> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    arrayList3.add(it.next().a());
                }
                ArrayList arrayList4 = arrayList3;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                for (T t3 : arrayList2) {
                    if (hashSet.add(t3.a())) {
                        arrayList5.add(t3);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                for (T t4 : arrayList5) {
                    if (!arrayList4.contains(t4.a())) {
                        arrayList6.add(t4);
                    }
                }
                ArrayList arrayList7 = arrayList6;
                a.this.f83537e += arrayList7.size();
                a.this.f83535c.addAll(0, arrayList7);
                return arrayList7;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.e.b
    public final boolean a(c cVar) {
        l.d(cVar, "");
        if (this.f83535c.size() - c(cVar) <= 3) {
            return true;
        }
        return false;
    }

    public a(String str, i iVar) {
        l.d(str, "");
        l.d(iVar, "");
        this.f83521h = str;
        this.f83519f = iVar;
    }
}

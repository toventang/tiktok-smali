package com.ss.android.ugc.asve.recorder.effect.composer;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.List;

public final class a implements c {

    /* renamed from: c  reason: collision with root package name */
    public static final C1362a f62283c = new C1362a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<b> f62284a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f62285b = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final b f62286d;

    static {
        Covode.recordClassIndex(38274);
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.composer.a$a  reason: collision with other inner class name */
    public static final class C1362a {
        static {
            Covode.recordClassIndex(38275);
        }

        private C1362a() {
        }

        public /* synthetic */ C1362a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.c
    public final void a() {
        List<ComposerInfo> list;
        b bVar = this.f62286d;
        if (bVar instanceof d) {
            d dVar = (d) bVar;
            l.d(this, "");
            if (this.f62284a.size() > 0) {
                for (T t : this.f62284a) {
                    int i2 = t.f62287a;
                    if (i2 == 0) {
                        dVar.f62296a.clear();
                        dVar.f62297b.a(new String[0]);
                    } else if (i2 == 1) {
                        List<ComposerInfo> list2 = dVar.f62296a.get(Integer.valueOf(t.f62288b));
                        if (list2 == null) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new ComposerInfo(t.f62289c, t.f62292f));
                            dVar.f62296a.put(Integer.valueOf(t.f62288b), arrayList);
                        } else {
                            list2.add(new ComposerInfo(t.f62289c, t.f62292f));
                        }
                    } else if (i2 == 2) {
                        dVar.a(t.f62289c);
                    } else if (i2 == 3) {
                        dVar.f62296a.remove(Integer.valueOf(t.f62288b));
                    }
                }
                dVar.a();
            }
            for (T t2 : this.f62285b) {
                if (!(t2.f62288b == -1 || (list = dVar.f62296a.get(Integer.valueOf(t2.f62288b))) == null)) {
                    for (T t3 : list) {
                        if (p.e((CharSequence) t3.f62280a, (CharSequence) (t2.f62289c + ";" + t2.f62290d))) {
                            String str = t2.f62289c + ";" + t2.f62290d + ";" + t2.f62291e;
                            l.d(str, "");
                            t3.f62280a = str;
                        }
                    }
                }
                dVar.f62297b.a(t2.f62289c, t2.f62290d, t2.f62291e);
            }
            this.f62284a.clear();
            this.f62285b.clear();
            return;
        }
        throw new Exception("should not go this case ");
    }

    public a(b bVar) {
        l.d(bVar, "");
        this.f62286d = bVar;
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.c
    public final c a(String str, String str2, float f2) {
        l.d(str, "");
        l.d(str2, "");
        this.f62285b.add(new b(this, str, str2, f2));
        return this;
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.c
    public final c b(String str, String str2, float f2) {
        l.d(str, "");
        l.d(str2, "");
        this.f62285b.add(new b(this, 60000, str, str2, f2));
        return this;
    }

    public final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f62287a;

        /* renamed from: b  reason: collision with root package name */
        public int f62288b;

        /* renamed from: c  reason: collision with root package name */
        public String f62289c;

        /* renamed from: d  reason: collision with root package name */
        public String f62290d;

        /* renamed from: e  reason: collision with root package name */
        public float f62291e;

        /* renamed from: f  reason: collision with root package name */
        public String f62292f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f62293g;

        static {
            Covode.recordClassIndex(38276);
        }

        public b(a aVar, String str, String str2, float f2) {
            l.d(str, "");
            l.d(str2, "");
            this.f62293g = aVar;
            this.f62287a = 1;
            this.f62288b = -1;
            this.f62289c = "";
            this.f62290d = "";
            this.f62292f = "";
            this.f62287a = 4;
            this.f62289c = str;
            this.f62290d = str2;
            this.f62291e = f2;
        }

        public b(a aVar, int i2, String str, String str2, float f2) {
            l.d(str, "");
            l.d(str2, "");
            this.f62293g = aVar;
            this.f62287a = 1;
            this.f62288b = -1;
            this.f62289c = "";
            this.f62290d = "";
            this.f62292f = "";
            this.f62288b = 60000;
            this.f62287a = 4;
            this.f62289c = str;
            this.f62290d = str2;
            this.f62291e = f2;
        }
    }
}

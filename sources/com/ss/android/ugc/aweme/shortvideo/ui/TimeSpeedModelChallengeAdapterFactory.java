package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.p;
import com.google.gson.v;
import com.google.gson.w;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class TimeSpeedModelChallengeAdapterFactory implements w {
    static {
        Covode.recordClassIndex(85947);
    }

    public static final class b extends com.google.gson.b.a<List<AVChallenge>> {
        static {
            Covode.recordClassIndex(85949);
        }

        b() {
        }
    }

    static final class a extends v<List<? extends AVChallenge>> {

        /* renamed from: a  reason: collision with root package name */
        private final v<AVChallenge> f131171a;

        /* renamed from: b  reason: collision with root package name */
        private final f f131172b;

        static {
            Covode.recordClassIndex(85948);
        }

        public a(f fVar) {
            l.d(fVar, "");
            this.f131172b = fVar;
            this.f131171a = fVar.a(AVChallenge.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.v
        public final /* synthetic */ List<? extends AVChallenge> read(com.google.gson.c.a aVar) {
            ArrayList arrayList = null;
            if (aVar == null) {
                return null;
            }
            com.google.gson.c.b f2 = aVar.f();
            if (f2 != null) {
                int i2 = bk.f131499a[f2.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        aVar.a();
                        arrayList = new ArrayList();
                        while (aVar.e()) {
                            AVChallenge read = this.f131171a.read(aVar);
                            l.b(read, "");
                            arrayList.add(read);
                        }
                        aVar.b();
                    } else if (i2 == 3) {
                        AVChallenge read2 = this.f131171a.read(aVar);
                        l.b(read2, "");
                        return n.a(read2);
                    }
                }
                return arrayList;
            }
            throw new p("Expected JSON ARRAY or JSON OBJECT ");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
        @Override // com.google.gson.v
        public final /* synthetic */ void write(c cVar, List<? extends AVChallenge> list) {
            List<? extends AVChallenge> list2 = list;
            if (cVar != null) {
                if (list2 != null) {
                    cVar.b();
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        this.f131171a.write(cVar, it.next());
                    }
                    if (cVar.c() != null) {
                        return;
                    }
                }
                cVar.f();
            }
        }
    }

    @Override // com.google.gson.w
    public final <T> v<T> create(f fVar, com.google.gson.b.a<T> aVar) {
        l.d(fVar, "");
        l.d(aVar, "");
        if (!(!l.a(aVar, new b())) || !(!l.a(aVar.rawType, AVChallenge.class))) {
            return new a(fVar);
        }
        return null;
    }
}

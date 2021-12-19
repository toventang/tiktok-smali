package com.ss.android.ugc.f.a.a.a.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.f.a.a.a.a.d;
import com.ss.android.ugc.f.a.a.a.a.e;
import com.ss.android.ugc.f.a.a.a.b.a;
import com.ss.android.ugc.f.a.a.a.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class f extends a {

    /* renamed from: e  reason: collision with root package name */
    c[] f145565e;

    static {
        Covode.recordClassIndex(95616);
    }

    public static class a extends a.AbstractC3868a {
        static {
            Covode.recordClassIndex(95617);
        }

        @Override // com.ss.android.ugc.f.a.a.a.b.a.AbstractC3868a
        public g a() {
            f fVar = new f(this.f145555a);
            fVar.a(this.f145556b);
            fVar.b(this.f145557c);
            fVar.a(this.f145558d);
            List list = this.f145556b;
            if (list != null && !list.isEmpty()) {
                fVar.f145565e = new c[list.size()];
                for (int i2 = 0; i2 < list.size(); i2++) {
                    e eVar = (e) list.get(i2);
                    double bitRate = (double) eVar.getBitRate();
                    double networkLower = (double) eVar.getNetworkLower();
                    Double.isNaN(networkLower);
                    double networkUpper = (double) eVar.getNetworkUpper();
                    Double.isNaN(networkUpper);
                    fVar.f145565e[i2] = new c(bitRate, networkLower * 8000.0d, 8000.0d * networkUpper);
                }
            }
            return fVar;
        }

        public a(d dVar) {
            super(dVar);
        }
    }

    public f(d dVar) {
        super(dVar);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public Map<String, Object> f145566a = new HashMap();

        static {
            Covode.recordClassIndex(95618);
        }

        public final b a(int i2) {
            this.f145566a.put("internet_speed", Integer.valueOf(i2));
            return this;
        }
    }

    private static int a(Map<String, Object> map) {
        Object obj = map.get("internet_speed");
        if (obj != null) {
            return ((Integer) obj).intValue();
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fc, code lost:
        if (r2 == null) goto L_0x0027;
     */
    @Override // com.ss.android.ugc.f.a.a.a.b.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.android.ugc.f.a.a.a.a.f a(java.util.List<? extends com.ss.android.ugc.f.a.a.a.a.c> r18, java.util.Map<java.lang.String, java.lang.Object> r19) {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.f.a.a.a.b.f.a(java.util.List, java.util.Map):com.ss.android.ugc.f.a.a.a.a.f");
    }

    private com.ss.android.ugc.f.a.a.a.a.f a(com.ss.android.ugc.f.a.a.a.a.f fVar, com.ss.android.ugc.f.a.a.a.a aVar, List<? extends com.ss.android.ugc.f.a.a.a.a.c> list) {
        com.ss.android.ugc.f.a.a.a.a.c cVar;
        if (aVar != null) {
            try {
                List<com.ss.android.ugc.f.a.a.a.a.c> c2 = c(list);
                if (!c2.isEmpty()) {
                    cVar = null;
                    if (aVar.f145546b) {
                        double d2 = aVar.f145545a;
                        for (com.ss.android.ugc.f.a.a.a.a.c cVar2 : c2) {
                            if (cVar != null) {
                                if (((double) cVar.getBitRate()) > d2) {
                                    if (cVar2.getBitRate() < cVar.getBitRate()) {
                                    }
                                } else if (d2 >= ((double) cVar2.getBitRate())) {
                                    if (cVar2.getBitRate() < cVar.getBitRate()) {
                                    }
                                }
                            }
                            cVar = cVar2;
                        }
                    } else {
                        double d3 = aVar.f145545a;
                        for (com.ss.android.ugc.f.a.a.a.a.c cVar3 : c2) {
                            if (cVar != null) {
                                double bitRate = (double) cVar3.getBitRate();
                                Double.isNaN(bitRate);
                                double abs = Math.abs(bitRate - d3);
                                double bitRate2 = (double) cVar.getBitRate();
                                Double.isNaN(bitRate2);
                                if (abs >= Math.abs(bitRate2 - d3)) {
                                }
                            }
                            cVar = cVar3;
                        }
                    }
                } else {
                    throw new com.ss.android.ugc.f.a.a.a.b(5, "Intersection bitrate list is empty.");
                }
            } catch (com.ss.android.ugc.f.a.a.a.b e2) {
                fVar.f145548b = e2;
            }
        } else if (this.f145551a != null) {
            cVar = d(list);
        } else {
            throw new com.ss.android.ugc.f.a.a.a.b(6, "gear config is null");
        }
        fVar.f145547a = cVar;
        if (fVar.f145547a == null) {
            fVar.f145547a = (com.ss.android.ugc.f.a.a.a.a.c) list.get(0);
        }
        return fVar;
    }
}

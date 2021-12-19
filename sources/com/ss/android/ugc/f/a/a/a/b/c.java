package com.ss.android.ugc.f.a.a.a.b;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.f.a.a.a.a.a;
import com.ss.android.ugc.f.a.a.a.a.b;
import com.ss.android.ugc.f.a.a.a.a.d;
import com.ss.android.ugc.f.a.a.a.a.e;
import com.ss.android.ugc.f.a.a.a.a.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class c implements g {

    /* renamed from: a  reason: collision with root package name */
    protected a f145561a;

    /* renamed from: b  reason: collision with root package name */
    protected d f145562b;

    static {
        Covode.recordClassIndex(95611);
    }

    @Override // com.ss.android.ugc.f.a.a.a.b.g
    public final void a(List<? extends e> list) {
    }

    @Override // com.ss.android.ugc.f.a.a.a.b.g
    public final void b(List<? extends b> list) {
    }

    @Override // com.ss.android.ugc.f.a.a.a.b.g
    public final void a(a aVar) {
        this.f145561a = aVar;
    }

    public c(a aVar, d dVar) {
        this.f145561a = aVar;
        this.f145562b = dVar;
    }

    @Override // com.ss.android.ugc.f.a.a.a.b.g
    public final f a(List<? extends com.ss.android.ugc.f.a.a.a.a.c> list, Map<String, Object> map) {
        int i2;
        com.ss.android.ugc.f.a.a.a.a aVar;
        a aVar2;
        f fVar = new f();
        Object obj = map.get("internet_speed");
        if (obj != null) {
            i2 = ((Integer) obj).intValue();
        } else {
            i2 = -1;
        }
        double d2 = (double) i2;
        boolean z = true;
        com.ss.android.ugc.f.a.a.a.a.c cVar = null;
        if (d2 <= 0.0d || (aVar2 = this.f145561a) == null) {
            aVar = null;
        } else {
            double a2 = aVar2.a();
            Double.isNaN(d2);
            Double.isNaN(d2);
            Double.isNaN(d2);
            double b2 = this.f145561a.b();
            Double.isNaN(d2);
            Double.isNaN(d2);
            double d3 = (a2 * d2 * d2 * d2) + (b2 * d2 * d2);
            double c2 = this.f145561a.c();
            Double.isNaN(d2);
            aVar = new com.ss.android.ugc.f.a.a.a.a(Math.max(d3 + (c2 * d2) + this.f145561a.d(), this.f145561a.e()), true);
        }
        if (aVar != null) {
            fVar.f145550d = aVar.f145545a;
            try {
                double d4 = aVar.f145545a;
                ArrayList<com.ss.android.ugc.f.a.a.a.a.c> arrayList = new ArrayList();
                if (this.f145562b != null && !list.isEmpty()) {
                    Pair<Double, Double> d5 = this.f145562b.d();
                    Set<String> b3 = this.f145562b.b();
                    if (d5 == null || this.f145562b.c() <= 0.0d) {
                        z = false;
                    }
                    for (com.ss.android.ugc.f.a.a.a.a.c cVar2 : list) {
                        if (z) {
                            double bitRate = (double) cVar2.getBitRate();
                            if (bitRate >= ((Double) d5.first).doubleValue() && bitRate <= ((Double) d5.second).doubleValue()) {
                                arrayList.add(cVar2);
                            }
                        } else if (b3 != null && b3.contains(cVar2.getGearName())) {
                            arrayList.add(cVar2);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        if (z) {
                            com.ss.android.ugc.f.a.a.a.a.c cVar3 = null;
                            for (com.ss.android.ugc.f.a.a.a.a.c cVar4 : list) {
                                if (cVar3 != null) {
                                    double bitRate2 = (double) cVar4.getBitRate();
                                    double c3 = this.f145562b.c();
                                    Double.isNaN(bitRate2);
                                    double abs = Math.abs(bitRate2 - c3);
                                    double bitRate3 = (double) cVar3.getBitRate();
                                    double c4 = this.f145562b.c();
                                    Double.isNaN(bitRate3);
                                    if (abs >= Math.abs(bitRate3 - c4)) {
                                    }
                                }
                                cVar3 = cVar4;
                            }
                            arrayList.add(cVar3);
                        } else {
                            arrayList.add(list.get(0));
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    for (com.ss.android.ugc.f.a.a.a.a.c cVar5 : arrayList) {
                        if (cVar != null) {
                            if (((double) cVar.getBitRate()) > d4) {
                                if (cVar5.getBitRate() < cVar.getBitRate()) {
                                }
                            } else if (d4 >= ((double) cVar5.getBitRate())) {
                                if (cVar5.getBitRate() < cVar.getBitRate()) {
                                }
                            }
                        }
                        cVar = cVar5;
                    }
                    fVar.f145547a = cVar;
                } else {
                    throw new com.ss.android.ugc.f.a.a.a.b(5, "Intersection bitrate list is empty.");
                }
            } catch (com.ss.android.ugc.f.a.a.a.b e2) {
                fVar.f145548b = e2;
            }
        }
        if (fVar.f145547a == null) {
            if (list == null || list.size() == 0) {
                fVar.f145548b = new com.ss.android.ugc.f.a.a.a.b(0, "bitrate list is empty");
                return fVar;
            }
            ArrayList arrayList2 = new ArrayList(list);
            Collections.sort(arrayList2, new Comparator<com.ss.android.ugc.f.a.a.a.a.c>() {
                /* class com.ss.android.ugc.f.a.a.a.b.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(95612);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(com.ss.android.ugc.f.a.a.a.a.c cVar, com.ss.android.ugc.f.a.a.a.a.c cVar2) {
                    com.ss.android.ugc.f.a.a.a.a.c cVar3 = cVar;
                    com.ss.android.ugc.f.a.a.a.a.c cVar4 = cVar2;
                    if (cVar3 == null || cVar4 == null) {
                        return 0;
                    }
                    return cVar3.getSize() - cVar4.getSize();
                }
            });
            fVar.f145547a = (com.ss.android.ugc.f.a.a.a.a.c) arrayList2.get(0);
        }
        return fVar;
    }
}

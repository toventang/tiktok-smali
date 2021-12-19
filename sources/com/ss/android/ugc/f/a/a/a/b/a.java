package com.ss.android.ugc.f.a.a.a.b;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.f.a.a.a.a.b;
import com.ss.android.ugc.f.a.a.a.a.c;
import com.ss.android.ugc.f.a.a.a.a.d;
import com.ss.android.ugc.f.a.a.a.a.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public abstract class a implements g {

    /* renamed from: a  reason: collision with root package name */
    protected final d f145551a;

    /* renamed from: b  reason: collision with root package name */
    protected List<? extends e> f145552b;

    /* renamed from: c  reason: collision with root package name */
    protected List<? extends b> f145553c;

    /* renamed from: d  reason: collision with root package name */
    protected com.ss.android.ugc.f.a.a.a.a.a f145554d;

    static {
        Covode.recordClassIndex(95607);
    }

    /* renamed from: com.ss.android.ugc.f.a.a.a.b.a$a  reason: collision with other inner class name */
    public static abstract class AbstractC3868a {

        /* renamed from: a  reason: collision with root package name */
        protected d f145555a;

        /* renamed from: b  reason: collision with root package name */
        protected List<? extends e> f145556b;

        /* renamed from: c  reason: collision with root package name */
        protected List<? extends b> f145557c;

        /* renamed from: d  reason: collision with root package name */
        protected com.ss.android.ugc.f.a.a.a.a.a f145558d;

        static {
            Covode.recordClassIndex(95608);
        }

        public abstract g a();

        public final AbstractC3868a a(com.ss.android.ugc.f.a.a.a.a.a aVar) {
            this.f145558d = aVar;
            return this;
        }

        public final AbstractC3868a b(List<? extends b> list) {
            this.f145557c = list;
            return this;
        }

        public AbstractC3868a(d dVar) {
            this.f145555a = dVar;
        }

        public final AbstractC3868a a(List<? extends e> list) {
            this.f145556b = list;
            return this;
        }
    }

    @Override // com.ss.android.ugc.f.a.a.a.b.g
    public final void a(com.ss.android.ugc.f.a.a.a.a.a aVar) {
        this.f145554d = aVar;
    }

    @Override // com.ss.android.ugc.f.a.a.a.b.g
    public final void b(List<? extends b> list) {
        this.f145553c = list;
    }

    protected a(d dVar) {
        this.f145551a = dVar;
    }

    @Override // com.ss.android.ugc.f.a.a.a.b.g
    public final void a(List<? extends e> list) {
        this.f145552b = list;
    }

    /* access modifiers changed from: protected */
    public final <T extends c> T d(List<T> list) {
        String a2 = this.f145551a.a();
        double c2 = this.f145551a.c();
        if (c2 <= 0.0d) {
            for (T t : list) {
                if (TextUtils.equals(t.getGearName(), a2)) {
                    return t;
                }
            }
            throw new com.ss.android.ugc.f.a.a.a.b(4, "defaultGearName = " + a2 + " bitrates = " + list.toString());
        }
        double d2 = Double.MAX_VALUE;
        T t2 = null;
        for (T t3 : list) {
            double bitRate = (double) t3.getBitRate();
            Double.isNaN(bitRate);
            double abs = Math.abs(bitRate - c2);
            if (d2 > abs) {
                t2 = t3;
                d2 = abs;
            }
        }
        return t2;
    }

    /* access modifiers changed from: protected */
    public final <T extends c> List<T> c(List<T> list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (this.f145551a != null && !list.isEmpty()) {
            Pair<Double, Double> d2 = this.f145551a.d();
            Set<String> b2 = this.f145551a.b();
            if (d2 == null || this.f145551a.c() <= 0.0d) {
                z = false;
            } else {
                z = true;
            }
            for (T t : list) {
                if (z) {
                    double bitRate = (double) t.getBitRate();
                    if (bitRate >= ((Double) d2.first).doubleValue() && bitRate <= ((Double) d2.second).doubleValue()) {
                        arrayList.add(t);
                    }
                } else if (b2 != null && b2.contains(t.getGearName())) {
                    arrayList.add(t);
                }
            }
            if (arrayList.isEmpty()) {
                if (z) {
                    T t2 = null;
                    for (T t3 : list) {
                        if (t2 != null) {
                            double bitRate2 = (double) t3.getBitRate();
                            double c2 = this.f145551a.c();
                            Double.isNaN(bitRate2);
                            double abs = Math.abs(bitRate2 - c2);
                            double bitRate3 = (double) t2.getBitRate();
                            double c3 = this.f145551a.c();
                            Double.isNaN(bitRate3);
                            if (abs >= Math.abs(bitRate3 - c3)) {
                            }
                        }
                        t2 = t3;
                    }
                    arrayList.add(t2);
                } else {
                    arrayList.add(list.get(0));
                }
            }
        }
        return arrayList;
    }
}

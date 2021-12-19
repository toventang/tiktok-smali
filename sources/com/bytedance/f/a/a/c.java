package com.bytedance.f.a.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    final List<f> f28720a;

    /* renamed from: b  reason: collision with root package name */
    public final List<f> f28721b;

    /* renamed from: c  reason: collision with root package name */
    final Comparator<f> f28722c = a.f28723a;

    static {
        Covode.recordClassIndex(16898);
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f28720a = arrayList;
        this.f28721b = arrayList;
    }

    static final class a<T> implements Comparator<f> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f28723a = new a();

        static {
            Covode.recordClassIndex(16899);
        }

        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(f fVar, f fVar2) {
            f fVar3 = fVar;
            f fVar4 = fVar2;
            l.d(fVar3, "");
            l.d(fVar4, "");
            return fVar4.f28727a - fVar3.f28727a;
        }
    }
}

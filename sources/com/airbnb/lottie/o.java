package com.airbnb.lottie;

import androidx.c.b;
import com.airbnb.lottie.i.e;
import com.bytedance.covode.number.Covode;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class o {

    /* renamed from: a  reason: collision with root package name */
    public boolean f5761a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5762b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<Object> f5763c = new b();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, e> f5764d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Comparator<androidx.core.g.e<String, Float>> f5765e = new Comparator<androidx.core.g.e<String, Float>>() {
        /* class com.airbnb.lottie.o.AnonymousClass1 */

        static {
            Covode.recordClassIndex(2409);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(androidx.core.g.e<String, Float> eVar, androidx.core.g.e<String, Float> eVar2) {
            float floatValue = eVar.f2398b.floatValue();
            float floatValue2 = eVar2.f2398b.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            if (floatValue > floatValue2) {
                return -1;
            }
            return 0;
        }
    };

    static {
        Covode.recordClassIndex(2408);
    }

    public final void a(String str, float f2) {
        boolean z = this.f5762b;
        if (z || this.f5761a) {
            if (!this.f5761a || z) {
                e eVar = this.f5764d.get(str);
                if (eVar == null) {
                    eVar = new e();
                    this.f5764d.put(str, eVar);
                }
                eVar.f5692a += f2;
                eVar.f5693b++;
                if (eVar.f5693b == Integer.MAX_VALUE) {
                    eVar.f5692a /= 2.0f;
                    eVar.f5693b /= 2;
                }
            }
            if (str.equals("__container")) {
                Iterator<Object> it = this.f5763c.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}

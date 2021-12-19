package com.bytedance.lottie;

import androidx.c.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.f.e;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class q {

    /* renamed from: a  reason: collision with root package name */
    public boolean f40830a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f40831b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<a> f40832c = new b();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, e> f40833d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Comparator<androidx.core.g.e<String, Float>> f40834e = new Comparator<androidx.core.g.e<String, Float>>() {
        /* class com.bytedance.lottie.q.AnonymousClass1 */

        static {
            Covode.recordClassIndex(25025);
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

    public interface a {
        static {
            Covode.recordClassIndex(25026);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(25024);
    }

    public final void a(a aVar) {
        this.f40832c.add(aVar);
    }

    public final void a(String str, float f2) {
        boolean z = this.f40831b;
        if (z || this.f40830a) {
            if (!this.f40830a || z) {
                e eVar = this.f40833d.get(str);
                if (eVar == null) {
                    eVar = new e();
                    this.f40833d.put(str, eVar);
                }
                eVar.f40695a += f2;
                eVar.f40696b++;
                if (eVar.f40696b == Integer.MAX_VALUE) {
                    eVar.f40695a /= 2.0f;
                    eVar.f40696b /= 2;
                }
            }
            if (str.equals("__container")) {
                for (a aVar : this.f40832c) {
                    aVar.a();
                }
            }
        }
    }
}

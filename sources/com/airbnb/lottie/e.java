package com.airbnb.lottie;

import android.graphics.Rect;
import android.util.JsonReader;
import androidx.c.h;
import com.airbnb.lottie.e.c;
import com.airbnb.lottie.e.c.d;
import com.bytedance.covode.number.Covode;
import java.io.StringReader;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public final o f5330a = new o();

    /* renamed from: b  reason: collision with root package name */
    public Map<String, List<d>> f5331b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, h> f5332c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, c> f5333d;

    /* renamed from: e  reason: collision with root package name */
    public h<com.airbnb.lottie.e.d> f5334e;

    /* renamed from: f  reason: collision with root package name */
    androidx.c.d<d> f5335f;

    /* renamed from: g  reason: collision with root package name */
    public List<d> f5336g;

    /* renamed from: h  reason: collision with root package name */
    public Rect f5337h;

    /* renamed from: i  reason: collision with root package name */
    public float f5338i;

    /* renamed from: j  reason: collision with root package name */
    public float f5339j;

    /* renamed from: k  reason: collision with root package name */
    public float f5340k;

    /* renamed from: l  reason: collision with root package name */
    public String f5341l = "";

    /* renamed from: m  reason: collision with root package name */
    private final HashSet<String> f5342m = new HashSet<>();

    static {
        Covode.recordClassIndex(2239);
    }

    public final float b() {
        return this.f5339j - this.f5338i;
    }

    public final float a() {
        return (float) ((long) ((b() / this.f5340k) * 1000.0f));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (d dVar : this.f5336g) {
            sb.append(dVar.a("\t"));
        }
        return sb.toString();
    }

    public static class a {
        static {
            Covode.recordClassIndex(2240);
        }

        /* renamed from: com.airbnb.lottie.e$a$a  reason: collision with other inner class name */
        static final class C0074a implements a, i<e> {

            /* renamed from: a  reason: collision with root package name */
            private final n f5346a;

            /* renamed from: b  reason: collision with root package name */
            private boolean f5347b;

            static {
                Covode.recordClassIndex(2241);
            }

            private C0074a(n nVar) {
                this.f5346a = nVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.airbnb.lottie.i
            public final /* bridge */ /* synthetic */ void a(e eVar) {
                e eVar2 = eVar;
                if (!this.f5347b) {
                    this.f5346a.a(eVar2);
                }
            }

            /* synthetic */ C0074a(n nVar, byte b2) {
                this(nVar);
            }
        }

        public static a a(String str, n nVar) {
            C0074a aVar = new C0074a(nVar, (byte) 0);
            f.a((String) null, new Callable<l<e>>(str) {
                /* class com.airbnb.lottie.f.AnonymousClass7 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ String f5542a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f5543b = null;

                static {
                    Covode.recordClassIndex(2310);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ l<e> call() {
                    String str = this.f5542a;
                    return f.b(new JsonReader(new StringReader(str)), this.f5543b);
                }

                {
                    this.f5542a = r2;
                }
            }).a((i<e>) aVar);
            return aVar;
        }
    }

    public final void a(String str) {
        this.f5342m.add(str);
    }

    public final d a(long j2) {
        return this.f5335f.a(j2, null);
    }

    public final void a(boolean z) {
        this.f5330a.f5762b = z;
    }
}

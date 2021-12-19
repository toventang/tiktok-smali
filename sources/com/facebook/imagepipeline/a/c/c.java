package com.facebook.imagepipeline.a.c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.c.a.e;
import com.facebook.common.d.j;
import com.facebook.imagepipeline.d.h;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final e f47681a;

    /* renamed from: b  reason: collision with root package name */
    public final h<e, com.facebook.imagepipeline.j.c> f47682b;

    /* renamed from: c  reason: collision with root package name */
    private final h.c<e> f47683c = new h.c<e>() {
        /* class com.facebook.imagepipeline.a.c.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(28901);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, boolean] */
        @Override // com.facebook.imagepipeline.d.h.c
        public final /* bridge */ /* synthetic */ void a(e eVar, boolean z) {
            c.this.a(eVar, z);
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private final LinkedHashSet<e> f47684d = new LinkedHashSet<>();

    static {
        Covode.recordClassIndex(28900);
    }

    /* access modifiers changed from: package-private */
    public static class a implements e {

        /* renamed from: a  reason: collision with root package name */
        private final e f47688a;

        /* renamed from: b  reason: collision with root package name */
        private final int f47689b;

        static {
            Covode.recordClassIndex(28903);
        }

        @Override // com.facebook.c.a.e
        public final String a() {
            return null;
        }

        @Override // com.facebook.c.a.e
        public final int hashCode() {
            return (this.f47688a.hashCode() * 1013) + this.f47689b;
        }

        @Override // com.facebook.c.a.e
        public final String toString() {
            return com.facebook.common.d.h.a(this).a("imageCacheKey", this.f47688a).a("frameIndex", this.f47689b).toString();
        }

        @Override // com.facebook.c.a.e
        public final boolean a(Uri uri) {
            return this.f47688a.a(uri);
        }

        @Override // com.facebook.c.a.e
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f47689b != aVar.f47689b || !this.f47688a.equals(aVar.f47688a)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public a(e eVar, int i2) {
            this.f47688a = eVar;
            this.f47689b = i2;
        }
    }

    public final synchronized e a() {
        e eVar;
        MethodCollector.i(5020);
        eVar = null;
        Iterator<e> it = this.f47684d.iterator();
        if (it.hasNext()) {
            eVar = it.next();
            it.remove();
        }
        MethodCollector.o(5020);
        return eVar;
    }

    public final a b(int i2) {
        return new a(this.f47681a, i2);
    }

    public final void c(final int i2) {
        if (i2 != -1) {
            this.f47682b.b(new j<e>() {
                /* class com.facebook.imagepipeline.a.c.c.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(28902);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.facebook.common.d.j
                public final /* synthetic */ boolean a(e eVar) {
                    if (new a(c.this.f47681a, i2).equals(eVar)) {
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    public final boolean a(int i2) {
        return this.f47682b.c(b(i2));
    }

    public final com.facebook.common.h.a<com.facebook.imagepipeline.j.c> a(int i2, com.facebook.common.h.a<com.facebook.imagepipeline.j.c> aVar) {
        return this.f47682b.a(b(i2), aVar, this.f47683c);
    }

    public c(e eVar, h<e, com.facebook.imagepipeline.j.c> hVar) {
        this.f47681a = eVar;
        this.f47682b = hVar;
    }

    public final synchronized void a(e eVar, boolean z) {
        MethodCollector.i(5010);
        if (z) {
            this.f47684d.add(eVar);
            MethodCollector.o(5010);
            return;
        }
        this.f47684d.remove(eVar);
        MethodCollector.o(5010);
    }
}

package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.v;
import com.google.gson.w;

public class StringJsonAdapterFactory implements w {
    static {
        Covode.recordClassIndex(93260);
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f142576a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 93261(0x16c4d, float:1.30686E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.google.gson.c.b[] r0 = com.google.gson.c.b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory.AnonymousClass1.f142576a = r2
                com.google.gson.c.b r0 = com.google.gson.c.b.NULL     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory.AnonymousClass1.f142576a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.google.gson.c.b r0 = com.google.gson.c.b.STRING     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory.AnonymousClass1.<clinit>():void");
        }
    }

    public static class a<T> extends v<T> {

        /* renamed from: a  reason: collision with root package name */
        private final f f142577a;

        /* renamed from: b  reason: collision with root package name */
        private final com.google.gson.b.a<T> f142578b;

        static {
            Covode.recordClassIndex(93262);
        }

        @Override // com.google.gson.v
        public final T read(com.google.gson.c.a aVar) {
            int i2 = AnonymousClass1.f142576a[aVar.f().ordinal()];
            if (i2 != 1) {
                return i2 != 2 ? (T) this.f142577a.a(aVar, this.f142578b.type) : (T) this.f142577a.a(aVar.i(), this.f142578b.type);
            }
            aVar.k();
            return null;
        }

        public a(f fVar, com.google.gson.b.a<T> aVar) {
            this.f142577a = fVar;
            this.f142578b = aVar;
        }

        @Override // com.google.gson.v
        public final void write(c cVar, T t) {
            cVar.b(this.f142577a.b(t));
        }
    }

    @Override // com.google.gson.w
    public <T> v<T> create(f fVar, com.google.gson.b.a<T> aVar) {
        return new a(fVar, aVar);
    }
}

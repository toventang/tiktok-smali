package com.squareup.a.a.a;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;
import k.f;
import k.h;
import k.i;
import k.l;
import k.o;
import k.q;

/* access modifiers changed from: package-private */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public int f57557a;

    /* renamed from: b  reason: collision with root package name */
    final h f57558b;

    /* renamed from: c  reason: collision with root package name */
    private final o f57559c;

    static {
        Covode.recordClassIndex(35912);
    }

    private i a() {
        return this.f57558b.g((long) this.f57558b.j());
    }

    public k(h hVar) {
        o oVar = new o(new l(hVar) {
            /* class com.squareup.a.a.a.k.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35913);
            }

            @Override // k.aa, k.l
            public final long read(f fVar, long j2) {
                if (k.this.f57557a == 0) {
                    return -1;
                }
                long read = super.read(fVar, Math.min(j2, (long) k.this.f57557a));
                if (read == -1) {
                    return -1;
                }
                k kVar = k.this;
                kVar.f57557a = (int) (((long) kVar.f57557a) - read);
                return read;
            }
        }, new Inflater() {
            /* class com.squareup.a.a.a.k.AnonymousClass2 */

            static {
                Covode.recordClassIndex(35914);
            }

            @Override // java.util.zip.Inflater
            public final int inflate(byte[] bArr, int i2, int i3) {
                int inflate = super.inflate(bArr, i2, i3);
                if (inflate != 0 || !needsDictionary()) {
                    return inflate;
                }
                setDictionary(o.f57570a);
                return super.inflate(bArr, i2, i3);
            }
        });
        this.f57559c = oVar;
        this.f57558b = q.a(oVar);
    }

    public final List<f> a(int i2) {
        this.f57557a += i2;
        int j2 = this.f57558b.j();
        if (j2 < 0) {
            throw new IOException("numberOfPairs < 0: ".concat(String.valueOf(j2)));
        } else if (j2 <= 1024) {
            ArrayList arrayList = new ArrayList(j2);
            for (int i3 = 0; i3 < j2; i3++) {
                i asciiLowercase = a().toAsciiLowercase();
                i a2 = a();
                if (asciiLowercase.size() != 0) {
                    arrayList.add(new f(asciiLowercase, a2));
                } else {
                    throw new IOException("name.size == 0");
                }
            }
            if (this.f57557a > 0) {
                this.f57559c.a();
                if (this.f57557a != 0) {
                    throw new IOException("compressedLimit > 0: " + this.f57557a);
                }
            }
            return arrayList;
        } else {
            throw new IOException("numberOfPairs > 1024: ".concat(String.valueOf(j2)));
        }
    }
}

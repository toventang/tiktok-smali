package com.google.android.datatransport.runtime;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.b;
import java.util.Arrays;
import java.util.Objects;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final b f49447a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f49448b;

    static {
        Covode.recordClassIndex(30942);
    }

    public final int hashCode() {
        return ((this.f49447a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f49448b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f49447a + ", bytes=[...]}";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.f49447a.equals(gVar.f49447a)) {
            return false;
        }
        return Arrays.equals(this.f49448b, gVar.f49448b);
    }

    public g(b bVar, byte[] bArr) {
        Objects.requireNonNull(bVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f49447a = bVar;
        this.f49448b = bArr;
    }
}

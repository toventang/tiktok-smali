package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class ai extends d {

    /* renamed from: a  reason: collision with root package name */
    private final long f52790a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, AssetPackState> f52791b;

    static {
        Covode.recordClassIndex(32674);
    }

    ai(long j2, Map<String, AssetPackState> map) {
        this.f52790a = j2;
        this.f52791b = map;
    }

    @Override // com.google.android.play.core.assetpacks.d
    public final long a() {
        return this.f52790a;
    }

    @Override // com.google.android.play.core.assetpacks.d
    public final Map<String, AssetPackState> b() {
        return this.f52791b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f52790a == dVar.a() && this.f52791b.equals(dVar.b());
        }
    }

    public final int hashCode() {
        long j2 = this.f52790a;
        return this.f52791b.hashCode() ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j2 = this.f52790a;
        String valueOf = String.valueOf(this.f52791b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
        sb.append("AssetPackStates{totalBytes=");
        sb.append(j2);
        sb.append(", packStates=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.Objects;

public final class bf extends ca {

    /* renamed from: a  reason: collision with root package name */
    private final Context f50705a;

    /* renamed from: b  reason: collision with root package name */
    private final cq<cm<bn>> f50706b;

    static {
        Covode.recordClassIndex(31672);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.ca
    public final Context a() {
        return this.f50705a;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.ca
    public final cq<cm<bn>> b() {
        return this.f50706b;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f50705a.hashCode() ^ 1000003) * 1000003;
        cq<cm<bn>> cqVar = this.f50706b;
        if (cqVar == null) {
            hashCode = 0;
        } else {
            hashCode = cqVar.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f50705a);
        String valueOf2 = String.valueOf(this.f50706b);
        return new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(valueOf2).length()).append("FlagsContext{context=").append(valueOf).append(", hermeticFileOverrides=").append(valueOf2).append("}").toString();
    }

    public final boolean equals(Object obj) {
        cq<cm<bn>> cqVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ca) {
            ca caVar = (ca) obj;
            if (!this.f50705a.equals(caVar.a()) || ((cqVar = this.f50706b) != null ? !cqVar.equals(caVar.b()) : caVar.b() != null)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public bf(Context context, cq<cm<bn>> cqVar) {
        Objects.requireNonNull(context, "Null context");
        this.f50705a = context;
        this.f50706b = cqVar;
    }
}

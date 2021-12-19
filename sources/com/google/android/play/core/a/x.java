package com.google.android.play.core.a;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.a.d;

/* access modifiers changed from: package-private */
public final class x extends d.a {

    /* renamed from: a  reason: collision with root package name */
    Integer f52749a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f52750b;

    static {
        Covode.recordClassIndex(32658);
    }

    x() {
    }

    @Override // com.google.android.play.core.a.d.a
    public final d.a a() {
        this.f52750b = false;
        return this;
    }

    @Override // com.google.android.play.core.a.d.a
    public final d b() {
        String str = "";
        if (this.f52749a == null) {
            str = str.concat(" appUpdateType");
        }
        if (this.f52750b == null) {
            str = String.valueOf(str).concat(" allowAssetPackDeletion");
        }
        if (str.isEmpty()) {
            return new y(this.f52749a.intValue(), this.f52750b.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }
}

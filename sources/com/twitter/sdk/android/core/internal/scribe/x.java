package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.internal.h;
import java.util.UUID;

/* access modifiers changed from: package-private */
public final class x extends g<v> {
    static {
        Covode.recordClassIndex(103704);
    }

    /* access modifiers changed from: protected */
    @Override // com.twitter.sdk.android.core.internal.scribe.g
    public final String b() {
        return "se_" + UUID.randomUUID().toString() + "_" + this.f156075c.a() + ".tap";
    }

    x(Context context, f<v> fVar, h hVar, s sVar, int i2) {
        super(context, fVar, hVar, sVar, i2);
    }
}

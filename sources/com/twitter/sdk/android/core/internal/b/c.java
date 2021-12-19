package com.twitter.sdk.android.core.internal.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f155956a;

    static {
        Covode.recordClassIndex(103626);
    }

    @Override // com.twitter.sdk.android.core.internal.b.b
    public final SharedPreferences a() {
        return this.f155956a;
    }

    @Override // com.twitter.sdk.android.core.internal.b.b
    public final SharedPreferences.Editor b() {
        return this.f155956a.edit();
    }

    @Override // com.twitter.sdk.android.core.internal.b.b
    public final boolean a(SharedPreferences.Editor editor) {
        editor.apply();
        return true;
    }

    public c(Context context, String str) {
        if (context != null) {
            this.f155956a = d.a(context, str, 0);
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}

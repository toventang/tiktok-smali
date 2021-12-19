package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f50432a;

    /* renamed from: b  reason: collision with root package name */
    private final String f50433b;

    static {
        Covode.recordClassIndex(31430);
    }

    public t(Context context) {
        r.a(context);
        Resources resources = context.getResources();
        this.f50432a = resources;
        this.f50433b = resources.getResourcePackageName(R.string.ao5);
    }

    public final String a(String str) {
        int identifier = this.f50432a.getIdentifier(str, "string", this.f50433b);
        if (identifier == 0) {
            return null;
        }
        return this.f50432a.getString(identifier);
    }
}

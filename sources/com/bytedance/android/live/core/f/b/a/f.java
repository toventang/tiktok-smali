package com.bytedance.android.live.core.f.b.a;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.live.core.f.b.c;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.List;

public final class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f9054a = Arrays.asList("ONEPLUS A6000");

    static {
        Covode.recordClassIndex(4625);
    }

    @Override // com.bytedance.android.live.core.f.b.c
    public final boolean a(Context context) {
        return f9054a.contains(Build.MODEL);
    }
}

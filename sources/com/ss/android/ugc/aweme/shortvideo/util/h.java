package com.ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import java.util.List;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f132320a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f132321b;

    static {
        Covode.recordClassIndex(86653);
    }

    h(Activity activity, Intent intent) {
        this.f132320a = activity;
        this.f132321b = intent;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        return f.a(this.f132320a, this.f132321b, (List) obj);
    }
}

package com.ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final Context f132323a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f132324b;

    static {
        Covode.recordClassIndex(86655);
    }

    j(Context context, Intent intent) {
        this.f132323a = context;
        this.f132324b = intent;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        f.a(this.f132323a, this.f132324b);
    }
}

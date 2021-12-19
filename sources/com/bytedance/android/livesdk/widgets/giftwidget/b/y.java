package com.bytedance.android.livesdk.widgets.giftwidget.b;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.service.c.f.d;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class y implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final v f22809a;

    static {
        Covode.recordClassIndex(13445);
    }

    y(v vVar) {
        this.f22809a = vVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        d.a(1);
        dialogInterface.dismiss();
    }
}

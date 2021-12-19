package com.bytedance.android.livesdk.drawerfeed;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class c implements DialogInterface.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f17114a;

    static {
        Covode.recordClassIndex(9501);
    }

    c(a aVar) {
        this.f17114a = aVar;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        return this.f17114a.a(i2, keyEvent);
    }
}

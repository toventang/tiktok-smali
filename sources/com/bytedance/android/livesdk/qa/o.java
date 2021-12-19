package com.bytedance.android.livesdk.qa;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.qa.i;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class o implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final i.f f20508a;

    /* renamed from: b  reason: collision with root package name */
    private final af f20509b;

    /* renamed from: c  reason: collision with root package name */
    private final int f20510c;

    static {
        Covode.recordClassIndex(12103);
    }

    o(i.f fVar, af afVar, int i2) {
        this.f20508a = fVar;
        this.f20509b = afVar;
        this.f20510c = i2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f20508a.a(this.f20509b, this.f20510c);
    }
}

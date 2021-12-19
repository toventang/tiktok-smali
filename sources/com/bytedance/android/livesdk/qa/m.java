package com.bytedance.android.livesdk.qa;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.qa.i;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class m implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final i.f f20504a;

    /* renamed from: b  reason: collision with root package name */
    private final af f20505b;

    /* renamed from: c  reason: collision with root package name */
    private final int f20506c;

    static {
        Covode.recordClassIndex(12101);
    }

    m(i.f fVar, af afVar, int i2) {
        this.f20504a = fVar;
        this.f20505b = afVar;
        this.f20506c = i2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f20504a.a(this.f20505b, this.f20506c);
    }
}

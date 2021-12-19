package com.bytedance.android.livesdk.widgets.giftwidget.b;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.at.i;
import com.bytedance.android.livesdk.bd;
import com.bytedance.android.livesdk.service.c.f.d;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class x implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final v f22805a;

    /* renamed from: b  reason: collision with root package name */
    private final i f22806b;

    /* renamed from: c  reason: collision with root package name */
    private final long[] f22807c;

    /* renamed from: d  reason: collision with root package name */
    private final bd f22808d;

    static {
        Covode.recordClassIndex(13444);
    }

    x(v vVar, i iVar, long[] jArr, bd bdVar) {
        this.f22805a = vVar;
        this.f22806b = iVar;
        this.f22807c = jArr;
        this.f22808d = bdVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        v vVar = this.f22805a;
        long[] jArr = this.f22807c;
        bd bdVar = this.f22808d;
        dialogInterface.dismiss();
        i.a(vVar.f22799a, "saved_uid_recharge", jArr[0]);
        d.a(0);
        vVar.b(bdVar);
    }
}

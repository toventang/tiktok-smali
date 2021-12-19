package com.bytedance.android.live.wallet;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class z implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final v f13248a;

    static {
        Covode.recordClassIndex(7352);
    }

    z(v vVar) {
        this.f13248a = vVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f13248a.lambda$showTurnOnAutoExchangeDialog$3$WalletService(dialogInterface, i2);
    }
}

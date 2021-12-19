package com.ss.android.ugc.aweme.initializer;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class m implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final DialogInterface.OnClickListener f104742a;

    static {
        Covode.recordClassIndex(67148);
    }

    m(DialogInterface.OnClickListener onClickListener) {
        this.f104742a = onClickListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        DialogInterface.OnClickListener onClickListener = this.f104742a;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i2);
        }
    }
}

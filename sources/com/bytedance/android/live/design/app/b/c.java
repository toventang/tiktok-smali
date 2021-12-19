package com.bytedance.android.live.design.app.b;

import android.content.DialogInterface;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements LiveDialog.b {

    /* renamed from: a  reason: collision with root package name */
    static final LiveDialog.b f9400a = new c();

    static {
        Covode.recordClassIndex(4787);
    }

    private c() {
    }

    @Override // com.bytedance.android.live.design.app.LiveDialog.b
    public final void a(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
    }
}

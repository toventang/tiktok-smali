package com.bytedance.android.livesdk.widgets.giftwidget.b;

import android.content.DialogInterface;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.service.c.e.a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ac implements LiveDialog.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f22690a;

    static {
        Covode.recordClassIndex(13386);
    }

    ac(String str) {
        this.f22690a = str;
    }

    @Override // com.bytedance.android.live.design.app.LiveDialog.b
    public final void a(DialogInterface dialogInterface) {
        String str = this.f22690a;
        dialogInterface.dismiss();
        a.a(str, "dismiss");
    }
}

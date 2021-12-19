package com.ss.android.ugc.aweme.commercialize.depend;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.DialogBuilder;
import com.bytedance.ies.android.base.runtime.depend.IHostStyleUIDepend;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import h.f.b.l;

public final class s implements IHostStyleUIDepend {
    static {
        Covode.recordClassIndex(45433);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostStyleUIDepend
    public final View getContainerLoadingView(Context context) {
        l.d(context, "");
        return BulletService.f().a(context);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostStyleUIDepend
    public final Dialog showDialog(DialogBuilder dialogBuilder) {
        l.d(dialogBuilder, "");
        Dialog c2 = new a.C0731a(dialogBuilder.getContext()).a(dialogBuilder.getTitleResId()).b(dialogBuilder.getMessageResId()).a(dialogBuilder.getPositiveBtnTextResId(), dialogBuilder.getPositiveClickListener(), false).b(dialogBuilder.getNegativeBtnResId(), dialogBuilder.getNegativeClickListener(), false).a().c();
        c2.setCanceledOnTouchOutside(dialogBuilder.getCancelOnTouchOutside());
        return c2;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostStyleUIDepend
    public final Boolean showToast(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        l.c(context, "");
        l.c(str, "");
        return null;
    }
}

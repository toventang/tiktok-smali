package com.bytedance.ies.xbridge.n.c.a;

import android.os.Build;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.depend.ActionSheetBuilder;
import com.bytedance.ies.xbridge.base.runtime.depend.DialogBuilder;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.ShowActionSheetListener;
import com.bytedance.ies.xbridge.base.runtime.depend.ToastBuilder;
import com.bytedance.ies.xbridge.model.b.c;
import com.ss.android.ugc.aweme.utils.ic;
import h.f.b.l;

public final class a implements IHostStyleUIDepend {
    static {
        Covode.recordClassIndex(21765);
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public final Boolean hideLoading(c cVar) {
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public final Boolean showLoading(c cVar) {
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public final Boolean showDialog(DialogBuilder dialogBuilder) {
        l.c(dialogBuilder, "");
        l.c(dialogBuilder, "");
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public final Boolean showToast(ToastBuilder toastBuilder) {
        l.c(toastBuilder, "");
        Toast makeText = Toast.makeText(toastBuilder.getContext(), toastBuilder.getMessage(), 0);
        if (Build.VERSION.SDK_INT == 25) {
            ic.a(makeText);
        }
        makeText.show();
        return true;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public final Boolean showActionSheet(ActionSheetBuilder actionSheetBuilder, ShowActionSheetListener showActionSheetListener) {
        l.c(actionSheetBuilder, "");
        l.c(showActionSheetListener, "");
        return IHostStyleUIDepend.b.a(actionSheetBuilder, showActionSheetListener);
    }
}

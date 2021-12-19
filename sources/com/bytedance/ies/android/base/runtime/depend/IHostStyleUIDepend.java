package com.bytedance.ies.android.base.runtime.depend;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;

public interface IHostStyleUIDepend {
    static {
        Covode.recordClassIndex(18660);
    }

    View getContainerLoadingView(Context context);

    Dialog showDialog(DialogBuilder dialogBuilder);

    Boolean showToast(Context context, String str);
}

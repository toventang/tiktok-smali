package com.ss.android.ugc.aweme.kids.setting.base;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class a extends Dialog {
    static {
        Covode.recordClassIndex(68305);
    }

    public final void onBackPressed() {
        super.onBackPressed();
    }

    public a(Context context) {
        super(context, R.style.yy);
        MethodCollector.i(3946);
        setContentView(LayoutInflater.from(context).inflate(R.layout.ade, (ViewGroup) null));
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = (int) n.b(context, 57.0f);
        attributes.width = (int) n.b(context, 57.0f);
        window.setAttributes(attributes);
        MethodCollector.o(3946);
    }
}

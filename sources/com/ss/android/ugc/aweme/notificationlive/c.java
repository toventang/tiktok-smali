package com.ss.android.ugc.aweme.notificationlive;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends Dialog {
    static {
        Covode.recordClassIndex(73505);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context, R.style.wd);
        l.d(context, "");
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        MethodCollector.i(8066);
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(getContext()).inflate(R.layout.aqt, (ViewGroup) null));
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) findViewById(R.id.chg);
        if (dmtLoadingLayout != null) {
            dmtLoadingLayout.setVisibility(0);
        }
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
            MethodCollector.o(8066);
            return;
        }
        MethodCollector.o(8066);
    }
}

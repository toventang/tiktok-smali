package com.ss.android.ugc.aweme.ecommerce.pdp.view.compat;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.h;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends h {
    static {
        Covode.recordClassIndex(54427);
    }

    private c(Context context) {
        super(context, R.style.vq);
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public final void setContentView(int i2) {
        View findViewById;
        cg_();
        super.setContentView(i2);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        if (Build.VERSION.SDK_INT >= 21 && (findViewById = findViewById(16908335)) != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public final void setContentView(View view) {
        View findViewById;
        l.d(view, "");
        cg_();
        super.setContentView(view);
        view.setFitsSystemWindows(false);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        if (Build.VERSION.SDK_INT >= 21 && (findViewById = findViewById(16908335)) != null) {
            findViewById.setVisibility(8);
        }
    }

    public /* synthetic */ c(Context context, byte b2) {
        this(context);
    }
}

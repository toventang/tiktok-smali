package com.ss.android.ugc.aweme.commercialize.views.bottomdialog;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import androidx.appcompat.app.h;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public abstract class a extends h {
    static {
        Covode.recordClassIndex(46839);
    }

    public a(Context context) {
        super(context, R.style.f160039a);
    }

    @Override // androidx.appcompat.app.h
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.xj);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
        }
    }
}

package com.ss.android.ugc.aweme.widgetcompat;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.e.b;
import com.zhiliaoapp.musically.R;

public final class a extends b {
    static {
        Covode.recordClassIndex(94860);
    }

    private a(Context context) {
        super(context);
        this.f150112d = false;
    }

    public static a a(Context context, String str) {
        if (context == null || !(context instanceof Activity) || ((Activity) context).isFinishing()) {
            return null;
        }
        a aVar = new a(context);
        aVar.setCancelable(false);
        aVar.setIndeterminate(false);
        aVar.setMax(100);
        aVar.show();
        aVar.setContentView(R.layout.e3);
        aVar.setMessage(str);
        aVar.a();
        return aVar;
    }
}

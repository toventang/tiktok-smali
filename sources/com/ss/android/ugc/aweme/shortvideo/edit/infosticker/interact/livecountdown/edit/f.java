package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.mlcomponent_api.BuildConfig;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import h.f.b.l;
import h.j.g;
import h.m.p;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static int f127463a = BuildConfig.VERSION_CODE;

    static {
        Covode.recordClassIndex(83570);
    }

    private static Context a(Application application) {
        Context applicationContext = application.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public static final void b(EditText editText) {
        if (editText != null) {
            editText.setFocusable(true);
            editText.setFocusableInTouchMode(true);
            editText.requestFocus();
            Application application = i.f115645a;
            l.b(application, "");
            KeyboardUtils.b(editText, a(application));
            editText.setSelection(editText.getText().length());
        }
    }

    public static final int a(EditText editText) {
        if (editText == null) {
            return 0;
        }
        int a2 = en.a((double) f127463a, i.f115645a);
        try {
            String obj = editText.getText().toString();
            Editable text = editText.getText();
            l.b(text, "");
            if (p.c(text, " ")) {
                obj = p.a(editText.getText().toString(), new g(0, editText.getText().toString().length() - 2)) + "-";
            }
            return new StaticLayout(obj, editText.getPaint(), a2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static final void a(EditText editText, int i2, int i3) {
        if (editText != null) {
            int i4 = Build.VERSION.SDK_INT;
            editText.setPaddingRelative(i2, 0, i3, 0);
        }
    }
}

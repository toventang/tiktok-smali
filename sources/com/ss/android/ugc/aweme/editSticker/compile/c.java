package com.ss.android.ugc.aweme.editSticker.compile;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;

public abstract class c {
    static {
        Covode.recordClassIndex(55388);
    }

    /* access modifiers changed from: protected */
    public abstract String a(String str, int i2);

    private static boolean a(File file) {
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                return false;
            }
        } catch (Throwable unused) {
        }
        return file.delete();
    }

    public final i<b> a(View view, View view2, String str, int i2, int i3, int i4, int i5) {
        if (view == null || view2 == null || TextUtils.isEmpty(str)) {
            return i.a((Exception) new NullPointerException("stickerView = " + view + ", stickerLayout = " + view2 + "draftDir = " + str));
        }
        return b(view, view2, str, i2, i3, i4, i5);
    }

    private i<b> b(View view, View view2, String str, int i2, int i3, int i4, int i5) {
        String a2 = a(str, ((ViewGroup) view2).indexOfChild(view));
        File file = new File(a2);
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    com.ss.android.ugc.tools.utils.i.c(a2);
                } else {
                    a(file);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        com.ss.android.ugc.tools.utils.i.a(a2, true);
        return i.b(new d(this, i2, i3, view2, view, i4, i5), i.f4826c).c(new e(a2, view), i.f4824a);
    }
}

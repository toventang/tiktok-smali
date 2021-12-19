package com.ss.android.ugc.trill.i;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

public final class a {
    static {
        Covode.recordClassIndex(98968);
    }

    private static void a(Context context) {
        String b2 = f.b(context);
        a(b2);
        try {
            WebView.setDataDirectorySuffix(b2);
        } catch (Exception e2) {
            n.a("web_view_set_directory_error", new c().a("errorCode", (Integer) 4001).a("errorDesc", "setDataDirectorySuffix error:" + e2.getMessage()).a("processName", b2).a());
        }
    }

    private static void a(String str) {
        if (str == null) {
            n.a("web_view_set_directory_error", new c().a("errorCode", (Integer) 4002).a("errorDesc", "processName == null").a());
        }
        if (TextUtils.equals("", str)) {
            n.a("web_view_set_directory_error", new c().a("errorCode", (Integer) 4003).a("errorDesc", "processName is empty").a());
        }
    }

    private static void b(Context context) {
        File file = new File(context.getDataDir().getAbsolutePath() + "/app_webview/webview_data.lock");
        if (file.exists()) {
            try {
                FileLock tryLock = new RandomAccessFile(file, "rw").getChannel().tryLock();
                if (tryLock != null) {
                    tryLock.close();
                    return;
                }
                boolean a2 = a(file);
                n.a("web_view_set_directory_error", new c().a("errorCode", (Integer) 4005).a("errorDesc", "web_view.lock locked, need delete:" + a2 + " isCreateNew:" + a(file, a2)).a());
            } catch (Exception e2) {
                boolean z = false;
                if (file.exists()) {
                    z = a(file);
                }
                n.a("web_view_set_directory_error", new c().a("errorCode", (Integer) 4004).a("errorDesc", "web_view.lock locked, need delete:" + z + " isCreateNew:" + a(file, z) + " e:" + e2.getMessage()).a());
            }
        }
    }

    private static boolean a(File file) {
        MethodCollector.i(6262);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(6262);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(6262);
        return delete;
    }

    public static void a(boolean z, Context context) {
        if (Build.VERSION.SDK_INT < 28) {
            return;
        }
        if (z) {
            b(context);
        } else {
            a(context);
        }
    }

    private static boolean a(File file, boolean z) {
        if (z && !file.exists()) {
            try {
                return file.createNewFile();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }
}

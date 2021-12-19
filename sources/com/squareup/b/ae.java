package com.squareup.b;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.android.ugc.aweme.lancet.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;

/* access modifiers changed from: package-private */
public final class ae {

    /* renamed from: a  reason: collision with root package name */
    static final StringBuilder f58001a = new StringBuilder();

    static class b implements ThreadFactory {
        static {
            Covode.recordClassIndex(36042);
        }

        b() {
        }

        public final Thread newThread(Runnable runnable) {
            return new a(runnable);
        }
    }

    static void a() {
        if (!b()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    static void a(String str, String str2, String str3) {
        a(str, str2, str3, "");
    }

    static void a(String str, String str2, String str3, String str4) {
        com.a.a("%1$-11s %2$-12s %3$s %4$s", new Object[]{str, str2, str3, str4});
    }

    private static String a(w wVar, StringBuilder sb) {
        if (wVar.f58117f != null) {
            sb.ensureCapacity(wVar.f58117f.length() + 50);
            sb.append(wVar.f58117f);
        } else if (wVar.f58115d != null) {
            String uri = wVar.f58115d.toString();
            sb.ensureCapacity(uri.length() + 50);
            sb.append(uri);
        } else {
            sb.ensureCapacity(50);
            sb.append(wVar.f58116e);
        }
        sb.append('\n');
        if (wVar.f58124m != 0.0f) {
            sb.append("rotation:").append(wVar.f58124m);
            if (wVar.p) {
                sb.append('@').append(wVar.n).append('x').append(wVar.o);
            }
            sb.append('\n');
        }
        if (wVar.c()) {
            sb.append("resize:").append(wVar.f58119h).append('x').append(wVar.f58120i);
            sb.append('\n');
        }
        if (wVar.f58121j) {
            sb.append("centerCrop\n");
        } else if (wVar.f58122k) {
            sb.append("centerInside\n");
        }
        if (wVar.f58118g != null) {
            int size = wVar.f58118g.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append(wVar.f58118g.get(i2).b());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    static boolean a(String str) {
        if (str == null) {
            return false;
        }
        String[] split = str.split(" ", 2);
        if ("CACHE".equals(split[0])) {
            return true;
        }
        if (split.length == 1) {
            return false;
        }
        try {
            if (!"CONDITIONAL_CACHE".equals(split[0]) || Integer.parseInt(split[1]) != 304) {
                return false;
            }
            return true;
        } catch (NumberFormatException unused) {
        }
    }

    static void a(Looper looper) {
        AnonymousClass1 r3 = new Handler(looper) {
            /* class com.squareup.b.ae.AnonymousClass1 */

            static {
                Covode.recordClassIndex(36040);
            }

            public final void handleMessage(Message message) {
                sendMessageDelayed(obtainMessage(), 1000);
            }
        };
        r3.sendMessageDelayed(r3.obtainMessage(), 1000);
    }

    static class a extends Thread {
        static {
            Covode.recordClassIndex(36041);
        }

        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }

        public a(Runnable runnable) {
            super(runnable);
        }
    }

    static {
        Covode.recordClassIndex(36039);
    }

    private static boolean b() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    static String a(c cVar) {
        return a(cVar, "");
    }

    static String a(w wVar) {
        StringBuilder sb = f58001a;
        String a2 = a(wVar, sb);
        sb.setLength(0);
        return a2;
    }

    static boolean c(Context context) {
        try {
            if (Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
                return true;
            }
            return false;
        } catch (NullPointerException unused) {
        }
    }

    private static Context d(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    static int a(Bitmap bitmap) {
        int i2 = Build.VERSION.SDK_INT;
        int byteCount = bitmap.getByteCount();
        if (byteCount >= 0) {
            return byteCount;
        }
        throw new IllegalStateException("Negative size: ".concat(String.valueOf(bitmap)));
    }

    static File b(Context context) {
        File file = new File(e(d(context)), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static File e(Context context) {
        if (d.f107194b != null && d.f107197e) {
            return d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        d.f107194b = cacheDir;
        return cacheDir;
    }

    static long a(File file) {
        long j2;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j2 = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 50;
        } catch (IllegalArgumentException unused) {
            j2 = 5242880;
        }
        return Math.max(Math.min(j2, 52428800L), 5242880L);
    }

    static byte[] b(InputStream inputStream) {
        MethodCollector.i(3378);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                MethodCollector.o(3378);
                return byteArray;
            }
        }
    }

    static j a(Context context) {
        try {
            Class.forName("com.squareup.a.t");
            return new s(context);
        } catch (ClassNotFoundException unused) {
            return new ad(context);
        }
    }

    static <T> T a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    static Resources a(Context context, w wVar) {
        if (wVar.f58116e != 0 || wVar.f58115d == null) {
            return context.getResources();
        }
        String authority = wVar.f58115d.getAuthority();
        if (authority != null) {
            try {
                return context.getPackageManager().getResourcesForApplication(authority);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new FileNotFoundException("Unable to obtain resources for package: " + wVar.f58115d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + wVar.f58115d);
        }
    }

    static int a(Resources resources, w wVar) {
        if (wVar.f58116e != 0 || wVar.f58115d == null) {
            return wVar.f58116e;
        }
        String authority = wVar.f58115d.getAuthority();
        if (authority != null) {
            List<String> pathSegments = wVar.f58115d.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                throw new FileNotFoundException("No path segments: " + wVar.f58115d);
            } else if (pathSegments.size() == 1) {
                try {
                    return Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Last path segment is not a resource ID: " + wVar.f58115d);
                }
            } else if (pathSegments.size() == 2) {
                return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            } else {
                throw new FileNotFoundException("More than two path segments: " + wVar.f58115d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + wVar.f58115d);
        }
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(3373);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            c.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(3373);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    static String a(c cVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        a aVar = cVar.f58014k;
        if (aVar != null) {
            sb.append(aVar.f57956b.a());
        }
        List<a> list = cVar.f58015l;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0 || aVar != null) {
                    sb.append(", ");
                }
                sb.append(list.get(i2).f57956b.a());
            }
        }
        return sb.toString();
    }
}

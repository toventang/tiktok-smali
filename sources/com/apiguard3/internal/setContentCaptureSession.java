package com.apiguard3.internal;

import android.content.Context;
import android.util.Log;
import com.apiguard3.internal.setImportantForAutofill;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.io.FilenameFilter;
import java.util.HashSet;
import java.util.Set;

public final class setContentCaptureSession {
    private static int getBody = 1;
    private static int getMethod;
    private setImportantForAutofill.getMethod AGRequest;
    private setImportantForAutofill.getBody getHeaders;
    private Set<String> getUrl;

    static {
        Covode.recordClassIndex(2582);
    }

    protected setContentCaptureSession() {
        this(new setAccessibilityTraversalBefore(), new setAutofillId());
    }

    public static boolean com_apiguard3_internal_setContentCaptureSession_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        MethodCollector.i(2669);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.b(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(2669);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(2669);
        return delete;
    }

    private setContentCaptureSession(setImportantForAutofill.getBody getbody, setImportantForAutofill.getMethod getmethod) {
        this.getUrl = new HashSet();
        this.getHeaders = getbody;
        this.AGRequest = getmethod;
    }

    private void getHeaders(Context context, String str, String str2) {
        File dir = context.getDir("lib", 0);
        File method = getMethod(context, str, str2);
        final String body = this.getHeaders.getBody(str);
        File[] listFiles = dir.listFiles(new FilenameFilter() {
            /* class com.apiguard3.internal.setContentCaptureSession.AnonymousClass1 */
            private static int getBody = 1;
            private static int getMethod;

            static {
                Covode.recordClassIndex(2583);
            }

            public final boolean accept(File file, String str) {
                char c2 = 'E';
                int i2 = getBody + 69;
                getMethod = i2 % 128;
                if (i2 % 2 != 0) {
                    c2 = 'D';
                }
                boolean startsWith = str.startsWith(body);
                if (c2 != 'D') {
                    return startsWith;
                }
                throw new NullPointerException("hashCode");
            }
        });
        if (listFiles != null) {
            int length = listFiles.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = getMethod + 9;
                getBody = i3 % 128;
                int i4 = i3 % 2;
                File file = listFiles[i2];
                if (!file.getAbsolutePath().equals(method.getAbsolutePath())) {
                    int i5 = getBody + 37;
                    getMethod = i5 % 128;
                    int i6 = i5 % 2;
                    com_apiguard3_internal_setContentCaptureSession_com_ss_android_ugc_aweme_storage_FileLancet_delete(file);
                }
                i2++;
                int i7 = getBody + 45;
                getMethod = i7 % 128;
                int i8 = i7 % 2;
            }
        }
    }

    private File getMethod(Context context, String str, String str2) {
        int i2 = getBody + 95;
        getMethod = i2 % 128;
        int i3 = i2 % 2;
        String body = this.getHeaders.getBody(str);
        if (setImportantForAutofill.getMethod(str2)) {
            return new File(context.getDir("lib", 0), body);
        }
        File file = new File(context.getDir("lib", 0), new StringBuilder().append(body).append(".").append(str2).toString());
        int i4 = getMethod + 73;
        getBody = i4 % 128;
        int i5 = i4 % 2;
        return file;
    }

    private void getUrl(Context context, String str, String str2) {
        boolean z;
        boolean z2 = false;
        if (!this.getUrl.contains(str)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            try {
                this.getHeaders.getHeaders(str);
                this.getUrl.add(str);
                Object[] objArr = new Object[2];
            } catch (UnsatisfiedLinkError e2) {
                Object[] objArr2 = new Object[1];
                Log.getStackTraceString(e2);
                Object[] objArr3 = new Object[2];
                File method = getMethod(context, str, str2);
                if (!method.exists()) {
                    getHeaders(context, str, str2);
                    this.AGRequest.getBody(context, this.getHeaders.getHeaders(), this.getHeaders.getBody(str), method, this);
                }
                this.getHeaders.AGRequest(method.getAbsolutePath());
                this.getUrl.add(str);
                Object[] objArr4 = new Object[2];
                int i2 = getBody + 83;
                getMethod = i2 % 128;
                int i3 = i2 % 2;
            }
        } else {
            int i4 = getMethod + 39;
            getBody = i4 % 128;
            if (i4 % 2 == 0) {
                z2 = true;
            }
            Object[] objArr5 = new Object[1];
            if (z2) {
                objArr5[1] = str;
            }
        }
    }

    static /* synthetic */ void getHeaders(setContentCaptureSession setcontentcapturesession, Context context, String str, String str2) {
        int i2 = getMethod + 41;
        getBody = i2 % 128;
        int i3 = i2 % 2;
        setcontentcapturesession.getUrl(context, str, str2);
        int i4 = getMethod + 59;
        getBody = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void getMethod(final Context context, final String str, String str2, final setImportantForAutofill.AGRequest aGRequest) {
        int i2 = getBody + 41;
        getMethod = i2 % 128;
        int i3 = i2 % 2;
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        } else if (!setImportantForAutofill.getMethod(str)) {
            Object[] objArr = new Object[1];
            if (aGRequest != null) {
                new Thread(new Runnable(null) {
                    /* class com.apiguard3.internal.setContentCaptureSession.AnonymousClass3 */
                    private static int method = 1;
                    private static int url;

                    static {
                        Covode.recordClassIndex(2584);
                    }

                    public final void run() {
                        int i2 = method + 39;
                        url = i2 % 128;
                        int i3 = i2 % 2;
                        try {
                            setContentCaptureSession.getHeaders(setContentCaptureSession.this, context, str, null);
                            aGRequest.getUrl();
                            int i4 = url + 99;
                            method = i4 % 128;
                            int i5 = i4 % 2;
                        } catch (UnsatisfiedLinkError e2) {
                            aGRequest.AGRequest(e2);
                        } catch (setRevealOnFocusHint e3) {
                            aGRequest.AGRequest(e3);
                        }
                    }
                }).start();
                int i4 = getMethod + 107;
                getBody = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            getUrl(context, str, null);
        } else {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
    }
}

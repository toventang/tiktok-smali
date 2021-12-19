package com.bytedance.crash.util;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.util.g;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

public final class ab {

    /* renamed from: a  reason: collision with root package name */
    private static final StackTraceElement f27977a = new StackTraceElement("", "", "", 0);

    public static void a(Throwable th, int i2) {
        String localizedMessage = th.getLocalizedMessage();
        try {
            a(th.getClass().getName(), i2);
            if (localizedMessage != null) {
                a(": ", i2);
                a(localizedMessage, i2);
            }
            a("\n", i2);
        } catch (Throwable unused) {
        }
    }

    private static void a(Throwable th, List<StackTraceElement> list) {
        if (th != null) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            newSetFromMap.add(th);
            list.add(f27977a);
            StackTraceElement[] stackTrace = th.getStackTrace();
            boolean z = stackTrace.length > 384;
            int length = stackTrace.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (z && i3 > 256) {
                    list.add(f27977a);
                    break;
                }
                list.add(stackTraceElement);
                i3++;
                i2++;
            }
            if (z) {
                for (int length2 = stackTrace.length - 128; length2 < stackTrace.length; length2++) {
                    list.add(stackTrace[length2]);
                }
            }
            int i4 = Build.VERSION.SDK_INT;
            for (Throwable th2 : th.getSuppressed()) {
                a(th2, list, "\t", newSetFromMap, 128);
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                a(cause, list, "", newSetFromMap, 128);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r5 != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.lang.Throwable r7, java.util.List<java.lang.StackTraceElement> r8, java.lang.String r9, java.util.Set<java.lang.Throwable> r10, int r11) {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.ab.a(java.lang.Throwable, java.util.List, java.lang.String, java.util.Set, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0074, code lost:
        if (r7 != false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.lang.Throwable r13, java.io.PrintWriter r14) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.ab.a(java.lang.Throwable, java.io.PrintWriter):void");
    }

    public static void a(Throwable th, int i2, String str, String str2) {
        while (true) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            try {
                NativeTools.a().a(i2, str2);
                NativeTools.a().a(i2, str);
            } catch (Throwable unused) {
            }
            a(th, i2);
            for (StackTraceElement stackTraceElement : stackTrace) {
                a(stackTraceElement, i2);
            }
            int i3 = Build.VERSION.SDK_INT;
            Throwable[] suppressed = th.getSuppressed();
            int length = suppressed.length;
            for (int i4 = 0; i4 < length; i4++) {
                a(suppressed[i4], i2, "Suppressed: ", str2 + "\t");
            }
            th = th.getCause();
            if (th != null) {
                str = "Caused by: ";
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a3, code lost:
        if (r9 != false) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.lang.Throwable r15, java.io.PrintWriter r16, java.lang.String r17, java.lang.String r18, java.util.Set<java.lang.Throwable> r19, int r20) {
        /*
        // Method dump skipped, instructions count: 235
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.ab.a(java.lang.Throwable, java.io.PrintWriter, java.lang.String, java.lang.String, java.util.Set, int):void");
    }

    static {
        Covode.recordClassIndex(16371);
    }

    public static String a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            a(th, printWriter);
            String stringWriter2 = stringWriter.toString();
            printWriter.close();
            return stringWriter2;
        } catch (Throwable unused) {
            printWriter.close();
            return "";
        }
    }

    public static StackTraceElement[] b(Throwable th) {
        ArrayList arrayList = new ArrayList();
        try {
            a(th, arrayList);
        } catch (Throwable unused) {
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]);
    }

    public static boolean c(Throwable th) {
        if (th == null) {
            return false;
        }
        int i2 = 0;
        while (!(th instanceof OutOfMemoryError)) {
            if (i2 > 20) {
                return false;
            }
            i2++;
            try {
                th = th.getCause();
                if (th == null) {
                    return false;
                }
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    public static boolean d(Throwable th) {
        if (th == null) {
            return false;
        }
        int i2 = 0;
        while (true) {
            try {
                if (th instanceof OutOfMemoryError) {
                    if (!th.getMessage().contains("allocate")) {
                        if (th.getMessage().contains("thrown")) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (i2 > 20) {
                    return false;
                }
                i2++;
                th = th.getCause();
                if (th == null) {
                    return false;
                }
            } catch (Throwable unused) {
                return true;
            }
        }
        return true;
    }

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[(bArr.length * 2)];
        int i2 = 0;
        for (byte b2 : bArr) {
            int i3 = i2 + 1;
            cArr2[i2] = cArr[(b2 >>> 4) & 15];
            i2 = i3 + 1;
            cArr2[i3] = cArr[b2 & 15];
        }
        return new String(cArr2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.ab.a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d6 A[Catch:{ all -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0027 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject b(java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.ab.b(java.lang.String):org.json.JSONObject");
    }

    public static String a(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            a(stackTraceElement, sb);
        }
        return sb.toString();
    }

    private static void a(String str, int i2) {
        NativeTools.a().a(i2, str);
    }

    public static StringBuilder a(StackTraceElement stackTraceElement, StringBuilder sb) {
        sb.append("  at ").append(stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append("(").append(stackTraceElement.getFileName()).append(":").append(stackTraceElement.getLineNumber()).append(")\n");
        return sb;
    }

    public static void a(StackTraceElement stackTraceElement, int i2) {
        try {
            a("\tat ", i2);
            a(stackTraceElement.getClassName(), i2);
            a(".", i2);
            a(stackTraceElement.getMethodName(), i2);
            if (stackTraceElement.isNativeMethod()) {
                a("(Native Method)", i2);
            } else if (stackTraceElement.getFileName() != null) {
                if (stackTraceElement.getLineNumber() >= 0) {
                    a("(", i2);
                    a(stackTraceElement.getFileName(), i2);
                    a(":", i2);
                    a(String.valueOf(stackTraceElement.getLineNumber()), i2);
                    a(")", i2);
                } else {
                    a("(", i2);
                    a(stackTraceElement.getFileName(), i2);
                    a(")", i2);
                }
            } else if (stackTraceElement.getLineNumber() >= 0) {
                a("(Unknown Source:", i2);
                a(String.valueOf(stackTraceElement.getLineNumber()), i2);
                a(")", i2);
            } else {
                a("(Unknown Source)", i2);
            }
            a("\n", i2);
        } catch (Throwable unused) {
        }
    }

    public static String a(Throwable th, PrintStream printStream, g.a aVar) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (Throwable unused) {
            messageDigest = null;
        }
        g gVar = new g(printStream, messageDigest, aVar);
        try {
            a(th, gVar);
        } catch (Throwable unused2) {
        }
        gVar.close();
        if (messageDigest != null) {
            return a(messageDigest.digest());
        }
        return null;
    }
}

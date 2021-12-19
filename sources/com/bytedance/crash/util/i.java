package com.bytedance.crash.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Map;

public final class i {
    static {
        Covode.recordClassIndex(16384);
    }

    private static String b(String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        do {
            int i3 = 6;
            do {
                int i4 = i2 + i3;
                sb.append(str.substring(i4, i4 + 2));
                i3 -= 2;
            } while (i3 >= 0);
            sb.append(':');
            i2 += 8;
        } while (i2 <= 16);
        return sb.toString();
    }

    private static String c(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 6; i2 >= 0; i2 -= 2) {
            try {
                sb.append(Integer.parseInt(str.substring(i2, i2 + 2), 16));
                if (i2 != 0) {
                    sb.append('.');
                }
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return sb.toString();
    }

    private static String a(String str) {
        String c2;
        String[] split = str.split(":");
        if (split.length != 2) {
            return null;
        }
        try {
            long parseLong = Long.parseLong(split[1], 16);
            String str2 = split[0];
            if (str2.length() == 8) {
                String c3 = c(str2);
                if (c3 == null) {
                    return null;
                }
                return c3 + ":" + parseLong;
            } else if (str2.length() != 32 || (c2 = c(str2.substring(24))) == null) {
                return null;
            } else {
                return b(str2.substring(0, 24)) + c2 + ":" + parseLong;
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    private static boolean a(File file) {
        MethodCollector.i(7053);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(7053);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(7053);
        return delete;
    }

    public static void a(File file, File file2) {
        try {
            b(file, file2);
        } catch (Throwable th) {
            d.a("NPTH_CATCH", th);
        }
    }

    private static void a(File file, Map<Long, String> map) {
        Throwable th;
        int i2;
        String a2;
        MethodCollector.i(6984);
        if (!file.exists()) {
            MethodCollector.o(6984);
            return;
        }
        int[] iArr = {1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        String[] strArr = {"sl", "local_address", "st", "tx_queue", "rx_queue", "tr", "tm->when", "retrnsmt", "uid", "timeout", "inode"};
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                String readLine = bufferedReader2.readLine();
                if (readLine == null) {
                    m.a(bufferedReader2);
                    MethodCollector.o(6984);
                    return;
                }
                String[] split = readLine.split("\\s+");
                if (split.length <= iArr[10]) {
                    m.a(bufferedReader2);
                    MethodCollector.o(6984);
                    return;
                }
                int i3 = 0;
                while (split[iArr[i3]].equals(strArr[i3])) {
                    i3++;
                    if (i3 >= 11) {
                        while (true) {
                            String readLine2 = bufferedReader2.readLine();
                            if (readLine2 != null) {
                                String[] split2 = readLine2.split("\\s+");
                                if (split2.length != 0) {
                                    if (split2[0].length() != 0) {
                                        i2 = -1;
                                    } else {
                                        i2 = 0;
                                    }
                                    int i4 = i2 + 10;
                                    if (split2.length > i4) {
                                        try {
                                            Long valueOf = Long.valueOf(Long.parseLong(split2[i4]));
                                            if (!(valueOf.longValue() == 0 || (a2 = a(split2[i2 + 3])) == null)) {
                                                map.put(valueOf, a2);
                                            }
                                        } catch (NumberFormatException unused) {
                                        }
                                    }
                                }
                            } else {
                                m.a(bufferedReader2);
                                MethodCollector.o(6984);
                                return;
                            }
                        }
                    }
                }
                m.a(bufferedReader2);
                MethodCollector.o(6984);
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
                try {
                    d.a("NPTH_CATCH", th);
                } finally {
                    m.a(bufferedReader);
                    MethodCollector.o(6984);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            d.a("NPTH_CATCH", th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f6 A[SYNTHETIC, Splitter:B:44:0x00f6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(java.io.File r17, java.io.File r18) {
        /*
        // Method dump skipped, instructions count: 326
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.i.b(java.io.File, java.io.File):void");
    }
}

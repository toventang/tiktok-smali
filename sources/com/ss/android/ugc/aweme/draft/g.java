package com.ss.android.ugc.aweme.draft;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.b;
import com.ss.android.ugc.tools.utils.i;
import h.f.b.l;
import java.io.File;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f83133a = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(51838);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f83134a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f83135b;

        static {
            Covode.recordClassIndex(51839);
        }

        a(String str, String str2) {
            this.f83134a = str;
            this.f83135b = str2;
        }

        public final void run() {
            long j2;
            File file = new File(this.f83134a);
            if (file.exists() && file.isDirectory()) {
                k.a("[logFileInfo]: current creation id: " + this.f83135b);
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        l.b(file2, "");
                        if (file2.isFile()) {
                            j2 = file2.length();
                        } else {
                            j2 = -1;
                        }
                        k.a("[logFileInfo]: file path : " + file2 + " exist : " + file2.exists() + ", size: " + j2);
                    }
                }
            }
        }
    }

    public static void c(String str, String str2) {
        if (str != null && str.length() != 0) {
            b.f138752a.execute(new a(str, str2));
        }
    }

    public static String b(String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return "file path empty";
        }
        if (!i.a(str)) {
            return "src file not exist";
        }
        File file = new File(str2);
        if (!i.a(str2)) {
            i.a(str2, true);
        }
        if (!file.exists()) {
            return "dest not exist";
        }
        k.a("file size =  " + com.bytedance.common.utility.d.b.c(str) + " availableBytes = " + com.bytedance.common.utility.d.b.d(str2));
        String d2 = d(str, str2);
        k.a("src file =  " + str + " dest file = " + str2 + " ret = " + d2 + ' ');
        return d2;
    }

    public static String a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "file path empty";
        }
        File file = new File(str);
        String str3 = "src file not exist";
        if (!file.exists()) {
            return str3;
        }
        if (!file.isDirectory()) {
            k.a("src is not a directory");
            return str3;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            if (listFiles.length != 0) {
                File file2 = new File(str2);
                if (!file2.exists() || !file2.isDirectory()) {
                    file2.mkdirs();
                }
                if (!file2.exists()) {
                    return "dest not exist";
                }
                k.a("file size =  " + com.bytedance.common.utility.d.b.c(str) + " availableBytes = " + com.bytedance.common.utility.d.b.d(str2));
                str3 = "success";
                for (File file3 : listFiles) {
                    l.b(file3, "");
                    if (file3.isDirectory()) {
                        String path = file3.getPath();
                        l.b(path, "");
                        a(path, str2 + file3.getName() + File.separator);
                    } else {
                        String d2 = d(file3.getPath(), str2 + file3.getName());
                        k.a("src file =  " + file3.getPath() + " dest file = " + str2 + file3.getName() + " ret = " + d2 + ' ');
                        if (!l.a((Object) d2, (Object) "success")) {
                            str3 = d2;
                        }
                    }
                }
            }
        }
        return str3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0106 A[SYNTHETIC, Splitter:B:112:0x0106] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x010b A[Catch:{ IOException -> 0x0119 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0110 A[Catch:{ IOException -> 0x0119 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0115 A[Catch:{ IOException -> 0x0119 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0149 A[SYNTHETIC, Splitter:B:139:0x0149] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x014e A[Catch:{ IOException -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0153 A[Catch:{ IOException -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0158 A[Catch:{ IOException -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x016c A[SYNTHETIC, Splitter:B:157:0x016c] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0171 A[Catch:{ IOException -> 0x017f }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0176 A[Catch:{ IOException -> 0x017f }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x017b A[Catch:{ IOException -> 0x017f }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00b5 A[Catch:{ all -> 0x016a }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00b8 A[Catch:{ all -> 0x016a }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00c3 A[SYNTHETIC, Splitter:B:85:0x00c3] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00c8 A[Catch:{ IOException -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00cd A[Catch:{ IOException -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x00d2 A[Catch:{ IOException -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String d(java.lang.String r13, java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 391
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.draft.g.d(java.lang.String, java.lang.String):java.lang.String");
    }
}

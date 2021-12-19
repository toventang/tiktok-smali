package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import java.io.File;

public final class bb {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f68520a = {"app_assets", "cache/gift_assets", "cache/WebView", "app_webview", "files/music", "files/mvtheme", "files/font"};

    /* renamed from: b  reason: collision with root package name */
    private final a f68521b;

    /* renamed from: c  reason: collision with root package name */
    private final File f68522c;

    public interface a {
        static {
            Covode.recordClassIndex(42186);
        }

        void a(String str);
    }

    static {
        Covode.recordClassIndex(42185);
    }

    private void a() {
        if (this.f68522c.exists()) {
            StringBuilder sb = new StringBuilder();
            a(this.f68522c, sb, 0);
            this.f68521b.a(sb.toString());
        }
    }

    private long a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j2 = 0;
        if (listFiles == null) {
            return 0;
        }
        for (File file2 : listFiles) {
            j2 += a(file2);
        }
        return j2;
    }

    private bb(String str, a aVar) {
        this.f68522c = new File(str);
        this.f68521b = aVar;
    }

    public static void a(File file, String str) {
        if (file != null) {
            new bb(file.getAbsolutePath(), new bc(str)).a();
        }
    }

    private void a(File file, StringBuilder sb) {
        sb.append("name = ").append(file.getAbsolutePath()).append(", size = ").append(a(file)).append("\n");
    }

    private void a(File file, StringBuilder sb, int i2) {
        if (i2 <= 4) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        a(file2, sb);
                        String absolutePath = file2.getAbsolutePath();
                        String[] strArr = f68520a;
                        int length = strArr.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                a(file2, sb, 1 + i2);
                                break;
                            } else if (absolutePath.contains(strArr[i3])) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
            } else if (i2 == 0) {
                a(file, sb);
            }
        }
    }
}

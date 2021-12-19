package ms.bd.o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import ms.bd.o.n;

public class l implements n.a {

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public ZipFile f159516a;

        /* renamed from: b  reason: collision with root package name */
        public ZipEntry f159517b;

        static {
            Covode.recordClassIndex(105923);
        }

        public a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f159516a = zipFile;
            this.f159517b = zipEntry;
        }
    }

    static {
        Covode.recordClassIndex(105922);
    }

    static a a(Context context, String[] strArr, String str) {
        MethodCollector.i(8742);
        String[] a2 = a(context);
        int length = a2.length;
        char c2 = 0;
        int i2 = 0;
        while (i2 < length) {
            String str2 = a2[i2];
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= 5) {
                    break;
                }
                try {
                    ZipFile zipFile = new ZipFile(new File(str2), 1);
                    int i5 = 0;
                    while (true) {
                        int i6 = i5 + 1;
                        if (i5 < 5) {
                            int length2 = strArr.length;
                            int i7 = 0;
                            while (i7 < length2) {
                                String str3 = "lib" + File.separatorChar + strArr[i7] + File.separatorChar + str;
                                Object[] objArr = new Object[2];
                                objArr[c2] = str3;
                                objArr[1] = str2;
                                o.a("Looking for %s in APK %s...", objArr);
                                ZipEntry entry = zipFile.getEntry(str3);
                                if (entry != null) {
                                    a aVar = new a(zipFile, entry);
                                    MethodCollector.o(8742);
                                    return aVar;
                                }
                                i7++;
                                c2 = 0;
                            }
                            i5 = i6;
                        } else {
                            try {
                                zipFile.close();
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                } catch (IOException unused2) {
                    i3 = i4;
                }
            }
            i2++;
            c2 = 0;
        }
        MethodCollector.o(8742);
        return null;
    }

    static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static String[] a(Context context) {
        String[] strArr;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (Build.VERSION.SDK_INT < 21 || (strArr = applicationInfo.splitSourceDirs) == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[(strArr.length + 1)];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    static String[] a(Context context, String str) {
        MethodCollector.i(8948);
        Pattern compile = Pattern.compile("lib" + File.separatorChar + "([^\\" + File.separatorChar + "]*)" + File.separatorChar + str);
        HashSet hashSet = new HashSet();
        for (String str2 : a(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(((ZipEntry) entries.nextElement()).getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        String[] strArr = (String[]) hashSet.toArray(new String[hashSet.size()]);
        MethodCollector.o(8948);
        return strArr;
    }
}

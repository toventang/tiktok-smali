package com.bytedance.common.jato.fdio;

import android.content.Context;
import android.os.Build;
import com.bytedance.common.jato.Jato;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class FDIOCollector implements b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f26847a;

    /* renamed from: b  reason: collision with root package name */
    private ExecutorService f26848b = Jato.getWorkExecutorService();

    /* renamed from: c  reason: collision with root package name */
    private Context f26849c = Jato.getContext();

    /* renamed from: d  reason: collision with root package name */
    private String f26850d;

    static {
        Covode.recordClassIndex(15835);
    }

    private static native void nativeEndCollect(String str, String str2, boolean z, boolean z2);

    private static native void nativeStartCollect(String str, String str2, List<String> list);

    @Override // com.bytedance.common.jato.fdio.b
    public final void a(boolean z) {
        MethodCollector.i(7548);
        if (this.f26848b == null || this.f26849c == null || this.f26850d.isEmpty()) {
            MethodCollector.o(7548);
            return;
        }
        StringBuilder sb = new StringBuilder();
        Context context = this.f26849c;
        if (d.f107194b == null || !d.f107197e) {
            d.f107194b = context.getCacheDir();
        }
        String sb2 = sb.append(d.f107194b.getAbsolutePath()).append(File.separator).append("jato_fdio").append(File.separator).append(this.f26850d).toString();
        File parentFile = new File(sb2).getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            nativeEndCollect(this.f26850d, sb2, this.f26847a, z);
            MethodCollector.o(7548);
        } catch (Throwable unused) {
            MethodCollector.o(7548);
        }
    }

    @Override // com.bytedance.common.jato.fdio.b
    public final void a(String str, boolean z) {
        Context context;
        String str2;
        MethodCollector.i(7485);
        if (this.f26848b == null || (context = this.f26849c) == null) {
            MethodCollector.o(7485);
            return;
        }
        this.f26850d = str;
        String packageCodePath = context.getPackageCodePath();
        String substring = packageCodePath.substring(0, packageCodePath.lastIndexOf("/"));
        if (Build.VERSION.SDK_INT < 29) {
            str2 = System.getenv("BOOTCLASSPATH");
        } else {
            str2 = System.getenv("DEX2OATBOOTCLASSPATH");
        }
        ArrayList arrayList = new ArrayList(30);
        if (str2 != null) {
            String[] split = str2.split(":");
            for (String str3 : split) {
                if (str3.endsWith(".apk")) {
                    arrayList.add(str3);
                }
                try {
                    arrayList.add(str3.substring(str3.lastIndexOf("/") + 1, str3.lastIndexOf(".")));
                } catch (Throwable unused) {
                }
            }
        }
        nativeStartCollect(str, substring, arrayList);
        MethodCollector.o(7485);
    }
}

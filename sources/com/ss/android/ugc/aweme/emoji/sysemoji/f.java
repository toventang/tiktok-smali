package com.ss.android.ugc.aweme.emoji.sysemoji;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.utils.dg;
import h.a.i;
import h.a.r;
import h.e.b;
import h.e.c;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f89384a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static final String f89385b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f89386c;

    /* renamed from: d  reason: collision with root package name */
    private static final int f89387d = n.a(32.0d);

    private f() {
    }

    public static String a() {
        return f89386c + "tmp/";
    }

    static {
        Covode.recordClassIndex(56161);
        String str = "/data/data/" + d.a().getPackageName() + '/';
        f89385b = str;
        f89386c = str + "system_emoji_res/";
    }

    public static String a(String str) {
        l.d(str, "");
        return f89386c + str + File.separator;
    }

    public final void b(String str) {
        File[] listFiles;
        l.d(str, "");
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    l.b(file2, "");
                    if (file2.isDirectory()) {
                        String path = file2.getPath();
                        l.b(path, "");
                        b(path);
                    } else {
                        a(file2);
                    }
                }
                a(file);
            }
        }
    }

    public static boolean a(File file) {
        MethodCollector.i(3119);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(3119);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(3119);
        return delete;
    }

    public final synchronized void a(String... strArr) {
        MethodCollector.i(3772);
        l.d(strArr, "");
        File file = new File(f89386c);
        if (!file.exists() || !file.isDirectory()) {
            MethodCollector.o(3772);
            return;
        }
        File[] listFiles = file.listFiles(new a(strArr));
        l.b(listFiles, "");
        for (File file2 : listFiles) {
            l.b(file2, "");
            if (file2.isDirectory()) {
                f fVar = f89384a;
                String absolutePath = file2.getAbsolutePath();
                l.b(absolutePath, "");
                fVar.b(absolutePath);
            } else {
                a(file2);
            }
        }
        MethodCollector.o(3772);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements FilenameFilter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String[] f89388a;

        static {
            Covode.recordClassIndex(56162);
        }

        a(String[] strArr) {
            this.f89388a = strArr;
        }

        public final boolean accept(File file, String str) {
            String[] strArr = this.f89388a;
            l.b(str, "");
            if (!i.a(strArr, p.b(str, (CharSequence) ".zip"))) {
                return true;
            }
            return false;
        }
    }

    private static long a(InputStream inputStream, File file) {
        MethodCollector.i(3763);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            long j2 = b.a(inputStream, fileOutputStream, 8192);
            c.a(fileOutputStream, null);
            MethodCollector.o(3763);
            return j2;
        } catch (Throwable th) {
            c.a(fileOutputStream, th);
            MethodCollector.o(3763);
            throw th;
        }
    }

    public final synchronized void a(String str, List<i> list) {
        MethodCollector.i(3126);
        l.d(str, "");
        l.d(list, "");
        File file = new File(a(str));
        if (!file.exists() || !file.isDirectory()) {
            com.ss.android.ugc.aweme.framework.a.a.b(3, null, "ImSysEmojiFileHelper restore, cacheDir not exist");
            MethodCollector.o(3126);
            return;
        }
        com.ss.android.ugc.aweme.emoji.utils.f.a(new File(file, "emoji_model_info"), list);
        MethodCollector.o(3126);
    }

    public final boolean a(String str, String str2) {
        int i2;
        Throwable th;
        MethodCollector.i(3112);
        l.d(str, "");
        l.d(str2, "");
        int i3 = 3;
        com.ss.android.ugc.aweme.framework.a.a.b(3, null, "ImSysEmojiFileHelper unZipFile: zipFilePath=" + str + ", outputDirPath=" + str2);
        File file = new File(str2);
        if (file.exists()) {
            com.ss.android.ugc.aweme.framework.a.a.b(3, null, "ImSysEmojiFileHelper unZipFile baseDir exits");
            b(str2);
        }
        file.mkdirs();
        File file2 = new File(str);
        if (file2.exists()) {
            String name = file2.getName();
            l.b(name, "");
            if (p.c(name, ".zip", false)) {
                try {
                    ZipFile zipFile = new ZipFile(file2);
                    try {
                        ZipFile zipFile2 = zipFile;
                        Enumeration<? extends ZipEntry> entries = zipFile2.entries();
                        l.b(entries, "");
                        l.d(entries, "");
                        r.a aVar = new r.a(entries);
                        boolean z = true;
                        boolean z2 = false;
                        while (true) {
                            if (!aVar.hasNext()) {
                                z = z2;
                                break;
                            }
                            ZipEntry zipEntry = (ZipEntry) aVar.next();
                            l.b(zipEntry, "");
                            String name2 = zipEntry.getName();
                            l.b(name2, "");
                            if (p.b(name2, "system_emoji_", false)) {
                                String name3 = zipEntry.getName();
                                l.b(name3, "");
                                if (!p.e((CharSequence) name3, (CharSequence) "../")) {
                                    com.ss.android.ugc.aweme.framework.a.a.b(i3, null, "ImSysEmojiFileHelper unZipFile entry=" + zipEntry.getName() + " emoji_info.json");
                                    File file3 = new File(file, "emoji_info.json");
                                    if (zipEntry.isDirectory()) {
                                        file3.mkdirs();
                                    } else {
                                        InputStream inputStream = zipFile2.getInputStream(zipEntry);
                                        try {
                                            InputStream inputStream2 = inputStream;
                                            l.b(inputStream2, "");
                                            a(inputStream2, file3);
                                            c.a(inputStream, null);
                                        } catch (Throwable th2) {
                                            try {
                                                c.a(inputStream, th);
                                                MethodCollector.o(3112);
                                                throw th2;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                try {
                                                    MethodCollector.o(i2);
                                                    throw th;
                                                } catch (Throwable th4) {
                                                    c.a(zipFile, th);
                                                    MethodCollector.o(i2);
                                                    throw th4;
                                                }
                                            }
                                        }
                                    }
                                    String a2 = com.ss.android.ugc.aweme.emoji.utils.f.a(file3);
                                    if (TextUtils.isEmpty(a2)) {
                                        com.ss.android.ugc.aweme.framework.a.a.b(i3, null, "ImSysEmojiFileHelper  TextUtils.isEmpty(infoJsonStr)");
                                        break;
                                    }
                                    try {
                                        k kVar = (k) dg.a(a2, k.class);
                                        if (kVar != null) {
                                            ArrayList arrayList = new ArrayList();
                                            List<a> d2 = kVar.getD();
                                            if (d2 != null) {
                                                ArrayList arrayList2 = new ArrayList(h.a.n.a((Iterable) d2, 10));
                                                for (T t : d2) {
                                                    if (Build.VERSION.SDK_INT >= Integer.parseInt(t.getAnd())) {
                                                        i iVar = new i();
                                                        iVar.setBusinessType(t.getBusiness());
                                                        List<String> emoji = t.getEmoji();
                                                        iVar.setPreviewEmoji(emoji != null ? emoji.get(0) : null);
                                                        iVar.setSupportSkinBusinessType(1);
                                                        iVar.setEmojiList(t.getEmoji());
                                                        iVar.setMiniSupportSysVersion(t.getAnd());
                                                        arrayList.add(iVar);
                                                    } else {
                                                        t = null;
                                                    }
                                                    arrayList2.add(t);
                                                }
                                            }
                                            StringBuilder sb = new StringBuilder("ImSysEmojiFileHelper resultResInfo size:  ");
                                            List<a> d3 = kVar.getD();
                                            com.ss.android.ugc.aweme.framework.a.a.b(3, null, sb.append(d3 != null ? Integer.valueOf(d3.size()) : null).append("   list ").append(arrayList.size()).toString());
                                            com.ss.android.ugc.aweme.emoji.utils.f.a(new File(file, "emoji_model_info"), arrayList);
                                        }
                                    } catch (Throwable th5) {
                                        com.ss.android.ugc.aweme.framework.a.a.a(th5);
                                    }
                                    z2 = true;
                                    i3 = 3;
                                }
                            }
                            com.ss.android.ugc.aweme.framework.a.a.b(3, null, "ImSysEmojiFileHelper unZipFile invalid entry: " + zipEntry.getName());
                            i3 = 3;
                        }
                        c.a(zipFile, null);
                        MethodCollector.o(3112);
                        return z;
                    } catch (Throwable th6) {
                        th = th6;
                        i2 = 3112;
                        MethodCollector.o(i2);
                        throw th;
                    }
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.framework.a.a.b(3, null, "ImSysEmojiFileHelper unZipFile cause exception: " + e2.getMessage());
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                    MethodCollector.o(3112);
                    return false;
                }
            }
        }
        a(file2);
        com.ss.android.ugc.aweme.framework.a.a.b(3, null, "ImSysEmojiFileHelper unZipFile zipFile invalid: " + str + ", " + str2);
        MethodCollector.o(3112);
        return false;
    }
}

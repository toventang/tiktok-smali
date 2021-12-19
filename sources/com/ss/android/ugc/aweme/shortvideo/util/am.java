package com.ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.refcache.FileLocker;
import com.bytedance.u.d;
import com.bytedance.u.f;
import com.google.c.c.l;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ICacheService;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.video.preload.i;
import com.ss.android.ugc.aweme.video.preload.s;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class am {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f132208a;

    /* renamed from: b  reason: collision with root package name */
    public static String f132209b;

    /* renamed from: c  reason: collision with root package name */
    private static String f132210c;

    /* renamed from: d  reason: collision with root package name */
    private static File f132211d;

    /* renamed from: e  reason: collision with root package name */
    private static File f132212e;

    static {
        Covode.recordClassIndex(86587);
    }

    static void a(File[] fileArr, Set<String> set) {
        if (!(fileArr == null || fileArr.length == 0)) {
            for (File file : fileArr) {
                if (f132208a) {
                    if (file != null && file.exists()) {
                        String absolutePath = file.getAbsolutePath();
                        if (TextUtils.isEmpty(absolutePath)) {
                            return;
                        }
                        if (file.isFile()) {
                            if (!set.contains(absolutePath) && (absolutePath.endsWith(".mp4") || absolutePath.endsWith(".mp3") || absolutePath.endsWith(".wav") || absolutePath.endsWith("-concat-v") || absolutePath.endsWith("-concat-a") || absolutePath.endsWith("_synthetise"))) {
                                e.c(absolutePath);
                            }
                        } else if (!set.contains(file.getName()) && !set.contains(file.getAbsolutePath())) {
                            a(file.listFiles(), set);
                            if (file.length() == 0) {
                                a(file);
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public static void a(List<File> list) {
        if (list != null && list.size() > 0) {
            for (File file : list) {
                if (file != null && file.exists()) {
                    file.getAbsolutePath();
                    if (FileLocker.a(file.getAbsolutePath())) {
                        file.getAbsolutePath();
                    } else {
                        a(file);
                    }
                }
            }
        }
    }

    private static boolean a(File file) {
        MethodCollector.i(5598);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(5598);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(5598);
        return delete;
    }

    public static void a() {
        a.a(new Runnable() {
            /* class com.ss.android.ugc.aweme.shortvideo.util.am.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ boolean f132213a = true;

            static {
                Covode.recordClassIndex(86588);
            }

            public final void run() {
                String str;
                File[] listFiles;
                n.a("aweme_clean_cached_files", new c().a("force", (Boolean) false).a());
                boolean z = this.f132213a;
                if (!am.f132208a) {
                    try {
                        str = AVExternalServiceImpl.a().configService().cacheConfig().rootDir();
                    } catch (Exception unused) {
                        str = "";
                    }
                    File file = new File(str);
                    if (file.exists() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
                        if (z || com.ss.android.ugc.aweme.video.e.d(str) >= 52428800) {
                            am.f132208a = true;
                            am.a(listFiles, am.b());
                            am.f132208a = false;
                        }
                    }
                }
            }
        });
    }

    public static File c() {
        File file = f132211d;
        if (file != null) {
            return file;
        }
        File b2 = d.b(com.bytedance.ies.ugc.appcontext.d.a(), f.PREFER_SD_CARD);
        if (b2 == null) {
            File b3 = com.ss.android.ugc.aweme.video.e.b();
            f132211d = b3;
            return b3;
        }
        File file2 = new File(b2, "picture");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        file2.getAbsolutePath();
        f132211d = file2;
        return file2;
    }

    private static List<File> e() {
        ICacheService iCacheService;
        String str = null;
        try {
            iCacheService = AVExternalServiceImpl.a().configService().cacheConfig();
        } catch (Exception unused) {
            iCacheService = null;
        }
        if (iCacheService == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        try {
            str = iCacheService.compatMusDraftDir();
        } catch (Exception unused2) {
        }
        if (str != null) {
            File file = new File(str);
            if (file.exists()) {
                ArrayList arrayList2 = new ArrayList();
                a(file, arrayList2);
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    public static Set<String> b() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(d());
        if (f132209b == null) {
            f132209b = Environment.getExternalStorageDirectory().getAbsolutePath() + "/DCIM/Camera/";
        }
        hashSet.add(new File(f132209b).getAbsolutePath());
        hashSet.add(a(com.bytedance.ies.ugc.appcontext.d.a(), (String) null) + "/splashad");
        hashSet.add(com.ss.android.ugc.aweme.video.e.c(com.bytedance.ies.ugc.appcontext.d.a()).getPath() + "/LiveWallpaper");
        Collection a2 = l.a((Collection) hashSet, (com.google.c.a.f) new com.google.c.a.f<String, String>() {
            /* class com.ss.android.ugc.aweme.shortvideo.util.am.AnonymousClass2 */

            static {
                Covode.recordClassIndex(86589);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.c.a.f
            public final /* synthetic */ String a(String str) {
                return str.replaceFirst("/data/data/", "/data/user/0/");
            }
        });
        Collection a3 = l.a((Collection) hashSet, (com.google.c.a.f) new com.google.c.a.f<String, String>() {
            /* class com.ss.android.ugc.aweme.shortvideo.util.am.AnonymousClass3 */

            static {
                Covode.recordClassIndex(86590);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.c.a.f
            public final /* synthetic */ String a(String str) {
                return str.replaceFirst("/data/user/0/", "/data/data/");
            }
        });
        HashSet hashSet2 = new HashSet();
        hashSet2.addAll(hashSet);
        hashSet2.addAll(a2);
        hashSet2.addAll(a3);
        return hashSet2;
    }

    private static Set<String> d() {
        ICacheService iCacheService;
        HashSet hashSet = new HashSet();
        try {
            iCacheService = AVExternalServiceImpl.a().configService().cacheConfig();
        } catch (Exception unused) {
            iCacheService = null;
        }
        if (iCacheService == null) {
            return hashSet;
        }
        if (com.ss.android.ugc.aweme.experiment.a.a.a()) {
            hashSet.addAll(iCacheService.allowList());
        } else {
            hashSet.addAll(iCacheService.draftAllowList());
        }
        hashSet.addAll(iCacheService.tempVideoFile());
        hashSet.addAll(iCacheService.originSoundFile());
        hashSet.add(iCacheService.mvRootDir());
        return hashSet;
    }

    public static File a(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107195c != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107195c;
        }
        File filesDir = context.getFilesDir();
        com.ss.android.ugc.aweme.lancet.d.f107195c = filesDir;
        return filesDir;
    }

    public static File b(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107194b != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        com.ss.android.ugc.aweme.lancet.d.f107194b = cacheDir;
        return cacheDir;
    }

    public static File c(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107193a != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107193a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        com.ss.android.ugc.aweme.lancet.d.f107193a = externalCacheDir;
        return externalCacheDir;
    }

    public static String e(Context context) {
        return d(context) + "tmp/";
    }

    public static String f(Context context) {
        return d(context) + "pic/";
    }

    public static String g(Context context) {
        return d(context) + "out/";
    }

    private static File i(Context context) {
        File a2;
        if (context == null || (a2 = a(context)) == null || !a2.exists()) {
            return null;
        }
        return new File(a2.getAbsolutePath() + File.separator + "music/download");
    }

    private static File j(Context context) {
        File a2;
        if (context == null || (a2 = a(context)) == null || !a2.exists()) {
            return null;
        }
        return new File(a2.getAbsolutePath() + File.separator + "music/rhythm");
    }

    public static String d(Context context) {
        String path;
        if (context == null) {
            return "";
        }
        String str = f132210c;
        if (str != null && !str.isEmpty()) {
            return f132210c;
        }
        File a2 = d.a(context, f.PREFER_SD_CARD);
        if (a2 != null) {
            path = a2.getPath();
        } else if (a(context, (String) null) == null) {
            path = Environment.getExternalStorageDirectory().getPath();
        } else {
            path = a(context, (String) null).getPath();
        }
        String str2 = path + "/share/";
        f132210c = str2;
        return str2;
    }

    public static File h(Context context) {
        File file = f132212e;
        if (file != null) {
            return file;
        }
        File a2 = d.a(context, f.PREFER_SD_CARD);
        if (a2 == null) {
            try {
                f132212e = a(context, "logs");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (f132212e == null) {
                f132212e = new File(a(context), "logs");
            }
            if (!f132212e.exists()) {
                f132212e.mkdirs();
            }
            return f132212e;
        }
        File file2 = new File(a2, "logs");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        file2.getAbsolutePath();
        f132212e = file2;
        return file2;
    }

    public static void a(int i2) {
        File[] fileArr = null;
        try {
            ICacheService cacheConfig = AVExternalServiceImpl.a().configService().cacheConfig();
            if (cacheConfig != null) {
                try {
                    fileArr = cacheConfig.tempDuetFile();
                } catch (Throwable unused) {
                }
                a(a(fileArr, i2 * 2));
                try {
                    fileArr = cacheConfig.rawDuetFile();
                } catch (Throwable unused2) {
                }
                b(a(fileArr, i2));
            }
        } catch (Exception unused3) {
        }
    }

    private static void b(List<File> list) {
        if (list != null && list.size() > 0) {
            Set<String> b2 = b();
            for (File file : list) {
                if (file != null && file.exists() && !b2.contains(file.getAbsolutePath())) {
                    if (FileLocker.a(file.getAbsolutePath())) {
                        file.getAbsolutePath();
                    } else {
                        a(file);
                    }
                }
            }
        }
    }

    public static File a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return context.getExternalFilesDir(str);
        }
        if (com.ss.android.ugc.aweme.lancet.d.f107196d != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107196d;
        }
        File externalFilesDir = context.getExternalFilesDir(str);
        com.ss.android.ugc.aweme.lancet.d.f107196d = externalFilesDir;
        return externalFilesDir;
    }

    public static void b(Context context, int i2) {
        ArrayList arrayList = new ArrayList();
        if (context != null) {
            if (a(context) != null) {
                arrayList.addAll(c(a(context), i2));
            }
            try {
                if (a(context, (String) null) != null) {
                    arrayList.addAll(c(a(context, (String) null), i2));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        arrayList.addAll(e());
        b(arrayList);
    }

    public static void d(Context context, int i2) {
        File e2;
        if (context != null && (e2 = s.b().a(i.a.VideoCache).e()) != null && e2.exists()) {
            a(a(e2, i2));
        }
    }

    public static List<File> a(File file, int i2) {
        File[] listFiles;
        if (file.exists() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
            List asList = Arrays.asList(listFiles);
            Collections.sort(asList, an.f132214a);
            if (asList.size() > i2) {
                return asList.subList(0, asList.size() - i2);
            }
        }
        return Collections.EMPTY_LIST;
    }

    private static void b(File file, int i2) {
        File[] listFiles;
        File file2 = new File(file.getAbsolutePath() + File.separator + "cache");
        if (file2.exists() && (listFiles = file2.listFiles(new FileFilter() {
            /* class com.ss.android.ugc.aweme.shortvideo.util.am.AnonymousClass4 */

            static {
                Covode.recordClassIndex(86591);
            }

            public final boolean accept(File file) {
                if (file == null || !file.getName().endsWith("-concat-v")) {
                    return false;
                }
                return true;
            }
        })) != null && listFiles.length > 0) {
            b(a(listFiles, i2));
        }
    }

    private static List<File> c(File file, int i2) {
        ICacheService iCacheService;
        File[] fileArr;
        File[] fileArr2;
        File[] fileArr3;
        List<File> a2;
        if (!file.exists()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        File[] fileArr4 = null;
        try {
            iCacheService = AVExternalServiceImpl.a().configService().cacheConfig();
        } catch (Throwable unused) {
            iCacheService = null;
        }
        if (iCacheService == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            fileArr = iCacheService.rawVideoFile();
        } catch (Exception unused2) {
            fileArr = null;
        }
        if (!(fileArr == null || (a2 = a(fileArr, i2 * 2)) == null)) {
            arrayList.addAll(a2);
        }
        try {
            fileArr2 = iCacheService.voiceFile();
        } catch (Exception unused3) {
            fileArr2 = null;
        }
        List<File> a3 = a(fileArr2, i2);
        if (a3 != null) {
            arrayList.addAll(a3);
        }
        try {
            fileArr3 = iCacheService.outputFile();
        } catch (Exception unused4) {
            fileArr3 = null;
        }
        List<File> a4 = a(fileArr3, i2);
        if (a4 != null) {
            arrayList.addAll(a4);
        }
        try {
            fileArr4 = iCacheService.synthesisFile();
        } catch (Exception unused5) {
        }
        List<File> a5 = a(fileArr4, i2);
        if (a5 != null) {
            arrayList.addAll(a5);
        }
        File file2 = new File(com.ss.android.ugc.musicprovider.e.a().c());
        if (file2.exists() && a(file2, i2 * 2) != null) {
            arrayList.addAll(a5);
        }
        return arrayList;
    }

    public static void e(Context context, int i2) {
        File i3;
        if (context != null && (i3 = i(context)) != null) {
            if (i3.exists()) {
                a(a(i3, i2));
            }
            File j2 = j(context);
            if (j2 != null && j2.exists()) {
                a(a(j2, i2));
            }
        }
    }

    private static List<File> a(File[] fileArr, int i2) {
        if (fileArr != null && fileArr.length > 0) {
            List asList = Arrays.asList(fileArr);
            Collections.sort(asList, ao.f132215a);
            if (asList.size() > i2) {
                return asList.subList(0, asList.size() - i2);
            }
        }
        return Collections.EMPTY_LIST;
    }

    public static void c(Context context, int i2) {
        if (context != null) {
            if (a(context) != null) {
                b(a(context), i2);
            }
            try {
                if (a(context, (String) null) != null) {
                    b(a(context, (String) null), i2);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static void d(File file, int i2) {
        a(a(new File(file, "out"), i2));
        a(a(new File(file, "tmp"), i2));
        a(a(new File(file, "pic"), i2));
    }

    public static void a(Context context, int i2) {
        try {
            Boolean cleanShareFiles = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getCleanShareFiles();
            if (cleanShareFiles != null && cleanShareFiles.booleanValue()) {
                i2 = 0;
            }
        } catch (com.bytedance.ies.a e2) {
            e2.printStackTrace();
        }
        if (context != null) {
            File file = new File(g(context));
            if (file.exists()) {
                a(a(file, i2));
                a(a(new File(e(context)), i2));
                a(a(new File(f(context)), i2));
            }
            File file2 = new File(d(context));
            File file3 = new File(a(context, (String) null), "share");
            if (file3.exists() && !TextUtils.equals(file3.getAbsolutePath(), file2.getAbsolutePath())) {
                d(file3, i2);
            }
            File a2 = d.a(context);
            if (a2 != null) {
                File file4 = new File(a2, "share");
                if (file4.exists() && !TextUtils.equals(file4.getAbsolutePath(), file4.getAbsolutePath())) {
                    d(file4, i2);
                }
            }
        }
    }

    private static void a(File file, List<File> list) {
        if (file != null) {
            if (file.isFile()) {
                list.add(file);
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    a(file2, list);
                }
            }
        }
    }
}

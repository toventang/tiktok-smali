package androidx.multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.lancet.d;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

public final class MultiDex {
    private static final boolean IS_VM_MULTIDEX_CAPABLE = isVMMultidexCapable(System.getProperty("java.vm.version"));
    private static final Set<File> installedApk = new HashSet();

    public static int androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static int androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    public static int androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    public static int androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    public static int androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2, Throwable th) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public static final class V19 {
        static {
            Covode.recordClassIndex(1453);
        }

        public static int androidx_multidex_MultiDex$V19_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2, Throwable th) {
            return 0;
        }

        private V19() {
        }

        static void install(ClassLoader classLoader, List<? extends File> list, File file) {
            Object obj;
            Object obj2 = MultiDex.findField(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            MultiDex.expandFieldArray(obj2, "dexElements", makeDexElements(obj2, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    androidx_multidex_MultiDex$V19_com_ss_android_ugc_aweme_lancet_LogLancet_w("MultiDex", "Exception in makeDexElement", (Throwable) it.next());
                }
                Field findField = MultiDex.findField(obj2, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr = (IOException[]) findField.get(obj2);
                if (iOExceptionArr == null) {
                    obj = arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    obj = new IOException[(arrayList.size() + iOExceptionArr.length)];
                    arrayList.toArray(obj);
                    System.arraycopy(iOExceptionArr, 0, obj, arrayList.size(), iOExceptionArr.length);
                }
                findField.set(obj2, obj);
                IOException iOException = new IOException("I/O exception during makeDexElement");
                iOException.initCause((Throwable) arrayList.get(0));
                throw iOException;
            }
        }

        private static Object[] makeDexElements(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
            return (Object[]) MultiDex.findMethod(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, arrayList, file, arrayList2);
        }
    }

    static final class V4 {
        static {
            Covode.recordClassIndex(1454);
        }

        private V4() {
        }

        static void install(ClassLoader classLoader, List<? extends File> list) {
            int size = list.size();
            Field findField = MultiDex.findField(classLoader, "path");
            StringBuilder sb = new StringBuilder((String) findField.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File file = (File) listIterator.next();
                String absolutePath = file.getAbsolutePath();
                sb.append(':').append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = file;
                zipFileArr[previousIndex] = new ZipFile(file);
                dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, absolutePath + ".dex", 0);
            }
            findField.set(classLoader, sb.toString());
            MultiDex.expandFieldArray(classLoader, "mPaths", strArr);
            MultiDex.expandFieldArray(classLoader, "mFiles", fileArr);
            MultiDex.expandFieldArray(classLoader, "mZips", zipFileArr);
            MultiDex.expandFieldArray(classLoader, "mDexs", dexFileArr);
        }
    }

    private MultiDex() {
    }

    static final class V14 {
        private static final int EXTRACTED_SUFFIX_LENGTH = 4;
        private final ElementConstructor elementConstructor;

        /* access modifiers changed from: package-private */
        public interface ElementConstructor {
            static {
                Covode.recordClassIndex(1449);
            }

            Object newInstance(File file, DexFile dexFile);
        }

        public static int androidx_multidex_MultiDex$V14_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2, Throwable th) {
            return 0;
        }

        static {
            Covode.recordClassIndex(1448);
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private V14() {
            /*
                r2 = this;
                r2.<init>()
                java.lang.String r0 = "dalvik.system.DexPathList$Element"
                java.lang.Class r1 = java.lang.Class.forName(r0)
                androidx.multidex.MultiDex$V14$ICSElementConstructor r0 = new androidx.multidex.MultiDex$V14$ICSElementConstructor     // Catch:{ NoSuchMethodException -> 0x000f }
                r0.<init>(r1)     // Catch:{ NoSuchMethodException -> 0x000f }
                goto L_0x001a
            L_0x000f:
                androidx.multidex.MultiDex$V14$JBMR11ElementConstructor r0 = new androidx.multidex.MultiDex$V14$JBMR11ElementConstructor     // Catch:{ NoSuchMethodException -> 0x0015 }
                r0.<init>(r1)     // Catch:{ NoSuchMethodException -> 0x0015 }
                goto L_0x001a
            L_0x0015:
                androidx.multidex.MultiDex$V14$JBMR2ElementConstructor r0 = new androidx.multidex.MultiDex$V14$JBMR2ElementConstructor
                r0.<init>(r1)
            L_0x001a:
                r2.elementConstructor = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.multidex.MultiDex.V14.<init>():void");
        }

        static class ICSElementConstructor implements ElementConstructor {
            private final Constructor<?> elementConstructor;

            static {
                Covode.recordClassIndex(1450);
            }

            ICSElementConstructor(Class<?> cls) {
                Constructor<?> constructor = cls.getConstructor(File.class, ZipFile.class, DexFile.class);
                this.elementConstructor = constructor;
                constructor.setAccessible(true);
            }

            @Override // androidx.multidex.MultiDex.V14.ElementConstructor
            public Object newInstance(File file, DexFile dexFile) {
                return this.elementConstructor.newInstance(file, new ZipFile(file), dexFile);
            }
        }

        static class JBMR11ElementConstructor implements ElementConstructor {
            private final Constructor<?> elementConstructor;

            static {
                Covode.recordClassIndex(1451);
            }

            JBMR11ElementConstructor(Class<?> cls) {
                Constructor<?> constructor = cls.getConstructor(File.class, File.class, DexFile.class);
                this.elementConstructor = constructor;
                constructor.setAccessible(true);
            }

            @Override // androidx.multidex.MultiDex.V14.ElementConstructor
            public Object newInstance(File file, DexFile dexFile) {
                return this.elementConstructor.newInstance(file, file, dexFile);
            }
        }

        static class JBMR2ElementConstructor implements ElementConstructor {
            private final Constructor<?> elementConstructor;

            static {
                Covode.recordClassIndex(1452);
            }

            JBMR2ElementConstructor(Class<?> cls) {
                Constructor<?> constructor = cls.getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class);
                this.elementConstructor = constructor;
                constructor.setAccessible(true);
            }

            @Override // androidx.multidex.MultiDex.V14.ElementConstructor
            public Object newInstance(File file, DexFile dexFile) {
                return this.elementConstructor.newInstance(file, Boolean.FALSE, file, dexFile);
            }
        }

        private Object[] makeDexElements(List<? extends File> list) {
            int size = list.size();
            Object[] objArr = new Object[size];
            for (int i2 = 0; i2 < size; i2++) {
                File file = (File) list.get(i2);
                objArr[i2] = this.elementConstructor.newInstance(file, DexFile.loadDex(file.getPath(), optimizedPathFor(file), 0));
            }
            return objArr;
        }

        private static String optimizedPathFor(File file) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            return new File(parentFile, name.substring(0, name.length() - EXTRACTED_SUFFIX_LENGTH) + ".dex").getPath();
        }

        static void install(ClassLoader classLoader, List<? extends File> list) {
            Object obj = MultiDex.findField(classLoader, "pathList").get(classLoader);
            Object[] makeDexElements = new V14().makeDexElements(list);
            try {
                MultiDex.expandFieldArray(obj, "dexElements", makeDexElements);
            } catch (NoSuchFieldException e2) {
                androidx_multidex_MultiDex$V14_com_ss_android_ugc_aweme_lancet_LogLancet_w("MultiDex", "Failed find field 'dexElements' attempting 'pathElements'", e2);
                MultiDex.expandFieldArray(obj, "pathElements", makeDexElements);
            }
        }
    }

    static {
        Covode.recordClassIndex(1447);
    }

    private static ApplicationInfo getApplicationInfo(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException e2) {
            androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e2);
            return null;
        }
    }

    public static File androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    public static boolean androidx_multidex_MultiDex_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                return false;
            }
        } catch (Throwable unused) {
        }
        return file.delete();
    }

    public static void install(Context context) {
        androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", "Installing application");
        if (IS_VM_MULTIDEX_CAPABLE) {
            androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        try {
            ApplicationInfo applicationInfo = getApplicationInfo(context);
            if (applicationInfo == null) {
                androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                return;
            }
            doInstallation(context, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir), "secondary-dexes", "", true);
            androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", "install done");
        } catch (Exception e2) {
            androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_e("MultiDex", "MultiDex installation failure", e2);
            throw new RuntimeException("MultiDex installation failed (" + e2.getMessage() + ").");
        }
    }

    static boolean isVMMultidexCapable(String str) {
        String str2;
        boolean z = false;
        if (str != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
            if (matcher.matches()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 > 0)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder append = new StringBuilder("VM with version ").append(str);
        if (z) {
            str2 = " has multidex support";
        } else {
            str2 = " does not have multidex support";
        }
        androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", append.append(str2).toString());
        return z;
    }

    private static void clearOldDexDir(Context context) {
        File file = new File(androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context), "secondary-dexes");
        if (file.isDirectory()) {
            androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", "Clearing old secondary dex dir (" + file.getPath() + ").");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : listFiles) {
                androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if (!androidx_multidex_MultiDex_com_ss_android_ugc_aweme_storage_FileLancet_delete(file2)) {
                    androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_w("MultiDex", "Failed to delete old file " + file2.getPath());
                } else {
                    androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", "Deleted old file " + file2.getPath());
                }
            }
            if (!androidx_multidex_MultiDex_com_ss_android_ugc_aweme_storage_FileLancet_delete(file)) {
                androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_w("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
            } else {
                androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", "Deleted old secondary dex dir " + file.getPath());
            }
        }
    }

    private static void mkdirChecked(File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_e("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
            } else {
                androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_e("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
            }
            throw new IOException("Failed to create directory " + file.getPath());
        }
    }

    public static Field findField(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    public static void installInstrumentation(Context context, Context context2) {
        androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", "Installing instrumentation");
        if (IS_VM_MULTIDEX_CAPABLE) {
            androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        try {
            ApplicationInfo applicationInfo = getApplicationInfo(context);
            if (applicationInfo == null) {
                androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", "No ApplicationInfo available for instrumentation, i.e. running on a test Context: MultiDex support library is disabled.");
                return;
            }
            ApplicationInfo applicationInfo2 = getApplicationInfo(context2);
            if (applicationInfo2 == null) {
                androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                return;
            }
            String str = context.getPackageName() + ".";
            File file = new File(applicationInfo2.dataDir);
            doInstallation(context2, new File(applicationInfo.sourceDir), file, str + "secondary-dexes", str, false);
            doInstallation(context2, new File(applicationInfo2.sourceDir), file, "secondary-dexes", "", false);
            androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_i("MultiDex", "Installation done");
        } catch (Exception e2) {
            androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_e("MultiDex", "MultiDex installation failure", e2);
            throw new RuntimeException("MultiDex installation failed (" + e2.getMessage() + ").");
        }
    }

    private static void installSecondaryDexes(ClassLoader classLoader, File file, List<? extends File> list) {
        if (!list.isEmpty()) {
            int i2 = Build.VERSION.SDK_INT;
            V19.install(classLoader, list, file);
        }
    }

    private static File getDexDir(Context context, File file, String str) {
        File file2 = new File(file, "code_cache");
        try {
            mkdirChecked(file2);
        } catch (IOException unused) {
            file2 = new File(androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context), "code_cache");
            mkdirChecked(file2);
        }
        File file3 = new File(file2, str);
        mkdirChecked(file3);
        return file3;
    }

    public static void expandFieldArray(Object obj, String str, Object[] objArr) {
        Field findField = findField(obj, str);
        Object[] objArr2 = (Object[]) findField.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        findField.set(obj, objArr3);
    }

    public static Method findMethod(Object obj, String str, Class<?>... clsArr) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    private static void doInstallation(Context context, File file, File file2, String str, String str2, boolean z) {
        Set<File> set = installedApk;
        synchronized (set) {
            if (!set.contains(file)) {
                set.add(file);
                if (Build.VERSION.SDK_INT > 20) {
                    androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + Build.VERSION.SDK_INT + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"");
                }
                try {
                    ClassLoader classLoader = context.getClassLoader();
                    if (classLoader == null) {
                        androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_e("MultiDex", "Context class loader is null. Must be running in test mode. Skip patching.");
                        return;
                    }
                    try {
                        clearOldDexDir(context);
                    } catch (Throwable th) {
                        androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
                    }
                    File dexDir = getDexDir(context, file2, str);
                    MultiDexExtractor multiDexExtractor = new MultiDexExtractor(file, dexDir);
                    try {
                        try {
                            installSecondaryDexes(classLoader, dexDir, multiDexExtractor.load(context, str2, false));
                        } catch (IOException e2) {
                            if (z) {
                                androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e2);
                                installSecondaryDexes(classLoader, dexDir, multiDexExtractor.load(context, str2, true));
                            } else {
                                throw e2;
                            }
                        }
                        try {
                        } catch (IOException e3) {
                            throw e3;
                        }
                    } finally {
                        try {
                            multiDexExtractor.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (RuntimeException e4) {
                    androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e4);
                }
            }
        }
    }
}

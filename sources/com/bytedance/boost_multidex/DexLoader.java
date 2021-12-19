package com.bytedance.boost_multidex;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipFile;

/* access modifiers changed from: package-private */
public abstract class DexLoader {
    ElementConstructor mElementConstructor;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.boost_multidex.DexLoader$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(15643);
        }
    }

    /* access modifiers changed from: package-private */
    public interface ElementConstructor {
        static {
            Covode.recordClassIndex(15644);
        }

        Object newInstance(File file, Object obj);
    }

    static class ICSElementConstructor implements ElementConstructor {
        private final Constructor<?> mConstructor;

        static {
            Covode.recordClassIndex(15645);
        }

        ICSElementConstructor(Class<?> cls) {
            Constructor<?> constructor = cls.getConstructor(File.class, ZipFile.class, DexFile.class);
            this.mConstructor = constructor;
            constructor.setAccessible(true);
        }

        @Override // com.bytedance.boost_multidex.DexLoader.ElementConstructor
        public Object newInstance(File file, Object obj) {
            return this.mConstructor.newInstance(file, null, obj);
        }
    }

    static class JBMR11ElementConstructor implements ElementConstructor {
        private final Constructor<?> mConstructor;

        static {
            Covode.recordClassIndex(15646);
        }

        JBMR11ElementConstructor(Class<?> cls) {
            Constructor<?> constructor = cls.getConstructor(File.class, File.class, DexFile.class);
            this.mConstructor = constructor;
            constructor.setAccessible(true);
        }

        @Override // com.bytedance.boost_multidex.DexLoader.ElementConstructor
        public Object newInstance(File file, Object obj) {
            return this.mConstructor.newInstance(file, null, obj);
        }
    }

    static class JBMR2ElementConstructor implements ElementConstructor {
        private final Constructor<?> mConstructor;

        static {
            Covode.recordClassIndex(15647);
        }

        JBMR2ElementConstructor(Class<?> cls) {
            Constructor<?> constructor = cls.getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class);
            this.mConstructor = constructor;
            constructor.setAccessible(true);
        }

        @Override // com.bytedance.boost_multidex.DexLoader.ElementConstructor
        public Object newInstance(File file, Object obj) {
            return this.mConstructor.newInstance(file, false, null, obj);
        }
    }

    static class KKElementConstructor implements ElementConstructor {
        private final Constructor<?> mConstructor;

        static {
            Covode.recordClassIndex(15648);
        }

        KKElementConstructor(Class<?> cls) {
            Constructor<?> findConstructor = Utility.findConstructor(cls, File.class, Boolean.TYPE, File.class, DexFile.class);
            this.mConstructor = findConstructor;
            findConstructor.setAccessible(true);
        }

        @Override // com.bytedance.boost_multidex.DexLoader.ElementConstructor
        public Object newInstance(File file, Object obj) {
            return this.mConstructor.newInstance(file, false, null, obj);
        }
    }

    /* access modifiers changed from: package-private */
    public static class V14 extends DexLoader {
        static {
            Covode.recordClassIndex(15649);
        }

        private V14() {
            ElementConstructor elementConstructor;
            try {
                Class<?> cls = Class.forName("dalvik.system.DexPathList$Element");
                try {
                    elementConstructor = new ICSElementConstructor(cls);
                } catch (Exception unused) {
                    elementConstructor = null;
                    try {
                        elementConstructor = new JBMR11ElementConstructor(cls);
                    } catch (Exception unused2) {
                        if (0 == 0) {
                            try {
                                elementConstructor = new JBMR2ElementConstructor(cls);
                            } catch (Exception unused3) {
                            }
                        }
                    }
                }
                this.mElementConstructor = elementConstructor;
            } catch (Exception e2) {
                Monitor.get().logError("can not find DexPathList$Element", e2);
            }
        }

        /* synthetic */ V14(AnonymousClass1 r1) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static class V19 extends DexLoader {
        static {
            Covode.recordClassIndex(15650);
        }

        private V19() {
            try {
                this.mElementConstructor = new KKElementConstructor(Class.forName("dalvik.system.DexPathList$Element"));
            } catch (Throwable th) {
                Monitor.get().logError("fail to get Element constructor", th);
            }
        }

        /* synthetic */ V19(AnonymousClass1 r1) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(15642);
    }

    DexLoader() {
    }

    static DexLoader create(int i2) {
        if (i2 >= 19) {
            return new V19(null);
        }
        if (i2 >= 14) {
            return new V14(null);
        }
        throw new UnsupportedOperationException("only support SDK_INT >= 14, give up when < 14");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        com.bytedance.boost_multidex.Monitor.get().logInfo("Load dex in holder " + r5.toString());
        r8.set(r3, r5);
        r4.add(r6);
        r1 = r5.toString();
        com.bytedance.boost_multidex.Result.get().addDexInfo(r1);
        com.bytedance.boost_multidex.Monitor.get().logInfo("Add info: ".concat(java.lang.String.valueOf(r1)));
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object[] makeDexElements(java.util.List<com.bytedance.boost_multidex.DexHolder> r8, android.content.SharedPreferences r9) {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.boost_multidex.DexLoader.makeDexElements(java.util.List, android.content.SharedPreferences):java.lang.Object[]");
    }

    /* access modifiers changed from: package-private */
    public void install(ClassLoader classLoader, List<DexHolder> list, SharedPreferences sharedPreferences) {
        Utility.expandFieldArray(Utility.findFieldRecursively(classLoader.getClass(), "pathList").get(classLoader), "dexElements", makeDexElements(list, sharedPreferences));
    }

    /* access modifiers changed from: package-private */
    public void installInOptProcess(ClassLoader classLoader, List<DexHolder> list) {
        Object obj = Utility.findFieldRecursively(classLoader.getClass(), "pathList").get(classLoader);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            DexHolder dexHolder = list.get(i2);
            arrayList.add(dexHolder.toDexListElement(this.mElementConstructor));
            Monitor.get().logInfo("Install holder: " + dexHolder.getClass().getName() + ", index " + i2);
        }
        Utility.expandFieldArray(obj, "dexElements", arrayList.toArray());
    }
}

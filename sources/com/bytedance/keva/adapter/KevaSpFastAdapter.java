package com.bytedance.keva.adapter;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.c.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.keva.adapter.xml.XmlUtils;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.xmlpull.v1.XmlPullParserException;

public class KevaSpFastAdapter implements SharedPreferences {
    private static final Executor sApplyExecutor = Executors.newCachedThreadPool();
    public static final Executor sWriterExecutor = com_bytedance_keva_adapter_KevaSpFastAdapter_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor();
    private File mBackupFile;
    private final Map<SharedPreferences.OnSharedPreferenceChangeListener, Keva.OnChangeListener> mChangeListenerMap = new a();
    public File mFile;
    public Keva mKeva;

    public class Editor implements SharedPreferences.Editor {
        private boolean mClear;
        private Map<String, Object> mTempMap = new a();

        static {
            Covode.recordClassIndex(24525);
        }

        public SharedPreferences.Editor clear() {
            this.mClear = true;
            return this;
        }

        public void apply() {
            commit();
        }

        public boolean commit() {
            doWriteKeva(this.mTempMap, this.mClear);
            if (KevaSpFastAdapter.this.mFile != null) {
                KevaSpFastAdapter.sWriterExecutor.execute(new Runnable() {
                    /* class com.bytedance.keva.adapter.KevaSpFastAdapter.Editor.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(24526);
                    }

                    public void run() {
                        KevaSpFastAdapter.this.doWriteSp(KevaSpFastAdapter.this.getAll());
                    }
                });
            }
            this.mTempMap = new a();
            if (!this.mClear) {
                return true;
            }
            this.mClear = false;
            return true;
        }

        public Editor() {
        }

        public SharedPreferences.Editor remove(String str) {
            MethodCollector.i(9241);
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                try {
                    map.put(str, this);
                } finally {
                    MethodCollector.o(9241);
                }
            }
            return this;
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            MethodCollector.i(9240);
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                try {
                    map.put(str, Boolean.valueOf(z));
                } finally {
                    MethodCollector.o(9240);
                }
            }
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f2) {
            MethodCollector.i(9054);
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                try {
                    map.put(str, Float.valueOf(f2));
                } finally {
                    MethodCollector.o(9054);
                }
            }
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i2) {
            MethodCollector.i(8861);
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                try {
                    map.put(str, Integer.valueOf(i2));
                } finally {
                    MethodCollector.o(8861);
                }
            }
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j2) {
            MethodCollector.i(8862);
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                try {
                    map.put(str, Long.valueOf(j2));
                } finally {
                    MethodCollector.o(8862);
                }
            }
            return this;
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            MethodCollector.i(8858);
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                try {
                    map.put(str, str2);
                } finally {
                    MethodCollector.o(8858);
                }
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            MethodCollector.i(8860);
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                try {
                    map.put(str, set);
                } finally {
                    MethodCollector.o(8860);
                }
            }
            return this;
        }

        private void doWriteKeva(Map<String, Object> map, boolean z) {
            MethodCollector.i(9243);
            if (z) {
                KevaSpFastAdapter.this.mKeva.clear();
            }
            synchronized (map) {
                try {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value == null) {
                            KevaSpFastAdapter.this.mKeva.erase(key);
                        }
                        if (value instanceof Integer) {
                            KevaSpFastAdapter.this.mKeva.storeInt(key, ((Integer) value).intValue());
                        } else if (value instanceof Boolean) {
                            KevaSpFastAdapter.this.mKeva.storeBoolean(key, ((Boolean) value).booleanValue());
                        } else if (value instanceof String) {
                            KevaSpFastAdapter.this.mKeva.storeString(key, (String) value);
                        } else if (value instanceof Long) {
                            KevaSpFastAdapter.this.mKeva.storeLong(key, ((Long) value).longValue());
                        } else if (value instanceof Float) {
                            KevaSpFastAdapter.this.mKeva.storeFloat(key, ((Float) value).floatValue());
                        } else if (value instanceof Set) {
                            KevaSpFastAdapter.this.mKeva.storeStringSet(key, (Set) value);
                        } else {
                            KevaSpFastAdapter.this.mKeva.erase(key);
                        }
                    }
                } finally {
                    MethodCollector.o(9243);
                }
            }
        }
    }

    public SharedPreferences.Editor edit() {
        return new Editor();
    }

    static {
        Covode.recordClassIndex(24523);
    }

    public static ExecutorService com_bytedance_keva_adapter_KevaSpFastAdapter_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor() {
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        return g.a(a2.a());
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.mKeva.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                if (value instanceof String[]) {
                    HashSet hashSet = new HashSet(16, 0.75f);
                    for (String str : (String[]) value) {
                        hashSet.add(str);
                    }
                    value = hashSet;
                }
                hashMap.put(key, value);
            }
        }
        return hashMap;
    }

    public boolean contains(String str) {
        return this.mKeva.contains(str);
    }

    private KevaSpFastAdapter(Keva keva) {
        this.mKeva = keva;
    }

    public void registerOnSharedPreferenceChangeListener(final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        AnonymousClass1 r1 = new Keva.OnChangeListener() {
            /* class com.bytedance.keva.adapter.KevaSpFastAdapter.AnonymousClass1 */

            static {
                Covode.recordClassIndex(24524);
            }

            @Override // com.bytedance.keva.Keva.OnChangeListener
            public void onChanged(Keva keva, String str) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(KevaSpFastAdapter.this, str);
            }
        };
        this.mKeva.registerChangeListener(r1);
        this.mChangeListenerMap.put(onSharedPreferenceChangeListener, r1);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mKeva.unRegisterChangeListener(this.mChangeListenerMap.remove(onSharedPreferenceChangeListener));
    }

    public static File com_bytedance_keva_adapter_KevaSpFastAdapter_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    private static FileOutputStream createFileOutputStream(File file) {
        FileOutputStream fileOutputStream;
        MethodCollector.i(11080);
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdir()) {
                MethodCollector.o(11080);
                return null;
            }
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (FileNotFoundException unused2) {
            }
        }
        fileOutputStream2 = fileOutputStream;
        MethodCollector.o(11080);
        return fileOutputStream2;
    }

    public static boolean com_bytedance_keva_adapter_KevaSpFastAdapter_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        MethodCollector.i(10919);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(10919);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(10919);
        return delete;
    }

    public void doWriteSp(Map<String, ?> map) {
        MethodCollector.i(10750);
        boolean exists = this.mBackupFile.exists();
        if (this.mFile.exists()) {
            if (!exists) {
                this.mFile.renameTo(this.mBackupFile);
            } else {
                com_bytedance_keva_adapter_KevaSpFastAdapter_com_ss_android_ugc_aweme_storage_FileLancet_delete(this.mFile);
            }
        }
        FileOutputStream createFileOutputStream = createFileOutputStream(this.mFile);
        if (createFileOutputStream == null) {
            MethodCollector.o(10750);
            return;
        }
        try {
            XmlUtils.writeMapXml(map, createFileOutputStream);
            createFileOutputStream.getFD().sync();
            com_bytedance_keva_adapter_KevaSpFastAdapter_com_ss_android_ugc_aweme_storage_FileLancet_delete(this.mBackupFile);
            try {
                createFileOutputStream.close();
                MethodCollector.o(10750);
            } catch (IOException unused) {
                MethodCollector.o(10750);
            }
        } catch (IOException unused2) {
            com_bytedance_keva_adapter_KevaSpFastAdapter_com_ss_android_ugc_aweme_storage_FileLancet_delete(this.mFile);
            try {
                createFileOutputStream.close();
                MethodCollector.o(10750);
            } catch (IOException unused3) {
                MethodCollector.o(10750);
            }
        } catch (XmlPullParserException unused4) {
            com_bytedance_keva_adapter_KevaSpFastAdapter_com_ss_android_ugc_aweme_storage_FileLancet_delete(this.mFile);
            try {
                createFileOutputStream.close();
                MethodCollector.o(10750);
            } catch (IOException unused5) {
                MethodCollector.o(10750);
            }
        } catch (Exception e2) {
            RuntimeException runtimeException = new RuntimeException("fail to write " + this.mFile.getName() + ", dump: " + map.keySet(), e2);
            MethodCollector.o(10750);
            throw runtimeException;
        } catch (Throwable th) {
            try {
                createFileOutputStream.close();
            } catch (IOException unused6) {
            }
            MethodCollector.o(10750);
            throw th;
        }
    }

    public boolean getBoolean(String str, boolean z) {
        return this.mKeva.getBoolean(str, z);
    }

    public float getFloat(String str, float f2) {
        return this.mKeva.getFloat(str, f2);
    }

    public int getInt(String str, int i2) {
        return this.mKeva.getInt(str, i2);
    }

    public long getLong(String str, long j2) {
        return this.mKeva.getLong(str, j2);
    }

    public String getString(String str, String str2) {
        String string = this.mKeva.getString(str, str2);
        if (string != null) {
            return string;
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> stringSet = this.mKeva.getStringSet(str, set);
        if (stringSet != null) {
            return stringSet;
        }
        return set;
    }

    public static KevaSpFastAdapter getSharedPreferences(Context context, String str, int i2, boolean z) {
        int i3;
        if (i2 == 4) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        KevaSpFastAdapter kevaSpFastAdapter = new KevaSpFastAdapter(Keva.getRepoFromSp(context, str, i3));
        if (z) {
            File com_bytedance_keva_adapter_KevaSpFastAdapter_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir = com_bytedance_keva_adapter_KevaSpFastAdapter_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context);
            if (!com_bytedance_keva_adapter_KevaSpFastAdapter_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir.exists()) {
                com_bytedance_keva_adapter_KevaSpFastAdapter_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir.mkdirs();
            }
            kevaSpFastAdapter.mFile = new File(com_bytedance_keva_adapter_KevaSpFastAdapter_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir.getParent(), "shared_prefs/" + str + ".xml");
            kevaSpFastAdapter.mBackupFile = new File(kevaSpFastAdapter.mFile.getPath() + ".bak");
        }
        return kevaSpFastAdapter;
    }
}

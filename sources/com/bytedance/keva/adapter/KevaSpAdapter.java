package com.bytedance.keva.adapter;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.ArrayMap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class KevaSpAdapter implements SharedPreferences {
    private static final Executor sApplyExecutor = Executors.newCachedThreadPool();
    public static final Executor sWriterExecutor = com_bytedance_keva_adapter_KevaSpAdapter_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor();
    private final Map<SharedPreferences.OnSharedPreferenceChangeListener, Keva.OnChangeListener> mChangeListenerMap = obtainMap();
    public Keva mKeva;
    public SharedPreferences mSp;

    public SharedPreferences.Editor edit() {
        return new Editor();
    }

    public static Map obtainMap() {
        int i2 = Build.VERSION.SDK_INT;
        return new ArrayMap();
    }

    public class Editor implements SharedPreferences.Editor {
        private boolean mClear;
        private Map<String, Object> mTempMap = KevaSpAdapter.obtainMap();

        static {
            Covode.recordClassIndex(24521);
        }

        public synchronized void apply() {
            MethodCollector.i(8525);
            commit();
            MethodCollector.o(8525);
        }

        public synchronized SharedPreferences.Editor clear() {
            MethodCollector.i(8316);
            this.mClear = true;
            MethodCollector.o(8316);
            return this;
        }

        public synchronized boolean commit() {
            MethodCollector.i(8318);
            final Map<String, Object> map = this.mTempMap;
            final boolean z = this.mClear;
            if (KevaSpAdapter.this.mSp != null) {
                KevaSpAdapter.sWriterExecutor.execute(new Runnable() {
                    /* class com.bytedance.keva.adapter.KevaSpAdapter.Editor.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(24522);
                    }

                    public void run() {
                        Editor.this.doWriteSp(map, z);
                    }
                });
            }
            doWriteKeva(map, z);
            this.mTempMap = KevaSpAdapter.obtainMap();
            if (this.mClear) {
                this.mClear = false;
            }
            MethodCollector.o(8318);
            return true;
        }

        public Editor() {
        }

        public synchronized SharedPreferences.Editor remove(String str) {
            MethodCollector.i(8315);
            this.mTempMap.put(str, this);
            MethodCollector.o(8315);
            return this;
        }

        public synchronized SharedPreferences.Editor putBoolean(String str, boolean z) {
            MethodCollector.i(8313);
            this.mTempMap.put(str, Boolean.valueOf(z));
            MethodCollector.o(8313);
            return this;
        }

        public synchronized SharedPreferences.Editor putFloat(String str, float f2) {
            MethodCollector.i(8312);
            this.mTempMap.put(str, Float.valueOf(f2));
            MethodCollector.o(8312);
            return this;
        }

        public synchronized SharedPreferences.Editor putInt(String str, int i2) {
            MethodCollector.i(8309);
            this.mTempMap.put(str, Integer.valueOf(i2));
            MethodCollector.o(8309);
            return this;
        }

        public synchronized SharedPreferences.Editor putLong(String str, long j2) {
            MethodCollector.i(8311);
            this.mTempMap.put(str, Long.valueOf(j2));
            MethodCollector.o(8311);
            return this;
        }

        public synchronized SharedPreferences.Editor putString(String str, String str2) {
            MethodCollector.i(8307);
            this.mTempMap.put(str, str2);
            MethodCollector.o(8307);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public synchronized SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            MethodCollector.i(8308);
            this.mTempMap.put(str, set);
            MethodCollector.o(8308);
            return this;
        }

        private void doWriteKeva(Map<String, Object> map, boolean z) {
            if (z) {
                KevaSpAdapter.this.mKeva.clear();
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    if (value instanceof Integer) {
                        KevaSpAdapter.this.mKeva.storeInt(key, ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        KevaSpAdapter.this.mKeva.storeBoolean(key, ((Boolean) value).booleanValue());
                    } else if (value instanceof String) {
                        KevaSpAdapter.this.mKeva.storeString(key, (String) value);
                    } else if (value instanceof Long) {
                        KevaSpAdapter.this.mKeva.storeLong(key, ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        KevaSpAdapter.this.mKeva.storeFloat(key, ((Float) value).floatValue());
                    } else if (value instanceof Set) {
                        KevaSpAdapter.this.mKeva.storeStringSet(key, (Set) value);
                    }
                }
                KevaSpAdapter.this.mKeva.erase(key);
            }
        }

        public void doWriteSp(Map<String, Object> map, boolean z) {
            SharedPreferences.Editor edit = KevaSpAdapter.this.mSp.edit();
            if (z) {
                edit.clear();
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    edit.remove(key);
                } else if (value instanceof Integer) {
                    edit.putInt(key, ((Integer) value).intValue());
                } else if (value instanceof Boolean) {
                    edit.putBoolean(key, ((Boolean) value).booleanValue());
                } else if (value instanceof String) {
                    edit.putString(key, (String) value);
                } else if (value instanceof Long) {
                    edit.putLong(key, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    edit.putFloat(key, ((Float) value).floatValue());
                } else if (value instanceof Set) {
                    edit.putStringSet(key, (Set) value);
                } else {
                    edit.remove(key);
                }
            }
            edit.commit();
        }
    }

    static {
        Covode.recordClassIndex(24519);
    }

    public static ExecutorService com_bytedance_keva_adapter_KevaSpAdapter_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor() {
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        return g.a(a2.a());
    }

    @Override // android.content.SharedPreferences
    public synchronized Map<String, ?> getAll() {
        HashMap hashMap;
        MethodCollector.i(9249);
        hashMap = new HashMap();
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
        MethodCollector.o(9249);
        return hashMap;
    }

    private KevaSpAdapter(Keva keva) {
        this.mKeva = keva;
    }

    public synchronized boolean contains(String str) {
        boolean contains;
        MethodCollector.i(9930);
        contains = this.mKeva.contains(str);
        MethodCollector.o(9930);
        return contains;
    }

    public synchronized void registerOnSharedPreferenceChangeListener(final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        MethodCollector.i(9933);
        AnonymousClass1 r1 = new Keva.OnChangeListener() {
            /* class com.bytedance.keva.adapter.KevaSpAdapter.AnonymousClass1 */

            static {
                Covode.recordClassIndex(24520);
            }

            @Override // com.bytedance.keva.Keva.OnChangeListener
            public void onChanged(Keva keva, String str) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(KevaSpAdapter.this, str);
            }
        };
        this.mKeva.registerChangeListener(r1);
        this.mChangeListenerMap.put(onSharedPreferenceChangeListener, r1);
        MethodCollector.o(9933);
    }

    public synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        MethodCollector.i(10092);
        this.mKeva.unRegisterChangeListener(this.mChangeListenerMap.remove(onSharedPreferenceChangeListener));
        MethodCollector.o(10092);
    }

    public synchronized boolean getBoolean(String str, boolean z) {
        boolean z2;
        MethodCollector.i(9929);
        z2 = this.mKeva.getBoolean(str, z);
        MethodCollector.o(9929);
        return z2;
    }

    public synchronized float getFloat(String str, float f2) {
        float f3;
        MethodCollector.i(9763);
        f3 = this.mKeva.getFloat(str, f2);
        MethodCollector.o(9763);
        return f3;
    }

    public synchronized int getInt(String str, int i2) {
        int i3;
        MethodCollector.i(9759);
        i3 = this.mKeva.getInt(str, i2);
        MethodCollector.o(9759);
        return i3;
    }

    public synchronized long getLong(String str, long j2) {
        long j3;
        MethodCollector.i(9761);
        j3 = this.mKeva.getLong(str, j2);
        MethodCollector.o(9761);
        return j3;
    }

    public synchronized String getString(String str, String str2) {
        MethodCollector.i(9440);
        String string = this.mKeva.getString(str, str2);
        if (string != null) {
            MethodCollector.o(9440);
            return string;
        }
        MethodCollector.o(9440);
        return str2;
    }

    @Override // android.content.SharedPreferences
    public synchronized Set<String> getStringSet(String str, Set<String> set) {
        MethodCollector.i(9597);
        Set<String> stringSet = this.mKeva.getStringSet(str, set);
        if (stringSet != null) {
            MethodCollector.o(9597);
            return stringSet;
        }
        MethodCollector.o(9597);
        return set;
    }

    public static KevaSpAdapter getSharedPreferences(Context context, String str, int i2, boolean z) {
        int i3;
        MethodCollector.i(9247);
        if (i2 == 4) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        KevaSpAdapter kevaSpAdapter = new KevaSpAdapter(Keva.getRepoFromSp(context, str, i3));
        if (z) {
            kevaSpAdapter.mSp = context.getSharedPreferences(str, i2);
        }
        MethodCollector.o(9247);
        return kevaSpAdapter;
    }
}

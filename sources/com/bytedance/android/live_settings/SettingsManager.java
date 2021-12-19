package com.bytedance.android.live_settings;

import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import h.a.n;
import h.f.a.b;
import h.f.b.l;
import h.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class SettingsManager {
    public static final SettingsManager INSTANCE = new SettingsManager();
    private static final String[] STRING_ARRAY_DEFAULT_VALUE = new String[0];
    private static AtomicBoolean hasInit = new AtomicBoolean(false);
    private static AtomicBoolean hasMonitor = new AtomicBoolean(false);
    private static final Map<String, LiveSettingModel> modelMap = new LinkedHashMap();
    private static final List<LiveSettingModel> models = new ArrayList();
    public static Monitor monitor;
    private static final List<String> settingKeys = new ArrayList();

    private SettingsManager() {
    }

    public final List<LiveSettingModel> getModels() {
        return models;
    }

    public final long getLatestSettingsSavedTime() {
        return SaveSettingsValue.getLatestSettingsSavedTime();
    }

    public final Monitor getMonitor() {
        Monitor monitor2 = monitor;
        if (monitor2 == null) {
            l.a("monitor");
        }
        return monitor2;
    }

    static {
        Covode.recordClassIndex(7362);
    }

    public final void setMonitor(Monitor monitor2) {
        l.c(monitor2, "");
        monitor = monitor2;
    }

    public final boolean contains(String str) {
        l.c(str, "");
        return settingKeys.contains(str);
    }

    public final void saveSettingsValue(o oVar) {
        if (oVar != null) {
            List<LiveSettingModel> list = models;
            if (list != null) {
                SaveSettingsValue.save(oVar, (ArrayList) list);
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    public final boolean getBooleanValue(Class<?> cls) {
        l.c(cls, "");
        if (hasInit.get()) {
            return ((Boolean) getValueAndReport("getBooleanValue", new SettingsManager$getBooleanValue$1(this), cls)).booleanValue();
        }
        Boolean bool = (Boolean) DataCenter.getDefaultValue(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean getBooleanValueInternal(Class<?> cls) {
        LiveSettingModel liveSettingModel = modelMap.get(cls.getName());
        boolean z = false;
        if (liveSettingModel != null) {
            String settingsKey = liveSettingModel.getSettingsKey();
            com.google.gson.l defaultValue = liveSettingModel.getDefaultValue();
            if (defaultValue != null) {
                z = defaultValue.h();
            }
            return DataCenter.getBooleanValue(settingsKey, z);
        }
        Boolean bool = (Boolean) DataCenter.getDefaultValue(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final double getDoubleValue(Class<?> cls) {
        l.c(cls, "");
        if (hasInit.get()) {
            return ((Number) getValueAndReport("getDoubleValue", new SettingsManager$getDoubleValue$1(this), cls)).doubleValue();
        }
        Double d2 = (Double) DataCenter.getDefaultValue(cls);
        if (d2 != null) {
            return d2.doubleValue();
        }
        return 0.0d;
    }

    public final double getDoubleValueInternal(Class<?> cls) {
        LiveSettingModel liveSettingModel = modelMap.get(cls.getName());
        double d2 = 0.0d;
        if (liveSettingModel != null) {
            String settingsKey = liveSettingModel.getSettingsKey();
            com.google.gson.l defaultValue = liveSettingModel.getDefaultValue();
            if (defaultValue != null) {
                d2 = defaultValue.d();
            }
            return DataCenter.getDoubleValue(settingsKey, d2);
        }
        Double d3 = (Double) DataCenter.getDefaultValue(cls);
        if (d3 != null) {
            return d3.doubleValue();
        }
        return 0.0d;
    }

    public final float getFloatValue(Class<?> cls) {
        l.c(cls, "");
        if (hasInit.get()) {
            return ((Number) getValueAndReport("getFloatValue", new SettingsManager$getFloatValue$1(this), cls)).floatValue();
        }
        Float f2 = (Float) DataCenter.getDefaultValue(cls);
        if (f2 != null) {
            return f2.floatValue();
        }
        return 0.0f;
    }

    public final float getFloatValueInternal(Class<?> cls) {
        LiveSettingModel liveSettingModel = modelMap.get(cls.getName());
        float f2 = 0.0f;
        if (liveSettingModel != null) {
            String settingsKey = liveSettingModel.getSettingsKey();
            com.google.gson.l defaultValue = liveSettingModel.getDefaultValue();
            if (defaultValue != null) {
                f2 = defaultValue.e();
            }
            return DataCenter.getFloatValue(settingsKey, f2);
        }
        Float f3 = (Float) DataCenter.getDefaultValue(cls);
        if (f3 != null) {
            return f3.floatValue();
        }
        return 0.0f;
    }

    public final int getIntValue(Class<?> cls) {
        l.c(cls, "");
        if (hasInit.get()) {
            return ((Number) getValueAndReport("getIntValue", new SettingsManager$getIntValue$1(this), cls)).intValue();
        }
        Integer num = (Integer) DataCenter.getDefaultValue(cls);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int getIntValueInternal(Class<?> cls) {
        LiveSettingModel liveSettingModel = modelMap.get(cls.getName());
        int i2 = 0;
        if (liveSettingModel != null) {
            String settingsKey = liveSettingModel.getSettingsKey();
            com.google.gson.l defaultValue = liveSettingModel.getDefaultValue();
            if (defaultValue != null) {
                i2 = defaultValue.g();
            }
            return DataCenter.getIntValue(settingsKey, i2);
        }
        Integer num = (Integer) DataCenter.getDefaultValue(cls);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final long getLongValue(Class<?> cls) {
        l.c(cls, "");
        if (hasInit.get()) {
            return ((Number) getValueAndReport("getLongValue", new SettingsManager$getLongValue$1(this), cls)).longValue();
        }
        Long l2 = (Long) DataCenter.getDefaultValue(cls);
        if (l2 != null) {
            return l2.longValue();
        }
        return 0;
    }

    public final long getLongValueInternal(Class<?> cls) {
        LiveSettingModel liveSettingModel = modelMap.get(cls.getName());
        long j2 = 0;
        if (liveSettingModel != null) {
            String settingsKey = liveSettingModel.getSettingsKey();
            com.google.gson.l defaultValue = liveSettingModel.getDefaultValue();
            if (defaultValue != null) {
                j2 = defaultValue.f();
            }
            return DataCenter.getLongValue(settingsKey, j2);
        }
        Long l2 = (Long) DataCenter.getDefaultValue(cls);
        if (l2 != null) {
            return l2.longValue();
        }
        return 0;
    }

    public final String[] getStringArrayValue(Class<?> cls) {
        l.c(cls, "");
        if (hasInit.get()) {
            return (String[]) getValueAndReport("getStringArrayValue", new SettingsManager$getStringArrayValue$1(this), cls);
        }
        String[] strArr = (String[]) DataCenter.getDefaultValue(cls);
        if (strArr == null) {
            return STRING_ARRAY_DEFAULT_VALUE;
        }
        return strArr;
    }

    public final String[] getStringArrayValueInternal(Class<?> cls) {
        LiveSettingModel liveSettingModel = modelMap.get(cls.getName());
        if (liveSettingModel == null) {
            String[] strArr = (String[]) DataCenter.getDefaultValue(cls);
            if (strArr == null) {
                return STRING_ARRAY_DEFAULT_VALUE;
            }
            return strArr;
        }
        String[] stringArrayValue = DataCenter.getStringArrayValue(liveSettingModel.getSettingsKey(), new String[0]);
        if (stringArrayValue != null && stringArrayValue.length != 0) {
            return stringArrayValue;
        }
        String[] strArr2 = (String[]) DataCenter.getDefaultValue(cls);
        if (strArr2 == null) {
            return STRING_ARRAY_DEFAULT_VALUE;
        }
        return strArr2;
    }

    public final String getStringValue(Class<?> cls) {
        l.c(cls, "");
        if (hasInit.get()) {
            return (String) getValueAndReport("getStringValue", new SettingsManager$getStringValue$1(this), cls);
        }
        String str = (String) DataCenter.getDefaultValue(cls);
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getStringValueInternal(Class<?> cls) {
        String str;
        LiveSettingModel liveSettingModel = modelMap.get(cls.getName());
        if (liveSettingModel != null) {
            String settingsKey = liveSettingModel.getSettingsKey();
            com.google.gson.l defaultValue = liveSettingModel.getDefaultValue();
            if (defaultValue == null || (str = defaultValue.c()) == null) {
                str = "";
            }
            String stringValue = DataCenter.getStringValue(settingsKey, str);
            l.a((Object) stringValue, "");
            return stringValue;
        }
        String str2 = (String) DataCenter.getDefaultValue(cls);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T getValueSafelyInternal(Class<?> cls) {
        LiveSettingModel liveSettingModel = modelMap.get(cls.getName());
        if (liveSettingModel == null) {
            return (T) DataCenter.getDefaultValue(cls);
        }
        try {
            T t = null;
            Object valueSafely = DataCenter.getValueSafely(liveSettingModel.getSettingsKey(), DataCenter.getConfigType(cls), null);
            boolean z = valueSafely instanceof Object;
            T t2 = valueSafely;
            if (!z) {
                t2 = null;
            }
            if (t2 != null) {
                if (!l.a((Object) String.valueOf(t2), (Object) "\"\"")) {
                    t = t2;
                }
                if (t != null) {
                    return t;
                }
            }
            return (T) DataCenter.getDefaultValue(cls);
        } catch (Throwable th) {
            Monitor monitor2 = monitor;
            if (monitor2 == null) {
                l.a("monitor");
            }
            monitor2.reportException("getValueSafely", "exception: " + th.getMessage() + " ,class name: " + cls.getSimpleName());
            return (T) DataCenter.getDefaultValue(cls);
        }
    }

    public final <T> T getValueSafely(Class<?> cls) {
        l.c(cls, "");
        if (!hasInit.get()) {
            return (T) DataCenter.getDefaultValue(cls);
        }
        if (hasMonitor.get()) {
            return (T) getValueSafelyInternal(cls);
        }
        hasMonitor.set(true);
        long nanoTime = System.nanoTime();
        T t = (T) getValueSafelyInternal(cls);
        Monitor monitor2 = monitor;
        if (monitor2 == null) {
            l.a("monitor");
        }
        monitor2.performanceMonitor("getValueSafely", System.nanoTime() - nanoTime);
        return t;
    }

    private final <T> T getValueAndReport(String str, b<? super Class<?>, ? extends T> bVar, Class<?> cls) {
        if (hasMonitor.get()) {
            return (T) bVar.invoke(cls);
        }
        hasMonitor.compareAndSet(false, true);
        long nanoTime = System.nanoTime();
        T t = (T) bVar.invoke(cls);
        Monitor monitor2 = monitor;
        if (monitor2 == null) {
            l.a("monitor");
        }
        monitor2.performanceMonitor(str, System.nanoTime() - nanoTime);
        return t;
    }

    private final <T> T getValueByKeyInternal(String str, Class<?> cls, T t) {
        return t instanceof Integer ? (T) Integer.valueOf(DataCenter.getIntValue(str, t.intValue())) : t instanceof Boolean ? (T) Boolean.valueOf(DataCenter.getBooleanValue(str, t.booleanValue())) : t instanceof Long ? (T) Long.valueOf(DataCenter.getLongValue(str, t.longValue())) : t instanceof Float ? (T) Float.valueOf(DataCenter.getFloatValue(str, t.floatValue())) : t instanceof Double ? (T) Double.valueOf(DataCenter.getDoubleValue(str, t.doubleValue())) : t instanceof String ? (T) DataCenter.getStringValue(str, t) : ((t instanceof String[]) && t != null) ? (T) DataCenter.getStringArrayValue(str, (String[]) t) : (T) DataCenter.getValueSafely(str, cls, t);
    }

    public final <T> T getValueByKey(String str, Class<?> cls, T t) {
        l.c(str, "");
        l.c(cls, "");
        if (!hasInit.get()) {
            return t;
        }
        if (hasMonitor.get()) {
            return (T) getValueByKeyInternal(str, cls, t);
        }
        hasMonitor.compareAndSet(false, true);
        long nanoTime = System.nanoTime();
        T t2 = (T) getValueByKeyInternal(str, cls, t);
        Monitor monitor2 = monitor;
        if (monitor2 == null) {
            l.a("monitor");
        }
        monitor2.performanceMonitor("getValueByKey", System.nanoTime() - nanoTime);
        return t2;
    }

    public final void init(boolean z, SettingsDataProvider settingsDataProvider, Monitor monitor2) {
        l.c(settingsDataProvider, "");
        DataCenter.init(z);
        if (monitor2 == null) {
            monitor2 = new MonitorImpl(z);
        }
        monitor = monitor2;
        List<LiveSettingModel> list = models;
        list.addAll(settingsDataProvider.getLiveSettings());
        List<String> list2 = settingKeys;
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getSettingsKey());
        }
        list2.addAll(arrayList);
        modelMap.putAll(settingsDataProvider.getLiveSettingMap());
        hasInit.compareAndSet(false, true);
    }
}

package com.bytedance.android.live_settings;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.repo.MockSettingsRepo;
import com.bytedance.android.live_settings.repo.OtherRepo;
import com.bytedance.android.live_settings.repo.SettingsRepo;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class DataCenter {
    private static boolean mIsDebug;

    static {
        Covode.recordClassIndex(7354);
    }

    public static void clear() {
        SettingsValueProvider.INSTANCE.clear();
    }

    public static Class getConfigType(Class cls) {
        return getTargetField(cls).getType();
    }

    public static void init(boolean z) {
        SettingsRepo.INSTANCE.load();
        MockSettingsRepo.INSTANCE.load();
        OtherRepo.INSTANCE.load();
        mIsDebug = z;
    }

    public static <T> T getDefaultValue(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            if (declaredFields != null) {
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                Field field = null;
                for (Field field2 : declaredFields) {
                    Group group = (Group) field2.getAnnotation(Group.class);
                    if (group != null) {
                        arrayList.add(field2);
                        if (group.isDefault()) {
                            field = field2;
                        }
                    }
                }
                if (field == null && arrayList.size() == 1) {
                    field = (Field) arrayList.get(0);
                }
                if (field != null) {
                    field.setAccessible(true);
                    if ((field.getModifiers() & 8) == 8) {
                        z = true;
                    }
                    if (z) {
                        return (T) field.get(null);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            SettingsManager.monitor.reportException("getDefaultValue", "exception: " + th.getMessage() + " ,class name: " + cls.getSimpleName());
            return null;
        }
    }

    private static Field getTargetField(Class cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        Field field = null;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                Field field2 = declaredFields[i2];
                Group group = (Group) field2.getAnnotation(Group.class);
                if (group != null) {
                    if (group.isDefault()) {
                        field = field2;
                        break;
                    }
                    field = field2;
                }
                i2++;
            } else if (field == null) {
                throw new RuntimeException("Can not find @Group in " + cls.getName());
            }
        }
        field.setAccessible(true);
        return field;
    }

    public static boolean getBooleanValue(String str, boolean z) {
        if (!mIsDebug || !MockSettingsRepo.INSTANCE.contains(str)) {
            return SettingsValueProvider.INSTANCE.getBooleanValue(str, z);
        }
        return MockSettingsRepo.INSTANCE.getBooleanValue(str, z);
    }

    public static double getDoubleValue(String str, double d2) {
        if (!mIsDebug || !MockSettingsRepo.INSTANCE.contains(str)) {
            return SettingsValueProvider.INSTANCE.getDoubleValue(str, d2);
        }
        return MockSettingsRepo.INSTANCE.getDoubleValue(str, d2);
    }

    public static float getFloatValue(String str, float f2) {
        if (!mIsDebug || !MockSettingsRepo.INSTANCE.contains(str)) {
            return SettingsValueProvider.INSTANCE.getFloatValue(str, f2);
        }
        return MockSettingsRepo.INSTANCE.getFloatValue(str, f2);
    }

    public static int getIntValue(String str, int i2) {
        if (!mIsDebug || !MockSettingsRepo.INSTANCE.contains(str)) {
            return SettingsValueProvider.INSTANCE.getIntValue(str, i2);
        }
        return MockSettingsRepo.INSTANCE.getIntValue(str, i2);
    }

    public static long getLongValue(String str, long j2) {
        if (!mIsDebug || !MockSettingsRepo.INSTANCE.contains(str)) {
            return SettingsValueProvider.INSTANCE.getLongValue(str, j2);
        }
        return MockSettingsRepo.INSTANCE.getLongValue(str, j2);
    }

    public static String[] getStringArrayValue(String str, String[] strArr) {
        if (!mIsDebug || !MockSettingsRepo.INSTANCE.contains(str)) {
            return SettingsValueProvider.INSTANCE.getStringArrayValue(str, strArr);
        }
        return MockSettingsRepo.INSTANCE.getStringArrayValue(str, strArr);
    }

    public static String getStringValue(String str, String str2) {
        if (!mIsDebug || !MockSettingsRepo.INSTANCE.contains(str)) {
            return SettingsValueProvider.INSTANCE.getStringValue(str, str2);
        }
        return MockSettingsRepo.INSTANCE.getStringValue(str, str2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValueSafely(String str, Class cls, Object obj) {
        if (mIsDebug && MockSettingsRepo.INSTANCE.contains(str)) {
            return (T) MockSettingsRepo.INSTANCE.getValue(str, cls);
        }
        T t = (T) SettingsValueProvider.INSTANCE.getValue(str, cls);
        return t == null ? obj : t;
    }
}

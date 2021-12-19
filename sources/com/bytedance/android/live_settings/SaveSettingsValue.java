package com.bytedance.android.live_settings;

import com.bytedance.android.live_settings.repo.OtherRepo;
import com.bytedance.android.live_settings.repo.SettingsRepo;
import com.bytedance.covode.number.Covode;
import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.r;
import java.util.ArrayList;
import java.util.Iterator;

public class SaveSettingsValue {
    protected static volatile boolean isSaving;

    static {
        Covode.recordClassIndex(7360);
    }

    static long getLatestSettingsSavedTime() {
        return OtherRepo.INSTANCE.getLongValue("settings_saved_time", 0);
    }

    static void save(o oVar, ArrayList<LiveSettingModel> arrayList) {
        isSaving = true;
        realSave(oVar, arrayList);
        isSaving = false;
        OtherRepo.INSTANCE.storeLongValue("settings_saved_time", System.currentTimeMillis());
    }

    private static void saveDoubleValue(o oVar, String str) {
        try {
            l c2 = oVar.c(str);
            if (c2 != null) {
                SettingsRepo.INSTANCE.storeDoubleValue(str, c2.d());
            } else {
                SettingsRepo.INSTANCE.erase(str);
            }
        } catch (Throwable th) {
            SettingsManager.monitor.reportException("saveDoubleValue", "exception: " + th.getMessage() + ", key: " + str);
        }
    }

    private static void saveFloatValue(o oVar, String str) {
        try {
            l c2 = oVar.c(str);
            if (c2 != null) {
                SettingsRepo.INSTANCE.storeFloatValue(str, c2.e());
            } else {
                SettingsRepo.INSTANCE.erase(str);
            }
        } catch (Throwable th) {
            SettingsManager.monitor.reportException("saveFloatValue", "exception: " + th.getMessage() + ", key: " + str);
        }
    }

    private static void saveLongValue(o oVar, String str) {
        try {
            l c2 = oVar.c(str);
            if (c2 != null) {
                SettingsRepo.INSTANCE.storeLongValue(str, c2.f());
            } else {
                SettingsRepo.INSTANCE.erase(str);
            }
        } catch (Throwable th) {
            SettingsManager.monitor.reportException("saveLongValue", "exception: " + th.getMessage() + ", key: " + str);
        }
    }

    private static void saveBooleanValue(o oVar, String str) {
        boolean z;
        try {
            r d2 = oVar.d(str);
            if (d2 == null) {
                SettingsRepo.INSTANCE.erase(str);
            } else if (d2.f54900a instanceof Number) {
                SettingsRepo settingsRepo = SettingsRepo.INSTANCE;
                if (d2.g() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                settingsRepo.storeBooleanValue(str, z);
            } else {
                SettingsRepo.INSTANCE.storeBooleanValue(str, d2.h());
            }
        } catch (Throwable th) {
            SettingsManager.monitor.reportException("saveBooleanValue", "exception: " + th.getMessage() + ", key: " + str);
        }
    }

    private static void saveCustomTypeValue(o oVar, String str) {
        try {
            l c2 = oVar.c(str);
            if (c2 != null) {
                SettingsRepo.INSTANCE.storeStringValue(str, c2.toString());
            } else if (oVar.b(str)) {
                SettingsRepo.INSTANCE.storeStringValue(str, null);
            } else {
                SettingsRepo.INSTANCE.erase(str);
            }
        } catch (Throwable th) {
            SettingsManager.monitor.reportException("saveCustomTypeValue", "exception: " + th.getMessage() + ", key: " + str);
        }
    }

    private static void saveIntValue(o oVar, String str) {
        int i2;
        try {
            r d2 = oVar.d(str);
            if (d2 == null) {
                SettingsRepo.INSTANCE.erase(str);
            } else if (d2.f54900a instanceof Boolean) {
                SettingsRepo settingsRepo = SettingsRepo.INSTANCE;
                if (d2.h()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                settingsRepo.storeIntValue(str, i2);
            } else {
                SettingsRepo.INSTANCE.storeIntValue(str, d2.g());
            }
        } catch (Throwable th) {
            SettingsManager.monitor.reportException("saveIntValue", "exception: " + th.getMessage() + ", key: " + str);
        }
    }

    private static void saveStringArrayValue(o oVar, String str) {
        try {
            l c2 = oVar.c(str);
            if (c2 != null) {
                SettingsRepo.INSTANCE.storeStringArrayValue(str, (String[]) SettingsRepo.INSTANCE.getGson().a(c2, String[].class));
            } else if (oVar.b(str)) {
                SettingsRepo.INSTANCE.storeStringArrayValue(str, null);
            } else {
                SettingsRepo.INSTANCE.erase(str);
            }
        } catch (Throwable th) {
            SettingsManager.monitor.reportException("saveStringArrayValue", "exception: " + th.getMessage() + ", key: " + str);
        }
    }

    private static void saveStringValue(o oVar, String str) {
        try {
            l c2 = oVar.c(str);
            if (c2 != null) {
                if (!(c2 instanceof r)) {
                    SettingsRepo.INSTANCE.storeStringValue(str, c2.toString());
                } else {
                    SettingsRepo.INSTANCE.storeStringValue(str, c2.c());
                }
            } else if (oVar.b(str)) {
                SettingsRepo.INSTANCE.storeStringValue(str, null);
            } else {
                SettingsRepo.INSTANCE.erase(str);
            }
        } catch (Throwable th) {
            SettingsManager.monitor.reportException("saveStringValue", "exception: " + th.getMessage() + ", key: " + str);
        }
    }

    private static void realSave(o oVar, ArrayList<LiveSettingModel> arrayList) {
        Iterator<LiveSettingModel> it = arrayList.iterator();
        while (it.hasNext()) {
            LiveSettingModel next = it.next();
            String fieldTypeName = next.getFieldTypeName();
            fieldTypeName.hashCode();
            switch (fieldTypeName.hashCode()) {
                case -1325958191:
                    if (fieldTypeName.equals("double")) {
                        saveDoubleValue(oVar, next.getSettingsKey());
                        continue;
                    }
                    break;
                case 104431:
                    if (fieldTypeName.equals("int")) {
                        saveIntValue(oVar, next.getSettingsKey());
                        continue;
                    }
                    break;
                case 3327612:
                    if (fieldTypeName.equals("long")) {
                        saveLongValue(oVar, next.getSettingsKey());
                        continue;
                    }
                    break;
                case 64711720:
                    if (fieldTypeName.equals("boolean")) {
                        saveBooleanValue(oVar, next.getSettingsKey());
                        continue;
                    }
                    break;
                case 97526364:
                    if (fieldTypeName.equals("float")) {
                        saveFloatValue(oVar, next.getSettingsKey());
                        continue;
                    }
                    break;
                case 1195259493:
                    if (fieldTypeName.equals("java.lang.String")) {
                        saveStringValue(oVar, next.getSettingsKey());
                        continue;
                    }
                    break;
                case 1888107655:
                    if (fieldTypeName.equals("java.lang.String[]")) {
                        saveStringArrayValue(oVar, next.getSettingsKey());
                        continue;
                    }
                    break;
            }
            saveCustomTypeValue(oVar, next.getSettingsKey());
        }
    }
}

package com.bef.effectsdk.algorithm;

import com.bytedance.covode.number.Covode;

public class GeneralObjDetectResult {
    private ObjectInfo[] obj_infos;
    private String obj_infos_data;
    private int obj_num;
    private int res;

    static {
        Covode.recordClassIndex(2862);
    }

    public static int com_bef_effectsdk_algorithm_GeneralObjDetectResult_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public ObjectInfo[] getObjectInfos() {
        return this.obj_infos;
    }

    public String getObjectInfosData() {
        return this.obj_infos_data;
    }

    public int getObjectNum() {
        return this.obj_num;
    }

    public int getResult() {
        return this.res;
    }

    public GeneralObjDetectResult() {
        this.res = -1;
    }

    public void logData() {
        com_bef_effectsdk_algorithm_GeneralObjDetectResult_com_ss_android_ugc_aweme_lancet_LogLancet_d("EffectSDK", "GeneralObjDetectResult res:" + this.res + " obj_num:" + this.obj_num);
        for (int i2 = 0; i2 < this.obj_num; i2++) {
            this.obj_infos[i2].logData();
        }
        com_bef_effectsdk_algorithm_GeneralObjDetectResult_com_ss_android_ugc_aweme_lancet_LogLancet_d("EffectSDK", "GeneralObjDetectResult buffer:" + this.obj_infos_data);
    }

    public void ObjectInfosData(String str) {
        this.obj_infos_data = str;
    }

    public void setObjectInfos(ObjectInfo[] objectInfoArr) {
        this.obj_infos = objectInfoArr;
    }

    public void setObjectNum(int i2) {
        this.obj_num = i2;
    }

    public void setResult(int i2) {
        this.res = i2;
    }

    public GeneralObjDetectResult(int i2, ObjectInfo[] objectInfoArr) {
        this.obj_num = i2;
        this.obj_infos = objectInfoArr;
    }

    public GeneralObjDetectResult(int i2, ObjectInfo[] objectInfoArr, String str) {
        this.obj_num = i2;
        this.obj_infos = objectInfoArr;
        this.obj_infos_data = str;
    }
}

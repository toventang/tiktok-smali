package com.bytedance.business.base;

import com.bytedance.business.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class BusinessToolsConfig {
    private static volatile BusinessToolsConfig mBusinessToolsConfig;
    private int aid;
    private int appVersionCode;
    private String appVersionName;
    private boolean isDebug;
    private a mBugReportConfig;

    static {
        Covode.recordClassIndex(15727);
    }

    public int getAid() {
        return this.aid;
    }

    public int getAppVersionCode() {
        return this.appVersionCode;
    }

    public String getAppVersionName() {
        return this.appVersionName;
    }

    public a getBugReportConfig() {
        return this.mBugReportConfig;
    }

    public boolean isDebug() {
        return this.isDebug;
    }

    public void setAid(int i2) {
        this.aid = i2;
    }

    public void setAppVersionCode(int i2) {
        this.appVersionCode = i2;
    }

    public void setAppVersionName(String str) {
        this.appVersionName = str;
    }

    public void setBugReportConfig(a aVar) {
        this.mBugReportConfig = aVar;
    }

    public void setDebug(boolean z) {
        this.isDebug = z;
    }

    private BusinessToolsConfig(String str, int i2, int i3, boolean z) {
        this.appVersionName = str;
        this.appVersionCode = i2;
        this.aid = i3;
        this.isDebug = z;
    }

    public static BusinessToolsConfig getInstance(String str, int i2, int i3, boolean z) {
        MethodCollector.i(6675);
        if (mBusinessToolsConfig == null) {
            synchronized (BusinessToolsConfig.class) {
                try {
                    if (mBusinessToolsConfig == null) {
                        mBusinessToolsConfig = new BusinessToolsConfig(str, i2, i3, z);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6675);
                    throw th;
                }
            }
        }
        BusinessToolsConfig businessToolsConfig = mBusinessToolsConfig;
        MethodCollector.o(6675);
        return businessToolsConfig;
    }
}

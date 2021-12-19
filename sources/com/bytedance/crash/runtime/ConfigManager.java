package com.bytedance.crash.runtime;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.e;
import com.bytedance.crash.j.a;
import com.bytedance.crash.m;
import com.bytedance.crash.util.b;
import com.bytedance.crash.util.k;
import com.bytedance.crash.util.u;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.news.common.service.manager.c;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;

public class ConfigManager {
    private static boolean sApmExists = true;
    private static IConfigManager sConfigManager;
    private String mAlogUploadUrl = "";
    private volatile long mAnrCheckInterval = 500;
    private String mApmConfigUrl = "";
    private String mAsanReportUploadUrl = "";
    private boolean mBlockMonitorEnable;
    private long mBlockMonitorInterval = 1000;
    private String mCoreDumpUrl = "";
    private e mEncryptImpl = new e() {
        /* class com.bytedance.crash.runtime.ConfigManager.AnonymousClass1 */

        static {
            Covode.recordClassIndex(16302);
        }

        @Override // com.bytedance.crash.e
        public final byte[] a(byte[] bArr) {
            return EncryptorUtil.a(bArr, bArr.length);
        }
    };
    private boolean mEnsureEnable = true;
    private boolean mEnsureWithLogcat;
    private final String mEventUploadUrl = "";
    private String mExceptionUploadUrl = "";
    private boolean mIsDebugMode;
    private String mJavaCrashUploadUrl = "";
    private long mLaunchCrashInterval = 8000;
    private String mLaunchCrashUploadUrl = "";
    private int mLogcatDumpCount = 512;
    private int mLogcatLevel = 1;
    private final boolean mNativeCrashMiniDump = true;
    private String mNativeCrashUploadUrl = "";
    private String mNativeMemUrl = "";
    private ThreadPoolExecutor mThreadPoolExecutor;
    private String mUploadCheckCoreDumpUrl = "";
    private boolean reportErrorEnable = true;

    public boolean isNativeCrashMiniDump() {
        return true;
    }

    public long getBlockInterval() {
        return this.mBlockMonitorInterval;
    }

    public long getDefaultAnrCheckInterval() {
        return this.mAnrCheckInterval;
    }

    public e getEncryptImpl() {
        return this.mEncryptImpl;
    }

    public Set<String> getFilterThreadSet() {
        return k.f28002a;
    }

    public long getLaunchCrashInterval() {
        return this.mLaunchCrashInterval;
    }

    public int getLogcatDumpCount() {
        return this.mLogcatDumpCount;
    }

    public int getLogcatLevel() {
        return this.mLogcatLevel;
    }

    public ThreadPoolExecutor getThreadPoolExecutor() {
        return this.mThreadPoolExecutor;
    }

    public boolean isApmExists() {
        return a.f27615e;
    }

    public boolean isBlockMonitorEnable() {
        return this.mBlockMonitorEnable;
    }

    public boolean isEnsureWithLogcat() {
        return this.mEnsureWithLogcat;
    }

    public boolean isReportErrorEnable() {
        return this.reportErrorEnable;
    }

    static {
        Covode.recordClassIndex(16301);
    }

    public String getUploadCheckCoreDumpUrl() {
        return a.f27841a;
    }

    public boolean isDebugMode() {
        if (this.mIsDebugMode || com.bytedance.crash.entity.e.f27563b) {
            return true;
        }
        return false;
    }

    public IConfigManager getApmConfigManager() {
        if (sApmExists && sConfigManager == null) {
            try {
                sConfigManager = (IConfigManager) c.a(IConfigManager.class);
            } catch (Throwable unused) {
                sApmExists = false;
            }
        }
        if (sApmExists) {
            return sConfigManager;
        }
        return null;
    }

    public String getAsanReportUploadUrl() {
        return a.f27841a + "/monitor/collect/c/native_bin_crash";
    }

    public String getCoreDumpUrl() {
        return a.f27841a + "/monitor/collect/c/core_dump_collect";
    }

    public String getEventUploadUrl() {
        return a.f27841a + "/monitor/collect/";
    }

    public String getNativeMemUrl() {
        return a.f27841a + "/monitor/collect/c/rapheal_file_collect";
    }

    public boolean isEnsureEnable() {
        if ((!b.b() || !com.bytedance.crash.runtime.b.a.c(d.a(m.a()))) && !this.mEnsureEnable) {
            return false;
        }
        return true;
    }

    public String getAlogUploadUrl() {
        if (!TextUtils.isEmpty(this.mAlogUploadUrl)) {
            return this.mAlogUploadUrl;
        }
        return a.f27841a + "/monitor/collect/c/logcollect";
    }

    public String getApmConfigUrl() {
        if (!TextUtils.isEmpty(this.mApmConfigUrl)) {
            return this.mApmConfigUrl;
        }
        return a.f27841a + "/monitor/appmonitor/v3/settings";
    }

    public String getExceptionUploadUrl() {
        if (!TextUtils.isEmpty(this.mExceptionUploadUrl)) {
            return this.mExceptionUploadUrl;
        }
        return a.f27841a + "/monitor/collect/c/exception";
    }

    public String getJavaCrashUploadUrl() {
        if (!TextUtils.isEmpty(this.mJavaCrashUploadUrl)) {
            return this.mJavaCrashUploadUrl;
        }
        return a.f27841a + "/monitor/collect/c/crash";
    }

    public String getLaunchCrashUploadUrl() {
        if (!TextUtils.isEmpty(this.mLaunchCrashUploadUrl)) {
            return this.mLaunchCrashUploadUrl;
        }
        return a.f27841a + "/monitor/collect/c/exception/dump_collection";
    }

    public String getNativeCrashUploadUrl() {
        if (!TextUtils.isEmpty(this.mNativeCrashUploadUrl)) {
            return this.mNativeCrashUploadUrl;
        }
        return a.f27841a + "/monitor/collect/c/native_bin_crash";
    }

    public void setBlockMonitorEnable(boolean z) {
        this.mBlockMonitorEnable = z;
    }

    public void setBlockMonitorInterval(long j2) {
        this.mBlockMonitorInterval = j2;
    }

    public void setCurrentProcessName(String str) {
        b.f27978a = str;
    }

    public void setDebugMode(boolean z) {
        this.mIsDebugMode = z;
    }

    public void setDefaultAnrCheckInterval(long j2) {
        this.mAnrCheckInterval = j2;
    }

    public void setEnsureEnable(boolean z) {
        this.mEnsureEnable = z;
    }

    public void setEnsureWithLogcat(boolean z) {
        this.mEnsureWithLogcat = z;
    }

    public void setReportErrorEnable(boolean z) {
        this.reportErrorEnable = z;
    }

    public void setThreadPoolExecutor(ThreadPoolExecutor threadPoolExecutor) {
        this.mThreadPoolExecutor = threadPoolExecutor;
    }

    public void setEncryptImpl(e eVar) {
        if (eVar != null) {
            this.mEncryptImpl = eVar;
        }
    }

    public void setLogcatDumpCount(int i2) {
        if (i2 > 0) {
            this.mLogcatDumpCount = i2;
        }
    }

    public void setLogcatLevel(int i2) {
        if (i2 >= 0 && i2 <= 4) {
            this.mLogcatLevel = i2;
        }
    }

    public void setAlogUploadUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mAlogUploadUrl = str;
        }
    }

    public void setConfigGetUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mApmConfigUrl = str;
        }
    }

    public void setJavaCrashUploadUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mJavaCrashUploadUrl = str;
        }
    }

    public void setLaunchCrashInterval(long j2) {
        if (j2 > 0) {
            this.mLaunchCrashInterval = j2;
        }
    }

    public void setNativeCrashUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mNativeCrashUploadUrl = str;
        }
    }

    public boolean isCrashIgnored(final String str) {
        try {
            AnonymousClass2 r1 = new com.bytedance.crash.runtime.b.b() {
                /* class com.bytedance.crash.runtime.ConfigManager.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(16303);
                }

                @Override // com.bytedance.crash.runtime.b.b
                public final Object a(String str) {
                    if (str.equals("md5")) {
                        return str;
                    }
                    return super.a(str);
                }
            };
            if (com.bytedance.crash.runtime.b.c.a("java_crash_ignore", r1)) {
                return true;
            }
            if (u.b(m.f27724a)) {
                return com.bytedance.crash.runtime.b.c.a("java_crash_ignore", r1);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void setLaunchCrashUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mExceptionUploadUrl = str;
            int indexOf = str.indexOf("//");
            if (indexOf == -1) {
                this.mLaunchCrashUploadUrl = str.substring(0, str.indexOf("/") + 1) + "monitor/collect/c/exception/dump_collection";
            } else {
                this.mLaunchCrashUploadUrl = str.substring(0, str.indexOf("/", indexOf + 2) + 1) + "monitor/collect/c/exception/dump_collection";
            }
        }
    }
}

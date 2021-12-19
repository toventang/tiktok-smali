package com.bytedance.keva;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.concurrent.Executor;

public class KevaBuilder {
    private static KevaBuilder mInstance = new KevaBuilder();
    Context mContext;
    Executor mExecutor;
    KevaMonitor mMonitor;
    String mPortedRepoName;
    IKevaPreLoader mPreLoader;
    File mWorkDir;

    static void clearInstance() {
        mInstance = null;
    }

    public static int com_bytedance_keva_KevaBuilder_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_keva_KevaBuilder_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    static {
        Covode.recordClassIndex(24499);
    }

    public static KevaBuilder getInstance() {
        KevaBuilder kevaBuilder = mInstance;
        if (kevaBuilder != null) {
            return kevaBuilder;
        }
        com_bytedance_keva_KevaBuilder_com_ss_android_ugc_aweme_lancet_LogLancet_w("Keva", "have already did init, builder is invalid now!");
        return new KevaBuilder();
    }

    public KevaBuilder setContext(Context context) {
        this.mContext = context;
        return this;
    }

    public KevaBuilder setExecutor(Executor executor) {
        this.mExecutor = executor;
        return this;
    }

    public KevaBuilder setMonitor(KevaMonitor kevaMonitor) {
        this.mMonitor = kevaMonitor;
        return this;
    }

    public KevaBuilder setPortedRepoName(String str) {
        this.mPortedRepoName = str;
        return this;
    }

    public KevaBuilder setPreLoader(IKevaPreLoader iKevaPreLoader) {
        this.mPreLoader = iKevaPreLoader;
        return this;
    }

    public KevaBuilder setWorkDir(File file) {
        if (!file.exists()) {
            com_bytedance_keva_KevaBuilder_com_ss_android_ugc_aweme_lancet_LogLancet_i("Keva", "work dir does not exist! try to create " + file.getPath());
            if (!file.mkdirs()) {
                com_bytedance_keva_KevaBuilder_com_ss_android_ugc_aweme_lancet_LogLancet_w("Keva", "work dir fail to create!");
                return this;
            }
        }
        this.mWorkDir = file;
        return this;
    }
}

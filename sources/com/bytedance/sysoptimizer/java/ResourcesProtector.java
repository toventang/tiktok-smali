package com.bytedance.sysoptimizer.java;

import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public class ResourcesProtector {
    private static final List<Config> sConfigs = new ArrayList();

    /* renamed from: com.bytedance.sysoptimizer.java.ResourcesProtector$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(27027);
        }
    }

    public static int com_bytedance_sysoptimizer_java_ResourcesProtector_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static final class Builder {
        private final Config mConfig = new Config(null);

        static {
            Covode.recordClassIndex(27028);
        }

        public final Config build() {
            return this.mConfig;
        }

        public final Builder maxStep(int i2) {
            if (i2 <= 0) {
                i2 = 0;
            }
            this.mConfig.mMaxStep = i2;
            return this;
        }

        public final Builder mockCrash(boolean z) {
            this.mConfig.mockCrash = z;
            return this;
        }

        public final Builder protectClassName(String str) {
            this.mConfig.mProtectClassName = str;
            return this;
        }

        public final Builder protectMethodName(String str) {
            this.mConfig.mProtectMethodName = str;
            return this;
        }

        public final Builder resId(int i2) {
            this.mConfig.mResId = i2;
            return this;
        }

        public final Builder returnId(int i2) {
            this.mConfig.mReturnIdWhenException = i2;
            return this;
        }

        public final Builder protectModels(String... strArr) {
            if (strArr == null) {
                return this;
            }
            this.mConfig.mProtectModels = new ArrayList(strArr.length);
            for (String str : strArr) {
                if (str != null) {
                    this.mConfig.mProtectModels.add(str);
                }
            }
            return this;
        }

        public final Builder protectApis(int... iArr) {
            if (iArr == null) {
                return this;
            }
            this.mConfig.mProtectApiLevels = new ArrayList(iArr.length);
            for (int i2 : iArr) {
                if (i2 >= 14) {
                    this.mConfig.mProtectApiLevels.add(Integer.valueOf(i2));
                }
            }
            return this;
        }
    }

    public static final class Config {
        public int mMaxStep;
        public List<Integer> mProtectApiLevels;
        public String mProtectClassName;
        public String mProtectMethodName;
        public List<String> mProtectModels;
        public int mResId;
        public int mReturnIdWhenException;
        public boolean mockCrash;

        static {
            Covode.recordClassIndex(27029);
        }

        private Config() {
        }

        public final boolean isValid() {
            if (!isMachineMatch() || this.mResId < 0 || this.mMaxStep <= 0 || TextUtils.isEmpty(this.mProtectClassName) || TextUtils.isEmpty(this.mProtectMethodName)) {
                return false;
            }
            return true;
        }

        private boolean isMachineMatch() {
            List<String> list;
            List<Integer> list2 = this.mProtectApiLevels;
            if (list2 == null || list2.isEmpty() || (list = this.mProtectModels) == null || list.isEmpty()) {
                return true;
            }
            boolean contains = this.mProtectApiLevels.contains(Integer.valueOf(Build.VERSION.SDK_INT));
            boolean contains2 = this.mProtectModels.contains(Build.MANUFACTURER + " " + Build.MODEL);
            if (!contains || !contains2) {
                return false;
            }
            return true;
        }

        /* synthetic */ Config(AnonymousClass1 r1) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(27026);
    }

    public static void registerConfig(Config config) {
        if (config != null) {
            sConfigs.add(config);
        }
    }

    public static Config getMatchConfig(int i2) {
        for (Config config : sConfigs) {
            if (config.mResId == i2 && config.isValid()) {
                return config;
            }
        }
        return null;
    }

    public int getInteger(int i2) {
        Config matchConfig = getMatchConfig(i2);
        if (matchConfig == null) {
            return ((Integer) new Object()).intValue();
        }
        try {
            if (!matchConfig.mockCrash) {
                return ((Integer) new Object()).intValue();
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i3 = 0; i3 < min; i3++) {
                StackTraceElement stackTraceElement = stackTrace[i3];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            com_bytedance_sysoptimizer_java_ResourcesProtector_com_ss_android_ugc_aweme_lancet_LogLancet_d("ResProtector", "return admin result " + matchConfig.mReturnIdWhenException + ", level = " + i3);
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return ((Integer) new Object()).intValue();
        }
    }
}

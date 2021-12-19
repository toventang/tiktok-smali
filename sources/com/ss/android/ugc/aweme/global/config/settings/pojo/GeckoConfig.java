package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class GeckoConfig {
    @c(a = "dyc_channel")
    private List<String> dycChannel;
    @c(a = "initial_channel")
    private List<String> initialChannel;
    @c(a = "initial_high_priority_channel")
    private List<String> initialHighPriorityChannel;
    @c(a = "use_new_package_now")
    private boolean useNewPackageNow;

    static {
        Covode.recordClassIndex(63041);
    }

    public List<String> getDynamicChannel() {
        return this.dycChannel;
    }

    public List<String> getInitialChannel() {
        return this.initialChannel;
    }

    public List<String> getInitialHighPriorityChannel() {
        return this.initialHighPriorityChannel;
    }

    public boolean getUseNewPackageNow() {
        return this.useNewPackageNow;
    }
}

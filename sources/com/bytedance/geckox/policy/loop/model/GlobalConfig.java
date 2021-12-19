package com.bytedance.geckox.policy.loop.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.Map;

public class GlobalConfig {
    @c(a = "check_update")
    private Map<String, LoopInterval> checkUpdate;

    static {
        Covode.recordClassIndex(17408);
    }

    public GlobalConfig() {
    }

    public Map<String, LoopInterval> getCheckUpdate() {
        return this.checkUpdate;
    }

    public GlobalConfig(Map<String, LoopInterval> map) {
        this.checkUpdate = map;
    }
}

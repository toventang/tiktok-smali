package com.bytedance.router.plugin;

import com.bytedance.covode.number.Covode;
import java.util.List;

public interface SupportPluginCallback {
    static {
        Covode.recordClassIndex(26192);
    }

    List<Plugin> initPlugins();

    void loadPlugin(Plugin plugin, String str);
}

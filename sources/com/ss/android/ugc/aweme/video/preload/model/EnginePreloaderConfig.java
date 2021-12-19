package com.ss.android.ugc.aweme.video.preload.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class EnginePreloaderConfig {
    @c(a = "enable_extern_dns")
    public int enableExternDns = 1;
    @c(a = "enable_socket_idle_timeout")
    public int enableSocketIdleTimeout = 120;
    @c(a = "enable_socket_reuse")
    public int enableSocketReuse = 1;

    static {
        Covode.recordClassIndex(94045);
    }
}

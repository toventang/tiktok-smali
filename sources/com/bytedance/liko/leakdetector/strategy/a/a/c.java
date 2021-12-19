package com.bytedance.liko.leakdetector.strategy.a.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f40135a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(24730);
    }

    public static b a(Map<String, String> map) {
        l.c(map, "");
        return new b(map.get("aid"), map.get("channel"), map.get("device_id"), map.get("app_version"), map.get("update_version_code"), map.get("current_update_version_code"), map.get("os_version"), map.get("os_api"), map.get("device_model"), map.get("device_brand"), map.get("device_manufacturer"), map.get("process_name"), map.get("version_name"), map.get("version_code"), map.get("region"), "Android", "android", String.valueOf(System.currentTimeMillis()), String.valueOf(System.currentTimeMillis()), map.get("release_build"));
    }
}

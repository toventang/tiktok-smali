package com.ss.android.ugc.aweme.playerkit.configpickerimpl.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.l;
import java.util.List;
import java.util.Map;

public class ConditionConfig {
    @c(a = "client_filter_requirement")

    /* renamed from: a  reason: collision with root package name */
    public Map<String, List<String>> f115519a;
    @c(a = "server_filter_requirement")

    /* renamed from: b  reason: collision with root package name */
    public Map<String, List<String>> f115520b;
    @c(a = "config")

    /* renamed from: c  reason: collision with root package name */
    public l f115521c;

    static {
        Covode.recordClassIndex(74152);
    }

    public final int a() {
        int size;
        Map<String, List<String>> map = this.f115519a;
        int i2 = 0;
        if (map == null) {
            size = 0;
        } else {
            size = map.size();
        }
        Map<String, List<String>> map2 = this.f115520b;
        if (map2 != null) {
            i2 = map2.size();
        }
        return size + i2;
    }
}

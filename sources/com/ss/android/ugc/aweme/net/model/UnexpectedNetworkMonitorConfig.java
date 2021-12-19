package com.ss.android.ugc.aweme.net.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Arrays;
import java.util.Objects;

public final class UnexpectedNetworkMonitorConfig {
    private final UnexpectedConfig[] responses;
    private final UnexpectedConfig[] urls;

    static {
        Covode.recordClassIndex(72266);
    }

    public static /* synthetic */ UnexpectedNetworkMonitorConfig copy$default(UnexpectedNetworkMonitorConfig unexpectedNetworkMonitorConfig, UnexpectedConfig[] unexpectedConfigArr, UnexpectedConfig[] unexpectedConfigArr2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            unexpectedConfigArr = unexpectedNetworkMonitorConfig.urls;
        }
        if ((i2 & 2) != 0) {
            unexpectedConfigArr2 = unexpectedNetworkMonitorConfig.responses;
        }
        return unexpectedNetworkMonitorConfig.copy(unexpectedConfigArr, unexpectedConfigArr2);
    }

    public final UnexpectedConfig[] component1() {
        return this.urls;
    }

    public final UnexpectedConfig[] component2() {
        return this.responses;
    }

    public final UnexpectedNetworkMonitorConfig copy(UnexpectedConfig[] unexpectedConfigArr, UnexpectedConfig[] unexpectedConfigArr2) {
        l.d(unexpectedConfigArr, "");
        l.d(unexpectedConfigArr2, "");
        return new UnexpectedNetworkMonitorConfig(unexpectedConfigArr, unexpectedConfigArr2);
    }

    public final String toString() {
        return "UnexpectedNetworkMonitorConfig(urls=" + Arrays.toString(this.urls) + ", responses=" + Arrays.toString(this.responses) + ")";
    }

    public final UnexpectedConfig[] getResponses() {
        return this.responses;
    }

    public final UnexpectedConfig[] getUrls() {
        return this.urls;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.responses) * 31) + Arrays.hashCode(this.urls);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!l.a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.net.model.UnexpectedNetworkMonitorConfig");
        UnexpectedNetworkMonitorConfig unexpectedNetworkMonitorConfig = (UnexpectedNetworkMonitorConfig) obj;
        if (Arrays.equals(this.responses, unexpectedNetworkMonitorConfig.responses) && Arrays.equals(this.urls, unexpectedNetworkMonitorConfig.urls)) {
            return true;
        }
        return false;
    }

    public UnexpectedNetworkMonitorConfig(UnexpectedConfig[] unexpectedConfigArr, UnexpectedConfig[] unexpectedConfigArr2) {
        l.d(unexpectedConfigArr, "");
        l.d(unexpectedConfigArr2, "");
        this.urls = unexpectedConfigArr;
        this.responses = unexpectedConfigArr2;
    }
}

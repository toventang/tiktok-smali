package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class TrafficControl implements Serializable {
    @c(a = "business")
    private final String business;
    @c(a = "strategy")
    private final List<Strategy> strategy;

    static {
        Covode.recordClassIndex(47344);
    }

    public TrafficControl() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.api.model.TrafficControl */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrafficControl copy$default(TrafficControl trafficControl, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = trafficControl.business;
        }
        if ((i2 & 2) != 0) {
            list = trafficControl.strategy;
        }
        return trafficControl.copy(str, list);
    }

    public final String component1() {
        return this.business;
    }

    public final List<Strategy> component2() {
        return this.strategy;
    }

    public final TrafficControl copy(String str, List<Strategy> list) {
        return new TrafficControl(str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrafficControl)) {
            return false;
        }
        TrafficControl trafficControl = (TrafficControl) obj;
        return l.a(this.business, trafficControl.business) && l.a(this.strategy, trafficControl.strategy);
    }

    public final int hashCode() {
        String str = this.business;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<Strategy> list = this.strategy;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "TrafficControl(business=" + this.business + ", strategy=" + this.strategy + ")";
    }

    public final String getBusiness() {
        return this.business;
    }

    public final List<Strategy> getStrategy() {
        return this.strategy;
    }

    public TrafficControl(String str, List<Strategy> list) {
        this.business = str;
        this.strategy = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TrafficControl(String str, List list, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? z.INSTANCE : list);
    }
}

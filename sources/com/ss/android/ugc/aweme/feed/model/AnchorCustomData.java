package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.Map;

public final class AnchorCustomData implements Serializable {
    private final boolean openOnLaunch;
    private boolean shouldOpen;
    private final Map<String, String> trackingData;

    static {
        Covode.recordClassIndex(59296);
    }

    public AnchorCustomData() {
        this(false, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feed.model.AnchorCustomData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnchorCustomData copy$default(AnchorCustomData anchorCustomData, boolean z, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = anchorCustomData.openOnLaunch;
        }
        if ((i2 & 2) != 0) {
            map = anchorCustomData.trackingData;
        }
        return anchorCustomData.copy(z, map);
    }

    public final boolean component1() {
        return this.openOnLaunch;
    }

    public final Map<String, String> component2() {
        return this.trackingData;
    }

    public final AnchorCustomData copy(boolean z, Map<String, String> map) {
        return new AnchorCustomData(z, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchorCustomData)) {
            return false;
        }
        AnchorCustomData anchorCustomData = (AnchorCustomData) obj;
        return this.openOnLaunch == anchorCustomData.openOnLaunch && l.a(this.trackingData, anchorCustomData.trackingData);
    }

    public final int hashCode() {
        boolean z = this.openOnLaunch;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        Map<String, String> map = this.trackingData;
        return i5 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "AnchorCustomData(openOnLaunch=" + this.openOnLaunch + ", trackingData=" + this.trackingData + ")";
    }

    public final boolean getOpenOnLaunch() {
        return this.openOnLaunch;
    }

    public final boolean getShouldOpen() {
        return this.shouldOpen;
    }

    public final Map<String, String> getTrackingData() {
        return this.trackingData;
    }

    public final void setShouldOpen(boolean z) {
        this.shouldOpen = z;
    }

    public AnchorCustomData(boolean z, Map<String, String> map) {
        this.openOnLaunch = z;
        this.trackingData = map;
        this.shouldOpen = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnchorCustomData(boolean z, Map map, int i2, g gVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : map);
    }
}

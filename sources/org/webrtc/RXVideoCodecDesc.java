package org.webrtc;

import com.bytedance.covode.number.Covode;

public class RXVideoCodecDesc {
    public final RXVideoCodecProfile profile;
    public final RXVideoCodecStandard standard;

    static {
        Covode.recordClassIndex(106643);
    }

    /* access modifiers changed from: package-private */
    public RXVideoCodecProfile getProfile() {
        return this.profile;
    }

    /* access modifiers changed from: package-private */
    public RXVideoCodecStandard getStandard() {
        return this.standard;
    }

    /* access modifiers changed from: package-private */
    public int GetProfileInt() {
        return this.profile.toInt();
    }

    /* access modifiers changed from: package-private */
    public int GetStandardInt() {
        return this.standard.toInt();
    }

    /* access modifiers changed from: package-private */
    public String getName() {
        return this.standard.mimeType();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RXVideoCodecDesc)) {
            return false;
        }
        RXVideoCodecDesc rXVideoCodecDesc = (RXVideoCodecDesc) obj;
        if (this.standard == rXVideoCodecDesc.standard && this.profile == rXVideoCodecDesc.profile) {
            return true;
        }
        return false;
    }

    public RXVideoCodecDesc(RXVideoCodecStandard rXVideoCodecStandard, RXVideoCodecProfile rXVideoCodecProfile) {
        this.standard = rXVideoCodecStandard;
        this.profile = rXVideoCodecProfile;
    }

    public RXVideoCodecDesc(int i2, int i3) {
        this.standard = RXVideoCodecStandard.fromValue(i2);
        this.profile = RXVideoCodecProfile.fromValue(i3);
    }
}

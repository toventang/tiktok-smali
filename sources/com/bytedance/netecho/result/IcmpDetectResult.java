package com.bytedance.netecho.result;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Arrays;

public final class IcmpDetectResult extends Result {
    private final int errorCode;
    private final int errorStage;
    private final IcmpPacketResult[] packetResults;
    private final boolean success;

    static {
        Covode.recordClassIndex(25444);
    }

    public static /* synthetic */ IcmpDetectResult copy$default(IcmpDetectResult icmpDetectResult, boolean z, IcmpPacketResult[] icmpPacketResultArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = icmpDetectResult.success;
        }
        if ((i4 & 2) != 0) {
            icmpPacketResultArr = icmpDetectResult.packetResults;
        }
        if ((i4 & 4) != 0) {
            i2 = icmpDetectResult.errorStage;
        }
        if ((i4 & 8) != 0) {
            i3 = icmpDetectResult.errorCode;
        }
        return icmpDetectResult.copy(z, icmpPacketResultArr, i2, i3);
    }

    public final boolean component1() {
        return this.success;
    }

    public final IcmpPacketResult[] component2() {
        return this.packetResults;
    }

    public final int component3() {
        return this.errorStage;
    }

    public final int component4() {
        return this.errorCode;
    }

    public final IcmpDetectResult copy(boolean z, IcmpPacketResult[] icmpPacketResultArr, int i2, int i3) {
        return new IcmpDetectResult(z, icmpPacketResultArr, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IcmpDetectResult) {
                IcmpDetectResult icmpDetectResult = (IcmpDetectResult) obj;
                if (!(this.success == icmpDetectResult.success && l.a(this.packetResults, icmpDetectResult.packetResults) && this.errorStage == icmpDetectResult.errorStage && this.errorCode == icmpDetectResult.errorCode)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.success;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        IcmpPacketResult[] icmpPacketResultArr = this.packetResults;
        return ((((i5 + (icmpPacketResultArr != null ? Arrays.hashCode(icmpPacketResultArr) : 0)) * 31) + this.errorStage) * 31) + this.errorCode;
    }

    public final String toString() {
        return "IcmpDetectResult(success=" + this.success + ", packetResults=" + Arrays.toString(this.packetResults) + ", errorStage=" + this.errorStage + ", errorCode=" + this.errorCode + ")";
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final int getErrorStage() {
        return this.errorStage;
    }

    public final IcmpPacketResult[] getPacketResults() {
        return this.packetResults;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public IcmpDetectResult(boolean z, IcmpPacketResult[] icmpPacketResultArr, int i2, int i3) {
        this.success = z;
        this.packetResults = icmpPacketResultArr;
        this.errorStage = i2;
        this.errorCode = i3;
    }
}

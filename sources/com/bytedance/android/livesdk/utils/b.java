package com.bytedance.android.livesdk.utils;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveTestSkipLinkMicBundleCheckSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveTestSkipCMAFBundleCheckSettings;
import com.bytedance.android.livesdk.livesetting.other.LiveTestSkipQuicBundleCheckSettings;
import com.bytedance.android.livesdk.livesetting.other.LiveTestSkipRTSBundleCheckSettings;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;

public enum b {
    LINK_MIC(new String[]{"df_live_byte_link"}, new String[]{"volcenginertc"}, Boolean.valueOf(LiveTestSkipLinkMicBundleCheckSetting.INSTANCE.getValue())),
    QUIC(new String[]{"df_live_quic"}, new String[]{"ttquic", "bytevc1enc"}, Boolean.valueOf(LiveTestSkipQuicBundleCheckSettings.INSTANCE.getValue())),
    RTS(new String[]{"df_live_rts"}, new String[]{"byterts"}, Boolean.valueOf(LiveTestSkipRTSBundleCheckSettings.INSTANCE.getValue())),
    CMAF(new String[]{"df_live_cmaf"}, new String[]{"ttffmpeg", "ttmcmaf"}, Boolean.valueOf(LiveTestSkipCMAFBundleCheckSettings.INSTANCE.getValue()));
    
    public final String[] appBundles;
    public final Boolean gateValue;
    public final String[] soNames;

    public final boolean gateClosed() {
        return this.gateValue.booleanValue();
    }

    public final String toString() {
        return Arrays.toString(this.appBundles);
    }

    static {
        Covode.recordClassIndex(13140);
    }

    private b(String[] strArr, String[] strArr2, Boolean bool) {
        this.appBundles = strArr;
        this.soNames = strArr2;
        this.gateValue = bool;
    }
}

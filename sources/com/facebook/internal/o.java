package com.facebook.internal;

import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.facebook.internal.p;
import com.facebook.m;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.playerkit.model.v;
import java.util.HashMap;
import java.util.Map;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<b, String[]> f48626a = new HashMap();

    public interface a {
        static {
            Covode.recordClassIndex(29335);
        }

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(29332);
    }

    public enum b {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        Monitoring(196608),
        Login(16777216),
        ChromeCustomTabsPrefetching(16842752),
        IgnoreAppSwitchToLoggedOut(16908288),
        Share(33554432),
        Places(50331648);
        
        private final int code;

        public final String a() {
            return "FBSDKFeature" + toString();
        }

        public final b getParent() {
            int i2 = this.code;
            if ((i2 & 255) > 0) {
                return a(i2 & -256);
            }
            if ((65280 & i2) > 0) {
                return a(i2 & -65536);
            }
            if ((16711680 & i2) > 0) {
                return a(i2 & -16777216);
            }
            return a(0);
        }

        public final String toString() {
            switch (AnonymousClass2.f48629a[ordinal()]) {
                case 1:
                    return "RestrictiveDataFiltering";
                case 2:
                    return "Instrument";
                case 3:
                    return "CrashReport";
                case 4:
                    return "CrashShield";
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    return "ThreadCheck";
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    return "ErrorReport";
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    return "AAM";
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    return "PrivacyProtection";
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    return "SuggestedEvents";
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    return "IntelligentIntegrity";
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    return "ModelRequest";
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    return "EventDeactivation";
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    return "OnDeviceEventProcessing";
                case ABRConfig.ABR_SELECT_SCENE:
                    return "OnDevicePostInstallEventProcessing";
                case 15:
                    return "ChromeCustomTabsPrefetching";
                case 16:
                    return "Monitoring";
                case 17:
                    return "IgnoreAppSwitchToLoggedOut";
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    return "CoreKit";
                case 19:
                    return "AppEvents";
                case v.U /*{ENCODED_INT: 20}*/:
                    return "CodelessEvents";
                case 21:
                    return "LoginKit";
                case 22:
                    return "ShareKit";
                case 23:
                    return "PlacesKit";
                default:
                    return "unknown";
            }
        }

        static {
            Covode.recordClassIndex(29336);
        }

        private static b a(int i2) {
            b[] values = values();
            for (b bVar : values) {
                if (bVar.code == i2) {
                    return bVar;
                }
            }
            return Unknown;
        }

        private b(int i2) {
            this.code = i2;
        }
    }

    private static synchronized void a() {
        synchronized (o.class) {
            MethodCollector.i(881);
            Map<b, String[]> map = f48626a;
            if (!map.isEmpty()) {
                MethodCollector.o(881);
                return;
            }
            map.put(b.AAM, new String[]{"com.facebook.appevents.aam."});
            map.put(b.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
            map.put(b.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
            map.put(b.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
            map.put(b.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
            map.put(b.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
            map.put(b.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
            map.put(b.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
            map.put(b.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
            map.put(b.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
            MethodCollector.o(881);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.internal.o$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f48629a;

        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|(3:45|46|48)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(48:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0095 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00a1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00dd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0101 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x010d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 282
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.o.AnonymousClass2.<clinit>():void");
        }
    }

    private static boolean b(b bVar) {
        boolean c2 = c(bVar);
        String a2 = bVar.a();
        ae.a();
        return p.a(a2, m.f48915a, c2);
    }

    public static b a(String str) {
        a();
        for (Map.Entry<b, String[]> entry : f48626a.entrySet()) {
            String[] value = entry.getValue();
            int length = value.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (str.startsWith(value[i2])) {
                        return entry.getKey();
                    }
                    i2++;
                }
            }
        }
        return b.Unknown;
    }

    private static boolean c(b bVar) {
        switch (AnonymousClass2.f48629a[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
            case ABRConfig.ABR_SELECT_SCENE:
            case 15:
            case 16:
            case 17:
                return false;
            default:
                return true;
        }
    }

    public static boolean a(b bVar) {
        if (b.Unknown == bVar) {
            return false;
        }
        if (b.Core == bVar) {
            return true;
        }
        ae.a();
        String string = d.a(m.f48921g, "com.facebook.internal.FEATURE_MANAGER", 0).getString(bVar.a(), null);
        if (string != null && string.equals("9.0.0")) {
            return false;
        }
        b parent = bVar.getParent();
        if (parent == bVar) {
            return b(bVar);
        }
        if (!a(parent) || !b(bVar)) {
            return false;
        }
        return true;
    }

    public static void a(final b bVar, final a aVar) {
        p.a(new p.a() {
            /* class com.facebook.internal.o.AnonymousClass1 */

            static {
                Covode.recordClassIndex(29333);
            }

            @Override // com.facebook.internal.p.a
            public final void a() {
                aVar.a(o.a(bVar));
            }
        });
    }
}

package com.ss.android.ttvecamera.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ttvecamera.c.a;
import com.ss.android.ttvecamera.j;
import com.ss.android.ttvecamera.o;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class b implements a.d {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<a.EnumC1339a, a.c> f61465a;

    static {
        Covode.recordClassIndex(37837);
        HashMap hashMap = new HashMap();
        f61465a = hashMap;
        hashMap.put(a.EnumC1339a.DEPTH_OUTPUT, a.c.STRING);
        hashMap.put(a.EnumC1339a.PREVIEW_SIZE, a.c.STRING);
        hashMap.put(a.EnumC1339a.FPS_RANGE, a.c.STRING);
        hashMap.put(a.EnumC1339a.MANUAL_3A, a.c.STRING);
        hashMap.put(a.EnumC1339a.HIGH_SPEED_VIDEO_FPS_RANGE, a.c.STRING);
        hashMap.put(a.EnumC1339a.SUPPORT_APERTURES, a.c.STRING);
        hashMap.put(a.EnumC1339a.LOGICAL_MULTI_CAMERA, a.c.STRING);
    }

    /* renamed from: com.ss.android.ttvecamera.c.b$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f61466a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f61467b;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0075 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0089 */
        static {
            /*
            // Method dump skipped, instructions count: 148
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.c.b.AnonymousClass1.<clinit>():void");
        }
    }

    @Override // com.ss.android.ttvecamera.c.a.d
    public final a.c a(a.EnumC1339a aVar) {
        Map<a.EnumC1339a, a.c> map = f61465a;
        if (map.get(aVar) == null) {
            return a.c.UNKNOWN;
        }
        return map.get(aVar);
    }

    @Override // com.ss.android.ttvecamera.c.a.d
    public final void a(List<a.b> list) {
        String str;
        String str2;
        for (a.b bVar : list) {
            switch (AnonymousClass1.f61467b[bVar.f61461a.ordinal()]) {
                case 1:
                    str = "te_record_camera_depth_capacity";
                    break;
                case 2:
                    str = "te_record_camera_support_preview_size";
                    break;
                case 3:
                    str = "te_record_camera_support_fps_range";
                    break;
                case 4:
                    str = "te_record_camera_manual_3a_capability";
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    str = "te_record_camera_high_speed_video_fps_range";
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    str = "te_record_camera_support_apertures";
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    str = "te_record_camera_logical_multi_camera_capacity";
                    break;
                default:
                    o.c("TECameraCapabilityKBUpload", "key is null, capability is incorrect!");
                    continue;
            }
            int i2 = AnonymousClass1.f61466a[bVar.f61462b.ordinal()];
            if (i2 == 1 || i2 == 2) {
                j.a(str, ((Long) bVar.f61463c).longValue());
            } else if (i2 == 3) {
                j.a(str, ((Double) bVar.f61463c).doubleValue());
            } else if (i2 == 4) {
                if (((Boolean) bVar.f61463c).booleanValue()) {
                    str2 = "true";
                } else {
                    str2 = "false";
                }
                j.a(str, str2);
            } else if (i2 == 5) {
                j.a(str, (String) bVar.f61463c);
            }
        }
    }
}

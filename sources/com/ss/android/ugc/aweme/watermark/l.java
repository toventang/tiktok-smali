package com.ss.android.ugc.aweme.watermark;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.b;
import com.ss.android.ugc.aweme.property.ei;
import com.ss.android.ugc.aweme.property.ej;
import com.ss.android.ugc.aweme.property.ek;
import com.ss.android.ugc.aweme.property.el;
import com.ss.android.ugc.aweme.property.em;
import com.ss.android.ugc.aweme.shortvideo.af.a.a;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import dmt.av.video.c;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static int f144795a;

    /* renamed from: b  reason: collision with root package name */
    public static int f144796b;

    /* renamed from: c  reason: collision with root package name */
    public static VEUtils.VEVideoFileInfo f144797c;

    /* renamed from: d  reason: collision with root package name */
    public static final l f144798d = new l();

    private l() {
    }

    static {
        Covode.recordClassIndex(94697);
    }

    public static final boolean b(int i2, int i3) {
        double d2 = (double) i2;
        double d3 = (double) i3;
        Double.isNaN(d3);
        Double.isNaN(d2);
        if (Math.abs((d2 / (d3 * 1.0d)) - 1.7777777777777777d) < 0.001d) {
            return true;
        }
        return false;
    }

    public static final VEVideoEncodeSettings a(int i2, int i3) {
        VEVideoEncodeSettings.a aVar = new VEVideoEncodeSettings.a(3);
        aVar.g(ej.a()).a(i2, i3);
        boolean b2 = b.b();
        bj.a("VEWatermarkParamBuilder VEVideoEncodeSettings hardEncode:".concat(String.valueOf(b2)));
        if (b2) {
            aVar.b(true).a(VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR, c.a(ei.a()));
        } else {
            aVar.b(false).a(VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF, em.a());
        }
        VEVideoEncodeSettings.ENCODE_PRESET a2 = c.a(el.a());
        if (a2 != null) {
            aVar.a(a2);
        }
        aVar.a(ek.a());
        aVar.f150865a.enableRemuxVideo = false;
        aVar.f(1);
        VEVideoEncodeSettings d2 = aVar.d();
        h.f.b.l.b(d2, "");
        return d2;
    }

    public static final a a(int i2, String str, boolean z, int[] iArr) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(iArr, "");
        if (z) {
            return new k(str, iArr[0], iArr[1], i2);
        }
        return new a(str, iArr[0], iArr[1], i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.ss.android.vesdk.VEWatermarkParam a(com.ss.android.ugc.aweme.shortvideo.af.a.a r24, com.ss.android.ugc.aweme.account.model.a r25, int[] r26, boolean r27, java.lang.String r28, boolean r29) {
        /*
        // Method dump skipped, instructions count: 817
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.watermark.l.a(com.ss.android.ugc.aweme.shortvideo.af.a.a, com.ss.android.ugc.aweme.account.model.a, int[], boolean, java.lang.String, boolean):com.ss.android.vesdk.VEWatermarkParam");
    }
}

package com.ss.ttm.player;

import android.media.MediaCodecInfo;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.TreeMap;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    private static Map<String, Integer> f152026d;

    /* renamed from: a  reason: collision with root package name */
    public MediaCodecInfo f152027a;

    /* renamed from: b  reason: collision with root package name */
    public int f152028b;

    /* renamed from: c  reason: collision with root package name */
    public String f152029c;

    static {
        Covode.recordClassIndex(101328);
    }

    public static a a(MediaCodecInfo mediaCodecInfo, String str) {
        if (mediaCodecInfo == null) {
            return null;
        }
        String name = mediaCodecInfo.getName();
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        Map<String, Integer> map = f152026d;
        if (map == null) {
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            f152026d = treeMap;
            treeMap.put("OMX.qcom.video.decoder.avc", 100);
            f152026d.put("OMX.qcom.video.decoder.hevc", 100);
            f152026d.put("OMX.qcom.video.decoder.hevcswvdec", 20);
            f152026d.put("OMX.MTK.VIDEO.DECODER.HEVC", 100);
            f152026d.put("OMX.MTK.VIDEO.DECODER.AVC", 100);
            f152026d.put("OMX.Nvidia.h264.decode", 100);
            f152026d.put("OMX.Intel.hw_vd.h264", 100);
            f152026d.put("OMX.Intel.VideoDecoder.AVC", 99);
            f152026d.put("OMX.SEC.avc.dec", 100);
            f152026d.put("OMX.SEC.AVC.Decoder", 99);
            f152026d.put("OMX.SEC.avcdec", 98);
            f152026d.put("OMX.SEC.avc.sw.dec", 20);
            f152026d.put("OMX.SEC.hevc.sw.dec", 20);
            f152026d.put("OMX.Exynos.avc.dec", 100);
            f152026d.put("OMX.Exynos.AVC.Decoder", 99);
            f152026d.put("OMX.TI.DUCATI1.VIDEO.DECODER", 100);
            f152026d.put("OMX.rk.video_decoder.avc", 100);
            f152026d.put("OMX.amlogic.avc.decoder.awesome", 100);
            f152026d.put("OMX.MARVELL.VIDEO.HW.CODA7542DECODER", 100);
            f152026d.put("OMX.brcm.video.h264.hw.decoder", 40);
            f152026d.put("OMX.k3.video.decoder.avc", 40);
            f152026d.put("OMX.IMG.MSVDX.Decoder.AVC", 100);
            f152026d.put("OMX.hisi.video.decoder.avc", 100);
            f152026d.put("OMX.hisi.video.decoder.hevc", 100);
            f152026d.put("OMX.MARVELL.VIDEO.H264DECODER", 20);
            f152026d.put("OMX.sprd.soft.h264.decoder", 20);
            map = f152026d;
        }
        Integer num = map.get(name);
        int i2 = 60;
        if (num != null) {
            i2 = num.intValue();
        } else {
            try {
                if (mediaCodecInfo.getCapabilitiesForType(str) != null) {
                    i2 = 70;
                }
            } catch (Exception unused) {
            }
        }
        a aVar = new a();
        aVar.f152027a = mediaCodecInfo;
        aVar.f152029c = str;
        aVar.f152028b = i2;
        return aVar;
    }
}

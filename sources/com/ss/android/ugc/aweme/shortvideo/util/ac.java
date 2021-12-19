package com.ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.publish.f.h;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.dq;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.k;
import com.ss.android.ugc.aweme.utils.ir;
import com.ss.android.ugc.tools.utils.m;
import h.f.b.l;
import h.p;
import java.util.LinkedHashMap;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    private final VideoPublishEditModel f132195a;

    /* renamed from: b  reason: collision with root package name */
    private final h f132196b;

    /* renamed from: c  reason: collision with root package name */
    private final SynthetiseResult f132197c;

    static {
        Covode.recordClassIndex(86570);
    }

    public final LinkedHashMap<String, String> a() {
        g.a().o().k().a("create_aweme", "start building create/aweme request fields");
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        String str = this.f132196b.f118767i;
        if (str == null) {
            str = "";
        }
        l.b(str, "");
        linkedHashMap.put("video_id", str);
        String str2 = "1";
        linkedHashMap.put("new_sdk", str2);
        linkedHashMap.put("mixed_type", String.valueOf(this.f132195a.getStickPointType()));
        a(this.f132195a, linkedHashMap);
        b(this.f132195a, linkedHashMap);
        ir.a(this.f132196b, linkedHashMap);
        p<Integer, Integer> a2 = m.a(this.f132195a);
        int intValue = a2.component1().intValue();
        int intValue2 = a2.component2().intValue();
        linkedHashMap.put("video_cnt", String.valueOf(intValue));
        linkedHashMap.put("pic_cnt", String.valueOf(intValue2));
        if (intValue + intValue2 <= 1) {
            str2 = "0";
        }
        linkedHashMap.put("is_multi_content", str2);
        dq dqVar = new dq();
        dqVar.a(this.f132195a, linkedHashMap);
        if (this.f132195a.openPlatformClientKey != null) {
            String str3 = this.f132195a.openPlatformClientKey;
            l.b(str3, "");
            linkedHashMap.put("open_platform_key", str3);
        }
        if (this.f132195a.openPlatformExtra != null) {
            String str4 = this.f132195a.openPlatformExtra;
            l.b(str4, "");
            linkedHashMap.put("open_platform_extra", str4);
        }
        dqVar.a(this.f132195a, this.f132197c, linkedHashMap);
        return linkedHashMap;
    }

    private static void a(VideoPublishEditModel videoPublishEditModel, LinkedHashMap<String, String> linkedHashMap) {
        boolean[] zArr;
        String str;
        if (videoPublishEditModel.infoStickerModel != null) {
            InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
            l.b(infoStickerModel, "");
            zArr = k.a(infoStickerModel);
        } else {
            zArr = new boolean[]{false, false};
        }
        String str2 = "1";
        if (zArr[0]) {
            str = str2;
        } else {
            str = "0";
        }
        linkedHashMap.put("is_diy_prop", str);
        if (!zArr[1]) {
            str2 = "0";
        }
        linkedHashMap.put("remove_background", str2);
    }

    private static void b(VideoPublishEditModel videoPublishEditModel, LinkedHashMap<String, String> linkedHashMap) {
        try {
            if (videoPublishEditModel.hasReadTextAudio()) {
                linkedHashMap.put("is_text_reading", "1");
            } else {
                linkedHashMap.put("is_text_reading", "0");
            }
        } catch (Exception e2) {
            a.a("setupReadTextInfo failed: " + e2.getMessage());
        }
    }

    public ac(VideoPublishEditModel videoPublishEditModel, h hVar, SynthetiseResult synthetiseResult) {
        l.d(videoPublishEditModel, "");
        l.d(hVar, "");
        l.d(synthetiseResult, "");
        this.f132195a = videoPublishEditModel;
        this.f132196b = hVar;
        this.f132197c = synthetiseResult;
    }
}

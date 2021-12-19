package com.ss.android.ugc.aweme.shortvideo.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;

public class SimpleAVChallenge {
    private static final f GSON = g.a().G();
    public String challengeName;
    public String cid;
    public String stickerId;
    public int type;
    public int userCount;
    public long viewCount = -1;

    public static int com_ss_android_ugc_aweme_shortvideo_model_SimpleAVChallenge_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    static {
        Covode.recordClassIndex(84480);
    }

    public AVChallenge parse2AVChallenge() {
        AVChallenge aVChallenge = new AVChallenge();
        aVChallenge.cid = this.cid;
        aVChallenge.challengeName = this.challengeName;
        aVChallenge.type = this.type;
        aVChallenge.stickerId = this.stickerId;
        aVChallenge.viewCount = this.viewCount;
        aVChallenge.userCount = this.userCount;
        return aVChallenge;
    }

    public static SimpleAVChallenge deserializeFromJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (SimpleAVChallenge) GSON.a(str, SimpleAVChallenge.class);
        } catch (Exception e2) {
            com_ss_android_ugc_aweme_shortvideo_model_SimpleAVChallenge_com_ss_android_ugc_aweme_lancet_LogLancet_e("SimpleAVChallenge", "fromJson: ", e2);
            return null;
        }
    }

    public static SimpleAVChallenge fromAVChallenge(AVChallenge aVChallenge) {
        SimpleAVChallenge simpleAVChallenge = new SimpleAVChallenge();
        simpleAVChallenge.cid = aVChallenge.cid;
        simpleAVChallenge.challengeName = aVChallenge.challengeName;
        simpleAVChallenge.type = aVChallenge.type;
        simpleAVChallenge.stickerId = aVChallenge.stickerId;
        simpleAVChallenge.viewCount = aVChallenge.viewCount;
        simpleAVChallenge.userCount = aVChallenge.userCount;
        return simpleAVChallenge;
    }

    public static String serializeToStr(SimpleAVChallenge simpleAVChallenge) {
        if (simpleAVChallenge == null) {
            return null;
        }
        try {
            return GSON.b(simpleAVChallenge);
        } catch (Exception e2) {
            com_ss_android_ugc_aweme_shortvideo_model_SimpleAVChallenge_com_ss_android_ugc_aweme_lancet_LogLancet_e("SimpleAVChallenge", "toJson: ", e2);
            return null;
        }
    }
}

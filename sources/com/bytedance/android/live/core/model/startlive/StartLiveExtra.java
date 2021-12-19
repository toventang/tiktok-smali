package com.bytedance.android.live.core.model.startlive;

import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class StartLiveExtra extends Extra {
    @c(a = "is_phone_binded")
    public boolean isPhoneBinded;
    @c(a = "live_agreement")
    public boolean liveAgreement;
    @c(a = "live_answer")
    public boolean liveAnswer;
    @c(a = "realname_verify")
    public int realnameVerify;

    static {
        Covode.recordClassIndex(4676);
    }
}

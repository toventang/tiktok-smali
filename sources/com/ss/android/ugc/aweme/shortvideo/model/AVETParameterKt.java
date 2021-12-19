package com.ss.android.ugc.aweme.shortvideo.model;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;
import java.util.Objects;

public final class AVETParameterKt {
    static {
        Covode.recordClassIndex(84399);
    }

    public static final AVETParameter generateAVETParam(Intent intent) {
        String str = "";
        l.d(intent, str);
        if (intent.getSerializableExtra("av_et_parameter") != null) {
            Serializable serializableExtra = intent.getSerializableExtra("av_et_parameter");
            Objects.requireNonNull(serializableExtra, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.model.AVETParameter");
            return (AVETParameter) serializableExtra;
        }
        AVETParameter aVETParameter = new AVETParameter();
        String com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "creation_id");
        if (com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra == null) {
            com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = str;
        }
        aVETParameter.setCreationId(com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
        aVETParameter.setDraftId(intent.getIntExtra("draft_id", 0));
        String com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 = com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "new_draft_id");
        if (com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 == null) {
            com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 = str;
        }
        aVETParameter.setNewDraftId(com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2);
        String com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra3 = com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "shoot_way");
        if (com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra3 == null) {
            com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra3 = str;
        }
        aVETParameter.setShootWay(com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra3);
        aVETParameter.setShootMode(intent.getIntExtra("shoot_mode", 0));
        if (intent.hasExtra("content_type")) {
            String com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra4 = com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "content_type");
            if (com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra4 == null) {
                com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra4 = str;
            }
            aVETParameter.setContentType(com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra4);
        }
        if (intent.hasExtra("content_source")) {
            String com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra5 = com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "content_source");
            if (com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra5 != null) {
                str = com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra5;
            }
            aVETParameter.setContentSource(str);
        }
        return aVETParameter;
    }

    public static String com_ss_android_ugc_aweme_shortvideo_model_AVETParameterKt_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}

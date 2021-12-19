package com.ss.android.ugc.aweme.commercialize.preview.ui;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.c.a;
import h.f.b.l;

public final class AdsPreviewFragment__BindExtra {
    static {
        Covode.recordClassIndex(46282);
    }

    public static Bundle com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public AdsPreviewFragment__BindExtra(AdsPreviewFragment adsPreviewFragment, Intent intent) {
        Object com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        l.d(adsPreviewFragment, "");
        l.d(intent, "");
        Bundle com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
        if (com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras != null && (com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get = com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get(com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, "url")) != null) {
            l.b(com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "");
            if (!(com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String)) {
                if (com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
                    com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get = a.a((String) com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get, String.class);
                } else {
                    throw new IllegalArgumentException("Expecting " + String.class + " but get " + com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get.getClass());
                }
            }
            adsPreviewFragment.f75048b = (String) com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        }
    }
}

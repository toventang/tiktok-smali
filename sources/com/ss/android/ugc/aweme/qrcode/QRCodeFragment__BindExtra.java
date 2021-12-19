package com.ss.android.ugc.aweme.qrcode;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.c.a;
import h.f.b.l;

public final class QRCodeFragment__BindExtra {
    static {
        Covode.recordClassIndex(77749);
    }

    public static Bundle com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public QRCodeFragment__BindExtra(QRCodeFragment qRCodeFragment, Intent intent) {
        Object com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        l.d(qRCodeFragment, "");
        l.d(intent, "");
        Bundle com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
        if (com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras != null && (com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get = com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get(com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, "extra_params")) != null) {
            l.b(com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "");
            if (!(com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof j)) {
                if (com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
                    com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get = a.a((String) com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get, j.class);
                } else {
                    throw new IllegalArgumentException("Expecting " + j.class + " but get " + com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get.getClass());
                }
            }
            qRCodeFragment.f119681e = (j) com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        }
    }
}

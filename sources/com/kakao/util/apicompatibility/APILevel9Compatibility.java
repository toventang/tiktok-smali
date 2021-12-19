package com.kakao.util.apicompatibility;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.gsm.SmsMessage;
import com.bytedance.covode.number.Covode;
import com.kakao.util.helper.log.Logger;

/* access modifiers changed from: package-private */
public class APILevel9Compatibility extends APICompatibility {
    static {
        Covode.recordClassIndex(34475);
    }

    APILevel9Compatibility() {
    }

    public static Bundle com_kakao_util_apicompatibility_APILevel9Compatibility_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.kakao.util.apicompatibility.APICompatibility
    public String getSmsMessage(Intent intent) {
        Object[] objArr = (Object[]) com_kakao_util_apicompatibility_APILevel9Compatibility_com_ss_android_ugc_aweme_lancet_IntentLancet_get(com_kakao_util_apicompatibility_APILevel9Compatibility_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent), "pdus");
        int length = objArr.length;
        String str = null;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            Logger.d("legacy SMS implementation (before KitKat)");
            SmsMessage createFromPdu = SmsMessage.createFromPdu((byte[]) obj);
            if (createFromPdu == null) {
                Logger.e("SMS message is null -- ABORT");
                break;
            }
            str = createFromPdu.getDisplayMessageBody();
            i2++;
        }
        return str;
    }

    public static Object com_kakao_util_apicompatibility_APILevel9Compatibility_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }
}

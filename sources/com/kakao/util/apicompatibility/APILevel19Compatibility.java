package com.kakao.util.apicompatibility;

import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import com.bytedance.covode.number.Covode;
import com.kakao.util.helper.log.Logger;

class APILevel19Compatibility extends APILevel9Compatibility {
    static {
        Covode.recordClassIndex(34473);
    }

    APILevel19Compatibility() {
    }

    @Override // com.kakao.util.apicompatibility.APILevel9Compatibility, com.kakao.util.apicompatibility.APICompatibility
    public String getSmsMessage(Intent intent) {
        SmsMessage[] messagesFromIntent = Telephony.Sms.Intents.getMessagesFromIntent(intent);
        int length = messagesFromIntent.length;
        String str = null;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            SmsMessage smsMessage = messagesFromIntent[i2];
            Logger.d("KitKat or newer");
            if (smsMessage == null) {
                Logger.e("SMS message is null -- ABORT");
                break;
            }
            str = smsMessage.getDisplayMessageBody();
            i2++;
        }
        return str;
    }
}

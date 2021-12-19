package com.bef.effectsdk.message;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public class ResourceMonitor implements MessageInterceptor {
    private Listener mListener;

    public interface Listener {
        static {
            Covode.recordClassIndex(2893);
        }

        void onResourceLoadFinish(String str, boolean z);
    }

    static {
        Covode.recordClassIndex(2892);
    }

    @Override // com.bef.effectsdk.message.MessageInterceptor
    public void destroy() {
        this.mListener = null;
    }

    public void reset() {
    }

    /* access modifiers changed from: package-private */
    public void setListener(Listener listener) {
        this.mListener = listener;
    }

    @Override // com.bef.effectsdk.message.MessageInterceptor
    public boolean intercept(Message message) {
        Listener listener;
        if (17 != message.what) {
            return false;
        }
        String str = (String) message.obj;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int i2 = message.arg1;
        if (i2 == 3) {
            Listener listener2 = this.mListener;
            if (listener2 != null) {
                listener2.onResourceLoadFinish(str, true);
            }
        } else if (i2 == 4 && (listener = this.mListener) != null) {
            listener.onResourceLoadFinish(str, false);
        }
        return true;
    }
}

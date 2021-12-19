package com.bytedance.common.utility.collection;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public class WeakHandler extends Handler {
    WeakReference<IHandler> mRef;

    public interface IHandler {
        static {
            Covode.recordClassIndex(15890);
        }

        void handleMsg(Message message);
    }

    static {
        Covode.recordClassIndex(15889);
    }

    public void handleMessage(Message message) {
        IHandler iHandler = this.mRef.get();
        if (iHandler != null && message != null) {
            iHandler.handleMsg(message);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WeakHandler(com.bytedance.common.utility.collection.WeakHandler.IHandler r2) {
        /*
            r1 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L_0x000e
            android.os.Looper r0 = android.os.Looper.getMainLooper()
        L_0x000a:
            r1.<init>(r0, r2)
            return
        L_0x000e:
            android.os.Looper r0 = android.os.Looper.myLooper()
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.collection.WeakHandler.<init>(com.bytedance.common.utility.collection.WeakHandler$IHandler):void");
    }

    public WeakHandler(Looper looper, IHandler iHandler) {
        super(looper);
        this.mRef = new WeakReference<>(iHandler);
    }
}

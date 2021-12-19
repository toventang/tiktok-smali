package com.ss.android.ugc.effectmanager.common;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;

public class WeakHandler extends Handler {
    private IHandler mHandler;

    public interface IHandler {
        static {
            Covode.recordClassIndex(95263);
        }

        void handleMsg(Message message);
    }

    static {
        Covode.recordClassIndex(95262);
    }

    public WeakHandler(IHandler iHandler) {
        super(Looper.getMainLooper());
        this.mHandler = iHandler;
    }

    public void handleMessage(Message message) {
        IHandler iHandler = this.mHandler;
        if (iHandler != null && message != null) {
            iHandler.handleMsg(message);
        }
    }

    public WeakHandler(Looper looper, IHandler iHandler) {
        super(looper);
        this.mHandler = iHandler;
    }
}

package com.ss.avframework.livestreamv2.game;

import android.os.Message;
import com.bytedance.covode.number.Covode;

public class MessageBox {
    private Message mMessage;
    private Message mResponse;
    private ResponHandler mResponseHandler;

    public interface ResponHandler {
        static {
            Covode.recordClassIndex(100409);
        }

        void onError(MessageBox messageBox, Throwable th);

        void onSucceed(MessageBox messageBox);
    }

    static {
        Covode.recordClassIndex(100408);
    }

    public Message getMessage() {
        return this.mMessage;
    }

    public Message getResponse() {
        return this.mResponse;
    }

    public ResponHandler getResponseHandler() {
        return this.mResponseHandler;
    }

    public void setResponse(Message message) {
        this.mResponse = message;
    }

    public MessageBox(int i2) {
        this(i2, (ResponHandler) null);
    }

    public MessageBox(Message message) {
        this(message, (ResponHandler) null);
    }

    public MessageBox(int i2, ResponHandler responHandler) {
        this(i2, null, responHandler);
    }

    public MessageBox(Message message, ResponHandler responHandler) {
        this.mMessage = message;
        this.mResponseHandler = responHandler;
    }

    public MessageBox(int i2, Object obj, ResponHandler responHandler) {
        this(Message.obtain(null, i2, obj), responHandler);
    }
}

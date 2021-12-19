package com.ss.ugc.live.sdk.message.interfaces;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.JsonApiResult;
import com.ss.ugc.live.sdk.message.data.ProtoApiResult;
import com.ss.ugc.live.sdk.msg.b.g;
import java.util.Map;

public interface IMessageClient extends g {

    public interface Callback {
        static {
            Covode.recordClassIndex(102780);
        }

        void onApiError(Exception exc);

        void onApiSuccess(JsonApiResult jsonApiResult);

        void onApiSuccess(ProtoApiResult protoApiResult);

        void onWebSocketMessage(IMessage iMessage);
    }

    static {
        Covode.recordClassIndex(102779);
    }

    void apiCall(Map<String, String> map);

    void connectToWebSocket();

    void disconnectFromWebSocket();

    long getUserId();

    void onRelease();

    void setCallback(Callback callback);
}

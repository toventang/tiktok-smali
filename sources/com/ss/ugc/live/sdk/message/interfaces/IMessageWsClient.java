package com.ss.ugc.live.sdk.message.interfaces;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.JsonApiResult;
import com.ss.ugc.live.sdk.message.data.PayloadItem;
import com.ss.ugc.live.sdk.message.data.ProtoApiResult;
import java.util.Map;

public interface IMessageWsClient {

    public interface Callback {
        static {
            Covode.recordClassIndex(102785);
        }

        void onApiError(Exception exc, int i2);

        void onApiSuccess(JsonApiResult jsonApiResult);

        void onApiSuccess(ProtoApiResult protoApiResult, int i2);

        void onDetermineMessageStrategy(ProtoApiResult protoApiResult);

        void onHostWebSocketMessage(PayloadItem payloadItem);

        void onHostWebSocketPayloadDecoded(ProtoApiResult protoApiResult);

        void onWebSocketConnected();

        void onWebSocketDisconnected();

        void onWebSocketMessage(PayloadItem payloadItem);

        void onWebSocketPayloadDecoded(ProtoApiResult protoApiResult);
    }

    static {
        Covode.recordClassIndex(102784);
    }

    void apiCall(Map<String, String> map, int i2);

    void connectToWebSocket(Map<String, String> map, String str);

    void decodeHostWebSocketPayload(PayloadItem payloadItem);

    void decodeWebSocketPayload(PayloadItem payloadItem);

    void disconnectFromWebSocket(String str);

    long getUserId();

    boolean isWsConnected();

    void onRelease();

    void onStartMessage();

    void onStopMessage();

    void sendUplinkPacket(PayloadItem payloadItem);

    void sendWebSocketMessage(String str, String str2, byte[] bArr, long j2, long j3);

    void setCallback(Callback callback);

    void setWebSocketServerTimeGap(long j2);
}

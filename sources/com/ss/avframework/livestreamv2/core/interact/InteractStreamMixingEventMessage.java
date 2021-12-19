package com.ss.avframework.livestreamv2.core.interact;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;

public class InteractStreamMixingEventMessage {
    private static SparseArray<String> mStreamMixingError;
    private static SparseArray<String> mStreamMixingEventType;
    private static SparseArray<String> mStreamMixingType;

    static {
        Covode.recordClassIndex(100222);
    }

    InteractStreamMixingEventMessage() {
    }

    public static String buildStreamMixingEventMessage(int i2, String str, int i3, int i4) {
        if (mStreamMixingEventType == null) {
            SparseArray<String> sparseArray = new SparseArray<>();
            mStreamMixingEventType = sparseArray;
            sparseArray.put(0, "stream mixing base");
            mStreamMixingEventType.put(1, "stream mixing start");
            mStreamMixingEventType.put(2, "stream mixing start sucess");
            mStreamMixingEventType.put(3, "stream mixing start failed");
            mStreamMixingEventType.put(4, "stream mixing update");
            mStreamMixingEventType.put(5, "stream mixing stop");
            mStreamMixingEventType.put(6, "stream mixing change mix type");
            mStreamMixingEventType.put(7, "stream mixing first audio frame by client mix");
            mStreamMixingEventType.put(8, "stream mixing first video frame by client mix");
            mStreamMixingEventType.put(9, "stream mixing stop timeout by server");
            mStreamMixingEventType.put(15, "stream mixing max");
        }
        if (mStreamMixingError == null) {
            SparseArray<String> sparseArray2 = new SparseArray<>();
            mStreamMixingError = sparseArray2;
            sparseArray2.put(0, "ok");
            mStreamMixingError.put(1, "invalid agument");
            mStreamMixingError.put(2, "subscribe failed");
            mStreamMixingError.put(3, "error when processing");
            mStreamMixingError.put(4, "cdn error");
            mStreamMixingError.put(1090, "error base");
            mStreamMixingError.put(1091, "invalid param");
            mStreamMixingError.put(1092, "invalid state");
            mStreamMixingError.put(1093, "invalid operator");
            mStreamMixingError.put(1094, "timeout");
        }
        if (mStreamMixingType == null) {
            SparseArray<String> sparseArray3 = new SparseArray<>();
            mStreamMixingType = sparseArray3;
            sparseArray3.put(0, "stream mixing by server");
            mStreamMixingType.put(1, "stream mixing by client");
        }
        return "eventType: " + mStreamMixingEventType.get(i2, "unknown stream mixing event type ".concat(String.valueOf(i3))) + "; eventData: " + str + "; error: " + mStreamMixingError.get(i3, "unknown mixing error ".concat(String.valueOf(i3))) + "; mixType: " + mStreamMixingType.get(i4, "unknown mixing type ".concat(String.valueOf(i3)));
    }
}

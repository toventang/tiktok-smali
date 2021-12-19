package com.ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

public class RemoteStreamKey {
    private String roomId;
    private StreamIndex streamIndex;
    private String userId;

    static {
        Covode.recordClassIndex(100871);
    }

    public String getRoomId() {
        return this.roomId;
    }

    public StreamIndex getStreamIndex() {
        return this.streamIndex;
    }

    public String getUserId() {
        return this.userId;
    }

    public String toString() {
        return "RemoteStreamKey{roomId='" + this.roomId + '\'' + ", userId='" + this.userId + '\'' + ", streamIndex=" + this.streamIndex + '}';
    }

    public RemoteStreamKey(String str, String str2, StreamIndex streamIndex2) {
        this.roomId = str;
        this.userId = str2;
        this.streamIndex = streamIndex2;
    }
}

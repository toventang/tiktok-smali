package com.ss.ugc.live.sdk.message.data;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.msg.b.b;
import java.util.List;

public class PayloadItem {
    private String compressType;
    private List<b> headers;
    private long logId;
    private byte[] payload;
    private String payloadEncoding;
    private String payloadType;
    private long seqId;
    private long serverTime;

    static {
        Covode.recordClassIndex(102774);
    }

    public String getCompressType() {
        return this.compressType;
    }

    public List<b> getHeaders() {
        return this.headers;
    }

    public long getLogId() {
        return this.logId;
    }

    public byte[] getPayload() {
        return this.payload;
    }

    public String getPayloadEncoding() {
        return this.payloadEncoding;
    }

    public String getPayloadType() {
        return this.payloadType;
    }

    public long getSeqId() {
        return this.seqId;
    }

    public long getServerTime() {
        return this.serverTime;
    }

    public void setCompressType(String str) {
        this.compressType = str;
    }

    public void setHeaders(List<b> list) {
        this.headers = list;
    }

    public void setLogId(long j2) {
        this.logId = j2;
    }

    public void setPayload(byte[] bArr) {
        this.payload = bArr;
    }

    public void setPayloadEncoding(String str) {
        this.payloadEncoding = str;
    }

    public void setPayloadType(String str) {
        this.payloadType = str;
    }

    public void setSeqId(long j2) {
        this.seqId = j2;
    }

    public void setServerTime(long j2) {
        this.serverTime = j2;
    }

    public PayloadItem(String str, byte[] bArr, String str2, long j2, long j3) {
        this.payloadType = str;
        this.payload = bArr;
        this.compressType = str2;
        this.logId = j2;
        this.serverTime = j3;
    }

    public PayloadItem(String str, String str2, byte[] bArr, List<b> list, long j2, long j3) {
        this.payloadType = str;
        this.payloadEncoding = str2;
        this.payload = bArr;
        this.headers = list;
        this.logId = j2;
        this.seqId = j3;
    }

    public PayloadItem(String str, byte[] bArr, String str2, long j2, long j3, List<b> list) {
        this.payloadType = str;
        this.payload = bArr;
        this.compressType = str2;
        this.logId = j2;
        this.serverTime = j3;
        this.headers = list;
    }
}

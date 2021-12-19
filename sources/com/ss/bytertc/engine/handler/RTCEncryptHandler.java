package com.ss.bytertc.engine.handler;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.utils.LogUtil;

public class RTCEncryptHandler {
    private IRTCEncryptionHandler mCustomizeEncryptHandler;

    static {
        Covode.recordClassIndex(100954);
    }

    public RTCEncryptHandler(IRTCEncryptionHandler iRTCEncryptionHandler) {
        this.mCustomizeEncryptHandler = iRTCEncryptionHandler;
    }

    public byte[] onDecryptData(byte[] bArr) {
        LogUtil.d("RtcEngineEncryptHandler", "onDecryptData...");
        try {
            IRTCEncryptionHandler iRTCEncryptionHandler = this.mCustomizeEncryptHandler;
            if (iRTCEncryptionHandler != null) {
                return iRTCEncryptionHandler.onDecryptData(bArr);
            }
            return null;
        } catch (Exception e2) {
            LogUtil.d("RtcEngineEncryptHandler", "onDecryptData callback catch exception.\n" + e2.getMessage());
            return null;
        }
    }

    public byte[] onEncryptData(byte[] bArr) {
        LogUtil.d("RtcEngineEncryptHandler", "onEncryptData...");
        try {
            IRTCEncryptionHandler iRTCEncryptionHandler = this.mCustomizeEncryptHandler;
            if (iRTCEncryptionHandler != null) {
                return iRTCEncryptionHandler.onEncryptData(bArr);
            }
            return null;
        } catch (Exception e2) {
            LogUtil.d("RtcEngineEncryptHandler", "onEncryptData callback catch exception.\n" + e2.getMessage());
            return null;
        }
    }
}

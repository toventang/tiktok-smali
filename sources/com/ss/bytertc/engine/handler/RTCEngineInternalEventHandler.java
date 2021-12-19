package com.ss.bytertc.engine.handler;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;

public class RTCEngineInternalEventHandler {
    private String mCurrConfigAddr;
    private String mCurrSignalingAddr;
    private WeakReference<RTCEngineImpl> mRtcEngineImpl;
    private WeakReference<IRTCEngineInternalEventHandler> mRtcEngineInternalEventHandler;

    static {
        Covode.recordClassIndex(100957);
    }

    public RTCEngineInternalEventHandler(RTCEngineImpl rTCEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(rTCEngineImpl);
    }

    public void onChannelTypeChanged(boolean z) {
        try {
            WeakReference<IRTCEngineInternalEventHandler> weakReference = this.mRtcEngineInternalEventHandler;
            if (weakReference != null) {
                IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler = weakReference.get();
                if (iRTCEngineInternalEventHandler != null) {
                    iRTCEngineInternalEventHandler.onChannelTypeChanged(z);
                }
            }
        } catch (Exception e2) {
            LogUtil.d("REngineInternalEventHandler", "onChannelTypeChanged callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onConfigAddrChanged(String str) {
        try {
            this.mCurrConfigAddr = str;
            WeakReference<IRTCEngineInternalEventHandler> weakReference = this.mRtcEngineInternalEventHandler;
            if (weakReference != null) {
                IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler = weakReference.get();
                if (iRTCEngineInternalEventHandler != null) {
                    iRTCEngineInternalEventHandler.onConfigAddrChanged(str);
                }
            }
        } catch (Exception e2) {
            LogUtil.d("REngineInternalEventHandler", "onConfigAddrChanged callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onPeerConnectionICEMux(boolean z) {
        try {
            WeakReference<IRTCEngineInternalEventHandler> weakReference = this.mRtcEngineInternalEventHandler;
            if (weakReference != null) {
                IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler = weakReference.get();
                if (iRTCEngineInternalEventHandler != null) {
                    iRTCEngineInternalEventHandler.onPeerConnectionICEMux(z);
                }
            }
        } catch (Exception e2) {
            LogUtil.d("REngineInternalEventHandler", "onPeerConnectionICEMux callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onSignalingAddrChanged(String str) {
        try {
            this.mCurrSignalingAddr = str;
            WeakReference<IRTCEngineInternalEventHandler> weakReference = this.mRtcEngineInternalEventHandler;
            if (weakReference != null) {
                IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler = weakReference.get();
                if (iRTCEngineInternalEventHandler != null) {
                    iRTCEngineInternalEventHandler.onSignalingAddrChanged(str);
                }
            }
        } catch (Exception e2) {
            LogUtil.d("REngineInternalEventHandler", "onSignalingAddrChanged callback catch exception.\n" + e2.getMessage());
        }
    }

    public void setInternalEventHandler(IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler) {
        WeakReference<IRTCEngineInternalEventHandler> weakReference = new WeakReference<>(iRTCEngineInternalEventHandler);
        this.mRtcEngineInternalEventHandler = weakReference;
        IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler2 = weakReference.get();
        if (iRTCEngineInternalEventHandler2 != null) {
            if (!TextUtils.isEmpty(this.mCurrConfigAddr)) {
                iRTCEngineInternalEventHandler2.onConfigAddrChanged(this.mCurrConfigAddr);
            }
            if (!TextUtils.isEmpty(this.mCurrSignalingAddr)) {
                iRTCEngineInternalEventHandler2.onSignalingAddrChanged(this.mCurrSignalingAddr);
            }
        }
    }

    public void onSystemInfoLog(double d2, double d3, double d4) {
        try {
            WeakReference<IRTCEngineInternalEventHandler> weakReference = this.mRtcEngineInternalEventHandler;
            if (weakReference != null) {
                IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler = weakReference.get();
                if (iRTCEngineInternalEventHandler != null) {
                    iRTCEngineInternalEventHandler.onSystemInfoLog(d2, d3, d4);
                }
            }
        } catch (Exception e2) {
            LogUtil.d("REngineInternalEventHandler", "onSystemInfoLog callback catch exception.\n" + e2.getMessage());
        }
    }
}

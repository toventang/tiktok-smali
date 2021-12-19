package com.ss.bytertc.engine.loader;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.utils.LogUtil;

public class RTCNativeLibraryListenerImpl implements RTCNativeLibraryLoaderListener {
    static {
        Covode.recordClassIndex(101000);
    }

    @Override // com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener, org.webrtc.NativeLibraryLoadListener
    public void onLoadAlready(String str) {
        LogUtil.i("RtcNativeLibraryLoaderListener", "onLoadAlready : ".concat(String.valueOf(str)));
    }

    @Override // com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener, org.webrtc.NativeLibraryLoadListener
    public void onLoadError(String str) {
        LogUtil.i("RtcNativeLibraryLoaderListener", "onLoadError : ".concat(String.valueOf(str)));
    }

    @Override // com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener, org.webrtc.NativeLibraryLoadListener
    public void onLoadSuccess(String str) {
        LogUtil.i("RtcNativeLibraryLoaderListener", "onLoadSuccess : ".concat(String.valueOf(str)));
    }
}

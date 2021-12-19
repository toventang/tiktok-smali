package com.ss.bytertc.engine.loader;

import com.bytedance.covode.number.Covode;
import org.webrtc.NativeLibraryLoader;

public interface RTCNativeLibraryLoader extends NativeLibraryLoader {
    static {
        Covode.recordClassIndex(101001);
    }

    @Override // org.webrtc.NativeLibraryLoader
    boolean load(String str);
}

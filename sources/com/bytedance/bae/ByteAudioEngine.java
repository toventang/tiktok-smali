package com.bytedance.bae;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;
import java.util.ArrayList;
import java.util.List;

public class ByteAudioEngine extends IByteAudioEngine {
    private static Boolean sIsLibraryLoaded = false;
    private List<ByteAudioEventHandlerProxy> eventHandlerList = new ArrayList();
    private long nativeEnginePtr;

    public void release() {
    }

    static {
        Covode.recordClassIndex(15305);
    }

    public ByteAudioEngine() {
        MethodCollector.i(4622);
        if (!sIsLibraryLoaded.booleanValue()) {
            try {
                com_bytedance_bae_ByteAudioEngine_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("byteaudio");
                sIsLibraryLoaded = true;
            } catch (UnsatisfiedLinkError unused) {
            }
        }
        this.nativeEnginePtr = ByteAudioNativeFunctions.nativeGetInstance();
        MethodCollector.o(4622);
    }

    public static void setLibraryLoaded(boolean z) {
        sIsLibraryLoaded = Boolean.valueOf(z);
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int releaseAuxStream(ByteAudioAuxStream byteAudioAuxStream) {
        byteAudioAuxStream.releaseStream();
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int releaseInputStream(ByteAudioInputStream byteAudioInputStream) {
        byteAudioInputStream.releaseStream();
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int releaseOutputStream(ByteAudioOutputStream byteAudioOutputStream) {
        byteAudioOutputStream.releaseStream();
        return -1;
    }

    public static void com_bytedance_bae_ByteAudioEngine_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int adjustHeadsetMonitorVolume(int i2) {
        MethodCollector.i(1047);
        long j2 = this.nativeEnginePtr;
        if (j2 != 0) {
            int nativeAdjustHeadsetMonitorVolume = ByteAudioNativeFunctions.nativeAdjustHeadsetMonitorVolume(j2, i2);
            MethodCollector.o(1047);
            return nativeAdjustHeadsetMonitorVolume;
        }
        MethodCollector.o(1047);
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int adjustPlaybackVolume(int i2) {
        MethodCollector.i(1056);
        long j2 = this.nativeEnginePtr;
        if (j2 != 0) {
            int nativeAdjustPlaybackVolume = ByteAudioNativeFunctions.nativeAdjustPlaybackVolume(j2, i2);
            MethodCollector.o(1056);
            return nativeAdjustPlaybackVolume;
        }
        MethodCollector.o(1056);
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int adjustRecordVolume(int i2) {
        MethodCollector.i(1054);
        long j2 = this.nativeEnginePtr;
        if (j2 != 0) {
            int nativeAdjustRecordVolume = ByteAudioNativeFunctions.nativeAdjustRecordVolume(j2, i2);
            MethodCollector.o(1054);
            return nativeAdjustRecordVolume;
        }
        MethodCollector.o(1054);
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public ByteAudioAuxStream createAuxStream(String str) {
        if (this.nativeEnginePtr != 0) {
            return new ByteAudioAuxStream(this.nativeEnginePtr, str);
        }
        return null;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public ByteAudioInputStream createInputStream(String str) {
        if (this.nativeEnginePtr != 0) {
            return new ByteAudioInputStream(this.nativeEnginePtr, str);
        }
        return null;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public ByteAudioOutputStream createOutputStream(String str) {
        if (this.nativeEnginePtr != 0) {
            return new ByteAudioOutputStream(this.nativeEnginePtr, str);
        }
        return null;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void enableAudioRoute(boolean z) {
        MethodCollector.i(52);
        long j2 = this.nativeEnginePtr;
        if (j2 != 0) {
            ByteAudioNativeFunctions.nativeEnableAudioRoute(j2, z);
        }
        MethodCollector.o(52);
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int enableEarMonitor(boolean z) {
        MethodCollector.i(1040);
        long j2 = this.nativeEnginePtr;
        if (j2 != 0) {
            ByteAudioNativeFunctions.nativeEnableEarMonitor(j2, z);
        }
        MethodCollector.o(1040);
        return 0;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void enableLocalAudio(boolean z) {
        MethodCollector.i(1046);
        long j2 = this.nativeEnginePtr;
        if (j2 != 0) {
            ByteAudioNativeFunctions.nativeEnableLocalAudio(j2, z);
        }
        MethodCollector.o(1046);
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public ByteAudioStreamOption getValue(int i2) {
        MethodCollector.i(1058);
        long j2 = this.nativeEnginePtr;
        if (j2 != 0) {
            ByteAudioStreamOption nativeGetValue = ByteAudioNativeFunctions.nativeGetValue(j2, i2);
            MethodCollector.o(1058);
            return nativeGetValue;
        }
        MethodCollector.o(1058);
        return null;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int setAudioScenario(int i2) {
        MethodCollector.i(1052);
        long j2 = this.nativeEnginePtr;
        if (j2 != 0) {
            int nativeSetAudioScenario = ByteAudioNativeFunctions.nativeSetAudioScenario(j2, i2);
            MethodCollector.o(1052);
            return nativeSetAudioScenario;
        }
        MethodCollector.o(1052);
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void setEnableSpeakerphone(boolean z) {
        MethodCollector.i(48);
        long j2 = this.nativeEnginePtr;
        if (j2 != 0) {
            ByteAudioNativeFunctions.nativeSetEnableSpeakerphone(j2, z);
        }
        MethodCollector.o(48);
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int setServerConfigure(String str) {
        int i2;
        MethodCollector.i(4641);
        long j2 = this.nativeEnginePtr;
        if (j2 != 0) {
            i2 = ByteAudioNativeFunctions.nativeSetServerConfigure(j2, str);
        } else {
            i2 = -1;
        }
        MethodCollector.o(4641);
        return i2;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void addEventHandler(ByteAudioEventHandler byteAudioEventHandler) {
        MethodCollector.i(44);
        for (ByteAudioEventHandlerProxy byteAudioEventHandlerProxy : this.eventHandlerList) {
            if (byteAudioEventHandler.equals(byteAudioEventHandlerProxy)) {
                MethodCollector.o(44);
                return;
            }
        }
        ByteAudioEventHandlerProxy byteAudioEventHandlerProxy2 = new ByteAudioEventHandlerProxy(byteAudioEventHandler);
        long j2 = this.nativeEnginePtr;
        if (j2 != 0) {
            long nativeAddEventHandler = ByteAudioNativeFunctions.nativeAddEventHandler(j2, byteAudioEventHandlerProxy2);
            if (nativeAddEventHandler != 0) {
                byteAudioEventHandlerProxy2.setNativeHandler(nativeAddEventHandler);
                this.eventHandlerList.add(byteAudioEventHandlerProxy2);
            }
        }
        MethodCollector.o(44);
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void removeEventHandler(ByteAudioEventHandler byteAudioEventHandler) {
        MethodCollector.i(46);
        if (this.nativeEnginePtr != 0) {
            for (int i2 = 0; i2 < this.eventHandlerList.size(); i2++) {
                ByteAudioEventHandlerProxy byteAudioEventHandlerProxy = this.eventHandlerList.get(i2);
                if (byteAudioEventHandlerProxy.handler == byteAudioEventHandler) {
                    ByteAudioNativeFunctions.nativeRemoveEventHandler(this.nativeEnginePtr, byteAudioEventHandlerProxy.nativeHandlerPtr);
                    this.eventHandlerList.remove(byteAudioEventHandlerProxy);
                    byteAudioEventHandlerProxy.handler = null;
                    byteAudioEventHandlerProxy.nativeHandlerPtr = 0;
                    MethodCollector.o(46);
                    return;
                }
            }
        }
        MethodCollector.o(46);
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int setValue(int i2, ByteAudioStreamOption byteAudioStreamOption) {
        MethodCollector.i(1057);
        long j2 = this.nativeEnginePtr;
        if (j2 != 0) {
            int nativeSetValue = ByteAudioNativeFunctions.nativeSetValue(j2, i2, byteAudioStreamOption);
            MethodCollector.o(1057);
            return nativeSetValue;
        }
        MethodCollector.o(1057);
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void setFrontInputFilter(ByteAudioFilterProxy byteAudioFilterProxy, int i2, int i3) {
        MethodCollector.i(1044);
        long j2 = this.nativeEnginePtr;
        if (j2 != 0) {
            ByteAudioNativeFunctions.nativeSetFrontInputFilter(j2, byteAudioFilterProxy, i2, i3);
        }
        MethodCollector.o(1044);
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void setInputFilter(ByteAudioFilterProxy byteAudioFilterProxy, int i2, int i3) {
        MethodCollector.i(1043);
        long j2 = this.nativeEnginePtr;
        if (j2 != 0) {
            ByteAudioNativeFunctions.nativeSetInputFilter(j2, byteAudioFilterProxy, i2, i3);
        }
        MethodCollector.o(1043);
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void setOutputFilter(ByteAudioFilterProxy byteAudioFilterProxy, int i2, int i3) {
        MethodCollector.i(1045);
        long j2 = this.nativeEnginePtr;
        if (j2 != 0) {
            ByteAudioNativeFunctions.nativeSetOutputFilter(j2, byteAudioFilterProxy, i2, i3);
        }
        MethodCollector.o(1045);
    }
}

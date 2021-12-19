package com.bytedance.bae;

import com.bytedance.bae.ByteAudioSinkInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedHashMap;

public class ByteAudioOutputStream {
    public int gain;
    public boolean mute;
    public long nativeEnginePtr;
    public long nativeStreamPtr;
    public ByteAudioOutputSinkProxy sinkProxy;
    public int stream_id;

    static {
        Covode.recordClassIndex(15314);
    }

    public long getID() {
        MethodCollector.i(4554);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            long nativeOutputStreamGetId = ByteAudioNativeFunctions.nativeOutputStreamGetId(j2);
            MethodCollector.o(4554);
            return nativeOutputStreamGetId;
        }
        MethodCollector.o(4554);
        return -1;
    }

    public String getName() {
        MethodCollector.i(4553);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            String nativeOutputStreamGetName = ByteAudioNativeFunctions.nativeOutputStreamGetName(j2);
            MethodCollector.o(4553);
            return nativeOutputStreamGetName;
        }
        MethodCollector.o(4553);
        return null;
    }

    public LinkedHashMap getStatsReport() {
        MethodCollector.i(4498);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            LinkedHashMap nativeOutputStreamGetStatsReport = ByteAudioNativeFunctions.nativeOutputStreamGetStatsReport(j2);
            MethodCollector.o(4498);
            return nativeOutputStreamGetStatsReport;
        }
        MethodCollector.o(4498);
        return null;
    }

    public void releaseStream() {
        MethodCollector.i(3225);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            long j3 = this.nativeEnginePtr;
            if (j3 != 0) {
                ByteAudioNativeFunctions.nativeDestroyOutputStream(j3, j2);
                this.nativeStreamPtr = 0;
            }
        }
        MethodCollector.o(3225);
    }

    public int startStream() {
        MethodCollector.i(3677);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            int nativeOutputStreamStart = ByteAudioNativeFunctions.nativeOutputStreamStart(j2);
            MethodCollector.o(3677);
            return nativeOutputStreamStart;
        }
        MethodCollector.o(3677);
        return -1;
    }

    public int stopStream() {
        MethodCollector.i(3948);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            int nativeOutputStreamStop = ByteAudioNativeFunctions.nativeOutputStreamStop(j2);
            MethodCollector.o(3948);
            return nativeOutputStreamStop;
        }
        MethodCollector.o(3948);
        return -1;
    }

    public ByteAudioStreamOption outputStreamGetValue(int i2) {
        MethodCollector.i(4336);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            ByteAudioStreamOption nativeOutputStreamGetValue = ByteAudioNativeFunctions.nativeOutputStreamGetValue(j2, i2);
            MethodCollector.o(4336);
            return nativeOutputStreamGetValue;
        }
        MethodCollector.o(4336);
        return null;
    }

    public int setGain(int i2) {
        MethodCollector.i(4325);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            this.gain = i2;
            int nativeOutputStreamSetGain = ByteAudioNativeFunctions.nativeOutputStreamSetGain(j2, i2);
            MethodCollector.o(4325);
            return nativeOutputStreamSetGain;
        }
        MethodCollector.o(4325);
        return -1;
    }

    public int setMute(boolean z) {
        MethodCollector.i(4610);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            int nativeOutputStreamSetMute = ByteAudioNativeFunctions.nativeOutputStreamSetMute(j2, z);
            MethodCollector.o(4610);
            return nativeOutputStreamSetMute;
        }
        MethodCollector.o(4610);
        return -1;
    }

    public void setSink(ByteAudioSinkInterface.ByteAudioOutputSink byteAudioOutputSink) {
        MethodCollector.i(4436);
        ByteAudioOutputSinkProxy byteAudioOutputSinkProxy = new ByteAudioOutputSinkProxy(byteAudioOutputSink, this);
        this.sinkProxy = byteAudioOutputSinkProxy;
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            ByteAudioNativeFunctions.nativeOutputStreamSetSink(j2, byteAudioOutputSinkProxy);
        }
        MethodCollector.o(4436);
    }

    public int setStreamFormat(ByteAudioStreamFormat byteAudioStreamFormat) {
        MethodCollector.i(4334);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            int nativeOutputStreamSetFormat = ByteAudioNativeFunctions.nativeOutputStreamSetFormat(j2, byteAudioStreamFormat);
            MethodCollector.o(4334);
            return nativeOutputStreamSetFormat;
        }
        MethodCollector.o(4334);
        return -1;
    }

    public ByteAudioOutputStream(long j2, String str) {
        MethodCollector.i(3220);
        this.nativeEnginePtr = j2;
        if (j2 != 0) {
            this.nativeStreamPtr = ByteAudioNativeFunctions.nativeCreateOutputStream(j2, str);
        }
        MethodCollector.o(3220);
    }

    public int outputStreamSetValue(int i2, ByteAudioStreamOption byteAudioStreamOption) {
        MethodCollector.i(4335);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            int nativeOutputStreamSetValue = ByteAudioNativeFunctions.nativeOutputStreamSetValue(j2, i2, byteAudioStreamOption);
            MethodCollector.o(4335);
            return nativeOutputStreamSetValue;
        }
        MethodCollector.o(4335);
        return -1;
    }

    public int setGain(int i2, int i3) {
        MethodCollector.i(4332);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            this.gain = i2;
            int nativeOutputStreamSetGainWithFade = ByteAudioNativeFunctions.nativeOutputStreamSetGainWithFade(j2, i2, i3);
            MethodCollector.o(4332);
            return nativeOutputStreamSetGainWithFade;
        }
        MethodCollector.o(4332);
        return -1;
    }
}

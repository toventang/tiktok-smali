package com.bytedance.bae;

import com.bytedance.bae.ByteAudioSinkInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedHashMap;

public class ByteAudioInputStream {
    public int gain;
    public boolean mute;
    public long nativeEnginePtr;
    public long nativeStreamPtr;
    public ByteAudioInputSinkProxy sinkProxy;
    public int stream_id;

    static {
        Covode.recordClassIndex(15311);
    }

    public long getID() {
        MethodCollector.i(4242);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            long nativeInputStreamGetId = ByteAudioNativeFunctions.nativeInputStreamGetId(j2);
            MethodCollector.o(4242);
            return nativeInputStreamGetId;
        }
        MethodCollector.o(4242);
        return -1;
    }

    public String getName() {
        MethodCollector.i(4236);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            String nativeInputStreamGetName = ByteAudioNativeFunctions.nativeInputStreamGetName(j2);
            MethodCollector.o(4236);
            return nativeInputStreamGetName;
        }
        MethodCollector.o(4236);
        return null;
    }

    public LinkedHashMap getStatsReport() {
        MethodCollector.i(4231);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            LinkedHashMap nativeInputStreamGetStatsReport = ByteAudioNativeFunctions.nativeInputStreamGetStatsReport(j2);
            MethodCollector.o(4231);
            return nativeInputStreamGetStatsReport;
        }
        MethodCollector.o(4231);
        return null;
    }

    public void releaseStream() {
        MethodCollector.i(4042);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            long j3 = this.nativeEnginePtr;
            if (j3 != 0) {
                ByteAudioNativeFunctions.nativeDestroyInputStream(j3, j2);
                this.nativeStreamPtr = 0;
            }
        }
        MethodCollector.o(4042);
    }

    public int startStream() {
        MethodCollector.i(4046);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            int nativeInputStreamStart = ByteAudioNativeFunctions.nativeInputStreamStart(j2);
            MethodCollector.o(4046);
            return nativeInputStreamStart;
        }
        MethodCollector.o(4046);
        return -1;
    }

    public int stopStream() {
        MethodCollector.i(4048);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            int nativeInputStreamStop = ByteAudioNativeFunctions.nativeInputStreamStop(j2);
            MethodCollector.o(4048);
            return nativeInputStreamStop;
        }
        MethodCollector.o(4048);
        return -1;
    }

    public ByteAudioStreamOption inputStreamGetValue(int i2) {
        MethodCollector.i(4218);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            ByteAudioStreamOption nativeInputStreamGetValue = ByteAudioNativeFunctions.nativeInputStreamGetValue(j2, i2);
            MethodCollector.o(4218);
            return nativeInputStreamGetValue;
        }
        MethodCollector.o(4218);
        return null;
    }

    public int setGain(int i2) {
        MethodCollector.i(4175);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            this.gain = i2;
            int nativeInputStreamSetGain = ByteAudioNativeFunctions.nativeInputStreamSetGain(j2, i2);
            MethodCollector.o(4175);
            return nativeInputStreamSetGain;
        }
        MethodCollector.o(4175);
        return -1;
    }

    public int setMute(boolean z) {
        MethodCollector.i(4248);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            int nativeInputStreamSetMute = ByteAudioNativeFunctions.nativeInputStreamSetMute(j2, z);
            MethodCollector.o(4248);
            return nativeInputStreamSetMute;
        }
        MethodCollector.o(4248);
        return -1;
    }

    public void setSink(ByteAudioSinkInterface.ByteAudioInputSink byteAudioInputSink) {
        MethodCollector.i(4221);
        ByteAudioInputSinkProxy byteAudioInputSinkProxy = new ByteAudioInputSinkProxy(byteAudioInputSink, this);
        this.sinkProxy = byteAudioInputSinkProxy;
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            ByteAudioNativeFunctions.nativeInputStreamSetSink(j2, byteAudioInputSinkProxy);
            MethodCollector.o(4221);
            return;
        }
        MethodCollector.o(4221);
    }

    public int setStreamFormat(ByteAudioStreamFormat byteAudioStreamFormat) {
        MethodCollector.i(4179);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            int nativeInputStreamSetFormat = ByteAudioNativeFunctions.nativeInputStreamSetFormat(j2, byteAudioStreamFormat);
            MethodCollector.o(4179);
            return nativeInputStreamSetFormat;
        }
        MethodCollector.o(4179);
        return -1;
    }

    public int updateStreamFormat(ByteAudioStreamFormat byteAudioStreamFormat) {
        MethodCollector.i(4180);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            int nativeInputStreamUpdateFormat = ByteAudioNativeFunctions.nativeInputStreamUpdateFormat(j2, byteAudioStreamFormat);
            MethodCollector.o(4180);
            return nativeInputStreamUpdateFormat;
        }
        MethodCollector.o(4180);
        return -1;
    }

    public ByteAudioInputStream(long j2, String str) {
        MethodCollector.i(2556);
        this.nativeEnginePtr = j2;
        if (j2 != 0) {
            this.nativeStreamPtr = ByteAudioNativeFunctions.nativeCreateInputStream(j2, str);
        }
        MethodCollector.o(2556);
    }

    public int inputStreamSetValue(int i2, ByteAudioStreamOption byteAudioStreamOption) {
        MethodCollector.i(4210);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            int nativeInputStreamSetValue = ByteAudioNativeFunctions.nativeInputStreamSetValue(j2, i2, byteAudioStreamOption);
            MethodCollector.o(4210);
            return nativeInputStreamSetValue;
        }
        MethodCollector.o(4210);
        return -1;
    }
}

package com.bytedance.bae;

import com.bytedance.bae.ByteAudioSinkInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class ByteAudioAuxStream {
    public int gain;
    public boolean mute;
    public long nativeEnginePtr;
    public long nativeStreamPtr;
    public ByteAudioAuxSinkProxy sinkProxy;
    public int stream_id;

    static {
        Covode.recordClassIndex(15303);
    }

    public void clearInputStreamNameForMix() {
        MethodCollector.i(1527);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            ByteAudioNativeFunctions.nativeClearInputStreamNameForMix(j2);
        }
        MethodCollector.o(1527);
    }

    public long getID() {
        MethodCollector.i(1525);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            long nativeAuxStreamGetId = ByteAudioNativeFunctions.nativeAuxStreamGetId(j2);
            MethodCollector.o(1525);
            return nativeAuxStreamGetId;
        }
        MethodCollector.o(1525);
        return -1;
    }

    public String getName() {
        MethodCollector.i(1523);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            String nativeAuxStreamGetName = ByteAudioNativeFunctions.nativeAuxStreamGetName(j2);
            MethodCollector.o(1523);
            return nativeAuxStreamGetName;
        }
        MethodCollector.o(1523);
        return null;
    }

    public int pauseStream() {
        MethodCollector.i(1515);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            int nativeAuxStreamPause = ByteAudioNativeFunctions.nativeAuxStreamPause(j2);
            MethodCollector.o(1515);
            return nativeAuxStreamPause;
        }
        MethodCollector.o(1515);
        return -1;
    }

    public void releaseStream() {
        MethodCollector.i(1500);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            long j3 = this.nativeEnginePtr;
            if (j3 != 0) {
                ByteAudioNativeFunctions.nativeDestroyAuxStream(j3, j2);
                this.nativeStreamPtr = 0;
            }
        }
        MethodCollector.o(1500);
    }

    public int resumeStream() {
        MethodCollector.i(1516);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            int nativeAuxStreamResume = ByteAudioNativeFunctions.nativeAuxStreamResume(j2);
            MethodCollector.o(1516);
            return nativeAuxStreamResume;
        }
        MethodCollector.o(1516);
        return -1;
    }

    public int startStream() {
        MethodCollector.i(1502);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            int nativeAuxStreamStart = ByteAudioNativeFunctions.nativeAuxStreamStart(j2);
            MethodCollector.o(1502);
            return nativeAuxStreamStart;
        }
        MethodCollector.o(1502);
        return -1;
    }

    public int stopStream() {
        MethodCollector.i(1513);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            int nativeAuxStreamStop = ByteAudioNativeFunctions.nativeAuxStreamStop(j2);
            MethodCollector.o(1513);
            return nativeAuxStreamStop;
        }
        MethodCollector.o(1513);
        return -1;
    }

    public void addInputStreamNameForMix(String str) {
        MethodCollector.i(1526);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            ByteAudioNativeFunctions.nativeAddInputStreamNameForMix(j2, str);
        }
        MethodCollector.o(1526);
    }

    public ByteAudioStreamOption auxStreamGetValue(int i2) {
        MethodCollector.i(1520);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            ByteAudioStreamOption nativeAuxStreamGetValue = ByteAudioNativeFunctions.nativeAuxStreamGetValue(j2, i2);
            MethodCollector.o(1520);
            return nativeAuxStreamGetValue;
        }
        MethodCollector.o(1520);
        return null;
    }

    public int setGain(int i2) {
        MethodCollector.i(1517);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            this.gain = i2;
            int nativeAuxStreamSetGain = ByteAudioNativeFunctions.nativeAuxStreamSetGain(j2, i2);
            MethodCollector.o(1517);
            return nativeAuxStreamSetGain;
        }
        MethodCollector.o(1517);
        return -1;
    }

    public void setPath(String str) {
        MethodCollector.i(1522);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            ByteAudioNativeFunctions.nativeAuxStreamSetPath(j2, str);
        }
        MethodCollector.o(1522);
    }

    public void setSink(ByteAudioSinkInterface.ByteAudioAuxSink byteAudioAuxSink) {
        MethodCollector.i(1521);
        ByteAudioAuxSinkProxy byteAudioAuxSinkProxy = new ByteAudioAuxSinkProxy(byteAudioAuxSink, this);
        this.sinkProxy = byteAudioAuxSinkProxy;
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            ByteAudioNativeFunctions.nativeAuxStreamSetSink(j2, byteAudioAuxSinkProxy);
        }
        MethodCollector.o(1521);
    }

    public int setStreamFormat(ByteAudioStreamFormat byteAudioStreamFormat) {
        MethodCollector.i(1518);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            int nativeAuxStreamSetFormat = ByteAudioNativeFunctions.nativeAuxStreamSetFormat(j2, byteAudioStreamFormat);
            MethodCollector.o(1518);
            return nativeAuxStreamSetFormat;
        }
        MethodCollector.o(1518);
        return -1;
    }

    public ByteAudioAuxStream(long j2, String str) {
        MethodCollector.i(1499);
        this.nativeEnginePtr = j2;
        if (j2 != 0) {
            this.nativeStreamPtr = ByteAudioNativeFunctions.nativeCreateAuxStream(j2, str);
        }
        MethodCollector.o(1499);
    }

    public int auxStreamSetValue(int i2, ByteAudioStreamOption byteAudioStreamOption) {
        MethodCollector.i(1519);
        long j2 = this.nativeStreamPtr;
        if (j2 != 0) {
            int nativeAuxStreamSetValue = ByteAudioNativeFunctions.nativeAuxStreamSetValue(j2, i2, byteAudioStreamOption);
            MethodCollector.o(1519);
            return nativeAuxStreamSetValue;
        }
        MethodCollector.o(1519);
        return -1;
    }
}

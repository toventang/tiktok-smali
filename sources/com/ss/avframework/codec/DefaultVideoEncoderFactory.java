package com.ss.avframework.codec;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.engine.VideoEncoder;
import com.ss.avframework.engine.VideoEncoderFactory;

public class DefaultVideoEncoderFactory extends VideoEncoderFactory {
    private VideoEncoderFactory mHWFacotry = new HardwareVideoEncoderFactory();

    static {
        Covode.recordClassIndex(99749);
    }

    private native VideoEncoder nativeDefaultCreateVideoEncoder(String str, boolean z);

    private native String nativeDefaultGetSupportedFormats();

    @Override // com.ss.avframework.engine.VideoEncoderFactory, com.ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.i(13899);
        super.release();
        this.mHWFacotry.release();
        MethodCollector.o(13899);
    }

    @Override // com.ss.avframework.engine.VideoEncoderFactory
    public String GetSupportedFormats() {
        MethodCollector.i(13853);
        String str = this.mHWFacotry.GetSupportedFormats() + ":" + nativeDefaultGetSupportedFormats();
        MethodCollector.o(13853);
        return str;
    }

    @Override // com.ss.avframework.engine.VideoEncoderFactory
    public VideoEncoder CreateVideoEncoder(String str, boolean z) {
        MethodCollector.i(13851);
        VideoEncoder CreateVideoEncoder = this.mHWFacotry.CreateVideoEncoder(str, z);
        if (CreateVideoEncoder == null) {
            CreateVideoEncoder = nativeDefaultCreateVideoEncoder(str, z);
        }
        MethodCollector.o(13851);
        return CreateVideoEncoder;
    }
}

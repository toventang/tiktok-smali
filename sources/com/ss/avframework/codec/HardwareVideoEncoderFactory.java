package com.ss.avframework.codec;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.engine.VideoEncoder;
import com.ss.avframework.engine.VideoEncoderFactory;
import com.ss.avframework.opengl.GLThread;
import com.ss.avframework.utils.SafeHandlerThreadPoolExecutor;

public class HardwareVideoEncoderFactory extends VideoEncoderFactory {
    private Handler glEncodeHandler;
    private GLThread glEncodeThread;

    static {
        Covode.recordClassIndex(99764);
    }

    @Override // com.ss.avframework.engine.VideoEncoderFactory
    public String GetSupportedFormats() {
        return "video_type=video/avc,video_enable_accelera=true,oes_texture_frame=true:video_type=video/bytevc1,video_enable_accelera=true,oes_texture_frame=true";
    }

    @Override // com.ss.avframework.engine.NativeObject
    public void finalize() {
        release();
        super.finalize();
    }

    @Override // com.ss.avframework.engine.VideoEncoderFactory, com.ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.i(13614);
        GLThread gLThread = this.glEncodeThread;
        this.glEncodeThread = null;
        SafeHandlerThreadPoolExecutor.unlockThread(gLThread);
        super.release();
        MethodCollector.o(13614);
    }

    @Override // com.ss.avframework.engine.VideoEncoderFactory
    public VideoEncoder CreateVideoEncoder(String str, boolean z) {
        HardwareVideoEncoder hardwareVideoEncoder;
        if (!z) {
            return null;
        }
        String str2 = "";
        boolean z2 = false;
        for (String str3 : str.split(",")) {
            String[] split = str3.split("=");
            if (split.length > 1) {
                if (split[0].equalsIgnoreCase("video_type")) {
                    str2 = split[1];
                } else if (split[0].equalsIgnoreCase("oes_texture_frame")) {
                    z2 = split[1].equalsIgnoreCase("true");
                }
            }
        }
        if (!z2) {
            if (this.glEncodeThread == null) {
                GLThread lockGLThread = SafeHandlerThreadPoolExecutor.lockGLThread("HardWareEncodeThread");
                this.glEncodeThread = lockGLThread;
                lockGLThread.start();
            }
            if (this.glEncodeHandler == null) {
                this.glEncodeHandler = this.glEncodeThread.getHandler();
            }
        }
        if (z2) {
            OesTextureHWEncoder oesTextureHWEncoder = new OesTextureHWEncoder(str2.equalsIgnoreCase("video/bytevc1"));
            if (oesTextureHWEncoder.setupCodecName()) {
                return oesTextureHWEncoder;
            }
            oesTextureHWEncoder.release();
            return null;
        }
        if (str2.equalsIgnoreCase("video/avc")) {
            hardwareVideoEncoder = new H264HWVideoEncoder(this.glEncodeHandler);
            if (!hardwareVideoEncoder.setupCodecName()) {
                hardwareVideoEncoder.release();
                return null;
            }
        } else if (!str2.equalsIgnoreCase("video/bytevc1")) {
            return null;
        } else {
            hardwareVideoEncoder = new ByteVC1HWVideoEncoder(this.glEncodeHandler);
            if (!hardwareVideoEncoder.setupCodecName()) {
                hardwareVideoEncoder.release();
                return null;
            }
        }
        return hardwareVideoEncoder;
    }
}

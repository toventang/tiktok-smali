package com.ss.avframework.codec;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.opengl.GlUtil;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.TEBundle;

public class OesTextureHWEncoder extends HardwareVideoEncoder {
    private final String mime;

    static {
        Covode.recordClassIndex(99768);
    }

    @Override // com.ss.avframework.codec.HardwareVideoEncoder, com.ss.avframework.engine.VideoEncoder
    public /* bridge */ /* synthetic */ void RequestIDRFrame() {
        super.RequestIDRFrame();
    }

    @Override // com.ss.avframework.codec.HardwareVideoEncoder
    public /* bridge */ /* synthetic */ byte[] getExtraData() {
        return super.getExtraData();
    }

    @Override // com.ss.avframework.engine.NativeObject, com.ss.avframework.codec.HardwareVideoEncoder, com.ss.avframework.engine.VideoEncoder
    public synchronized void release() {
        MethodCollector.i(10573);
        super.release();
        MethodCollector.o(10573);
    }

    @Override // com.ss.avframework.codec.HardwareVideoEncoder
    public boolean setupCodecName() {
        this.info = MediaCodecUtils.findCodecForType(this.mime);
        AVLog.iod("OesTextureHWEncoder", "using OesTextureHWEncoder!");
        if (this.info != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.avframework.codec.HardwareVideoEncoder, com.ss.avframework.engine.VideoEncoder
    public /* bridge */ /* synthetic */ void SetBitrate(int i2) {
        super.SetBitrate(i2);
    }

    private boolean superInitEncoder(TEBundle tEBundle) {
        return super.InitEncoder(tEBundle);
    }

    @Override // com.ss.avframework.codec.HardwareVideoEncoder, com.ss.avframework.engine.VideoEncoder
    public int Encode(VideoFrame videoFrame) {
        return super.Encode(videoFrame);
    }

    OesTextureHWEncoder(boolean z) {
        String str;
        if (z) {
            str = MediaCodecUtils.ByteVC1Mime;
        } else {
            str = "video/avc";
        }
        this.mime = str;
    }

    @Override // com.ss.avframework.engine.NativeObject
    public void setNativeObj(long j2) {
        if (j2 == 0) {
            try {
                release();
            } catch (Exception unused) {
            }
        }
        super.setNativeObj(j2);
    }

    @Override // com.ss.avframework.codec.HardwareVideoEncoder, com.ss.avframework.engine.VideoEncoder
    public boolean InitEncoder(TEBundle tEBundle) {
        if (this.info == null) {
            return false;
        }
        try {
            String name = this.info.getName();
            setupCodecName(name, this.mime, MediaCodecUtils.selectColorFormat(MediaCodecUtils.TEXTURE_COLOR_FORMATS, this.info.getCapabilitiesForType(this.mime), name), MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, this.info.getCapabilitiesForType(this.mime), name));
            GlUtil.nativeAttachThreadToOpenGl();
            return superInitEncoder(tEBundle);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.ss.avframework.codec.HardwareVideoEncoder
    public /* bridge */ /* synthetic */ void setupCodecName(String str, String str2, Integer num, Integer num2) {
        super.setupCodecName(str, str2, num, num2);
    }
}

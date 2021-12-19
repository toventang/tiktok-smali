package com.ss.avframework.codec;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.opengl.GlUtil;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.TEBundle;
import com.ss.avframework.utils.ThreadUtils;

public class ByteVC1HWVideoEncoder extends HardwareVideoEncoder {
    private Handler mHandler;

    static {
        Covode.recordClassIndex(99744);
    }

    @Override // com.ss.avframework.codec.HardwareVideoEncoder, com.ss.avframework.engine.VideoEncoder
    public /* bridge */ /* synthetic */ void RequestIDRFrame() {
        super.RequestIDRFrame();
    }

    public void superRelease() {
        super.release();
    }

    @Override // com.ss.avframework.codec.HardwareVideoEncoder
    public /* bridge */ /* synthetic */ byte[] getExtraData() {
        return super.getExtraData();
    }

    @Override // com.ss.avframework.codec.HardwareVideoEncoder
    public boolean setupCodecName() {
        this.info = MediaCodecUtils.findCodecForType(MediaCodecUtils.ByteVC1Mime);
        if (this.info != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.avframework.engine.NativeObject, com.ss.avframework.codec.HardwareVideoEncoder, com.ss.avframework.engine.VideoEncoder
    public synchronized void release() {
        MethodCollector.i(14260);
        Handler handler = this.mHandler;
        if (handler == null) {
            MethodCollector.o(14260);
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() {
            /* class com.ss.avframework.codec.ByteVC1HWVideoEncoder.AnonymousClass3 */

            static {
                Covode.recordClassIndex(99747);
            }

            public void run() {
                ByteVC1HWVideoEncoder.this.superRelease();
            }
        });
        this.mHandler = null;
        MethodCollector.o(14260);
    }

    @Override // com.ss.avframework.codec.HardwareVideoEncoder, com.ss.avframework.engine.VideoEncoder
    public /* bridge */ /* synthetic */ void SetBitrate(int i2) {
        super.SetBitrate(i2);
    }

    public ByteVC1HWVideoEncoder(Handler handler) {
        this.mHandler = handler;
    }

    public int superEncode(VideoFrame videoFrame) {
        return super.Encode(videoFrame);
    }

    public boolean superInitEncoder(TEBundle tEBundle) {
        return super.InitEncoder(tEBundle);
    }

    @Override // com.ss.avframework.engine.NativeObject
    public void setNativeObj(long j2) {
        if (j2 == 0) {
            release();
        }
        super.setNativeObj(j2);
    }

    @Override // com.ss.avframework.codec.HardwareVideoEncoder, com.ss.avframework.engine.VideoEncoder
    public int Encode(final VideoFrame videoFrame) {
        videoFrame.retain();
        if (this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.codec.ByteVC1HWVideoEncoder.AnonymousClass2 */

            static {
                Covode.recordClassIndex(99746);
            }

            public void run() {
                ByteVC1HWVideoEncoder.this.superEncode(videoFrame);
                videoFrame.release();
            }
        })) {
            return 0;
        }
        videoFrame.release();
        if (!this.noDropFrame) {
            return 0;
        }
        AVLog.iow("ByteVC1HWVideoEncoder", "drop frame!");
        return 0;
    }

    @Override // com.ss.avframework.codec.HardwareVideoEncoder, com.ss.avframework.engine.VideoEncoder
    public boolean InitEncoder(final TEBundle tEBundle) {
        Handler handler;
        if (this.info == null || (handler = this.mHandler) == null) {
            return false;
        }
        final boolean[] zArr = {false};
        try {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() {
                /* class com.ss.avframework.codec.ByteVC1HWVideoEncoder.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(99745);
                }

                public void run() {
                    String name = ByteVC1HWVideoEncoder.this.info.getName();
                    String str = MediaCodecUtils.ByteVC1Mime;
                    ByteVC1HWVideoEncoder.this.setupCodecName(name, str, MediaCodecUtils.selectColorFormat(MediaCodecUtils.TEXTURE_COLOR_FORMATS, ByteVC1HWVideoEncoder.this.info.getCapabilitiesForType(str), name), MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, ByteVC1HWVideoEncoder.this.info.getCapabilitiesForType(str), name));
                    GlUtil.nativeAttachThreadToOpenGl();
                    zArr[0] = ByteVC1HWVideoEncoder.this.superInitEncoder(tEBundle);
                }
            });
        } catch (Throwable unused) {
        }
        return zArr[0];
    }

    @Override // com.ss.avframework.codec.HardwareVideoEncoder
    public /* bridge */ /* synthetic */ void setupCodecName(String str, String str2, Integer num, Integer num2) {
        super.setupCodecName(str, str2, num, num2);
    }
}

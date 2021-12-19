package com.ss.avframework.codec;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.TEBundle;
import com.ss.avframework.utils.ThreadUtils;

class H264HWVideoEncoder extends HardwareVideoEncoder {
    private Handler mHandler;

    static {
        Covode.recordClassIndex(99750);
    }

    public void superRelease() {
        super.release();
    }

    @Override // com.ss.avframework.codec.HardwareVideoEncoder
    public boolean setupCodecName() {
        this.info = MediaCodecUtils.findCodecForType("video/avc");
        if (this.info != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.avframework.engine.NativeObject, com.ss.avframework.codec.HardwareVideoEncoder, com.ss.avframework.engine.VideoEncoder
    public synchronized void release() {
        MethodCollector.i(12361);
        Handler handler = this.mHandler;
        if (handler == null) {
            MethodCollector.o(12361);
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() {
            /* class com.ss.avframework.codec.H264HWVideoEncoder.AnonymousClass3 */

            static {
                Covode.recordClassIndex(99753);
            }

            public void run() {
                H264HWVideoEncoder.this.superRelease();
            }
        });
        this.mHandler = null;
        MethodCollector.o(12361);
    }

    public H264HWVideoEncoder(Handler handler) {
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
            /* class com.ss.avframework.codec.H264HWVideoEncoder.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99751);
            }

            public void run() {
                H264HWVideoEncoder.this.superEncode(videoFrame);
                videoFrame.release();
            }
        })) {
            return 0;
        }
        videoFrame.release();
        if (!this.noDropFrame) {
            return 0;
        }
        AVLog.iow("H264HWVideoEncoder", "drop frame!");
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
                /* class com.ss.avframework.codec.H264HWVideoEncoder.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(99752);
                }

                public void run() {
                    String name = H264HWVideoEncoder.this.info.getName();
                    H264HWVideoEncoder.this.setupCodecName(name, "video/avc", MediaCodecUtils.selectColorFormat(MediaCodecUtils.TEXTURE_COLOR_FORMATS, H264HWVideoEncoder.this.info.getCapabilitiesForType("video/avc"), name), MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, H264HWVideoEncoder.this.info.getCapabilitiesForType("video/avc"), name));
                    zArr[0] = H264HWVideoEncoder.this.superInitEncoder(tEBundle);
                }
            });
        } catch (Throwable unused) {
        }
        return zArr[0];
    }
}

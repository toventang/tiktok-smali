package com.ss.bytertc.engine.handler;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.bytertc.engine.mediaio.RTCVideoFrame;
import com.ss.bytertc.engine.utils.ByteBufferUtils;
import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;
import org.webrtc.YuvHelper;

public class RTCVideoFrameObserver {
    static {
        Covode.recordClassIndex(100961);
    }

    /* access modifiers changed from: package-private */
    public void onLocalScreenFrame(VideoFrame videoFrame) {
        try {
            videoFrame.release();
        } catch (Exception e2) {
            e2.printStackTrace();
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    public void onLocalVideoFrame(VideoFrame videoFrame) {
        try {
            videoFrame.release();
        } catch (Exception e2) {
            e2.printStackTrace();
            throw e2;
        }
    }

    /* access modifiers changed from: protected */
    public RTCVideoFrame ConvertVideoFrame(VideoFrame videoFrame) {
        RTCVideoFrame rTCVideoFrame;
        MethodCollector.i(12226);
        if (videoFrame != null) {
            int width = videoFrame.getBuffer().getWidth();
            int height = videoFrame.getBuffer().getHeight();
            final ByteBuffer nativeAllocateBuffer = ByteBufferUtils.nativeAllocateBuffer((width * height) + (((width + 1) / 2) * ((height + 1) / 2) * 2));
            rTCVideoFrame = new RTCVideoFrame(nativeAllocateBuffer, videoFrame.getExtendedData(), null, width, height, videoFrame.getRotation(), videoFrame.getTimestampNs(), new Runnable() {
                /* class com.ss.bytertc.engine.handler.RTCVideoFrameObserver.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(100962);
                }

                public void run() {
                    MethodCollector.i(8603);
                    ByteBuffer byteBuffer = nativeAllocateBuffer;
                    if (byteBuffer != null) {
                        ByteBufferUtils.nativeReleaseBuffer(byteBuffer);
                    }
                    MethodCollector.o(8603);
                }
            });
            VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
            if (i420 != null) {
                YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), rTCVideoFrame.buffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
            videoFrame.release();
        } else {
            rTCVideoFrame = null;
        }
        MethodCollector.o(12226);
        return rTCVideoFrame;
    }

    /* access modifiers changed from: package-private */
    public void onMergeFrame(String str, String str2, VideoFrame videoFrame) {
        try {
            videoFrame.release();
        } catch (Exception e2) {
            e2.printStackTrace();
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    public void onRemoteScreenFrame(String str, String str2, VideoFrame videoFrame) {
        try {
            videoFrame.release();
        } catch (Exception e2) {
            e2.printStackTrace();
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    public void onRemoteVideoFrame(String str, String str2, VideoFrame videoFrame) {
        try {
            videoFrame.release();
        } catch (Exception e2) {
            e2.printStackTrace();
            throw e2;
        }
    }
}

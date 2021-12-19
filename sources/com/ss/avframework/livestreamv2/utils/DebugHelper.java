package com.ss.avframework.livestreamv2.utils;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.TextureBufferImpl;
import com.ss.avframework.buffer.VideoFrame;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;

public class DebugHelper {
    static {
        Covode.recordClassIndex(100486);
    }

    public static Bitmap convertFrameVideoFrame(VideoFrame videoFrame) {
        boolean z;
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        if (!(buffer instanceof TextureBufferImpl)) {
            return null;
        }
        TextureBufferImpl textureBufferImpl = (TextureBufferImpl) buffer;
        int textureId = textureBufferImpl.getTextureId();
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (textureBufferImpl.getType() == VideoFrame.TextureBuffer.Type.OES) {
            z = true;
        } else {
            z = false;
        }
        return convertFromTexture(textureId, rotatedWidth, rotatedHeight, z);
    }

    public static boolean writeToFile(VideoFrame.I420Buffer i420Buffer, String str) {
        MethodCollector.i(13268);
        try {
            FileChannel channel = new FileOutputStream(new File("/sdcard/" + str + ".yuv"), false).getChannel();
            channel.write(i420Buffer.getDataY());
            channel.write(i420Buffer.getDataU());
            channel.write(i420Buffer.getDataV());
            channel.close();
            MethodCollector.o(13268);
            return true;
        } catch (IOException unused) {
            MethodCollector.o(13268);
            return false;
        }
    }

    public static Bitmap convertFromTexture(int i2, int i3, int i4, boolean z) {
        int i5;
        MethodCollector.i(13015);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i3 * i4 * 4);
        allocateDirect.clear();
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        int i6 = iArr[0];
        int[] iArr2 = new int[1];
        GLES20.glGetIntegerv(36006, IntBuffer.wrap(iArr2));
        int i7 = iArr2[0];
        GLES20.glBindFramebuffer(36160, i6);
        int i8 = 3553;
        if (z) {
            i5 = 36197;
        } else {
            i5 = 3553;
        }
        GLES20.glFramebufferTexture2D(36160, 36064, i5, i2, 0);
        GLES20.glReadPixels(0, 0, i3, i4, 6408, 5121, allocateDirect);
        if (z) {
            i8 = 36197;
        }
        GLES20.glFramebufferTexture2D(36160, 36064, i8, 0, 0);
        GLES20.glBindFramebuffer(36160, i7);
        allocateDirect.clear();
        Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        MethodCollector.o(13015);
        return createBitmap;
    }
}

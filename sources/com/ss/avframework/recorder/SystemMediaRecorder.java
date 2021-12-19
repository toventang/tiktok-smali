package com.ss.avframework.recorder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.utils.AVLog;
import java.io.IOException;
import java.nio.ByteBuffer;

public class SystemMediaRecorder implements MediaRecorder {
    private String mFileName;
    private int mFormat;
    private MediaMuxer mMediaMuxer;

    static {
        Covode.recordClassIndex(100557);
    }

    @Override // com.ss.avframework.recorder.MediaRecorder
    public int start() {
        MediaMuxer mediaMuxer = this.mMediaMuxer;
        if (mediaMuxer == null) {
            return -1;
        }
        try {
            mediaMuxer.start();
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.ss.avframework.recorder.MediaRecorder
    public void release() {
        MediaMuxer mediaMuxer = this.mMediaMuxer;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.release();
            } catch (Exception e2) {
                AVLog.w("SystemMediaRecorder", e2.toString());
            }
            this.mMediaMuxer = null;
        }
    }

    @Override // com.ss.avframework.recorder.MediaRecorder
    public int stop() {
        MediaMuxer mediaMuxer = this.mMediaMuxer;
        if (mediaMuxer == null) {
            return 0;
        }
        try {
            mediaMuxer.stop();
            return 0;
        } catch (Exception e2) {
            AVLog.w("SystemMediaRecorder", e2.toString());
            return 0;
        }
    }

    @Override // com.ss.avframework.recorder.MediaRecorder
    public int addTrack(MediaFormat mediaFormat) {
        MediaMuxer mediaMuxer = this.mMediaMuxer;
        if (mediaMuxer != null) {
            return mediaMuxer.addTrack(mediaFormat);
        }
        return -1;
    }

    public SystemMediaRecorder(String str, int i2) {
        this.mFileName = str;
        this.mFormat = i2;
        try {
            int i3 = Build.VERSION.SDK_INT;
            this.mMediaMuxer = new MediaMuxer(this.mFileName, this.mFormat);
        } catch (IOException unused) {
            this.mMediaMuxer = null;
        }
    }

    @Override // com.ss.avframework.recorder.MediaRecorder
    public int writeSampleData(int i2, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        MediaMuxer mediaMuxer = this.mMediaMuxer;
        if (mediaMuxer == null) {
            return 0;
        }
        try {
            mediaMuxer.writeSampleData(i2, byteBuffer, bufferInfo);
            return 0;
        } catch (Exception e2) {
            AVLog.e("SystemMediaRecorder", e2.toString());
            return -1;
        }
    }
}

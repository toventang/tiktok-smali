package com.bytedance.bae.codec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.bytedance.bae.base.BaeLogging;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public class MediaCodecAACEncoder {
    private MediaCodec mAACEncoder;
    private int mBitrate = 64000;
    private MediaCodec.BufferInfo mBufferInfo;
    private int mChannels = 1;
    private byte[] mEncodedData;
    private int mFrameSize = 1024;
    private ByteBuffer[] mInputBuffers;
    private String mMimeType = "audio/mp4a-latm";
    private ByteBuffer[] mOutputBuffers;
    private int mProfile = 2;
    private int mSampleRate = 44100;

    static {
        Covode.recordClassIndex(15359);
    }

    public byte[] getEncodedData() {
        return this.mEncodedData;
    }

    public int getFrameSize() {
        return this.mFrameSize;
    }

    MediaCodecAACEncoder() {
        BaeLogging.e("MediaCodecAACEncoder", "MediaCodecAAC Encoder Created");
    }

    public void closeEncoder() {
        try {
            MediaCodec mediaCodec = this.mAACEncoder;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mAACEncoder.release();
                this.mAACEncoder = null;
                BaeLogging.e("MediaCodecAACEncoder", "close AAC encoder success");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            BaeLogging.e("MediaCodecAACEncoder", "close AAC encoder failed");
        }
    }

    public boolean openEncoder() {
        try {
            this.mAACEncoder = MediaCodec.createEncoderByType(this.mMimeType);
            BaeLogging.e("MediaCodecAACEncoder", "open AAC encoder success");
            if (this.mAACEncoder != null) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            this.mAACEncoder = null;
            BaeLogging.e("MediaCodecAACEncoder", "Open AAC encoder failed");
            return false;
        }
    }

    public boolean configAndStartEncoder() {
        try {
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat(this.mMimeType, this.mSampleRate, this.mChannels);
            createAudioFormat.setInteger("bitrate", this.mBitrate);
            createAudioFormat.setInteger("aac-profile", this.mProfile);
            createAudioFormat.setInteger("max-input-size", this.mChannels * this.mFrameSize * 100);
            this.mAACEncoder.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            this.mAACEncoder.start();
            this.mBufferInfo = new MediaCodec.BufferInfo();
            BaeLogging.e("MediaCodecAACEncoder", "config AAC encoder success");
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            BaeLogging.e("MediaCodecAACEncoder", "Config and Start Encoder Error");
            return false;
        }
    }

    public void setBitRateValue(int i2) {
        this.mBitrate = i2;
    }

    public void setChannelsValue(int i2) {
        this.mChannels = i2;
    }

    public void setSampeRateValue(int i2) {
        this.mSampleRate = i2;
    }

    public boolean setBitrate(int i2) {
        try {
            MediaCodec mediaCodec = this.mAACEncoder;
            if (mediaCodec == null) {
                return false;
            }
            mediaCodec.stop();
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat(this.mMimeType, this.mSampleRate, this.mChannels);
            createAudioFormat.setInteger("bitrate", i2);
            createAudioFormat.setInteger("aac-profile", this.mProfile);
            this.mAACEncoder.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            this.mAACEncoder.start();
            this.mBitrate = i2;
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            BaeLogging.e("MediaCodecAACEncoder", "Config and Start Encoder Error");
            return false;
        }
    }

    public void setProfileValue(String str) {
        if (str.equals("he_aac")) {
            this.mProfile = 5;
            this.mFrameSize = 2048;
        } else if (str.equals("he_aac_v2")) {
            this.mProfile = 29;
            this.mFrameSize = 2048;
        } else {
            this.mProfile = 2;
            this.mFrameSize = 1024;
        }
    }

    public boolean encodeProcess(byte[] bArr) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        try {
            MediaCodec mediaCodec = this.mAACEncoder;
            if (mediaCodec == null) {
                return false;
            }
            this.mEncodedData = null;
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(300);
            if (dequeueInputBuffer >= 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    byteBuffer2 = this.mAACEncoder.getInputBuffer(dequeueInputBuffer);
                } else {
                    ByteBuffer[] inputBuffers = this.mAACEncoder.getInputBuffers();
                    this.mInputBuffers = inputBuffers;
                    byteBuffer2 = inputBuffers[dequeueInputBuffer];
                    byteBuffer2.limit(bArr.length);
                }
                byteBuffer2.clear();
                byteBuffer2.put(bArr);
                this.mAACEncoder.queueInputBuffer(dequeueInputBuffer, 0, bArr.length, 0, 0);
            }
            int dequeueOutputBuffer = this.mAACEncoder.dequeueOutputBuffer(this.mBufferInfo, 0);
            int i2 = this.mBufferInfo.size;
            if (i2 > 0 && dequeueOutputBuffer >= 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    byteBuffer = this.mAACEncoder.getOutputBuffer(dequeueOutputBuffer);
                } else {
                    ByteBuffer[] outputBuffers = this.mAACEncoder.getOutputBuffers();
                    this.mOutputBuffers = outputBuffers;
                    byteBuffer = outputBuffers[dequeueOutputBuffer];
                    byteBuffer.limit(this.mBufferInfo.size);
                }
                byte[] bArr2 = new byte[i2];
                this.mEncodedData = bArr2;
                byteBuffer.get(bArr2, this.mBufferInfo.offset, i2);
                byteBuffer.clear();
                this.mAACEncoder.releaseOutputBuffer(dequeueOutputBuffer, false);
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            BaeLogging.e("MediaCodecAACEncoder", "AAC Encoder Encode failed");
            return false;
        }
    }
}

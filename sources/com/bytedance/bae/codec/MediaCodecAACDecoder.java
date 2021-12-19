package com.bytedance.bae.codec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.bytedance.bae.base.BaeLogging;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public class MediaCodecAACDecoder {
    private long input_ts;
    private MediaCodec mAACDecoder;
    private byte[] mAsc;
    private MediaCodec.BufferInfo mBufferInfo;
    private int mChannels = 1;
    private byte[] mDecodedData;
    private int mHasADTS;
    private ByteBuffer[] mInputBuffers;
    private String mMimeType = "audio/mp4a-latm";
    private ByteBuffer[] mOutputBuffers;
    private MediaFormat mOutputFormat;
    private int mProfile = 2;
    private int mSampleRate = 44100;
    private long output_ts;

    static {
        Covode.recordClassIndex(15358);
    }

    public byte[] getDecodedData() {
        return this.mDecodedData;
    }

    public long getOutputTs() {
        return this.output_ts;
    }

    public int getOutputChannels() {
        return this.mOutputFormat.getInteger("channel-count");
    }

    public int getOutputSampleRate() {
        return this.mOutputFormat.getInteger("sample-rate");
    }

    MediaCodecAACDecoder() {
        BaeLogging.e("MediaCodecAACDecoder", "MediaCodecAAC Decoder Created");
    }

    public void closeDecoder() {
        try {
            MediaCodec mediaCodec = this.mAACDecoder;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mAACDecoder.release();
                this.mAACDecoder = null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            BaeLogging.e("MediaCodecAACDecoder", "close AAC decoder failed");
        }
    }

    public boolean openEncoder() {
        try {
            MediaCodec createDecoderByType = MediaCodec.createDecoderByType(this.mMimeType);
            this.mAACDecoder = createDecoderByType;
            if (createDecoderByType != null) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            this.mAACDecoder = null;
            BaeLogging.e("MediaCodecAACDecoder", "Open AAC Decoder failed");
            return false;
        }
    }

    public boolean configAndStartDecoder() {
        try {
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat(this.mMimeType, this.mSampleRate, this.mChannels);
            createAudioFormat.setInteger("aac-profile", this.mProfile);
            createAudioFormat.setInteger("is-adts", this.mHasADTS);
            createAudioFormat.setInteger("aac-max-output-channel_count", this.mChannels);
            genAsc();
            createAudioFormat.setByteBuffer("csd-0", ByteBuffer.wrap(this.mAsc));
            this.mAACDecoder.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 0);
            this.mAACDecoder.start();
            this.mBufferInfo = new MediaCodec.BufferInfo();
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            closeDecoder();
            BaeLogging.e("MediaCodecAACDecoder", "Config and Start Decoder Error");
            return false;
        }
    }

    private void genAsc() {
        int i2;
        int i3;
        int i4 = this.mProfile;
        int i5 = 4;
        if (i4 == 2) {
            this.mAsc = new byte[2];
        } else {
            this.mAsc = new byte[4];
        }
        int i6 = this.mSampleRate;
        if (48000 == i6) {
            i5 = 3;
            i2 = 6;
        } else if (44100 == i6) {
            i2 = 7;
        } else {
            i5 = 0;
            i2 = 0;
        }
        int i7 = this.mChannels;
        if (1 == i7) {
            i3 = 1;
        } else if (2 == i7) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        byte b2 = (byte) i4;
        if (2 == i4) {
            byte[] bArr = this.mAsc;
            bArr[0] = (byte) ((b2 << 3) | (i5 >> 1));
            bArr[1] = (byte) ((i5 << 7) | (i3 << 3));
        } else if (5 == i4) {
            byte[] bArr2 = this.mAsc;
            bArr2[0] = (byte) ((b2 << 3) | (i2 >> 1));
            bArr2[1] = (byte) ((i2 << 7) | (i3 << 3) | (i5 >> 1));
            bArr2[2] = (byte) ((i5 << 7) | 8);
            bArr2[3] = 0;
        } else if (29 == i4) {
            byte[] bArr3 = this.mAsc;
            bArr3[0] = (byte) ((b2 << 3) | (i2 >> 1));
            bArr3[1] = (byte) ((i2 << 7) | 8 | (i5 >> 1));
            bArr3[2] = (byte) ((i5 << 7) | 8);
            bArr3[3] = 0;
        }
    }

    public void setADTSValue(int i2) {
        this.mHasADTS = i2;
    }

    public void setChannelsValue(int i2) {
        this.mChannels = i2;
    }

    public void setInputTs(long j2) {
        this.input_ts = j2;
    }

    public void setSampeRateValue(int i2) {
        this.mSampleRate = i2;
    }

    public void setProfileValue(String str) {
        if (str.equals("he_aac")) {
            this.mProfile = 5;
        } else if (str.equals("he_aac_v2")) {
            this.mProfile = 29;
        } else {
            this.mProfile = 2;
        }
    }

    public boolean decodeProcess(byte[] bArr) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        try {
            MediaCodec mediaCodec = this.mAACDecoder;
            if (mediaCodec == null) {
                return false;
            }
            this.mDecodedData = null;
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(300);
            if (dequeueInputBuffer >= 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    byteBuffer2 = this.mAACDecoder.getInputBuffer(dequeueInputBuffer);
                } else {
                    ByteBuffer[] inputBuffers = this.mAACDecoder.getInputBuffers();
                    this.mInputBuffers = inputBuffers;
                    byteBuffer2 = inputBuffers[dequeueInputBuffer];
                    byteBuffer2.limit(bArr.length);
                }
                byteBuffer2.clear();
                byteBuffer2.put(bArr);
                this.mAACDecoder.queueInputBuffer(dequeueInputBuffer, 0, bArr.length, (this.input_ts * 1000000) / ((long) this.mSampleRate), 0);
            }
            int dequeueOutputBuffer = this.mAACDecoder.dequeueOutputBuffer(this.mBufferInfo, 0);
            int i2 = this.mBufferInfo.size;
            if (i2 > 0 && dequeueOutputBuffer >= 0) {
                this.output_ts = (this.mBufferInfo.presentationTimeUs * ((long) this.mSampleRate)) / 1000000;
                if (Build.VERSION.SDK_INT >= 21) {
                    byteBuffer = this.mAACDecoder.getOutputBuffer(dequeueOutputBuffer);
                } else {
                    ByteBuffer[] outputBuffers = this.mAACDecoder.getOutputBuffers();
                    this.mOutputBuffers = outputBuffers;
                    byteBuffer = outputBuffers[dequeueOutputBuffer];
                    byteBuffer.limit(this.mBufferInfo.size);
                }
                byte[] bArr2 = new byte[i2];
                this.mDecodedData = bArr2;
                byteBuffer.get(bArr2, this.mBufferInfo.offset, this.mBufferInfo.size);
                byteBuffer.clear();
                this.mOutputFormat = this.mAACDecoder.getOutputFormat(dequeueOutputBuffer);
                this.mAACDecoder.releaseOutputBuffer(dequeueOutputBuffer, false);
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            BaeLogging.e("MediaCodecAACDecoder", "AAC Decoder Decode failed");
            return false;
        }
    }
}

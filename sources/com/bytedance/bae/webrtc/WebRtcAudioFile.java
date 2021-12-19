package com.bytedance.bae.webrtc;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.bytedance.bae.base.BaeLogging;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

class WebRtcAudioFile {
    private boolean eoInputStream;
    private boolean eoOutputStream;
    private int mChannels = 2;
    private byte[] mDecodedData;
    private ByteBuffer mDecodedRAWBuffer;
    private MediaExtractor mExtractor;
    private long mFileLength;
    private ByteBuffer[] mInputBuffers;
    private MediaCodec mMediaCodec;
    private ByteBuffer[] mOutputBuffers;
    private int mRetryCount;
    private int mSampleRate = 44100;
    private MediaFormat mTrackFormat;

    static {
        Covode.recordClassIndex(15404);
    }

    public int getChannelCount() {
        return this.mChannels;
    }

    public byte[] getDecodedData() {
        return this.mDecodedData;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public long getFileLength() {
        return this.mFileLength / 1000;
    }

    public long getCurrentFilePosition() {
        return this.mExtractor.getSampleTime() / 1000;
    }

    WebRtcAudioFile() {
        BaeLogging.e("WebRtcAudioRecordFile", "AudioMix WebRtcAudioFile");
    }

    private boolean checkInfoChange() {
        boolean z;
        int i2 = Build.VERSION.SDK_INT;
        try {
            MediaFormat outputFormat = this.mMediaCodec.getOutputFormat();
            int integer = outputFormat.getInteger("sample-rate");
            int integer2 = outputFormat.getInteger("channel-count");
            if (this.mSampleRate == integer) {
                if (this.mChannels == integer2) {
                    z = false;
                    this.mSampleRate = integer;
                    this.mChannels = integer2;
                    return z;
                }
            }
            z = true;
            this.mSampleRate = integer;
            this.mChannels = integer2;
            return z;
        } catch (Exception e2) {
            e2.printStackTrace();
            BaeLogging.e("WebRtcAudioRecordFile", "Error when checking file's new format");
            return false;
        }
    }

    public void uninit() {
        try {
            MediaCodec mediaCodec = this.mMediaCodec;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mMediaCodec.release();
                this.mMediaCodec = null;
            }
            MediaExtractor mediaExtractor = this.mExtractor;
            if (mediaExtractor != null) {
                mediaExtractor.release();
                this.mExtractor = null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            BaeLogging.e("WebRtcAudioRecordFile", "Error when releasing audio file stream");
        }
        this.eoOutputStream = false;
        this.eoInputStream = false;
    }

    public boolean readAudioData() {
        ByteBuffer byteBuffer;
        int dequeueInputBuffer;
        ByteBuffer byteBuffer2;
        try {
            if (!this.eoInputStream && (dequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(0)) >= 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    byteBuffer2 = this.mMediaCodec.getInputBuffer(dequeueInputBuffer);
                } else {
                    ByteBuffer[] inputBuffers = this.mMediaCodec.getInputBuffers();
                    this.mInputBuffers = inputBuffers;
                    byteBuffer2 = inputBuffers[dequeueInputBuffer];
                }
                int readSampleData = this.mExtractor.readSampleData(byteBuffer2, 0);
                if (readSampleData <= 0) {
                    this.eoInputStream = true;
                    readSampleData = 0;
                }
                long sampleTime = this.mExtractor.getSampleTime();
                int sampleFlags = this.mExtractor.getSampleFlags();
                if (this.eoInputStream) {
                    sampleFlags |= 4;
                }
                this.mMediaCodec.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, sampleTime, sampleFlags);
                this.mExtractor.advance();
            }
            if (!this.eoOutputStream) {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                int dequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(bufferInfo, 0);
                this.mDecodedData = null;
                if (dequeueOutputBuffer == -3 || dequeueOutputBuffer == -2) {
                    this.mDecodedData = new byte[0];
                } else if (dequeueOutputBuffer != -1) {
                    this.mRetryCount = 0;
                    if (dequeueOutputBuffer >= 0) {
                        if ((bufferInfo.flags & 4) == 4) {
                            this.eoOutputStream = true;
                        }
                        if (Build.VERSION.SDK_INT >= 21) {
                            byteBuffer = this.mMediaCodec.getOutputBuffer(dequeueOutputBuffer);
                        } else {
                            ByteBuffer[] outputBuffers = this.mMediaCodec.getOutputBuffers();
                            this.mOutputBuffers = outputBuffers;
                            byteBuffer = outputBuffers[dequeueOutputBuffer];
                            byteBuffer.limit(bufferInfo.size);
                        }
                        byte[] bArr = new byte[byteBuffer.limit()];
                        this.mDecodedData = bArr;
                        byteBuffer.get(bArr, bufferInfo.offset, bufferInfo.size);
                        byteBuffer.clear();
                        this.mMediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                    }
                } else {
                    int i2 = this.mRetryCount + 1;
                    this.mRetryCount = i2;
                    if (i2 >= 100 && (Build.BRAND.toLowerCase().contains("meizu") || Build.MANUFACTURER.toLowerCase().contains("meizu") || Build.BRAND.toLowerCase().contains("vivo") || Build.MANUFACTURER.toLowerCase().contains("vivo"))) {
                        BaeLogging.e("WebRtcAudioRecordFile", "EAGAIN count=" + this.mRetryCount + " presentationTimeUs=" + bufferInfo.presentationTimeUs + " totalUs=" + this.mFileLength + " Force EOS");
                        this.eoOutputStream = true;
                        this.mRetryCount = 0;
                    }
                    this.mDecodedData = new byte[0];
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            BaeLogging.e("WebRtcAudioRecordFile", "Error when decoding audio file stream");
        }
        return this.eoOutputStream;
    }

    public void setCurrentFilePosition(long j2) {
        if (this.eoOutputStream) {
            try {
                this.mMediaCodec.flush();
            } catch (Exception e2) {
                e2.printStackTrace();
                BaeLogging.e("WebRtcAudioRecordFile", "Error when creating audio file decoder");
            }
        }
        this.mExtractor.seekTo(j2 * 1000, 2);
        this.eoInputStream = false;
        this.eoOutputStream = false;
    }

    /* access modifiers changed from: package-private */
    public boolean init(String str, int i2) {
        try {
            BaeLogging.i("WebRtcAudioRecordFile", "Try to decode audio file : ".concat(String.valueOf(str)));
            this.mRetryCount = 0;
            MediaExtractor mediaExtractor = new MediaExtractor();
            this.mExtractor = mediaExtractor;
            mediaExtractor.setDataSource(str);
            int trackCount = this.mExtractor.getTrackCount();
            for (int i3 = 0; i3 < trackCount; i3++) {
                this.mExtractor.unselectTrack(i3);
            }
            if (i2 + 1 > trackCount) {
                BaeLogging.e("WebRtcAudioRecordFile", "useTrack > trackCount");
                return false;
            }
            MediaFormat trackFormat = this.mExtractor.getTrackFormat(i2);
            this.mTrackFormat = trackFormat;
            String string = trackFormat.getString("mime");
            if (string.contains("audio/")) {
                this.mExtractor.selectTrack(i2);
                MediaCodec createDecoderByType = MediaCodec.createDecoderByType(string);
                this.mMediaCodec = createDecoderByType;
                createDecoderByType.configure(this.mTrackFormat, (Surface) null, (MediaCrypto) null, 0);
            }
            MediaCodec mediaCodec = this.mMediaCodec;
            if (mediaCodec != null) {
                mediaCodec.start();
            }
            this.mChannels = this.mTrackFormat.getInteger("channel-count");
            this.mSampleRate = this.mTrackFormat.getInteger("sample-rate");
            this.mFileLength = this.mTrackFormat.getLong("durationUs");
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            BaeLogging.e("WebRtcAudioRecordFile", "Error when creating audio file decoder");
            return false;
        }
    }
}

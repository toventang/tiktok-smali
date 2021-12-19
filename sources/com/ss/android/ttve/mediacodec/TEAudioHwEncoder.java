package com.ss.android.ttve.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.monitor.h;
import com.ss.android.vesdk.an;
import com.ss.android.vesdk.az;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;

public class TEAudioHwEncoder {
    private static long INPUT_DEQUEUE_TIMEOUT_US = 10000;
    private static int TRY_AGAIN_LATER_COUNT_LIMIT = 5;
    private MediaCodec audioEncoder;
    private LinkedBlockingQueue<a> audioQueue = new LinkedBlockingQueue<>();
    private int curBitrate = -1;
    private int curChannelCount = -1;
    private int curCodecInfoAACProfile = -1;
    private String curMimeType;
    private int curSampleNumPerChannel = -1;
    private int curSampleRate = -1;
    private volatile boolean encoderStarted;
    private volatile long inputCountDequeued;
    private volatile boolean inputEof;
    private MediaFormat inputFormat;
    private byte[] outputAsc;
    private MediaCodec.BufferInfo outputBufferInfo = new MediaCodec.BufferInfo();
    private volatile long outputCountDequeued;
    private volatile boolean outputEof;
    private MediaFormat outputFormat;
    private int recordInputBufferSize = -1;
    private LinkedBlockingQueue<b> remainingPcmQueue = new LinkedBlockingQueue<>();
    private a theOldestAudioData = null;

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f61105a;

        /* renamed from: b  reason: collision with root package name */
        public long f61106b;

        /* renamed from: c  reason: collision with root package name */
        public int f61107c;

        static {
            Covode.recordClassIndex(37629);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f61108a;

        /* renamed from: b  reason: collision with root package name */
        public long f61109b;

        static {
            Covode.recordClassIndex(37630);
        }

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }
    }

    private byte[] getOutputAsc() {
        return this.outputAsc;
    }

    private int restartEncoder() {
        releaseEncoder();
        return startEncoder();
    }

    static {
        Covode.recordClassIndex(37628);
    }

    private byte[] getAudioData() {
        a aVar = this.theOldestAudioData;
        if (aVar != null) {
            return aVar.f61105a;
        }
        return null;
    }

    private long getAudioPts() {
        a aVar = this.theOldestAudioData;
        if (aVar != null) {
            return aVar.f61106b;
        }
        return -1;
    }

    private void resetCodecInfo() {
        this.inputCountDequeued = 0;
        this.outputCountDequeued = 0;
        this.inputEof = false;
        this.outputEof = false;
        this.remainingPcmQueue.clear();
        this.audioQueue.clear();
    }

    private TEAudioHwEncoder() {
    }

    private int closeEncoder() {
        an.a("TEAudioHwEncoder", "closeEncoder, remainingPcmQueue size: " + this.remainingPcmQueue.size() + ", audioQueue size: " + this.audioQueue.size() + ", inputCountDequeued: " + this.inputCountDequeued + ", outputCountDequeued: " + this.outputCountDequeued);
        releaseEncoder();
        this.curMimeType = null;
        this.curSampleRate = -1;
        this.curChannelCount = -1;
        this.curSampleRate = -1;
        this.curCodecInfoAACProfile = -1;
        this.curSampleNumPerChannel = -1;
        this.outputAsc = null;
        return 0;
    }

    private void releaseEncoder() {
        if (this.audioEncoder != null) {
            try {
                if (this.encoderStarted) {
                    try {
                        this.audioEncoder.stop();
                    } catch (Exception e2) {
                        an.d("TEAudioHwEncoder", "MediaCodec stop exception: " + e2.getMessage());
                    }
                    this.encoderStarted = false;
                }
                this.audioEncoder.release();
                this.audioEncoder = null;
            } catch (Exception e3) {
                an.d("TEAudioHwEncoder", "releaseEncoder: " + e3.getMessage());
            } finally {
                resetCodecInfo();
            }
        }
    }

    private int startEncoder() {
        try {
            MediaCodec selectMediaCodec = selectMediaCodec();
            this.audioEncoder = selectMediaCodec;
            if (selectMediaCodec == null) {
                an.d("TEAudioHwEncoder", "create encoder failure, mime: " + this.curMimeType);
                return -201;
            }
            selectMediaCodec.configure(this.inputFormat, (Surface) null, (MediaCrypto) null, 1);
            this.audioEncoder.start();
            this.encoderStarted = true;
            return 0;
        } catch (Exception e2) {
            an.d("TEAudioHwEncoder", "startEncoder: " + e2.getMessage());
            return -203;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037 A[SYNTHETIC, Splitter:B:11:0x0037] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.media.MediaCodec selectMediaCodec() {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEAudioHwEncoder.selectMediaCodec():android.media.MediaCodec");
    }

    private MediaCodecInfo getGoogleEncoderCodecInfo() {
        String[] supportedTypes;
        String[] supportedTypes2;
        if (TextUtils.isEmpty(this.curMimeType)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                if (mediaCodecInfo.isEncoder() && mediaCodecInfo.getName().contains("OMX.google") && (supportedTypes2 = mediaCodecInfo.getSupportedTypes()) != null) {
                    int length = supportedTypes2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            continue;
                            break;
                        } else if (supportedTypes2[i2].equalsIgnoreCase(this.curMimeType)) {
                            MediaCodecInfo.AudioCapabilities audioCapabilities = mediaCodecInfo.getCapabilitiesForType(this.curMimeType).getAudioCapabilities();
                            if (audioCapabilities == null) {
                                an.d("TEAudioHwEncoder", mediaCodecInfo.getName() + " null audio capabilities");
                            } else if (!audioCapabilities.isSampleRateSupported(this.curSampleRate)) {
                                an.d("TEAudioHwEncoder", mediaCodecInfo.getName() + " not support SampleRate: " + this.curSampleRate);
                            } else if (this.curChannelCount <= audioCapabilities.getMaxInputChannelCount()) {
                                return mediaCodecInfo;
                            } else {
                                an.d("TEAudioHwEncoder", mediaCodecInfo.getName() + " not support ChannelCount: " + this.curChannelCount + ", max channel count is " + audioCapabilities.getMaxInputChannelCount());
                            }
                        } else {
                            i2++;
                        }
                    }
                }
            }
        } else {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i3 = 0; i3 < codecCount; i3++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i3);
                if (codecInfoAt.isEncoder() && codecInfoAt.getName().contains("OMX.google") && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    for (String str : supportedTypes) {
                        if (str.equalsIgnoreCase(this.curMimeType)) {
                            return codecInfoAt;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    private void addAudioData(byte[] bArr) {
        a aVar = new a((byte) 0);
        aVar.f61105a = bArr;
        aVar.f61106b = this.outputBufferInfo.presentationTimeUs;
        aVar.f61107c = this.outputBufferInfo.flags;
        this.audioQueue.add(aVar);
    }

    private ByteBuffer geOutputBufferByIndex(int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.audioEncoder.getOutputBuffer(i2);
        }
        return this.audioEncoder.getOutputBuffers()[i2];
    }

    private ByteBuffer getInputBufferByIndex(int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.audioEncoder.getInputBuffer(i2);
        }
        return this.audioEncoder.getInputBuffers()[i2];
    }

    private int drainOutputBuffer(boolean z) {
        long j2;
        byte[] bArr;
        loop0:
        while (true) {
            int i2 = 0;
            while (true) {
                try {
                    if (this.outputEof) {
                        break loop0;
                    }
                    MediaCodec mediaCodec = this.audioEncoder;
                    MediaCodec.BufferInfo bufferInfo = this.outputBufferInfo;
                    if (i2 > 0) {
                        j2 = 10000;
                    } else {
                        j2 = 0;
                    }
                    int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, j2);
                    if (dequeueOutputBuffer < 0) {
                        if (dequeueOutputBuffer != -3) {
                            if (dequeueOutputBuffer != -2) {
                                if (dequeueOutputBuffer != -1) {
                                    an.b("TEAudioHwEncoder", "not available output buffer");
                                    break loop0;
                                }
                                if (z) {
                                    an.b("TEAudioHwEncoder", "dequeue output buffer timeout, try again later");
                                }
                                if (!this.inputEof && (!z || ((bArr = this.outputAsc) != null && bArr.length > 0))) {
                                    break loop0;
                                }
                                i2++;
                                an.a("TEAudioHwEncoder", "inputEof, tryAgainLaterCount: ".concat(String.valueOf(i2)));
                                if (i2 > TRY_AGAIN_LATER_COUNT_LIMIT) {
                                    an.b("TEAudioHwEncoder", "dequeue output buffer timeout, tryAgainLaterCount: ".concat(String.valueOf(i2)));
                                    break loop0;
                                }
                            } else {
                                this.outputFormat = this.audioEncoder.getOutputFormat();
                                an.a("TEAudioHwEncoder", "output buffer format changed: " + this.outputFormat);
                                int integer = this.outputFormat.getInteger("sample-rate");
                                int integer2 = this.outputFormat.getInteger("channel-count");
                                if (!(this.curSampleRate == integer && this.curChannelCount == integer2)) {
                                    an.d("TEAudioHwEncoder", "audio meta info changed, error error error !!!");
                                }
                                ByteBuffer byteBuffer = this.outputFormat.getByteBuffer("csd-0");
                                if (byteBuffer.remaining() > 0) {
                                    byte[] bArr2 = new byte[byteBuffer.remaining()];
                                    byteBuffer.get(bArr2);
                                    this.outputAsc = bArr2;
                                }
                            }
                        } else {
                            an.a("TEAudioHwEncoder", "output buffer changed, need to getOutputBuffers again");
                            break;
                        }
                    } else {
                        if (this.outputBufferInfo.size > 0) {
                            ByteBuffer geOutputBufferByIndex = geOutputBufferByIndex(dequeueOutputBuffer);
                            geOutputBufferByIndex.position(this.outputBufferInfo.offset);
                            geOutputBufferByIndex.limit(this.outputBufferInfo.offset + this.outputBufferInfo.size);
                            byte[] bArr3 = new byte[this.outputBufferInfo.size];
                            geOutputBufferByIndex.get(bArr3);
                            if ((this.outputBufferInfo.flags & 2) != 0) {
                                this.outputAsc = bArr3;
                                an.a("TEAudioHwEncoder", "output BUFFER_FLAG_CODEC_CONFIG, asc size: " + this.outputBufferInfo.size + ", pts: " + this.outputBufferInfo.presentationTimeUs);
                            } else {
                                if (this.outputCountDequeued > 0 && this.outputBufferInfo.presentationTimeUs <= 0) {
                                    an.d("TEAudioHwEncoder", "outputCountDequeued: " + this.outputCountDequeued + ", size: " + this.outputBufferInfo.size + ", pts: " + this.outputBufferInfo.presentationTimeUs);
                                }
                                addAudioData(bArr3);
                                this.outputCountDequeued++;
                            }
                        }
                        this.audioEncoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                        if ((this.outputBufferInfo.flags & 4) != 0) {
                            an.a("TEAudioHwEncoder", "output buffer eof");
                            this.outputEof = true;
                            break;
                        }
                    }
                } catch (Throwable th) {
                    an.d("TEAudioHwEncoder", "drainOutputBuffer error: " + th.getMessage());
                    return -60010;
                }
            }
        }
        return 0;
    }

    private void addPcmData(byte[] bArr, long j2) {
        b bVar = new b((byte) 0);
        bVar.f61108a = bArr;
        bVar.f61109b = j2;
        this.remainingPcmQueue.add(bVar);
    }

    /* access modifiers changed from: package-private */
    public int encodeFrame(byte[] bArr, long j2) {
        b poll;
        int i2 = -50010;
        if (az.f151043g == az.a.AUDIO_ENC_ENCODING_FALLBACK.getValue()) {
            an.d("TEAudioHwEncoder", "TESTING! HW AUDIO ENC ENCODING FALLBACK");
            return -50010;
        }
        try {
            if (!this.inputEof) {
                addPcmData(bArr, j2);
            }
            int i3 = 0;
            while (true) {
                if (this.inputEof || this.remainingPcmQueue.isEmpty() || (poll = this.remainingPcmQueue.poll()) == null) {
                    break;
                }
                int dequeueInputBuffer = this.audioEncoder.dequeueInputBuffer(INPUT_DEQUEUE_TIMEOUT_US);
                if (dequeueInputBuffer < 0) {
                    if (dequeueInputBuffer != -1) {
                        an.b("TEAudioHwEncoder", "not available input buffer");
                        break;
                    }
                    an.b("TEAudioHwEncoder", "dequeue input buffer timeout, try again later");
                    i3++;
                    if (i3 > TRY_AGAIN_LATER_COUNT_LIMIT) {
                        an.b("TEAudioHwEncoder", "dequeue input buffer timeout, tryAgainLaterCount: ".concat(String.valueOf(i3)));
                        break;
                    }
                } else if (poll.f61108a == null || poll.f61108a.length <= 0) {
                    this.audioEncoder.queueInputBuffer(dequeueInputBuffer, 0, 0, poll.f61109b, 4);
                    this.inputEof = true;
                    an.a("TEAudioHwEncoder", "input buffer eof, remainingPcmQueue size: " + this.remainingPcmQueue.size());
                } else {
                    int length = poll.f61108a.length;
                    ByteBuffer inputBufferByIndex = getInputBufferByIndex(dequeueInputBuffer);
                    inputBufferByIndex.clear();
                    int remaining = inputBufferByIndex.remaining();
                    if (length > remaining) {
                        an.d("TEAudioHwEncoder", "input buffer not enough, audio data size: " + length + ", buffer available size: " + remaining);
                    } else if (remaining != this.recordInputBufferSize) {
                        an.a("TEAudioHwEncoder", "recordInputBufferSize changed, old: " + this.recordInputBufferSize + ", new: " + remaining);
                        this.recordInputBufferSize = remaining;
                    }
                    int min = Math.min(length, remaining);
                    inputBufferByIndex.put(poll.f61108a, 0, min);
                    this.audioEncoder.queueInputBuffer(dequeueInputBuffer, 0, min, poll.f61109b, 0);
                    this.inputCountDequeued++;
                }
            }
            i2 = drainOutputBuffer(false);
            if (i2 < 0) {
                return i2;
            }
            if (!this.audioQueue.isEmpty() || !this.outputEof) {
                a poll2 = this.audioQueue.poll();
                this.theOldestAudioData = poll2;
                if (poll2 != null) {
                    return poll2.f61105a.length;
                }
                return 0;
            }
            an.a("TEAudioHwEncoder", "encoder all EOF");
            return -1024;
        } catch (Throwable th) {
            an.d("TEAudioHwEncoder", "drainOutputBuffer error: " + th.getMessage());
        }
    }

    private int initEncoder(String str, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        boolean z;
        int i8;
        int i9;
        int i10;
        if (az.f151043g == az.a.AUDIO_ENC_INIT_FALLBACK.getValue()) {
            an.d("TEAudioHwEncoder", "TESTING! HW AUDIO ENC INIT FALLBACK");
            return -203;
        } else if (TextUtils.isEmpty(str) || i2 <= 0 || i3 <= 0 || i4 <= 0 || i5 <= 0 || i6 <= 0) {
            an.d("TEAudioHwEncoder", "initEncoder invalid param, mimeType: " + str + ", profile: " + i2 + ", sampleRate: " + i3 + ", channelCount: " + i4 + ", bitrate: " + i5 + ", sampleNumPerChannel: " + i6);
            h.a(1, "te_composition_audio_create_hw_encoder", 2L);
            return -101;
        } else {
            if (i2 == 2) {
                i7 = 5;
            } else {
                i7 = 2;
            }
            if (str.equals(this.curMimeType) && this.curCodecInfoAACProfile == i7 && this.curSampleRate == i3 && this.curChannelCount == i4 && this.curSampleNumPerChannel == i6) {
                z = false;
            } else {
                z = true;
            }
            this.curMimeType = str;
            this.curCodecInfoAACProfile = i7;
            this.curSampleRate = i3;
            this.curChannelCount = i4;
            this.curBitrate = i5;
            this.curSampleNumPerChannel = i6;
            an.a("TEAudioHwEncoder", "initEncoder, mimeType: " + str + ", codecInfoAACProfile: " + i7 + ", sampleRate: " + i3 + ", channelCount: " + i4 + ", bitrate: " + i5 + ", sampleNumPerChannel: " + i6);
            if (z || !this.encoderStarted) {
                MediaFormat createAudioFormat = MediaFormat.createAudioFormat(str, i3, i4);
                this.inputFormat = createAudioFormat;
                createAudioFormat.setInteger("bitrate", i5);
                this.inputFormat.setInteger("aac-profile", 2);
                int i11 = this.curChannelCount * i6 * 2 * 2;
                this.inputFormat.setInteger("max-input-size", i11);
                an.a("TEAudioHwEncoder", "KEY_MAX_INPUT_SIZE: ".concat(String.valueOf(i11)));
                i8 = restartEncoder();
                if (i8 != 0) {
                    i9 = 1;
                    i10 = 1;
                    h.a(i9, "te_composition_audio_create_hw_encoder", (long) i10);
                    an.a("TEAudioHwEncoder", "initEncoder, result: " + i8 + ", monitor: " + i10);
                    return i8;
                }
            }
            an.a("TEAudioHwEncoder", "initEncoder, try to get asc start");
            i9 = 1;
            i8 = drainOutputBuffer(true);
            an.a("TEAudioHwEncoder", "initEncoder, try to get asc end");
            if (i8 == 0) {
                i10 = 0;
            } else {
                i10 = 3;
            }
            h.a(i9, "te_composition_audio_create_hw_encoder", (long) i10);
            an.a("TEAudioHwEncoder", "initEncoder, result: " + i8 + ", monitor: " + i10);
            return i8;
        }
    }
}

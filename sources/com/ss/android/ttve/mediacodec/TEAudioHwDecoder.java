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
import com.ss.android.vesdk.an;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;

public class TEAudioHwDecoder {
    private static long INPUT_DEQUEUE_TIMEOUT_US = 10000;
    private MediaCodec audioDecoder;
    private byte[] curAsc;
    private int curChannelCount = -1;
    private String curMimeType;
    private int curSampleRate = -1;
    private volatile boolean decoderStarted;
    private volatile long inputCountQueued;
    private volatile boolean inputEof;
    private MediaFormat inputFormat;
    private MediaCodec.BufferInfo outputBufferInfo = new MediaCodec.BufferInfo();
    private volatile long outputCountDequeued;
    private volatile boolean outputEof;
    private MediaFormat outputFormat;
    private LinkedBlockingQueue<a> pcmQueue = new LinkedBlockingQueue<>();
    private a theOldestPcmData;

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f61102a;

        /* renamed from: b  reason: collision with root package name */
        public long f61103b;

        /* renamed from: c  reason: collision with root package name */
        public int f61104c;

        static {
            Covode.recordClassIndex(37627);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    private int restartDecoder() {
        releaseDecoder();
        return startDecoder();
    }

    static {
        Covode.recordClassIndex(37626);
    }

    private byte[] getPcmData() {
        a aVar = this.theOldestPcmData;
        if (aVar != null) {
            return aVar.f61102a;
        }
        return null;
    }

    private long getPcmPts() {
        a aVar = this.theOldestPcmData;
        if (aVar != null) {
            return aVar.f61103b;
        }
        return -1;
    }

    private void resetCodecInfo() {
        this.inputCountQueued = 0;
        this.outputCountDequeued = 0;
        this.inputEof = false;
        this.outputEof = false;
    }

    private TEAudioHwDecoder() {
    }

    private int closeDecoder() {
        an.a("TEAudioHwDecoder", "closeDecoder, " + hashCode());
        releaseDecoder();
        this.curMimeType = null;
        this.curSampleRate = -1;
        this.curChannelCount = -1;
        this.curAsc = null;
        return 0;
    }

    private void releaseDecoder() {
        if (this.audioDecoder != null) {
            if (this.decoderStarted) {
                try {
                    this.audioDecoder.stop();
                } catch (Exception e2) {
                    an.d("TEAudioHwDecoder", "MediaCodec stop exception: " + e2.getMessage());
                }
                this.decoderStarted = false;
            }
            this.audioDecoder.release();
            this.audioDecoder = null;
            resetCodecInfo();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037 A[SYNTHETIC, Splitter:B:11:0x0037] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.media.MediaCodec selectMediaCodec() {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEAudioHwDecoder.selectMediaCodec():android.media.MediaCodec");
    }

    private int startDecoder() {
        try {
            MediaCodec selectMediaCodec = selectMediaCodec();
            this.audioDecoder = selectMediaCodec;
            if (selectMediaCodec == null) {
                an.d("TEAudioHwDecoder", "create decoder failure, mime: " + this.curMimeType);
                return -201;
            }
            selectMediaCodec.configure(this.inputFormat, (Surface) null, (MediaCrypto) null, 0);
            this.audioDecoder.start();
            this.decoderStarted = true;
            return 0;
        } catch (Exception e2) {
            an.d("TEAudioHwDecoder", "startDecoder: " + e2.getMessage());
            return -203;
        }
    }

    private int drainOutputBuffer() {
        while (true) {
            try {
                if (this.outputEof) {
                    break;
                }
                int dequeueOutputBuffer = this.audioDecoder.dequeueOutputBuffer(this.outputBufferInfo, 0);
                if (dequeueOutputBuffer >= 0) {
                    if (this.outputBufferInfo.size > 0) {
                        ByteBuffer geOutputBufferByIndex = geOutputBufferByIndex(dequeueOutputBuffer);
                        geOutputBufferByIndex.position(this.outputBufferInfo.offset);
                        geOutputBufferByIndex.limit(this.outputBufferInfo.offset + this.outputBufferInfo.size);
                        byte[] bArr = new byte[this.outputBufferInfo.size];
                        geOutputBufferByIndex.get(bArr);
                        addPcmData(bArr);
                        this.outputCountDequeued++;
                    }
                    this.audioDecoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if ((this.outputBufferInfo.flags & 4) != 0) {
                        an.a("TEAudioHwDecoder", "output buffer eof");
                        this.outputEof = true;
                        break;
                    }
                } else if (dequeueOutputBuffer == -3) {
                    an.a("TEAudioHwDecoder", "output buffer changed, need to getOutputBuffers again");
                } else if (dequeueOutputBuffer == -2) {
                    this.outputFormat = this.audioDecoder.getOutputFormat();
                    an.a("TEAudioHwDecoder", "output buffer format changed: " + this.outputFormat);
                    int integer = this.outputFormat.getInteger("sample-rate");
                    int integer2 = this.outputFormat.getInteger("channel-count");
                    if (this.curSampleRate != integer || this.curChannelCount != integer2) {
                        an.d("TEAudioHwDecoder", "audio meta info changed, error error error !!!");
                    }
                } else if (dequeueOutputBuffer != -1) {
                    an.b("TEAudioHwDecoder", "not available output buffer");
                }
            } catch (Throwable th) {
                an.d("TEAudioHwDecoder", "drainOutputBuffer error: " + th.getMessage());
                return -6000;
            }
        }
        return 0;
    }

    /* JADX INFO: finally extract failed */
    private int flushDecoder() {
        an.a("TEAudioHwDecoder", "flushDecoder, inputEof: " + this.inputEof + ", outputEof: " + this.outputEof + ", inputCountQueued: " + this.inputCountQueued + ", " + hashCode());
        if (this.audioDecoder == null) {
            return -204;
        }
        try {
            if (this.inputEof || this.outputEof) {
                int restartDecoder = restartDecoder();
                this.pcmQueue.clear();
                this.theOldestPcmData = null;
                return restartDecoder;
            }
            if (this.inputCountQueued > 0) {
                this.audioDecoder.flush();
                this.inputCountQueued = 0;
                this.outputCountDequeued = 0;
            }
            this.pcmQueue.clear();
            this.theOldestPcmData = null;
            return 0;
        } catch (Throwable th) {
            this.pcmQueue.clear();
            this.theOldestPcmData = null;
            throw th;
        }
    }

    private MediaCodecInfo getGoogleMediaCodecInfo() {
        if (TextUtils.isEmpty(this.curMimeType)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                if (!mediaCodecInfo.isEncoder() && mediaCodecInfo.getName().contains("OMX.google")) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            continue;
                            break;
                        } else if (supportedTypes[i2].equalsIgnoreCase(this.curMimeType)) {
                            MediaCodecInfo.AudioCapabilities audioCapabilities = mediaCodecInfo.getCapabilitiesForType(this.curMimeType).getAudioCapabilities();
                            if (!audioCapabilities.isSampleRateSupported(this.curSampleRate)) {
                                an.d("TEAudioHwDecoder", mediaCodecInfo.getName() + " not support SampleRate: " + this.curSampleRate);
                            } else if (this.curChannelCount <= audioCapabilities.getMaxInputChannelCount()) {
                                return mediaCodecInfo;
                            } else {
                                an.d("TEAudioHwDecoder", mediaCodecInfo.getName() + " not support ChannelCount: " + this.curChannelCount + ", max channel count is " + audioCapabilities.getMaxInputChannelCount());
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
                if (!codecInfoAt.isEncoder() && codecInfoAt.getName().contains("OMX.google")) {
                    for (String str : codecInfoAt.getSupportedTypes()) {
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

    private void addPcmData(byte[] bArr) {
        a aVar = new a((byte) 0);
        aVar.f61102a = bArr;
        aVar.f61103b = this.outputBufferInfo.presentationTimeUs;
        aVar.f61104c = this.outputBufferInfo.flags;
        this.pcmQueue.add(aVar);
    }

    private ByteBuffer geOutputBufferByIndex(int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.audioDecoder.getOutputBuffer(i2);
        }
        return this.audioDecoder.getOutputBuffers()[i2];
    }

    private ByteBuffer getInputBufferByIndex(int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.audioDecoder.getInputBuffer(i2);
        }
        return this.audioDecoder.getInputBuffers()[i2];
    }

    private boolean sameAsc(byte[] bArr) {
        byte[] bArr2 = this.curAsc;
        if (bArr2 == null && bArr == null) {
            return true;
        }
        if (bArr2 == null || bArr == null || bArr2.length != bArr.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr3 = this.curAsc;
            if (i2 >= bArr3.length) {
                return true;
            }
            if (bArr3[i2] != bArr[i2]) {
                return false;
            }
            i2++;
        }
    }

    private int[] decodeFrame(byte[] bArr, long j2) {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        if (bArr == null || bArr.length <= 0) {
            i3 = 0;
            i2 = 0;
            z = true;
        } else {
            i3 = bArr.length;
            i2 = 0;
            z = false;
        }
        while (true) {
            try {
                if (this.inputEof || (i2 >= i3 && !z)) {
                    break;
                }
                int dequeueInputBuffer = this.audioDecoder.dequeueInputBuffer(INPUT_DEQUEUE_TIMEOUT_US);
                if (dequeueInputBuffer >= 0) {
                    if (z) {
                        this.audioDecoder.queueInputBuffer(dequeueInputBuffer, 0, 0, j2, 4);
                        this.inputEof = true;
                        an.a("TEAudioHwDecoder", "input buffer eof");
                        break;
                    }
                    ByteBuffer inputBufferByIndex = getInputBufferByIndex(dequeueInputBuffer);
                    inputBufferByIndex.clear();
                    int min = Math.min(i3 - i2, inputBufferByIndex.remaining());
                    inputBufferByIndex.put(bArr, i2, min);
                    i2 += min;
                    this.audioDecoder.queueInputBuffer(dequeueInputBuffer, 0, min, j2, 0);
                    this.inputCountQueued++;
                } else if (dequeueInputBuffer == -1) {
                    an.b("TEAudioHwDecoder", "dequeue input buffer timeout, try again later");
                } else {
                    an.b("TEAudioHwDecoder", "not available input buffer");
                }
            } catch (Throwable th) {
                an.d("TEAudioHwDecoder", "drainOutputBuffer error: " + th.getMessage());
                i4 = -5000;
            }
        }
        i4 = drainOutputBuffer();
        a poll = this.pcmQueue.poll();
        this.theOldestPcmData = poll;
        if (poll != null) {
            i5 = poll.f61102a.length;
        } else {
            i5 = 0;
        }
        return new int[]{i4, i2, i5};
    }

    private int initDecoder(String str, int i2, int i3, byte[] bArr) {
        boolean z;
        int i4;
        if (TextUtils.isEmpty(str) || i2 <= 0 || i3 <= 0) {
            return -101;
        }
        if (!str.equals(this.curMimeType) || this.curSampleRate != i2 || this.curChannelCount != i3 || !sameAsc(bArr)) {
            z = true;
        } else {
            z = false;
        }
        this.curMimeType = str;
        this.curSampleRate = i2;
        this.curChannelCount = i3;
        this.curAsc = bArr;
        StringBuilder append = new StringBuilder("initDecoder, mimeType: ").append(str).append(", sampleRate: ").append(i2).append(", channelCount: ").append(i3).append(", asc size: ");
        if (bArr != null) {
            i4 = bArr.length;
        } else {
            i4 = -1;
        }
        an.a("TEAudioHwDecoder", append.append(i4).append(", this: ").append(hashCode()).toString());
        if (!z && this.decoderStarted) {
            return 0;
        }
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(str, i2, i3);
        this.inputFormat = createAudioFormat;
        if (bArr == null || bArr.length <= 0) {
            createAudioFormat.setInteger("is-adts", 1);
        } else {
            createAudioFormat.setByteBuffer("csd-0", ByteBuffer.wrap(bArr));
        }
        if (Build.VERSION.SDK_INT == 16) {
            this.inputFormat.setInteger("max-input-size", 0);
        }
        return restartDecoder();
    }
}

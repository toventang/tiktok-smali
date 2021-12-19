package com.ss.android.vesdk.audio;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioRecord;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.audio.a;
import com.ss.android.ttve.model.f;
import com.ss.android.ttve.monitor.h;
import com.ss.android.vesdk.VESensService;
import com.ss.android.vesdk.aj;
import com.ss.android.vesdk.an;
import com.ss.android.vesdk.c;
import com.ss.android.vesdk.m;
import com.ss.android.vesdk.runtime.VERuntime;
import java.nio.ByteBuffer;

public class TEAudioRecord implements b {
    private static final int[] SUGGEST_CHANNEL_ARRAY = {2, 1, 0};
    private static final int[] SUGGEST_SAMPLERATE_ARRAY = {44100, 8000, 11025, 16000, 22050};
    private static final String TAG = TEAudioRecord.class.getSimpleName();
    private int hasInited = -1;
    public d mAudioCallback;
    public m mAudioCaptureSettings;
    public AudioRecord mAudioRecord;
    private long mAudioRecordStartTime;
    private long mAudioRecordStopTime;
    private int mAudioSource = 1;
    private int mBitsPerSample = 16;
    public int mBufferSizeInBytes;
    public ByteBuffer mByteBuffer;
    private int mChannels = 2;
    public Handler mHandler;
    public double mSampleNanoTimePerSecond;
    private int mSampleRate = 44100;
    public int mSampleSize;
    public f mTimestampStrategy;

    private int getSysAudioFormat(int i2) {
        if (i2 != 8) {
            return i2 != 16 ? 1 : 2;
        }
        return 3;
    }

    private int getSysAudioSource(int i2) {
        int i3 = 1;
        if (i2 != 1) {
            i3 = 5;
            if (i2 != 5) {
                i3 = 6;
                if (i2 != 6) {
                    return 0;
                }
            }
        }
        return i3;
    }

    private int getSysChannelConfig(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? 1 : 12;
        }
        return 16;
    }

    public void setAudioDevice(i iVar) {
    }

    public int getBufferSize() {
        return this.mBufferSizeInBytes;
    }

    public int getChannels() {
        return this.mChannels;
    }

    public ByteBuffer getPcmBuffer() {
        return this.mByteBuffer;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public int getRecordingState() {
        return this.mAudioRecord.getRecordingState();
    }

    public int getState() {
        return this.mAudioRecord.getState();
    }

    public void release() {
        release(null);
    }

    public int start() {
        return start(null);
    }

    public int stop() {
        return stop(null);
    }

    public int init() {
        return init(this.mAudioSource, this.mSampleRate, this.mChannels, this.mBitsPerSample);
    }

    public TEAudioRecord() {
    }

    /* access modifiers changed from: protected */
    public void openPrivacy() {
        VESensService.getInstance().setSensCheckObjStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.b.PRIVACY_STATUS_USING);
    }

    /* access modifiers changed from: protected */
    public void releasePrivacy() {
        VESensService.getInstance().setSensCheckObjStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.b.PRIVACY_STATUS_RELEASE);
    }

    static {
        Covode.recordClassIndex(99287);
    }

    public int read() {
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord == null) {
            return -108;
        }
        if (audioRecord.getRecordingState() != 3) {
            return -105;
        }
        try {
            int read = this.mAudioRecord.read(this.mByteBuffer, this.mBufferSizeInBytes);
            if (read > 0 && this.mAudioRecordStartTime != 0) {
                h.a(0, "te_record_audio_first_frame", System.currentTimeMillis() - this.mAudioRecordStartTime);
                this.mAudioRecordStartTime = 0;
            }
            return read;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.ss.android.vesdk.audio.b
    public void setAudioCallback(d dVar) {
        this.mAudioCallback = dVar;
    }

    @Override // com.ss.android.vesdk.audio.b
    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    public int init(int i2) {
        this.mAudioSource = i2;
        return init(i2, this.mSampleRate, this.mChannels, this.mBitsPerSample);
    }

    @Override // com.ss.android.vesdk.audio.a
    public void release(PrivacyCert privacyCert) {
        if (this.mAudioRecord != null) {
            long currentTimeMillis = System.currentTimeMillis();
            c.c(privacyCert, this.mAudioRecord);
            this.hasInited = -1;
            h.a(0, "te_record_audio_release_record_time", System.currentTimeMillis() - currentTimeMillis);
        }
    }

    public TEAudioRecord(f fVar) {
        this.mTimestampStrategy = fVar;
    }

    public int read(byte[] bArr) {
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord == null) {
            return -108;
        }
        if (audioRecord.getRecordingState() != 3) {
            return -105;
        }
        try {
            int read = this.mAudioRecord.read(bArr, 0, this.mBufferSizeInBytes);
            if (read > 0 && this.mAudioRecordStartTime != 0) {
                h.a(0, "te_record_audio_first_frame", System.currentTimeMillis() - this.mAudioRecordStartTime);
                this.mAudioRecordStartTime = 0;
            }
            return read;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.ss.android.vesdk.audio.a
    public int stop(PrivacyCert privacyCert) {
        this.mAudioRecordStartTime = 0;
        this.mAudioRecordStopTime = System.currentTimeMillis();
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord == null) {
            return -108;
        }
        if (audioRecord.getState() != 1) {
            return -105;
        }
        try {
            c.b(privacyCert, this.mAudioRecord);
            an.a(TAG, "stop hashCode:" + this.mAudioRecord.hashCode());
            releasePrivacy();
        } catch (Exception e2) {
            an.d(TAG, Log.getStackTraceString(e2));
        }
        h.a(0, "te_record_audio_stop_record_time", System.currentTimeMillis() - this.mAudioRecordStopTime);
        return 0;
    }

    @Override // com.ss.android.vesdk.audio.a
    public int init(m mVar) {
        this.mAudioCaptureSettings = mVar;
        int init = init(mVar.f151354d, mVar.f151352b, mVar.f151351a, mVar.f151353c);
        if (!(this.mAudioCallback == null || this.mAudioCaptureSettings == null)) {
            m.a aVar = new m.a(this.mAudioCaptureSettings);
            aVar.f151360a.f151352b = this.mSampleRate;
            aVar.f151360a.f151351a = this.mChannels;
            aVar.f151360a.f151353c = this.mBitsPerSample;
            this.mAudioCallback.a(aj.M, 0, 0.0d, this.mAudioCaptureSettings);
        }
        h.a(0, "te_record_audio_mic_type", 1L);
        h.a(0, "te_record_audio_mic_sample_rate", (long) this.mSampleRate);
        int i2 = this.mBufferSizeInBytes;
        int i3 = this.mChannels;
        if (i3 == 0) {
            i3 = 1;
        }
        h.a(0, "te_record_audio_mic_frame_per_buffer", (long) ((i2 / i3) / 2));
        return init;
    }

    @Override // com.ss.android.vesdk.audio.a
    public int start(PrivacyCert privacyCert) {
        this.mAudioRecordStartTime = System.currentTimeMillis();
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord == null) {
            return -108;
        }
        if (audioRecord.getState() != 1) {
            return -105;
        }
        if (this.mAudioRecord.getRecordingState() == 3) {
            return -2;
        }
        try {
            c.a(privacyCert, this.mAudioRecord);
            an.a(TAG, "start hashCode:" + this.mAudioRecord.hashCode());
            openPrivacy();
            f fVar = this.mTimestampStrategy;
            if (fVar != null) {
                fVar.f150982b = 0;
                Context context = VERuntime.a.INSTANCE.veRuntime.f151396a;
                if (context == null) {
                    an.d(f.f150981a, "context null");
                } else {
                    PackageManager packageManager = context.getPackageManager();
                    if (packageManager == null) {
                        an.d(f.f150981a, "pm null");
                    } else if (packageManager.hasSystemFeature("android.hardware.audio.pro")) {
                        fVar.f150983c = 0;
                    }
                }
            }
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() {
                    /* class com.ss.android.vesdk.audio.TEAudioRecord.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(99288);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void run() {
                        /*
                        // Method dump skipped, instructions count: 359
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.audio.TEAudioRecord.AnonymousClass1.run():void");
                    }
                });
            }
            h.a(0, "te_record_audio_start_record_time", System.currentTimeMillis() - this.mAudioRecordStartTime);
            return 0;
        } catch (Exception e2) {
            an.d(TAG, Log.getStackTraceString(e2));
            release(null);
            return -603;
        }
    }

    public int init(int i2, int i3, int i4) {
        return init(this.mAudioSource, i2, i3, i4);
    }

    public int init(int i2, int i3, int i4, int i5) {
        String str = TAG;
        an.a(str, "init audioSource: " + i2 + ", sampleRate: " + i3 + ", channels: " + i4 + ", bitsPerSample: " + i5);
        if (this.hasInited == 0) {
            an.a(str, "has inited");
            return 0;
        }
        int initAudioRecord = initAudioRecord(i2, i3, i4, i5);
        if (initAudioRecord == 0) {
            this.hasInited = 0;
            return 0;
        }
        release(null);
        int[] iArr = SUGGEST_SAMPLERATE_ARRAY;
        for (int i6 : iArr) {
            for (int i7 : SUGGEST_CHANNEL_ARRAY) {
                initAudioRecord = initAudioRecord(i2, i6, i7, i5);
                if (initAudioRecord == 0) {
                    return 0;
                }
                release(null);
            }
        }
        this.hasInited = initAudioRecord;
        return initAudioRecord;
    }

    private int initAudioRecord(int i2, int i3, int i4, int i5) {
        int sysAudioSource = getSysAudioSource(i2);
        int sysChannelConfig = getSysChannelConfig(i4);
        int sysAudioFormat = getSysAudioFormat(i5);
        int minBufferSize = AudioRecord.getMinBufferSize(i3, sysChannelConfig, sysAudioFormat);
        try {
            AudioRecord audioRecord = new AudioRecord(sysAudioSource, i3, sysChannelConfig, sysAudioFormat, minBufferSize);
            this.mAudioRecord = audioRecord;
            if (audioRecord.getState() == 1) {
                m mVar = this.mAudioCaptureSettings;
                if (mVar != null && mVar.f151359i && Build.VERSION.SDK_INT >= 23 && a.a() == f.BLUETOOTH) {
                    this.mAudioRecord.setPreferredDevice(a.b());
                }
                this.mSampleRate = i3;
                this.mChannels = i4;
                this.mBitsPerSample = i5;
                an.a(TAG, "Init audio recorder succeed, apply audio record sample rate " + this.mSampleRate + " channels " + this.mChannels + " buffer " + this.mBufferSizeInBytes + " state " + this.mAudioRecord.getState());
                this.mBufferSizeInBytes = minBufferSize;
                this.mByteBuffer = ByteBuffer.allocateDirect(minBufferSize);
                double d2 = (double) this.mSampleRate;
                Double.isNaN(d2);
                this.mSampleNanoTimePerSecond = 1.0E9d / d2;
                this.mSampleSize = (this.mChannels * this.mBitsPerSample) / 8;
                return 0;
            }
            throw new Exception("Audio record is not initialized![" + this.mSampleRate + "," + this.mChannels + "," + i5);
        } catch (Exception e2) {
            an.d(TAG, Log.getStackTraceString(e2));
            release(null);
            this.mSampleRate = 44100;
            this.mChannels = 2;
            this.mBitsPerSample = 16;
            return -100;
        }
    }
}

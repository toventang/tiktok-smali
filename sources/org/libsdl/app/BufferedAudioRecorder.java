package org.libsdl.app;

import android.media.AudioRecord;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.medialib.a.a;
import com.ss.android.medialib.presenter.e;
import com.ss.android.medialib.presenter.f;
import com.ss.android.ttve.monitor.b;
import com.ss.android.ttve.monitor.h;
import com.ss.android.vesdk.VESensService;
import com.ss.android.vesdk.an;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class BufferedAudioRecorder {
    protected static int channelConfigOffset = -1;
    protected static int[] channelConfigSuggested = {12, 16, 1};
    protected static int sampleRateOffset = -1;
    protected static int[] sampleRateSuggested = {44100, 8000, 11025, 16000, 22050};
    AudioRecord audio;
    final int audioFormat;
    private f audioMonitor;
    int audioSource;
    int bufferSizeInBytes;
    int channelConfig;
    private final int encodeBitRate;
    private final int encodeChannels;
    private final int encodeSampleRate;
    boolean isRecording;
    boolean isStopPCMCallback;
    boolean isStopped;
    public long mAudioRecordStartTime;
    public boolean mEnableMicBgmDelayOpt;
    private int mMicRestartCount;
    private ConcurrentHashMap mMicStartInfoMap;
    private int mMicState;
    a mProcessThread;
    private RecordingState mRecordingState;
    private e.b mStateCallback;
    AudioRecorderInterfaceExt presenter;
    int sampleRateInHz;

    private static void org_libsdl_app_BufferedAudioRecorder_android_media_AudioRecord_release(AudioRecord audioRecord) {
        if (!((Boolean) com.bytedance.helios.sdk.a.a(audioRecord, new Object[0], 100403, "void", false, null).first).booleanValue()) {
            com.bytedance.helios.sdk.a.a(null, audioRecord, new Object[0], 100405, "org_libsdl_app_BufferedAudioRecorder_android_media_AudioRecord_release(Landroid/media/AudioRecord;)V");
            audioRecord.release();
            com.bytedance.helios.sdk.a.a(null, audioRecord, new Object[0], 100403, "org_libsdl_app_BufferedAudioRecorder_android_media_AudioRecord_release(Landroid/media/AudioRecord;)V");
        }
    }

    private static void org_libsdl_app_BufferedAudioRecorder_android_media_AudioRecord_startRecording(AudioRecord audioRecord) {
        if (!((Boolean) com.bytedance.helios.sdk.a.a(audioRecord, new Object[0], 100400, "void", false, null).first).booleanValue()) {
            audioRecord.startRecording();
            com.bytedance.helios.sdk.a.a(null, audioRecord, new Object[0], 100400, "org_libsdl_app_BufferedAudioRecorder_android_media_AudioRecord_startRecording(Landroid/media/AudioRecord;)V");
        }
    }

    private static void org_libsdl_app_BufferedAudioRecorder_android_media_AudioRecord_stop(AudioRecord audioRecord) {
        if (!((Boolean) com.bytedance.helios.sdk.a.a(audioRecord, new Object[0], 100401, "void", false, null).first).booleanValue()) {
            com.bytedance.helios.sdk.a.a(null, audioRecord, new Object[0], 100404, "org_libsdl_app_BufferedAudioRecorder_android_media_AudioRecord_stop(Landroid/media/AudioRecord;)V");
            audioRecord.stop();
            com.bytedance.helios.sdk.a.a(null, audioRecord, new Object[0], 100401, "org_libsdl_app_BufferedAudioRecorder_android_media_AudioRecord_stop(Landroid/media/AudioRecord;)V");
        }
    }

    public static int org_libsdl_app_BufferedAudioRecorder_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public int getChannelCount(int i2) {
        return 16 == i2 ? 1 : 2;
    }

    public synchronized int getMicState() {
        int i2;
        MethodCollector.i(4985);
        i2 = this.mMicState;
        MethodCollector.o(4985);
        return i2;
    }

    public synchronized boolean isProcessing() {
        MethodCollector.i(5303);
        a aVar = this.mProcessThread;
        if (aVar == null || !aVar.a()) {
            MethodCollector.o(5303);
            return false;
        }
        MethodCollector.o(5303);
        return true;
    }

    public synchronized boolean isStopTimeout() {
        MethodCollector.i(5304);
        a aVar = this.mProcessThread;
        if (aVar == null || !aVar.b()) {
            MethodCollector.o(5304);
            return false;
        }
        MethodCollector.o(5304);
        return true;
    }

    public void markRecordStop() {
        MethodCollector.i(5260);
        synchronized (this) {
            try {
                this.isStopped = true;
            } finally {
                MethodCollector.o(5260);
            }
        }
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
        Covode.recordClassIndex(106498);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
        r2.f59675i = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void discard() {
        /*
            r4 = this;
            r3 = 5063(0x13c7, float:7.095E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
            com.ss.android.medialib.a.a r2 = r4.mProcessThread
            if (r2 == 0) goto L_0x001f
            java.lang.Object r1 = r2.f59668b
            monitor-enter(r1)
            boolean r0 = r2.f59669c     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x001b
            monitor-exit(r1)     // Catch:{ all -> 0x0015 }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x0015:
            r0 = move-exception
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        L_0x001b:
            monitor-exit(r1)
            r0 = 1
            r2.f59675i = r0
        L_0x001f:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.libsdl.app.BufferedAudioRecorder.discard():void");
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        AudioRecord audioRecord = this.audio;
        if (audioRecord != null) {
            try {
                if (audioRecord.getState() != 0) {
                    b.a("vesdk_event_will_stop_mic", buildInfoJSONObject("finalize will stop mic", String.valueOf(System.currentTimeMillis()), ""), "behavior");
                    org_libsdl_app_BufferedAudioRecorder_android_media_AudioRecord_stop(this.audio);
                    b.a("vesdk_event_did_stop_mic", buildInfoJSONObject("finalize did stop mic", "", String.valueOf(System.currentTimeMillis())), "behavior");
                    releasePrivacy();
                    this.mMicState = 3;
                }
                org_libsdl_app_BufferedAudioRecorder_android_media_AudioRecord_release(this.audio);
            } catch (Exception unused) {
            }
            this.audio = null;
            this.mMicState = 0;
        }
        super.finalize();
    }

    public boolean stopFeeding() {
        MethodCollector.i(5302);
        an.a("BufferedAudioRecorder", "stopFeeding() called");
        if (this.isRecording) {
            if (this.audio == null) {
                an.d("BufferedAudioRecorder", "StopFeeding: State anomaly, reset state!");
                this.mRecordingState.setState(false);
                this.isStopped = true;
                a aVar = this.mProcessThread;
                if (aVar != null) {
                    aVar.c();
                }
                MethodCollector.o(5302);
                return false;
            }
            a aVar2 = this.mProcessThread;
            if (aVar2 != null) {
                if (!aVar2.a()) {
                    an.d("BufferedAudioRecorder", "Stop Feeding failed, please start Feeding and then stop Feeding.");
                    MethodCollector.o(5302);
                    return false;
                }
                a aVar3 = this.mProcessThread;
                an.c("AudioDataProcessThread", "stopFeeding");
                synchronized (aVar3.f59668b) {
                    try {
                        if (!aVar3.f59669c) {
                            an.c("AudioDataProcessThread", "startFeeding not ready");
                        } else {
                            aVar3.f59667a.sendMessage(aVar3.f59667a.obtainMessage(1));
                        }
                    } finally {
                        MethodCollector.o(5302);
                    }
                }
                return true;
            }
        }
        an.d("BufferedAudioRecorder", "Stop Feeding failed, call startRecording first!");
        MethodCollector.o(5302);
        return false;
    }

    public void unInit() {
        MethodCollector.i(5049);
        if (this.isRecording) {
            stopRecording();
        }
        synchronized (this) {
            try {
                AudioRecord audioRecord = this.audio;
                if (audioRecord != null) {
                    try {
                        if (!(audioRecord.getState() == 0 || this.audio.getRecordingState() == 1)) {
                            b.a("vesdk_event_will_stop_mic", buildInfoJSONObject("uninit will stop mic", String.valueOf(System.currentTimeMillis()), ""), "behavior");
                            org_libsdl_app_BufferedAudioRecorder_android_media_AudioRecord_stop(this.audio);
                            b.a("vesdk_event_did_stop_mic", buildInfoJSONObject("uninit did stop mic", "", String.valueOf(System.currentTimeMillis())), "behavior");
                            releasePrivacy();
                            this.mMicState = 3;
                        }
                        org_libsdl_app_BufferedAudioRecorder_android_media_AudioRecord_release(this.audio);
                    } catch (Exception e2) {
                        e2.getMessage();
                    }
                    this.audio = null;
                    this.mMicState = 0;
                }
            } catch (Throwable th) {
                MethodCollector.o(5049);
                throw th;
            }
        }
        an.a("BufferedAudioRecorder", "unInit()");
        MethodCollector.o(5049);
    }

    public void waitUtilAudioProcessDone() {
        boolean hasMessages;
        MethodCollector.i(5307);
        a aVar = this.mProcessThread;
        if (aVar != null) {
            long currentTimeMillis = System.currentTimeMillis();
            aVar.f59677k = false;
            synchronized (aVar.f59678l) {
                try {
                    synchronized (aVar.f59668b) {
                        try {
                            hasMessages = aVar.f59667a.hasMessages(1);
                        } finally {
                            MethodCollector.o(5307);
                        }
                    }
                    if (hasMessages || !aVar.f59676j) {
                        try {
                            aVar.f59678l.wait(5000);
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                    }
                } finally {
                    MethodCollector.o(5307);
                }
            }
            if (System.currentTimeMillis() - currentTimeMillis >= 5000) {
                aVar.f59677k = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class AudioRecorderRunnable implements Runnable {
        private double speed;
        boolean startFeeding;

        static {
            Covode.recordClassIndex(106499);
        }

        public void run() {
            MethodCollector.i(4421);
            byte[] bArr = new byte[BufferedAudioRecorder.this.bufferSizeInBytes];
            int i2 = 0;
            boolean z = false;
            while (BufferedAudioRecorder.this.isRecording) {
                if (BufferedAudioRecorder.this.audio != null) {
                    i2 = BufferedAudioRecorder.this.audio.read(bArr, 0, BufferedAudioRecorder.this.bufferSizeInBytes);
                }
                if (-3 == i2) {
                    an.d("BufferedAudioRecorder", "bad audio buffer len ".concat(String.valueOf(i2)));
                } else if (i2 > 0) {
                    if (BufferedAudioRecorder.this.mAudioRecordStartTime != 0) {
                        h.a(0, "te_record_audio_first_frame", System.currentTimeMillis() - BufferedAudioRecorder.this.mAudioRecordStartTime);
                        BufferedAudioRecorder.this.mAudioRecordStartTime = 0;
                    }
                    try {
                        if (BufferedAudioRecorder.this.isRecording && !BufferedAudioRecorder.this.isStopPCMCallback) {
                            BufferedAudioRecorder.this.presenter.addPCMData(bArr, i2, 0);
                        }
                        if (BufferedAudioRecorder.this.mProcessThread.a() && !BufferedAudioRecorder.this.isStopped) {
                            BufferedAudioRecorder.this.mProcessThread.a(bArr, i2);
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    if (!(BufferedAudioRecorder.this.audio == null || BufferedAudioRecorder.this.audio.getRecordingState() == 3 || z)) {
                        z = true;
                        BufferedAudioRecorder.this.presenter.recordStatus(false);
                    }
                    Thread.sleep(50);
                }
            }
            MethodCollector.o(4421);
        }

        public AudioRecorderRunnable(double d2, boolean z) {
            this.speed = d2;
            this.startFeeding = z;
        }
    }

    private synchronized int startMic() {
        MethodCollector.i(5089);
        try {
            AudioRecord audioRecord = this.audio;
            if (audioRecord == null || audioRecord.getState() == 0) {
                MethodCollector.o(5089);
                return -1;
            }
            b.a("vesdk_event_will_start_mic", buildInfoJSONObject("will start mic", String.valueOf(System.currentTimeMillis()), ""), "behavior");
            org_libsdl_app_BufferedAudioRecorder_android_media_AudioRecord_startRecording(this.audio);
            b.a("vesdk_event_did_start_mic", buildInfoJSONObject("did start mic", "", String.valueOf(System.currentTimeMillis())), "behavior");
            openPrivacy();
            this.mMicState = 2;
            AudioRecord audioRecord2 = this.audio;
            if (audioRecord2 == null || audioRecord2.getRecordingState() == 3) {
                MethodCollector.o(5089);
                return 0;
            }
            an.d("BufferedAudioRecorder", "audio starRecording failed! Stop immediately! cur status " + this.audio.getRecordingState());
            unInit();
            this.mMicState = 0;
            MethodCollector.o(5089);
            return -2;
        } catch (Exception e2) {
            try {
                AudioRecord audioRecord3 = this.audio;
                if (audioRecord3 != null) {
                    org_libsdl_app_BufferedAudioRecorder_android_media_AudioRecord_release(audioRecord3);
                }
            } catch (Exception unused) {
            }
            this.audio = null;
            this.mMicState = 0;
            an.d("BufferedAudioRecorder", "audio recording failed!".concat(String.valueOf(e2)));
            MethodCollector.o(5089);
            return -3;
        }
    }

    public boolean stopRecording() {
        MethodCollector.i(5282);
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            try {
                org_libsdl_app_BufferedAudioRecorder_com_ss_android_ugc_aweme_lancet_LogLancet_d("BufferedAudioRecorder", "stopRecording() called");
                if (!this.isRecording) {
                    return false;
                }
                this.mRecordingState.setState(false);
                AudioRecord audioRecord = this.audio;
                if (audioRecord == null) {
                    an.d("BufferedAudioRecorder", "The audio module is not activated but stopRecording is called!");
                } else if (!(audioRecord.getState() == 0 || this.audio.getRecordingState() == 1)) {
                    b.a("vesdk_event_will_stop_mic", buildInfoJSONObject("stopRecording will stop mic", String.valueOf(System.currentTimeMillis()), ""), "behavior");
                    org_libsdl_app_BufferedAudioRecorder_android_media_AudioRecord_stop(this.audio);
                    b.a("vesdk_event_did_stop_mic", buildInfoJSONObject("stopRecording did stop mic", "", String.valueOf(System.currentTimeMillis())), "behavior");
                    releasePrivacy();
                    this.mMicState = 3;
                }
                a aVar = this.mProcessThread;
                if (aVar != null) {
                    aVar.c();
                }
                h.a(0, "te_record_audio_stop_record_time", System.currentTimeMillis() - currentTimeMillis);
                MethodCollector.o(5282);
                return true;
            } finally {
                MethodCollector.o(5282);
            }
        }
    }

    public class RecordingState {
        u<Boolean> mObserver;

        static {
            Covode.recordClassIndex(106500);
        }

        public void attach(u<Boolean> uVar) {
            this.mObserver = uVar;
        }

        public RecordingState() {
        }

        public void setState(boolean z) {
            BufferedAudioRecorder.this.isRecording = z;
            u<Boolean> uVar = this.mObserver;
            if (uVar != null) {
                uVar.onChanged(Boolean.valueOf(BufferedAudioRecorder.this.isRecording));
            }
        }
    }

    public void setAudioRecordStateCallack(e.b bVar) {
        this.mStateCallback = bVar;
    }

    public void attachRecordingObserver(u<Boolean> uVar) {
        this.mRecordingState.attach(uVar);
    }

    public void stopPCMCallback(boolean z) {
        MethodCollector.i(5263);
        synchronized (this) {
            try {
                this.isStopPCMCallback = z;
            } finally {
                MethodCollector.o(5263);
            }
        }
    }

    public boolean startFeeding(double d2) {
        a aVar;
        an.a("BufferedAudioRecorder", "startFeeding() called with: speed = [" + d2 + "]");
        if (!this.isRecording || (aVar = this.mProcessThread) == null) {
            an.c("BufferedAudioRecorder", "Start Feeding recording is not activated, start Recording will be activated first!");
            startRecording(d2, true);
            return true;
        } else if (aVar.a()) {
            an.c("BufferedAudioRecorder", "StartFeeding failed. It's been called once.");
            return false;
        } else {
            this.isStopped = false;
            this.isStopPCMCallback = false;
            this.mProcessThread.a(this.sampleRateInHz, getChannelCount(this.channelConfig), d2);
            return true;
        }
    }

    public synchronized void init(int i2) {
        int i3;
        int i4;
        Exception e2;
        int i5;
        int i6;
        MethodCollector.i(5040);
        an.a("BufferedAudioRecorder", "init audioSource: ".concat(String.valueOf(i2)));
        this.audioSource = i2;
        if (this.audio != null) {
            an.d("BufferedAudioRecorder", "second time audio init(), skip");
            MethodCollector.o(5040);
            return;
        }
        int i7 = 2;
        int i8 = -1;
        try {
            int i9 = channelConfigOffset;
            if (!(i9 == -1 || (i6 = sampleRateOffset) == -1)) {
                int i10 = channelConfigSuggested[i9];
                this.channelConfig = i10;
                int i11 = sampleRateSuggested[i6];
                this.sampleRateInHz = i11;
                this.bufferSizeInBytes = AudioRecord.getMinBufferSize(i11, i10, 2);
                this.audio = new AudioRecord(i2, this.sampleRateInHz, this.channelConfig, 2, this.bufferSizeInBytes);
            }
        } catch (Exception e3) {
            an.d("BufferedAudioRecorder", "Use default configuration " + channelConfigOffset + "," + sampleRateOffset + "Instantiation audio recorder failed, retest configuration. " + e3);
            this.audio = null;
            this.presenter.lackPermission();
        }
        if (this.audio == null) {
            channelConfigOffset = -1;
            int[] iArr = channelConfigSuggested;
            int length = iArr.length;
            int i12 = 0;
            loop0:
            while (true) {
                if (i12 >= length) {
                    break;
                }
                this.channelConfig = iArr[i12];
                channelConfigOffset++;
                sampleRateOffset = i8;
                int[] iArr2 = sampleRateSuggested;
                int length2 = iArr2.length;
                int i13 = 0;
                while (i13 < length2) {
                    int i14 = iArr2[i13];
                    sampleRateOffset++;
                    try {
                        this.bufferSizeInBytes = AudioRecord.getMinBufferSize(i14, this.channelConfig, i7);
                        an.d("BufferedAudioRecorder", "Try hz  " + i14 + " " + this.channelConfig + " 2");
                        if (this.bufferSizeInBytes > 0) {
                            this.sampleRateInHz = i14;
                            i5 = 0;
                            try {
                                this.audio = new AudioRecord(i2, this.sampleRateInHz, this.channelConfig, 2, this.bufferSizeInBytes);
                                break loop0;
                            } catch (Exception e4) {
                                e2 = e4;
                                this.sampleRateInHz = i5;
                                this.audio = null;
                                an.d("BufferedAudioRecorder", "apply audio record sample rate " + i14 + " failed: " + e2.getMessage());
                                sampleRateOffset++;
                                i13++;
                                i7 = 2;
                            }
                        } else {
                            sampleRateOffset++;
                            i13++;
                            i7 = 2;
                        }
                    } catch (Exception e5) {
                        e2 = e5;
                        i5 = 0;
                        this.sampleRateInHz = i5;
                        this.audio = null;
                        an.d("BufferedAudioRecorder", "apply audio record sample rate " + i14 + " failed: " + e2.getMessage());
                        sampleRateOffset++;
                        i13++;
                        i7 = 2;
                    }
                }
                i12++;
                i7 = 2;
                i8 = -1;
            }
        }
        int i15 = this.sampleRateInHz;
        if (i15 <= 0) {
            an.d("BufferedAudioRecorder", "!Init audio recorder failed, hz " + this.sampleRateInHz);
            MethodCollector.o(5040);
            return;
        }
        if (this.channelConfig == 16) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        this.presenter.initAudioConfig(i15, i3, this.encodeSampleRate, this.encodeChannels, this.encodeBitRate);
        StringBuilder append = new StringBuilder("Init audio recorder succeed, apply audio record sample rate ").append(this.sampleRateInHz).append(" channels ").append(i3).append(" buffer ").append(this.bufferSizeInBytes).append(" state ");
        AudioRecord audioRecord = this.audio;
        if (audioRecord == null) {
            i4 = -1;
        } else {
            i4 = audioRecord.getState();
        }
        an.a("BufferedAudioRecorder", append.append(i4).append(" encodeSampleRate ").append(this.encodeSampleRate).append(" encodeChannels ").append(this.encodeChannels).toString());
        this.mMicState = 1;
        AudioRecord audioRecord2 = this.audio;
        if (audioRecord2 != null && audioRecord2.getState() == 0) {
            this.audio = null;
            an.d("BufferedAudioRecorder", "AudioRecord state at STATE_UNINITIALIZED! Will try init when start recording.");
        }
        MethodCollector.o(5040);
    }

    private boolean innerStartRecording(double d2, boolean z) {
        MethodCollector.i(5079);
        this.isStopped = false;
        this.isStopPCMCallback = false;
        AudioRecorderInterfaceExt audioRecorderInterfaceExt = this.presenter;
        a aVar = new a(audioRecorderInterfaceExt, audioRecorderInterfaceExt);
        this.mProcessThread = aVar;
        an.a("AudioDataProcessThread", an.a() + ": " + an.c());
        synchronized (aVar.f59668b) {
            try {
                if (aVar.f59670d) {
                    an.c("AudioDataProcessThread", "thread already running");
                } else {
                    aVar.f59670d = true;
                    new Thread(aVar, "AudioDataProcessThread").start();
                    while (!aVar.f59669c) {
                        try {
                            aVar.f59668b.wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            } finally {
                MethodCollector.o(5079);
            }
        }
        if (z) {
            this.mProcessThread.a(this.sampleRateInHz, getChannelCount(this.channelConfig), d2);
        }
        long currentTimeMillis = System.currentTimeMillis();
        int startMic = startMic();
        collectStartMicInfo(0, startMic, System.currentTimeMillis() - currentTimeMillis);
        if (startMic != 0) {
            int i2 = 0;
            while (true) {
                if (i2 < this.mMicRestartCount) {
                    if (this.audio == null) {
                        init(this.audioSource);
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    startMic = startMic();
                    int i3 = i2 + 1;
                    collectStartMicInfo(i3, startMic, System.currentTimeMillis() - currentTimeMillis2);
                    if (startMic == 0) {
                        startMic = 0;
                        break;
                    }
                    an.d("BufferedAudioRecorder", "retry start mic times : ".concat(String.valueOf(i2)));
                    i2 = i3;
                } else {
                    break;
                }
            }
        }
        h.a(0, "te_record_audio_mic_start_info", this.mMicStartInfoMap.toString());
        if (startMic != 0) {
            this.mMicStartInfoMap.clear();
            e.b bVar = this.mStateCallback;
            if (bVar != null) {
                bVar.a(-603);
            }
            this.presenter.recordStatus(false);
            MethodCollector.o(5079);
            return false;
        }
        e.b bVar2 = this.mStateCallback;
        if (bVar2 != null) {
            bVar2.a(3);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        if (innerStartRecording(r8, r10) == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        com.ss.android.vesdk.an.a("BufferedAudioRecorder", "start mic ok, ready to run AudioRecorderRunnable");
        new java.lang.Thread(new org.libsdl.app.BufferedAudioRecorder.AudioRecorderRunnable(r7, r8, r10)).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
        java.lang.Runtime.getRuntime().gc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        java.lang.Thread.sleep(100);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006f, code lost:
        java.lang.System.runFinalization();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
        if (innerStartRecording(r8, r10) != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0078, code lost:
        com.ss.android.vesdk.an.a("BufferedAudioRecorder", "after gc, start mic ok, ready to run AudioRecorderRunnable");
        new java.lang.Thread(new org.libsdl.app.BufferedAudioRecorder.AudioRecorderRunnable(r7, r8, r10)).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008c, code lost:
        com.ss.android.ttve.monitor.h.a(0, "te_record_audio_start_record_time", java.lang.System.currentTimeMillis() - r7.mAudioRecordStartTime);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(5060);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startRecording(double r8, boolean r10) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: org.libsdl.app.BufferedAudioRecorder.startRecording(double, boolean):void");
    }

    private JSONObject buildInfoJSONObject(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldState", "");
            jSONObject.put("newState", "");
            jSONObject.put("error", str);
            jSONObject.put("startTime", str2);
            jSONObject.put("endTime", str3);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    private void collectStartMicInfo(int i2, int i3, long j2) {
        this.mMicStartInfoMap.put("micStartRet".concat(String.valueOf(i2)), Integer.valueOf(i3));
        this.mMicStartInfoMap.put("micStartCost".concat(String.valueOf(i2)), Long.valueOf(j2));
    }

    public BufferedAudioRecorder(AudioRecorderInterfaceExt audioRecorderInterfaceExt, int i2, int i3, int i4) {
        this(audioRecorderInterfaceExt, i2, i3, i4, null);
    }

    public BufferedAudioRecorder(AudioRecorderInterfaceExt audioRecorderInterfaceExt, int i2, int i3, int i4, f fVar) {
        this.sampleRateInHz = -1;
        this.channelConfig = -1;
        this.audioFormat = 2;
        this.audioSource = 1;
        this.mMicRestartCount = 10;
        this.mMicStartInfoMap = new ConcurrentHashMap();
        this.mRecordingState = new RecordingState();
        this.mEnableMicBgmDelayOpt = false;
        this.presenter = audioRecorderInterfaceExt;
        this.encodeSampleRate = i2;
        this.encodeChannels = i3;
        this.encodeBitRate = i4;
        this.audioMonitor = fVar;
        this.mEnableMicBgmDelayOpt = ((Boolean) com.ss.android.vesdk.u.a().a("ve_enable_bgm_mic_delay_opt", (Object) false)).booleanValue();
        an.a("BufferedAudioRecorder", "enable_bgm_mic_delay_opt: " + this.mEnableMicBgmDelayOpt);
    }
}

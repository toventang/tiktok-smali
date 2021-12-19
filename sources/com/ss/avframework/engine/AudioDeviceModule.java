package com.ss.avframework.engine;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.avframework.capture.audio.AudioCapturer;
import com.ss.avframework.mixer.AudioMixer;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.TEBundle;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.json.JSONException;
import org.json.JSONObject;

public class AudioDeviceModule extends NativeObject {
    private static String ADM_HARDWARE_AUDIOEFFECT_TABLE = "";
    private static AudioManager sAudioManager;
    private boolean aecAutoSwitch;
    private int mAdmType;
    private AudioMixer mAudioMixer;
    private int mBGMMode;
    public WeakReference<AudioCapturer.AudioCaptureObserver> mCaptureObserver;
    private Context mContext;
    private boolean mEnableAecOnHeadset;
    private WeakReference<AudioCapturer> mExtAudioCapture;
    public Handler mHandler;
    private boolean mHeadSetStat;
    public boolean mHeadSetStatWithVoip;
    public float mMicVolume;
    public NativeADMObserver mObserver;
    private final TEBundle mParam;
    private HeadsetPlugReceiver mReceiver;
    public boolean mRelease;
    public boolean mStatusBluetoothIsConnected;
    public boolean mStatusHeadSetIsConnected;
    public boolean mStatusIsVoIPMode;

    public interface Observer {
        static {
            Covode.recordClassIndex(99806);
        }

        void onADMInfo(int i2, int i3, long j2);
    }

    private native void nativeAddAudioSink(int i2, AudioSink audioSink);

    private native void nativeClearLogState();

    private native long nativeCreate(AudioPlayer audioPlayer, AudioCapturer audioCapturer, Context context, IntBuffer intBuffer);

    private native long nativeCreateRenderSink();

    private native void nativeDisableLocalAudioStream(boolean z);

    private native void nativeEnableBuiltInAEC(boolean z);

    private native void nativeEnableBuiltInAGC(boolean z);

    private native void nativeEnableBuiltInNS(boolean z);

    private native void nativeEnableEchoMode(boolean z);

    private native float nativeGetMicVolumedB();

    private native double nativeGetOption(int i2);

    private native TEBundle nativeGetParameter();

    private native long nativeGetRenderMixer();

    private native String nativeGetReportStats();

    private native boolean nativeIsDisableLocalAudioStream();

    private native boolean nativeIsEchoMode();

    private native boolean nativeIsEnableBuiltInAEC();

    private native boolean nativeIsEnableBuiltInAGC();

    private native boolean nativeIsEnableBuiltInNS();

    private native boolean nativeIsExternalRecording();

    private native boolean nativeIsPlayer();

    private native boolean nativeIsRecoding();

    private native boolean nativeIsResumeStatus();

    private native boolean nativeIsSeperateRecordingCallback();

    private native boolean nativeIsVoIPMode();

    private native void nativeRegisterObserver(Observer observer);

    private native void nativeRemoveAudioSink(int i2, AudioSink audioSink);

    public static native long nativeRenderDelayMs(long j2);

    public static native void nativeRenderSinkData(long j2, Buffer buffer, int i2, int i3, int i4, long j3);

    public static native void nativeRenderSinkEnableAgc(long j2, boolean z, boolean z2);

    public static native double nativeRenderSinkGetOption(long j2, int i2);

    public static native long nativeRenderSinkGetQuirks(long j2);

    public static native boolean nativeRenderSinkIsMute(long j2);

    public static native void nativeRenderSinkRelease(long j2);

    public static native void nativeRenderSinkSetMute(long j2, boolean z);

    public static native void nativeRenderSinkSetQuirks(long j2, long j3);

    public static native void nativeRenderSinkSetVolume(long j2, float f2);

    public static native int nativeRenderSinkTrackId(long j2);

    public static native boolean nativeRenderSinkisEnableAgc(long j2);

    public static native void nativeSetAudioLoudNormParam(long j2, float f2);

    private native void nativeSetAudioProcessor(AudioProcessor audioProcessor);

    private native void nativeSetAudioScenario(int i2);

    public static native int nativeSetAudioTrack(long j2, AudioTrack audioTrack);

    private native void nativeSetExternalRecording(boolean z);

    private native void nativeSetParameter(TEBundle tEBundle);

    private native void nativeSetRecordingCallback(AudioSink audioSink);

    private native void nativeSetTuningName(Object obj);

    private native void nativeSetTuningType(int i2, Object obj);

    private native void nativeUpdateOriginTrackIndex(int i2);

    private native void nativesetHeadSetStat(boolean z);

    public native void nativeInitEarMonitor();

    public native boolean nativeIsMicMute();

    public native boolean nativeIsSupportHardwareEarMonitor();

    public native int nativeMicVolume(float f2, boolean z);

    public native void nativeRelease();

    public native void nativeResetRecordingPlayer(int i2);

    public native void nativeResumeStatus(boolean z);

    public native int nativeStartPlayer();

    public native int nativeStartRecording();

    public native int nativeStopPlayer();

    public native int nativeStopRecording();

    public native void nativeSwitchToVoIP(boolean z);

    public void setTuningName(String str) {
    }

    public int getAdmType() {
        return this.mAdmType;
    }

    public boolean isBluetoothConnected() {
        return this.mStatusBluetoothIsConnected;
    }

    public boolean isHeadSet() {
        return this.mHeadSetStat;
    }

    class InteralAudioMixer extends AudioMixer {
        static {
            Covode.recordClassIndex(99803);
        }

        @Override // com.ss.avframework.mixer.Mixer
        public void setOriginTrackIndex(int i2) {
        }

        @Override // com.ss.avframework.mixer.Mixer
        public boolean enable() {
            return super.enable();
        }

        @Override // com.ss.avframework.mixer.Mixer
        public void setEnable(boolean z) {
            super.setEnable(z);
            AudioDeviceModule.this.mObserver.onADMInfo(4, enable() ? 1 : 0, 0);
        }

        public InteralAudioMixer(long j2) {
            super(j2);
        }
    }

    public long getCaptureDelayMs() {
        return (long) getOption(5);
    }

    public float getMicVolumedB() {
        return (float) getOption(3);
    }

    public long getPlayerDelayMs() {
        return (long) getOption(4);
    }

    public static class AudioRenderSink extends AudioSink {
        private final Handler mWorkHandler;

        static {
            Covode.recordClassIndex(99799);
        }

        @Override // com.ss.avframework.engine.AudioSink
        public void onNoData() {
        }

        public long getQuirks() {
            MethodCollector.i(13707);
            long nativeRenderSinkGetQuirks = AudioDeviceModule.nativeRenderSinkGetQuirks(this.mNativeObj);
            MethodCollector.o(13707);
            return nativeRenderSinkGetQuirks;
        }

        public long getRenderDelayMs() {
            MethodCollector.i(13643);
            long nativeRenderDelayMs = AudioDeviceModule.nativeRenderDelayMs(this.mNativeObj);
            MethodCollector.o(13643);
            return nativeRenderDelayMs;
        }

        public int getRenderTrackId() {
            MethodCollector.i(13642);
            int nativeRenderSinkTrackId = AudioDeviceModule.nativeRenderSinkTrackId(this.mNativeObj);
            MethodCollector.o(13642);
            return nativeRenderSinkTrackId;
        }

        public boolean isEnableAGC() {
            MethodCollector.i(13645);
            boolean nativeRenderSinkisEnableAgc = AudioDeviceModule.nativeRenderSinkisEnableAgc(this.mNativeObj);
            MethodCollector.o(13645);
            return nativeRenderSinkisEnableAgc;
        }

        public boolean isMute() {
            MethodCollector.i(13639);
            boolean nativeRenderSinkIsMute = AudioDeviceModule.nativeRenderSinkIsMute(this.mNativeObj);
            MethodCollector.o(13639);
            return nativeRenderSinkIsMute;
        }

        @Override // com.ss.avframework.engine.NativeObject
        public synchronized void release() {
            MethodCollector.i(13710);
            Handler handler = this.mWorkHandler;
            if (handler != null) {
                handler.post(new Runnable() {
                    /* class com.ss.avframework.engine.AudioDeviceModule.AudioRenderSink.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(99801);
                    }

                    public void run() {
                        MethodCollector.i(14510);
                        AudioDeviceModule.nativeRenderSinkRelease(AudioRenderSink.this.mNativeObj);
                        AudioRenderSink.this.setNativeObj(0);
                        MethodCollector.o(14510);
                    }
                });
                MethodCollector.o(13710);
                return;
            }
            AudioDeviceModule.nativeRenderSinkRelease(this.mNativeObj);
            setNativeObj(0);
            MethodCollector.o(13710);
        }

        public AudioRenderSink(long j2) {
            this(j2, null);
        }

        public double getOption(int i2) {
            MethodCollector.i(13641);
            double nativeRenderSinkGetOption = AudioDeviceModule.nativeRenderSinkGetOption(this.mNativeObj, i2);
            MethodCollector.o(13641);
            return nativeRenderSinkGetOption;
        }

        public void setAudioLoudNormParam(float f2) {
            MethodCollector.i(13709);
            AudioDeviceModule.nativeSetAudioLoudNormParam(this.mNativeObj, f2);
            MethodCollector.o(13709);
        }

        public void setAudioTrack(AudioTrack audioTrack) {
            MethodCollector.i(13708);
            AudioDeviceModule.nativeSetAudioTrack(this.mNativeObj, audioTrack);
            MethodCollector.o(13708);
        }

        public void setMute(boolean z) {
            MethodCollector.i(13640);
            AudioDeviceModule.nativeRenderSinkSetMute(this.mNativeObj, z);
            MethodCollector.o(13640);
        }

        public void setQuirks(long j2) {
            MethodCollector.i(13647);
            AudioDeviceModule.nativeRenderSinkSetQuirks(this.mNativeObj, j2);
            MethodCollector.o(13647);
        }

        public void setVolume(final float f2) {
            MethodCollector.i(13638);
            Handler handler = this.mWorkHandler;
            if (handler != null) {
                handler.post(new Runnable() {
                    /* class com.ss.avframework.engine.AudioDeviceModule.AudioRenderSink.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(99800);
                    }

                    public void run() {
                        MethodCollector.i(14525);
                        AudioDeviceModule.nativeRenderSinkSetVolume(AudioRenderSink.this.mNativeObj, f2);
                        MethodCollector.o(14525);
                    }
                });
                MethodCollector.o(13638);
                return;
            }
            AudioDeviceModule.nativeRenderSinkSetVolume(this.mNativeObj, f2);
            MethodCollector.o(13638);
        }

        public AudioRenderSink(long j2, Handler handler) {
            setNativeObj(j2);
            this.mWorkHandler = handler;
        }

        public void setEnableAGC(boolean z, boolean z2) {
            MethodCollector.i(13644);
            AudioDeviceModule.nativeRenderSinkEnableAgc(this.mNativeObj, z, z2);
            MethodCollector.o(13644);
        }

        @Override // com.ss.avframework.engine.AudioSink
        public void onData(Buffer buffer, int i2, int i3, int i4, long j2) {
            MethodCollector.i(13646);
            AudioDeviceModule.nativeRenderSinkData(this.mNativeObj, buffer, i2, i3, i4, j2);
            MethodCollector.o(13646);
        }
    }

    static {
        Covode.recordClassIndex(99785);
    }

    public static int getMode() {
        AudioManager audioManager = sAudioManager;
        if (audioManager != null) {
            return audioManager.getMode();
        }
        return 0;
    }

    public static boolean isMicMute() {
        AudioManager audioManager = sAudioManager;
        if (audioManager != null) {
            return audioManager.isMicrophoneMute();
        }
        return true;
    }

    public static boolean isSpeakerphoneOn() {
        AudioManager audioManager = sAudioManager;
        if (audioManager != null) {
            return audioManager.isSpeakerphoneOn();
        }
        return false;
    }

    public void clearLogState() {
        MethodCollector.i(14097);
        nativeClearLogState();
        MethodCollector.o(14097);
    }

    public boolean isDisableLocalAudioStream() {
        MethodCollector.i(14605);
        boolean nativeIsDisableLocalAudioStream = nativeIsDisableLocalAudioStream();
        MethodCollector.o(14605);
        return nativeIsDisableLocalAudioStream;
    }

    public boolean isEchoMode() {
        MethodCollector.i(14338);
        boolean nativeIsEchoMode = nativeIsEchoMode();
        MethodCollector.o(14338);
        return nativeIsEchoMode;
    }

    public boolean isEnableBuiltInAEC() {
        MethodCollector.i(14243);
        boolean nativeIsEnableBuiltInAEC = nativeIsEnableBuiltInAEC();
        MethodCollector.o(14243);
        return nativeIsEnableBuiltInAEC;
    }

    public boolean isEnableBuiltInAGC() {
        MethodCollector.i(14310);
        boolean nativeIsEnableBuiltInAGC = nativeIsEnableBuiltInAGC();
        MethodCollector.o(14310);
        return nativeIsEnableBuiltInAGC;
    }

    public boolean isEnableBuiltInNS() {
        MethodCollector.i(14309);
        boolean nativeIsEnableBuiltInNS = nativeIsEnableBuiltInNS();
        MethodCollector.o(14309);
        return nativeIsEnableBuiltInNS;
    }

    public boolean isExternalRecording() {
        MethodCollector.i(13941);
        boolean nativeIsExternalRecording = nativeIsExternalRecording();
        MethodCollector.o(13941);
        return nativeIsExternalRecording;
    }

    public boolean isMute() {
        MethodCollector.i(13955);
        boolean nativeIsMicMute = nativeIsMicMute();
        MethodCollector.o(13955);
        return nativeIsMicMute;
    }

    public boolean isPlayer() {
        MethodCollector.i(13673);
        boolean nativeIsPlayer = nativeIsPlayer();
        MethodCollector.o(13673);
        return nativeIsPlayer;
    }

    public boolean isRecording() {
        MethodCollector.i(13736);
        boolean nativeIsRecoding = nativeIsRecoding();
        MethodCollector.o(13736);
        return nativeIsRecoding;
    }

    public boolean isSeperateRecordingCallback() {
        MethodCollector.i(13995);
        boolean nativeIsSeperateRecordingCallback = nativeIsSeperateRecordingCallback();
        MethodCollector.o(13995);
        return nativeIsSeperateRecordingCallback;
    }

    public boolean isVoIPMode() {
        MethodCollector.i(14178);
        boolean nativeIsVoIPMode = nativeIsVoIPMode();
        MethodCollector.o(14178);
        return nativeIsVoIPMode;
    }

    public void pause() {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.engine.AudioDeviceModule.AnonymousClass12 */

            static {
                Covode.recordClassIndex(99789);
            }

            public void run() {
                MethodCollector.i(13256);
                AudioDeviceModule.this.nativeResumeStatus(false);
                MethodCollector.o(13256);
            }
        });
    }

    public void resume() {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.engine.AudioDeviceModule.AnonymousClass13 */

            static {
                Covode.recordClassIndex(99790);
            }

            public void run() {
                MethodCollector.i(13179);
                AudioDeviceModule.this.nativeResumeStatus(true);
                MethodCollector.o(13179);
            }
        });
    }

    public int startPlayer() {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.engine.AudioDeviceModule.AnonymousClass8 */

            static {
                Covode.recordClassIndex(99797);
            }

            public void run() {
                MethodCollector.i(13817);
                AudioDeviceModule.this.nativeStartPlayer();
                MethodCollector.o(13817);
            }
        });
        return 0;
    }

    public int startRecording() {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.engine.AudioDeviceModule.AnonymousClass7 */

            static {
                Covode.recordClassIndex(99796);
            }

            public void run() {
                AudioCapturer.AudioCaptureObserver audioCaptureObserver;
                MethodCollector.i(13975);
                int nativeStartRecording = AudioDeviceModule.this.nativeStartRecording();
                if (!(nativeStartRecording == 0 || (audioCaptureObserver = AudioDeviceModule.this.mCaptureObserver.get()) == null)) {
                    audioCaptureObserver.onAudioCaptureError(nativeStartRecording, new Exception("ADM start recording failed: ".concat(String.valueOf(nativeStartRecording))));
                }
                MethodCollector.o(13975);
            }
        });
        return 0;
    }

    public int stopPlayer() {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.engine.AudioDeviceModule.AnonymousClass10 */

            static {
                Covode.recordClassIndex(99787);
            }

            public void run() {
                MethodCollector.i(13410);
                if (!AudioDeviceModule.this.mRelease) {
                    AudioDeviceModule.this.nativeStopPlayer();
                }
                MethodCollector.o(13410);
            }
        });
        return 0;
    }

    public int stopRecording() {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.engine.AudioDeviceModule.AnonymousClass9 */

            static {
                Covode.recordClassIndex(99798);
            }

            public void run() {
                MethodCollector.i(13921);
                if (!AudioDeviceModule.this.mRelease) {
                    AudioDeviceModule.this.nativeStopRecording();
                }
                MethodCollector.o(13921);
            }
        });
        return 0;
    }

    /* access modifiers changed from: package-private */
    public class NativeADMObserver extends NativeObject implements Observer {
        private Observer mObserver;

        static {
            Covode.recordClassIndex(99804);
        }

        @Override // com.ss.avframework.engine.NativeObject
        public synchronized void release() {
            MethodCollector.i(10913);
            this.mObserver = null;
            super.release();
            MethodCollector.o(10913);
        }

        public void registerObserver(Observer observer) {
            this.mObserver = observer;
        }

        public NativeADMObserver(Observer observer) {
            this.mObserver = observer;
        }

        @Override // com.ss.avframework.engine.AudioDeviceModule.Observer
        public void onADMInfo(int i2, final int i3, long j2) {
            AVLog.d("AudioDeviceModule", "AudioDeviceModule.java onADMInfo " + i2 + " " + i3 + " " + j2);
            Observer observer = this.mObserver;
            if (observer != null) {
                observer.onADMInfo(i2, i3, j2);
            }
            if (i2 == 8) {
                int mode = AudioDeviceModule.getMode();
                if (mode == 3 || mode == 2) {
                    AudioDeviceModule.this.mStatusIsVoIPMode = true;
                } else {
                    AudioDeviceModule.this.mStatusIsVoIPMode = false;
                }
                AudioDeviceModule.this.audioRouteChanged();
            } else if (i2 == 9 && AudioDeviceModule.this.mHandler != null) {
                AudioDeviceModule.this.mHandler.postDelayed(new Runnable() {
                    /* class com.ss.avframework.engine.AudioDeviceModule.NativeADMObserver.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(99805);
                    }

                    public void run() {
                        MethodCollector.i(14455);
                        AudioDeviceModule.this.nativeResetRecordingPlayer(i3);
                        MethodCollector.o(14455);
                    }
                }, 200);
            }
        }
    }

    public void audioRouteChanged() {
        Handler handler = this.mHandler;
        if (handler == null || !handler.post(new Runnable() {
            /* class com.ss.avframework.engine.AudioDeviceModule.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99786);
            }

            public void run() {
                AudioDeviceModule.this.onAudioRouteChanged();
            }
        })) {
            onAudioRouteChanged();
        }
    }

    public AudioRenderSink createRenderSink() {
        MethodCollector.i(14110);
        AudioRenderSink audioRenderSink = new AudioRenderSink(nativeCreateRenderSink(), this.mHandler);
        MethodCollector.o(14110);
        return audioRenderSink;
    }

    public TEBundle getParameter() {
        MethodCollector.i(14340);
        TEBundle nativeGetParameter = nativeGetParameter();
        synchronized (this.mParam) {
            try {
                this.mParam.updateFrom(nativeGetParameter);
            } finally {
                MethodCollector.o(14340);
            }
        }
        return nativeGetParameter;
    }

    public synchronized AudioMixer getRenderMixer() {
        AudioMixer audioMixer;
        MethodCollector.i(14143);
        if (this.mAudioMixer == null) {
            this.mAudioMixer = new InteralAudioMixer(nativeGetRenderMixer());
        }
        audioMixer = this.mAudioMixer;
        MethodCollector.o(14143);
        return audioMixer;
    }

    public void setupHeadsetListener() {
        if (this.mContext != null && this.mReceiver == null) {
            this.mReceiver = new HeadsetPlugReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
            com_ss_avframework_engine_AudioDeviceModule_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(this.mContext, this.mReceiver, intentFilter);
        }
    }

    public void onAudioRouteChanged() {
        AudioManager audioManager = sAudioManager;
        if (audioManager != null) {
            boolean z = this.mStatusIsVoIPMode;
            boolean z2 = this.mStatusBluetoothIsConnected;
            boolean z3 = this.mStatusHeadSetIsConnected;
            AVLog.iod("AudioDeviceModule", "onAudioRouteChanged voip " + z + " bluetooth " + z2 + " headset " + z3);
            if (!z) {
                changeToSpeaker(audioManager);
            } else if (z3) {
                changeToHeadset(audioManager);
            } else if (z2) {
                changeToBluetooth(audioManager);
            } else {
                changeToSpeaker(audioManager);
            }
        }
    }

    public JSONObject getReportJsonStats() {
        boolean z;
        String str;
        String str2;
        MethodCollector.i(13842);
        String nativeGetReportStats = nativeGetReportStats();
        int admType = getAdmType();
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(nativeGetReportStats)) {
                try {
                    jSONObject = new JSONObject(nativeGetReportStats);
                } catch (JSONException unused) {
                    jSONObject.put("adm_native_exp_error", nativeGetReportStats);
                }
            }
            jSONObject.put("adm_type", admType);
            jSONObject.put("bluetooth", this.mStatusBluetoothIsConnected);
            jSONObject.put("headset", this.mStatusHeadSetIsConnected);
            jSONObject.put("is_mute", nativeIsMicMute());
            jSONObject.put("aec_enable", isEnableBuiltInAEC());
            if (!nativeIsResumeStatus()) {
                z = true;
            } else {
                z = false;
            }
            jSONObject.put("is_paused", z);
            jSONObject.put("mic_volume", (double) this.mMicVolume);
            if (admType == 0) {
                try {
                    jSONObject.put("voip", this.mStatusIsVoIPMode);
                    synchronized (this.mParam) {
                        try {
                            if (this.mParam.contains("adm_recording_type")) {
                                str = this.mParam.getString("adm_recording_type");
                            } else {
                                str = "opensles";
                            }
                            if (this.mParam.contains("adm_player_type")) {
                                str2 = this.mParam.getString("adm_player_type");
                            } else {
                                str2 = "opensles";
                            }
                            jSONObject.put("adm_recording_type", str);
                            jSONObject.put("adm_player_type", str2);
                        } finally {
                            MethodCollector.o(13842);
                        }
                    }
                } catch (JSONException unused2) {
                    MethodCollector.o(13842);
                    return jSONObject;
                }
            }
            return jSONObject;
        } catch (JSONException unused3) {
            MethodCollector.o(13842);
            return jSONObject;
        }
    }

    @Override // com.ss.avframework.engine.NativeObject
    public synchronized void release() {
        HeadsetPlugReceiver headsetPlugReceiver;
        MethodCollector.i(13890);
        Handler handler = this.mHandler;
        if (handler == null || handler.getLooper().getThread() == Thread.currentThread()) {
            AVLog.ioi("AudioDeviceModule", "release ADM ".concat(String.valueOf(this)));
        } else {
            AVLog.logToIODevice(4, "AudioDeviceModule", "release ADM " + this + " on thread \"" + Thread.currentThread().getName() + "\", handler's thread is \"" + this.mHandler.getLooper().getThread().getName() + "\", stack: ", new Throwable());
        }
        AudioMixer audioMixer = this.mAudioMixer;
        if (audioMixer != null) {
            audioMixer.release();
            this.mAudioMixer = null;
        }
        nativeRegisterObserver(null);
        boolean post = this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.engine.AudioDeviceModule.AnonymousClass11 */

            static {
                Covode.recordClassIndex(99788);
            }

            public void run() {
                MethodCollector.i(13258);
                AudioDeviceModule.this.nativeRelease();
                AudioDeviceModule.this.setNativeObj(0);
                MethodCollector.o(13258);
            }
        });
        Context context = this.mContext;
        if (!(context == null || (headsetPlugReceiver = this.mReceiver) == null)) {
            context.unregisterReceiver(headsetPlugReceiver);
            this.mContext = null;
            this.mReceiver = null;
        }
        NativeADMObserver nativeADMObserver = this.mObserver;
        if (nativeADMObserver != null) {
            nativeADMObserver.release();
            this.mObserver = null;
        }
        if (!post) {
            nativeRelease();
            setNativeObj(0);
        }
        this.mParam.release();
        this.mRelease = true;
        MethodCollector.o(13890);
    }

    public void enableAecOnHeadSetMode(boolean z) {
        this.mEnableAecOnHeadset = z;
    }

    public void enableEchoMode(boolean z) {
        enableEchoModeInternal(z);
    }

    class HeadsetPlugReceiver extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(99802);
        }

        private HeadsetPlugReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            AVLog.iod("AudioDeviceModule", "action:".concat(String.valueOf(action)));
            if (action.equals("android.intent.action.HEADSET_PLUG")) {
                int intExtra = intent.getIntExtra("state", 0);
                if (intExtra == 0) {
                    AudioDeviceModule.this.mStatusHeadSetIsConnected = false;
                    AudioDeviceModule.this.setHeadSetStat(false);
                } else if (intExtra == 1) {
                    AudioDeviceModule.this.mStatusHeadSetIsConnected = true;
                    AudioDeviceModule.this.setHeadSetStat(true);
                }
            } else if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                AudioDeviceModule.this.updateBluetoothIndication(intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0));
                AudioDeviceModule audioDeviceModule = AudioDeviceModule.this;
                audioDeviceModule.setBluetoothStat(audioDeviceModule.mStatusBluetoothIsConnected);
            } else {
                "android.media.AUDIO_BECOMING_NOISY".equals(action);
            }
            AudioDeviceModule.this.audioRouteChanged();
        }
    }

    public static void setSpeakerphoneOn(boolean z) {
        AudioManager audioManager = sAudioManager;
        if (audioManager != null) {
            try {
                audioManager.setSpeakerphoneOn(z);
            } catch (Throwable unused) {
            }
        }
    }

    public void setAudioCaptureObserver(AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
        this.mCaptureObserver = new WeakReference<>(audioCaptureObserver);
    }

    private void changeToBluetooth(AudioManager audioManager) {
        try {
            audioManager.startBluetoothSco();
        } catch (Throwable unused) {
        }
        try {
            audioManager.setBluetoothScoOn(true);
        } catch (Throwable unused2) {
        }
        setSpeakerphoneOn(false);
    }

    private void changeToHeadset(AudioManager audioManager) {
        try {
            audioManager.stopBluetoothSco();
        } catch (Throwable unused) {
        }
        try {
            audioManager.setBluetoothScoOn(false);
        } catch (Throwable unused2) {
        }
        setSpeakerphoneOn(false);
    }

    private void changeToSpeaker(AudioManager audioManager) {
        try {
            audioManager.stopBluetoothSco();
        } catch (Throwable unused) {
        }
        try {
            audioManager.setBluetoothScoOn(false);
        } catch (Throwable unused2) {
        }
        setSpeakerphoneOn(true);
    }

    private void updateOriginTrackIndex(int i2) {
        MethodCollector.i(14179);
        nativeUpdateOriginTrackIndex(i2);
        MethodCollector.o(14179);
    }

    public void disableLocalAudioStream(boolean z) {
        MethodCollector.i(14512);
        nativeDisableLocalAudioStream(z);
        MethodCollector.o(14512);
    }

    public void enableAecAutoSwitch(boolean z) {
        this.aecAutoSwitch = z;
        if (z) {
            enableAEC(false);
        }
    }

    public void enableBuiltInAEC(boolean z) {
        if (!this.aecAutoSwitch) {
            enableAEC(z);
        }
    }

    public double getOption(int i2) {
        MethodCollector.i(13993);
        double nativeGetOption = nativeGetOption(i2);
        MethodCollector.o(13993);
        return nativeGetOption;
    }

    public void setAudioProcessor(AudioProcessor audioProcessor) {
        MethodCollector.i(13994);
        nativeSetAudioProcessor(audioProcessor);
        MethodCollector.o(13994);
    }

    public void setExternalRecording(boolean z) {
        MethodCollector.i(13891);
        nativeSetExternalRecording(z);
        MethodCollector.o(13891);
    }

    public void setRecordingCallack(AudioSink audioSink) {
        MethodCollector.i(13788);
        nativeSetRecordingCallback(audioSink);
        MethodCollector.o(13788);
    }

    public void switchToVoIP(final boolean z) {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.engine.AudioDeviceModule.AnonymousClass6 */

            static {
                Covode.recordClassIndex(99795);
            }

            public void run() {
                MethodCollector.i(14527);
                AudioDeviceModule.this.mHeadSetStatWithVoip = z;
                if ((AudioDeviceModule.this.isHeadSet() || AudioDeviceModule.this.isBluetoothConnected()) && z) {
                    AVLog.iod("AudioDeviceModule", "Head set stat " + AudioDeviceModule.this.isHeadSet() + " bluetooth " + AudioDeviceModule.this.isBluetoothConnected() + " and ignore switch to voip mode.");
                    MethodCollector.o(14527);
                    return;
                }
                AudioDeviceModule.this.nativeSwitchToVoIP(z);
                MethodCollector.o(14527);
            }
        });
    }

    private void enableAEC(boolean z) {
        MethodCollector.i(14216);
        nativeEnableBuiltInAEC(z);
        NativeADMObserver nativeADMObserver = this.mObserver;
        if (nativeADMObserver != null) {
            nativeADMObserver.onADMInfo(2, isEnableBuiltInAEC() ? 1 : 0, 0);
        }
        MethodCollector.o(14216);
    }

    public static boolean isValidAdmApiType(String str) {
        if (str == null || str.equalsIgnoreCase("opensles") || str.equalsIgnoreCase("aaudio") || str.equalsIgnoreCase("audiorecord")) {
            return true;
        }
        return false;
    }

    public static void setMode(int i2) {
        AVLog.iod("AudioDeviceModule", "Setup mode ".concat(String.valueOf(i2)));
        AudioManager audioManager = sAudioManager;
        if (audioManager != null) {
            audioManager.setMode(i2);
        }
    }

    public void enableBuiltInAGC(boolean z) {
        MethodCollector.i(14308);
        nativeEnableBuiltInAGC(z);
        this.mObserver.onADMInfo(6, isEnableBuiltInAGC() ? 1 : 0, 0);
        MethodCollector.o(14308);
    }

    public void enableBuiltInNS(boolean z) {
        MethodCollector.i(14307);
        nativeEnableBuiltInNS(z);
        this.mObserver.onADMInfo(7, isEnableBuiltInNS() ? 1 : 0, 0);
        MethodCollector.o(14307);
    }

    public void setAecInHeadSetStatState(boolean z) {
        MethodCollector.i(12745);
        isEnableBuiltInAEC();
        if (this.aecAutoSwitch && z) {
            enableAEC(false);
        }
        nativesetHeadSetStat(z);
        MethodCollector.o(12745);
    }

    public void setAudioScenario(int i2) {
        MethodCollector.i(13959);
        if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3) {
            nativeSetAudioScenario(i2);
        }
        MethodCollector.o(13959);
    }

    public void unRegisterAudioRecordingCallback(AudioManager.AudioRecordingCallback audioRecordingCallback) {
        Context context;
        AudioManager audioManager;
        if (Build.VERSION.SDK_INT >= 24 && (context = this.mContext) != null && (audioManager = (AudioManager) com_ss_avframework_engine_AudioDeviceModule_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, DataType.AUDIO)) != null && audioRecordingCallback != null) {
            audioManager.unregisterAudioRecordingCallback(audioRecordingCallback);
        }
    }

    public void updateBluetoothIndication(int i2) {
        AVLog.iod("AudioDeviceModule", "updateBluetoothIndication:".concat(String.valueOf(i2)));
        if (i2 == 2) {
            this.mStatusBluetoothIsConnected = true;
        } else {
            this.mStatusBluetoothIsConnected = false;
        }
    }

    private void enableEchoModeInternal(boolean z) {
        MethodCollector.i(14274);
        if (this.aecAutoSwitch && z && isEnableBuiltInAEC()) {
            enableAEC(false);
        }
        nativeEnableEchoMode(z);
        this.mObserver.onADMInfo(3, isEchoMode() ? 1 : 0, 0);
        MethodCollector.o(14274);
    }

    private void initAudioRouteStatus(AudioManager audioManager) {
        boolean z;
        boolean z2 = false;
        if (audioManager.isBluetoothScoOn() || audioManager.isBluetoothA2dpOn()) {
            z = true;
        } else {
            z = false;
        }
        this.mStatusBluetoothIsConnected = z;
        if (audioManager.getMode() == 2 || audioManager.getMode() == 3) {
            z2 = true;
        }
        this.mStatusIsVoIPMode = z2;
        try {
            this.mStatusHeadSetIsConnected = audioManager.isWiredHeadsetOn();
        } catch (Throwable unused) {
        }
    }

    public void setBluetoothStat(final boolean z) {
        if (!this.mEnableAecOnHeadset) {
            enableAEC(!z);
        }
        AVLog.iod("AudioDeviceModule", "Bluetooth status " + z + " enable aec on bluetooth mode " + this.mEnableAecOnHeadset);
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.engine.AudioDeviceModule.AnonymousClass3 */

            static {
                Covode.recordClassIndex(99792);
            }

            public void run() {
                MethodCollector.i(13636);
                AudioDeviceModule.this.setAecInHeadSetStatState(z);
                if (z) {
                    if (AudioDeviceModule.this.mHeadSetStatWithVoip) {
                        AudioDeviceModule.this.nativeSwitchToVoIP(false);
                        MethodCollector.o(13636);
                        return;
                    }
                } else if (AudioDeviceModule.this.mHeadSetStatWithVoip && !AudioDeviceModule.this.isHeadSet()) {
                    AudioDeviceModule.this.nativeSwitchToVoIP(true);
                }
                MethodCollector.o(13636);
            }
        });
    }

    public void setHeadSetStat(final boolean z) {
        this.mHeadSetStat = z;
        if (!this.mEnableAecOnHeadset) {
            enableAEC(!z);
        }
        AVLog.iod("AudioDeviceModule", "Heat set status " + this.mHeadSetStat + " enable aec on headset mode " + this.mEnableAecOnHeadset);
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.engine.AudioDeviceModule.AnonymousClass2 */

            static {
                Covode.recordClassIndex(99791);
            }

            public void run() {
                MethodCollector.i(14564);
                AudioDeviceModule.this.setAecInHeadSetStatState(z);
                if (z) {
                    if (AudioDeviceModule.this.mHeadSetStatWithVoip) {
                        AudioDeviceModule.this.nativeSwitchToVoIP(false);
                        MethodCollector.o(14564);
                        return;
                    }
                } else if (AudioDeviceModule.this.mHeadSetStatWithVoip && !AudioDeviceModule.this.isBluetoothConnected()) {
                    AudioDeviceModule.this.nativeSwitchToVoIP(true);
                }
                MethodCollector.o(14564);
            }
        });
    }

    public void setParameter(TEBundle tEBundle) {
        MethodCollector.i(14339);
        if (tEBundle == null) {
            MethodCollector.o(14339);
            return;
        }
        nativeSetParameter(tEBundle);
        synchronized (this.mParam) {
            try {
                this.mParam.updateFrom(tEBundle);
            } finally {
                MethodCollector.o(14339);
            }
        }
    }

    public void setMicMute(final boolean z) {
        MethodCollector.i(13795);
        AVLog.iod("AudioDeviceModule", "setMicMute(" + z + ")");
        Handler handler = this.mHandler;
        if (handler == null || handler.getLooper().getThread() == Thread.currentThread()) {
            nativeMicVolume(this.mMicVolume, z);
            MethodCollector.o(13795);
            return;
        }
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.engine.AudioDeviceModule.AnonymousClass5 */

            static {
                Covode.recordClassIndex(99794);
            }

            public void run() {
                MethodCollector.i(13230);
                AudioDeviceModule audioDeviceModule = AudioDeviceModule.this;
                audioDeviceModule.nativeMicVolume(audioDeviceModule.mMicVolume, z);
                MethodCollector.o(13230);
            }
        });
        MethodCollector.o(13795);
    }

    public void setMicVolume(final float f2) {
        MethodCollector.i(13304);
        AudioCapturer audioCapturer = this.mExtAudioCapture.get();
        if (audioCapturer == null || audioCapturer.isMute()) {
            this.mMicVolume = f2;
            Handler handler = this.mHandler;
            if (handler == null || handler.getLooper().getThread() == Thread.currentThread()) {
                nativeMicVolume(f2, nativeIsMicMute());
                MethodCollector.o(13304);
                return;
            }
            this.mHandler.post(new Runnable() {
                /* class com.ss.avframework.engine.AudioDeviceModule.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(99793);
                }

                public void run() {
                    MethodCollector.i(13868);
                    AudioDeviceModule audioDeviceModule = AudioDeviceModule.this;
                    audioDeviceModule.nativeMicVolume(f2, audioDeviceModule.nativeIsMicMute());
                    MethodCollector.o(13868);
                }
            });
            MethodCollector.o(13304);
            return;
        }
        audioCapturer.setVolume((double) f2);
        MethodCollector.o(13304);
    }

    public void addAudioSink(int i2, AudioSink audioSink) {
        MethodCollector.i(14056);
        nativeAddAudioSink(i2, audioSink);
        MethodCollector.o(14056);
    }

    public void removeAudioSink(int i2, AudioSink audioSink) {
        MethodCollector.i(14095);
        nativeRemoveAudioSink(i2, audioSink);
        MethodCollector.o(14095);
    }

    public void setTuningType(int i2, String str) {
        MethodCollector.i(12742);
        nativeSetTuningType(i2, str);
        MethodCollector.o(12742);
    }

    public void registerAudioRecordingCallback(AudioManager.AudioRecordingCallback audioRecordingCallback, Handler handler) {
        if (Build.VERSION.SDK_INT >= 24) {
            AudioManager audioManager = sAudioManager;
            if (audioManager == null) {
                Context context = this.mContext;
                if (context != null) {
                    audioManager = (AudioManager) com_ss_avframework_engine_AudioDeviceModule_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, DataType.AUDIO);
                } else {
                    return;
                }
            }
            if (audioRecordingCallback != null && handler != null) {
                audioManager.registerAudioRecordingCallback(audioRecordingCallback, handler);
            }
        }
    }

    public void setExternalRecording(boolean z, AudioCapturer audioCapturer) {
        setExternalRecording(z);
        if (audioCapturer != null) {
            this.mExtAudioCapture = new WeakReference<>(audioCapturer);
        }
    }

    public static Object com_ss_avframework_engine_AudioDeviceModule_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(13379);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(13379);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public AudioDeviceModule(Observer observer, Context context, Handler handler) {
        this(observer, context, handler, 0);
    }

    public static Intent com_ss_avframework_engine_AudioDeviceModule_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent com_ss_avframework_engine_AudioDeviceModule_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = com_ss_avframework_engine_AudioDeviceModule_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.c.a.a.a.b.a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.engine.AudioDeviceModule.com_ss_avframework_engine_AudioDeviceModule_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    public AudioDeviceModule(AudioCapturer audioCapturer, Observer observer, Context context, Handler handler) {
        this(null, audioCapturer, observer, context, handler, 0);
    }

    public AudioDeviceModule(Observer observer, Context context, Handler handler, int i2) {
        this(null, null, observer, context, handler, i2);
    }

    public AudioDeviceModule(AudioPlayer audioPlayer, AudioCapturer audioCapturer, Observer observer, Context context, Handler handler) {
        this(audioPlayer, audioCapturer, observer, context, handler, 0);
    }

    public AudioDeviceModule(AudioPlayer audioPlayer, AudioCapturer audioCapturer, Observer observer, Context context, Handler handler, int i2) {
        MethodCollector.i(13307);
        this.mParam = new TEBundle();
        this.mEnableAecOnHeadset = false;
        AudioManager audioManager = null;
        this.mCaptureObserver = new WeakReference<>(null);
        this.mMicVolume = 1.0f;
        this.mBGMMode = -2;
        this.mAdmType = 0;
        this.mStatusBluetoothIsConnected = false;
        this.mStatusHeadSetIsConnected = false;
        this.mStatusIsVoIPMode = false;
        this.aecAutoSwitch = false;
        IntBuffer asIntBuffer = ByteBuffer.allocateDirect(4).order(ByteOrder.nativeOrder()).asIntBuffer();
        asIntBuffer.put(i2);
        asIntBuffer.position(0);
        setNativeObj(nativeCreate(audioPlayer, audioCapturer, context, asIntBuffer));
        this.mHandler = handler;
        this.mContext = context;
        this.mAdmType = asIntBuffer.get();
        AVLog.w("AudioDeviceModule", "AdmType: " + this.mAdmType);
        AVLog.iow("AudioDeviceModule", "AdmType: " + this.mAdmType);
        if (this.mHandler == null) {
            this.mHandler = new Handler(Looper.getMainLooper());
        }
        this.mExtAudioCapture = new WeakReference<>(null);
        if (audioPlayer == null) {
            if (!(this.mAdmType == 1 || context == null)) {
                audioManager = (AudioManager) com_ss_avframework_engine_AudioDeviceModule_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, DataType.AUDIO);
            }
            sAudioManager = audioManager;
            if (audioManager != null) {
                initAudioRouteStatus(audioManager);
            }
            NativeADMObserver nativeADMObserver = new NativeADMObserver(observer);
            this.mObserver = nativeADMObserver;
            nativeRegisterObserver(nativeADMObserver);
            updateOriginTrackIndex(-10);
            MethodCollector.o(13307);
            return;
        }
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("to support at later version");
        MethodCollector.o(13307);
        throw androidRuntimeException;
    }
}

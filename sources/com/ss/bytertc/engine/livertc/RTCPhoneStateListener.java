package com.ss.bytertc.engine.livertc;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.bytertc.engine.data.AudioPlaybackDevice;
import com.ss.bytertc.engine.data.MuteState;
import com.ss.bytertc.engine.utils.LogUtil;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicInteger;

public class RTCPhoneStateListener extends PhoneStateListener {
    private Context applicationContext;
    private Boolean defaultRouter2Speaker;
    private Boolean forceEnableSpeaker;
    private boolean isSpeakerphoneOn;
    private LiveRTCEngine mEngine;
    private volatile MuteState mMuteAllRemoteAudio;
    private volatile MuteState mMuteLocalAudio;
    private AtomicInteger mOnPhoneCallCount = new AtomicInteger(0);

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.bytertc.engine.livertc.RTCPhoneStateListener$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(100998);
        }
    }

    static {
        Covode.recordClassIndex(100996);
    }

    private void disableAudio() {
        this.mEngine.muteLocalAudio(MuteState.MUTE_STATE_ON);
        this.mEngine.muteAllRemoteAudio(MuteState.MUTE_STATE_ON);
    }

    private AudioManager getAudioManager() {
        return (AudioManager) com_ss_bytertc_engine_livertc_RTCPhoneStateListener_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(this.applicationContext, DataType.AUDIO);
    }

    private boolean isHeadsetOn() {
        AudioManager audioManager = getAudioManager();
        if (audioManager == null) {
            return false;
        }
        if (audioManager.isBluetoothScoOn() || audioManager.isWiredHeadsetOn()) {
            return true;
        }
        return false;
    }

    private void onCallStart() {
        if (this.mOnPhoneCallCount.getAndIncrement() == 0 && this.mEngine != null) {
            LogUtil.d("RtcPhoneStateListener", "CustomPhoneStateListener onCallStateChanged StartCall");
            saveAudioState();
            disableAudio();
        }
    }

    private void onCallRinging() {
        LogUtil.d("RtcPhoneStateListener", "CustomPhoneStateListener onCallStateChanged RING");
        if (this.mEngine != null && this.mOnPhoneCallCount.compareAndSet(0, 0) && !isHeadsetOn()) {
            this.isSpeakerphoneOn = this.mEngine.isSpeakerphoneEnabled();
        }
    }

    private void restoreAudioState() {
        this.mEngine.muteLocalAudio(this.mMuteLocalAudio);
        this.mEngine.muteAllRemoteAudio(this.mMuteAllRemoteAudio);
        LogUtil.i("RtcPhoneStateListener", "restoreAudioState mMuteLocalAudio:" + this.mMuteLocalAudio + ", mMuteAllRemoteAudio:" + this.mMuteAllRemoteAudio);
    }

    private void saveAudioState() {
        this.mMuteLocalAudio = this.mEngine.getMuteLocalAudioStream();
        this.mMuteAllRemoteAudio = this.mEngine.getMuteRemoteAllAudioStreams();
        LogUtil.i("RtcPhoneStateListener", "saveAudioState mMuteLocalAudio:" + this.mMuteLocalAudio + ", mMuteAllRemoteAudio:" + this.mMuteAllRemoteAudio);
    }

    private void onCallEnd() {
        boolean z;
        if (!this.mOnPhoneCallCount.compareAndSet(0, 0) && this.mOnPhoneCallCount.decrementAndGet() == 0 && this.mEngine != null) {
            LogUtil.d("RtcPhoneStateListener", "CustomPhoneStateListener onCallStateChanged END");
            restoreAudioState();
            if (!isHeadsetOn()) {
                Boolean bool = this.forceEnableSpeaker;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    Boolean bool2 = this.defaultRouter2Speaker;
                    if (bool2 != null) {
                        z = bool2.booleanValue();
                    } else {
                        z = this.isSpeakerphoneOn;
                    }
                }
                postDelay(new RTCPhoneStateListener$$Lambda$0(this, z), 1500);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class PhoneCallHandler extends Handler {
        static {
            Covode.recordClassIndex(100999);
        }

        private PhoneCallHandler(Looper looper) {
            super(looper);
        }

        public void doExec(Runnable runnable) {
            post(runnable);
        }

        /* synthetic */ PhoneCallHandler(Looper looper, AnonymousClass1 r2) {
            this(looper);
        }
    }

    public void setDefaultRouter2Speaker(boolean z) {
        this.defaultRouter2Speaker = Boolean.valueOf(z);
    }

    public void setSpeakerphoneOn(boolean z) {
        this.forceEnableSpeaker = Boolean.valueOf(z);
    }

    public static Context com_ss_bytertc_engine_livertc_RTCPhoneStateListener_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext2 = context.getApplicationContext();
        if (a.f107168c && applicationContext2 == null) {
            return a.f107166a;
        }
        return applicationContext2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$onCallEnd$0$RTCPhoneStateListener(boolean z) {
        AudioPlaybackDevice audioPlaybackDevice;
        LiveRTCEngine liveRTCEngine = this.mEngine;
        if (z) {
            audioPlaybackDevice = AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_SPEAKERPHONE;
        } else {
            audioPlaybackDevice = AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_EARPIECE;
        }
        liveRTCEngine.setAudioPlaybackDevice(audioPlaybackDevice);
    }

    public void onServiceStateChanged(ServiceState serviceState) {
        super.onServiceStateChanged(serviceState);
        LogUtil.d("RtcPhoneStateListener", "CustomPhoneStateListener onServiceStateChanged: ".concat(String.valueOf(serviceState)));
    }

    public static Looper register(Runnable runnable) {
        Looper looper;
        if (Looper.myLooper() != null) {
            looper = Looper.myLooper();
        } else {
            looper = null;
        }
        if (Looper.getMainLooper() != null) {
            looper = Looper.getMainLooper();
        }
        if (looper == null) {
            return null;
        }
        new PhoneCallHandler(looper, null).doExec(runnable);
        return looper;
    }

    public RTCPhoneStateListener(Context context, LiveRTCEngine liveRTCEngine) {
        this.applicationContext = com_ss_bytertc_engine_livertc_RTCPhoneStateListener_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
        this.mEngine = liveRTCEngine;
    }

    private static void postDelay(Runnable runnable, int i2) {
        Looper looper;
        if (Looper.myLooper() != null) {
            looper = Looper.myLooper();
        } else {
            looper = null;
        }
        if (Looper.getMainLooper() != null) {
            looper = Looper.getMainLooper();
        }
        if (looper != null) {
            new PhoneCallHandler(looper, null).postDelayed(runnable, (long) i2);
        }
    }

    public void onCallStateChanged(int i2, String str) {
        LogUtil.e("RtcPhoneStateListener", "CustomPhoneStateListener state: " + i2 + " incomingNumber: " + str);
        if (i2 == 0) {
            onCallEnd();
        } else if (i2 == 1) {
            onCallRinging();
        } else if (i2 == 2) {
            onCallStart();
        }
    }

    public static Object com_ss_bytertc_engine_livertc_RTCPhoneStateListener_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(8627);
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
                    MethodCollector.o(8627);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}

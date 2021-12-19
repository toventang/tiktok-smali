package com.bytedance.bae.router;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bae.base.BaeLogging;
import com.bytedance.bae.base.ContextUtils;
import com.bytedance.bae.router.controller.EventDispatcher;
import com.bytedance.bae.router.device.BluetoothHeadsetScoDeviceManager;
import com.bytedance.bae.router.device.EarpieceDeviceManager;
import com.bytedance.bae.router.device.SpeakerphoneDeviceManager;
import com.bytedance.bae.router.device.WiredHeadsetDeviceManager;
import com.bytedance.bae.webrtc.WebRtcAudioUtils;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

public class AudioRoutingController extends BaseAudioRoutingController {
    private BluetoothHeadsetScoDeviceManager mBTScoDeviceManager;
    private WeakReference<Context> mContext = new WeakReference<>(ContextUtils.getApplicationContext());
    private EarpieceDeviceManager mEarpieceDeviceManager;
    public EventHandler mEventHandler;
    private int mLastAudioRouting = -1;
    private long mNativeByteRtcEngine;
    public EventDispatcher mRoutingControl;
    private SpeakerphoneDeviceManager mSpeakerphoneDeviceManager;
    private WiredHeadsetDeviceManager mWiredHeadsetDeviceManager;

    static {
        Covode.recordClassIndex(15360);
    }

    public static int com_bytedance_bae_router_AudioRoutingController_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_bae_router_AudioRoutingController_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public String getAudioRouteDesc(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "Unknown" : "HeadsetBluetooth" : "Speakerphone" : "Earpiece" : "Headset" : "Default";
    }

    public int GetCurrentRouting() {
        return queryCurrentAudioRouting();
    }

    public void startMonitoring() {
        this.mRoutingControl.changeRouteState(1);
    }

    public void stopMonitoring() {
        this.mRoutingControl.changeRouteState(2);
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public boolean isBTHeadsetPlugged() {
        BluetoothHeadsetScoDeviceManager bluetoothHeadsetScoDeviceManager = this.mBTScoDeviceManager;
        if (bluetoothHeadsetScoDeviceManager != null) {
            return bluetoothHeadsetScoDeviceManager.isDevicePlugged();
        }
        return false;
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public boolean isWiredHeadsetPlugged() {
        WiredHeadsetDeviceManager wiredHeadsetDeviceManager = this.mWiredHeadsetDeviceManager;
        if (wiredHeadsetDeviceManager != null) {
            return wiredHeadsetDeviceManager.isActive();
        }
        return false;
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public AudioManager getAudioManager() {
        Context context = this.mContext.get();
        if (context == null) {
            return null;
        }
        return (AudioManager) com_bytedance_bae_router_AudioRoutingController_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, DataType.AUDIO);
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public void stopBtSco() {
        BluetoothHeadsetScoDeviceManager bluetoothHeadsetScoDeviceManager = this.mBTScoDeviceManager;
        if (bluetoothHeadsetScoDeviceManager != null) {
            bluetoothHeadsetScoDeviceManager.inactiveDevice();
            this.mBTScoDeviceManager.resetScoConnectionAttempts();
            this.mBTScoDeviceManager.cancelBluetoothSCOConnTimer();
        }
    }

    public void uninitialize() {
        BaeLogging.w("AudioRoutingController", "uninitialize");
        this.mWiredHeadsetDeviceManager.destory();
        this.mBTScoDeviceManager.destory();
        this.mLastAudioRouting = -1;
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public int queryCurrentAudioRouting() {
        if (this.mBTScoDeviceManager.isActive() || this.mBTScoDeviceManager.isDevicePlugged()) {
            return 4;
        }
        if (this.mWiredHeadsetDeviceManager.isActive()) {
            return 1;
        }
        if (this.mSpeakerphoneDeviceManager.isActive()) {
            return 3;
        }
        if (this.mEarpieceDeviceManager.isActive()) {
            return 2;
        }
        return 0;
    }

    public String GetSessionInfo() {
        AudioManager audioManager = getAudioManager();
        return "{ Audio State: audio_mode:" + WebRtcAudioUtils.modeToString(audioManager.getMode()) + ", has_mic:" + WebRtcAudioUtils.hasMicrophone() + ", mic_muted:" + audioManager.isMicrophoneMute() + ", music_active:" + audioManager.isMusicActive() + ", speakerphone:" + audioManager.isSpeakerphoneOn() + ", headset:" + audioManager.isWiredHeadsetOn() + ", bt_sco:" + audioManager.isBluetoothScoOn() + ", music_actived:" + audioManager.isMusicActive() + ", permission:" + WebRtcAudioUtils.isPermissionGranted() + " }";
    }

    public int initialize() {
        com_bytedance_bae_router_AudioRoutingController_com_ss_android_ugc_aweme_lancet_LogLancet_w("AudioRoutingController", "initialize begin");
        Context context = this.mContext.get();
        if (context == null) {
            com_bytedance_bae_router_AudioRoutingController_com_ss_android_ugc_aweme_lancet_LogLancet_e("AudioRoutingController", "context has been GCed");
            return -1;
        } else if (getAudioManager() == null) {
            com_bytedance_bae_router_AudioRoutingController_com_ss_android_ugc_aweme_lancet_LogLancet_e("AudioRoutingController", "invalid context: can't get AudioManager");
            return -1;
        } else {
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                this.mEventHandler = new EventHandler(myLooper);
                com_bytedance_bae_router_AudioRoutingController_com_ss_android_ugc_aweme_lancet_LogLancet_w("AudioRoutingController", "looper of mEventHandler is Looper.myLooper");
            } else {
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper != null) {
                    this.mEventHandler = new EventHandler(mainLooper);
                    com_bytedance_bae_router_AudioRoutingController_com_ss_android_ugc_aweme_lancet_LogLancet_w("AudioRoutingController", "looper of mEventHandler is Looper.getMainLooper");
                } else {
                    this.mEventHandler = null;
                    com_bytedance_bae_router_AudioRoutingController_com_ss_android_ugc_aweme_lancet_LogLancet_w("AudioRoutingController", "mEventHandler is null");
                }
            }
            this.mRoutingControl = new EventDispatcher(this);
            this.mSpeakerphoneDeviceManager = new SpeakerphoneDeviceManager(context, new AudioRoutingController$$Lambda$0(this));
            this.mEarpieceDeviceManager = new EarpieceDeviceManager(context, new AudioRoutingController$$Lambda$1(this));
            this.mWiredHeadsetDeviceManager = new WiredHeadsetDeviceManager(context, new WiredHeadsetDeviceManager.OnDeviceCallback() {
                /* class com.bytedance.bae.router.AudioRoutingController.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(15363);
                }

                @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.HotplugDeviceListener
                public void onDeviceOnline() {
                }

                @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.HotplugDeviceListener
                public void onDeviceOffline() {
                    AudioRoutingController.this.sendEvent(1, 0);
                }

                @Override // com.bytedance.bae.router.device.WiredHeadsetDeviceManager.OnDeviceCallback
                public void reportHeadsetType(int i2) {
                    if (i2 == 0 || i2 == 1 || i2 == 2) {
                        AudioRoutingController.this.sendEvent(1, 1);
                    }
                }

                @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.OnNotHotPlugableDeviceCallback
                public void onError(int i2, String str) {
                    BaeLogging.w("AudioRoutingController", "WiredHeadset error:" + i2 + " msg:" + str);
                    AudioRoutingController.this.resetAudioRouting(true);
                }
            });
            this.mBTScoDeviceManager = new BluetoothHeadsetScoDeviceManager(context, this.mEventHandler, new BluetoothHeadsetScoDeviceManager.OnBTScoDeviceCallback() {
                /* class com.bytedance.bae.router.AudioRoutingController.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(15364);
                }

                @Override // com.bytedance.bae.router.device.BluetoothHeadsetScoDeviceManager.OnBTScoDeviceCallback
                public void onScoConnected() {
                    BaeLogging.w("AudioRoutingController", "BTHeadset w/o mic connected");
                }

                @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.HotplugDeviceListener
                public void onDeviceOffline() {
                    BaeLogging.w("AudioRoutingController", "BTHeadset disconnected");
                    AudioRoutingController.this.sendEvent(2, 0);
                }

                @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.HotplugDeviceListener
                public void onDeviceOnline() {
                    BaeLogging.w("AudioRoutingController", "BTHeadset Device connected");
                    AudioRoutingController.this.sendEvent(2, 1);
                }

                @Override // com.bytedance.bae.router.device.BluetoothHeadsetScoDeviceManager.OnBTScoDeviceCallback
                public void onScoDisconnected() {
                    BaeLogging.w("AudioRoutingController", "BTHeadset w/o mic disconnected and post recovery task in 4s");
                    AudioRoutingController.this.mEventHandler.postDelayed(new Runnable() {
                        /* class com.bytedance.bae.router.AudioRoutingController.AnonymousClass2.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(15365);
                        }

                        public void run() {
                            AudioRoutingController.this.sendEvent(2, 0);
                        }
                    }, 4000);
                }

                @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.OnNotHotPlugableDeviceCallback
                public void onError(int i2, String str) {
                    BaeLogging.w("AudioRoutingController", "BTHeadset error:" + i2 + " msg:" + str);
                    AudioRoutingController.this.resetAudioRouting(true);
                }
            });
            com_bytedance_bae_router_AudioRoutingController_com_ss_android_ugc_aweme_lancet_LogLancet_w("AudioRoutingController", "initialize end");
            return 0;
        }
    }

    private static AudioRoutingController create(long j2) {
        return new AudioRoutingController(j2);
    }

    /* access modifiers changed from: package-private */
    public class EventHandler extends Handler {
        static {
            Covode.recordClassIndex(15366);
        }

        public void handleMessage(Message message) {
            AudioRoutingController.this.mRoutingControl.onEvent(message.what, message.arg1);
        }

        EventHandler(Looper looper) {
            super(looper);
        }
    }

    public AudioRoutingController(long j2) {
        this.mNativeByteRtcEngine = j2;
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public void setAudioRouting(int i2) {
        BaeLogging.w("AudioRoutingController", "set audio output routing from " + getAudioRouteDesc(queryCurrentAudioRouting()) + " to " + getAudioRouteDesc(i2) + " mLastAudioRouting:" + getAudioRouteDesc(this.mLastAudioRouting));
        if (4 == i2) {
            try {
                updateBluetoothSco(i2);
            } catch (Exception e2) {
                BaeLogging.e("AudioRoutingController", "set audio routing error : " + e2.toString());
            }
        } else {
            updateBluetoothSco(i2);
            if (1 == i2) {
                this.mWiredHeadsetDeviceManager.activeDevice();
            } else if (3 == i2) {
                this.mSpeakerphoneDeviceManager.activeDevice();
            } else {
                this.mEarpieceDeviceManager.activeDevice();
            }
        }
        int i3 = this.mLastAudioRouting;
        this.mLastAudioRouting = i2;
        if (i2 != i3) {
            notifyAudioRoutingChanged(i2, i3, "setAudioRouting");
        }
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public int updateBluetoothSco(int i2) {
        BaeLogging.w("AudioRoutingController", "updateBluetoothSco sco targetRouting:" + getAudioRouteDesc(i2) + " scoEnabled:" + getRoutingInfo().getBTScoEnabled());
        if (i2 != 4) {
            this.mBTScoDeviceManager.inactiveDevice();
            return 0;
        } else if (!getRoutingInfo().getBTScoEnabled()) {
            this.mBTScoDeviceManager.inactiveDevice();
            return 0;
        } else if (1 == this.mBTScoDeviceManager.getActiveState()) {
            return 0;
        } else {
            this.mBTScoDeviceManager.activeDevice();
            return 0;
        }
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public void resetAudioRouting(boolean z) {
        int i2 = 1;
        if (getRoutingInfo().getForceSpeakerphone() != 1 || !z) {
            if (this.mBTScoDeviceManager.isDevicePlugged()) {
                i2 = 4;
            } else if (!this.mWiredHeadsetDeviceManager.isDevicePlugged()) {
                if (getRoutingInfo().getForceSpeakerphone() == 0) {
                    i2 = 2;
                } else {
                    i2 = getRoutingInfo().getDefaultRouting();
                }
            }
            BaeLogging.w("AudioRoutingController", "reset audio routing, default routing: " + getAudioRouteDesc(getRoutingInfo().getDefaultRouting()) + ", current routing: " + getAudioRouteDesc(queryCurrentAudioRouting()) + ", target routing: " + getAudioRouteDesc(i2) + ", actual system routing: " + getAudioRouteDesc(queryCurrentAudioRouting()));
            if (queryCurrentAudioRouting() != i2 || this.mLastAudioRouting != i2 || i2 == 4) {
                setAudioRouting(i2);
                return;
            }
            return;
        }
        BaeLogging.w("AudioRoutingController", "reset(force) audio routing, default routing: " + getAudioRouteDesc(getRoutingInfo().getDefaultRouting()) + ", current routing: " + getAudioRouteDesc(queryCurrentAudioRouting()) + ", target routing: " + getAudioRouteDesc(3) + ", actual system routing:" + getAudioRouteDesc(queryCurrentAudioRouting()));
        if (queryCurrentAudioRouting() != 3) {
            setAudioRouting(3);
        }
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public void notifyAudioRoutingChanged(int i2, String str) {
        notifyAudioRoutingChanged(i2, this.mLastAudioRouting, str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$initialize$0$AudioRoutingController(int i2, String str) {
        BaeLogging.w("AudioRoutingController", "SpeakerphoneDevice error:" + i2 + " msg:" + str);
        resetAudioRouting(true);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$initialize$1$AudioRoutingController(int i2, String str) {
        BaeLogging.w("AudioRoutingController", "EarpieceDevice error:" + i2 + " msg:" + str);
        resetAudioRouting(true);
    }

    public void sendEvent(int i2, int i3) {
        BaeLogging.w("AudioRoutingController", "sendEvent: [" + i2 + "], extra arg: " + i3 + "... " + this.mEventHandler);
        EventHandler eventHandler = this.mEventHandler;
        if (eventHandler != null) {
            this.mEventHandler.sendMessage(eventHandler.obtainMessage(i2, i3, 0));
        }
    }

    public static Object com_bytedance_bae_router_AudioRoutingController_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(2582);
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
                    MethodCollector.o(2582);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public void notifyAudioRoutingChanged(int i2, int i3, String str) {
        MethodCollector.i(2587);
        ByteAudioRouterNativeFunctions.nativeOnAudioRoutingChanged(this.mNativeByteRtcEngine, i2, i3, str);
        MethodCollector.o(2587);
    }
}

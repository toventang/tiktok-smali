package com.bytedance.bae.webrtc;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.core.content.b;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.bae.base.BaeLogging;
import com.bytedance.bae.base.ContextUtils;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.playerkit.model.v;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public final class WebRtcAudioUtils {
    private static final String[] BLACKLISTED_AEC_MODELS = new String[0];
    private static final String[] BLACKLISTED_NS_MODELS = new String[0];
    private static final String[] BLACKLISTED_OPEN_SL_ES_MODELS = {"SM-G9650", "SM-G9750", "SM-N9600", "V1962A"};
    private static int defaultSampleRateHz = 16000;
    private static boolean isDefaultSampleRateOverridden;
    private static boolean useWebRtcBasedAcousticEchoCanceler;
    private static boolean useWebRtcBasedNoiseSuppressor;

    private static String deviceTypeToString(int i2) {
        switch (i2) {
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return "TYPE_LINE_ANALOG";
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return "TYPE_LINE_DIGITAL";
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return "TYPE_BLUETOOTH_SCO";
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                return "TYPE_BLUETOOTH_A2DP";
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                return "TYPE_HDMI";
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                return "TYPE_HDMI_ARC";
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                return "TYPE_USB_DEVICE";
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                return "TYPE_USB_ACCESSORY";
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                return "TYPE_DOCK";
            case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                return "TYPE_FM";
            case 15:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case 17:
                return "TYPE_TV_TUNER";
            case LiveRechargeAgeThresholdSetting.DEFAULT:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case v.U /*{ENCODED_INT: 20}*/:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            default:
                return "TYPE_UNKNOWN";
        }
    }

    public static boolean isAutomaticGainControlSupported() {
        return false;
    }

    public static String modeToString(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION" : "MODE_IN_CALL" : "MODE_RINGTONE" : "MODE_NORMAL";
    }

    private static String streamTypeToString(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION" : "STREAM_ALARM" : "STREAM_MUSIC" : "STREAM_RING" : "STREAM_SYSTEM" : "STREAM_VOICE_CALL";
    }

    public static List<String> getBlackListedModelsForAecUsage() {
        return Arrays.asList(BLACKLISTED_AEC_MODELS);
    }

    public static List<String> getBlackListedModelsForNsUsage() {
        return Arrays.asList(BLACKLISTED_NS_MODELS);
    }

    public static String getProductBrand() {
        return getSystemProperty("ro.product.brand");
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    public static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    public static boolean deviceIsBlacklistedForOpenSLESUsage() {
        return Arrays.asList(BLACKLISTED_OPEN_SL_ES_MODELS).contains(Build.MODEL);
    }

    public static boolean hasMicrophone() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    public static boolean isPermissionGranted() {
        if (b.a(ContextUtils.getApplicationContext(), "android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        return false;
    }

    public static synchronized int getDefaultSampleRateHz() {
        int i2;
        synchronized (WebRtcAudioUtils.class) {
            MethodCollector.i(4962);
            i2 = defaultSampleRateHz;
            MethodCollector.o(4962);
        }
        return i2;
    }

    public static synchronized boolean isDefaultSampleRateOverridden() {
        boolean z;
        synchronized (WebRtcAudioUtils.class) {
            MethodCollector.i(4961);
            z = isDefaultSampleRateOverridden;
            MethodCollector.o(4961);
        }
        return z;
    }

    public static boolean runningOnEmulator() {
        if (!Build.HARDWARE.equals("goldfish") || !Build.BRAND.startsWith("generic_")) {
            return false;
        }
        return true;
    }

    public static synchronized boolean useWebRtcBasedAcousticEchoCanceler() {
        boolean z;
        synchronized (WebRtcAudioUtils.class) {
            MethodCollector.i(4803);
            if (useWebRtcBasedAcousticEchoCanceler) {
                BaeLogging.w("WebRtcAudioUtils", "Overriding default behavior; now using WebRTC AEC!");
            }
            z = useWebRtcBasedAcousticEchoCanceler;
            MethodCollector.o(4803);
        }
        return z;
    }

    public static synchronized boolean useWebRtcBasedAutomaticGainControl() {
        synchronized (WebRtcAudioUtils.class) {
            MethodCollector.i(4806);
            MethodCollector.o(4806);
        }
        return true;
    }

    public static synchronized boolean useWebRtcBasedNoiseSuppressor() {
        boolean z;
        synchronized (WebRtcAudioUtils.class) {
            MethodCollector.i(4805);
            if (useWebRtcBasedNoiseSuppressor) {
                BaeLogging.w("WebRtcAudioUtils", "Overriding default behavior; now using WebRTC NS!");
            }
            z = useWebRtcBasedNoiseSuppressor;
            MethodCollector.o(4805);
        }
        return z;
    }

    static {
        Covode.recordClassIndex(15419);
    }

    public static String getThreadInfo() {
        return "@[name=" + Thread.currentThread().getName() + ", id=" + Thread.currentThread().getId() + "]";
    }

    private static String getVivoRomVersion() {
        String systemProperty = getSystemProperty("ro.vivo.os.build.display.id");
        return systemProperty + "_" + getSystemProperty("ro.vivo.product.version");
    }

    private static boolean isVolumeFixed(AudioManager audioManager) {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        return audioManager.isVolumeFixed();
    }

    public static String getRomVersion(String str) {
        if (str.toLowerCase().equals("vivo")) {
            return getVivoRomVersion();
        }
        return "";
    }

    static void logAudioState(String str) {
        logDeviceInfo(str);
        AudioManager audioManager = (AudioManager) com_bytedance_bae_webrtc_WebRtcAudioUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(ContextUtils.getApplicationContext(), DataType.AUDIO);
        logAudioStateBasic(str, audioManager);
        logAudioStateVolume(str, audioManager);
    }

    public static synchronized void setDefaultSampleRateHz(int i2) {
        synchronized (WebRtcAudioUtils.class) {
            MethodCollector.i(4928);
            isDefaultSampleRateOverridden = true;
            defaultSampleRateHz = i2;
            MethodCollector.o(4928);
        }
    }

    public static synchronized void setWebRtcBasedAcousticEchoCanceler(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            MethodCollector.i(4796);
            useWebRtcBasedAcousticEchoCanceler = z;
            MethodCollector.o(4796);
        }
    }

    public static synchronized void setWebRtcBasedAutomaticGainControl(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            MethodCollector.i(4801);
            BaeLogging.w("WebRtcAudioUtils", "setWebRtcBasedAutomaticGainControl() is deprecated");
            MethodCollector.o(4801);
        }
    }

    public static synchronized void setWebRtcBasedNoiseSuppressor(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            MethodCollector.i(4798);
            useWebRtcBasedNoiseSuppressor = z;
            MethodCollector.o(4798);
        }
    }

    private static String getSystemProperty(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    static void logDeviceInfo(String str) {
        BaeLogging.i(str, "Android SDK: " + Build.VERSION.SDK_INT + ", Release: " + Build.VERSION.RELEASE + ", Brand: " + Build.BRAND + ", Device: " + Build.DEVICE + ", Id: " + Build.ID + ", Hardware: " + Build.HARDWARE + ", Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", Product: " + Build.PRODUCT);
    }

    public static Object com_bytedance_bae_webrtc_WebRtcAudioUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(5008);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
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
                    MethodCollector.o(5008);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static void logAudioStateBasic(String str, AudioManager audioManager) {
        BaeLogging.i(str, "Audio State: audio mode: " + modeToString(audioManager.getMode()) + ", has mic: " + hasMicrophone() + ", mic muted: " + audioManager.isMicrophoneMute() + ", music active: " + audioManager.isMusicActive() + ", speakerphone: " + audioManager.isSpeakerphoneOn() + ", BT SCO: " + audioManager.isBluetoothScoOn());
    }

    private static void logAudioStateVolume(String str, AudioManager audioManager) {
        int[] iArr = {0, 3, 2, 4, 5, 1};
        BaeLogging.i(str, "Audio State: ");
        boolean isVolumeFixed = isVolumeFixed(audioManager);
        BaeLogging.i(str, "  fixed volume=".concat(String.valueOf(isVolumeFixed)));
        if (!isVolumeFixed) {
            int i2 = 0;
            do {
                int i3 = iArr[i2];
                StringBuilder sb = new StringBuilder();
                sb.append("  " + streamTypeToString(i3) + ": ");
                sb.append("volume=").append(audioManager.getStreamVolume(i3));
                sb.append(", max=").append(audioManager.getStreamMaxVolume(i3));
                logIsStreamMute(str, audioManager, i3, sb);
                BaeLogging.i(str, sb.toString());
                i2++;
            } while (i2 < 6);
        }
    }

    private static void logAudioDeviceInfo(String str, AudioManager audioManager) {
        String str2;
        if (Build.VERSION.SDK_INT >= 23) {
            AudioDeviceInfo[] devices = audioManager.getDevices(3);
            if (devices.length != 0) {
                BaeLogging.i(str, "Audio Devices: ");
                for (AudioDeviceInfo audioDeviceInfo : devices) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("  ").append(deviceTypeToString(audioDeviceInfo.getType()));
                    if (audioDeviceInfo.isSource()) {
                        str2 = "(in): ";
                    } else {
                        str2 = "(out): ";
                    }
                    sb.append(str2);
                    if (audioDeviceInfo.getChannelCounts().length > 0) {
                        sb.append("channels=").append(Arrays.toString(audioDeviceInfo.getChannelCounts()));
                        sb.append(", ");
                    }
                    if (audioDeviceInfo.getEncodings().length > 0) {
                        sb.append("encodings=").append(Arrays.toString(audioDeviceInfo.getEncodings()));
                        sb.append(", ");
                    }
                    if (audioDeviceInfo.getSampleRates().length > 0) {
                        sb.append("sample rates=").append(Arrays.toString(audioDeviceInfo.getSampleRates()));
                        sb.append(", ");
                    }
                    sb.append("id=").append(audioDeviceInfo.getId());
                    BaeLogging.i(str, sb.toString());
                }
            }
        }
    }

    private static void logIsStreamMute(String str, AudioManager audioManager, int i2, StringBuilder sb) {
        if (Build.VERSION.SDK_INT >= 23) {
            sb.append(", muted=").append(audioManager.isStreamMute(i2));
        }
    }
}

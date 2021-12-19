package com.ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public enum LocalAudioStreamError {
    LOCAL_AUDIO_STREAM_ERROR_OK(0),
    LOCAL_AUDIO_STREAM_ERROR_FAILURE(1),
    LOCAL_AUDIO_STREAM_ERROR_DEVICE_NO_PERMISSION(2),
    LOCAL_AUDIO_STREAM_ERROR_DEVICE_BUSY(3),
    LOCAL_AUDIO_STREAM_ERROR_RECORD_FAILURE(4),
    LOCAL_AUDIO_STREAM_ERROR_ENCODE_FAILURE(5),
    LOCAL_AUDIO_STREAM_ERROR_NO_RECORDING_DEVICE(6);
    
    private int value;

    public final int value() {
        return this.value;
    }

    public final String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamError[ordinal()]) {
            case 1:
                return "kLocalAudioStreamErrorOk";
            case 2:
                return "kLocalAudioStreamErrorFailure";
            case 3:
                return "kLocalAudioStreamErrorDeviceNoPermission";
            case 4:
                return "kLocalAudioStreamErrorDeviceBusy";
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return "kLocalAudioStreamErrorRecordFailure";
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return "kLocalAudioStreamErrorEncodeFailure";
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return "kLocalAudioStreamErrorNoRecordingDevice";
            default:
                return "";
        }
    }

    /* renamed from: com.ss.bytertc.engine.data.LocalAudioStreamError$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamError;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 100854(0x189f6, float:1.41327E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.bytertc.engine.data.LocalAudioStreamError[] r0 = com.ss.bytertc.engine.data.LocalAudioStreamError.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.bytertc.engine.data.LocalAudioStreamError.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamError = r2
                com.ss.bytertc.engine.data.LocalAudioStreamError r0 = com.ss.bytertc.engine.data.LocalAudioStreamError.LOCAL_AUDIO_STREAM_ERROR_OK     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.bytertc.engine.data.LocalAudioStreamError.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamError     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.bytertc.engine.data.LocalAudioStreamError r0 = com.ss.bytertc.engine.data.LocalAudioStreamError.LOCAL_AUDIO_STREAM_ERROR_FAILURE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.bytertc.engine.data.LocalAudioStreamError.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamError     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.bytertc.engine.data.LocalAudioStreamError r0 = com.ss.bytertc.engine.data.LocalAudioStreamError.LOCAL_AUDIO_STREAM_ERROR_DEVICE_NO_PERMISSION     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.bytertc.engine.data.LocalAudioStreamError.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamError     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.bytertc.engine.data.LocalAudioStreamError r0 = com.ss.bytertc.engine.data.LocalAudioStreamError.LOCAL_AUDIO_STREAM_ERROR_DEVICE_BUSY     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.ss.bytertc.engine.data.LocalAudioStreamError.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamError     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.ss.bytertc.engine.data.LocalAudioStreamError r0 = com.ss.bytertc.engine.data.LocalAudioStreamError.LOCAL_AUDIO_STREAM_ERROR_RECORD_FAILURE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r2 = com.ss.bytertc.engine.data.LocalAudioStreamError.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamError     // Catch:{ NoSuchFieldError -> 0x004f }
                com.ss.bytertc.engine.data.LocalAudioStreamError r0 = com.ss.bytertc.engine.data.LocalAudioStreamError.LOCAL_AUDIO_STREAM_ERROR_ENCODE_FAILURE     // Catch:{ NoSuchFieldError -> 0x004f }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r2 = com.ss.bytertc.engine.data.LocalAudioStreamError.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamError     // Catch:{ NoSuchFieldError -> 0x005a }
                com.ss.bytertc.engine.data.LocalAudioStreamError r0 = com.ss.bytertc.engine.data.LocalAudioStreamError.LOCAL_AUDIO_STREAM_ERROR_NO_RECORDING_DEVICE     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r0 = 7
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.data.LocalAudioStreamError.AnonymousClass1.<clinit>():void");
        }
    }

    static {
        Covode.recordClassIndex(100853);
    }

    public static LocalAudioStreamError fromId(int i2) {
        LocalAudioStreamError[] values = values();
        for (LocalAudioStreamError localAudioStreamError : values) {
            if (localAudioStreamError.value() == i2) {
                return localAudioStreamError;
            }
        }
        return null;
    }

    private LocalAudioStreamError(int i2) {
        this.value = i2;
    }
}

package com.ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public enum AudioMixingError {
    AUDIO_MIXING_ERROR_OK(0),
    AUDIO_MIXING_ERROR_PRELOAD_FAILED(1),
    AUDIO_MIXING_ERROR_START_FAILED(2),
    AUDIO_MIXING_ERROR_ID_NOT_FOUND(3),
    AUDIO_MIXING_ERROR_SET_POSITION_FAILED(4),
    AUDIO_MIXING_ERROR_INVALID_VOLUME(5),
    AUDIO_MIXING_ERROR_LOAD_CONFLICT(6);
    
    private int value;

    public final int value() {
        return this.value;
    }

    public final String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioMixingError[ordinal()]) {
            case 1:
                return "AUDIO_MIXING_ERROR_OK";
            case 2:
                return "AUDIO_MIXING_ERROR_PRELOAD_FAILED";
            case 3:
                return "AUDIO_MIXING_ERROR_START_FAILED";
            case 4:
                return "AUDIO_MIXING_ERROR_ID_NOT_FOUND";
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return "AUDIO_MIXING_ERROR_SET_POSITION_FAILED";
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return "AUDIO_MIXING_ERROR_INVALID_VOLUME";
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return "AUDIO_MIXING_ERROR_LOAD_CONFLICT";
            default:
                return "";
        }
    }

    /* renamed from: com.ss.bytertc.engine.data.AudioMixingError$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioMixingError;

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
                r0 = 100842(0x189ea, float:1.4131E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.bytertc.engine.data.AudioMixingError[] r0 = com.ss.bytertc.engine.data.AudioMixingError.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.bytertc.engine.data.AudioMixingError.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioMixingError = r2
                com.ss.bytertc.engine.data.AudioMixingError r0 = com.ss.bytertc.engine.data.AudioMixingError.AUDIO_MIXING_ERROR_OK     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.bytertc.engine.data.AudioMixingError.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioMixingError     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.bytertc.engine.data.AudioMixingError r0 = com.ss.bytertc.engine.data.AudioMixingError.AUDIO_MIXING_ERROR_PRELOAD_FAILED     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.bytertc.engine.data.AudioMixingError.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioMixingError     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.bytertc.engine.data.AudioMixingError r0 = com.ss.bytertc.engine.data.AudioMixingError.AUDIO_MIXING_ERROR_START_FAILED     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.bytertc.engine.data.AudioMixingError.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioMixingError     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.bytertc.engine.data.AudioMixingError r0 = com.ss.bytertc.engine.data.AudioMixingError.AUDIO_MIXING_ERROR_ID_NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.ss.bytertc.engine.data.AudioMixingError.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioMixingError     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.ss.bytertc.engine.data.AudioMixingError r0 = com.ss.bytertc.engine.data.AudioMixingError.AUDIO_MIXING_ERROR_SET_POSITION_FAILED     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r2 = com.ss.bytertc.engine.data.AudioMixingError.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioMixingError     // Catch:{ NoSuchFieldError -> 0x004f }
                com.ss.bytertc.engine.data.AudioMixingError r0 = com.ss.bytertc.engine.data.AudioMixingError.AUDIO_MIXING_ERROR_INVALID_VOLUME     // Catch:{ NoSuchFieldError -> 0x004f }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r2 = com.ss.bytertc.engine.data.AudioMixingError.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioMixingError     // Catch:{ NoSuchFieldError -> 0x005a }
                com.ss.bytertc.engine.data.AudioMixingError r0 = com.ss.bytertc.engine.data.AudioMixingError.AUDIO_MIXING_ERROR_LOAD_CONFLICT     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r0 = 7
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.data.AudioMixingError.AnonymousClass1.<clinit>():void");
        }
    }

    static {
        Covode.recordClassIndex(100841);
    }

    public static AudioMixingError fromId(int i2) {
        AudioMixingError[] values = values();
        for (AudioMixingError audioMixingError : values) {
            if (audioMixingError.value() == i2) {
                return audioMixingError;
            }
        }
        return null;
    }

    private AudioMixingError(int i2) {
        this.value = i2;
    }
}

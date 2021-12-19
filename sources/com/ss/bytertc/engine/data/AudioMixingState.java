package com.ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public enum AudioMixingState {
    AUDIO_MIXING_STATE_PRELOADED(0),
    AUDIO_MIXING_STATE_PLAYING(1),
    AUDIO_MIXING_STATE_PAUSED(2),
    AUDIO_MIXING_STATE_STOPPED(3),
    AUDIO_MIXING_STATE_FAILED(4),
    AUDIO_MIXING_STATE_FINISHED(5);
    
    private int value;

    public final int value() {
        return this.value;
    }

    public final String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioMixingState[ordinal()]) {
            case 1:
                return "AUDIO_MIXING_STATE_PRELOADED";
            case 2:
                return "AUDIO_MIXING_STATE_PLAYING";
            case 3:
                return "AUDIO_MIXING_STATE_PAUSED";
            case 4:
                return "AUDIO_MIXING_STATE_STOPPED";
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return "AUDIO_MIXING_STATE_FAILED";
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return "AUDIO_MIXING_STATE_FINISHED";
            default:
                return "";
        }
    }

    /* renamed from: com.ss.bytertc.engine.data.AudioMixingState$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioMixingState;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 100844(0x189ec, float:1.41313E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.bytertc.engine.data.AudioMixingState[] r0 = com.ss.bytertc.engine.data.AudioMixingState.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.bytertc.engine.data.AudioMixingState.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioMixingState = r2
                com.ss.bytertc.engine.data.AudioMixingState r0 = com.ss.bytertc.engine.data.AudioMixingState.AUDIO_MIXING_STATE_PRELOADED     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.bytertc.engine.data.AudioMixingState.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioMixingState     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.bytertc.engine.data.AudioMixingState r0 = com.ss.bytertc.engine.data.AudioMixingState.AUDIO_MIXING_STATE_PLAYING     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.bytertc.engine.data.AudioMixingState.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioMixingState     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.bytertc.engine.data.AudioMixingState r0 = com.ss.bytertc.engine.data.AudioMixingState.AUDIO_MIXING_STATE_PAUSED     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.bytertc.engine.data.AudioMixingState.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioMixingState     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.bytertc.engine.data.AudioMixingState r0 = com.ss.bytertc.engine.data.AudioMixingState.AUDIO_MIXING_STATE_STOPPED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.ss.bytertc.engine.data.AudioMixingState.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioMixingState     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.ss.bytertc.engine.data.AudioMixingState r0 = com.ss.bytertc.engine.data.AudioMixingState.AUDIO_MIXING_STATE_FAILED     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r2 = com.ss.bytertc.engine.data.AudioMixingState.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioMixingState     // Catch:{ NoSuchFieldError -> 0x004f }
                com.ss.bytertc.engine.data.AudioMixingState r0 = com.ss.bytertc.engine.data.AudioMixingState.AUDIO_MIXING_STATE_FINISHED     // Catch:{ NoSuchFieldError -> 0x004f }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.data.AudioMixingState.AnonymousClass1.<clinit>():void");
        }
    }

    static {
        Covode.recordClassIndex(100843);
    }

    public static AudioMixingState fromId(int i2) {
        AudioMixingState[] values = values();
        for (AudioMixingState audioMixingState : values) {
            if (audioMixingState.value() == i2) {
                return audioMixingState;
            }
        }
        return null;
    }

    private AudioMixingState(int i2) {
        this.value = i2;
    }
}

package com.ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

public enum LocalAudioStreamState {
    LOCAL_AUDIO_STREAM_STATE_STOPPED(0),
    LOCAL_AUDIO_STREAM_STATE_RECORDING(1),
    LOCAL_AUDIO_STREAM_STATE_ENCODING(2),
    LOCAL_AUDIO_STREAM_STATE_FAILED(3);
    
    private int value;

    public final int value() {
        return this.value;
    }

    /* renamed from: com.ss.bytertc.engine.data.LocalAudioStreamState$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamState;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 100856(0x189f8, float:1.4133E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.bytertc.engine.data.LocalAudioStreamState[] r0 = com.ss.bytertc.engine.data.LocalAudioStreamState.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.bytertc.engine.data.LocalAudioStreamState.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamState = r2
                com.ss.bytertc.engine.data.LocalAudioStreamState r0 = com.ss.bytertc.engine.data.LocalAudioStreamState.LOCAL_AUDIO_STREAM_STATE_STOPPED     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.bytertc.engine.data.LocalAudioStreamState.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamState     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.bytertc.engine.data.LocalAudioStreamState r0 = com.ss.bytertc.engine.data.LocalAudioStreamState.LOCAL_AUDIO_STREAM_STATE_RECORDING     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.bytertc.engine.data.LocalAudioStreamState.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamState     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.bytertc.engine.data.LocalAudioStreamState r0 = com.ss.bytertc.engine.data.LocalAudioStreamState.LOCAL_AUDIO_STREAM_STATE_ENCODING     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.bytertc.engine.data.LocalAudioStreamState.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamState     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.bytertc.engine.data.LocalAudioStreamState r0 = com.ss.bytertc.engine.data.LocalAudioStreamState.LOCAL_AUDIO_STREAM_STATE_FAILED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.data.LocalAudioStreamState.AnonymousClass1.<clinit>():void");
        }
    }

    static {
        Covode.recordClassIndex(100855);
    }

    public final String toString() {
        int i2 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamState[ordinal()];
        if (i2 == 1) {
            return "kLocalAudioStreamStateStopped";
        }
        if (i2 == 2) {
            return "kLocalAudioStreamStateRecording";
        }
        if (i2 == 3) {
            return "kLocalAudioStreamStateEncoding";
        }
        if (i2 != 4) {
            return "";
        }
        return "kLocalAudioStreamStateFailed";
    }

    public static LocalAudioStreamState fromId(int i2) {
        LocalAudioStreamState[] values = values();
        for (LocalAudioStreamState localAudioStreamState : values) {
            if (localAudioStreamState.value() == i2) {
                return localAudioStreamState;
            }
        }
        return null;
    }

    private LocalAudioStreamState(int i2) {
        this.value = i2;
    }
}

package com.ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

public enum RemoteAudioState {
    REMOTE_AUDIO_STATE_STOPPED(0),
    REMOTE_AUDIO_STATE_STARTING(1),
    REMOTE_AUDIO_STATE_DECODING(2),
    REMOTE_AUDIO_STATE_FROZEN(3),
    REMOTE_AUDIO_STATE_FAILED(4);
    
    private int value;

    public final int value() {
        return this.value;
    }

    public final String toString() {
        int i2 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState[ordinal()];
        if (i2 == 1) {
            return "kRemoteAudioStateStopped";
        }
        if (i2 == 2) {
            return "kRemoteAudioStateStarting";
        }
        if (i2 == 3) {
            return "kRemoteAudioStateDecoding";
        }
        if (i2 == 4) {
            return "kRemoteAudioStateFrozen";
        }
        if (i2 != 5) {
            return "";
        }
        return "kRemoteAudioStateFailed";
    }

    /* renamed from: com.ss.bytertc.engine.data.RemoteAudioState$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 100868(0x18a04, float:1.41346E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.bytertc.engine.data.RemoteAudioState[] r0 = com.ss.bytertc.engine.data.RemoteAudioState.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.bytertc.engine.data.RemoteAudioState.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState = r2
                com.ss.bytertc.engine.data.RemoteAudioState r0 = com.ss.bytertc.engine.data.RemoteAudioState.REMOTE_AUDIO_STATE_STOPPED     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.bytertc.engine.data.RemoteAudioState.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.bytertc.engine.data.RemoteAudioState r0 = com.ss.bytertc.engine.data.RemoteAudioState.REMOTE_AUDIO_STATE_STARTING     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.bytertc.engine.data.RemoteAudioState.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.bytertc.engine.data.RemoteAudioState r0 = com.ss.bytertc.engine.data.RemoteAudioState.REMOTE_AUDIO_STATE_DECODING     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.bytertc.engine.data.RemoteAudioState.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.bytertc.engine.data.RemoteAudioState r0 = com.ss.bytertc.engine.data.RemoteAudioState.REMOTE_AUDIO_STATE_FROZEN     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.ss.bytertc.engine.data.RemoteAudioState.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.ss.bytertc.engine.data.RemoteAudioState r0 = com.ss.bytertc.engine.data.RemoteAudioState.REMOTE_AUDIO_STATE_FAILED     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.data.RemoteAudioState.AnonymousClass1.<clinit>():void");
        }
    }

    static {
        Covode.recordClassIndex(100867);
    }

    public static RemoteAudioState fromId(int i2) {
        RemoteAudioState[] values = values();
        for (RemoteAudioState remoteAudioState : values) {
            if (remoteAudioState.value() == i2) {
                return remoteAudioState;
            }
        }
        return null;
    }

    private RemoteAudioState(int i2) {
        this.value = i2;
    }
}

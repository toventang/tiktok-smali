package com.ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

public enum AudioMixingType {
    AUDIO_MIXING_TYPE_PLAYOUT(0),
    AUDIO_MIXING_TYPE_PUBLISH(1),
    AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH(2);
    
    private int value;

    public final int value() {
        return this.value;
    }

    public final String toString() {
        int i2 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioMixingType[ordinal()];
        if (i2 == 1) {
            return "AUDIO_MIXING_TYPE_PLAYOUT";
        }
        if (i2 == 2) {
            return "AUDIO_MIXING_TYPE_PUBLISH";
        }
        if (i2 != 3) {
            return "";
        }
        return "AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH";
    }

    /* renamed from: com.ss.bytertc.engine.data.AudioMixingType$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioMixingType;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        static {
            /*
                r0 = 100846(0x189ee, float:1.41315E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.bytertc.engine.data.AudioMixingType[] r0 = com.ss.bytertc.engine.data.AudioMixingType.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.bytertc.engine.data.AudioMixingType.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioMixingType = r2
                com.ss.bytertc.engine.data.AudioMixingType r0 = com.ss.bytertc.engine.data.AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.bytertc.engine.data.AudioMixingType.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioMixingType     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.bytertc.engine.data.AudioMixingType r0 = com.ss.bytertc.engine.data.AudioMixingType.AUDIO_MIXING_TYPE_PUBLISH     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.bytertc.engine.data.AudioMixingType.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioMixingType     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.bytertc.engine.data.AudioMixingType r0 = com.ss.bytertc.engine.data.AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.data.AudioMixingType.AnonymousClass1.<clinit>():void");
        }
    }

    static {
        Covode.recordClassIndex(100845);
    }

    public static AudioMixingType fromId(int i2) {
        AudioMixingType[] values = values();
        for (AudioMixingType audioMixingType : values) {
            if (audioMixingType.value() == i2) {
                return audioMixingType;
            }
        }
        return null;
    }

    private AudioMixingType(int i2) {
        this.value = i2;
    }
}

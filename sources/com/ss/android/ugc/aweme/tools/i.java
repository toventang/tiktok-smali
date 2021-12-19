package com.ss.android.ugc.aweme.tools;

import com.bytedance.covode.number.Covode;

public enum i {
    EPIC {
        @Override // com.ss.android.ugc.aweme.tools.i
        public final String description() {
            return "slowest";
        }

        @Override // com.ss.android.ugc.aweme.tools.i
        public final float value() {
            return 0.333333f;
        }
    },
    SLOW {
        @Override // com.ss.android.ugc.aweme.tools.i
        public final String description() {
            return "slower";
        }

        @Override // com.ss.android.ugc.aweme.tools.i
        public final float value() {
            return 0.5f;
        }
    },
    NORMAL {
        @Override // com.ss.android.ugc.aweme.tools.i
        public final String description() {
            return "normal";
        }

        @Override // com.ss.android.ugc.aweme.tools.i
        public final float value() {
            return 1.0f;
        }
    },
    STORY_BOOM {
        @Override // com.ss.android.ugc.aweme.tools.i
        public final String description() {
            return "story_boom";
        }

        @Override // com.ss.android.ugc.aweme.tools.i
        public final float value() {
            return 1.5f;
        }
    },
    FAST {
        @Override // com.ss.android.ugc.aweme.tools.i
        public final String description() {
            return "faster";
        }

        @Override // com.ss.android.ugc.aweme.tools.i
        public final float value() {
            return 2.0f;
        }
    },
    LAPSE {
        @Override // com.ss.android.ugc.aweme.tools.i
        public final String description() {
            return "fastest";
        }

        @Override // com.ss.android.ugc.aweme.tools.i
        public final float value() {
            return 3.0f;
        }
    };

    public abstract String description();

    public abstract float value();

    public String toString() {
        return description();
    }

    static {
        Covode.recordClassIndex(91594);
    }

    public static i fromValue(float f2) {
        i iVar = EPIC;
        if (f2 == iVar.value()) {
            return iVar;
        }
        i iVar2 = SLOW;
        if (f2 == iVar2.value()) {
            return iVar2;
        }
        i iVar3 = NORMAL;
        if (f2 == iVar3.value()) {
            return iVar3;
        }
        i iVar4 = FAST;
        if (f2 == iVar4.value()) {
            return iVar4;
        }
        i iVar5 = LAPSE;
        if (f2 == iVar5.value()) {
            return iVar5;
        }
        i iVar6 = STORY_BOOM;
        if (f2 == iVar6.value()) {
            return iVar6;
        }
        return null;
    }

    /* synthetic */ i(byte b2) {
        this();
    }
}

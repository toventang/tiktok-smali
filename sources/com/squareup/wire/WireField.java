package com.squareup.wire;

import com.bytedance.covode.number.Covode;

public @interface WireField {
    static {
        Covode.recordClassIndex(36138);
    }

    String adapter();

    String keyAdapter() default "";

    Label label() default Label.OPTIONAL;

    boolean redacted() default false;

    int tag();

    public enum Label {
        REQUIRED,
        OPTIONAL,
        REPEATED,
        ONE_OF,
        PACKED;

        /* access modifiers changed from: package-private */
        public final boolean isOneOf() {
            if (this == ONE_OF) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final boolean isPacked() {
            if (this == PACKED) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final boolean isRepeated() {
            if (this == REPEATED || this == PACKED) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(36139);
        }
    }
}

package com.facebook.common.k;

import com.bytedance.covode.number.Covode;

public enum f {
    YES,
    NO,
    UNSET;

    public final boolean isSet() {
        if (this != UNSET) {
            return true;
        }
        return false;
    }

    public final int getDbValue() {
        int i2 = AnonymousClass1.f47134a[ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                return 3;
            }
        }
        return i3;
    }

    /* renamed from: com.facebook.common.k.f$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f47134a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 28681(0x7009, float:4.019E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.facebook.common.k.f[] r0 = com.facebook.common.k.f.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.common.k.f.AnonymousClass1.f47134a = r2
                com.facebook.common.k.f r0 = com.facebook.common.k.f.YES     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.common.k.f.AnonymousClass1.f47134a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.facebook.common.k.f r0 = com.facebook.common.k.f.NO     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.facebook.common.k.f.AnonymousClass1.f47134a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.facebook.common.k.f r0 = com.facebook.common.k.f.UNSET     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.k.f.AnonymousClass1.<clinit>():void");
        }
    }

    static {
        Covode.recordClassIndex(28680);
    }

    public final boolean asBoolean() {
        int i2 = AnonymousClass1.f47134a[ordinal()];
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2) {
            return false;
        }
        if (i2 != 3) {
            throw new IllegalStateException("Unrecognized TriState value: ".concat(String.valueOf(this)));
        }
        throw new IllegalStateException("No boolean equivalent for UNSET");
    }

    public final Boolean asBooleanObject() {
        int i2 = AnonymousClass1.f47134a[ordinal()];
        if (i2 == 1) {
            return Boolean.TRUE;
        }
        if (i2 == 2) {
            return Boolean.FALSE;
        }
        if (i2 == 3) {
            return null;
        }
        throw new IllegalStateException("Unrecognized TriState value: ".concat(String.valueOf(this)));
    }

    public static f valueOf(boolean z) {
        if (z) {
            return YES;
        }
        return NO;
    }

    public static f fromDbValue(int i2) {
        if (i2 == 1) {
            return YES;
        }
        if (i2 != 2) {
            return UNSET;
        }
        return NO;
    }

    public static f valueOf(Boolean bool) {
        if (bool != null) {
            return valueOf(bool.booleanValue());
        }
        return UNSET;
    }

    public final boolean asBoolean(boolean z) {
        int i2 = AnonymousClass1.f47134a[ordinal()];
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2) {
            return false;
        }
        if (i2 == 3) {
            return z;
        }
        throw new IllegalStateException("Unrecognized TriState value: ".concat(String.valueOf(this)));
    }
}

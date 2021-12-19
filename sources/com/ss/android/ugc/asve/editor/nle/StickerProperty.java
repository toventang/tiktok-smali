package com.ss.android.ugc.asve.editor.nle;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class StickerProperty {
    private FloatArrayValue boundingBoxWithoutRotate;
    private final FloatArrayValue position;
    private final DoubleValue rotation;
    private final FloatArrayValue scale;

    static {
        Covode.recordClassIndex(38143);
    }

    public StickerProperty() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ StickerProperty copy$default(StickerProperty stickerProperty, FloatArrayValue floatArrayValue, FloatArrayValue floatArrayValue2, DoubleValue doubleValue, FloatArrayValue floatArrayValue3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            floatArrayValue = stickerProperty.position;
        }
        if ((i2 & 2) != 0) {
            floatArrayValue2 = stickerProperty.scale;
        }
        if ((i2 & 4) != 0) {
            doubleValue = stickerProperty.rotation;
        }
        if ((i2 & 8) != 0) {
            floatArrayValue3 = stickerProperty.boundingBoxWithoutRotate;
        }
        return stickerProperty.copy(floatArrayValue, floatArrayValue2, doubleValue, floatArrayValue3);
    }

    public final FloatArrayValue component1() {
        return this.position;
    }

    public final FloatArrayValue component2() {
        return this.scale;
    }

    public final DoubleValue component3() {
        return this.rotation;
    }

    public final FloatArrayValue component4() {
        return this.boundingBoxWithoutRotate;
    }

    public final StickerProperty copy(FloatArrayValue floatArrayValue, FloatArrayValue floatArrayValue2, DoubleValue doubleValue, FloatArrayValue floatArrayValue3) {
        l.d(floatArrayValue, "");
        l.d(floatArrayValue2, "");
        l.d(doubleValue, "");
        l.d(floatArrayValue3, "");
        return new StickerProperty(floatArrayValue, floatArrayValue2, doubleValue, floatArrayValue3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerProperty)) {
            return false;
        }
        StickerProperty stickerProperty = (StickerProperty) obj;
        return l.a(this.position, stickerProperty.position) && l.a(this.scale, stickerProperty.scale) && l.a(this.rotation, stickerProperty.rotation) && l.a(this.boundingBoxWithoutRotate, stickerProperty.boundingBoxWithoutRotate);
    }

    public final int hashCode() {
        FloatArrayValue floatArrayValue = this.position;
        int i2 = 0;
        int hashCode = (floatArrayValue != null ? floatArrayValue.hashCode() : 0) * 31;
        FloatArrayValue floatArrayValue2 = this.scale;
        int hashCode2 = (hashCode + (floatArrayValue2 != null ? floatArrayValue2.hashCode() : 0)) * 31;
        DoubleValue doubleValue = this.rotation;
        int hashCode3 = (hashCode2 + (doubleValue != null ? doubleValue.hashCode() : 0)) * 31;
        FloatArrayValue floatArrayValue3 = this.boundingBoxWithoutRotate;
        if (floatArrayValue3 != null) {
            i2 = floatArrayValue3.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "StickerProperty(position=" + this.position + ", scale=" + this.scale + ", rotation=" + this.rotation + ", boundingBoxWithoutRotate=" + this.boundingBoxWithoutRotate + ")";
    }

    public final FloatArrayValue getBoundingBoxWithoutRotate() {
        return this.boundingBoxWithoutRotate;
    }

    public final FloatArrayValue getPosition() {
        return this.position;
    }

    public final DoubleValue getRotation() {
        return this.rotation;
    }

    public final FloatArrayValue getScale() {
        return this.scale;
    }

    public final void setBoundingBoxWithoutRotate(FloatArrayValue floatArrayValue) {
        l.d(floatArrayValue, "");
        this.boundingBoxWithoutRotate = floatArrayValue;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StickerProperty(com.bytedance.ies.nle.editor_jni.NLESegmentSticker r12, com.bytedance.ies.nle.editor_jni.NLETrackSlot r13, com.bytedance.ies.nle.editor_jni.NLEMatrix r14) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.asve.editor.nle.StickerProperty.<init>(com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.bytedance.ies.nle.editor_jni.NLEMatrix):void");
    }

    public StickerProperty(FloatArrayValue floatArrayValue, FloatArrayValue floatArrayValue2, DoubleValue doubleValue, FloatArrayValue floatArrayValue3) {
        l.d(floatArrayValue, "");
        l.d(floatArrayValue2, "");
        l.d(doubleValue, "");
        l.d(floatArrayValue3, "");
        this.position = floatArrayValue;
        this.scale = floatArrayValue2;
        this.rotation = doubleValue;
        this.boundingBoxWithoutRotate = floatArrayValue3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ StickerProperty(com.ss.android.ugc.asve.editor.nle.FloatArrayValue r7, com.ss.android.ugc.asve.editor.nle.FloatArrayValue r8, com.ss.android.ugc.asve.editor.nle.DoubleValue r9, com.ss.android.ugc.asve.editor.nle.FloatArrayValue r10, int r11, h.f.b.g r12) {
        /*
            r6 = this;
            r0 = r11 & 1
            r5 = 0
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x001f
            com.ss.android.ugc.asve.editor.nle.FloatArrayValue r7 = new com.ss.android.ugc.asve.editor.nle.FloatArrayValue
            java.lang.Float[] r2 = new java.lang.Float[r4]
            r1 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r2[r5] = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r2[r3] = r0
            java.util.List r0 = h.a.n.b(r2)
            r7.<init>(r0)
        L_0x001f:
            r0 = r11 & 2
            if (r0 == 0) goto L_0x003c
            com.ss.android.ugc.asve.editor.nle.FloatArrayValue r8 = new com.ss.android.ugc.asve.editor.nle.FloatArrayValue
            java.lang.Float[] r2 = new java.lang.Float[r4]
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r2[r5] = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r2[r3] = r0
            java.util.List r0 = h.a.n.b(r2)
            r8.<init>(r0)
        L_0x003c:
            r0 = r11 & 4
            if (r0 == 0) goto L_0x0042
            com.ss.android.ugc.asve.editor.nle.DoubleValue r9 = com.ss.android.ugc.asve.editor.nle.a.f62050a
        L_0x0042:
            r0 = r11 & 8
            if (r0 == 0) goto L_0x004d
            com.ss.android.ugc.asve.editor.nle.FloatArrayValue r10 = new com.ss.android.ugc.asve.editor.nle.FloatArrayValue
            h.a.z r0 = h.a.z.INSTANCE
            r10.<init>(r0)
        L_0x004d:
            r6.<init>(r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.asve.editor.nle.StickerProperty.<init>(com.ss.android.ugc.asve.editor.nle.FloatArrayValue, com.ss.android.ugc.asve.editor.nle.FloatArrayValue, com.ss.android.ugc.asve.editor.nle.DoubleValue, com.ss.android.ugc.asve.editor.nle.FloatArrayValue, int, h.f.b.g):void");
    }
}

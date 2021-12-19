package com.ss.android.ugc.asve.editor.nle;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class VideoProperty {
    private final DoubleValue alpha;
    private final FloatArrayValue position;
    private final DoubleValue rotation;
    private final DoubleValue scale;

    static {
        Covode.recordClassIndex(38145);
    }

    public static /* synthetic */ VideoProperty copy$default(VideoProperty videoProperty, DoubleValue doubleValue, FloatArrayValue floatArrayValue, DoubleValue doubleValue2, DoubleValue doubleValue3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            doubleValue = videoProperty.alpha;
        }
        if ((i2 & 2) != 0) {
            floatArrayValue = videoProperty.position;
        }
        if ((i2 & 4) != 0) {
            doubleValue2 = videoProperty.rotation;
        }
        if ((i2 & 8) != 0) {
            doubleValue3 = videoProperty.scale;
        }
        return videoProperty.copy(doubleValue, floatArrayValue, doubleValue2, doubleValue3);
    }

    public final DoubleValue component1() {
        return this.alpha;
    }

    public final FloatArrayValue component2() {
        return this.position;
    }

    public final DoubleValue component3() {
        return this.rotation;
    }

    public final DoubleValue component4() {
        return this.scale;
    }

    public final VideoProperty copy(DoubleValue doubleValue, FloatArrayValue floatArrayValue, DoubleValue doubleValue2, DoubleValue doubleValue3) {
        l.d(doubleValue, "");
        l.d(floatArrayValue, "");
        l.d(doubleValue2, "");
        l.d(doubleValue3, "");
        return new VideoProperty(doubleValue, floatArrayValue, doubleValue2, doubleValue3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoProperty)) {
            return false;
        }
        VideoProperty videoProperty = (VideoProperty) obj;
        return l.a(this.alpha, videoProperty.alpha) && l.a(this.position, videoProperty.position) && l.a(this.rotation, videoProperty.rotation) && l.a(this.scale, videoProperty.scale);
    }

    public final int hashCode() {
        DoubleValue doubleValue = this.alpha;
        int i2 = 0;
        int hashCode = (doubleValue != null ? doubleValue.hashCode() : 0) * 31;
        FloatArrayValue floatArrayValue = this.position;
        int hashCode2 = (hashCode + (floatArrayValue != null ? floatArrayValue.hashCode() : 0)) * 31;
        DoubleValue doubleValue2 = this.rotation;
        int hashCode3 = (hashCode2 + (doubleValue2 != null ? doubleValue2.hashCode() : 0)) * 31;
        DoubleValue doubleValue3 = this.scale;
        if (doubleValue3 != null) {
            i2 = doubleValue3.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "VideoProperty(alpha=" + this.alpha + ", position=" + this.position + ", rotation=" + this.rotation + ", scale=" + this.scale + ")";
    }

    public final DoubleValue getAlpha() {
        return this.alpha;
    }

    public final FloatArrayValue getPosition() {
        return this.position;
    }

    public final DoubleValue getRotation() {
        return this.rotation;
    }

    public final DoubleValue getScale() {
        return this.scale;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public VideoProperty(com.bytedance.ies.nle.editor_jni.NLESegmentVideo r7, com.bytedance.ies.nle.editor_jni.NLETrackSlot r8, com.bytedance.ies.nle.editor_jni.NLEMatrix r9) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r7, r0)
            h.f.b.l.d(r8, r0)
            com.ss.android.ugc.asve.editor.nle.DoubleValue r4 = new com.ss.android.ugc.asve.editor.nle.DoubleValue
            float r0 = r7.getAlpha()
            double r0 = (double) r0
            r4.<init>(r0)
            com.ss.android.ugc.asve.editor.nle.FloatArrayValue r5 = new com.ss.android.ugc.asve.editor.nle.FloatArrayValue
            r0 = 2
            java.lang.Float[] r2 = new java.lang.Float[r0]
            if (r9 == 0) goto L_0x0055
            float r0 = r9.getTransformX()
        L_0x001d:
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            r0 = 0
            r2[r0] = r1
            r1 = 1
            if (r9 == 0) goto L_0x0050
            float r0 = r9.getTransformY()
        L_0x002b:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2[r1] = r0
            java.util.List r0 = h.a.n.b(r2)
            r5.<init>(r0)
            com.ss.android.ugc.asve.editor.nle.DoubleValue r3 = new com.ss.android.ugc.asve.editor.nle.DoubleValue
            float r0 = r8.getRotation()
            double r0 = (double) r0
            r3.<init>(r0)
            com.ss.android.ugc.asve.editor.nle.DoubleValue r2 = new com.ss.android.ugc.asve.editor.nle.DoubleValue
            float r0 = r8.getScale()
            double r0 = (double) r0
            r2.<init>(r0)
            r6.<init>(r4, r5, r3, r2)
            return
        L_0x0050:
            float r0 = r8.getTransformY()
            goto L_0x002b
        L_0x0055:
            float r0 = r8.getTransformX()
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.asve.editor.nle.VideoProperty.<init>(com.bytedance.ies.nle.editor_jni.NLESegmentVideo, com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.bytedance.ies.nle.editor_jni.NLEMatrix):void");
    }

    public VideoProperty(DoubleValue doubleValue, FloatArrayValue floatArrayValue, DoubleValue doubleValue2, DoubleValue doubleValue3) {
        l.d(doubleValue, "");
        l.d(floatArrayValue, "");
        l.d(doubleValue2, "");
        l.d(doubleValue3, "");
        this.alpha = doubleValue;
        this.position = floatArrayValue;
        this.rotation = doubleValue2;
        this.scale = doubleValue3;
    }
}

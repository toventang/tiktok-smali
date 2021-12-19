package com.ss.android.ugc.asve.editor.nle;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class TextProperty {
    private final FloatArrayValue backgroundColor;
    private FloatArrayValue boundingBoxWithoutRotate;
    private final FloatArrayValue outlineColor;
    private final DoubleValue outlineWidth;
    private final FloatArrayValue position;
    private final DoubleValue rotation;
    private final FloatArrayValue scale;
    private final FloatArrayValue shadowColor;
    private final FloatArrayValue shadowOffset;
    private final DoubleValue shadowSmoothing;
    private final FloatArrayValue textColor;

    static {
        Covode.recordClassIndex(38144);
    }

    public TextProperty() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ TextProperty copy$default(TextProperty textProperty, FloatArrayValue floatArrayValue, FloatArrayValue floatArrayValue2, DoubleValue doubleValue, FloatArrayValue floatArrayValue3, FloatArrayValue floatArrayValue4, FloatArrayValue floatArrayValue5, DoubleValue doubleValue2, FloatArrayValue floatArrayValue6, DoubleValue doubleValue3, FloatArrayValue floatArrayValue7, FloatArrayValue floatArrayValue8, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            floatArrayValue = textProperty.position;
        }
        if ((i2 & 2) != 0) {
            floatArrayValue2 = textProperty.scale;
        }
        if ((i2 & 4) != 0) {
            doubleValue = textProperty.rotation;
        }
        if ((i2 & 8) != 0) {
            floatArrayValue3 = textProperty.textColor;
        }
        if ((i2 & 16) != 0) {
            floatArrayValue4 = textProperty.backgroundColor;
        }
        if ((i2 & 32) != 0) {
            floatArrayValue5 = textProperty.shadowColor;
        }
        if ((i2 & 64) != 0) {
            doubleValue2 = textProperty.shadowSmoothing;
        }
        if ((i2 & 128) != 0) {
            floatArrayValue6 = textProperty.shadowOffset;
        }
        if ((i2 & 256) != 0) {
            doubleValue3 = textProperty.outlineWidth;
        }
        if ((i2 & 512) != 0) {
            floatArrayValue7 = textProperty.outlineColor;
        }
        if ((i2 & 1024) != 0) {
            floatArrayValue8 = textProperty.boundingBoxWithoutRotate;
        }
        return textProperty.copy(floatArrayValue, floatArrayValue2, doubleValue, floatArrayValue3, floatArrayValue4, floatArrayValue5, doubleValue2, floatArrayValue6, doubleValue3, floatArrayValue7, floatArrayValue8);
    }

    public final FloatArrayValue component1() {
        return this.position;
    }

    public final FloatArrayValue component10() {
        return this.outlineColor;
    }

    public final FloatArrayValue component11() {
        return this.boundingBoxWithoutRotate;
    }

    public final FloatArrayValue component2() {
        return this.scale;
    }

    public final DoubleValue component3() {
        return this.rotation;
    }

    public final FloatArrayValue component4() {
        return this.textColor;
    }

    public final FloatArrayValue component5() {
        return this.backgroundColor;
    }

    public final FloatArrayValue component6() {
        return this.shadowColor;
    }

    public final DoubleValue component7() {
        return this.shadowSmoothing;
    }

    public final FloatArrayValue component8() {
        return this.shadowOffset;
    }

    public final DoubleValue component9() {
        return this.outlineWidth;
    }

    public final TextProperty copy(FloatArrayValue floatArrayValue, FloatArrayValue floatArrayValue2, DoubleValue doubleValue, FloatArrayValue floatArrayValue3, FloatArrayValue floatArrayValue4, FloatArrayValue floatArrayValue5, DoubleValue doubleValue2, FloatArrayValue floatArrayValue6, DoubleValue doubleValue3, FloatArrayValue floatArrayValue7, FloatArrayValue floatArrayValue8) {
        l.d(floatArrayValue, "");
        l.d(floatArrayValue2, "");
        l.d(doubleValue, "");
        l.d(floatArrayValue3, "");
        l.d(floatArrayValue4, "");
        l.d(floatArrayValue5, "");
        l.d(doubleValue2, "");
        l.d(floatArrayValue6, "");
        l.d(doubleValue3, "");
        l.d(floatArrayValue7, "");
        l.d(floatArrayValue8, "");
        return new TextProperty(floatArrayValue, floatArrayValue2, doubleValue, floatArrayValue3, floatArrayValue4, floatArrayValue5, doubleValue2, floatArrayValue6, doubleValue3, floatArrayValue7, floatArrayValue8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextProperty)) {
            return false;
        }
        TextProperty textProperty = (TextProperty) obj;
        return l.a(this.position, textProperty.position) && l.a(this.scale, textProperty.scale) && l.a(this.rotation, textProperty.rotation) && l.a(this.textColor, textProperty.textColor) && l.a(this.backgroundColor, textProperty.backgroundColor) && l.a(this.shadowColor, textProperty.shadowColor) && l.a(this.shadowSmoothing, textProperty.shadowSmoothing) && l.a(this.shadowOffset, textProperty.shadowOffset) && l.a(this.outlineWidth, textProperty.outlineWidth) && l.a(this.outlineColor, textProperty.outlineColor) && l.a(this.boundingBoxWithoutRotate, textProperty.boundingBoxWithoutRotate);
    }

    public final int hashCode() {
        FloatArrayValue floatArrayValue = this.position;
        int i2 = 0;
        int hashCode = (floatArrayValue != null ? floatArrayValue.hashCode() : 0) * 31;
        FloatArrayValue floatArrayValue2 = this.scale;
        int hashCode2 = (hashCode + (floatArrayValue2 != null ? floatArrayValue2.hashCode() : 0)) * 31;
        DoubleValue doubleValue = this.rotation;
        int hashCode3 = (hashCode2 + (doubleValue != null ? doubleValue.hashCode() : 0)) * 31;
        FloatArrayValue floatArrayValue3 = this.textColor;
        int hashCode4 = (hashCode3 + (floatArrayValue3 != null ? floatArrayValue3.hashCode() : 0)) * 31;
        FloatArrayValue floatArrayValue4 = this.backgroundColor;
        int hashCode5 = (hashCode4 + (floatArrayValue4 != null ? floatArrayValue4.hashCode() : 0)) * 31;
        FloatArrayValue floatArrayValue5 = this.shadowColor;
        int hashCode6 = (hashCode5 + (floatArrayValue5 != null ? floatArrayValue5.hashCode() : 0)) * 31;
        DoubleValue doubleValue2 = this.shadowSmoothing;
        int hashCode7 = (hashCode6 + (doubleValue2 != null ? doubleValue2.hashCode() : 0)) * 31;
        FloatArrayValue floatArrayValue6 = this.shadowOffset;
        int hashCode8 = (hashCode7 + (floatArrayValue6 != null ? floatArrayValue6.hashCode() : 0)) * 31;
        DoubleValue doubleValue3 = this.outlineWidth;
        int hashCode9 = (hashCode8 + (doubleValue3 != null ? doubleValue3.hashCode() : 0)) * 31;
        FloatArrayValue floatArrayValue7 = this.outlineColor;
        int hashCode10 = (hashCode9 + (floatArrayValue7 != null ? floatArrayValue7.hashCode() : 0)) * 31;
        FloatArrayValue floatArrayValue8 = this.boundingBoxWithoutRotate;
        if (floatArrayValue8 != null) {
            i2 = floatArrayValue8.hashCode();
        }
        return hashCode10 + i2;
    }

    public final String toString() {
        return "TextProperty(position=" + this.position + ", scale=" + this.scale + ", rotation=" + this.rotation + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", shadowColor=" + this.shadowColor + ", shadowSmoothing=" + this.shadowSmoothing + ", shadowOffset=" + this.shadowOffset + ", outlineWidth=" + this.outlineWidth + ", outlineColor=" + this.outlineColor + ", boundingBoxWithoutRotate=" + this.boundingBoxWithoutRotate + ")";
    }

    public final FloatArrayValue getBackgroundColor() {
        return this.backgroundColor;
    }

    public final FloatArrayValue getBoundingBoxWithoutRotate() {
        return this.boundingBoxWithoutRotate;
    }

    public final FloatArrayValue getOutlineColor() {
        return this.outlineColor;
    }

    public final DoubleValue getOutlineWidth() {
        return this.outlineWidth;
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

    public final FloatArrayValue getShadowColor() {
        return this.shadowColor;
    }

    public final FloatArrayValue getShadowOffset() {
        return this.shadowOffset;
    }

    public final DoubleValue getShadowSmoothing() {
        return this.shadowSmoothing;
    }

    public final FloatArrayValue getTextColor() {
        return this.textColor;
    }

    public final void setBoundingBoxWithoutRotate(FloatArrayValue floatArrayValue) {
        l.d(floatArrayValue, "");
        this.boundingBoxWithoutRotate = floatArrayValue;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextProperty(com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker r23, com.bytedance.ies.nle.editor_jni.NLETrackSlot r24, com.bytedance.ies.nle.editor_jni.NLEMatrix r25) {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.asve.editor.nle.TextProperty.<init>(com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker, com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.bytedance.ies.nle.editor_jni.NLEMatrix):void");
    }

    public TextProperty(FloatArrayValue floatArrayValue, FloatArrayValue floatArrayValue2, DoubleValue doubleValue, FloatArrayValue floatArrayValue3, FloatArrayValue floatArrayValue4, FloatArrayValue floatArrayValue5, DoubleValue doubleValue2, FloatArrayValue floatArrayValue6, DoubleValue doubleValue3, FloatArrayValue floatArrayValue7, FloatArrayValue floatArrayValue8) {
        l.d(floatArrayValue, "");
        l.d(floatArrayValue2, "");
        l.d(doubleValue, "");
        l.d(floatArrayValue3, "");
        l.d(floatArrayValue4, "");
        l.d(floatArrayValue5, "");
        l.d(doubleValue2, "");
        l.d(floatArrayValue6, "");
        l.d(doubleValue3, "");
        l.d(floatArrayValue7, "");
        l.d(floatArrayValue8, "");
        this.position = floatArrayValue;
        this.scale = floatArrayValue2;
        this.rotation = doubleValue;
        this.textColor = floatArrayValue3;
        this.backgroundColor = floatArrayValue4;
        this.shadowColor = floatArrayValue5;
        this.shadowSmoothing = doubleValue2;
        this.shadowOffset = floatArrayValue6;
        this.outlineWidth = doubleValue3;
        this.outlineColor = floatArrayValue7;
        this.boundingBoxWithoutRotate = floatArrayValue8;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextProperty(com.ss.android.ugc.asve.editor.nle.FloatArrayValue r26, com.ss.android.ugc.asve.editor.nle.FloatArrayValue r27, com.ss.android.ugc.asve.editor.nle.DoubleValue r28, com.ss.android.ugc.asve.editor.nle.FloatArrayValue r29, com.ss.android.ugc.asve.editor.nle.FloatArrayValue r30, com.ss.android.ugc.asve.editor.nle.FloatArrayValue r31, com.ss.android.ugc.asve.editor.nle.DoubleValue r32, com.ss.android.ugc.asve.editor.nle.FloatArrayValue r33, com.ss.android.ugc.asve.editor.nle.DoubleValue r34, com.ss.android.ugc.asve.editor.nle.FloatArrayValue r35, com.ss.android.ugc.asve.editor.nle.FloatArrayValue r36, int r37, h.f.b.g r38) {
        /*
        // Method dump skipped, instructions count: 241
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.asve.editor.nle.TextProperty.<init>(com.ss.android.ugc.asve.editor.nle.FloatArrayValue, com.ss.android.ugc.asve.editor.nle.FloatArrayValue, com.ss.android.ugc.asve.editor.nle.DoubleValue, com.ss.android.ugc.asve.editor.nle.FloatArrayValue, com.ss.android.ugc.asve.editor.nle.FloatArrayValue, com.ss.android.ugc.asve.editor.nle.FloatArrayValue, com.ss.android.ugc.asve.editor.nle.DoubleValue, com.ss.android.ugc.asve.editor.nle.FloatArrayValue, com.ss.android.ugc.asve.editor.nle.DoubleValue, com.ss.android.ugc.asve.editor.nle.FloatArrayValue, com.ss.android.ugc.asve.editor.nle.FloatArrayValue, int, h.f.b.g):void");
    }
}

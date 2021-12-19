package com.ss.android.ugc.asve.editor.nle;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.nle.editor_jni.NLEMatrix;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import h.f.b.g;
import h.f.b.l;

public final class IntensityProperty {
    private final DoubleValue intensity;

    static {
        Covode.recordClassIndex(38141);
    }

    public IntensityProperty() {
        this((DoubleValue) null, 1, (g) null);
    }

    public static /* synthetic */ IntensityProperty copy$default(IntensityProperty intensityProperty, DoubleValue doubleValue, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            doubleValue = intensityProperty.intensity;
        }
        return intensityProperty.copy(doubleValue);
    }

    public final DoubleValue component1() {
        return this.intensity;
    }

    public final IntensityProperty copy(DoubleValue doubleValue) {
        l.d(doubleValue, "");
        return new IntensityProperty(doubleValue);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof IntensityProperty) && l.a(this.intensity, ((IntensityProperty) obj).intensity);
        }
        return true;
    }

    public final int hashCode() {
        DoubleValue doubleValue = this.intensity;
        if (doubleValue != null) {
            return doubleValue.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "IntensityProperty(intensity=" + this.intensity + ")";
    }

    public final DoubleValue getIntensity() {
        return this.intensity;
    }

    public IntensityProperty(DoubleValue doubleValue) {
        l.d(doubleValue, "");
        this.intensity = doubleValue;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IntensityProperty(NLESegmentFilter nLESegmentFilter, NLETrackSlot nLETrackSlot, NLEMatrix nLEMatrix) {
        this(new DoubleValue((double) nLESegmentFilter.getIntensity()));
        l.d(nLESegmentFilter, "");
        l.d(nLETrackSlot, "");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IntensityProperty(DoubleValue doubleValue, int i2, g gVar) {
        this((i2 & 1) != 0 ? a.f62050a : doubleValue);
    }
}

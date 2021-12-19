package com.ss.android.ugc.asve.editor.nle;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.nle.editor_jni.NLEMatrix;
import com.bytedance.ies.nle.editor_jni.NLESegmentChromaChannel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import h.f.b.g;
import h.f.b.l;

public final class ChromaProperty {
    private final DoubleValue intensity;
    private final DoubleValue shadow;

    static {
        Covode.recordClassIndex(38138);
    }

    public ChromaProperty() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ ChromaProperty copy$default(ChromaProperty chromaProperty, DoubleValue doubleValue, DoubleValue doubleValue2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            doubleValue = chromaProperty.intensity;
        }
        if ((i2 & 2) != 0) {
            doubleValue2 = chromaProperty.shadow;
        }
        return chromaProperty.copy(doubleValue, doubleValue2);
    }

    public final DoubleValue component1() {
        return this.intensity;
    }

    public final DoubleValue component2() {
        return this.shadow;
    }

    public final ChromaProperty copy(DoubleValue doubleValue, DoubleValue doubleValue2) {
        l.d(doubleValue, "");
        l.d(doubleValue2, "");
        return new ChromaProperty(doubleValue, doubleValue2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChromaProperty)) {
            return false;
        }
        ChromaProperty chromaProperty = (ChromaProperty) obj;
        return l.a(this.intensity, chromaProperty.intensity) && l.a(this.shadow, chromaProperty.shadow);
    }

    public final int hashCode() {
        DoubleValue doubleValue = this.intensity;
        int i2 = 0;
        int hashCode = (doubleValue != null ? doubleValue.hashCode() : 0) * 31;
        DoubleValue doubleValue2 = this.shadow;
        if (doubleValue2 != null) {
            i2 = doubleValue2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ChromaProperty(intensity=" + this.intensity + ", shadow=" + this.shadow + ")";
    }

    public final DoubleValue getIntensity() {
        return this.intensity;
    }

    public final DoubleValue getShadow() {
        return this.shadow;
    }

    public ChromaProperty(DoubleValue doubleValue, DoubleValue doubleValue2) {
        l.d(doubleValue, "");
        l.d(doubleValue2, "");
        this.intensity = doubleValue;
        this.shadow = doubleValue2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ChromaProperty(NLESegmentChromaChannel nLESegmentChromaChannel, NLETrackSlot nLETrackSlot, NLEMatrix nLEMatrix) {
        this(new DoubleValue((double) nLESegmentChromaChannel.getIntensity()), new DoubleValue((double) nLESegmentChromaChannel.getShadow()));
        l.d(nLESegmentChromaChannel, "");
        l.d(nLETrackSlot, "");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChromaProperty(DoubleValue doubleValue, DoubleValue doubleValue2, int i2, g gVar) {
        this((i2 & 1) != 0 ? a.f62050a : doubleValue, (i2 & 2) != 0 ? a.f62050a : doubleValue2);
    }
}

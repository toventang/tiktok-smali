package com.ss.android.ugc.asve.editor.nle;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.nle.editor_jni.NLEMatrix;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import h.f.b.g;
import h.f.b.l;

public final class VideoVolumeProperty {
    private final String curve;
    private final double volume;

    static {
        Covode.recordClassIndex(38146);
    }

    public VideoVolumeProperty() {
        this(0.0d, null, 3, null);
    }

    public static /* synthetic */ VideoVolumeProperty copy$default(VideoVolumeProperty videoVolumeProperty, double d2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d2 = videoVolumeProperty.volume;
        }
        if ((i2 & 2) != 0) {
            str = videoVolumeProperty.curve;
        }
        return videoVolumeProperty.copy(d2, str);
    }

    public final double component1() {
        return this.volume;
    }

    public final String component2() {
        return this.curve;
    }

    public final VideoVolumeProperty copy(double d2, String str) {
        l.d(str, "");
        return new VideoVolumeProperty(d2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVolumeProperty)) {
            return false;
        }
        VideoVolumeProperty videoVolumeProperty = (VideoVolumeProperty) obj;
        return Double.compare(this.volume, videoVolumeProperty.volume) == 0 && l.a(this.curve, videoVolumeProperty.curve);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.volume);
        int i2 = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
        String str = this.curve;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "VideoVolumeProperty(volume=" + this.volume + ", curve=" + this.curve + ")";
    }

    public final String getCurve() {
        return this.curve;
    }

    public final double getVolume() {
        return this.volume;
    }

    public VideoVolumeProperty(double d2, String str) {
        l.d(str, "");
        this.volume = d2;
        this.curve = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VideoVolumeProperty(NLESegmentAudio nLESegmentAudio, NLETrackSlot nLETrackSlot, NLEMatrix nLEMatrix) {
        this((double) nLESegmentAudio.getVolume(), null, 2, null);
        l.d(nLESegmentAudio, "");
        l.d(nLETrackSlot, "");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VideoVolumeProperty(double d2, String str, int i2, g gVar) {
        this((i2 & 1) != 0 ? 1.0d : d2, (i2 & 2) != 0 ? "" : str);
    }
}

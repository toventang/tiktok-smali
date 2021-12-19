package com.ss.android.ugc.aweme.canvas;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import java.io.Serializable;

public final class k implements Serializable {
    public static final a Companion = new a((byte) 0);
    private final int duration;
    private final boolean enableGesture;
    private final int height;
    private final float scaleMaxLimit;
    private final float scaleMinLimit;
    private final int type;
    private final int width;

    static {
        Covode.recordClassIndex(42985);
    }

    public k() {
        this(0, 0, 0, 0, false, 0.0f, 0.0f, 127, null);
    }

    public static int com_ss_android_ugc_aweme_canvas_CanvasExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ k copy$default(k kVar, int i2, int i3, int i4, int i5, boolean z, float f2, float f3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = kVar.type;
        }
        if ((i6 & 2) != 0) {
            i3 = kVar.width;
        }
        if ((i6 & 4) != 0) {
            i4 = kVar.height;
        }
        if ((i6 & 8) != 0) {
            i5 = kVar.duration;
        }
        if ((i6 & 16) != 0) {
            z = kVar.enableGesture;
        }
        if ((i6 & 32) != 0) {
            f2 = kVar.scaleMinLimit;
        }
        if ((i6 & 64) != 0) {
            f3 = kVar.scaleMaxLimit;
        }
        return kVar.copy(i2, i3, i4, i5, z, f2, f3);
    }

    public final int component1() {
        return this.type;
    }

    public final int component2() {
        return this.width;
    }

    public final int component3() {
        return this.height;
    }

    public final int component4() {
        return this.duration;
    }

    public final boolean component5() {
        return this.enableGesture;
    }

    public final float component6() {
        return this.scaleMinLimit;
    }

    public final float component7() {
        return this.scaleMaxLimit;
    }

    public final k copy(int i2, int i3, int i4, int i5, boolean z, float f2, float f3) {
        return new k(i2, i3, i4, i5, z, f2, f3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.type == kVar.type && this.width == kVar.width && this.height == kVar.height && this.duration == kVar.duration && this.enableGesture == kVar.enableGesture && Float.compare(this.scaleMinLimit, kVar.scaleMinLimit) == 0 && Float.compare(this.scaleMaxLimit, kVar.scaleMaxLimit) == 0;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_canvas_CanvasExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((((com_ss_android_ugc_aweme_canvas_CanvasExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.type) * 31) + com_ss_android_ugc_aweme_canvas_CanvasExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.width)) * 31) + com_ss_android_ugc_aweme_canvas_CanvasExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.height)) * 31) + com_ss_android_ugc_aweme_canvas_CanvasExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.duration)) * 31;
        boolean z = this.enableGesture;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return ((((com_ss_android_ugc_aweme_canvas_CanvasExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i2) * 31) + com_ss_android_ugc_aweme_canvas_CanvasExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.scaleMinLimit)) * 31) + com_ss_android_ugc_aweme_canvas_CanvasExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.scaleMaxLimit);
    }

    public final String toString() {
        return "CanvasExtra(type=" + this.type + ", width=" + this.width + ", height=" + this.height + ", duration=" + this.duration + ", enableGesture=" + this.enableGesture + ", scaleMinLimit=" + this.scaleMinLimit + ", scaleMaxLimit=" + this.scaleMaxLimit + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42986);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getDuration() {
        return this.duration;
    }

    public final boolean getEnableGesture() {
        return this.enableGesture;
    }

    public final int getHeight() {
        return this.height;
    }

    public final float getScaleMaxLimit() {
        return this.scaleMaxLimit;
    }

    public final float getScaleMinLimit() {
        return this.scaleMinLimit;
    }

    public final int getType() {
        return this.type;
    }

    public final int getWidth() {
        return this.width;
    }

    public static int com_ss_android_ugc_aweme_canvas_CanvasExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    public k(int i2, int i3, int i4, int i5, boolean z, float f2, float f3) {
        this.type = i2;
        this.width = i3;
        this.height = i4;
        this.duration = i5;
        this.enableGesture = z;
        this.scaleMinLimit = f2;
        this.scaleMaxLimit = f3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i2, int i3, int i4, int i5, boolean z, float f2, float f3, int i6, g gVar) {
        this((i6 & 1) != 0 ? 0 : i2, (i6 & 2) != 0 ? 0 : i3, (i6 & 4) != 0 ? 0 : i4, (i6 & 8) == 0 ? i5 : 0, (i6 & 16) != 0 ? true : z, (i6 & 32) != 0 ? 0.25f : f2, (i6 & 64) != 0 ? 1.0f : f3);
    }
}

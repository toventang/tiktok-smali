package com.ss.android.ugc.aweme.tools.beauty.data;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class NoneComposer {
    public static final a Companion = new a((byte) 0);
    private final String effectId;
    private final int iconResId;
    private final String itemName;
    private final String resourceId;

    static {
        Covode.recordClassIndex(90833);
    }

    public static /* synthetic */ NoneComposer copy$default(NoneComposer noneComposer, String str, String str2, int i2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = noneComposer.effectId;
        }
        if ((i3 & 2) != 0) {
            str2 = noneComposer.resourceId;
        }
        if ((i3 & 4) != 0) {
            i2 = noneComposer.iconResId;
        }
        if ((i3 & 8) != 0) {
            str3 = noneComposer.itemName;
        }
        return noneComposer.copy(str, str2, i2, str3);
    }

    public final String component1() {
        return this.effectId;
    }

    public final String component2() {
        return this.resourceId;
    }

    public final int component3() {
        return this.iconResId;
    }

    public final String component4() {
        return this.itemName;
    }

    public final NoneComposer copy(String str, String str2, int i2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        return new NoneComposer(str, str2, i2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoneComposer)) {
            return false;
        }
        NoneComposer noneComposer = (NoneComposer) obj;
        return l.a(this.effectId, noneComposer.effectId) && l.a(this.resourceId, noneComposer.resourceId) && this.iconResId == noneComposer.iconResId && l.a(this.itemName, noneComposer.itemName);
    }

    public final int hashCode() {
        String str = this.effectId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.resourceId;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.iconResId) * 31;
        String str3 = this.itemName;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "NoneComposer(effectId=" + this.effectId + ", resourceId=" + this.resourceId + ", iconResId=" + this.iconResId + ", itemName=" + this.itemName + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90834);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    public final String getItemName() {
        return this.itemName;
    }

    public final String getResourceId() {
        return this.resourceId;
    }

    public NoneComposer(String str, String str2, int i2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.effectId = str;
        this.resourceId = str2;
        this.iconResId = i2;
        this.itemName = str3;
    }
}

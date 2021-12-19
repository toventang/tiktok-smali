package com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import h.f.b.l;

public final class Icon {
    @c(a = "icon")
    private final Image icon;
    @c(a = "icon_dark")
    private final Image iconDark;

    static {
        Covode.recordClassIndex(53981);
    }

    public static /* synthetic */ Icon copy$default(Icon icon2, Image image, Image image2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            image = icon2.icon;
        }
        if ((i2 & 2) != 0) {
            image2 = icon2.iconDark;
        }
        return icon2.copy(image, image2);
    }

    public final Image component1() {
        return this.icon;
    }

    public final Image component2() {
        return this.iconDark;
    }

    public final Icon copy(Image image, Image image2) {
        return new Icon(image, image2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Icon)) {
            return false;
        }
        Icon icon2 = (Icon) obj;
        return l.a(this.icon, icon2.icon) && l.a(this.iconDark, icon2.iconDark);
    }

    public final int hashCode() {
        Image image = this.icon;
        int i2 = 0;
        int hashCode = (image != null ? image.hashCode() : 0) * 31;
        Image image2 = this.iconDark;
        if (image2 != null) {
            i2 = image2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "Icon(icon=" + this.icon + ", iconDark=" + this.iconDark + ")";
    }

    public final Image getIcon() {
        return this.icon;
    }

    public final Image getIconDark() {
        return this.iconDark;
    }

    public Icon(Image image, Image image2) {
        this.icon = image;
        this.iconDark = image2;
    }
}

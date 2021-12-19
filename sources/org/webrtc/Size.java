package org.webrtc;

import com.bytedance.covode.number.Covode;

public class Size {
    public int height;
    public int width;

    static {
        Covode.recordClassIndex(106661);
    }

    public int hashCode() {
        return (this.width * 65537) + 1 + this.height;
    }

    public String toString() {
        return this.width + "x" + this.height;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        if (this.width == size.width && this.height == size.height) {
            return true;
        }
        return false;
    }

    public Size(int i2, int i3) {
        this.width = i2;
        this.height = i3;
    }
}

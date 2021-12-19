package okhttp3.internal.http2;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

public final class Settings {
    private int set;
    private final int[] values = new int[10];

    static {
        Covode.recordClassIndex(106287);
    }

    /* access modifiers changed from: package-private */
    public final int size() {
        return Integer.bitCount(this.set);
    }

    /* access modifiers changed from: package-private */
    public final void clear() {
        this.set = 0;
        Arrays.fill(this.values, 0);
    }

    /* access modifiers changed from: package-private */
    public final int getHeaderTableSize() {
        if ((this.set & 2) != 0) {
            return this.values[1];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final int getInitialWindowSize() {
        if ((this.set & 128) != 0) {
            return this.values[7];
        }
        return 65535;
    }

    /* access modifiers changed from: package-private */
    public final int get(int i2) {
        return this.values[i2];
    }

    /* access modifiers changed from: package-private */
    public final int getMaxConcurrentStreams(int i2) {
        if ((this.set & 16) != 0) {
            return this.values[4];
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final int getMaxFrameSize(int i2) {
        if ((this.set & 32) != 0) {
            return this.values[5];
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final int getMaxHeaderListSize(int i2) {
        if ((this.set & 64) != 0) {
            return this.values[6];
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final boolean isSet(int i2) {
        if (((1 << i2) & this.set) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean getEnablePush(boolean z) {
        if ((this.set & 4) == 0 ? !z : this.values[2] != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void merge(Settings settings) {
        int i2 = 0;
        do {
            if (settings.isSet(i2)) {
                set(i2, settings.get(i2));
            }
            i2++;
        } while (i2 < 10);
    }

    /* access modifiers changed from: package-private */
    public final Settings set(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = this.values;
            if (i2 < iArr.length) {
                this.set = (1 << i2) | this.set;
                iArr[i2] = i3;
            }
        }
        return this;
    }
}

package androidx.media;

import android.util.SparseIntArray;
import androidx.versionedparcelable.c;
import com.bytedance.covode.number.Covode;

public class AudioAttributesCompat implements c {

    /* renamed from: b  reason: collision with root package name */
    private static final SparseIntArray f3631b;

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f3632c = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};

    /* renamed from: a  reason: collision with root package name */
    a f3633a;

    AudioAttributesCompat() {
    }

    public int hashCode() {
        return this.f3633a.hashCode();
    }

    public String toString() {
        return this.f3633a.toString();
    }

    static {
        Covode.recordClassIndex(1379);
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3631b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        a aVar = this.f3633a;
        if (aVar != null) {
            return aVar.equals(audioAttributesCompat.f3633a);
        }
        if (audioAttributesCompat.f3633a == null) {
            return true;
        }
        return false;
    }
}

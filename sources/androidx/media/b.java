package androidx.media;

import android.media.AudioAttributes;
import com.bytedance.covode.number.Covode;

class b implements a {

    /* renamed from: a  reason: collision with root package name */
    AudioAttributes f3638a;

    /* renamed from: b  reason: collision with root package name */
    int f3639b = -1;

    static {
        Covode.recordClassIndex(1386);
    }

    b() {
    }

    public int hashCode() {
        return this.f3638a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f3638a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f3638a.equals(((b) obj).f3638a);
    }
}

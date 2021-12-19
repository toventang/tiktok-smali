package androidx.media;

import androidx.versionedparcelable.a;
import com.bytedance.covode.number.Covode;

public final class AudioAttributesCompatParcelizer {
    static {
        Covode.recordClassIndex(1380);
    }

    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f3633a = (a) aVar.c(audioAttributesCompat.f3633a);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        aVar.a(audioAttributesCompat.f3633a);
    }
}

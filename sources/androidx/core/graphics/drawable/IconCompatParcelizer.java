package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.versionedparcelable.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.nio.charset.Charset;

public class IconCompatParcelizer {
    static {
        Covode.recordClassIndex(785);
    }

    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2416a = aVar.b(iconCompat.f2416a, 1);
        iconCompat.f2418c = aVar.c(iconCompat.f2418c);
        iconCompat.f2419d = aVar.b(iconCompat.f2419d, 3);
        iconCompat.f2420e = aVar.b(iconCompat.f2420e, 4);
        iconCompat.f2421f = aVar.b(iconCompat.f2421f, 5);
        iconCompat.f2422g = (ColorStateList) aVar.b(iconCompat.f2422g, 6);
        iconCompat.f2424j = aVar.c(iconCompat.f2424j);
        iconCompat.f2423i = PorterDuff.Mode.valueOf(iconCompat.f2424j);
        switch (iconCompat.f2416a) {
            case -1:
                if (iconCompat.f2419d != null) {
                    iconCompat.f2417b = iconCompat.f2419d;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                if (iconCompat.f2419d == null) {
                    iconCompat.f2417b = iconCompat.f2418c;
                    iconCompat.f2416a = 3;
                    iconCompat.f2420e = 0;
                    iconCompat.f2421f = iconCompat.f2418c.length;
                    break;
                } else {
                    iconCompat.f2417b = iconCompat.f2419d;
                    break;
                }
            case 2:
            case 4:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                iconCompat.f2417b = new String(iconCompat.f2418c, Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f2417b = iconCompat.f2418c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        iconCompat.f2424j = iconCompat.f2423i.name();
        switch (iconCompat.f2416a) {
            case -1:
                iconCompat.f2419d = (Parcelable) iconCompat.f2417b;
                break;
            case 1:
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                iconCompat.f2419d = (Parcelable) iconCompat.f2417b;
                break;
            case 2:
                iconCompat.f2418c = ((String) iconCompat.f2417b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f2418c = (byte[]) iconCompat.f2417b;
                break;
            case 4:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                iconCompat.f2418c = iconCompat.f2417b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        if (-1 != iconCompat.f2416a) {
            aVar.a(iconCompat.f2416a, 1);
        }
        if (iconCompat.f2418c != null) {
            aVar.b(iconCompat.f2418c);
        }
        if (iconCompat.f2419d != null) {
            aVar.a(iconCompat.f2419d, 3);
        }
        if (iconCompat.f2420e != 0) {
            aVar.a(iconCompat.f2420e, 4);
        }
        if (iconCompat.f2421f != 0) {
            aVar.a(iconCompat.f2421f, 5);
        }
        if (iconCompat.f2422g != null) {
            aVar.a(iconCompat.f2422g, 6);
        }
        if (iconCompat.f2424j != null) {
            aVar.b(iconCompat.f2424j);
        }
    }
}

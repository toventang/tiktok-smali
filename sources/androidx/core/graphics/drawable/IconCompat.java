package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.kakao.usermgmt.StringSet;
import java.lang.reflect.InvocationTargetException;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: h  reason: collision with root package name */
    static final PorterDuff.Mode f2415h = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f2416a;

    /* renamed from: b  reason: collision with root package name */
    public Object f2417b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f2418c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f2419d;

    /* renamed from: e  reason: collision with root package name */
    public int f2420e;

    /* renamed from: f  reason: collision with root package name */
    public int f2421f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f2422g;

    /* renamed from: i  reason: collision with root package name */
    PorterDuff.Mode f2423i;

    /* renamed from: j  reason: collision with root package name */
    public String f2424j;

    static {
        Covode.recordClassIndex(784);
    }

    public IconCompat() {
        this.f2416a = -1;
        this.f2423i = f2415h;
    }

    private Uri e() {
        if (this.f2416a == -1 && Build.VERSION.SDK_INT >= 23) {
            return d((Icon) this.f2417b);
        }
        int i2 = this.f2416a;
        if (i2 == 4 || i2 == 6) {
            return Uri.parse((String) this.f2417b);
        }
        throw new IllegalStateException("called getUri() on ".concat(String.valueOf(this)));
    }

    private String d() {
        if (this.f2416a == -1 && Build.VERSION.SDK_INT >= 23) {
            return b((Icon) this.f2417b);
        }
        if (this.f2416a == 2) {
            return ((String) this.f2417b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on ".concat(String.valueOf(this)));
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        switch (this.f2416a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f2417b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                bundle.putParcelable("obj", (Bitmap) this.f2417b);
                break;
            case 2:
            case 4:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                bundle.putString("obj", (String) this.f2417b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f2417b);
                break;
        }
        bundle.putInt(StringSet.type, this.f2416a);
        bundle.putInt("int1", this.f2420e);
        bundle.putInt("int2", this.f2421f);
        ColorStateList colorStateList = this.f2422g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f2423i;
        if (mode != f2415h) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public final int a() {
        if (this.f2416a == -1 && Build.VERSION.SDK_INT >= 23) {
            return c((Icon) this.f2417b);
        }
        if (this.f2416a == 2) {
            return this.f2420e;
        }
        throw new IllegalStateException("called getResId() on ".concat(String.valueOf(this)));
    }

    public final Icon b() {
        Icon icon;
        switch (this.f2416a) {
            case -1:
                return (Icon) this.f2417b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                icon = Icon.createWithBitmap((Bitmap) this.f2417b);
                break;
            case 2:
                icon = Icon.createWithResource(d(), this.f2420e);
                break;
            case 3:
                icon = Icon.createWithData((byte[]) this.f2417b, this.f2420e, this.f2421f);
                break;
            case 4:
                icon = Icon.createWithContentUri((String) this.f2417b);
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                if (Build.VERSION.SDK_INT < 26) {
                    icon = Icon.createWithBitmap(a((Bitmap) this.f2417b));
                    break;
                } else {
                    icon = Icon.createWithAdaptiveBitmap((Bitmap) this.f2417b);
                    break;
                }
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + e());
        }
        ColorStateList colorStateList = this.f2422g;
        if (colorStateList != null) {
            icon.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f2423i;
        if (mode != f2415h) {
            icon.setTintMode(mode);
        }
        return icon;
    }

    public String toString() {
        String str;
        if (this.f2416a == -1) {
            return String.valueOf(this.f2417b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f2416a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                str = "BITMAP_MASKABLE";
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        StringBuilder append = sb.append(str);
        switch (this.f2416a) {
            case 1:
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                append.append(" size=").append(((Bitmap) this.f2417b).getWidth()).append("x").append(((Bitmap) this.f2417b).getHeight());
                break;
            case 2:
                append.append(" pkg=").append(d()).append(" id=").append(a.a("0x%08x", new Object[]{Integer.valueOf(a())}));
                break;
            case 3:
                append.append(" len=").append(this.f2420e);
                if (this.f2421f != 0) {
                    append.append(" off=").append(this.f2421f);
                    break;
                }
                break;
            case 4:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                append.append(" uri=").append(this.f2417b);
                break;
        }
        if (this.f2422g != null) {
            append.append(" tint=");
            append.append(this.f2422g);
        }
        if (this.f2423i != f2415h) {
            append.append(" mode=").append(this.f2423i);
        }
        append.append(")");
        return append.toString();
    }

    private IconCompat(byte b2) {
        this.f2416a = -1;
        this.f2423i = f2415h;
        this.f2416a = 2;
    }

    public static int a(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return -1;
        }
    }

    private static String b(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static int c(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    private static Uri d(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static Bitmap a(Bitmap bitmap) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f2 = ((float) min) * 0.5f;
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, 0.9166667f * f2, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat a(String str, int i2) {
        if (i2 != 0) {
            IconCompat iconCompat = new IconCompat((byte) 0);
            iconCompat.f2420e = i2;
            iconCompat.f2417b = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }
}

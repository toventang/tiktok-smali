package androidx.core.graphics;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import androidx.core.g.e;
import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<e<Rect, Rect>> f2410a = new ThreadLocal<>();

    static {
        Covode.recordClassIndex(780);
    }

    public static boolean a(Paint paint, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return paint.hasGlyph(str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText("󟿽");
        float measureText2 = paint.measureText("m");
        float measureText3 = paint.measureText(str);
        float f2 = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i2 = 0;
            while (i2 < length) {
                int charCount = Character.charCount(str.codePointAt(i2)) + i2;
                f2 += paint.measureText(str, i2, charCount);
                i2 = charCount;
            }
            if (measureText3 >= f2) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        ThreadLocal<e<Rect, Rect>> threadLocal = f2410a;
        e<Rect, Rect> eVar = threadLocal.get();
        if (eVar == null) {
            eVar = new e<>(new Rect(), new Rect());
            threadLocal.set(eVar);
        } else {
            eVar.f2397a.setEmpty();
            eVar.f2398b.setEmpty();
        }
        paint.getTextBounds("󟿽", 0, 2, (Rect) eVar.f2397a);
        paint.getTextBounds(str, 0, length, (Rect) eVar.f2398b);
        if (!eVar.f2397a.equals(eVar.f2398b)) {
            return true;
        }
        return false;
    }
}

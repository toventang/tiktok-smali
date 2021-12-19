package androidx.core.content.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import androidx.core.content.a.c;
import androidx.core.e.b;
import androidx.core.graphics.e;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

public final class f {
    static {
        Covode.recordClassIndex(716);
    }

    public static abstract class a {
        static {
            Covode.recordClassIndex(717);
        }

        public abstract void a(Typeface typeface);

        public final void a(final int i2, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                /* class androidx.core.content.a.f.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(719);
                }

                public final void run() {
                }
            });
        }

        public final void a(final Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                /* class androidx.core.content.a.f.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(718);
                }

                public final void run() {
                    a.this.a(typeface);
                }
            });
        }
    }

    public static int b(Resources resources, int i2, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColor(i2, theme);
        }
        return resources.getColor(i2);
    }

    public static Drawable a(Resources resources, int i2, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i2, theme);
        }
        return resources.getDrawable(i2);
    }

    public static Typeface a(Context context, int i2, TypedValue typedValue, int i3, a aVar) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i2, typedValue, i3, aVar);
    }

    private static Typeface b(Context context, int i2, TypedValue typedValue, int i3, a aVar) {
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        Typeface a2 = a(context, resources, typedValue, i2, i3, aVar);
        if (a2 != null || aVar != null) {
            return a2;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i2) + " could not be retrieved.");
    }

    private static Typeface a(Context context, Resources resources, TypedValue typedValue, int i2, int i3, a aVar) {
        Typeface typeface;
        boolean z;
        if (typedValue.string != null) {
            String charSequence = typedValue.string.toString();
            if (!charSequence.startsWith("res/")) {
                if (aVar != null) {
                    aVar.a(-3, (Handler) null);
                }
                return null;
            }
            Typeface a2 = e.f2455b.a(e.a(resources, i2, i3));
            if (a2 != null) {
                if (aVar != null) {
                    aVar.a(a2, (Handler) null);
                }
                return a2;
            }
            try {
                if (charSequence.toLowerCase().endsWith(".xml")) {
                    c.a a3 = c.a(resources.getXml(i2), resources);
                    if (a3 == null) {
                        if (aVar != null) {
                            aVar.a(-3, (Handler) null);
                        }
                        return null;
                    }
                    if (a3 instanceof c.d) {
                        c.d dVar = (c.d) a3;
                        if (dVar.f2281c == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        typeface = b.a(context, dVar.f2279a, aVar, null, z, dVar.f2280b, i3);
                    } else {
                        typeface = e.f2454a.a(context, (c.b) a3, resources, i3);
                        if (aVar != null) {
                            if (typeface != null) {
                                aVar.a(typeface, (Handler) null);
                            } else {
                                aVar.a(-3, (Handler) null);
                            }
                        }
                    }
                    if (typeface != null) {
                        e.f2455b.a(e.a(resources, i2, i3), typeface);
                    }
                    return typeface;
                }
                Typeface a4 = e.a(context, resources, i2, charSequence, i3);
                if (aVar != null) {
                    if (a4 != null) {
                        aVar.a(a4, (Handler) null);
                    } else {
                        aVar.a(-3, (Handler) null);
                    }
                }
                return a4;
            } catch (IOException | XmlPullParserException unused) {
                if (aVar != null) {
                    aVar.a(-3, (Handler) null);
                }
                return null;
            }
        } else {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i2) + "\" (" + Integer.toHexString(i2) + ") is not a Font: " + typedValue);
        }
    }
}

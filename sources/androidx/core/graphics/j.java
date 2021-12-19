package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.a.c;
import androidx.core.e.b;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.io.InputStream;

public final class j extends k {
    static {
        Covode.recordClassIndex(801);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.graphics.k
    public final Typeface a(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.graphics.k
    public final b.C0030b a(b.C0030b[] bVarArr, int i2) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // androidx.core.graphics.k
    public final Typeface a(Context context, CancellationSignal cancellationSignal, b.C0030b[] bVarArr, int i2) {
        int i3;
        ContentResolver contentResolver = context.getContentResolver();
        int length = bVarArr.length;
        int i4 = 0;
        FontFamily.Builder builder = null;
        int i5 = 0;
        while (true) {
            int i6 = 1;
            if (i5 >= length) {
                break;
            }
            b.C0030b bVar = bVarArr[i5];
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(bVar.f2321a, "r", null);
                if (openFileDescriptor != null) {
                    try {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(bVar.f2323c);
                        if (!bVar.f2324d) {
                            i6 = 0;
                        }
                        Font build = weight.setSlant(i6).setTtcIndex(bVar.f2322b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                        openFileDescriptor.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            } catch (IOException unused) {
            }
            i5++;
        }
        if (builder == null) {
            return null;
        }
        if ((i2 & 1) != 0) {
            i3 = 700;
        } else {
            i3 = 400;
        }
        if ((i2 & 2) != 0) {
            i4 = 1;
        }
        return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i3, i4)).build();
        throw th;
    }

    @Override // androidx.core.graphics.k
    public final Typeface a(Context context, c.b bVar, Resources resources, int i2) {
        int i3;
        c.C0028c[] cVarArr = bVar.f2272a;
        int length = cVarArr.length;
        int i4 = 0;
        FontFamily.Builder builder = null;
        int i5 = 0;
        while (true) {
            int i6 = 1;
            if (i5 >= length) {
                break;
            }
            c.C0028c cVar = cVarArr[i5];
            try {
                Font.Builder weight = new Font.Builder(resources, cVar.f2278f).setWeight(cVar.f2274b);
                if (!cVar.f2275c) {
                    i6 = 0;
                }
                Font build = weight.setSlant(i6).setTtcIndex(cVar.f2277e).setFontVariationSettings(cVar.f2276d).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(build);
                } else {
                    builder.addFont(build);
                }
            } catch (IOException unused) {
            }
            i5++;
        }
        if (builder == null) {
            return null;
        }
        if ((i2 & 1) != 0) {
            i3 = 700;
        } else {
            i3 = 400;
        }
        if ((i2 & 2) != 0) {
            i4 = 1;
        }
        return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i3, i4)).build();
    }

    @Override // androidx.core.graphics.k
    public final Typeface a(Context context, Resources resources, int i2, String str, int i3) {
        try {
            Font build = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (IOException unused) {
            return null;
        }
    }
}

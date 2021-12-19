package com.facebook.drawee.f;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.facebook.drawee.e.b;
import com.facebook.drawee.e.q;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

public final class c {
    static {
        Covode.recordClassIndex(28799);
    }

    private static e a(b bVar) {
        if (bVar.t == null) {
            bVar.t = new e();
        }
        return bVar.t;
    }

    private static q.b a(TypedArray typedArray, int i2) {
        switch (typedArray.getInt(i2, -2)) {
            case -1:
                return null;
            case 0:
                return q.b.f47436b;
            case 1:
                return q.b.f47437c;
            case 2:
                return q.b.f47438d;
            case 3:
                return q.b.f47439e;
            case 4:
                return q.b.f47440f;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return q.b.f47441g;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return q.b.f47442h;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return q.b.f47443i;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return q.b.f47444j;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    private static Drawable a(Context context, TypedArray typedArray, int i2) {
        int resourceId = typedArray.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getResources().getDrawable(resourceId);
    }

    /* JADX INFO: finally extract failed */
    public static b a(b bVar, Context context, AttributeSet attributeSet) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f2;
        float f3;
        float f4;
        float f5;
        int i3 = 0;
        boolean z5 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.hv, R.attr.je, R.attr.ts, R.attr.tu, R.attr.tv, R.attr.a6o, R.attr.a7g, R.attr.a7h, R.attr.a7q, R.attr.a7u, R.attr.a7v, R.attr.a7w, R.attr.a9r, R.attr.a9s, R.attr.a_q, R.attr.a_r, R.attr.a_s, R.attr.a_t, R.attr.a_u, R.attr.a_w, R.attr.a_x, R.attr.a_y, R.attr.a_z, R.attr.aa0, R.attr.aa8, R.attr.aa_, R.attr.aaa, R.attr.aab, R.attr.at1});
            try {
                int indexCount = obtainStyledAttributes.getIndexCount();
                int i4 = 0;
                boolean z6 = true;
                boolean z7 = true;
                boolean z8 = true;
                boolean z9 = true;
                boolean z10 = true;
                boolean z11 = true;
                boolean z12 = true;
                boolean z13 = true;
                i2 = 0;
                for (int i5 = 0; i5 < indexCount; i5++) {
                    int index = obtainStyledAttributes.getIndex(i5);
                    if (index == 0) {
                        bVar.a(a(obtainStyledAttributes, index));
                    } else if (index == 6) {
                        bVar.f47465f = a(context, obtainStyledAttributes, index);
                    } else if (index == 8) {
                        bVar.a(a(context, obtainStyledAttributes, index));
                    } else if (index == 10) {
                        bVar.f47471l = a(context, obtainStyledAttributes, index);
                    } else if (index == 2) {
                        int i6 = z5 ? 1 : 0;
                        int i7 = z5 ? 1 : 0;
                        int i8 = z5 ? 1 : 0;
                        int i9 = z5 ? 1 : 0;
                        int i10 = z5 ? 1 : 0;
                        int i11 = z5 ? 1 : 0;
                        int i12 = z5 ? 1 : 0;
                        int i13 = z5 ? 1 : 0;
                        bVar.f47463d = obtainStyledAttributes.getInt(index, i6);
                    } else if (index == 28) {
                        bVar.f47464e = obtainStyledAttributes.getFloat(index, 0.0f);
                    } else if (index == 7) {
                        bVar.f47466g = a(obtainStyledAttributes, index);
                    } else if (index == 12) {
                        bVar.f47467h = a(context, obtainStyledAttributes, index);
                    } else if (index == 13) {
                        bVar.f47468i = a(obtainStyledAttributes, index);
                    } else if (index == 3) {
                        bVar.f47469j = a(context, obtainStyledAttributes, index);
                    } else if (index == 4) {
                        bVar.f47470k = a(obtainStyledAttributes, index);
                    } else if (index == 11) {
                        bVar.f47472m = a(obtainStyledAttributes, index);
                    } else if (index == 9) {
                        obtainStyledAttributes = obtainStyledAttributes;
                        i4 = obtainStyledAttributes.getInteger(index, i4);
                    } else if (index == 1) {
                        bVar.q = a(context, obtainStyledAttributes, index);
                    } else if (index == 5) {
                        Drawable a2 = a(context, obtainStyledAttributes, index);
                        if (a2 == null) {
                            bVar.r = null;
                        } else {
                            Drawable[] drawableArr = new Drawable[1];
                            char c2 = z5 ? 1 : 0;
                            char c3 = z5 ? 1 : 0;
                            char c4 = z5 ? 1 : 0;
                            char c5 = z5 ? 1 : 0;
                            char c6 = z5 ? 1 : 0;
                            char c7 = z5 ? 1 : 0;
                            char c8 = z5 ? 1 : 0;
                            char c9 = z5 ? 1 : 0;
                            drawableArr[c2] = a2;
                            bVar.r = Arrays.asList(drawableArr);
                        }
                    } else if (index == 14) {
                        a(bVar).f47476b = obtainStyledAttributes.getBoolean(index, z5);
                    } else if (index == 24) {
                        i2 = obtainStyledAttributes.getDimensionPixelSize(index, i2);
                    } else if (index == 20) {
                        z6 = obtainStyledAttributes.getBoolean(index, z6);
                    } else if (index == 21) {
                        z8 = obtainStyledAttributes.getBoolean(index, z8);
                    } else if (index == 16) {
                        z12 = obtainStyledAttributes.getBoolean(index, z12);
                    } else if (index == 17) {
                        z10 = obtainStyledAttributes.getBoolean(index, z10);
                    } else if (index == 22) {
                        z7 = obtainStyledAttributes.getBoolean(index, z7);
                    } else if (index == 19) {
                        z9 = obtainStyledAttributes.getBoolean(index, z9);
                    } else if (index == 18) {
                        z13 = obtainStyledAttributes.getBoolean(index, z13);
                    } else if (index == 15) {
                        z11 = obtainStyledAttributes.getBoolean(index, z11);
                        z5 = false;
                    } else {
                        if (index == 23) {
                            a(bVar).a(obtainStyledAttributes.getColor(index, 0));
                        } else if (index == 27) {
                            a(bVar).c((float) obtainStyledAttributes.getDimensionPixelSize(index, 0));
                        } else if (index == 25) {
                            a(bVar).f47480f = obtainStyledAttributes.getColor(index, 0);
                        } else if (index == 26) {
                            z5 = false;
                            a(bVar).d((float) obtainStyledAttributes.getDimensionPixelSize(index, 0));
                        }
                        z5 = false;
                    }
                }
                obtainStyledAttributes.recycle();
                int i14 = Build.VERSION.SDK_INT;
                if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                    if (!z6 || !z9) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (!z8 || !z7) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (!z10 || !z13) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z12 && z11) {
                        z5 = true;
                    }
                } else {
                    if (!z6 || !z7) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (!z8 || !z9) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (!z10 || !z11) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z12 && z13) {
                        z5 = true;
                    }
                }
                boolean z14 = z5 ? 1 : 0;
                Object[] objArr = z5 ? 1 : 0;
                Object[] objArr2 = z5 ? 1 : 0;
                Object[] objArr3 = z5 ? 1 : 0;
                Object[] objArr4 = z5 ? 1 : 0;
                Object[] objArr5 = z5 ? 1 : 0;
                Object[] objArr6 = z5 ? 1 : 0;
                Object[] objArr7 = z5 ? 1 : 0;
                z = z14;
                i3 = i4;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                int i15 = Build.VERSION.SDK_INT;
                context.getResources().getConfiguration().getLayoutDirection();
                throw th;
            }
        } else {
            z4 = true;
            i2 = 0;
            z2 = true;
            z3 = true;
            z = true;
        }
        if (bVar.f47471l != null && i3 > 0) {
            bVar.f47471l = new b(bVar.f47471l, i3);
        }
        if (i2 > 0) {
            e a3 = a(bVar);
            if (z3) {
                f2 = (float) i2;
            } else {
                f2 = 0.0f;
            }
            if (z4) {
                f3 = (float) i2;
            } else {
                f3 = 0.0f;
            }
            if (z2) {
                f4 = (float) i2;
            } else {
                f4 = 0.0f;
            }
            if (z) {
                f5 = (float) i2;
            } else {
                f5 = 0.0f;
            }
            a3.a(f2, f3, f4, f5);
        }
        return bVar;
    }
}

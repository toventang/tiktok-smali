package com.a.b.b;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.Toast;
import com.a.b.a.a;
import com.a.b.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;
import com.ss.android.ugc.aweme.utils.ic;
import h.f.b.l;
import h.m.p;

public final class a {
    static {
        Covode.recordClassIndex(2039);
    }

    private static void a(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            ic.a(toast);
        }
        toast.show();
    }

    public static final String a(String str) {
        l.c(str, "");
        int a2 = p.a((CharSequence) str, ":");
        if (a2 == -1) {
            return str;
        }
        String substring = str.substring(a2 + 1);
        l.a((Object) substring, "");
        return substring;
    }

    public static final boolean a(com.a.b.a.a aVar) {
        l.c(aVar, "");
        if (aVar instanceof a.c) {
            String str = aVar.f4926a;
            l.a((Object) str, "");
            return Boolean.parseBoolean(str);
        }
        throw new IllegalArgumentException("getBoolean:Drawable unsupported ParamsType type: " + aVar.f4926a);
    }

    public static final int b(Context context, com.a.b.a.a aVar) {
        l.c(context, "");
        l.c(aVar, "");
        if (aVar instanceof a.b) {
            a.b bVar = (a.b) aVar;
            if (l.a((Object) bVar.f4927b, (Object) "drawable") || l.a((Object) bVar.f4927b, (Object) b.f37372a)) {
                String str = aVar.f4926a;
                l.a((Object) str, "");
                return Integer.parseInt(str);
            }
        }
        throw new IllegalArgumentException("getDrawableId:Int unsupported ParamsType type: " + aVar.f4926a);
    }

    public static final Drawable c(Context context, com.a.b.a.a aVar) {
        l.c(context, "");
        l.c(aVar, "");
        if (aVar instanceof a.b) {
            a.b bVar = (a.b) aVar;
            if (l.a((Object) bVar.f4927b, (Object) "drawable") || l.a((Object) bVar.f4927b, (Object) b.f37372a)) {
                Resources resources = context.getResources();
                String str = aVar.f4926a;
                l.a((Object) str, "");
                Drawable drawable = resources.getDrawable(Integer.parseInt(str));
                l.a((Object) drawable, "");
                return drawable;
            }
        }
        throw new IllegalArgumentException("getDrawable:Drawable unsupported ParamsType type: " + aVar.f4926a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        if (r2.equals("dip") != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        if (r2.equals("dp") != false) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final float a(android.content.Context r5, com.a.b.a.a r6) {
        /*
        // Method dump skipped, instructions count: 236
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.b.b.a.a(android.content.Context, com.a.b.a.a):float");
    }

    public static final int d(Context context, com.a.b.a.a aVar) {
        l.c(context, "");
        l.c(aVar, "");
        if (aVar instanceof a.c) {
            String str = aVar.f4926a;
            l.a((Object) str, "");
            if (p.b(str, "#", false)) {
                if (aVar.f4926a.length() >= 7) {
                    return Color.parseColor(aVar.f4926a);
                }
                throw new IllegalArgumentException("color format must be like #FF0000 current is " + aVar.f4926a);
            }
        }
        if (aVar instanceof a.b) {
            a.b bVar = (a.b) aVar;
            if (bVar.f4927b.equals(b.f37372a)) {
                Resources resources = context.getResources();
                String str2 = aVar.f4926a;
                l.a((Object) str2, "");
                return resources.getColor(Integer.parseInt(str2));
            }
            String str3 = bVar.f4927b;
            l.a((Object) str3, "");
            if (p.b(str3, "attr", false)) {
                String str4 = aVar.f4926a;
                l.a((Object) str4, "");
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{Integer.parseInt(str4)});
                int color = obtainStyledAttributes.getColor(0, 0);
                obtainStyledAttributes.recycle();
                return color;
            }
        }
        throw new IllegalArgumentException("getColor:Drawable unsupported ParamsType type: " + aVar.f4926a);
    }

    public static final boolean a(Context context, String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        String str3 = str + " unsupported attr: " + str2;
        if (g.f4952a) {
            a(Toast.makeText(context, str3, 1));
        }
        throw new IllegalArgumentException(str3);
    }
}

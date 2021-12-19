package com.bytedance.android.monitor.lynx.a;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import com.bytedance.android.monitor.l.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.a.b;
import com.bytedance.ugc.a.c;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.a.d;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import h.f.b.l;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class e extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final e f23577a = new e();

    /* renamed from: c  reason: collision with root package name */
    private static final String f23578c = f23578c;

    /* renamed from: d  reason: collision with root package name */
    private static final Method f23579d = h.a((Class<?>) LynxBaseUI.class, "getOriginLeft", (Class<?>[]) null);

    private e() {
    }

    static {
        Covode.recordClassIndex(13997);
    }

    private static int a(int i2) {
        if (i2 == 0 || Color.alpha(i2) < 5) {
            return 0;
        }
        int red = Color.red(i2);
        int green = Color.green(i2);
        int blue = Color.blue(i2);
        if (red <= 240 || green <= 240 || blue <= 240) {
            return 1;
        }
        return 2;
    }

    private static int a(Drawable drawable) {
        while (drawable instanceof StateListDrawable) {
            drawable = ((StateListDrawable) drawable).getCurrent();
        }
        if (drawable == null) {
            return 0;
        }
        if (drawable instanceof ColorDrawable) {
            return a(((ColorDrawable) drawable).getColor());
        }
        if (!(drawable instanceof BackgroundDrawable)) {
            return 1;
        }
        d dVar = null;
        try {
            Field declaredField = BackgroundDrawable.class.getDeclaredField("f");
            l.a((Object) declaredField, "");
            declaredField.setAccessible(true);
            dVar = (d) declaredField.get(drawable);
        } catch (Exception unused) {
        }
        if (dVar == null || !dVar.a()) {
            return a(((BackgroundDrawable) drawable).f56370e);
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b9, code lost:
        if (((double) ((com.lynx.tasm.behavior.ui.LynxFlattenUI) r10).f56064a) < 0.05d) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0039, code lost:
        if (((double) r7.getScaleY()) >= 0.01d) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(com.lynx.tasm.LynxView r9, com.lynx.tasm.behavior.ui.LynxBaseUI r10) {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.monitor.lynx.a.e.a(com.lynx.tasm.LynxView, com.lynx.tasm.behavior.ui.LynxBaseUI):boolean");
    }

    @Override // com.bytedance.ugc.a.c.a
    public final boolean a(b bVar, View view, int i2, int i3, int i4, int i5, int i6, int i7, c.a aVar) {
        l.c(bVar, "");
        l.c(view, "");
        if (!(view instanceof LynxView)) {
            return false;
        }
        try {
            UIGroup<UIBody.a> lynxUIRoot = ((LynxView) view).getLynxUIRoot();
            l.a((Object) lynxUIRoot, "");
            a((LynxView) view, bVar, lynxUIRoot, i2, i3, i4, i5, i6, i7, aVar, "-");
            return true;
        } catch (Throwable unused) {
            bVar.a(i4, i5, i6, i7, 1);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0114, code lost:
        if (r0.length() > 0) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0154, code lost:
        if (r0.length() > 0) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01ca, code lost:
        if (r8 > 0) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x024e, code lost:
        if (r0.length() > 0) goto L_0x0116;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(com.lynx.tasm.LynxView r24, com.bytedance.ugc.a.b r25, com.lynx.tasm.behavior.ui.LynxBaseUI r26, int r27, int r28, int r29, int r30, int r31, int r32, com.bytedance.ugc.a.c.a r33, java.lang.String r34) {
        /*
        // Method dump skipped, instructions count: 658
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.monitor.lynx.a.e.a(com.lynx.tasm.LynxView, com.bytedance.ugc.a.b, com.lynx.tasm.behavior.ui.LynxBaseUI, int, int, int, int, int, int, com.bytedance.ugc.a.c$a, java.lang.String):void");
    }
}

package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.core.f.d;
import androidx.core.g.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static Field f2642a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2643b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f2644c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f2645d;

    static {
        Covode.recordClassIndex(906);
    }

    /* access modifiers changed from: package-private */
    public static class a implements ActionMode.Callback {

        /* renamed from: a  reason: collision with root package name */
        private final ActionMode.Callback f2646a;

        /* renamed from: b  reason: collision with root package name */
        private final TextView f2647b;

        /* renamed from: c  reason: collision with root package name */
        private Class<?> f2648c;

        /* renamed from: d  reason: collision with root package name */
        private Method f2649d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f2650e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f2651f;

        static {
            Covode.recordClassIndex(907);
        }

        private static Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f2646a.onDestroyActionMode(actionMode);
        }

        a(ActionMode.Callback callback, TextView textView) {
            this.f2646a = callback;
            this.f2647b = textView;
        }

        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f2646a.onActionItemClicked(actionMode, menuItem);
        }

        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f2646a.onCreateActionMode(actionMode, menu);
        }

        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            Method declaredMethod;
            boolean z;
            Context context = this.f2647b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f2651f) {
                this.f2651f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f2648c = cls;
                    this.f2649d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f2650e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f2648c = null;
                    this.f2649d = null;
                    this.f2650e = false;
                }
            }
            try {
                if (!this.f2650e || !this.f2648c.isInstance(menu)) {
                    declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                } else {
                    declaredMethod = this.f2649d;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (context instanceof Activity) {
                    for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(a(), 0)) {
                        if (context.getPackageName().equals(resolveInfo.activityInfo.packageName) || (resolveInfo.activityInfo.exported && (resolveInfo.activityInfo.permission == null || context.checkSelfPermission(resolveInfo.activityInfo.permission) == 0))) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i2);
                    MenuItem add = menu.add(0, 0, i2 + 100, resolveInfo2.loadLabel(packageManager));
                    TextView textView = this.f2647b;
                    Intent a2 = a();
                    if (!(textView instanceof Editable) || !textView.onCheckIsTextEditor() || !textView.isEnabled()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    add.setIntent(a2.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !z).setClassName(resolveInfo2.activityInfo.packageName, resolveInfo2.activityInfo.name)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
            return this.f2646a.onPrepareActionMode(actionMode, menu);
        }
    }

    public static int a(TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        return textView.getMaxLines();
    }

    public static Drawable[] b(TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        return textView.getCompoundDrawablesRelative();
    }

    public static d.a c(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new d.a(textView.getTextMetricsParams());
        }
        d.a.C0032a aVar = new d.a.C0032a(new TextPaint(textView.getPaint()));
        if (Build.VERSION.SDK_INT >= 23) {
            aVar.f2379b = textView.getBreakStrategy();
            aVar.f2380c = textView.getHyphenationFrequency();
        }
        int i2 = Build.VERSION.SDK_INT;
        aVar.f2378a = d(textView);
        return aVar.a();
    }

    private static Field a(String str) {
        try {
            Field declaredField = TextView.class.getDeclaredField(str);
            try {
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
                return declaredField;
            }
        } catch (NoSuchFieldException unused2) {
            return null;
        }
    }

    private static TextDirectionHeuristic d(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() == 1) {
                z = true;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    return TextDirectionHeuristics.LOCALE;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    if (z) {
                        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    private static int a(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            field.getName();
            return -1;
        }
    }

    public static void b(TextView textView, int i2) {
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeWithDefaults(i2);
        } else if (textView instanceof b) {
            ((b) textView).setAutoSizeTextTypeWithDefaults(i2);
        }
    }

    public static void e(TextView textView, int i2) {
        g.a(i2);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i2 != fontMetricsInt) {
            textView.setLineSpacing((float) (i2 - fontMetricsInt), 1.0f);
        }
    }

    public static ActionMode.Callback a(TextView textView, ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT < 26 || Build.VERSION.SDK_INT > 27 || (callback instanceof a)) {
            return callback;
        }
        return new a(callback, textView);
    }

    public static void d(TextView textView, int i2) {
        int i3;
        g.a(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i4 = Build.VERSION.SDK_INT;
        if (textView.getIncludeFontPadding()) {
            i3 = fontMetricsInt.bottom;
        } else {
            i3 = fontMetricsInt.descent;
        }
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static void c(TextView textView, int i2) {
        int i3;
        g.a(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i4 = Build.VERSION.SDK_INT;
        if (textView.getIncludeFontPadding()) {
            i3 = fontMetricsInt.top;
        } else {
            i3 = fontMetricsInt.ascent;
        }
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void a(TextView textView, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i2);
        } else {
            textView.setTextAppearance(textView.getContext(), i2);
        }
    }

    public static void a(TextView textView, Drawable drawable) {
        int i2 = Build.VERSION.SDK_INT;
        textView.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public static void a(TextView textView, d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(dVar.a());
        } else if (c(textView).a(dVar.f2370a)) {
            textView.setText(dVar);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    public static void a(TextView textView, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
        } else if (textView instanceof b) {
            ((b) textView).setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
        }
    }
}

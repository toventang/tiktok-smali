package com.bytedance.common.utility;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.ic;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f26954a;

    /* renamed from: b  reason: collision with root package name */
    public static a f26955b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static b f26956c;

    /* renamed from: d  reason: collision with root package name */
    private static String f26957d = "";

    /* renamed from: e  reason: collision with root package name */
    private static int f26958e = -1;

    public static class a {
        static {
            Covode.recordClassIndex(15920);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(15921);
        }

        boolean a(Context context, CharSequence charSequence, long j2);
    }

    private static boolean a(int i2) {
        return i2 == 0 || i2 == 8 || i2 == 4;
    }

    public static void a(final View view, final int i2, final int i3, final int i4, final int i5) {
        view.post(new Runnable() {
            /* class com.bytedance.common.utility.n.AnonymousClass2 */

            static {
                Covode.recordClassIndex(15919);
            }

            public final void run() {
                Rect rect = new Rect();
                view.getHitRect(rect);
                rect.top += i3;
                rect.bottom += i5;
                rect.left += i2;
                rect.right += i4;
                TouchDelegate touchDelegate = new TouchDelegate(rect, view);
                if (View.class.isInstance(view.getParent())) {
                    ((View) view.getParent()).setTouchDelegate(touchDelegate);
                }
            }
        });
    }

    public static boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void a(View view, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            a(view, (ViewGroup.MarginLayoutParams) layoutParams, i2, i3, i4);
        }
    }

    private static void a(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3, int i4) {
        if (view != null && marginLayoutParams != null) {
            if (marginLayoutParams.leftMargin != -3 || marginLayoutParams.topMargin != i2 || marginLayoutParams.rightMargin != i3 || marginLayoutParams.bottomMargin != i4) {
                if (i2 != -3) {
                    marginLayoutParams.topMargin = i2;
                }
                if (i3 != -3) {
                    marginLayoutParams.rightMargin = i3;
                }
                if (i4 != -3) {
                    marginLayoutParams.bottomMargin = i4;
                }
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static void a(TextView textView, CharSequence charSequence) {
        if (textView != null && !TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
        }
    }

    public static boolean a(View view) {
        if (view == null || view.getAnimation() == null) {
            return false;
        }
        view.clearAnimation();
        return true;
    }

    private static void a(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            ic.a(toast);
        }
        toast.show();
    }

    static {
        boolean z;
        Covode.recordClassIndex(15917);
        if (Build.VERSION.SDK_INT > 19) {
            z = true;
        } else {
            z = false;
        }
        f26954a = z;
    }

    public static int e(Context context) {
        int identifier;
        if (context != null && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int a(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.widthPixels;
    }

    public static int b(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.heightPixels;
    }

    public static String c(Context context) {
        if (m.a(f26957d) && context != null) {
            int a2 = a(context);
            int b2 = b(context);
            if (a2 > 0 && b2 > 0) {
                f26957d = a2 + "*" + b2;
            }
        }
        return f26957d;
    }

    public static int d(Context context) {
        if (f26958e == -1 && context != null) {
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            f26958e = applicationContext.getResources().getDisplayMetrics().densityDpi;
        }
        return f26958e;
    }

    public static void a(Context context, int i2) {
        a(context, 0, context.getString(i2));
    }

    public static float a(Context context, float f2) {
        if (context != null) {
            return TypedValue.applyDimension(2, f2, context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    public static float b(Context context, float f2) {
        if (context != null) {
            return (f2 * context.getResources().getDisplayMetrics().density) + 0.5f;
        }
        return 0.0f;
    }

    public static int c(Context context, float f2) {
        if (context != null) {
            return (int) ((f2 / context.getResources().getDisplayMetrics().density) + 0.5f);
        }
        return 0;
    }

    public static void a(Activity activity, boolean z) {
        if (activity != null && !activity.isFinishing()) {
            activity.setRequestedOrientation(!z ? 1 : 0);
            if (z) {
                activity.getWindow().setFlags(1024, 1024);
            } else {
                activity.getWindow().clearFlags(1024);
            }
        }
    }

    public static void a(View view, int i2) {
        if (view != null && view.getVisibility() != i2 && a(i2)) {
            view.setVisibility(i2);
        }
    }

    public static void a(Context context, int i2, int i3) {
        a(context, i2, context.getString(i3));
    }

    public static void a(Context context, int i2, String str) {
        a(context, i2, str, 0, 17);
    }

    public static void a(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            if (layoutParams.width != i2 || layoutParams.height != i3) {
                if (i2 != -3) {
                    layoutParams.width = i2;
                }
                if (i3 != -3) {
                    layoutParams.height = i3;
                }
                view.setLayoutParams(layoutParams);
            }
        }
    }

    public static void a(final Context context, final int i2, final String str, final int i3, final int i4) {
        if (context != null && !m.a(str)) {
            if (!a()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    /* class com.bytedance.common.utility.n.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(15918);
                    }

                    public final void run() {
                        n.a(context, i2, str, i3, i4);
                    }
                });
                return;
            }
            b bVar = f26956c;
            if (bVar != null && bVar.a(context, str, (long) i3)) {
                return;
            }
            if (!(context instanceof f)) {
                try {
                    Toast makeText = Toast.makeText(context, str, i3);
                    if (makeText != null) {
                        makeText.setGravity(i4, 0, 0);
                        a(makeText);
                    }
                } catch (Exception e2) {
                    Logger.throwException(e2);
                }
            } else if (i3 == 1) {
                ((f) context).showCustomLongToast(i2, str);
            } else {
                f fVar = (f) context;
                if (i3 == 0) {
                    i3 = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
                }
                fVar.showCustomToast(i2, str, i3, i4);
            }
        }
    }
}

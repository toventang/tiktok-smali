package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.helios.sdk.a;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
public final class ap {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1583a;

    /* renamed from: b  reason: collision with root package name */
    private final View f1584b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f1585c;

    /* renamed from: d  reason: collision with root package name */
    private final WindowManager.LayoutParams f1586d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f1587e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final int[] f1588f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    private final int[] f1589g = new int[2];

    static {
        Covode.recordClassIndex(478);
    }

    private static void a(WindowManager windowManager, View view) {
        if (!((Boolean) a.a(windowManager, new Object[]{view}, 102801, "void", false, null).first).booleanValue()) {
            windowManager.removeView(view);
            a.a(null, windowManager, new Object[]{view}, 102801, "androidx_appcompat_widget_TooltipPopup_android_view_WindowManager_removeView(Landroid/view/WindowManager;Landroid/view/View;)V");
        }
    }

    private static void a(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        if (!((Boolean) a.a(windowManager, new Object[]{view, layoutParams}, 102800, "void", false, null).first).booleanValue()) {
            windowManager.addView(view, layoutParams);
            a.a(null, windowManager, new Object[]{view, layoutParams}, 102800, "androidx_appcompat_widget_TooltipPopup_android_view_WindowManager_addView(Landroid/view/WindowManager;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V");
        }
    }

    private boolean b() {
        if (this.f1584b.getParent() != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (b()) {
            a((WindowManager) a(this.f1583a, "window"), this.f1584b);
        }
    }

    private static View a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    ap(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1586d = layoutParams;
        this.f1583a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.as, (ViewGroup) null);
        this.f1584b = inflate;
        this.f1585c = (TextView) inflate.findViewById(R.id.clf);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.f160044f;
        layoutParams.flags = 24;
    }

    private static Object a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!i.f107219a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                i.f107219a = false;
            }
            return systemService;
        }
    }

    private void a(View view, int i2, int i3, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i4;
        int i5;
        int i6;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1583a.getResources().getDimensionPixelOffset(R.dimen.u0);
        if (view.getWidth() < dimensionPixelOffset) {
            i2 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1583a.getResources().getDimensionPixelOffset(R.dimen.tz);
            height = i3 + dimensionPixelOffset2;
            i4 = i3 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i4 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = this.f1583a.getResources();
        if (z) {
            i5 = R.dimen.u3;
        } else {
            i5 = R.dimen.u2;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i5);
        View a2 = a(view);
        if (a2 != null) {
            a2.getWindowVisibleDisplayFrame(this.f1587e);
            if (this.f1587e.left < 0 && this.f1587e.top < 0) {
                Resources resources2 = this.f1583a.getResources();
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i6 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i6 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                this.f1587e.set(0, i6, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            a2.getLocationOnScreen(this.f1589g);
            view.getLocationOnScreen(this.f1588f);
            int[] iArr = this.f1588f;
            int i7 = iArr[0];
            int[] iArr2 = this.f1589g;
            iArr[0] = i7 - iArr2[0];
            iArr[1] = iArr[1] - iArr2[1];
            layoutParams.x = (iArr[0] + i2) - (a2.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.f1584b.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = this.f1584b.getMeasuredHeight();
            int[] iArr3 = this.f1588f;
            int i8 = ((iArr3[1] + i4) - dimensionPixelOffset3) - measuredHeight;
            int i9 = iArr3[1] + height + dimensionPixelOffset3;
            if (z) {
                if (i8 < 0) {
                    layoutParams.y = i9;
                    return;
                }
            } else if (measuredHeight + i9 <= this.f1587e.height()) {
                layoutParams.y = i9;
                return;
            }
            layoutParams.y = i8;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(View view, int i2, int i3, boolean z, CharSequence charSequence) {
        if (b()) {
            a();
        }
        this.f1585c.setText(charSequence);
        a(view, i2, i3, z, this.f1586d);
        a((WindowManager) a(this.f1583a, "window"), this.f1584b, this.f1586d);
    }
}

package com.gyf.barlibrary;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class BarConfig {
    private final int mActionBarHeight;
    private final boolean mHasNavigationBar;
    private final boolean mHasNotchScreen;
    private final boolean mInPortrait;
    private final int mNavigationBarHeight;
    private final int mNavigationBarWidth;
    private final float mSmallestWidthDp;
    private final int mStatusBarHeight;

    static {
        Covode.recordClassIndex(34155);
    }

    /* access modifiers changed from: package-private */
    public int getActionBarHeight() {
        return this.mActionBarHeight;
    }

    /* access modifiers changed from: package-private */
    public int getNavigationBarHeight() {
        return this.mNavigationBarHeight;
    }

    /* access modifiers changed from: package-private */
    public int getNavigationBarWidth() {
        return this.mNavigationBarWidth;
    }

    /* access modifiers changed from: package-private */
    public int getStatusBarHeight() {
        return this.mStatusBarHeight;
    }

    /* access modifiers changed from: package-private */
    public boolean hasNavigationBar() {
        return this.mHasNavigationBar;
    }

    /* access modifiers changed from: package-private */
    public boolean hasNotchScreen() {
        return this.mHasNotchScreen;
    }

    /* access modifiers changed from: package-private */
    public boolean isNavigationAtBottom() {
        if (this.mSmallestWidthDp >= 600.0f || this.mInPortrait) {
            return true;
        }
        return false;
    }

    private int getNavigationBarHeight(Context context) {
        String str;
        int i2 = Build.VERSION.SDK_INT;
        if (!hasNavBar((Activity) context)) {
            return 0;
        }
        if (this.mInPortrait) {
            str = "navigation_bar_height";
        } else {
            str = "navigation_bar_height_landscape";
        }
        return getInternalDimensionSize(context, str);
    }

    private int getNavigationBarWidth(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (hasNavBar((Activity) context)) {
            return getInternalDimensionSize(context, "navigation_bar_width");
        }
        return 0;
    }

    private int getActionBarHeight(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843499, typedValue, true);
        return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    private float getSmallestWidthDp(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        int i2 = Build.VERSION.SDK_INT;
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        return Math.min(((float) displayMetrics.widthPixels) / displayMetrics.density, ((float) displayMetrics.heightPixels) / displayMetrics.density);
    }

    private boolean hasNavBar(Activity activity) {
        int i2 = Build.VERSION.SDK_INT;
        if (Settings.Global.getInt(activity.getContentResolver(), "force_fsg_nav_bar", 0) != 0) {
            return false;
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        int i3 = Build.VERSION.SDK_INT;
        defaultDisplay.getRealMetrics(displayMetrics);
        int i4 = displayMetrics.heightPixels;
        int i5 = displayMetrics.widthPixels;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        int i6 = displayMetrics2.heightPixels;
        if (i5 - displayMetrics2.widthPixels > 0 || i4 - i6 > 0) {
            return true;
        }
        return false;
    }

    BarConfig(Activity activity) {
        boolean z;
        boolean z2 = false;
        if (activity.getResources().getConfiguration().orientation == 1) {
            z = true;
        } else {
            z = false;
        }
        this.mInPortrait = z;
        this.mSmallestWidthDp = getSmallestWidthDp(activity);
        this.mStatusBarHeight = getInternalDimensionSize(activity, "status_bar_height");
        this.mActionBarHeight = getActionBarHeight(activity);
        int navigationBarHeight = getNavigationBarHeight(activity);
        this.mNavigationBarHeight = navigationBarHeight;
        this.mNavigationBarWidth = getNavigationBarWidth(activity);
        this.mHasNavigationBar = navigationBarHeight > 0 ? true : z2;
        this.mHasNotchScreen = NotchUtils.hasNotchScreen(activity);
    }

    private int getInternalDimensionSize(Context context, String str) {
        try {
            int identifier = Resources.getSystem().getIdentifier(str, "dimen", "android");
            if (identifier > 0) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
                int dimensionPixelSize2 = Resources.getSystem().getDimensionPixelSize(identifier);
                if (dimensionPixelSize2 >= dimensionPixelSize) {
                    return dimensionPixelSize2;
                }
                return Math.round((((float) dimensionPixelSize) * Resources.getSystem().getDisplayMetrics().density) / context.getResources().getDisplayMetrics().density);
            }
        } catch (Resources.NotFoundException unused) {
        }
        return 0;
    }
}

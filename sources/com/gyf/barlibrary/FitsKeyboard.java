package com.gyf.barlibrary;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.bytedance.covode.number.Covode;

public class FitsKeyboard implements ViewTreeObserver.OnGlobalLayoutListener {
    private final int mActionBarHeight;
    private Activity mActivity;
    private View mChildView;
    private View mContentView;
    private View mDecorView;
    private ImmersionBar mImmersionBar;
    private boolean mIsAddListener;
    private int mPaddingBottom;
    private int mPaddingLeft;
    private int mPaddingRight;
    private int mPaddingTop;
    private final int mStatusBarHeight;
    private int mTempKeyboardHeight;
    private Window mWindow;

    static {
        Covode.recordClassIndex(34159);
    }

    /* access modifiers changed from: package-private */
    public void cancel() {
        int i2 = Build.VERSION.SDK_INT;
        if (this.mIsAddListener) {
            this.mDecorView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.mIsAddListener = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void disable() {
        int i2 = Build.VERSION.SDK_INT;
        if (!this.mIsAddListener) {
            return;
        }
        if (this.mChildView != null) {
            this.mContentView.setPadding(this.mPaddingLeft, this.mPaddingTop, this.mPaddingRight, this.mPaddingBottom);
        } else {
            this.mContentView.setPadding(this.mImmersionBar.getPaddingLeft(), this.mImmersionBar.getPaddingTop(), this.mImmersionBar.getPaddingRight(), this.mImmersionBar.getPaddingBottom());
        }
    }

    public void onGlobalLayout() {
        int i2;
        ImmersionBar immersionBar = this.mImmersionBar;
        if (immersionBar != null && immersionBar.getBarParams() != null && this.mImmersionBar.getBarParams().keyboardEnable) {
            int navigationBarHeight = ImmersionBar.getNavigationBarHeight(this.mActivity);
            Rect rect = new Rect();
            this.mDecorView.getWindowVisibleDisplayFrame(rect);
            int height = this.mContentView.getHeight() - rect.bottom;
            if (height != this.mTempKeyboardHeight) {
                this.mTempKeyboardHeight = height;
                boolean z = true;
                int i3 = 0;
                if (ImmersionBar.checkFitsSystemWindows(this.mWindow.getDecorView().findViewById(16908290))) {
                    height -= navigationBarHeight;
                    if (height <= navigationBarHeight) {
                        z = false;
                    }
                } else if (this.mChildView != null) {
                    if (this.mImmersionBar.getBarParams().isSupportActionBar) {
                        height += this.mActionBarHeight + this.mStatusBarHeight;
                    }
                    if (this.mImmersionBar.getBarParams().fits) {
                        height += this.mStatusBarHeight;
                    }
                    if (height > navigationBarHeight) {
                        i2 = this.mPaddingBottom + height;
                    } else {
                        i2 = 0;
                        z = false;
                    }
                    this.mContentView.setPadding(this.mPaddingLeft, this.mPaddingTop, this.mPaddingRight, i2);
                } else {
                    int paddingBottom = this.mImmersionBar.getPaddingBottom();
                    height -= navigationBarHeight;
                    if (height > navigationBarHeight) {
                        paddingBottom = height + navigationBarHeight;
                    } else {
                        z = false;
                    }
                    this.mContentView.setPadding(this.mImmersionBar.getPaddingLeft(), this.mImmersionBar.getPaddingTop(), this.mImmersionBar.getPaddingRight(), paddingBottom);
                }
                if (height >= 0) {
                    i3 = height;
                }
                if (this.mImmersionBar.getBarParams().onKeyboardListener != null) {
                    this.mImmersionBar.getBarParams().onKeyboardListener.onKeyboardChange(z, i3);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void enable(int i2) {
        int i3 = Build.VERSION.SDK_INT;
        this.mWindow.setSoftInputMode(i2);
        if (!this.mIsAddListener) {
            this.mDecorView.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.mIsAddListener = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    FitsKeyboard(com.gyf.barlibrary.ImmersionBar r5, android.app.Activity r6, android.view.Window r7) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gyf.barlibrary.FitsKeyboard.<init>(com.gyf.barlibrary.ImmersionBar, android.app.Activity, android.view.Window):void");
    }
}

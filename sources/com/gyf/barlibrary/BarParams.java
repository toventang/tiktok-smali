package com.gyf.barlibrary;

import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public class BarParams implements Cloneable {
    float autoNavigationBarDarkModeAlpha;
    boolean autoNavigationBarDarkModeEnable;
    float autoStatusBarDarkModeAlpha;
    boolean autoStatusBarDarkModeEnable;
    BarHide barHide = BarHide.FLAG_SHOW_BAR;
    float contentAlpha = 0.0f;
    int contentColor = 0;
    int contentColorTransform = -16777216;
    int defaultNavigationBarColor = -16777216;
    public boolean fits = false;
    boolean fixMarginAtBottom = false;
    int flymeOSStatusBarFontColor;
    public boolean fullScreen;
    boolean hideNavigationBar;
    boolean isSupportActionBar = false;
    public boolean keyboardEnable = false;
    int keyboardMode = 18;
    float navigationBarAlpha;
    int navigationBarColor = -16777216;
    int navigationBarColorTransform = -16777216;
    boolean navigationBarDarkIcon;
    boolean navigationBarEnable = true;
    boolean navigationBarWithEMUI3Enable = true;
    boolean navigationBarWithKitkatEnable = true;
    OnKeyboardListener onKeyboardListener;
    float statusBarAlpha;
    int statusBarColor;
    boolean statusBarColorEnabled = true;
    int statusBarColorTransform = -16777216;
    boolean statusBarDarkFont;
    View statusBarView;
    View titleBarView;
    boolean useDefaultNavigationBarColor = true;
    float viewAlpha = 0.0f;
    Map<View, Map<Integer, Integer>> viewMap = new HashMap();

    static {
        Covode.recordClassIndex(34157);
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public BarParams clone() {
        try {
            return (BarParams) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }
}

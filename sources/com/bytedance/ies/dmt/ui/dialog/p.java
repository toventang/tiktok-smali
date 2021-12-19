package com.bytedance.ies.dmt.ui.dialog;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class p implements Window.Callback {

    /* renamed from: a  reason: collision with root package name */
    public a f33454a;

    /* renamed from: b  reason: collision with root package name */
    public final Window.Callback f33455b;

    public interface a {
        static {
            Covode.recordClassIndex(19963);
        }

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(19962);
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f33455b.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f33455b.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f33455b.dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f33455b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f33455b.dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f33455b.dispatchTrackballEvent(motionEvent);
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        this.f33455b.onActionModeFinished(actionMode);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        this.f33455b.onActionModeStarted(actionMode);
    }

    public final void onAttachedToWindow() {
        this.f33455b.onAttachedToWindow();
    }

    public final void onContentChanged() {
        this.f33455b.onContentChanged();
    }

    public final boolean onCreatePanelMenu(int i2, Menu menu) {
        l.d(menu, "");
        return this.f33455b.onCreatePanelMenu(i2, menu);
    }

    public final View onCreatePanelView(int i2) {
        return this.f33455b.onCreatePanelView(i2);
    }

    public final void onDetachedFromWindow() {
        this.f33455b.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        l.d(menuItem, "");
        return this.f33455b.onMenuItemSelected(i2, menuItem);
    }

    public final boolean onMenuOpened(int i2, Menu menu) {
        l.d(menu, "");
        return this.f33455b.onMenuOpened(i2, menu);
    }

    public final void onPanelClosed(int i2, Menu menu) {
        l.d(menu, "");
        this.f33455b.onPanelClosed(i2, menu);
    }

    public final boolean onPreparePanel(int i2, View view, Menu menu) {
        l.d(menu, "");
        return this.f33455b.onPreparePanel(i2, view, menu);
    }

    public final boolean onSearchRequested() {
        return this.f33455b.onSearchRequested();
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f33455b.onSearchRequested(searchEvent);
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f33455b.onWindowAttributesChanged(layoutParams);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f33455b.onWindowStartingActionMode(callback);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
        return this.f33455b.onWindowStartingActionMode(callback, i2);
    }

    public p(Window.Callback callback) {
        l.d(callback, "");
        this.f33455b = callback;
    }

    public final void onWindowFocusChanged(boolean z) {
        this.f33455b.onWindowFocusChanged(z);
        a aVar = this.f33454a;
        if (aVar != null) {
            aVar.a(z);
        }
    }
}

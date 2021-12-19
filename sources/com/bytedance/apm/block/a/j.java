package com.bytedance.apm.block.a;

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

public abstract class j implements Window.Callback {

    /* renamed from: b  reason: collision with root package name */
    protected Window.Callback f24639b;

    static {
        Covode.recordClassIndex(14490);
    }

    public void onAttachedToWindow() {
        this.f24639b.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.f24639b.onContentChanged();
    }

    public void onDetachedFromWindow() {
        this.f24639b.onDetachedFromWindow();
    }

    public boolean onSearchRequested() {
        return this.f24639b.onSearchRequested();
    }

    public j(Window.Callback callback) {
        this.f24639b = callback;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f24639b.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f24639b.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f24639b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f24639b.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f24639b.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f24639b.onActionModeStarted(actionMode);
    }

    public View onCreatePanelView(int i2) {
        return this.f24639b.onCreatePanelView(i2);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f24639b.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f24639b.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f24639b.onWindowStartingActionMode(callback);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f24639b.onSearchRequested(searchEvent);
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        return this.f24639b.onCreatePanelMenu(i2, menu);
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        return this.f24639b.onMenuItemSelected(i2, menuItem);
    }

    public boolean onMenuOpened(int i2, Menu menu) {
        return this.f24639b.onMenuOpened(i2, menu);
    }

    public void onPanelClosed(int i2, Menu menu) {
        this.f24639b.onPanelClosed(i2, menu);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
        return this.f24639b.onWindowStartingActionMode(callback, i2);
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        return this.f24639b.onPreparePanel(i2, view, menu);
    }
}

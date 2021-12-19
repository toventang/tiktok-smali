package com.bytedance.tux.dialog;

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

public final class f implements Window.Callback {

    /* renamed from: a  reason: collision with root package name */
    public a f44875a;

    /* renamed from: b  reason: collision with root package name */
    private final Window.Callback f44876b;

    public interface a {
        static {
            Covode.recordClassIndex(27399);
        }

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(27398);
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f44876b.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f44876b.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f44876b.dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f44876b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f44876b.dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f44876b.dispatchTrackballEvent(motionEvent);
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        this.f44876b.onActionModeFinished(actionMode);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        this.f44876b.onActionModeStarted(actionMode);
    }

    public final void onAttachedToWindow() {
        this.f44876b.onAttachedToWindow();
    }

    public final void onContentChanged() {
        this.f44876b.onContentChanged();
    }

    public final boolean onCreatePanelMenu(int i2, Menu menu) {
        l.c(menu, "");
        return this.f44876b.onCreatePanelMenu(i2, menu);
    }

    public final View onCreatePanelView(int i2) {
        return this.f44876b.onCreatePanelView(i2);
    }

    public final void onDetachedFromWindow() {
        this.f44876b.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        l.c(menuItem, "");
        return this.f44876b.onMenuItemSelected(i2, menuItem);
    }

    public final boolean onMenuOpened(int i2, Menu menu) {
        l.c(menu, "");
        return this.f44876b.onMenuOpened(i2, menu);
    }

    public final void onPanelClosed(int i2, Menu menu) {
        l.c(menu, "");
        this.f44876b.onPanelClosed(i2, menu);
    }

    public final boolean onPreparePanel(int i2, View view, Menu menu) {
        l.c(menu, "");
        return this.f44876b.onPreparePanel(i2, view, menu);
    }

    public final boolean onSearchRequested() {
        return this.f44876b.onSearchRequested();
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f44876b.onSearchRequested(searchEvent);
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f44876b.onWindowAttributesChanged(layoutParams);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f44876b.onWindowStartingActionMode(callback);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
        return this.f44876b.onWindowStartingActionMode(callback, i2);
    }

    public f(Window.Callback callback) {
        l.c(callback, "");
        this.f44876b = callback;
    }

    public final void onWindowFocusChanged(boolean z) {
        this.f44876b.onWindowFocusChanged(z);
        a aVar = this.f44875a;
        if (aVar != null) {
            aVar.a(z);
        }
    }
}

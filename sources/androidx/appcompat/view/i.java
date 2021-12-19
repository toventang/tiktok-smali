package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.bytedance.covode.number.Covode;
import java.util.List;

public class i implements Window.Callback {

    /* renamed from: b  reason: collision with root package name */
    final Window.Callback f1115b;

    static {
        Covode.recordClassIndex(320);
    }

    public void onAttachedToWindow() {
        this.f1115b.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.f1115b.onContentChanged();
    }

    public void onDetachedFromWindow() {
        this.f1115b.onDetachedFromWindow();
    }

    public boolean onSearchRequested() {
        return this.f1115b.onSearchRequested();
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f1115b.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f1115b.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f1115b.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f1115b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f1115b.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f1115b.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f1115b.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f1115b.onActionModeStarted(actionMode);
    }

    public View onCreatePanelView(int i2) {
        return this.f1115b.onCreatePanelView(i2);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.f1115b.onPointerCaptureChanged(z);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f1115b.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f1115b.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f1115b.onWindowStartingActionMode(callback);
    }

    public i(Window.Callback callback) {
        if (callback != null) {
            this.f1115b = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f1115b.onSearchRequested(searchEvent);
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        return this.f1115b.onCreatePanelMenu(i2, menu);
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        return this.f1115b.onMenuItemSelected(i2, menuItem);
    }

    public boolean onMenuOpened(int i2, Menu menu) {
        return this.f1115b.onMenuOpened(i2, menu);
    }

    public void onPanelClosed(int i2, Menu menu) {
        this.f1115b.onPanelClosed(i2, menu);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
        return this.f1115b.onWindowStartingActionMode(callback, i2);
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        return this.f1115b.onPreparePanel(i2, view, menu);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
        this.f1115b.onProvideKeyboardShortcuts(list, menu, i2);
    }
}

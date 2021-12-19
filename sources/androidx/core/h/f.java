package androidx.core.h;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f2542a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f2543b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f2544c;

    /* renamed from: d  reason: collision with root package name */
    private static Field f2545d;

    public interface a {
        static {
            Covode.recordClassIndex(857);
        }

        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    static {
        Covode.recordClassIndex(856);
    }

    private static DialogInterface.OnKeyListener a(Dialog dialog) {
        if (!f2544c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f2545d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2544c = true;
        }
        Field field = f2545d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }

    private static boolean a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f2542a) {
            try {
                f2543b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f2542a = true;
        }
        Method method = f2543b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, keyEvent)).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    private static boolean a(Activity activity, KeyEvent keyEvent) {
        KeyEvent.DispatcherState dispatcherState;
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (v.b(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            dispatcherState = decorView.getKeyDispatcherState();
        } else {
            dispatcherState = null;
        }
        return keyEvent.dispatch(activity, dispatcherState, activity);
    }

    private static boolean a(Dialog dialog, KeyEvent keyEvent) {
        KeyEvent.DispatcherState dispatcherState;
        DialogInterface.OnKeyListener a2 = a(dialog);
        if (a2 != null && a2.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (v.b(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            dispatcherState = decorView.getKeyDispatcherState();
        } else {
            dispatcherState = null;
        }
        return keyEvent.dispatch(dialog, dispatcherState, dialog);
    }

    public static boolean a(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            return a((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return a((Dialog) callback, keyEvent);
        }
        if ((view == null || !v.b(view, keyEvent)) && !aVar.superDispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }
}

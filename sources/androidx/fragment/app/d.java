package androidx.fragment.app;

import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public class d extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    int mBackStackId = -1;
    public boolean mCancelable = true;
    Dialog mDialog;
    public boolean mDismissed;
    public boolean mShownByMe;
    public boolean mShowsDialog = true;
    int mStyle;
    int mTheme;
    boolean mViewDestroyed;

    static {
        Covode.recordClassIndex(1037);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_utils_DesignBugFixLancet_onStart(this);
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public void dismiss() {
        dismissInternal(false);
    }

    public void dismissAllowingStateLoss() {
        dismissInternal(true);
    }

    public void DialogFragment__onStart$___twin___() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.dismiss();
            this.mDialog = null;
        }
    }

    public static void androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_utils_DesignBugFixLancet_onStart(d dVar) {
        try {
            dVar.DialogFragment__onStart$___twin___();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (!this.mShownByMe) {
            this.mDismissed = false;
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return new Dialog(getActivity(), getTheme());
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.mViewDestroyed) {
            dismissInternal(true);
        }
    }

    public void setCancelable(boolean z) {
        this.mCancelable = z;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    /* access modifiers changed from: package-private */
    public void dismissInternal(boolean z) {
        if (!this.mDismissed) {
            this.mDismissed = true;
            this.mShownByMe = false;
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                dialog.dismiss();
            }
            this.mViewDestroyed = true;
            if (this.mBackStackId >= 0) {
                getFragmentManager().b(this.mBackStackId);
                this.mBackStackId = -1;
                return;
            }
            n a2 = getFragmentManager().a();
            a2.a(this);
            if (z) {
                a2.c();
            } else {
                a2.b();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (this.mContainerId == 0) {
            z = true;
        } else {
            z = false;
        }
        this.mShowsDialog = z;
        if (bundle != null) {
            this.mStyle = bundle.getInt("android:style", 0);
            this.mTheme = bundle.getInt("android:theme", 0);
            this.mCancelable = bundle.getBoolean("android:cancelable", true);
            this.mShowsDialog = bundle.getBoolean("android:showsDialog", this.mShowsDialog);
            this.mBackStackId = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        if (!this.mShowsDialog) {
            return super.onGetLayoutInflater(bundle);
        }
        Dialog onCreateDialog = onCreateDialog(bundle);
        this.mDialog = onCreateDialog;
        if (onCreateDialog == null) {
            return (LayoutInflater) androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(this.mHost.f2930c, "layout_inflater");
        }
        setupDialog(onCreateDialog, this.mStyle);
        return (LayoutInflater) androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(this.mDialog.getContext(), "layout_inflater");
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Bundle bundle2;
        super.onActivityCreated(bundle);
        if (this.mShowsDialog) {
            View view = getView();
            if (view != null) {
                if (view.getParent() == null) {
                    this.mDialog.setContentView(view);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            e activity = getActivity();
            if (activity != null) {
                this.mDialog.setOwnerActivity(activity);
            }
            this.mDialog.setCancelable(this.mCancelable);
            this.mDialog.setOnCancelListener(this);
            this.mDialog.setOnDismissListener(this);
            if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
                this.mDialog.onRestoreInstanceState(bundle2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (!(dialog == null || (onSaveInstanceState = dialog.onSaveInstanceState()) == null)) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i2 = this.mStyle;
        if (i2 != 0) {
            bundle.putInt("android:style", i2);
        }
        int i3 = this.mTheme;
        if (i3 != 0) {
            bundle.putInt("android:theme", i3);
        }
        boolean z = this.mCancelable;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.mShowsDialog;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i4 = this.mBackStackId;
        if (i4 != -1) {
            bundle.putInt("android:backStackId", i4);
        }
    }

    public void setStyle(int i2, int i3) {
        this.mStyle = i2;
        if (i2 == 2 || i2 == 3) {
            this.mTheme = 16973913;
        }
        if (i3 != 0) {
            this.mTheme = i3;
        }
    }

    public void setupDialog(Dialog dialog, int i2) {
        if (!(i2 == 1 || i2 == 2)) {
            if (i2 == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public int show(n nVar, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        nVar.a(this, str);
        this.mViewDestroyed = false;
        int b2 = nVar.b();
        this.mBackStackId = b2;
        return b2;
    }

    public void showNow(i iVar, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        n a2 = iVar.a();
        a2.a(this, str);
        a2.d();
    }

    public void show(i iVar, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        n a2 = iVar.a();
        a2.a(this, str);
        a2.b();
    }

    public static Object androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
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
                        com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                i.f107219a = false;
            }
            return systemService;
        }
    }
}

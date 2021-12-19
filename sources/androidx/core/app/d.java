package androidx.core.app;

import android.app.Activity;
import android.app.Fragment;
import android.content.pm.ActivityInfo;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import androidx.c.g;
import androidx.core.h.f;
import androidx.core.h.v;
import androidx.fragment.app.FragmentManagerState;
import androidx.fragment.app.FragmentState;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.x;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.turbo.api.b;
import java.lang.reflect.Field;

public class d extends Activity implements f.a, m {
    private g<Class<? extends a>, a> mExtraDataMap = new g<>();
    private n mLifecycleRegistry = new n(this);

    public static class a {
        static {
            Covode.recordClassIndex(659);
        }
    }

    static {
        Covode.recordClassIndex(658);
    }

    public void ComponentActivity__setRequestedOrientation$___twin___(int i2) {
        super.setRequestedOrientation(i2);
    }

    public void onCreate(Bundle bundle) {
        androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_onCreate(this, bundle);
    }

    public void setRequestedOrientation(int i2) {
        androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_setRequestedOrientation(this, i2);
    }

    @Override // androidx.lifecycle.m
    public i getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public void ComponentActivity__onCreate$___twin___(Bundle bundle) {
        super.onCreate(bundle);
        x.a(this);
    }

    @Override // androidx.core.h.f.a
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public <T extends a> T getExtraData(Class<T> cls) {
        return (T) this.mExtraDataMap.get(cls);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.a(i.b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.c.g<java.lang.Class<? extends androidx.core.app.d$a>, androidx.core.app.d$a> */
    /* JADX WARN: Multi-variable type inference failed */
    public void putExtraData(a aVar) {
        this.mExtraDataMap.put(aVar.getClass(), aVar);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !v.a(decorView, keyEvent)) {
            return f.a(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !v.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public static void androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_setRequestedOrientation(d dVar, int i2) {
        if (Build.VERSION.SDK_INT != 26) {
            dVar.ComponentActivity__setRequestedOrientation$___twin___(i2);
            return;
        }
        TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(new int[]{16842840});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        if (!z) {
            dVar.ComponentActivity__setRequestedOrientation$___twin___(i2);
        }
    }

    public static void androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_onCreate(d dVar, Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && SettingsManager.a().a("fix_androidx_fragment", 0) == 1 && (parcelable = bundle.getParcelable("android:fragments")) != null) {
            Parcel obtain = Parcel.obtain();
            try {
                parcelable.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                FragmentManagerState createFromParcel = FragmentManagerState.CREATOR.createFromParcel(obtain);
                if (createFromParcel != null && createFromParcel.f2885a != null && createFromParcel.f2885a.length != 0) {
                    try {
                        FragmentState[] fragmentStateArr = createFromParcel.f2885a;
                        int length = fragmentStateArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                FragmentState fragmentState = fragmentStateArr[i2];
                                if (fragmentState != null && !Fragment.class.isAssignableFrom(Class.forName(fragmentState.f2890a))) {
                                    bundle.putParcelable("android:fragments", null);
                                    break;
                                }
                                i2++;
                            } else {
                                break;
                            }
                        }
                    } catch (ClassNotFoundException unused) {
                    }
                }
            } finally {
                obtain.recycle();
            }
        }
        if (Build.VERSION.SDK_INT == 26) {
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(new int[]{16842840});
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            int requestedOrientation = dVar.getRequestedOrientation();
            obtainStyledAttributes.recycle();
            if (z && requestedOrientation != -1) {
                try {
                    Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
                    declaredField.setAccessible(true);
                    ((ActivityInfo) declaredField.get(dVar)).screenOrientation = -1;
                    declaredField.setAccessible(false);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        b.a().startNewPage(dVar.getClass().getName());
        dVar.ComponentActivity__onCreate$___twin___(bundle);
    }
}

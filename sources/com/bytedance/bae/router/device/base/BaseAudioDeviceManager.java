package com.bytedance.bae.router.device.base;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bae.router.device.base.IAudioDeviceManager;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

public abstract class BaseAudioDeviceManager implements IAudioDeviceManager.INotHotPlugableDevice {
    private IAudioDeviceManager.OnNotHotPlugableDeviceCallback mCallback;
    private WeakReference<Context> mContext;

    static {
        Covode.recordClassIndex(15388);
    }

    /* access modifiers changed from: protected */
    public Context getContext() {
        return this.mContext.get();
    }

    @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.INotHotPlugableDevice
    public boolean isActive() {
        if (getActiveState() == 1) {
            return true;
        }
        return false;
    }

    public AudioManager getAudioManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (AudioManager) com_bytedance_bae_router_device_base_BaseAudioDeviceManager_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, DataType.AUDIO);
    }

    /* access modifiers changed from: protected */
    public void onError(int i2, String str) {
        this.mCallback.onError(i2, str);
    }

    public BaseAudioDeviceManager(Context context, IAudioDeviceManager.OnNotHotPlugableDeviceCallback onNotHotPlugableDeviceCallback) {
        this.mContext = new WeakReference<>(context);
        this.mCallback = onNotHotPlugableDeviceCallback;
    }

    public static Object com_bytedance_bae_router_device_base_BaseAudioDeviceManager_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
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
                        d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                i.f107219a = false;
            }
            return systemService;
        }
    }
}

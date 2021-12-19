package com.ss.android.ugc.aweme.utils.a;

import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.ArrayMap;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

public final class a implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private Reflect f142585a;

    /* renamed from: b  reason: collision with root package name */
    private Field f142586b;

    static {
        Covode.recordClassIndex(93272);
    }

    public final boolean handleMessage(Message message) {
        if (message == null) {
            return false;
        }
        int i2 = message.what;
        if (i2 == 103 || i2 == 104) {
            try {
                if (a(a(message))) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private IBinder a(Message message) {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                if (this.f142586b == null) {
                    this.f142586b = Class.forName("com.android.internal.os.SomeArgs").getDeclaredField("arg1");
                }
                return (IBinder) this.f142586b.get(message.obj);
            } catch (Exception unused) {
            }
        } else {
            if (message.obj instanceof IBinder) {
                return (IBinder) message.obj;
            }
            return null;
        }
    }

    private boolean a(IBinder iBinder) {
        try {
            if (this.f142585a == null) {
                this.f142585a = Reflect.on(Class.forName("android.app.ActivityThread")).call("currentActivityThread");
            }
            int i2 = Build.VERSION.SDK_INT;
            ArrayMap arrayMap = (ArrayMap) this.f142585a.field("mActivities", new Class[0]).get();
            if (arrayMap == null || arrayMap.containsKey(iBinder)) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
        }
    }
}

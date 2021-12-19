package com.bytedance.platform.a.b.c.a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.a.a.h;
import java.lang.reflect.Method;

public final class d extends a {

    /* renamed from: c  reason: collision with root package name */
    public a f41879c;

    /* renamed from: d  reason: collision with root package name */
    private Method f41880d;

    static {
        Covode.recordClassIndex(25588);
    }

    public final void a() {
        Message obtainMessage = this.f41879c.obtainMessage(101);
        if (Build.VERSION.SDK_INT >= 22) {
            obtainMessage.setAsynchronous(true);
        } else {
            if (this.f41880d == null) {
                this.f41880d = h.a((Class<?>) Message.class, "setAsynchronous", Boolean.TYPE);
            }
            try {
                Method method = this.f41880d;
                Object[] objArr = {true};
                Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obtainMessage, objArr}, 110000, "java.lang.Object", true, "com_bytedance_platform_horae_java_impl_sync_hook_TimerInMessageQueue_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a2.first).booleanValue()) {
                    Object obj = a2.second;
                } else {
                    com.bytedance.helios.sdk.a.a(method.invoke(obtainMessage, objArr), method, new Object[]{obtainMessage, objArr}, "com_bytedance_platform_horae_java_impl_sync_hook_TimerInMessageQueue_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                }
            } catch (Throwable unused) {
            }
        }
        this.f41879c.sendMessageDelayed(obtainMessage, 3000);
    }

    public d(b bVar) {
        super("TimerInMessageQueue", bVar);
    }

    public class a extends Handler {
        static {
            Covode.recordClassIndex(25589);
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 101) {
                if (d.this.f41875b != null) {
                    d.this.f41875b.a();
                }
                d.this.a();
            }
        }

        public a(Looper looper) {
            super(looper);
        }
    }
}

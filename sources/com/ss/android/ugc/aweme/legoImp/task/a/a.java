package com.ss.android.ugc.aweme.legoImp.task.a;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f107929a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f107930b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f107931c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f107932d;

    static {
        Covode.recordClassIndex(69179);
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.a.a$a  reason: collision with other inner class name */
    public static final class HandlerC2774a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f107933a;

        /* renamed from: b  reason: collision with root package name */
        private Method f107934b;

        /* renamed from: c  reason: collision with root package name */
        private Object f107935c;

        /* renamed from: d  reason: collision with root package name */
        private Method f107936d;

        /* renamed from: e  reason: collision with root package name */
        private Field f107937e;

        /* renamed from: f  reason: collision with root package name */
        private Field f107938f;

        /* renamed from: g  reason: collision with root package name */
        private Class<?> f107939g;

        static {
            Covode.recordClassIndex(69180);
        }

        private static int a(int i2) {
            if (i2 != 115) {
                return i2 != 116 ? 0 : 2;
            }
            return 1;
        }

        private static Object a(Method method, Object obj, Object[] objArr) {
            Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_legoImp_task_anr_AnrDispatchBoost$DelegateInternalHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                return a2.second;
            }
            Object invoke = method.invoke(obj, objArr);
            com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_legoImp_task_anr_AnrDispatchBoost$DelegateInternalHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }

        private void a() {
            try {
                if (this.f107935c == null) {
                    Method declaredMethod = Class.forName("android.app.ActivityManagerNative").getDeclaredMethod("getDefault", new Class[0]);
                    declaredMethod.setAccessible(true);
                    this.f107935c = declaredMethod.invoke(null, new Object[0]);
                }
            } catch (Throwable unused) {
            }
        }

        private static Method b() {
            Method method;
            try {
                Class<?> cls = Class.forName("android.app.IActivityManager");
                if (Build.VERSION.SDK_INT < 23) {
                    method = cls.getDeclaredMethod("finishReceiver", IBinder.class, Integer.TYPE, String.class, Bundle.class, Boolean.TYPE);
                } else {
                    method = cls.getDeclaredMethod("finishReceiver", IBinder.class, Integer.TYPE, String.class, Bundle.class, Boolean.TYPE, Integer.TYPE);
                }
                method.setAccessible(true);
                return method;
            } catch (Throwable unused) {
                return null;
            }
        }

        public final void handleMessage(Message message) {
            Handler handler = this.f107933a;
            if (handler != null) {
                handler.handleMessage(message);
            } else {
                super.handleMessage(message);
            }
        }

        private void a(Object obj) {
            if (this.f107939g == null) {
                Class<?> cls = obj.getClass();
                this.f107939g = cls;
                a((Class<?>) cls.getSuperclass());
            }
            if (this.f107935c != null && this.f107937e != null) {
                b(obj);
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public HandlerC2774a(android.os.Handler r3) {
            /*
                r2 = this;
                if (r3 == 0) goto L_0x000e
                android.os.Looper r0 = r3.getLooper()
            L_0x0006:
                r2.<init>(r0)
                r2.f107933a = r3
                if (r3 == 0) goto L_0x002a
                goto L_0x0013
            L_0x000e:
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                goto L_0x0006
            L_0x0013:
                java.lang.Class<android.os.Handler> r1 = android.os.Handler.class
                java.lang.String r0 = "mCallback"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x002a }
                r0 = 1
                r1.setAccessible(r0)     // Catch:{ all -> 0x002a }
                java.lang.Object r0 = r1.get(r3)     // Catch:{ all -> 0x002a }
                android.os.Handler$Callback r0 = (android.os.Handler.Callback) r0     // Catch:{ all -> 0x002a }
                if (r0 == 0) goto L_0x002a
                r1.set(r2, r0)     // Catch:{ all -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.a.a.HandlerC2774a.<init>(android.os.Handler):void");
        }

        private void b(Object obj) {
            int i2;
            try {
                IBinder iBinder = (IBinder) this.f107937e.get(obj);
                Field field = this.f107938f;
                if (field != null) {
                    i2 = ((Integer) field.get(obj)).intValue();
                } else {
                    i2 = 0;
                }
                if (Build.VERSION.SDK_INT < 23) {
                    a(this.f107936d, this.f107935c, new Object[]{iBinder, 0, null, null, false});
                    return;
                }
                a(this.f107936d, this.f107935c, new Object[]{iBinder, 0, null, null, false, Integer.valueOf(i2)});
            } catch (Throwable unused) {
            }
        }

        private void a(Class<?> cls) {
            if (this.f107936d == null) {
                a();
                this.f107936d = b();
                if (cls != null) {
                    try {
                        Field declaredField = cls.getDeclaredField("mToken");
                        this.f107937e = declaredField;
                        declaredField.setAccessible(true);
                        Field declaredField2 = cls.getDeclaredField("mFlags");
                        this.f107938f = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        private void a(Message message, int i2) {
            try {
                if (this.f107934b == null) {
                    a();
                    Object obj = this.f107935c;
                    if (obj != null) {
                        Method declaredMethod = obj.getClass().getDeclaredMethod("serviceDoneExecuting", IBinder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                        declaredMethod.setAccessible(true);
                        this.f107934b = declaredMethod;
                    }
                }
                if (this.f107934b != null) {
                    Object obj2 = message.obj;
                    if (i2 != 116) {
                        Field declaredField = obj2.getClass().getDeclaredField("token");
                        declaredField.setAccessible(true);
                        obj2 = declaredField.get(obj2);
                    }
                    this.f107934b.invoke(this.f107935c, obj2, Integer.valueOf(a(message.what)), 0, 0);
                }
            } catch (Throwable unused) {
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|(2:2|(1:4))(1:16)|5|(2:13|(1:15))(2:17|(3:21|22|(1:28)))|29|30|(2:32|(2:34|(2:36|(2:38|(1:40)(1:41)))(1:42)))|43|(2:46|47)(2:48|49)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006f */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0075 A[Catch:{ all -> 0x00ad }] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00b1  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00b6  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean sendMessageAtTime(android.os.Message r5, long r6) {
            /*
            // Method dump skipped, instructions count: 187
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.a.a.HandlerC2774a.sendMessageAtTime(android.os.Message, long):boolean");
        }
    }
}

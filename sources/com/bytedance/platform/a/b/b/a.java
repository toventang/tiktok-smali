package com.bytedance.platform.a.b.b;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.a.a.b;
import com.bytedance.platform.a.a.g;
import com.bytedance.platform.a.a.h;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static a f41860a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static Method f41861b;

    /* renamed from: c  reason: collision with root package name */
    public static MessageQueue f41862c;

    /* renamed from: d  reason: collision with root package name */
    private static Object f41863d;

    /* renamed from: e  reason: collision with root package name */
    private static Field f41864e;

    /* renamed from: f  reason: collision with root package name */
    private static Field f41865f;

    /* renamed from: g  reason: collision with root package name */
    private static Field f41866g;

    /* renamed from: h  reason: collision with root package name */
    private static Field f41867h;

    /* renamed from: i  reason: collision with root package name */
    private static Field f41868i;

    /* renamed from: j  reason: collision with root package name */
    private int f41869j;

    /* renamed from: k  reason: collision with root package name */
    private int f41870k = -1;

    /* renamed from: l  reason: collision with root package name */
    private HandlerC1027a f41871l;

    /* renamed from: m  reason: collision with root package name */
    private Method f41872m;

    static {
        Covode.recordClassIndex(25582);
    }

    public final int a() {
        try {
            if (f41862c == null || f41864e == null || f41865f == null || f41863d == null || f41866g == null || f41867h == null || f41868i == null) {
                f41862c = (MessageQueue) b.a(Looper.class, "mQueue").get(Looper.getMainLooper());
                f41864e = b.a(MessageQueue.class, "mMessages");
                f41865f = b.a(MessageQueue.class, "mNextBarrierToken");
                Object a2 = h.a(Class.forName("android.view.WindowManagerGlobal"), "getInstance", new Object[0]);
                f41863d = a2;
                f41866g = b.a(a2.getClass(), "mRoots");
                f41867h = b.a(Class.forName("android.view.ViewRootImpl"), "mTraversalBarrier");
                f41868i = b.a(Message.class, "next");
                g.a(g.a.INFO);
            }
            if (f41861b == null) {
                f41861b = b.a(MessageQueue.class, "removeSyncBarrier", Integer.TYPE);
            }
            if (this.f41871l == null) {
                this.f41871l = new HandlerC1027a(Looper.getMainLooper());
            }
            return 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: com.bytedance.platform.a.b.b.a$a  reason: collision with other inner class name */
    public class HandlerC1027a extends Handler {
        static {
            Covode.recordClassIndex(25583);
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1001) {
                try {
                    int i2 = message.arg1;
                    Method method = a.f41861b;
                    MessageQueue messageQueue = a.f41862c;
                    Object[] objArr = {Integer.valueOf(i2)};
                    Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{messageQueue, objArr}, 110000, "java.lang.Object", true, "com_bytedance_platform_horae_java_impl_barrier_BarrierMonitor$BarrierHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a2.first).booleanValue()) {
                        Object obj = a2.second;
                    } else {
                        com.bytedance.helios.sdk.a.a(method.invoke(messageQueue, objArr), method, new Object[]{messageQueue, objArr}, "com_bytedance_platform_horae_java_impl_barrier_BarrierMonitor$BarrierHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    }
                    "force remove lost barrier for:".concat(String.valueOf(i2));
                    g.a(g.a.WARNING);
                } catch (Exception e2) {
                    "delete barrier message throwable !!!".concat(String.valueOf(e2));
                    g.a(g.a.WARNING);
                    e2.printStackTrace();
                }
            }
        }

        public HandlerC1027a(Looper looper) {
            super(looper);
        }
    }

    private static int a(int i2) {
        Object obj = f41866g.get(f41863d);
        if (obj instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) obj;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Object obj2 = arrayList.get(i3);
                if (((Integer) f41867h.get(obj2)).intValue() == i2) {
                    "mTraversalBarrier == token : for viewRoot:".concat(String.valueOf(obj2));
                    g.a(g.a.DEBUG);
                    return -1;
                }
            }
            return 0;
        }
        " mRoots type is:".concat(String.valueOf(obj));
        g.a(g.a.ERROR);
        return -1;
    }

    public final int a(WeakReference<Message> weakReference) {
        try {
            Message message = weakReference.get();
            ArrayList arrayList = new ArrayList();
            Message message2 = message;
            int i2 = 0;
            int i3 = -1;
            while (message2 != null && i2 < 5 && message2.getTarget() == null && message2.arg1 >= 0) {
                if (message2.arg1 > 0) {
                    message2.getWhen();
                    g.a(g.a.DEBUG);
                }
                i3 = message2.arg1;
                arrayList.add(Integer.valueOf(i3));
                message2 = (Message) f41868i.get(message2);
                i2++;
            }
            int size = arrayList.size();
            if (size <= 0) {
                return -1;
            }
            int i4 = 0;
            while (a(((Integer) arrayList.get(i4)).intValue()) >= 0) {
                i4++;
                if (i4 >= size) {
                    if (this.f41870k != i3) {
                        this.f41869j = 0;
                        this.f41870k = i3;
                    }
                    int intValue = ((Integer) f41865f.get(f41862c)).intValue();
                    g.a(g.a.INFO);
                    if (i3 < intValue) {
                        this.f41869j++;
                    }
                    if (this.f41869j < 2) {
                        g.a(g.a.INFO);
                        return -1;
                    }
                    "firstMsg:".concat(String.valueOf(message));
                    g.a(g.a.WARNING);
                    int i5 = 1001;
                    this.f41871l.removeMessages(1001);
                    int i6 = 0;
                    int i7 = -1;
                    while (true) {
                        int intValue2 = ((Integer) arrayList.get(i6)).intValue();
                        if (intValue2 < intValue) {
                            Message obtainMessage = this.f41871l.obtainMessage(i5, intValue2, 0);
                            if (Build.VERSION.SDK_INT >= 22) {
                                obtainMessage.setAsynchronous(true);
                            } else {
                                if (this.f41872m == null) {
                                    this.f41872m = h.a((Class<?>) Message.class, "setAsynchronous", Boolean.TYPE);
                                }
                                try {
                                    Method method = this.f41872m;
                                    Object[] objArr = {true};
                                    Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obtainMessage, objArr}, 110000, "java.lang.Object", true, "com_bytedance_platform_horae_java_impl_barrier_BarrierMonitor_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                                    if (((Boolean) a2.first).booleanValue()) {
                                        Object obj = a2.second;
                                    } else {
                                        com.bytedance.helios.sdk.a.a(method.invoke(obtainMessage, objArr), method, new Object[]{obtainMessage, objArr}, "com_bytedance_platform_horae_java_impl_barrier_BarrierMonitor_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                            this.f41871l.sendMessage(obtainMessage);
                            i7 = intValue2;
                        }
                        i6++;
                        i5 = 1001;
                        if (i6 >= size) {
                            this.f41869j = 0;
                            this.f41870k = -1;
                            return i7;
                        }
                    }
                }
            }
            return -1;
        } catch (Throwable unused2) {
            g.a(g.a.WARNING);
            return -1;
        }
    }
}

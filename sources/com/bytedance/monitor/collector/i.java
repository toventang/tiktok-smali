package com.bytedance.monitor.collector;

import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static MessageQueue f41526a;

    /* renamed from: b  reason: collision with root package name */
    private static Field f41527b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f41528c;

    static {
        Covode.recordClassIndex(25418);
    }

    public static MessageQueue a() {
        if (f41526a == null && Looper.getMainLooper() != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == Looper.myLooper()) {
                f41526a = Looper.myQueue();
            } else if (Build.VERSION.SDK_INT >= 23) {
                f41526a = mainLooper.getQueue();
            } else {
                try {
                    Field declaredField = mainLooper.getClass().getDeclaredField("mQueue");
                    declaredField.setAccessible(true);
                    f41526a = (MessageQueue) declaredField.get(mainLooper);
                } catch (Throwable unused) {
                }
            }
        }
        return f41526a;
    }

    protected static Message a(Message message) {
        Field field = f41528c;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.Message").getDeclaredField("next");
                f41528c = declaredField;
                declaredField.setAccessible(true);
                return (Message) f41528c.get(message);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return (Message) field.get(message);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    public static Message a(MessageQueue messageQueue) {
        Field field = f41527b;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
                f41527b = declaredField;
                declaredField.setAccessible(true);
                return (Message) f41527b.get(messageQueue);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return (Message) field.get(messageQueue);
            } catch (Exception unused2) {
                return null;
            }
        }
    }
}

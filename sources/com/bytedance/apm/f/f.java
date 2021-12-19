package com.bytedance.apm.f;

import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.a.a;
import com.bytedance.monitor.a.b;
import java.lang.reflect.Field;
import java.util.List;

public final class f {
    static {
        Covode.recordClassIndex(14583);
    }

    public static Intent a() {
        int i2;
        try {
            MessageQueue messageQueue = (MessageQueue) b.a(Looper.getMainLooper(), "mQueue");
            synchronized (messageQueue) {
                Message message = (Message) b.a(messageQueue, "mMessages");
                if (message != null && message.getTarget() == a.a() && a.a(message)) {
                    int i3 = message.what;
                    if (i3 == 100 || i3 == 159) {
                        return a(message);
                    }
                }
                Field a2 = b.a((Class<?>) Message.class, "next");
                a2.setAccessible(true);
                while (message != null) {
                    Message message2 = (Message) b.a(a2, message);
                    if (message2 != null && message2.getTarget() == a.a() && a.a(message) && ((i2 = message.what) == 100 || i2 == 159)) {
                        return a(message);
                    }
                    message = message2;
                }
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Intent a(Message message) {
        int i2 = message.what;
        if (i2 != 100) {
            if (i2 != 121) {
                if (i2 != 159) {
                    switch (i2) {
                        case 113:
                            return d(message);
                        case 114:
                        case 115:
                            break;
                        default:
                            return null;
                    }
                }
            }
            return c(message);
        }
        return b(message);
    }

    private static Intent c(Message message) {
        String str;
        if (message.what == 114 || message.what == 121) {
            str = "intent";
        } else if (message.what == 115) {
            str = "args";
        } else {
            str = "";
        }
        if (str.isEmpty() || message.obj == null) {
            return null;
        }
        try {
            return (Intent) b.a(message.obj, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Intent d(Message message) {
        String str;
        if (message.what == 113) {
            str = "intent";
        } else {
            str = "";
        }
        if (str.isEmpty() || message.obj == null) {
            return null;
        }
        try {
            return (Intent) b.a(message.obj, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Intent b(Message message) {
        Object obj = message.obj;
        if (Build.VERSION.SDK_INT < 28 && message.what == 100) {
            try {
                return (Intent) b.a(obj, "intent");
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return null;
            }
        } else if (Build.VERSION.SDK_INT < 28 || message.what != 159) {
            return null;
        } else {
            try {
                List list = (List) b.a(obj, "mActivityCallbacks");
                if (list == null) {
                    return null;
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    Object obj2 = list.get(i2);
                    if (obj2 != null) {
                        return (Intent) b.a(obj2, "mIntent");
                    }
                }
                return null;
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
                return null;
            }
        }
    }
}

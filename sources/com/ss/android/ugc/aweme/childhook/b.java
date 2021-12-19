package com.ss.android.ugc.aweme.childhook;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.childhook.a.c.c;
import h.f.b.l;
import java.lang.reflect.Field;
import java.util.ArrayList;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f70249a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(43340);
    }

    public static Intent b(Message message) {
        try {
            Field declaredField = message.obj.getClass().getDeclaredField("intent");
            l.b(declaredField, "");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(message.obj);
            if (obj != null) {
                return (Intent) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.content.Intent");
        } catch (Exception e2) {
            e2.printStackTrace();
            com.bytedance.c.a.a.a.b.a(e2, "ChildBroadcastReceiverHook.getIntent");
            return null;
        }
    }

    public static final class a implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Handler.Callback f70250a;

        static {
            Covode.recordClassIndex(43341);
        }

        public a(Handler.Callback callback) {
            this.f70250a = callback;
        }

        public final boolean handleMessage(Message message) {
            l.d(message, "");
            if (message.what == 113) {
                String a2 = b.a(message);
                b.b(message);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new com.ss.android.ugc.aweme.childhook.a.c.a());
                arrayList.add(new com.ss.android.ugc.aweme.childhook.a.c.b());
                if (arrayList.size() <= 0) {
                    return true;
                }
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (((c) arrayList.get(i2)).a(a2)) {
                        if (!((c) arrayList.get(i2)).b(a2)) {
                            return true;
                        } else {
                            Handler.Callback callback = this.f70250a;
                            if (callback != null) {
                                return callback.handleMessage(message);
                            }
                            return false;
                        }
                    }
                }
                return true;
            }
            Handler.Callback callback2 = this.f70250a;
            if (callback2 != null) {
                return callback2.handleMessage(message);
            }
            return false;
        }
    }

    public static String a(Message message) {
        try {
            Field declaredField = message.obj.getClass().getDeclaredField("info");
            l.b(declaredField, "");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(message.obj);
            Field field = obj.getClass().getField(StringSet.name);
            l.b(field, "");
            field.setAccessible(true);
            Object obj2 = field.get(obj);
            if (obj2 != null) {
                return (String) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception e2) {
            e2.printStackTrace();
            com.bytedance.c.a.a.a.b.a(e2, "ChildBroadcastReceiverHook.getClassName");
            return "";
        }
    }
}

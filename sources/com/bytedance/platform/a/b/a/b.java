package com.bytedance.platform.a.b.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.a.a.g;
import com.bytedance.platform.a.b.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class b extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, List<Message>> f41834a = new HashMap();

    static {
        Covode.recordClassIndex(25575);
    }

    public b(Looper looper) {
        super(looper);
    }

    private static void a(a aVar) {
        try {
            d.f41852a.a(aVar);
            if (d.f41852a.f41853b.size() > 100) {
                d.f41852a.f41853b.subList(0, 50).clear();
            }
        } catch (Throwable unused) {
        }
    }

    public final void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.obj instanceof Message) {
            final Message message2 = (Message) message.obj;
            if (a.b(message2)) {
                a a2 = a.a(message2);
                if (TextUtils.isEmpty(a2.f41821a)) {
                    List<Message> list = this.f41834a.get(a2.f41822b);
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    list.add(message2);
                    this.f41834a.put(a2.f41822b, list);
                    g.a(g.a.ERROR);
                    return;
                }
                System.currentTimeMillis();
                int i2 = message2.what;
                com.bytedance.platform.a.b bVar = c.a().f41841d;
                a.a(message2);
                a(a2);
                if (bVar != null) {
                    System.currentTimeMillis();
                }
                List<Message> list2 = this.f41834a.get(a2.f41822b);
                if (list2 != null && message2.what == 114) {
                    for (Message message3 : list2) {
                        g.a(g.a.ERROR);
                        a a3 = a.a(message3);
                        "After father message now service follow bean is ".concat(String.valueOf(a3));
                        g.a(g.a.ERROR);
                        System.currentTimeMillis();
                        int i3 = message3.what;
                        a.a(message3);
                        if (bVar != null) {
                            System.currentTimeMillis();
                        }
                        a(a3);
                    }
                    list2.clear();
                }
                "Handle message ".concat(String.valueOf(message2));
                g.a(g.a.ERROR);
                return;
            }
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() {
                /* class com.bytedance.platform.a.b.a.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(25576);
                }

                public final void run() {
                    a.a(message2);
                }
            });
        }
    }
}

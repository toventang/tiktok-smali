package com.ss.android.ugc.aweme.im.sdk.common.controller.e;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.ies.im.core.api.b.b;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    static List<String> f102257a;

    /* renamed from: b  reason: collision with root package name */
    public static final i f102258b = new i();

    /* renamed from: c  reason: collision with root package name */
    private static Handler f102259c;

    public static final class a extends Handler {
        static {
            Covode.recordClassIndex(65431);
        }

        a() {
        }

        public final void handleMessage(Message message) {
            l.d(message, "");
            super.handleMessage(message);
            if (message.what == 220) {
                i.c();
            }
        }
    }

    private i() {
    }

    static {
        Covode.recordClassIndex(65430);
    }

    public static final void a() {
        if (f102257a == null) {
            f102257a = new CopyOnWriteArrayList();
        }
        if (f102259c == null) {
            f102259c = new a();
        }
    }

    public static final void b() {
        Handler handler = f102259c;
        if (handler != null) {
            handler.removeMessages(220);
            f102259c = null;
        }
        if (f102257a != null) {
            f102257a = null;
        }
    }

    public static final void c() {
        Integer valueOf;
        List<String> list = f102257a;
        if (list != null && (valueOf = Integer.valueOf(list.size())) != null && valueOf.intValue() > 0) {
            com.bytedance.ies.im.core.api.b.a a2 = a.C0745a.a();
            List<String> list2 = f102257a;
            if (list2 == null) {
                l.b();
            }
            a2.a(list2);
            List<String> list3 = f102257a;
            if (list3 == null) {
                l.b();
            }
            list3.clear();
            Handler handler = f102259c;
            if (handler != null) {
                handler.removeMessages(220);
            }
        }
    }

    public static final void a(List<? extends com.ss.android.ugc.aweme.im.service.k.a> list) {
        if (list != null && (!list.isEmpty())) {
            List<String> b2 = b(list);
            if (!b2.isEmpty()) {
                a.C0745a.a().a(b2);
            }
        }
    }

    public static final void a(String str) {
        Handler handler;
        l.d(str, "");
        List<String> list = f102257a;
        if (list != null && !list.contains(str)) {
            List<String> list2 = f102257a;
            if (list2 == null) {
                l.b();
            }
            if (list2.isEmpty() && (handler = f102259c) != null) {
                handler.sendEmptyMessageDelayed(220, 5000);
            }
            List<String> list3 = f102257a;
            if (list3 == null) {
                l.b();
            }
            list3.add(str);
            List<String> list4 = f102257a;
            if (list4 == null) {
                l.b();
            }
            if (list4.size() == 25) {
                c();
            }
        }
    }

    private static List<String> b(List<? extends com.ss.android.ugc.aweme.im.service.k.a> list) {
        ArrayList arrayList = new ArrayList();
        for (com.ss.android.ugc.aweme.im.service.k.a aVar : list) {
            if (aVar.c() == 0) {
                IMUser b2 = g.b(String.valueOf(b.a.c(aVar.bF_())), c.a(aVar.bF_()));
                if (b2 != null && TextUtils.isEmpty(b2.getSecUid())) {
                    arrayList.add(aVar.bF_());
                }
                if (arrayList.size() == 25) {
                    break;
                }
            }
        }
        return arrayList;
    }
}

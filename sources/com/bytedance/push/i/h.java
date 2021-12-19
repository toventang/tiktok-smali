package com.bytedance.push.i;

import android.util.Pair;
import com.bytedance.common.utility.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.PushBody;
import com.bytedance.push.c.b;
import com.bytedance.push.f;
import com.bytedance.push.f.c;
import com.ss.android.message.a;
import java.util.ArrayList;
import java.util.Map;

public final class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final PushBody f42209a;

    /* renamed from: b  reason: collision with root package name */
    private final int f42210b;

    static {
        Covode.recordClassIndex(25791);
    }

    public final void run() {
        String str;
        String a2;
        b bVar = f.f42099a.h().x;
        String str2 = this.f42209a.f42028e;
        c a3 = e.a(a.f59817a, this.f42210b);
        String str3 = "";
        if (a3 != null) {
            str = a3.f42131d;
        } else {
            str = str3;
        }
        if (!(bVar == null || (a2 = bVar.a()) == null)) {
            str3 = a2;
        }
        String a4 = com.ss.android.pushmanager.a.a("/cloudpush/user_push_replace/");
        com.ss.android.message.a.a.a(a4, f.f42099a.e());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("ttpush_sec_target_uid", str2));
        arrayList.add(new Pair("local_sec_uid", str3));
        arrayList.add(new Pair("send_sdk", String.valueOf(this.f42210b)));
        arrayList.add(new Pair("token", str));
        arrayList.add(new Pair("rid64", String.valueOf(this.f42209a.f42025b)));
        try {
            j.f26946a.a(a4, arrayList, (Map<String, String>) null);
        } catch (Throwable unused) {
        }
    }

    public h(int i2, PushBody pushBody) {
        this.f42210b = i2;
        this.f42209a = pushBody;
    }
}

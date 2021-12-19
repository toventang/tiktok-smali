package com.ss.android.ugc.aweme.app.g;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    private static c f66746b;

    /* renamed from: a  reason: collision with root package name */
    public b f66747a;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<String> f66748c;

    /* renamed from: d  reason: collision with root package name */
    private a f66749d;

    static {
        Covode.recordClassIndex(41084);
    }

    public static boolean a() {
        if (f66746b != null) {
            return true;
        }
        return false;
    }

    public static c b() {
        c cVar = f66746b;
        if (cVar != null) {
            return cVar;
        }
        throw new RuntimeException("UserActionPredict not init");
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            a aVar = new a(str, System.currentTimeMillis());
            if (!this.f66748c.contains(aVar.f66740a)) {
                this.f66749d = aVar;
                b bVar = this.f66747a;
                if (bVar.f66743a != null) {
                    Message obtainMessage = bVar.f66743a.obtainMessage(0);
                    obtainMessage.obj = aVar;
                    obtainMessage.setTarget(bVar.f66743a);
                    bVar.f66743a.sendMessage(obtainMessage);
                }
            }
        }
    }
}

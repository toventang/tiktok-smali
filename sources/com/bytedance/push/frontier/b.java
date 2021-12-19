package com.bytedance.push.frontier;

import android.content.Context;
import com.bytedance.common.wschannel.app.e;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.f;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public static int f42133a = 1777;

    /* renamed from: b  reason: collision with root package name */
    public static int f42134b = 1777;

    /* renamed from: i  reason: collision with root package name */
    private static volatile b f42135i;

    /* renamed from: c  reason: collision with root package name */
    public AtomicReference<com.bytedance.push.frontier.a.b> f42136c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    final Context f42137d;

    /* renamed from: e  reason: collision with root package name */
    int f42138e;

    /* renamed from: f  reason: collision with root package name */
    public String f42139f = "";

    /* renamed from: g  reason: collision with root package name */
    boolean f42140g = false;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicBoolean f42141h = new AtomicBoolean(false);

    @Override // com.bytedance.common.wschannel.app.e
    public final void a(com.bytedance.common.wschannel.b.b bVar, JSONObject jSONObject) {
    }

    static {
        Covode.recordClassIndex(25753);
    }

    private b(Context context) {
        this.f42137d = context;
    }

    public static b a(Context context) {
        MethodCollector.i(7005);
        if (f42135i == null) {
            synchronized (b.class) {
                try {
                    if (f42135i == null) {
                        f42135i = new b(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7005);
                    throw th;
                }
            }
        }
        b bVar = f42135i;
        MethodCollector.o(7005);
        return bVar;
    }

    @Override // com.bytedance.common.wschannel.app.e
    public final void a(WsChannelMsg wsChannelMsg) {
        if (wsChannelMsg != null && this.f42140g) {
            if ((this.f42138e == 1 || wsChannelMsg.f27304m == 10006) && f42133a == wsChannelMsg.f27297f && f42134b == wsChannelMsg.f27298g) {
                try {
                    f.c().a(new String(wsChannelMsg.a()), FrontierPushAdapter.getFrontierPush());
                } catch (Throwable unused) {
                }
            }
        }
    }
}

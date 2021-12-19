package com.bytedance.l.b.c;

import android.content.Context;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.live.LivePlayActivity;

public class a implements com.bytedance.l.a.a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile com.bytedance.l.a.a f39762a;

    static {
        Covode.recordClassIndex(24566);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    private a() {
    }

    @Override // com.bytedance.l.a.a
    public final Class a() {
        return LivePlayActivity.class;
    }

    public static com.bytedance.l.a.a b() {
        MethodCollector.i(12671);
        if (f39762a == null) {
            synchronized (a.class) {
                try {
                    if (f39762a == null) {
                        f39762a = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12671);
                    throw th;
                }
            }
        }
        com.bytedance.l.a.a aVar = f39762a;
        MethodCollector.o(12671);
        return aVar;
    }

    @Override // com.bytedance.l.a.a
    public final void a(Context context, EnterRoomConfig enterRoomConfig) {
        LivePlayActivity.a(context, enterRoomConfig);
    }
}

package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;
import com.bytedance.common.wschannel.l;
import com.bytedance.common.wschannel.server.d;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class j implements d {

    /* renamed from: a  reason: collision with root package name */
    d.a f27365a;

    /* renamed from: b  reason: collision with root package name */
    boolean f27366b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f27367c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f27368d;

    /* renamed from: e  reason: collision with root package name */
    private ContentObserver f27369e;

    static {
        Covode.recordClassIndex(16104);
    }

    @Override // com.bytedance.common.wschannel.server.d
    public final boolean b() {
        return this.f27366b;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        try {
            boolean a2 = l.a(this.f27368d).a();
            Logger.debug();
            if (a2 != this.f27366b) {
                this.f27366b = a2;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.common.wschannel.server.d
    public final void a() {
        c();
        this.f27369e = new ContentObserver(this.f27367c) {
            /* class com.bytedance.common.wschannel.server.j.AnonymousClass1 */

            static {
                Covode.recordClassIndex(16105);
            }

            public final void onChange(boolean z) {
                Logger.debug();
                j jVar = j.this;
                try {
                    boolean z2 = jVar.f27366b;
                    jVar.c();
                    if (z2 != jVar.f27366b && jVar.f27365a != null) {
                        jVar.f27365a.a(jVar.f27366b);
                    }
                } catch (Exception unused) {
                }
            }
        };
        try {
            this.f27368d.getContentResolver().registerContentObserver(WsChannelMultiProcessSharedProvider.a(this.f27368d, "frontier_enabled", "boolean"), true, this.f27369e);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.common.wschannel.server.d
    public final void a(d.a aVar) {
        this.f27365a = aVar;
    }

    j(Context context, Handler handler) {
        this.f27367c = handler;
        this.f27368d = context;
    }
}

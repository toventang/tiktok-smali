package com.ss.android.ugc.aweme.account.util;

import android.os.Message;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.base.SafeHandler;
import com.ss.android.ugc.aweme.au;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class TimeoutHandler<T> extends SafeHandler implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f65470b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private boolean f65471c;

    /* renamed from: d  reason: collision with root package name */
    private h.f.a.a<z> f65472d;

    /* renamed from: e  reason: collision with root package name */
    private b<? super T, z> f65473e;

    static {
        Covode.recordClassIndex(40259);
    }

    @Override // com.ss.android.ugc.aweme.account.base.SafeHandler, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40260);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.base.SafeHandler
    public final void destroy() {
        super.destroy();
        this.f65473e = null;
        this.f65472d = null;
    }

    public final void handleMessage(Message message) {
        l.d(message, "");
        int i2 = message.what;
        if (i2 == 1) {
            h.f.a.a<z> aVar = this.f65472d;
            if (aVar != null) {
                aVar.invoke();
            }
            destroy();
        } else if (i2 == 2) {
            Object obj = message.obj;
            if (!(obj instanceof Object)) {
                obj = null;
            }
            this.f65471c = true;
            b<? super T, z> bVar = this.f65473e;
            if (bVar != null) {
                bVar.invoke(obj);
            }
            destroy();
        }
    }
}

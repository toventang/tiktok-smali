package com.bytedance.android.livesdk.share;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.android.live.share.a;
import com.bytedance.android.livesdkapi.depend.e.b;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.l.f;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public f<Object> f21446a;

    /* renamed from: b  reason: collision with root package name */
    public f<String> f21447b;

    /* renamed from: c  reason: collision with root package name */
    private IHostShare f21448c;

    /* renamed from: d  reason: collision with root package name */
    private b f21449d = new b() {
        /* class com.bytedance.android.livesdk.share.d.AnonymousClass1 */

        static {
            Covode.recordClassIndex(12630);
        }

        @Override // com.bytedance.android.livesdkapi.depend.e.b
        public final void a(Throwable th) {
            if (d.this.f21446a != null) {
                d.this.f21446a.onError(th);
                d.this.f21446a = null;
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.e.b
        public final void a(String str, String str2, Bundle bundle) {
            if (d.this.f21446a != null) {
                d.this.f21446a.onSuccess(new Object());
                d.this.f21446a = null;
            }
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private IHostShare.b f21450e = new IHostShare.b() {
        /* class com.bytedance.android.livesdk.share.d.AnonymousClass2 */

        static {
            Covode.recordClassIndex(12631);
        }

        @Override // com.bytedance.android.livesdkapi.host.IHostShare.b
        public final void a(String str) {
            if (d.this.f21447b != null) {
                d.this.f21447b.onSuccess(str);
                d.this.f21447b = null;
            }
        }
    };

    static {
        Covode.recordClassIndex(12629);
    }

    public d(IHostShare iHostShare) {
        this.f21448c = iHostShare;
    }

    @Override // com.bytedance.android.live.share.a
    public final ab<Object> a(Activity activity, c cVar) {
        this.f21448c.share(activity, cVar, this.f21449d);
        f<Object> fVar = new f<>();
        this.f21446a = fVar;
        return fVar;
    }

    @Override // com.bytedance.android.live.share.a
    public final Dialog b(Activity activity, c cVar, b bVar) {
        return this.f21448c.getShareDialog(activity, cVar, bVar);
    }

    @Override // com.bytedance.android.live.share.a
    public final Dialog c(Activity activity, c cVar, b bVar) {
        cVar.b();
        return this.f21448c.getLongPressShareDialog(activity, cVar, bVar);
    }

    @Override // com.bytedance.android.live.share.a
    public final void a(Activity activity, c cVar, b bVar) {
        cVar.b();
        Dialog b2 = b(activity, cVar, bVar);
        if (b2 != null) {
            b2.show();
        }
    }
}

package com.bytedance.push.notification;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.PushBody;
import com.bytedance.push.b.a;
import com.bytedance.push.b.c;
import com.bytedance.push.c.n;
import com.bytedance.push.notification.a;

public final class h extends a {

    /* renamed from: a  reason: collision with root package name */
    private final n f42279a;

    /* renamed from: b  reason: collision with root package name */
    private final b f42280b;

    static {
        Covode.recordClassIndex(25825);
    }

    public h(n nVar, a aVar) {
        this.f42279a = nVar;
        this.f42280b = new b(aVar);
    }

    @Override // com.bytedance.push.notification.a
    public final void a(String str, a.AbstractC1034a aVar) {
        b bVar = this.f42280b;
        c cVar = new c(Uri.parse(str));
        if (bVar.f42245b == null) {
            bVar.f42245b = new Handler(Looper.getMainLooper(), bVar);
        }
        e.a(new Runnable(cVar, aVar) {
            /* class com.bytedance.push.notification.b.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f42246a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a.AbstractC1034a f42247b;

            static {
                Covode.recordClassIndex(25811);
            }

            public final void run() {
                final Bitmap bitmap;
                try {
                    bitmap = b.this.f42244a.a(this.f42246a);
                } catch (Throwable unused) {
                    bitmap = null;
                }
                b.this.f42245b.post(new Runnable() {
                    /* class com.bytedance.push.notification.b.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(25812);
                    }

                    public final void run() {
                        Bitmap bitmap = bitmap;
                        if (bitmap == null || bitmap.isRecycled()) {
                            AnonymousClass1.this.f42247b.a();
                        } else {
                            AnonymousClass1.this.f42247b.a(bitmap);
                        }
                    }
                });
            }

            {
                this.f42246a = r2;
                this.f42247b = r3;
            }
        });
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.push.notification.a
    public final void a(Context context, int i2, PushBody pushBody) {
        n nVar = this.f42279a;
        if (nVar == null || !nVar.a(context, i2, pushBody)) {
            super.a(context, i2, pushBody);
        }
    }

    @Override // com.bytedance.push.notification.a
    public final Intent b(Context context, int i2, PushBody pushBody) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        Intent intent = new Intent(applicationContext, PushActivity.class);
        intent.putExtra("push_body", pushBody.a());
        intent.putExtra("from_notification", true);
        intent.putExtra("message_from", i2);
        intent.addFlags(268435456);
        return intent;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.push.notification.a
    public final Notification b(Context context, int i2, PushBody pushBody, Bitmap bitmap) {
        if (this.f42279a != null) {
            return null;
        }
        return super.b(context, i2, pushBody, bitmap);
    }
}

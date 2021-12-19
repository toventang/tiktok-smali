package com.bytedance.push.i;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.third.d;
import java.util.concurrent.TimeUnit;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    static final Object f42187a = new Object();

    /* renamed from: b  reason: collision with root package name */
    int f42188b;

    /* renamed from: c  reason: collision with root package name */
    private final d f42189c;

    /* renamed from: d  reason: collision with root package name */
    private int f42190d = 10;

    /* renamed from: e  reason: collision with root package name */
    private Context f42191e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f42192f;

    static {
        Covode.recordClassIndex(25782);
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0157  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 397
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.i.b.run():void");
    }

    public b(Context context, d dVar) {
        com.ss.android.message.d.a();
        this.f42192f = new Handler(com.ss.android.message.d.f59825b.getLooper()) {
            /* class com.bytedance.push.i.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(25783);
            }

            public final void handleMessage(Message message) {
                super.handleMessage(message);
                b bVar = b.this;
                if (message.what == 1) {
                    try {
                        int i2 = message.arg1;
                        if (i2 == 10 || i2 != 11) {
                            String str = (String) message.obj;
                            try {
                                bVar.f42188b++;
                                if (bVar.f42188b <= 3 && !TextUtils.isEmpty(str)) {
                                    com.ss.android.message.d.a().a(new Runnable() {
                                        /* class com.bytedance.push.i.b.AnonymousClass2 */

                                        static {
                                            Covode.recordClassIndex(25784);
                                        }

                                        public final void run() {
                                            b.this.run();
                                        }
                                    }, TimeUnit.SECONDS.toMillis(4) * ((long) bVar.f42188b));
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        };
        this.f42188b = 0;
        this.f42191e = context;
        this.f42189c = dVar;
    }
}

package com.bytedance.sdk.a.l.a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.ExecutorService;

public abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private static ExecutorService f43407a;

    /* renamed from: e  reason: collision with root package name */
    static final Handler f43408e = new Handler(Looper.getMainLooper());

    /* access modifiers changed from: protected */
    public abstract T a();

    /* access modifiers changed from: protected */
    public void a(T t) {
    }

    public final void b() {
        f43407a.execute(new Runnable() {
            /* class com.bytedance.sdk.a.l.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(26595);
            }

            public final void run() {
                try {
                    a aVar = a.this;
                    a.f43408e.post(new Runnable(aVar.a()) {
                        /* class com.bytedance.sdk.a.l.a.a.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ Object f43412a;

                        static {
                            Covode.recordClassIndex(26596);
                        }

                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.sdk.a.l.a.a */
                        /* JADX WARN: Multi-variable type inference failed */
                        public final void run() {
                            a.this.a(this.f43412a);
                        }

                        {
                            this.f43412a = r2;
                        }
                    });
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        });
    }

    static {
        Covode.recordClassIndex(26594);
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        f43407a = g.a(a2.a());
    }
}

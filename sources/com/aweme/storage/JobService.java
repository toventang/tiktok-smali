package com.aweme.storage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.ss.android.ugc.aweme.cw.g;
import java.util.concurrent.Callable;

public class JobService extends Service {
    static {
        Covode.recordClassIndex(2789);
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return 2;
    }

    public void onCreate() {
        i.b(new Callable<String>() {
            /* class com.aweme.storage.JobService.AnonymousClass3 */

            static {
                Covode.recordClassIndex(2792);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public String call() {
                c.c(JobService.this);
                return null;
            }
        }, g.a()).c(new b.g<String, String>() {
            /* class com.aweme.storage.JobService.AnonymousClass2 */

            static {
                Covode.recordClassIndex(2791);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
            @Override // b.g
            public final /* synthetic */ String then(i<String> iVar) {
                c.d(JobService.this);
                return null;
            }
        }, i.f4826c).b((b.g) new b.g<String, i<String>>() {
            /* class com.aweme.storage.JobService.AnonymousClass1 */

            static {
                Covode.recordClassIndex(2790);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
            @Override // b.g
            public final /* synthetic */ i<String> then(i<String> iVar) {
                JobService.this.stopSelf();
                return null;
            }
        });
    }

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}

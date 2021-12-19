package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class FU {
    private static int getBody = 1;
    private static int getUrl;

    public interface getHeaders<D> {
        static {
            Covode.recordClassIndex(2523);
        }

        void getHeaders(D d2);

        void getMethod();
    }

    static {
        Covode.recordClassIndex(2521);
    }

    public static ExecutorService com_apiguard3_internal_FU_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor() {
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        return g.a(a2.a());
    }

    public static <T> Future<Void> AGRequest(final Future<T> future, final getHeaders<T> getheaders) {
        Future<T> submit = com_apiguard3_internal_FU_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor().submit(new Callable<Void>() {
            /* class com.apiguard3.internal.FU.AnonymousClass4 */
            private static int AGRequest;
            private static int getBody = 1;

            static {
                Covode.recordClassIndex(2522);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() {
                int i2 = AGRequest + 93;
                getBody = i2 % 128;
                int i3 = i2 % 2;
                Void method = getMethod();
                int i4 = getBody + 11;
                AGRequest = i4 % 128;
                int i5 = i4 % 2;
                return method;
            }

            private Void getMethod() {
                getHeaders getheaders;
                Object obj;
                int i2 = getBody + 33;
                AGRequest = i2 % 128;
                if (i2 % 2 == 0) {
                    getheaders = getheaders;
                    obj = future.get();
                } else {
                    try {
                        getheaders = getheaders;
                        obj = future.get();
                    } catch (Throwable th) {
                        getHeaders getheaders2 = getheaders;
                        th.getCause();
                        getheaders2.getMethod();
                        if (th.getCause() instanceof Exception) {
                            throw th.getCause();
                        }
                        throw th;
                    }
                }
                getheaders.getHeaders(obj);
                int i3 = getBody + 27;
                AGRequest = i3 % 128;
                int i4 = i3 % 2;
                return null;
            }
        });
        int i2 = getUrl + 51;
        getBody = i2 % 128;
        int i3 = i2 % 2;
        return submit;
    }
}

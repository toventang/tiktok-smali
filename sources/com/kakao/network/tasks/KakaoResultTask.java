package com.kakao.network.tasks;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.kakao.network.ErrorResult;
import com.kakao.network.callback.ResponseCallback;
import com.kakao.network.exception.ResponseStatusError;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public abstract class KakaoResultTask<T> {
    public static final Handler mainHandler = new Handler(Looper.getMainLooper());
    final ResponseCallback<T> callback;
    private final Callable<T> task;

    public abstract T call();

    public void onDidEnd() {
    }

    public void onDidStart() {
    }

    public final Callable<T> getCallable() {
        return this.task;
    }

    public KakaoResultTask() {
        this.task = new Callable<T>() {
            /* class com.kakao.network.tasks.KakaoResultTask.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34404);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: java.lang.Object */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public T call() {
                final Exception e2;
                final T t = null;
                try {
                    if (KakaoResultTask.this.callback != null) {
                        KakaoResultTask.this.callback.onDidStart();
                    }
                    KakaoResultTask.this.onDidStart();
                    e2 = null;
                    t = KakaoResultTask.this.call();
                } catch (Exception e3) {
                    e2 = e3;
                }
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                KakaoResultTask.mainHandler.post(new Runnable() {
                    /* class com.kakao.network.tasks.KakaoResultTask.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(34405);
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.kakao.network.callback.ResponseCallback<T> */
                    /* JADX WARN: Multi-variable type inference failed */
                    public void run() {
                        ErrorResult errorResult;
                        try {
                            if (KakaoResultTask.this.callback != null) {
                                Exception exc = e2;
                                if (exc != null) {
                                    if (exc instanceof ResponseStatusError) {
                                        errorResult = new ErrorResult((ResponseStatusError) exc);
                                    } else {
                                        errorResult = new ErrorResult(e2);
                                    }
                                    KakaoResultTask.this.callback.onFailureForUiThread(errorResult);
                                } else {
                                    KakaoResultTask.this.callback.onSuccessForUiThread(t);
                                }
                            }
                        } finally {
                            countDownLatch.countDown();
                        }
                    }
                });
                countDownLatch.await();
                KakaoResultTask.this.onDidEnd();
                if (KakaoResultTask.this.callback != null) {
                    KakaoResultTask.this.callback.onDidEnd();
                }
                return t;
            }
        };
        this.callback = null;
    }

    static {
        Covode.recordClassIndex(34403);
    }

    public KakaoResultTask(ResponseCallback<T> responseCallback) {
        this.task = new Callable<T>() {
            /* class com.kakao.network.tasks.KakaoResultTask.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34404);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: java.lang.Object */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public T call() {
                final Exception e2;
                final T t = null;
                try {
                    if (KakaoResultTask.this.callback != null) {
                        KakaoResultTask.this.callback.onDidStart();
                    }
                    KakaoResultTask.this.onDidStart();
                    e2 = null;
                    t = KakaoResultTask.this.call();
                } catch (Exception e3) {
                    e2 = e3;
                }
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                KakaoResultTask.mainHandler.post(new Runnable() {
                    /* class com.kakao.network.tasks.KakaoResultTask.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(34405);
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.kakao.network.callback.ResponseCallback<T> */
                    /* JADX WARN: Multi-variable type inference failed */
                    public void run() {
                        ErrorResult errorResult;
                        try {
                            if (KakaoResultTask.this.callback != null) {
                                Exception exc = e2;
                                if (exc != null) {
                                    if (exc instanceof ResponseStatusError) {
                                        errorResult = new ErrorResult((ResponseStatusError) exc);
                                    } else {
                                        errorResult = new ErrorResult(e2);
                                    }
                                    KakaoResultTask.this.callback.onFailureForUiThread(errorResult);
                                } else {
                                    KakaoResultTask.this.callback.onSuccessForUiThread(t);
                                }
                            }
                        } finally {
                            countDownLatch.countDown();
                        }
                    }
                });
                countDownLatch.await();
                KakaoResultTask.this.onDidEnd();
                if (KakaoResultTask.this.callback != null) {
                    KakaoResultTask.this.callback.onDidEnd();
                }
                return t;
            }
        };
        this.callback = responseCallback;
    }
}

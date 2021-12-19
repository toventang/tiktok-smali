package com.snapchat.kit.sdk.core.metrics;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.MetricPublisher;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class b<T> implements MetricQueue<T> {

    /* renamed from: a  reason: collision with root package name */
    final MetricPublisher<T> f57135a;

    /* renamed from: b  reason: collision with root package name */
    final ScheduledExecutorService f57136b;

    /* renamed from: c  reason: collision with root package name */
    final LinkedHashSet<d<T>> f57137c = new LinkedHashSet<>();

    /* renamed from: d  reason: collision with root package name */
    final LinkedHashSet<d<T>> f57138d = new LinkedHashSet<>();

    /* renamed from: e  reason: collision with root package name */
    final AtomicReference<Future<?>> f57139e = new AtomicReference<>();

    /* renamed from: f  reason: collision with root package name */
    final int f57140f;

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f57141g = new Runnable() {
        /* class com.snapchat.kit.sdk.core.metrics.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(35609);
        }

        public final void run() {
            b.this.b();
        }
    };

    /* renamed from: h  reason: collision with root package name */
    private final c f57142h;

    static {
        Covode.recordClassIndex(35608);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        Future<?> andSet = this.f57139e.getAndSet(null);
        if (andSet != null) {
            andSet.cancel(false);
        }
        if (!this.f57137c.isEmpty()) {
            final ArrayList arrayList = new ArrayList(this.f57137c);
            this.f57137c.clear();
            this.f57138d.addAll(arrayList);
            this.f57135a.publishMetrics(a(arrayList), new MetricPublisher.PublishCallback() {
                /* class com.snapchat.kit.sdk.core.metrics.b.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(35612);
                }

                @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher.PublishCallback
                public final void onNetworkError() {
                    b.this.f57136b.execute(new Runnable() {
                        /* class com.snapchat.kit.sdk.core.metrics.b.AnonymousClass4.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(35614);
                        }

                        public final void run() {
                            b.this.f57138d.removeAll(arrayList);
                            b.this.f57137c.addAll(arrayList);
                        }
                    });
                }

                @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher.PublishCallback
                public final void onSuccess() {
                    b.this.f57136b.execute(new Runnable() {
                        /* class com.snapchat.kit.sdk.core.metrics.b.AnonymousClass4.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(35613);
                        }

                        public final void run() {
                            b.this.f57138d.removeAll(arrayList);
                            b.a(b.this);
                        }
                    });
                }

                @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher.PublishCallback
                public final void onServerError(final Error error) {
                    b.this.f57136b.execute(new Runnable() {
                        /* class com.snapchat.kit.sdk.core.metrics.b.AnonymousClass4.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(35615);
                        }

                        public final void run() {
                            b.this.f57138d.removeAll(arrayList);
                            for (d<T> dVar : arrayList) {
                                if (dVar.f57184a <= 0) {
                                    dVar.f57184a++;
                                    b.this.f57137c.add(dVar);
                                }
                            }
                            b.a(b.this);
                        }
                    });
                }
            });
        }
    }

    public final void a() {
        this.f57136b.execute(new Runnable() {
            /* class com.snapchat.kit.sdk.core.metrics.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(35610);
            }

            public final void run() {
                List<d<T>> persistedEvents = b.this.f57135a.getPersistedEvents();
                if (persistedEvents != null && !persistedEvents.isEmpty()) {
                    b.this.f57137c.addAll(persistedEvents);
                    b.this.f57139e.set(b.this.f57136b.schedule(b.this.f57141g, 1000, TimeUnit.MILLISECONDS));
                }
            }
        });
        this.f57142h.f57156a.add(this);
    }

    @Override // com.snapchat.kit.sdk.core.metrics.MetricQueue
    public final void push(final T t) {
        this.f57136b.execute(new Runnable() {
            /* class com.snapchat.kit.sdk.core.metrics.b.AnonymousClass3 */

            static {
                Covode.recordClassIndex(35611);
            }

            public final void run() {
                b.this.f57137c.add(new d<>(t));
                b.a(b.this);
                if (b.this.f57137c.size() >= b.this.f57140f) {
                    b.this.b();
                } else if (b.this.f57139e.get() == null) {
                    b.this.f57139e.set(b.this.f57136b.schedule(b.this.f57141g, 30000, TimeUnit.MILLISECONDS));
                }
            }
        });
    }

    private static <T> List<T> a(Collection<d<T>> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (d<T> dVar : collection) {
            arrayList.add(dVar.f57185b);
        }
        return arrayList;
    }

    static /* synthetic */ void a(b bVar) {
        ArrayList arrayList = new ArrayList(bVar.f57137c);
        arrayList.addAll(bVar.f57138d);
        bVar.f57135a.persistMetrics(arrayList);
    }

    public b(MetricPublisher<T> metricPublisher, ScheduledExecutorService scheduledExecutorService, c cVar, int i2) {
        this.f57135a = metricPublisher;
        this.f57136b = scheduledExecutorService;
        this.f57140f = i2;
        this.f57142h = cVar;
    }
}

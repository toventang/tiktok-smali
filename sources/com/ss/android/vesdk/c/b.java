package com.ss.android.vesdk.c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.medialib.presenter.e;
import com.ss.android.vesdk.VEARCoreParam;
import com.ss.android.vesdk.a.a;
import com.ss.android.vesdk.a.c;
import com.ss.android.vesdk.an;
import com.ss.android.vesdk.d;
import com.ss.android.vesdk.filterparam.VEAudioLoudnessBalanceFilter;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import java.util.ArrayList;
import java.util.List;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f151111a = b.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    d f151112b;

    /* renamed from: c  reason: collision with root package name */
    public e f151113c;

    /* renamed from: d  reason: collision with root package name */
    private List<c> f151114d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private List<VEBaseFilterParam> f151115e = new ArrayList();

    static {
        Covode.recordClassIndex(99362);
    }

    @Override // com.ss.android.vesdk.c.a
    public final void a(VEARCoreParam vEARCoreParam) {
        if (vEARCoreParam == null) {
            an.c(f151111a, "ARCore param is null");
        }
        this.f151113c.a(vEARCoreParam);
    }

    @Override // com.ss.android.vesdk.c.a
    public final int a(final VEBaseFilterParam vEBaseFilterParam) {
        this.f151115e.add(vEBaseFilterParam);
        this.f151112b.b(new Runnable() {
            /* class com.ss.android.vesdk.c.b.AnonymousClass1 */

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f151117b = 0;

            static {
                Covode.recordClassIndex(99363);
            }

            public final void run() {
                if (b.this.f151112b.u == 3) {
                    an.d(b.f151111a, "addTrackFilter in status:" + b.this.f151112b.u);
                } else if (vEBaseFilterParam.filterType == 1 && TextUtils.equals(vEBaseFilterParam.filterName, "loudness balance") && this.f151117b == 0) {
                    b.this.f151113c.a(true, ((VEAudioLoudnessBalanceFilter) vEBaseFilterParam).targetLoudness);
                }
            }
        });
        return this.f151115e.size() - 1;
    }

    @Override // com.ss.android.vesdk.c.a
    public final int a(int i2) {
        if (i2 < 0 || i2 >= this.f151115e.size()) {
            return 0;
        }
        final VEBaseFilterParam vEBaseFilterParam = this.f151115e.get(i2);
        if (vEBaseFilterParam == null) {
            return -1;
        }
        this.f151112b.b(new Runnable() {
            /* class com.ss.android.vesdk.c.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(99364);
            }

            public final void run() {
                if (b.this.f151112b.u == 3) {
                    an.d(b.f151111a, "removeTrackFilter in status:" + b.this.f151112b.u);
                } else if (vEBaseFilterParam.filterType == 1 && TextUtils.equals(vEBaseFilterParam.filterName, "loudness balance")) {
                    b.this.f151113c.a(false, 0.0d);
                }
            }
        });
        this.f151115e.set(i2, null);
        return 0;
    }

    @Override // com.ss.android.vesdk.c.a
    public final int a(final c cVar) {
        this.f151114d.add(cVar);
        if (cVar.f150877c == 7) {
            com.ss.android.vesdk.a.d dVar = (com.ss.android.vesdk.a.d) cVar;
            this.f151113c.a(true, dVar.f150881b, dVar.f150882f, dVar.f150883g, dVar.f150884h, dVar.f150885i, dVar.f150886j, dVar.f150887k, dVar.f150888l, dVar.f150889m, dVar.n, false);
        } else if (cVar.f150877c == 100) {
            this.f151112b.b(new Runnable() {
                /* class com.ss.android.vesdk.c.b.AnonymousClass3 */

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ int f151122b = 0;

                static {
                    Covode.recordClassIndex(99365);
                }

                public final void run() {
                    if (b.this.f151112b.u == 3) {
                        an.d(b.f151111a, "addTrackAlgorithm in status:" + b.this.f151112b.u);
                    } else if (cVar.f150877c == 100 && cVar.f150878d == "audio mic detect delay" && this.f151122b == 0) {
                        a aVar = (a) cVar;
                        b.this.f151113c.a(true, aVar.f150878d, aVar.f150874a);
                    }
                }
            });
        } else if (cVar.f150877c == 8) {
            this.f151112b.b(new Runnable() {
                /* class com.ss.android.vesdk.c.b.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(99366);
                }

                public final void run() {
                    if (cVar.f150877c == 8) {
                        com.ss.android.vesdk.a.b bVar = (com.ss.android.vesdk.a.b) cVar;
                        b.this.f151113c.b(true, bVar.f150875a, bVar.f150876b);
                    }
                }
            });
        }
        return this.f151114d.size() - 1;
    }

    @Override // com.ss.android.vesdk.c.a
    public final int b(int i2) {
        if (i2 < 0 || i2 >= this.f151114d.size()) {
            return 0;
        }
        final c cVar = this.f151114d.get(i2);
        if (cVar == null) {
            return -1;
        }
        if (cVar.f150877c == 7) {
            com.ss.android.vesdk.a.d dVar = (com.ss.android.vesdk.a.d) cVar;
            this.f151113c.a(false, dVar.f150881b, dVar.f150882f, dVar.f150883g, dVar.f150884h, dVar.f150885i, dVar.f150886j, dVar.f150887k, dVar.f150888l, dVar.f150889m, dVar.n, false);
        } else if (cVar.f150877c == 100) {
            this.f151112b.b(new Runnable() {
                /* class com.ss.android.vesdk.c.b.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(99367);
                }

                public final void run() {
                    if (b.this.f151112b.u == 3) {
                        an.d(b.f151111a, "removeTrackAlgorithm in status:" + b.this.f151112b.u);
                    } else if (cVar.f150878d == "audio mic detect delay") {
                        b.this.f151113c.a(false, cVar.f150878d, "");
                    }
                }
            });
        } else if (cVar.f150877c == 8) {
            this.f151112b.b(new Runnable() {
                /* class com.ss.android.vesdk.c.b.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(99368);
                }

                public final void run() {
                    if (cVar.f150877c == 8) {
                        com.ss.android.vesdk.a.b bVar = (com.ss.android.vesdk.a.b) cVar;
                        b.this.f151113c.b(false, bVar.f150875a, bVar.f150876b);
                    }
                }
            });
        }
        this.f151114d.set(i2, null);
        return 0;
    }

    public b(e eVar, d dVar) {
        this.f151113c = eVar;
        this.f151112b = dVar;
    }
}

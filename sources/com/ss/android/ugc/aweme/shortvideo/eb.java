package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.bytedance.creativex.recorder.b.a.g;
import com.bytedance.creativex.recorder.b.a.x;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.aweme.shortvideo.w.g;
import com.ss.android.ugc.tools.c;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class eb {

    /* renamed from: a  reason: collision with root package name */
    public final g<?> f126682a;

    /* renamed from: b  reason: collision with root package name */
    public final SafeHandler f126683b;

    /* renamed from: c  reason: collision with root package name */
    private final ASCameraView f126684c;

    /* renamed from: d  reason: collision with root package name */
    private final CameraComponentModel f126685d;

    /* renamed from: e  reason: collision with root package name */
    private final g.b f126686e;

    /* renamed from: f  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.shortvideo.record.a f126687f;

    static {
        Covode.recordClassIndex(83086);
    }

    public final void a(x xVar) {
        c.f149151f.a("stopRecord() called");
        this.f126682a.e(xVar);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements b<Integer, z> {
        final /* synthetic */ x $event$inlined;
        final /* synthetic */ boolean $isQuitGame$inlined;
        final /* synthetic */ eb this$0;

        static {
            Covode.recordClassIndex(83087);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(eb ebVar, boolean z, x xVar) {
            super(1);
            this.this$0 = ebVar;
            this.$isQuitGame$inlined = z;
            this.$event$inlined = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int intValue = num.intValue();
            if (intValue <= 0) {
                this.this$0.f126682a.a(new g.d((long) intValue));
            }
            this.this$0.f126683b.post(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.eb.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f126688a;

                static {
                    Covode.recordClassIndex(83088);
                }

                {
                    this.f126688a = r1;
                }

                public final void run() {
                    this.f126688a.this$0.f126682a.h(true);
                }
            });
            if (!this.$isQuitGame$inlined) {
                this.this$0.f126683b.post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.shortvideo.eb.a.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f126689a;

                    static {
                        Covode.recordClassIndex(83089);
                    }

                    {
                        this.f126689a = r1;
                    }

                    public final void run() {
                        this.f126689a.this$0.a(this.f126689a.$event$inlined);
                    }
                });
            }
            this.this$0.f126682a.O();
            Runnable runnable = this.$event$inlined.f28219f;
            if (runnable != null) {
                this.this$0.f126683b.post(runnable);
            }
            return z.f158842a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onEvent(com.bytedance.creativex.recorder.b.a.x r11) {
        /*
        // Method dump skipped, instructions count: 340
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.eb.onEvent(com.bytedance.creativex.recorder.b.a.x):void");
    }

    public eb(d dVar, com.ss.android.ugc.aweme.shortvideo.w.g<?> gVar, g.b bVar, SafeHandler safeHandler, com.ss.android.ugc.aweme.shortvideo.record.a aVar) {
        l.d(dVar, "");
        l.d(gVar, "");
        l.d(bVar, "");
        l.d(safeHandler, "");
        l.d(aVar, "");
        this.f126682a = gVar;
        this.f126686e = bVar;
        this.f126683b = safeHandler;
        this.f126687f = aVar;
        this.f126684c = dVar.D();
        this.f126685d = dVar.e();
    }
}

package com.ss.videoarch.strategy.b;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.videoarch.strategy.LiveStrategyManager;
import java.util.HashSet;
import java.util.Set;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Set<a> f154433a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f154434b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public final a f154435c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.videoarch.strategy.b.a.a f154436d = null;

    /* renamed from: e  reason: collision with root package name */
    public boolean f154437e = false;

    /* renamed from: f  reason: collision with root package name */
    public int f154438f = 0;

    /* renamed from: g  reason: collision with root package name */
    public String f154439g = "";

    /* renamed from: h  reason: collision with root package name */
    public boolean f154440h = true;

    /* renamed from: i  reason: collision with root package name */
    private final f f154441i;

    /* renamed from: j  reason: collision with root package name */
    private String f154442j = "\n    \"RecommendSettingsRequest\":{\n        \"Enabled\":true,\n        \"BusinessInfo\":{\n            \"ProjectKeys\":[\"live_stream_strategy_engine\"]\n        }\n    }";

    public interface a {
        static {
            Covode.recordClassIndex(102932);
        }

        void a(com.ss.videoarch.strategy.b.a.a aVar, String str);
    }

    static {
        Covode.recordClassIndex(102927);
    }

    public final void a(final String str) {
        if (!this.f154437e) {
            this.f154437e = true;
            this.f154441i.a(new Runnable() {
                /* class com.ss.videoarch.strategy.b.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(102928);
                }

                public final void run() {
                    final com.ss.videoarch.strategy.b.a.a aVar;
                    try {
                        if (LiveStrategyManager.mDnsOptimizer != null) {
                            e.this.f154439g = LiveStrategyManager.mDnsOptimizer.a(e.this.f154440h, str);
                        }
                        a aVar2 = e.this.f154435c;
                        e eVar = e.this;
                        aVar = new com.ss.videoarch.strategy.b.a.a(aVar2.a("/api/neptune/v3/sdk/PackLiveSDK", (Object) eVar.b(eVar.f154439g)));
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        aVar = null;
                    }
                    if (e.this.f154440h && aVar != null) {
                        e.this.f154440h = false;
                    }
                    e.this.f154434b.post(new Runnable() {
                        /* class com.ss.videoarch.strategy.b.e.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(102929);
                        }

                        public final void run() {
                            e.this.f154437e = false;
                            if (aVar == null) {
                                e eVar = e.this;
                                int i2 = eVar.f154438f + 1;
                                eVar.f154438f = i2;
                                if (i2 <= 5) {
                                    e eVar2 = e.this;
                                    String str = str;
                                    eVar2.f154434b.removeCallbacksAndMessages(null);
                                    eVar2.f154434b.postDelayed(new Runnable(str) {
                                        /* class com.ss.videoarch.strategy.b.e.AnonymousClass3 */

                                        /* renamed from: a  reason: collision with root package name */
                                        final /* synthetic */ String f154450a;

                                        static {
                                            Covode.recordClassIndex(102931);
                                        }

                                        public final void run() {
                                            e.this.a(this.f154450a);
                                        }

                                        {
                                            this.f154450a = r2;
                                        }
                                    }, 10000);
                                    return;
                                }
                                return;
                            }
                            e.this.f154438f = 0;
                            e.this.f154436d = aVar;
                            for (a aVar : e.this.f154433a) {
                                aVar.a(e.this.f154436d, str);
                            }
                        }
                    });
                }
            });
        }
    }

    public final String b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("{").append(this.f154442j);
        if (!str.equals("")) {
            sb.append(",").append(str);
        }
        return sb.append("}").toString();
    }

    e(f fVar, a aVar) {
        this.f154441i = fVar;
        this.f154435c = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (r3 == null) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(final java.lang.String r6, final android.os.Handler r7) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.strategy.b.e.a(java.lang.String, android.os.Handler):void");
    }
}

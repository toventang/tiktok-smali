package com.bytedance.android.monitorV2.h;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.monitorV2.h.a.a;
import com.bytedance.android.monitorV2.h.a.b;
import com.bytedance.android.monitorV2.h.a.d;
import com.bytedance.android.monitorV2.h.a.e;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public final class c extends a implements f {

    /* renamed from: a  reason: collision with root package name */
    public d f23984a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f23985b;

    /* renamed from: c  reason: collision with root package name */
    public d f23986c;

    static {
        Covode.recordClassIndex(14137);
    }

    @Override // com.bytedance.android.monitorV2.h.f
    public final a b() {
        if (this.f23984a.f23960a != null) {
            return this.f23984a.f23960a;
        }
        return new a();
    }

    @Override // com.bytedance.android.monitorV2.h.f
    public final e c() {
        if (this.f23984a.f23961b != null) {
            return this.f23984a.f23961b;
        }
        return new e();
    }

    @Override // com.bytedance.android.monitorV2.h.f
    public final List<b> d() {
        if (this.f23984a.f23960a == null || this.f23984a.f23960a.f23924c == null) {
            return new ArrayList();
        }
        return this.f23984a.f23960a.f23924c;
    }

    @Override // com.bytedance.android.monitorV2.h.f
    public final Map<String, Integer> e() {
        if (this.f23984a.f23965f != null) {
            return this.f23984a.f23965f;
        }
        return new HashMap();
    }

    public final void b(int i2) {
        if (i2 > 0) {
            a(i2);
        }
    }

    @Override // com.bytedance.android.monitorV2.h.f
    public final void a(Context context) {
        if (context != null) {
            if (!this.f23985b) {
                com.bytedance.android.monitorV2.f.a.a(new Runnable() {
                    /* class com.bytedance.android.monitorV2.h.c.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(14138);
                    }

                    public final void run() {
                        d a2 = c.this.f23986c.a();
                        if (a2 != null) {
                            c.this.f23984a = a2;
                        }
                        if (c.this.f23984a != null) {
                            c cVar = c.this;
                            cVar.b(cVar.f23984a.f23963d);
                            com.bytedance.android.monitorV2.i.b.a("HybridSettingRequestService", c.this.f23984a.f23961b.toString());
                            c.this.f23985b = true;
                            return;
                        }
                        com.bytedance.android.monitorV2.i.b.a("HybridSettingRequestService_init", "monitor setting init: failed");
                        new Timer().schedule(new TimerTask() {
                            /* class com.bytedance.android.monitorV2.h.c.AnonymousClass1.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(14139);
                            }

                            public final void run() {
                                d a2 = c.this.f23986c.a();
                                if (a2 != null) {
                                    c.this.f23984a = a2;
                                }
                                if (c.this.f23984a == null) {
                                    com.bytedance.android.monitorV2.i.b.a("HybridSettingRequestService_retry", "monitor setting retry after 10 min: failed");
                                    return;
                                }
                                c.this.b(c.this.f23984a.f23963d);
                                c.this.f23985b = true;
                                com.bytedance.android.monitorV2.i.b.a("HybridSettingRequestService_retry", "monitor setting retry after 10 min: succeeded");
                            }
                        }, 600000);
                    }
                });
            }
            a(new e() {
                /* class com.bytedance.android.monitorV2.h.c.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(14140);
                }

                @Override // com.bytedance.android.monitorV2.h.e
                public final void a(int i2) {
                    c cVar = c.this;
                    if (i2 > 0) {
                        com.bytedance.android.monitorV2.f.a.a(new Runnable(i2) {
                            /* class com.bytedance.android.monitorV2.h.c.AnonymousClass3 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ int f23990a;

                            static {
                                Covode.recordClassIndex(14141);
                            }

                            public final void run() {
                                new Timer().schedule(new TimerTask() {
                                    /* class com.bytedance.android.monitorV2.h.c.AnonymousClass3.AnonymousClass1 */

                                    static {
                                        Covode.recordClassIndex(14142);
                                    }

                                    public final void run() {
                                        d a2 = c.this.f23986c.a();
                                        if (a2 != null) {
                                            c.this.f23984a = a2;
                                        }
                                        if (c.this.f23984a != null) {
                                            c.this.b(c.this.f23984a.f23963d);
                                            com.bytedance.android.monitorV2.i.b.a("HybridSettingRequestService", c.this.f23984a.f23961b.toString());
                                            com.bytedance.android.monitorV2.i.b.a("HybridSettingRequestService_update", "monitor setting updating every " + AnonymousClass3.this.f23990a + " secs: succeeded");
                                            return;
                                        }
                                        com.bytedance.android.monitorV2.i.b.a("HybridSettingRequestService_update", "monitor setting updating every " + AnonymousClass3.this.f23990a + " secs: failed");
                                    }
                                }, (long) (this.f23990a * 1000));
                            }

                            {
                                this.f23990a = r2;
                            }
                        });
                    }
                }
            });
        }
    }

    public c(com.bytedance.android.monitorV2.h.a.c cVar) {
        d a2;
        this.f23986c = new d(cVar);
        String a3 = com.bytedance.android.monitorV2.b.a.a("monitor_setting_response", "");
        this.f23984a = (TextUtils.isEmpty(a3) || (a2 = com.bytedance.android.monitorV2.l.b.a(a3)) == null) ? new d() : a2;
    }
}

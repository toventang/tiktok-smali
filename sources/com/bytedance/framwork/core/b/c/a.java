package com.bytedance.framwork.core.b.c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.c.a;
import com.bytedance.framwork.core.c.c;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.framwork.core.sdkmonitor.k;
import java.net.URL;
import java.util.List;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.framwork.core.c.a f29421a;

    /* renamed from: b  reason: collision with root package name */
    volatile long f29422b;

    /* renamed from: c  reason: collision with root package name */
    boolean f29423c;

    /* renamed from: d  reason: collision with root package name */
    int f29424d;

    /* renamed from: e  reason: collision with root package name */
    Context f29425e;

    /* renamed from: f  reason: collision with root package name */
    String f29426f;

    /* renamed from: g  reason: collision with root package name */
    int f29427g;

    /* renamed from: h  reason: collision with root package name */
    volatile long f29428h;

    /* renamed from: i  reason: collision with root package name */
    volatile long f29429i;

    /* renamed from: j  reason: collision with root package name */
    String f29430j;

    /* renamed from: k  reason: collision with root package name */
    boolean f29431k = true;

    static {
        Covode.recordClassIndex(17144);
    }

    public final void a() {
        if (this.f29431k) {
            int i2 = this.f29424d;
            if (i2 == 0) {
                this.f29422b = 300000;
                this.f29424d++;
            } else if (i2 == 1) {
                this.f29422b = 900000;
                this.f29424d++;
            } else {
                this.f29422b = 1800000;
                this.f29424d++;
            }
            SDKMonitorUtils.a(this.f29426f).b(this.f29422b);
        }
    }

    public final void a(String str) {
        if (this.f29431k) {
            this.f29430j = str;
        }
    }

    @Override // com.bytedance.framwork.core.b.c.b
    public final boolean b(String str) {
        return this.f29421a.a(c.a(str));
    }

    public final void a(long j2) {
        if (this.f29431k) {
            this.f29429i = j2 * 1000;
            SDKMonitorUtils.a(this.f29426f).b(this.f29429i);
        }
    }

    public a(Context context, final String str) {
        this.f29426f = str;
        this.f29425e = context;
        AnonymousClass1 r4 = new a.AbstractC0628a() {
            /* class com.bytedance.framwork.core.b.c.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(17145);
            }

            @Override // com.bytedance.framwork.core.c.a.b
            public final String a() {
                return str + "sdk_monitor";
            }

            @Override // com.bytedance.framwork.core.c.a.b
            public final List<String> b() {
                String str = str;
                if (TextUtils.isEmpty(str) || com.bytedance.framwork.core.b.a.c.f29391b.get(str) == null) {
                    return com.bytedance.framwork.core.b.a.c.f29390a.c();
                }
                return com.bytedance.framwork.core.b.a.c.f29391b.get(str).c();
            }

            @Override // com.bytedance.framwork.core.c.a.AbstractC0628a, com.bytedance.framwork.core.c.a.b
            public final int c() {
                String str = str;
                if (TextUtils.isEmpty(str) || com.bytedance.framwork.core.b.a.c.f29391b.get(str) == null) {
                    return com.bytedance.framwork.core.b.a.c.f29390a.e();
                }
                return com.bytedance.framwork.core.b.a.c.f29391b.get(str).e();
            }

            @Override // com.bytedance.framwork.core.c.a.AbstractC0628a, com.bytedance.framwork.core.c.a.b
            public final long d() {
                int f2;
                String str = str;
                if (TextUtils.isEmpty(str) || com.bytedance.framwork.core.b.a.c.f29391b.get(str) == null) {
                    f2 = com.bytedance.framwork.core.b.a.c.f29390a.f();
                } else {
                    f2 = com.bytedance.framwork.core.b.a.c.f29391b.get(str).f();
                }
                return (long) (f2 * 1000);
            }

            @Override // com.bytedance.framwork.core.c.a.AbstractC0628a, com.bytedance.framwork.core.c.a.b
            public final String e() {
                List<String> b2;
                if (TextUtils.isEmpty(a.this.f29430j) || (b2 = b()) == null || b2.size() <= 0) {
                    return null;
                }
                try {
                    return "https://" + a.this.f29430j + new URL(b2.get(0)).getPath();
                } catch (Throwable unused) {
                    return null;
                }
            }
        };
        AnonymousClass2 r5 = new a.c() {
            /* class com.bytedance.framwork.core.b.c.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(17146);
            }

            @Override // com.bytedance.framwork.core.c.a.c
            public final boolean c() {
                return a.this.f29423c;
            }

            @Override // com.bytedance.framwork.core.c.a.c
            public final long b() {
                long j2;
                a aVar = a.this;
                if (!aVar.f29431k) {
                    return 0;
                }
                if (aVar.f29422b > aVar.f29428h) {
                    j2 = aVar.f29422b;
                } else {
                    j2 = aVar.f29428h;
                }
                if (j2 > aVar.f29429i) {
                    return j2;
                }
                return aVar.f29429i;
            }

            @Override // com.bytedance.framwork.core.c.a.c
            public final boolean a() {
                String str = str;
                if (TextUtils.isEmpty(str) || com.bytedance.framwork.core.b.a.c.f29391b.get(str) == null) {
                    return com.bytedance.framwork.core.b.a.c.f29390a.g();
                }
                return com.bytedance.framwork.core.b.a.c.f29391b.get(str).g();
            }
        };
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f29421a = new com.bytedance.framwork.core.c.a(applicationContext, r4, r5) {
            /* class com.bytedance.framwork.core.b.c.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(17147);
            }

            @Override // com.bytedance.framwork.core.c.a
            public final boolean a(String str, byte[] bArr) {
                if (d.a(str) != null) {
                    e a2 = d.a(str).a(str, bArr);
                    a.this.a((String) null);
                    if (a2.f29440a > 0) {
                        a.this.f29423c = false;
                        if (a2.f29440a != 200 || a2.f29441b == null) {
                            if (500 <= a2.f29440a && a2.f29440a <= 600) {
                                a.this.a();
                                return false;
                            }
                        } else if ("success".equals(a2.f29441b.opt("message"))) {
                            a aVar = a.this;
                            if (aVar.f29431k) {
                                SDKMonitorUtils.a(aVar.f29426f).f29551d.a();
                                SDKMonitorUtils.a(aVar.f29426f).a(false);
                                aVar.f29424d = 0;
                                aVar.f29422b = 0;
                                aVar.f29427g = 0;
                                aVar.f29428h = 0;
                                aVar.f29429i = 0;
                            }
                            String optString = a2.f29441b.optString("redirect");
                            long optLong = a2.f29441b.optLong("delay");
                            if (!TextUtils.isEmpty(optString)) {
                                a.this.a(optString);
                            }
                            if (optLong > 0) {
                                a.this.a(optLong);
                            }
                            return true;
                        } else {
                            boolean equals = "drop data".equals(a2.f29441b.opt("message"));
                            boolean equals2 = "drop all data".equals(a2.f29441b.opt("message"));
                            String optString2 = a2.f29441b.optString("redirect");
                            long optLong2 = a2.f29441b.optLong("delay");
                            if (!TextUtils.isEmpty(optString2)) {
                                a.this.a(optString2);
                            }
                            if (optLong2 > 0) {
                                a.this.a(optLong2);
                            }
                            if (equals) {
                                a aVar2 = a.this;
                                if (aVar2.f29431k) {
                                    aVar2.a();
                                    SDKMonitorUtils.a(aVar2.f29426f).a(true);
                                }
                            } else {
                                a aVar3 = a.this;
                                if (aVar3.f29431k) {
                                    SDKMonitorUtils.a(aVar3.f29426f).a(false);
                                }
                            }
                            if (equals2) {
                                a aVar4 = a.this;
                                if (aVar4.f29431k) {
                                    aVar4.a();
                                    SDKMonitorUtils.a(aVar4.f29426f).a(true);
                                    k a3 = SDKMonitorUtils.a(aVar4.f29426f);
                                    try {
                                        a3.f29550c.a();
                                        a3.f29551d.b(2147483647L);
                                    } catch (Throwable unused) {
                                    }
                                    k a4 = SDKMonitorUtils.a(aVar4.f29426f);
                                    a4.f29551d.f29397f = true;
                                    a4.o = true;
                                }
                            }
                            return false;
                        }
                    } else {
                        a aVar5 = a.this;
                        if (aVar5.f29431k) {
                            if (aVar5.f29427g == 0) {
                                aVar5.f29428h = 30000;
                                aVar5.f29427g++;
                            } else if (aVar5.f29427g == 1) {
                                aVar5.f29428h = 60000;
                                aVar5.f29427g++;
                            } else if (aVar5.f29427g == 2) {
                                aVar5.f29428h = 120000;
                                aVar5.f29427g++;
                            } else if (aVar5.f29427g == 3) {
                                aVar5.f29428h = 240000;
                                aVar5.f29427g++;
                            } else {
                                aVar5.f29428h = 300000;
                                aVar5.f29427g++;
                            }
                            SDKMonitorUtils.a(aVar5.f29426f).b(aVar5.f29428h);
                        }
                        a.this.f29423c = true;
                    }
                }
                return false;
            }
        };
    }
}

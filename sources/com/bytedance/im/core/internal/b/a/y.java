package com.bytedance.im.core.internal.b.a;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.d.f;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.internal.b.a;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.b;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.utils.q;
import com.bytedance.im.core.internal.utils.s;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.InitType;
import com.bytedance.im.core.proto.MessagesPerUserInitV2RequestBody;
import com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody;
import com.bytedance.im.core.proto.RequestBody;

public final class y extends w {
    public static int o = 10;

    /* renamed from: a  reason: collision with root package name */
    public int f38643a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f38644b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f38645c;

    /* renamed from: d  reason: collision with root package name */
    public int f38646d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f38647e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f38648f = 0;

    /* renamed from: g  reason: collision with root package name */
    public long f38649g;

    /* renamed from: h  reason: collision with root package name */
    public long f38650h = 0;

    /* renamed from: i  reason: collision with root package name */
    public long f38651i = 0;

    /* renamed from: j  reason: collision with root package name */
    public long f38652j = 0;

    /* renamed from: k  reason: collision with root package name */
    public long f38653k = 0;

    /* renamed from: l  reason: collision with root package name */
    public long f38654l = 0;

    /* renamed from: m  reason: collision with root package name */
    public long f38655m = 0;
    public long n = 0;
    private long q;
    private long r = 0;
    private int s = 0;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a() {
        return true;
    }

    static {
        Covode.recordClassIndex(23060);
    }

    private void c() {
        if (!d.a().f37565e) {
            com.bytedance.im.core.internal.e.d.a(new c<Boolean>() {
                /* class com.bytedance.im.core.internal.b.a.y.AnonymousClass9 */

                static {
                    Covode.recordClassIndex(23069);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.im.core.internal.e.c
                public final /* synthetic */ Boolean a() {
                    return Boolean.valueOf(com.bytedance.im.core.internal.a.c.c());
                }
            }, (b) null);
        }
    }

    public y(int i2) {
        super(IMCMD.GET_MESSAGES_BY_USER_INIT_V2.getValue());
        this.f38643a = i2;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f.body == null || kVar.f38725f.body.messages_per_user_init_v2_body == null) {
            return false;
        }
        return true;
    }

    public final void a(long j2) {
        this.r = j2;
        long uptimeMillis = SystemClock.uptimeMillis();
        MessagesPerUserInitV2RequestBody.Builder cursor = new MessagesPerUserInitV2RequestBody.Builder().cursor(Long.valueOf(j2));
        d.a();
        MessagesPerUserInitV2RequestBody.Builder new_user = cursor.new_user(0);
        if (d.a().b().aM != null) {
            new_user.init_sub_type(d.a().b().aM);
        }
        RequestBody build = new RequestBody.Builder().messages_per_user_init_v2_body(new_user.build()).build();
        com.bytedance.im.core.g.b.f38100a = true;
        a(this.f38643a, build, null, new Object[0]);
        this.f38651i += SystemClock.uptimeMillis() - uptimeMillis;
        this.q = SystemClock.uptimeMillis();
    }

    public final void a(boolean z) {
        long uptimeMillis = SystemClock.uptimeMillis();
        a.j(this.f38643a);
        c();
        j.a().a(z);
        if (this.f38644b) {
            a.a(false);
        } else if (d.a().b().N) {
            x.a().a(this.f38643a, 0);
        } else {
            q.a().a(this.f38643a);
        }
        this.f38655m += SystemClock.uptimeMillis() - uptimeMillis;
        f.a();
    }

    public final void a(final boolean z, final boolean z2) {
        if (d.a().b().aP) {
            com.bytedance.im.core.internal.e.d.a(new c<Object>() {
                /* class com.bytedance.im.core.internal.b.a.y.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(23068);
                }

                @Override // com.bytedance.im.core.internal.e.c
                public final Object a() {
                    y.this.a(z2);
                    return null;
                }
            }, (b) null);
        } else {
            a(z2);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(final k kVar, Runnable runnable) {
        boolean z;
        final boolean z2;
        final MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody = null;
        boolean z3 = false;
        if (d.a().b().ab.initConvListPullAsyncEnable != 0) {
            this.f38650h += SystemClock.uptimeMillis() - this.q;
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!kVar.l() || !a(kVar)) {
                z2 = false;
            } else {
                z2 = true;
            }
            com.bytedance.im.core.c.f.b("imsdk", "IMInitHandler handleResponse, seqId:" + kVar.f38720a + ", isSuccess:" + z2, (Throwable) null);
            if (z2) {
                messagesPerUserInitV2ResponseBody = kVar.f38725f.body.messages_per_user_init_v2_body;
            }
            if (z2) {
                if (messagesPerUserInitV2ResponseBody.init_type == InitType.TYPE_BY_USER) {
                    z3 = true;
                }
                this.f38645c = z3;
            }
            this.n += SystemClock.uptimeMillis() - uptimeMillis;
            final long uptimeMillis2 = SystemClock.uptimeMillis();
            com.bytedance.im.core.internal.e.d.a(new c<Pair<Long, Long>>() {
                /* class com.bytedance.im.core.internal.b.a.y.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(23063);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.im.core.internal.e.c
                public final /* synthetic */ Pair<Long, Long> a() {
                    if (!z2) {
                        return null;
                    }
                    return y.this.a(kVar.f38725f.inbox_type.intValue(), messagesPerUserInitV2ResponseBody, kVar.f38720a);
                }
            }, new b<Pair<Long, Long>>() {
                /* class com.bytedance.im.core.internal.b.a.y.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(23064);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.e.b
                public final /* synthetic */ void a(Pair<Long, Long> pair) {
                    Pair<Long, Long> pair2 = pair;
                    y.this.f38654l += SystemClock.uptimeMillis() - uptimeMillis2;
                    if (z2) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        y.this.f38646d++;
                        com.bytedance.im.core.c.f.b("imsdk", "IMInitHandler handleResponse onCallback, has_more:" + messagesPerUserInitV2ResponseBody.has_more + ", nextCursor:" + messagesPerUserInitV2ResponseBody.next_cursor + ", isByUser:" + y.this.f38645c + ", seqId:" + kVar.f38720a, (Throwable) null);
                        d.a();
                        ((Long) pair2.first).longValue();
                        ((Long) pair2.second).longValue();
                        s.a();
                        long j2 = 0;
                        if (s.a(y.this.f38643a) <= 0) {
                            s.a();
                            int i2 = y.this.f38643a;
                            if (messagesPerUserInitV2ResponseBody.per_user_cursor != null) {
                                j2 = messagesPerUserInitV2ResponseBody.per_user_cursor.longValue();
                            }
                            s.a(i2, j2);
                        }
                        if (!messagesPerUserInitV2ResponseBody.has_more.booleanValue() || messagesPerUserInitV2ResponseBody.next_cursor == null) {
                            s.a();
                            s.h(y.this.f38643a);
                            d.a().f37562b.a(y.this.f38643a, 2);
                            y.this.n += SystemClock.uptimeMillis() - uptimeMillis;
                            y.this.a(true, true);
                            long uptimeMillis2 = SystemClock.uptimeMillis();
                            a.a(true);
                            y.this.n += SystemClock.uptimeMillis() - uptimeMillis2;
                            com.bytedance.im.core.g.b.a(true, SystemClock.uptimeMillis() - y.this.f38649g, y.this.f38646d, y.this.f38647e, y.this.f38648f, u.a(kVar), y.this.f38650h, y.this.f38651i, y.this.f38652j, y.this.f38653k, y.this.f38654l, y.this.f38655m, y.this.n);
                        } else {
                            if (y.this.f38645c) {
                                s.a();
                                s.e(y.this.f38643a, messagesPerUserInitV2ResponseBody.next_cursor.longValue());
                            }
                            if (d.a().b().x == 1) {
                                a.a(true);
                            }
                            y.this.n += SystemClock.uptimeMillis() - uptimeMillis;
                        }
                        e.a(kVar, true).a();
                    } else {
                        d.a().f37562b.a(y.this.f38643a, 1);
                        y.this.a(true, true);
                        e.a(kVar, false).a();
                        com.bytedance.im.core.g.b.a(false, SystemClock.uptimeMillis() - y.this.f38649g, y.this.f38646d, y.this.f38647e, y.this.f38648f, u.a(kVar), y.this.f38650h, y.this.f38651i, y.this.f38652j, y.this.f38653k, y.this.f38654l, y.this.f38655m, y.this.n);
                    }
                    e.a(kVar, true).a();
                }
            }, com.bytedance.im.core.internal.e.a.c());
            if (z2 && messagesPerUserInitV2ResponseBody.has_more.booleanValue() && messagesPerUserInitV2ResponseBody.next_cursor != null) {
                a(messagesPerUserInitV2ResponseBody.next_cursor.longValue());
                return;
            }
            return;
        }
        this.f38650h += SystemClock.uptimeMillis() - this.q;
        long uptimeMillis3 = SystemClock.uptimeMillis();
        if (!kVar.l() || !a(kVar)) {
            z = false;
        } else {
            z = true;
        }
        com.bytedance.im.core.c.f.b("imsdk", "IMInitHandler handleResponse, seqId:" + kVar.f38720a + ", isSuccess:" + z, (Throwable) null);
        if (z) {
            this.f38646d++;
            final MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody2 = kVar.f38725f.body.messages_per_user_init_v2_body;
            s.a();
            long j2 = 0;
            if (s.a(this.f38643a) <= 0) {
                s.a();
                int i2 = this.f38643a;
                if (messagesPerUserInitV2ResponseBody2.per_user_cursor != null) {
                    j2 = messagesPerUserInitV2ResponseBody2.per_user_cursor.longValue();
                }
                s.a(i2, j2);
            }
            if (messagesPerUserInitV2ResponseBody2.init_type == InitType.TYPE_BY_USER) {
                z3 = true;
            }
            this.f38645c = z3;
            this.n += SystemClock.uptimeMillis() - uptimeMillis3;
            final long uptimeMillis4 = SystemClock.uptimeMillis();
            com.bytedance.im.core.internal.e.d.a(new c<Pair<Long, Long>>() {
                /* class com.bytedance.im.core.internal.b.a.y.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(23061);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.im.core.internal.e.c
                public final /* synthetic */ Pair<Long, Long> a() {
                    return y.this.a(kVar.f38725f.inbox_type.intValue(), messagesPerUserInitV2ResponseBody2, kVar.f38720a);
                }
            }, new b<Pair<Long, Long>>() {
                /* class com.bytedance.im.core.internal.b.a.y.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(23062);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.e.b
                public final /* synthetic */ void a(Pair<Long, Long> pair) {
                    Pair<Long, Long> pair2 = pair;
                    y.this.f38654l += SystemClock.uptimeMillis() - uptimeMillis4;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    com.bytedance.im.core.c.f.b("imsdk", "IMInitHandler handleResponse onCallback, has_more:" + messagesPerUserInitV2ResponseBody2.has_more + ", nextCursor:" + messagesPerUserInitV2ResponseBody2.next_cursor + ", isByUser:" + y.this.f38645c + ", seqId:" + kVar.f38720a, (Throwable) null);
                    d.a();
                    ((Long) pair2.first).longValue();
                    ((Long) pair2.second).longValue();
                    if (!messagesPerUserInitV2ResponseBody2.has_more.booleanValue() || messagesPerUserInitV2ResponseBody2.next_cursor == null) {
                        s.a();
                        s.h(y.this.f38643a);
                        d.a().f37562b.a(y.this.f38643a, 2);
                        y.this.n += SystemClock.uptimeMillis() - uptimeMillis;
                        y.this.a(true, true);
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        a.a(true);
                        y.this.n += SystemClock.uptimeMillis() - uptimeMillis2;
                        com.bytedance.im.core.g.b.a(true, SystemClock.uptimeMillis() - y.this.f38649g, y.this.f38646d, y.this.f38647e, y.this.f38648f, u.a(kVar), y.this.f38650h, y.this.f38651i, y.this.f38652j, y.this.f38653k, y.this.f38654l, y.this.f38655m, y.this.n);
                    } else {
                        if (y.this.f38645c) {
                            s.a();
                            s.e(y.this.f38643a, messagesPerUserInitV2ResponseBody2.next_cursor.longValue());
                        }
                        y.this.n += SystemClock.uptimeMillis() - uptimeMillis;
                        y.this.a(messagesPerUserInitV2ResponseBody2.next_cursor.longValue());
                        long uptimeMillis3 = SystemClock.uptimeMillis();
                        if (d.a().b().x == 1) {
                            a.a(true);
                        }
                        y.this.n += SystemClock.uptimeMillis() - uptimeMillis3;
                    }
                    e.a(kVar, true).a();
                }
            }, com.bytedance.im.core.internal.e.a.c());
        } else if (this.s >= o || kVar.f38725f.status_code.intValue() == -1000 || kVar.f38725f.body == null) {
            d.a().f37562b.a(this.f38643a, 1);
            this.n += SystemClock.uptimeMillis() - uptimeMillis3;
            a(true, true);
            e.a(kVar, false).a();
            com.bytedance.im.core.g.b.a(false, SystemClock.uptimeMillis() - this.f38649g, this.f38646d, this.f38647e, this.f38648f, u.a(kVar), this.f38650h, this.f38651i, this.f38652j, this.f38653k, this.f38654l, this.f38655m, this.n);
        } else {
            this.s++;
            a(this.r);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:17|18|(6:22|23|(1:119)(2:25|(3:27|28|120)(6:29|(7:33|(1:39)|40|(1:42)|43|(1:51)|52)|53|54|55|118))|56|20|19)|57|58|59|60) */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0170, code lost:
        r8 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0164 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<java.lang.Long, java.lang.Long> a(int r34, com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody r35, long r36) {
        /*
        // Method dump skipped, instructions count: 735
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.b.a.y.a(int, com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody, long):android.util.Pair");
    }
}

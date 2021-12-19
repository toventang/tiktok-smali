package com.ss.android.ugc.aweme.discover.j;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.discover.a.ac;
import com.ss.android.ugc.aweme.discover.api.SearchSugApi;
import com.ss.android.ugc.aweme.discover.j.c;
import com.ss.android.ugc.aweme.discover.model.SearchSugResponse;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.utils.in;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

public final class p extends c<b<SearchSugResponse>, c.a> {

    /* renamed from: b  reason: collision with root package name */
    public static Long f81288b = 0L;

    /* renamed from: g  reason: collision with root package name */
    public static final int f81289g = ac.f80133a;

    /* renamed from: a  reason: collision with root package name */
    public int f81290a;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f81291c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    public long f81292d = 0;

    /* renamed from: e  reason: collision with root package name */
    public SearchSugApi.a f81293e;

    /* renamed from: f  reason: collision with root package name */
    public final Deque<a> f81294f = new LinkedList();

    /* renamed from: k  reason: collision with root package name */
    public final Runnable f81295k = new Runnable() {
        /* class com.ss.android.ugc.aweme.discover.j.p.AnonymousClass2 */

        static {
            Covode.recordClassIndex(50520);
        }

        public final void run() {
            p pVar = p.this;
            pVar.a(pVar.f81293e);
        }
    };

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f81301a;

        /* renamed from: b  reason: collision with root package name */
        q<SearchSugResponse> f81302b;

        /* renamed from: c  reason: collision with root package name */
        boolean f81303c;

        static {
            Covode.recordClassIndex(50521);
        }
    }

    static {
        Covode.recordClassIndex(50517);
    }

    public p() {
        a(new b<SearchSugResponse>() {
            /* class com.ss.android.ugc.aweme.discover.j.p.AnonymousClass1 */

            static {
                Covode.recordClassIndex(50518);
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean checkParams(Object... objArr) {
                String str;
                if (!(objArr == null || objArr.length == 0)) {
                    Object obj = objArr[0];
                    if (obj instanceof SearchSugApi.a) {
                        str = ((SearchSugApi.a) obj).f80803a;
                    } else {
                        str = "";
                    }
                    if (!TextUtils.isEmpty(str)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // com.ss.android.ugc.aweme.common.b, com.bytedance.common.utility.collection.WeakHandler.IHandler
            public final void handleMsg(Message message) {
                if (!(message.obj instanceof CancellationException)) {
                    if (message.obj instanceof SearchSugResponse) {
                        SearchSugResponse searchSugResponse = (SearchSugResponse) message.obj;
                        a aVar = searchSugResponse.requestTaskWrapper;
                        if (aVar != null && !aVar.f81303c) {
                            while (!p.this.f81294f.isEmpty()) {
                                a pollFirst = p.this.f81294f.pollFirst();
                                if (pollFirst.f81301a < aVar.f81301a) {
                                    pollFirst.f81303c = true;
                                    if (pollFirst.f81302b != null) {
                                        pollFirst.f81302b.cancel(true);
                                    }
                                } else if (pollFirst.f81301a == aVar.f81301a) {
                                    searchSugResponse.requestTaskWrapper = null;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    super.handleMsg(message);
                }
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean sendRequest(final Object... objArr) {
                if (in.d() || !super.sendRequest(objArr)) {
                    return false;
                }
                this.mIsLoading = false;
                p pVar = p.this;
                pVar.f81290a = (pVar.f81290a + 1) % 10;
                p pVar2 = p.this;
                long j2 = pVar2.f81292d + 1;
                pVar2.f81292d = j2;
                final a aVar = new a();
                aVar.f81301a = j2;
                p.this.f81294f.addLast(aVar);
                n.a().a(this.mHandler, new Callable() {
                    /* class com.ss.android.ugc.aweme.discover.j.p.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(50519);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:128:0x02a4  */
                    /* JADX WARNING: Removed duplicated region for block: B:129:0x02a9  */
                    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
                    /* JADX WARNING: Removed duplicated region for block: B:133:0x02b6  */
                    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d  */
                    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
                    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
                    @Override // java.util.concurrent.Callable
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object call() {
                        /*
                        // Method dump skipped, instructions count: 700
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.j.p.AnonymousClass1.AnonymousClass1.call():java.lang.Object");
                    }
                }, 0);
                return true;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        T t;
        if (this.f76396h != null) {
            t = this.f76396h.mData;
        } else {
            t = null;
        }
        if (this.f76397i == null) {
            return;
        }
        if (t != null) {
            ac.a.f91473a.a(t.requestId, t.logPb);
            ((c.a) this.f76397i).a(t);
            return;
        }
        ((c.a) this.f76397i).aW_();
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        if (this.f76397i != null) {
            ((c.a) this.f76397i).aW_();
        }
    }
}

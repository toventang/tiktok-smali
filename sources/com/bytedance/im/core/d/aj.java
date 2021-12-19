package com.bytedance.im.core.d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.internal.e.b;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.e.d;
import com.bytedance.im.core.internal.utils.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class aj implements t, v {

    /* renamed from: a  reason: collision with root package name */
    public String f37703a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f37704b;

    /* renamed from: c  reason: collision with root package name */
    public final int f37705c;

    /* renamed from: d  reason: collision with root package name */
    public final m f37706d;

    /* renamed from: e  reason: collision with root package name */
    public v f37707e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f37708f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f37709g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f37710h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f37711i;

    static {
        Covode.recordClassIndex(22666);
    }

    @Override // com.bytedance.im.core.d.v
    public final void a(int i2, ai aiVar) {
    }

    @Override // com.bytedance.im.core.d.v
    public final void a(int i2, ai aiVar, ay ayVar) {
    }

    @Override // com.bytedance.im.core.d.v
    public final void a(int i2, an anVar) {
    }

    @Override // com.bytedance.im.core.d.v
    public final void a(ai aiVar, Map<String, List<ag>> map, Map<String, List<ag>> map2) {
    }

    @Override // com.bytedance.im.core.d.v
    public final void a(ai aiVar, boolean z) {
    }

    @Override // com.bytedance.im.core.d.v
    public final void a(List<ai> list, int i2, ar arVar) {
    }

    @Override // com.bytedance.im.core.d.v
    public final void a(List<ai> list, Map<String, Map<String, String>> map) {
    }

    @Override // com.bytedance.im.core.d.v
    public final void a(List<ai> list, boolean z) {
        if (list != null && !list.isEmpty()) {
            this.f37706d.appendList(list);
        }
        v vVar = this.f37707e;
        if (vVar != null) {
            vVar.a(list, z);
        }
    }

    public final void a() {
        if (aa.a().a(this.f37703a)) {
            f.b("imsdk", "MessageBrowserModel loadOlderMessageList checking now", (Throwable) null);
            this.f37710h = true;
        } else if (this.f37709g) {
            f.b("imsdk", "MessageBrowserModel loadOlderMessageList querying now", (Throwable) null);
        } else {
            this.f37709g = true;
            final ArrayList arrayList = new ArrayList(this.f37706d);
            d.a(new c<List<ai>>() {
                /* class com.bytedance.im.core.d.aj.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(22669);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX WARNING: Code restructure failed: missing block: B:15:0x0073, code lost:
                    if (r1 != Long.MAX_VALUE) goto L_0x0078;
                 */
                @Override // com.bytedance.im.core.internal.e.c
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ java.util.List<com.bytedance.im.core.d.ai> a() {
                    /*
                    // Method dump skipped, instructions count: 141
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.d.aj.AnonymousClass3.a():java.lang.Object");
                }
            }, new b<List<ai>>() {
                /* class com.bytedance.im.core.d.aj.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(22670);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.e.b
                public final /* synthetic */ void a(List<ai> list) {
                    List<ai> list2 = list;
                    f.b("imsdk", "MessageBrowserModel loadOlderMessageList onCallback, result:" + list2.size(), (Throwable) null);
                    aj.this.f37709g = false;
                    aj.this.a(list2, true);
                }
            });
        }
    }

    @Override // com.bytedance.im.core.d.v
    public final void a(ai aiVar) {
        v vVar;
        if (this.f37706d.remove(aiVar) && (vVar = this.f37707e) != null) {
            vVar.a(aiVar);
        }
    }

    @Override // com.bytedance.im.core.d.t
    public final void a(String str) {
        if (TextUtils.equals(this.f37703a, str)) {
            f.b("imsdk", "MessageBrowserModel onLeakRepairEnd, mRequestLoadOlder:" + this.f37710h + ", mRequestLoadNewer" + this.f37711i, (Throwable) null);
            if (this.f37710h) {
                a();
            } else if (!this.f37711i) {
            } else {
                if (aa.a().a(this.f37703a)) {
                    f.b("imsdk", "MessageBrowserModel loadNewerMessageList checking now", (Throwable) null);
                    this.f37711i = true;
                } else if (this.f37708f || this.f37709g) {
                    f.b("imsdk", "MessageBrowserModel loadNewerMessageList uptonew or querying:" + this.f37709g, (Throwable) null);
                } else {
                    this.f37709g = true;
                    final ArrayList arrayList = new ArrayList(this.f37706d);
                    d.a(new c<List<ai>>() {
                        /* class com.bytedance.im.core.d.aj.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(22667);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX WARNING: Code restructure failed: missing block: B:21:0x008d, code lost:
                            if (r2 != Long.MAX_VALUE) goto L_0x0092;
                         */
                        @Override // com.bytedance.im.core.internal.e.c
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final /* synthetic */ java.util.List<com.bytedance.im.core.d.ai> a() {
                            /*
                            // Method dump skipped, instructions count: 206
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.d.aj.AnonymousClass1.a():java.lang.Object");
                        }
                    }, new b<List<ai>>() {
                        /* class com.bytedance.im.core.d.aj.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(22668);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.bytedance.im.core.internal.e.b
                        public final /* synthetic */ void a(List<ai> list) {
                            List<ai> list2 = list;
                            f.b("imsdk", "MessageBrowserModel loadNewerMessageList onCallback, result:" + list2.size(), (Throwable) null);
                            aj.this.f37709g = false;
                            if (!list2.isEmpty()) {
                                Collections.reverse(list2);
                                aj.this.f37706d.addList(list2);
                                aj.this.b(list2, true);
                            }
                        }
                    });
                }
            }
        }
    }

    @Override // com.bytedance.im.core.d.v
    public final void b(List<ai> list, boolean z) {
        v vVar = this.f37707e;
        if (vVar != null) {
            vVar.b(list, z);
        }
    }

    public aj(String str, int[] iArr, int i2) {
        this.f37703a = str;
        this.f37704b = iArr;
        this.f37705c = i2;
        this.f37706d = new m();
    }

    @Override // com.bytedance.im.core.d.v
    public final void a(List<ai> list, int i2, String str) {
        v vVar = this.f37707e;
        if (vVar != null) {
            vVar.a(list, i2, str);
        }
    }
}

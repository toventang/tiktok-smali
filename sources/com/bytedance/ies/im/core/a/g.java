package com.bytedance.ies.im.core.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.i;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.i.e;
import com.bytedance.im.core.i.f;
import com.bytedance.im.core.internal.e.b;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.e.d;
import h.f.b.l;
import java.util.List;

public final class g extends i {

    /* renamed from: b  reason: collision with root package name */
    public static final a f33942b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final e f33943c = new e();

    static {
        Covode.recordClassIndex(20177);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20178);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.i
    public final boolean a() {
        return this.f33943c.f38137d;
    }

    @Override // com.bytedance.ies.im.core.api.b.i
    public final void b() {
        this.f33943c.f38136c = null;
        f.a().f38152b = null;
    }

    @Override // com.bytedance.ies.im.core.api.b.i
    public final void c() {
        if (this.f33943c.f38137d) {
            com.bytedance.ies.im.core.api.a.b().c("StrangerConversationModel", "refresh loading now");
            return;
        }
        e eVar = this.f33943c;
        com.bytedance.im.core.c.f.b("imsdk", "StrangerListModel refresh: " + eVar.f38137d, (Throwable) null);
        if (eVar.f38137d) {
            com.bytedance.im.core.c.f.b("imsdk", "StrangerListModel refresh loading now", (Throwable) null);
            return;
        }
        eVar.f38137d = true;
        d.a(new c<List<h>>() {
            /* class com.bytedance.im.core.i.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(22847);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.im.core.internal.e.c
            public final /* bridge */ /* synthetic */ List<h> a() {
                return com.bytedance.im.core.internal.a.c.a(f.f38150a, e.f38134a);
            }
        }, new b<List<h>>() {
            /* class com.bytedance.im.core.i.e.AnonymousClass2 */

            static {
                Covode.recordClassIndex(22848);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.internal.e.b
            public final /* synthetic */ void a(List<h> list) {
                Integer valueOf;
                List<h> list2 = list;
                e eVar = e.this;
                StringBuilder sb = new StringBuilder("StrangerListModel onQueryConversation:");
                if (list2 == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(list2.size());
                }
                com.bytedance.im.core.c.f.b("imsdk", sb.append(valueOf).append(", ").append(eVar.f38138e).append(", ").append(eVar.f38135b.size()).toString(), (Throwable) null);
                if (eVar.f38138e || !eVar.f38135b.isEmpty()) {
                    com.bytedance.im.core.c.f.b("imsdk", "StrangerListModel onQueryConversation: already refreshed", (Throwable) null);
                    return;
                }
                eVar.f38135b.clear();
                eVar.a(list2);
                if (eVar.f38136c != null) {
                    eVar.f38136c.a(list2);
                }
            }
        });
        new com.bytedance.im.core.i.a.a(new com.bytedance.im.core.a.a.a<List<h>>() {
            /* class com.bytedance.im.core.i.e.AnonymousClass3 */

            static {
                Covode.recordClassIndex(22849);
            }

            @Override // com.bytedance.im.core.a.a.b
            public final void a(u uVar) {
                com.bytedance.im.core.c.f.b("imsdk", "StrangerListModel refresh onFailure", (Throwable) null);
                e.this.f38138e = true;
                e.this.f38137d = false;
                e eVar = e.this;
                com.bytedance.im.core.c.f.b("imsdk", "StrangerListModel onRefreshFailed", (Throwable) null);
                if (eVar.f38136c != null) {
                    eVar.f38136c.a(uVar);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, long, boolean] */
            @Override // com.bytedance.im.core.a.a.a
            public final /* synthetic */ void a(List<h> list, long j2, boolean z) {
                com.bytedance.im.core.c.f.b("imsdk", "StrangerListModel refresh onSuccess, nextCursor:" + j2 + ", hasMore:" + z, (Throwable) null);
                e.this.f38140g = j2;
                e.this.f38139f = z;
                e.this.f38137d = false;
                d.a(new c<List<h>>() {
                    /* class com.bytedance.im.core.i.e.AnonymousClass3.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(22850);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // com.bytedance.im.core.internal.e.c
                    public final /* bridge */ /* synthetic */ List<h> a() {
                        return com.bytedance.im.core.internal.a.c.a(f.f38150a, e.f38134a);
                    }
                }, new b<List<h>>() {
                    /* class com.bytedance.im.core.i.e.AnonymousClass3.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(22851);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.bytedance.im.core.internal.e.b
                    public final /* synthetic */ void a(List<h> list) {
                        Integer valueOf;
                        List<h> list2 = list;
                        e eVar = e.this;
                        StringBuilder sb = new StringBuilder("StrangerListModel onRefreshConversation:");
                        if (list2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Integer.valueOf(list2.size());
                        }
                        com.bytedance.im.core.c.f.b("imsdk", sb.append(valueOf).toString(), (Throwable) null);
                        eVar.f38135b.clear();
                        eVar.a(list2);
                        if (eVar.f38136c != null) {
                            eVar.f38136c.a(list2, eVar.f38139f);
                        }
                        e.this.f38138e = true;
                    }
                });
            }
        }).a(f.f38150a, 0L, (long) e.f38134a, false);
    }

    @Override // com.bytedance.ies.im.core.api.b.i
    public final void d() {
        if (this.f33943c.f38137d) {
            com.bytedance.ies.im.core.api.a.b().c("StrangerConversationModel", "loadMore loading now");
            return;
        }
        e eVar = this.f33943c;
        com.bytedance.im.core.c.f.b("imsdk", "StrangerListModel loadMore, mFirstPageFetched:" + eVar.f38138e + ", mHasMore:" + eVar.f38139f, (Throwable) null);
        if (!eVar.f38138e) {
            com.bytedance.im.core.c.f.b("imsdk", "StrangerListModel loadMore un refresh", (Throwable) null);
        } else if (eVar.f38137d) {
            com.bytedance.im.core.c.f.b("imsdk", "StrangerListModel loadMore loading now", (Throwable) null);
        } else {
            eVar.f38137d = true;
            if (!eVar.f38139f) {
                eVar.a();
            } else {
                new com.bytedance.im.core.i.a.a(new com.bytedance.im.core.a.a.a<List<h>>() {
                    /* class com.bytedance.im.core.i.e.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(22852);
                    }

                    @Override // com.bytedance.im.core.a.a.b
                    public final void a(u uVar) {
                        com.bytedance.im.core.c.f.b("imsdk", "StrangerListModel loadMore onFailure", (Throwable) null);
                        e.this.a();
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, long, boolean] */
                    @Override // com.bytedance.im.core.a.a.a
                    public final /* synthetic */ void a(List<h> list, long j2, boolean z) {
                        com.bytedance.im.core.c.f.b("imsdk", "StrangerListModel loadMore onSuccess, nextCursor:" + j2 + ", hasMore:" + z, (Throwable) null);
                        e.this.f38140g = j2;
                        e.this.f38139f = z;
                        e.this.a();
                    }
                }).a(f.f38150a, eVar.f38140g, (long) e.f38134a, false);
            }
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.i
    public final void a(com.bytedance.im.core.i.c cVar) {
        l.d(cVar, "");
        e eVar = this.f33943c;
        eVar.f38136c = cVar;
        f.a().f38152b = eVar;
    }
}

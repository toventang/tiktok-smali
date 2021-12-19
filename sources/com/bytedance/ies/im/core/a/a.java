package com.bytedance.ies.im.core.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.g.c;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.b.b;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.internal.b.a.i;
import com.bytedance.im.core.internal.b.a.x;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.d;
import com.bytedance.im.core.proto.SortType;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class a extends com.bytedance.ies.im.core.api.b.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f33921b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(20161);
    }

    @Override // com.bytedance.ies.im.core.api.b.a
    public final List<h> a() {
        j a2 = j.a();
        l.b(a2, "");
        return n.k(a2.c().values());
    }

    @Override // com.bytedance.ies.im.core.api.b.a
    public final h a(String str) {
        if (str == null) {
            return null;
        }
        return j.a().a(str);
    }

    @Override // com.bytedance.ies.im.core.api.b.a
    public final void c(String str) {
        l.d(str, "");
        j.a();
        j.b(str);
    }

    @Override // com.bytedance.ies.im.core.api.b.a
    public final boolean d(String str) {
        l.d(str, "");
        if (str != null) {
            return c.b().a(str);
        }
        return false;
    }

    @Override // com.bytedance.ies.im.core.api.b.a
    public final h b(String str) {
        j a2 = j.a();
        f.b("imsdk", "ConversationListModel getConversation async", (Throwable) null);
        h a3 = a2.a(str);
        if (a3 == null && (a3 = com.bytedance.im.core.internal.a.c.a(str, true)) != null) {
            if (a3.isStranger()) {
                com.bytedance.im.core.i.f.a().b(a3);
            } else if (!b.b() || !b.a().b(a3)) {
                a2.a(a3);
            }
        }
        return a3;
    }

    @Override // com.bytedance.ies.im.core.api.b.a
    public final void a(com.bytedance.ies.im.core.api.b.a.a aVar) {
        l.d(aVar, "");
        j.a().a(aVar);
    }

    @Override // com.bytedance.ies.im.core.api.b.a
    public final void b(com.bytedance.ies.im.core.api.b.a.a aVar) {
        l.d(aVar, "");
        j a2 = j.a();
        if (aVar != null) {
            f.b("imsdk", "ConversationListModel removeObserver:".concat(String.valueOf(aVar)), (Throwable) null);
            a2.f37963e.remove(aVar);
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.a
    public final void a(List<String> list) {
        l.d(list, "");
        j a2 = j.a();
        if (!(a2.f37959a.isEmpty() || list == null || list.isEmpty())) {
            for (String str : list) {
                h hVar = a2.f37959a.get(str);
                f.b("imsdk", "updateConversationListInfo - ".concat(String.valueOf(str)), (Throwable) null);
                if (hVar != null) {
                    com.bytedance.im.core.internal.b.a.a(hVar.getInboxType(), str, hVar.getConversationShortId(), hVar.getConversationType(), hVar.getUpdatedTime());
                }
            }
            com.bytedance.im.core.internal.b.a.a(false);
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.a
    public final void c(String str, com.bytedance.im.core.a.a.b<String> bVar) {
        l.d(str, "");
        j.a();
        x.a();
        if (TextUtils.isEmpty(str)) {
            f.b("imsdk", "DeleteConversationHandler delete, cid invalid", (Throwable) null);
        } else {
            j.a().b(str, new com.bytedance.im.core.a.a.b<h>(bVar, str) {
                /* class com.bytedance.im.core.internal.b.a.j.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ com.bytedance.im.core.a.a.b f38489a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f38490b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ boolean f38491c = false;

                static {
                    Covode.recordClassIndex(23014);
                }

                @Override // com.bytedance.im.core.a.a.b
                public final void a(u uVar) {
                    f.b("imsdk", "DeleteConversationHandler delete, getConversation failed, error:".concat(String.valueOf(uVar)), (Throwable) null);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.a.a.b
                public final /* synthetic */ void a(h hVar) {
                    String str;
                    boolean z;
                    h hVar2 = hVar;
                    StringBuilder sb = new StringBuilder("DeleteConversationHandler delete, getConversation result:");
                    if (hVar2 != null) {
                        str = hVar2.getConversationId();
                    } else {
                        str = null;
                    }
                    f.b("imsdk", sb.append(str).toString(), (Throwable) null);
                    if (hVar2 == null || !hVar2.isStranger()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    j jVar = new j(z, this.f38489a);
                    String str2 = this.f38490b;
                    boolean z2 = this.f38491c;
                    f.b("imsdk", "DeleteConversationHandler delete, cid:" + str2 + ", isLocal:" + z2 + ", isStranger:" + jVar.f38483a, (Throwable) null);
                    h a2 = com.bytedance.im.core.d.j.a().a(str2);
                    if (a2 == null) {
                        jVar.b(k.a(-1017));
                    } else if (!jVar.f38483a) {
                        jVar.a(a2);
                        if (!z2 && !a2.isTemp()) {
                            jVar.b(a2);
                        }
                    } else if (!z2) {
                        jVar.b(a2);
                    } else {
                        jVar.a(a2);
                    }
                }

                {
                    this.f38489a = r2;
                    this.f38490b = r3;
                }
            });
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.a
    public final void b(String str, com.bytedance.im.core.a.a.b<h> bVar) {
        l.d(str, "");
        long a2 = com.bytedance.ies.im.core.api.e.a.a(str, bVar);
        if (a2 > 0) {
            j a3 = j.a();
            String a4 = com.bytedance.im.core.d.k.a(a2);
            if (a3.a(a4) == null) {
                h hVar = new h();
                hVar.setInboxType(0);
                hVar.setConversationId(a4);
                hVar.setConversationType(e.a.f37581a);
                hVar.setUpdatedTime(System.currentTimeMillis());
                hVar.setMemberCount(2);
                hVar.setIsMember(true);
                a3.c(hVar);
                d.a(new com.bytedance.im.core.internal.e.c<h>(hVar) {
                    /* class com.bytedance.im.core.d.j.AnonymousClass4 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ h f37982a;

                    static {
                        Covode.recordClassIndex(22775);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // com.bytedance.im.core.internal.e.c
                    public final /* bridge */ /* synthetic */ h a() {
                        com.bytedance.im.core.internal.a.c.a(this.f37982a);
                        return null;
                    }

                    {
                        this.f37982a = r2;
                    }
                }, (com.bytedance.im.core.internal.e.b) null);
            }
            x.a();
            i iVar = new i(bVar);
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(com.bytedance.im.core.a.d.a().f37562b.a()));
            arrayList.add(Long.valueOf(a2));
            iVar.a(0, e.a.f37581a, arrayList, (Map<String, String>) null);
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.a
    public final void a(String str, com.bytedance.im.core.a.a.b<h> bVar) {
        if (str == null || str.length() == 0) {
            bVar.a((h) null);
        } else {
            j.a().b(str, bVar);
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.a
    public final void a(List<String> list, Map<String, String> map, com.bytedance.im.core.a.a.c<h> cVar) {
        l.d(list, "");
        l.d(map, "");
        List<Long> a2 = com.bytedance.ies.im.core.api.e.a.a(list);
        if (!a2.isEmpty()) {
            j.a();
            x.a();
            i iVar = new i(cVar);
            if (!a2.isEmpty()) {
                if (!a2.contains(Long.valueOf(com.bytedance.im.core.a.d.a().f37562b.a()))) {
                    a2.add(0, Long.valueOf(com.bytedance.im.core.a.d.a().f37562b.a()));
                }
                iVar.a(1, e.a.f37582b, a2, map);
            }
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.a
    public final void a(long j2, SortType sortType, Boolean bool, com.bytedance.im.core.a.a.a<List<h>> aVar) {
        j.a().a(j2, sortType, bool, aVar);
    }

    @Override // com.bytedance.ies.im.core.api.b.a
    public final void a(String str, long j2, int i2, com.bytedance.im.core.a.a.b<h> bVar) {
        x.a();
        x.a(1, str, j2, i2, bVar);
    }
}

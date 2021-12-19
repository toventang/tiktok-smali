package com.ss.android.ugc.aweme.im.sdk.group.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.proto.SortType;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.j;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.services.BaseUserService;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final h f102645a = i.a((h.f.a.a) b.f102647a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f102646b = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(65725);
        }

        public static e a() {
            return (e) e.f102645a.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private e() {
    }

    static final class b extends m implements h.f.a.a<e> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f102647a = new b();

        static {
            Covode.recordClassIndex(65726);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            return new e((byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(65724);
    }

    public /* synthetic */ e(byte b2) {
        this();
    }

    public static String a(com.bytedance.im.core.d.h hVar) {
        com.bytedance.im.core.d.i coreInfo;
        if (hVar == null || (coreInfo = hVar.getCoreInfo()) == null) {
            return null;
        }
        return coreInfo.getIcon();
    }

    public static final class c implements com.bytedance.im.core.a.a.c<com.bytedance.im.core.d.h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f102648a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f102649b;

        static {
            Covode.recordClassIndex(65727);
        }

        @Override // com.bytedance.im.core.a.a.b
        public final /* synthetic */ void a(Object obj) {
            String str;
            com.bytedance.im.core.d.h hVar = (com.bytedance.im.core.d.h) obj;
            StringBuilder sb = new StringBuilder("onSuccess, ");
            if (hVar != null) {
                str = hVar.toString();
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.im.service.m.a.c("Creating group chat", sb.append(str).toString());
            h.f.a.b bVar = this.f102648a;
            if (bVar != null) {
                bVar.invoke(hVar);
            }
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a(0, hVar, "group", this.f102649b);
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(u uVar) {
            String str;
            int i2;
            String str2;
            com.ss.android.ugc.aweme.im.sdk.group.b.b.a aVar;
            Integer statusCode;
            StringBuilder sb = new StringBuilder("onFailure, ");
            if (uVar != null) {
                str = uVar.toString();
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.im.service.m.a.c("Creating group chat", sb.append(str).toString());
            com.ss.android.ugc.aweme.im.sdk.group.a.a.b.a(d.a(), uVar);
            h.f.a.b bVar = this.f102648a;
            if (bVar != null) {
                bVar.invoke(null);
            }
            if (uVar == null || (str2 = uVar.f38027e) == null || (aVar = (com.ss.android.ugc.aweme.im.sdk.group.b.b.a) j.a(str2, com.ss.android.ugc.aweme.im.sdk.group.b.b.a.class)) == null || (statusCode = aVar.getStatusCode()) == null) {
                i2 = -1;
            } else {
                i2 = statusCode.intValue();
            }
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a(i2, null, "group", this.f102649b);
        }

        c(h.f.a.b bVar, List list) {
            this.f102648a = bVar;
            this.f102649b = list;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.im.core.d.u] */
        @Override // com.bytedance.im.core.a.a.c
        public final /* synthetic */ void a(com.bytedance.im.core.d.h hVar, u uVar) {
            String str;
            String str2;
            com.ss.android.ugc.aweme.im.sdk.group.b.b.a aVar;
            int i2;
            Integer statusCode;
            String str3;
            Integer statusCode2;
            com.bytedance.im.core.d.h hVar2 = hVar;
            StringBuilder sb = new StringBuilder("onSuccessWithInfo, ");
            if (hVar2 != null) {
                str = hVar2.toString();
            } else {
                str = null;
            }
            StringBuilder append = sb.append(str).append('\n');
            if (uVar != null) {
                str2 = uVar.toString();
            } else {
                str2 = null;
            }
            com.ss.android.ugc.aweme.im.service.m.a.c("Creating group chat", append.append(str2).toString());
            if (uVar == null || (str3 = uVar.f38027e) == null) {
                aVar = null;
            } else {
                aVar = (com.ss.android.ugc.aweme.im.sdk.group.b.b.a) j.a(str3, com.ss.android.ugc.aweme.im.sdk.group.b.b.a.class);
                if (aVar != null) {
                    String statusMsg = aVar.getStatusMsg();
                    if (statusMsg != null && statusMsg.length() > 0) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(statusMsg).a();
                    }
                    if (!(aVar == null || (statusCode2 = aVar.getStatusCode()) == null || statusCode2.intValue() != 0)) {
                        h.f.a.b bVar = this.f102648a;
                        if (bVar != null) {
                            bVar.invoke(hVar2);
                        }
                        if (aVar != null || (statusCode = aVar.getStatusCode()) == null) {
                            i2 = -1;
                        } else {
                            i2 = statusCode.intValue();
                        }
                        com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a(i2, hVar2, "group", this.f102649b);
                    }
                }
            }
            h.f.a.b bVar2 = this.f102648a;
            if (bVar2 != null) {
                bVar2.invoke(null);
            }
            if (aVar != null) {
            }
            i2 = -1;
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a(i2, hVar2, "group", this.f102649b);
        }
    }

    public static List<IMUser> a(List<? extends IMUser> list) {
        List arrayList;
        if (list != null) {
            arrayList = n.g((Collection) list);
        } else {
            arrayList = new ArrayList();
        }
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin != null) {
            String currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID();
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (l.a((Object) next.getUid(), (Object) currentUserID)) {
                        if (next != null) {
                            arrayList.remove(next);
                            arrayList.add(0, next);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static UrlModel b(com.bytedance.im.core.d.h hVar) {
        String a2;
        if (hVar == null || (a2 = a(hVar)) == null || a2.length() == 0) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(n.c(a2));
        return urlModel;
    }

    public static void a(long j2, com.bytedance.im.core.a.a.a<List<com.bytedance.im.core.d.h>> aVar) {
        l.d(aVar, "");
        a.C0745a.a().a(j2, SortType.GROUP_NAME, (Boolean) false, aVar);
    }

    public static void a(List<String> list, h.f.a.b<? super com.bytedance.im.core.d.h, z> bVar) {
        l.d(list, "");
        com.bytedance.ies.im.core.api.b.a a2 = a.C0745a.a();
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("source_app_id", d.n);
        jSONObject.put("source_type", 6);
        String jSONObject2 = jSONObject.toString();
        l.b(jSONObject2, "");
        hashMap.put("create", jSONObject2);
        hashMap.put("group_create_type", "0");
        a2.a(list, hashMap, new c(bVar, list));
    }
}

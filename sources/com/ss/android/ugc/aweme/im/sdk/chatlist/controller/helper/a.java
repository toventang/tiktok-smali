package com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper;

import android.text.TextUtils;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.im.core.d.ag;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.an;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.u;
import com.bytedance.keva.Keva;
import com.google.gson.f;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.g;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.DmViewModel;
import com.ss.android.ugc.aweme.im.sdk.notification.a.e;
import com.ss.android.ugc.aweme.im.sdk.notification.a.l;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final C2536a f101896a = new C2536a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Keva f101897b = Keva.getRepo("message_repo_key" + com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b());

    static {
        Covode.recordClassIndex(65200);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.d
    public final boolean a(boolean z) {
        return z;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.a$a  reason: collision with other inner class name */
    public static final class C2536a {
        static {
            Covode.recordClassIndex(65201);
        }

        private C2536a() {
        }

        public /* synthetic */ C2536a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.d
    public final void a() {
        this.f101897b.storeBoolean("guide_text", false);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.d
    public final boolean b() {
        return this.f101897b.getBoolean("guide_text", true);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.d
    public final void a(an anVar) {
        l.d(anVar, "");
        l.d(anVar, "");
    }

    public static final class c implements com.bytedance.im.core.a.a.b<h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f101900a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.notification.a.b f101901b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ai f101902c;

        static {
            Covode.recordClassIndex(65203);
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(u uVar) {
            Integer num;
            StringBuilder sb = new StringBuilder("saveLastProperty get Conversation onFailure: error={");
            String str = null;
            if (uVar != null) {
                num = Integer.valueOf(uVar.f38023a);
            } else {
                num = null;
            }
            StringBuilder append = sb.append(num).append(", ");
            if (uVar != null) {
                str = uVar.f38025c;
            }
            com.ss.android.ugc.aweme.im.service.m.a.b("DmHelper", append.append(str).append('}').toString());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* synthetic */ void a(h hVar) {
            Long l2;
            String str;
            String str2;
            t<String> a2;
            String str3;
            h hVar2 = hVar;
            if (hVar2 != null) {
                List a3 = n.a((Iterable) this.f101901b.f102834a, (Comparator) new C2537a());
                if ((!a3.isEmpty()) && a3 != null) {
                    ai aiVar = this.f101902c;
                    Map<String, String> localExt = hVar2.getLocalExt();
                    if (localExt == null) {
                        localExt = new LinkedHashMap<>();
                    }
                    com.ss.android.ugc.aweme.im.sdk.notification.a.n nVar = (com.ss.android.ugc.aweme.im.sdk.notification.a.n) n.i(a3);
                    com.ss.android.ugc.aweme.im.sdk.chatlist.b.a c2 = c.c(hVar2);
                    int i2 = b.f101903a[nVar.f102885b.ordinal()];
                    if (i2 == 1) {
                        ag agVar = nVar.f102884a.f102882a;
                        Long l3 = agVar.create_time;
                        if (c2 != null) {
                            l2 = c2.getCreate_at();
                        } else {
                            l2 = null;
                        }
                        if (!(!l.a(l3, l2))) {
                            String valueOf = String.valueOf(agVar.uid.longValue());
                            if (c2 != null) {
                                str2 = c2.getSender_uid();
                            } else {
                                str2 = null;
                            }
                            if (!(true ^ l.a((Object) valueOf, (Object) str2))) {
                                return;
                            }
                        }
                        f fVar = c.f101904a;
                        String str4 = agVar.key;
                        String str5 = agVar.idempotent_id;
                        Long l4 = agVar.create_time;
                        String str6 = agVar.value;
                        Long l5 = agVar.uid;
                        if (l5 != null) {
                            str = String.valueOf(l5.longValue());
                        } else {
                            str = null;
                        }
                        String b2 = fVar.b(new com.ss.android.ugc.aweme.im.sdk.chatlist.b.a(str4, str5, l4, str6, str, agVar.sec_uid, agVar.msgUuid, aiVar, 0));
                        com.ss.android.ugc.aweme.im.service.m.a.b("DmHelper", "saveLastProperty called ,add " + aiVar.getUuid());
                        localExt.put("a:s_latest_message_property", b2);
                    } else if (i2 == 2) {
                        if (c2 != null) {
                            str3 = c2.getIdempotent_id();
                        } else {
                            str3 = null;
                        }
                        if (TextUtils.equals(str3, nVar.f102884a.f102882a.idempotent_id)) {
                            com.ss.android.ugc.aweme.im.service.m.a.b("DmHelper", "saveLastProperty called ,remove " + aiVar.getUuid());
                            localExt.remove("a:s_latest_message_property");
                        } else {
                            com.ss.android.ugc.aweme.im.service.m.a.b("DmHelper", "saveLastProperty called ,not remove " + aiVar.getUuid());
                        }
                    }
                    hVar2.setLocalExt(localExt);
                    String conversationId = hVar2.getConversationId();
                    l.b(conversationId, "");
                    b.a.a(conversationId).b(localExt, (com.bytedance.im.core.a.a.b<h>) null);
                    DmViewModel a4 = DmViewModel.a.a(com.bytedance.ies.ugc.appcontext.f.j());
                    if (a4 != null && (a2 = a4.a()) != null) {
                        a2.setValue(conversationId);
                    }
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.a$c$a  reason: collision with other inner class name */
        public static final class C2537a<T> implements Comparator {
            static {
                Covode.recordClassIndex(65204);
            }

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return h.b.a.a(t.f102884a.f102882a.create_time, t2.f102884a.f102882a.create_time);
            }
        }

        c(a aVar, com.ss.android.ugc.aweme.im.sdk.notification.a.b bVar, ai aiVar) {
            this.f101900a = aVar;
            this.f101901b = bVar;
            this.f101902c = aiVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.d
    public final String a(h hVar) {
        String str;
        if (!c.a(hVar)) {
            return null;
        }
        String str2 = "";
        if (hVar != null && hVar.isGroupChat()) {
            StringBuilder sb = new StringBuilder();
            com.ss.android.ugc.aweme.im.sdk.chatlist.b.a c2 = c.c(hVar);
            if (!(c2 == null || c2.getIdempotent_id() == null)) {
                com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.b bVar = com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.b.AT_MOST_DB;
                String conversationId = hVar.getConversationId();
                String idempotent_id = c2.getIdempotent_id();
                if (idempotent_id == null) {
                    idempotent_id = str2;
                }
                com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a a2 = com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.a.a(bVar, new com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.c(conversationId, idempotent_id, c2.getSender_sec_uid()), new b(hVar, null));
                if (a2 == null || (str = a2.getDisplayName()) == null) {
                    str = str2;
                }
                str2 = str;
            }
            str2 = sb.append(str2).append(' ').toString();
        }
        return str2 + d.a().getResources().getString(R.string.cw5);
    }

    public static final class b implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f101898a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f101899b = null;

        static {
            Covode.recordClassIndex(65202);
        }

        b(h hVar, h.f.a.b bVar) {
            this.f101898a = hVar;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.g
        public final void a(com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.f fVar) {
            String str = "";
            l.d(aVar, str);
            l.d(fVar, str);
            h.f.a.b bVar = this.f101899b;
            if (bVar != null) {
                String conversationId = this.f101898a.getConversationId();
                if (conversationId != null) {
                    str = conversationId;
                }
                bVar.invoke(str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.d
    public final void a(ai aiVar, Map<String, ? extends List<? extends ag>> map, Map<String, ? extends List<? extends ag>> map2) {
        com.ss.android.ugc.aweme.im.sdk.notification.a.b a2;
        List<com.ss.android.ugc.aweme.im.sdk.notification.a.n> list;
        if (aiVar != null && TextUtils.equals(com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b().toString(), String.valueOf(aiVar.getSender())) && (a2 = l.a.a(map2, map)) != null && (list = a2.f102834a) != null && !list.isEmpty()) {
            a.C0745a.a().a(aiVar.getConversationId(), new e.d(e.f102841b, a2, aiVar));
            a.C0745a.a().a(aiVar.getConversationId(), new c(this, a2, aiVar));
        }
    }
}

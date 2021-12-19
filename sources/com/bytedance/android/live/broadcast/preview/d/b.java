package com.bytedance.android.live.broadcast.preview.d;

import android.content.Context;
import com.bytedance.android.live.broadcast.api.d;
import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.chatroom.api.BroadcastSubscribeApi;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import h.f.b.l;
import h.z;

public final class b implements d, com.bytedance.ies.xbridge.e.d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f8194c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f8195a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f8196b;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8197d;

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f8199a = new c();

        static {
            Covode.recordClassIndex(4160);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(4157);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4158);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public b() {
        b();
        com.bytedance.ies.xbridge.e.b.a("anchor_subscribe_finished_guide", this);
        com.bytedance.ies.xbridge.e.b.a("anchor_subscribe_emotes_status_change", this);
        com.bytedance.ies.xbridge.e.b.a("anchor_subscribe_badge_status_change", this);
    }

    @Override // com.bytedance.android.live.broadcast.api.d
    public final void a() {
        com.bytedance.ies.xbridge.e.b.b("anchor_subscribe_finished_guide", this);
        com.bytedance.ies.xbridge.e.b.b("anchor_subscribe_emotes_status_change", this);
        com.bytedance.ies.xbridge.e.b.b("anchor_subscribe_badge_status_change", this);
    }

    private final void b() {
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        l.b(b2, "");
        com.bytedance.android.live.base.model.user.b a2 = b2.a();
        l.b(a2, "");
        String secUid = a2.getSecUid();
        l.b(secUid, "");
        ((BroadcastSubscribeApi) e.a().a(BroadcastSubscribeApi.class)).getSubscribeInfo(true, secUid).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new C0124b(this), c.f8199a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.preview.d.b$b  reason: collision with other inner class name */
    public static final class C0124b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f8198a;

        static {
            Covode.recordClassIndex(4159);
        }

        C0124b(b bVar) {
            this.f8198a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            this.f8198a.f8196b = Boolean.valueOf(((com.bytedance.android.livesdk.chatroom.api.f) dVar.data).f14937d);
            b bVar = this.f8198a;
            if (((com.bytedance.android.livesdk.chatroom.api.f) dVar.data).f14935b.f14938a != 0) {
                z = true;
            } else {
                z = false;
            }
            bVar.f8195a = z;
        }
    }

    @Override // com.bytedance.ies.xbridge.e.d
    public final void a(com.bytedance.ies.xbridge.e.c cVar) {
        l.d(cVar, "");
        String str = cVar.f35926a;
        int hashCode = str.hashCode();
        if (hashCode != -1809547272) {
            if (hashCode != 1836714626) {
                if (hashCode == 2137959118 && str.equals("anchor_subscribe_finished_guide")) {
                    com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.bD;
                    l.b(bVar, "");
                    com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) true);
                }
            } else if (str.equals("anchor_subscribe_badge_status_change")) {
                this.f8195a = true;
            }
        } else if (str.equals("anchor_subscribe_emotes_status_change")) {
            this.f8197d = true;
        }
    }

    private static void a(Context context, String str, boolean z) {
        c.a(context, str, "preview_broadcast_page", z);
    }

    @Override // com.bytedance.android.live.broadcast.api.d
    public final void a(Context context, boolean z, h.f.a.a<z> aVar) {
        String anchor_user_guide_page;
        String anchor_emotes_setting_page;
        String anchor_badge_setting_page;
        l.d(context, "");
        l.d(aVar, "");
        Boolean bool = this.f8196b;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (this.f8197d || booleanValue) {
                aVar.invoke();
                return;
            }
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.bD;
            l.b(bVar, "");
            Boolean a2 = bVar.a();
            l.b(a2, "");
            if (!a2.booleanValue()) {
                if (z) {
                    anchor_user_guide_page = LiveSubscribeLynxUrl.INSTANCE.getValue().getAnchor_user_guide_popup();
                } else {
                    anchor_user_guide_page = LiveSubscribeLynxUrl.INSTANCE.getValue().getAnchor_user_guide_page();
                }
                a(context, anchor_user_guide_page, z);
            } else if (!this.f8195a) {
                if (z) {
                    anchor_badge_setting_page = LiveSubscribeLynxUrl.INSTANCE.getValue().getAnchor_badge_setting_popup_android();
                } else {
                    anchor_badge_setting_page = LiveSubscribeLynxUrl.INSTANCE.getValue().getAnchor_badge_setting_page();
                }
                a(context, anchor_badge_setting_page, z);
            } else {
                if (z) {
                    anchor_emotes_setting_page = LiveSubscribeLynxUrl.INSTANCE.getValue().getAnchor_emotes_setting_popup();
                } else {
                    anchor_emotes_setting_page = LiveSubscribeLynxUrl.INSTANCE.getValue().getAnchor_emotes_setting_page();
                }
                a(context, anchor_emotes_setting_page, z);
            }
        }
    }
}

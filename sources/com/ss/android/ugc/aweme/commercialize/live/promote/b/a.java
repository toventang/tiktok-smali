package com.ss.android.ugc.aweme.commercialize.live.promote.b;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ab;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.commercialize.live.promote.api.PromoteEntryCheckApi;
import com.ss.android.ugc.aweme.commercialize.util.c;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a extends com.bytedance.android.live.slot.a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1696a f74692a = new C1696a((byte) 0);

    static {
        Covode.recordClassIndex(46054);
    }

    @Override // com.bytedance.android.live.slot.y
    public final ab<IFrameSlot, IFrameSlot.SlotViewModel, IFrameSlot.b> a(Context context, IFrameSlot.b bVar) {
        l.d(context, "");
        return null;
    }

    @Override // com.bytedance.android.live.slot.y
    public final ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b> a(Context context, IIconSlot.b bVar) {
        l.d(context, "");
        return null;
    }

    @Override // com.bytedance.android.live.slot.y
    public final List<IFrameSlot.b> b() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.y
    public final String c() {
        return "PromoteLiveBroadcastSlotProvider";
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.promote.b.a$a  reason: collision with other inner class name */
    public static final class C1696a {
        static {
            Covode.recordClassIndex(46055);
        }

        private C1696a() {
        }

        public /* synthetic */ C1696a(byte b2) {
            this();
        }
    }

    public static final class b extends com.bytedance.android.livesdkapi.depend.e.a {
        static {
            Covode.recordClassIndex(46056);
        }

        @Override // com.bytedance.android.livesdkapi.depend.e.a
        public final int a() {
            return 2131232646;
        }

        @Override // com.bytedance.android.livesdkapi.depend.e.a
        public final String b() {
            return "promote_button";
        }

        @Override // com.bytedance.android.livesdkapi.depend.e.a
        public final int c() {
            return R.string.ezn;
        }

        @Override // com.bytedance.android.livesdkapi.depend.e.a
        public final int d() {
            return 21;
        }

        b() {
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.live.promote.b.a$b$b  reason: collision with other inner class name */
        static final class C1698b<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f74695a;

            static {
                Covode.recordClassIndex(46058);
            }

            C1698b(Context context) {
                this.f74695a = context;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                String str;
                Resources resources;
                Context context = this.f74695a;
                if (context == null || (resources = context.getResources()) == null) {
                    str = null;
                } else {
                    str = resources.getString(R.string.de2);
                }
                ao.a(str);
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.e.a
        public final void a(Context context) {
            if (context != null) {
                com.ss.android.ugc.aweme.commercialize.live.promote.c.a.a(context);
            }
            ((PromoteEntryCheckApi) com.ss.android.ugc.aweme.commercialize.util.b.a.a(PromoteEntryCheckApi.class, c.f75475a)).getPromoteEntryCheck("", "during_live").a(new C1697a("during_live", context), new C1698b(context));
            r.a("Promote_live_entrance_click", new d().a("user_id", com.ss.android.ugc.aweme.commercialize.live.promote.c.a.a()).a("promote_version", com.ss.android.ugc.aweme.commercialize.live.promote.c.a.b()).a("user_account_type", com.ss.android.ugc.aweme.commercialize.live.promote.c.a.c()).a("entrance_type", "live_share").f66730a);
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.live.promote.b.a$b$a  reason: collision with other inner class name */
        static final class C1697a<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f74693a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Context f74694b;

            static {
                Covode.recordClassIndex(46057);
            }

            C1697a(String str, Context context) {
                this.f74693a = str;
                this.f74694b = context;
            }

            /* JADX WARNING: Removed duplicated region for block: B:28:0x009c  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
            /* JADX WARNING: Removed duplicated region for block: B:48:0x00b9 A[EDGE_INSN: B:48:0x00b9->B:36:0x00b9 ?: BREAK  , SYNTHETIC] */
            @Override // f.a.d.f
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ void accept(java.lang.Object r10) {
                /*
                // Method dump skipped, instructions count: 231
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.live.promote.b.a.b.C1697a.accept(java.lang.Object):void");
            }
        }
    }

    @Override // com.bytedance.android.live.slot.y
    public final List<IIconSlot.b> a() {
        return n.c(IIconSlot.b.SLOT_BROADCAST_SHARE);
    }

    @Override // com.bytedance.android.live.slot.a
    public final Map<String, Object> a(Map<String, ? extends Object> map, IIconSlot.b bVar) {
        l.d(map, "");
        l.d(bVar, "");
        HashMap hashMap = new HashMap();
        if (b.f74696a[bVar.ordinal()] == 1) {
            Object obj = map.get("param_broadcast_room_auth_promote_bool");
            if (!(obj instanceof Boolean)) {
                obj = null;
            }
            if (!(!l.a(obj, (Object) true))) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new b());
                hashMap.put("param_live_broadcast_share_sheet_list", arrayList);
                r.a("Promote_live_entrance_show", new d().a("user_id", com.ss.android.ugc.aweme.commercialize.live.promote.c.a.a()).a("promote_version", com.ss.android.ugc.aweme.commercialize.live.promote.c.a.b()).a("user_account_type", com.ss.android.ugc.aweme.commercialize.live.promote.c.a.c()).a("entrance_type", "live_share").f66730a);
            }
        }
        return hashMap;
    }
}

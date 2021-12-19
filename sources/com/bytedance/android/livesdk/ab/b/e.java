package com.bytedance.android.livesdk.ab.b;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.ab.c.c;
import com.bytedance.android.livesdk.ab.c.h;
import com.bytedance.android.livesdk.livesetting.feed.LiveForYouPageTagSetting;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import h.f.a.r;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Map;

public final class e implements b<h> {

    /* renamed from: a  reason: collision with root package name */
    private final g f13449a = new g();

    static {
        Covode.recordClassIndex(7480);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.m<String, String, z> {
        final /* synthetic */ Map $map;

        static {
            Covode.recordClassIndex(7481);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Map map) {
            super(2);
            this.$map = map;
        }

        /* renamed from: a */
        public final z invoke(String str, String str2) {
            l.d(str, "");
            if (str2 == null) {
                return null;
            }
            this.$map.put(str, str2);
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map, java.lang.Object] */
    @Override // com.bytedance.android.livesdk.ab.b.b
    public final /* synthetic */ void a(Map map, h hVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        h hVar2 = hVar;
        l.d(map, "");
        l.d(hVar2, "");
        a aVar = new a(map);
        b bVar = new b(aVar);
        com.bytedance.android.livesdk.ab.c.a aVar2 = hVar2.f13530e;
        String str8 = "1";
        if (aVar2 != null) {
            aVar.invoke("enter_method", aVar2.f13454a);
            aVar.invoke("enter_from_merge", aVar2.f13455b);
            aVar.invoke("source", aVar2.f13456c);
            Long l2 = aVar2.f13457d;
            if (l2 != null) {
                str4 = String.valueOf(l2.longValue());
            } else {
                str4 = null;
            }
            aVar.invoke("from_room_id", str4);
            aVar.invoke("video_id", aVar2.f13458e);
            aVar.invoke("superior_page_from", aVar2.f13459f);
            aVar.invoke("push_type", aVar2.f13460g);
            Integer num = aVar2.f13461h;
            if (num != null) {
                str5 = String.valueOf(num.intValue());
            } else {
                str5 = null;
            }
            aVar.invoke("instation_push_type", str5);
            aVar.invoke("top_message_type", aVar2.f13462i);
            aVar.invoke("gd_label", aVar2.f13463j);
            aVar.invoke("card_position", aVar2.f13464k);
            aVar.invoke("inner_push_type", aVar2.f13465l);
            aVar.invoke("live_reason", aVar2.f13466m);
            aVar.invoke("action_type", aVar2.n);
            aVar.invoke("search_id", aVar2.o);
            aVar.invoke("search_keyword", aVar2.p);
            aVar.invoke("search_result_id", aVar2.q);
            aVar.invoke("search_type", aVar2.r);
            aVar.invoke("list_item_id", aVar2.s);
            if (p.a(aVar2.t)) {
                str6 = str8;
            } else {
                str6 = "0";
            }
            aVar.invoke("is_video_head", str6);
            aVar.invoke("log_pb", aVar2.u);
            aVar.invoke("request_id", aVar2.v);
            aVar.invoke("is_preview", aVar2.w);
            aVar.invoke("live_window_mode", aVar2.x);
            Long l3 = aVar2.y;
            if (l3 != null) {
                str7 = String.valueOf(l3.longValue());
            } else {
                str7 = null;
            }
            aVar.invoke("small_picture_order", str7);
            aVar.invoke("is_guest_connection", aVar2.z);
            aVar.invoke("content_type", aVar2.K);
            aVar.invoke("distribution_type", aVar2.A);
            aVar.invoke("toplive_position", aVar2.B);
            aVar.invoke("magic3_source", aVar2.C);
            aVar.invoke("magic3Comptype", aVar2.D);
            aVar.invoke("magic3ActivityId", aVar2.E);
            aVar.invoke("rank_area", aVar2.H);
            aVar.invoke("explore_level", String.valueOf(aVar2.M));
            aVar.invoke("top_left_label", aVar2.N);
            aVar.invoke("bottom_left_label", aVar2.O);
            bVar.a(aVar2.f13455b, aVar2.n, aVar2.I, aVar2.J);
        }
        c cVar = hVar2.f13529d;
        if (cVar != null) {
            aVar.invoke("is_preview", cVar.f13480a);
            aVar.invoke("starlight_rank", cVar.f13481b);
            aVar.invoke("is_live_recall", cVar.f13482c);
            aVar.invoke("live_window_mode", cVar.f13483d);
            Long l4 = cVar.f13486g;
            if (l4 != null) {
                str2 = String.valueOf(l4.longValue());
            } else {
                str2 = null;
            }
            aVar.invoke("small_picture_order", str2);
            aVar.invoke("log_pb", cVar.f13484e);
            aVar.invoke("request_id", cVar.f13485f);
            Long l5 = cVar.f13487h;
            if (l5 != null) {
                str3 = String.valueOf(l5.longValue());
            } else {
                str3 = null;
            }
            aVar.invoke("room_id", str3);
            aVar.invoke("is_ecom", cVar.f13489j);
        }
        com.bytedance.android.livesdk.ab.c.m mVar = hVar2.f13531f;
        if (mVar != null) {
            aVar.invoke("room_position", String.valueOf(mVar.f13541a));
            aVar.invoke("is_from_draw_req", String.valueOf(mVar.f13542b));
        }
        aVar.invoke("event_page", hVar2.f13526a);
        g.a((Map<String, String>) map, hVar2.f13527b);
        Long l6 = hVar2.f13528c;
        if (l6 != null) {
            str = String.valueOf(l6.longValue());
        } else {
            str = null;
        }
        aVar.invoke("anchor_id", str);
        Room room = hVar2.f13527b;
        if (room != null) {
            User owner = room.getOwner();
            l.b(owner, "");
            if (!owner.isSubscribed()) {
                str8 = "0";
            }
            aVar.invoke("is_subscription", str8);
        }
    }

    static final class b extends m implements r<String, String, Long, Long, z> {
        final /* synthetic */ a $set$1;

        static {
            Covode.recordClassIndex(7482);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(4);
            this.$set$1 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.r
        public final /* bridge */ /* synthetic */ z a(String str, String str2, Long l2, Long l3) {
            a(str, str2, l2, l3);
            return z.f158842a;
        }

        public final void a(String str, String str2, Long l2, Long l3) {
            if (l.a((Object) "homepage_hot", (Object) str) && l.a((Object) "click", (Object) str2) && LiveForYouPageTagSetting.INSTANCE.getValue() > 0) {
                if (l2 != null && l2.longValue() > 0) {
                    this.$set$1.invoke("first_label", String.valueOf(l2.longValue()));
                }
                if (l3 != null && l3.longValue() > 0) {
                    this.$set$1.invoke("second_label", String.valueOf(l3.longValue()));
                }
            }
        }
    }
}

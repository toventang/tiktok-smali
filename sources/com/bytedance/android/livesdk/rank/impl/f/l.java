package com.bytedance.android.livesdk.rank.impl.f;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.m;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static int f20720a = -1;

    static {
        Covode.recordClassIndex(12254);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f20721a = new a();

        static {
            Covode.recordClassIndex(12255);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            long j2;
            long j3;
            boolean z;
            Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
            if (room != null) {
                j2 = room.getOwnerUserId();
            } else {
                j2 = -1;
            }
            f b2 = u.a().b();
            if (b2 != null) {
                j3 = b2.c();
            } else {
                j3 = -2;
            }
            if (j2 == j3) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f20723a = new c();

        static {
            Covode.recordClassIndex(12257);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            long j2;
            long j3;
            boolean z;
            Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
            if (room != null) {
                j2 = room.getOwnerUserId();
            } else {
                j2 = -1;
            }
            f b2 = u.a().b();
            if (b2 != null) {
                j3 = b2.c();
            } else {
                j3 = -2;
            }
            if (j2 == j3) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class b extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DataChannel f20722a;

        static {
            Covode.recordClassIndex(12256);
        }

        public b(DataChannel dataChannel) {
            this.f20722a = dataChannel;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            Object obj;
            String str;
            h.f.b.l.d(recyclerView, "");
            if (i2 == 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("rank_position", "active_user_rank_detail");
                DataChannel dataChannel = this.f20722a;
                if (dataChannel != null) {
                    obj = dataChannel.b(ee.class);
                } else {
                    obj = null;
                }
                if (h.f.b.l.a(obj, (Object) true)) {
                    str = "anchor";
                } else {
                    str = "user";
                }
                hashMap.put("user_type", str);
                b.a.a("livesdk_active_user_rank_left_swipe").a(this.f20722a).a((Map<String, String>) hashMap).b();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            int i4;
            h.f.b.l.d(recyclerView, "");
            if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
                RecyclerView.i layoutManager = recyclerView.getLayoutManager();
                Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                i4 = ((LinearLayoutManager) layoutManager).n();
            } else {
                i4 = -1;
            }
            if (i4 <= l.f20720a) {
                i4 = l.f20720a;
            }
            l.f20720a = i4;
        }
    }

    public static final Map<String, String> a(com.bytedance.android.livesdk.rank.api.model.a aVar) {
        h.f.b.l.d(aVar, "");
        return a(aVar, (com.bytedance.android.livesdk.rank.api.model.b) null);
    }

    public static final Map<String, String> a(com.bytedance.android.livesdk.rank.api.model.b bVar) {
        h.f.b.l.d(bVar, "");
        return a((com.bytedance.android.livesdk.rank.api.model.a) null, bVar);
    }

    public static final void a(DataChannel dataChannel, String str) {
        Object obj;
        String str2;
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("rank_position", str);
        if (dataChannel != null) {
            obj = dataChannel.b(ee.class);
        } else {
            obj = null;
        }
        if (h.f.b.l.a(obj, (Object) true)) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        linkedHashMap.put("user_type", str2);
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IGiftService.class);
        h.f.b.l.b(a2, "");
        if (((IGiftService) a2).getBoostChartInfo().f17941c) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        linkedHashMap.put("boost_card_effective", str3);
        b.a.a("livesdk_active_user_rank_show").a(dataChannel).a((Map<String, String>) linkedHashMap).b();
    }

    private static final Map<String, String> a(com.bytedance.android.livesdk.rank.api.model.a aVar, com.bytedance.android.livesdk.rank.api.model.b bVar) {
        boolean z;
        String str;
        String str2;
        String str3;
        String valueOf;
        User user;
        User user2;
        boolean z2 = false;
        if (aVar == null && bVar == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (aVar == null || bVar == null) {
                z2 = true;
            }
            if (z2) {
                a aVar2 = a.f20721a;
                String str4 = null;
                if (aVar == null || (user2 = aVar.f20590a) == null || (str = String.valueOf(user2.getId())) == null) {
                    if (bVar == null || (user = bVar.f20593a) == null) {
                        str = null;
                    } else {
                        str = String.valueOf(user.getId());
                    }
                }
                String str5 = "";
                if (str == null) {
                    str = str5;
                }
                if (aVar != null && (valueOf = String.valueOf(aVar.f20592c)) != null) {
                    str4 = valueOf;
                } else if (bVar != null) {
                    str4 = String.valueOf(bVar.f20594b);
                }
                if (str4 != null) {
                    str5 = str4;
                }
                if (aVar != null) {
                    str2 = "top_right";
                } else {
                    str2 = "active_user_rank_detail";
                }
                if (((Boolean) aVar2.invoke()).booleanValue()) {
                    str3 = "live_anchor_c_audience";
                } else {
                    str3 = "live_audience_c_audience";
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("to_user_id", str);
                linkedHashMap.put("to_user_rank", str5);
                linkedHashMap.put("click_user_position", "top_active_user_rank");
                linkedHashMap.put("rank_position", str2);
                linkedHashMap.put("request_page", str3);
                return linkedHashMap;
            }
            try {
                throw new IllegalStateException("Check failed.".toString());
            } catch (IllegalStateException unused) {
                return new HashMap();
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}

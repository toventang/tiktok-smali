package com.bytedance.android.livesdk.service.c.a;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.dialogv2.viewmodel.a;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.service.a.b;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.service.c.a.b;
import com.bytedance.android.livesdk.service.c.d.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;
import h.m.p;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

public final class e {

    /* renamed from: i  reason: collision with root package name */
    public static final e f21319i = b.f21331a;

    /* renamed from: j  reason: collision with root package name */
    public static final String f21320j = "is_anchor";

    /* renamed from: k  reason: collision with root package name */
    public static final a f21321k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f21322a;

    /* renamed from: b  reason: collision with root package name */
    public String f21323b;

    /* renamed from: c  reason: collision with root package name */
    public int f21324c;

    /* renamed from: d  reason: collision with root package name */
    public List<? extends u> f21325d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f21326e;

    /* renamed from: f  reason: collision with root package name */
    public long f21327f = com.bytedance.android.livesdk.utils.a.a.a();

    /* renamed from: g  reason: collision with root package name */
    public String f21328g;

    /* renamed from: h  reason: collision with root package name */
    public long f21329h;

    /* renamed from: l  reason: collision with root package name */
    private int f21330l;

    public static final class a {
        static {
            Covode.recordClassIndex(12575);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final e f21331a = new e();

        /* renamed from: b  reason: collision with root package name */
        public static final b f21332b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(12576);
        }
    }

    public final void a(int i2, int i3, GiftPage giftPage, boolean z, String str) {
        u uVar;
        u uVar2;
        User owner;
        u uVar3;
        l.d(giftPage, "");
        int i4 = this.f21324c;
        if (i4 != i2 || z) {
            this.f21330l = i4;
            this.f21324c = i2;
            Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
            JSONObject jSONObject = new JSONObject();
            int i5 = 1;
            int size = giftPage.gifts.size() < 9 ? giftPage.gifts.size() : (giftPage.gifts.size() <= this.f21324c * 8 || giftPage.gifts.size() >= (this.f21324c + 1) * 8) ? 8 : giftPage.gifts.size() - (this.f21324c * 8);
            for (int i6 = 0; i6 < size; i6++) {
                int i7 = (this.f21324c * 8) + i6;
                List<? extends u> list = this.f21325d;
                if ((list != null ? list.size() : 0) > i7) {
                    List<? extends u> list2 = this.f21325d;
                    jSONObject.put(String.valueOf((list2 == null || (uVar3 = (u) list2.get(i7)) == null) ? 0 : uVar3.f19761d), i6 + 1);
                }
            }
            int i8 = i2 + 1;
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("gift_pages_show").a().a("gift_dialog_request_id", com.bytedance.android.livesdk.service.a.c.f21167a).a("tab_name", giftPage.pageName).a("tab_position", i3 + 1).a("from_page", this.f21330l + 1).a("gift_seen", jSONObject.toString()).a("is_first_screen", b.a.C0448a.f21165a.f21164a ? "first_screen" : "other_screen").a("send_gift_scene", com.bytedance.android.livesdk.u.a.b().getDesc()).a("page", i8).a("page_position", i8).a("gift_enter_from", str).a("event_module", str).a(f21320j, b() ? "1" : "0");
            if (room == null || (owner = room.getOwner()) == null || !owner.isSubscribed()) {
                i5 = 0;
            }
            a2.a("is_subscription", i5).b();
            for (int i9 = 0; i9 < size; i9++) {
                int i10 = (this.f21324c * 8) + i9;
                List<? extends u> list3 = this.f21325d;
                if (i10 < (list3 != null ? list3.size() : 0)) {
                    List<? extends u> list4 = this.f21325d;
                    Integer num = null;
                    Long valueOf = (list4 == null || (uVar2 = (u) list4.get(i10)) == null) ? null : Long.valueOf(uVar2.f19761d);
                    List<? extends u> list5 = this.f21325d;
                    if (!(list5 == null || (uVar = (u) list5.get(i10)) == null)) {
                        num = Integer.valueOf(uVar.f19763f);
                    }
                    a(i9, i3, giftPage, valueOf, num);
                }
            }
        }
    }

    public final void a(int i2, int i3, GiftPage giftPage, String str) {
        User owner;
        u uVar;
        l.d(giftPage, "");
        JSONObject jSONObject = new JSONObject();
        int i4 = 1;
        int size = giftPage.gifts.size() < 9 ? giftPage.gifts.size() : (giftPage.gifts.size() <= this.f21324c * 8 || giftPage.gifts.size() >= (this.f21324c + 1) * 8) ? 8 : giftPage.gifts.size() - (this.f21324c * 8);
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = (this.f21324c * 8) + i5;
            List<? extends u> list = this.f21325d;
            if ((list != null ? list.size() : 0) > i6) {
                List<? extends u> list2 = this.f21325d;
                jSONObject.put(String.valueOf((list2 == null || (uVar = (u) list2.get(i6)) == null) ? 0 : uVar.f19761d), i5 + 1);
            }
        }
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        int i7 = i2 + 1;
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("gift_pages_show").a().a("gift_dialog_request_id", com.bytedance.android.livesdk.service.a.c.f21167a).a("tab_name", giftPage.pageName).a("tab_position", i3 + 1).a("from_page", this.f21330l + 1).a("gift_seen", jSONObject.toString()).a("is_first_screen", b.a.C0448a.f21165a.f21164a ? "first_screen" : "other_screen").a("send_gift_scene", com.bytedance.android.livesdk.u.a.b().getDesc()).a("page_position", i7).a("page", i7).a("gift_enter_from", str).a(f21320j, b() ? "1" : "0").a("event_module", str);
        if (room == null || (owner = room.getOwner()) == null || !owner.isSubscribed()) {
            i4 = 0;
        }
        a2.a("is_subscription", i4).b();
    }

    public final void a(int i2, boolean z, int i3, GiftPage giftPage, String str, Integer num) {
        u uVar;
        u uVar2;
        l.d(giftPage, "");
        this.f21328g = str;
        this.f21327f = com.bytedance.android.livesdk.utils.a.a.a();
        String a2 = a(String.valueOf(com.bytedance.android.livesdk.u.a.a() + com.bytedance.android.livesdk.utils.a.a.a()));
        if (!l.a((Object) this.f21323b, (Object) a2)) {
            this.f21323b = a2;
            this.f21324c = i2;
            this.f21330l = i2;
            this.f21326e = z;
            a.C0355a.C0356a.f17017a.f17014j = num != null ? num.intValue() : 1;
            int i4 = 8;
            if (giftPage.gifts.size() < 9) {
                i4 = giftPage.gifts.size();
            } else if (giftPage.gifts.size() <= this.f21324c * 8) {
                i4 = giftPage.gifts.size() - (this.f21324c * 8);
            }
            for (int i5 = 0; i5 < i4; i5++) {
                List<? extends u> list = this.f21325d;
                Integer num2 = null;
                Long valueOf = (list == null || (uVar2 = (u) list.get(i5)) == null) ? null : Long.valueOf(uVar2.f19761d);
                List<? extends u> list2 = this.f21325d;
                if (!(list2 == null || (uVar = (u) list2.get(i5)) == null)) {
                    num2 = Integer.valueOf(uVar.f19763f);
                }
                a(i5, i3, giftPage, valueOf, num2);
            }
        }
    }

    public final void a(long j2, boolean z, boolean z2, String str, String str2, String str3) {
        l.d(str2, "");
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (z) {
            b.C0455b.f21312a.a(j2, z, new c(j2, str3, z2));
        } else {
            b.C0455b.f21312a.a(j2, z, new d(this, j2, z2, str, str3, str2, room));
        }
    }

    public final void a() {
        this.f21322a = false;
        this.f21323b = null;
    }

    static {
        Covode.recordClassIndex(12574);
    }

    public static boolean b() {
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room == null) {
            return false;
        }
        long ownerUserId = room.getOwnerUserId();
        com.bytedance.android.livesdk.at.f b2 = com.bytedance.android.livesdk.userservice.u.a().b();
        l.b(b2, "");
        if (ownerUserId == b2.c()) {
            return true;
        }
        return false;
    }

    public final void a(List<? extends u> list) {
        if (list != null) {
            this.f21325d = list;
        }
    }

    public static final class f implements a.AbstractC0465a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f21350a;

        static {
            Covode.recordClassIndex(12580);
        }

        public f(long j2) {
            this.f21350a = j2;
        }

        @Override // com.bytedance.android.livesdk.service.c.d.a.AbstractC0465a
        public final void a(int i2) {
            b.a.a("send_prop").a().a("prop_cnt", i2).a("prop_id", this.f21350a).b();
        }
    }

    public static String a(String str) {
        MessageDigest messageDigest;
        byte[] bArr = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        if (messageDigest != null) {
            Charset charset = h.m.d.f158808a;
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = str.getBytes(charset);
            l.b(bytes, "");
            bArr = messageDigest.digest(bytes);
        }
        String a2 = com.bytedance.common.utility.d.a(bArr);
        l.b(a2, "");
        return a2;
    }

    public static void b(String str) {
        String str2;
        l.d(str, "");
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("gift_tab_click").a().a("tab_name", str).a("gift_dialog_request_id", com.bytedance.android.livesdk.service.a.c.f21167a);
        if (y.f()) {
            str2 = "portrait";
        } else {
            str2 = "landscape";
        }
        a2.a("room_orientation", str2).b();
    }

    public final int a(long j2) {
        List<? extends u> list = this.f21325d;
        if (list == null) {
            return 0;
        }
        int i2 = 0;
        for (u uVar : list) {
            i2++;
            if (uVar.f19761d == j2) {
                return i2 % 8;
            }
        }
        return 0;
    }

    static final class c implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f21333a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f21334b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f21335c;

        static {
            Covode.recordClassIndex(12577);
        }

        c(long j2, String str, boolean z) {
            this.f21333a = j2;
            this.f21334b = str;
            this.f21335c = z;
        }

        @Override // com.bytedance.android.livesdk.service.c.a.b.a
        public final void a(String str, int i2) {
            String str2;
            long j2;
            l.d(str, "");
            HashMap hashMap = new HashMap();
            u findGiftById = GiftManager.inst().findGiftById(this.f21333a);
            hashMap.put("gift_type", str);
            hashMap.put("combo_cnt", String.valueOf(i2));
            hashMap.put("gift_cnt", String.valueOf(i2));
            hashMap.put("gift_id", String.valueOf(this.f21333a));
            hashMap.put("gift_enter_from", "convenient_icon");
            String str3 = this.f21334b;
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put("show_type", str3);
            if (findGiftById == null || findGiftById.f19762e != 4) {
                if (this.f21335c) {
                    str2 = "animation_gift";
                } else {
                    str2 = "non_animation_gift";
                }
                hashMap.put("gift_value_type", str2);
            } else {
                hashMap.put("gift_value_type", "sticker_gift");
            }
            GiftManager inst = GiftManager.inst();
            if (findGiftById != null) {
                j2 = findGiftById.f19761d;
            } else {
                j2 = 0;
            }
            u findGiftById2 = inst.findGiftById(j2);
            if (findGiftById2 == null || !findGiftById2.J) {
                if (findGiftById != null) {
                    if (findGiftById.f19761d == com.bytedance.android.livesdk.firstrecharge.d.u.i()) {
                        hashMap.put("special_gift", "first_recharge_gift");
                    } else if (findGiftById.f19761d == 0) {
                        hashMap.put("special_gift", "recall_gift");
                    }
                }
                hashMap.put("special_gift", "");
            } else {
                hashMap.put("special_gift", "announcements_gift");
            }
            hashMap.put("send_gift_scene", com.bytedance.android.livesdk.u.a.b().getDesc());
            hashMap.put("request_id", com.bytedance.android.livesdk.ab.e.k());
            b.a.a("convenient_gift_click").a().a((Map<String, String>) hashMap).a("timestamp", com.bytedance.android.livesdk.utils.a.a.a()).a("gift_dialog_request_id", com.bytedance.android.livesdk.service.a.c.f21167a).b();
        }
    }

    static final class d implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f21336a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f21337b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f21338c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f21339d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f21340e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f21341f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Room f21342g;

        static {
            Covode.recordClassIndex(12578);
        }

        d(e eVar, long j2, boolean z, String str, String str2, String str3, Room room) {
            this.f21336a = eVar;
            this.f21337b = j2;
            this.f21338c = z;
            this.f21339d = str;
            this.f21340e = str2;
            this.f21341f = str3;
            this.f21342g = room;
        }

        @Override // com.bytedance.android.livesdk.service.c.a.b.a
        public final void a(String str, int i2) {
            String str2;
            long j2;
            String str3;
            Integer num;
            int i3;
            String str4;
            String str5;
            User owner;
            l.d(str, "");
            HashMap hashMap = new HashMap();
            u findGiftById = GiftManager.inst().findGiftById(this.f21337b);
            hashMap.put("gift_type", str);
            String str6 = "animation_gift";
            if (this.f21338c) {
                str2 = str6;
            } else {
                str2 = "non_animation_gift";
            }
            hashMap.put("gift_value_type", str2);
            hashMap.put("combo_cnt", String.valueOf(i2));
            hashMap.put("gift_cnt", String.valueOf(i2));
            hashMap.put("gift_id", String.valueOf(this.f21337b));
            String str7 = "wishlist";
            if (!l.a((Object) str7, (Object) this.f21339d)) {
                if (m.a(this.f21339d)) {
                    str7 = "icon";
                } else {
                    str7 = this.f21339d;
                    if (str7 == null) {
                        str7 = "";
                    }
                }
            }
            hashMap.put("gift_enter_from", str7);
            hashMap.put("send_gift_scene", com.bytedance.android.livesdk.u.a.b().getDesc());
            String str8 = this.f21340e;
            if (str8 == null) {
                str8 = "";
            }
            hashMap.put("show_type", str8);
            if (findGiftById == null || findGiftById.f19762e != 4) {
                if (!this.f21338c) {
                    str6 = "non_animation_gift";
                }
                hashMap.put("gift_value_type", str6);
            } else {
                hashMap.put("gift_value_type", "sticker_gift");
            }
            GiftManager inst = GiftManager.inst();
            if (findGiftById != null) {
                j2 = findGiftById.f19761d;
            } else {
                j2 = 0;
            }
            u findGiftById2 = inst.findGiftById(j2);
            if (findGiftById2 == null || !findGiftById2.J) {
                if (findGiftById != null) {
                    if (findGiftById.f19761d == com.bytedance.android.livesdk.firstrecharge.d.u.i()) {
                        hashMap.put("special_gift", "first_recharge_gift");
                    } else if (findGiftById.f19761d == 0) {
                        hashMap.put("special_gift", "recall_gift");
                    }
                }
                hashMap.put("special_gift", "");
            } else {
                hashMap.put("special_gift", "announcements_gift");
            }
            hashMap.put("gift_position", String.valueOf(this.f21336a.a(this.f21337b)));
            hashMap.put("tab_position", String.valueOf(GiftManager.inst().getTabLocation(a.C0355a.C0356a.f17017a.f17014j)));
            hashMap.put("page_position", String.valueOf(this.f21336a.f21324c));
            if (b.a.C0448a.f21165a.f21164a) {
                str3 = "first_screen";
            } else {
                str3 = "other_screen";
            }
            hashMap.put("is_first_screen", str3);
            hashMap.put("actual_gift_position", String.valueOf(GiftManager.inst().getGiftPosition(this.f21337b)));
            this.f21336a.f21329h = com.bytedance.android.livesdk.utils.a.a.a();
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("gift_send_click").a("tab_name", this.f21341f).a("timestamp", this.f21336a.f21329h);
            Map<String, String> map = null;
            if (findGiftById != null) {
                num = Integer.valueOf(findGiftById.f19763f);
            } else {
                num = null;
            }
            com.bytedance.android.livesdk.ab.b a3 = a2.a("gift_price", (Number) num).a("from_panel_show_duration", com.bytedance.android.livesdk.utils.a.a.a() - a.C0355a.C0356a.f17017a.f17016l);
            int i4 = 0;
            if (findGiftById != null) {
                i3 = findGiftById.f19763f;
            } else {
                i3 = 0;
            }
            com.bytedance.android.livesdk.ab.b a4 = a3.a("consume_amount", i2 * i3);
            String str9 = "1";
            if (GiftManager.inst().isDynamicGift(this.f21337b)) {
                str4 = str9;
            } else {
                str4 = "0";
            }
            com.bytedance.android.livesdk.ab.b a5 = a4.a("dynamic_preview", str4).a((Map<String, String>) hashMap);
            u findGiftById3 = GiftManager.inst().findGiftById(this.f21337b);
            if (findGiftById3 != null) {
                map = findGiftById3.K;
            }
            com.bytedance.android.livesdk.ab.b a6 = a5.a(map).a("gift_dialog_request_id", com.bytedance.android.livesdk.service.a.c.f21167a);
            String str10 = e.f21320j;
            if (e.b()) {
                str5 = str9;
            } else {
                str5 = "0";
            }
            com.bytedance.android.livesdk.ab.b a7 = a6.a(str10, str5);
            Room room = this.f21342g;
            if (!(room == null || (owner = room.getOwner()) == null || !owner.isSubscribed())) {
                i4 = 1;
            }
            com.bytedance.android.livesdk.ab.b a8 = a7.a("is_subscription", i4);
            List list = (List) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.wishlist.d.class);
            if (list == null || !list.contains(Long.valueOf(this.f21337b))) {
                str9 = "0";
            }
            a8.a("is_wishlist_gift", str9).a().b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.service.c.a.e$e  reason: collision with other inner class name */
    public static final class C0458e implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f21343a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f21344b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f21345c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f21346d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f21347e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Integer f21348f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Integer f21349g;

        static {
            Covode.recordClassIndex(12579);
        }

        C0458e(e eVar, long j2, boolean z, String str, String str2, Integer num, Integer num2) {
            this.f21343a = eVar;
            this.f21344b = j2;
            this.f21345c = z;
            this.f21346d = str;
            this.f21347e = str2;
            this.f21348f = num;
            this.f21349g = num2;
        }

        @Override // com.bytedance.android.livesdk.service.c.a.b.a
        public final void a(String str, int i2) {
            String str2;
            int i3;
            int i4;
            long j2;
            int i5;
            String str3;
            int i6;
            String str4;
            Map<String, String> map;
            String str5;
            User owner;
            l.d(str, "");
            HashMap hashMap = new HashMap();
            u findGiftById = GiftManager.inst().findGiftById(this.f21344b);
            Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
            hashMap.put("gift_type", str);
            String str6 = "animation_gift";
            if (this.f21345c) {
                str2 = str6;
            } else {
                str2 = "non_animation_gift";
            }
            hashMap.put("gift_value_type", str2);
            hashMap.put("combo_cnt", String.valueOf(i2));
            hashMap.put("gift_cnt", String.valueOf(i2));
            hashMap.put("gift_id", String.valueOf(this.f21344b));
            int i7 = 0;
            if (findGiftById != null) {
                i3 = findGiftById.f19763f;
            } else {
                i3 = 0;
            }
            hashMap.put("gift_price", String.valueOf(i3));
            if (findGiftById != null) {
                i4 = findGiftById.f19763f;
            } else {
                i4 = 0;
            }
            hashMap.put("consume_amount", String.valueOf(i2 * i4));
            String str7 = "wishlist";
            if (!l.a((Object) str7, (Object) this.f21346d)) {
                if (m.a(this.f21346d)) {
                    str7 = "icon";
                } else {
                    str7 = this.f21346d;
                    if (str7 == null) {
                        str7 = "";
                    }
                }
            }
            hashMap.put("gift_enter_from", str7);
            hashMap.put("send_gift_scene", com.bytedance.android.livesdk.u.a.b().getDesc());
            String str8 = this.f21347e;
            if (str8 == null) {
                str8 = "";
            }
            hashMap.put("show_type", str8);
            if (findGiftById == null || findGiftById.f19762e != 4) {
                if (!this.f21345c) {
                    str6 = "non_animation_gift";
                }
                hashMap.put("gift_value_type", str6);
            } else {
                hashMap.put("gift_value_type", "sticker_gift");
            }
            GiftManager inst = GiftManager.inst();
            if (findGiftById != null) {
                j2 = findGiftById.f19761d;
            } else {
                j2 = 0;
            }
            u findGiftById2 = inst.findGiftById(j2);
            if (findGiftById2 == null || !findGiftById2.J) {
                if (findGiftById != null) {
                    if (findGiftById.f19761d == com.bytedance.android.livesdk.firstrecharge.d.u.i()) {
                        hashMap.put("special_gift", "first_recharge_gift");
                    } else if (findGiftById.f19761d == 0) {
                        hashMap.put("special_gift", "recall_gift");
                    }
                }
                hashMap.put("special_gift", "");
            } else {
                hashMap.put("special_gift", "announcements_gift");
            }
            GiftManager inst2 = GiftManager.inst();
            Integer num = this.f21348f;
            if (num != null) {
                i5 = num.intValue();
            } else {
                i5 = 0;
            }
            String tabName = inst2.getTabName(i5);
            l.b(tabName, "");
            hashMap.put("tab_name", tabName);
            if (b.a.C0448a.f21165a.f21164a) {
                str3 = "first_screen";
            } else {
                str3 = "other_screen";
            }
            hashMap.put("is_first_screen", str3);
            Integer num2 = this.f21349g;
            if (num2 != null) {
                i6 = num2.intValue();
            } else {
                i6 = 0;
            }
            hashMap.put("gift_position", String.valueOf(i6));
            hashMap.put("actual_gift_position", String.valueOf(GiftManager.inst().getGiftPosition(this.f21344b)));
            String str9 = e.f21320j;
            String str10 = "1";
            if (e.b()) {
                str4 = str10;
            } else {
                str4 = "0";
            }
            hashMap.put(str9, str4);
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("gift_send_click").a((Map<String, String>) hashMap);
            u findGiftById3 = GiftManager.inst().findGiftById(this.f21344b);
            if (findGiftById3 != null) {
                map = findGiftById3.K;
            } else {
                map = null;
            }
            com.bytedance.android.livesdk.ab.b a3 = a2.a(map).a("from_panel_show_duration", com.bytedance.android.livesdk.utils.a.a.a() - a.C0355a.C0356a.f17017a.f17016l);
            if (GiftManager.inst().isDynamicGift(this.f21344b)) {
                str5 = str10;
            } else {
                str5 = "0";
            }
            com.bytedance.android.livesdk.ab.b a4 = a3.a("dynamic_preview", str5);
            List list = (List) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.wishlist.d.class);
            if (list == null || !list.contains(Long.valueOf(this.f21344b))) {
                str10 = "0";
            }
            com.bytedance.android.livesdk.ab.b a5 = a4.a("is_wishlist_gift", str10).a("gift_dialog_request_id", com.bytedance.android.livesdk.service.a.c.f21167a).a().a("timestamp", com.bytedance.android.livesdk.utils.a.a.a());
            if (!(room == null || (owner = room.getOwner()) == null || !owner.isSubscribed())) {
                i7 = 1;
            }
            a5.a("is_subscription", i7).b();
        }
    }

    public static void a(String str, String str2, String str3) {
        String str4 = "";
        l.d(str, str4);
        l.d(str3, str4);
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", str);
        if (m.a(str2)) {
            str4 = "icon";
        } else if (str2 != null) {
            str4 = str2;
        }
        hashMap.put("gift_enter_from", str4);
        if (p.a(str2, "convenient_gift", false)) {
            hashMap.put("convenient_gift_enter_from", str3);
        }
        b.a.a("send_gift_network_fail").a().a((Map<String, String>) hashMap).b();
    }

    public static void a(long j2, String str, String str2, String str3, String str4) {
        String str5 = "";
        l.d(str, str5);
        l.d(str2, str5);
        l.d(str4, str5);
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", str);
        hashMap.put("fail_reason", str2);
        if (m.a(str3)) {
            str5 = "icon";
        } else if (str3 != null) {
            str5 = str3;
        }
        hashMap.put("gift_enter_from", str5);
        hashMap.put("send_click_duration", String.valueOf(com.bytedance.android.livesdk.utils.a.a.a() - j2));
        if (p.a(str3, "convenient_gift", false)) {
            hashMap.put("convenient_gift_enter_from", str4);
        }
        b.a.a("livesdk_gift_request_fail").a().a((Map<String, String>) hashMap).b();
    }

    public static void b(long j2, String str, String str2, String str3, String str4) {
        String str5 = "";
        l.d(str, str5);
        l.d(str2, str5);
        l.d(str4, str5);
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", str);
        if (m.a(str3)) {
            str5 = "icon";
        } else if (str3 != null) {
            str5 = str3;
        }
        hashMap.put("gift_enter_from", str5);
        hashMap.put("fail_reason", str2);
        hashMap.put("send_click_duration", String.valueOf(com.bytedance.android.livesdk.utils.a.a.a() - j2));
        if (p.a(str3, "convenient_gift", false)) {
            hashMap.put("convenient_gift_enter_from", str4);
        }
        b.a.a("livesdk_gift_local_fail").a().a((Map<String, String>) hashMap).b();
    }

    private final void a(int i2, int i3, GiftPage giftPage, Long l2, Integer num) {
        int i4;
        String str;
        long j2;
        String str2;
        String str3;
        User owner;
        int i5 = (this.f21324c * 8) + i2;
        List<? extends u> list = this.f21325d;
        int i6 = 0;
        if (list != null) {
            i4 = list.size();
        } else {
            i4 = 0;
        }
        if (i4 > i5) {
            Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("gift_show").a().a("gift_id", (Number) l2).a("gift_dialog_request_id", com.bytedance.android.livesdk.service.a.c.f21167a).a("tab_name", giftPage.pageName).a("tab_position", i3 + 1).a("gift_position", i2 + 1).a("page_position", this.f21324c + 1);
            if (this.f21326e) {
                str = "guest";
            } else {
                str = "anchor";
            }
            com.bytedance.android.livesdk.ab.b a3 = a2.a("to_user_type", str).a("send_gift_scene", com.bytedance.android.livesdk.u.a.b().getDesc());
            GiftManager inst = GiftManager.inst();
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = 0;
            }
            com.bytedance.android.livesdk.ab.b a4 = a3.a("actual_gift_position", inst.getGiftPosition(j2));
            String str4 = this.f21328g;
            if (str4 == null) {
                str4 = "icon";
            }
            com.bytedance.android.livesdk.ab.b a5 = a4.a("gift_enter_from", str4).a("gift_price", (Number) num).a("timestamp", com.bytedance.android.livesdk.utils.a.a.a());
            String str5 = f21320j;
            if (b()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            com.bytedance.android.livesdk.ab.b a6 = a5.a(str5, str2);
            if (b.a.C0448a.f21165a.f21164a) {
                str3 = "first_screen";
            } else {
                str3 = "other_screen";
            }
            com.bytedance.android.livesdk.ab.b a7 = a6.a("is_first_screen", str3);
            if (!(room == null || (owner = room.getOwner()) == null || !owner.isSubscribed())) {
                i6 = 1;
            }
            a7.a("is_subscription", i6).b();
        }
    }

    public final void a(long j2, boolean z, String str, String str2, Integer num, Integer num2) {
        b.C0455b.f21312a.a(j2, false, new C0458e(this, j2, z, str, str2, num, num2));
    }

    public static void a(boolean z, long j2, boolean z2, int i2, String str, int i3, Integer num) {
        String str2;
        int i4;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Map<String, String> map;
        User owner;
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("gift_preview").a().a("gift_enter_from", a.C0355a.C0356a.f17017a.f17009e).a("tab_position", GiftManager.inst().getTabLocation(i2)).a("tab_name", str).a("gift_id", j2);
        if (z) {
            str2 = "call";
        } else {
            str2 = "click";
        }
        com.bytedance.android.livesdk.ab.b a3 = a2.a("show_type", str2).a("gift_position", i3).a("timestamp", com.bytedance.android.livesdk.utils.a.a.a());
        int i5 = 0;
        if (num != null) {
            i4 = num.intValue();
        } else {
            i4 = 0;
        }
        com.bytedance.android.livesdk.ab.b a4 = a3.a("gift_price", i4).a("gift_dialog_request_id", com.bytedance.android.livesdk.service.a.c.f21167a);
        if (z2) {
            str3 = "portrait";
        } else {
            str3 = "landscape";
        }
        com.bytedance.android.livesdk.ab.b a5 = a4.a("room_orientation", str3).a("send_gift_scene", com.bytedance.android.livesdk.u.a.b().getDesc()).a("actual_gift_position", GiftManager.inst().getGiftPosition(j2));
        if (b.a.C0448a.f21165a.f21164a) {
            str4 = "first_screen";
        } else {
            str4 = "other_screen";
        }
        com.bytedance.android.livesdk.ab.b a6 = a5.a("is_first_screen", str4);
        String str8 = f21320j;
        String str9 = "1";
        if (b()) {
            str5 = str9;
        } else {
            str5 = "0";
        }
        com.bytedance.android.livesdk.ab.b a7 = a6.a(str8, str5);
        if (GiftManager.inst().isDynamicGift(j2)) {
            str6 = str9;
        } else {
            str6 = "0";
        }
        com.bytedance.android.livesdk.ab.b a8 = a7.a("dynamic_preview", str6);
        if (com.bytedance.android.livesdk.firstrecharge.d.u.i() == j2) {
            str7 = "first_recharge_gift";
        } else {
            u findGiftById = GiftManager.inst().findGiftById(j2);
            if (findGiftById == null || !findGiftById.J) {
                str7 = "null";
            } else {
                str7 = "announcements_gift";
            }
        }
        com.bytedance.android.livesdk.ab.b a9 = a8.a("special_gift", str7);
        u findGiftById2 = GiftManager.inst().findGiftById(j2);
        if (findGiftById2 != null) {
            map = findGiftById2.K;
        } else {
            map = null;
        }
        com.bytedance.android.livesdk.ab.b a10 = a9.a(map);
        if (!(room == null || (owner = room.getOwner()) == null || !owner.isSubscribed())) {
            i5 = 1;
        }
        com.bytedance.android.livesdk.ab.b a11 = a10.a("is_subscription", i5);
        List list = (List) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.wishlist.d.class);
        if (list == null || !list.contains(Long.valueOf(j2))) {
            str9 = "0";
        }
        a11.a("is_wishlist_gift", str9).b();
    }
}

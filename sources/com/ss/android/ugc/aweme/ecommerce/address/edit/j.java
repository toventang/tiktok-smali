package com.ss.android.ugc.aweme.ecommerce.address.edit;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.ecommerce.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.address.dto.AddressItem;
import com.ss.android.ugc.aweme.ecommerce.track.c;
import h.a.n;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Object> f84456a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public long f84457b;

    /* renamed from: c  reason: collision with root package name */
    boolean f84458c;

    /* renamed from: d  reason: collision with root package name */
    public long f84459d;

    /* renamed from: e  reason: collision with root package name */
    public int f84460e;

    /* renamed from: f  reason: collision with root package name */
    private long f84461f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, Long> f84462g = new LinkedHashMap();

    /* renamed from: h  reason: collision with root package name */
    private final List<String> f84463h;

    static {
        Covode.recordClassIndex(52693);
    }

    static final class a extends m implements b<String, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f84464a = new a();

        static {
            Covode.recordClassIndex(52694);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            return str2;
        }
    }

    public final void a(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.f84456a);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("input_box_name", str);
        c.a("tiktokec_input_click", linkedHashMap);
    }

    public final void c(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.f84456a);
        linkedHashMap.put("button_name", "delete");
        if (str != null) {
            linkedHashMap.put("input_box_name", str);
        }
        c.a("tiktokec_button_click", linkedHashMap);
    }

    public static void d(String str) {
        l.d(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "shipping_address");
        linkedHashMap.put("popup_name", str);
        c.a("tiktokec_popup_show", linkedHashMap);
    }

    public final void b(String str) {
        if (str != null && str.length() != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(this.f84456a);
            linkedHashMap.put("page_name", "shipping_address");
            linkedHashMap.put("drop_down_list_name", str);
            linkedHashMap.put("item_num", Integer.valueOf(this.f84460e));
            linkedHashMap.put("stay_time", Long.valueOf(SystemClock.elapsedRealtime() - this.f84459d));
            c.a("tiktokec_drop_down_list_staytime", linkedHashMap);
        }
    }

    public j(AddressPageStarter.AddressEditEnterParams addressEditEnterParams) {
        String str;
        Object obj;
        Map<String, Object> map = this.f84456a;
        if (addressEditEnterParams != null) {
            if (addressEditEnterParams.f84246b == null) {
                str = "add";
            } else {
                str = "edit";
            }
            map.put("page_info", str);
            if (addressEditEnterParams.f84248d != null) {
                try {
                    obj = com.ss.android.ugc.aweme.ecommerce.router.j.a().a(addressEditEnterParams.f84248d, HashMap.class);
                } catch (Exception unused) {
                    obj = null;
                }
                HashMap hashMap = (HashMap) obj;
                if (hashMap != null) {
                    map.putAll(hashMap);
                }
            }
            map.put("previous_page", addressEditEnterParams.f84247c);
        }
        map.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        map.put("page_name", "shipping_address");
        this.f84463h = n.b(StringSet.name, "phone", "address", "zipcode", "email", "address_other_detail");
    }

    private String a(Address address) {
        int i2;
        List<AddressItem> list;
        List<AddressItem> list2;
        StringBuilder sb = new StringBuilder();
        if (address == null || (list2 = address.f84299b) == null) {
            i2 = 0;
        } else {
            i2 = list2.size();
        }
        if (!(address == null || (list = address.f84299b) == null)) {
            for (T t : list) {
                String str = t.f84306b;
                if (!(str == null || str.length() == 0 || !n.a((Iterable) this.f84463h, (Object) t.f84305a))) {
                    sb.append(t.f84305a);
                    i2--;
                    if (i2 > 0) {
                        sb.append(",");
                    }
                }
            }
        }
        if (p.d(sb, ",")) {
            sb.deleteCharAt(sb.length() - 1);
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    public static void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "shipping_address");
        linkedHashMap.put("popup_name", str);
        linkedHashMap.put("action_type", str2);
        c.a("tiktokec_popup_click", linkedHashMap);
    }

    public final void a(boolean z, List<String> list) {
        l.d(list, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.f84456a);
        linkedHashMap.put("is_success", Integer.valueOf(z ? 1 : 0));
        linkedHashMap.put("fail_reason", n.a(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, a.f84464a, 30));
        c.a("tiktokec_save_address_result", linkedHashMap);
    }

    public final void a(String str, long j2, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.f84456a);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("input_box_name", str);
        linkedHashMap.put("stay_time", String.valueOf(j2));
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("input_method", str2);
        c.a("tiktokec_input_staytime", linkedHashMap);
    }

    public final void a(boolean z, String str, Address address) {
        l.d(str, "");
        String a2 = a(address);
        this.f84461f = SystemClock.elapsedRealtime() - this.f84457b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.f84456a);
        linkedHashMap.put("is_load_data", Integer.valueOf(z ? 1 : 0));
        linkedHashMap.put("quit_type", str);
        linkedHashMap.put("stay_time", Long.valueOf(this.f84461f));
        if (l.a(this.f84456a.get("page_name"), (Object) "shipping_address")) {
            linkedHashMap.put("page_info", a2);
        }
        c.a("tiktokec_stay_page", linkedHashMap);
    }
}

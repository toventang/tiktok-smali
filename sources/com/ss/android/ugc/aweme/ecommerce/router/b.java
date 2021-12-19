package com.ss.android.ugc.aweme.ecommerce.router;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.address.widget.b;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.utils.dg;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b implements IInterceptor {
    static {
        Covode.recordClassIndex(54679);
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ Object $enterMethod$inlined;
        final /* synthetic */ Boolean $forceSingleLevel$inlined;
        final /* synthetic */ List $geoNameIds$inlined;

        static {
            Covode.recordClassIndex(54680);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(List list, Boolean bool, Object obj) {
            super(0);
            this.$geoNameIds$inlined = list;
            this.$forceSingleLevel$inlined = bool;
            this.$enterMethod$inlined = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("districts", "");
            jSONObject.put("status", 0);
            jSONObject.put("enter_method", String.valueOf(this.$enterMethod$inlined));
            IEventCenter a2 = EventCenter.a();
            String jSONObject2 = jSONObject.toString();
            l.b(jSONObject2, "");
            a2.a("ec_district_panel_changed", jSONObject2);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        if (routeIntent != null) {
            str = routeIntent.getHost();
        } else {
            str = null;
        }
        return l.a((Object) str, (Object) "ec");
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.b$b  reason: collision with other inner class name */
    static final class C2102b extends m implements h.f.a.b<List<? extends Region>, z> {
        final /* synthetic */ Object $enterMethod$inlined;
        final /* synthetic */ Boolean $forceSingleLevel$inlined;
        final /* synthetic */ List $geoNameIds$inlined;

        static {
            Covode.recordClassIndex(54681);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2102b(List list, Boolean bool, Object obj) {
            super(1);
            this.$geoNameIds$inlined = list;
            this.$forceSingleLevel$inlined = bool;
            this.$enterMethod$inlined = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends Region> list) {
            l.d(list, "");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("districts", new JSONArray(dg.a().b(list)));
            jSONObject.put("status", 2);
            jSONObject.put("enter_method", String.valueOf(this.$enterMethod$inlined));
            IEventCenter a2 = EventCenter.a();
            String jSONObject2 = jSONObject.toString();
            l.b(jSONObject2, "");
            a2.a("ec_district_panel_changed", jSONObject2);
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<List<? extends Region>, z> {
        final /* synthetic */ Object $enterMethod$inlined;
        final /* synthetic */ Boolean $forceSingleLevel$inlined;
        final /* synthetic */ List $geoNameIds$inlined;

        static {
            Covode.recordClassIndex(54682);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(List list, Boolean bool, Object obj) {
            super(1);
            this.$geoNameIds$inlined = list;
            this.$forceSingleLevel$inlined = bool;
            this.$enterMethod$inlined = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends Region> list) {
            l.d(list, "");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("districts", new JSONArray(dg.a().b(list)));
            jSONObject.put("status", 1);
            jSONObject.put("enter_method", String.valueOf(this.$enterMethod$inlined));
            IEventCenter a2 = EventCenter.a();
            String jSONObject2 = jSONObject.toString();
            l.b(jSONObject2, "");
            a2.a("ec_district_panel_changed", jSONObject2);
            return z.f158842a;
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        Object obj;
        String str2;
        Object obj2;
        String str3;
        Boolean bool;
        int i2;
        boolean z;
        Intent extra;
        Context context2 = context;
        String str4 = null;
        if (routeIntent == null || (extra = routeIntent.getExtra()) == null) {
            str = null;
        } else {
            str = a(extra, "trackParams");
        }
        try {
            obj = j.a().a(str, HashMap.class);
        } catch (Exception unused) {
            obj = null;
        }
        HashMap hashMap = (HashMap) obj;
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        Object obj3 = hashMap.get("enter_method");
        if (routeIntent != null) {
            str2 = routeIntent.getPath();
        } else {
            str2 = null;
        }
        if (str2 != null && str2.hashCode() == -1801795815 && str2.equals("/geo_select")) {
            try {
                obj2 = j.a().a(a(routeIntent.getExtra(), "geoname_ids"), List.class);
            } catch (Exception unused2) {
                obj2 = null;
            }
            List list = (List) obj2;
            Intent extra2 = routeIntent.getExtra();
            if (extra2 != null) {
                str3 = a(extra2, "order_skus");
            } else {
                str3 = null;
            }
            try {
                j.a().a(str3, HashMap.class);
            } catch (Exception unused3) {
            }
            Intent extra3 = routeIntent.getExtra();
            if (extra3 != null) {
                if (list == null || list.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                bool = Boolean.valueOf(extra3.getBooleanExtra("force_single_level", z));
            } else {
                bool = null;
            }
            if (!(context2 instanceof e)) {
                context2 = null;
            }
            e eVar = (e) context2;
            if (eVar != null) {
                if (list != null) {
                    str4 = (String) n.i(list);
                }
                i supportFragmentManager = eVar.getSupportFragmentManager();
                if (l.a((Object) bool, (Object) true)) {
                    i2 = 1;
                } else {
                    i2 = Integer.MAX_VALUE;
                }
                b.a.a(false, str4, i2, supportFragmentManager, null, new a(list, bool, obj3), new C2102b(list, bool, obj3), new c(list, bool, obj3), 17);
                return true;
            }
        }
        return false;
    }
}

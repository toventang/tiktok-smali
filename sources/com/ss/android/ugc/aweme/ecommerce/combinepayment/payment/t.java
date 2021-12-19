package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o;
import com.ss.android.ugc.aweme.ecommerce.track.c;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class t {

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f85424g;

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f85425h;

    /* renamed from: i  reason: collision with root package name */
    public static final a f85426i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final LinkedHashMap<String, Object> f85427a;

    /* renamed from: b  reason: collision with root package name */
    final List<String> f85428b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    long f85429c;

    /* renamed from: d  reason: collision with root package name */
    final Map<String, Long> f85430d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    boolean f85431e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, Long> f85432f = new LinkedHashMap();

    /* renamed from: j  reason: collision with root package name */
    private long f85433j;

    public static final class a {
        static {
            Covode.recordClassIndex(53463);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.t$a$a  reason: collision with other inner class name */
        public static final class C2043a extends m implements h.f.a.b<c.a, z> {
            final /* synthetic */ String $errorCode;
            final /* synthetic */ String $pageName;
            final /* synthetic */ String $paymentReference;

            static {
                Covode.recordClassIndex(53464);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2043a(String str, String str2, String str3) {
                super(1);
                this.$paymentReference = str;
                this.$pageName = str2;
                this.$errorCode = str3;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(c.a aVar) {
                c.a aVar2 = aVar;
                String str = "";
                l.d(aVar2, str);
                String str2 = this.$paymentReference;
                if (str2 == null) {
                    str2 = str;
                }
                aVar2.b("payment_reference", str2);
                String str3 = this.$pageName;
                if (str3 == null) {
                    str3 = str;
                }
                aVar2.b("page_name", str3);
                String str4 = this.$errorCode;
                if (str4 != null) {
                    str = str4;
                }
                aVar2.b("error_code", str);
                return z.f158842a;
            }
        }

        public static void a(String str, String str2, String str3) {
            com.ss.android.ugc.aweme.ecommerce.track.c.a("rd_tiktokec_pay_error", new C2043a(str, str2, str3));
        }
    }

    static {
        Covode.recordClassIndex(53462);
        int i2 = 0;
        String[] strArr = new String[4];
        int i3 = 0;
        loop0:
        while (true) {
            String str = ",card_number";
            while (true) {
                strArr[i3] = str;
                i3++;
                if (i3 >= 4) {
                    break loop0;
                } else if (i3 != 0) {
                    if (i3 == 1) {
                        str = ",date";
                    } else if (i3 != 2) {
                        str = ",card_holder";
                    } else {
                        str = ",code";
                    }
                }
            }
        }
        f85424g = strArr;
        String[] strArr2 = new String[4];
        do {
            strArr2[i2] = f85424g[i2];
            i2++;
        } while (i2 < 4);
        f85425h = strArr2;
    }

    static final class c extends m implements h.f.a.b<String, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f85434a = new c();

        static {
            Covode.recordClassIndex(53466);
        }

        c() {
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
        this.f85432f.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    static final class b extends m implements h.f.a.b<Map<String, Object>, z> {
        final /* synthetic */ String $methods;

        static {
            Covode.recordClassIndex(53465);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.$methods = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Map<String, Object> map) {
            Map<String, Object> map2 = map;
            l.d(map2, "");
            String str = this.$methods;
            if (str != null) {
                map2.put("payment_option", str);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<Map<String, Object>, z> {
        final /* synthetic */ boolean $isPaySaved;
        final /* synthetic */ String $payType;

        static {
            Covode.recordClassIndex(53468);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(String str, boolean z) {
            super(1);
            this.$payType = str;
            this.$isPaySaved = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Map<String, Object> map) {
            Map<String, Object> map2 = map;
            l.d(map2, "");
            String str = this.$payType;
            if (str != null) {
                map2.put("pay_type", str);
            }
            map2.put("is_pay_saved", Integer.valueOf(this.$isPaySaved ? 1 : 0));
            return z.f158842a;
        }
    }

    public final long b(String str) {
        Long l2 = this.f85432f.get(str);
        if (l2 == null) {
            return 0;
        }
        long longValue = l2.longValue();
        this.f85432f.remove(str);
        return SystemClock.elapsedRealtime() - longValue;
    }

    public final void c(String str) {
        l.d(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.f85427a);
        linkedHashMap.put("input_box_name", str);
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_input_click", linkedHashMap);
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<Map<String, Object>, z> {
        final /* synthetic */ String $inputMethod;
        final /* synthetic */ String $inputName;
        final /* synthetic */ boolean $isValid;
        final /* synthetic */ String $secondType;

        static {
            Covode.recordClassIndex(53467);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String str, boolean z, String str2, String str3) {
            super(1);
            this.$secondType = str;
            this.$isValid = z;
            this.$inputName = str2;
            this.$inputMethod = str3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Map<String, Object> map) {
            Map<String, Object> map2 = map;
            String str = "";
            l.d(map2, str);
            Object obj = this.$secondType;
            if (obj != null) {
                map2.put("option_name", obj);
            }
            map2.put("is_valid", Integer.valueOf(this.$isValid ? 1 : 0));
            Object obj2 = this.$inputName;
            if (obj2 != null) {
                map2.put("input_name", obj2);
            }
            String str2 = this.$inputMethod;
            if (str2 != null) {
                str = str2;
            }
            map2.put("input_method", str);
            return z.f158842a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035 A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String d(java.lang.String r2) {
        /*
            if (r2 != 0) goto L_0x0005
            java.lang.String r0 = ""
            return r0
        L_0x0005:
            int r1 = r2.hashCode()
            r0 = 98896(0x18250, float:1.38583E-40)
            if (r1 == r0) goto L_0x002d
            r0 = 98915(0x18263, float:1.3861E-40)
            if (r1 == r0) goto L_0x0024
            r0 = 766686014(0x2db2b33e, float:2.0315857E-11)
            if (r1 == r0) goto L_0x0019
        L_0x0018:
            return r2
        L_0x0019:
            java.lang.String r0 = "expiration_date"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "date"
            return r0
        L_0x0024:
            java.lang.String r0 = "cvv"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            goto L_0x0035
        L_0x002d:
            java.lang.String r0 = "cvc"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
        L_0x0035:
            java.lang.String r2 = "code"
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.t.d(java.lang.String):java.lang.String");
    }

    static final class f extends m implements h.f.a.b<Map<String, Object>, z> {
        final /* synthetic */ String $firstPayType;
        final /* synthetic */ boolean $isBalanceShown;
        final /* synthetic */ boolean $isOptionDiscounted;
        final /* synthetic */ boolean $isPaySaved;
        final /* synthetic */ String $optionType;
        final /* synthetic */ String $optionUnavailableCode;
        final /* synthetic */ int $rank;
        final /* synthetic */ String $secondType;

        static {
            Covode.recordClassIndex(53469);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(String str, boolean z, int i2, String str2, String str3, boolean z2, boolean z3, String str4) {
            super(1);
            this.$secondType = str;
            this.$isOptionDiscounted = z;
            this.$rank = i2;
            this.$optionType = str2;
            this.$firstPayType = str3;
            this.$isPaySaved = z2;
            this.$isBalanceShown = z3;
            this.$optionUnavailableCode = str4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Map<String, Object> map) {
            String str;
            Map<String, Object> map2 = map;
            l.d(map2, "");
            map2.put("option_name", this.$secondType);
            map2.put("is_option_discounted", Integer.valueOf(this.$isOptionDiscounted ? 1 : 0));
            map2.put("rank", Integer.valueOf(this.$rank));
            map2.put("option_type", this.$optionType);
            if (l.a((Object) this.$firstPayType, (Object) this.$secondType)) {
                str = "1";
            } else {
                str = "0";
            }
            map2.put("is_default", str);
            map2.put("is_pay_saved", Integer.valueOf(this.$isPaySaved ? 1 : 0));
            map2.put("is_balance_shown", Integer.valueOf(this.$isBalanceShown ? 1 : 0));
            String str2 = this.$optionUnavailableCode;
            if (!(str2 == null || str2.length() == 0)) {
                map2.put("option_unavailable_code", this.$optionUnavailableCode);
            }
            return z.f158842a;
        }
    }

    public t(c cVar) {
        l.d(cVar, "");
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        this.f85427a = linkedHashMap;
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "payment_method");
        linkedHashMap.put("is_fullscreen", Integer.valueOf(!cVar.f85265f ? 1 : 0));
        HashMap<String, Object> hashMap = cVar.f85267h;
        if (hashMap != null) {
            linkedHashMap.putAll(hashMap);
        }
    }

    public final void a(String str, boolean z) {
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_pay_order", this.f85427a, new e(str, z));
    }

    public final void a(long j2, String str) {
        String str2 = "";
        l.d(str, str2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = this.f85427a.get("EVENT_ORIGIN_FEATURE");
        if (obj != null) {
            str2 = obj;
        }
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", str2);
        linkedHashMap.put("page_name", "payment_method");
        linkedHashMap.put("previous_page", "order_submit");
        linkedHashMap.put("quite_type", str);
        linkedHashMap.put("stay_time", Long.valueOf(j2));
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_scan_result", linkedHashMap);
    }

    public final void a(String str, long j2, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.f85427a);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("input_box_name", str);
        linkedHashMap.put("stay_time", String.valueOf(j2));
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("input_method", str2);
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_input_staytime", linkedHashMap);
    }

    public final void a(String str, o oVar, boolean z) {
        l.d(str, "");
        this.f85433j = SystemClock.elapsedRealtime() - this.f85429c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.f85427a);
        linkedHashMap.put("stay_time", Long.valueOf(this.f85433j));
        linkedHashMap.put("is_load_data", 1);
        linkedHashMap.put("quit_type", str);
        linkedHashMap.put("is_card_save", Integer.valueOf(z ? 1 : 0));
        if (oVar != null) {
            linkedHashMap.put("pay_type", oVar.c());
        }
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_stay_page", linkedHashMap);
    }

    public final void a(String str, boolean z, String str2, String str3) {
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_input_result", this.f85427a, new d(str, z, str2, str3));
    }

    public final void a(String str, String str2, String str3, String[] strArr, Boolean bool) {
        String substring;
        l.d(str, "");
        l.d(strArr, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.f85427a);
        linkedHashMap.put("button_name", str);
        if (str2 != null) {
            linkedHashMap.put("pay_type", str2);
        }
        if (l.a((Object) str2, (Object) "CCDC")) {
            if (str3 != null) {
                linkedHashMap.put("is_card_save", str3);
            }
            String str4 = "";
            int i2 = 0;
            do {
                if (!(f85425h[i2] == null && strArr[i2] == null)) {
                    str4 = str4 + f85424g[i2];
                }
                i2++;
            } while (i2 <= 3);
            if (str4.length() == 0) {
                substring = "1";
            } else {
                Objects.requireNonNull(str4, "null cannot be cast to non-null type java.lang.String");
                substring = str4.substring(1);
                l.b(substring, "");
            }
            linkedHashMap.put("payment_info_finish", substring);
        }
        if (bool != null) {
            linkedHashMap.put("is_pay_saved", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_button_click", linkedHashMap);
    }
}

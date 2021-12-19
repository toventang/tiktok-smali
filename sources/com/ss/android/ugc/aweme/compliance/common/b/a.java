package com.ss.android.ugc.aweme.compliance.common.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.f;
import com.ss.android.ugc.aweme.compliance.api.model.AgeGateInfo;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.model.Strategy;
import com.ss.android.ugc.aweme.compliance.api.model.TrafficControl;
import com.ss.android.ugc.aweme.utils.dg;
import h.f.b.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final C1777a f77300g = new C1777a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Keva f77301a;

    /* renamed from: b  reason: collision with root package name */
    public List<com.ss.android.ugc.aweme.compliance.api.model.b> f77302b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f77303c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f77304d;

    /* renamed from: e  reason: collision with root package name */
    public String f77305e;

    /* renamed from: f  reason: collision with root package name */
    public Long f77306f;

    /* renamed from: h  reason: collision with root package name */
    private ComplianceSetting f77307h;

    /* renamed from: i  reason: collision with root package name */
    private Integer f77308i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f77309j;

    /* renamed from: k  reason: collision with root package name */
    private ComplianceSetting f77310k;

    /* renamed from: l  reason: collision with root package name */
    private int f77311l;

    /* renamed from: m  reason: collision with root package name */
    private Boolean f77312m;

    public static final class b extends com.google.gson.b.a<List<? extends com.ss.android.ugc.aweme.compliance.api.model.b>> {
        static {
            Covode.recordClassIndex(47810);
        }
    }

    static {
        Covode.recordClassIndex(47808);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.common.b.a$a  reason: collision with other inner class name */
    public static final class C1777a {
        static {
            Covode.recordClassIndex(47809);
        }

        private C1777a() {
        }

        public /* synthetic */ C1777a(byte b2) {
            this();
        }
    }

    public final ComplianceSetting c() {
        ComplianceSetting complianceSetting = this.f77310k;
        if (complianceSetting == null) {
            return f();
        }
        return complianceSetting;
    }

    public final int d() {
        return this.f77301a.getInt("vpa_content_choice", 0);
    }

    public a() {
        Keva repo = Keva.getRepo("compliance_setting");
        l.b(repo, "");
        this.f77301a = repo;
    }

    public final Integer a() {
        Integer num = this.f77308i;
        if (num != null) {
            return num;
        }
        return Integer.valueOf(this.f77301a.getInt("remove_photo_sensitive_status", 0));
    }

    public final Boolean e() {
        Boolean bool = this.f77312m;
        if (bool != null) {
            return bool;
        }
        return Boolean.valueOf(this.f77301a.getBoolean("need_block_af_sharing", false));
    }

    private final ComplianceSetting f() {
        ComplianceSetting complianceSetting = this.f77307h;
        if (complianceSetting != null) {
            return complianceSetting;
        }
        String string = this.f77301a.getString("cached_setting", "");
        l.b(string, "");
        if (!TextUtils.isEmpty(string)) {
            try {
                this.f77307h = (ComplianceSetting) new f().a(string, ComplianceSetting.class);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return this.f77307h;
    }

    public final Integer b() {
        int i2;
        AgeGateInfo ageGateInfo;
        Integer num = this.f77309j;
        if (num != null) {
            return num;
        }
        Keva keva = this.f77301a;
        ComplianceSetting c2 = c();
        if (c2 == null || (ageGateInfo = c2.getAgeGateInfo()) == null) {
            i2 = 0;
        } else {
            i2 = ageGateInfo.getRegisterAgeGateAction();
        }
        return Integer.valueOf(keva.getInt("register_age_gate_action", i2));
    }

    public final void a(int i2) {
        this.f77311l = i2;
        this.f77301a.storeInt("vpa_content_choice", i2);
    }

    private final void b(ComplianceSetting complianceSetting) {
        this.f77307h = complianceSetting;
        if (complianceSetting == null) {
            this.f77301a.clear();
        } else {
            this.f77301a.storeString("cached_setting", new f().b(complianceSetting));
        }
    }

    public final void a(ComplianceSetting complianceSetting) {
        TrafficControl trafficControl;
        this.f77310k = complianceSetting;
        com.ss.android.ugc.aweme.compliance.common.b.f77294h = true;
        if (complianceSetting != null) {
            trafficControl = complianceSetting.getTrafficControl();
        } else {
            trafficControl = null;
        }
        a(trafficControl);
        if (complianceSetting != null) {
            complianceSetting.setTrafficControl(null);
        }
        b(complianceSetting);
    }

    private void a(TrafficControl trafficControl) {
        List<Strategy> strategy;
        HashMap<String, Strategy> hashMap = new HashMap<>();
        if (trafficControl == null) {
            com.ss.android.ugc.aweme.compliance.common.b.f77293g = hashMap;
            this.f77301a.storeString("traffic_control", "");
            return;
        }
        if (l.a((Object) trafficControl.getBusiness(), (Object) "child_mode") && (strategy = trafficControl.getStrategy()) != null) {
            for (T t : strategy) {
                List<String> domains = t.getDomains();
                if (domains != null) {
                    Iterator<T> it = domains.iterator();
                    while (it.hasNext()) {
                        hashMap.put(it.next(), t);
                    }
                }
            }
        }
        com.ss.android.ugc.aweme.compliance.common.b.f77293g = hashMap;
        this.f77301a.storeString("traffic_control", dg.a().b(trafficControl));
    }

    public final void b(Integer num) {
        this.f77309j = num;
        Keva keva = this.f77301a;
        if (num == null) {
            l.b();
        }
        keva.storeInt("register_age_gate_action", num.intValue());
    }

    public final void a(Boolean bool) {
        boolean z;
        this.f77312m = bool;
        Keva keva = this.f77301a;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        keva.storeBoolean("need_block_af_sharing", z);
    }

    public final void a(Integer num) {
        int i2;
        this.f77308i = num;
        Keva keva = this.f77301a;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        keva.storeInt("remove_photo_sensitive_status", i2);
    }

    public final void a(Long l2) {
        long j2;
        this.f77306f = l2;
        Keva keva = this.f77301a;
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = 0;
        }
        keva.storeLong("age_gate_block_device_register_expire_time", j2);
    }

    public final void a(List<com.ss.android.ugc.aweme.compliance.api.model.b> list) {
        this.f77302b = list;
        this.f77301a.storeString("account_banned_detail", new f().b(list));
    }
}

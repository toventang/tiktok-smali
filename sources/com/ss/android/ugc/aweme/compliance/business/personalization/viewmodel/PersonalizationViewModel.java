package com.ss.android.ugc.aweme.compliance.business.personalization.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ac;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.model.NewPersAdSettings;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.p;
import org.json.JSONArray;
import org.json.JSONObject;

public final class PersonalizationViewModel extends ac {

    /* renamed from: b  reason: collision with root package name */
    public static final a f77034b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final h.h f77035a = h.i.a((h.f.a.a) new g(this));

    /* renamed from: c  reason: collision with root package name */
    private final h.h f77036c = h.i.a((h.f.a.a) e.f77050a);

    /* renamed from: d  reason: collision with root package name */
    private final h.h f77037d = h.i.a((h.f.a.a) k.f77066a);

    /* renamed from: e  reason: collision with root package name */
    private final h.h f77038e = h.i.a((h.f.a.a) d.f77049a);

    /* renamed from: f  reason: collision with root package name */
    private final h.h f77039f = h.i.a((h.f.a.a) f.f77051a);

    /* renamed from: g  reason: collision with root package name */
    private final h.h f77040g = h.i.a((h.f.a.a) h.f77053a);

    static {
        Covode.recordClassIndex(47612);
    }

    public final t<Integer> a() {
        return (t) this.f77036c.getValue();
    }

    public final t<Integer> b() {
        return (t) this.f77037d.getValue();
    }

    public final t<Integer> c() {
        return (t) this.f77038e.getValue();
    }

    public final t<Integer> d() {
        return (t) this.f77039f.getValue();
    }

    public final t<Integer> e() {
        return (t) this.f77040g.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47613);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class e extends m implements h.f.a.a<t<Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f77050a = new e();

        static {
            Covode.recordClassIndex(47617);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Integer> invoke() {
            t tVar = new t();
            tVar.setValue(Integer.valueOf(com.ss.android.ugc.aweme.compliance.common.b.f()));
            return tVar;
        }
    }

    static final class d extends m implements h.f.a.a<t<Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f77049a = new d();

        static {
            Covode.recordClassIndex(47616);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Integer> invoke() {
            int i2;
            AdPersonalitySettings adPersonalitySettings;
            Integer partnerAdMode;
            t tVar = new t();
            ComplianceSetting c2 = com.ss.android.ugc.aweme.compliance.common.b.f77288b.c();
            if (c2 == null || (adPersonalitySettings = c2.getAdPersonalitySettings()) == null || (partnerAdMode = adPersonalitySettings.getPartnerAdMode()) == null) {
                i2 = 0;
            } else {
                i2 = partnerAdMode.intValue();
            }
            tVar.setValue(Integer.valueOf(i2));
            return tVar;
        }
    }

    static final class f extends m implements h.f.a.a<t<Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f77051a = new f();

        static {
            Covode.recordClassIndex(47618);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Integer> invoke() {
            int i2;
            AdPersonalitySettings adPersonalitySettings;
            NewPersAdSettings newPersAdSettings;
            Integer mode1P;
            t tVar = new t();
            ComplianceSetting c2 = com.ss.android.ugc.aweme.compliance.common.b.f77288b.c();
            if (c2 == null || (adPersonalitySettings = c2.getAdPersonalitySettings()) == null || (newPersAdSettings = adPersonalitySettings.getNewPersAdSettings()) == null || (mode1P = newPersAdSettings.getMode1P()) == null) {
                i2 = 0;
            } else {
                i2 = mode1P.intValue();
            }
            tVar.setValue(Integer.valueOf(i2));
            return tVar;
        }
    }

    static final class g extends m implements h.f.a.a<LiveData<p<? extends Integer, ? extends Integer>>> {
        final /* synthetic */ PersonalizationViewModel this$0;

        static {
            Covode.recordClassIndex(47619);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(PersonalizationViewModel personalizationViewModel) {
            super(0);
            this.this$0 = personalizationViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveData<p<? extends Integer, ? extends Integer>> invoke() {
            t<Integer> d2 = this.this$0.d();
            t<Integer> e2 = this.this$0.e();
            AnonymousClass1 r2 = AnonymousClass1.f77052a;
            l.d(d2, "");
            l.d(e2, "");
            l.d(r2, "");
            r rVar = new r();
            rVar.a(d2, new b(d2, rVar, r2, e2));
            rVar.a(e2, new c(d2, rVar, r2, e2));
            return rVar;
        }
    }

    static final class h extends m implements h.f.a.a<t<Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f77053a = new h();

        static {
            Covode.recordClassIndex(47621);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Integer> invoke() {
            int i2;
            AdPersonalitySettings adPersonalitySettings;
            NewPersAdSettings newPersAdSettings;
            Integer mode3P;
            t tVar = new t();
            ComplianceSetting c2 = com.ss.android.ugc.aweme.compliance.common.b.f77288b.c();
            if (c2 == null || (adPersonalitySettings = c2.getAdPersonalitySettings()) == null || (newPersAdSettings = adPersonalitySettings.getNewPersAdSettings()) == null || (mode3P = newPersAdSettings.getMode3P()) == null) {
                i2 = 0;
            } else {
                i2 = mode3P.intValue();
            }
            tVar.setValue(Integer.valueOf(i2));
            return tVar;
        }
    }

    public static final class i implements com.ss.android.ugc.aweme.compliance.common.d.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PersonalizationViewModel f77054a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Integer f77055b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Integer f77056c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.e f77057d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z.e f77058e;

        static {
            Covode.recordClassIndex(47622);
        }

        @Override // com.ss.android.ugc.aweme.compliance.common.d.c
        public final void b() {
            new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.f.j()).a(R.string.bre).a();
            if (this.f77057d.element != null) {
                this.f77054a.d().setValue(this.f77057d.element);
            }
            if (this.f77058e.element != null) {
                this.f77054a.e().setValue(this.f77058e.element);
            }
        }

        @Override // com.ss.android.ugc.aweme.compliance.common.d.c
        public final void a() {
            NewPersAdSettings newPersAdSettings;
            ComplianceSetting complianceSetting;
            NewPersAdSettings g2 = com.ss.android.ugc.aweme.compliance.common.b.g();
            NewPersAdSettings g3 = com.ss.android.ugc.aweme.compliance.common.b.g();
            AdPersonalitySettings adPersonalitySettings = null;
            if (g3 != null) {
                Integer num = this.f77055b;
                if (num == null) {
                    if (g2 != null) {
                        num = g2.getMode1P();
                    } else {
                        num = null;
                    }
                }
                Integer num2 = this.f77056c;
                if (num2 == null) {
                    if (g2 != null) {
                        num2 = g2.getMode3P();
                    } else {
                        num2 = null;
                    }
                }
                newPersAdSettings = NewPersAdSettings.copy$default(g3, num, null, null, null, num2, null, null, null, 238, null);
            } else {
                newPersAdSettings = null;
            }
            AdPersonalitySettings i2 = com.ss.android.ugc.aweme.compliance.common.b.i();
            if (i2 != null) {
                if (newPersAdSettings != null) {
                    g2 = newPersAdSettings;
                }
                adPersonalitySettings = AdPersonalitySettings.copy$default(i2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, g2, null, 786431, null);
            }
            ComplianceSetting c2 = com.ss.android.ugc.aweme.compliance.common.b.f77288b.c();
            if (c2 == null || (complianceSetting = ComplianceSetting.copy$default(c2, null, null, null, null, null, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553919, null)) == null) {
                complianceSetting = new ComplianceSetting(null, null, null, null, null, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553919, null);
            }
            com.ss.android.ugc.aweme.compliance.common.b.b(complianceSetting);
            if (com.bytedance.ies.ugc.appcontext.f.j() instanceof com.ss.android.ugc.aweme.main.j) {
                new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.f.j()).a(R.string.et_).a();
            }
        }

        i(PersonalizationViewModel personalizationViewModel, Integer num, Integer num2, z.e eVar, z.e eVar2) {
            this.f77054a = personalizationViewModel;
            this.f77055b = num;
            this.f77056c = num2;
            this.f77057d = eVar;
            this.f77058e = eVar2;
        }
    }

    static final class k extends m implements h.f.a.a<t<Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f77066a = new k();

        static {
            Covode.recordClassIndex(47624);
        }

        k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Integer> invoke() {
            int i2;
            AdPersonalitySettings adPersonalitySettings;
            Integer thirdAdMode;
            t tVar = new t();
            ComplianceSetting c2 = com.ss.android.ugc.aweme.compliance.common.b.f77288b.c();
            if (c2 == null || (adPersonalitySettings = c2.getAdPersonalitySettings()) == null || (thirdAdMode = adPersonalitySettings.getThirdAdMode()) == null) {
                i2 = 0;
            } else {
                i2 = thirdAdMode.intValue();
            }
            tVar.setValue(Integer.valueOf(i2));
            return tVar;
        }
    }

    public static final class j implements com.ss.android.ugc.aweme.compliance.common.d.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PersonalizationViewModel f77059a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Integer f77060b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Integer f77061c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Integer f77062d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z.e f77063e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ z.e f77064f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ z.e f77065g;

        static {
            Covode.recordClassIndex(47623);
        }

        @Override // com.ss.android.ugc.aweme.compliance.common.d.c
        public final void b() {
            new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.f.j()).a(R.string.bre).a();
            if (this.f77063e.element != null) {
                this.f77059a.a().setValue(this.f77063e.element);
            }
            if (this.f77064f.element != null) {
                this.f77059a.b().setValue(this.f77064f.element);
            }
            if (this.f77065g.element != null) {
                this.f77059a.c().setValue(this.f77065g.element);
            }
        }

        @Override // com.ss.android.ugc.aweme.compliance.common.d.c
        public final void a() {
            ComplianceSetting complianceSetting;
            AdPersonalitySettings i2 = com.ss.android.ugc.aweme.compliance.common.b.i();
            AdPersonalitySettings i3 = com.ss.android.ugc.aweme.compliance.common.b.i();
            AdPersonalitySettings adPersonalitySettings = null;
            Integer num = null;
            if (i3 != null) {
                Integer num2 = this.f77060b;
                if (num2 == null) {
                    if (i2 != null) {
                        num2 = i2.getMode();
                    } else {
                        num2 = null;
                    }
                }
                Integer num3 = this.f77061c;
                if (num3 == null) {
                    if (i2 != null) {
                        num3 = i2.getThirdAdMode();
                    } else {
                        num3 = null;
                    }
                }
                Integer num4 = this.f77062d;
                if (num4 != null) {
                    num = num4;
                } else if (i2 != null) {
                    num = i2.getPartnerAdMode();
                }
                adPersonalitySettings = AdPersonalitySettings.copy$default(i3, num2, null, null, null, null, null, null, num3, num, null, null, null, null, null, null, null, null, null, null, null, 1048190, null);
            }
            ComplianceSetting c2 = com.ss.android.ugc.aweme.compliance.common.b.f77288b.c();
            if (c2 == null || (complianceSetting = ComplianceSetting.copy$default(c2, null, null, null, null, null, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553919, null)) == null) {
                complianceSetting = new ComplianceSetting(null, null, null, null, null, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553919, null);
            }
            com.ss.android.ugc.aweme.compliance.common.b.b(complianceSetting);
            if (com.bytedance.ies.ugc.appcontext.f.j() instanceof com.ss.android.ugc.aweme.main.j) {
                new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.f.j()).a(R.string.et_).a();
            }
        }

        j(PersonalizationViewModel personalizationViewModel, Integer num, Integer num2, Integer num3, z.e eVar, z.e eVar2, z.e eVar3) {
            this.f77059a = personalizationViewModel;
            this.f77060b = num;
            this.f77061c = num2;
            this.f77062d = num3;
            this.f77063e = eVar;
            this.f77064f = eVar2;
            this.f77065g = eVar3;
        }
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveData f77041a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f77042b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f77043c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ LiveData f77044d;

        static {
            Covode.recordClassIndex(47614);
        }

        b(LiveData liveData, r rVar, h.f.a.m mVar, LiveData liveData2) {
            this.f77041a = liveData;
            this.f77042b = rVar;
            this.f77043c = mVar;
            this.f77044d = liveData2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: androidx.lifecycle.r */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.u
        public final void onChanged(T t) {
            this.f77042b.setValue(this.f77043c.invoke(this.f77041a.getValue(), this.f77044d.getValue()));
        }
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveData f77045a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f77046b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f77047c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ LiveData f77048d;

        static {
            Covode.recordClassIndex(47615);
        }

        c(LiveData liveData, r rVar, h.f.a.m mVar, LiveData liveData2) {
            this.f77045a = liveData;
            this.f77046b = rVar;
            this.f77047c = mVar;
            this.f77048d = liveData2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: androidx.lifecycle.r */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.u
        public final void onChanged(K k2) {
            this.f77046b.setValue(this.f77047c.invoke(this.f77045a.getValue(), this.f77048d.getValue()));
        }
    }

    private void a(Integer num, Integer num2) {
        String str;
        String str2;
        String str3;
        if (!in.d()) {
            z.e eVar = new z.e();
            eVar.element = null;
            z.e eVar2 = new z.e();
            eVar2.element = null;
            JSONArray jSONArray = new JSONArray();
            String str4 = "on";
            if (num != null) {
                jSONArray.put(new JSONObject().put("field", "pers_ad_1p_mode").put("value", String.valueOf(num.intValue())));
                eVar.element = (T) d().getValue();
                d().setValue(num);
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                if (num.intValue() != 1) {
                    str2 = str4;
                } else {
                    str2 = "off";
                }
                com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("initial_status", str2);
                if (num.intValue() == 1) {
                    str3 = str4;
                } else {
                    str3 = "off";
                }
                com.ss.android.ugc.aweme.common.r.a("pa_setting_page_toggle1p", a2.a("final_status", str3).f66730a);
            }
            if (num2 != null) {
                jSONArray.put(new JSONObject().put("field", "pers_ad_3p_mode").put("value", String.valueOf(num2.intValue())));
                eVar2.element = (T) e().getValue();
                e().setValue(num2);
                com.ss.android.ugc.aweme.app.f.d dVar2 = new com.ss.android.ugc.aweme.app.f.d();
                if (num2.intValue() != 1) {
                    str = str4;
                } else {
                    str = "off";
                }
                com.ss.android.ugc.aweme.app.f.d a3 = dVar2.a("initial_status", str);
                if (num2.intValue() != 1) {
                    str4 = "off";
                }
                com.ss.android.ugc.aweme.common.r.a("pa_setting_page_toggle_3", a3.a("final_status", str4).f66730a);
            }
            String jSONArray2 = jSONArray.toString();
            l.b(jSONArray2, "");
            com.ss.android.ugc.aweme.compliance.common.b.a(jSONArray2, new i(this, num, num2, eVar, eVar2));
        }
    }

    public final void a(Integer num, Integer num2, Integer num3) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (!in.d()) {
            z.e eVar = new z.e();
            eVar.element = null;
            z.e eVar2 = new z.e();
            eVar2.element = null;
            z.e eVar3 = new z.e();
            eVar3.element = null;
            JSONArray jSONArray = new JSONArray();
            String str6 = "off";
            if (num != null) {
                jSONArray.put(new JSONObject().put("field", "pers_ad_main_mode").put("value", String.valueOf(num.intValue())));
                eVar.element = (T) a().getValue();
                a().setValue(num);
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                if (num.intValue() != 1) {
                    str4 = "on";
                } else {
                    str4 = str6;
                }
                com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("initial_status", str4);
                if (num.intValue() == 1) {
                    str5 = "on";
                } else {
                    str5 = str6;
                }
                com.ss.android.ugc.aweme.common.r.a("change_personalization_status", a2.a("final_status", str5).f66730a);
                if (num.intValue() == 1) {
                    com.ss.android.ugc.aweme.common.r.a("personalized_ads_on", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "personalization_data").f66730a);
                } else {
                    com.ss.android.ugc.aweme.common.r.a("personalized_ads_off", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "personalization_data").f66730a);
                }
            }
            if (num2 != null) {
                jSONArray.put(new JSONObject().put("field", "pers_ad_third_party_networks_mode").put("value", String.valueOf(num2.intValue())));
                eVar2.element = (T) b().getValue();
                b().setValue(num2);
                com.ss.android.ugc.aweme.app.f.d dVar2 = new com.ss.android.ugc.aweme.app.f.d();
                if (num2.intValue() != 1) {
                    str2 = "on";
                } else {
                    str2 = str6;
                }
                com.ss.android.ugc.aweme.app.f.d a3 = dVar2.a("initial_status", str2);
                if (num2.intValue() == 1) {
                    str3 = "on";
                } else {
                    str3 = str6;
                }
                com.ss.android.ugc.aweme.common.r.a("change_ad_third_party_network_status", a3.a("final_status", str3).f66730a);
            }
            if (num3 != null) {
                jSONArray.put(new JSONObject().put("field", "pers_ad_data_received_partner_mode").put("value", String.valueOf(num3.intValue())));
                eVar3.element = (T) c().getValue();
                c().setValue(num3);
                com.ss.android.ugc.aweme.app.f.d dVar3 = new com.ss.android.ugc.aweme.app.f.d();
                if (num != null && num.intValue() == 1) {
                    str = str6;
                } else {
                    str = "on";
                }
                com.ss.android.ugc.aweme.app.f.d a4 = dVar3.a("initial_status", str);
                if (num != null && num.intValue() == 1) {
                    str6 = "on";
                }
                com.ss.android.ugc.aweme.common.r.a("change_ad_data_from_partner_status", a4.a("final_status", str6).f66730a);
            }
            com.ss.android.ugc.aweme.compliance.common.c.a.a(num, b(), c());
            String jSONArray2 = jSONArray.toString();
            l.b(jSONArray2, "");
            com.ss.android.ugc.aweme.compliance.common.b.a(jSONArray2, new j(this, num, num2, num3, eVar, eVar2, eVar3));
        }
    }

    public static /* synthetic */ void a(PersonalizationViewModel personalizationViewModel, Integer num, Integer num2, int i2) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            num2 = null;
        }
        personalizationViewModel.a(null, num, num2);
    }

    public static /* synthetic */ void b(PersonalizationViewModel personalizationViewModel, Integer num, Integer num2, int i2) {
        if ((i2 & 1) != 0) {
            num = null;
        }
        if ((i2 & 2) != 0) {
            num2 = null;
        }
        personalizationViewModel.a(num, num2);
    }
}

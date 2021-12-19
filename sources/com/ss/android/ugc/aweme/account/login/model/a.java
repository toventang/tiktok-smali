package com.ss.android.ugc.aweme.account.login.model;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.c.c.z;
import com.ss.android.ugc.aweme.account.n.l;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f63491f = new a(R.string.h4d, "U", "US", "+1");

    /* renamed from: g  reason: collision with root package name */
    public static final a f63492g = new a(R.string.adg, "C", "CN", "+86");

    /* renamed from: h  reason: collision with root package name */
    public static z<a> f63493h;

    /* renamed from: i  reason: collision with root package name */
    public static final C1414a f63494i = new C1414a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f63495a;

    /* renamed from: b  reason: collision with root package name */
    public String f63496b;

    /* renamed from: c  reason: collision with root package name */
    public final String f63497c;

    /* renamed from: d  reason: collision with root package name */
    public final String f63498d;

    /* renamed from: e  reason: collision with root package name */
    public final String f63499e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f63495a == aVar.f63495a && l.a(this.f63496b, aVar.f63496b) && l.a(this.f63497c, aVar.f63497c) && l.a(this.f63498d, aVar.f63498d) && l.a(this.f63499e, aVar.f63499e);
    }

    public final int hashCode() {
        int i2 = this.f63495a * 31;
        String str = this.f63496b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f63497c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f63498d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f63499e;
        if (str4 != null) {
            i3 = str4.hashCode();
        }
        return hashCode3 + i3;
    }

    public final String toString() {
        return "CountryCode(nameRes=" + this.f63495a + ", nameIndex=" + this.f63496b + ", alpha2=" + this.f63497c + ", code=" + this.f63498d + ", countryName=" + this.f63499e + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.model.a$a  reason: collision with other inner class name */
    public static final class C1414a {
        static {
            Covode.recordClassIndex(39146);
        }

        private C1414a() {
        }

        public /* synthetic */ C1414a(byte b2) {
            this();
        }

        public static a a(int i2) {
            z<a> zVar = a.f63493h;
            if (zVar != null) {
                ArrayList arrayList = new ArrayList();
                for (T t : zVar) {
                    if (t.a() == i2) {
                        arrayList.add(t);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    return (a) arrayList2.get(0);
                }
            }
            return null;
        }
    }

    static {
        Covode.recordClassIndex(39145);
        z<a> of = z.of(new a(R.string.qe, "A", "AF", "+93"), new a(R.string.hg5, "A", "AX", "+358 18"), new a(R.string.ra, "A", "AL", "+355"), new a(R.string.sg, "A", "DZ", "+213"), new a(R.string.tp, "A", "AS", "+1 684"), new a(R.string.tz, "A", "AD", "+376"), new a(R.string.u0, "A", "AO", "+244"), new a(R.string.u1, "A", "AI", "+1 264"), new a(R.string.u5, "A", "AG", "+1 268"), new a(R.string.ve, "A", "AR", "+54"), new a(R.string.vf, "A", "AM", "+374"), new a(R.string.vg, "A", "AW", "+297"), new a(R.string.vh, "A", "SH", "+247"), new a(R.string.vy, "A", "AU", "+61"), new a(R.string.w0, "A", "AT", "+43"), new a(R.string.a24, "A", "AZ", "+994"), new a(R.string.a2n, "B", "BS", "+1 242"), new a(R.string.a2o, "B", "BH", "+973"), new a(R.string.a2p, "B", "BD", "+880"), new a(R.string.a2s, "B", "BB", "+1 246"), new a(R.string.a2t, "B", "AG", "+1 268"), new a(R.string.a4_, "B", "BY", "+375"), new a(R.string.a4a, "B", "BE", "+32"), new a(R.string.a4b, "B", "BZ", "+501"), new a(R.string.a4y, "B", "BJ", "+229"), new a(R.string.fap, "B", "BM", "+1 441"), new a(R.string.a51, "B", "BT", "+975"), new a(R.string.a6y, "B", "BO", "+591"), new a(R.string.a6z, "B", "BA", "+387"), new a(R.string.a70, "B", "BW", "+267"), new a(R.string.a79, "B", "BR", "+55"), new a(R.string.a7a, "B", "IO", "+246"), new a(R.string.a7b, "B", "VG", "+1 284"), new a(R.string.a7f, "B", "BN", "+673"), new a(R.string.a7m, "B", "BG", "+359"), new a(R.string.a7o, "B", "BF", "+226"), new a(R.string.a7p, "B", "BI", "+257"), new a(R.string.a90, "C", "KH", "+855"), new a(R.string.a97, "C", "CM", "+237"), new a(R.string.a9d, "C", "CA", "+1"), new a(R.string.a_1, "C", "CV", "+238"), new a(R.string.a_9, "C", "BQ", "+599 7"), new a(R.string.a_t, "C", "KY", "+1 345"), new a(R.string.aa3, "C", "CF", "+236"), new a(R.string.aa6, "C", "TD", "+235"), new a(R.string.adf, "C", "CL", "+56"), new a(R.string.adg, "C", "CN", "+86"), new a(R.string.ae9, "C", "CX", "+61"), new a(R.string.ah_, "C", "CC", "+61"), new a(R.string.ahs, "C", "CO", "+57"), new a(R.string.as5, "C", "KM", "+269"), new a(R.string.faq, "C", "CG", "+242"), new a(R.string.ass, "C", "CD", "+243"), new a(R.string.auh, "C", "CK", "+682"), new a(R.string.auu, "C", "CR", "+506"), new a(R.string.b3z, "C", "HR", "+385"), new a(R.string.b41, "C", "CW", "+599 9"), new a(R.string.b47, "C", "CY", "+357"), new a(R.string.far, "C", "CZ", "+420"), new a(R.string.b4_, "C", "CI", "+225"), new a(R.string.b6d, "D", "DK", "+45"), new a(R.string.b7b, "D", "DG", "+246"), new a(R.string.b9f, "D", "DJ", "+253"), new a(R.string.bap, "D", "DM", "+1 767"), new a(R.string.baq, "D", "DO", "+1"), new a(R.string.bjb, "E", "EC", "+593"), new a(R.string.bmb, "E", "EG", "+20"), new a(R.string.bmc, "E", "SV", "+503"), new a(R.string.boy, "E", "GQ", "+240"), new a(R.string.boz, "E", "ER", "+291"), new a(R.string.bph, "E", "EE", "+372"), new a(R.string.bpi, "E", "SZ", "+268"), new a(R.string.bpj, "E", "ET", "+251"), new a(R.string.brh, "F", "FK", "+500"), new a(R.string.bsc, "F", "FO", "+298"), new a(R.string.bwp, "F", "FJ", "+679"), new a(R.string.byf, "F", "FI", "+358"), new a(R.string.c15, "F", "FR", "+33"), new a(R.string.c1a, "F", "GF", "+594"), new a(R.string.c1b, "F", "PF", "+689"), new a(R.string.c3r, "G", "GA", "+241"), new a(R.string.c3s, "G", "GM", "+220"), new a(R.string.c4k, "G", "GE", "+995"), new a(R.string.c4l, "G", "DE", "+49"), new a(R.string.c4r, "G", "GH", "+233"), new a(R.string.c4s, "G", "GI", "+350"), new a(R.string.c5y, "G", "GR", "+30"), new a(R.string.c6b, "G", "GL", "+299"), new a(R.string.c6c, "G", "GD", "+1 473"), new a(R.string.c_0, "G", "GP", "+590"), new a(R.string.c_1, "G", "GU", "+1 671"), new a(R.string.c_2, "G", "GT", "+502"), new a(R.string.c_3, "G", "GG", "+44"), new a(R.string.c_o, "G", "GN", "+224"), new a(R.string.c_p, "G", "GW", "+245"), new a(R.string.c_q, "G", "GY", "+592"), new a(R.string.c_r, "H", "HT", "+509"), new a(R.string.cb9, "H", "HN", "+504"), new a(R.string.fas, "H", "HK", "+852"), new a(R.string.cbv, "H", "HU", "+36"), new a(R.string.cca, "I", "IS", "+354"), new a(R.string.cmn, "I", "IN", "+91"), new a(R.string.cmo, "I", "ID", "+62"), new a(R.string.cp0, "I", "IQ", "+964"), new a(R.string.cp1, "I", "IE", "+353"), new a(R.string.fat, "I", "IM", "+44"), new a(R.string.cp6, "I", "IL", "+972"), new a(R.string.cp7, "I", "IT", "+39"), new a(R.string.cp9, "J", "JM", "+1 876"), new a(R.string.cp_, "J", "JP", "+81"), new a(R.string.cpe, "J", "JE", "+44"), new a(R.string.cqc, "J", "JO", "+962"), new a(R.string.cqk, "K", "KZ", "+7 6"), new a(R.string.cqk, "K", "KZ", "+7 7"), new a(R.string.cql, "K", "KE", "+254"), new a(R.string.ct5, "K", "KI", "+686"), new a(R.string.fau, "K", "XK", "+383"), new a(R.string.cue, "K", "KW", "+965"), new a(R.string.cuf, "K", "KG", "+996"), new a(R.string.cuz, "L", "LA", "+856"), new a(R.string.cv6, "L", "LV", "+371"), new a(R.string.cvm, "L", "LB", "+961"), new a(R.string.cvo, "L", "LS", "+266"), new a(R.string.cvq, "L", "LR", "+231"), new a(R.string.cvx, "L", "LY", "+218"), new a(R.string.cvy, "L", "LI", "+423"), new a(R.string.cx2, "L", "LT", "+370"), new a(R.string.d1e, "L", "LU", "+352"), new a(R.string.fav, "M", "MO", "+853"), new a(R.string.d1h, "M", "MG", "+261"), new a(R.string.d1r, "M", "MW", "+265"), new a(R.string.d1s, "M", "MY", "+60"), new a(R.string.d1t, "M", "MV", "+960"), new a(R.string.d1u, "M", "ML", "+223"), new a(R.string.d1v, "M", "MT", "+356"), new a(R.string.d25, "M", "MH", "+692"), new a(R.string.d26, "M", "MQ", "+596"), new a(R.string.d2w, "M", "MR", "+222"), new a(R.string.d2x, "M", "MU", "+230"), new a(R.string.d33, "M", "YT", "+262"), new a(R.string.d4d, "M", "MX", "+52"), new a(R.string.d4i, "M", "FM", "+691"), new a(R.string.fdr, "M", "MD", "+373"), new a(R.string.d5p, "M", "MC", "+377"), new a(R.string.d5r, "M", "MN", "+976"), new a(R.string.d5s, "M", "ME", "+382"), new a(R.string.d5t, "M", "MS", "+1 664"), new a(R.string.d61, "M", "MA", "+212"), new a(R.string.d69, "M", "MZ", "+258"), new a(R.string.ddp, "M", "MM", "+95"), new a(R.string.ddv, "N", "NA", "+264"), new a(R.string.ddx, "N", "NR", "+674"), new a(R.string.de0, "N", "NP", "+977"), new a(R.string.de1, "N", "NL", "+31"), new a(R.string.de_, "N", "NC", "+687"), new a(R.string.dgo, "N", "NZ", "+64"), new a(R.string.dgy, "N", "NI", "+505"), new a(R.string.dh3, "N", "NE", "+227"), new a(R.string.dh4, "N", "NG", "+234"), new a(R.string.dh5, "N", "NU", "+683"), new a(R.string.diz, "N", "NF", "+672"), new a(R.string.d1g, "N", "MK", "+389"), new a(R.string.dj0, "N", "MP", "+1 670"), new a(R.string.dj1, "N", "NO", "+47"), new a(R.string.dm2, "O", "OM", "+968"), new a(R.string.do0, "P", "PK", "+92"), new a(R.string.do1, "P", "PW", "+680"), new a(R.string.do2, "P", "PS", "+970"), new a(R.string.do3, "P", "PA", "+507"), new a(R.string.do4, "P", "PG", "+675"), new a(R.string.do5, "P", "PY", "+595"), new a(R.string.dp6, "P", "PE", "+51"), new a(R.string.dpf, "P", "PH", "+63"), new a(R.string.dqv, "P", "PN", "+64"), new a(R.string.er_, "P", "PL", "+48"), new a(R.string.es_, "P", "PT", "+351"), new a(R.string.f13, "P", "PR", "+1 787"), new a(R.string.f13, "P", "PR", "+1 939"), new a(R.string.f6t, "Q", "QA", "+974"), new a(R.string.faw, "R", "SURVEY", "+262"), new a(R.string.ff6, "R", "RO", "+40"), new a(R.string.ffe, "R", "RU", "+7"), new a(R.string.fff, "R", "RW", "+250"), new a(R.string.ffs, "S", "WS", "+685"), new a(R.string.fft, "S", "SM", "+378"), new a(R.string.ffu, "S", "SA", "+966"), new a(R.string.fl_, "S", "SN", "+221"), new a(R.string.flc, "S", "RS", "+381"), new a(R.string.fse, "S", "SC", "+248"), new a(R.string.g0l, "S", "SL", "+232"), new a(R.string.g12, "S", "SG", "+65"), new a(R.string.g14, "S", "SX", "+1 721"), new a(R.string.g1h, "S", "SK", "+421"), new a(R.string.g1i, "S", "SI", "+386"), new a(R.string.g1y, "S", "SB", "+677"), new a(R.string.g1z, "S", "SO", "+252"), new a(R.string.g2o, "S", "ZA", "+27"), new a(R.string.g2p, "S", "GS", "+500"), new a(R.string.g2q, "S", "KR", "+82"), new a(R.string.g2s, "S", "SS", "+211"), new a(R.string.g2u, "S", "ES", "+34"), new a(R.string.g3s, "S", "LK", "+94"), new a(R.string.g52, "S", "BL", "+590"), new a(R.string.faz, "S", "SH", "+290"), new a(R.string.g54, "S", "KN", "+1 869"), new a(R.string.fax, "S", "LC", "+1 758"), new a(R.string.g56, "S", "MF", "+590"), new a(R.string.g57, "S", "PM", "+508"), new a(R.string.fb0, "S", "VC", "+1 784"), new a(R.string.ga8, "S", "SD", "+249"), new a(R.string.gav, "S", "SR", "+597"), new a(R.string.fb1, "S", "SJ", "+47 79"), new a(R.string.gay, "S", "SZ", "+268"), new a(R.string.gaz, "S", "SE", "+46"), new a(R.string.gbg, "S", "CH", "+41"), new a(R.string.fay, "S", "ST", "+239"), new a(R.string.gcv, "T", "TW", "+886"), new a(R.string.gcw, "T", "TJ", "+992"), new a(R.string.gcz, "T", "TZ", "+255"), new a(R.string.gev, "T", "TH", "+66"), new a(R.string.bf8, "T", "TL", "+670"), new a(R.string.gje, "T", "TG", "+228"), new a(R.string.gjf, "T", "TK", "+690"), new a(R.string.gjg, "T", "TO", "+676"), new a(R.string.gki, "T", "TT", "+1 868"), new a(R.string.gzx, "T", "TN", "+216"), new a(R.string.gzy, "T", "TR", "+90"), new a(R.string.gzz, "T", "TM", "+993"), new a(R.string.h00, "T", "TC", "+1 649"), new a(R.string.h08, "T", "TV", "+688"), new a(R.string.h23, "U", "VI", "+1 340"), new a(R.string.h29, "U", "UG", "+256"), new a(R.string.h3h, "U", "UA", "+380"), new a(R.string.h4b, "U", "AE", "+971"), new a(R.string.h4c, "U", "GB", "+44"), new a(R.string.h4d, "U", "US", "+1"), new a(R.string.h7j, "U", "UY", "+598"), new a(R.string.h8m, "U", "UZ", "+998"), new a(R.string.h93, "V", "VU", "+678"), new a(R.string.h95, "V", "VA", "+39 06 698"), new a(R.string.h95, "V", "VA", "+379"), new a(R.string.h97, "V", "VE", "+58"), new a(R.string.hca, "V", "VN", "+84"), new a(R.string.hdq, "W", "WF", "+681"), new a(R.string.fb2, "W", "EH", "+212"), new a(R.string.hfq, "Y", "YE", "+967"), new a(R.string.hg0, "Z", "ZM", "+260"), new a(R.string.hg3, "Z", "ZW", "+263"));
        l.b(of, "");
        f63493h = of;
    }

    public final int a() {
        try {
            return Integer.parseInt(p.a(p.a(this.f63498d, "+", "", false), " ", "", false));
        } catch (NumberFormatException unused) {
            return 86;
        }
    }

    public final void a(String str) {
        l.d(str, "");
        this.f63496b = str;
    }

    public static final void a(Context context) {
        a a2;
        l.d(context, "");
        if (b.b()) {
            HashMap<String, List<PhoneCountryData>> map = b.a().getMap();
            l.d(context, "");
            ArrayList arrayList = new ArrayList();
            if (map != null && !map.isEmpty()) {
                for (String str : map.keySet()) {
                    List<PhoneCountryData> list = map.get(str);
                    if (list != null && !list.isEmpty()) {
                        for (PhoneCountryData phoneCountryData : list) {
                            if (!TextUtils.isEmpty(phoneCountryData.getDisplayname()) || !TextUtils.isEmpty(phoneCountryData.getKey())) {
                                l.b(str, "");
                                if (!(com.ss.android.ugc.aweme.account.n.l.a(phoneCountryData, str, context) == null || (a2 = com.ss.android.ugc.aweme.account.n.l.a(phoneCountryData, str, context)) == null)) {
                                    arrayList.add(a2);
                                }
                            }
                        }
                    }
                }
                if (arrayList.size() > 1) {
                    n.a((List) arrayList, (Comparator) new l.a());
                }
            }
            z<a> copyOf = z.copyOf((Collection) arrayList);
            h.f.b.l.b(copyOf, "");
            h.f.b.l.d(copyOf, "");
            f63493h = copyOf;
        }
    }

    private /* synthetic */ a(int i2, String str, String str2, String str3) {
        this(i2, str, str2, str3, "");
    }

    public a(int i2, String str, String str2, String str3, String str4) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(str3, "");
        h.f.b.l.d(str4, "");
        this.f63495a = i2;
        this.f63496b = str;
        this.f63497c = str2;
        this.f63498d = str3;
        this.f63499e = str4;
    }
}

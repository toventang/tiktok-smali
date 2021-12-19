package com.ss.android.ugc.aweme.language;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.HashMap;

public class g implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, String> f107285a;

    private g() {
    }

    public static g get() {
        return a.INSTANCE.singleton;
    }

    enum a {
        INSTANCE;
        
        g singleton = new g((byte) 0);

        static {
            Covode.recordClassIndex(68638);
        }

        private a(String str) {
        }
    }

    public String getStoreIdc() {
        String g2 = d.g();
        if (!TextUtils.isEmpty(g2)) {
            return f107285a.get(g2);
        }
        return null;
    }

    static {
        Covode.recordClassIndex(68637);
        HashMap<String, String> hashMap = new HashMap<>();
        f107285a = hashMap;
        hashMap.put("AG", "maliva");
        f107285a.put("AI", "maliva");
        f107285a.put("BB", "maliva");
        f107285a.put("BM", "maliva");
        f107285a.put("BS", "maliva");
        f107285a.put("BZ", "maliva");
        f107285a.put("CA", "maliva");
        f107285a.put("CC", "maliva");
        f107285a.put("CR", "maliva");
        f107285a.put("CU", "maliva");
        f107285a.put("GD", "maliva");
        f107285a.put("GT", "maliva");
        f107285a.put("HN", "maliva");
        f107285a.put("HT", "maliva");
        f107285a.put("JM", "maliva");
        f107285a.put("MX", "maliva");
        f107285a.put("NI", "maliva");
        f107285a.put("PA", "maliva");
        f107285a.put("US", "maliva");
        f107285a.put("VE", "maliva");
        f107285a.put("AU", "maliva");
        f107285a.put("CK", "maliva");
        f107285a.put("CX", "maliva");
        f107285a.put("FJ", "maliva");
        f107285a.put("GU", "maliva");
        f107285a.put("NZ", "maliva");
        f107285a.put("PG", "maliva");
        f107285a.put("TO", "maliva");
        f107285a.put("AO", "maliva");
        f107285a.put("BF", "maliva");
        f107285a.put("BI", "maliva");
        f107285a.put("BJ", "maliva");
        f107285a.put("BW", "maliva");
        f107285a.put("CF", "maliva");
        f107285a.put("CG", "maliva");
        f107285a.put("CM", "maliva");
        f107285a.put("CV", "maliva");
        f107285a.put("DZ", "maliva");
        f107285a.put("EG", "maliva");
        f107285a.put("ET", "maliva");
        f107285a.put("GA", "maliva");
        f107285a.put("GH", "maliva");
        f107285a.put("GM", "maliva");
        f107285a.put("GN", "maliva");
        f107285a.put("GQ", "maliva");
        f107285a.put("KE", "maliva");
        f107285a.put("LY", "maliva");
        f107285a.put("MA", "maliva");
        f107285a.put("MG", "maliva");
        f107285a.put("MR", "maliva");
        f107285a.put("MU", "maliva");
        f107285a.put("MW", "maliva");
        f107285a.put("MZ", "maliva");
        f107285a.put("NA", "maliva");
        f107285a.put("NG", "maliva");
        f107285a.put("RW", "maliva");
        f107285a.put("SD", "maliva");
        f107285a.put("SN", "maliva");
        f107285a.put("SO", "maliva");
        f107285a.put("TN", "maliva");
        f107285a.put("TZ", "maliva");
        f107285a.put("UG", "maliva");
        f107285a.put("ZA", "maliva");
        f107285a.put("ZM", "maliva");
        f107285a.put("ZR", "maliva");
        f107285a.put("ZW", "maliva");
        f107285a.put("AQ", "maliva");
        f107285a.put("BV", "maliva");
        f107285a.put("AR", "maliva");
        f107285a.put("AW", "maliva");
        f107285a.put("BO", "maliva");
        f107285a.put("BR", "maliva");
        f107285a.put("CL", "maliva");
        f107285a.put("CO", "maliva");
        f107285a.put("EC", "maliva");
        f107285a.put("GY", "maliva");
        f107285a.put("PE", "maliva");
        f107285a.put("PY", "maliva");
        f107285a.put("UY", "maliva");
        f107285a.put("AD", "maliva");
        f107285a.put("AM", "maliva");
        f107285a.put("AT", "maliva");
        f107285a.put("BA", "maliva");
        f107285a.put("BE", "maliva");
        f107285a.put("BG", "maliva");
        f107285a.put("BY", "maliva");
        f107285a.put("CH", "maliva");
        f107285a.put("CZ", "maliva");
        f107285a.put("DE", "maliva");
        f107285a.put("DK", "maliva");
        f107285a.put("EE", "maliva");
        f107285a.put("ES", "maliva");
        f107285a.put("FI", "maliva");
        f107285a.put("FR", "maliva");
        f107285a.put("GB", "maliva");
        f107285a.put("GR", "maliva");
        f107285a.put("HR", "maliva");
        f107285a.put("HU", "maliva");
        f107285a.put("IE", "maliva");
        f107285a.put("IS", "maliva");
        f107285a.put("IT", "maliva");
        f107285a.put("LT", "maliva");
        f107285a.put("LV", "maliva");
        f107285a.put("MC", "maliva");
        f107285a.put("MD", "maliva");
        f107285a.put("MT", "maliva");
        f107285a.put("NL", "maliva");
        f107285a.put("NO", "maliva");
        f107285a.put("PL", "maliva");
        f107285a.put("PT", "maliva");
        f107285a.put("RO", "maliva");
        f107285a.put("RU", "maliva");
        f107285a.put("SE", "maliva");
        f107285a.put("SK", "maliva");
        f107285a.put("SM", "maliva");
        f107285a.put("UA", "maliva");
        f107285a.put("UK", "maliva");
        f107285a.put("YU", "maliva");
        f107285a.put("AE", "maliva");
        f107285a.put("AF", "maliva");
        f107285a.put("AL", "maliva");
        f107285a.put("AZ", "maliva");
        f107285a.put("BH", "maliva");
        f107285a.put("BN", "maliva");
        f107285a.put("BT", "maliva");
        f107285a.put("KZ", "maliva");
        f107285a.put("CY", "maliva");
        f107285a.put("IL", "maliva");
        f107285a.put("IQ", "maliva");
        f107285a.put("IR", "maliva");
        f107285a.put("JO", "maliva");
        f107285a.put("KP", "maliva");
        f107285a.put("KW", "maliva");
        f107285a.put("LB", "maliva");
        f107285a.put("LU", "maliva");
        f107285a.put("MN", "maliva");
        f107285a.put("MV", "maliva");
        f107285a.put("OM", "maliva");
        f107285a.put("QA", "maliva");
        f107285a.put("SA", "maliva");
        f107285a.put("SG", "maliva");
        f107285a.put("SY", "maliva");
        f107285a.put("TJ", "maliva");
        f107285a.put("TM", "maliva");
        f107285a.put("VA", "maliva");
        f107285a.put("YE", "maliva");
        f107285a.put("CN", "alisg");
        f107285a.put("HK", "alisg");
        f107285a.put("ID", "alisg");
        f107285a.put("IN", "alisg");
        f107285a.put("JP", "alisg");
        f107285a.put("KH", "alisg");
        f107285a.put("KR", "alisg");
        f107285a.put("LA", "alisg");
        f107285a.put("MO", "alisg");
        f107285a.put("MY", "alisg");
        f107285a.put("NP", "alisg");
        f107285a.put("PH", "alisg");
        f107285a.put("PK", "alisg");
        f107285a.put("TH", "alisg");
        f107285a.put("TW", "alisg");
        f107285a.put("VN", "alisg");
        f107285a.put("LK", "alisg");
        f107285a.put("MM", "alisg");
        f107285a.put("BD", "alisg");
    }

    /* synthetic */ g(byte b2) {
        this();
    }
}

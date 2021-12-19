package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import android.content.Context;
import com.bytedance.android.ecommerce.a.a.c;
import com.bytedance.android.ecommerce.a.a.d;
import com.bytedance.android.ecommerce.a.k;
import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.f;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n;
import com.ss.android.ugc.aweme.ecommerce.payment.a.b;
import com.ss.android.ugc.aweme.utils.dg;
import h.a.ag;
import h.f.b.l;
import h.p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final Context f85435a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f85436b;

    /* renamed from: c  reason: collision with root package name */
    public final String f85437c;

    /* renamed from: d  reason: collision with root package name */
    public f f85438d;

    /* renamed from: e  reason: collision with root package name */
    public final b f85439e;

    /* renamed from: f  reason: collision with root package name */
    public final n f85440f;

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, Object> f85441g;

    /* renamed from: h  reason: collision with root package name */
    public final String f85442h;

    /* renamed from: i  reason: collision with root package name */
    public final String f85443i;

    /* renamed from: j  reason: collision with root package name */
    public final u f85444j;

    /* renamed from: k  reason: collision with root package name */
    public final d f85445k = new d();

    /* renamed from: l  reason: collision with root package name */
    public final c f85446l = new c();

    /* renamed from: m  reason: collision with root package name */
    public Boolean f85447m;

    static {
        Covode.recordClassIndex(53471);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Context f85448a;

        /* renamed from: b  reason: collision with root package name */
        public List<String> f85449b;

        /* renamed from: c  reason: collision with root package name */
        public String f85450c;

        /* renamed from: d  reason: collision with root package name */
        public Boolean f85451d;

        /* renamed from: e  reason: collision with root package name */
        public f f85452e;

        /* renamed from: f  reason: collision with root package name */
        public u f85453f;

        /* renamed from: g  reason: collision with root package name */
        public o f85454g;

        /* renamed from: h  reason: collision with root package name */
        public n f85455h;

        /* renamed from: i  reason: collision with root package name */
        public HashMap<String, Object> f85456i;

        /* renamed from: j  reason: collision with root package name */
        public String f85457j;

        /* renamed from: k  reason: collision with root package name */
        public String f85458k;

        static {
            Covode.recordClassIndex(53472);
        }

        public final v a() {
            return new v(this);
        }

        public a(Context context) {
            l.d(context, "");
            this.f85448a = context;
        }

        public final a a(HashMap<String, Object> hashMap) {
            HashMap<String, Object> hashMap2 = new HashMap<>();
            if (hashMap != null) {
                hashMap2.putAll(hashMap);
            }
            this.f85456i = hashMap2;
            return this;
        }
    }

    private static p<String, String> a() {
        return new p<>("Referer", com.ss.android.ugc.aweme.ecommerce.util.b.a());
    }

    public v(a aVar) {
        b bVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        boolean z;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.p pVar;
        Boolean isChooseSave;
        com.ss.android.ugc.aweme.ecommerce.payment.a.d dVar;
        com.ss.android.ugc.aweme.ecommerce.payment.a.d dVar2;
        com.ss.android.ugc.aweme.ecommerce.payment.a.d dVar3;
        com.ss.android.ugc.aweme.ecommerce.payment.a.d dVar4;
        com.ss.android.ugc.aweme.ecommerce.payment.a.d dVar5;
        com.ss.android.ugc.aweme.ecommerce.payment.a.d dVar6;
        com.ss.android.ugc.aweme.ecommerce.payment.a.d dVar7;
        Object obj;
        l.d(aVar, "");
        this.f85435a = aVar.f85448a;
        this.f85436b = aVar.f85449b;
        this.f85437c = aVar.f85450c;
        this.f85438d = aVar.f85452e;
        this.f85444j = aVar.f85453f;
        o oVar = aVar.f85454g;
        String str17 = null;
        if (oVar != null) {
            try {
                obj = dg.a(dg.a().b(oVar), b.class);
            } catch (Exception unused) {
                obj = null;
            }
            bVar = (b) obj;
        } else {
            bVar = null;
        }
        this.f85439e = bVar;
        this.f85440f = aVar.f85455h;
        HashMap<String, Object> hashMap = aVar.f85456i;
        this.f85441g = hashMap == null ? new HashMap<>() : hashMap;
        this.f85442h = aVar.f85457j;
        this.f85443i = aVar.f85458k;
        k kVar = new k();
        if (bVar != null) {
            str = bVar.f86271d;
        } else {
            str = null;
        }
        kVar.f6989a = str;
        kVar.f6992d = "android";
        if (bVar != null) {
            str2 = bVar.f86273f;
        } else {
            str2 = null;
        }
        kVar.f6991c = str2;
        if (bVar != null) {
            str3 = bVar.f86274g;
        } else {
            str3 = null;
        }
        kVar.f6990b = str3;
        d dVar8 = this.f85445k;
        if (bVar == null || (dVar7 = bVar.f86277j) == null) {
            str4 = null;
        } else {
            str4 = dVar7.f86284b;
        }
        dVar8.f6897i = str4;
        d dVar9 = this.f85445k;
        if (bVar != null) {
            str5 = bVar.f86272e;
        } else {
            str5 = null;
        }
        dVar9.f6893e = str5;
        d dVar10 = this.f85445k;
        if (bVar != null) {
            str6 = bVar.f86270c;
        } else {
            str6 = null;
        }
        dVar10.f6894f = str6;
        d dVar11 = this.f85445k;
        if (bVar != null) {
            str7 = bVar.f86269b;
        } else {
            str7 = null;
        }
        dVar11.f6877a = str7;
        d dVar12 = this.f85445k;
        if (bVar == null || (dVar6 = bVar.f86277j) == null) {
            str8 = null;
        } else {
            str8 = dVar6.f86286d;
        }
        dVar12.f6896h = str8;
        this.f85445k.f6895g = kVar;
        this.f85445k.f6878b = String.valueOf(System.currentTimeMillis());
        this.f85445k.f6880d = ag.c(a());
        c cVar = this.f85446l;
        if (bVar != null) {
            str9 = bVar.f86270c;
        } else {
            str9 = null;
        }
        cVar.p = str9;
        c cVar2 = this.f85446l;
        if (bVar != null) {
            str10 = bVar.f86269b;
        } else {
            str10 = null;
        }
        cVar2.f6877a = str10;
        this.f85446l.f6878b = String.valueOf(System.currentTimeMillis());
        c cVar3 = this.f85446l;
        if (bVar == null || (dVar5 = bVar.f86277j) == null) {
            str11 = null;
        } else {
            str11 = dVar5.f86284b;
        }
        cVar3.f6885f = str11;
        c cVar4 = this.f85446l;
        if (bVar == null || (dVar4 = bVar.f86277j) == null) {
            str12 = null;
        } else {
            str12 = dVar4.f86283a;
        }
        cVar4.f6884e = str12;
        c cVar5 = this.f85446l;
        if (bVar == null || (dVar3 = bVar.f86277j) == null) {
            str13 = null;
        } else {
            str13 = dVar3.f86285c;
        }
        cVar5.f6887h = str13;
        c cVar6 = this.f85446l;
        if (bVar != null) {
            str14 = bVar.f86272e;
        } else {
            str14 = null;
        }
        cVar6.o = str14;
        c cVar7 = this.f85446l;
        if (bVar == null || (dVar2 = bVar.f86277j) == null) {
            str15 = null;
        } else {
            str15 = dVar2.f86286d;
        }
        cVar7.f6889j = str15;
        c cVar8 = this.f85446l;
        if (bVar != null) {
            str16 = bVar.f86278k;
        } else {
            str16 = null;
        }
        cVar8.f6891l = str16;
        c cVar9 = this.f85446l;
        if (!(bVar == null || (dVar = bVar.f86277j) == null)) {
            str17 = dVar.f86287e;
        }
        cVar9.n = str17;
        this.f85446l.f6888i = d.a(d.a(aVar.f85455h, true));
        c cVar10 = this.f85446l;
        n nVar = aVar.f85455h;
        if (nVar == null || (pVar = nVar.f85328a) == null || (isChooseSave = pVar.isChooseSave()) == null) {
            z = false;
        } else {
            z = isChooseSave.booleanValue();
        }
        cVar10.f6892m = z;
        this.f85446l.f6886g = kVar;
        this.f85446l.f6880d = ag.c(a());
    }
}

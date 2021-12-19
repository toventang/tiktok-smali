package com.google.android.datatransport.cct;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.b;
import com.google.android.datatransport.runtime.f;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    static final String f49298a;

    /* renamed from: b  reason: collision with root package name */
    static final String f49299b;

    /* renamed from: c  reason: collision with root package name */
    public static final Set<b> f49300c = Collections.unmodifiableSet(new HashSet(Arrays.asList(b.a("proto"), b.a("json"))));

    /* renamed from: d  reason: collision with root package name */
    public static final a f49301d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f49302e;

    /* renamed from: h  reason: collision with root package name */
    private static final String f49303h;

    /* renamed from: f  reason: collision with root package name */
    public final String f49304f;

    /* renamed from: g  reason: collision with root package name */
    public final String f49305g;

    @Override // com.google.android.datatransport.runtime.e
    public final String a() {
        return "cct";
    }

    @Override // com.google.android.datatransport.runtime.f
    public final Set<b> c() {
        return f49300c;
    }

    @Override // com.google.android.datatransport.runtime.e
    public final byte[] b() {
        String str = this.f49305g;
        if (str == null && this.f49304f == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f49304f;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return com.a.a("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    static {
        Covode.recordClassIndex(30855);
        String a2 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f49298a = a2;
        String a3 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f49299b = a3;
        String a4 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f49303h = a4;
        f49301d = new a(a2, null);
        f49302e = new a(a3, a4);
    }

    public a(String str, String str2) {
        this.f49304f = str;
        this.f49305g = str2;
    }
}

package net.openid.appauth;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f159735a = new HashSet(Arrays.asList("token_type", "access_token", "expires_in", "refresh_token", "id_token", "scope"));

    /* renamed from: b  reason: collision with root package name */
    public final r f159736b;

    /* renamed from: c  reason: collision with root package name */
    public final String f159737c;

    /* renamed from: d  reason: collision with root package name */
    public final String f159738d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f159739e;

    /* renamed from: f  reason: collision with root package name */
    public final String f159740f;

    /* renamed from: g  reason: collision with root package name */
    public final String f159741g;

    /* renamed from: h  reason: collision with root package name */
    public final String f159742h;

    /* renamed from: i  reason: collision with root package name */
    public final Map<String, String> f159743i;

    static {
        Covode.recordClassIndex(106106);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        r f159744a;

        /* renamed from: b  reason: collision with root package name */
        String f159745b;

        /* renamed from: c  reason: collision with root package name */
        String f159746c;

        /* renamed from: d  reason: collision with root package name */
        Long f159747d;

        /* renamed from: e  reason: collision with root package name */
        String f159748e;

        /* renamed from: f  reason: collision with root package name */
        String f159749f;

        /* renamed from: g  reason: collision with root package name */
        String f159750g;

        /* renamed from: h  reason: collision with root package name */
        Map<String, String> f159751h = Collections.emptyMap();

        static {
            Covode.recordClassIndex(106107);
        }

        public a(r rVar) {
            this.f159744a = (r) p.a(rVar, "request cannot be null");
        }
    }

    s(r rVar, String str, String str2, Long l2, String str3, String str4, String str5, Map<String, String> map) {
        this.f159736b = rVar;
        this.f159737c = str;
        this.f159738d = str2;
        this.f159739e = l2;
        this.f159740f = str3;
        this.f159741g = str4;
        this.f159742h = str5;
        this.f159743i = map;
    }
}

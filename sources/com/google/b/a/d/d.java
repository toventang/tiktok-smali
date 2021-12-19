package com.google.b.a.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.d.q;
import com.google.b.a.g.j;
import com.google.b.a.g.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

public class d extends j {
    @k(a = "Accept")
    private List<String> accept;
    @k(a = "Accept-Encoding")
    private List<String> acceptEncoding = new ArrayList(Collections.singleton("gzip"));
    @k(a = "Age")
    private List<Long> age;
    @k(a = "WWW-Authenticate")
    public List<String> authenticate;
    @k(a = "Authorization")
    public List<String> authorization;
    @k(a = "Cache-Control")
    private List<String> cacheControl;
    @k(a = "Content-Encoding")
    private List<String> contentEncoding;
    @k(a = "Content-Length")
    private List<Long> contentLength;
    @k(a = "Content-MD5")
    private List<String> contentMD5;
    @k(a = "Content-Range")
    private List<String> contentRange;
    @k(a = "Content-Type")
    private List<String> contentType;
    @k(a = "Cookie")
    private List<String> cookie;
    @k(a = "Date")
    private List<String> date;
    @k(a = "ETag")
    private List<String> etag;
    @k(a = "Expires")
    private List<String> expires;
    @k(a = "If-Match")
    private List<String> ifMatch;
    @k(a = "If-Modified-Since")
    private List<String> ifModifiedSince;
    @k(a = "If-None-Match")
    private List<String> ifNoneMatch;
    @k(a = "If-Range")
    private List<String> ifRange;
    @k(a = "If-Unmodified-Since")
    private List<String> ifUnmodifiedSince;
    @k(a = "Last-Modified")
    private List<String> lastModified;
    @k(a = q.f30918b)
    private List<String> location;
    @k(a = "MIME-Version")
    private List<String> mimeVersion;
    @k(a = "Range")
    private List<String> range;
    @k(a = "Retry-After")
    private List<String> retryAfter;
    @k(a = "User-Agent")
    private List<String> userAgent;

    static {
        Covode.recordClassIndex(33148);
    }

    @Override // com.google.b.a.g.j
    public final /* bridge */ /* synthetic */ j b() {
        return super.clone();
    }

    @Override // java.util.AbstractMap, com.google.b.a.g.j, java.lang.Object
    public /* synthetic */ Object clone() {
        return super.clone();
    }

    public d() {
        super(EnumSet.of(j.c.IGNORE_CASE));
    }

    public final String a() {
        String str;
        List<String> list = this.userAgent;
        if (list == null) {
            str = null;
        } else {
            str = list.get(0);
        }
        return str;
    }

    public final d a(String str) {
        this.userAgent = a((Object) str);
        return this;
    }

    private static <T> List<T> a(T t) {
        if (t == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(t);
        return arrayList;
    }

    @Override // com.google.b.a.g.j
    public final /* bridge */ /* synthetic */ j b(String str, Object obj) {
        return super.b(str, obj);
    }
}

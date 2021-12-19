package com.google.b.a.d;

import com.bytedance.covode.number.Covode;
import com.google.b.a.g.a.b;
import com.google.b.a.g.a.c;
import com.google.b.a.g.j;
import java.io.IOException;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class a extends j {

    /* renamed from: g  reason: collision with root package name */
    private static final b f53562g = new c("=&-_.!~*'()@:$,;/?:", false);

    /* renamed from: a  reason: collision with root package name */
    public String f53563a;

    /* renamed from: b  reason: collision with root package name */
    public String f53564b;

    /* renamed from: c  reason: collision with root package name */
    public String f53565c;

    /* renamed from: d  reason: collision with root package name */
    public int f53566d;

    /* renamed from: e  reason: collision with root package name */
    public List<String> f53567e;

    /* renamed from: f  reason: collision with root package name */
    public String f53568f;

    public a() {
        this.f53566d = -1;
    }

    public final String toString() {
        return a();
    }

    public final int hashCode() {
        return a().hashCode();
    }

    static {
        Covode.recordClassIndex(33141);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public a clone() {
        a aVar = (a) super.clone();
        if (this.f53567e != null) {
            aVar.f53567e = new ArrayList(this.f53567e);
        }
        return aVar;
    }

    private String e() {
        StringBuilder sb = new StringBuilder();
        if (this.f53567e != null) {
            a(sb);
        }
        a(entrySet(), sb);
        String str = this.f53568f;
        if (str != null) {
            sb.append('#').append(f53562g.a(str));
        }
        return sb.toString();
    }

    private String d() {
        StringBuilder sb = new StringBuilder();
        sb.append((String) com.google.b.a.f.a.a.a.a.b.a(this.f53563a));
        sb.append("://");
        String str = this.f53565c;
        if (str != null) {
            sb.append(com.google.b.a.g.a.a.f53598b.a(str)).append('@');
        }
        sb.append((String) com.google.b.a.f.a.a.a.a.b.a(this.f53564b));
        int i2 = this.f53566d;
        if (i2 != -1) {
            sb.append(':').append(i2);
        }
        return sb.toString();
    }

    public final String a() {
        String valueOf = String.valueOf(d());
        String valueOf2 = String.valueOf(e());
        if (valueOf2.length() != 0) {
            return valueOf.concat(valueOf2);
        }
        return new String(valueOf);
    }

    public a(String str) {
        this(a(str));
    }

    private static URL a(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof a)) {
            return false;
        }
        return a().equals(((a) obj).toString());
    }

    private a(URL url) {
        this(url.getProtocol(), url.getHost(), url.getPort(), url.getPath(), url.getRef(), url.getQuery(), url.getUserInfo());
    }

    private void a(StringBuilder sb) {
        int size = this.f53567e.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = this.f53567e.get(i2);
            if (i2 != 0) {
                sb.append('/');
            }
            if (str.length() != 0) {
                sb.append(com.google.b.a.g.a.a.f53597a.a(str));
            }
        }
    }

    @Override // com.google.b.a.g.j
    public final /* bridge */ /* synthetic */ j b(String str, Object obj) {
        return super.b(str, obj);
    }

    private static void a(Set<Map.Entry<String, Object>> set, StringBuilder sb) {
        boolean z = true;
        for (Map.Entry<String, Object> entry : set) {
            Object value = entry.getValue();
            if (value != null) {
                String a2 = com.google.b.a.g.a.a.f53599c.a(entry.getKey());
                if (value instanceof Collection) {
                    for (Object obj : (Collection) value) {
                        z = a(z, sb, a2, obj);
                    }
                } else {
                    z = a(z, sb, a2, value);
                }
            }
        }
    }

    private static boolean a(boolean z, StringBuilder sb, String str, Object obj) {
        if (z) {
            z = false;
            sb.append('?');
        } else {
            sb.append('&');
        }
        sb.append(str);
        String a2 = com.google.b.a.g.a.a.f53599c.a(obj.toString());
        if (a2.length() != 0) {
            sb.append('=').append(a2);
        }
        return z;
    }

    private a(String str, String str2, int i2, String str3, String str4, String str5, String str6) {
        ArrayList arrayList;
        String str7;
        boolean z;
        String substring;
        this.f53566d = -1;
        this.f53563a = str.toLowerCase();
        this.f53564b = str2;
        this.f53566d = i2;
        String str8 = null;
        if (str3 == null || str3.length() == 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            int i3 = 0;
            do {
                int indexOf = str3.indexOf(47, i3);
                if (indexOf != -1) {
                    z = true;
                    substring = str3.substring(i3, indexOf);
                } else {
                    z = false;
                    substring = str3.substring(i3);
                }
                arrayList.add(com.google.b.a.g.a.a.a(substring));
                i3 = indexOf + 1;
            } while (z);
        }
        this.f53567e = arrayList;
        if (str4 != null) {
            str7 = com.google.b.a.g.a.a.a(str4);
        } else {
            str7 = null;
        }
        this.f53568f = str7;
        if (str5 != null) {
            try {
                i.a(new StringReader(str5), this);
            } catch (IOException e2) {
                throw com.google.b.a.f.a.a.a.a.c.a(e2);
            }
        }
        this.f53565c = str6 != null ? com.google.b.a.g.a.a.a(str6) : str8;
    }
}

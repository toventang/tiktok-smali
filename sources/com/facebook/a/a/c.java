package com.facebook.a.a;

import com.bytedance.covode.number.Covode;
import com.facebook.internal.a.b.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static final Set<c> f46579a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    private static final String f46580b = c.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    private String f46581c;

    /* renamed from: d  reason: collision with root package name */
    private List<String> f46582d;

    /* renamed from: e  reason: collision with root package name */
    private String f46583e;

    /* access modifiers changed from: package-private */
    public final String b() {
        if (a.a(this)) {
            return null;
        }
        try {
            return this.f46581c;
        } catch (Throwable th) {
            a.a(th, this);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        if (a.a(this)) {
            return null;
        }
        try {
            return this.f46583e;
        } catch (Throwable th) {
            a.a(th, this);
            return null;
        }
    }

    static {
        Covode.recordClassIndex(28412);
    }

    public static Set<c> a() {
        if (a.a(c.class)) {
            return null;
        }
        try {
            return new HashSet(f46579a);
        } catch (Throwable th) {
            a.a(th, c.class);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final List<String> c() {
        if (a.a(this)) {
            return null;
        }
        try {
            return new ArrayList(this.f46582d);
        } catch (Throwable th) {
            a.a(th, this);
            return null;
        }
    }

    public static Set<String> e() {
        if (a.a(c.class)) {
            return null;
        }
        try {
            HashSet hashSet = new HashSet();
            for (c cVar : f46579a) {
                hashSet.add(cVar.b());
            }
            return hashSet;
        } catch (Throwable th) {
            a.a(th, c.class);
            return null;
        }
    }

    static void a(JSONObject jSONObject) {
        if (!a.a(c.class)) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject optJSONObject = jSONObject.optJSONObject(next);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("k");
                        String optString2 = optJSONObject.optString("v");
                        if (!optString.isEmpty()) {
                            f46579a.add(new c(next, Arrays.asList(optString.split(",")), optString2));
                        }
                    }
                }
            } catch (Throwable th) {
                a.a(th, c.class);
            }
        }
    }

    private c(String str, List<String> list, String str2) {
        this.f46581c = str;
        this.f46582d = list;
        this.f46583e = str2;
    }
}

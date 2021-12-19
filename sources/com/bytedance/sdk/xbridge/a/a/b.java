package com.bytedance.sdk.xbridge.a.a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.a.c;
import h.f.b.l;
import h.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f43904d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Map<String, List<a>> f43905a;

    /* renamed from: b  reason: collision with root package name */
    public LruCache<String, c> f43906b;

    /* renamed from: c  reason: collision with root package name */
    public final String f43907c;

    static {
        Covode.recordClassIndex(26827);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(26828);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final void a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        Iterator<String> keys;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!(jSONObject == null || (optJSONObject = jSONObject.optJSONObject("content")) == null || (keys = optJSONObject.keys()) == null)) {
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray optJSONArray = optJSONObject.optJSONArray(next);
                ArrayList arrayList = new ArrayList();
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        arrayList.add(b(optJSONArray != null ? optJSONArray.optJSONObject(i2) : null));
                    }
                }
                l.a((Object) next, "");
                linkedHashMap.put(next, arrayList);
            }
        }
        this.f43905a = linkedHashMap;
        LruCache<String, c> lruCache = this.f43906b;
        if (lruCache != null) {
            lruCache.evictAll();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006f A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.sdk.xbridge.a.a.a b(org.json.JSONObject r8) {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.xbridge.a.a.b.b(org.json.JSONObject):com.bytedance.sdk.xbridge.a.a.a");
    }

    public final c a(String str) {
        Matcher matcher;
        String str2 = null;
        c cVar = new c(c.a.PUBLIC, null, null, 6);
        Uri parse = Uri.parse(str);
        l.a((Object) parse, "");
        String scheme = parse.getScheme();
        String authority = parse.getAuthority();
        if (authority != null) {
            Object[] array = new h.m.l("[.]").split(authority, 0).toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                int length = strArr.length;
                if (length >= 2) {
                    str2 = length == 2 ? authority : strArr[length - 2] + "." + strArr[length - 1];
                }
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        }
        if (TextUtils.isEmpty(scheme) || TextUtils.isEmpty(authority) || str2 == null) {
            LruCache<String, c> lruCache = this.f43906b;
            if (lruCache != null) {
                lruCache.put(str, cVar);
            }
            return cVar;
        }
        List<a> list = this.f43905a.get(str2);
        if (list != null) {
            for (T t : list) {
                Pattern pattern = t.f43900a;
                if (!(pattern == null || (matcher = pattern.matcher(str)) == null || !matcher.find())) {
                    if (t.f43901b.compareTo((Enum) cVar.f43908a) >= 0) {
                        c.a aVar = t.f43901b;
                        l.c(aVar, "");
                        cVar.f43908a = aVar;
                    }
                    cVar.f43909b.addAll(t.f43902c);
                    cVar.f43910c.addAll(t.f43903d);
                }
            }
        }
        LruCache<String, c> lruCache2 = this.f43906b;
        if (lruCache2 != null) {
            lruCache2.put(str, cVar);
        }
        return cVar;
    }

    private b(String str, JSONObject jSONObject) {
        l.c(str, "");
        this.f43907c = str;
        this.f43905a = new LinkedHashMap();
        this.f43906b = new LruCache<>(16);
        a(jSONObject);
    }

    public /* synthetic */ b(String str, JSONObject jSONObject, byte b2) {
        this(str, jSONObject);
    }
}

package com.facebook.a.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.a.f.c;
import com.facebook.internal.a.b.a;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private a f46765a;

    /* renamed from: b  reason: collision with root package name */
    private a f46766b;

    /* renamed from: c  reason: collision with root package name */
    private a f46767c;

    /* renamed from: d  reason: collision with root package name */
    private a f46768d;

    /* renamed from: e  reason: collision with root package name */
    private a f46769e;

    /* renamed from: f  reason: collision with root package name */
    private a f46770f;

    /* renamed from: g  reason: collision with root package name */
    private a f46771g;

    /* renamed from: h  reason: collision with root package name */
    private a f46772h;

    /* renamed from: i  reason: collision with root package name */
    private a f46773i;

    /* renamed from: j  reason: collision with root package name */
    private a f46774j;

    /* renamed from: k  reason: collision with root package name */
    private a f46775k;

    /* renamed from: l  reason: collision with root package name */
    private final Map<String, a> f46776l = new HashMap();

    static {
        Covode.recordClassIndex(28491);
    }

    private static Map<String, String> a() {
        if (a.a(b.class)) {
            return null;
        }
        try {
            return new HashMap<String, String>() {
                /* class com.facebook.a.f.b.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(28493);
                }

                {
                    put("embedding.weight", "embed.weight");
                    put("dense1.weight", "fc1.weight");
                    put("dense2.weight", "fc2.weight");
                    put("dense3.weight", "fc3.weight");
                    put("dense1.bias", "fc1.bias");
                    put("dense2.bias", "fc2.bias");
                    put("dense3.bias", "fc3.bias");
                }
            };
        } catch (Throwable th) {
            a.a(th, b.class);
            return null;
        }
    }

    public static b a(File file) {
        if (a.a(b.class)) {
            return null;
        }
        try {
            try {
                return new b(b(file));
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            a.a(th, b.class);
            return null;
        }
    }

    private b(Map<String, a> map) {
        this.f46765a = map.get("embed.weight");
        this.f46766b = d.e(map.get("convs.0.weight"));
        this.f46767c = d.e(map.get("convs.1.weight"));
        this.f46768d = d.e(map.get("convs.2.weight"));
        this.f46769e = map.get("convs.0.bias");
        this.f46770f = map.get("convs.1.bias");
        this.f46771g = map.get("convs.2.bias");
        this.f46772h = d.d(map.get("fc1.weight"));
        this.f46773i = d.d(map.get("fc2.weight"));
        this.f46774j = map.get("fc1.bias");
        this.f46775k = map.get("fc2.bias");
        for (String str : new HashSet<String>() {
            /* class com.facebook.a.f.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(28492);
            }

            {
                add(c.a.MTML_INTEGRITY_DETECT.toKey());
                add(c.a.MTML_APP_EVENT_PREDICTION.toKey());
            }
        }) {
            String str2 = str + ".weight";
            String str3 = str + ".bias";
            a aVar = map.get(str2);
            a aVar2 = map.get(str3);
            if (aVar != null) {
                this.f46776l.put(str2, d.d(aVar));
            }
            if (aVar2 != null) {
                this.f46776l.put(str3, aVar2);
            }
        }
    }

    private static Map<String, a> b(File file) {
        Throwable th;
        int i2 = 43;
        MethodCollector.i(43);
        Map<String, a> map = null;
        if (a.a(b.class)) {
            MethodCollector.o(43);
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int available = fileInputStream.available();
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            byte[] bArr = new byte[available];
            dataInputStream.readFully(bArr);
            dataInputStream.close();
            if (available < 4) {
                try {
                    MethodCollector.o(43);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    a.a(th, b.class);
                    MethodCollector.o(i2);
                    return map;
                }
            } else {
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                int i3 = wrap.getInt();
                int i4 = i3 + 4;
                if (available < i4) {
                    MethodCollector.o(43);
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i3));
                JSONArray names = jSONObject.names();
                int length = names.length();
                String[] strArr = new String[length];
                for (int i5 = 0; i5 < length; i5++) {
                    strArr[i5] = names.getString(i5);
                }
                Arrays.sort(strArr);
                HashMap hashMap = new HashMap();
                Map<String, String> a2 = a();
                int i6 = 0;
                while (i6 < length) {
                    String str = strArr[i6];
                    JSONArray jSONArray = jSONObject.getJSONArray(str);
                    int length2 = jSONArray.length();
                    int[] iArr = new int[length2];
                    int i7 = 1;
                    for (int i8 = 0; i8 < length2; i8++) {
                        try {
                            iArr[i8] = jSONArray.getInt(i8);
                            i7 *= iArr[i8];
                        } catch (Exception unused) {
                            i2 = 43;
                            MethodCollector.o(i2);
                            return null;
                        } catch (Throwable th3) {
                            th = th3;
                            i2 = 43;
                            map = null;
                            a.a(th, b.class);
                            MethodCollector.o(i2);
                            return map;
                        }
                    }
                    int i9 = i7 * 4;
                    int i10 = i4 + i9;
                    if (i10 > available) {
                        i2 = 43;
                        try {
                            MethodCollector.o(43);
                            return null;
                        } catch (Throwable th4) {
                            th = th4;
                            map = null;
                            a.a(th, b.class);
                            MethodCollector.o(i2);
                            return map;
                        }
                    } else {
                        ByteBuffer wrap2 = ByteBuffer.wrap(bArr, i4, i9);
                        wrap2.order(ByteOrder.LITTLE_ENDIAN);
                        a aVar = new a(iArr);
                        wrap2.asFloatBuffer().get(aVar.f46762a, 0, i7);
                        if (a2.containsKey(str)) {
                            str = a2.get(str);
                        }
                        hashMap.put(str, aVar);
                        i6++;
                        i4 = i10;
                        i2 = 43;
                    }
                }
                MethodCollector.o(i2);
                return hashMap;
            }
        } catch (Exception unused2) {
            MethodCollector.o(i2);
            return null;
        }
    }

    public final a a(a aVar, String[] strArr, String str) {
        if (a.a(this)) {
            return null;
        }
        try {
            a b2 = d.b(d.a(strArr, this.f46765a), this.f46766b);
            d.a(b2, this.f46769e);
            d.a(b2);
            a b3 = d.b(b2, this.f46767c);
            d.a(b3, this.f46770f);
            d.a(b3);
            a a2 = d.a(b3, 2);
            a b4 = d.b(a2, this.f46768d);
            d.a(b4, this.f46771g);
            d.a(b4);
            a a3 = d.a(b2, b2.f46763b[1]);
            a a4 = d.a(a2, a2.f46763b[1]);
            a a5 = d.a(b4, b4.f46763b[1]);
            d.b(a3);
            d.b(a4);
            d.b(a5);
            a a6 = d.a(d.a(new a[]{a3, a4, a5, aVar}), this.f46772h, this.f46774j);
            d.a(a6);
            a a7 = d.a(a6, this.f46773i, this.f46775k);
            d.a(a7);
            a aVar2 = this.f46776l.get(str + ".weight");
            a aVar3 = this.f46776l.get(str + ".bias");
            if (aVar2 == null || aVar3 == null) {
                return null;
            }
            a a8 = d.a(a7, aVar2, aVar3);
            d.c(a8);
            return a8;
        } catch (Throwable th) {
            a.a(th, this);
            return null;
        }
    }
}

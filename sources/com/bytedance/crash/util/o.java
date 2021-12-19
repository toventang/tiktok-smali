package com.bytedance.crash.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final Writer f28003a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a> f28004b = new ArrayList();

    static {
        Covode.recordClassIndex(16392);
    }

    public final String toString() {
        return "";
    }

    public static void a(JSONObject jSONObject, Writer writer) {
        new o(writer).a(jSONObject);
        writer.flush();
    }

    private o a() {
        return a(a.EMPTY_ARRAY, "[");
    }

    private o b() {
        return a(a.EMPTY_OBJECT, "{");
    }

    private a c() {
        List<a> list = this.f28004b;
        return list.get(list.size() - 1);
    }

    /* access modifiers changed from: package-private */
    public enum a {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL;

        static {
            Covode.recordClassIndex(16393);
        }
    }

    private void d() {
        MethodCollector.i(11090);
        if (this.f28004b.isEmpty()) {
            MethodCollector.o(11090);
            return;
        }
        a c2 = c();
        if (c2 == a.EMPTY_ARRAY) {
            a(a.NONEMPTY_ARRAY);
            MethodCollector.o(11090);
        } else if (c2 == a.NONEMPTY_ARRAY) {
            this.f28003a.write(44);
            MethodCollector.o(11090);
        } else if (c2 == a.DANGLING_KEY) {
            this.f28003a.write(":");
            a(a.NONEMPTY_OBJECT);
            MethodCollector.o(11090);
        } else if (c2 == a.NULL) {
            MethodCollector.o(11090);
        } else {
            JSONException jSONException = new JSONException("Nesting problem");
            MethodCollector.o(11090);
            throw jSONException;
        }
    }

    private o(Writer writer) {
        this.f28003a = writer;
    }

    private o a(String str) {
        MethodCollector.i(10620);
        c();
        List<a> list = this.f28004b;
        list.remove(list.size() - 1);
        this.f28003a.write(str);
        MethodCollector.o(10620);
        return this;
    }

    private o c(String str) {
        MethodCollector.i(10931);
        a c2 = c();
        if (c2 == a.NONEMPTY_OBJECT) {
            this.f28003a.write(44);
        } else if (c2 != a.EMPTY_OBJECT) {
            JSONException jSONException = new JSONException("Nesting problem");
            MethodCollector.o(10931);
            throw jSONException;
        }
        a(a.DANGLING_KEY);
        b(str);
        MethodCollector.o(10931);
        return this;
    }

    private o a(Object obj) {
        MethodCollector.i(10771);
        if (obj instanceof JSONArray) {
            a((JSONArray) obj);
            MethodCollector.o(10771);
            return this;
        } else if (obj instanceof JSONObject) {
            a((JSONObject) obj);
            MethodCollector.o(10771);
            return this;
        } else {
            d();
            if (obj == null || obj == JSONObject.NULL) {
                this.f28003a.write("null");
            } else if (obj instanceof Boolean) {
                this.f28003a.write(String.valueOf(obj));
            } else if (obj instanceof Number) {
                this.f28003a.write(JSONObject.numberToString((Number) obj));
            } else {
                b(obj.toString());
            }
            MethodCollector.o(10771);
            return this;
        }
    }

    private void a(a aVar) {
        List<a> list = this.f28004b;
        list.set(list.size() - 1, aVar);
    }

    private void b(String str) {
        MethodCollector.i(10930);
        this.f28003a.write("\"");
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '\f') {
                this.f28003a.write("\\f");
            } else if (charAt != '\r') {
                if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                    switch (charAt) {
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            this.f28003a.write("\\b");
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            this.f28003a.write("\\t");
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            this.f28003a.write("\\n");
                            break;
                        default:
                            if (charAt <= 31) {
                                this.f28003a.write(com.a.a("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                                break;
                            }
                            break;
                    }
                } else {
                    this.f28003a.write(92);
                }
                this.f28003a.write(charAt);
            } else {
                this.f28003a.write("\\r");
            }
        }
        this.f28003a.write("\"");
        MethodCollector.o(10930);
    }

    private void a(JSONArray jSONArray) {
        a();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            a(jSONArray.get(i2));
        }
        a("]");
    }

    private void a(JSONObject jSONObject) {
        b();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            c(next).a(jSONObject.get(next));
        }
        a("}");
    }

    private o a(a aVar, String str) {
        MethodCollector.i(10465);
        d();
        this.f28004b.add(aVar);
        this.f28003a.write(str);
        MethodCollector.o(10465);
        return this;
    }

    public static void a(JSONArray jSONArray, Writer writer) {
        new o(writer).a(jSONArray);
        writer.flush();
    }
}

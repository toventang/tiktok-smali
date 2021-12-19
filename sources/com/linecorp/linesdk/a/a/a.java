package com.linecorp.linesdk.a.a;

import com.bytedance.covode.number.Covode;
import com.linecorp.linesdk.a.a.a.b;
import com.linecorp.linesdk.a.a.a.c;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

abstract class a<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final b f54945a;

    static {
        Covode.recordClassIndex(34509);
    }

    /* access modifiers changed from: package-private */
    public abstract T a(JSONObject jSONObject);

    a() {
        this(new b());
    }

    private a(b bVar) {
        this.f54945a = bVar;
    }

    @Override // com.linecorp.linesdk.a.a.a.c
    public final T a(InputStream inputStream) {
        try {
            return a(this.f54945a.a(inputStream));
        } catch (JSONException e2) {
            throw new IOException(e2);
        }
    }
}

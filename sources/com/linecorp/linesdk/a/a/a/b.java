package com.linecorp.linesdk.a.a.a;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

public final class b implements c<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final d f54951a = new d();

    static {
        Covode.recordClassIndex(34511);
    }

    /* renamed from: b */
    public final JSONObject a(InputStream inputStream) {
        try {
            return new JSONObject(this.f54951a.a(inputStream));
        } catch (JSONException e2) {
            throw new IOException(e2);
        }
    }
}

package com.vk.api.sdk.internal;

import android.util.JsonReader;
import android.util.JsonToken;
import android.util.MalformedJsonException;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.StringReader;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f156343a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(103828);
    }

    public static boolean a(String str, String str2) {
        JsonToken peek;
        l.c(str, "");
        l.c(str2, "");
        try {
            if (str.length() != 0) {
                JsonReader jsonReader = new JsonReader(new StringReader(str));
                if (jsonReader.hasNext() && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    jsonReader.beginObject();
                    while (jsonReader.hasNext() && (peek = jsonReader.peek()) != JsonToken.END_DOCUMENT) {
                        if (peek != JsonToken.NAME) {
                            jsonReader.skipValue();
                        } else if (l.a((Object) str2, (Object) jsonReader.nextName())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (MalformedJsonException e2) {
            throw new MalformedJsonException(e2.getMessage() + ". Json: '" + str + '\'');
        }
    }
}

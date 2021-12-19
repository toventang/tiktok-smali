package com.google.android.datatransport.cct.a;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.io.Reader;

public abstract class s {
    static {
        Covode.recordClassIndex(30884);
    }

    public abstract long a();

    public static s a(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return new i(Long.parseLong(jsonReader.nextString()));
                } else {
                    i iVar = new i(jsonReader.nextLong());
                    jsonReader.close();
                    return iVar;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }
}

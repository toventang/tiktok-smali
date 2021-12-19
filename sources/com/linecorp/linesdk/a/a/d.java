package com.linecorp.linesdk.a.a;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.a.a.a.c;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final c<LineProfile> f54964a = new a();

    /* renamed from: b  reason: collision with root package name */
    public final Uri f54965b;

    /* renamed from: c  reason: collision with root package name */
    public final com.linecorp.linesdk.a.a.a.a f54966c;

    static class a extends a<LineProfile> {
        static {
            Covode.recordClassIndex(34522);
        }

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: package-private */
        @Override // com.linecorp.linesdk.a.a.a
        public final /* synthetic */ LineProfile a(JSONObject jSONObject) {
            Uri parse;
            String optString = jSONObject.optString("pictureUrl", null);
            String string = jSONObject.getString("userId");
            String string2 = jSONObject.getString("displayName");
            if (optString == null) {
                parse = null;
            } else {
                parse = Uri.parse(optString);
            }
            return new LineProfile(string, string2, parse, jSONObject.optString("statusMessage", null));
        }
    }

    static {
        Covode.recordClassIndex(34521);
    }

    private d(Uri uri, com.linecorp.linesdk.a.a.a.a aVar) {
        this.f54965b = uri;
        this.f54966c = aVar;
    }

    public d(Context context, Uri uri) {
        this(uri, new com.linecorp.linesdk.a.a.a.a(context, "4.0.8"));
    }
}

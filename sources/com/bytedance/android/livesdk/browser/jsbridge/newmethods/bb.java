package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.gift.model.w;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.g;
import h.f.b.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class bb extends e<JSONObject, JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private String f14543a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.android.livesdk.gift.e.a f14544b = new a(this);

    static {
        Covode.recordClassIndex(8092);
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
    }

    public static final class a implements com.bytedance.android.livesdk.gift.e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bb f14545a;

        static {
            Covode.recordClassIndex(8093);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(bb bbVar) {
            this.f14545a = bbVar;
        }

        @Override // com.bytedance.android.livesdk.gift.e.a
        public final void a(Throwable th) {
            l.d(th, "");
            this.f14545a.a(th);
        }

        @Override // com.bytedance.android.livesdk.gift.e.a
        public final void a(w wVar) {
            l.d(wVar, "");
            if (h.a(wVar.o)) {
                this.f14545a.a(new AssertionError());
            } else {
                this.f14545a.a(wVar);
            }
        }
    }

    public final void a(Throwable th) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 0);
            if (th instanceof com.bytedance.android.live.a.a.a) {
                jSONObject.put("error_code", ((com.bytedance.android.live.a.a.a) th).getErrorCode());
            }
            finishWithResult(jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x015b, code lost:
        if (r7 == false) goto L_0x015d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x014e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.android.livesdk.gift.model.w r11) {
        /*
        // Method dump skipped, instructions count: 366
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bb.a(com.bytedance.android.livesdk.gift.model.w):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.e
    public final /* synthetic */ void invoke(JSONObject jSONObject, g gVar) {
        JSONObject jSONObject2 = jSONObject;
        l.d(jSONObject2, "");
        l.d(gVar, "");
        long optLong = jSONObject2.optLong("gift_id");
        int optInt = jSONObject2.optInt("gift_count");
        this.f14543a = jSONObject2.optString("gift_type");
        if (optLong <= 0 || optInt <= 0) {
            a(new IllegalArgumentException());
        } else {
            ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).sendGiftInternal(optLong, optInt, this.f14544b);
        }
    }
}

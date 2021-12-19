package com.ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.ss.android.ugc.aweme.app.d;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.utils.el;
import h.f.b.l;
import h.m.p;
import org.json.JSONObject;

public final class OpenSchemaMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69123b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f69124c = "openSchema";

    /* renamed from: d  reason: collision with root package name */
    private k.a f69125d = k.a.PROTECT;

    static {
        Covode.recordClassIndex(42627);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42628);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f69125d;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69124c;
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OpenSchemaMethod f69126a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f69127b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f69128c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ BaseBridgeMethod.a f69129d;

        static {
            Covode.recordClassIndex(42629);
        }

        b(OpenSchemaMethod openSchemaMethod, String str, String str2, BaseBridgeMethod.a aVar) {
            this.f69126a = openSchemaMethod;
            this.f69127b = str;
            this.f69128c = str2;
            this.f69129d = aVar;
        }

        public final void run() {
            String str;
            IBulletService a2 = com.ss.android.ugc.aweme.bullet.b.a();
            String str2 = this.f69127b;
            if (str2 == null) {
                str2 = "";
            }
            Activity a3 = a2.a(str2);
            Context e2 = this.f69126a.e();
            if ((e2 instanceof Activity) && a3 == null) {
                a3 = (Activity) e2;
            }
            if (TextUtils.isEmpty(this.f69128c) || a3 == null) {
                this.f69129d.a(-1, "schema is not legal");
                return;
            }
            String str3 = this.f69128c;
            if (str3 != null && p.b(str3, "aweme://live/", false)) {
                Uri parse = Uri.parse(this.f69128c);
                String queryParameter = parse.getQueryParameter("room_id");
                String queryParameter2 = parse.getQueryParameter("user_id");
                if (!TextUtils.isEmpty(queryParameter) || !TextUtils.isEmpty(queryParameter2)) {
                    d.a.a((Context) a3, p.a(this.f69128c, "aweme:", "sslocal:", false), (String) null, false);
                    this.f69129d.a((Object) new JSONObject());
                    return;
                }
                this.f69129d.a(-1, "");
            } else if (el.a(this.f69128c)) {
                ILiveOuterService s = LiveOuterService.s();
                l.b(s, "");
                if (s.d().f(this.f69128c)) {
                    this.f69129d.a((Object) new JSONObject());
                } else {
                    this.f69129d.a(-1, "");
                }
            } else if (com.ss.android.ugc.aweme.fe.method.l.a(this.f69128c)) {
                this.f69129d.a((Object) new JSONObject());
            } else {
                if (!OpenSchemaMethod.a(a3, this.f69128c)) {
                    String str4 = this.f69128c;
                    if (str4 != null) {
                        str = p.a(str4, "aweme", "sslocal");
                    } else {
                        str = null;
                    }
                    if (!d.a.a((Context) a3, str, (String) null, false)) {
                        this.f69129d.a(-1, "");
                        return;
                    }
                }
                this.f69129d.a((Object) new JSONObject());
            }
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.d(aVar, "");
        this.f69125d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenSchemaMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    private final void b(String str) {
        String str2;
        Context e2 = e();
        if (!(e2 instanceof Activity)) {
            a((Context) null, str);
        } else if (!com.ss.android.ugc.aweme.fe.method.l.c(str) && !a(e2, str)) {
            if (str != null) {
                str2 = p.a(str, "aweme", "sslocal", false);
            } else {
                str2 = null;
            }
            d.a.a(e2, str2, (String) null, false);
        }
    }

    public static boolean a(Context context, String str) {
        if (context instanceof Activity) {
            return t.a(t.a(), (Activity) context, str);
        }
        return t.a(t.a(), str);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        String optString = jSONObject.optString("reactId");
        String optString2 = jSONObject.optString("schema");
        int i2 = b.f69190a[h().ordinal()];
        if (i2 == 1) {
            b(optString2);
        } else if (i2 == 2) {
            b(optString2);
            aVar.a((Object) new JSONObject());
        } else if (i2 == 3) {
            new Handler(Looper.getMainLooper()).post(new b(this, optString, optString2, aVar));
        }
    }
}

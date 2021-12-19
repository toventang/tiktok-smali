package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Activity;
import com.bytedance.android.live.base.model.user.SubscribeBadge;
import com.bytedance.android.live.n.aa;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.c;
import com.bytedance.android.live.wallet.g;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.web.jsbridge2.e;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

public final class ay extends e<JSONObject, Object> {

    /* renamed from: l  reason: collision with root package name */
    public static final a f14519l = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public c f14520a;

    /* renamed from: b  reason: collision with root package name */
    public g f14521b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.livesdk.wallet.c f14522c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.livesdk.wallet.c f14523d;

    /* renamed from: e  reason: collision with root package name */
    public String f14524e = "";

    /* renamed from: f  reason: collision with root package name */
    public String f14525f = "";

    /* renamed from: g  reason: collision with root package name */
    public String f14526g = "";

    /* renamed from: h  reason: collision with root package name */
    public String f14527h = "";

    /* renamed from: i  reason: collision with root package name */
    public boolean f14528i;

    /* renamed from: j  reason: collision with root package name */
    public String f14529j = "";

    /* renamed from: k  reason: collision with root package name */
    public String f14530k = "";

    static {
        Covode.recordClassIndex(8083);
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(8084);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        c cVar = this.f14520a;
        if (cVar != null) {
            cVar.b(this.f14521b);
        }
        this.f14520a = null;
    }

    public final void a(Object obj) {
        String str;
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_subscription_purchase_successfully").a().a("subscribe_type", this.f14529j);
        if (this.f14528i) {
            str = "coins";
        } else {
            str = "IAP";
        }
        a2.a("payment_method", str).b();
        if (!(obj instanceof SubscribeBadge)) {
            obj = null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", 1);
        if (obj != null) {
            DataChannelGlobal.f34575d.b(aa.class, obj);
        }
        finishWithRawResult(jSONObject);
        a();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.e
    public final /* synthetic */ void invoke(JSONObject jSONObject, com.bytedance.ies.web.jsbridge2.g gVar) {
        JSONObject jSONObject2 = jSONObject;
        l.d(jSONObject2, "");
        l.d(gVar, "");
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IWalletService.class);
        l.b(a2, "");
        this.f14520a = ((IWalletService) a2).getPipoPayHelper();
        int optInt = jSONObject2.optInt("action", -1);
        b bVar = new b(this, optInt, gVar);
        this.f14521b = bVar;
        c cVar = this.f14520a;
        if (cVar != null) {
            cVar.a(bVar);
        }
        if (optInt == 1) {
            String optString = jSONObject2.optString("subscribe_id");
            l.b(optString, "");
            this.f14524e = optString;
            String optString2 = jSONObject2.optString("single_purchase_id");
            l.b(optString2, "");
            this.f14525f = optString2;
            c cVar2 = this.f14520a;
            if (cVar2 != null) {
                cVar2.a(n.a(optString2));
            }
            c cVar3 = this.f14520a;
            if (cVar3 != null) {
                cVar3.b(n.a(this.f14524e));
            }
        } else if (optInt == 2) {
            String optString3 = jSONObject2.optString("subscribe_type");
            l.b(optString3, "");
            this.f14529j = optString3;
            if (gVar.f35646a instanceof Activity) {
                this.f14528i = false;
                String optString4 = jSONObject2.optString("to_uid");
                l.b(optString4, "");
                this.f14526g = optString4;
                c cVar4 = this.f14520a;
                if (cVar4 != null) {
                    String optString5 = jSONObject2.optString("product_id");
                    l.b(optString5, "");
                    String optString6 = jSONObject2.optString("sku_name");
                    l.b(optString6, "");
                    androidx.fragment.app.e a3 = p.a(gVar.f35646a);
                    if (a3 == null) {
                        l.b();
                    }
                    cVar4.a(optString4, optString5, optString6, a3);
                }
            }
        } else if (optInt == 3) {
            String optString7 = jSONObject2.optString("subscribe_type");
            l.b(optString7, "");
            this.f14529j = optString7;
            this.f14528i = true;
            String optString8 = jSONObject2.optString("to_uid");
            l.b(optString8, "");
            this.f14526g = optString8;
            c cVar5 = this.f14520a;
            if (cVar5 != null) {
                String optString9 = jSONObject2.optString("contract_id");
                l.b(optString9, "");
                cVar5.a(optString8, optString9);
            }
        }
    }

    public static final class b implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ay f14531a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f14532b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.web.jsbridge2.g f14533c;

        static {
            Covode.recordClassIndex(8085);
        }

        @Override // com.bytedance.android.live.wallet.g
        public final void a(int i2, Object obj) {
            com.bytedance.android.livesdk.wallet.c cVar;
            c cVar2;
            int i3 = this.f14532b;
            if (i3 == 1) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.bytedance.android.livesdk.wallet.Diamond>");
                List list = (List) obj;
                if (i2 == 1) {
                    this.f14531a.f14523d = (com.bytedance.android.livesdk.wallet.c) list.get(0);
                } else if (i2 == 4) {
                    this.f14531a.f14522c = (com.bytedance.android.livesdk.wallet.c) list.get(0);
                }
                com.bytedance.android.livesdk.wallet.c cVar3 = this.f14531a.f14523d;
                if (cVar3 != null && (cVar = this.f14531a.f14522c) != null) {
                    ay ayVar = this.f14531a;
                    l.b(this.f14533c.f35646a, "");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", 1);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("currency", cVar3.f22411g);
                    jSONObject2.put("price", cVar3.f22407c);
                    jSONObject2.put("price_amount_micros", cVar3.f22412h);
                    jSONObject2.put("sku_name", cVar3.f22413i);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("currency", cVar.f22411g);
                    jSONObject3.put("price", cVar.f22407c);
                    jSONObject3.put("price_amount_micros", cVar.f22412h);
                    jSONObject3.put("sku_name", cVar.f22413i);
                    jSONObject.put(ayVar.f14525f, jSONObject2);
                    jSONObject.put(ayVar.f14524e, jSONObject3);
                    ayVar.finishWithRawResult(jSONObject);
                    ayVar.a();
                }
            } else if (i3 != 2) {
                if (i3 == 3 && i2 == 3) {
                    this.f14531a.a(obj);
                }
            } else if (i2 == 2) {
                String str = this.f14531a.f14527h;
                if (str != null && (cVar2 = this.f14531a.f14520a) != null) {
                    cVar2.a(this.f14531a.f14526g, str);
                }
            } else if (i2 == 3) {
                this.f14531a.a(obj);
            } else if (i2 == 5) {
                ay ayVar2 = this.f14531a;
                if (!(obj instanceof String)) {
                    obj = null;
                }
                ayVar2.f14527h = (String) obj;
            }
        }

        b(ay ayVar, int i2, com.bytedance.ies.web.jsbridge2.g gVar) {
            this.f14531a = ayVar;
            this.f14532b = i2;
            this.f14533c = gVar;
        }

        @Override // com.bytedance.android.live.wallet.g
        public final void a(int i2, int i3, int i4, Exception exc, com.bytedance.android.livesdk.wallet.g gVar) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i3);
            if ((this.f14533c.f35646a instanceof Activity) && (i2 == 2 || i2 == 3)) {
                String str = "";
                if (exc instanceof com.bytedance.android.live.a.a.b.a) {
                    switch (((com.bytedance.android.live.a.a.a) exc).getErrorCode()) {
                        case 4025001:
                            str = "reach_Limit";
                            break;
                        case 4025002:
                            str = "risk";
                            break;
                    }
                } else if (i3 == 203) {
                    str = "google-apple";
                } else if (i3 == 206) {
                    str = "cancel";
                }
                ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).handleExceptionForAll(new com.bytedance.android.livesdk.wallet.a.a(i2, i3, i4, exc, false, str, 0, true), p.a(this.f14533c.f35646a));
                b.a.a("livesdk_subscribe_failed").a("failed_reason", str).a().b();
            } else if (i2 == 1 || i2 == 4) {
                jSONObject.put("message", this.f14533c.f35646a.getString(R.string.epc));
            }
            this.f14531a.finishWithRawResult(jSONObject);
            this.f14531a.a();
        }
    }
}

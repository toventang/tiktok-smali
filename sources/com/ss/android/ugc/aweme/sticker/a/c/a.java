package com.ss.android.ugc.aweme.sticker.a.c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.poi.PokerBundle;
import com.ss.android.ugc.tools.utils.q;
import h.c.b.a.k;
import h.f.a.m;
import h.f.b.l;
import h.p;
import h.r;
import h.z;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;
import kotlinx.coroutines.internal.o;
import org.json.JSONObject;

public final class a extends com.ss.android.ugc.aweme.sticker.a.a {

    /* renamed from: d  reason: collision with root package name */
    public static final C3505a f134714d = new C3505a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    String f134715b = "POKER";

    /* renamed from: c  reason: collision with root package name */
    public final Context f134716c;

    /* renamed from: e  reason: collision with root package name */
    private boolean f134717e;

    static {
        Covode.recordClassIndex(88049);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.a.c.a$a  reason: collision with other inner class name */
    public static final class C3505a {
        static {
            Covode.recordClassIndex(88050);
        }

        private C3505a() {
        }

        public /* synthetic */ C3505a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.a.a
    public final String a() {
        return this.f134715b;
    }

    @Override // com.ss.android.ugc.aweme.sticker.a.a
    public final boolean b() {
        return this.f134717e;
    }

    private static boolean c() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends k implements m<am, h.c.d<? super z>, Object> {
        int label;

        static {
            Covode.recordClassIndex(88053);
        }

        d(h.c.d dVar) {
            super(2, dVar);
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new d(dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((d) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                com.ss.android.ugc.aweme.poi_api.service.c.a().a(PrivacyCert.Builder.Companion.with("bpea-1082").usage("We plan to increase POI(point of interest) content creation and effect content diversity using AR technology, thus we need to apply GPS permission from users to get location information (GPS two decimal places, the user's true position deviation is 1 km) when  they use some POI-relevant AR effects. Common users also need to use the latitude and longitude information to experience the AR effect. ").tag("Init location sdk before geo").policies(PrivacyPolicyStore.getLatitudeAndLongitudePrivacyPolicy()).build());
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private static JSONObject a(PokerBundle pokerBundle) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adcode", pokerBundle.getAdcode());
        jSONObject.put("district", pokerBundle.getDistrict());
        jSONObject.put("country", pokerBundle.getCountry());
        jSONObject.put("province", pokerBundle.getProvince());
        jSONObject.put("city", pokerBundle.getCity());
        return jSONObject;
    }

    static final class c extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ int $arg2;
        final /* synthetic */ String $arg3;
        int label;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(88052);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, int i2, String str, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
            this.$arg2 = i2;
            this.$arg3 = str;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new c(this.this$0, this.$arg2, this.$arg3, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((c) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                this.label = 1;
                Object a2 = i.a(o.f159148a, new d(null), this);
                if (a2 != h.c.a.a.COROUTINE_SUSPENDED) {
                    a2 = z.f158842a;
                }
                if (a2 == obj2) {
                    return obj2;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else if (i2 == 2) {
                try {
                    r.a(obj);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    q.a(e2);
                    a aVar = this.this$0;
                    String jSONObject = aVar.a(1, new PokerBundle(null, null, null, null, null, 31, null)).toString();
                    l.b(jSONObject, "");
                    aVar.a((long) this.$arg2, jSONObject);
                }
                return z.f158842a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a aVar2 = this.this$0;
            int i3 = this.$arg2;
            String str = this.$arg3;
            this.label = 2;
            Object a3 = i.a(bf.f159041b, new b(aVar2, str, i3, null), this);
            if (a3 != h.c.a.a.COROUTINE_SUSPENDED) {
                a3 = z.f158842a;
            }
            if (a3 == obj2) {
                return obj2;
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ int $arg2;
        final /* synthetic */ String $arg3;
        int label;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(88051);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, String str, int i2, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
            this.$arg3 = str;
            this.$arg2 = i2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new b(this.this$0, this.$arg3, this.$arg2, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            int i2;
            if (this.label == 0) {
                r.a(obj);
                String str = this.$arg3;
                if (str != null) {
                    JSONObject optJSONObject = new JSONObject(str).optJSONObject("body");
                    if (optJSONObject != null) {
                        double optDouble = optJSONObject.optDouble("long_data");
                        double optDouble2 = optJSONObject.optDouble("lati_data");
                        if (Double.isNaN(optDouble) || Double.isNaN(optDouble2)) {
                            throw new IllegalArgumentException("require long or lati is null");
                        }
                        p pVar = new p(Double.valueOf(optDouble), Double.valueOf(optDouble2));
                        q.d("Effect interface: " + this.this$0.f134715b + " geocode spi call");
                        PokerBundle a2 = com.ss.android.ugc.aweme.poi_api.service.c.a().a("EffectPoker", ((Number) pVar.getSecond()).doubleValue(), ((Number) pVar.getFirst()).doubleValue());
                        if (a2 != null) {
                            a aVar = this.this$0;
                            long j2 = (long) this.$arg2;
                            if (TextUtils.isEmpty(a2.getAdcode()) || TextUtils.isEmpty(a2.getDistrict()) || TextUtils.isEmpty(a2.getCountry()) || TextUtils.isEmpty(a2.getProvince()) || TextUtils.isEmpty(a2.getCity())) {
                                i2 = 0;
                            } else {
                                i2 = 1;
                            }
                            String jSONObject = aVar.a(i2 ^ 1, a2).toString();
                            l.b(jSONObject, "");
                            aVar.a(j2, jSONObject);
                            return z.f158842a;
                        }
                        throw new IllegalAccessException("IPoiService geocode return null");
                    }
                    throw new IllegalArgumentException("require body is null");
                }
                throw new IllegalArgumentException("require arg3 is null");
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(com.bytedance.creativex.recorder.b.a.d dVar, Context context) {
        super(dVar);
        l.d(dVar, "");
        l.d(context, "");
        this.f134716c = context;
    }

    public final JSONObject a(int i2, PokerBundle pokerBundle) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("interface", this.f134715b);
        jSONObject.put("status", i2);
        jSONObject.put("body", a(pokerBundle));
        return jSONObject;
    }

    @Override // com.ss.android.ugc.aweme.sticker.a.a
    public final void a(int i2, String str) {
        if (!j.f107226e || !j.b() || j.c()) {
            j.f107226e = c();
        }
        if (!j.f107226e) {
            String jSONObject = a(2, new PokerBundle(null, null, null, null, null, 31, null)).toString();
            l.b(jSONObject, "");
            a((long) i2, jSONObject);
            return;
        }
        bz unused = i.a(bs.f159054a, null, null, new c(this, i2, str, null), 3);
    }
}

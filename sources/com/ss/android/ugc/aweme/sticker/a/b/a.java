package com.ss.android.ugc.aweme.sticker.a.b;

import android.content.Context;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.poi.GuitarBundle;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.tools.utils.q;
import h.c.b.a.k;
import h.f.a.m;
import h.f.b.l;
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
    public static boolean f134709d;

    /* renamed from: e  reason: collision with root package name */
    public static final C3504a f134710e = new C3504a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    String f134711b = "GUITAR";

    /* renamed from: c  reason: collision with root package name */
    public final Context f134712c;

    /* renamed from: f  reason: collision with root package name */
    private boolean f134713f;

    static {
        Covode.recordClassIndex(88044);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.a.b.a$a  reason: collision with other inner class name */
    public static final class C3504a {
        static {
            Covode.recordClassIndex(88045);
        }

        private C3504a() {
        }

        public /* synthetic */ C3504a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.a.a
    public final String a() {
        return this.f134711b;
    }

    @Override // com.ss.android.ugc.aweme.sticker.a.a
    public final boolean b() {
        return this.f134713f;
    }

    /* access modifiers changed from: package-private */
    public static final class d extends k implements m<am, h.c.d<? super z>, Object> {
        int label;

        static {
            Covode.recordClassIndex(88048);
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
                com.ss.android.ugc.aweme.poi_api.service.c.a().a(PrivacyCert.Builder.Companion.with("bpea-1079").usage("We plan to increase POI(point of interest) content creation and effect content diversity using AR technology, thus we need to apply GPS permission from users to get location information (GPS two decimal places, the user's true position deviation is 1 km) when  they use some POI-relevant AR effects. Common users also need to use the latitude and longitude information to experience the AR effect. ").tag("Init LocationSDK befotr get poi information").policies(PrivacyPolicyStore.getLatitudeAndLongitudePrivacyPolicy()).build());
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class c extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ int $arg2;
        int label;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(88047);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, int i2, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
            this.$arg2 = i2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new c(this.this$0, this.$arg2, dVar);
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
                    q.a("EffectGuitarHandler", e2);
                    a aVar = this.this$0;
                    String jSONObject = aVar.a(3, 0.0d, 0.0d).toString();
                    l.b(jSONObject, "");
                    aVar.a((long) this.$arg2, jSONObject);
                }
                return z.f158842a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a aVar2 = this.this$0;
            int i3 = this.$arg2;
            this.label = 2;
            Object a3 = i.a(bf.f159041b, new b(aVar2, i3, null), this);
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
        int label;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(88046);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, int i2, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
            this.$arg2 = i2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new b(this.this$0, this.$arg2, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            long j2;
            if (this.label == 0) {
                r.a(obj);
                q.d("Effect interface: " + this.this$0.f134711b + " fetchGuitar spi call");
                IPoiService a2 = com.ss.android.ugc.aweme.poi_api.service.c.a();
                Context context = this.this$0.f134712c;
                if (a.f134709d) {
                    j2 = 600000;
                } else {
                    j2 = 0;
                }
                GuitarBundle a3 = a2.a(context, "EffectGuitar", j2, PrivacyCert.Builder.Companion.with("bpea-1080").usage("We plan to increase POI(point of interest) content creation and effect content diversity using AR technology, thus we need to apply GPS permission from users to get location information (GPS two decimal places, the user's true position deviation is 1 km) when  they use some POI-relevant AR effects. Common users also need to use the latitude and longitude information to experience the AR effect. ").tag("").policies(PrivacyPolicyStore.getLatitudeAndLongitudePrivacyPolicy()).build());
                if (a3 != null) {
                    a aVar = this.this$0;
                    String jSONObject = aVar.a(0, a3.getLongitude(), a3.getLatitude()).toString();
                    l.b(jSONObject, "");
                    aVar.a((long) this.$arg2, jSONObject);
                    a.f134709d = true;
                    return z.f158842a;
                }
                throw new IllegalAccessException("IPoiService fetchGuitar return null");
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private static JSONObject a(double d2, double d3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("long_data", d2);
        jSONObject.put("lati_data", d3);
        return jSONObject;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(com.bytedance.creativex.recorder.b.a.d dVar, Context context) {
        super(dVar);
        l.d(dVar, "");
        l.d(context, "");
        this.f134712c = context;
    }

    @Override // com.ss.android.ugc.aweme.sticker.a.a
    public final void a(int i2, String str) {
        if (!com.ss.android.ugc.aweme.poi_api.service.c.a().b(this.f134712c)) {
            String jSONObject = a(1, 0.0d, 0.0d).toString();
            l.b(jSONObject, "");
            a((long) i2, jSONObject);
        } else if (!com.ss.android.ugc.aweme.poi_api.service.c.a().c(this.f134712c)) {
            String jSONObject2 = a(2, 0.0d, 0.0d).toString();
            l.b(jSONObject2, "");
            a((long) i2, jSONObject2);
        } else {
            bz unused = i.a(bs.f159054a, null, null, new c(this, i2, null), 3);
        }
    }

    public final JSONObject a(int i2, double d2, double d3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("interface", this.f134711b);
        jSONObject.put("permission", i2);
        jSONObject.put("body", a(d2, d3));
        return jSONObject;
    }
}

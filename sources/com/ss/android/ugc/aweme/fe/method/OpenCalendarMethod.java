package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import f.a.d.f;
import h.f.b.l;
import org.json.JSONObject;

public final class OpenCalendarMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f91110b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.liveevent.c f91111a;

    static {
        Covode.recordClassIndex(57325);
    }

    private OpenCalendarMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57326);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ OpenCalendarMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseCommonJavaMethod.a f91113a;

        static {
            Covode.recordClassIndex(57328);
        }

        c(BaseCommonJavaMethod.a aVar) {
            this.f91113a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            BaseCommonJavaMethod.a aVar = this.f91113a;
            if (aVar != null) {
                aVar.a(0, null);
            }
        }
    }

    static final class e<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseCommonJavaMethod.a f91115a;

        static {
            Covode.recordClassIndex(57330);
        }

        e(BaseCommonJavaMethod.a aVar) {
            this.f91115a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            BaseCommonJavaMethod.a aVar = this.f91115a;
            if (aVar != null) {
                aVar.a(0, null);
            }
        }
    }

    public OpenCalendarMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseCommonJavaMethod.a f91112a;

        static {
            Covode.recordClassIndex(57327);
        }

        b(BaseCommonJavaMethod.a aVar) {
            this.f91112a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put("add_result", ((com.ss.android.ugc.aweme.liveevent.d) obj).getValue());
            BaseCommonJavaMethod.a aVar = this.f91112a;
            if (aVar != null) {
                aVar.a(jSONObject);
            }
        }
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseCommonJavaMethod.a f91114a;

        static {
            Covode.recordClassIndex(57329);
        }

        d(BaseCommonJavaMethod.a aVar) {
            this.f91114a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            l.b(bool, "");
            if (bool.booleanValue()) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            jSONObject.put("status", i2);
            BaseCommonJavaMethod.a aVar = this.f91114a;
            if (aVar != null) {
                aVar.a(jSONObject);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        if (this.f91111a == null) {
            Activity a2 = com.ss.android.ugc.aweme.base.a.e.a((Context) this.mContextRef.get());
            if (a2 != null) {
                this.f91111a = new com.ss.android.ugc.aweme.liveevent.c(a2);
            } else {
                return;
            }
        }
        com.ss.android.ugc.aweme.liveevent.e eVar = (com.ss.android.ugc.aweme.liveevent.e) e.a.f9628b.a(String.valueOf(jSONObject), com.ss.android.ugc.aweme.liveevent.e.class);
        String str = eVar.f108664a;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 96417) {
                if (hashCode == 102230 && str.equals("get")) {
                    com.ss.android.ugc.aweme.liveevent.c cVar = this.f91111a;
                    if (cVar == null) {
                        l.a("calendarManager");
                    }
                    cVar.a().a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new d(aVar), new e(aVar));
                    return;
                }
            } else if (str.equals("add")) {
                com.ss.android.ugc.aweme.liveevent.c cVar2 = this.f91111a;
                if (cVar2 == null) {
                    l.a("calendarManager");
                }
                l.b(eVar, "");
                cVar2.b(eVar).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(aVar), new c(aVar));
                return;
            }
        }
        if (aVar != null) {
            aVar.a(0, null);
        }
    }
}

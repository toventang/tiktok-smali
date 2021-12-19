package com.ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import f.a.d.f;
import h.f.b.l;
import org.json.JSONObject;

public final class OpenCalendarMethod extends BaseBridgeMethod implements au {

    /* renamed from: c  reason: collision with root package name */
    public static final a f69012c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.liveevent.c f69013b;

    /* renamed from: d  reason: collision with root package name */
    private final String f69014d = "calendarOperation";

    static {
        Covode.recordClassIndex(42555);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42556);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69014d;
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseBridgeMethod.a f69016a;

        static {
            Covode.recordClassIndex(42558);
        }

        c(BaseBridgeMethod.a aVar) {
            this.f69016a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f69016a.a(0, null);
        }
    }

    static final class e<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseBridgeMethod.a f69018a;

        static {
            Covode.recordClassIndex(42560);
        }

        e(BaseBridgeMethod.a aVar) {
            this.f69018a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f69018a.a(0, null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenCalendarMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseBridgeMethod.a f69015a;

        static {
            Covode.recordClassIndex(42557);
        }

        b(BaseBridgeMethod.a aVar) {
            this.f69015a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put("add_result", ((com.ss.android.ugc.aweme.liveevent.d) obj).getValue());
            this.f69015a.a(jSONObject);
        }
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseBridgeMethod.a f69017a;

        static {
            Covode.recordClassIndex(42559);
        }

        d(BaseBridgeMethod.a aVar) {
            this.f69017a = aVar;
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
            this.f69017a.a(jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        if (this.f69013b == null) {
            Activity a2 = com.ss.android.ugc.aweme.base.a.e.a((Context) this.f32005a.c(Context.class));
            if (a2 != null) {
                this.f69013b = new com.ss.android.ugc.aweme.liveevent.c(a2);
            } else {
                return;
            }
        }
        com.ss.android.ugc.aweme.liveevent.e eVar = (com.ss.android.ugc.aweme.liveevent.e) e.a.f9628b.a(jSONObject.toString(), com.ss.android.ugc.aweme.liveevent.e.class);
        String str = eVar.f108664a;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 96417) {
                if (hashCode == 102230 && str.equals("get")) {
                    com.ss.android.ugc.aweme.liveevent.c cVar = this.f69013b;
                    if (cVar == null) {
                        l.a("calendarManager");
                    }
                    l.b(cVar.a().a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new d(aVar), new e(aVar)), "");
                    return;
                }
            } else if (str.equals("add")) {
                com.ss.android.ugc.aweme.liveevent.c cVar2 = this.f69013b;
                if (cVar2 == null) {
                    l.a("calendarManager");
                }
                l.b(eVar, "");
                l.b(cVar2.b(eVar).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(aVar), new c(aVar)), "");
                return;
            }
        }
        aVar.a(0, null);
    }
}

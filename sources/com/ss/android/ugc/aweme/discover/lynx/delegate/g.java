package com.ss.android.ugc.aweme.discover.lynx.delegate;

import android.text.TextUtils;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.discover.eventcenter.EventCenter;
import h.f.b.l;
import org.json.JSONObject;

public final class g extends b implements u<b> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f81493a = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private EventCenter f81494c;

    static {
        Covode.recordClassIndex(50651);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50652);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(com.ss.android.ugc.aweme.discover.lynx.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
        e eVar = bVar.f81410a;
        if (eVar != null) {
            EventCenter eventCenter = (EventCenter) ae.a(eVar, (ad.b) null).a(EventCenter.class);
            this.f81494c = eventCenter;
            if (eventCenter != null && !TextUtils.isEmpty("mix_feed_fragment_status")) {
                eventCenter.b("mix_feed_fragment_status").a(eVar, this, false);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(b bVar) {
        Boolean bool;
        String str;
        b bVar2 = bVar;
        if (bVar2 != null && l.a((Object) bVar2.f67014a, (Object) "mix_feed_fragment_status") && (bool = (Boolean) bVar2.a()) != null) {
            if (bool.booleanValue()) {
                str = "viewAppear";
            } else {
                str = "viewDisappear";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from", "mix");
            l.d(str, "");
            l.d(jSONObject, "");
            this.f81477b.a(str, jSONObject);
        }
    }
}

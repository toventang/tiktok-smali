package com.ss.android.ugc.aweme.fe.method;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.challenge.ui.a.b;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.im.service.b.d;
import h.f.b.ad;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class OpenConversationMethod extends BaseCommonJavaMethod implements au, i, j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91116a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, BaseCommonJavaMethod.a> f91117b;

    static {
        Covode.recordClassIndex(57331);
    }

    private OpenConversationMethod(byte b2) {
        this();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(403, new g(OpenConversationMethod.class, "onSelectedChatMsg", d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57332);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ OpenConversationMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public OpenConversationMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
        this.f91117b = new HashMap<>();
    }

    @r
    public final void onSelectedChatMsg(d dVar) {
        l.d(dVar, "");
        String str = dVar.f103831b;
        if (b.a(str)) {
            HashMap<String, BaseCommonJavaMethod.a> hashMap = this.f91117b;
            Objects.requireNonNull(hashMap, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
            if (hashMap.containsKey(str)) {
                HashMap<String, BaseCommonJavaMethod.a> hashMap2 = this.f91117b;
                Objects.requireNonNull(hashMap2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                BaseCommonJavaMethod.a aVar = (BaseCommonJavaMethod.a) ad.h(hashMap2).remove(str);
                if (aVar != null) {
                    if (b.a(dVar.f103830a)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.putOpt("msgList", dVar.f103830a);
                        aVar.a(jSONObject, 1, "");
                    } else {
                        aVar.a(0, "");
                    }
                }
            }
        }
        HashMap<String, BaseCommonJavaMethod.a> hashMap3 = this.f91117b;
        if (hashMap3 == null || hashMap3.isEmpty()) {
            EventBus.a().b(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
        if (r1 != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ac, code lost:
        if (r1 != null) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0095  */
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handle(org.json.JSONObject r10, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a r11) {
        /*
        // Method dump skipped, instructions count: 177
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.OpenConversationMethod.handle(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }
}

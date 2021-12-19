package com.ss.android.ugc.aweme.im.sdk.chat.b.c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.t;
import f.a.d.f;
import h.f.b.l;
import h.q;
import h.r;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class h {

    /* renamed from: d  reason: collision with root package name */
    public static final a f100210d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ai f100211a;

    /* renamed from: b  reason: collision with root package name */
    public final String f100212b;

    /* renamed from: c  reason: collision with root package name */
    public final i f100213c;

    static {
        Covode.recordClassIndex(63874);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(63875);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f100215a = new c();

        static {
            Covode.recordClassIndex(63877);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            HashMap hashMap = new HashMap();
            hashMap.put("error_msg", "report error send msg");
            l.b(th, "");
            hashMap.put("error_desc", th);
            com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b("send_msg_error", hashMap);
            com.ss.android.ugc.aweme.framework.a.a.a((Exception) new RuntimeException(th));
        }
    }

    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f100214a;

        static {
            Covode.recordClassIndex(63876);
        }

        public b(h hVar) {
            this.f100214a = hVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            String a2;
            ai aiVar = (ai) obj;
            l.b(aiVar, "");
            BaseContent b2 = b.f.b(aiVar);
            String a3 = t.a(aiVar, b2);
            i iVar = this.f100214a.f100213c;
            l.b(a3, "");
            if (iVar.shouldReport(a3)) {
                Map<String, String> makeParams = this.f100214a.f100213c.makeParams(aiVar, b2, a3, this.f100214a.f100212b);
                String str2 = null;
                if (!a3.equals("live_room") && !a3.equals("ttFarm") && (a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.b.a.a(com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.f102187a)) != null && a2.length() > 0) {
                    makeParams.put("enter_from", a2);
                }
                if (aiVar.getReferenceInfo() != null) {
                    str = "1";
                } else {
                    str = "0";
                }
                makeParams.put("if_contain_quote", str);
                makeParams.put("from_group_id", aiVar.getLocalExt().get("from_group_id"));
                makeParams.put("from_story_collection_id", aiVar.getLocalExt().get("from_story_collection_id"));
                makeParams.put("is_share_pop_up", aiVar.getLocalExt().get("is_share_pop_up"));
                try {
                    String optString = new JSONObject(aiVar.getContent()).optString("link_url");
                    if (optString != null) {
                        if (Uri.parse(optString).getQueryParameter("_is_eoy") != null) {
                            makeParams.put("message_type", "eoy_hub");
                        }
                        str2 = optString;
                    }
                    q.m223constructorimpl(str2);
                } catch (Throwable th) {
                    q.m223constructorimpl(r.a(th));
                }
                this.f100214a.f100213c.beforeReport(aiVar);
                com.ss.android.ugc.aweme.common.r.a("send_message", makeParams);
            }
        }
    }

    public h(ai aiVar, String str, i iVar) {
        l.d(str, "");
        l.d(iVar, "");
        this.f100211a = aiVar;
        this.f100212b = str;
        this.f100213c = iVar;
    }
}

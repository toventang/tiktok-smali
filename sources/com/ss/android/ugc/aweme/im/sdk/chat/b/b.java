package com.ss.android.ugc.aweme.im.sdk.chat.b;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.ies.im.core.api.b.a.d;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.im.core.d.ag;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.an;
import com.bytedance.im.core.d.ar;
import com.bytedance.im.core.d.ay;
import com.bytedance.im.core.d.h;
import com.ss.android.ugc.aweme.im.sdk.chat.b.c.h;
import com.ss.android.ugc.aweme.im.sdk.chat.b.c.i;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseExtra;
import com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.c;
import com.ss.android.ugc.aweme.im.sdk.common.controller.j.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.d.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.j;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.x;
import com.ss.android.ugc.aweme.im.sdk.notification.a.e;
import com.ss.android.ugc.aweme.im.sdk.share.b.b.g;
import com.ss.android.ugc.aweme.im.service.IIMunder16Proxy;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import f.a.aa;
import f.a.ab;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final b f100116a = new b();

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(int i2, ai aiVar) {
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(ai aiVar, boolean z) {
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(List<ai> list, int i2, String str) {
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(List<ai> list, Map<String, ? extends Map<String, String>> map) {
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(List<ai> list, boolean z) {
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void b(List<ai> list, boolean z) {
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(63817);
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(ai aiVar) {
        h a2;
        if (aiVar != null && aiVar.getConversationId() != null && (a2 = a.C0745a.a().a(aiVar.getConversationId())) != null && a2.getLastMessage() == null) {
            c.e(a2);
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(int i2, an anVar) {
        if (anVar != null) {
            c.f101905b.a(anVar);
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(ai aiVar, Map<String, ? extends List<? extends ag>> map, Map<String, ? extends List<? extends ag>> map2) {
        c.f101905b.a(aiVar, map2, map);
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(List<ai> list, int i2, ar arVar) {
        IIMunder16Proxy under16Proxy;
        l.d(arVar, "");
        if (list == null) {
            com.ss.android.ugc.aweme.im.service.m.a.b("GlobalMsgObserver", "onGetMessage extra msgSource=".concat(String.valueOf(i2)));
            return;
        }
        com.ss.android.ugc.aweme.im.service.m.a.b("GlobalMsgObserver", "onGetMessage extra list size =" + list.size() + " msgSource=" + i2);
        com.ss.android.ugc.aweme.im.sdk.common.controller.g.a.a(list);
        e.f102841b.a(list, i2);
        l.d(list, "");
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.a.c.a() && !in.d()) {
            com.ss.android.ugc.aweme.im.service.e b2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b();
            if ((b2 == null || (under16Proxy = b2.getUnder16Proxy()) == null || !under16Proxy.d()) && i2 == 0) {
                com.ss.android.ugc.aweme.im.service.m.a.b("MediaPreloader", "onGetMessage from online");
                com.ss.android.ugc.aweme.im.sdk.chat.b.b.d.a(list);
            }
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(int i2, ai aiVar, ay ayVar) {
        String str;
        BaseExtra baseExtra;
        Activity j2;
        int i3;
        com.ss.android.ugc.aweme.im.service.m.a.b("GlobalMsgObserver", "onSendMsg: ".concat(String.valueOf(i2)));
        if (aiVar != null) {
            Map<String, String> localExt = aiVar.getLocalExt();
            if (localExt != null && !localExt.isEmpty()) {
                int msgStatus = aiVar.getMsgStatus();
                if (localExt.containsKey("s:send_response_check_msg")) {
                    try {
                        baseExtra = (BaseExtra) j.a(localExt.get("s:send_response_check_msg"), BaseExtra.class);
                    } catch (Exception unused) {
                        baseExtra = null;
                    }
                    if (msgStatus == 3 && baseExtra != null && (baseExtra.getStatusCode() == 7188 || baseExtra.getStatusCode() == 7187)) {
                        int statusCode = baseExtra.getStatusCode();
                        l.d(aiVar, "");
                        if (!com.ss.android.ugc.aweme.im.sdk.common.controller.j.a.f102339b.contains(aiVar)) {
                            com.ss.android.ugc.aweme.im.sdk.common.controller.j.a.f102339b.add(aiVar);
                        }
                        com.bytedance.ies.ugc.appcontext.d.a();
                        if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                            com.ss.android.ugc.aweme.lancet.j.f107226e = com.ss.android.ugc.aweme.im.sdk.common.controller.j.a.a();
                        }
                        if (!com.ss.android.ugc.aweme.lancet.j.f107226e) {
                            n.a(com.bytedance.ies.ugc.appcontext.d.a(), (int) R.string.de8);
                        } else if (!com.ss.android.ugc.aweme.im.sdk.common.controller.j.a.f102338a && (j2 = f.j()) != null) {
                            com.ss.android.ugc.aweme.im.sdk.common.controller.j.a.f102338a = true;
                            com.ss.android.ugc.aweme.im.service.e b2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b();
                            if (statusCode == 7188) {
                                i3 = 3059;
                            } else {
                                i3 = 3058;
                            }
                            b2.popCaptcha(j2, i3, new a.C2563a());
                        }
                    }
                }
            }
            l.d(aiVar, "");
            if (aiVar.getMsgStatus() == 1) {
                com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar = com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.f102187a;
                if (aVar == null || aVar.getEnterFrom() != 11) {
                    str = "click";
                } else {
                    str = "click_push";
                }
                i iVar = i.REAL_MESSAGE;
                l.d(str, "");
                l.d(iVar, "");
                com.ss.android.ugc.aweme.im.sdk.chat.b.c.h hVar = new com.ss.android.ugc.aweme.im.sdk.chat.b.c.h(aiVar, str, iVar);
                aa b3 = f.a.h.a.b(f.a.k.a.f158006c);
                l.b(b3, "");
                l.d(b3, "");
                if (hVar.f100211a == null) {
                    com.ss.android.ugc.aweme.im.service.m.a.e("message", "SendMessageParams report error,localMessage = null");
                } else {
                    ab.a(hVar.f100211a).a(b3).a(new h.b(hVar), h.c.f100215a);
                }
            } else if (aiVar.getMsgStatus() == 2 || aiVar.getMsgStatus() == 3) {
                l.d(aiVar, "");
                ab.a(aiVar).a(f.a.h.a.b(f.a.k.a.f158006c)).a(new a.C2568a(com.ss.android.ugc.aweme.im.sdk.iescore.b.f.f102816a.a(), SystemClock.uptimeMillis(), ayVar), a.b.f102410a);
            }
            g.a(aiVar);
            String localExtValue = aiVar.getLocalExtValue("process_id");
            if (localExtValue != null && localExtValue.length() != 0) {
                Iterator<Map.Entry<String, Bundle>> it = x.f102449a.entrySet().iterator();
                while (it.hasNext()) {
                    if (l.a((Object) localExtValue, (Object) it.next().getValue().getString("process_id"))) {
                        it.remove();
                    }
                }
            }
        }
    }
}

package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.v;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public final class bt {
    static {
        Covode.recordClassIndex(9137);
    }

    public static final class a extends m implements b<EmoteModel, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16498a = new a();

        static {
            Covode.recordClassIndex(9138);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(EmoteModel emoteModel) {
            EmoteModel emoteModel2 = emoteModel;
            l.d(emoteModel2, "");
            String str = emoteModel2.f7390g;
            l.b(str, "");
            return str;
        }
    }

    public static final HashMap<String, String> a(String str, long j2, String str2, String str3, String str4, int i2, boolean z) {
        String str5;
        p[] pVarArr = new p[7];
        pVarArr[0] = v.a("content", str);
        pVarArr[1] = v.a("room_id", String.valueOf(j2));
        pVarArr[2] = v.a("request_id", str2);
        pVarArr[3] = v.a("common_label_list", str3);
        pVarArr[4] = v.a("enter_source", str4);
        if (z) {
            str5 = "1";
        } else {
            str5 = "0";
        }
        pVarArr[5] = v.a("post_anyway", str5);
        pVarArr[6] = v.a("input_type", String.valueOf(i2));
        Map a2 = ag.a(pVarArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : a2.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new HashMap<>(linkedHashMap);
    }
}

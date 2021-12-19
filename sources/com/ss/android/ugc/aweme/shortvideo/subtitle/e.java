package com.ss.android.ugc.aweme.shortvideo.subtitle;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import h.f.b.l;
import org.json.JSONObject;

public final class e {
    static {
        Covode.recordClassIndex(85816);
    }

    public static final void a(int i2, d dVar) {
        l.d(dVar, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", dVar.f130921a);
        jSONObject.put("get_config_duration", dVar.f130922b);
        jSONObject.put("extract_duration", dVar.f130923c);
        jSONObject.put("upload_duration", dVar.f130924d);
        jSONObject.put("submit_duration", dVar.f130925e);
        jSONObject.put("query_duration", dVar.f130926f);
        jSONObject.put("extract_duration_per_second", dVar.f130927g);
        jSONObject.put("upload_duration_per_second", dVar.f130928h);
        jSONObject.put("submit_duration_per_second", dVar.f130929i);
        jSONObject.put("query_duration_per_second", dVar.f130930j);
        jSONObject.put("recognize_duration_per_second", dVar.f130931k);
        jSONObject.put("perceived_get_config_duration", dVar.f130932l);
        jSONObject.put("perceived_extract_duration", dVar.f130933m);
        jSONObject.put("tos_key", dVar.n);
        jSONObject.put("job_id", dVar.o);
        jSONObject.put("failed_step", dVar.p);
        jSONObject.put("failed_code", dVar.q);
        jSONObject.put("failed_msg", dVar.r);
        jSONObject.put("audio_file_size", dVar.s);
        jSONObject.put("audio_upload_domain", dVar.t);
        q.f80064a.a("tt_recognize_caption_monitor", i2, jSONObject, null);
        bj.d("monitor tt_recognize_caption_monitor status: " + i2 + " data: " + jSONObject);
    }
}

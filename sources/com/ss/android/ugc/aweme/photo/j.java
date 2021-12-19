package com.ss.android.ugc.aweme.photo;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.q;
import f.a.d.f;
import java.util.List;
import org.json.JSONObject;

final /* synthetic */ class j implements f {

    /* renamed from: a  reason: collision with root package name */
    private final PhotoModule f114872a;

    /* renamed from: b  reason: collision with root package name */
    private final long f114873b;

    static {
        Covode.recordClassIndex(73890);
    }

    j(PhotoModule photoModule, long j2) {
        this.f114872a = photoModule;
        this.f114873b = j2;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        PhotoModule photoModule = this.f114872a;
        long j2 = this.f114873b;
        Pair pair = (Pair) obj;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", (long) ((int) (System.currentTimeMillis() - j2)));
        q.a("aweme_recorder_take_photo_duration", jSONObject, (JSONObject) null);
        photoModule.f114828b.a((String) pair.first, (List) pair.second);
        photoModule.f114830d = false;
    }
}

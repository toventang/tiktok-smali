package com.ss.android.ugc.aweme.i18n.musically.cut;

import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity;
import com.ss.android.ugc.aweme.services.external.ability.IAVTransformService;
import org.json.JSONException;
import org.json.JSONObject;

final /* synthetic */ class g implements IAVTransformService.ITransformCallback {

    /* renamed from: a  reason: collision with root package name */
    private final AvatarCutActivity.AnonymousClass1 f99854a;

    static {
        Covode.recordClassIndex(63658);
    }

    g(AvatarCutActivity.AnonymousClass1 r1) {
        this.f99854a = r1;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVTransformService.ITransformCallback
    public final void finish(Object obj) {
        AvatarCutActivity.AnonymousClass1 r4 = this.f99854a;
        Integer num = (Integer) obj;
        a.b(AvatarCutActivity.this.w);
        if (num.intValue() != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errorCode", num);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            b.a("aweme_video_clip_success_rate", 1, jSONObject);
        } else {
            b.a("aweme_video_clip_success_rate", 0, (JSONObject) null);
        }
        AvatarCutActivity.this.r = true;
        AvatarCutActivity.this.s = true;
    }
}

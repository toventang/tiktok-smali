package com.ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.context.g;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class au implements g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f130068a;

    /* renamed from: b  reason: collision with root package name */
    private String f130069b;

    /* renamed from: c  reason: collision with root package name */
    private String f130070c;

    static {
        Covode.recordClassIndex(85346);
    }

    @Override // com.ss.android.ugc.asve.context.g
    public final float c() {
        return 0.66f;
    }

    @Override // com.ss.android.ugc.asve.context.g
    public final int e() {
        return R.array.ak;
    }

    @Override // com.ss.android.ugc.asve.context.g
    public final int f() {
        return R.array.aj;
    }

    @Override // com.ss.android.ugc.asve.context.g
    public final int g() {
        return R.drawable.bas;
    }

    @Override // com.ss.android.ugc.asve.context.g
    public final String a() {
        return this.f130069b;
    }

    @Override // com.ss.android.ugc.asve.context.g
    public final String b() {
        return this.f130070c;
    }

    @Override // com.ss.android.ugc.asve.context.g
    public final boolean d() {
        return this.f130068a;
    }

    public au(CameraComponentModel cameraComponentModel) {
        String str;
        boolean z;
        String str2;
        String str3 = "";
        l.d(cameraComponentModel, str3);
        ReactionParams reactionParams = cameraComponentModel.p.f124739a;
        this.f130069b = (reactionParams == null || (str = reactionParams.wavPath) == null) ? str3 : str;
        ReactionParams reactionParams2 = cameraComponentModel.p.f124739a;
        if (!(reactionParams2 == null || (str2 = reactionParams2.videoPath) == null)) {
            str3 = str2;
        }
        this.f130070c = str3;
        ReactionParams reactionParams3 = cameraComponentModel.p.f124739a;
        if (reactionParams3 != null) {
            z = reactionParams3.nonReacted;
        } else {
            z = false;
        }
        this.f130068a = !z;
    }
}

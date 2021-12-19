package com.ss.android.ugc.aweme.video.preload.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.language.d;
import com.ss.android.ugc.aweme.ml.ab.g;
import com.ss.android.ugc.aweme.setting.model.MLModel;
import com.ss.android.ugc.aweme.speedpredictor.api.a;
import com.ss.android.ugc.aweme.video.l;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private MLModel f143638a = g.a.a();

    static {
        Covode.recordClassIndex(93986);
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.a
    public final boolean c() {
        if (this.f143638a != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.a
    public final String e() {
        return d.h();
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.a
    public final String a() {
        MLModel mLModel = this.f143638a;
        if (mLModel == null) {
            return "";
        }
        return mLModel.packageUrl;
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.a
    public final String b() {
        if (TextUtils.isEmpty(this.f143638a.scene)) {
            return "default";
        }
        return this.f143638a.scene;
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.a
    public final String d() {
        MLModel mLModel = this.f143638a;
        if (mLModel == null) {
            return "";
        }
        if (mLModel.type != 2 && this.f143638a.type == 3) {
            return "bytenn";
        }
        return "tflite";
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.a
    public final int g() {
        return l.a(com.bytedance.ies.ugc.appcontext.d.a()).b(com.bytedance.ies.ugc.appcontext.d.a());
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.a
    public final String f() {
        Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
        if (TextUtils.isEmpty(j.f107227f) || !j.b() || j.c()) {
            j.f107227f = NetworkUtils.getNetworkAccessType(a2);
        }
        return j.f107227f;
    }
}

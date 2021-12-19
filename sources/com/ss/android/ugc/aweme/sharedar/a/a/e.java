package com.ss.android.ugc.aweme.sharedar.a.a;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.b.a;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.sharedar.SharedARModel;
import com.ss.android.ugc.aweme.sharedar.c;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import h.f.b.l;
import h.f.b.y;
import h.h.d;
import h.k.i;
import org.json.JSONObject;

public final class e extends a {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ i[] f124460b = {new y(e.class, "manager", "getManager()Lcom/ss/android/ugc/aweme/sharedar/SharedAREffectManager;", 0)};

    /* renamed from: c  reason: collision with root package name */
    private final d f124461c = a.a(getDiContainer(), c.class);

    static {
        Covode.recordClassIndex(81725);
    }

    @Override // com.ss.android.ugc.aweme.sharedar.a.a.a
    public final long a() {
        return 8;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(f fVar) {
        super(fVar);
        l.d(fVar, "");
    }

    @Override // com.ss.android.ugc.aweme.sharedar.a.a.a
    public final void a(int i2, long j2, String str) {
        SharedARModel sharedARModel;
        if (str != null) {
            int optInt = new JSONObject(str).optInt("state", -1);
            boolean z = false;
            c cVar = (c) this.f124461c.a(this, f124460b[0]);
            cVar.f124476e.postValue(Integer.valueOf(optInt));
            ac a2 = ae.a(cVar.f124478g, (ad.b) null).a(ShortVideoContextViewModel.class);
            l.b(a2, "");
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a2).f124769a;
            t<Boolean> tVar = cVar.f124477f;
            if (optInt == 1) {
                z = true;
            }
            tVar.postValue(Boolean.valueOf(z));
            if (optInt == 3 && shortVideoContext != null && (sharedARModel = shortVideoContext.S) != null) {
                sharedARModel.setSharedARSessionId(null);
                sharedARModel.setSharedARMultiPlayerUserName(null);
                sharedARModel.setSharedARMultiPlayerUserId(null);
                sharedARModel.setCurrentUserHost(true);
            }
        }
    }
}

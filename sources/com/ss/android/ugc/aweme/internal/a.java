package com.ss.android.ugc.aweme.internal;

import android.content.Context;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import h.f.b.l;
import h.z;
import java.util.List;

public final class a implements IAVCommentService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f104775a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IAVCommentService f104776b;

    @Override // com.ss.android.ugc.aweme.internal.IAVCommentService
    public final void a(Context context, String str, Aweme aweme, int i2, List<InteractionTagUserInfo> list, OnActivityResultCallback onActivityResultCallback) {
        l.d(context, "");
        l.d(str, "");
        l.d(onActivityResultCallback, "");
        this.f104776b.a(context, str, aweme, i2, list, onActivityResultCallback);
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVCommentService
    public final void a(e eVar, boolean z, h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f104776b.a(eVar, z, aVar);
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVCommentService
    public final boolean a(boolean z) {
        return this.f104776b.a(z);
    }

    static {
        Covode.recordClassIndex(67188);
    }

    private a() {
        IAVCommentService a2 = AVCommentServiceImpl.a();
        l.b(a2, "");
        this.f104776b = a2;
    }
}

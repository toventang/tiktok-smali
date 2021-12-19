package com.bytedance.ies.ugc.aweme.commercialize.scene.impl.b;

import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.a.b;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.a.c;
import h.f.b.l;
import java.util.Objects;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private com.bytedance.ies.ugc.aweme.commercialize.scene.api.a.a f34682a;

    /* renamed from: b  reason: collision with root package name */
    private c f34683b;

    /* renamed from: c  reason: collision with root package name */
    private Fragment f34684c;

    static {
        Covode.recordClassIndex(20802);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.a.b
    public final void a() {
        c();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.a.b
    public final void b() {
        c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006d, code lost:
        if (r1.a(r0) == false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c() {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.b.a.c():void");
    }

    private static boolean a(Intent intent) {
        if (intent == null || !TextUtils.equals(intent.getAction(), "android.intent.action.MAIN") || !intent.hasCategory("android.intent.category.LAUNCHER")) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.b.a
    public final void a(com.bytedance.ies.ugc.aweme.commercialize.scene.api.b.c cVar) {
        l.d(cVar, "");
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.a.a aVar = (com.bytedance.ies.ugc.aweme.commercialize.scene.api.a.a) cVar;
        this.f34682a = aVar;
        if (aVar == null) {
            l.a("feedRecommendFragmentAdDepend");
        }
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.b.b bVar = aVar.f34651b;
        Objects.requireNonNull(bVar, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.scene.api.feed_recommend.IFeedRecommendFragmentAdSceneCallBack");
        this.f34683b = (c) bVar;
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.a.a aVar2 = this.f34682a;
        if (aVar2 == null) {
            l.a("feedRecommendFragmentAdDepend");
        }
        Fragment fragment = aVar2.f34650a;
        if (fragment == null) {
            l.a("fragment");
        }
        this.f34684c = fragment;
    }
}

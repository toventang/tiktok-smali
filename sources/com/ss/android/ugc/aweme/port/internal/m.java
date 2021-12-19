package com.ss.android.ugc.aweme.port.internal;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.cq;
import com.ss.android.ugc.aweme.shortvideo.publish.h;
import com.ss.android.ugc.aweme.shortvideo.x;

public final class m extends i.b {

    /* renamed from: a  reason: collision with root package name */
    private final e f115695a;

    /* renamed from: b  reason: collision with root package name */
    private final h f115696b;

    /* renamed from: c  reason: collision with root package name */
    private final IAVPublishService.OnPublishCallback f115697c;

    static {
        Covode.recordClassIndex(74646);
    }

    @Override // androidx.fragment.app.i.b
    public final void onFragmentDetached(i iVar, Fragment fragment) {
        super.onFragmentDetached(iVar, fragment);
        if (fragment instanceof cq) {
            this.f115695a.getSupportFragmentManager().a(this);
            h hVar = this.f115696b;
            if (hVar != null) {
                hVar.b((x) fragment);
            }
            IAVPublishService.OnPublishCallback onPublishCallback = this.f115697c;
            if (onPublishCallback != null) {
                onPublishCallback.onStopPublish();
            }
        }
    }

    public m(e eVar, h hVar, IAVPublishService.OnPublishCallback onPublishCallback) {
        this.f115695a = eVar;
        this.f115696b = hVar;
        this.f115697c = onPublishCallback;
    }

    @Override // androidx.fragment.app.i.b
    public final void onFragmentAttached(i iVar, Fragment fragment, Context context) {
        h hVar;
        super.onFragmentAttached(iVar, fragment, context);
        if ((fragment instanceof cq) && (hVar = this.f115696b) != null) {
            hVar.a((x) fragment);
        }
    }

    @Override // androidx.fragment.app.i.b
    public final void onFragmentViewCreated(i iVar, Fragment fragment, View view, Bundle bundle) {
        super.onFragmentViewCreated(iVar, fragment, view, bundle);
    }
}

package com.ss.android.ugc.aweme.homepage.story.container;

import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class StorySidebarContainer$addCameraPanel$$inlined$apply$lambda$1 implements k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j f99294a;

    static {
        Covode.recordClassIndex(63254);
    }

    StorySidebarContainer$addCameraPanel$$inlined$apply$lambda$1(j jVar) {
        this.f99294a = jVar;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.d(mVar, "");
        l.d(aVar, "");
        h.a("StoryToolsFragment >>> source:" + mVar + ", event:" + aVar);
        if (this.f99294a.f99332k && aVar == i.a.ON_STOP) {
            this.f99294a.f99332k = false;
            this.f99294a.getStoryContainer().b();
        }
    }
}

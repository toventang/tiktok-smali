package com.ss.android.ugc.playerkit.videoview;

import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.player.sdk.api.j;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<VideoViewComponent> f148900a;

    /* renamed from: b  reason: collision with root package name */
    private Set<m> f148901b;

    static {
        Covode.recordClassIndex(98050);
    }

    /* renamed from: com.ss.android.ugc.playerkit.videoview.a$a  reason: collision with other inner class name */
    public static final class C4019a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f148902a = new a((byte) 0);

        static {
            Covode.recordClassIndex(98051);
        }
    }

    private a() {
        this.f148900a = new WeakReference<>(null);
        this.f148901b = Collections.newSetFromMap(new WeakHashMap());
    }

    @Override // com.ss.android.ugc.playerkit.videoview.h
    public final j.g j() {
        VideoViewComponent videoViewComponent;
        WeakReference<VideoViewComponent> weakReference = this.f148900a;
        if (weakReference == null || (videoViewComponent = weakReference.get()) == null) {
            return null;
        }
        return videoViewComponent.j();
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    @Override // com.ss.android.ugc.playerkit.videoview.h
    public final void a(OnUIPlayListener onUIPlayListener) {
        VideoViewComponent videoViewComponent;
        WeakReference<VideoViewComponent> weakReference = this.f148900a;
        if (weakReference != null && (videoViewComponent = weakReference.get()) != null) {
            videoViewComponent.a(onUIPlayListener);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(VideoViewComponent videoViewComponent) {
        VideoViewComponent videoViewComponent2 = this.f148900a.get();
        if (videoViewComponent2 != null) {
            for (m mVar : this.f148901b) {
                if (mVar != null) {
                    mVar.getLifecycle().b(videoViewComponent2);
                }
            }
        }
        this.f148900a = new WeakReference<>(videoViewComponent);
    }
}

package com.ss.android.ugc.aweme.story.edit.clip.impl;

import android.content.Context;
import android.view.SurfaceView;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.story.edit.clip.a.e;
import com.ss.android.ugc.aweme.story.edit.clip.a.g;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import dmt.av.video.VEPreviewParams;
import dmt.av.video.b.f;
import dmt.av.video.b.j;
import h.f.a.m;
import h.f.b.l;
import h.h;
import h.i;
import java.util.Objects;

public final class VEEditClip implements g<j>, g {

    /* renamed from: a  reason: collision with root package name */
    public f.a f137553a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f137554b;

    /* renamed from: c  reason: collision with root package name */
    e f137555c = e.INITIALIZED;

    /* renamed from: d  reason: collision with root package name */
    public final m<StoryEditModel, StoryEditClipModel, j> f137556d;

    /* renamed from: e  reason: collision with root package name */
    public final m<StoryEditModel, StoryEditClipModel, com.bytedance.creativex.editor.preview.a> f137557e;

    /* renamed from: f  reason: collision with root package name */
    public final StoryEditModel f137558f;

    /* renamed from: g  reason: collision with root package name */
    public final StoryEditClipModel f137559g;

    /* renamed from: h  reason: collision with root package name */
    private final n f137560h = new n(this);

    /* renamed from: i  reason: collision with root package name */
    private boolean f137561i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f137562j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f137563k;

    /* renamed from: l  reason: collision with root package name */
    private final h f137564l = i.a((h.f.a.a) new c(this));

    /* renamed from: m  reason: collision with root package name */
    private final h f137565m = i.a((h.f.a.a) new b(this));
    private final Context n;
    private final androidx.lifecycle.m o;
    private final SurfaceView p;

    static {
        Covode.recordClassIndex(89993);
    }

    public final com.bytedance.creativex.editor.preview.a a() {
        return (com.bytedance.creativex.editor.preview.a) this.f137564l.getValue();
    }

    public final j b() {
        return (j) this.f137565m.getValue();
    }

    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        if (aVar == i.a.ON_START) {
            onStart();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_STOP) {
            onStop();
        }
    }

    @Override // androidx.lifecycle.m
    public final androidx.lifecycle.i getLifecycle() {
        return this.f137560h;
    }

    static final class a implements f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VEEditClip f137566a;

        static {
            Covode.recordClassIndex(89994);
        }

        a(VEEditClip vEEditClip) {
            this.f137566a = vEEditClip;
        }

        @Override // dmt.av.video.b.f.a
        public final void a() {
            f.a aVar = this.f137566a.f137553a;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<j> {
        final /* synthetic */ VEEditClip this$0;

        static {
            Covode.recordClassIndex(89995);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VEEditClip vEEditClip) {
            super(0);
            this.this$0 = vEEditClip;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ j invoke() {
            this.this$0.f137554b = true;
            return this.this$0.f137556d.invoke(this.this$0.f137558f, this.this$0.f137559g);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<com.bytedance.creativex.editor.preview.a> {
        final /* synthetic */ VEEditClip this$0;

        static {
            Covode.recordClassIndex(89996);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VEEditClip vEEditClip) {
            super(0);
            this.this$0 = vEEditClip;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ com.bytedance.creativex.editor.preview.a invoke() {
            return this.this$0.f137557e.invoke(this.this$0.f137558f, this.this$0.f137559g);
        }
    }

    @v(a = i.a.ON_PAUSE)
    private final void onPause() {
        this.f137561i = false;
        if (this.f137555c == e.LOADED) {
            this.f137560h.a(i.a.ON_PAUSE);
        }
    }

    @v(a = i.a.ON_RESUME)
    private final void onResume() {
        this.f137561i = true;
        if (this.f137555c == e.LOADED) {
            this.f137560h.a(i.a.ON_RESUME);
        }
    }

    @v(a = i.a.ON_START)
    private final void onStart() {
        this.f137562j = true;
        if (this.f137555c == e.LOADED) {
            this.f137560h.a(i.a.ON_START);
        }
    }

    @v(a = i.a.ON_STOP)
    private final void onStop() {
        this.f137562j = true;
        if (this.f137555c == e.LOADED) {
            this.f137560h.a(i.a.ON_STOP);
        }
    }

    public final void f() {
        com.ss.android.ugc.asve.editor.g a2;
        this.f137555c = e.DESTROYED;
        if (this.f137554b && (a2 = a.a(this)) != null) {
            a2.s();
        }
        this.f137560h.a(i.a.ON_DESTROY);
    }

    public final void d() {
        this.f137555c = e.LOADED;
        b().a(true);
        if (this.f137562j) {
            this.f137560h.a(i.a.ON_START);
        }
        if (this.f137561i) {
            this.f137560h.a(i.a.ON_RESUME);
        }
    }

    public final void e() {
        this.f137555c = e.CREATED;
        this.f137563k = true;
        com.ss.android.ugc.asve.editor.g b2 = b().b();
        if (b2 != null) {
            b2.r();
        }
        if (this.f137561i) {
            this.f137560h.a(i.a.ON_PAUSE);
        }
        if (this.f137562j) {
            this.f137560h.a(i.a.ON_STOP);
        }
    }

    public final void c() {
        this.f137555c = e.CREATED;
        b().y = new a(this);
        b().a(this.n, a(), this.p, this);
        if (a() instanceof VEPreviewParams) {
            com.bytedance.creativex.editor.preview.a a2 = a();
            Objects.requireNonNull(a2, "null cannot be cast to non-null type dmt.av.video.VEPreviewParams");
            if (((VEPreviewParams) a2).isFastImport) {
                com.ss.android.ugc.asve.editor.g b2 = b().b();
                b2.a(b2.a().f151435j, b2.a().f151436k, a().getVolume());
            }
        }
        this.f137560h.a(i.a.ON_CREATE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.m<? super com.ss.android.ugc.aweme.story.edit.model.StoryEditModel, ? super com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel, ? extends dmt.av.video.b.j> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.m<? super com.ss.android.ugc.aweme.story.edit.model.StoryEditModel, ? super com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel, ? extends com.bytedance.creativex.editor.preview.a> */
    /* JADX WARN: Multi-variable type inference failed */
    public VEEditClip(Context context, androidx.lifecycle.m mVar, m<? super StoryEditModel, ? super StoryEditClipModel, ? extends j> mVar2, m<? super StoryEditModel, ? super StoryEditClipModel, ? extends com.bytedance.creativex.editor.preview.a> mVar3, StoryEditModel storyEditModel, StoryEditClipModel storyEditClipModel, SurfaceView surfaceView) {
        l.d(context, "");
        l.d(mVar, "");
        l.d(mVar2, "");
        l.d(mVar3, "");
        l.d(storyEditModel, "");
        l.d(storyEditClipModel, "");
        l.d(surfaceView, "");
        this.n = context;
        this.o = mVar;
        this.f137556d = mVar2;
        this.f137557e = mVar3;
        this.f137558f = storyEditModel;
        this.f137559g = storyEditClipModel;
        this.p = surfaceView;
        mVar.getLifecycle().a(this);
    }
}

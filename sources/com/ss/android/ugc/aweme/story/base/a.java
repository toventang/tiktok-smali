package com.ss.android.ugc.aweme.story.base;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.story.record.d;
import com.ss.android.ugc.aweme.story.record.e;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f136864a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f136865b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f136866c;

    /* renamed from: d  reason: collision with root package name */
    private final h f136867d = i.a((h.f.a.a) new C3575a(this));

    static {
        Covode.recordClassIndex(89446);
    }

    public final j a() {
        return (j) this.f136867d.getValue();
    }

    @Override // com.ss.android.ugc.aweme.story.base.c
    public final boolean b() {
        j a2 = a();
        if (!(a2 instanceof c)) {
            a2 = null;
        }
        c cVar = (c) a2;
        if (cVar != null) {
            return cVar.b();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.base.c
    public final void c() {
        j a2 = a();
        if (!(a2 instanceof c)) {
            a2 = null;
        }
        c cVar = (c) a2;
        if (cVar != null) {
            cVar.c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.a$a  reason: collision with other inner class name */
    static final class C3575a extends m implements h.f.a.a<j> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(89447);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3575a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ j invoke() {
            if (!this.this$0.f136864a) {
                j createLighteningFakeScene = g.a().l().createLighteningFakeScene();
                createLighteningFakeScene.r = this.this$0.f136866c;
                return createLighteningFakeScene;
            } else if (this.this$0.f136865b) {
                return new d(this.this$0.f136866c);
            } else {
                return e.c.a(this.this$0.f136866c);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.base.c
    public final void a(EnterStoryParam enterStoryParam) {
        l.d(enterStoryParam, "");
        j a2 = a();
        if (!(a2 instanceof c)) {
            a2 = null;
        }
        c cVar = (c) a2;
        if (cVar != null) {
            cVar.a(enterStoryParam);
        }
    }

    public a(boolean z, boolean z2, Bundle bundle) {
        l.d(bundle, "");
        this.f136864a = z;
        this.f136865b = z2;
        this.f136866c = bundle;
    }

    @Override // com.ss.android.ugc.aweme.story.base.c
    public final void a(int i2, int i3, Intent intent) {
        j a2 = a();
        if (!(a2 instanceof c)) {
            a2 = null;
        }
        c cVar = (c) a2;
        if (cVar != null) {
            cVar.a(i2, i3, intent);
        }
    }
}

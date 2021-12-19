package com.ss.android.ugc.aweme.story.base.ui;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.story.base.widget.a;

public final class StorySlideFragmentLifecycleDispatcher implements au {

    /* renamed from: a  reason: collision with root package name */
    boolean f136912a;

    /* renamed from: b  reason: collision with root package name */
    a f136913b;

    /* renamed from: c  reason: collision with root package name */
    j f136914c;

    /* renamed from: d  reason: collision with root package name */
    Bundle f136915d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f136916e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f136917f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f136918g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f136919h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f136920i;

    static {
        Covode.recordClassIndex(89486);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroyView();
        } else if (aVar == i.a.ON_START) {
            onStart();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_STOP) {
            onStop();
        }
    }

    @v(a = i.a.ON_PAUSE)
    private final void onPause() {
        a aVar;
        if (!this.f136920i) {
            this.f136916e = false;
            if (this.f136919h && (aVar = this.f136913b) != null) {
                aVar.f42889b.c();
            }
        }
    }

    @v(a = i.a.ON_RESUME)
    private final void onResume() {
        a aVar;
        if (!this.f136920i) {
            this.f136916e = true;
            if (this.f136919h && (aVar = this.f136913b) != null) {
                aVar.f42889b.b();
            }
        }
    }

    @v(a = i.a.ON_START)
    private final void onStart() {
        a aVar;
        if (!this.f136920i) {
            this.f136917f = true;
            if (this.f136919h && (aVar = this.f136913b) != null) {
                aVar.f42889b.a();
            }
        }
    }

    @v(a = i.a.ON_STOP)
    private final void onStop() {
        a aVar;
        if (!this.f136920i) {
            this.f136917f = false;
            if (this.f136919h && (aVar = this.f136913b) != null) {
                aVar.f42889b.d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        a aVar;
        j jVar = this.f136914c;
        if (jVar != null && this.f136919h && !this.f136918g && 1 != 0 && (aVar = this.f136913b) != null) {
            aVar.a(jVar);
            aVar.a();
            this.f136915d = null;
            this.f136918g = true;
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroyView() {
        a aVar;
        if (this.f136918g && (aVar = this.f136913b) != null) {
            aVar.f42889b.e();
            aVar.f42888a.f42953a = null;
        }
    }

    public final void b(boolean z) {
        if (!z || !this.f136917f) {
            this.f136920i = z;
        }
    }

    public final void a(boolean z) {
        a aVar;
        a aVar2;
        a aVar3;
        a aVar4;
        this.f136919h = z;
        if (z) {
            a();
            if (this.f136917f && (aVar4 = this.f136913b) != null) {
                aVar4.f42889b.a();
            }
            if (this.f136916e && (aVar3 = this.f136913b) != null) {
                aVar3.f42889b.b();
                return;
            }
            return;
        }
        if (this.f136916e && (aVar2 = this.f136913b) != null) {
            aVar2.f42889b.c();
        }
        if (this.f136917f && (aVar = this.f136913b) != null) {
            aVar.f42889b.d();
        }
    }
}

package com.bytedance.scene.group;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

/* access modifiers changed from: package-private */
public class UserVisibleHintGroupScene$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f42813a;

    static {
        Covode.recordClassIndex(26284);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_STOP) {
            onStop();
        } else if (aVar == i.a.ON_START) {
            onStart();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        this.f42813a.f42882b.a(i.a.ON_DESTROY);
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_PAUSE)
    public void onPause() {
        this.f42813a.f42884d = false;
        if (this.f42813a.f42883c) {
            this.f42813a.f42882b.a(i.a.ON_PAUSE);
        }
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_RESUME)
    public void onResume() {
        this.f42813a.f42884d = true;
        if (this.f42813a.f42883c) {
            this.f42813a.f42882b.a(i.a.ON_RESUME);
        }
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_START)
    public void onStart() {
        this.f42813a.f42885e = true;
        if (this.f42813a.f42883c) {
            this.f42813a.f42882b.a(i.a.ON_START);
        }
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_STOP)
    public void onStop() {
        this.f42813a.f42885e = false;
        if (this.f42813a.f42883c) {
            this.f42813a.f42882b.a(i.a.ON_STOP);
        }
    }

    UserVisibleHintGroupScene$1(f fVar) {
        this.f42813a = fVar;
    }
}

package com.ss.android.ugc.aweme.story.avatar.entry;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.story.avatar.e;
import com.ss.android.ugc.aweme.story.avatar.h;
import com.ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import com.ss.android.ugc.aweme.tux.business.story.a;
import h.f.b.l;

public class g implements a, h {

    /* renamed from: a  reason: collision with root package name */
    public final StoryBrandView f136822a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ e f136823b;

    static {
        Covode.recordClassIndex(89399);
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.h
    public final void a(boolean z, a aVar) {
        l.d(aVar, "");
        this.f136823b.a(z, aVar);
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.h
    public final boolean d() {
        return this.f136823b.d();
    }

    /* access modifiers changed from: protected */
    public void a() {
        this.f136822a.setVisibility(8);
    }

    public g(e eVar) {
        l.d(eVar, "");
        this.f136823b = eVar;
        this.f136822a = eVar.a();
    }

    /* access modifiers changed from: protected */
    public void a(a aVar) {
        l.d(aVar, "");
        this.f136822a.setMode(aVar);
        this.f136822a.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.entry.a
    public final void a(k kVar) {
        boolean z;
        l.d(kVar, "");
        if (!d() || !kVar.f136825a) {
            a();
        } else {
            a(kVar.f136826b);
            if (kVar.f136826b == a.PRORGRESS) {
                this.f136822a.setProgress(kVar.f136827c);
            }
        }
        if (this.f136822a.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        a(z, this.f136822a.getMode());
    }
}

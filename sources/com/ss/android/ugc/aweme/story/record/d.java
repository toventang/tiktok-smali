package com.ss.android.ugc.aweme.story.record;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.story.record.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class d extends a {

    /* renamed from: d  reason: collision with root package name */
    public e f138195d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f138196e;

    /* renamed from: i  reason: collision with root package name */
    private View f138197i;

    /* renamed from: j  reason: collision with root package name */
    private final Bundle f138198j;

    static {
        Covode.recordClassIndex(90391);
    }

    @Override // com.ss.android.ugc.aweme.story.record.a, com.ss.android.ugc.aweme.story.base.c
    public final void c() {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.story.record.a
    public final boolean F() {
        return this.f138196e;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.story.record.a
    public final void G() {
        if (this.f138195d == null) {
            e a2 = e.c.a(this.f138198j);
            EnterStoryParam enterStoryParam = ((a) this).f138156b;
            if (enterStoryParam != null) {
                a2.a(enterStoryParam);
            }
            this.f138195d = a2;
            if (a2 == null) {
                l.a("storyRecordRootScene");
            }
            a(R.id.ad7, a2, "StoryRecordRootScene");
            View view = this.f138197i;
            if (view == null) {
                l.a("fakeViewContainer");
            }
            view.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.record.a, com.ss.android.ugc.aweme.story.base.c
    public final boolean b() {
        if (this.f138195d == null) {
            return false;
        }
        e eVar = this.f138195d;
        if (eVar == null) {
            l.a("storyRecordRootScene");
        }
        return eVar.b();
    }

    public d(Bundle bundle) {
        l.d(bundle, "");
        this.f138198j = bundle;
    }

    @Override // com.ss.android.ugc.aweme.story.record.a, com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        View c2 = c(R.id.azy);
        l.b(c2, "");
        this.f138197i = c2;
    }

    @Override // com.ss.android.ugc.aweme.story.record.a, com.ss.android.ugc.aweme.story.base.c
    public final void a(EnterStoryParam enterStoryParam) {
        l.d(enterStoryParam, "");
        super.a(enterStoryParam);
        if (this.f138195d != null) {
            e eVar = this.f138195d;
            if (eVar == null) {
                l.a("storyRecordRootScene");
            }
            eVar.a(enterStoryParam);
        }
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = a.a(layoutInflater, R.layout.b31, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a2;
    }

    @Override // com.ss.android.ugc.aweme.story.record.a, com.ss.android.ugc.aweme.story.base.c
    public final void a(int i2, int i3, Intent intent) {
        if (this.f138195d != null) {
            e eVar = this.f138195d;
            if (eVar == null) {
                l.a("storyRecordRootScene");
            }
            eVar.a(i2, i3, intent);
        }
    }
}

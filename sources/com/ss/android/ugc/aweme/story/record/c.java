package com.ss.android.ugc.aweme.story.record;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.story.base.g;
import com.ss.android.ugc.aweme.story.record.j.d;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class c extends a {

    /* renamed from: d  reason: collision with root package name */
    private final boolean f138188d = true;

    static {
        Covode.recordClassIndex(90387);
    }

    @Override // com.ss.android.ugc.aweme.story.record.a, com.ss.android.ugc.aweme.story.base.c
    public final void c() {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.story.record.a
    public final boolean F() {
        return this.f138188d;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.story.record.a
    public final void G() {
        Bundle bundle;
        int i2;
        EnterStoryParam enterStoryParam = ((a) this).f138156b;
        if (enterStoryParam != null) {
            bundle = g.a(enterStoryParam);
            if (!gb.a()) {
                i2 = 5;
            } else {
                i2 = 1;
            }
            bundle.putInt("translation_type", i2);
        } else {
            bundle = null;
        }
        Activity activity = this.f42913m;
        if (activity == null) {
            l.b();
        }
        l.b(activity, "");
        d.a(bundle, activity, true);
    }

    @Override // com.ss.android.ugc.aweme.story.record.a, com.ss.android.ugc.aweme.view.w
    public final void a(boolean z) {
        super.a(z);
        View c2 = c(R.id.bmu);
        l.b(c2, "");
        ViewGroup.LayoutParams layoutParams = c2.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Activity activity = this.f42913m;
        if (activity == null) {
            l.b();
        }
        marginLayoutParams.topMargin = dh.c(activity) + t().getResources().getDimensionPixelSize(R.dimen.rk);
        c2.setLayoutParams(marginLayoutParams);
    }

    @Override // com.ss.android.ugc.aweme.story.record.a, com.ss.android.ugc.aweme.view.w
    public final void b(boolean z) {
        if (z) {
            View c2 = c(R.id.dow);
            l.b(c2, "");
            ViewGroup.LayoutParams layoutParams = c2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, layoutParams2.bottomMargin + en.a(33.0d, i.f115645a));
            c2.setLayoutParams(layoutParams2);
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
        View a2 = a.a(layoutInflater, R.layout.b2v, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a2;
    }
}

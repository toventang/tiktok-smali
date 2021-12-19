package com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.ss.android.ugc.aweme.base.utils.o;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class SharePanelFollowButton extends TuxButton implements com.ss.android.ugc.aweme.following.ui.view.a {

    /* renamed from: e  reason: collision with root package name */
    public boolean f103512e;

    /* renamed from: f  reason: collision with root package name */
    private int f103513f;

    static {
        Covode.recordClassIndex(66326);
    }

    public SharePanelFollowButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final int getStatus() {
        return this.f103513f;
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SharePanelFollowButton f103514a;

        static {
            Covode.recordClassIndex(66327);
        }

        a(SharePanelFollowButton sharePanelFollowButton) {
            this.f103514a = sharePanelFollowButton;
        }

        public final void run() {
            this.f103514a.setAnimating(true);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SharePanelFollowButton f103515a;

        static {
            Covode.recordClassIndex(66328);
        }

        b(SharePanelFollowButton sharePanelFollowButton) {
            this.f103515a = sharePanelFollowButton;
        }

        public final void run() {
            this.f103515a.setVisibility(8);
            this.f103515a.setAnimating(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.a
    public final m getLifeCycleOwner() {
        Activity d2 = o.d(this);
        Objects.requireNonNull(d2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (e) d2;
    }

    public final void setAnimating(boolean z) {
        this.f103512e = z;
    }

    public final void setStatus(int i2) {
        this.f103513f = i2;
    }

    public final void setFollowStatus(int i2) {
        a(i2, 0);
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.a
    public final void a(int i2, int i3) {
        if (i2 == 0) {
            setButtonVariant(0);
            setText(getResources().getText(R.string.byt));
            setClickable(true);
            setVisibility(0);
        } else if (i2 == 4) {
            setButtonVariant(1);
            setText(getResources().getText(R.string.c22));
            setClickable(false);
            setVisibility(0);
        } else if (this.f103513f == 4 && !this.f103512e) {
            animate().alpha(0.0f).setDuration(250).withStartAction(new a(this)).withEndAction(new b(this));
        }
        this.f103513f = i2;
        setButtonSize(1);
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.a
    public final void a(int i2, int i3, String str) {
        a(i2, i3);
    }

    private /* synthetic */ SharePanelFollowButton(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SharePanelFollowButton(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, R.attr.bo);
        l.d(context, "");
        a(true);
        setEllipsize(null);
    }
}

package com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import h.f.b.l;

public abstract class a extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    protected TuxTextView f102683a;

    /* renamed from: b  reason: collision with root package name */
    protected TuxTextView f102684b;

    /* renamed from: c  reason: collision with root package name */
    protected RemoteImageView f102685c;

    static {
        Covode.recordClassIndex(65752);
    }

    /* access modifiers changed from: protected */
    public abstract int getResourceId();

    /* access modifiers changed from: protected */
    public final RemoteImageView getAvatarIv() {
        RemoteImageView remoteImageView = this.f102685c;
        if (remoteImageView == null) {
            l.a("avatarIv");
        }
        return remoteImageView;
    }

    /* access modifiers changed from: protected */
    public final TuxTextView getSubtitleTv() {
        TuxTextView tuxTextView = this.f102684b;
        if (tuxTextView == null) {
            l.a("subtitleTv");
        }
        return tuxTextView;
    }

    /* access modifiers changed from: protected */
    public final TuxTextView getTitleTv() {
        TuxTextView tuxTextView = this.f102683a;
        if (tuxTextView == null) {
            l.a("titleTv");
        }
        return tuxTextView;
    }

    /* access modifiers changed from: protected */
    public final void setAvatarIv(RemoteImageView remoteImageView) {
        l.d(remoteImageView, "");
        this.f102685c = remoteImageView;
    }

    /* access modifiers changed from: protected */
    public final void setSubtitleTv(TuxTextView tuxTextView) {
        l.d(tuxTextView, "");
        this.f102684b = tuxTextView;
    }

    /* access modifiers changed from: protected */
    public final void setTitleTv(TuxTextView tuxTextView) {
        l.d(tuxTextView, "");
        this.f102683a = tuxTextView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        l.d(context, "");
    }

    public final void a(String str, String str2, String str3) {
        RemoteImageView remoteImageView = this.f102685c;
        if (remoteImageView == null) {
            l.a("avatarIv");
        }
        e.b(remoteImageView, str, -1, -1);
        TuxTextView tuxTextView = this.f102683a;
        if (tuxTextView == null) {
            l.a("titleTv");
        }
        tuxTextView.setText(str2);
        TuxTextView tuxTextView2 = this.f102684b;
        if (tuxTextView2 == null) {
            l.a("subtitleTv");
        }
        tuxTextView2.setText(str3);
    }
}

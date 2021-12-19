package com.ss.android.ugc.aweme.sticker.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.b;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.editSticker.interact.view.f;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.setting.cj;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.AvatarWithBorderView;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.widget.CircleImageView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d extends FrameLayout implements f {

    /* renamed from: a  reason: collision with root package name */
    private View f136220a;

    /* renamed from: b  reason: collision with root package name */
    private View f136221b;

    /* renamed from: c  reason: collision with root package name */
    private View f136222c;

    /* renamed from: d  reason: collision with root package name */
    private AvatarWithBorderView f136223d;

    /* renamed from: e  reason: collision with root package name */
    private CircleImageView f136224e;

    /* renamed from: f  reason: collision with root package name */
    private CircleImageView f136225f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f136226g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f136227h;

    static {
        Covode.recordClassIndex(88972);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.f
    public final void c(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.f
    public final View getContentView() {
        return this;
    }

    public final View getGradualMaskBottom() {
        return this.f136222c;
    }

    public final View getGroupBottomLine() {
        return this.f136221b;
    }

    public final View getGroupRightLine() {
        return this.f136220a;
    }

    public final CircleImageView getIvOriginMusicCover() {
        return this.f136225f;
    }

    public final AvatarWithBorderView getMAvatarView() {
        return this.f136223d;
    }

    public final CircleImageView getMMusicCoverView() {
        return this.f136224e;
    }

    public final TextView getTvMusic() {
        return this.f136227h;
    }

    public final TextView getTvName() {
        return this.f136226g;
    }

    public final void setGradualMaskBottom(View view) {
        this.f136222c = view;
    }

    public final void setGroupBottomLine(View view) {
        this.f136221b = view;
    }

    public final void setGroupRightLine(View view) {
        this.f136220a = view;
    }

    public final void setIvOriginMusicCover(CircleImageView circleImageView) {
        this.f136225f = circleImageView;
    }

    public final void setMAvatarView(AvatarWithBorderView avatarWithBorderView) {
        this.f136223d = avatarWithBorderView;
    }

    public final void setMMusicCoverView(CircleImageView circleImageView) {
        this.f136224e = circleImageView;
    }

    public final void setTvMusic(TextView textView) {
        this.f136227h = textView;
    }

    public final void setTvName(TextView textView) {
        this.f136226g = textView;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.f
    public final void a(boolean z) {
        int i2;
        View view = this.f136220a;
        if (view != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            view.setVisibility(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.f
    public final void b(boolean z) {
        View view = this.f136222c;
        int i2 = 0;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.f136221b;
        if (view2 != null) {
            if (!z) {
                i2 = 4;
            }
            view2.setVisibility(i2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        UrlModel urlModel;
        l.d(context, "");
        MethodCollector.i(3668);
        View a2 = a.a(LayoutInflater.from(getContext()), R.layout.bjg, this, false);
        l.b(a2, "");
        this.f136220a = a2.findViewById(R.id.bdc);
        this.f136221b = a2.findViewById(R.id.bd4);
        this.f136222c = a2.findViewById(R.id.bct);
        if (cj.a()) {
            this.f136222c = a2.findViewById(R.id.bcu);
        }
        this.f136223d = (AvatarWithBorderView) a2.findViewById(R.id.fcu);
        this.f136224e = (CircleImageView) a2.findViewById(R.id.cpt);
        this.f136225f = (CircleImageView) a2.findViewById(R.id.d0c);
        this.f136226g = (TextView) a2.findViewById(R.id.f3c);
        this.f136227h = (TextView) a2.findViewById(R.id.f32);
        AvatarWithBorderView avatarWithBorderView = this.f136223d;
        if (avatarWithBorderView != null) {
            avatarWithBorderView.setBorderColor(R.color.f159928l);
        }
        View view = this.f136220a;
        if (view != null) {
            view.setVisibility(4);
        }
        addView(a2);
        com.ss.android.ugc.aweme.account.model.a e2 = g.a().A().e();
        if (e2 == null || e2.f() == null) {
            com.ss.android.ugc.tools.c.a.a(this.f136223d, 2131232324);
        } else {
            AvatarWithBorderView avatarWithBorderView2 = this.f136223d;
            UrlModel f2 = e2.f();
            Context context2 = getContext();
            l.b(context2, "");
            int a3 = (int) r.a(context2, 49.0f);
            Context context3 = getContext();
            l.b(context3, "");
            com.ss.android.ugc.tools.c.a.a(avatarWithBorderView2, f2, a3, (int) r.a(context3, 49.0f));
        }
        TextView textView = this.f136226g;
        if (textView != null) {
            StringBuilder sb = new StringBuilder("@");
            com.ss.android.ugc.aweme.account.model.a e3 = g.a().A().e();
            Resources resources = getResources();
            l.b(resources, "");
            textView.setText(sb.append(com.ss.android.ugc.aweme.shortvideo.edit.c.a.a(e3, resources)).toString());
        }
        CircleImageView circleImageView = this.f136225f;
        if (e2 != null) {
            urlModel = e2.f();
        } else {
            urlModel = null;
        }
        com.ss.android.ugc.tools.c.a.a(circleImageView, urlModel, 27, 27);
        com.ss.android.ugc.tools.c.a.a(this.f136224e, 2131232322);
        Drawable a4 = b.a(getContext(), 2131232312);
        if (a4 != null) {
            a4.setBounds(0, 0, a4.getMinimumWidth(), a4.getMinimumHeight());
        }
        TextView textView2 = this.f136227h;
        if (textView2 != null) {
            textView2.setCompoundDrawables(a4, null, null, null);
        }
        TextView textView3 = this.f136227h;
        if (textView3 != null) {
            StringBuilder sb2 = new StringBuilder();
            Context context4 = getContext();
            l.b(context4, "");
            textView3.setText(sb2.append(com.ss.android.ugc.aweme.shortvideo.edit.c.a.a(context4, g.a().A().e())).toString());
            MethodCollector.o(3668);
            return;
        }
        MethodCollector.o(3668);
    }
}

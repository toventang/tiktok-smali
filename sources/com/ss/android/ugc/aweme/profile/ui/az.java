package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.imagepipeline.e.k;
import com.facebook.imagepipeline.j.f;
import com.ss.android.common.c.c;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.edit.a;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.y;
import com.ss.android.ugc.aweme.services.function.FunctionSupportService;
import com.ss.android.ugc.aweme.services.function.IFunctionKey;
import com.ss.android.ugc.aweme.utils.ez;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class az extends bm implements ap {

    /* renamed from: a  reason: collision with root package name */
    RelativeLayout f116899a;
    private a ab;
    private boolean ac = true;

    /* renamed from: b  reason: collision with root package name */
    MusAvatarImageView f116900b;

    /* renamed from: c  reason: collision with root package name */
    TuxIconView f116901c;

    /* renamed from: d  reason: collision with root package name */
    ConstraintLayout f116902d;

    /* renamed from: e  reason: collision with root package name */
    SmartCircleImageView f116903e;

    /* renamed from: j  reason: collision with root package name */
    TuxTextView f116904j;

    /* renamed from: k  reason: collision with root package name */
    RelativeLayout f116905k;

    /* renamed from: l  reason: collision with root package name */
    TuxIconView f116906l;

    /* renamed from: m  reason: collision with root package name */
    protected boolean f116907m;
    public boolean n;

    static {
        Covode.recordClassIndex(75499);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.profile.ui.bm
    public final int b() {
        return R.layout.ape;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.bm, com.ss.android.ugc.aweme.profile.presenter.p
    public final void b(String str) {
    }

    @Override // com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.profile.ui.bm, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        o();
    }

    private void o() {
        if (this.Z) {
            this.f116902d.setVisibility(0);
            this.f116904j.setTuxFont(62);
            this.f116904j.setOnClickListener(new bb(this));
            this.f116905k.setAlpha(0.34f);
            this.f116899a.setAlpha(0.34f);
            this.F.setAlpha(0.34f);
            this.G.setAlpha(0.34f);
            this.I.setAlpha(0.34f);
            this.J.setAlpha(0.34f);
            r.a("tns_ags_float_profile_ban", new com.ss.android.ugc.aweme.account.a.b.a().f62575a);
            return;
        }
        this.f116902d.setVisibility(8);
        this.f116905k.setAlpha(1.0f);
        this.f116899a.setAlpha(1.0f);
        this.F.setAlpha(1.0f);
        this.G.setAlpha(1.0f);
        this.I.setAlpha(1.0f);
        this.J.setAlpha(1.0f);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        User curUser;
        String uri;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - ez.f142899a;
        ez.f142899a = currentTimeMillis;
        if ((j2 <= 0 || j2 >= 650) && (curUser = b.g().getCurUser()) != null && !this.Z) {
            if (curUser.getAvatarVideoUri() == null) {
                uri = null;
            } else {
                uri = curUser.getAvatarVideoUri().getUri();
            }
            if (TextUtils.isEmpty(uri)) {
                a aVar = this.ab;
                if (aVar.f116508b != null) {
                    ((com.ss.android.ugc.aweme.profile.f.a) aVar.f116508b).a();
                    return;
                }
                return;
            }
            a aVar2 = this.ab;
            MusAvatarImageView musAvatarImageView = this.f116900b;
            if (aVar2.f116508b != null) {
                ((com.ss.android.ugc.aweme.profile.f.a) aVar2.f116508b).a(musAvatarImageView);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ap
    public final void e() {
        this.w = true;
        this.z.a("");
        this.u.a(this.z.a());
        this.f116900b.setVisibility(4);
        this.f116901c.setTintColorRes(R.attr.bc);
        v a2 = com.bytedance.lighten.a.r.a((int) R.color.f159926j);
        a2.f39916l = R.color.f159926j;
        a2.E = this.f116903e;
        a2.c();
        List<String> list = b.g().getCurUser().boldFields;
        if (list != null) {
            if (list.size() > 0 && list.contains("video")) {
                list.remove("video");
                b.g().getCurUser().setBoldFields(list);
            }
            a("video", true, "blank");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.profile.ui.bm
    public final void c() {
        int i2;
        super.c();
        if (this.y != null) {
            RelativeLayout relativeLayout = this.f116899a;
            User user = this.y;
            if (user != null && (((user.getAvatarThumb() != null && !d.a(user.getAvatarThumb().getUrlList())) || ((user.getAvatarMedium() != null && !d.a(user.getAvatarMedium().getUrlList())) || (user.getAvatarLarger() != null && !d.a(user.getAvatarLarger().getUrlList())))) && ((user.getAvatarThumb() == null || d.a(user.getAvatarThumb().getUrlList()) || !user.getAvatarThumb().getUrlList().get(0).contains("1594805258216454")) && !FunctionSupportService.INSTANCE.notSupport(IFunctionKey.PROFILE_VIDEO_HEAD)))) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            relativeLayout.setVisibility(i2);
            if (this.f116900b.getVisibility() == 0) {
                e.a((RemoteImageView) this.f116900b, this.y.getAvatarVideoUri(), (com.facebook.drawee.c.d<f>) null, true);
            }
            if (this.y.getAvatarVideoUri() == null || this.y.getAvatarVideoUri().getUrlList() == null || this.y.getAvatarVideoUri().getUrlList().size() == 0) {
                this.f116901c.setTintColorRes(R.attr.bc);
                v a2 = com.bytedance.lighten.a.r.a((int) R.color.f159926j);
                a2.f39916l = R.color.f159926j;
                a2.E = this.f116903e;
                a2.c();
            } else {
                this.f116901c.setTintColorRes(R.attr.aa);
                v a3 = com.bytedance.lighten.a.r.a((int) R.color.c6);
                a3.f39916l = R.color.c6;
                a3.E = this.f116903e;
                a3.c();
            }
            com.bytedance.tux.c.e eVar = new com.bytedance.tux.c.e();
            eVar.f44781g = n.a(90.0d);
            eVar.f44782h = n.a(90.0d);
            eVar.f44777c = Float.valueOf((float) n.a(45.0d));
            eVar.f44776b = Integer.valueOf((int) R.attr.bj);
            this.f116906l.setBackground(eVar.a(getContext()));
            if (this.p != null && this.ac) {
                this.ac = false;
                y.a("enter", this.q);
            }
            o();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ap
    public final void a(AvatarUri avatarUri) {
        if (ab_() && getActivity() != null) {
            this.ab.d();
            if (this.u == null || avatarUri == null) {
                new com.ss.android.ugc.aweme.tux.a.i.a(getActivity()).a(R.string.nn).a();
            } else {
                this.z.a(avatarUri.uri);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.bm, com.ss.android.ugc.aweme.profile.presenter.p
    public final void b(Exception exc) {
        k();
        if (ab_() && this.v != null) {
            if ((exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && ((com.ss.android.ugc.aweme.base.api.a.a) exc).getErrorCode() == 20022) {
                c.a(getActivity(), "profile_image_setting", "review_failure");
            }
            com.ss.android.ugc.aweme.app.api.b.a.a((Context) getActivity(), (Throwable) exc, (int) R.string.nn);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ap
    public final void a(Exception exc) {
        k();
        if (ab_() && this.ab != null) {
            if ((exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && ((com.ss.android.ugc.aweme.base.api.a.a) exc).getErrorCode() == 20022) {
                c.a(getActivity(), "profile_image_setting", "review_failure");
            }
            com.ss.android.ugc.aweme.app.api.b.a.a((Context) getActivity(), (Throwable) exc, (int) R.string.nn);
            com.ss.android.ugc.trill.e.a.a(exc.getMessage(), "avatar");
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.bm, com.ss.android.ugc.aweme.profile.presenter.p
    public final void b(AvatarUri avatarUri) {
        if (this.u == null || avatarUri == null || d.a(avatarUri.urlList) || TextUtils.isEmpty(avatarUri.urlList.get(0))) {
            this.v.d();
            new com.ss.android.ugc.aweme.tux.a.i.a(getActivity()).a(R.string.nn).a();
            return;
        }
        this.x = true;
        this.w = true;
        this.v.d();
        this.z.f115963d = avatarUri.uri;
        e.b(this.r, avatarUri.urlList.get(0), (int) com.bytedance.common.utility.n.b(getContext(), 84.0f), (int) com.bytedance.common.utility.n.b(getContext(), 84.0f));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.profile.ui.bm
    public final void a(View view) {
        this.f116899a = (RelativeLayout) view.findViewById(R.id.dnv);
        this.f116900b = (MusAvatarImageView) view.findViewById(R.id.bfe);
        this.f116901c = (TuxIconView) view.findViewById(R.id.bff);
        this.f116902d = (ConstraintLayout) view.findViewById(R.id.d_f);
        this.f116903e = (SmartCircleImageView) view.findViewById(R.id.bfg);
        this.f116904j = (TuxTextView) view.findViewById(R.id.fio);
        this.f116905k = (RelativeLayout) view.findViewById(R.id.dnu);
        this.f116906l = (TuxIconView) view.findViewById(R.id.bfc);
        View findViewById = view.findViewById(R.id.dnv);
        if (findViewById != null) {
            findViewById.setOnClickListener(new ba(this));
        }
        super.a(view);
        a aVar = new a();
        this.ab = aVar;
        aVar.f116509c = this;
        this.ab.a(getActivity(), this);
        ((CircleImageView) this.f116900b).f68292f = true;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ap
    public final void a(String str) {
        if (ab_() && getActivity() != null) {
            this.w = true;
            this.f116907m = true;
            this.f116900b.setVisibility(0);
            try {
                Uri parse = Uri.parse("file://".concat(String.valueOf(str)));
                k.a().e().a(parse);
                e.a(this.f116900b, parse.toString(), 0, 0);
                this.f116901c.setTintColorRes(R.attr.aa);
                v a2 = com.bytedance.lighten.a.r.a((int) R.color.c6);
                a2.f39916l = R.color.c6;
                a2.E = this.f116903e;
                a2.c();
                List<String> list = b.g().getCurUser().boldFields;
                if (list != null) {
                    if (list.size() > 0 && !list.contains("video")) {
                        list.add("video");
                        b.g().getCurUser().setBoldFields(list);
                    }
                    a("video", false, "is_edited");
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.bm, com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(User user, int i2) {
        super.a(user, i2);
        this.x = true;
        if (i2 == 112) {
            this.y.setAvatarVideoUri(user.getAvatarVideoUri());
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.bm, androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 != 1000 && i2 != 1001) {
            this.ab.a(i2, i3, intent);
        }
    }
}

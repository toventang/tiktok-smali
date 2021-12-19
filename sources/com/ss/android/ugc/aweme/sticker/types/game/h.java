package com.ss.android.ugc.aweme.sticker.types.game;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.a;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.sticker.types.game.a.b;
import com.zhiliaoapp.musically.R;

public class h implements n {

    /* renamed from: a  reason: collision with root package name */
    b f136108a;

    /* renamed from: b  reason: collision with root package name */
    protected View f136109b;

    /* renamed from: c  reason: collision with root package name */
    private FrameLayout f136110c;

    /* renamed from: d  reason: collision with root package name */
    private LottieAnimationView f136111d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f136112e;

    static {
        Covode.recordClassIndex(88905);
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.game.n
    public void c() {
        LottieAnimationView lottieAnimationView = this.f136111d;
        if (lottieAnimationView != null) {
            lottieAnimationView.d();
            this.f136111d.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.game.n
    public final void d() {
        MethodCollector.i(10764);
        LottieAnimationView lottieAnimationView = this.f136111d;
        if (lottieAnimationView != null) {
            lottieAnimationView.d();
        }
        this.f136109b.setVisibility(8);
        this.f136110c.removeView(this.f136109b);
        MethodCollector.o(10764);
    }

    private void e() {
        View a2 = a(this.f136110c);
        this.f136109b = a2;
        this.f136111d = (LottieAnimationView) a2.findViewById(R.id.oh);
        ImageView imageView = (ImageView) this.f136109b.findViewById(R.id.bn_);
        this.f136112e = imageView;
        imageView.setOnClickListener(new i(this));
        this.f136111d.setOnClickListener(new j(this));
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.game.n
    public final void a() {
        MethodCollector.i(10608);
        if (this.f136111d == null) {
            e();
        }
        this.f136110c.removeAllViews();
        this.f136110c.addView(this.f136109b);
        this.f136109b.setVisibility(0);
        this.f136111d.setVisibility(8);
        MethodCollector.o(10608);
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.game.n
    public final void b() {
        if (this.f136111d == null) {
            e();
        }
        this.f136111d.setVisibility(0);
        this.f136111d.setImageAssetsFolder("start_anim/");
        this.f136111d.setAnimation("game_btn.json");
        this.f136111d.a();
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.game.n
    public final void a(b bVar) {
        this.f136108a = bVar;
    }

    public h(FrameLayout frameLayout) {
        this.f136110c = frameLayout;
    }

    /* access modifiers changed from: protected */
    public View a(ViewGroup viewGroup) {
        return a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aea, viewGroup, false);
    }
}

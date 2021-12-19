package com.ss.android.ugc.aweme.profile.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.ies.ugc.appcontext.d;
import com.facebook.drawee.e.q;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.d.j;
import com.facebook.imagepipeline.e.h;
import com.facebook.imagepipeline.e.k;
import com.facebook.imagepipeline.o.b;
import com.ss.android.common.c.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.ae;
import com.ss.android.ugc.aweme.profile.presenter.p;
import com.ss.android.ugc.aweme.profile.presenter.x;
import com.ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.utils.u;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class HeaderDetailActivity extends a implements p, x {
    private ae A;
    private boolean B;
    private String C;
    private ObjectAnimator D;

    /* renamed from: a  reason: collision with root package name */
    View f116767a;

    /* renamed from: b  reason: collision with root package name */
    AutoRTLImageView f116768b;

    /* renamed from: c  reason: collision with root package name */
    RemoteImageView f116769c;

    /* renamed from: d  reason: collision with root package name */
    FixedRatioFrameLayout f116770d;

    /* renamed from: e  reason: collision with root package name */
    ViewGroup f116771e;

    /* renamed from: f  reason: collision with root package name */
    ImageView f116772f;

    /* renamed from: g  reason: collision with root package name */
    ImageView f116773g;

    /* renamed from: h  reason: collision with root package name */
    View f116774h;

    /* renamed from: i  reason: collision with root package name */
    View f116775i;

    /* renamed from: j  reason: collision with root package name */
    TextView f116776j;

    /* renamed from: k  reason: collision with root package name */
    View f116777k;

    /* renamed from: l  reason: collision with root package name */
    TextView f116778l;

    /* renamed from: m  reason: collision with root package name */
    TextView f116779m;
    RelativeLayout n;
    RemoteImageView o;
    public Bitmap p;
    public User q;
    private ZoomAnimationUtils.ZoomInfo r;
    private View s;
    private float t;
    private boolean u = true;
    private boolean v = true;
    private Challenge w;
    private String[] x;
    private b[] y;
    private com.ss.android.ugc.aweme.profile.presenter.a z;

    static {
        Covode.recordClassIndex(75416);
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(boolean z2) {
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        return false;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z2) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(Exception exc, int i2) {
        com.ss.android.ugc.aweme.profile.presenter.a aVar;
        if (!isDestroyed() && this.A != null && (aVar = this.z) != null) {
            if (4 == i2) {
                aVar.d();
                if ((exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && ((com.ss.android.ugc.aweme.base.api.a.a) exc).getErrorCode() == 20022) {
                    c.a(this, "profile_image_setting", "review_failure");
                }
            } else if (i2 == 116) {
                return;
            }
            com.ss.android.ugc.aweme.app.api.b.a.a((Context) this, (Throwable) exc, (int) R.string.ez6);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(String str, boolean z2) {
        if (!isDestroyed()) {
            this.z.d();
            if (!TextUtils.isEmpty(str)) {
                new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(str).a();
                if (z2) {
                    finish();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void e() {
        com.ss.android.ugc.aweme.profile.presenter.a aVar = this.z;
        if (aVar.f116508b != null) {
            aVar.f116508b.e();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.cc);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        ObjectAnimator objectAnimator = this.D;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public void d() {
        this.r = (ZoomAnimationUtils.ZoomInfo) getIntent().getParcelableExtra("extra_zoom_info");
        this.x = getIntent().getStringArrayExtra("uri");
        this.t = getIntent().getFloatExtra("wh_ratio", 1.0f);
        this.q = (User) getIntent().getSerializableExtra("share_info");
        boolean z2 = true;
        this.u = getIntent().getBooleanExtra("enable_download_img", true);
        Intent intent = getIntent();
        if (this.q == null || !com.ss.android.ugc.aweme.account.b.g().isMe(this.q.getUid())) {
            z2 = false;
        }
        this.v = intent.getBooleanExtra("enable_edit_img", z2);
        this.w = (Challenge) getIntent().getSerializableExtra("challenge_info");
    }

    public final String a() {
        String str;
        com.facebook.b.a a2;
        File file;
        if (com.ss.android.ugc.aweme.base.utils.d.a(this.y)) {
            return "";
        }
        b[] bVarArr = this.y;
        for (b bVar : bVarArr) {
            if (bVar != null) {
                if (!k.a().d().d(j.a().a(bVar)) || (a2 = k.a().d().a(j.a().a(bVar))) == null || (file = ((com.facebook.b.b) a2).f46951a) == null) {
                    str = "";
                } else {
                    str = file.getAbsolutePath();
                }
                if (!TextUtils.isEmpty(str)) {
                    return str;
                }
            }
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.p
    public final void b(String str) {
        this.B = true;
        this.C = str;
        com.ss.android.ugc.aweme.profile.presenter.a aVar = this.z;
        if (aVar != null) {
            this.B = false;
            aVar.a(0);
        }
    }

    private static b a(String str) {
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
        imageDecodeOptionsBuilder.f47724e = false;
        com.facebook.imagepipeline.common.b bVar = new com.facebook.imagepipeline.common.b(imageDecodeOptionsBuilder);
        com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(Uri.parse(str));
        a2.f48449f = bVar;
        int[] c2 = c(str);
        if (c2 != null && c2[0] > 0 && c2[1] > 0) {
            a2.f48447d = new com.facebook.imagepipeline.common.d(c2[0], c2[1]);
        }
        return a2.a();
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.p
    public final void b(Exception exc) {
        com.ss.android.ugc.aweme.profile.presenter.a aVar;
        if (!isDestroyed() && (aVar = this.z) != null) {
            aVar.d();
            if ((exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && ((com.ss.android.ugc.aweme.base.api.a.a) exc).getErrorCode() == 20022) {
                c.a(this, "profile_image_setting", "review_failure");
            }
            com.ss.android.ugc.aweme.app.api.b.a.a((Context) this, (Throwable) exc, (int) R.string.nn);
        }
    }

    public void showLoadAnim(final View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotation", 0.0f, 360.0f);
        this.D = ofFloat;
        ofFloat.setDuration(600L);
        this.D.setRepeatCount(-1);
        this.D.setInterpolator(new LinearInterpolator());
        this.D.start();
        this.D.addListener(new Animator.AnimatorListener() {
            /* class com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity.AnonymousClass2 */

            static {
                Covode.recordClassIndex(75418);
            }

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
                view.setScaleX(0.0f);
                view.setScaleY(0.0f);
                view.setAlpha(0.0f);
                view.setRotation(0.0f);
                view.setVisibility(0);
            }
        });
    }

    private static String a(List<String> list) {
        h e2 = k.a().e();
        for (String str : list) {
            if (e2.b(Uri.parse(str))) {
                return str;
            }
        }
        return null;
    }

    private static int[] c(String str) {
        int i2;
        MethodCollector.i(10278);
        Uri parse = Uri.parse(str);
        if (!e.b(parse.getPath())) {
            MethodCollector.o(10278);
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(parse.getPath(), options);
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        if (i3 > 720 || i4 > 1280) {
            int i5 = i3 >> 1;
            int i6 = i4 >> 1;
            i2 = 1;
            while (i5 / i2 > 720 && i6 / i2 > 1280) {
                i2 <<= 1;
            }
        } else {
            i2 = 1;
        }
        int[] iArr = {i3 >> i2, i4 >> i2};
        MethodCollector.o(10278);
        return iArr;
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.p
    public final void b(AvatarUri avatarUri) {
        this.z.d();
        if (avatarUri == null) {
            new com.ss.android.ugc.aweme.tux.a.i.a(this).a(R.string.nn).a();
            return;
        }
        this.A.d(avatarUri.uri);
        Uri parse = Uri.parse("file://" + this.C);
        k.a().e().a(parse);
        a(this.f116769c, false, parse.toString());
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        User user;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.an5);
        this.f116767a = findViewById(R.id.em8);
        this.f116768b = (AutoRTLImageView) findViewById(R.id.bu7);
        this.f116769c = (RemoteImageView) findViewById(R.id.fcy);
        this.f116770d = (FixedRatioFrameLayout) findViewById(R.id.b9l);
        this.f116771e = (ViewGroup) findViewById(R.id.dqn);
        this.f116772f = (ImageView) findViewById(R.id.bwf);
        this.f116773g = (ImageView) findViewById(R.id.c03);
        this.f116774h = findViewById(R.id.c04);
        this.f116775i = findViewById(R.id.sj);
        this.f116776j = (TextView) findViewById(R.id.eyx);
        this.f116777k = findViewById(R.id.p9);
        this.f116778l = (TextView) findViewById(R.id.p_);
        this.f116779m = (TextView) findViewById(R.id.p8);
        this.n = (RelativeLayout) findViewById(R.id.p6);
        this.o = (RemoteImageView) findViewById(R.id.p7);
        View findViewById = findViewById(R.id.bu7);
        if (findViewById != null) {
            findViewById.setOnClickListener(new af(this));
        }
        View findViewById2 = findViewById(R.id.bwf);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new ag(this));
        }
        View findViewById3 = findViewById(R.id.eyx);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new ah(this));
        }
        overridePendingTransition(R.anim.cb, R.anim.cc);
        this.s = findViewById(16908290);
        d();
        this.f116770d.setWhRatio(this.t);
        ((com.facebook.drawee.f.a) this.f116769c.getHierarchy()).a(q.b.f47438d);
        a(this.f116769c, true, this.x);
        com.ss.android.ugc.aweme.profile.presenter.a aVar = new com.ss.android.ugc.aweme.profile.presenter.a();
        this.z = aVar;
        aVar.f116509c = this;
        Drawable drawable = null;
        this.z.b(this, null);
        ae aeVar = new ae();
        this.A = aeVar;
        aeVar.f116520c = this;
        this.f116771e.setBackgroundColor(-16777216);
        this.f116771e.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity.AnonymousClass1 */

            static {
                Covode.recordClassIndex(75417);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (HeaderDetailActivity.this.f116767a.getVisibility() != 0) {
                    HeaderDetailActivity.this.onBackPressed();
                }
            }
        });
        if (this.u) {
            this.f116772f.setVisibility(0);
            this.f116775i.setVisibility(0);
        }
        if (com.ss.android.ugc.aweme.aq.a.a.a() && (user = this.q) != null && !in.g(user) && this.w == null && this.q.isActivityUser()) {
            this.f116777k.setVisibility(0);
            this.n.setVisibility(0);
            com.ss.android.ugc.aweme.y.c b2 = com.ss.android.ugc.aweme.aq.a.a.b();
            if (!(b2 == null || b2.f145309i == null)) {
                this.f116779m.setText(b2.f145309i.f145299b);
                this.f116778l.setText(b2.f145309i.f145298a);
                RemoteImageView remoteImageView = this.o;
                Drawable drawable2 = com.ss.android.ugc.aweme.aq.b.d.f66975a.get("avatar_hat.png");
                if (drawable2 == null) {
                    com.ss.android.ugc.aweme.aq.b.b a2 = com.ss.android.ugc.aweme.aq.b.b.a();
                    String str = a2.f66971b;
                    if (TextUtils.isEmpty(str)) {
                        a2.f66971b = com.ss.android.ugc.aweme.aq.b.b.f66969a + File.separator + com.bytedance.common.utility.d.b(com.ss.android.ugc.aweme.aq.b.b.b());
                        str = a2.f66971b;
                    }
                    File file = new File(str);
                    if (file.exists() && file.isDirectory() && file.exists() && file.isDirectory()) {
                        File file2 = new File(file, "avatar_hat.png");
                        if (file2.exists() && file2.isFile() && file2.exists()) {
                            drawable = Drawable.createFromPath(file2.getPath());
                            if (drawable instanceof BitmapDrawable) {
                                ((BitmapDrawable) drawable).setTargetDensity((n.d(d.a()) * n.d(d.a())) / 480);
                            }
                            if (drawable != null) {
                                com.ss.android.ugc.aweme.aq.b.d.f66975a.put("avatar_hat.png", drawable);
                            }
                        }
                    }
                    drawable2 = drawable;
                }
                remoteImageView.setImageDrawable(drawable2);
            }
        }
        if (this.v && !in.d()) {
            this.f116776j.setVisibility(0);
        }
        if (this.w != null) {
            this.f116767a.setVisibility(0);
            this.f116768b.setImageDrawable(getResources().getDrawable(R.drawable.b80));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onCreate", false);
    }

    private static void a(Activity activity, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
        activity.startActivity(intent);
    }

    public static void a(Activity activity, Bundle bundle) {
        if (activity != null) {
            Intent intent = new Intent(activity, I18nHeaderDetailActivity.class);
            intent.putExtras(bundle);
            a(activity, intent);
            activity.overridePendingTransition(0, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(User user, int i2) {
        this.B = true;
        if (i2 == 4) {
            if (user.getAvatarMedium() != null) {
                a(this.f116769c, false, (String[]) user.getAvatarMedium().getUrlList().toArray(new String[user.getAvatarMedium().getUrlList().size()]));
            } else {
                com.ss.android.ugc.aweme.base.e.a(this.f116769c, user.getAvatarMedium());
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(R.string.ey9).a();
        }
        com.ss.android.ugc.aweme.profile.presenter.a aVar = this.z;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        this.z.a(i2, i3, intent);
    }

    /* access modifiers changed from: protected */
    public final void a(RemoteImageView remoteImageView, boolean z2, String... strArr) {
        if (remoteImageView != null) {
            ArrayList arrayList = new ArrayList();
            if (!com.ss.android.ugc.aweme.base.utils.d.a(strArr)) {
                for (String str : strArr) {
                    if (!m.a(str)) {
                        arrayList.add(a(str));
                    }
                }
            }
            REQUEST request = null;
            if (z2) {
                UrlModel a2 = u.a(this.q);
                String a3 = a2 != null ? a(a2.getUrlList()) : null;
                if (!TextUtils.isEmpty(a3)) {
                    request = (REQUEST) a(a3);
                }
                if (com.ss.android.ugc.aweme.base.utils.d.a(arrayList)) {
                    com.ss.android.ugc.aweme.base.e.a(remoteImageView, 2131232324);
                    return;
                }
            }
            this.y = new b[arrayList.size()];
            com.facebook.drawee.a.a.e eVar = (com.facebook.drawee.a.a.e) com.facebook.drawee.a.a.c.b().a(arrayList.toArray(this.y));
            eVar.f47325m = remoteImageView.getController();
            eVar.f47322j = c();
            if (request != null) {
                eVar.f47316d = request;
            }
            remoteImageView.setController(eVar.e());
        }
    }

    public static void a(Activity activity, View view, float f2, User user, boolean z2, boolean z3, String... strArr) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_zoom_info", ZoomAnimationUtils.a(view));
        bundle.putStringArray("uri", strArr);
        bundle.putFloat("wh_ratio", f2);
        bundle.putBoolean("enable_download_img", z2);
        bundle.putBoolean("handle_with_video_avatar", z3);
        if (user != null) {
            bundle.putSerializable("share_info", user);
        }
        a(activity, bundle);
    }
}

package com.ss.android.ugc.aweme.livewallpaper.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.collection.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.sheet.sheet.a;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.livewallpaper.a.a;
import com.ss.android.ugc.aweme.livewallpaper.b.f;
import com.ss.android.ugc.aweme.livewallpaper.b.g;
import com.ss.android.ugc.aweme.livewallpaper.f.d;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.ss.android.ugc.aweme.livewallpaper.ui.a;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.aweme.ug.dynamicresource.c;
import com.ss.android.ugc.aweme.ug.h;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocalLiveWallPaperActivity extends a {

    /* renamed from: a  reason: collision with root package name */
    TextView f108959a;

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f108960b;

    /* renamed from: c  reason: collision with root package name */
    TuxStatusView f108961c;

    /* renamed from: d  reason: collision with root package name */
    public String f108962d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.livewallpaper.a.a f108963e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f108964f;

    /* renamed from: g  reason: collision with root package name */
    private f f108965g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f108966h;

    static {
        Covode.recordClassIndex(69762);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onResume", true);
        super.onResume();
        List<LiveWallPaperBean> c2 = d.f108899e.c();
        if (b.a((Collection) c2)) {
            this.f108961c.setVisibility(0);
            com.bytedance.tux.c.a aVar = new com.bytedance.tux.c.a();
            aVar.f44749a = R.raw.icon_large_live_wallpaper;
            aVar.f44753e = Integer.valueOf((int) R.attr.bd);
            this.f108961c.setStatus(new TuxStatusView.c().a(aVar).a(getString(R.string.hdz)).a((CharSequence) getString(R.string.hdy)));
        } else {
            if (!this.f108964f) {
                this.f108964f = true;
                if (!b.a((Collection) c2)) {
                    for (LiveWallPaperBean liveWallPaperBean : c2) {
                        r.a("wall_paper_show", new com.ss.android.ugc.aweme.app.f.d().a("group_id", liveWallPaperBean.getId()).a("enter_from", "paper_set").f66730a);
                    }
                }
            }
            this.f108961c.setVisibility(8);
        }
        com.ss.android.ugc.aweme.livewallpaper.a.a aVar2 = this.f108963e;
        aVar2.f108734a.clear();
        if (!b.a((Collection) c2)) {
            aVar2.f108734a.addAll(c2);
        }
        aVar2.notifyDataSetChanged();
        if (this.f108966h) {
            this.f108966h = false;
            if (!b.a((Collection) c2)) {
                LiveWallPaperBean liveWallPaperBean2 = c2.get(0);
                if (!TextUtils.isEmpty(liveWallPaperBean2.getVideoUri()) && !TextUtils.isEmpty(liveWallPaperBean2.getVideoUrl())) {
                    a(liveWallPaperBean2);
                }
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onResume", false);
    }

    public void exit(View view) {
        finish();
    }

    public final void b(LiveWallPaperBean liveWallPaperBean) {
        Intent intent = new Intent(this, LiveWallPaperPreviewActivity.class);
        intent.putExtra("live_wall_paper", liveWallPaperBean);
        intent.putExtra("from", this.f108962d);
        com.ss.android.ugc.tiktok.security.a.a.a(intent, this);
        startActivity(intent);
    }

    public void showSettingDialog(View view) {
        boolean z;
        LiveWallPaperBean liveWallPaperBean = d.f108899e.f108902c;
        if (liveWallPaperBean != null) {
            z = liveWallPaperBean.isShouldMute();
        } else {
            z = false;
        }
        new o().a(this, z, "history", null);
    }

    public void findWallpapersTvClick(View view) {
        r.onEventV3("click_find_wallpapers");
        t.a(t.a(), u.a("aweme://challenge/detail/1302").a("enter_from", "wallpaper_record").f71178a.a());
    }

    public final void a(final LiveWallPaperBean liveWallPaperBean) {
        if (this.f108965g == null) {
            f fVar = new f(this);
            this.f108965g = fVar;
            fVar.f108781d = new g() {
                /* class com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(69764);
                }

                @Override // com.ss.android.ugc.aweme.livewallpaper.b.g
                public final void a() {
                    com.ss.android.ugc.aweme.livewallpaper.f.f.a(LocalLiveWallPaperActivity.this.f108962d, liveWallPaperBean.getId(), false);
                }

                @Override // com.ss.android.ugc.aweme.livewallpaper.b.g
                public final void a(String str) {
                    liveWallPaperBean.setVideoPath(str);
                    d.f108899e.b();
                    LocalLiveWallPaperActivity.this.b(liveWallPaperBean);
                    com.ss.android.ugc.aweme.livewallpaper.f.f.a(LocalLiveWallPaperActivity.this.f108962d, liveWallPaperBean.getId(), true);
                }
            };
        }
        f fVar2 = this.f108965g;
        String videoUrl = liveWallPaperBean.getVideoUrl();
        String videoUri = liveWallPaperBean.getVideoUri();
        l.d(videoUrl, "");
        l.d(videoUri, "");
        if (fVar2.f108778a == null) {
            com.ss.android.ugc.aweme.shortvideo.view.d a2 = com.ss.android.ugc.aweme.shortvideo.view.d.a(fVar2.f108782e, fVar2.f108782e.getString(R.string.cyn));
            a2.setIndeterminate(false);
            fVar2.f108778a = a2;
        }
        com.ss.android.ugc.aweme.shortvideo.view.d dVar = fVar2.f108778a;
        if (dVar == null) {
            l.b();
        }
        dVar.setProgress(0);
        String a3 = com.ss.android.ugc.aweme.livewallpaper.f.f.a();
        String str = a3 + "temp";
        if (!e.b(str)) {
            e.a(str, false);
        }
        String str2 = com.bytedance.common.utility.d.b(videoUri) + ".mp4";
        String str3 = a3 + str2;
        fVar2.f108779b = str + str2;
        if (e.b(str3)) {
            fVar2.a(str3);
        } else {
            com.ss.android.ugc.aweme.download.component_api.a with = DownloadServiceManager.INSTANCE.getDownloadService().with(videoUrl);
            with.f83078c = str2;
            with.f83081f = str;
            com.ss.android.ugc.aweme.download.component_api.a a4 = with.a(3).a(true);
            a4.D = new f.a(fVar2, str3);
            a4.f();
            fVar2.f108780c.postDelayed(new f.d(fVar2), TimeUnit.SECONDS.toMillis(60));
        }
        com.ss.android.ugc.aweme.livewallpaper.f.f.a(this.f108962d);
    }

    public void howSetWallpapersTvClick(View view) {
        MethodCollector.i(6835);
        r.onEventV3("click_how_to_set_wallpapers");
        a aVar = new a();
        l.d(this, "");
        View inflate = View.inflate(this, R.layout.bki, null);
        a.C1112a aVar2 = new a.C1112a();
        l.b(inflate, "");
        aVar.f108970a = aVar2.a(inflate).a(0).a(true).f45299a;
        inflate.findViewById(R.id.a7y).setOnClickListener(new a.View$OnClickListenerC2791a(aVar));
        IUgCommonService j2 = UgCommonServiceImpl.j();
        com.ss.android.ugc.aweme.ug.dynamicresource.l c2 = j2.c();
        if (c2.c()) {
            View findViewById = inflate.findViewById(R.id.e_z);
            l.b(findViewById, "");
            c2.a((ImageView) findViewById, c.b.f141785a);
            View findViewById2 = inflate.findViewById(R.id.ea3);
            l.b(findViewById2, "");
            c2.a((ImageView) findViewById2, c.b.f141786b);
        } else {
            String a2 = j2.a(h.WALLPAPER_GUIDE_STEP_1);
            if (a2 == null) {
                a2 = "";
            }
            String a3 = j2.a(h.WALLPAPER_GUIDE_STEP_2);
            if (a3 == null) {
                a3 = "";
            }
            View findViewById3 = inflate.findViewById(R.id.e_z);
            l.b(findViewById3, "");
            a.a((com.bytedance.lighten.a.l) findViewById3, a2);
            View findViewById4 = inflate.findViewById(R.id.ea3);
            l.b(findViewById4, "");
            a.a((com.bytedance.lighten.a.l) findViewById4, a3);
        }
        View findViewById5 = inflate.findViewById(R.id.e_x);
        l.b(findViewById5, "");
        a.a(this, (TextView) findViewById5, R.raw.icon_arrow_turn_up_right);
        View findViewById6 = inflate.findViewById(R.id.ea1);
        l.b(findViewById6, "");
        a.a(this, (TextView) findViewById6, R.raw.icon_2pt_live_wallpaper);
        com.bytedance.tux.sheet.sheet.a aVar3 = aVar.f108970a;
        if (aVar3 != null) {
            aVar3.show(getSupportFragmentManager(), "");
            MethodCollector.o(6835);
            return;
        }
        MethodCollector.o(6835);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onCreate", true);
        x xVar = new x((byte) 0);
        xVar.f65555a = true;
        xVar.f65561g = R.color.nd;
        activityConfiguration(new h(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.bkg);
        this.f108959a = (TextView) findViewById(R.id.title);
        this.f108960b = (RecyclerView) findViewById(R.id.djs);
        this.f108961c = (TuxStatusView) findViewById(R.id.e_o);
        View findViewById = findViewById(R.id.d85);
        if (findViewById != null) {
            findViewById.setOnClickListener(new i(this));
        }
        View findViewById2 = findViewById(R.id.qb);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new j(this));
        }
        View findViewById3 = findViewById(R.id.b3e);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new k(this));
        }
        View findViewById4 = findViewById(R.id.bh_);
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new l(this));
        }
        TextView textView = this.f108959a;
        if (textView != null) {
            textView.setText(getString(R.string.hdr));
        }
        this.f108960b.setLayoutManager(new WrapGridLayoutManager(3, 1));
        this.f108960b.setHasFixedSize(true);
        com.ss.android.ugc.aweme.livewallpaper.a.a aVar = new com.ss.android.ugc.aweme.livewallpaper.a.a();
        this.f108963e = aVar;
        aVar.f108735b = new a.AbstractC2788a() {
            /* class com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity.AnonymousClass1 */

            static {
                Covode.recordClassIndex(69763);
            }

            @Override // com.ss.android.ugc.aweme.livewallpaper.a.a.AbstractC2788a
            public final void a(LiveWallPaperBean liveWallPaperBean) {
                if (TextUtils.isEmpty(liveWallPaperBean.getVideoPath())) {
                    LocalLiveWallPaperActivity.this.a(liveWallPaperBean);
                } else {
                    LocalLiveWallPaperActivity.this.b(liveWallPaperBean);
                }
            }
        };
        this.f108960b.a(new com.ss.android.ugc.aweme.profile.a.a((int) n.b(this, 1.0f)));
        this.f108960b.setAdapter(this.f108963e);
        this.f108966h = getIntent().getBooleanExtra("is_first_install_launch", false);
        String a2 = a(getIntent(), "from");
        this.f108962d = a2;
        if (a2 == null) {
            this.f108962d = "plugin";
        }
        r.a("enter_local_live_wallpaper", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f108962d).f66730a);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}

package com.bytedance.tiktok.homepage.mainpagefragment.dialog;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.main.b.b;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.story.b.h;
import com.ss.android.ugc.aweme.story.g;
import org.greenrobot.eventbus.EventBus;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public b f44296a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f44297b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f44298c;

    /* renamed from: d  reason: collision with root package name */
    public HomePageDataViewModel f44299d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f44300e;

    static {
        Covode.recordClassIndex(27140);
    }

    public final void b() {
        b bVar = this.f44296a;
        if (bVar != null) {
            this.f44297b = false;
            bVar.a();
        }
    }

    public final void a() {
        MethodCollector.i(4099);
        b bVar = this.f44296a;
        if (bVar != null) {
            if (bVar.f109177a == null) {
                bVar.f109177a = bVar.f109178b.inflate();
            }
            bVar.f109179c = new Handler(Looper.getMainLooper());
            r.onEvent(MobClick.obtain().setEventName("photo_notice").setLabelName("shoot_bottom_tab"));
            EventBus.a(EventBus.a(), bVar);
            bVar.f109177a.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.main.b.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(69918);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    b.this.a();
                    r.onEvent(MobClick.obtain().setEventName("photo_notice_click").setLabelName("shoot_bottom_tab"));
                }
            });
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bVar.f109177a, "scaleX", 0.0f, 1.0f, 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bVar.f109177a, "scaleY", 0.0f, 1.0f, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(800L);
            animatorSet.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.ugc.aweme.main.b.b.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(69919);
                }

                public final void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    b.this.f109177a.setVisibility(0);
                }
            });
            animatorSet.play(ofFloat).with(ofFloat2);
            bVar.f109179c.post(new Runnable(animatorSet) {
                /* class com.ss.android.ugc.aweme.main.b.b.AnonymousClass3 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ AnimatorSet f109183a;

                static {
                    Covode.recordClassIndex(69920);
                }

                public final void run() {
                    this.f109183a.start();
                }

                {
                    this.f109183a = r2;
                }
            });
            bVar.f109179c.postDelayed(bVar.f109180d, 6000);
            MethodCollector.o(4099);
            return;
        }
        MethodCollector.o(4099);
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.a$a  reason: collision with other inner class name */
    public static final class C1080a implements AwemeChangeCallBack.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Keva f44301a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f44302b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f44303c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f44304d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.bytedance.tux.tooltip.a f44305e;

        static {
            Covode.recordClassIndex(27141);
        }

        public C1080a(Keva keva, a aVar, e eVar, boolean z, com.bytedance.tux.tooltip.a aVar2) {
            this.f44301a = keva;
            this.f44302b = aVar;
            this.f44303c = eVar;
            this.f44304d = z;
            this.f44305e = aVar2;
        }

        @Override // com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack.a
        public final void a(Aweme aweme) {
            String c2;
            String c3;
            if (aweme != null && this.f44302b.f44300e && !this.f44302b.f44298c && !aweme.isAd() && !CommentServiceImpl.e().a((Context) this.f44303c)) {
                String str = "";
                if (this.f44304d) {
                    com.bytedance.tux.tooltip.a aVar = this.f44305e;
                    if (aVar != null) {
                        aVar.a();
                    }
                    this.f44301a.storeLong("key_tutorial_last_time", System.currentTimeMillis());
                    this.f44301a.storeBoolean("key_bubble_has_shown", true);
                    HomePageDataViewModel homePageDataViewModel = this.f44302b.f44299d;
                    if (!(homePageDataViewModel == null || (c3 = homePageDataViewModel.c()) == null)) {
                        str = c3;
                    }
                    h.a(str, "bubble", "auto", "show");
                } else if (this.f44301a.getBoolean("key_bubble_has_shown", false)) {
                    g gVar = g.f137757a;
                    e eVar = this.f44303c;
                    HomePageDataViewModel homePageDataViewModel2 = this.f44302b.f44299d;
                    if (!(homePageDataViewModel2 == null || (c2 = homePageDataViewModel2.c()) == null)) {
                        str = c2;
                    }
                    gVar.a(eVar, str);
                }
                this.f44302b.f44298c = true;
            }
        }
    }
}

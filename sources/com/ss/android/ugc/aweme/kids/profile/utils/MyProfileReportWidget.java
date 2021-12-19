package com.ss.android.ugc.aweme.kids.profile.utils;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import com.bytedance.widget.Widget;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import com.ss.android.ugc.aweme.kids.profile.base.NoticeView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public class MyProfileReportWidget extends Widget implements au {

    /* renamed from: i  reason: collision with root package name */
    public static final a f106783i = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    public View f106784g;

    /* renamed from: h  reason: collision with root package name */
    public AnimatorSet f106785h;

    static {
        Covode.recordClassIndex(68266);
    }

    @Override // com.bytedance.widget.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68267);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements NoticeView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NoticeView f106786a;

        static {
            Covode.recordClassIndex(68268);
        }

        @Override // com.ss.android.ugc.aweme.kids.profile.base.NoticeView.a
        public final void b() {
            this.f106786a.setVisibility(8);
            Keva.getRepo("ftc_report").storeLong("ftc_report_last_show_time", System.currentTimeMillis());
            if (Keva.getRepo("ftc_report").getLong("ftc_report_first_show_time", 0) == 0) {
                Keva.getRepo("ftc_report").storeLong("ftc_report_first_show_time", System.currentTimeMillis());
            }
        }

        @Override // com.ss.android.ugc.aweme.kids.profile.base.NoticeView.a
        public final void a() {
            this.f106786a.setVisibility(8);
            IBulletService f2 = BulletService.f();
            Context a2 = d.a();
            Bundle bundle = new Bundle();
            bundle.putBoolean("hide_nav_bar", true);
            f2.a(a2, "https://www.tiktok.com/aweme/inapp/v2/c_feedback", bundle);
            Keva.getRepo("ftc_report").storeLong("ftc_report_last_show_time", System.currentTimeMillis());
            if (Keva.getRepo("ftc_report").getLong("ftc_report_first_show_time", 0) == 0) {
                Keva.getRepo("ftc_report").storeLong("ftc_report_first_show_time", System.currentTimeMillis());
            }
        }

        b(NoticeView noticeView) {
            this.f106786a = noticeView;
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MyProfileReportWidget f106787a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f106788b;

        static {
            Covode.recordClassIndex(68269);
        }

        c(MyProfileReportWidget myProfileReportWidget, View view) {
            this.f106787a = myProfileReportWidget;
            this.f106788b = view;
        }

        public final void run() {
            this.f106787a.f106785h = new AnimatorSet();
            View view = this.f106787a.f106784g;
            if (view == null) {
                l.b();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            AnimatorSet animatorSet = this.f106787a.f106785h;
            if (animatorSet != null) {
                animatorSet.playTogether(ofFloat);
            }
            AnimatorSet animatorSet2 = this.f106787a.f106785h;
            if (animatorSet2 != null) {
                animatorSet2.setDuration(200L);
            }
            AnimatorSet animatorSet3 = this.f106787a.f106785h;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
            this.f106788b.setVisibility(0);
        }
    }

    @Override // com.bytedance.widget.Widget
    public final void c() {
        super.c();
        Integer userPeriod = KidsAccountServiceImpl.h().b().getUserPeriod();
        if (userPeriod != null && userPeriod.intValue() == 1) {
            long j2 = Keva.getRepo("ftc_report").getLong("ftc_report_first_show_time", 0);
            if (j2 == 0 || System.currentTimeMillis() - j2 <= TimeUnit.DAYS.toMillis(30)) {
                if (System.currentTimeMillis() - Keva.getRepo("ftc_report").getLong("ftc_report_last_show_time", 0) > TimeUnit.DAYS.toMillis(1)) {
                    View view = this.f46127e;
                    if (view == null) {
                        l.b();
                    }
                    NoticeView noticeView = (NoticeView) view.findViewById(R.id.fj1);
                    if (noticeView == null) {
                        l.b();
                    }
                    noticeView.setTitleText(R.string.d8p);
                    noticeView.setOnInternalClickListener(new b(noticeView));
                    this.f106784g = noticeView;
                    noticeView.post(new c(this, noticeView));
                }
            }
        }
    }

    public MyProfileReportWidget(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        this.f46127e = viewGroup;
    }
}

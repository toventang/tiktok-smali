package com.ss.android.ugc.aweme.notification.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.language.d;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    static final int f113882a = n.a(10.0d);

    /* renamed from: b  reason: collision with root package name */
    public static final j f113883b = new j();

    private j() {
    }

    static {
        Covode.recordClassIndex(73234);
    }

    public static void a(View view) {
        l.d(view, "");
        view.addOnLayoutChangeListener(new a(view));
    }

    public static String a(User user) {
        l.d(user, "");
        if (!d.c()) {
            String a2 = l.a(user);
            l.b(a2, "");
            return a2;
        } else if (!TextUtils.isEmpty(user.getRemarkName())) {
            String remarkName = user.getRemarkName();
            l.b(remarkName, "");
            return remarkName;
        } else {
            String nickname = user.getNickname();
            l.b(nickname, "");
            return nickname;
        }
    }

    public static void b(View view) {
        l.d(view, "");
        if (Build.VERSION.SDK_INT < 21) {
            com.ss.android.ugc.aweme.notification.g.a.a(view);
            view.setBackgroundColor(view.getResources().getColor(R.color.f159928l));
            return;
        }
        view.setBackground(view.getResources().getDrawable(R.drawable.na));
    }

    public static void a(Context context) {
        l.d(context, "");
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            l.d(activity, "");
            Intent intent = activity.getIntent();
            if (intent != null && intent.getBooleanExtra("from_notification", false)) {
                String a2 = a(intent, "rule_id");
                if (a2 == null) {
                    a2 = "";
                }
                l.b(a2, "");
                if (!TextUtils.isEmpty(a2)) {
                    LogHelperImpl.a().a("video_play_from_push", a2);
                }
            }
        }
    }

    public static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Context context, String str, int i2) {
        Intent intent;
        l.d(context, "");
        l.d(str, "");
        if ((context instanceof Activity) && (intent = ((Activity) context).getIntent()) != null && intent.getBooleanExtra("from_notification", false)) {
            String a2 = a(intent, "rule_id");
            if (!TextUtils.isEmpty(a2)) {
                r.a("enter_personal_detail_backup_from_push", new com.ss.android.ugc.aweme.app.f.d().a("action_type", "click").a("account_type", str).a("client_order", String.valueOf(i2)).a("rule_id", a2).f66730a);
            }
        }
    }

    static final class a implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f113884a;

        static {
            Covode.recordClassIndex(73235);
        }

        a(View view) {
            this.f113884a = view;
        }

        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            if (i3 > j.f113882a) {
                this.f113884a.setTop(j.f113882a);
            }
        }
    }
}

package com.ss.android.ugc.aweme.notification.h;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.b;
import com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg;
import com.ss.android.ugc.aweme.notification.g.a;
import com.ss.android.ugc.aweme.notification.utils.g;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.zhiliaoapp.musically.R;

public final class ac extends k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private View f113494a;

    /* renamed from: b  reason: collision with root package name */
    private AvatarImageView f113495b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f113496c;

    /* renamed from: d  reason: collision with root package name */
    private b f113497d;

    /* renamed from: e  reason: collision with root package name */
    private Context f113498e;

    static {
        Covode.recordClassIndex(72979);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k
    public final int bX_() {
        return R.id.cxx;
    }

    private static boolean c() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public ac(View view) {
        super(view);
        this.f113498e = view.getContext();
        this.f113494a = view.findViewById(R.id.cxx);
        this.f113495b = (AvatarImageView) view.findViewById(R.id.cx6);
        this.f113496c = (TextView) view.findViewById(R.id.cwx);
        g.a(this.f113494a);
        a.a(this.f113495b);
        this.f113494a.setOnClickListener(this);
        this.f113495b.setOnClickListener(this);
    }

    public final void a(MusNotice musNotice) {
        if (musNotice != null && musNotice.adHelperNotice != null) {
            this.f113497d = musNotice.adHelperNotice;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f113498e.getString(R.string.ci7));
            spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
            if (!TextUtils.isEmpty(this.f113497d.f112832b)) {
                spannableStringBuilder.append(": ");
                spannableStringBuilder.append((CharSequence) this.f113497d.f112832b);
            }
            this.f113495b.setImageURI(com.facebook.common.k.g.a(2131231295));
            a(spannableStringBuilder, musNotice);
            this.f113496c.setText(spannableStringBuilder);
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a
    public final void onClick(View view) {
        String str;
        ClickAgent.onClick(view);
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = c();
        }
        if (!j.f107229h) {
            new com.bytedance.tux.g.b(this.itemView).e(R.string.de8).b();
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(this.f113498e, "//notice/detail");
        int a2 = com.ss.android.ugc.aweme.notice.api.b.a(21);
        if (this.f113648j != null) {
            str = this.f113648j.nid;
        } else {
            str = null;
        }
        buildRoute.withNavArg(new MusNotificationDetailArg(21, a2, "", "", str)).open();
    }
}

package com.ss.android.ugc.aweme.share.improve.a;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.qainvitation.e.e;
import com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.i;
import java.util.Objects;

public final class ai implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123622a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h.h f123623b = i.a((h.f.a.a) c.f123627a);

    /* renamed from: c  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.qna.model.b f123624c;

    static {
        Covode.recordClassIndex(81149);
    }

    private final IQAInvitationService h() {
        return (IQAInvitationService) this.f123623b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.a7t;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "qa_invite";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_plus_person;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean d() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean e() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean f() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81150);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<IQAInvitationService> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f123627a = new c();

        static {
            Covode.recordClassIndex(81152);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IQAInvitationService invoke() {
            return QAInvitationService.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int g() {
        return ch_();
    }

    static final class b implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ai f123625a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f123626b;

        static {
            Covode.recordClassIndex(81151);
        }

        b(ai aiVar, Context context) {
            this.f123625a = aiVar;
            this.f123626b = context;
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void a() {
            ai aiVar = this.f123625a;
            Context context = this.f123626b;
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            aiVar.a((Activity) context);
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context) {
        l.d(context, "");
        l.d(context, "");
    }

    public ai(com.ss.android.ugc.aweme.qna.model.b bVar) {
        l.d(bVar, "");
        this.f123624c = bVar;
    }

    public final void a(Activity activity) {
        IQAInvitationService.a.a(h(), activity, "click_share", "qa_detail", e.QUESTION_DETAIL, Long.valueOf(this.f123624c.f119476b), null, null, 224);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(ImageView imageView) {
        l.d(imageView, "");
        l.d(imageView, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(TextView textView) {
        l.d(textView, "");
        h.a.a(this, textView);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (!g2.isLogin()) {
            com.ss.android.ugc.aweme.login.c.a((Activity) context, "qa_detail", "click_share", new b(this, context));
        } else {
            a((Activity) context);
        }
    }
}

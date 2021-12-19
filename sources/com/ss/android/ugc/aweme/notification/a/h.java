package com.ss.android.ugc.aweme.notification.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.facebook.common.k.g;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice;
import com.ss.android.ugc.aweme.notification.h.p;
import com.ss.android.ugc.aweme.notification.h.q;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class h extends p implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public static final a f113060c = new a((byte) 0);
    private String A;
    private BaseNotice B;
    private final NotificationDetailVM C;

    /* renamed from: a  reason: collision with root package name */
    public String f113061a;

    /* renamed from: b  reason: collision with root package name */
    public String f113062b;

    /* renamed from: d  reason: collision with root package name */
    private final View f113063d;

    /* renamed from: e  reason: collision with root package name */
    private final AvatarImageView f113064e;

    /* renamed from: f  reason: collision with root package name */
    private final TextView f113065f;
    private final RemoteImageView q;
    private final Button r;
    private final TuxIconView s;
    private final TextView t;
    private final ImageView u;
    private AnnouncementNotice v;
    private UserTextNotice w;
    private boolean x;
    private boolean y;
    private boolean z;

    static {
        Covode.recordClassIndex(72695);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72696);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c implements IExternalService.ServiceLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecordConfig f113066a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f113067b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f113068c;

        static {
            Covode.recordClassIndex(72698);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onDismiss() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onFailed() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onOK() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j2) {
            l.d(asyncAVService, "");
            IRecordService recordService = asyncAVService.uiService().recordService();
            Context context = this.f113068c.getContext();
            l.b(context, "");
            recordService.startRecord(context, this.f113066a);
        }

        c(RecordConfig recordConfig, h hVar, View view) {
            this.f113066a = recordConfig;
            this.f113067b = hVar;
            this.f113068c = view;
        }
    }

    private static boolean c() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final void bY_() {
        super.bY_();
        BaseNotice baseNotice = this.B;
        if (baseNotice != null) {
            this.C.a(baseNotice, new b(this, baseNotice));
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ BaseNotice $notice;
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(72697);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h hVar, BaseNotice baseNotice) {
            super(0);
            this.this$0 = hVar;
            this.$notice = baseNotice;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            r.a("official_message_inner_message", new d().a("action_type", "show").a("account_type", "tiktok_assistant").a("client_order", this.this$0.getLayoutPosition()).a("scene_id", "1005").a("task_id", this.$notice.taskId).a("template_id", this.$notice.templateId).a("event_keyword", this.this$0.f113062b).a("content_id", this.this$0.f113061a).f66730a);
            return z.f158842a;
        }
    }

    private static void b(String str) {
        r.a("enter_prop_detail", new d().a("enter_from", "notification_page").a("account_type", "tiktok_assistant").a("prop_id", str).f66730a);
    }

    public final void a(BaseNotice baseNotice) {
        boolean z2;
        String str = "";
        l.d(baseNotice, str);
        if (baseNotice.announcement != null || baseNotice.textNotice != null) {
            this.B = baseNotice;
            this.f113061a = baseNotice.nid;
            this.f113064e.setImageURI(g.a(2131231293));
            AnnouncementNotice announcementNotice = baseNotice.announcement;
            this.v = announcementNotice;
            if (announcementNotice != null) {
                AnnouncementNotice announcementNotice2 = baseNotice.announcement;
                l.b(announcementNotice2, str);
                if (announcementNotice2.getChallenge() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (this.f113486g) {
                    spannableStringBuilder.append((char) 8296);
                }
                if (!TextUtils.isEmpty(announcementNotice.getTitle())) {
                    spannableStringBuilder.append((CharSequence) announcementNotice.getTitle());
                    if (!TextUtils.isEmpty(announcementNotice.getContent())) {
                        spannableStringBuilder.append(": ");
                    }
                    spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                }
                if (!TextUtils.isEmpty(announcementNotice.getContent())) {
                    spannableStringBuilder.append((CharSequence) announcementNotice.getContent());
                }
                if (this.f113486g) {
                    spannableStringBuilder.append((char) 8297);
                }
                if (z2) {
                    com.ss.android.ugc.aweme.notification.utils.g.a(this.f113063d);
                    q.a(this.f113065f, spannableStringBuilder, baseNotice, 10, n.a(this.f113647i) - ((int) n.b(this.f113647i, 192.0f)));
                    this.r.setVisibility(0);
                    this.q.setVisibility(8);
                    this.s.setVisibility(8);
                } else if (announcementNotice.getImageUrl() != null) {
                    com.ss.android.ugc.aweme.notification.utils.g.a(this.f113063d);
                    q.a(this.f113065f, spannableStringBuilder, baseNotice, 10, n.a(this.f113647i) - ((int) n.b(this.f113647i, 160.0f)));
                    this.r.setVisibility(8);
                    this.q.setVisibility(0);
                    this.s.setVisibility(8);
                    e.a(this.q, announcementNotice.getImageUrl());
                } else {
                    String schemaUrl = announcementNotice.getSchemaUrl();
                    if (schemaUrl == null || schemaUrl.length() == 0) {
                        this.f113063d.setOnTouchListener(null);
                        com.ss.android.ugc.aweme.notification.utils.g.b(this.f113063d);
                        a(spannableStringBuilder, baseNotice);
                        this.f113065f.setText(spannableStringBuilder);
                        this.r.setVisibility(8);
                        this.q.setVisibility(8);
                        this.s.setVisibility(8);
                    } else {
                        com.ss.android.ugc.aweme.notification.utils.g.a(this.f113063d);
                        q.a(this.f113065f, spannableStringBuilder, baseNotice, 10, n.a(this.f113647i) - ((int) n.b(this.f113647i, 132.0f)));
                        this.r.setVisibility(8);
                        this.q.setVisibility(8);
                        this.s.setVisibility(0);
                    }
                }
                String schemaUrl2 = announcementNotice.getSchemaUrl();
                if (schemaUrl2 == null) {
                    schemaUrl2 = str;
                }
                String queryParameter = Uri.parse(schemaUrl2).getQueryParameter("event_keyword");
                if (queryParameter != null) {
                    str = queryParameter;
                }
                this.f113062b = str;
            }
            UserTextNotice userTextNotice = baseNotice.textNotice;
            this.w = userTextNotice;
            if (userTextNotice != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                if (!TextUtils.isEmpty(userTextNotice.getTitle())) {
                    spannableStringBuilder2.append((CharSequence) userTextNotice.getTitle());
                    if (!TextUtils.isEmpty(userTextNotice.getContent())) {
                        spannableStringBuilder2.append(": ");
                    }
                    spannableStringBuilder2.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder2.length(), 33);
                }
                if (!TextUtils.isEmpty(userTextNotice.getContent())) {
                    spannableStringBuilder2.append((CharSequence) userTextNotice.getContent());
                }
                String schemaUrl3 = userTextNotice.getSchemaUrl();
                if (schemaUrl3 == null || schemaUrl3.length() == 0) {
                    a(spannableStringBuilder2, baseNotice);
                    this.f113065f.setText(spannableStringBuilder2);
                    this.s.setVisibility(8);
                    this.q.setVisibility(8);
                    this.t.setVisibility(8);
                    this.u.setVisibility(8);
                    this.r.setVisibility(8);
                    return;
                }
                try {
                    Uri parse = Uri.parse(userTextNotice.getSchemaUrl());
                    this.x = parse.getBooleanQueryParameter("effects", false);
                    this.y = parse.getBooleanQueryParameter("blur", false);
                    this.z = parse.getBooleanQueryParameter("duet", false);
                    String queryParameter2 = parse.getQueryParameter("aweme_id");
                    this.A = queryParameter2;
                    if (!this.z || TextUtils.isEmpty(queryParameter2)) {
                        q.a(this.f113065f, spannableStringBuilder2, baseNotice, 10, n.a(this.f113647i) - ((int) n.b(this.f113647i, 132.0f)));
                        this.s.setVisibility(0);
                        this.q.setVisibility(8);
                        this.t.setVisibility(8);
                        this.u.setVisibility(8);
                        this.r.setVisibility(8);
                        return;
                    }
                    q.a(this.f113065f, spannableStringBuilder2, baseNotice, 10, n.a(this.f113647i) - ((int) n.b(this.f113647i, 192.0f)));
                    this.s.setVisibility(8);
                    this.q.setVisibility(0);
                    this.t.setVisibility(0);
                    this.u.setVisibility(0);
                    this.r.setVisibility(8);
                    e.a(this.q, userTextNotice.getImageUrl());
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0166, code lost:
        if (r19.a((android.app.Activity) r13, r25.y, r25.x, r25.z, r25.A) == false) goto L_0x0168;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x011a  */
    @Override // com.ss.android.ugc.aweme.notification.h.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r26) {
        /*
        // Method dump skipped, instructions count: 1181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.a.h.onClick(android.view.View):void");
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    private final void b(String str, String str2) {
        String str3;
        d a2 = new d().a("enter_from", "notification_page").a("account_type", "tiktok_assistant").a("music_id", str).a("process_id", str2);
        BaseNotice baseNotice = this.B;
        if (baseNotice != null) {
            str3 = baseNotice.templateId;
        } else {
            str3 = null;
        }
        r.a("enter_music_detail", a2.a("template_id", str3).f66730a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(View view, NotificationDetailVM notificationDetailVM) {
        super(view);
        l.d(view, "");
        l.d(notificationDetailVM, "");
        this.C = notificationDetailVM;
        View findViewById = view.findViewById(R.id.cxx);
        l.b(findViewById, "");
        this.f113063d = findViewById;
        View findViewById2 = view.findViewById(R.id.cx6);
        l.b(findViewById2, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById2;
        this.f113064e = avatarImageView;
        View findViewById3 = view.findViewById(R.id.cwx);
        l.b(findViewById3, "");
        this.f113065f = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cwz);
        l.b(findViewById4, "");
        this.q = (RemoteImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.cww);
        l.b(findViewById5, "");
        Button button = (Button) findViewById5;
        this.r = button;
        View findViewById6 = view.findViewById(R.id.cwr);
        l.b(findViewById6, "");
        this.s = (TuxIconView) findViewById6;
        View findViewById7 = view.findViewById(R.id.e9p);
        l.b(findViewById7, "");
        this.t = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.e9o);
        l.b(findViewById8, "");
        this.u = (ImageView) findViewById8;
        button.getLayoutParams().width = com.ss.android.ugc.aweme.notification.utils.g.a(this.f113647i);
        com.ss.android.ugc.aweme.notification.g.a.a(avatarImageView);
        com.ss.android.ugc.aweme.notification.g.a.a(button);
        button.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        avatarImageView.setOnClickListener(this);
        this.f113486g = gb.a(this.f113647i);
    }
}

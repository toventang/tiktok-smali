package com.ss.android.ugc.aweme.notification.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.bytedance.tux.icon.TuxIconView;
import com.facebook.common.k.g;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.ad.preload.e;
import com.ss.android.ugc.aweme.app.f.d;
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
import java.util.List;
import java.util.Objects;

public final class j extends p implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public static final String f113075c = "enter_from";

    /* renamed from: d  reason: collision with root package name */
    public static final String f113076d = "guide_to_invite_third_friends";

    /* renamed from: e  reason: collision with root package name */
    public static final String f113077e = StringSet.type;

    /* renamed from: f  reason: collision with root package name */
    public static final a f113078f = new a((byte) 0);
    private boolean A;
    private boolean B;
    private boolean C;
    private String D;
    private String E;
    private final NotificationDetailVM F;

    /* renamed from: a  reason: collision with root package name */
    public UserTextNotice f113079a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f113080b;
    private final View q;
    private final AvatarImageView r;
    private final TextView s;
    private final RemoteImageView t;
    private final DmtButton u;
    private final TuxIconView v;
    private final TextView w;
    private final ImageView x;
    private AnnouncementNotice y;
    private BaseNotice z;

    public static final class a {
        static {
            Covode.recordClassIndex(72703);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c implements IExternalService.ServiceLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecordConfig f113081a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f113082b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f113083c;

        static {
            Covode.recordClassIndex(72705);
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
            Context context = this.f113083c.getContext();
            l.b(context, "");
            recordService.startRecord(context, this.f113081a);
        }

        c(RecordConfig recordConfig, j jVar, View view) {
            this.f113081a = recordConfig;
            this.f113082b = jVar;
            this.f113083c = view;
        }
    }

    private static boolean c() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(72702);
    }

    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final void bY_() {
        super.bY_();
        BaseNotice baseNotice = this.z;
        if (baseNotice != null) {
            this.F.a(baseNotice, new b(this, baseNotice));
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ BaseNotice $notice;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(72704);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar, BaseNotice baseNotice) {
            super(0);
            this.this$0 = jVar;
            this.$notice = baseNotice;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            String str;
            UserTextNotice userTextNotice = this.this$0.f113079a;
            String str2 = "";
            if (userTextNotice == null || (str = userTextNotice.getSchemaUrl()) == null) {
                str = str2;
            }
            String queryParameter = Uri.parse(str).getQueryParameter("event_keyword");
            if (queryParameter == null) {
                queryParameter = str2;
            }
            l.b(queryParameter, str2);
            d a2 = new d().a("action_type", "show").a("account_type", "official_info").a("client_order", this.this$0.getLayoutPosition()).a("scene_id", "1005").a("task_id", this.$notice.taskId).a("content_id", this.$notice.nid).a("template_id", this.$notice.templateId).a("event_keyword", queryParameter);
            if (this.this$0.f113080b) {
                str2 = "online_contract";
            }
            r.a("official_message_inner_message", a2.a("content_type", str2).f66730a);
            return z.f158842a;
        }
    }

    private static void b(String str) {
        r.a("enter_prop_detail", new d().a("enter_from", "notification_page").a("account_type", "official_info").a("prop_id", str).f66730a);
    }

    public final void a(BaseNotice baseNotice) {
        boolean z2;
        boolean z3;
        e a2;
        UserTextNotice userTextNotice;
        String schemaUrl;
        l.d(baseNotice, "");
        if (baseNotice.announcement != null || baseNotice.textNotice != null) {
            this.z = baseNotice;
            this.E = baseNotice.nid;
            l.d(baseNotice, "");
            if (baseNotice.type != 2 || (userTextNotice = baseNotice.textNotice) == null || (schemaUrl = userTextNotice.getSchemaUrl()) == null || !h.m.p.a((CharSequence) schemaUrl, (CharSequence) "contract_invitation=1", false)) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f113080b = z2;
            this.r.setImageURI(g.a(2131231273));
            UserTextNotice userTextNotice2 = baseNotice.textNotice;
            this.f113079a = userTextNotice2;
            if (userTextNotice2 != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (this.f113486g) {
                    spannableStringBuilder.append((char) 8296);
                }
                if (!TextUtils.isEmpty(userTextNotice2.getTitle())) {
                    spannableStringBuilder.append((CharSequence) userTextNotice2.getTitle());
                    if (!TextUtils.isEmpty(userTextNotice2.getContent())) {
                        spannableStringBuilder.append(": ");
                    }
                    spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                }
                if (!TextUtils.isEmpty(userTextNotice2.getContent())) {
                    String content = userTextNotice2.getContent();
                    l.b(content, "");
                    Objects.requireNonNull(content, "null cannot be cast to non-null type kotlin.CharSequence");
                    spannableStringBuilder.append((CharSequence) h.m.p.b((CharSequence) content).toString());
                }
                if (this.f113486g) {
                    spannableStringBuilder.append((char) 8297);
                }
                String schemaUrl2 = userTextNotice2.getSchemaUrl();
                if (schemaUrl2 == null || schemaUrl2.length() == 0) {
                    a(spannableStringBuilder, baseNotice);
                    this.s.setText(spannableStringBuilder);
                    this.v.setVisibility(8);
                    this.t.setVisibility(8);
                    this.w.setVisibility(8);
                    this.x.setVisibility(8);
                    this.u.setVisibility(8);
                } else {
                    try {
                        Uri parse = Uri.parse(userTextNotice2.getSchemaUrl());
                        this.A = parse.getBooleanQueryParameter("effects", false);
                        this.B = parse.getBooleanQueryParameter("blur", false);
                        this.C = parse.getBooleanQueryParameter("duet", false);
                        this.D = parse.getQueryParameter("aweme_id");
                        String queryParameter = parse.getQueryParameter("show_image");
                        String queryParameter2 = parse.getQueryParameter("channel");
                        if (this.C && !TextUtils.isEmpty(this.D)) {
                            q.a(this.s, spannableStringBuilder, baseNotice, 10, n.a(this.f113647i) - ((int) n.b(this.f113647i, 192.0f)));
                            this.v.setVisibility(8);
                            this.t.setVisibility(0);
                            this.w.setVisibility(0);
                            this.x.setVisibility(0);
                            this.u.setVisibility(8);
                            com.ss.android.ugc.aweme.base.e.a(this.t, userTextNotice2.getImageUrl());
                        } else if (!TextUtils.equals(queryParameter, "1")) {
                            q.a(this.s, spannableStringBuilder, baseNotice, 10, n.a(this.f113647i) - ((int) n.b(this.f113647i, 132.0f)));
                            this.v.setVisibility(0);
                            this.t.setVisibility(8);
                            this.w.setVisibility(8);
                            this.x.setVisibility(8);
                            this.u.setVisibility(8);
                        } else if (!TextUtils.isEmpty(queryParameter2)) {
                            List<String> a3 = h.a.n.a(queryParameter2);
                            IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
                            if (!(f2 == null || (a2 = f2.a()) == null)) {
                                a2.c(a3);
                            }
                            q.a(this.s, spannableStringBuilder, baseNotice, 10, n.a(this.f113647i) - ((int) n.b(this.f113647i, 160.0f)));
                            this.u.setVisibility(8);
                            this.t.setVisibility(0);
                            this.v.setVisibility(8);
                            this.w.setVisibility(8);
                            this.x.setVisibility(8);
                            com.ss.android.ugc.aweme.base.e.a(this.t, userTextNotice2.getImageUrl());
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
            AnnouncementNotice announcementNotice = baseNotice.announcement;
            this.y = announcementNotice;
            if (announcementNotice != null) {
                AnnouncementNotice announcementNotice2 = baseNotice.announcement;
                l.b(announcementNotice2, "");
                if (announcementNotice2.getChallenge() != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                if (!TextUtils.isEmpty(announcementNotice.getTitle())) {
                    spannableStringBuilder2.append((CharSequence) announcementNotice.getTitle());
                    if (!TextUtils.isEmpty(announcementNotice.getContent())) {
                        spannableStringBuilder2.append(": ");
                    }
                    spannableStringBuilder2.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder2.length(), 33);
                }
                if (!TextUtils.isEmpty(announcementNotice.getContent())) {
                    spannableStringBuilder2.append((CharSequence) announcementNotice.getContent());
                }
                if (z3) {
                    com.ss.android.ugc.aweme.notification.utils.g.a(this.q);
                    q.a(this.s, spannableStringBuilder2, baseNotice, 10, n.a(this.f113647i) - ((int) n.b(this.f113647i, 192.0f)));
                    this.u.setVisibility(0);
                    this.t.setVisibility(8);
                    this.v.setVisibility(8);
                } else if (announcementNotice.getImageUrl() != null) {
                    com.ss.android.ugc.aweme.notification.utils.g.a(this.q);
                    q.a(this.s, spannableStringBuilder2, baseNotice, 10, n.a(this.f113647i) - ((int) n.b(this.f113647i, 160.0f)));
                    this.u.setVisibility(8);
                    this.t.setVisibility(0);
                    this.v.setVisibility(8);
                    com.ss.android.ugc.aweme.base.e.a(this.t, announcementNotice.getImageUrl());
                } else {
                    String schemaUrl3 = announcementNotice.getSchemaUrl();
                    if (schemaUrl3 == null || schemaUrl3.length() == 0) {
                        this.q.setOnTouchListener(null);
                        com.ss.android.ugc.aweme.notification.utils.g.b(this.q);
                        a(spannableStringBuilder2, baseNotice);
                        this.s.setText(spannableStringBuilder2);
                        this.u.setVisibility(8);
                        this.t.setVisibility(8);
                        this.v.setVisibility(8);
                        return;
                    }
                    com.ss.android.ugc.aweme.notification.utils.g.a(this.q);
                    q.a(this.s, spannableStringBuilder2, baseNotice, 10, n.a(this.f113647i) - ((int) n.b(this.f113647i, 132.0f)));
                    this.u.setVisibility(8);
                    this.t.setVisibility(8);
                    this.v.setVisibility(0);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0177, code lost:
        if (r17.a((android.app.Activity) r1, r23.B, r23.A, r23.C, r23.D) == false) goto L_0x0179;
     */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02cf  */
    @Override // com.ss.android.ugc.aweme.notification.h.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r24) {
        /*
        // Method dump skipped, instructions count: 996
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.a.j.onClick(android.view.View):void");
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    private static void b(String str, String str2) {
        r.a("enter_music_detail", new d().a("enter_from", "notification_page").a("account_type", "official_info").a("music_id", str).a("process_id", str2).f66730a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(View view, NotificationDetailVM notificationDetailVM) {
        super(view);
        l.d(view, "");
        l.d(notificationDetailVM, "");
        this.F = notificationDetailVM;
        View findViewById = view.findViewById(R.id.cxx);
        l.b(findViewById, "");
        this.q = findViewById;
        View findViewById2 = view.findViewById(R.id.cx6);
        l.b(findViewById2, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById2;
        this.r = avatarImageView;
        View findViewById3 = view.findViewById(R.id.cwx);
        l.b(findViewById3, "");
        this.s = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cwz);
        l.b(findViewById4, "");
        this.t = (RemoteImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.cww);
        l.b(findViewById5, "");
        DmtButton dmtButton = (DmtButton) findViewById5;
        this.u = dmtButton;
        View findViewById6 = view.findViewById(R.id.cwr);
        l.b(findViewById6, "");
        this.v = (TuxIconView) findViewById6;
        View findViewById7 = view.findViewById(R.id.e9p);
        l.b(findViewById7, "");
        TextView textView = (TextView) findViewById7;
        this.w = textView;
        View findViewById8 = view.findViewById(R.id.e9o);
        l.b(findViewById8, "");
        ImageView imageView = (ImageView) findViewById8;
        this.x = imageView;
        com.ss.android.ugc.aweme.notification.utils.g.a(findViewById);
        com.ss.android.ugc.aweme.notification.utils.g.a(textView);
        com.ss.android.ugc.aweme.notification.utils.g.a(imageView);
        com.ss.android.ugc.aweme.notification.g.a.a(avatarImageView);
        dmtButton.getLayoutParams().width = com.ss.android.ugc.aweme.notification.utils.g.a(this.f113647i);
        dmtButton.setOnClickListener(this);
        imageView.setOnClickListener(this);
        textView.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        avatarImageView.setOnClickListener(this);
        ((com.facebook.drawee.f.a) avatarImageView.getHierarchy()).c(R.color.f159926j);
        this.f113486g = gb.a(this.f113647i);
    }
}

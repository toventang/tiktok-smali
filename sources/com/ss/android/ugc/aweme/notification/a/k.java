package com.ss.android.ugc.aweme.notification.a;

import android.content.Context;
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
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.l;
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
import h.f.b.m;
import h.z;
import java.util.HashMap;

public final class k extends p implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public static final String f113084c = "enter_from";

    /* renamed from: d  reason: collision with root package name */
    public static final String f113085d = "guide_to_invite_third_friends";

    /* renamed from: e  reason: collision with root package name */
    public static final String f113086e = StringSet.type;

    /* renamed from: f  reason: collision with root package name */
    public static final a f113087f = new a((byte) 0);
    private boolean A;
    private boolean B;
    private String C;
    private Long D;
    private BaseNotice E;
    private final NotificationDetailVM F;

    /* renamed from: a  reason: collision with root package name */
    public l f113088a;

    /* renamed from: b  reason: collision with root package name */
    public String f113089b;
    private final View q;
    private final AvatarImageView r;
    private final TextView s;
    private final RemoteImageView t;
    private final DmtButton u;
    private final TuxIconView v;
    private final TextView w;
    private final ImageView x;
    private final TextView y;
    private boolean z;

    public static final class a {
        static {
            Covode.recordClassIndex(72707);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c implements IExternalService.ServiceLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecordConfig f113090a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f113091b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f113092c;

        static {
            Covode.recordClassIndex(72709);
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
            h.f.b.l.d(asyncAVService, "");
            IRecordService recordService = asyncAVService.uiService().recordService();
            Context context = this.f113092c.getContext();
            h.f.b.l.b(context, "");
            recordService.startRecord(context, this.f113090a);
        }

        c(RecordConfig recordConfig, k kVar, View view) {
            this.f113090a = recordConfig;
            this.f113091b = kVar;
            this.f113092c = view;
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
        Covode.recordClassIndex(72706);
    }

    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final void bY_() {
        super.bY_();
        BaseNotice baseNotice = this.E;
        if (baseNotice != null) {
            this.F.a(baseNotice, new b(this, baseNotice));
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ BaseNotice $notice;
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(72708);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k kVar, BaseNotice baseNotice) {
            super(0);
            this.this$0 = kVar;
            this.$notice = baseNotice;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            HashMap<? extends String, ? extends String> hashMap = new HashMap<>();
            try {
                com.google.gson.f fVar = new com.google.gson.f();
                l lVar = this.this$0.f113088a;
                if (lVar == null) {
                    h.f.b.l.b();
                }
                Object a2 = fVar.a(lVar.f112874d, (Class) new HashMap().getClass());
                h.f.b.l.b(a2, "");
                hashMap = (HashMap) a2;
            } catch (Exception unused) {
            }
            r.a("official_message_inner_message", new d().a("account_type", "starmap_assistant").a("action_type", "show").a("message_time", this.$notice.createTime).a("client_order", this.this$0.getLayoutPosition()).a("content_id", this.this$0.f113089b).a("template_id", this.$notice.templateId).a(hashMap).f66730a);
            return z.f158842a;
        }
    }

    public final void a(BaseNotice baseNotice) {
        h.f.b.l.d(baseNotice, "");
        if (baseNotice.tcmNotice != null) {
            this.E = baseNotice;
            this.f113089b = baseNotice.nid;
            this.r.setImageURI(g.a(2131231277));
            this.f113088a = baseNotice.tcmNotice;
            this.D = Long.valueOf(baseNotice.createTime);
            l lVar = this.f113088a;
            if (lVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (this.f113486g) {
                    spannableStringBuilder.append((char) 8296);
                }
                if (!TextUtils.isEmpty(lVar.f112871a)) {
                    spannableStringBuilder.append((CharSequence) lVar.f112871a);
                    if (!TextUtils.isEmpty(lVar.f112872b)) {
                        spannableStringBuilder.append(": ");
                    }
                    spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                }
                if (!TextUtils.isEmpty(lVar.f112872b)) {
                    spannableStringBuilder.append((CharSequence) lVar.f112872b);
                }
                if (this.f113486g) {
                    spannableStringBuilder.append((char) 8297);
                }
                String str = lVar.f112876f;
                boolean z2 = true;
                if (!(str == null || str.length() == 0)) {
                    this.y.setText(this.f113647i.getString(R.string.d5q, lVar.f112876f));
                    this.y.setVisibility(0);
                }
                if (lVar.f112877g != null) {
                    e.a(this.r, lVar.f112877g);
                }
                if (lVar.f112873c.length() != 0) {
                    z2 = false;
                }
                if (z2) {
                    a(spannableStringBuilder, baseNotice);
                    this.s.setText(spannableStringBuilder);
                    this.v.setVisibility(8);
                    this.t.setVisibility(8);
                    this.w.setVisibility(8);
                    this.x.setVisibility(8);
                    this.u.setVisibility(8);
                    return;
                }
                try {
                    Uri parse = Uri.parse(lVar.f112873c);
                    this.z = parse.getBooleanQueryParameter("effects", false);
                    this.A = parse.getBooleanQueryParameter("blur", false);
                    this.B = parse.getBooleanQueryParameter("duet", false);
                    String queryParameter = parse.getQueryParameter("aweme_id");
                    this.C = queryParameter;
                    if (!this.B || TextUtils.isEmpty(queryParameter)) {
                        q.a(this.s, spannableStringBuilder, baseNotice, 10, n.a(this.f113647i) - ((int) n.b(this.f113647i, 132.0f)));
                        this.v.setVisibility(0);
                        this.t.setVisibility(8);
                        this.w.setVisibility(8);
                        this.x.setVisibility(8);
                        this.u.setVisibility(8);
                        return;
                    }
                    q.a(this.s, spannableStringBuilder, baseNotice, 10, n.a(this.f113647i) - ((int) n.b(this.f113647i, 192.0f)));
                    this.v.setVisibility(8);
                    this.t.setVisibility(0);
                    this.w.setVisibility(0);
                    this.x.setVisibility(0);
                    this.u.setVisibility(8);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008d, code lost:
        if (r3.a((android.app.Activity) r4, r11.A, r11.z, r11.B, r11.C) == false) goto L_0x008f;
     */
    @Override // com.ss.android.ugc.aweme.notification.h.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r12) {
        /*
        // Method dump skipped, instructions count: 591
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.a.k.onClick(android.view.View):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(View view, NotificationDetailVM notificationDetailVM) {
        super(view);
        h.f.b.l.d(view, "");
        h.f.b.l.d(notificationDetailVM, "");
        this.F = notificationDetailVM;
        View findViewById = view.findViewById(R.id.cxx);
        h.f.b.l.b(findViewById, "");
        this.q = findViewById;
        View findViewById2 = view.findViewById(R.id.cx6);
        h.f.b.l.b(findViewById2, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById2;
        this.r = avatarImageView;
        View findViewById3 = view.findViewById(R.id.cwx);
        h.f.b.l.b(findViewById3, "");
        this.s = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cwz);
        h.f.b.l.b(findViewById4, "");
        this.t = (RemoteImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.cww);
        h.f.b.l.b(findViewById5, "");
        DmtButton dmtButton = (DmtButton) findViewById5;
        this.u = dmtButton;
        View findViewById6 = view.findViewById(R.id.cwr);
        h.f.b.l.b(findViewById6, "");
        this.v = (TuxIconView) findViewById6;
        View findViewById7 = view.findViewById(R.id.e9p);
        h.f.b.l.b(findViewById7, "");
        TextView textView = (TextView) findViewById7;
        this.w = textView;
        View findViewById8 = view.findViewById(R.id.e9o);
        h.f.b.l.b(findViewById8, "");
        ImageView imageView = (ImageView) findViewById8;
        this.x = imageView;
        View findViewById9 = view.findViewById(R.id.cy3);
        h.f.b.l.b(findViewById9, "");
        this.y = (TextView) findViewById9;
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
        this.f113486g = gb.a(this.f113647i);
    }
}

package com.ss.android.ugc.aweme.notification.a;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.notice.api.a;
import com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.b;
import com.ss.android.ugc.aweme.notification.h.k;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM;
import com.ss.android.ugc.aweme.utils.SchemaPageHelperImpl;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class g extends k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f113053a;

    /* renamed from: b  reason: collision with root package name */
    private final AvatarImageView f113054b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f113055c;

    /* renamed from: d  reason: collision with root package name */
    private final RemoteImageView f113056d;

    /* renamed from: e  reason: collision with root package name */
    private BaseNotice f113057e;

    /* renamed from: f  reason: collision with root package name */
    private b f113058f;

    /* renamed from: m  reason: collision with root package name */
    private Context f113059m;
    private final NotificationDetailVM n;

    static {
        Covode.recordClassIndex(72694);
    }

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

    private final boolean h() {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        BaseNotice baseNotice = this.f113057e;
        if (baseNotice == null || (str = baseNotice.nid) == null) {
            str = "";
        }
        hashMap.put("notice_id", str);
        hashMap.put("aid", String.valueOf(a.C2881a.f112646a));
        hashMap.put("channel", SchemaPageHelperImpl.b().a());
        SchemaPageHelper b2 = SchemaPageHelperImpl.b();
        Context context = this.f113059m;
        b bVar = this.f113058f;
        if (bVar != null) {
            str2 = bVar.f112834d;
        } else {
            str2 = null;
        }
        String string = this.f113059m.getString(R.string.ci7);
        if (string == null) {
            string = "";
        }
        l.b(string, "");
        return b2.a(context, str2, string, hashMap);
    }

    public final void a(BaseNotice baseNotice) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        l.d(baseNotice, "");
        if (baseNotice.adHelperNotice != null) {
            this.f113057e = baseNotice;
            this.f113058f = baseNotice.adHelperNotice;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f113486g) {
                spannableStringBuilder.append((char) 8296);
            }
            b bVar = this.f113058f;
            UrlModel urlModel = null;
            if (bVar != null) {
                str = bVar.f112832b;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                b bVar2 = this.f113058f;
                if (bVar2 != null) {
                    str4 = bVar2.f112832b;
                } else {
                    str4 = null;
                }
                spannableStringBuilder.append((CharSequence) str4);
                b bVar3 = this.f113058f;
                if (bVar3 != null) {
                    str5 = bVar3.f112831a;
                } else {
                    str5 = null;
                }
                if (!TextUtils.isEmpty(str5)) {
                    spannableStringBuilder.append(": ");
                }
                spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
            }
            b bVar4 = this.f113058f;
            if (bVar4 != null) {
                str2 = bVar4.f112831a;
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                b bVar5 = this.f113058f;
                if (bVar5 != null) {
                    str3 = bVar5.f112831a;
                } else {
                    str3 = null;
                }
                spannableStringBuilder.append((CharSequence) str3);
            }
            if (this.f113486g) {
                spannableStringBuilder.append((char) 8297);
            }
            this.f113054b.setImageURI(com.facebook.common.k.g.a(2131231295));
            a(spannableStringBuilder, baseNotice);
            this.f113055c.setText(spannableStringBuilder);
            RemoteImageView remoteImageView = this.f113056d;
            b bVar6 = this.f113058f;
            if (bVar6 != null) {
                urlModel = bVar6.f112836f;
            }
            e.a(remoteImageView, urlModel);
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
            View view2 = this.itemView;
            l.b(view2, "");
            new com.bytedance.tux.g.b(view2).e(R.string.de8).b();
        } else if (view != null) {
            int id = view.getId();
            String str2 = null;
            if (id == R.id.cxx || id == R.id.cx6) {
                t a2 = t.a();
                b bVar = this.f113058f;
                if (bVar != null) {
                    str = bVar.f112837g;
                } else {
                    str = null;
                }
                if (!t.a(a2, str) && !h()) {
                    t a3 = t.a();
                    b bVar2 = this.f113058f;
                    if (bVar2 != null) {
                        str2 = bVar2.f112833c;
                    }
                    t.a(a3, str2);
                }
            } else if (id == R.id.bht) {
                t a4 = t.a();
                b bVar3 = this.f113058f;
                if (bVar3 != null) {
                    str2 = bVar3.f112833c;
                }
                if (!t.a(a4, str2)) {
                    h();
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(View view, NotificationDetailVM notificationDetailVM) {
        super(view);
        l.d(view, "");
        l.d(notificationDetailVM, "");
        this.n = notificationDetailVM;
        View findViewById = view.findViewById(R.id.cxx);
        l.b(findViewById, "");
        this.f113053a = findViewById;
        View findViewById2 = view.findViewById(R.id.cx6);
        l.b(findViewById2, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById2;
        this.f113054b = avatarImageView;
        View findViewById3 = view.findViewById(R.id.cwx);
        l.b(findViewById3, "");
        this.f113055c = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bht);
        l.b(findViewById4, "");
        RemoteImageView remoteImageView = (RemoteImageView) findViewById4;
        this.f113056d = remoteImageView;
        Context context = view.getContext();
        l.b(context, "");
        this.f113059m = context;
        com.ss.android.ugc.aweme.notification.utils.g.a(findViewById);
        com.ss.android.ugc.aweme.notification.g.a.a(remoteImageView);
        com.ss.android.ugc.aweme.notification.g.a.a(avatarImageView);
        remoteImageView.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        avatarImageView.setOnClickListener(this);
        this.f113486g = gb.a(this.f113059m);
    }
}

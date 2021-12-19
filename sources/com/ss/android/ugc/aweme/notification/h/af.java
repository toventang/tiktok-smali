package com.ss.android.ugc.aweme.notification.h;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.notification.bean.p;
import com.ss.android.ugc.aweme.notification.utils.g;
import com.ss.android.ugc.aweme.notification.view.LiveCircleView;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.ss.android.ugc.aweme.notification.view.e;
import com.zhiliaoapp.musically.R;
import h.z;

public final class af extends k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public e f113507a;

    /* renamed from: b  reason: collision with root package name */
    private ConstraintLayout f113508b;

    /* renamed from: c  reason: collision with root package name */
    private AvatarImageView f113509c;

    /* renamed from: d  reason: collision with root package name */
    private LiveCircleView f113510d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f113511e;

    /* renamed from: f  reason: collision with root package name */
    private Button f113512f;

    /* renamed from: m  reason: collision with root package name */
    private Context f113513m;

    static {
        Covode.recordClassIndex(72982);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k
    public final int bX_() {
        return R.id.cxx;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final boolean e() {
        return false;
    }

    private static boolean h() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k
    public final void f() {
        super.g();
        this.f113487h.a(this.f113648j, new ag(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z c() {
        com.ss.android.ugc.aweme.notification.utils.e.a("live", this.f113649k, this.f113650l, this.f113487h.a(), this.f113648j.templateId);
        return null;
    }

    public final void a(p pVar) {
        if (pVar != null) {
            this.f113507a.a(pVar.f113275a);
            this.f113507a.a();
            String charSequence = this.f113511e.getText().toString();
            if (!TextUtils.isEmpty(charSequence)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) charSequence);
                spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                this.f113511e.setText(spannableStringBuilder);
            }
        }
    }

    public af(View view) {
        super(view);
        this.f113513m = view.getContext();
        this.f113508b = (ConstraintLayout) view.findViewById(R.id.cxx);
        this.f113509c = (AvatarImageView) view.findViewById(R.id.bse);
        this.f113510d = (LiveCircleView) view.findViewById(R.id.bsf);
        this.f113511e = (TextView) view.findViewById(R.id.cwx);
        this.f113512f = (Button) view.findViewById(R.id.cww);
        g.a(this.f113508b);
        g.a(this.f113509c);
        g.a(this.f113512f);
        this.f113512f.setOnClickListener(this);
        this.f113508b.setOnClickListener(this);
        this.f113509c.setOnClickListener(this);
        e eVar = new e();
        this.f113507a = eVar;
        ConstraintLayout constraintLayout = this.f113508b;
        eVar.f113949b = (AvatarImageView) constraintLayout.findViewById(R.id.bse);
        eVar.f113948a = (LiveCircleView) constraintLayout.findViewById(R.id.bsf);
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a
    public final void onClick(View view) {
        ClickAgent.onClick(view);
        d.a();
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = h();
        }
        if (!j.f107229h) {
            new b(this.itemView).e(R.string.de8).b();
            return;
        }
        int id = view.getId();
        if (id == R.id.cxx || id == R.id.cww || id == R.id.bse || id == R.id.bsf) {
            a("live", getLayoutPosition());
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            enterRoomConfig.f23299c.O = true;
            com.ss.android.ugc.aweme.story.live.d.a("message", "");
            LogHelperImpl.a().b("message", "new_type");
            LiveOuterService.s().i().b(this.f113513m, enterRoomConfig, "message");
        }
    }
}

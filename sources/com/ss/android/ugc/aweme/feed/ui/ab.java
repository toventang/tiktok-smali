package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.u;
import com.a.b.c;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;

public final class ab extends g implements u<b> {

    /* renamed from: l  reason: collision with root package name */
    RemoteImageView f94216l;

    /* renamed from: m  reason: collision with root package name */
    public FrameLayout f94217m;
    TextView n;
    private boolean o;

    static {
        Covode.recordClassIndex(59859);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.g
    public final void a() {
        this.o = false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        this.f94773f.a("dismiss_live_window", (Object) true);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.g
    public final void b() {
        UrlModel avatarLarger;
        super.b();
        if (this.f94768a != null && this.f94768a.getAuthor() != null && (avatarLarger = this.f94768a.getAuthor().getAvatarLarger()) != null) {
            this.f94216l.post(new ae(this, avatarLarger));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        User author;
        if (this.f94768a != null && !this.o && (author = this.f94768a.getAuthor()) != null) {
            this.f94773f.a("live_window_clicked", (Object) true);
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            enterRoomConfig.f23298b.f23311c = this.f94768a.getAid();
            enterRoomConfig.f23299c.J = this.f94769b;
            enterRoomConfig.f23299c.L = "live_window";
            LiveOuterService.s().i().a(this.f94774g, author, enterRoomConfig);
        }
    }

    public ab(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.ui.g
    public final void a(DataCenter dataCenter) {
        dataCenter.a("live_has_end", (u<b>) this);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.g
    public final void a(VideoItemParams videoItemParams) {
        super.a(videoItemParams);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(b bVar) {
        Boolean bool;
        b bVar2 = bVar;
        if (bVar2 != null && TextUtils.equals(bVar2.f67014a, "live_has_end") && (bool = (Boolean) bVar2.a()) != null && bool.booleanValue()) {
            this.o = true;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.ui.g
    public final void a(View view) {
        MethodCollector.i(8073);
        View a2 = c.a((Activity) this.f94774g, (int) R.layout.a0f);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(a2);
        }
        this.f94216l = (RemoteImageView) a2.findViewById(R.id.b1i);
        this.f94217m = (FrameLayout) a2.findViewById(R.id.b1k);
        this.n = (TextView) a2.findViewById(R.id.b1m);
        View findViewById = a2.findViewById(R.id.b1j);
        if (findViewById != null) {
            findViewById.setOnClickListener(new ac(this));
        }
        View findViewById2 = a2.findViewById(R.id.b1l);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new ad(this));
        }
        if (gb.a(view.getContext())) {
            this.n.setBackgroundResource(R.drawable.a98);
        } else {
            this.n.setBackgroundResource(R.drawable.a97);
        }
        this.n.setText(LiveOuterService.s().j().a(view.getContext(), "pm_following_livecard_live_icon"));
        MethodCollector.o(8073);
    }
}

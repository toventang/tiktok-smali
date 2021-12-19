package com.ss.android.ugc.aweme.notification.followrequest.b;

import android.app.Activity;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.notification.adapter.j;
import com.ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Set;

public final class a extends RecyclerView.ViewHolder implements View.OnClickListener, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public User f113446a;

    /* renamed from: b  reason: collision with root package name */
    public AvatarImageWithVerify f113447b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f113448c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f113449d;

    /* renamed from: e  reason: collision with root package name */
    private Activity f113450e;

    /* renamed from: f  reason: collision with root package name */
    private WeakHandler f113451f = new WeakHandler(this);

    /* renamed from: g  reason: collision with root package name */
    private ImageView f113452g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f113453h;

    /* renamed from: i  reason: collision with root package name */
    private ViewGroup f113454i;

    /* renamed from: j  reason: collision with root package name */
    private j f113455j;

    static {
        Covode.recordClassIndex(72954);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    private static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        d.a();
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107229h = a();
        }
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
            new b(this.f113450e).e(R.string.de8).b();
            return;
        }
        int id = view.getId();
        if (id == R.id.brv) {
            j jVar = this.f113455j;
            if (jVar != null) {
                jVar.d(getAdapterPosition());
            }
            FollowRequestApiManager.a(this.f113451f, this.f113446a.getUid(), 0);
            LogHelperImpl.a().c("follow_request_page", this.f113446a.getUid());
        } else if (id == R.id.bsl) {
            j jVar2 = this.f113455j;
            if (jVar2 != null) {
                jVar2.d(getAdapterPosition());
            }
            FollowRequestApiManager.a(this.f113451f, this.f113446a.getUid());
            LogHelperImpl.a().d("follow_request_page", this.f113446a.getUid());
        } else if (id == R.id.bs9) {
            t.a(t.a(), this.f113450e, u.a("aweme://user/profile/" + this.f113446a.getUid()).a("sec_user_id", this.f113446a.getSecUid()).a());
            LogHelperImpl.a().a("follow_request_page", this.f113446a.getUid(), "click_head");
        } else if (id == R.id.bsi || id == R.id.bs_) {
            t.a(t.a(), this.f113450e, u.a("aweme://user/profile/" + this.f113446a.getUid()).a("sec_user_id", this.f113446a.getSecUid()).a());
            LogHelperImpl.a().a("follow_request_page", this.f113446a.getUid(), "click_name");
        } else if (id == R.id.bso) {
            t.a(t.a(), this.f113450e, u.a("aweme://user/profile/" + this.f113446a.getUid()).a("sec_user_id", this.f113446a.getSecUid()).a());
            LogHelperImpl.a().a("follow_request_page", this.f113446a.getUid(), "click_card");
        }
    }

    public a(View view, Activity activity, j jVar, final Set<String> set) {
        super(view);
        this.f113450e = activity;
        this.f113454i = (ViewGroup) view.findViewById(R.id.bso);
        this.f113447b = (AvatarImageWithVerify) view.findViewById(R.id.bs9);
        this.f113448c = (TextView) view.findViewById(R.id.bsi);
        this.f113449d = (TextView) view.findViewById(R.id.bs_);
        this.f113452g = (ImageView) view.findViewById(R.id.brv);
        this.f113453h = (ImageView) view.findViewById(R.id.bsl);
        this.f113455j = jVar;
        com.ss.android.ugc.aweme.notification.g.a.a(this.f113454i);
        com.ss.android.ugc.aweme.notification.g.a.a(this.f113452g);
        com.ss.android.ugc.aweme.notification.g.a.a(this.f113453h);
        this.f113447b.setOnClickListener(this);
        this.f113448c.setOnClickListener(this);
        this.f113449d.setOnClickListener(this);
        this.f113454i.setOnClickListener(this);
        this.f113452g.setOnClickListener(this);
        this.f113453h.setOnClickListener(this);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.ss.android.ugc.aweme.notification.followrequest.b.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(72955);
            }

            public final void onViewDetachedFromWindow(View view) {
            }

            public final void onViewAttachedToWindow(View view) {
                if (a.this.f113446a != null && !TextUtils.isEmpty(a.this.f113446a.getUid()) && !set.contains(a.this.f113446a.getUid())) {
                    r.a("follow_request_message", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "follow_request_page").a("user_id", a.this.f113446a.getUid()).f66730a);
                    set.add(a.this.f113446a.getUid());
                }
            }
        });
    }
}

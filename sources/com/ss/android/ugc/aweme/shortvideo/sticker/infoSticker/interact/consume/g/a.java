package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public final CircleImageView f130405a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f130406b;

    static {
        Covode.recordClassIndex(85526);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.a$a  reason: collision with other inner class name */
    public static final class View$OnClickListenerC3401a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f130407a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f130408b;

        static {
            Covode.recordClassIndex(85527);
        }

        public View$OnClickListenerC3401a(a aVar, User user) {
            this.f130407a = aVar;
            this.f130408b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            View view2 = this.f130407a.itemView;
            l.b(view2, "");
            if (view2.getContext() != null) {
                View view3 = this.f130407a.itemView;
                l.b(view3, "");
                SmartRouter.buildRoute(view3.getContext(), "aweme://user/profile/").withParam("uid", this.f130408b.getUid()).withParam("sec_user_id", this.f130408b.getSecUid()).open();
            }
        }
    }

    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f130409a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f130410b;

        static {
            Covode.recordClassIndex(85528);
        }

        public b(a aVar, User user) {
            this.f130409a = aVar;
            this.f130410b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            View view2 = this.f130409a.itemView;
            l.b(view2, "");
            if (view2.getContext() != null) {
                View view3 = this.f130409a.itemView;
                l.b(view3, "");
                SmartRouter.buildRoute(view3.getContext(), "aweme://user/profile/").withParam("uid", this.f130410b.getUid()).withParam("sec_user_id", this.f130410b.getSecUid()).open();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.bxf);
        l.b(findViewById, "");
        this.f130405a = (CircleImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.f3c);
        l.b(findViewById2, "");
        this.f130406b = (TextView) findViewById2;
    }
}

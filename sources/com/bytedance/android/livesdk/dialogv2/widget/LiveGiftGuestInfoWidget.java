package com.bytedance.android.livesdk.dialogv2.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.gift.e;
import com.bytedance.android.livesdk.ac.g;
import com.bytedance.android.livesdk.b.a.d;
import com.bytedance.android.livesdk.bi;
import com.bytedance.android.livesdk.chatroom.widget.AvatarIconView;
import com.bytedance.android.livesdk.dialogv2.viewmodel.LiveGiftDialogViewModel;
import com.bytedance.android.livesdk.dialogv2.viewmodel.a;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.j;
import com.bytedance.android.livesdk.livesetting.linkmic.GuestLinkRoomReportEnableSetting;
import com.bytedance.android.livesdk.model.w;
import com.bytedance.android.livesdk.service.b.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class LiveGiftGuestInfoWidget extends LiveWidget implements View.OnClickListener, au {

    /* renamed from: a  reason: collision with root package name */
    public LiveGiftDialogViewModel f17048a;

    static {
        Covode.recordClassIndex(9472);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.b6l;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        ViewGroup viewGroup = this.containerView;
        l.b(viewGroup, "");
        viewGroup.setVisibility(0);
        AvatarIconView avatarIconView = (AvatarIconView) this.contentView.findViewById(R.id.or);
        TextView textView = (TextView) this.contentView.findViewById(R.id.en6);
        View findViewById = this.contentView.findViewById(R.id.fdr);
        User user = a.C0355a.C0356a.f17017a.f17006b;
        if (user != null) {
            avatarIconView.setAvatar(user.getAvatarThumb());
            l.b(textView, "");
            textView.setText(y.a((int) R.string.emb, g.a(user)));
        }
        avatarIconView.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        this.dataChannel.a((m) this, bi.class, (b) new a(this));
    }

    public final void onClick(View view) {
        User user = a.C0355a.C0356a.f17017a.f17006b;
        if (view == null) {
            return;
        }
        if (view.getId() == R.id.or || view.getId() == R.id.fdr) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.c(e.class, true);
            }
            d.a().f14191l = GuestLinkRoomReportEnableSetting.INSTANCE.getValue();
            UserProfileEvent userProfileEvent = new UserProfileEvent(user, "guest_connection");
            userProfileEvent.mReportType = "report_anchor";
            userProfileEvent.mSource = "guest_connection";
            com.bytedance.android.livesdk.an.a.a().a(userProfileEvent);
        }
    }

    static final class a extends h.f.b.m implements b<com.bytedance.android.livesdk.service.b.a, z> {
        final /* synthetic */ LiveGiftGuestInfoWidget this$0;

        static {
            Covode.recordClassIndex(9473);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(LiveGiftGuestInfoWidget liveGiftGuestInfoWidget) {
            super(1);
            this.this$0 = liveGiftGuestInfoWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.livesdk.service.b.a aVar) {
            w wVar;
            com.bytedance.android.livesdk.service.b.a aVar2 = aVar;
            l.d(aVar2, "");
            if (aVar2.f21278a == a.EnumC0451a.TAB_EVENT || aVar2.f21278a == a.EnumC0451a.GIFT_EVENT) {
                w wVar2 = aVar2.f21279b;
                if (!(wVar2 == null || wVar2.f19782a == null || (wVar = aVar2.f21279b) == null || wVar.f19783b == null)) {
                    this.this$0.containerView.post(new Runnable(this) {
                        /* class com.bytedance.android.livesdk.dialogv2.widget.LiveGiftGuestInfoWidget.a.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ a f17049a;

                        static {
                            Covode.recordClassIndex(9474);
                        }

                        {
                            this.f17049a = r1;
                        }

                        public final void run() {
                            ViewGroup viewGroup = this.f17049a.this$0.containerView;
                            if (viewGroup != null) {
                                viewGroup.setVisibility(8);
                            }
                        }
                    });
                    com.bytedance.android.livesdk.an.a.a().a(new j());
                }
            } else if (aVar2.f21278a == a.EnumC0451a.TAB_EMPTY_EVENT) {
                com.bytedance.android.livesdk.an.a.a().a(new j());
                this.this$0.containerView.post(new Runnable(this) {
                    /* class com.bytedance.android.livesdk.dialogv2.widget.LiveGiftGuestInfoWidget.a.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f17050a;

                    static {
                        Covode.recordClassIndex(9475);
                    }

                    {
                        this.f17050a = r1;
                    }

                    public final void run() {
                        ViewGroup viewGroup = this.f17050a.this$0.containerView;
                        if (viewGroup != null) {
                            viewGroup.setVisibility(0);
                        }
                    }
                });
            } else if (aVar2.f21278a == a.EnumC0451a.GIFT_EMPTY_EVENT && !a.C0355a.C0356a.f17017a.f17015k) {
                com.bytedance.android.livesdk.an.a.a().a(new j());
                this.this$0.containerView.post(new Runnable(this) {
                    /* class com.bytedance.android.livesdk.dialogv2.widget.LiveGiftGuestInfoWidget.a.AnonymousClass3 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f17051a;

                    static {
                        Covode.recordClassIndex(9476);
                    }

                    {
                        this.f17051a = r1;
                    }

                    public final void run() {
                        ViewGroup viewGroup = this.f17051a.this$0.containerView;
                        if (viewGroup != null) {
                            viewGroup.setVisibility(0);
                        }
                    }
                });
            }
            return z.f158842a;
        }
    }
}

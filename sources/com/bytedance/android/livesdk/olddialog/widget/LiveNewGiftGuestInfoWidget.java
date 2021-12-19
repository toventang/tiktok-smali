package com.bytedance.android.livesdk.olddialog.widget;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ac.g;
import com.bytedance.android.livesdk.b.a.d;
import com.bytedance.android.livesdk.chatroom.widget.AvatarIconView;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.GuestLinkRoomReportEnableSetting;
import com.bytedance.android.livesdk.olddialog.viewmodel.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;

public class LiveNewGiftGuestInfoWidget extends LiveWidget implements View.OnClickListener, au {

    /* renamed from: a  reason: collision with root package name */
    public a f20120a;

    static {
        Covode.recordClassIndex(11874);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.b6l;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        this.containerView.setVisibility(0);
        AvatarIconView avatarIconView = (AvatarIconView) this.contentView.findViewById(R.id.or);
        TextView textView = (TextView) this.contentView.findViewById(R.id.en6);
        View findViewById = this.contentView.findViewById(R.id.fdr);
        User user = this.f20120a.f20095a;
        if (user != null) {
            avatarIconView.setAvatar(user.getAvatarThumb());
            textView.setText(y.a((int) R.string.emb, g.a(user)));
        }
        avatarIconView.setOnClickListener(this);
        findViewById.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.or || view.getId() == R.id.fdr) {
            this.f20120a.f20099e.postValue(true);
            d.a().f14191l = GuestLinkRoomReportEnableSetting.INSTANCE.getValue();
            UserProfileEvent userProfileEvent = new UserProfileEvent(this.f20120a.f20095a, "guest_connection");
            userProfileEvent.mReportType = "report_anchor";
            userProfileEvent.mSource = "guest_connection";
            com.bytedance.android.livesdk.an.a.a().a(userProfileEvent);
        }
    }
}

package com.bytedance.android.livesdk.chatroom.end.newaudienceend;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.android.livesdk.utils.ad;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public class LiveNewRecommendView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    Context f15456a;

    /* renamed from: b  reason: collision with root package name */
    DataChannel f15457b;

    /* renamed from: c  reason: collision with root package name */
    List<View> f15458c = new ArrayList(4);

    /* renamed from: d  reason: collision with root package name */
    a f15459d;

    /* renamed from: e  reason: collision with root package name */
    View f15460e;

    /* renamed from: f  reason: collision with root package name */
    private View.OnClickListener f15461f = new n(this);

    public interface a {
        static {
            Covode.recordClassIndex(8537);
        }

        void e();
    }

    static {
        Covode.recordClassIndex(8536);
    }

    private void a() {
        List<View> list = this.f15458c;
        if (list != null && list.size() == 4) {
            for (View view : this.f15458c) {
                view.setOnClickListener(this.f15461f);
            }
        }
    }

    public void setDataChannel(DataChannel dataChannel) {
        this.f15457b = dataChannel;
    }

    public void setIView(a aVar) {
        this.f15459d = aVar;
    }

    public LiveNewRecommendView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(1616);
        this.f15456a = context;
        LayoutInflater.from(context).inflate(R.layout.bfp, this);
        this.f15458c.add(findViewById(R.id.brr));
        this.f15458c.add(findViewById(R.id.brs));
        this.f15458c.add(findViewById(R.id.brt));
        this.f15458c.add(findViewById(R.id.bru));
        this.f15460e = findViewById(R.id.an6);
        a();
        MethodCollector.o(1616);
    }

    /* access modifiers changed from: package-private */
    public final void a(List<Room> list, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            View view = this.f15458c.get(i3);
            view.setVisibility(0);
            HSImageView hSImageView = (HSImageView) view.findViewById(R.id.dq5);
            ImageModel cover = list.get(i3).getCover();
            if (!((cover == null && (list.get(i3).getOwner() == null || (cover = list.get(i3).getOwner().getAvatarMedium()) == null)) || hSImageView == null)) {
                g.b(hSImageView, cover);
            }
            LiveTextView liveTextView = (LiveTextView) view.findViewById(R.id.dqd);
            String title = list.get(i3).getTitle();
            if (title == null || title.length() == 0) {
                liveTextView.setVisibility(8);
            } else {
                liveTextView.setText(title);
            }
            LiveTextView liveTextView2 = (LiveTextView) view.findViewById(R.id.jy);
            String displayId = list.get(i3).getOwner().getDisplayId();
            if (displayId == null || displayId.length() == 0) {
                liveTextView2.setVisibility(8);
            } else {
                liveTextView2.setText(displayId);
            }
            ((LiveTextView) view.findViewById(R.id.dq4)).setText(ad.a((long) list.get(i3).getUserCount()));
            view.setOnClickListener(new o(this, list, i3));
            long followStatus = list.get(i3).getOwner().getFollowInfo().getFollowStatus();
            if (followStatus == 1 || followStatus == 2) {
                view.findViewById(R.id.b8i).setVisibility(0);
                if (y.g()) {
                    view.findViewById(R.id.b8i).setBackgroundResource(R.drawable.brx);
                }
                if (y.g()) {
                    view.findViewById(R.id.cd7).setBackgroundResource(R.drawable.bs5);
                } else {
                    view.findViewById(R.id.cd7).setBackgroundResource(R.drawable.bs4);
                }
            }
            com.bytedance.android.live.j.a aVar = (com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class);
            if (aVar != null && aVar.isMicRoomForRoom(list.get(i3))) {
                if (followStatus == 1 || followStatus == 2) {
                    ((TextView) view.findViewById(R.id.cd7)).setText(R.string.e6t);
                } else {
                    ((TextView) view.findViewById(R.id.cd7)).setText(R.string.edr);
                }
                if (!(list.get(i3).officialChannelInfo == null || list.get(i3).officialChannelInfo.f18978a == null)) {
                    liveTextView.setText(list.get(i3).officialChannelInfo.f18979b);
                    liveTextView2.setText(list.get(i3).officialChannelInfo.f18978a.getDisplayId());
                }
            }
            view.setTag(list.get(i3));
            h.a(list.get(i3), this.f15457b);
        }
    }
}

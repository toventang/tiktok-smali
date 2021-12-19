package com.bytedance.android.livesdk.feed.drawerfeed.a;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.d;
import com.bytedance.android.livesdk.feed.dislike.a;
import com.bytedance.android.livesdk.feed.drawerfeed.l;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.h;
import com.bytedance.android.livesdk.feed.m;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.f;
import com.bytedance.android.livesdkapi.g.g;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import f.a.l.c;
import java.util.HashMap;

public final class j extends i {

    /* renamed from: a  reason: collision with root package name */
    public static int f17383a = -1;
    private ViewGroup A;

    static {
        Covode.recordClassIndex(9637);
    }

    @Override // com.bytedance.android.livesdk.feed.i.k
    public final void a(ImageModel imageModel) {
        if (imageModel == null) {
            a(0, 0);
        } else {
            a(imageModel.width, imageModel.height);
        }
    }

    @Override // com.bytedance.android.livesdk.feed.i.k
    public final void a(FeedItem feedItem) {
        String str;
        String str2;
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        String str3 = this.f17497d.f17458b;
        if (str3.contains("live") && l.t != null) {
            this.f17500g = l.t;
            str3 = l.t.getEvent();
            enterRoomConfig.f23298b.f23319k = (long) this.f17500g.getSource();
        }
        enterRoomConfig.f23298b.f23321m = str3;
        enterRoomConfig.f23299c.X = "live_small_picture";
        enterRoomConfig.f23298b.f23316h = str3;
        enterRoomConfig.f23298b.f23315g = feedItem.logPb;
        enterRoomConfig.f23298b.f23309a = feedItem.resId;
        if (this.f17500g != null) {
            enterRoomConfig.f23298b.f23319k = (long) this.f17500g.getSource();
        }
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f23299c;
        if (d.a() != null) {
            str = d.a().b();
        } else {
            str = null;
        }
        roomsData.J = str;
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.f23299c;
        if (d.a() != null) {
            str2 = d.a().c();
        } else {
            str2 = "drawer_cover";
        }
        roomsData2.L = str2;
        if (feedItem.isRecommendCard) {
            enterRoomConfig.f23299c.J = "pop_card";
        }
        if (f.f23137c.booleanValue()) {
            HashMap<Long, String> hashMap = new HashMap<>();
            hashMap.put(Long.valueOf(feedItem.getRoom().getId()), feedItem.debugInfo);
            enterRoomConfig.f23299c.aC = hashMap;
        }
        a(feedItem, enterRoomConfig);
    }

    @Override // com.bytedance.android.livesdk.feed.i.k
    public final void a(ImageModel imageModel, Room room) {
        a(imageModel.getWidth(), imageModel.getHeight());
        super.a(imageModel, room);
    }

    private void a(int i2, int i3) {
        int i4;
        if (f17383a <= 0) {
            f17383a = (this.A.getMeasuredWidth() - 3) / 2;
        }
        if (i2 <= 0 || i3 <= 0) {
            i4 = f17383a;
        } else {
            i4 = (f17383a * i3) / i2;
        }
        ViewGroup.LayoutParams layoutParams = this.f17523l.getLayoutParams();
        if (layoutParams.width != f17383a || layoutParams.height != i4) {
            layoutParams.width = f17383a;
            layoutParams.height = i4;
            this.f17523l.setLayoutParams(layoutParams);
        }
    }

    @Override // com.bytedance.android.livesdk.feed.i.a, com.bytedance.android.livesdk.feed.i.k
    public final void a(FeedItem feedItem, Room room, int i2) {
        super.a(feedItem, room, i2);
    }

    public j(View view, a aVar, h hVar, FeedDataKey feedDataKey, m mVar, g gVar, c<FeedItem> cVar, c<Boolean> cVar2, c<Object> cVar3, c<Object> cVar4, ViewGroup viewGroup) {
        super(view, aVar, hVar, feedDataKey, mVar, gVar, cVar, cVar2, cVar3, cVar4);
        this.A = viewGroup;
        if (feedDataKey.f17458b.equals("live")) {
            this.f17500g = l.t;
        } else {
            this.f17500g = mVar.a(feedDataKey.f17459c);
        }
    }
}

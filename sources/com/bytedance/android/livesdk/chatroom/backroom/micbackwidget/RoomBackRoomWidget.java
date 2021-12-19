package com.bytedance.android.livesdk.chatroom.backroom.micbackwidget;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.backroom.RoomBackProgressView;
import com.bytedance.android.livesdk.chatroom.backroom.micbackwidget.a;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.l;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;

public final class RoomBackRoomWidget extends RoomRecycleWidget implements a.AbstractC0324a, au {

    /* renamed from: a  reason: collision with root package name */
    private RoomBackProgressView f15035a;

    /* renamed from: b  reason: collision with root package name */
    private Room f15036b;

    /* renamed from: c  reason: collision with root package name */
    private EnterRoomConfig f15037c;

    /* renamed from: d  reason: collision with root package name */
    private HSImageView f15038d;

    static {
        Covode.recordClassIndex(8355);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.be1;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        a.f15044e = null;
    }

    @Override // com.bytedance.android.livesdk.chatroom.backroom.micbackwidget.a.AbstractC0324a
    public final void a() {
        hide();
    }

    @Override // com.bytedance.android.widget.Widget
    public final boolean shouldAttach() {
        Long l2;
        if (com.bytedance.android.livesdk.chatroom.backroom.d.a.a()) {
            return false;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (l2 = (Long) dataChannel.b(l.class)) == null || l2.longValue() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public final void onGetRoomInfo(Room room) {
        super.onGetRoomInfo(room);
        attach();
    }

    @Override // com.bytedance.android.livesdk.chatroom.backroom.micbackwidget.a.AbstractC0324a
    public final void a(float f2) {
        show();
        RoomBackProgressView roomBackProgressView = this.f15035a;
        if (roomBackProgressView != null) {
            roomBackProgressView.setProgress(f2);
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RoomBackRoomWidget f15039a;

        static {
            Covode.recordClassIndex(8356);
        }

        a(RoomBackRoomWidget roomBackRoomWidget) {
            this.f15039a = roomBackRoomWidget;
        }

        public final void onClick(View view) {
            Long l2;
            RoomBackRoomWidget roomBackRoomWidget = this.f15039a;
            DataChannel dataChannel = roomBackRoomWidget.dataChannel;
            if (dataChannel != null && (l2 = (Long) dataChannel.b(l.class)) != null) {
                long longValue = l2.longValue();
                if (longValue > 0) {
                    com.bytedance.android.live.j.a aVar = (com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class);
                    if (aVar != null) {
                        aVar.jumpRoom(longValue, false);
                    }
                    b.a.a("livesdk_line_up_list_click_return").a(roomBackRoomWidget.dataChannel).b();
                }
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        RoomBackProgressView roomBackProgressView;
        View view = getView();
        if (view != null) {
            roomBackProgressView = (RoomBackProgressView) view.findViewById(R.id.dpo);
        } else {
            roomBackProgressView = null;
        }
        this.f15035a = roomBackProgressView;
        this.f15036b = (Room) this.dataChannel.b(df.class);
        this.f15037c = com.bytedance.android.livesdk.chatroom.backroom.b.f15002a.a(com.bytedance.android.live.core.f.a.a(getContext())).a();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        float f2;
        int i2;
        View view = getView();
        if (view != null) {
            h.f.b.l.b(view, "");
            view.setVisibility(8);
            HSImageView hSImageView = (HSImageView) view.findViewById(R.id.dpm);
            this.f15038d = hSImageView;
            if (hSImageView != null) {
                hSImageView.setBackgroundResource(2131234698);
            }
            if (!com.bytedance.android.live.uikit.c.a.a(this.context)) {
                i2 = R.drawable.btp;
            } else {
                i2 = R.drawable.btq;
            }
            view.setBackgroundResource(i2);
            view.setOnClickListener(new a(this));
        }
        if (a.f15041b) {
            a.f15044e = this;
            if (a.f15043d == null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(360.0f, 0.0f);
                h.f.b.l.b(ofFloat, "");
                ofFloat.setDuration(((long) a.f15042c) * 1000);
                ofFloat.addUpdateListener(a.b.f15046a);
                ofFloat.addListener(new a.c());
                ofFloat.start();
                a.f15043d = ofFloat;
                return;
            }
            ValueAnimator valueAnimator = a.f15043d;
            if (valueAnimator == null) {
                h.f.b.l.b();
            }
            if (!valueAnimator.isStarted()) {
                a.AbstractC0324a aVar = a.f15044e;
                if (aVar != null) {
                    aVar.a();
                    return;
                }
                return;
            }
            a.AbstractC0324a aVar2 = a.f15044e;
            if (aVar2 != null) {
                ValueAnimator valueAnimator2 = a.f15043d;
                if (valueAnimator2 == null) {
                    h.f.b.l.b();
                }
                Object animatedValue = valueAnimator2.getAnimatedValue();
                if (!(animatedValue instanceof Float)) {
                    animatedValue = null;
                }
                Float f3 = (Float) animatedValue;
                if (f3 != null) {
                    f2 = f3.floatValue();
                } else {
                    f2 = 0.0f;
                }
                aVar2.a(f2);
            }
        }
    }
}

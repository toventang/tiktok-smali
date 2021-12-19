package com.bytedance.android.livesdk.feed.i;

import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f17516a;

    /* renamed from: b  reason: collision with root package name */
    private final Room f17517b;

    /* renamed from: c  reason: collision with root package name */
    private final PopupWindow f17518c;

    static {
        Covode.recordClassIndex(9703);
    }

    h(a aVar, Room room, PopupWindow popupWindow) {
        this.f17516a = aVar;
        this.f17517b = room;
        this.f17518c = popupWindow;
    }

    public final void onClick(View view) {
        this.f17516a.a(this.f17517b, this.f17518c);
    }
}

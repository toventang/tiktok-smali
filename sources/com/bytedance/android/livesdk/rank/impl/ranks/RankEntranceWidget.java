package com.bytedance.android.livesdk.rank.impl.ranks;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;
import androidx.core.g.d;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.bl;
import com.bytedance.android.livesdk.chatroom.viewmodule.br;
import com.bytedance.android.livesdk.event.g;
import com.bytedance.android.livesdk.j.ao;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.rank.api.j;
import com.bytedance.android.livesdk.rank.impl.ranks.a;
import com.bytedance.android.livesdk.rank.impl.ui.MarqueeSwitcher;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.List;

public class RankEntranceWidget extends LiveRecyclableWidget implements a.AbstractC0430a, au {

    /* renamed from: a  reason: collision with root package name */
    public MarqueeSwitcher f20765a;

    /* renamed from: b  reason: collision with root package name */
    g f20766b;

    /* renamed from: c  reason: collision with root package name */
    public final List<c> f20767c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public int f20768d;

    /* renamed from: e  reason: collision with root package name */
    com.bytedance.android.livesdk.rank.impl.ranks.a.a f20769e;

    /* renamed from: f  reason: collision with root package name */
    private c f20770f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f20771g = false;

    /* renamed from: h  reason: collision with root package name */
    private final Handler f20772h = new Handler(new Handler.Callback() {
        /* class com.bytedance.android.livesdk.rank.impl.ranks.RankEntranceWidget.AnonymousClass1 */

        static {
            Covode.recordClassIndex(12303);
        }

        public final boolean handleMessage(Message message) {
            boolean z = false;
            if (message.what != 1) {
                return false;
            }
            if (RankEntranceWidget.this.f20767c.isEmpty()) {
                return true;
            }
            int size = (RankEntranceWidget.this.f20768d + 1) % RankEntranceWidget.this.f20767c.size();
            c cVar = RankEntranceWidget.this.f20767c.get(size);
            TextView textView = (TextView) RankEntranceWidget.this.f20765a.getNextView();
            RankEntranceWidget rankEntranceWidget = RankEntranceWidget.this;
            if (size != 0) {
                z = true;
            }
            rankEntranceWidget.a(textView, cVar, z, "loop");
            RankEntranceWidget.this.f20765a.showNext();
            RankEntranceWidget.this.f20768d++;
            return true;
        }
    });

    /* renamed from: i  reason: collision with root package name */
    private b<z, z> f20773i = new d(this);

    static {
        Covode.recordClassIndex(12302);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final void a(Throwable th) {
        br.a(this, th);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bbo;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.a.AbstractC0430a
    public final c b() {
        return this.f20770f;
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final String g() {
        return getClass().getName();
    }

    private void c() {
        this.f20765a.reset();
        this.f20767c.clear();
        this.f20772h.removeMessages(1);
        com.bytedance.android.livesdk.rank.impl.ranks.a.a aVar = this.f20769e;
        if (aVar != null) {
            aVar.dismiss();
            if (bl.f14211a) {
                this.f20769e = null;
            }
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.a.AbstractC0430a
    public final void a() {
        show();
        if (this.dataChannel != null) {
            this.dataChannel.a((m) this, com.bytedance.android.live.broadcast.api.a.class, (b) this.f20773i);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        getView().setAlpha(1.0f);
        hide();
        this.f20766b.b();
        c();
        com.bytedance.android.livesdk.rank.impl.c.a.f20655a = -1;
        com.bytedance.android.livesdk.rank.impl.c.a.f20656b = -1;
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.a.AbstractC0430a
    public final void a(boolean z) {
        hide();
        if (z) {
            c();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
        this.f20766b = new g();
        getView().setOnClickListener(new e(this));
        this.f20765a = (MarqueeSwitcher) findViewById(R.id.es0);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        hide();
        this.f20767c.clear();
        this.f20766b.a((a.AbstractC0430a) this);
        ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) com.bytedance.android.livesdk.an.a.a().a(g.class).a(WidgetExtendsKt.autoDispose(this))).a(new f(this));
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.a.AbstractC0430a
    public final void a(ArrayList<Integer> arrayList) {
        Room room;
        com.bytedance.android.livesdk.rank.impl.ranks.a.a aVar = this.f20769e;
        if (aVar != null) {
            aVar.dismiss();
        }
        if (this.dataChannel != null && (room = (Room) this.dataChannel.b(df.class)) != null && room.getOwner() != null && this.f20770f != null) {
            long id = room.getOwner().getId();
            long id2 = room.getId();
            int i2 = this.f20770f.f20906a;
            l.d(arrayList, "");
            com.bytedance.android.livesdk.rank.impl.ranks.a.a aVar2 = new com.bytedance.android.livesdk.rank.impl.ranks.a.a();
            Bundle bundle = new Bundle();
            bundle.putLong("arg_anchor_id", id);
            bundle.putLong("arg_room_id", id2);
            bundle.putInt("first_show_rank_type", i2);
            bundle.putIntegerArrayList("rank_types", arrayList);
            aVar2.setArguments(bundle);
            this.f20769e = aVar2;
            androidx.fragment.app.i iVar = (androidx.fragment.app.i) this.dataChannel.b(ao.class);
            if (iVar != null) {
                this.f20769e.show(iVar, com.bytedance.android.livesdk.rank.impl.ranks.a.a.class.getSimpleName());
            }
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.a.AbstractC0430a
    public final void a(List<c> list) {
        if (!d.a(this.f20767c, list)) {
            this.f20767c.clear();
            this.f20767c.addAll(list);
            boolean z = true;
            this.f20772h.removeMessages(1);
            this.f20768d = 0;
            TextView textView = (TextView) this.f20765a.getNextView();
            this.f20765a.showNext();
            if (this.f20770f != null) {
                this.f20771g = true;
            }
            c cVar = list.get(0);
            if (list.size() <= 1) {
                z = false;
            }
            a(textView, cVar, z, "live_play");
        }
    }

    public final void a(TextView textView, c cVar, boolean z, String str) {
        String str2;
        this.f20770f = cVar;
        textView.setText(cVar.f20907b);
        GradientDrawable gradientDrawable = (GradientDrawable) textView.getBackground();
        gradientDrawable.mutate();
        gradientDrawable.setColor(cVar.f20908c);
        if (z) {
            this.f20772h.sendEmptyMessageDelayed(1, cVar.f20909d);
        }
        String rankName = j.HOURLY_RANK.getRankName();
        if (cVar.f20906a == j.WEEKLY_RANK.getType()) {
            rankName = j.WEEKLY_RANK.getRankName();
        }
        if (!this.f20771g.booleanValue()) {
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_hourly_rank_entrance_show").a(this.dataChannel);
            if (((Boolean) this.dataChannel.b(ee.class)).booleanValue()) {
                str2 = "anchor";
            } else {
                str2 = "user";
            }
            a2.a("user_type", str2).a("show_reason", str).a("rank_type", rankName).b();
        }
    }
}

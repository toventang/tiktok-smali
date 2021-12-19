package com.bytedance.android.livesdk.hashtag;

import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.i;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.chatroom.c.g;
import com.bytedance.android.livesdk.j.ao;
import com.bytedance.android.livesdk.j.aq;
import com.bytedance.android.livesdk.j.ar;
import com.bytedance.android.livesdk.j.as;
import com.bytedance.android.livesdk.j.da;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.af;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import h.z;

public abstract class BaseHashTagWidget extends RoomRecycleWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    protected TextView f18115a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f18116b;

    /* renamed from: c  reason: collision with root package name */
    public long f18117c;

    static {
        Covode.recordClassIndex(10046);
    }

    public abstract void a();

    public abstract void a(i iVar);

    public abstract void a(Hashtag hashtag);

    public abstract void b();

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.b_4;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.b(this);
        }
    }

    private final void d() {
        Hashtag hashtag;
        Room room = (Room) this.dataChannel.b(df.class);
        if (room == null || (hashtag = room.hashtag) == null) {
            hide();
            return;
        }
        this.dataChannel.b(aq.class, hashtag);
        DataChannelGlobal.f34575d.a(ar.class, hashtag);
        a(hashtag);
    }

    /* access modifiers changed from: protected */
    public final void c() {
        Hashtag hashtag = (Hashtag) this.dataChannel.b(aq.class);
        if (hashtag == null) {
            return;
        }
        if (!af.a(hashtag) || !l.a(this.dataChannel.b(as.class), (Object) true) || this.f18116b) {
            if (isShowing()) {
                hide();
            }
        } else if (!isShowing()) {
            show();
            b();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public void onGetRoomInfo(Room room) {
        super.onGetRoomInfo(room);
        d();
    }

    public final void b(Hashtag hashtag) {
        if (af.a(hashtag)) {
            TextView textView = this.f18115a;
            if (textView == null) {
                l.a("tagName");
            }
            textView.setText(hashtag.title);
            return;
        }
        hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
        View findViewById = findViewById(R.id.ei1);
        l.b(findViewById, "");
        this.f18115a = (TextView) findViewById;
        View view = getView();
        if (view != null) {
            view.setOnClickListener(new a(this));
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseHashTagWidget f18118a;

        static {
            Covode.recordClassIndex(10047);
        }

        a(BaseHashTagWidget baseHashTagWidget) {
            this.f18118a = baseHashTagWidget;
        }

        public final void onClick(View view) {
            if (System.currentTimeMillis() - this.f18118a.f18117c > 500) {
                this.f18118a.f18117c = System.currentTimeMillis();
                androidx.fragment.app.i iVar = (androidx.fragment.app.i) this.f18118a.dataChannel.b(ao.class);
                if (iVar != null) {
                    this.f18118a.a(iVar);
                }
                this.f18118a.a();
            }
        }
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseHashTagWidget f18119a;

        static {
            Covode.recordClassIndex(10048);
        }

        b(BaseHashTagWidget baseHashTagWidget) {
            this.f18119a = baseHashTagWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            g gVar = (g) obj;
            l.b(gVar, "");
            if (gVar.f15118b) {
                this.f18119a.f18116b = true;
                this.f18119a.hide();
                return;
            }
            this.f18119a.f18116b = false;
            this.f18119a.c();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<Hashtag, z> {
        final /* synthetic */ BaseHashTagWidget this$0;

        static {
            Covode.recordClassIndex(10049);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(BaseHashTagWidget baseHashTagWidget) {
            super(1);
            this.this$0 = baseHashTagWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Hashtag hashtag) {
            Hashtag hashtag2;
            Hashtag hashtag3 = hashtag;
            l.d(hashtag3, "");
            Room room = (Room) this.this$0.dataChannel.b(df.class);
            if (!(room == null || (hashtag2 = room.hashtag) == null)) {
                hashtag2.id = hashtag3.id;
                hashtag2.title = hashtag3.title;
            }
            this.this$0.b(hashtag3);
            this.this$0.c();
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ BaseHashTagWidget this$0;

        static {
            Covode.recordClassIndex(10050);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(BaseHashTagWidget baseHashTagWidget) {
            super(1);
            this.this$0 = baseHashTagWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            ViewParent viewParent;
            boolean booleanValue = bool.booleanValue();
            View view = this.this$0.getView();
            ConstraintLayout constraintLayout = null;
            if (view != null) {
                viewParent = view.getParent();
            } else {
                viewParent = null;
            }
            if (viewParent instanceof ConstraintLayout) {
                constraintLayout = viewParent;
            }
            ConstraintLayout constraintLayout2 = constraintLayout;
            if (booleanValue) {
                p.a(constraintLayout2, this.this$0.getViewId(), y.a(131.0f));
            } else {
                p.a(constraintLayout2, this.this$0.getViewId(), 0);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        hide();
        com.bytedance.android.livesdk.an.a.a().a(this, g.class, this.dataChannel).a(new b(this));
        this.dataChannel.a((Object) this, aq.class, (h.f.a.b) new c(this)).a((Object) this, da.class, (h.f.a.b) new d(this));
        d();
    }
}

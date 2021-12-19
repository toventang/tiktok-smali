package com.bytedance.android.livesdk.hashtag;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.n.v;
import com.bytedance.android.livesdk.ap.c;
import com.bytedance.android.livesdk.hashtag.f;
import com.bytedance.android.livesdk.j.as;
import com.bytedance.android.livesdk.j.dd;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class BroadcastHashTagWidget extends BaseHashTagWidget implements au {
    static {
        Covode.recordClassIndex(10051);
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final void a() {
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final void b() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.livesdk.hashtag.BaseHashTagWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final void a(androidx.fragment.app.i iVar) {
        l.d(iVar, "");
        f.a.a(iVar, "Broadcast", null);
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        this.dataChannel.b((Object) this, v.class, (b) new a(this));
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final void a(Hashtag hashtag) {
        l.d(hashtag, "");
        com.bytedance.android.livesdk.ap.b<Long> bVar = com.bytedance.android.livesdk.ap.a.cx;
        l.b(bVar, "");
        c.a(bVar, hashtag.id);
        com.bytedance.android.livesdk.ap.b<String> bVar2 = com.bytedance.android.livesdk.ap.a.cy;
        l.b(bVar2, "");
        c.a(bVar2, hashtag.title);
    }

    static final class a extends h.f.b.m implements b<Boolean, z> {
        final /* synthetic */ BroadcastHashTagWidget this$0;

        static {
            Covode.recordClassIndex(10052);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(BroadcastHashTagWidget broadcastHashTagWidget) {
            super(1);
            this.this$0 = broadcastHashTagWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.this$0.dataChannel.a(as.class, (Object) false);
                this.this$0.hide();
            } else {
                this.this$0.dataChannel.a(as.class, (Object) true);
                this.this$0.c();
            }
            this.this$0.dataChannel.c(dd.class);
            return z.f158842a;
        }
    }
}

package com.bytedance.android.livesdk.hashtag;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.broadcast.model.o;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.view.a;
import com.bytedance.android.live.design.view.j;
import com.bytedance.android.livesdk.hashtag.f;
import com.bytedance.android.livesdk.j.ao;
import com.bytedance.android.livesdk.j.aq;
import com.bytedance.android.livesdk.j.cs;
import com.bytedance.android.livesdk.j.dg;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.af;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.Map;

public final class PreviewHashtagWidget extends LiveWidget implements au {

    /* renamed from: c  reason: collision with root package name */
    public static final a f18121c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public TextView f18122a;

    /* renamed from: b  reason: collision with root package name */
    public i f18123b;

    static {
        Covode.recordClassIndex(10056);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bdh;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(10057);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cv;
        l.b(bVar, "");
        Boolean a2 = bVar.a();
        l.b(a2, "");
        if (a2.booleanValue()) {
            j.a(((a.C0140a) new a.C0140a(getView()).a(R.string.ec6).b(y.a(266.0f)).c()).b());
            com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.cv;
            l.b(bVar2, "");
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar2, (Object) false);
        }
        View findViewById = findViewById(R.id.ei1);
        l.b(findViewById, "");
        TextView textView = (TextView) findViewById;
        this.f18122a = textView;
        if (textView == null) {
            l.a("tagName");
        }
        textView.setText(y.a((int) R.string.e7f));
        this.dataChannel.a((m) this, dg.class, (h.f.a.b) new c(this)).b((m) this, aq.class, (h.f.a.b) new d(this));
        View view = getView();
        if (view != null) {
            view.setOnClickListener(new e(this));
        }
    }

    public PreviewHashtagWidget(com.bytedance.android.livesdkapi.depend.model.live.i iVar) {
        this.f18123b = iVar;
    }

    public static final /* synthetic */ TextView a(PreviewHashtagWidget previewHashtagWidget) {
        TextView textView = previewHashtagWidget.f18122a;
        if (textView == null) {
            l.a("tagName");
        }
        return textView;
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewHashtagWidget f18124a;

        static {
            Covode.recordClassIndex(10061);
        }

        e(PreviewHashtagWidget previewHashtagWidget) {
            this.f18124a = previewHashtagWidget;
        }

        public final void onClick(View view) {
            androidx.fragment.app.i iVar = (androidx.fragment.app.i) this.f18124a.dataChannel.b(ao.class);
            if (iVar != null) {
                f.a.a(iVar, "Preview", this.f18124a.f18123b);
            }
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<o, z> {
        final /* synthetic */ PreviewHashtagWidget this$0;

        static {
            Covode.recordClassIndex(10059);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(PreviewHashtagWidget previewHashtagWidget) {
            super(1);
            this.this$0 = previewHashtagWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(o oVar) {
            o oVar2 = oVar;
            l.d(oVar2, "");
            Long l2 = oVar2.f7951m;
            if (l2 != null && l2.longValue() == 4) {
                this.this$0.hide();
            }
            if (com.bytedance.android.livesdk.t.a.a(this.this$0.dataChannel)) {
                PreviewHashtagWidget previewHashtagWidget = this.this$0;
                previewHashtagWidget.dataChannel.b((m) previewHashtagWidget, cs.class, (h.f.a.b) new b(previewHashtagWidget));
            }
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<Hashtag, z> {
        final /* synthetic */ PreviewHashtagWidget this$0;

        static {
            Covode.recordClassIndex(10060);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(PreviewHashtagWidget previewHashtagWidget) {
            super(1);
            this.this$0 = previewHashtagWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Hashtag hashtag) {
            Hashtag hashtag2 = hashtag;
            l.d(hashtag2, "");
            if (af.a(hashtag2)) {
                PreviewHashtagWidget.a(this.this$0).setText(hashtag2.title);
            } else {
                PreviewHashtagWidget.a(this.this$0).setText(y.a((int) R.string.e7f));
            }
            return z.f158842a;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<GameTag, z> {
        final /* synthetic */ PreviewHashtagWidget this$0;

        static {
            Covode.recordClassIndex(10058);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(PreviewHashtagWidget previewHashtagWidget) {
            super(1);
            this.this$0 = previewHashtagWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(GameTag gameTag) {
            Hashtag hashtag;
            long j2;
            GameTag gameTag2 = gameTag;
            String str = "";
            l.d(gameTag2, str);
            com.bytedance.android.livesdk.ap.b<Map<String, String>> bVar = com.bytedance.android.livesdk.ap.a.cO;
            l.b(bVar, str);
            Map<String, String> a2 = bVar.a();
            if (a2 == null) {
                hashtag = null;
            } else {
                hashtag = new Hashtag(null, null, null, 7, null);
                String str2 = a2.get("key_id");
                if (str2 != null) {
                    j2 = Long.parseLong(str2);
                } else {
                    j2 = 0;
                }
                hashtag.id = Long.valueOf(j2);
                String str3 = a2.get("key_title");
                if (str3 != null) {
                    str = str3;
                }
                hashtag.title = str;
            }
            com.bytedance.android.live.core.c.a.a(4, "PreviewHashtagWidget", "observe last selected game item. gameTag=" + gameTag2 + ", gameHashtag=" + hashtag);
            if (!gameTag2.isNonGameItem() && hashtag != null) {
                this.this$0.dataChannel.b(aq.class, hashtag);
            }
            return z.f158842a;
        }
    }
}

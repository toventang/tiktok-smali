package com.bytedance.android.live.broadcast.preview.widget;

import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.view.a;
import com.bytedance.android.live.design.view.j;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.j.cs;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.Map;

public final class PreviewSelectGameCategoryWidget extends LiveWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    public long f8389a;

    /* renamed from: b  reason: collision with root package name */
    private LiveTextView f8390b;

    static {
        Covode.recordClassIndex(4290);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bdf;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        j.a(this.f8389a);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        View view = getView();
        if (view != null) {
            view.post(new c(this));
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewSelectGameCategoryWidget f8392a;

        static {
            Covode.recordClassIndex(4293);
        }

        c(PreviewSelectGameCategoryWidget previewSelectGameCategoryWidget) {
            this.f8392a = previewSelectGameCategoryWidget;
        }

        public final void run() {
            com.bytedance.android.livesdk.ap.b<Map<String, String>> bVar = com.bytedance.android.livesdk.ap.a.cN;
            l.b(bVar, "");
            Map<String, String> a2 = bVar.a();
            if (a2 == null || a2.isEmpty()) {
                j.a(this.f8392a.f8389a);
                a.C0140a aVar = new a.C0140a(this.f8392a.getView());
                aVar.f9423a = y.a((int) R.string.eaq);
                com.bytedance.android.live.design.view.a a3 = ((a.C0140a) aVar.d().a(-1)).b();
                this.f8392a.f8389a = j.a(a3);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        View findViewById = findViewById(R.id.ezx);
        String str = "";
        l.b(findViewById, str);
        this.f8390b = (LiveTextView) findViewById;
        View view = getView();
        if (view != null) {
            view.setOnClickListener(new a(this));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.b((m) this, cs.class, (h.f.a.b) new b(this));
        }
        com.bytedance.android.livesdk.ap.b<Map<String, String>> bVar = com.bytedance.android.livesdk.ap.a.cN;
        l.b(bVar, str);
        GameTag a2 = GameTag.a.a(bVar.a());
        if (a2 != null) {
            String str2 = a2.showName;
            if (str2 != null) {
                str = str2;
            }
            a(str);
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewSelectGameCategoryWidget f8391a;

        static {
            Covode.recordClassIndex(4291);
        }

        a(PreviewSelectGameCategoryWidget previewSelectGameCategoryWidget) {
            this.f8391a = previewSelectGameCategoryWidget;
        }

        public final void onClick(View view) {
            androidx.fragment.app.i iVar;
            com.bytedance.android.live.g.a aVar = (com.bytedance.android.live.g.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.g.a.class);
            e a2 = p.a(this.f8391a.getContext());
            if (a2 != null) {
                iVar = a2.getSupportFragmentManager();
            } else {
                iVar = null;
            }
            aVar.showGameCategoryListDialog(iVar);
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<GameTag, z> {
        final /* synthetic */ PreviewSelectGameCategoryWidget this$0;

        static {
            Covode.recordClassIndex(4292);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(PreviewSelectGameCategoryWidget previewSelectGameCategoryWidget) {
            super(1);
            this.this$0 = previewSelectGameCategoryWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(GameTag gameTag) {
            GameTag gameTag2 = gameTag;
            String str = "";
            l.d(gameTag2, str);
            PreviewSelectGameCategoryWidget previewSelectGameCategoryWidget = this.this$0;
            String str2 = gameTag2.showName;
            if (str2 != null) {
                str = str2;
            }
            previewSelectGameCategoryWidget.a(str);
            j.a(this.this$0.f8389a);
            return z.f158842a;
        }
    }

    public final void a(String str) {
        if (str.length() > 0) {
            LiveTextView liveTextView = this.f8390b;
            if (liveTextView == null) {
                l.a("tvGameName");
            }
            liveTextView.setText(str);
        }
    }
}

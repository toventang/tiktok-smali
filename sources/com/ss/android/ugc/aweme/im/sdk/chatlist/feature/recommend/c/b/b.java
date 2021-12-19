package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.b;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public TextView f101990a;

    /* renamed from: b  reason: collision with root package name */
    public TuxIconView f101991b;

    public interface a {
        static {
            Covode.recordClassIndex(65259);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(65258);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.b.b$b  reason: collision with other inner class name */
    public static final class View$OnClickListenerC2547b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f101992a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f101993b;

        static {
            Covode.recordClassIndex(65260);
        }

        public View$OnClickListenerC2547b(b bVar, a aVar) {
            this.f101992a = bVar;
            this.f101993b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f101993b.a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.f9o);
        l.b(findViewById, "");
        this.f101990a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.bls);
        l.b(findViewById2, "");
        this.f101991b = (TuxIconView) findViewById2;
    }
}

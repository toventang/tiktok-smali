package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.e.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class i extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public View f70905a;

    static {
        Covode.recordClassIndex(43679);
    }

    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final a f70906a = new a();

        static {
            Covode.recordClassIndex(43680);
        }

        a() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            c g2 = c.g();
            g2.f70523b.clear();
            g2.b();
            g2.a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.ex0);
        l.b(findViewById, "");
        this.f70905a = findViewById;
    }
}

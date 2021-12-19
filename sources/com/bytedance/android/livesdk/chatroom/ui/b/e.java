package com.bytedance.android.livesdk.chatroom.ui.b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.model.av;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;

public final class e extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    final HSImageView f15933a;

    static {
        Covode.recordClassIndex(8814);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f15934a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ av f15935b;

        static {
            Covode.recordClassIndex(8815);
        }

        a(b bVar, av avVar) {
            this.f15934a = bVar;
            this.f15935b = avVar;
        }

        public final void onClick(View view) {
            this.f15934a.invoke(this.f15935b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.bnd);
        l.b(findViewById, "");
        this.f15933a = (HSImageView) findViewById;
    }
}

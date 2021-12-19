package com.bytedance.android.livesdk.hashtag;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;

public final class j extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    final HSImageView f18178a;

    /* renamed from: b  reason: collision with root package name */
    final LiveTextView f18179b;

    /* renamed from: c  reason: collision with root package name */
    final LiveTextView f18180c;

    /* renamed from: d  reason: collision with root package name */
    final View f18181d;

    /* renamed from: e  reason: collision with root package name */
    final View f18182e;

    static {
        Covode.recordClassIndex(10096);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Room f18183a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f18184b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f18185c;

        static {
            Covode.recordClassIndex(10097);
        }

        a(Room room, j jVar, b bVar) {
            this.f18183a = room;
            this.f18184b = jVar;
            this.f18185c = bVar;
        }

        public final void onClick(View view) {
            this.f18185c.invoke(this.f18183a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.ccc);
        l.b(findViewById, "");
        this.f18178a = (HSImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.b1h);
        l.b(findViewById2, "");
        this.f18179b = (LiveTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.n6);
        l.b(findViewById3, "");
        this.f18180c = (LiveTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.ckx);
        l.b(findViewById4, "");
        this.f18181d = findViewById4;
        View findViewById5 = view.findViewById(R.id.cko);
        l.b(findViewById5, "");
        this.f18182e = findViewById5;
    }
}

package com.bytedance.android.livesdk.hashtag;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends RecyclerView.ViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public static final a f18127b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final LiveLoadingView f18128a;

    static {
        Covode.recordClassIndex(10064);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(10065);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.chc);
        l.b(findViewById, "");
        this.f18128a = (LiveLoadingView) findViewById;
    }
}

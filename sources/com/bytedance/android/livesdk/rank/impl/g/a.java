package com.bytedance.android.livesdk.rank.impl.g;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import j.a.a.c;

public final class a extends c<com.bytedance.android.livesdk.rank.api.model.c, C0420a> {
    static {
        Covode.recordClassIndex(12261);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // j.a.a.c
    public final /* synthetic */ C0420a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C0420a(com.a.a(layoutInflater, R.layout.b__, viewGroup, false));
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.g.a$a  reason: collision with other inner class name */
    class C0420a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f20725a;

        static {
            Covode.recordClassIndex(12262);
        }

        C0420a(View view) {
            super(view);
            this.f20725a = (TextView) view.findViewById(R.id.f3k);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // j.a.a.c
    public final /* synthetic */ void a(C0420a aVar, com.bytedance.android.livesdk.rank.api.model.c cVar) {
        aVar.f20725a.setText(cVar.f20598a);
    }
}

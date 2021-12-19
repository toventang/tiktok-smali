package com.ss.android.ugc.gamora.recorder.quickupload;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class p extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    SmartImageView f148275a;

    /* renamed from: b  reason: collision with root package name */
    View f148276b;

    /* renamed from: c  reason: collision with root package name */
    TuxTextView f148277c;

    /* renamed from: d  reason: collision with root package name */
    final Context f148278d;

    /* renamed from: e  reason: collision with root package name */
    public final ViewGroup f148279e;

    /* renamed from: f  reason: collision with root package name */
    public final b<MediaModel, z> f148280f;

    static {
        Covode.recordClassIndex(97724);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f148281a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MediaModel f148282b;

        static {
            Covode.recordClassIndex(97725);
        }

        a(p pVar, MediaModel mediaModel) {
            this.f148281a = pVar;
            this.f148282b = mediaModel;
        }

        public final void onClick(View view) {
            b<MediaModel, z> bVar;
            ClickAgent.onClick(view);
            ViewGroup viewGroup = this.f148281a.f148279e;
            Objects.requireNonNull(viewGroup, "null cannot be cast to non-null type android.view.View");
            if (!com.ss.android.ugc.aweme.l.a.a.a(viewGroup, 1500) && (bVar = this.f148281a.f148280f) != null) {
                bVar.invoke(this.f148282b);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.mediachoose.helper.MediaModel, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(Context context, ViewGroup viewGroup, b<? super MediaModel, z> bVar) {
        super(com.a.a(LayoutInflater.from(context), R.layout.f1, viewGroup, false));
        l.d(viewGroup, "");
        this.f148278d = context;
        this.f148279e = viewGroup;
        this.f148280f = bVar;
        View findViewById = this.itemView.findViewById(R.id.byz);
        l.b(findViewById, "");
        this.f148275a = (SmartImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.fj4);
        l.b(findViewById2, "");
        this.f148276b = findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.eyv);
        l.b(findViewById3, "");
        this.f148277c = (TuxTextView) findViewById3;
    }
}

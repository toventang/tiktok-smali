package com.bytedance.android.live.publicscreen.impl.game;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.publicscreen.a.d.h;
import com.bytedance.android.live.publicscreen.impl.model.chat.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import h.f.b.l;
import java.util.List;

public final class e extends RecyclerView.a<a<? extends h>> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f12385b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Context f12386a;

    /* renamed from: c  reason: collision with root package name */
    private final List<h> f12387c;

    static {
        Covode.recordClassIndex(6805);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a<? extends h> onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(6806);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f12387c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        h hVar = this.f12387c.get(i2);
        if (hVar instanceof b) {
            return 0;
        }
        if (hVar instanceof com.bytedance.android.live.publicscreen.impl.model.e) {
            return 1;
        }
        return 3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.bytedance.android.live.publicscreen.a.d.h> */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Context context, List<? extends h> list) {
        l.d(context, "");
        l.d(list, "");
        this.f12386a = context;
        this.f12387c = list;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a<? extends h> aVar, int i2) {
        ImageModel imageModel;
        a<? extends h> aVar2 = aVar;
        l.d(aVar2, "");
        h hVar = this.f12387c.get(i2);
        if (hVar instanceof b) {
            b bVar = (b) aVar2;
            b bVar2 = (b) hVar;
            l.d(bVar2, "");
            bVar.f12382b.setText(bVar2.v());
            HSImageView hSImageView = bVar.f12383c;
            User b2 = bVar2.b();
            if (b2 != null) {
                imageModel = b2.getAvatarThumb();
            } else {
                imageModel = null;
            }
            k.a(hSImageView, imageModel);
            TextView textView = bVar.f12381a;
            CharSequence z = bVar2.z();
            l.d(textView, "");
            if (z != null) {
                textView.setVisibility(0);
                textView.setText(z);
                return;
            }
            textView.setVisibility(8);
        } else if (hVar instanceof com.bytedance.android.live.publicscreen.impl.model.e) {
            com.bytedance.android.live.publicscreen.impl.model.e eVar = (com.bytedance.android.live.publicscreen.impl.model.e) hVar;
            l.d(eVar, "");
            f.a(((d) aVar2).f12384a, eVar);
        } else {
            l.d(hVar, "");
        }
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        MethodCollector.i(5907);
        l.d(viewGroup, "");
        boolean z = true;
        if (i2 == 0) {
            viewHolder = new b(viewGroup);
        } else if (i2 != 1) {
            viewHolder = new c(viewGroup);
        } else {
            viewHolder = new d(viewGroup);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    z = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = viewHolder.getClass().getName();
        MethodCollector.o(5907);
        return viewHolder;
    }
}

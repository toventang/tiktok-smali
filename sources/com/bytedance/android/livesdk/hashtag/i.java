package com.bytedance.android.livesdk.hashtag;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.g;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.hashtag.j;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class i extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public int f18172a = 2;

    /* renamed from: b  reason: collision with root package name */
    public b<? super Room, z> f18173b;

    /* renamed from: c  reason: collision with root package name */
    public final DataChannel f18174c;

    /* renamed from: d  reason: collision with root package name */
    private List<FeedItem> f18175d = new ArrayList();

    static {
        Covode.recordClassIndex(10094);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f18175d.size() + 1;
    }

    public i(DataChannel dataChannel) {
        this.f18174c = dataChannel;
    }

    public final void a(List<? extends FeedItem> list) {
        l.d(list, "");
        this.f18175d.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        if (i2 + 1 == getItemCount()) {
            return 1;
        }
        return 0;
    }

    public static final class a extends GridLayoutManager.c {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RecyclerView.i f18176e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f18177f;

        static {
            Covode.recordClassIndex(10095);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int a(int i2) {
            if (this.f18177f.getItemViewType(i2) == 1) {
                return ((GridLayoutManager) this.f18176e).f3760b;
            }
            return 1;
        }

        a(RecyclerView.i iVar, i iVar2) {
            this.f18176e = iVar;
            this.f18177f = iVar2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).a(new a(layoutManager, this));
        }
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(1540);
        l.d(viewGroup, "");
        if (i2 == 0) {
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b6y, viewGroup, false);
            l.b(a3, "");
            viewHolder = new j(a3);
        } else {
            View a4 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b_2, viewGroup, false);
            l.b(a4, "");
            viewHolder = new c(a4);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
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
        MethodCollector.o(1540);
        return viewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        boolean z;
        long userCount;
        List<String> urls;
        l.d(viewHolder, "");
        if (viewHolder instanceof j) {
            j jVar = (j) viewHolder;
            Room room = this.f18175d.get(i2).getRoom();
            b<? super Room, z> bVar = this.f18173b;
            if (bVar == null) {
                l.a("onClickListener");
            }
            l.d(bVar, "");
            if (room != null) {
                ImageModel cover = room.getCover();
                if (cover == null) {
                    z = true;
                } else {
                    z = false;
                }
                String str = null;
                if (z || cover == null || (urls = cover.getUrls()) == null || urls.isEmpty()) {
                    jVar.f18178a.setActualImageResource(2131234370);
                    jVar.f18181d.setVisibility(8);
                    jVar.f18182e.setVisibility(8);
                } else {
                    p.b(jVar.f18178a, cover, 2131234370, 0);
                }
                String title = room.getTitle();
                if (title != null) {
                    jVar.f18179b.setText(g.a("%s", title));
                }
                LiveTextView liveTextView = jVar.f18180c;
                if (room.getStatus() == 4) {
                    userCount = 0;
                } else {
                    userCount = (long) room.getUserCount();
                }
                liveTextView.setText(com.bytedance.android.live.core.f.b.b(userCount));
                jVar.itemView.setOnClickListener(new j.a(room, jVar, bVar));
                l.d(room, "");
                com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_live_show").a().f("click").a("enter_from_merge", "live_detail").a("enter_method", "hashtag");
                Hashtag hashtag = room.hashtag;
                if (hashtag != null) {
                    str = hashtag.title;
                }
                a2.a("hash_type", str).a("is_return", "0").b();
            }
        } else if (viewHolder instanceof c) {
            c cVar = (c) viewHolder;
            int i3 = this.f18172a;
            if (i3 == 1) {
                cVar.f18128a.setVisibility(0);
            } else if (i3 == 2) {
                cVar.f18128a.setVisibility(4);
            } else if (i3 == 3) {
                cVar.f18128a.setVisibility(8);
            }
        }
    }
}

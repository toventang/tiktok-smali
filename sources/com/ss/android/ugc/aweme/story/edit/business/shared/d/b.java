package com.ss.android.ugc.aweme.story.edit.business.shared.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.df.l;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.services.story.StoryCoverExtractConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.story.edit.business.shared.d.a;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class b extends RecyclerView.a<a> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f137319f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    boolean f137320a;

    /* renamed from: b  reason: collision with root package name */
    public int f137321b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f137322c;

    /* renamed from: d  reason: collision with root package name */
    public final List<StoryEditClipModel> f137323d;

    /* renamed from: e  reason: collision with root package name */
    public final m<StoryEditClipModel, Integer, z> f137324e;

    static {
        Covode.recordClassIndex(89813);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89814);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f137323d.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.d.b$b  reason: collision with other inner class name */
    public static final class C3601b extends h.f.b.m implements h.f.a.b<Integer, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89815);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3601b(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int intValue = num.intValue();
            if (!l.a(this.this$0.f137322c, 600) && intValue >= 0 && intValue < this.this$0.f137323d.size() && intValue != this.this$0.f137321b) {
                b bVar = this.this$0;
                bVar.notifyItemChanged(bVar.f137321b, false);
                this.this$0.f137321b = intValue;
                this.this$0.notifyItemChanged(intValue, true);
                this.this$0.f137324e.invoke(this.this$0.f137323d.get(intValue), Integer.valueOf(intValue));
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(a aVar, int i2) {
        boolean z;
        h.f.b.l.d(aVar, "");
        StoryEditClipModel storyEditClipModel = this.f137323d.get(i2);
        boolean z2 = true;
        int i3 = 0;
        if (i2 == this.f137321b) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = this.f137320a;
        h.f.b.l.d(storyEditClipModel, "");
        if (z3) {
            EditPreviewInfo previewMediaInfo = storyEditClipModel.getPreviewMediaInfo();
            if (storyEditClipModel.getSourceContentType() != 2) {
                z2 = false;
            }
            int i4 = a.f137311b;
            int i5 = a.f137312c;
            VideoCutInfo videoCutInfo = storyEditClipModel.getPreviewMediaInfo().getVideoList().get(0).getVideoCutInfo();
            if (videoCutInfo != null) {
                i3 = (int) videoCutInfo.getStart();
            }
            com.ss.android.ugc.aweme.story.edit.model.a.a(previewMediaInfo, z2, new StoryCoverExtractConfig(i4, i5, i3), new a.b(aVar));
        }
        aVar.a(z);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i2, List list) {
        a aVar2 = aVar;
        h.f.b.l.d(aVar2, "");
        h.f.b.l.d(list, "");
        if (list.isEmpty()) {
            onBindViewHolder(aVar2, i2);
            return;
        }
        Object obj = list.get(0);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
        aVar2.a(((Boolean) obj).booleanValue());
    }

    private static RecyclerView.ViewHolder a(b bVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(2255);
        h.f.b.l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b23, viewGroup, false);
        h.f.b.l.b(a3, "");
        a aVar = new a(a3, new C3601b(bVar));
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = aVar.getClass().getName();
        MethodCollector.o(2255);
        return aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: h.f.a.m<? super com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel, ? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(RecyclerView recyclerView, List<StoryEditClipModel> list, StoryEditClipModel storyEditClipModel, m<? super StoryEditClipModel, ? super Integer, z> mVar) {
        h.f.b.l.d(recyclerView, "");
        h.f.b.l.d(list, "");
        h.f.b.l.d(mVar, "");
        this.f137322c = recyclerView;
        this.f137323d = list;
        this.f137324e = mVar;
        recyclerView.setItemViewCacheSize(10);
        int i2 = 0;
        if (storyEditClipModel != null) {
            Iterator<StoryEditClipModel> it = list.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                } else if (h.f.b.l.a((Object) it.next().getClipId(), (Object) storyEditClipModel.getClipId())) {
                    break;
                } else {
                    i3++;
                }
            }
            i2 = Math.max(0, i3);
        }
        this.f137321b = i2;
    }
}

package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a;

import android.graphics.Bitmap;
import android.os.Message;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.ac;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.model.f;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.z;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.a;
import com.ss.android.ugc.aweme.utils.gg;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;

public final class a extends z {

    /* renamed from: i  reason: collision with root package name */
    public final HashMap<String, Bitmap> f127849i = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    public final HashMap<String, ImageView> f127850j = new HashMap<>();

    /* renamed from: k  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.a f127851k = new com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.a();

    static {
        Covode.recordClassIndex(83805);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.shortvideo.cut.z
    public final int getItemViewType(int i2) {
        return 10002;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.shortvideo.cut.z
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.shortvideo.cut.z
    public final int getItemCount() {
        if (this.f126299a == null) {
            return 0;
        }
        return this.f126299a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.shortvideo.cut.z
    public final long getItemId(int i2) {
        return (long) ((ac) this.f126299a.get(i2)).f125449a;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.l, com.ss.android.ugc.aweme.shortvideo.cut.z
    public final void a(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        if (viewHolder instanceof C3331a) {
            ((z.c) viewHolder).a();
            this.f126304f.a(new f(0, viewHolder.getAdapterPosition(), -1));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.z
    public final void b(VideoSegment videoSegment) {
        if (videoSegment != null) {
            List list = this.f126299a;
            l.b(list, "");
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                } else if (l.a((Object) ((ac) this.f126299a.get(i2)).f125450b.a(false), (Object) videoSegment.a(false))) {
                    this.f126299a.remove(i2);
                    break;
                } else {
                    i2++;
                }
            }
            notifyDataSetChanged();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a$a  reason: collision with other inner class name */
    public final class C3331a extends z.c {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f127852d;

        static {
            Covode.recordClassIndex(83806);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3331a(a aVar, ViewGroup viewGroup) {
            super(viewGroup);
            l.d(viewGroup, "");
            this.f127852d = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a$a$a  reason: collision with other inner class name */
        static final class C3332a implements a.AbstractC3334a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3331a f127853a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f127854b;

            static {
                Covode.recordClassIndex(83807);
            }

            C3332a(C3331a aVar, String str) {
                this.f127853a = aVar;
                this.f127854b = str;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.a.AbstractC3334a
            public final void a(String str, Bitmap bitmap) {
                if (bitmap != null && this.f127853a.f127852d.f127850j.get(this.f127854b) != null) {
                    ImageView imageView = this.f127853a.f127852d.f127850j.get(str);
                    if (imageView == null) {
                        l.b();
                    }
                    imageView.setImageBitmap(bitmap);
                    this.f127853a.f127852d.f127849i.put(this.f127854b, bitmap);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.z.c
        public final void a(z.c cVar, String str) {
            l.d(cVar, "");
            l.d(str, "");
            SimpleDraweeView simpleDraweeView = cVar.f126308a;
            l.b(simpleDraweeView, "");
            simpleDraweeView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            HashMap<String, ImageView> hashMap = this.f127852d.f127850j;
            SimpleDraweeView simpleDraweeView2 = cVar.f126308a;
            l.b(simpleDraweeView2, "");
            hashMap.put(str, simpleDraweeView2);
            if (this.f127852d.f127849i.get(str) == null) {
                com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.a aVar = this.f127852d.f127851k;
                C3332a aVar2 = new C3332a(this, str);
                if (!TextUtils.isEmpty(str)) {
                    aVar.f127874c = aVar2;
                    Message message = new Message();
                    message.what = 1;
                    message.obj = str;
                    aVar.f127873b.sendMessage(message);
                    return;
                }
                return;
            }
            cVar.f126308a.setImageBitmap(this.f127852d.f127849i.get(str.toString()));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.l, com.ss.android.ugc.aweme.shortvideo.cut.z
    public final void a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        l.d(viewHolder, "");
        l.d(viewHolder2, "");
        int adapterPosition = viewHolder.getAdapterPosition();
        int adapterPosition2 = viewHolder2.getAdapterPosition();
        if (adapterPosition < this.f126299a.size() && adapterPosition2 < this.f126299a.size()) {
            this.f126299a.add(adapterPosition2, this.f126299a.remove(adapterPosition));
            notifyItemMoved(adapterPosition, adapterPosition2);
            this.f126304f.a(new f(1, adapterPosition, adapterPosition2));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.l, com.ss.android.ugc.aweme.shortvideo.cut.z
    public final void a(RecyclerView.ViewHolder viewHolder, boolean z) {
        l.d(viewHolder, "");
        if (viewHolder instanceof C3331a) {
            ((z.c) viewHolder).b();
            f fVar = new f(2, -1, viewHolder.getAdapterPosition());
            fVar.f125507a = z;
            this.f126304f.a(fVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends VideoSegment> list) {
        super(videoEditViewModel, cutMultiVideoViewModel, list);
        l.d(videoEditViewModel, "");
        l.d(cutMultiVideoViewModel, "");
        l.d(list, "");
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(3903);
        l.d(viewGroup, "");
        C3331a aVar2 = new C3331a(aVar, viewGroup);
        try {
            if (aVar2.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar2.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = aVar2.getClass().getName();
        MethodCollector.o(3903);
        return aVar2;
    }
}

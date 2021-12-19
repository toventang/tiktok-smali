package com.ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.y;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.jedi.ext.adapter.j;
import com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.comment.model.GifEmoji;
import com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiState;
import com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiViewModel;
import com.ss.android.ugc.aweme.emoji.utils.h;
import com.ss.android.ugc.aweme.emoji.utils.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class SearchGifViewHolder extends JediBaseViewHolder<SearchGifViewHolder, GifEmoji> implements i, i {

    /* renamed from: l  reason: collision with root package name */
    public static final b f71312l = new b((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    final RemoteImageView f71313g;

    /* renamed from: j  reason: collision with root package name */
    public boolean f71314j;

    /* renamed from: k  reason: collision with root package name */
    public final ae f71315k;

    static {
        Covode.recordClassIndex(43907);
    }

    @Override // com.ss.android.ugc.aweme.emoji.utils.i
    public final void a() {
    }

    @Override // com.ss.android.ugc.aweme.emoji.utils.i
    public final void b() {
        this.f71314j = true;
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(43909);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void e() {
        super.e();
        c cVar = new c(this);
        JediViewHolderProxy jediViewHolderProxy = this.f39565d;
        if (jediViewHolderProxy != null) {
            JediViewModel jediViewModel = (JediViewModel) j.a.a(d(), jediViewHolderProxy.b()).a(getClass().getName() + '_' + GifEmojiViewModel.class.getName(), GifEmojiViewModel.class);
            y a2 = jediViewModel.f39365j.a(GifEmojiViewModel.class);
            if (a2 != null) {
                a2.binding(jediViewModel);
            }
            jediViewModel.a_(cVar);
            f.a.b.b unused = subscribe((GifEmojiViewModel) jediViewModel, new ah(), d.f71317a);
            return;
        }
        throw new IllegalStateException("proxy not bound to viewHolder yet");
    }

    public final com.ss.android.ugc.aweme.emoji.g.a m() {
        int i2;
        com.ss.android.ugc.aweme.emoji.g.a aVar = new com.ss.android.ugc.aweme.emoji.g.a();
        UrlModel origin = ((GifEmoji) aI_()).getOrigin();
        if (origin == null) {
            origin = new UrlModel();
        }
        aVar.setAnimateUrl(origin);
        UrlModel thumbnail = ((GifEmoji) aI_()).getThumbnail();
        if (thumbnail == null) {
            thumbnail = new UrlModel();
        }
        aVar.setStaticUrl(thumbnail);
        aVar.setId(((GifEmoji) aI_()).getImageId());
        UrlModel origin2 = ((GifEmoji) aI_()).getOrigin();
        int i3 = 0;
        if (origin2 != null) {
            i2 = origin2.getWidth();
        } else {
            i2 = 0;
        }
        aVar.setWidth(i2);
        UrlModel origin3 = ((GifEmoji) aI_()).getOrigin();
        if (origin3 != null) {
            i3 = origin3.getHeight();
        }
        aVar.setHeight(i3);
        aVar.setStickerType(((GifEmoji) aI_()).getStickerType());
        aVar.setAnimateType("gif");
        View view = this.itemView;
        l.b(view, "");
        aVar.setDisplayName(view.getContext().getString(R.string.bmo));
        aVar.setLogPb(((GifEmoji) aI_()).getLogPb());
        return aVar;
    }

    static final class c extends h.f.b.m implements h.f.a.b<GifEmojiState, GifEmojiState> {
        final /* synthetic */ SearchGifViewHolder this$0;

        static {
            Covode.recordClassIndex(43910);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SearchGifViewHolder searchGifViewHolder) {
            super(1);
            this.this$0 = searchGifViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ GifEmojiState invoke(GifEmojiState gifEmojiState) {
            GifEmojiState gifEmojiState2 = gifEmojiState;
            l.d(gifEmojiState2, "");
            return gifEmojiState2.copy((GifEmoji) this.this$0.aI_());
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchGifViewHolder f71316a;

        static {
            Covode.recordClassIndex(43908);
        }

        a(SearchGifViewHolder searchGifViewHolder) {
            this.f71316a = searchGifViewHolder;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f71316a.f71314j) {
                ae aeVar = this.f71316a.f71315k;
                l.b(view, "");
                aeVar.a(this.f71316a.m(), this.f71316a.getAdapterPosition());
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SearchGifViewHolder(android.view.ViewGroup r5, com.ss.android.ugc.aweme.comment.adapter.ae r6) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            h.f.b.l.d(r5, r3)
            h.f.b.l.d(r6, r3)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131558749(0x7f0d015d, float:1.8742823E38)
            r0 = 0
            android.view.View r0 = com.a.a(r2, r1, r5, r0)
            h.f.b.l.b(r0, r3)
            r4.<init>(r0)
            r4.f71315k = r6
            android.view.View r1 = r4.itemView
            h.f.b.l.b(r1, r3)
            r0 = 2131365008(0x7f0a0c90, float:1.834987E38)
            android.view.View r1 = r1.findViewById(r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1
            r0 = 1
            r1.setDrawingCacheEnabled(r0)
            com.ss.android.ugc.aweme.comment.adapter.SearchGifViewHolder$a r0 = new com.ss.android.ugc.aweme.comment.adapter.SearchGifViewHolder$a
            r0.<init>(r4)
            r1.setOnClickListener(r0)
            h.f.b.l.b(r1, r3)
            r4.f71313g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.adapter.SearchGifViewHolder.<init>(android.view.ViewGroup, com.ss.android.ugc.aweme.comment.adapter.ae):void");
    }

    static final class d extends h.f.b.m implements h.f.a.m<SearchGifViewHolder, GifEmojiState, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f71317a = new d();

        static {
            Covode.recordClassIndex(43911);
        }

        d() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(SearchGifViewHolder searchGifViewHolder, GifEmojiState gifEmojiState) {
            int[] iArr;
            SearchGifViewHolder searchGifViewHolder2 = searchGifViewHolder;
            GifEmojiState gifEmojiState2 = gifEmojiState;
            l.d(searchGifViewHolder2, "");
            l.d(gifEmojiState2, "");
            GifEmoji gifEmoji = gifEmojiState2.getGifEmoji();
            searchGifViewHolder2.f71314j = false;
            UrlModel thumbnail = gifEmoji.getThumbnail();
            if (thumbnail != null) {
                l.d(thumbnail, "");
                int b2 = (int) n.b(com.bytedance.ies.ugc.appcontext.d.a(), 60.0f);
                if (thumbnail.getWidth() == 0 || thumbnail.getHeight() == 0) {
                    iArr = new int[]{b2, b2};
                } else {
                    iArr = new int[]{Math.min(h.g.a.a((((float) thumbnail.getWidth()) / ((float) thumbnail.getHeight())) * ((float) b2)), (int) n.b(com.bytedance.ies.ugc.appcontext.d.a(), 107.0f)), b2};
                }
                RemoteImageView remoteImageView = searchGifViewHolder2.f71313g;
                ViewGroup.LayoutParams layoutParams = searchGifViewHolder2.f71313g.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = iArr[0];
                    layoutParams.height = iArr[1];
                } else {
                    layoutParams = new ViewGroup.LayoutParams(iArr[0], iArr[1]);
                }
                remoteImageView.setLayoutParams(layoutParams);
                h.a(searchGifViewHolder2.f71313g, thumbnail, searchGifViewHolder2);
            }
            searchGifViewHolder2.f71315k.b(searchGifViewHolder2.m(), searchGifViewHolder2.getAdapterPosition());
            return z.f158842a;
        }
    }
}

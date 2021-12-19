package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxRadio;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.c;
import com.ss.android.ugc.aweme.im.sdk.common.controller.a.f;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.em;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class a extends RecyclerView.a<c> {

    /* renamed from: d  reason: collision with root package name */
    public static final C2494a f100811d = new C2494a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    List<? extends Aweme> f100812a = z.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    int f100813b = -1;

    /* renamed from: c  reason: collision with root package name */
    public final FavoriteVideoPickerViewModel f100814c;

    static {
        Covode.recordClassIndex(64495);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ c onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.a$a  reason: collision with other inner class name */
    public static final class C2494a {
        static {
            Covode.recordClassIndex(64496);
        }

        private C2494a() {
        }

        public /* synthetic */ C2494a(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f100812a.size();
    }

    public static final class b implements c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f100815a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f100816b;

        static {
            Covode.recordClassIndex(64497);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.c.b
        public final void a() {
            FavoriteVideoPickerViewModel favoriteVideoPickerViewModel = this.f100815a.f100814c;
            Aweme aweme = this.f100816b;
            l.d(aweme, "");
            if (aweme.canShare()) {
                favoriteVideoPickerViewModel.f100801f.setValue(new com.ss.android.ugc.aweme.im.sdk.common.data.a.c<>(aweme));
            } else {
                favoriteVideoPickerViewModel.f100802g.setValue(new com.ss.android.ugc.aweme.im.sdk.common.data.a.c<>(aweme));
            }
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.c.b
        public final void a(boolean z) {
            if (z) {
                this.f100815a.f100814c.a(this.f100816b);
            } else {
                this.f100815a.f100814c.a(null);
            }
        }

        b(a aVar, Aweme aweme) {
            this.f100815a = aVar;
            this.f100816b = aweme;
        }
    }

    public a(FavoriteVideoPickerViewModel favoriteVideoPickerViewModel) {
        l.d(favoriteVideoPickerViewModel, "");
        this.f100814c = favoriteVideoPickerViewModel;
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(5521);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a80, viewGroup, false);
        l.b(a3, "");
        c cVar = new c(a3);
        try {
            if (cVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(cVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) cVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(cVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = cVar.getClass().getName();
        MethodCollector.o(5521);
        return cVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(c cVar, int i2) {
        boolean z;
        UrlModel cover;
        c cVar2 = cVar;
        l.d(cVar2, "");
        Aweme aweme = (Aweme) this.f100812a.get(i2);
        if (i2 == this.f100813b) {
            z = true;
        } else {
            z = false;
        }
        b bVar = new b(this, aweme);
        l.d(aweme, "");
        l.d(bVar, "");
        cVar2.f100848a = bVar;
        View findViewById = cVar2.itemView.findViewById(R.id.agf);
        l.b(findViewById, "");
        cVar2.f100849b = (SmartImageView) findViewById;
        Video video = aweme.getVideo();
        if (video == null || (cover = video.getCover()) == null) {
            SmartImageView smartImageView = cVar2.f100849b;
            if (smartImageView == null) {
                l.a("coverView");
            }
            smartImageView.setImageDrawable(null);
        } else {
            v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(cover));
            int[] a3 = em.a(200);
            if (a3 != null) {
                a2.b(a3);
            }
            SmartImageView smartImageView2 = cVar2.f100849b;
            if (smartImageView2 == null) {
                l.a("coverView");
            }
            a2.E = smartImageView2;
            a2.a("VideoViewHolder - Cover").c();
        }
        SmartImageView smartImageView3 = cVar2.f100849b;
        if (smartImageView3 == null) {
            l.a("coverView");
        }
        smartImageView3.setOnClickListener(new c.View$OnClickListenerC2497c(cVar2));
        cVar2.a(z);
        if (!aweme.canShare() || f.a() != 2) {
            TuxRadio tuxRadio = cVar2.f100850c;
            if (tuxRadio == null) {
                l.a("radioButton");
            }
            tuxRadio.setVisibility(8);
        } else {
            TuxRadio tuxRadio2 = cVar2.f100850c;
            if (tuxRadio2 == null) {
                l.a("radioButton");
            }
            tuxRadio2.setVisibility(0);
        }
        TuxTextView tuxTextView = (TuxTextView) cVar2.itemView.findViewById(R.id.fdm);
        User author = aweme.getAuthor();
        l.b(author, "");
        v a4 = r.a(com.ss.android.ugc.aweme.base.v.a(author.getAvatarThumb()));
        a4.E = (SmartAvatarImageView) cVar2.itemView.findViewById(R.id.fcu);
        a4.a("VideoViewHolder - Avatar").c();
        l.b(tuxTextView, "");
        User author2 = aweme.getAuthor();
        l.b(author2, "");
        tuxTextView.setText(author2.getUniqueId());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(c cVar, int i2, List list) {
        c cVar2 = cVar;
        l.d(cVar2, "");
        l.d(list, "");
        if (list.isEmpty()) {
            super.onBindViewHolder(cVar2, i2, list);
            return;
        }
        Object obj = list.get(0);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
        cVar2.a(((Boolean) obj).booleanValue());
    }
}

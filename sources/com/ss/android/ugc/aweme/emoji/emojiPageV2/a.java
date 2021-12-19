package com.ss.android.ugc.aweme.emoji.emojiPageV2;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.emoji.emojichoose.p;
import com.ss.android.ugc.aweme.emoji.sysemoji.i;
import com.ss.android.ugc.aweme.emoji.utils.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.File;
import java.util.Objects;

public abstract class a<T> extends f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f89127a = 7;

    /* renamed from: b  reason: collision with root package name */
    public final int f89128b = 4;

    /* renamed from: c  reason: collision with root package name */
    public final int f89129c = 3;

    /* renamed from: d  reason: collision with root package name */
    public final Context f89130d;

    /* renamed from: e  reason: collision with root package name */
    public p f89131e;

    /* renamed from: f  reason: collision with root package name */
    public AbstractC2155a f89132f;

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.a$a  reason: collision with other inner class name */
    public interface AbstractC2155a {
        static {
            Covode.recordClassIndex(56057);
        }
    }

    static {
        Covode.recordClassIndex(56056);
    }

    public abstract void a(RecyclerView recyclerView);

    public abstract void a(a<T>.b bVar, int i2);

    public abstract int m();

    @Override // com.ss.android.ugc.aweme.common.a.l, androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public int getItemCount() {
        if (this.v) {
            return c() + 1;
        }
        return c();
    }

    public final p l() {
        p pVar = this.f89131e;
        if (pVar == null) {
            l.a("inputViewBridge");
        }
        return pVar;
    }

    public a(m mVar) {
        l.d(mVar, "");
        this.f89130d = (Context) mVar;
        this.v = false;
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f89136a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f89137b;

        static {
            Covode.recordClassIndex(56059);
        }

        c(a aVar, int i2) {
            this.f89136a = aVar;
            this.f89137b = i2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            T t = this.f89136a.e().get(this.f89137b);
            Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.base.BaseEmoji");
            T t2 = t;
            if (t2.f89103a == 2131231984) {
                this.f89136a.l().b();
            } else if (t2.f89103a == 2131231993) {
                this.f89136a.l().c();
            } else if (t2.f89103a == R.drawable.a7k) {
                this.f89136a.l().a();
            } else {
                String str = "";
                if (t2.a()) {
                    if (t2.f89106d instanceof i) {
                        p l2 = this.f89136a.l();
                        com.ss.android.ugc.aweme.emoji.g.a aVar = t2.f89106d;
                        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel");
                        String previewEmoji = ((i) aVar).getPreviewEmoji();
                        if (previewEmoji != null) {
                            str = previewEmoji;
                        }
                        l2.a(str);
                        return;
                    }
                    View findViewById = view.findViewById(R.id.av9);
                    p l3 = this.f89136a.l();
                    l.b(findViewById, str);
                    l3.a(findViewById, t2, 1);
                    if (this.f89136a.f89132f != null) {
                    }
                } else if (!TextUtils.isEmpty(t2.f89105c)) {
                    p l4 = this.f89136a.l();
                    String str2 = t2.f89105c;
                    l.b(str2, str);
                    l4.a(str2);
                }
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final RemoteImageView f89133a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f89134b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f89135c;

        static {
            Covode.recordClassIndex(56058);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar, View view) {
            super(view);
            l.d(view, "");
            this.f89135c = aVar;
            this.f89133a = (RemoteImageView) view.findViewById(R.id.av9);
            this.f89134b = (TextView) view.findViewById(R.id.title_tv);
        }
    }

    public static void b(RemoteImageView remoteImageView, com.ss.android.ugc.aweme.emoji.b.a aVar) {
        l.d(remoteImageView, "");
        l.d(aVar, "");
        File file = new File(com.ss.android.ugc.aweme.emoji.utils.c.a(), com.ss.android.ugc.aweme.emoji.utils.c.c(aVar.f89106d));
        if (file.exists()) {
            com.ss.android.ugc.aweme.emoji.g.a aVar2 = aVar.f89106d;
            l.b(aVar2, "");
            boolean d2 = com.ss.android.ugc.aweme.emoji.d.a.a.d(aVar2);
            String absolutePath = file.getAbsolutePath();
            l.b(absolutePath, "");
            a(remoteImageView, absolutePath, d2);
            return;
        }
        a(remoteImageView, aVar);
    }

    public static void a(RemoteImageView remoteImageView, com.ss.android.ugc.aweme.emoji.b.a aVar) {
        l.d(remoteImageView, "");
        l.d(aVar, "");
        com.ss.android.ugc.aweme.emoji.g.a aVar2 = aVar.f89106d;
        l.b(aVar2, "");
        if (com.ss.android.ugc.aweme.emoji.d.a.a.d(aVar2)) {
            h.a(remoteImageView, aVar2.getStaticUrl(), null);
        } else {
            e.a(remoteImageView, aVar2.getStaticUrl());
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        View a2 = com.a.a(LayoutInflater.from(this.f89130d), m(), viewGroup, false);
        l.b(a2, "");
        return new b(this, a2);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        View view;
        a((a<T>.b) ((b) viewHolder), i2);
        if (viewHolder != null && (view = viewHolder.itemView) != null) {
            view.setOnClickListener(new c(this, i2));
        }
    }

    public static void a(RemoteImageView remoteImageView, String str, boolean z) {
        l.d(remoteImageView, "");
        l.d(str, "");
        String concat = "file://".concat(String.valueOf(str));
        if (z) {
            h.a(remoteImageView, concat);
        } else {
            e.b(remoteImageView, concat, -1, -1);
        }
    }

    public static void a(RemoteImageView remoteImageView, Context context, int i2) {
        l.d(remoteImageView, "");
        l.d(context, "");
        e.b(remoteImageView, "res://" + context.getPackageName() + "/" + i2, -1, -1);
    }

    public final int a(int i2, int i3, int i4) {
        double a2 = (double) n.a(this.f89130d);
        double d2 = (double) i3;
        Double.isNaN(d2);
        Double.isNaN(a2);
        double d3 = (double) i4;
        Double.isNaN(d3);
        double d4 = ((a2 - (d2 * 2.0d)) * 1.0d) / d3;
        double d5 = (double) i2;
        Double.isNaN(d5);
        return (int) (d4 - d5);
    }
}

package com.ss.android.ugc.aweme.music.b;

import android.content.Context;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.f.c;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class e extends f<MusicOwnerInfo> {

    /* renamed from: a  reason: collision with root package name */
    public a f111326a;

    public interface a {
        static {
            Covode.recordClassIndex(71539);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(71538);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.alg, viewGroup, false);
        l.b(a2, "");
        return new b(this, a2);
    }

    public final class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final AvatarImageView f111327a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f111328b;

        /* renamed from: c  reason: collision with root package name */
        public final TextView f111329c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f111330d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f111331e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f111332f;

        static {
            Covode.recordClassIndex(71540);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e eVar, final View view) {
            super(view);
            l.d(view, "");
            this.f111332f = eVar;
            View findViewById = view.findViewById(R.id.cqr);
            l.b(findViewById, "");
            this.f111327a = (AvatarImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.cqw);
            l.b(findViewById2, "");
            TextView textView = (TextView) findViewById2;
            this.f111328b = textView;
            TextPaint paint = textView.getPaint();
            l.b(paint, "");
            paint.setFakeBoldText(true);
            View findViewById3 = view.findViewById(R.id.cqx);
            l.b(findViewById3, "");
            this.f111329c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.cqs);
            l.b(findViewById4, "");
            this.f111330d = (ImageView) findViewById4;
            View findViewById5 = view.findViewById(R.id.crj);
            l.b(findViewById5, "");
            this.f111331e = (ImageView) findViewById5;
            c.a(view, 0.5f);
            view.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.music.b.e.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f111333a;

                static {
                    Covode.recordClassIndex(71541);
                }

                {
                    this.f111333a = r1;
                }

                public final void onClick(View view) {
                    a aVar;
                    ClickAgent.onClick(view);
                    if (this.f111333a.f111332f.f111326a != null && !com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && (aVar = this.f111333a.f111332f.f111326a) != null) {
                        aVar.a(this.f111333a.getLayoutPosition());
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        if (viewHolder instanceof b) {
            b bVar = (b) viewHolder;
            List e2 = e();
            l.b(e2, "");
            l.d(e2, "");
            MusicOwnerInfo musicOwnerInfo = (MusicOwnerInfo) e2.get(i2);
            bVar.f111327a.a(musicOwnerInfo.getAvatar());
            com.ss.android.ugc.aweme.base.e.a(bVar.f111327a, musicOwnerInfo.getAvatar(), bVar.f111327a.getControllerListener());
            if (MainServiceImpl.createIMainServicebyMonsterPlugin(false).shouldChangeToHandle("Sound")) {
                bVar.f111328b.setText(musicOwnerInfo.getNickName());
                bVar.f111329c.setText(musicOwnerInfo.getHandle());
                bVar.f111331e.setVisibility(8);
                bVar.f111330d.setVisibility(8);
                if (musicOwnerInfo.getVerified()) {
                    bVar.f111331e.setImageResource(2131232502);
                    bVar.f111331e.setVisibility(0);
                    return;
                }
                return;
            }
            bVar.f111328b.setText(musicOwnerInfo.getNickName());
            bVar.f111329c.setText("@" + musicOwnerInfo.getHandle());
            bVar.f111330d.setVisibility(8);
            if (musicOwnerInfo.getVerified()) {
                bVar.f111330d.setImageResource(2131232502);
                bVar.f111330d.setVisibility(0);
            }
        }
    }
}

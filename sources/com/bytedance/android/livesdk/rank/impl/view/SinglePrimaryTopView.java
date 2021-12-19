package com.bytedance.android.livesdk.rank.impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.rank.api.j;
import com.bytedance.android.livesdk.rank.impl.api.model.Rank;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.widget.ComboView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.HashMap;

public final class SinglePrimaryTopView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private HashMap f21032a;

    static {
        Covode.recordClassIndex(12414);
    }

    public SinglePrimaryTopView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private View a(int i2) {
        if (this.f21032a == null) {
            this.f21032a = new HashMap();
        }
        View view = (View) this.f21032a.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f21032a.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f21033a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Rank f21034b;

        static {
            Covode.recordClassIndex(12415);
        }

        a(b bVar, Rank rank) {
            this.f21033a = bVar;
            this.f21034b = rank;
        }

        public final void onClick(View view) {
            this.f21033a.invoke(this.f21034b);
        }
    }

    private /* synthetic */ SinglePrimaryTopView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    private SinglePrimaryTopView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        MethodCollector.i(1908);
        com.a.a(LayoutInflater.from(context), R.layout.bdw, this, true);
        setGravity(81);
        MethodCollector.o(1908);
    }

    public final void a(String str, DataChannel dataChannel, Rank rank, boolean z, boolean z2, b<? super Rank, z> bVar, boolean z3) {
        float f2;
        float f3;
        String scoreDescription;
        long j2;
        Room room;
        l.d(str, "");
        l.d(bVar, "");
        if (rank != null) {
            Context context = getContext();
            if (z) {
                f2 = 56.0f;
            } else {
                f2 = 48.0f;
            }
            int b2 = (int) n.b(context, f2);
            ImageView imageView = (ImageView) a(R.id.fcu);
            l.b(imageView, "");
            ImageView imageView2 = (ImageView) a(R.id.fcu);
            l.b(imageView2, "");
            ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
            layoutParams.width = b2;
            layoutParams.height = b2;
            imageView.setLayoutParams(layoutParams);
            View a2 = a(R.id.ckm);
            l.b(a2, "");
            View a3 = a(R.id.ckm);
            l.b(a3, "");
            ViewGroup.LayoutParams layoutParams2 = a3.getLayoutParams();
            layoutParams2.width = b2;
            layoutParams2.height = b2;
            a2.setLayoutParams(layoutParams2);
            HSImageView hSImageView = (HSImageView) a(R.id.bu1);
            l.b(hSImageView, "");
            HSImageView hSImageView2 = (HSImageView) a(R.id.bu1);
            l.b(hSImageView2, "");
            ViewGroup.LayoutParams layoutParams3 = hSImageView2.getLayoutParams();
            Context context2 = getContext();
            if (z) {
                f3 = 7.0f;
            } else {
                f3 = 6.0f;
            }
            layoutParams3.width = b2 + ((int) n.b(context2, f3));
            layoutParams3.height = layoutParams3.width;
            hSImageView.setLayoutParams(layoutParams3);
            LiveTextView liveTextView = (LiveTextView) a(R.id.fdw);
            l.b(liveTextView, "");
            if (l.a((Object) str, (Object) j.HOURLY_RANK.getRankName())) {
                if (dataChannel == null || (room = (Room) dataChannel.b(df.class)) == null) {
                    j2 = 0;
                } else {
                    j2 = room.getOwnerUserId();
                }
                scoreDescription = com.bytedance.android.livesdk.rank.impl.d.b.a().a(j2, rank.getScore(), rank.getScoreDescription());
            } else {
                scoreDescription = rank.getScoreDescription();
            }
            liveTextView.setText(scoreDescription);
            LiveTextView liveTextView2 = (LiveTextView) a(R.id.fdm);
            l.b(liveTextView2, "");
            liveTextView2.setText(rank.getUser().displayId);
            if (!z2) {
                p.a((TextView) a(R.id.fdm), (int) R.color.xu);
                p.a((TextView) a(R.id.fdw), (int) R.color.xt);
            }
            if (z3) {
                ImageModel avatarThumb = rank.getUser().getAvatarThumb();
                ImageView imageView3 = (ImageView) a(R.id.fcu);
                l.b(imageView3, "");
                int width = imageView3.getWidth();
                ImageView imageView4 = (ImageView) a(R.id.fcu);
                l.b(imageView4, "");
                g.a((ImageView) a(R.id.fcu), avatarThumb, width, imageView4.getHeight(), 2131234726);
                if (rank.getRoomId() > 0) {
                    k.a((HSImageView) a(R.id.bu1), 2131234838);
                    k.a((HSImageView) a(R.id.bzi), "tiktok_live_basic_resource", "ttlive_item_rank_top_on_going_hd.webp");
                } else {
                    n.a(a(R.id.bzi), 8);
                    HSImageView hSImageView3 = (HSImageView) a(R.id.bu1);
                    l.b(hSImageView3, "");
                    hSImageView3.setVisibility(8);
                }
            }
            setOnClickListener(new a(bVar, rank));
            if (z2 && rank.getRank() == 1 && rank.getComboBadge() != null && rank.getComboCount() > 1) {
                ComboView comboView = (ComboView) a(R.id.a96);
                l.b(comboView, "");
                comboView.setVisibility(0);
                ((ComboView) a(R.id.a96)).a(rank.getComboBadge(), rank.getComboCount());
            }
        }
    }
}

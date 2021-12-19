package com.ss.android.ugc.aweme.music;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.favorites.g.e;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;
import java.util.UUID;

public final class j extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public TextView f111528a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f111529b;

    /* renamed from: c  reason: collision with root package name */
    public RemoteImageView f111530c;

    /* renamed from: d  reason: collision with root package name */
    RelativeLayout f111531d;

    /* renamed from: e  reason: collision with root package name */
    ConstraintLayout f111532e;

    /* renamed from: f  reason: collision with root package name */
    public TuxIconView f111533f;

    /* renamed from: g  reason: collision with root package name */
    TextView f111534g;

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f111535h;

    /* renamed from: i  reason: collision with root package name */
    public CheckableImageView f111536i;

    /* renamed from: j  reason: collision with root package name */
    ProgressBar f111537j;

    /* renamed from: k  reason: collision with root package name */
    public LinearLayout f111538k;

    /* renamed from: l  reason: collision with root package name */
    ImageView f111539l;

    /* renamed from: m  reason: collision with root package name */
    public TextView f111540m;
    Barrier n;
    public MusicModel o;
    public boolean p;
    public Context q;
    String r;
    private e s;

    static {
        Covode.recordClassIndex(71638);
    }

    public final void a() {
        int i2;
        CheckableImageView checkableImageView = this.f111536i;
        if (this.p) {
            i2 = 2131233357;
        } else {
            i2 = 2131233412;
        }
        checkableImageView.setImageResource(i2);
    }

    public final void a(boolean z) {
        if (z) {
            this.f111531d.setVisibility(0);
            this.f111533f.setVisibility(0);
            this.f111533f.setImageResource(2131233399);
            this.f111533f.clearAnimation();
            this.f111537j.setVisibility(8);
            r.onEvent(MobClick.obtain().setEventName("music_play").setLabelName("personal_homepage_list").setValue(this.o.getMusicId()));
            return;
        }
        this.f111531d.setVisibility(8);
        this.f111537j.setVisibility(8);
        this.f111533f.setVisibility(0);
        this.f111533f.setIconRes(R.raw.icon_color_play);
        this.f111533f.clearAnimation();
    }

    public final void a(View view) {
        int id = view.getId();
        if (id == R.id.cpw) {
            MusicModel musicModel = this.o;
            if (musicModel != null && musicModel.getMusicStatus() == 0 && this.o.getMusic() != null) {
                String offlineDesc = this.o.getMusic().getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = this.q.getString(R.string.dcb);
                }
                new a(view.getContext()).a(offlineDesc).a();
                return;
            } else if (this.o != null) {
                r.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName("personal_homepage_list").setValue(this.o.getMusicId()));
                String uuid = UUID.randomUUID().toString();
                r.a("enter_music_detail", new d().a("enter_from", "personal_homepage_list").a("group_id", "").a("music_id", this.o.getMusicId()).a("previous_page", this.r).a("process_id", uuid).a("enter_method", "personal_list").f66730a);
                if (!MusicService.m().a(this.o, this.itemView.getContext(), true)) {
                    r.a("enter_music_detail_failed", new d().a("group_id", "").a("author_id", "").a("music_id", this.o.getMusicId()).a("enter_from", "personal_homepage_list").f66730a);
                    return;
                }
                t.a(t.a(), u.a("aweme://music/detail/" + this.o.getMusicId()).a("process_id", uuid).a());
            }
        } else if (id == R.id.don) {
            this.f111533f.clearAnimation();
            this.f111533f.setIconRes(R.raw.icon_color_play);
        }
        e eVar = this.s;
        if (eVar != null) {
            eVar.a(this, view, this.o);
        }
    }

    public j(View view, e eVar, String str) {
        super(view);
        this.s = eVar;
        this.r = str;
        this.f111528a = (TextView) view.findViewById(R.id.f3c);
        this.f111529b = (TextView) view.findViewById(R.id.eyv);
        this.f111530c = (RemoteImageView) view.findViewById(R.id.dtl);
        this.f111531d = (RelativeLayout) view.findViewById(R.id.don);
        this.f111532e = (ConstraintLayout) view.findViewById(R.id.doy);
        this.f111533f = (TuxIconView) view.findViewById(R.id.c1h);
        this.f111534g = (TextView) view.findViewById(R.id.fb4);
        this.f111535h = (LinearLayout) view.findViewById(R.id.cgx);
        this.f111536i = (CheckableImageView) view.findViewById(R.id.bz3);
        this.f111537j = (ProgressBar) view.findViewById(R.id.d2s);
        this.f111538k = (LinearLayout) view.findViewById(R.id.cqk);
        this.f111539l = (ImageView) view.findViewById(R.id.cpw);
        this.f111540m = (TextView) view.findViewById(R.id.f_a);
        this.n = (Barrier) view.findViewById(R.id.rl);
        View findViewById = view.findViewById(R.id.don);
        if (findViewById != null) {
            findViewById.setOnClickListener(new k(this));
        }
        View findViewById2 = view.findViewById(R.id.cgx);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new l(this));
        }
        View findViewById3 = view.findViewById(R.id.cpw);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new m(this));
        }
        this.q = view.getContext();
        this.f111536i.setOnStateChangeListener(new CheckableImageView.a() {
            /* class com.ss.android.ugc.aweme.music.j.AnonymousClass1 */

            static {
                Covode.recordClassIndex(71639);
            }

            @Override // com.ss.android.ugc.aweme.music.ui.CheckableImageView.a
            public final void bR_() {
            }

            @Override // com.ss.android.ugc.aweme.music.ui.CheckableImageView.a
            public final void a(int i2) {
                if (i2 == 1) {
                    j.this.a();
                }
            }
        });
        this.f111536i.setVisibility(0);
        this.n.setReferencedIds(new int[]{R.id.bz3, R.id.bz8});
    }
}

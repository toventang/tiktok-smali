package com.ss.android.ugc.aweme.social.widget.card.rec;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell;
import h.f.b.l;

public final class e extends RecyclerView.ViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public static final a f133866b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final RecommendUserCell<? extends com.ss.android.ugc.aweme.social.widget.card.rec.cell.a> f133867a;

    static {
        Covode.recordClassIndex(87576);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87577);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(RecommendUserCell<? extends com.ss.android.ugc.aweme.social.widget.card.rec.cell.a> recommendUserCell, View view) {
        super(view);
        l.d(recommendUserCell, "");
        l.d(view, "");
        this.f133867a = recommendUserCell;
    }
}

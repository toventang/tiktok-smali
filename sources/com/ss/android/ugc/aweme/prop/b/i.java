package com.ss.android.ugc.aweme.prop.b;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.challenge.a.c;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.sticker.model.g;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;

public final class i extends c {
    a q;

    interface a extends Serializable {
        static {
            Covode.recordClassIndex(76784);
        }

        g a();
    }

    static {
        Covode.recordClassIndex(76783);
    }

    @Override // com.ss.android.ugc.aweme.challenge.a.c
    public final void b(Aweme aweme, int i2, boolean z) {
        g a2;
        super.b(aweme, i2, z);
        com.ss.android.ugc.aweme.settingsrequest.a.b();
        if (b.a().a(true, "prop_show_like_num", 0) == 1) {
            a(aweme);
        }
        if (aweme.isEffectDesigner()) {
            a aVar = this.q;
            if (aVar != null && (a2 = aVar.a()) != null) {
                this.f69881f.setText(com.a.a(this.itemView.getContext().getString(R.string.f0c), new Object[]{a2.ownerName}));
                this.f69881f.setVisibility(0);
            }
        } else if (aweme.isPgcShow()) {
            if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
                this.f69879d.setVisibility(0);
                this.f69878c.setVisibility(8);
                a(this.f69879d, aweme.getTextTopLabels().get(0));
            }
        } else if (aweme.getOriginAuthor() != null) {
            this.f69880e.setVisibility(0);
            if (!TextUtils.isEmpty(aweme.getLabelOriginAuthorText())) {
                this.f69880e.setText(aweme.getLabelOriginAuthorText());
            }
            this.f69878c.setVisibility(4);
        } else if (aweme.getMusicStarter() == null && aweme.getOriginAuthor() == null) {
            if (aweme.getIsTop() != 1) {
                return;
            }
            if (aweme.getTextTopLabels() == null || aweme.getTextTopLabels().size() <= 0) {
                this.f69879d.setVisibility(8);
                this.f69878c.setVisibility(0);
                e.a(this.f69878c, aweme.getLabelTop(), (int) n.b(this.f69876a, 6.0f), (int) n.b(this.f69876a, 6.0f));
                return;
            }
            this.f69879d.setVisibility(0);
            this.f69878c.setVisibility(8);
            a(this.f69879d, aweme.getTextTopLabels().get(0));
        } else if (aweme.getIsTop() != 1) {
        } else {
            if (aweme.getTextTopLabels() == null || aweme.getTextTopLabels().size() <= 0) {
                this.f69879d.setVisibility(0);
                this.f69878c.setVisibility(8);
                AwemeTextLabelModel awemeTextLabelModel = new AwemeTextLabelModel();
                awemeTextLabelModel.setTextColor("#FFFFFF");
                awemeTextLabelModel.setLabelType(8);
                awemeTextLabelModel.setBgColor("#FE2C55");
                awemeTextLabelModel.setShowSeconds(0.0f);
                awemeTextLabelModel.setLabelName(this.f69876a.getResources().getString(R.string.dlx));
                a(this.f69879d, awemeTextLabelModel);
                return;
            }
            this.f69879d.setVisibility(0);
            this.f69878c.setVisibility(8);
            a(this.f69879d, aweme.getTextTopLabels().get(0));
        }
    }

    public i(View view, String str, d dVar, a aVar) {
        super(view, str, dVar);
        this.q = aVar;
    }
}

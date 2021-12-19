package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupAnnouncementContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class m extends a<GroupAnnouncementContent> {

    /* renamed from: a  reason: collision with root package name */
    private TextView f101448a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f101449b;

    static {
        Covode.recordClassIndex(64872);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public void a() {
        super.a();
        Object a2 = a(R.id.f9l);
        l.b(a2, "");
        this.f101448a = (TextView) a2;
        Object a3 = a(R.id.exf);
        l.b(a3, "");
        this.f101449b = (TextView) a3;
        Object a4 = a(R.id.adh);
        l.b(a4, "");
        this.o = a.C2518a.a((View) a4);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final void a(ai aiVar) {
        if (aiVar != null) {
            this.o.f101207c.setEnabled(true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(View view, b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
    }

    public void a(ai aiVar, ai aiVar2, GroupAnnouncementContent groupAnnouncementContent, int i2) {
        l.d(aiVar, "");
        super.a(aiVar, aiVar2, (BaseContent) groupAnnouncementContent, i2);
        if (groupAnnouncementContent != null) {
            TextView textView = this.f101448a;
            if (textView == null) {
                l.a("tvTitle");
            }
            textView.setText(groupAnnouncementContent.getTitle());
            TextView textView2 = this.f101449b;
            if (textView2 == null) {
                l.a("tvContent");
            }
            textView2.setText(groupAnnouncementContent.getAnnouncement());
        }
    }
}

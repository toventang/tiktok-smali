package com.ss.android.ugc.aweme.shortvideo;

import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.shortvideo.util.as;
import com.ss.android.ugc.aweme.video.hashtag.helper.BaseTitleHelper;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ei implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final eh f128432a;

    static {
        Covode.recordClassIndex(84214);
    }

    ei(eh ehVar) {
        this.f128432a = ehVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        eh ehVar = this.f128432a;
        if (ehVar.f128419c.getSelectionEnd() <= ehVar.f128419c.getSelectionStart()) {
            KeyboardUtils.b(ehVar.f128419c);
            Editable text = ehVar.f128419c.getText();
            int length = text.length();
            if (!TextUtils.isEmpty(ehVar.f128419c.getAdTag())) {
                length = ehVar.f128419c.getNoAdTagText().length();
            }
            if (length <= as.a()) {
                int selectionStart = Selection.getSelectionStart(text);
                if (ehVar.f128428l != null && !text.toString().endsWith("#")) {
                    BaseTitleHelper baseTitleHelper = ehVar.f128428l;
                    String obj = text.toString();
                    l.d(obj, "");
                    baseTitleHelper.f143429c = obj;
                }
                if (ehVar.f128429m != null) {
                    ehVar.f128429m.a("click_tag_button");
                }
                if (selectionStart >= 0 && !ehVar.f128419c.s) {
                    text.insert(selectionStart, "#");
                }
            }
        }
    }
}

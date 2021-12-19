package com.ss.android.ugc.aweme.contentlanguage;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f78159a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(48463);
    }

    public static final ContentLangDialogContent a() {
        try {
            ContentLangDialogContent contentLangDialogContent = (ContentLangDialogContent) SettingsManager.a().a("content_lang_dialog", ContentLangDialogContent.class);
            if (contentLangDialogContent != null) {
                return contentLangDialogContent;
            }
            String string = d.a().getString(R.string.au5);
            l.b(string, "");
            String string2 = d.a().getString(R.string.au4);
            l.b(string2, "");
            return new ContentLangDialogContent(string, string2);
        } catch (Throwable unused) {
        }
    }
}
